
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Collection var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty(var0, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Collection var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Collection var0 = null;
    java.lang.Class var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.allElementsOfType(var0, var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Map var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    org.apache.commons.lang.Validate.isTrue(true, "", 10.0d);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.lang.StringBuffer var4 = null;
    java.text.FieldPosition var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var6 = var2.format((java.lang.Object)0L, var4, var5);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Collection var0 = null;
    java.lang.Class var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.allElementsOfType(var0, var1, "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    org.apache.commons.lang.Validate.isTrue(true, "hi!", (java.lang.Object)0L);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    org.apache.commons.lang.Validate.notEmpty("hi!");

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.text.Format var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat(10, var5);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Collection var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.noNullElements(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Map var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty(var0, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test14() {}
//   public void test14() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     boolean var4 = var2.equals((java.lang.Object)1L);
//     java.lang.Object[] var5 = null;
//     java.lang.StringBuffer var6 = null;
//     java.text.FieldPosition var7 = null;
//     java.lang.StringBuffer var8 = var2.format(var5, var6, var7);
// 
//   }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Locale var1 = null;
    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1, var2);
    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    java.text.Format[] var8 = var7.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setFormat(0, (java.text.Format)var7);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test17() {}
//   public void test17() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.lang.Object[] var4 = new java.lang.Object[] { true};
//     java.lang.StringBuffer var5 = null;
//     java.text.FieldPosition var6 = null;
//     java.lang.StringBuffer var7 = var2.format(var4, var5, var6);
// 
//   }

  public void test18() {}
//   public void test18() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }
// 
// 
//     java.util.Locale var1 = null;
//     java.util.Map var2 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1, var2);
//     java.text.ParsePosition var5 = null;
//     java.lang.Object[] var6 = var3.parse("", var5);
// 
//   }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var2.parseObject("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var4 = var2.formatToCharacterIterator((java.lang.Object)(short)10);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    org.apache.commons.lang.Validate.notNull((java.lang.Object)0L);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Collection var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.noNullElements(var0, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test23() {}
//   public void test23() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }
// 
// 
//     org.apache.commons.lang.text.ExtendedMessageFormat var1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
//     java.util.Map var3 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
//     java.text.Format[] var5 = var4.getFormats();
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var5, "");
//     java.lang.Object[] var8 = new java.lang.Object[] { var5};
//     java.lang.StringBuffer var9 = null;
//     java.text.FieldPosition var10 = null;
//     java.lang.StringBuffer var11 = var1.format((java.lang.Object[])var5, var9, var10);
// 
//   }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    org.apache.commons.lang.Validate.isTrue(true, "hi!", (java.lang.Object)(short)10);

  }

  public void test25() {}
//   public void test25() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.text.ParsePosition var5 = null;
//     java.lang.Object var6 = var2.parseObject("hi!", var5);
// 
//   }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.Object var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notNull(var0, "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test27() {}
//   public void test27() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.lang.Object[] var4 = new java.lang.Object[] { (-1)};
//     org.apache.commons.lang.Validate.noNullElements(var4);
//     java.lang.StringBuffer var6 = null;
//     java.text.FieldPosition var7 = null;
//     java.lang.StringBuffer var8 = var2.format(var4, var6, var7);
// 
//   }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    org.apache.commons.lang.Validate.notEmpty("hi!", "hi!");

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "", 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    java.text.Format[] var7 = var6.getFormats();
    java.text.Format[] var8 = new java.text.Format[] { var6};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var8);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    java.util.Locale var6 = null;
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6, var7);
    boolean var9 = var2.equals((java.lang.Object)var6);
    java.util.Locale var12 = null;
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12, var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex((-1), (java.text.Format)var14);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    org.apache.commons.lang.text.ExtendedMessageFormat var1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = var1.format((java.lang.Object)false);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    java.util.Locale var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat(0, (java.text.Format)var10);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    org.apache.commons.lang.Validate.notNull((java.lang.Object)10.0d, "hi!");

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    java.lang.Object[] var1 = null;
    java.lang.String var2 = java.text.MessageFormat.format("hi!", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));

  }

  public void test38() {}
//   public void test38() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.lang.String var4 = var2.toPattern();
//     java.text.ParsePosition var6 = null;
//     java.lang.Object var7 = var2.parseObject("", var6);
// 
//   }

  public void test39() {}
//   public void test39() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     boolean var4 = var2.equals((java.lang.Object)1L);
//     java.lang.Object var5 = var2.clone();
//     java.text.ParsePosition var7 = null;
//     java.lang.Object var8 = var2.parseObject("", var7);
// 
//   }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    java.util.Locale var6 = null;
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6, var7);
    boolean var9 = var2.equals((java.lang.Object)var6);
    java.lang.StringBuffer var11 = null;
    java.text.FieldPosition var12 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var13 = var2.format((java.lang.Object)false, var11, var12);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.lang.Object var5 = var2.clone();
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    java.text.Format[] var9 = var8.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var9);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.util.Map var8 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
    boolean var11 = var9.equals((java.lang.Object)1L);
    java.util.Locale var12 = var9.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat(10, (java.text.Format)var9);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }


    org.apache.commons.lang.Validate.notNull((java.lang.Object)' ');

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    java.util.Locale var6 = null;
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6, var7);
    boolean var9 = var2.equals((java.lang.Object)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var2.parseObject("hi!");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test45() {}
//   public void test45() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.lang.String var4 = var2.toPattern();
//     java.util.Locale var6 = null;
//     java.util.Map var7 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6, var7);
//     boolean var9 = var2.equals((java.lang.Object)var6);
//     java.lang.Object var10 = null;
//     java.lang.StringBuffer var11 = null;
//     java.text.FieldPosition var12 = null;
//     java.lang.StringBuffer var13 = var2.format(var10, var11, var12);
// 
//   }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }


    org.apache.commons.lang.Validate.isTrue(true, "", (java.lang.Object)(-1.0d));

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }


    java.lang.Object[] var2 = new java.lang.Object[] { (-1)};
    org.apache.commons.lang.Validate.noNullElements(var2);
    java.lang.String var4 = java.text.MessageFormat.format("hi!", var2);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }


    org.apache.commons.lang.Validate.isTrue(true, "");

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.util.Map var8 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat(1, (java.text.Format)var9);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }


    org.apache.commons.lang.Validate.notNull((java.lang.Object)100.0f, "");

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    java.text.Format[] var6 = var5.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var6);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    boolean var6 = var4.equals((java.lang.Object)1L);
    java.util.Locale var7 = var4.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7, var9);
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    java.text.Format[] var14 = var13.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.setFormats(var14);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }


    java.util.Collection var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty(var0, "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    boolean var6 = var4.equals((java.lang.Object)1L);
    java.util.Locale var7 = var4.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7, var9);
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    java.text.Format[] var14 = var13.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var15 = var10.format((java.lang.Object)var13);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }


    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8, var10);
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var8, var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var15 = var13.parse("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    boolean var8 = var2.equals((java.lang.Object)' ');
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
    boolean var14 = var12.equals((java.lang.Object)1L);
    java.util.Locale var15 = var12.getLocale();
    java.text.Format[] var16 = var12.getFormatsByArgumentIndex();
    boolean var18 = var12.equals((java.lang.Object)' ');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat(10, (java.text.Format)var12);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var5 = var2.parse("hi!");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    boolean var9 = var7.equals((java.lang.Object)1L);
    java.util.Locale var10 = var7.getLocale();
    java.text.Format[] var11 = var7.getFormatsByArgumentIndex();
    boolean var13 = var7.equals((java.lang.Object)' ');
    java.text.Format[] var14 = new java.text.Format[] { var7};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var14);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }


    org.apache.commons.lang.text.ExtendedMessageFormat var1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    java.text.Format[] var5 = var4.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setFormatsByArgumentIndex(var5);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }


    org.apache.commons.lang.Validate.notNull((java.lang.Object)(short)100, "");

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    java.text.Format var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(0, var6);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var2.parseObject("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }


    org.apache.commons.lang.Validate.isTrue(true, "hi!", 100.0d);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }


    org.apache.commons.lang.Validate.isTrue(true, "", 100.0d);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }


    org.apache.commons.lang.Validate.isTrue(true, "hi!", (-1.0d));

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.lang.Object var5 = var2.clone();
    java.util.Locale var8 = null;
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8, var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(100, (java.text.Format)var10);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test67() {}
//   public void test67() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.lang.String var4 = var2.toPattern();
//     java.lang.Object var5 = null;
//     java.text.AttributedCharacterIterator var6 = var2.formatToCharacterIterator(var5);
// 
//   }

  public void test68() {}
//   public void test68() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.lang.String var4 = var2.toPattern();
//     java.util.Locale var6 = null;
//     java.util.Map var7 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6, var7);
//     boolean var9 = var2.equals((java.lang.Object)var6);
//     java.text.ParsePosition var11 = null;
//     java.lang.Object[] var12 = var2.parse("", var11);
// 
//   }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }


    org.apache.commons.lang.Validate.isTrue(true, "hi!", (java.lang.Object)1L);

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }


    java.util.Locale var1 = null;
    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1, var2);
    java.lang.StringBuffer var5 = null;
    java.text.FieldPosition var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var7 = var3.format((java.lang.Object)' ', var5, var6);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    boolean var6 = var4.equals((java.lang.Object)1L);
    java.util.Locale var7 = var4.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7, var9);
    java.util.Locale var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.setFormat(10, (java.text.Format)var14);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }


    java.util.Collection var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.noNullElements(var0, "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }


    java.lang.Object[] var2 = new java.lang.Object[] { (-1)};
    org.apache.commons.lang.Validate.noNullElements(var2);
    java.lang.String var4 = java.text.MessageFormat.format("hi!", var2);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var4, "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));

  }

  public void test74() {}
//   public void test74() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.lang.String var4 = var2.toPattern();
//     java.lang.Object[] var8 = new java.lang.Object[] { (-1)};
//     org.apache.commons.lang.Validate.noNullElements(var8);
//     java.lang.String var10 = java.text.MessageFormat.format("hi!", var8);
//     java.lang.String var11 = java.text.MessageFormat.format("", var8);
//     java.lang.StringBuffer var12 = null;
//     java.text.FieldPosition var13 = null;
//     java.lang.StringBuffer var14 = var2.format(var8, var12, var13);
// 
//   }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    java.lang.Object var5 = var2.clone();
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    boolean var13 = var11.equals((java.lang.Object)1L);
    java.util.Locale var14 = var11.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14);
    java.util.Map var16 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14, var16);
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var14, var18);
    var2.setLocale(var14);
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    java.text.Format[] var24 = var23.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var24);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }


    java.util.Map var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty(var0, "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test77() {}
//   public void test77() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.lang.Object var3 = var2.clone();
//     java.util.Map var8 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
//     boolean var11 = var9.equals((java.lang.Object)1L);
//     java.util.Locale var12 = var9.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
//     java.util.Map var14 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12, var14);
//     java.util.Map var16 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var12, var16);
//     java.text.AttributedCharacterIterator var18 = var2.formatToCharacterIterator((java.lang.Object)var16);
// 
//   }

  public void test78() {}
//   public void test78() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.lang.Object var3 = var2.clone();
//     java.text.ParsePosition var5 = null;
//     java.lang.Object var6 = var2.parseObject("hi!", var5);
// 
//   }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    java.text.Format[] var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var5);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }


    org.apache.commons.lang.Validate.isTrue(true);

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    java.lang.Object var5 = var2.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var7 = var2.parse("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test82() {}
//   public void test82() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.lang.String var4 = var2.toPattern();
//     java.util.Locale var6 = null;
//     java.util.Map var7 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6, var7);
//     boolean var9 = var2.equals((java.lang.Object)var6);
//     java.util.Map var11 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
//     java.text.Format[] var13 = var12.getFormats();
//     java.lang.String var14 = var12.toPattern();
//     java.util.Locale var16 = null;
//     java.util.Map var17 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16, var17);
//     boolean var19 = var12.equals((java.lang.Object)var16);
//     var12.applyPattern("");
//     java.text.Format[] var22 = var12.getFormats();
//     java.lang.StringBuffer var23 = null;
//     java.text.FieldPosition var24 = null;
//     java.lang.StringBuffer var25 = var2.format((java.lang.Object[])var22, var23, var24);
// 
//   }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Map var8 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
    boolean var11 = var9.equals((java.lang.Object)1L);
    java.util.Locale var12 = var9.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12, var14);
    java.lang.StringBuffer var16 = null;
    java.text.FieldPosition var17 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var18 = var2.format((java.lang.Object)var15, var16, var17);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }


    org.apache.commons.lang.Validate.isTrue(true, "hi!", 100L);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    java.lang.Object var5 = var2.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var7 = var2.formatToCharacterIterator((java.lang.Object)(short)0);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    boolean var10 = var8.equals((java.lang.Object)1L);
    java.util.Locale var11 = var8.getLocale();
    java.text.Format[] var12 = var8.getFormatsByArgumentIndex();
    java.text.Format[] var13 = var8.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var14 = var2.format((java.lang.Object)var8);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    boolean var10 = var8.equals((java.lang.Object)1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(100, (java.text.Format)var8);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    java.util.Map var8 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
    java.text.Format[] var10 = var9.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var10, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var10, "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var10);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }


    org.apache.commons.lang.Validate.isTrue(true, "hi!", 10.0d);

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "hi!", (java.lang.Object)1.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    boolean var8 = var2.equals((java.lang.Object)' ');
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    java.text.Format[] var12 = var11.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var12);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    java.text.Format[] var4 = var3.getFormats();
    java.lang.String var5 = var3.toPattern();
    java.lang.Object var6 = var3.clone();
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
    boolean var14 = var12.equals((java.lang.Object)1L);
    java.util.Locale var15 = var12.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15, var17);
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var15, var19);
    var3.setLocale(var15);
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15, var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notNull((java.lang.Object)var22);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "", 10L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty("", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "", 10.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.lang.Object var5 = var2.clone();
    var2.applyPattern("");
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    java.text.Format[] var12 = var11.getFormats();
    java.lang.String var13 = var11.toPattern();
    java.lang.Object var14 = var11.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat((-1), (java.text.Format)var11);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test97() {}
//   public void test97() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.lang.String var4 = var2.toPattern();
//     java.util.Locale var6 = null;
//     java.util.Map var7 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6, var7);
//     boolean var9 = var2.equals((java.lang.Object)var6);
//     java.util.Map var11 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
//     java.text.Format[] var13 = var12.getFormats();
//     java.lang.StringBuffer var14 = null;
//     java.text.FieldPosition var15 = null;
//     java.lang.StringBuffer var16 = var2.format((java.lang.Object[])var13, var14, var15);
// 
//   }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }


    java.lang.Object[] var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty(var0, "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    java.text.Format[] var9 = var8.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat(0, (java.text.Format)var8);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.Object var4 = var2.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var2.parseObject("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    java.text.Format[] var4 = var3.getFormats();
    java.lang.String var5 = java.text.MessageFormat.format("", (java.lang.Object[])var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }


    java.util.Collection var0 = null;
    java.lang.Class var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.allElementsOfType(var0, var1, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test103() {}
//   public void test103() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.lang.String var4 = var2.toPattern();
//     java.util.Map var6 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
//     java.text.Format[] var8 = var7.getFormats();
//     java.lang.String var9 = var7.toPattern();
//     java.util.Locale var11 = null;
//     java.util.Map var12 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11, var12);
//     boolean var14 = var7.equals((java.lang.Object)var11);
//     var7.applyPattern("");
//     java.text.Format[] var17 = var7.getFormats();
//     java.lang.StringBuffer var18 = null;
//     java.text.FieldPosition var19 = null;
//     java.lang.StringBuffer var20 = var2.format((java.lang.Object[])var17, var18, var19);
// 
//   }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    java.text.Format[] var5 = var4.getFormats();
    java.lang.String var6 = var4.toPattern();
    java.lang.Object var7 = var4.clone();
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    boolean var15 = var13.equals((java.lang.Object)1L);
    java.util.Locale var16 = var13.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16, var18);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var20);
    var4.setLocale(var16);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var23);
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var27 = var25.format((java.lang.Object)0.0f);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.lang.Object var5 = var2.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var2.parseObject("hi!");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    boolean var8 = var2.equals((java.lang.Object)' ');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var10 = var2.parse("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.util.Locale var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var5);
    boolean var8 = var6.equals((java.lang.Object)(byte)(-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var9 = var2.formatToCharacterIterator((java.lang.Object)(byte)(-1));
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var5 = var2.getLocale();
    var2.applyPattern("");
    org.apache.commons.lang.Validate.notNull((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var5 = var2.getLocale();
    var2.applyPattern("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var9 = var2.parse("hi!");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    boolean var5 = var3.equals((java.lang.Object)1L);
    java.util.Locale var6 = var3.getLocale();
    java.text.Format[] var7 = var3.getFormatsByArgumentIndex();
    java.lang.String var8 = java.text.MessageFormat.format("hi!", (java.lang.Object[])var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var7, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }


    org.apache.commons.lang.Validate.isTrue(true, "hi!", 1L);

  }

  public void test112() {}
//   public void test112() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }
// 
// 
//     java.util.Map var2 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
//     java.text.Format[] var4 = var3.getFormats();
//     java.lang.String var5 = var3.toPattern();
//     java.lang.Object var6 = var3.clone();
//     java.util.Map var11 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
//     boolean var14 = var12.equals((java.lang.Object)1L);
//     java.util.Locale var15 = var12.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
//     java.util.Map var17 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15, var17);
//     java.util.Map var19 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var15, var19);
//     var3.setLocale(var15);
//     java.util.Map var22 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15, var22);
//     java.text.ParsePosition var25 = null;
//     java.lang.Object var26 = var23.parseObject("", var25);
// 
//   }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }


    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
    org.apache.commons.lang.Validate.isTrue(true, "", (java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.lang.Object var5 = var2.clone();
    var2.applyPattern("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var9 = var2.formatToCharacterIterator((java.lang.Object)1.0d);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test115"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "", 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }


    org.apache.commons.lang.Validate.notNull((java.lang.Object)"hi!", "");

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }


    org.apache.commons.lang.Validate.isTrue(true, "", 100L);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var2.parseObject("hi!");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    java.util.Locale var6 = null;
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6, var7);
    boolean var9 = var2.equals((java.lang.Object)var6);
    var2.applyPattern("");
    org.apache.commons.lang.Validate.notNull((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    java.text.Format[] var9 = var5.getFormatsByArgumentIndex();
    boolean var10 = var2.equals((java.lang.Object)var9);
    java.lang.Object var11 = new java.lang.Object();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var12 = var2.format(var11);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }


    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    boolean var8 = var6.equals((java.lang.Object)1L);
    java.util.Locale var9 = var6.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9, var11);
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9, var13);
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)"", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test122"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty("", "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }


    java.lang.Object var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notNull(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test124() {}
//   public void test124() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.lang.String var4 = var2.toPattern();
//     java.lang.Object var5 = var2.clone();
//     java.util.Map var10 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
//     boolean var13 = var11.equals((java.lang.Object)1L);
//     java.util.Locale var14 = var11.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14);
//     java.util.Map var16 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14, var16);
//     java.util.Map var18 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var14, var18);
//     var2.setLocale(var14);
//     java.text.ParsePosition var22 = null;
//     java.lang.Object[] var23 = var2.parse("", var22);
// 
//   }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test125"); }


    java.lang.Object var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "", var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test126() {}
//   public void test126() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test126"); }
// 
// 
//     java.util.Map var5 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
//     boolean var8 = var6.equals((java.lang.Object)1L);
//     java.util.Locale var9 = var6.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
//     java.util.Map var11 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9, var11);
//     java.util.Map var13 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9, var13);
//     org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
//     java.util.Locale var17 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
//     java.text.Format[] var19 = var18.getFormats();
//     java.lang.StringBuffer var20 = null;
//     java.text.FieldPosition var21 = null;
//     java.lang.StringBuffer var22 = var15.format((java.lang.Object[])var19, var20, var21);
// 
//   }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test127"); }


    org.apache.commons.lang.Validate.isTrue(true, "hi!");

  }

  public void test128() {}
//   public void test128() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test128"); }
// 
// 
//     java.util.Map var3 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
//     java.text.Format[] var5 = var4.getFormats();
//     java.lang.String var6 = var4.toPattern();
//     java.lang.Object var7 = var4.clone();
//     java.util.Map var12 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
//     boolean var15 = var13.equals((java.lang.Object)1L);
//     java.util.Locale var16 = var13.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
//     java.util.Map var18 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16, var18);
//     java.util.Map var20 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var20);
//     var4.setLocale(var16);
//     java.util.Map var23 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var23);
//     org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
//     org.apache.commons.lang.Validate.notNull((java.lang.Object)var25);
//     java.util.Map var28 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var28);
//     java.text.Format[] var30 = var29.getFormats();
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var30, "");
//     java.lang.StringBuffer var33 = null;
//     java.text.FieldPosition var34 = null;
//     java.lang.StringBuffer var35 = var25.format((java.lang.Object[])var30, var33, var34);
// 
//   }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test129"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    java.text.Format[] var5 = var4.getFormats();
    java.lang.String var6 = var4.toPattern();
    java.lang.Object var7 = var4.clone();
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    boolean var15 = var13.equals((java.lang.Object)1L);
    java.util.Locale var16 = var13.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16, var18);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var20);
    var4.setLocale(var16);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var23);
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16);
    java.text.Format[] var26 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var25.setFormats(var26);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test130() {}
//   public void test130() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test130"); }
// 
// 
//     org.apache.commons.lang.text.ExtendedMessageFormat var1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
//     java.text.Format[] var2 = var1.getFormatsByArgumentIndex();
//     java.lang.Object[] var4 = new java.lang.Object[] { (-1)};
//     org.apache.commons.lang.Validate.noNullElements(var4);
//     java.lang.StringBuffer var6 = null;
//     java.text.FieldPosition var7 = null;
//     java.lang.StringBuffer var8 = var1.format((java.lang.Object)var4, var6, var7);
// 
//   }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test131"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    var2.applyPattern("");
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    boolean var10 = var8.equals((java.lang.Object)1L);
    java.util.Locale var11 = var8.getLocale();
    java.text.Format[] var12 = var8.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var12, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var12, "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var12);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test132"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    java.text.Format[] var4 = var3.getFormats();
    java.lang.String var5 = var3.toPattern();
    java.lang.Object var6 = var3.clone();
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
    boolean var14 = var12.equals((java.lang.Object)1L);
    java.util.Locale var15 = var12.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15, var17);
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var15, var19);
    var3.setLocale(var15);
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var15, var22);
    java.lang.Object var25 = var23.parseObject("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var27 = var23.parse("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test133() {}
//   public void test133() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test133"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.util.Map var5 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var5);
//     java.text.AttributedCharacterIterator var7 = var2.formatToCharacterIterator((java.lang.Object)var5);
// 
//   }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test134"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "hi!", 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test135"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    java.util.Locale var6 = null;
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6, var7);
    boolean var9 = var2.equals((java.lang.Object)var6);
    var2.applyPattern("");
    java.text.Format[] var12 = var2.getFormats();
    java.util.Locale var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat(1, (java.text.Format)var16);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test136() {}
//   public void test136() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test136"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     boolean var4 = var2.equals((java.lang.Object)1L);
//     java.util.Locale var5 = var2.getLocale();
//     java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
//     boolean var8 = var2.equals((java.lang.Object)' ');
//     java.text.ParsePosition var10 = null;
//     java.lang.Object[] var11 = var2.parse("", var10);
// 
//   }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test137"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = var2.format((java.lang.Object)0.0f);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test138"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.lang.Object var3 = var2.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = var2.format((java.lang.Object)10L);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test139() {}
//   public void test139() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test139"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
//     boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
//     java.util.Locale var5 = var2.getLocale();
//     java.util.Map var9 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
//     boolean var12 = var10.equals((java.lang.Object)1L);
//     java.util.Locale var13 = var10.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
//     java.util.Map var15 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13, var15);
//     var2.setLocale(var13);
//     java.util.Map var20 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var20);
//     java.text.Format[] var22 = var21.getFormats();
//     java.lang.String var23 = java.text.MessageFormat.format("", (java.lang.Object[])var22);
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var22);
//     java.lang.StringBuffer var25 = null;
//     java.text.FieldPosition var26 = null;
//     java.lang.StringBuffer var27 = var2.format((java.lang.Object[])var22, var25, var26);
// 
//   }

  public void test140() {}
//   public void test140() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test140"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.text.ParsePosition var5 = null;
//     java.lang.Object[] var6 = var2.parse("", var5);
// 
//   }

  public void test141() {}
//   public void test141() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test141"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     boolean var4 = var2.equals((java.lang.Object)1L);
//     java.util.Locale var5 = var2.getLocale();
//     java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
//     boolean var8 = var2.equals((java.lang.Object)' ');
//     java.text.ParsePosition var10 = null;
//     java.lang.Object var11 = var2.parseObject("", var10);
// 
//   }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test142"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(1, (java.text.Format)var7);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test143() {}
//   public void test143() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test143"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     var2.applyPattern("");
//     java.text.ParsePosition var7 = null;
//     java.lang.Object var8 = var2.parseObject("", var7);
// 
//   }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test144"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    java.text.Format[] var5 = var4.getFormats();
    java.lang.String var6 = var4.toPattern();
    java.lang.Object var7 = var4.clone();
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    boolean var15 = var13.equals((java.lang.Object)1L);
    java.util.Locale var16 = var13.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16, var18);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var20);
    var4.setLocale(var16);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var23);
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var28 = var25.parseObject("hi!");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test145"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var3, "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test146"); }


    java.lang.Object var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notNull(var0, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test147"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    boolean var9 = var7.equals((java.lang.Object)1L);
    java.util.Locale var10 = var7.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    var2.setLocale(var10);
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var14);
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
    boolean var20 = var18.equals((java.lang.Object)1L);
    java.util.Locale var21 = var18.getLocale();
    java.text.Format[] var22 = var18.getFormatsByArgumentIndex();
    boolean var23 = var15.equals((java.lang.Object)var22);
    java.lang.String var24 = var2.format((java.lang.Object)var22);
    java.util.Locale var26 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26);
    java.text.Format[] var28 = var27.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var28, "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var28);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test148() {}
//   public void test148() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test148"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.lang.String var4 = var2.toPattern();
//     var2.applyPattern("hi!");
//     java.text.ParsePosition var8 = null;
//     java.lang.Object var9 = var2.parseObject("hi!", var8);
// 
//   }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test149"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    java.text.Format[] var4 = var3.getFormats();
    java.lang.String var5 = var3.toPattern();
    java.lang.Object var6 = var3.clone();
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
    boolean var14 = var12.equals((java.lang.Object)1L);
    java.util.Locale var15 = var12.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15, var17);
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var15, var19);
    var3.setLocale(var15);
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var15, var22);
    java.lang.Object var25 = var23.parseObject("hi!");
    java.lang.String var26 = var23.toPattern();
    java.util.Map var29 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var29);
    java.text.Format[] var31 = var30.getFormats();
    java.lang.String var32 = java.text.MessageFormat.format("", (java.lang.Object[])var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var23.setFormats(var31);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test150"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    java.text.Format[] var5 = var4.getFormats();
    java.lang.String var6 = var4.toPattern();
    java.lang.Object var7 = var4.clone();
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    boolean var15 = var13.equals((java.lang.Object)1L);
    java.util.Locale var16 = var13.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16, var18);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var20);
    var4.setLocale(var16);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var23);
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var25);
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var28);
    java.text.Format[] var30 = var29.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var30, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var30, "hi!");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var30, "hi!");
    boolean var37 = var25.equals((java.lang.Object)var30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var39 = var25.parseObject("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test151"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.lang.Object var5 = var2.clone();
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    java.text.Format[] var12 = var11.getFormats();
    java.lang.String var13 = var11.toPattern();
    java.lang.Object var14 = var11.clone();
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19);
    boolean var22 = var20.equals((java.lang.Object)1L);
    java.util.Locale var23 = var20.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var23);
    java.util.Map var25 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var23, var25);
    java.util.Map var27 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var23, var27);
    var11.setLocale(var23);
    java.util.Map var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var23, var30);
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat(0, (java.text.Format)var32);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test152"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    java.text.Format[] var9 = var5.getFormatsByArgumentIndex();
    boolean var10 = var2.equals((java.lang.Object)var9);
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14);
    java.text.Format[] var16 = var15.getFormats();
    java.lang.String var17 = var15.toPattern();
    java.lang.Object var18 = var15.clone();
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var23);
    boolean var26 = var24.equals((java.lang.Object)1L);
    java.util.Locale var27 = var24.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27);
    java.util.Map var29 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27, var29);
    java.util.Map var31 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var27, var31);
    var15.setLocale(var27);
    java.util.Map var34 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var35 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var27, var34);
    org.apache.commons.lang.text.ExtendedMessageFormat var36 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var36);
    java.util.Map var39 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var40 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var39);
    java.text.Format[] var41 = var40.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var41, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var41, "hi!");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var41, "hi!");
    boolean var48 = var36.equals((java.lang.Object)var41);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var41);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test153"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var5 = var2.getLocale();
    var2.applyPattern("");
    java.util.Locale var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.text.Format[] var11 = var10.getFormats();
    java.lang.String var12 = var2.format((java.lang.Object)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var11, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test154"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    boolean var8 = var2.equals((java.lang.Object)' ');
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test155"); }


    java.lang.Object[] var3 = new java.lang.Object[] { (-1)};
    org.apache.commons.lang.Validate.noNullElements(var3);
    java.lang.String var5 = java.text.MessageFormat.format("hi!", var3);
    java.lang.String var6 = java.text.MessageFormat.format("", var3);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test156() {}
//   public void test156() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test156"); }
// 
// 
//     java.util.Locale var1 = null;
//     java.util.Map var2 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1, var2);
//     java.text.Format[] var4 = var3.getFormats();
//     java.text.ParsePosition var6 = null;
//     java.lang.Object var7 = var3.parseObject("", var6);
// 
//   }

  public void test157() {}
//   public void test157() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test157"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
//     boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
//     java.util.Locale var5 = var2.getLocale();
//     java.util.Map var9 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
//     boolean var12 = var10.equals((java.lang.Object)1L);
//     java.util.Locale var13 = var10.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
//     java.util.Map var15 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13, var15);
//     var2.setLocale(var13);
//     java.lang.Object var18 = var2.clone();
//     java.text.ParsePosition var20 = null;
//     java.lang.Object[] var21 = var2.parse("", var20);
// 
//   }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test158"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    java.lang.Object var5 = var2.clone();
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    java.text.Format[] var9 = var8.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var9, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var9, "hi!");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var9, "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var9);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test159() {}
//   public void test159() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test159"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     boolean var4 = var2.equals((java.lang.Object)1L);
//     java.util.Locale var5 = var2.getLocale();
//     java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
//     java.text.ParsePosition var8 = null;
//     java.lang.Object var9 = var2.parseObject("", var8);
// 
//   }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test160"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    java.text.Format[] var7 = var6.getFormats();
    java.lang.String var8 = var6.toPattern();
    java.util.Locale var10 = null;
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10, var11);
    boolean var13 = var6.equals((java.lang.Object)var10);
    var6.applyPattern("");
    java.text.Format[] var16 = var6.getFormats();
    java.lang.String var17 = java.text.MessageFormat.format("hi!", (java.lang.Object[])var16);
    java.lang.StringBuffer var18 = null;
    java.text.FieldPosition var19 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var20 = var2.format((java.lang.Object)var17, var18, var19);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test161"); }


    java.util.Locale var1 = null;
    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1, var2);
    java.util.Locale var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var6);
    boolean var9 = var7.equals((java.lang.Object)(byte)(-1));
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    boolean var18 = var16.equals((java.lang.Object)1L);
    java.util.Locale var19 = var16.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19);
    java.util.Map var21 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19, var21);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19, var23);
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19);
    var7.setLocale(var19);
    var7.applyPattern("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setFormatByArgumentIndex(10, (java.text.Format)var7);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test162() {}
//   public void test162() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test162"); }
// 
// 
//     java.util.Map var4 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
//     boolean var7 = var5.equals((java.lang.Object)1L);
//     java.util.Locale var8 = var5.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
//     java.util.Map var10 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8, var10);
//     java.util.Map var12 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var8, var12);
//     java.lang.String var14 = var13.toPattern();
//     java.text.ParsePosition var16 = null;
//     java.lang.Object var17 = var13.parseObject("", var16);
// 
//   }

  public void test163() {}
//   public void test163() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test163"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.lang.Object var3 = var2.clone();
//     java.util.Map var6 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
//     java.text.Format[] var8 = var7.getFormats();
//     java.lang.String var9 = java.text.MessageFormat.format("", (java.lang.Object[])var8);
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var8);
//     java.lang.StringBuffer var11 = null;
//     java.text.FieldPosition var12 = null;
//     java.lang.StringBuffer var13 = var2.format((java.lang.Object[])var8, var11, var12);
// 
//   }

  public void test164() {}
//   public void test164() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test164"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     boolean var4 = var2.equals((java.lang.Object)1L);
//     java.util.Locale var5 = var2.getLocale();
//     java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
//     java.text.ParsePosition var8 = null;
//     java.lang.Object var9 = var2.parseObject("hi!", var8);
// 
//   }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test165"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    java.text.Format[] var9 = var5.getFormatsByArgumentIndex();
    boolean var10 = var2.equals((java.lang.Object)var9);
    java.text.Format[] var11 = var2.getFormatsByArgumentIndex();
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(1, (java.text.Format)var14);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test166"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var5 = var2.getLocale();
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    boolean var12 = var10.equals((java.lang.Object)1L);
    java.util.Locale var13 = var10.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13, var15);
    var2.setLocale(var13);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var20);
    java.text.Format[] var22 = var21.getFormats();
    java.lang.String var23 = var21.toPattern();
    java.util.Locale var25 = null;
    java.util.Map var26 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25, var26);
    boolean var28 = var21.equals((java.lang.Object)var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat((-1), (java.text.Format)var21);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test167"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    java.text.Format[] var9 = var5.getFormatsByArgumentIndex();
    boolean var10 = var2.equals((java.lang.Object)var9);
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
    java.text.Format[] var13 = var12.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var13);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test168"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    boolean var8 = var2.equals((java.lang.Object)' ');
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(10, (java.text.Format)var11);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test169"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    java.text.Format[] var5 = var4.getFormats();
    java.lang.String var6 = var4.toPattern();
    java.lang.Object var7 = var4.clone();
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    boolean var15 = var13.equals((java.lang.Object)1L);
    java.util.Locale var16 = var13.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16, var18);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var20);
    var4.setLocale(var16);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var23);
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var25);
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var28);
    java.text.Format[] var30 = var29.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var30, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var30, "hi!");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var30, "hi!");
    boolean var37 = var25.equals((java.lang.Object)var30);
    java.util.Locale var40 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var41 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var40);
    boolean var43 = var41.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var44 = var41.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var25.setFormatByArgumentIndex(0, (java.text.Format)var41);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test170"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.lang.Object var5 = var2.clone();
    var2.applyPattern("");
    java.lang.StringBuffer var9 = null;
    java.text.FieldPosition var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var11 = var2.format((java.lang.Object)10.0d, var9, var10);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test171"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    java.text.Format[] var4 = var3.getFormats();
    java.lang.String var5 = var3.toPattern();
    java.lang.Object var6 = var3.clone();
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
    boolean var14 = var12.equals((java.lang.Object)1L);
    java.util.Locale var15 = var12.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15, var17);
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var15, var19);
    var3.setLocale(var15);
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15, var22);
    java.lang.Object var24 = null;
    java.lang.String var25 = var23.format(var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var27 = var23.formatToCharacterIterator((java.lang.Object)(byte)10);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));

  }

  public void test172() {}
//   public void test172() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test172"); }
// 
// 
//     java.util.Map var5 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
//     boolean var8 = var6.equals((java.lang.Object)1L);
//     java.util.Locale var9 = var6.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
//     java.util.Map var11 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9, var11);
//     java.util.Map var13 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9, var13);
//     org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
//     java.text.ParsePosition var17 = null;
//     java.lang.Object[] var18 = var15.parse("hi!", var17);
// 
//   }

  public void test173() {}
//   public void test173() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test173"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     boolean var4 = var2.equals((java.lang.Object)1L);
//     java.util.Locale var5 = var2.getLocale();
//     java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
//     java.text.Format[] var7 = var2.getFormats();
//     java.text.ParsePosition var9 = null;
//     java.lang.Object[] var10 = var2.parse("", var9);
// 
//   }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test174"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    java.lang.Object var5 = var2.clone();
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    java.text.Format[] var9 = var8.getFormats();
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    boolean var15 = var13.equals((java.lang.Object)1L);
    java.util.Locale var16 = var13.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    var8.setLocale(var16);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var20);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var23);
    boolean var26 = var24.equals((java.lang.Object)1L);
    java.util.Locale var27 = var24.getLocale();
    java.text.Format[] var28 = var24.getFormatsByArgumentIndex();
    boolean var29 = var21.equals((java.lang.Object)var28);
    java.lang.String var30 = var8.format((java.lang.Object)var28);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var31 = var2.formatToCharacterIterator((java.lang.Object)var8);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));

  }

  public void test175() {}
//   public void test175() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test175"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.ParsePosition var4 = null;
//     java.lang.Object var5 = var2.parseObject("hi!", var4);
// 
//   }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test176"); }


    java.util.Locale var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var2);
    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    boolean var8 = var6.equals((java.lang.Object)1L);
    java.util.Locale var9 = var6.getLocale();
    var3.setLocale(var9);
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    java.text.Format[] var17 = var16.getFormats();
    java.lang.String var18 = var16.toPattern();
    java.lang.Object var19 = var16.clone();
    java.util.Map var24 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24);
    boolean var27 = var25.equals((java.lang.Object)1L);
    java.util.Locale var28 = var25.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var28);
    java.util.Map var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var28, var30);
    java.util.Map var32 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var33 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var28, var32);
    var16.setLocale(var28);
    java.util.Map var35 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var36 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var28, var35);
    java.lang.Object var37 = null;
    java.lang.String var38 = var36.format(var37);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.setFormatByArgumentIndex((-1), (java.text.Format)var36);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + ""+ "'", var38.equals(""));

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test177"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    boolean var5 = var3.equals((java.lang.Object)1L);
    java.util.Locale var6 = var3.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var6);
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.text.Format[] var11 = var10.getFormats();
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14);
    boolean var17 = var15.equals((java.lang.Object)1L);
    java.util.Locale var18 = var15.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
    var10.setLocale(var18);
    var7.setLocale(var18);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var23);
    boolean var26 = var24.equals((java.lang.Object)1L);
    java.util.Locale var27 = var24.getLocale();
    java.text.Format[] var28 = new java.text.Format[] { var24};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.setFormatsByArgumentIndex(var28);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test178() {}
//   public void test178() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test178"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.text.ParsePosition var5 = null;
//     java.lang.Object var6 = var2.parseObject("hi!", var5);
// 
//   }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test179"); }


    org.apache.commons.lang.Validate.isTrue(true, "", 10L);

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test180"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    java.util.Locale var6 = null;
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6, var7);
    boolean var9 = var2.equals((java.lang.Object)var6);
    java.text.Format[] var10 = var2.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var2.parseObject("hi!");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test181"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    var2.applyPattern("");
    java.text.Format var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat(0, var7);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test182"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    boolean var9 = var7.equals((java.lang.Object)1L);
    java.util.Locale var10 = var7.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    var2.setLocale(var10);
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    boolean var18 = var16.equals((java.lang.Object)1L);
    java.util.Locale var19 = var16.getLocale();
    java.text.Format[] var20 = var16.getFormatsByArgumentIndex();
    java.text.Format[] var21 = var16.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(1, (java.text.Format)var16);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test183"); }


    org.apache.commons.lang.Validate.notNull((java.lang.Object)"hi!", "hi!");

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test184"); }


    org.apache.commons.lang.Validate.isTrue(true, "", (-1.0d));

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test185"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = var2.format((java.lang.Object)100L);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test186"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var6);
    boolean var9 = var7.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var10 = var7.getLocale();
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14);
    boolean var17 = var15.equals((java.lang.Object)1L);
    java.util.Locale var18 = var15.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18, var20);
    var7.setLocale(var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var23 = var2.format((java.lang.Object)var7);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test187"); }


    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    boolean var8 = var6.equals((java.lang.Object)1L);
    java.util.Locale var9 = var6.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9, var11);
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9, var13);
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
    java.text.Format[] var18 = var17.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var15.setFormats(var18);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test188"); }


    java.util.Locale var1 = null;
    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1, var2);
    java.text.Format[] var4 = var3.getFormats();
    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    boolean var9 = var7.equals((java.lang.Object)1L);
    java.lang.Object var10 = var7.clone();
    var7.applyPattern("");
    java.text.Format[] var13 = var7.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var13, "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setFormatsByArgumentIndex(var13);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test189() {}
//   public void test189() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test189"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.lang.String var4 = var2.toPattern();
//     java.util.Locale var6 = null;
//     java.util.Map var7 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6, var7);
//     boolean var9 = var2.equals((java.lang.Object)var6);
//     java.text.Format[] var10 = var2.getFormatsByArgumentIndex();
//     java.util.Map var12 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
//     java.text.Format[] var14 = var13.getFormats();
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var14, "");
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var14, "hi!");
//     java.text.AttributedCharacterIterator var19 = var2.formatToCharacterIterator((java.lang.Object)var14);
//     java.lang.Object var20 = null;
//     java.text.AttributedCharacterIterator var21 = var2.formatToCharacterIterator(var20);
// 
//   }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test190"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat(10, var4);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }

  }

  public void test191() {}
//   public void test191() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test191"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     boolean var4 = var2.equals((java.lang.Object)1L);
//     java.util.Locale var5 = var2.getLocale();
//     java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
//     java.lang.Object[] var8 = new java.lang.Object[] { (-1)};
//     org.apache.commons.lang.Validate.noNullElements(var8);
//     org.apache.commons.lang.Validate.noNullElements(var8, "");
//     org.apache.commons.lang.Validate.noNullElements(var8);
//     org.apache.commons.lang.Validate.notEmpty(var8, "");
//     org.apache.commons.lang.Validate.noNullElements(var8);
//     java.lang.StringBuffer var16 = null;
//     java.text.FieldPosition var17 = null;
//     java.lang.StringBuffer var18 = var2.format(var8, var16, var17);
// 
//   }

  public void test192() {}
//   public void test192() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test192"); }
// 
// 
//     java.util.Locale var2 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var2);
//     java.util.Map var5 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
//     boolean var8 = var6.equals((java.lang.Object)1L);
//     java.util.Locale var9 = var6.getLocale();
//     var3.setLocale(var9);
//     org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
//     java.text.ParsePosition var13 = null;
//     java.lang.Object var14 = var11.parseObject("hi!", var13);
// 
//   }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test193"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    java.text.Format[] var5 = var4.getFormats();
    java.lang.String var6 = var4.toPattern();
    java.lang.Object var7 = var4.clone();
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    boolean var15 = var13.equals((java.lang.Object)1L);
    java.util.Locale var16 = var13.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16, var18);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var20);
    var4.setLocale(var16);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var23);
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var25);
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var28);
    java.text.Format[] var30 = var29.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var30, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var30, "hi!");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var30, "hi!");
    boolean var37 = var25.equals((java.lang.Object)var30);
    var25.applyPattern("hi!");
    java.lang.Object var40 = new java.lang.Object();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var41 = var25.format(var40);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test194"); }


    java.util.Locale var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var2);
    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    boolean var8 = var6.equals((java.lang.Object)1L);
    java.util.Locale var9 = var6.getLocale();
    var3.setLocale(var9);
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var13 = var11.format((java.lang.Object)'a');
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test195"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    java.util.Locale var6 = null;
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6, var7);
    boolean var9 = var2.equals((java.lang.Object)var6);
    java.text.Format[] var10 = var2.getFormatsByArgumentIndex();
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    boolean var16 = var14.equals((java.lang.Object)1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(10, (java.text.Format)var14);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test196"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test197"); }


    java.util.Locale var1 = null;
    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1, var2);
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    boolean var13 = var11.equals((java.lang.Object)1L);
    java.util.Locale var14 = var11.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14);
    java.util.Map var16 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14, var16);
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var14, var18);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var14, var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setFormat(10, (java.text.Format)var21);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test198() {}
//   public void test198() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test198"); }
// 
// 
//     org.apache.commons.lang.text.ExtendedMessageFormat var1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
//     java.text.Format[] var2 = var1.getFormatsByArgumentIndex();
//     java.lang.Object var3 = null;
//     java.text.AttributedCharacterIterator var4 = var1.formatToCharacterIterator(var3);
// 
//   }

  public void test199() {}
//   public void test199() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test199"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.ParsePosition var4 = null;
//     java.lang.Object var5 = var2.parseObject("hi!", var4);
// 
//   }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test200"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    boolean var9 = var7.equals((java.lang.Object)1L);
    java.util.Locale var10 = var7.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    var2.setLocale(var10);
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var14);
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
    boolean var20 = var18.equals((java.lang.Object)1L);
    java.util.Locale var21 = var18.getLocale();
    java.text.Format[] var22 = var18.getFormatsByArgumentIndex();
    boolean var23 = var15.equals((java.lang.Object)var22);
    java.lang.String var24 = var2.format((java.lang.Object)var22);
    java.util.Map var26 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26);
    java.text.Format[] var28 = var27.getFormats();
    java.lang.String var29 = var27.toPattern();
    java.util.Locale var31 = null;
    java.util.Map var32 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var31, var32);
    boolean var34 = var27.equals((java.lang.Object)var31);
    var27.applyPattern("");
    java.text.Format[] var37 = var27.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var37);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var37);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test201"); }


    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8, var10);
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var8, var12);
    java.util.Locale var16 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16);
    boolean var19 = var17.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var20 = var17.getLocale();
    java.util.Map var24 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24);
    boolean var27 = var25.equals((java.lang.Object)1L);
    java.util.Locale var28 = var25.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var28);
    java.util.Map var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var28, var30);
    var17.setLocale(var28);
    java.lang.Object var33 = var17.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.setFormatByArgumentIndex(0, (java.text.Format)var17);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test202() {}
//   public void test202() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test202"); }
// 
// 
//     java.util.Locale var1 = null;
//     java.util.Map var2 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1, var2);
//     java.text.Format[] var4 = var3.getFormats();
//     java.text.ParsePosition var6 = null;
//     java.lang.Object var7 = var3.parseObject("hi!", var6);
// 
//   }

  public void test203() {}
//   public void test203() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test203"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     boolean var4 = var2.equals((java.lang.Object)1L);
//     java.util.Locale var5 = var2.getLocale();
//     java.text.ParsePosition var7 = null;
//     java.lang.Object[] var8 = var2.parse("", var7);
// 
//   }

  public void test204() {}
//   public void test204() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test204"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     boolean var4 = var2.equals((java.lang.Object)1L);
//     java.util.Locale var5 = var2.getLocale();
//     java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
//     java.text.Format[] var7 = var2.getFormats();
//     org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
//     java.util.Locale var10 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var10);
//     boolean var13 = var11.equals((java.lang.Object)(byte)(-1));
//     java.util.Locale var14 = var11.getLocale();
//     java.util.Map var18 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
//     boolean var21 = var19.equals((java.lang.Object)1L);
//     java.util.Locale var22 = var19.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
//     java.util.Map var24 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22, var24);
//     var11.setLocale(var22);
//     var2.setLocale(var22);
//     java.text.ParsePosition var29 = null;
//     java.lang.Object[] var30 = var2.parse("", var29);
// 
//   }

  public void test205() {}
//   public void test205() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test205"); }
// 
// 
//     java.util.Map var3 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
//     java.text.Format[] var5 = var4.getFormats();
//     java.lang.String var6 = var4.toPattern();
//     java.lang.Object var7 = var4.clone();
//     java.util.Map var12 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
//     boolean var15 = var13.equals((java.lang.Object)1L);
//     java.util.Locale var16 = var13.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
//     java.util.Map var18 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16, var18);
//     java.util.Map var20 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var20);
//     var4.setLocale(var16);
//     java.util.Map var23 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var23);
//     org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16);
//     java.text.ParsePosition var27 = null;
//     java.lang.Object[] var28 = var25.parse("hi!", var27);
// 
//   }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test206"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7);
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    boolean var13 = var11.equals((java.lang.Object)1L);
    java.util.Locale var14 = var11.getLocale();
    java.text.Format[] var15 = var11.getFormatsByArgumentIndex();
    boolean var16 = var8.equals((java.lang.Object)var15);
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19);
    java.text.Format[] var21 = var20.getFormats();
    java.lang.String var22 = var20.toPattern();
    java.lang.Object var23 = var20.clone();
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var28);
    boolean var31 = var29.equals((java.lang.Object)1L);
    java.util.Locale var32 = var29.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var32);
    java.util.Map var34 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var35 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var32, var34);
    java.util.Map var36 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var37 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var32, var36);
    var20.setLocale(var32);
    java.util.Map var39 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var40 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var32, var39);
    var8.setLocale(var32);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(1, (java.text.Format)var8);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test207() {}
//   public void test207() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test207"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     boolean var4 = var2.equals((java.lang.Object)1L);
//     java.lang.Object var5 = var2.clone();
//     var2.applyPattern("hi!");
//     java.text.ParsePosition var9 = null;
//     java.lang.Object[] var10 = var2.parse("", var9);
// 
//   }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test208"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    boolean var5 = var3.equals((java.lang.Object)1L);
    java.util.Locale var6 = var3.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9);
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    boolean var15 = var13.equals((java.lang.Object)1L);
    java.util.Locale var16 = var13.getLocale();
    java.text.Format[] var17 = var13.getFormatsByArgumentIndex();
    boolean var18 = var10.equals((java.lang.Object)var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.setFormatsByArgumentIndex(var17);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test209"); }


    java.lang.Object[] var3 = new java.lang.Object[] { "hi!"};
    org.apache.commons.lang.Validate.noNullElements(var3);
    org.apache.commons.lang.Validate.isTrue(true, "hi!", (java.lang.Object)var3);
    org.apache.commons.lang.Validate.notEmpty(var3, "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test210() {}
//   public void test210() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test210"); }
// 
// 
//     java.util.Map var3 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
//     boolean var6 = var4.equals((java.lang.Object)1L);
//     java.util.Locale var7 = var4.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
//     java.util.Map var9 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7, var9);
//     java.util.Map var15 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
//     boolean var18 = var16.equals((java.lang.Object)1L);
//     java.util.Locale var19 = var16.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19);
//     java.util.Map var21 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19, var21);
//     java.util.Map var23 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19, var23);
//     java.lang.String var25 = var24.toPattern();
//     boolean var26 = var10.equals((java.lang.Object)var25);
//     java.text.ParsePosition var28 = null;
//     java.lang.Object var29 = var10.parseObject("", var28);
// 
//   }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test211"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "hi!", 10.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test212"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    var2.applyPattern("hi!");
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    java.text.Format[] var14 = var13.getFormats();
    java.lang.String var15 = var13.toPattern();
    java.lang.Object var16 = var13.clone();
    java.util.Map var21 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var21);
    boolean var24 = var22.equals((java.lang.Object)1L);
    java.util.Locale var25 = var22.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25);
    java.util.Map var27 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25, var27);
    java.util.Map var29 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var25, var29);
    var13.setLocale(var25);
    java.util.Map var32 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var33 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var25, var32);
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25);
    org.apache.commons.lang.text.ExtendedMessageFormat var35 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat((-1), (java.text.Format)var35);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test213"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var5 = var2.getLocale();
    var2.applyPattern("");
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var10);
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    boolean var16 = var14.equals((java.lang.Object)1L);
    java.util.Locale var17 = var14.getLocale();
    java.text.Format[] var18 = var14.getFormatsByArgumentIndex();
    boolean var19 = var11.equals((java.lang.Object)var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(1, (java.text.Format)var11);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test214"); }


    java.util.Locale var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var2);
    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    boolean var8 = var6.equals((java.lang.Object)1L);
    java.util.Locale var9 = var6.getLocale();
    var3.setLocale(var9);
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.util.Locale var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var13);
    boolean var16 = var14.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var17 = var14.getLocale();
    java.util.Map var21 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var21);
    boolean var24 = var22.equals((java.lang.Object)1L);
    java.util.Locale var25 = var22.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25);
    java.util.Map var27 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25, var27);
    var14.setLocale(var25);
    java.lang.Object var30 = var14.clone();
    java.lang.StringBuffer var31 = null;
    java.text.FieldPosition var32 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var33 = var11.format(var30, var31, var32);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test215"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    var2.applyPattern("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var7 = var2.parse("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test216"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "hi!", 0L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test217() {}
//   public void test217() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test217"); }
// 
// 
//     org.apache.commons.lang.text.ExtendedMessageFormat var1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
//     java.text.ParsePosition var3 = null;
//     java.lang.Object var4 = var1.parseObject("", var3);
// 
//   }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test218"); }


    java.util.Locale var1 = null;
    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1, var2);
    java.text.Format[] var4 = var3.getFormats();
    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var6);
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    boolean var12 = var10.equals((java.lang.Object)1L);
    java.util.Locale var13 = var10.getLocale();
    java.text.Format[] var14 = var10.getFormatsByArgumentIndex();
    boolean var15 = var7.equals((java.lang.Object)var14);
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
    java.text.Format[] var20 = var19.getFormats();
    java.lang.String var21 = var19.toPattern();
    java.lang.Object var22 = var19.clone();
    java.util.Map var27 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27);
    boolean var30 = var28.equals((java.lang.Object)1L);
    java.util.Locale var31 = var28.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var31);
    java.util.Map var33 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var31, var33);
    java.util.Map var35 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var36 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var31, var35);
    var19.setLocale(var31);
    java.util.Map var38 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var39 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var31, var38);
    var7.setLocale(var31);
    java.lang.Object var42 = var7.parseObject("hi!");
    java.util.Map var45 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var46 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var45);
    java.text.Format[] var47 = var46.getFormats();
    java.lang.String var48 = java.text.MessageFormat.format("", (java.lang.Object[])var47);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var47);
    java.text.AttributedCharacterIterator var50 = var7.formatToCharacterIterator((java.lang.Object)var47);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var51 = var3.formatToCharacterIterator((java.lang.Object)var50);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + ""+ "'", var48.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test219"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    java.text.Format[] var7 = var2.getFormats();
    java.util.Locale var8 = var2.getLocale();
    java.text.Format var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat(10, var10);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test220"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var6);
    boolean var8 = var2.equals((java.lang.Object)var6);
    java.lang.String var9 = var2.toPattern();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var11 = var2.format((java.lang.Object)(byte)10);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test221"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    java.text.Format[] var5 = var4.getFormats();
    java.lang.String var6 = var4.toPattern();
    java.lang.Object var7 = var4.clone();
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    boolean var15 = var13.equals((java.lang.Object)1L);
    java.util.Locale var16 = var13.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16, var18);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var20);
    var4.setLocale(var16);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var23);
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16);
    java.util.Map var27 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27);
    java.text.Format[] var29 = var28.getFormats();
    java.lang.String var30 = var28.toPattern();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var31 = var25.format((java.lang.Object)var28);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));

  }

  public void test222() {}
//   public void test222() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test222"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.lang.String var4 = var2.toPattern();
//     java.lang.Object var5 = var2.clone();
//     java.util.Map var10 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
//     boolean var13 = var11.equals((java.lang.Object)1L);
//     java.util.Locale var14 = var11.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14);
//     java.util.Map var16 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14, var16);
//     java.util.Map var18 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var14, var18);
//     var2.setLocale(var14);
//     java.lang.Object[] var22 = new java.lang.Object[] { (-1)};
//     org.apache.commons.lang.Validate.noNullElements(var22);
//     java.lang.StringBuffer var24 = null;
//     java.text.FieldPosition var25 = null;
//     java.lang.StringBuffer var26 = var2.format(var22, var24, var25);
// 
//   }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test223"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    java.text.Format[] var5 = var4.getFormats();
    java.lang.String var6 = var4.toPattern();
    java.lang.Object var7 = var4.clone();
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    boolean var15 = var13.equals((java.lang.Object)1L);
    java.util.Locale var16 = var13.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16, var18);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var20);
    var4.setLocale(var16);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var23);
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var25);
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var28);
    java.text.Format[] var30 = var29.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var30, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var30, "hi!");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var30, "hi!");
    boolean var37 = var25.equals((java.lang.Object)var30);
    java.util.Map var41 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var42 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var41);
    java.text.Format[] var43 = var42.getFormats();
    java.lang.String var44 = var42.toPattern();
    java.lang.Object var45 = var42.clone();
    java.util.Map var50 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var51 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var50);
    boolean var53 = var51.equals((java.lang.Object)1L);
    java.util.Locale var54 = var51.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var55 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var54);
    java.util.Map var56 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var57 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var54, var56);
    java.util.Map var58 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var59 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var54, var58);
    var42.setLocale(var54);
    java.util.Map var61 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var62 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var54, var61);
    org.apache.commons.lang.text.ExtendedMessageFormat var63 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var54);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var63);
    java.lang.StringBuffer var65 = null;
    java.text.FieldPosition var66 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var67 = var25.format((java.lang.Object)var63, var65, var66);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + ""+ "'", var44.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test224"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    java.text.Format[] var5 = var4.getFormats();
    java.lang.String var6 = var4.toPattern();
    java.lang.Object var7 = var4.clone();
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    boolean var15 = var13.equals((java.lang.Object)1L);
    java.util.Locale var16 = var13.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16, var18);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var20);
    var4.setLocale(var16);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var23);
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var25);
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var28);
    java.text.Format[] var30 = var29.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var30, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var30, "hi!");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var30, "hi!");
    boolean var37 = var25.equals((java.lang.Object)var30);
    var25.applyPattern("hi!");
    java.text.Format var41 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var25.setFormat((-1), var41);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test225"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    java.text.Format[] var5 = var4.getFormats();
    java.lang.String var6 = var4.toPattern();
    java.lang.Object var7 = var4.clone();
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    boolean var15 = var13.equals((java.lang.Object)1L);
    java.util.Locale var16 = var13.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16, var18);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var20);
    var4.setLocale(var16);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var23);
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    java.util.Map var27 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27);
    boolean var30 = var28.equals((java.lang.Object)1L);
    java.util.Locale var31 = var28.getLocale();
    java.text.Format[] var32 = var28.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var32, "");
    boolean var35 = var25.equals((java.lang.Object)var32);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var37 = var25.parse("hi!");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test226"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    java.text.Format[] var7 = var2.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
    java.util.Locale var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var10);
    boolean var13 = var11.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var14 = var11.getLocale();
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
    boolean var21 = var19.equals((java.lang.Object)1L);
    java.util.Locale var22 = var19.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    java.util.Map var24 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22, var24);
    var11.setLocale(var22);
    var2.setLocale(var22);
    java.util.Map var31 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var31);
    java.text.Format[] var33 = var32.getFormats();
    java.lang.String var34 = var32.toPattern();
    java.lang.Object var35 = var32.clone();
    java.util.Map var40 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var41 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var40);
    boolean var43 = var41.equals((java.lang.Object)1L);
    java.util.Locale var44 = var41.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var45 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var44);
    java.util.Map var46 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var47 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var44, var46);
    java.util.Map var48 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var49 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var44, var48);
    var32.setLocale(var44);
    java.util.Map var51 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var52 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var44, var51);
    org.apache.commons.lang.text.ExtendedMessageFormat var53 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var44);
    java.util.Map var55 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var56 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var55);
    boolean var58 = var56.equals((java.lang.Object)1L);
    java.util.Locale var59 = var56.getLocale();
    java.text.Format[] var60 = var56.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var60, "");
    boolean var63 = var53.equals((java.lang.Object)var60);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var60);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + ""+ "'", var34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);

  }

  public void test227() {}
//   public void test227() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test227"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.util.Locale var3 = var2.getLocale();
//     java.text.ParsePosition var5 = null;
//     java.lang.Object[] var6 = var2.parse("", var5);
// 
//   }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test228"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    var2.setLocale(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var11 = var2.format((java.lang.Object)"");
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test229"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
    java.text.Format[] var5 = var4.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var5);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test230"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    boolean var5 = var3.equals((java.lang.Object)1L);
    java.util.Locale var6 = var3.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var6);
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.text.Format[] var11 = var10.getFormats();
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14);
    boolean var17 = var15.equals((java.lang.Object)1L);
    java.util.Locale var18 = var15.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
    var10.setLocale(var18);
    var7.setLocale(var18);
    java.text.Format[] var22 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.setFormatsByArgumentIndex(var22);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test231"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var5 = var2.getLocale();
    var2.applyPattern("");
    java.util.Locale var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.text.Format[] var11 = var10.getFormats();
    java.lang.String var12 = var2.format((java.lang.Object)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = var2.parseObject("hi!");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test232"); }


    java.util.Locale var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var3);
    java.text.Format[] var5 = var4.getFormats();
    org.apache.commons.lang.Validate.isTrue(true, "", (java.lang.Object)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var5, "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test233"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var5 = var2.getLocale();
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    boolean var12 = var10.equals((java.lang.Object)1L);
    java.util.Locale var13 = var10.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13, var15);
    var2.setLocale(var13);
    java.util.Locale var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19);
    boolean var22 = var20.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var23 = var20.getLocale();
    java.util.Map var25 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25);
    boolean var28 = var26.equals((java.lang.Object)1L);
    java.util.Locale var29 = var26.getLocale();
    java.text.Format[] var30 = var26.getFormatsByArgumentIndex();
    java.text.Format[] var31 = var26.getFormats();
    java.text.AttributedCharacterIterator var32 = var20.formatToCharacterIterator((java.lang.Object)var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var31);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test234"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.text.Format[] var3 = var2.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var3, "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test235"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    boolean var8 = var2.equals((java.lang.Object)(short)10);
    java.text.Format[] var9 = var2.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test236() {}
//   public void test236() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test236"); }
// 
// 
//     org.apache.commons.lang.text.ExtendedMessageFormat var1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
//     java.util.Map var5 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
//     java.text.Format[] var7 = var6.getFormats();
//     java.lang.String var8 = java.text.MessageFormat.format("", (java.lang.Object[])var7);
//     java.lang.String var9 = java.text.MessageFormat.format("", (java.lang.Object[])var7);
//     java.lang.StringBuffer var10 = null;
//     java.text.FieldPosition var11 = null;
//     java.lang.StringBuffer var12 = var1.format((java.lang.Object[])var7, var10, var11);
// 
//   }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test237"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    java.text.Format[] var9 = var5.getFormatsByArgumentIndex();
    boolean var10 = var2.equals((java.lang.Object)var9);
    java.text.Format[] var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var11);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test238() {}
//   public void test238() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test238"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     var2.applyPattern("");
//     org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
//     java.text.ParsePosition var8 = null;
//     java.lang.Object[] var9 = var2.parse("hi!", var8);
// 
//   }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test239"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    java.text.Format[] var7 = var6.getFormats();
    java.lang.String var8 = var6.toPattern();
    java.util.Locale var10 = null;
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10, var11);
    boolean var13 = var6.equals((java.lang.Object)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(100, (java.text.Format)var6);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test240() {}
//   public void test240() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test240"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
//     var2.applyPattern("");
//     java.text.ParsePosition var6 = null;
//     java.lang.Object[] var7 = var2.parse("", var6);
// 
//   }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test241"); }


    org.apache.commons.lang.Validate.notNull((java.lang.Object)(byte)10, "hi!");

  }

  public void test242() {}
//   public void test242() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test242"); }
// 
// 
//     java.util.Map var4 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
//     boolean var7 = var5.equals((java.lang.Object)1L);
//     java.util.Locale var8 = var5.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
//     java.util.Map var10 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8, var10);
//     java.util.Map var12 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var8, var12);
//     java.lang.String var14 = var13.toPattern();
//     java.util.Map var20 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var20);
//     boolean var23 = var21.equals((java.lang.Object)1L);
//     java.util.Locale var24 = var21.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24);
//     java.util.Map var26 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24, var26);
//     java.util.Map var28 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var24, var28);
//     java.util.Map var30 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var24, var30);
//     java.lang.Object[] var32 = new java.lang.Object[] { var30};
//     java.lang.StringBuffer var33 = null;
//     java.text.FieldPosition var34 = null;
//     java.lang.StringBuffer var35 = var13.format(var32, var33, var34);
// 
//   }

  public void test243() {}
//   public void test243() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test243"); }
// 
// 
//     java.util.Map var2 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
//     boolean var5 = var3.equals((java.lang.Object)1L);
//     java.util.Locale var6 = var3.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
//     java.text.ParsePosition var9 = null;
//     java.lang.Object var10 = var7.parseObject("", var9);
// 
//   }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test244"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    java.text.Format[] var5 = var4.getFormats();
    java.lang.String var6 = var4.toPattern();
    java.lang.Object var7 = var4.clone();
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    boolean var15 = var13.equals((java.lang.Object)1L);
    java.util.Locale var16 = var13.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16, var18);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var20);
    var4.setLocale(var16);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var23);
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    java.util.Map var27 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27);
    boolean var30 = var28.equals((java.lang.Object)1L);
    java.util.Locale var31 = var28.getLocale();
    java.text.Format[] var32 = var28.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var32, "");
    boolean var35 = var25.equals((java.lang.Object)var32);
    java.util.Map var42 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var43 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var42);
    boolean var45 = var43.equals((java.lang.Object)1L);
    java.util.Locale var46 = var43.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var47 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var46);
    java.util.Map var48 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var49 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var46, var48);
    java.util.Map var50 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var51 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var46, var50);
    java.util.Map var52 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var53 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var46, var52);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var53);
    java.util.Map var56 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var57 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var56);
    boolean var58 = var53.equals((java.lang.Object)var57);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var25.setFormatByArgumentIndex(1, (java.text.Format)var57);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);

  }

  public void test245() {}
//   public void test245() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test245"); }
// 
// 
//     java.util.Map var2 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
//     boolean var5 = var3.equals((java.lang.Object)1L);
//     java.util.Locale var6 = var3.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var6);
//     java.util.Map var9 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
//     java.text.Format[] var11 = var10.getFormats();
//     java.util.Map var14 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14);
//     boolean var17 = var15.equals((java.lang.Object)1L);
//     java.util.Locale var18 = var15.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
//     var10.setLocale(var18);
//     var7.setLocale(var18);
//     java.lang.Object[] var24 = new java.lang.Object[] { "hi!"};
//     org.apache.commons.lang.Validate.noNullElements(var24);
//     org.apache.commons.lang.Validate.noNullElements(var24);
//     org.apache.commons.lang.Validate.notEmpty(var24, "");
//     java.lang.String var29 = java.text.MessageFormat.format("", var24);
//     java.lang.StringBuffer var30 = null;
//     java.text.FieldPosition var31 = null;
//     java.lang.StringBuffer var32 = var7.format(var24, var30, var31);
// 
//   }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test246"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    java.text.Format[] var6 = var5.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var6, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var6);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test247"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    boolean var8 = var2.equals((java.lang.Object)(short)10);
    java.text.Format[] var9 = var2.getFormats();
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
    java.text.Format[] var13 = var12.getFormats();
    java.lang.String var14 = var12.toPattern();
    java.lang.Object var15 = var12.clone();
    java.util.Locale var16 = var12.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var17 = var2.format((java.lang.Object)var16);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test248"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "hi!", 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test249"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var5 = var2.getLocale();
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    boolean var12 = var10.equals((java.lang.Object)1L);
    java.util.Locale var13 = var10.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13, var15);
    var2.setLocale(var13);
    java.lang.Object var18 = var2.clone();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var2, "");
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var28);
    boolean var31 = var29.equals((java.lang.Object)1L);
    java.util.Locale var32 = var29.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var32);
    java.util.Map var34 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var35 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var32, var34);
    java.util.Map var36 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var37 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var32, var36);
    java.util.Map var38 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var39 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var32, var38);
    org.apache.commons.lang.text.ExtendedMessageFormat var40 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var32);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(100, (java.text.Format)var40);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test250"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    boolean var5 = var3.equals((java.lang.Object)1L);
    java.util.Locale var6 = var3.getLocale();
    java.text.Format[] var7 = var3.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var7, "");
    java.lang.String var10 = java.text.MessageFormat.format("", (java.lang.Object[])var7);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var7, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test251() {}
//   public void test251() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test251"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     boolean var4 = var2.equals((java.lang.Object)1L);
//     java.util.Locale var5 = var2.getLocale();
//     java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
//     java.text.Format[] var7 = var2.getFormats();
//     org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
//     var2.applyPattern("");
//     java.text.ParsePosition var12 = null;
//     java.lang.Object[] var13 = var2.parse("hi!", var12);
// 
//   }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test252"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    boolean var6 = var4.equals((java.lang.Object)1L);
    java.util.Locale var7 = var4.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7);
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7, var9);
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    boolean var15 = var13.equals((java.lang.Object)1L);
    java.util.Locale var16 = var13.getLocale();
    java.text.Format[] var17 = var13.getFormatsByArgumentIndex();
    java.text.Format[] var18 = var13.getFormats();
    java.text.AttributedCharacterIterator var19 = var10.formatToCharacterIterator((java.lang.Object)var18);
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var22);
    java.util.Map var25 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25);
    boolean var28 = var26.equals((java.lang.Object)1L);
    java.util.Locale var29 = var26.getLocale();
    java.text.Format[] var30 = var26.getFormatsByArgumentIndex();
    boolean var31 = var23.equals((java.lang.Object)var30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.setFormat(100, (java.text.Format)var23);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test253"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.text.Format[] var3 = var2.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test254"); }


    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8, var10);
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var8, var12);
    java.lang.Object var14 = var13.clone();
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
    boolean var21 = var19.equals((java.lang.Object)1L);
    java.util.Locale var22 = var19.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    java.util.Map var24 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22, var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var26 = var13.formatToCharacterIterator((java.lang.Object)var22);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test255"); }


    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    boolean var9 = var7.equals((java.lang.Object)1L);
    java.util.Locale var10 = var7.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10, var12);
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var10, var14);
    java.util.Map var16 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var10, var16);
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var20 = var18.parse("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test256"); }


    java.lang.Object[] var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.noNullElements(var0, "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test257"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "hi!", (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test258"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "hi!", 100L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test259"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var6, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test260"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var5 = var2.parse("hi!");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test261"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    boolean var9 = var7.equals((java.lang.Object)1L);
    java.util.Locale var10 = var7.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10, var12);
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
    boolean var21 = var19.equals((java.lang.Object)1L);
    java.util.Locale var22 = var19.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    java.util.Map var24 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22, var24);
    java.util.Map var26 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var22, var26);
    java.lang.String var28 = var27.toPattern();
    boolean var29 = var13.equals((java.lang.Object)var28);
    boolean var30 = var2.equals((java.lang.Object)var29);
    java.util.Map var34 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var35 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var34);
    boolean var37 = var35.equals((java.lang.Object)1L);
    java.util.Locale var38 = var35.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var39 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var38);
    java.util.Map var41 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var42 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var41);
    java.text.Format[] var43 = var42.getFormats();
    java.util.Map var46 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var47 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var46);
    boolean var49 = var47.equals((java.lang.Object)1L);
    java.util.Locale var50 = var47.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var51 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var50);
    var42.setLocale(var50);
    var39.setLocale(var50);
    java.util.Locale var54 = var39.getLocale();
    java.text.Format[] var55 = var39.getFormatsByArgumentIndex();
    java.text.Format[] var56 = var39.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat(1, (java.text.Format)var39);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test262"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var5 = var2.getLocale();
    java.util.Locale var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7);
    java.lang.StringBuffer var9 = null;
    java.text.FieldPosition var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var11 = var2.format((java.lang.Object)var8, var9, var10);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test263() {}
//   public void test263() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test263"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.lang.String var4 = var2.toPattern();
//     java.util.Locale var6 = null;
//     java.util.Map var7 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6, var7);
//     boolean var9 = var2.equals((java.lang.Object)var6);
//     java.text.Format[] var10 = var2.getFormatsByArgumentIndex();
//     java.util.Map var12 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
//     java.text.Format[] var14 = var13.getFormats();
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var14, "");
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var14, "hi!");
//     java.text.AttributedCharacterIterator var19 = var2.formatToCharacterIterator((java.lang.Object)var14);
//     java.lang.Object[] var23 = new java.lang.Object[] { (-1)};
//     org.apache.commons.lang.Validate.noNullElements(var23);
//     java.lang.String var25 = java.text.MessageFormat.format("hi!", var23);
//     java.lang.String var26 = java.text.MessageFormat.format("", var23);
//     org.apache.commons.lang.Validate.notEmpty(var23);
//     java.lang.StringBuffer var28 = null;
//     java.text.FieldPosition var29 = null;
//     java.lang.StringBuffer var30 = var2.format((java.lang.Object)var23, var28, var29);
// 
//   }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test264"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.lang.Object var5 = var2.clone();
    java.util.Locale var6 = var2.getLocale();
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    boolean var12 = var10.equals((java.lang.Object)1L);
    java.util.Locale var13 = var10.getLocale();
    java.text.Format[] var14 = var10.getFormatsByArgumentIndex();
    boolean var16 = var10.equals((java.lang.Object)(short)10);
    java.text.Format[] var17 = var10.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(0, (java.text.Format)var10);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test265"); }


    java.lang.Object[] var4 = new java.lang.Object[] { (-1)};
    org.apache.commons.lang.Validate.noNullElements(var4);
    java.lang.String var6 = java.text.MessageFormat.format("hi!", var4);
    java.lang.String var7 = java.text.MessageFormat.format("", var4);
    java.lang.String var8 = java.text.MessageFormat.format("hi!", var4);
    org.apache.commons.lang.Validate.noNullElements(var4, "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test266"); }


    org.apache.commons.lang.Validate.notNull((java.lang.Object)'a');

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test267"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    boolean var5 = var3.equals((java.lang.Object)1L);
    java.lang.Object var6 = var3.clone();
    var3.applyPattern("");
    java.text.Format[] var9 = var3.getFormats();
    java.lang.String var10 = java.text.MessageFormat.format("", (java.lang.Object[])var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test268() {}
//   public void test268() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test268"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
//     boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
//     java.util.Map var10 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
//     boolean var13 = var11.equals((java.lang.Object)1L);
//     java.util.Locale var14 = var11.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14);
//     java.util.Map var16 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14, var16);
//     java.util.Map var18 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var14, var18);
//     org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14);
//     var2.setLocale(var14);
//     java.util.Map var24 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24);
//     java.text.Format[] var26 = var25.getFormats();
//     java.lang.String var27 = var25.toPattern();
//     java.lang.Object var28 = var25.clone();
//     java.util.Map var33 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var33);
//     boolean var36 = var34.equals((java.lang.Object)1L);
//     java.util.Locale var37 = var34.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var38 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var37);
//     java.util.Map var39 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var40 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var37, var39);
//     java.util.Map var41 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var42 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var37, var41);
//     var25.setLocale(var37);
//     java.util.Map var44 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var45 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var37, var44);
//     java.lang.StringBuffer var46 = null;
//     java.text.FieldPosition var47 = null;
//     java.lang.StringBuffer var48 = var2.format((java.lang.Object)var44, var46, var47);
// 
//   }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test269"); }


    org.apache.commons.lang.Validate.notEmpty("hi!", "");

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test270"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.lang.Object var5 = var2.clone();
    var2.applyPattern("");
    java.text.Format[] var8 = var2.getFormats();
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var11);
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14);
    boolean var17 = var15.equals((java.lang.Object)1L);
    java.util.Locale var18 = var15.getLocale();
    java.text.Format[] var19 = var15.getFormatsByArgumentIndex();
    boolean var20 = var12.equals((java.lang.Object)var19);
    java.lang.String var21 = java.text.MessageFormat.format("", (java.lang.Object[])var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var19);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test271"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    java.text.Format[] var9 = var5.getFormatsByArgumentIndex();
    boolean var10 = var2.equals((java.lang.Object)var9);
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    java.text.Format[] var15 = var14.getFormats();
    java.lang.String var16 = var14.toPattern();
    java.lang.Object var17 = var14.clone();
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    boolean var25 = var23.equals((java.lang.Object)1L);
    java.util.Locale var26 = var23.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26);
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26, var28);
    java.util.Map var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var26, var30);
    var14.setLocale(var26);
    java.util.Map var33 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26, var33);
    var2.setLocale(var26);
    org.apache.commons.lang.text.ExtendedMessageFormat var37 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
    boolean var38 = var2.equals((java.lang.Object)var37);
    java.util.Map var41 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var42 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var41);
    boolean var44 = var42.equals((java.lang.Object)1L);
    java.util.Locale var45 = var42.getLocale();
    java.text.Format[] var46 = var42.getFormatsByArgumentIndex();
    java.text.Format[] var47 = var42.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var42);
    java.util.Locale var50 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var51 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var50);
    boolean var53 = var51.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var54 = var51.getLocale();
    java.util.Map var58 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var59 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var58);
    boolean var61 = var59.equals((java.lang.Object)1L);
    java.util.Locale var62 = var59.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var63 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var62);
    java.util.Map var64 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var65 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var62, var64);
    var51.setLocale(var62);
    var42.setLocale(var62);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var37.setFormatByArgumentIndex(1, (java.text.Format)var42);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test272"); }


    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    boolean var8 = var6.equals((java.lang.Object)1L);
    java.util.Locale var9 = var6.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9, var11);
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9, var13);
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9, var15);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var16);
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19);
    boolean var21 = var16.equals((java.lang.Object)var20);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var23);
    boolean var26 = var24.equals((java.lang.Object)1L);
    java.lang.Object var27 = var24.clone();
    java.text.Format[] var28 = var24.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var16.setFormats(var28);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test273"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    var2.applyPattern("");
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
    java.util.Locale var8 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var8);
    boolean var11 = var9.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var12 = var9.getLocale();
    var9.applyPattern("");
    var9.applyPattern("hi!");
    java.text.Format[] var17 = var9.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var17);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test274"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.lang.Object var5 = var2.clone();
    var2.applyPattern("");
    java.text.Format[] var8 = var2.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var8, "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test275() {}
//   public void test275() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test275"); }
// 
// 
//     java.util.Locale var2 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var2);
//     java.util.Map var5 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
//     boolean var8 = var6.equals((java.lang.Object)1L);
//     java.util.Locale var9 = var6.getLocale();
//     var3.setLocale(var9);
//     org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
//     java.lang.Object var12 = var11.clone();
//     java.text.ParsePosition var14 = null;
//     java.lang.Object var15 = var11.parseObject("hi!", var14);
// 
//   }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test276"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    boolean var5 = var3.equals((java.lang.Object)1L);
    java.util.Locale var6 = var3.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var6);
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.text.Format[] var11 = var10.getFormats();
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14);
    boolean var17 = var15.equals((java.lang.Object)1L);
    java.util.Locale var18 = var15.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
    var10.setLocale(var18);
    var7.setLocale(var18);
    java.util.Locale var22 = var7.getLocale();
    java.text.Format[] var23 = var7.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var23, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test277() {}
//   public void test277() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test277"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.lang.Object var4 = var2.clone();
//     var2.applyPattern("");
//     java.lang.Object[] var10 = new java.lang.Object[] { (-1)};
//     org.apache.commons.lang.Validate.noNullElements(var10);
//     java.lang.String var12 = java.text.MessageFormat.format("hi!", var10);
//     java.lang.String var13 = java.text.MessageFormat.format("hi!", var10);
//     org.apache.commons.lang.Validate.noNullElements(var10, "");
//     java.lang.StringBuffer var16 = null;
//     java.text.FieldPosition var17 = null;
//     java.lang.StringBuffer var18 = var2.format((java.lang.Object)var10, var16, var17);
// 
//   }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test278"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var5 = var2.getLocale();
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    boolean var12 = var10.equals((java.lang.Object)1L);
    java.util.Locale var13 = var10.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13, var15);
    var2.setLocale(var13);
    java.lang.Object var18 = var2.clone();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var2, "");
    java.util.Map var24 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24);
    boolean var27 = var25.equals((java.lang.Object)1L);
    java.util.Locale var28 = var25.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var28);
    java.util.Map var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var28, var30);
    var31.applyPattern("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var34 = var2.format((java.lang.Object)var31);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test279"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    java.text.Format[] var4 = var3.getFormats();
    java.lang.String var5 = var3.toPattern();
    java.lang.Object var6 = var3.clone();
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
    boolean var14 = var12.equals((java.lang.Object)1L);
    java.util.Locale var15 = var12.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15, var17);
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var15, var19);
    var3.setLocale(var15);
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var15, var22);
    java.lang.Object var25 = var23.parseObject("hi!");
    java.text.Format var27 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var23.setFormatByArgumentIndex(10, var27);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test280"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    java.text.Format[] var5 = var4.getFormats();
    java.text.Format[] var6 = var4.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "", (java.lang.Object)var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test281() {}
//   public void test281() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test281"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.lang.String var4 = var2.toPattern();
//     java.lang.Object var5 = var2.clone();
//     java.lang.String var6 = var2.toPattern();
//     java.util.Map var10 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
//     boolean var13 = var11.equals((java.lang.Object)1L);
//     java.util.Locale var14 = var11.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var14);
//     org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14);
//     var2.setLocale(var14);
//     java.text.ParsePosition var19 = null;
//     java.lang.Object[] var20 = var2.parse("", var19);
// 
//   }

  public void test282() {}
//   public void test282() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test282"); }
// 
// 
//     java.util.Locale var2 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var2);
//     boolean var5 = var3.equals((java.lang.Object)(byte)(-1));
//     java.util.Map var11 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
//     boolean var14 = var12.equals((java.lang.Object)1L);
//     java.util.Locale var15 = var12.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
//     java.util.Map var17 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15, var17);
//     java.util.Map var19 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var15, var19);
//     org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
//     var3.setLocale(var15);
//     org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
//     java.util.Map var25 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25);
//     java.text.Format[] var27 = var26.getFormats();
//     java.text.Format[] var28 = var26.getFormats();
//     java.lang.StringBuffer var29 = null;
//     java.text.FieldPosition var30 = null;
//     java.lang.StringBuffer var31 = var23.format((java.lang.Object[])var28, var29, var30);
// 
//   }

  public void test283() {}
//   public void test283() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test283"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
//     java.text.ParsePosition var4 = null;
//     java.lang.Object[] var5 = var2.parse("hi!", var4);
// 
//   }

  public void test284() {}
//   public void test284() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test284"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
//     boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
//     java.util.Locale var5 = var2.getLocale();
//     var2.applyPattern("");
//     var2.applyPattern("hi!");
//     java.text.ParsePosition var11 = null;
//     java.lang.Object var12 = var2.parseObject("", var11);
// 
//   }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test285"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    java.util.Locale var6 = null;
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6, var7);
    boolean var9 = var2.equals((java.lang.Object)var6);
    java.text.Format[] var10 = var2.getFormatsByArgumentIndex();
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    boolean var18 = var16.equals((java.lang.Object)1L);
    java.util.Locale var19 = var16.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19);
    java.util.Map var21 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19, var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(10, (java.text.Format)var22);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test286"); }


    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    boolean var8 = var6.equals((java.lang.Object)1L);
    java.util.Locale var9 = var6.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9, var11);
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9, var13);
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9, var15);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var16);
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19);
    boolean var21 = var16.equals((java.lang.Object)var20);
    java.util.Locale var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var23);
    boolean var26 = var24.equals((java.lang.Object)(byte)(-1));
    java.util.Map var32 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var32);
    boolean var35 = var33.equals((java.lang.Object)1L);
    java.util.Locale var36 = var33.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var37 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var36);
    java.util.Map var38 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var39 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var36, var38);
    java.util.Map var40 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var41 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var36, var40);
    org.apache.commons.lang.text.ExtendedMessageFormat var42 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var36);
    var24.setLocale(var36);
    var24.applyPattern("");
    java.lang.StringBuffer var46 = null;
    java.text.FieldPosition var47 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var48 = var16.format((java.lang.Object)var24, var46, var47);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test287() {}
//   public void test287() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test287"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.lang.String var4 = var2.toPattern();
//     java.util.Locale var6 = null;
//     java.util.Map var7 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6, var7);
//     boolean var9 = var2.equals((java.lang.Object)var6);
//     java.text.Format[] var10 = var2.getFormatsByArgumentIndex();
//     java.util.Map var12 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
//     java.text.Format[] var14 = var13.getFormats();
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var14, "");
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var14, "hi!");
//     java.text.AttributedCharacterIterator var19 = var2.formatToCharacterIterator((java.lang.Object)var14);
//     java.text.ParsePosition var21 = null;
//     java.lang.Object[] var22 = var2.parse("", var21);
// 
//   }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test288"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    var2.applyPattern("");
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    boolean var13 = var11.equals((java.lang.Object)1L);
    java.util.Locale var14 = var11.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14);
    java.util.Map var16 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var14, var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var18 = var2.format((java.lang.Object)var17);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test289() {}
//   public void test289() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test289"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
//     java.util.Map var4 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
//     boolean var7 = var5.equals((java.lang.Object)1L);
//     java.util.Locale var8 = var5.getLocale();
//     var2.setLocale(var8);
//     java.util.Locale var13 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var13);
//     java.text.Format[] var15 = var14.getFormats();
//     org.apache.commons.lang.Validate.isTrue(true, "", (java.lang.Object)var15);
//     java.lang.StringBuffer var17 = null;
//     java.text.FieldPosition var18 = null;
//     java.lang.StringBuffer var19 = var2.format((java.lang.Object[])var15, var17, var18);
// 
//   }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test290"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.lang.Object var5 = var2.clone();
    var2.applyPattern("");
    java.text.Format[] var8 = var2.getFormats();
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var10);
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    boolean var16 = var14.equals((java.lang.Object)1L);
    java.util.Locale var17 = var14.getLocale();
    java.text.Format[] var18 = var14.getFormatsByArgumentIndex();
    boolean var19 = var11.equals((java.lang.Object)var18);
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    java.text.Format[] var24 = var23.getFormats();
    java.lang.String var25 = var23.toPattern();
    java.lang.Object var26 = var23.clone();
    java.util.Map var31 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var31);
    boolean var34 = var32.equals((java.lang.Object)1L);
    java.util.Locale var35 = var32.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var36 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var35);
    java.util.Map var37 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var38 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var35, var37);
    java.util.Map var39 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var40 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var35, var39);
    var23.setLocale(var35);
    java.util.Map var42 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var43 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var35, var42);
    var11.setLocale(var35);
    java.lang.Object var46 = var11.parseObject("hi!");
    java.util.Map var49 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var50 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var49);
    java.text.Format[] var51 = var50.getFormats();
    java.lang.String var52 = java.text.MessageFormat.format("", (java.lang.Object[])var51);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var51);
    java.text.AttributedCharacterIterator var54 = var11.formatToCharacterIterator((java.lang.Object)var51);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var51);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + ""+ "'", var52.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test291() {}
//   public void test291() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test291"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
//     var2.applyPattern("");
//     java.text.ParsePosition var6 = null;
//     java.lang.Object var7 = var2.parseObject("hi!", var6);
// 
//   }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test292"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    boolean var8 = var2.equals((java.lang.Object)(short)10);
    java.text.Format[] var9 = var2.getFormats();
    java.text.Format[] var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var10);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test293"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    java.text.Format[] var9 = var5.getFormatsByArgumentIndex();
    boolean var10 = var2.equals((java.lang.Object)var9);
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    java.text.Format[] var15 = var14.getFormats();
    java.lang.String var16 = var14.toPattern();
    java.lang.Object var17 = var14.clone();
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    boolean var25 = var23.equals((java.lang.Object)1L);
    java.util.Locale var26 = var23.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26);
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26, var28);
    java.util.Map var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var26, var30);
    var14.setLocale(var26);
    java.util.Map var33 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26, var33);
    var2.setLocale(var26);
    java.lang.Object var37 = var2.parseObject("hi!");
    org.apache.commons.lang.Validate.notNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test294"); }


    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    boolean var8 = var6.equals((java.lang.Object)1L);
    java.util.Locale var9 = var6.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9, var11);
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9, var13);
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9, var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var18 = var16.parse("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test295"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    boolean var9 = var7.equals((java.lang.Object)1L);
    java.util.Locale var10 = var7.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    var2.setLocale(var10);
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var14);
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
    boolean var20 = var18.equals((java.lang.Object)1L);
    java.util.Locale var21 = var18.getLocale();
    java.text.Format[] var22 = var18.getFormatsByArgumentIndex();
    boolean var23 = var15.equals((java.lang.Object)var22);
    java.lang.String var24 = var2.format((java.lang.Object)var22);
    java.util.Locale var26 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var26);
    boolean var29 = var27.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var30 = var27.getLocale();
    java.util.Map var32 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var32);
    boolean var35 = var33.equals((java.lang.Object)1L);
    java.util.Locale var36 = var33.getLocale();
    java.text.Format[] var37 = var33.getFormatsByArgumentIndex();
    java.text.Format[] var38 = var33.getFormats();
    java.text.AttributedCharacterIterator var39 = var27.formatToCharacterIterator((java.lang.Object)var38);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var38);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var38);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test296"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    boolean var5 = var3.equals((java.lang.Object)1L);
    java.util.Locale var6 = var3.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var6);
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
    java.text.Format[] var13 = var12.getFormats();
    java.lang.String var14 = var12.toPattern();
    java.lang.Object var15 = var12.clone();
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var20);
    boolean var23 = var21.equals((java.lang.Object)1L);
    java.util.Locale var24 = var21.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24);
    java.util.Map var26 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24, var26);
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var24, var28);
    var12.setLocale(var24);
    java.util.Map var31 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var24, var31);
    java.lang.Object var34 = var32.parseObject("hi!");
    java.lang.String var35 = var32.toPattern();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.setFormatByArgumentIndex(1, (java.text.Format)var32);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test297"); }


    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    boolean var8 = var6.equals((java.lang.Object)1L);
    java.util.Locale var9 = var6.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9, var11);
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9, var13);
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9, var15);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var9, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test298"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    java.lang.Object var5 = var2.clone();
    java.lang.String var6 = var2.toPattern();
    java.util.Map var8 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
    boolean var11 = var9.equals((java.lang.Object)1L);
    java.util.Locale var12 = var9.getLocale();
    java.text.Format[] var13 = var9.getFormatsByArgumentIndex();
    var9.applyPattern("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var16 = var2.formatToCharacterIterator((java.lang.Object)var9);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test299"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    boolean var6 = var4.equals((java.lang.Object)1L);
    java.util.Locale var7 = var4.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7);
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7, var9);
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    boolean var15 = var13.equals((java.lang.Object)1L);
    java.util.Locale var16 = var13.getLocale();
    java.text.Format[] var17 = var13.getFormatsByArgumentIndex();
    java.text.Format[] var18 = var13.getFormats();
    java.text.AttributedCharacterIterator var19 = var10.formatToCharacterIterator((java.lang.Object)var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var18);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test300"); }


    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    boolean var9 = var7.equals((java.lang.Object)1L);
    java.util.Locale var10 = var7.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10, var12);
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var10, var14);
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10, var17);
    java.util.Locale var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var20);
    boolean var23 = var21.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var25 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var25);
    boolean var27 = var21.equals((java.lang.Object)var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var28 = var18.formatToCharacterIterator((java.lang.Object)var27);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test301"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    java.text.Format[] var7 = var2.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var10 = var2.parse("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test302"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    java.text.Format[] var5 = var4.getFormats();
    java.lang.String var6 = var4.toPattern();
    java.lang.Object var7 = var4.clone();
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    boolean var15 = var13.equals((java.lang.Object)1L);
    java.util.Locale var16 = var13.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16, var18);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var20);
    var4.setLocale(var16);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var23);
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var27 = var25.parseObject("hi!");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test303"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var5 = var2.getLocale();
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    boolean var10 = var8.equals((java.lang.Object)1L);
    java.util.Locale var11 = var8.getLocale();
    java.text.Format[] var12 = var8.getFormatsByArgumentIndex();
    java.text.Format[] var13 = var8.getFormats();
    java.text.AttributedCharacterIterator var14 = var2.formatToCharacterIterator((java.lang.Object)var13);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var20);
    boolean var23 = var21.equals((java.lang.Object)1L);
    java.util.Locale var24 = var21.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24);
    java.util.Map var26 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24, var26);
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var24, var28);
    java.util.Map var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var24, var30);
    var2.setLocale(var24);
    java.util.Map var34 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var35 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var34);
    boolean var37 = var35.equals((java.lang.Object)1L);
    java.util.Locale var38 = var35.getLocale();
    java.text.Format[] var39 = var35.getFormatsByArgumentIndex();
    java.text.Format[] var40 = var35.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var35);
    java.util.Locale var43 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var44 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var43);
    boolean var46 = var44.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var47 = var44.getLocale();
    java.util.Map var51 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var52 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var51);
    boolean var54 = var52.equals((java.lang.Object)1L);
    java.util.Locale var55 = var52.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var56 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var55);
    java.util.Map var57 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var58 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var55, var57);
    var44.setLocale(var55);
    var35.setLocale(var55);
    var2.setLocale(var55);
    java.util.Map var63 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var64 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var63);
    java.text.Format[] var65 = var64.getFormats();
    java.lang.String var66 = var64.toPattern();
    java.lang.Object var67 = var64.clone();
    java.util.Map var72 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var73 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var72);
    boolean var75 = var73.equals((java.lang.Object)1L);
    java.util.Locale var76 = var73.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var77 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var76);
    java.util.Map var78 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var79 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var76, var78);
    java.util.Map var80 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var81 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var76, var80);
    var64.setLocale(var76);
    java.lang.StringBuffer var83 = null;
    java.text.FieldPosition var84 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var85 = var2.format((java.lang.Object)var76, var83, var84);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + ""+ "'", var66.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test304"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    java.text.Format[] var5 = var2.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var2.parseObject("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test305"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    boolean var5 = var3.equals((java.lang.Object)1L);
    java.lang.Object var6 = var3.clone();
    java.util.Locale var7 = var3.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7);
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14);
    boolean var17 = var15.equals((java.lang.Object)1L);
    java.util.Locale var18 = var15.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18, var20);
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var18, var22);
    java.util.Map var24 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var18, var24);
    java.lang.String var26 = var25.toPattern();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var27 = var8.format((java.lang.Object)var26);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test306"); }


    java.lang.Object[] var5 = new java.lang.Object[] { (-1)};
    org.apache.commons.lang.Validate.noNullElements(var5);
    java.lang.String var7 = java.text.MessageFormat.format("hi!", var5);
    java.lang.String var8 = java.text.MessageFormat.format("", var5);
    java.lang.String var9 = java.text.MessageFormat.format("hi!", var5);
    java.lang.String var10 = java.text.MessageFormat.format("", var5);
    org.apache.commons.lang.Validate.noNullElements(var5, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test307"); }


    java.lang.Object[] var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.noNullElements(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test308"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    java.text.Format[] var7 = var2.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
    java.util.Locale var9 = null;
    var2.setLocale(var9);
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    boolean var16 = var14.equals((java.lang.Object)1L);
    java.util.Locale var17 = var14.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var17);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var20);
    java.text.Format[] var22 = var21.getFormats();
    java.util.Map var25 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25);
    boolean var28 = var26.equals((java.lang.Object)1L);
    java.util.Locale var29 = var26.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var29);
    var21.setLocale(var29);
    var18.setLocale(var29);
    java.util.Locale var33 = var18.getLocale();
    java.text.Format[] var34 = var18.getFormatsByArgumentIndex();
    java.lang.StringBuffer var35 = null;
    java.text.FieldPosition var36 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var37 = var2.format((java.lang.Object)var18, var35, var36);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test309"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    var2.applyPattern("");
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    boolean var15 = var13.equals((java.lang.Object)1L);
    java.util.Locale var16 = var13.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16, var18);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var20);
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var22);
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var25 = var2.format((java.lang.Object)var24);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test310"); }


    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    java.text.Format[] var6 = var5.getFormats();
    java.lang.String var7 = var5.toPattern();
    java.lang.Object var8 = var5.clone();
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    boolean var16 = var14.equals((java.lang.Object)1L);
    java.util.Locale var17 = var14.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17, var19);
    java.util.Map var21 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var17, var21);
    var5.setLocale(var17);
    java.util.Map var24 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var17, var24);
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var17);
    java.text.Format[] var28 = var27.getFormatsByArgumentIndex();
    java.util.Map var34 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var35 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var34);
    boolean var37 = var35.equals((java.lang.Object)1L);
    java.util.Locale var38 = var35.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var39 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var38);
    java.util.Map var40 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var41 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var38, var40);
    java.util.Map var42 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var43 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var38, var42);
    java.lang.String var44 = var43.toPattern();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var27.setFormat(0, (java.text.Format)var43);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test311"); }


    org.apache.commons.lang.text.ExtendedMessageFormat var1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    java.text.Format[] var6 = var5.getFormats();
    java.lang.String var7 = java.text.MessageFormat.format("", (java.lang.Object[])var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var8 = var1.formatToCharacterIterator((java.lang.Object)"");
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test312"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    java.text.Format[] var9 = var5.getFormatsByArgumentIndex();
    boolean var10 = var2.equals((java.lang.Object)var9);
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    java.text.Format[] var15 = var14.getFormats();
    java.lang.String var16 = var14.toPattern();
    java.lang.Object var17 = var14.clone();
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    boolean var25 = var23.equals((java.lang.Object)1L);
    java.util.Locale var26 = var23.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26);
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26, var28);
    java.util.Map var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var26, var30);
    var14.setLocale(var26);
    java.util.Map var33 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26, var33);
    var2.setLocale(var26);
    java.lang.Object var37 = var2.parseObject("hi!");
    java.util.Map var40 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var41 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var40);
    java.text.Format[] var42 = var41.getFormats();
    java.lang.String var43 = java.text.MessageFormat.format("", (java.lang.Object[])var42);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var42);
    java.text.AttributedCharacterIterator var45 = var2.formatToCharacterIterator((java.lang.Object)var42);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var45, "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test313"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test314"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    java.text.Format[] var5 = var4.getFormats();
    java.lang.String var6 = var4.toPattern();
    java.lang.Object var7 = var4.clone();
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    boolean var15 = var13.equals((java.lang.Object)1L);
    java.util.Locale var16 = var13.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16, var18);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var20);
    var4.setLocale(var16);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var23);
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    java.util.Map var27 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27);
    boolean var30 = var28.equals((java.lang.Object)1L);
    java.util.Locale var31 = var28.getLocale();
    java.text.Format[] var32 = var28.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var32, "");
    boolean var35 = var25.equals((java.lang.Object)var32);
    java.util.Map var42 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var43 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var42);
    boolean var45 = var43.equals((java.lang.Object)1L);
    java.util.Locale var46 = var43.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var47 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var46);
    java.util.Map var48 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var49 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var46, var48);
    java.util.Map var50 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var51 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var46, var50);
    java.util.Map var52 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var53 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var46, var52);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var53);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var25.setFormatByArgumentIndex(0, (java.text.Format)var53);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test315"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    boolean var6 = var4.equals((java.lang.Object)1L);
    java.util.Locale var7 = var4.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7, var9);
    java.util.Locale var11 = var10.getLocale();
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    java.text.Format[] var15 = var14.getFormats();
    java.lang.Object var16 = var14.clone();
    var14.applyPattern("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var19 = var10.format((java.lang.Object)var14);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test316"); }


    java.lang.Object[] var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test317() {}
//   public void test317() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test317"); }
// 
// 
//     java.util.Map var4 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
//     boolean var7 = var5.equals((java.lang.Object)1L);
//     java.util.Locale var8 = var5.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
//     java.util.Map var10 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8, var10);
//     java.util.Map var12 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var8, var12);
//     java.lang.String var14 = var13.toPattern();
//     var13.applyPattern("");
//     java.lang.Object[] var18 = new java.lang.Object[] { "hi!"};
//     org.apache.commons.lang.Validate.noNullElements(var18);
//     org.apache.commons.lang.Validate.noNullElements(var18);
//     java.lang.StringBuffer var21 = null;
//     java.text.FieldPosition var22 = null;
//     java.lang.StringBuffer var23 = var13.format(var18, var21, var22);
// 
//   }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test318"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var5 = var2.getLocale();
    var2.applyPattern("");
    java.text.Format var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(0, var9);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test319"); }


    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    boolean var8 = var6.equals((java.lang.Object)1L);
    java.util.Locale var9 = var6.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9, var11);
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9, var13);
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9, var15);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var16);
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19);
    boolean var21 = var16.equals((java.lang.Object)var20);
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
    java.text.Format[] var24 = var23.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var16.setFormatsByArgumentIndex(var24);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test320"); }


    java.util.Locale var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var2);
    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    boolean var8 = var6.equals((java.lang.Object)1L);
    java.util.Locale var9 = var6.getLocale();
    var3.setLocale(var9);
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.lang.Object var12 = var11.clone();
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    boolean var18 = var16.equals((java.lang.Object)1L);
    java.util.Locale var19 = var16.getLocale();
    java.text.Format[] var20 = var16.getFormatsByArgumentIndex();
    java.text.Format[] var21 = var16.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var16);
    java.lang.String var23 = var16.toPattern();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.setFormatByArgumentIndex(1, (java.text.Format)var16);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test321"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    java.text.Format[] var7 = var6.getFormats();
    java.lang.String var8 = var6.toPattern();
    java.lang.Object var9 = var6.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat(1, (java.text.Format)var6);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test322"); }


    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    boolean var8 = var6.equals((java.lang.Object)1L);
    java.util.Locale var9 = var6.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9);
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var11);
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    boolean var18 = var16.equals((java.lang.Object)1L);
    java.util.Locale var19 = var16.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19);
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    java.text.Format[] var24 = var23.getFormats();
    java.util.Map var27 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27);
    boolean var30 = var28.equals((java.lang.Object)1L);
    java.util.Locale var31 = var28.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var31);
    var23.setLocale(var31);
    var20.setLocale(var31);
    java.util.Locale var35 = var20.getLocale();
    java.text.Format[] var36 = var20.getFormatsByArgumentIndex();
    java.text.Format[] var37 = var20.getFormatsByArgumentIndex();
    boolean var38 = var11.equals((java.lang.Object)var37);
    org.apache.commons.lang.Validate.isTrue(true, "hi!", (java.lang.Object)var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test323"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.lang.Object var5 = var2.clone();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    java.text.Format[] var7 = var2.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test324"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var5 = var2.getLocale();
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    boolean var12 = var10.equals((java.lang.Object)1L);
    java.util.Locale var13 = var10.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13, var15);
    var2.setLocale(var13);
    java.util.Map var21 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var21);
    java.util.Map var24 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24);
    boolean var27 = var25.equals((java.lang.Object)1L);
    java.util.Locale var28 = var25.getLocale();
    java.text.Format[] var29 = var25.getFormatsByArgumentIndex();
    boolean var30 = var22.equals((java.lang.Object)var29);
    java.lang.String var31 = java.text.MessageFormat.format("", (java.lang.Object[])var29);
    java.lang.String var32 = java.text.MessageFormat.format("", (java.lang.Object[])var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var29);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test325"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    java.util.Locale var6 = null;
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6, var7);
    boolean var9 = var2.equals((java.lang.Object)var6);
    var2.applyPattern("");
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    boolean var16 = var14.equals((java.lang.Object)1L);
    java.lang.Object var17 = var14.clone();
    var14.applyPattern("");
    java.text.Format[] var20 = var14.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var20, "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var20);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test326"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.lang.Object var5 = var2.clone();
    var2.applyPattern("");
    java.text.Format[] var8 = var2.getFormats();
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex((-1), (java.text.Format)var11);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test327"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var5 = var2.getLocale();
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    boolean var12 = var10.equals((java.lang.Object)1L);
    java.util.Locale var13 = var10.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13, var15);
    var2.setLocale(var13);
    java.lang.Object var18 = var2.clone();
    java.util.Map var25 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25);
    boolean var28 = var26.equals((java.lang.Object)1L);
    java.util.Locale var29 = var26.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var29);
    java.util.Map var31 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var29, var31);
    java.util.Map var33 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var29, var33);
    java.util.Map var35 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var36 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var29, var35);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(100, (java.text.Format)var36);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test328"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var6, "");
    org.apache.commons.lang.Validate.notNull((java.lang.Object)"", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test329"); }


    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    boolean var8 = var6.equals((java.lang.Object)1L);
    java.util.Locale var9 = var6.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9, var11);
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9, var13);
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9, var15);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)"hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test330"); }


    java.lang.Object[] var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.noNullElements(var0, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test331() {}
//   public void test331() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test331"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     var2.applyPattern("");
//     org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
//     java.text.ParsePosition var8 = null;
//     java.lang.Object var9 = var2.parseObject("", var8);
// 
//   }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test332"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var6);
    boolean var8 = var2.equals((java.lang.Object)var6);
    java.lang.String var9 = var2.toPattern();
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
    java.text.Format[] var13 = var12.getFormats();
    java.lang.String var14 = var12.toPattern();
    java.util.Locale var16 = null;
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16, var17);
    boolean var19 = var12.equals((java.lang.Object)var16);
    java.text.Format[] var20 = var12.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var20);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test333"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    boolean var9 = var7.equals((java.lang.Object)1L);
    java.util.Locale var10 = var7.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    var2.setLocale(var10);
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var14);
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
    boolean var20 = var18.equals((java.lang.Object)1L);
    java.util.Locale var21 = var18.getLocale();
    java.text.Format[] var22 = var18.getFormatsByArgumentIndex();
    boolean var23 = var15.equals((java.lang.Object)var22);
    java.lang.String var24 = var2.format((java.lang.Object)var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var22, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));

  }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test334"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var4, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test335"); }


    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    boolean var9 = var7.equals((java.lang.Object)1L);
    java.util.Locale var10 = var7.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10, var12);
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var10, var14);
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10, var17);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var20);
    java.text.Format[] var22 = var21.getFormats();
    java.lang.String var23 = var21.toPattern();
    java.text.Format[] var24 = var21.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var18.setFormatsByArgumentIndex(var24);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test336() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test336"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "hi!", 1L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test337"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    boolean var9 = var7.equals((java.lang.Object)1L);
    java.util.Locale var10 = var7.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    var2.setLocale(var10);
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var14);
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
    boolean var20 = var18.equals((java.lang.Object)1L);
    java.util.Locale var21 = var18.getLocale();
    java.text.Format[] var22 = var18.getFormatsByArgumentIndex();
    boolean var23 = var15.equals((java.lang.Object)var22);
    java.lang.String var24 = var2.format((java.lang.Object)var22);
    java.lang.String var25 = var2.toPattern();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var27 = var2.parse("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test338"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var5 = var2.getLocale();
    var2.applyPattern("");
    var2.applyPattern("hi!");
    java.text.Format[] var10 = var2.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var10, "");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test339() {}
//   public void test339() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test339"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
//     boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
//     java.util.Locale var5 = var2.getLocale();
//     var2.applyPattern("");
//     boolean var9 = var2.equals((java.lang.Object)(byte)100);
//     java.text.Format[] var10 = var2.getFormatsByArgumentIndex();
//     java.text.ParsePosition var12 = null;
//     java.lang.Object[] var13 = var2.parse("hi!", var12);
// 
//   }

  public void test340() {}
//   public void test340() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test340"); }
// 
// 
//     java.util.Map var3 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
//     boolean var6 = var4.equals((java.lang.Object)1L);
//     java.util.Locale var7 = var4.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
//     java.util.Map var9 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7, var9);
//     java.util.Map var15 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
//     boolean var18 = var16.equals((java.lang.Object)1L);
//     java.util.Locale var19 = var16.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19);
//     java.util.Map var21 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19, var21);
//     java.util.Map var23 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19, var23);
//     java.lang.String var25 = var24.toPattern();
//     boolean var26 = var10.equals((java.lang.Object)var25);
//     java.util.Map var29 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var29);
//     java.text.Format[] var31 = var30.getFormats();
//     java.lang.String var32 = var30.toPattern();
//     java.lang.Object var33 = var30.clone();
//     java.util.Map var38 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var39 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var38);
//     boolean var41 = var39.equals((java.lang.Object)1L);
//     java.util.Locale var42 = var39.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var43 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var42);
//     java.util.Map var44 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var45 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var42, var44);
//     java.util.Map var46 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var47 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var42, var46);
//     var30.setLocale(var42);
//     java.util.Map var49 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var50 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var42, var49);
//     java.lang.Object var51 = null;
//     java.lang.String var52 = var50.format(var51);
//     java.lang.Object var53 = null;
//     boolean var54 = var50.equals(var53);
//     java.lang.Object[] var55 = new java.lang.Object[] { var54};
//     java.lang.StringBuffer var56 = null;
//     java.text.FieldPosition var57 = null;
//     java.lang.StringBuffer var58 = var10.format(var55, var56, var57);
// 
//   }

  public void test341() {}
//   public void test341() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test341"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.lang.String var4 = var2.toPattern();
//     java.util.Locale var6 = null;
//     java.util.Map var7 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6, var7);
//     boolean var9 = var2.equals((java.lang.Object)var6);
//     var2.applyPattern("");
//     java.util.Map var14 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14);
//     boolean var17 = var15.equals((java.lang.Object)1L);
//     java.util.Locale var18 = var15.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var18);
//     java.util.Map var21 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var21);
//     java.text.Format[] var23 = var22.getFormats();
//     java.util.Map var26 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26);
//     boolean var29 = var27.equals((java.lang.Object)1L);
//     java.util.Locale var30 = var27.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var30);
//     var22.setLocale(var30);
//     var19.setLocale(var30);
//     java.util.Locale var34 = var19.getLocale();
//     var2.setLocale(var34);
//     java.text.ParsePosition var37 = null;
//     java.lang.Object[] var38 = var2.parse("hi!", var37);
// 
//   }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test342"); }


    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    boolean var8 = var6.equals((java.lang.Object)1L);
    java.util.Locale var9 = var6.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9, var11);
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9, var13);
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9, var15);
    java.lang.String var17 = var16.toPattern();
    java.util.Locale var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var20);
    boolean var23 = var21.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var24 = var21.getLocale();
    java.util.Map var26 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26);
    boolean var29 = var27.equals((java.lang.Object)1L);
    java.util.Locale var30 = var27.getLocale();
    java.text.Format[] var31 = var27.getFormatsByArgumentIndex();
    java.text.Format[] var32 = var27.getFormats();
    java.text.AttributedCharacterIterator var33 = var21.formatToCharacterIterator((java.lang.Object)var32);
    java.util.Map var39 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var40 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var39);
    boolean var42 = var40.equals((java.lang.Object)1L);
    java.util.Locale var43 = var40.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var44 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var43);
    java.util.Map var45 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var46 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var43, var45);
    java.util.Map var47 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var48 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var43, var47);
    java.util.Map var49 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var50 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var43, var49);
    var21.setLocale(var43);
    java.util.Map var53 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var54 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var53);
    boolean var56 = var54.equals((java.lang.Object)1L);
    java.util.Locale var57 = var54.getLocale();
    java.text.Format[] var58 = var54.getFormatsByArgumentIndex();
    java.text.Format[] var59 = var54.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var54);
    java.util.Locale var62 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var63 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var62);
    boolean var65 = var63.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var66 = var63.getLocale();
    java.util.Map var70 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var71 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var70);
    boolean var73 = var71.equals((java.lang.Object)1L);
    java.util.Locale var74 = var71.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var75 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var74);
    java.util.Map var76 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var77 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var74, var76);
    var63.setLocale(var74);
    var54.setLocale(var74);
    var21.setLocale(var74);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var16.setFormatByArgumentIndex((-1), (java.text.Format)var21);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test343"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.text.Format[] var4 = var2.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var4, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test344"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    java.text.Format[] var7 = var6.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var7, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var7);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var7);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test345"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    var2.applyPattern("");
    var2.applyPattern("");
    java.util.Locale var8 = var2.getLocale();
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
    boolean var14 = var12.equals((java.lang.Object)1L);
    java.util.Locale var15 = var12.getLocale();
    java.text.Format[] var16 = var12.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var16, "");
    java.lang.String var19 = java.text.MessageFormat.format("", (java.lang.Object[])var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var20 = var2.format((java.lang.Object)"");
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));

  }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test346"); }


    org.apache.commons.lang.Validate.isTrue(true, "", (java.lang.Object)"");

  }

  public void test347() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test347"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "hi!", (-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test348"); }


    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var8, var10);
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8, var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var15 = var13.parse("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test349"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "", 0L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test350"); }


    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    boolean var9 = var7.equals((java.lang.Object)1L);
    java.util.Locale var10 = var7.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10, var12);
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var10, var14);
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10, var17);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)"", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test351() {}
//   public void test351() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test351"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
//     java.util.Map var4 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
//     boolean var7 = var5.equals((java.lang.Object)1L);
//     java.util.Locale var8 = var5.getLocale();
//     java.text.Format[] var9 = var5.getFormatsByArgumentIndex();
//     boolean var10 = var2.equals((java.lang.Object)var9);
//     java.util.Map var13 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
//     java.text.Format[] var15 = var14.getFormats();
//     java.lang.String var16 = var14.toPattern();
//     java.lang.Object var17 = var14.clone();
//     java.util.Map var22 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
//     boolean var25 = var23.equals((java.lang.Object)1L);
//     java.util.Locale var26 = var23.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26);
//     java.util.Map var28 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26, var28);
//     java.util.Map var30 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var26, var30);
//     var14.setLocale(var26);
//     java.util.Map var33 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26, var33);
//     var2.setLocale(var26);
//     java.util.Map var40 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var41 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var40);
//     java.text.Format[] var42 = var41.getFormats();
//     java.lang.String var43 = var41.toPattern();
//     java.lang.Object var44 = var41.clone();
//     java.util.Map var49 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var50 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var49);
//     boolean var52 = var50.equals((java.lang.Object)1L);
//     java.util.Locale var53 = var50.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var54 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var53);
//     java.util.Map var55 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var56 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var53, var55);
//     java.util.Map var57 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var58 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var53, var57);
//     var41.setLocale(var53);
//     java.util.Map var60 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var61 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var53, var60);
//     org.apache.commons.lang.text.ExtendedMessageFormat var62 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var53);
//     org.apache.commons.lang.text.ExtendedMessageFormat var63 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var53);
//     java.text.Format[] var64 = var63.getFormatsByArgumentIndex();
//     java.lang.StringBuffer var65 = null;
//     java.text.FieldPosition var66 = null;
//     java.lang.StringBuffer var67 = var2.format((java.lang.Object)var64, var65, var66);
// 
//   }

  public void test352() {}
//   public void test352() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test352"); }
// 
// 
//     java.util.Locale var2 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var2);
//     java.util.Map var5 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
//     boolean var8 = var6.equals((java.lang.Object)1L);
//     java.util.Locale var9 = var6.getLocale();
//     var3.setLocale(var9);
//     org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
//     java.lang.Object var12 = var11.clone();
//     java.util.Map var17 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
//     java.text.Format[] var19 = var18.getFormats();
//     java.lang.String var20 = var18.toPattern();
//     java.lang.Object var21 = var18.clone();
//     java.util.Map var26 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26);
//     boolean var29 = var27.equals((java.lang.Object)1L);
//     java.util.Locale var30 = var27.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var30);
//     java.util.Map var32 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var30, var32);
//     java.util.Map var34 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var35 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var30, var34);
//     var18.setLocale(var30);
//     java.util.Map var37 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var38 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var30, var37);
//     org.apache.commons.lang.text.ExtendedMessageFormat var39 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var30);
//     org.apache.commons.lang.text.ExtendedMessageFormat var40 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var30);
//     java.text.Format[] var41 = var40.getFormatsByArgumentIndex();
//     java.lang.StringBuffer var42 = null;
//     java.text.FieldPosition var43 = null;
//     java.lang.StringBuffer var44 = var11.format((java.lang.Object[])var41, var42, var43);
// 
//   }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test353"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    var2.applyPattern("");
    java.util.Map var8 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
    boolean var11 = var9.equals((java.lang.Object)1L);
    java.util.Locale var12 = var9.getLocale();
    java.text.Format[] var13 = var9.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var13, "");
    java.lang.String var16 = java.text.MessageFormat.format("", (java.lang.Object[])var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var13);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test354() {}
//   public void test354() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test354"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
//     java.lang.Object var3 = var2.clone();
//     java.text.ParsePosition var5 = null;
//     java.lang.Object[] var6 = var2.parse("hi!", var5);
// 
//   }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test355"); }


    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    boolean var8 = var6.equals((java.lang.Object)1L);
    java.util.Locale var9 = var6.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9, var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "hi!", (java.lang.Object)var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test356() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test356"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.lang.Object var3 = var2.clone();
    java.lang.String var4 = var2.toPattern();
    java.util.Locale var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    java.lang.Object var8 = var7.clone();
    java.lang.String var9 = var7.toPattern();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var10 = var2.formatToCharacterIterator((java.lang.Object)var7);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test357"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.text.Format[] var3 = var2.getFormatsByArgumentIndex();
    var2.applyPattern("hi!");
    org.apache.commons.lang.Validate.notNull((java.lang.Object)"hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test358"); }


    java.util.Locale var1 = null;
    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1, var2);
    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    boolean var8 = var6.equals((java.lang.Object)1L);
    java.util.Locale var9 = var6.getLocale();
    java.text.Format[] var10 = var6.getFormatsByArgumentIndex();
    java.text.Format[] var11 = var6.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var6);
    var6.applyPattern("");
    java.text.Format[] var15 = var6.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setFormats(var15);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test359() {}
//   public void test359() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test359"); }
// 
// 
//     java.util.Map var4 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
//     boolean var7 = var5.equals((java.lang.Object)1L);
//     java.util.Locale var8 = var5.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var8);
//     java.util.Map var10 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var8, var10);
//     java.util.Map var12 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8, var12);
//     java.lang.Object[] var15 = new java.lang.Object[] { (-1)};
//     org.apache.commons.lang.Validate.noNullElements(var15);
//     java.lang.StringBuffer var17 = null;
//     java.text.FieldPosition var18 = null;
//     java.lang.StringBuffer var19 = var13.format(var15, var17, var18);
// 
//   }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test360"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    boolean var10 = var8.equals((java.lang.Object)1L);
    java.util.Locale var11 = var8.getLocale();
    java.text.Format[] var12 = var8.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var12);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test361() {}
//   public void test361() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test361"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
//     java.util.Map var4 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
//     boolean var7 = var5.equals((java.lang.Object)1L);
//     java.util.Locale var8 = var5.getLocale();
//     java.text.Format[] var9 = var5.getFormatsByArgumentIndex();
//     boolean var10 = var2.equals((java.lang.Object)var9);
//     java.util.Map var13 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
//     java.text.Format[] var15 = var14.getFormats();
//     java.lang.String var16 = var14.toPattern();
//     java.lang.Object var17 = var14.clone();
//     java.util.Map var22 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
//     boolean var25 = var23.equals((java.lang.Object)1L);
//     java.util.Locale var26 = var23.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26);
//     java.util.Map var28 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26, var28);
//     java.util.Map var30 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var26, var30);
//     var14.setLocale(var26);
//     java.util.Map var33 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26, var33);
//     var2.setLocale(var26);
//     java.lang.Object var37 = var2.parseObject("hi!");
//     java.util.Map var40 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var41 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var40);
//     java.text.Format[] var42 = var41.getFormats();
//     java.lang.String var43 = java.text.MessageFormat.format("", (java.lang.Object[])var42);
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var42);
//     java.text.AttributedCharacterIterator var45 = var2.formatToCharacterIterator((java.lang.Object)var42);
//     java.lang.Object var46 = var2.clone();
//     java.text.ParsePosition var48 = null;
//     java.lang.Object[] var49 = var2.parse("hi!", var48);
// 
//   }

  public void test362() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test362"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var6);
    boolean var8 = var2.equals((java.lang.Object)var6);
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
    boolean var14 = var12.equals((java.lang.Object)1L);
    java.util.Locale var15 = var12.getLocale();
    java.text.Format[] var16 = var12.getFormatsByArgumentIndex();
    java.text.Format[] var17 = var12.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(100, (java.text.Format)var12);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test363() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test363"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    var2.applyPattern("");
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
    java.lang.Object var7 = null;
    boolean var8 = var2.equals(var7);
    java.util.Locale var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
    java.lang.Object var13 = var12.clone();
    java.lang.String var14 = var12.toPattern();
    java.text.Format[] var15 = var12.getFormats();
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
    java.text.Format[] var19 = var18.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var19, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var19, "hi!");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var19, "hi!");
    java.text.AttributedCharacterIterator var26 = var12.formatToCharacterIterator((java.lang.Object)var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(0, (java.text.Format)var12);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test364"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    java.text.Format[] var7 = var2.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
    java.util.Locale var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var10);
    boolean var13 = var11.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var14 = var11.getLocale();
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
    boolean var21 = var19.equals((java.lang.Object)1L);
    java.util.Locale var22 = var19.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    java.util.Map var24 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22, var24);
    var11.setLocale(var22);
    var2.setLocale(var22);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var2, "hi!");
    java.util.Locale var31 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var31);
    boolean var34 = var32.equals((java.lang.Object)(byte)(-1));
    java.util.Map var40 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var41 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var40);
    boolean var43 = var41.equals((java.lang.Object)1L);
    java.util.Locale var44 = var41.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var45 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var44);
    java.util.Map var46 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var47 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var44, var46);
    java.util.Map var48 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var49 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var44, var48);
    org.apache.commons.lang.text.ExtendedMessageFormat var50 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var44);
    var32.setLocale(var44);
    var2.setLocale(var44);
    java.util.Map var55 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var56 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var55);
    boolean var58 = var56.equals((java.lang.Object)1L);
    java.util.Locale var59 = var56.getLocale();
    java.text.Format[] var60 = var56.getFormatsByArgumentIndex();
    java.text.Format[] var61 = var56.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var56);
    var56.applyPattern("");
    java.text.Format[] var65 = var56.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(10, (java.text.Format)var56);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test365"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var5 = var2.getLocale();
    var2.applyPattern("");
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    java.text.Format[] var12 = var11.getFormats();
    java.lang.String var13 = var11.toPattern();
    java.lang.Object var14 = var11.clone();
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19);
    boolean var22 = var20.equals((java.lang.Object)1L);
    java.util.Locale var23 = var20.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var23);
    java.util.Map var25 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var23, var25);
    java.util.Map var27 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var23, var27);
    var11.setLocale(var23);
    java.util.Map var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var23, var30);
    java.lang.Object var33 = var31.parseObject("hi!");
    java.text.Format[] var34 = var31.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var34);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test366"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.Object[] var5 = new java.lang.Object[] { "hi!"};
    org.apache.commons.lang.Validate.noNullElements(var5);
    org.apache.commons.lang.Validate.noNullElements(var5);
    org.apache.commons.lang.Validate.notEmpty(var5, "");
    org.apache.commons.lang.Validate.notEmpty(var5, "");
    java.lang.StringBuffer var12 = null;
    java.text.FieldPosition var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var14 = var2.format((java.lang.Object)"", var12, var13);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test367"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    boolean var5 = var3.equals((java.lang.Object)1L);
    java.util.Locale var6 = var3.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var6);
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.text.Format[] var11 = var10.getFormats();
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14);
    boolean var17 = var15.equals((java.lang.Object)1L);
    java.util.Locale var18 = var15.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
    var10.setLocale(var18);
    var7.setLocale(var18);
    java.util.Locale var22 = var7.getLocale();
    java.text.Format[] var23 = var7.getFormatsByArgumentIndex();
    java.text.Format[] var24 = var7.getFormatsByArgumentIndex();
    java.util.Map var27 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27);
    boolean var30 = var28.equals((java.lang.Object)1L);
    java.util.Locale var31 = var28.getLocale();
    java.text.Format[] var32 = var28.getFormatsByArgumentIndex();
    java.text.Format[] var33 = var28.getFormats();
    java.util.Locale var34 = var28.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.setFormatByArgumentIndex(10, (java.text.Format)var28);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test368"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var5 = var2.getLocale();
    var2.applyPattern("");
    var2.applyPattern("hi!");
    java.util.Locale var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var12);
    java.text.Format[] var14 = var13.getFormatsByArgumentIndex();
    var13.applyPattern("hi!");
    java.lang.Object var17 = var13.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat(0, (java.text.Format)var13);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test369"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.text.Format[] var3 = var2.getFormatsByArgumentIndex();
    java.text.Format[] var4 = var2.getFormatsByArgumentIndex();
    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    java.text.Format[] var8 = var7.getFormats();
    java.lang.String var9 = var7.toPattern();
    java.util.Locale var11 = null;
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11, var12);
    boolean var14 = var7.equals((java.lang.Object)var11);
    var7.applyPattern("");
    java.text.Format[] var17 = var7.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var17);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test370"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.text.Format[] var4 = var2.getFormats();
    java.lang.String var5 = var2.toPattern();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var2.parseObject("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test371"); }


    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    boolean var8 = var6.equals((java.lang.Object)1L);
    java.util.Locale var9 = var6.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9, var11);
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9, var13);
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9, var15);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var16);
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19);
    boolean var21 = var16.equals((java.lang.Object)var20);
    java.util.Locale var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var23);
    java.lang.Object var25 = var24.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var26 = var20.format((java.lang.Object)var24);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test372"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    java.text.Format[] var5 = var4.getFormats();
    java.lang.String var6 = var4.toPattern();
    java.lang.Object var7 = var4.clone();
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    boolean var15 = var13.equals((java.lang.Object)1L);
    java.util.Locale var16 = var13.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16, var18);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var20);
    var4.setLocale(var16);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var23);
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var25);
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var28);
    java.text.Format[] var30 = var29.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var30, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var30, "hi!");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var30, "hi!");
    boolean var37 = var25.equals((java.lang.Object)var30);
    var25.applyPattern("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var41 = var25.parse("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test373"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    java.text.Format[] var8 = var7.getFormats();
    java.lang.String var9 = var7.toPattern();
    java.lang.Object var10 = var7.clone();
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    boolean var18 = var16.equals((java.lang.Object)1L);
    java.util.Locale var19 = var16.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19);
    java.util.Map var21 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19, var21);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19, var23);
    var7.setLocale(var19);
    java.util.Map var26 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19, var26);
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var28);
    java.util.Map var31 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var31);
    java.text.Format[] var33 = var32.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var33, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var33, "hi!");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var33, "hi!");
    boolean var40 = var28.equals((java.lang.Object)var33);
    var28.applyPattern("hi!");
    var28.applyPattern("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var45 = var2.format((java.lang.Object)"");
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test374"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    java.text.Format[] var7 = var2.getFormats();
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    java.text.Format[] var12 = var11.getFormats();
    java.lang.String var13 = var11.toPattern();
    java.util.Locale var15 = null;
    java.util.Map var16 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15, var16);
    boolean var18 = var11.equals((java.lang.Object)var15);
    var11.applyPattern("");
    java.text.Format[] var21 = var11.getFormats();
    java.lang.String var22 = java.text.MessageFormat.format("", (java.lang.Object[])var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var21);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test375() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test375"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "", 1.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test376() {}
//   public void test376() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test376"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
//     boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
//     java.util.Locale var5 = var2.getLocale();
//     java.util.Map var7 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
//     boolean var10 = var8.equals((java.lang.Object)1L);
//     java.util.Locale var11 = var8.getLocale();
//     java.text.Format[] var12 = var8.getFormatsByArgumentIndex();
//     java.text.Format[] var13 = var8.getFormats();
//     java.text.AttributedCharacterIterator var14 = var2.formatToCharacterIterator((java.lang.Object)var13);
//     java.util.Map var18 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
//     java.text.Format[] var20 = var19.getFormats();
//     java.lang.String var21 = var19.toPattern();
//     java.lang.Object var22 = var19.clone();
//     java.util.Map var27 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27);
//     boolean var30 = var28.equals((java.lang.Object)1L);
//     java.util.Locale var31 = var28.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var31);
//     java.util.Map var33 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var31, var33);
//     java.util.Map var35 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var36 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var31, var35);
//     var19.setLocale(var31);
//     java.util.Map var38 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var39 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var31, var38);
//     org.apache.commons.lang.text.ExtendedMessageFormat var40 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var31);
//     org.apache.commons.lang.Validate.notNull((java.lang.Object)var40);
//     boolean var42 = var2.equals((java.lang.Object)var40);
//     java.text.ParsePosition var44 = null;
//     java.lang.Object[] var45 = var40.parse("", var44);
// 
//   }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test377"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    boolean var5 = var3.equals((java.lang.Object)1L);
    java.util.Locale var6 = var3.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var6);
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.text.Format[] var11 = var10.getFormats();
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14);
    boolean var17 = var15.equals((java.lang.Object)1L);
    java.util.Locale var18 = var15.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
    var10.setLocale(var18);
    var7.setLocale(var18);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var23);
    boolean var26 = var24.equals((java.lang.Object)1L);
    java.lang.Object var27 = var24.clone();
    var24.applyPattern("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var30 = var7.format((java.lang.Object)var24);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test378"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    java.util.Locale var6 = null;
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6, var7);
    boolean var9 = var2.equals((java.lang.Object)var6);
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
    boolean var14 = var12.equals((java.lang.Object)1L);
    java.lang.Object var15 = var12.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var16 = var2.formatToCharacterIterator((java.lang.Object)var12);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test379"); }


    java.lang.Object[] var2 = new java.lang.Object[] { (-1)};
    org.apache.commons.lang.Validate.noNullElements(var2);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var2, "hi!");
    org.apache.commons.lang.Validate.notEmpty(var2);
    java.lang.String var7 = java.text.MessageFormat.format("hi!", var2);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var7, "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test380"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var3, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test381"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    java.text.Format[] var7 = var2.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
    java.util.Locale var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var10);
    boolean var13 = var11.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var14 = var11.getLocale();
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
    boolean var21 = var19.equals((java.lang.Object)1L);
    java.util.Locale var22 = var19.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    java.util.Map var24 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22, var24);
    var11.setLocale(var22);
    var2.setLocale(var22);
    java.text.Format[] var28 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var28);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test382() {}
//   public void test382() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test382"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
//     boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
//     java.util.Locale var5 = var2.getLocale();
//     java.util.Map var9 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
//     boolean var12 = var10.equals((java.lang.Object)1L);
//     java.util.Locale var13 = var10.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
//     java.util.Map var15 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13, var15);
//     var2.setLocale(var13);
//     java.lang.Object var18 = var2.clone();
//     java.text.ParsePosition var20 = null;
//     java.lang.Object[] var21 = var2.parse("hi!", var20);
// 
//   }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test383"); }


    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    boolean var9 = var7.equals((java.lang.Object)1L);
    java.util.Locale var10 = var7.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10, var12);
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var10, var14);
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10, var17);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var23);
    java.text.Format[] var25 = var24.getFormats();
    java.lang.String var26 = var24.toPattern();
    java.lang.Object var27 = var24.clone();
    java.util.Map var32 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var32);
    boolean var35 = var33.equals((java.lang.Object)1L);
    java.util.Locale var36 = var33.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var37 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var36);
    java.util.Map var38 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var39 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var36, var38);
    java.util.Map var40 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var41 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var36, var40);
    var24.setLocale(var36);
    java.util.Map var43 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var44 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var36, var43);
    org.apache.commons.lang.text.ExtendedMessageFormat var45 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var36);
    java.util.Map var47 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var48 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var47);
    boolean var50 = var48.equals((java.lang.Object)1L);
    java.util.Locale var51 = var48.getLocale();
    java.text.Format[] var52 = var48.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var52, "");
    boolean var55 = var45.equals((java.lang.Object)var52);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var18.setFormatByArgumentIndex(1, (java.text.Format)var45);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);

  }

  public void test384() {}
//   public void test384() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test384"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     boolean var4 = var2.equals((java.lang.Object)1L);
//     java.lang.Object var5 = var2.clone();
//     var2.applyPattern("");
//     java.util.Locale var8 = var2.getLocale();
//     java.util.Map var10 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
//     java.text.Format[] var12 = var11.getFormats();
//     java.lang.String var13 = var11.toPattern();
//     var11.applyPattern("hi!");
//     java.text.Format[] var16 = var11.getFormats();
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var16, "hi!");
//     java.lang.StringBuffer var19 = null;
//     java.text.FieldPosition var20 = null;
//     java.lang.StringBuffer var21 = var2.format((java.lang.Object[])var16, var19, var20);
// 
//   }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test385"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    java.text.Format[] var7 = var2.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
    java.util.Locale var9 = null;
    var2.setLocale(var9);
    java.util.Locale var11 = var2.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var13 = var2.parse("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test386"); }


    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    boolean var9 = var7.equals((java.lang.Object)1L);
    java.util.Locale var10 = var7.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10, var12);
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var10, var14);
    java.util.Map var16 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var10, var16);
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    java.util.Map var21 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var21);
    java.util.Map var24 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24);
    boolean var27 = var25.equals((java.lang.Object)1L);
    java.util.Locale var28 = var25.getLocale();
    java.text.Format[] var29 = var25.getFormatsByArgumentIndex();
    boolean var30 = var22.equals((java.lang.Object)var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var18.setFormat(10, (java.text.Format)var22);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test387() {}
//   public void test387() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test387"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
//     java.util.Map var4 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
//     boolean var7 = var5.equals((java.lang.Object)1L);
//     java.util.Locale var8 = var5.getLocale();
//     java.text.Format[] var9 = var5.getFormatsByArgumentIndex();
//     boolean var10 = var2.equals((java.lang.Object)var9);
//     java.util.Map var13 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
//     java.text.Format[] var15 = var14.getFormats();
//     java.lang.String var16 = var14.toPattern();
//     java.lang.Object var17 = var14.clone();
//     java.util.Map var22 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
//     boolean var25 = var23.equals((java.lang.Object)1L);
//     java.util.Locale var26 = var23.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26);
//     java.util.Map var28 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26, var28);
//     java.util.Map var30 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var26, var30);
//     var14.setLocale(var26);
//     java.util.Map var33 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26, var33);
//     var2.setLocale(var26);
//     java.lang.Object var37 = var2.parseObject("hi!");
//     java.util.Map var40 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var41 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var40);
//     java.text.Format[] var42 = var41.getFormats();
//     java.lang.String var43 = java.text.MessageFormat.format("", (java.lang.Object[])var42);
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var42);
//     java.text.AttributedCharacterIterator var45 = var2.formatToCharacterIterator((java.lang.Object)var42);
//     java.text.ParsePosition var47 = null;
//     java.lang.Object var48 = var2.parseObject("", var47);
// 
//   }

  public void test388() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test388"); }


    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    boolean var8 = var6.equals((java.lang.Object)1L);
    java.util.Locale var9 = var6.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9, var11);
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9, var13);
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9, var15);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var16);
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19);
    boolean var21 = var16.equals((java.lang.Object)var20);
    org.apache.commons.lang.Validate var22 = new org.apache.commons.lang.Validate();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var22);
    java.lang.StringBuffer var24 = null;
    java.text.FieldPosition var25 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var26 = var16.format((java.lang.Object)var22, var24, var25);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test389() {}
//   public void test389() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test389"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.util.Locale var3 = var2.getLocale();
//     var2.applyPattern("");
//     java.util.Locale var7 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7);
//     java.text.Format[] var9 = var8.getFormatsByArgumentIndex();
//     java.lang.StringBuffer var10 = null;
//     java.text.FieldPosition var11 = null;
//     java.lang.StringBuffer var12 = var2.format((java.lang.Object)var9, var10, var11);
// 
//   }

  public void test390() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test390"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.lang.Object var5 = var2.clone();
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    java.text.Format[] var9 = var8.getFormats();
    var8.applyPattern("");
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var8);
    java.util.Locale var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    java.text.Format[] var17 = var16.getFormats();
    java.lang.String var18 = java.text.MessageFormat.format("hi!", (java.lang.Object[])var17);
    java.lang.String var19 = var8.format((java.lang.Object)var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var17);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));

  }

  public void test391() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test391"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "hi!", (java.lang.Object)(byte)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test392() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test392"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    boolean var5 = var3.equals((java.lang.Object)1L);
    java.util.Locale var6 = var3.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var6);
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.text.Format[] var11 = var10.getFormats();
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14);
    boolean var17 = var15.equals((java.lang.Object)1L);
    java.util.Locale var18 = var15.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
    var10.setLocale(var18);
    var7.setLocale(var18);
    java.util.Locale var22 = var7.getLocale();
    java.text.Format[] var23 = var7.getFormatsByArgumentIndex();
    java.text.Format[] var24 = var7.getFormatsByArgumentIndex();
    java.util.Map var26 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var26);
    java.util.Map var29 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var29);
    boolean var32 = var30.equals((java.lang.Object)1L);
    java.util.Locale var33 = var30.getLocale();
    java.text.Format[] var34 = var30.getFormatsByArgumentIndex();
    boolean var35 = var27.equals((java.lang.Object)var34);
    java.text.Format[] var36 = var27.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.setFormatsByArgumentIndex(var36);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test393() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test393"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    java.text.Format[] var4 = var3.getFormats();
    java.lang.String var5 = var3.toPattern();
    java.lang.Object var6 = var3.clone();
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
    boolean var14 = var12.equals((java.lang.Object)1L);
    java.util.Locale var15 = var12.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15, var17);
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var15, var19);
    var3.setLocale(var15);
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var15, var22);
    java.util.Locale var25 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25);
    java.text.Format[] var27 = var26.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var23.setFormatsByArgumentIndex(var27);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test394"); }


    java.lang.Object[] var2 = new java.lang.Object[] { (-1)};
    org.apache.commons.lang.Validate.noNullElements(var2);
    org.apache.commons.lang.Validate.noNullElements(var2);
    java.lang.String var5 = java.text.MessageFormat.format("", var2);
    org.apache.commons.lang.Validate.noNullElements(var2, "");
    org.apache.commons.lang.Validate.notNull((java.lang.Object)"", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test395"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    java.text.Format[] var9 = var5.getFormatsByArgumentIndex();
    boolean var10 = var2.equals((java.lang.Object)var9);
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    java.text.Format[] var15 = var14.getFormats();
    java.lang.String var16 = var14.toPattern();
    java.lang.Object var17 = var14.clone();
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    boolean var25 = var23.equals((java.lang.Object)1L);
    java.util.Locale var26 = var23.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26);
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26, var28);
    java.util.Map var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var26, var30);
    var14.setLocale(var26);
    java.util.Map var33 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26, var33);
    var2.setLocale(var26);
    java.util.Locale var37 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var38 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var37);
    boolean var40 = var38.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var41 = var38.getLocale();
    var38.applyPattern("");
    var38.applyPattern("hi!");
    java.text.Format[] var46 = var38.getFormatsByArgumentIndex();
    java.text.AttributedCharacterIterator var47 = var2.formatToCharacterIterator((java.lang.Object)var46);
    java.util.Map var53 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var54 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var53);
    java.text.Format[] var55 = var54.getFormats();
    java.lang.String var56 = var54.toPattern();
    java.lang.Object var57 = var54.clone();
    java.util.Map var62 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var63 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var62);
    boolean var65 = var63.equals((java.lang.Object)1L);
    java.util.Locale var66 = var63.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var67 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var66);
    java.util.Map var68 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var69 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var66, var68);
    java.util.Map var70 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var71 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var66, var70);
    var54.setLocale(var66);
    java.util.Map var73 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var74 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var66, var73);
    org.apache.commons.lang.text.ExtendedMessageFormat var75 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var66);
    org.apache.commons.lang.text.ExtendedMessageFormat var76 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var66);
    java.text.Format[] var77 = var76.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat(0, (java.text.Format)var76);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + ""+ "'", var56.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);

  }

  public void test396() {}
//   public void test396() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test396"); }
// 
// 
//     java.util.Map var2 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
//     java.text.Format[] var4 = var3.getFormats();
//     java.lang.String var5 = var3.toPattern();
//     java.lang.Object var6 = var3.clone();
//     java.lang.String var7 = var3.toPattern();
//     java.util.Map var11 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
//     boolean var14 = var12.equals((java.lang.Object)1L);
//     java.util.Locale var15 = var12.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var15);
//     org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
//     var3.setLocale(var15);
//     org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
//     java.util.Locale var20 = var19.getLocale();
//     java.lang.Object var21 = null;
//     java.text.AttributedCharacterIterator var22 = var19.formatToCharacterIterator(var21);
// 
//   }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test397"); }


    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    java.text.Format[] var6 = var5.getFormats();
    java.lang.String var7 = java.text.MessageFormat.format("", (java.lang.Object[])var6);
    java.lang.String var8 = java.text.MessageFormat.format("", (java.lang.Object[])var6);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var6);
    java.lang.String var10 = java.text.MessageFormat.format("", (java.lang.Object[])var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test398"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.Object var4 = var2.clone();
    var2.applyPattern("");
    java.util.Map var8 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
    boolean var11 = var9.equals((java.lang.Object)1L);
    java.lang.Object var12 = var9.clone();
    java.text.Format[] var13 = var9.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var13);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test399"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.Object var4 = var2.clone();
    var2.applyPattern("hi!");
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    java.text.Format[] var12 = var11.getFormats();
    java.lang.String var13 = var11.toPattern();
    java.lang.Object var14 = var11.clone();
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19);
    boolean var22 = var20.equals((java.lang.Object)1L);
    java.util.Locale var23 = var20.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var23);
    java.util.Map var25 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var23, var25);
    java.util.Map var27 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var23, var27);
    var11.setLocale(var23);
    java.util.Map var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var23, var30);
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var23);
    java.lang.StringBuffer var33 = null;
    java.text.FieldPosition var34 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var35 = var2.format((java.lang.Object)var23, var33, var34);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test400() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test400"); }


    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    java.text.Format[] var6 = var5.getFormats();
    java.lang.String var7 = var5.toPattern();
    java.lang.Object var8 = var5.clone();
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    boolean var16 = var14.equals((java.lang.Object)1L);
    java.util.Locale var17 = var14.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17, var19);
    java.util.Map var21 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var17, var21);
    var5.setLocale(var17);
    java.util.Map var24 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var17, var24);
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var17);
    java.text.Format[] var28 = var27.getFormatsByArgumentIndex();
    java.util.Map var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var30);
    java.text.Format[] var32 = var31.getFormats();
    java.lang.String var33 = var31.toPattern();
    java.util.Locale var35 = null;
    java.util.Map var36 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var37 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var35, var36);
    boolean var38 = var31.equals((java.lang.Object)var35);
    var31.applyPattern("");
    java.lang.StringBuffer var41 = null;
    java.text.FieldPosition var42 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var43 = var27.format((java.lang.Object)"", var41, var42);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test401"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    java.text.Format[] var7 = var2.getFormats();
    java.util.Locale var8 = var2.getLocale();
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    java.text.Format[] var12 = var11.getFormats();
    java.text.Format[] var13 = var11.getFormats();
    java.lang.String var14 = var11.toPattern();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var15 = var2.format((java.lang.Object)var14);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test402"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var5 = var2.getLocale();
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    boolean var10 = var8.equals((java.lang.Object)1L);
    java.util.Locale var11 = var8.getLocale();
    java.text.Format[] var12 = var8.getFormatsByArgumentIndex();
    java.text.Format[] var13 = var8.getFormats();
    java.text.AttributedCharacterIterator var14 = var2.formatToCharacterIterator((java.lang.Object)var13);
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
    java.text.Format[] var20 = var19.getFormats();
    java.lang.String var21 = var19.toPattern();
    java.lang.Object var22 = var19.clone();
    java.util.Map var27 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27);
    boolean var30 = var28.equals((java.lang.Object)1L);
    java.util.Locale var31 = var28.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var31);
    java.util.Map var33 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var31, var33);
    java.util.Map var35 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var36 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var31, var35);
    var19.setLocale(var31);
    java.util.Map var38 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var39 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var31, var38);
    org.apache.commons.lang.text.ExtendedMessageFormat var40 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var31);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var40);
    boolean var42 = var2.equals((java.lang.Object)var40);
    java.util.Map var46 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var47 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var46);
    java.text.Format[] var48 = var47.getFormats();
    java.lang.String var49 = java.text.MessageFormat.format("", (java.lang.Object[])var48);
    java.lang.String var50 = java.text.MessageFormat.format("", (java.lang.Object[])var48);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var40.setFormats(var48);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + ""+ "'", var49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + ""+ "'", var50.equals(""));

  }

  public void test403() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test403"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.text.Format[] var3 = var2.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var5 = var2.parse("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test404"); }


    java.util.Locale var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    java.lang.Object var4 = var3.clone();
    java.lang.String var5 = var3.toPattern();
    java.text.Format[] var6 = var3.getFormats();
    java.lang.String var7 = java.text.MessageFormat.format("hi!", (java.lang.Object[])var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var6, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test405"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    java.lang.Object var5 = var2.clone();
    java.lang.String var6 = var2.toPattern();
    java.text.Format[] var7 = var2.getFormats();
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    boolean var13 = var11.equals((java.lang.Object)1L);
    java.util.Locale var14 = var11.getLocale();
    java.text.Format[] var15 = var11.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var15, "");
    java.lang.String var18 = java.text.MessageFormat.format("", (java.lang.Object[])var15);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var15);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test406() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test406"); }


    java.lang.Object[] var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty(var0, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test407() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test407"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    boolean var6 = var4.equals((java.lang.Object)1L);
    java.util.Locale var7 = var4.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7, var9);
    var10.applyPattern("hi!");
    java.util.Map var16 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    java.text.Format[] var18 = var17.getFormats();
    java.lang.String var19 = var17.toPattern();
    java.lang.Object var20 = var17.clone();
    java.util.Map var25 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25);
    boolean var28 = var26.equals((java.lang.Object)1L);
    java.util.Locale var29 = var26.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var29);
    java.util.Map var31 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var29, var31);
    java.util.Map var33 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var29, var33);
    var17.setLocale(var29);
    java.util.Map var36 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var37 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var29, var36);
    java.lang.Object var39 = var37.parseObject("hi!");
    java.lang.String var40 = var37.toPattern();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.setFormat((-1), (java.text.Format)var37);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));

  }

  public void test408() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test408"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    java.text.Format[] var9 = var5.getFormatsByArgumentIndex();
    boolean var10 = var2.equals((java.lang.Object)var9);
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    java.text.Format[] var15 = var14.getFormats();
    java.lang.String var16 = var14.toPattern();
    java.lang.Object var17 = var14.clone();
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    boolean var25 = var23.equals((java.lang.Object)1L);
    java.util.Locale var26 = var23.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26);
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26, var28);
    java.util.Map var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var26, var30);
    var14.setLocale(var26);
    java.util.Map var33 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26, var33);
    var2.setLocale(var26);
    java.lang.Object var37 = var2.parseObject("hi!");
    java.util.Map var40 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var41 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var40);
    java.text.Format[] var42 = var41.getFormats();
    java.lang.String var43 = java.text.MessageFormat.format("", (java.lang.Object[])var42);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var42);
    java.text.AttributedCharacterIterator var45 = var2.formatToCharacterIterator((java.lang.Object)var42);
    java.util.Map var48 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var49 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var48);
    java.util.Map var51 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var52 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var51);
    boolean var54 = var52.equals((java.lang.Object)1L);
    java.util.Locale var55 = var52.getLocale();
    java.text.Format[] var56 = var52.getFormatsByArgumentIndex();
    boolean var57 = var49.equals((java.lang.Object)var56);
    java.util.Map var60 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var61 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var60);
    java.text.Format[] var62 = var61.getFormats();
    java.lang.String var63 = var61.toPattern();
    java.lang.Object var64 = var61.clone();
    java.util.Map var69 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var70 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var69);
    boolean var72 = var70.equals((java.lang.Object)1L);
    java.util.Locale var73 = var70.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var74 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var73);
    java.util.Map var75 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var76 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var73, var75);
    java.util.Map var77 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var78 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var73, var77);
    var61.setLocale(var73);
    java.util.Map var80 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var81 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var73, var80);
    var49.setLocale(var73);
    java.lang.Object var84 = var49.parseObject("hi!");
    java.util.Map var87 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var88 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var87);
    java.text.Format[] var89 = var88.getFormats();
    java.lang.String var90 = java.text.MessageFormat.format("", (java.lang.Object[])var89);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var89);
    java.text.AttributedCharacterIterator var92 = var49.formatToCharacterIterator((java.lang.Object)var89);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(10, (java.text.Format)var49);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + ""+ "'", var63.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var90 + "' != '" + ""+ "'", var90.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);

  }

  public void test409() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test409"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    boolean var9 = var7.equals((java.lang.Object)1L);
    java.util.Locale var10 = var7.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    var2.setLocale(var10);
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var14);
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
    boolean var20 = var18.equals((java.lang.Object)1L);
    java.util.Locale var21 = var18.getLocale();
    java.text.Format[] var22 = var18.getFormatsByArgumentIndex();
    boolean var23 = var15.equals((java.lang.Object)var22);
    java.lang.String var24 = var2.format((java.lang.Object)var22);
    java.lang.String var25 = var2.toPattern();
    java.util.Locale var26 = var2.getLocale();
    java.text.Format[] var27 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var27);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test410() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test410"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var5 = var2.getLocale();
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    boolean var12 = var10.equals((java.lang.Object)1L);
    java.util.Locale var13 = var10.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13, var15);
    var2.setLocale(var13);
    java.lang.Object var18 = var2.clone();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var2, "");
    java.lang.String var21 = var2.toPattern();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test411() {}
//   public void test411() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test411"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
//     boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
//     java.util.Locale var5 = var2.getLocale();
//     java.text.ParsePosition var7 = null;
//     java.lang.Object var8 = var2.parseObject("", var7);
// 
//   }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test412"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "", 100L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test413() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test413"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "", (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test414() {}
//   public void test414() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test414"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     var2.applyPattern("");
//     org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
//     java.lang.Object[] var9 = new java.lang.Object[] { (-1)};
//     org.apache.commons.lang.Validate.noNullElements(var9);
//     java.lang.String var11 = java.text.MessageFormat.format("hi!", var9);
//     org.apache.commons.lang.Validate.noNullElements(var9);
//     org.apache.commons.lang.Validate.notEmpty(var9);
//     org.apache.commons.lang.Validate.noNullElements(var9, "");
//     java.lang.StringBuffer var16 = null;
//     java.text.FieldPosition var17 = null;
//     java.lang.StringBuffer var18 = var2.format(var9, var16, var17);
// 
//   }

  public void test415() {}
//   public void test415() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test415"); }
// 
// 
//     java.util.Locale var2 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var2);
//     boolean var5 = var3.equals((java.lang.Object)(byte)(-1));
//     java.util.Locale var6 = var3.getLocale();
//     java.util.Map var8 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
//     boolean var11 = var9.equals((java.lang.Object)1L);
//     java.util.Locale var12 = var9.getLocale();
//     java.text.Format[] var13 = var9.getFormatsByArgumentIndex();
//     java.text.Format[] var14 = var9.getFormats();
//     java.text.AttributedCharacterIterator var15 = var3.formatToCharacterIterator((java.lang.Object)var14);
//     java.util.Map var21 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var21);
//     boolean var24 = var22.equals((java.lang.Object)1L);
//     java.util.Locale var25 = var22.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25);
//     java.util.Map var27 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25, var27);
//     java.util.Map var29 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var25, var29);
//     java.util.Map var31 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var25, var31);
//     var3.setLocale(var25);
//     java.util.Map var35 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var36 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var35);
//     boolean var38 = var36.equals((java.lang.Object)1L);
//     java.util.Locale var39 = var36.getLocale();
//     java.text.Format[] var40 = var36.getFormatsByArgumentIndex();
//     java.text.Format[] var41 = var36.getFormats();
//     org.apache.commons.lang.Validate.notNull((java.lang.Object)var36);
//     java.util.Locale var44 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var45 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var44);
//     boolean var47 = var45.equals((java.lang.Object)(byte)(-1));
//     java.util.Locale var48 = var45.getLocale();
//     java.util.Map var52 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var53 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var52);
//     boolean var55 = var53.equals((java.lang.Object)1L);
//     java.util.Locale var56 = var53.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var57 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var56);
//     java.util.Map var58 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var59 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var56, var58);
//     var45.setLocale(var56);
//     var36.setLocale(var56);
//     var3.setLocale(var56);
//     org.apache.commons.lang.text.ExtendedMessageFormat var63 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var56);
//     java.lang.Object var64 = var63.clone();
//     java.text.ParsePosition var66 = null;
//     java.lang.Object var67 = var63.parseObject("", var66);
// 
//   }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test416"); }


    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    boolean var8 = var6.equals((java.lang.Object)1L);
    java.util.Locale var9 = var6.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9, var11);
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9, var13);
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9, var15);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var16);
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19);
    boolean var21 = var16.equals((java.lang.Object)var20);
    var16.applyPattern("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var25 = var16.parseObject("hi!");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test417() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test417"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    java.lang.Object var5 = var2.clone();
    java.lang.String var6 = var2.toPattern();
    java.text.Format[] var7 = var2.getFormats();
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    boolean var13 = var11.equals((java.lang.Object)1L);
    java.lang.Object var14 = var11.clone();
    var11.applyPattern("");
    java.text.Format[] var17 = var11.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat(10, (java.text.Format)var11);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test418() {}
//   public void test418() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test418"); }
// 
// 
//     java.util.Map var3 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
//     java.text.Format[] var5 = var4.getFormats();
//     java.lang.String var6 = var4.toPattern();
//     java.lang.Object var7 = var4.clone();
//     java.util.Map var12 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
//     boolean var15 = var13.equals((java.lang.Object)1L);
//     java.util.Locale var16 = var13.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
//     java.util.Map var18 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16, var18);
//     java.util.Map var20 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var20);
//     var4.setLocale(var16);
//     java.util.Map var23 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var23);
//     org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
//     var25.applyPattern("hi!");
//     java.util.Map var31 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var31);
//     boolean var34 = var32.equals((java.lang.Object)1L);
//     java.util.Locale var35 = var32.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var36 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var35);
//     org.apache.commons.lang.text.ExtendedMessageFormat var37 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var35);
//     var25.setLocale(var35);
//     java.text.ParsePosition var40 = null;
//     java.lang.Object[] var41 = var25.parse("", var40);
// 
//   }

  public void test419() {}
//   public void test419() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test419"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.lang.String var4 = var2.toPattern();
//     java.util.Locale var6 = null;
//     java.util.Map var7 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6, var7);
//     boolean var9 = var2.equals((java.lang.Object)var6);
//     java.text.Format[] var10 = var2.getFormatsByArgumentIndex();
//     java.lang.Object[] var12 = new java.lang.Object[] { "hi!"};
//     org.apache.commons.lang.Validate.noNullElements(var12);
//     org.apache.commons.lang.Validate.noNullElements(var12);
//     org.apache.commons.lang.Validate.notEmpty(var12);
//     java.lang.StringBuffer var16 = null;
//     java.text.FieldPosition var17 = null;
//     java.lang.StringBuffer var18 = var2.format((java.lang.Object)var12, var16, var17);
// 
//   }

  public void test420() {}
//   public void test420() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test420"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.util.Map var6 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
//     boolean var9 = var7.equals((java.lang.Object)1L);
//     java.util.Locale var10 = var7.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
//     var2.setLocale(var10);
//     java.util.Map var15 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
//     boolean var18 = var16.equals((java.lang.Object)1L);
//     java.util.Locale var19 = var16.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19);
//     java.util.Map var22 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
//     java.text.Format[] var24 = var23.getFormats();
//     java.util.Map var27 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27);
//     boolean var30 = var28.equals((java.lang.Object)1L);
//     java.util.Locale var31 = var28.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var31);
//     var23.setLocale(var31);
//     var20.setLocale(var31);
//     java.util.Locale var35 = var20.getLocale();
//     boolean var36 = var2.equals((java.lang.Object)var20);
//     java.lang.Object[] var39 = new java.lang.Object[] { (-1)};
//     org.apache.commons.lang.Validate.noNullElements(var39);
//     java.lang.String var41 = java.text.MessageFormat.format("hi!", var39);
//     org.apache.commons.lang.Validate.noNullElements(var39);
//     org.apache.commons.lang.Validate.noNullElements(var39, "hi!");
//     org.apache.commons.lang.Validate.notEmpty(var39);
//     org.apache.commons.lang.Validate.notEmpty(var39, "hi!");
//     java.lang.StringBuffer var48 = null;
//     java.text.FieldPosition var49 = null;
//     java.lang.StringBuffer var50 = var2.format((java.lang.Object)var39, var48, var49);
// 
//   }

  public void test421() {}
//   public void test421() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test421"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     var2.applyPattern("");
//     java.util.Map var9 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9);
//     java.util.Map var12 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
//     boolean var15 = var13.equals((java.lang.Object)1L);
//     java.util.Locale var16 = var13.getLocale();
//     java.text.Format[] var17 = var13.getFormatsByArgumentIndex();
//     boolean var18 = var10.equals((java.lang.Object)var17);
//     java.text.Format[] var19 = var10.getFormatsByArgumentIndex();
//     java.lang.String var20 = java.text.MessageFormat.format("", (java.lang.Object[])var19);
//     java.lang.String var21 = java.text.MessageFormat.format("", (java.lang.Object[])var19);
//     java.lang.StringBuffer var22 = null;
//     java.text.FieldPosition var23 = null;
//     java.lang.StringBuffer var24 = var2.format((java.lang.Object[])var19, var22, var23);
// 
//   }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test422"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    java.text.Format[] var9 = var5.getFormatsByArgumentIndex();
    boolean var10 = var2.equals((java.lang.Object)var9);
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    java.text.Format[] var15 = var14.getFormats();
    java.lang.String var16 = var14.toPattern();
    java.lang.Object var17 = var14.clone();
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    boolean var25 = var23.equals((java.lang.Object)1L);
    java.util.Locale var26 = var23.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26);
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26, var28);
    java.util.Map var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var26, var30);
    var14.setLocale(var26);
    java.util.Map var33 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26, var33);
    var2.setLocale(var26);
    java.util.Locale var37 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var38 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var37);
    boolean var40 = var38.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var41 = var38.getLocale();
    var38.applyPattern("");
    var38.applyPattern("hi!");
    java.text.Format[] var46 = var38.getFormatsByArgumentIndex();
    java.text.AttributedCharacterIterator var47 = var2.formatToCharacterIterator((java.lang.Object)var46);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var47, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test423() {}
//   public void test423() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test423"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     boolean var4 = var2.equals((java.lang.Object)1L);
//     java.lang.Object var5 = var2.clone();
//     java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
//     java.text.Format[] var7 = var2.getFormats();
//     java.text.ParsePosition var9 = null;
//     java.lang.Object var10 = var2.parseObject("", var9);
// 
//   }

  public void test424() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test424"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    java.text.Format[] var5 = var4.getFormats();
    java.lang.String var6 = var4.toPattern();
    java.lang.Object var7 = var4.clone();
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    boolean var15 = var13.equals((java.lang.Object)1L);
    java.util.Locale var16 = var13.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16, var18);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var20);
    var4.setLocale(var16);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var23);
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    java.util.Map var27 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27);
    boolean var30 = var28.equals((java.lang.Object)1L);
    java.util.Locale var31 = var28.getLocale();
    java.text.Format[] var32 = var28.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var32, "");
    boolean var35 = var25.equals((java.lang.Object)var32);
    java.lang.String var36 = var25.toPattern();
    java.util.Map var39 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var40 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var39);
    java.text.Format[] var41 = var40.getFormats();
    var40.applyPattern("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var25.setFormatByArgumentIndex((-1), (java.text.Format)var40);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test425"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    var2.applyPattern("");
    var2.applyPattern("");
    java.util.Locale var8 = var2.getLocale();
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var10);
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    boolean var16 = var14.equals((java.lang.Object)1L);
    java.util.Locale var17 = var14.getLocale();
    java.text.Format[] var18 = var14.getFormatsByArgumentIndex();
    boolean var19 = var11.equals((java.lang.Object)var18);
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    java.text.Format[] var24 = var23.getFormats();
    java.lang.String var25 = var23.toPattern();
    java.lang.Object var26 = var23.clone();
    java.util.Map var31 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var31);
    boolean var34 = var32.equals((java.lang.Object)1L);
    java.util.Locale var35 = var32.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var36 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var35);
    java.util.Map var37 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var38 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var35, var37);
    java.util.Map var39 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var40 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var35, var39);
    var23.setLocale(var35);
    java.util.Map var42 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var43 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var35, var42);
    var11.setLocale(var35);
    java.lang.Object var46 = var11.parseObject("hi!");
    java.lang.StringBuffer var47 = null;
    java.text.FieldPosition var48 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var49 = var2.format((java.lang.Object)var11, var47, var48);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test426() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test426"); }


    java.util.Locale var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var2);
    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    boolean var8 = var6.equals((java.lang.Object)1L);
    java.util.Locale var9 = var6.getLocale();
    var3.setLocale(var9);
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.lang.Object var12 = var11.clone();
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14);
    boolean var17 = var15.equals((java.lang.Object)1L);
    java.util.Locale var18 = var15.getLocale();
    java.text.Format[] var19 = var15.getFormatsByArgumentIndex();
    java.text.Format[] var20 = var15.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var20);
    java.text.AttributedCharacterIterator var22 = var11.formatToCharacterIterator((java.lang.Object)var20);
    java.util.Locale var23 = var11.getLocale();
    org.apache.commons.lang.Validate var24 = new org.apache.commons.lang.Validate();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var24, "hi!");
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var24, "");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var29 = var11.format((java.lang.Object)var24);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test427"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    boolean var6 = var4.equals((java.lang.Object)1L);
    java.util.Locale var7 = var4.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7, var9);
    var10.applyPattern("hi!");
    java.util.Locale var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var14);
    java.text.Format[] var16 = var15.getFormatsByArgumentIndex();
    java.text.Format[] var17 = var15.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.setFormats(var17);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test428() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test428"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.lang.Object var5 = var2.clone();
    var2.applyPattern("");
    java.text.Format[] var8 = var2.getFormats();
    java.util.Locale var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var12);
    java.text.Format[] var14 = var13.getFormats();
    org.apache.commons.lang.Validate.isTrue(true, "", (java.lang.Object)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var14);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test429() {}
//   public void test429() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test429"); }
// 
// 
//     org.apache.commons.lang.text.ExtendedMessageFormat var1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
//     java.util.Map var4 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
//     java.text.Format[] var6 = var5.getFormats();
//     java.lang.String var7 = var5.toPattern();
//     java.util.Locale var9 = null;
//     java.util.Map var10 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9, var10);
//     boolean var12 = var5.equals((java.lang.Object)var9);
//     var5.applyPattern("");
//     java.text.Format[] var15 = var5.getFormats();
//     java.lang.String var16 = java.text.MessageFormat.format("", (java.lang.Object[])var15);
//     java.lang.StringBuffer var17 = null;
//     java.text.FieldPosition var18 = null;
//     java.lang.StringBuffer var19 = var1.format((java.lang.Object[])var15, var17, var18);
// 
//   }

  public void test430() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test430"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    java.text.Format[] var7 = var2.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
    var2.applyPattern("");
    java.text.Format[] var11 = var2.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test431() {}
//   public void test431() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test431"); }
// 
// 
//     java.util.Map var3 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
//     boolean var6 = var4.equals((java.lang.Object)1L);
//     java.util.Locale var7 = var4.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7);
//     java.util.Map var9 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7, var9);
//     java.util.Map var12 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
//     boolean var15 = var13.equals((java.lang.Object)1L);
//     java.util.Locale var16 = var13.getLocale();
//     java.text.Format[] var17 = var13.getFormatsByArgumentIndex();
//     java.text.Format[] var18 = var13.getFormats();
//     java.text.AttributedCharacterIterator var19 = var10.formatToCharacterIterator((java.lang.Object)var18);
//     java.text.ParsePosition var21 = null;
//     java.lang.Object var22 = var10.parseObject("", var21);
// 
//   }

  public void test432() {}
//   public void test432() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test432"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.lang.Object var3 = var2.clone();
//     java.lang.String var4 = var2.toPattern();
//     java.text.Format[] var5 = var2.getFormats();
//     java.util.Map var7 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
//     java.text.Format[] var9 = var8.getFormats();
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var9, "");
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var9, "hi!");
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var9, "hi!");
//     java.text.AttributedCharacterIterator var16 = var2.formatToCharacterIterator((java.lang.Object)var9);
//     java.text.ParsePosition var18 = null;
//     java.lang.Object var19 = var2.parseObject("", var18);
// 
//   }

  public void test433() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test433"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    boolean var6 = var4.equals((java.lang.Object)1L);
    java.util.Locale var7 = var4.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7);
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var9);
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var12);
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    boolean var18 = var16.equals((java.lang.Object)1L);
    java.util.Locale var19 = var16.getLocale();
    java.text.Format[] var20 = var16.getFormatsByArgumentIndex();
    boolean var21 = var13.equals((java.lang.Object)var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.setFormats(var20);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test434() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test434"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var5 = var2.getLocale();
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    boolean var10 = var8.equals((java.lang.Object)1L);
    java.util.Locale var11 = var8.getLocale();
    java.text.Format[] var12 = var8.getFormatsByArgumentIndex();
    java.text.Format[] var13 = var8.getFormats();
    java.text.AttributedCharacterIterator var14 = var2.formatToCharacterIterator((java.lang.Object)var13);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var20);
    boolean var23 = var21.equals((java.lang.Object)1L);
    java.util.Locale var24 = var21.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24);
    java.util.Map var26 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24, var26);
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var24, var28);
    java.util.Map var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var24, var30);
    var2.setLocale(var24);
    java.lang.Object var33 = var2.clone();
    java.util.Map var35 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var36 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var35);
    boolean var38 = var36.equals((java.lang.Object)1L);
    java.lang.Object var39 = var36.clone();
    java.text.Format[] var40 = var36.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var40);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test435() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test435"); }


    org.apache.commons.lang.Validate.notNull((java.lang.Object)(-1.0f));

  }

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test436"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    java.text.Format[] var9 = var5.getFormatsByArgumentIndex();
    boolean var10 = var2.equals((java.lang.Object)var9);
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    java.text.Format[] var15 = var14.getFormats();
    java.lang.String var16 = var14.toPattern();
    java.lang.Object var17 = var14.clone();
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    boolean var25 = var23.equals((java.lang.Object)1L);
    java.util.Locale var26 = var23.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26);
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26, var28);
    java.util.Map var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var26, var30);
    var14.setLocale(var26);
    java.util.Map var33 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26, var33);
    var2.setLocale(var26);
    java.lang.Object var37 = var2.parseObject("hi!");
    java.util.Map var39 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var40 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var39);
    java.text.Format[] var41 = var40.getFormats();
    java.text.Format[] var42 = var40.getFormats();
    java.text.Format[] var43 = var40.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var43);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test437() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test437"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    java.text.Format[] var9 = var5.getFormatsByArgumentIndex();
    boolean var10 = var2.equals((java.lang.Object)var9);
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    java.text.Format[] var15 = var14.getFormats();
    java.lang.String var16 = var14.toPattern();
    java.lang.Object var17 = var14.clone();
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    boolean var25 = var23.equals((java.lang.Object)1L);
    java.util.Locale var26 = var23.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26);
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26, var28);
    java.util.Map var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var26, var30);
    var14.setLocale(var26);
    java.util.Map var33 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26, var33);
    var2.setLocale(var26);
    java.lang.Object var37 = var2.parseObject("hi!");
    java.util.Map var40 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var41 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var40);
    java.text.Format[] var42 = var41.getFormats();
    java.lang.String var43 = java.text.MessageFormat.format("", (java.lang.Object[])var42);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var42);
    java.text.AttributedCharacterIterator var45 = var2.formatToCharacterIterator((java.lang.Object)var42);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var42);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test438"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    java.util.Locale var6 = null;
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6, var7);
    boolean var9 = var2.equals((java.lang.Object)var6);
    java.text.Format[] var10 = var2.getFormatsByArgumentIndex();
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    java.text.Format[] var14 = var13.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var14, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var14, "hi!");
    java.text.AttributedCharacterIterator var19 = var2.formatToCharacterIterator((java.lang.Object)var14);
    java.util.Locale var20 = var2.getLocale();
    java.util.Map var24 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24);
    java.text.Format[] var26 = var25.getFormats();
    java.lang.String var27 = java.text.MessageFormat.format("", (java.lang.Object[])var26);
    java.lang.String var28 = java.text.MessageFormat.format("", (java.lang.Object[])var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var26);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));

  }

  public void test439() {}
//   public void test439() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test439"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.lang.String var4 = var2.toPattern();
//     java.util.Locale var6 = null;
//     java.util.Map var7 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6, var7);
//     boolean var9 = var2.equals((java.lang.Object)var6);
//     var2.applyPattern("");
//     java.text.Format[] var12 = var2.getFormats();
//     java.text.ParsePosition var14 = null;
//     java.lang.Object var15 = var2.parseObject("hi!", var14);
// 
//   }

  public void test440() {}
//   public void test440() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test440"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
//     java.util.Map var4 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
//     boolean var7 = var5.equals((java.lang.Object)1L);
//     java.util.Locale var8 = var5.getLocale();
//     java.text.Format[] var9 = var5.getFormatsByArgumentIndex();
//     boolean var10 = var2.equals((java.lang.Object)var9);
//     java.util.Map var13 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
//     java.text.Format[] var15 = var14.getFormats();
//     java.lang.String var16 = var14.toPattern();
//     java.lang.Object var17 = var14.clone();
//     java.util.Map var22 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
//     boolean var25 = var23.equals((java.lang.Object)1L);
//     java.util.Locale var26 = var23.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26);
//     java.util.Map var28 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26, var28);
//     java.util.Map var30 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var26, var30);
//     var14.setLocale(var26);
//     java.util.Map var33 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26, var33);
//     var2.setLocale(var26);
//     java.lang.Object var37 = var2.parseObject("hi!");
//     java.util.Map var40 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var41 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var40);
//     java.text.Format[] var42 = var41.getFormats();
//     java.lang.String var43 = java.text.MessageFormat.format("", (java.lang.Object[])var42);
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var42);
//     java.text.AttributedCharacterIterator var45 = var2.formatToCharacterIterator((java.lang.Object)var42);
//     java.lang.Object var46 = var2.clone();
//     java.util.Locale var47 = var2.getLocale();
//     java.text.ParsePosition var49 = null;
//     java.lang.Object[] var50 = var2.parse("", var49);
// 
//   }

  public void test441() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test441"); }


    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    java.text.Format[] var6 = var5.getFormats();
    java.lang.String var7 = var5.toPattern();
    java.lang.Object var8 = var5.clone();
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    boolean var16 = var14.equals((java.lang.Object)1L);
    java.util.Locale var17 = var14.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17, var19);
    java.util.Map var21 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var17, var21);
    var5.setLocale(var17);
    java.util.Map var24 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var17, var24);
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var17);
    java.util.Locale var29 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var29);
    boolean var32 = var30.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var33 = var30.getLocale();
    var30.applyPattern("");
    var30.applyPattern("hi!");
    java.text.Format[] var38 = var30.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var38, "");
    boolean var41 = var27.equals((java.lang.Object)"");
    java.util.Map var44 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var45 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var44);
    java.util.Map var47 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var48 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var47);
    boolean var50 = var48.equals((java.lang.Object)1L);
    java.util.Locale var51 = var48.getLocale();
    java.text.Format[] var52 = var48.getFormatsByArgumentIndex();
    boolean var53 = var45.equals((java.lang.Object)var52);
    java.lang.Object var54 = var45.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var27.setFormat(100, (java.text.Format)var45);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test442() {}
//   public void test442() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test442"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.lang.String var4 = var2.toPattern();
//     java.util.Locale var6 = null;
//     java.util.Map var7 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6, var7);
//     boolean var9 = var2.equals((java.lang.Object)var6);
//     java.lang.Object[] var11 = new java.lang.Object[] { (-1)};
//     org.apache.commons.lang.Validate.noNullElements(var11);
//     org.apache.commons.lang.Validate.noNullElements(var11);
//     java.lang.StringBuffer var14 = null;
//     java.text.FieldPosition var15 = null;
//     java.lang.StringBuffer var16 = var2.format((java.lang.Object)var11, var14, var15);
// 
//   }

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test443"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.Object var4 = var2.clone();
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.text.Format[] var11 = var10.getFormats();
    java.lang.String var12 = var10.toPattern();
    java.lang.Object var13 = var10.clone();
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
    boolean var21 = var19.equals((java.lang.Object)1L);
    java.util.Locale var22 = var19.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    java.util.Map var24 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22, var24);
    java.util.Map var26 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var22, var26);
    var10.setLocale(var22);
    java.util.Map var29 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var22, var29);
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var31);
    java.util.Map var34 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var35 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var34);
    java.text.Format[] var36 = var35.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var36, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var36, "hi!");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var36, "hi!");
    boolean var43 = var31.equals((java.lang.Object)var36);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat(0, (java.text.Format)var31);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);

  }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test444"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    boolean var9 = var7.equals((java.lang.Object)1L);
    java.util.Locale var10 = var7.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    var2.setLocale(var10);
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var14);
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
    boolean var20 = var18.equals((java.lang.Object)1L);
    java.util.Locale var21 = var18.getLocale();
    java.text.Format[] var22 = var18.getFormatsByArgumentIndex();
    boolean var23 = var15.equals((java.lang.Object)var22);
    java.lang.String var24 = var2.format((java.lang.Object)var22);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var22, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));

  }

  public void test445() {}
//   public void test445() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test445"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     var2.applyPattern("");
//     var2.applyPattern("");
//     java.util.Locale var9 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
//     java.text.Format[] var11 = var10.getFormats();
//     java.lang.StringBuffer var12 = null;
//     java.text.FieldPosition var13 = null;
//     java.lang.StringBuffer var14 = var2.format((java.lang.Object[])var11, var12, var13);
// 
//   }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test446"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.text.Format[] var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var4);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test447() {}
//   public void test447() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test447"); }
// 
// 
//     java.util.Map var2 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
//     java.text.Format[] var4 = var3.getFormats();
//     java.lang.String var5 = var3.toPattern();
//     java.lang.Object var6 = var3.clone();
//     java.util.Map var11 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
//     boolean var14 = var12.equals((java.lang.Object)1L);
//     java.util.Locale var15 = var12.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
//     java.util.Map var17 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15, var17);
//     java.util.Map var19 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var15, var19);
//     var3.setLocale(var15);
//     java.util.Map var22 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var15, var22);
//     java.lang.Object var25 = var23.parseObject("hi!");
//     java.lang.String var26 = var23.toPattern();
//     java.text.ParsePosition var28 = null;
//     java.lang.Object var29 = var23.parseObject("", var28);
// 
//   }

  public void test448() {}
//   public void test448() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test448"); }
// 
// 
//     java.util.Map var4 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
//     java.text.Format[] var6 = var5.getFormats();
//     java.lang.String var7 = var5.toPattern();
//     java.lang.Object var8 = var5.clone();
//     java.util.Map var13 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
//     boolean var16 = var14.equals((java.lang.Object)1L);
//     java.util.Locale var17 = var14.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
//     java.util.Map var19 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17, var19);
//     java.util.Map var21 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var17, var21);
//     var5.setLocale(var17);
//     java.util.Map var24 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var17, var24);
//     org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
//     org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var17);
//     java.text.Format[] var28 = var27.getFormatsByArgumentIndex();
//     java.text.ParsePosition var30 = null;
//     java.lang.Object[] var31 = var27.parse("hi!", var30);
// 
//   }

  public void test449() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test449"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    var2.applyPattern("");
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
    java.text.Format[] var8 = var7.getFormatsByArgumentIndex();
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    java.text.Format[] var12 = var11.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var12, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var12);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var12);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var12);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var12);
    boolean var19 = var7.equals((java.lang.Object)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var12);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test450"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    java.util.Locale var6 = null;
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6, var7);
    boolean var9 = var2.equals((java.lang.Object)var6);
    var2.applyPattern("");
    java.util.Map var16 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    java.text.Format[] var18 = var17.getFormats();
    java.lang.String var19 = var17.toPattern();
    java.lang.Object var20 = var17.clone();
    java.util.Map var25 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25);
    boolean var28 = var26.equals((java.lang.Object)1L);
    java.util.Locale var29 = var26.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var29);
    java.util.Map var31 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var29, var31);
    java.util.Map var33 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var29, var33);
    var17.setLocale(var29);
    java.util.Map var36 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var37 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var29, var36);
    org.apache.commons.lang.text.ExtendedMessageFormat var38 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var29);
    org.apache.commons.lang.text.ExtendedMessageFormat var39 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var40 = var2.formatToCharacterIterator((java.lang.Object)var39);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test451() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test451"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    var2.applyPattern("");
    var2.applyPattern("");
    java.util.Locale var8 = var2.getLocale();
    java.text.Format[] var9 = var2.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var11 = var2.formatToCharacterIterator((java.lang.Object)"");
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test452() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test452"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    java.text.Format[] var7 = var2.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
    java.util.Locale var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var10);
    boolean var13 = var11.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var14 = var11.getLocale();
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
    boolean var21 = var19.equals((java.lang.Object)1L);
    java.util.Locale var22 = var19.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    java.util.Map var24 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22, var24);
    var11.setLocale(var22);
    var2.setLocale(var22);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var2, "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var31 = var2.parseObject("hi!");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test453() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test453"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    boolean var6 = var4.equals((java.lang.Object)1L);
    java.util.Locale var7 = var4.getLocale();
    java.text.Format[] var8 = var4.getFormatsByArgumentIndex();
    java.text.Format[] var9 = var4.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "hi!", (java.lang.Object)var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test454() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test454"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.text.Format[] var3 = var2.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test455"); }


    org.apache.commons.lang.Validate.isTrue(true, "hi!", 10L);

  }

  public void test456() {}
//   public void test456() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test456"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.util.Map var6 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
//     boolean var9 = var7.equals((java.lang.Object)1L);
//     java.util.Locale var10 = var7.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
//     var2.setLocale(var10);
//     java.util.Map var14 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var14);
//     java.util.Map var17 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
//     boolean var20 = var18.equals((java.lang.Object)1L);
//     java.util.Locale var21 = var18.getLocale();
//     java.text.Format[] var22 = var18.getFormatsByArgumentIndex();
//     boolean var23 = var15.equals((java.lang.Object)var22);
//     java.lang.String var24 = var2.format((java.lang.Object)var22);
//     java.lang.Object var25 = var2.clone();
//     java.text.ParsePosition var27 = null;
//     java.lang.Object[] var28 = var2.parse("", var27);
// 
//   }

  public void test457() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test457"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.Object var4 = var2.clone();
    var2.applyPattern("");
    java.text.Format[] var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var7);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test458() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test458"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    boolean var5 = var3.equals((java.lang.Object)1L);
    java.util.Locale var6 = var3.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var6);
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.text.Format[] var11 = var10.getFormats();
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14);
    boolean var17 = var15.equals((java.lang.Object)1L);
    java.util.Locale var18 = var15.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
    var10.setLocale(var18);
    var7.setLocale(var18);
    java.util.Locale var22 = var7.getLocale();
    java.text.Format[] var23 = var7.getFormatsByArgumentIndex();
    java.text.Format[] var24 = var7.getFormatsByArgumentIndex();
    java.util.Map var27 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27);
    java.text.Format[] var29 = var28.getFormats();
    java.lang.String var30 = var28.toPattern();
    java.text.Format[] var31 = var28.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.setFormatByArgumentIndex(100, (java.text.Format)var28);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test459() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test459"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.Object var4 = var2.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var2.parseObject("hi!");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test460() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test460"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    java.text.Format[] var4 = var3.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var4, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var4);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var4);
    java.lang.String var9 = java.text.MessageFormat.format("", (java.lang.Object[])var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var4, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test461() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test461"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    boolean var9 = var7.equals((java.lang.Object)1L);
    java.util.Locale var10 = var7.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    var2.setLocale(var10);
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var14);
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
    boolean var20 = var18.equals((java.lang.Object)1L);
    java.util.Locale var21 = var18.getLocale();
    java.text.Format[] var22 = var18.getFormatsByArgumentIndex();
    boolean var23 = var15.equals((java.lang.Object)var22);
    java.lang.String var24 = var2.format((java.lang.Object)var22);
    java.lang.Object var25 = var2.clone();
    java.util.Locale var27 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var27);
    boolean var30 = var28.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var31 = var28.getLocale();
    java.util.Map var33 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var33);
    boolean var36 = var34.equals((java.lang.Object)1L);
    java.util.Locale var37 = var34.getLocale();
    java.text.Format[] var38 = var34.getFormatsByArgumentIndex();
    java.text.Format[] var39 = var34.getFormats();
    java.text.AttributedCharacterIterator var40 = var28.formatToCharacterIterator((java.lang.Object)var39);
    java.util.Map var46 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var47 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var46);
    boolean var49 = var47.equals((java.lang.Object)1L);
    java.util.Locale var50 = var47.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var51 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var50);
    java.util.Map var52 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var53 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var50, var52);
    java.util.Map var54 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var55 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var50, var54);
    java.util.Map var56 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var57 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var50, var56);
    var28.setLocale(var50);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var59 = var2.formatToCharacterIterator((java.lang.Object)var28);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test462() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test462"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    boolean var9 = var7.equals((java.lang.Object)1L);
    java.util.Locale var10 = var7.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    var2.setLocale(var10);
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var14);
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
    boolean var20 = var18.equals((java.lang.Object)1L);
    java.util.Locale var21 = var18.getLocale();
    java.text.Format[] var22 = var18.getFormatsByArgumentIndex();
    boolean var23 = var15.equals((java.lang.Object)var22);
    java.lang.String var24 = var2.format((java.lang.Object)var22);
    java.lang.String var25 = var2.toPattern();
    java.util.Locale var29 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var29);
    boolean var32 = var30.equals((java.lang.Object)(byte)(-1));
    java.util.Map var38 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var39 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var38);
    boolean var41 = var39.equals((java.lang.Object)1L);
    java.util.Locale var42 = var39.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var43 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var42);
    java.util.Map var44 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var45 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var42, var44);
    java.util.Map var46 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var47 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var42, var46);
    org.apache.commons.lang.text.ExtendedMessageFormat var48 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var42);
    var30.setLocale(var42);
    org.apache.commons.lang.text.ExtendedMessageFormat var50 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var42);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(10, (java.text.Format)var50);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test463() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test463"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.lang.Object var3 = var2.clone();
    java.util.Locale var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var6);
    boolean var9 = var7.equals((java.lang.Object)(byte)(-1));
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    java.text.Format[] var15 = var14.getFormats();
    java.lang.String var16 = var14.toPattern();
    java.lang.Object var17 = var14.clone();
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    boolean var25 = var23.equals((java.lang.Object)1L);
    java.util.Locale var26 = var23.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26);
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26, var28);
    java.util.Map var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var26, var30);
    var14.setLocale(var26);
    java.util.Map var33 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var26, var33);
    org.apache.commons.lang.text.ExtendedMessageFormat var35 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26);
    var7.setLocale(var26);
    java.util.Map var39 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var40 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var39);
    boolean var42 = var40.equals((java.lang.Object)1L);
    java.util.Locale var43 = var40.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var44 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var43);
    java.util.Map var46 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var47 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var46);
    java.text.Format[] var48 = var47.getFormats();
    java.util.Map var51 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var52 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var51);
    boolean var54 = var52.equals((java.lang.Object)1L);
    java.util.Locale var55 = var52.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var56 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var55);
    var47.setLocale(var55);
    var44.setLocale(var55);
    java.util.Locale var59 = var44.getLocale();
    boolean var60 = var7.equals((java.lang.Object)var44);
    java.lang.Object var61 = null;
    boolean var62 = var7.equals(var61);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(10, (java.text.Format)var7);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);

  }

  public void test464() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test464"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    var2.setLocale(var8);
    java.lang.Object var10 = var2.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var2.parseObject("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test465() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test465"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    java.text.Format[] var5 = var4.getFormats();
    java.lang.String var6 = var4.toPattern();
    java.lang.Object var7 = var4.clone();
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    boolean var15 = var13.equals((java.lang.Object)1L);
    java.util.Locale var16 = var13.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16, var18);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var20);
    var4.setLocale(var16);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var23);
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    java.util.Map var27 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27);
    boolean var30 = var28.equals((java.lang.Object)1L);
    java.util.Locale var31 = var28.getLocale();
    java.text.Format[] var32 = var28.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var32, "");
    boolean var35 = var25.equals((java.lang.Object)var32);
    java.lang.String var36 = var25.toPattern();
    java.util.Map var41 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var42 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var41);
    boolean var44 = var42.equals((java.lang.Object)1L);
    java.util.Locale var45 = var42.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var46 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var45);
    java.util.Map var47 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var48 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var45, var47);
    java.util.Map var49 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var50 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var45, var49);
    var25.setLocale(var45);
    java.util.Locale var54 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var55 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var54);
    boolean var57 = var55.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var58 = var55.getLocale();
    java.util.Map var60 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var61 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var60);
    boolean var63 = var61.equals((java.lang.Object)1L);
    java.util.Locale var64 = var61.getLocale();
    java.text.Format[] var65 = var61.getFormatsByArgumentIndex();
    java.text.Format[] var66 = var61.getFormats();
    java.text.AttributedCharacterIterator var67 = var55.formatToCharacterIterator((java.lang.Object)var66);
    java.util.Map var73 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var74 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var73);
    boolean var76 = var74.equals((java.lang.Object)1L);
    java.util.Locale var77 = var74.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var78 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var77);
    java.util.Map var79 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var80 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var77, var79);
    java.util.Map var81 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var82 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var77, var81);
    java.util.Map var83 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var84 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var77, var83);
    var55.setLocale(var77);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var55);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var25.setFormatByArgumentIndex(0, (java.text.Format)var55);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);

  }

  public void test466() {}
//   public void test466() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test466"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.lang.String var4 = var2.toPattern();
//     var2.applyPattern("hi!");
//     java.text.ParsePosition var8 = null;
//     java.lang.Object[] var9 = var2.parse("", var8);
// 
//   }

  public void test467() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test467"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.lang.Object var3 = var2.clone();
    java.lang.String var4 = var2.toPattern();
    java.text.Format[] var5 = var2.getFormats();
    var2.applyPattern("hi!");
    java.util.Locale var8 = var2.getLocale();
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    boolean var16 = var14.equals((java.lang.Object)1L);
    java.util.Locale var17 = var14.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var17, var19);
    java.util.Map var25 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25);
    boolean var28 = var26.equals((java.lang.Object)1L);
    java.util.Locale var29 = var26.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var29);
    java.util.Map var31 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var29, var31);
    java.util.Map var33 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var29, var33);
    var20.setLocale(var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(0, (java.text.Format)var20);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test468() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test468"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "", (-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test469() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test469"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var5 = var2.getLocale();
    var2.applyPattern("");
    java.util.Locale var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.text.Format[] var11 = var10.getFormats();
    java.lang.String var12 = var2.format((java.lang.Object)var11);
    java.util.Locale var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var15);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var20);
    boolean var23 = var21.equals((java.lang.Object)1L);
    java.util.Locale var24 = var21.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24);
    java.util.Map var26 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24, var26);
    java.util.Map var32 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var32);
    boolean var35 = var33.equals((java.lang.Object)1L);
    java.util.Locale var36 = var33.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var37 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var36);
    java.util.Map var38 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var39 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var36, var38);
    java.util.Map var40 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var41 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var36, var40);
    java.lang.String var42 = var41.toPattern();
    boolean var43 = var27.equals((java.lang.Object)var42);
    boolean var44 = var16.equals((java.lang.Object)var43);
    java.util.Map var50 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var51 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var50);
    boolean var53 = var51.equals((java.lang.Object)1L);
    java.util.Locale var54 = var51.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var55 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var54);
    java.util.Map var56 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var57 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var54, var56);
    java.util.Map var58 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var59 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var54, var58);
    java.util.Map var60 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var61 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var54, var60);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var61);
    java.util.Map var64 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var65 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var64);
    boolean var66 = var61.equals((java.lang.Object)var65);
    boolean var67 = var16.equals((java.lang.Object)var65);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat(0, (java.text.Format)var16);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);

  }

  public void test470() {}
//   public void test470() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test470"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.lang.String var4 = var2.toPattern();
//     java.util.Locale var6 = null;
//     java.util.Map var7 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6, var7);
//     boolean var9 = var2.equals((java.lang.Object)var6);
//     java.text.Format[] var10 = var2.getFormatsByArgumentIndex();
//     java.util.Map var12 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
//     java.text.Format[] var14 = var13.getFormats();
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var14, "");
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var14, "hi!");
//     java.text.AttributedCharacterIterator var19 = var2.formatToCharacterIterator((java.lang.Object)var14);
//     java.util.Locale var20 = var2.getLocale();
//     java.text.ParsePosition var22 = null;
//     java.lang.Object[] var23 = var2.parse("hi!", var22);
// 
//   }

  public void test471() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test471"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    boolean var9 = var7.equals((java.lang.Object)1L);
    java.util.Locale var10 = var7.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10, var12);
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
    boolean var21 = var19.equals((java.lang.Object)1L);
    java.util.Locale var22 = var19.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    java.util.Map var24 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22, var24);
    java.util.Map var26 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var22, var26);
    java.lang.String var28 = var27.toPattern();
    boolean var29 = var13.equals((java.lang.Object)var28);
    boolean var30 = var2.equals((java.lang.Object)var29);
    java.util.Map var36 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var37 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var36);
    boolean var39 = var37.equals((java.lang.Object)1L);
    java.util.Locale var40 = var37.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var41 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var40);
    java.util.Map var42 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var43 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var40, var42);
    java.util.Map var44 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var45 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var40, var44);
    java.util.Map var46 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var47 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var40, var46);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var47);
    java.util.Map var50 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var51 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var50);
    boolean var52 = var47.equals((java.lang.Object)var51);
    boolean var53 = var2.equals((java.lang.Object)var51);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var55 = var2.parse("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);

  }

  public void test472() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test472"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.util.Locale var3 = var2.getLocale();
    java.util.Locale var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    java.text.Format[] var7 = var6.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var7, "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var7);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test473() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test473"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    java.text.Format[] var7 = var2.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
    java.util.Locale var9 = null;
    var2.setLocale(var9);
    java.util.Locale var11 = var2.getLocale();
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    boolean var18 = var16.equals((java.lang.Object)1L);
    java.util.Locale var19 = var16.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19);
    java.util.Map var21 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19, var21);
    var22.applyPattern("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var25 = var2.format((java.lang.Object)var22);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test474() {}
//   public void test474() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test474"); }
// 
// 
//     java.util.Map var3 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
//     java.text.Format[] var5 = var4.getFormats();
//     java.lang.String var6 = var4.toPattern();
//     java.lang.Object var7 = var4.clone();
//     java.util.Map var12 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
//     boolean var15 = var13.equals((java.lang.Object)1L);
//     java.util.Locale var16 = var13.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
//     java.util.Map var18 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16, var18);
//     java.util.Map var20 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var20);
//     var4.setLocale(var16);
//     java.util.Map var23 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var23);
//     org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
//     var25.applyPattern("hi!");
//     java.util.Map var31 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var31);
//     boolean var34 = var32.equals((java.lang.Object)1L);
//     java.util.Locale var35 = var32.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var36 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var35);
//     org.apache.commons.lang.text.ExtendedMessageFormat var37 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var35);
//     var25.setLocale(var35);
//     java.util.Map var41 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var42 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var41);
//     java.text.Format[] var43 = var42.getFormats();
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var43, "");
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var43, "hi!");
//     java.lang.String var48 = java.text.MessageFormat.format("", (java.lang.Object[])var43);
//     java.lang.StringBuffer var49 = null;
//     java.text.FieldPosition var50 = null;
//     java.lang.StringBuffer var51 = var25.format((java.lang.Object[])var43, var49, var50);
// 
//   }

  public void test475() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test475"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var5 = var2.getLocale();
    var2.applyPattern("");
    boolean var9 = var2.equals((java.lang.Object)(byte)100);
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
    java.util.Locale var13 = var12.getLocale();
    var12.applyPattern("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var16 = var2.format((java.lang.Object)var12);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test476() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test476"); }


    java.util.Locale var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var2);
    boolean var5 = var3.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var6 = var3.getLocale();
    java.util.Map var8 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
    boolean var11 = var9.equals((java.lang.Object)1L);
    java.util.Locale var12 = var9.getLocale();
    java.text.Format[] var13 = var9.getFormatsByArgumentIndex();
    java.text.Format[] var14 = var9.getFormats();
    java.text.AttributedCharacterIterator var15 = var3.formatToCharacterIterator((java.lang.Object)var14);
    java.util.Map var21 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var21);
    boolean var24 = var22.equals((java.lang.Object)1L);
    java.util.Locale var25 = var22.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25);
    java.util.Map var27 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25, var27);
    java.util.Map var29 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var25, var29);
    java.util.Map var31 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var25, var31);
    var3.setLocale(var25);
    java.util.Map var35 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var36 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var35);
    boolean var38 = var36.equals((java.lang.Object)1L);
    java.util.Locale var39 = var36.getLocale();
    java.text.Format[] var40 = var36.getFormatsByArgumentIndex();
    java.text.Format[] var41 = var36.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var36);
    java.util.Locale var44 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var45 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var44);
    boolean var47 = var45.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var48 = var45.getLocale();
    java.util.Map var52 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var53 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var52);
    boolean var55 = var53.equals((java.lang.Object)1L);
    java.util.Locale var56 = var53.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var57 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var56);
    java.util.Map var58 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var59 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var56, var58);
    var45.setLocale(var56);
    var36.setLocale(var56);
    var3.setLocale(var56);
    org.apache.commons.lang.text.ExtendedMessageFormat var63 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var56);
    java.util.Map var66 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var67 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var66);
    java.text.Format[] var68 = var67.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var68, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var68, "hi!");
    java.lang.String var73 = java.text.MessageFormat.format("", (java.lang.Object[])var68);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var63.setFormatsByArgumentIndex(var68);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + ""+ "'", var73.equals(""));

  }

  public void test477() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test477"); }


    org.apache.commons.lang.Validate.notNull((java.lang.Object)0.0d);

  }

  public void test478() {}
//   public void test478() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test478"); }
// 
// 
//     java.util.Map var4 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
//     boolean var7 = var5.equals((java.lang.Object)1L);
//     java.util.Locale var8 = var5.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
//     java.util.Map var10 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8, var10);
//     java.util.Map var12 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var8, var12);
//     java.lang.String var14 = var13.toPattern();
//     var13.applyPattern("");
//     java.util.Map var18 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
//     java.text.Format[] var20 = var19.getFormats();
//     java.lang.Object var21 = var19.clone();
//     boolean var22 = var13.equals(var21);
//     java.text.ParsePosition var24 = null;
//     java.lang.Object[] var25 = var13.parse("hi!", var24);
// 
//   }

  public void test479() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test479"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    boolean var6 = var4.equals((java.lang.Object)1L);
    java.util.Locale var7 = var4.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7);
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7, var9);
    var10.applyPattern("hi!");
    java.text.Format[] var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.setFormatsByArgumentIndex(var13);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test480() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test480"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    java.text.Format[] var5 = var4.getFormats();
    java.text.Format[] var6 = var4.getFormats();
    java.text.Format[] var7 = var4.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "", (java.lang.Object)var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test481() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test481"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    java.text.Format[] var5 = var4.getFormats();
    java.lang.String var6 = var4.toPattern();
    java.lang.Object var7 = var4.clone();
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    boolean var15 = var13.equals((java.lang.Object)1L);
    java.util.Locale var16 = var13.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16, var18);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var20);
    var4.setLocale(var16);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var23);
    java.util.Map var25 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var25);
    java.util.Locale var29 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var29);
    java.lang.Object var31 = var30.clone();
    java.lang.String var32 = var30.toPattern();
    java.text.Format[] var33 = var30.getFormats();
    var30.applyPattern("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var26.setFormatByArgumentIndex(1, (java.text.Format)var30);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test482() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test482"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.util.Map var8 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
    boolean var11 = var9.equals((java.lang.Object)1L);
    java.util.Locale var12 = var9.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12, var14);
    java.util.Map var16 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var12, var16);
    java.lang.String var18 = var17.toPattern();
    var17.applyPattern("");
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    java.text.Format[] var24 = var23.getFormats();
    java.lang.Object var25 = var23.clone();
    boolean var26 = var17.equals(var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var27 = var2.formatToCharacterIterator((java.lang.Object)var26);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test483() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test483"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    java.text.Format[] var9 = var5.getFormatsByArgumentIndex();
    boolean var10 = var2.equals((java.lang.Object)var9);
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    java.text.Format[] var15 = var14.getFormats();
    java.lang.String var16 = var14.toPattern();
    java.lang.Object var17 = var14.clone();
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    boolean var25 = var23.equals((java.lang.Object)1L);
    java.util.Locale var26 = var23.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26);
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26, var28);
    java.util.Map var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var26, var30);
    var14.setLocale(var26);
    java.util.Map var33 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26, var33);
    var2.setLocale(var26);
    java.lang.Object var37 = var2.parseObject("hi!");
    java.util.Map var40 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var41 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var40);
    java.text.Format[] var42 = var41.getFormats();
    java.lang.String var43 = java.text.MessageFormat.format("", (java.lang.Object[])var42);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var42);
    java.text.AttributedCharacterIterator var45 = var2.formatToCharacterIterator((java.lang.Object)var42);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var47 = var2.formatToCharacterIterator((java.lang.Object)(-1L));
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test484() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test484"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    var2.setLocale(var8);
    java.text.Format[] var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var10);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test485() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test485"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    org.apache.commons.lang.Validate.isTrue(true, "hi!", (java.lang.Object)"");

  }

  public void test486() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test486"); }


    org.apache.commons.lang.Validate.isTrue(true, "", 0L);

  }

  public void test487() {}
//   public void test487() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test487"); }
// 
// 
//     java.util.Map var4 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
//     java.text.Format[] var6 = var5.getFormats();
//     java.lang.String var7 = var5.toPattern();
//     java.lang.Object var8 = var5.clone();
//     java.util.Map var13 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
//     boolean var16 = var14.equals((java.lang.Object)1L);
//     java.util.Locale var17 = var14.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
//     java.util.Map var19 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17, var19);
//     java.util.Map var21 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var17, var21);
//     var5.setLocale(var17);
//     java.util.Map var24 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var17, var24);
//     org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
//     org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var17);
//     java.util.Locale var29 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var29);
//     boolean var32 = var30.equals((java.lang.Object)(byte)(-1));
//     java.util.Locale var33 = var30.getLocale();
//     var30.applyPattern("");
//     var30.applyPattern("hi!");
//     java.text.Format[] var38 = var30.getFormatsByArgumentIndex();
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var38, "");
//     boolean var41 = var27.equals((java.lang.Object)"");
//     java.lang.Object var42 = null;
//     java.lang.StringBuffer var43 = null;
//     java.text.FieldPosition var44 = null;
//     java.lang.StringBuffer var45 = var27.format(var42, var43, var44);
// 
//   }

  public void test488() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test488"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var5 = var2.getLocale();
    var2.applyPattern("");
    var2.applyPattern("hi!");
    java.lang.Object var11 = var2.parseObject("hi!");
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14);
    java.text.Format[] var16 = var15.getFormats();
    var15.applyPattern("");
    var15.applyPattern("");
    java.util.Locale var21 = var15.getLocale();
    java.text.Format[] var22 = var15.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(10, (java.text.Format)var15);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test489() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test489"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    boolean var6 = var4.equals((java.lang.Object)1L);
    java.util.Locale var7 = var4.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7);
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7, var9);
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    boolean var15 = var13.equals((java.lang.Object)1L);
    java.util.Locale var16 = var13.getLocale();
    java.text.Format[] var17 = var13.getFormatsByArgumentIndex();
    java.text.Format[] var18 = var13.getFormats();
    java.text.AttributedCharacterIterator var19 = var10.formatToCharacterIterator((java.lang.Object)var18);
    java.text.Format[] var20 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.setFormats(var20);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test490() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test490"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    java.text.Format[] var9 = var5.getFormatsByArgumentIndex();
    boolean var10 = var2.equals((java.lang.Object)var9);
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    java.text.Format[] var15 = var14.getFormats();
    java.lang.String var16 = var14.toPattern();
    java.lang.Object var17 = var14.clone();
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    boolean var25 = var23.equals((java.lang.Object)1L);
    java.util.Locale var26 = var23.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26);
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26, var28);
    java.util.Map var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var26, var30);
    var14.setLocale(var26);
    java.util.Map var33 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26, var33);
    var2.setLocale(var26);
    java.lang.Object var37 = var2.parseObject("hi!");
    java.util.Map var40 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var41 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var40);
    java.text.Format[] var42 = var41.getFormats();
    java.lang.String var43 = java.text.MessageFormat.format("", (java.lang.Object[])var42);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var42);
    java.text.AttributedCharacterIterator var45 = var2.formatToCharacterIterator((java.lang.Object)var42);
    java.lang.Object var46 = var2.clone();
    java.util.Locale var47 = var2.getLocale();
    java.util.Locale var49 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var50 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var49);
    boolean var52 = var50.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var53 = var50.getLocale();
    var50.applyPattern("");
    var50.applyPattern("hi!");
    java.text.Format[] var58 = var50.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var58, "");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var58);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test491() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test491"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    java.util.Locale var6 = null;
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6, var7);
    boolean var9 = var2.equals((java.lang.Object)var6);
    var2.applyPattern("hi!");
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14);
    java.text.Format[] var16 = var15.getFormats();
    java.lang.Object var17 = var15.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat(100, (java.text.Format)var15);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test492"); }


    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var8);
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var8, var10);
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8, var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var15 = var13.parse("hi!");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test493() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test493"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    java.util.Locale var6 = null;
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6, var7);
    boolean var9 = var2.equals((java.lang.Object)var6);
    var2.applyPattern("");
    boolean var13 = var2.equals((java.lang.Object)"hi!");
    var2.applyPattern("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var17 = var2.parse("hi!");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test494() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test494"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    var2.applyPattern("");
    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    boolean var9 = var7.equals((java.lang.Object)1L);
    java.util.Locale var10 = var7.getLocale();
    java.text.Format[] var11 = var7.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var11, "");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var11);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test495() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test495"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    boolean var5 = var3.equals((java.lang.Object)1L);
    java.util.Locale var6 = var3.getLocale();
    java.text.Format[] var7 = var3.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var7, "");
    java.lang.String var10 = java.text.MessageFormat.format("", (java.lang.Object[])var7);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var7);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test496() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test496"); }


    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    boolean var9 = var7.equals((java.lang.Object)1L);
    java.util.Locale var10 = var7.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10, var12);
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var10, var14);
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10, var17);
    java.util.Locale var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var20);
    java.lang.Object var22 = var21.clone();
    java.lang.String var23 = var21.toPattern();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var24 = var18.formatToCharacterIterator((java.lang.Object)var23);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));

  }

  public void test497() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test497"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.text.Format[] var3 = var2.getFormatsByArgumentIndex();
    var2.applyPattern("hi!");
    java.lang.Object var6 = var2.clone();
    java.text.Format[] var7 = var2.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var9 = var2.parse("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test498() {}
//   public void test498() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test498"); }
// 
// 
//     java.util.Map var3 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
//     java.text.Format[] var5 = var4.getFormats();
//     java.lang.String var6 = var4.toPattern();
//     java.lang.Object var7 = var4.clone();
//     java.util.Map var12 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
//     boolean var15 = var13.equals((java.lang.Object)1L);
//     java.util.Locale var16 = var13.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
//     java.util.Map var18 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16, var18);
//     java.util.Map var20 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var20);
//     var4.setLocale(var16);
//     java.util.Map var23 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var23);
//     org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
//     org.apache.commons.lang.Validate.notNull((java.lang.Object)var25);
//     java.text.ParsePosition var28 = null;
//     java.lang.Object[] var29 = var25.parse("", var28);
// 
//   }

  public void test499() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test499"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    boolean var8 = var2.equals((java.lang.Object)' ');
    java.lang.Object var9 = var2.clone();
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    boolean var15 = var13.equals((java.lang.Object)1L);
    java.util.Locale var16 = var13.getLocale();
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
    java.text.Format[] var20 = var19.getFormats();
    java.lang.String var21 = var19.toPattern();
    java.lang.Object var22 = var19.clone();
    java.util.Map var27 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27);
    boolean var30 = var28.equals((java.lang.Object)1L);
    java.util.Locale var31 = var28.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var31);
    java.util.Map var33 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var31, var33);
    java.util.Map var35 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var36 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var31, var35);
    var19.setLocale(var31);
    var13.setLocale(var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(0, (java.text.Format)var13);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test500"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var6);
    boolean var8 = var2.equals((java.lang.Object)var6);
    java.lang.String var9 = var2.toPattern();
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    boolean var18 = var16.equals((java.lang.Object)1L);
    java.util.Locale var19 = var16.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19);
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19);
    org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat(0, (java.text.Format)var22);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

}

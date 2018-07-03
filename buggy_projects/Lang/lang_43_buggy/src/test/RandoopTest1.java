
import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test1"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    var2.applyPattern("");
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
    java.util.Locale var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.text.Format[] var11 = var10.getFormats();
    java.lang.String var12 = java.text.MessageFormat.format("hi!", (java.lang.Object[])var11);
    java.lang.String var13 = var2.format((java.lang.Object)var11);
    java.text.Format var15 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat((-1), var15);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test2() {}
//   public void test2() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test2"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.lang.String var4 = var2.toPattern();
//     java.lang.Object var5 = var2.clone();
//     java.lang.String var6 = var2.toPattern();
//     java.text.Format[] var7 = var2.getFormats();
//     java.text.ParsePosition var9 = null;
//     java.lang.Object[] var10 = var2.parse("hi!", var9);
// 
//   }

  public void test3() {}
//   public void test3() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test3"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.lang.Object var3 = var2.clone();
//     java.lang.String var4 = var2.toPattern();
//     java.text.Format[] var5 = var2.getFormats();
//     var2.applyPattern("hi!");
//     java.text.ParsePosition var9 = null;
//     java.lang.Object[] var10 = var2.parse("", var9);
// 
//   }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test4"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    java.util.Locale var4 = var3.getLocale();
    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4, var5);
    java.text.Format var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.setFormatByArgumentIndex(0, var8);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test5"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    boolean var6 = var4.equals((java.lang.Object)1L);
    java.util.Locale var7 = var4.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7);
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var9);
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
    java.util.Map var38 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var39 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var38);
    boolean var41 = var39.equals((java.lang.Object)1L);
    java.util.Locale var42 = var39.getLocale();
    java.text.Format[] var43 = var39.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var43, "");
    boolean var46 = var36.equals((java.lang.Object)var43);
    java.lang.StringBuffer var47 = null;
    java.text.FieldPosition var48 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var49 = var9.format((java.lang.Object)var36, var47, var48);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
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
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test6"); }


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
    java.util.Map var27 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var27);
    java.util.Map var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var30);
    boolean var33 = var31.equals((java.lang.Object)1L);
    java.util.Locale var34 = var31.getLocale();
    java.text.Format[] var35 = var31.getFormatsByArgumentIndex();
    boolean var36 = var28.equals((java.lang.Object)var35);
    java.util.Map var39 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var40 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var39);
    java.text.Format[] var41 = var40.getFormats();
    java.lang.String var42 = var40.toPattern();
    java.lang.Object var43 = var40.clone();
    java.util.Map var48 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var49 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var48);
    boolean var51 = var49.equals((java.lang.Object)1L);
    java.util.Locale var52 = var49.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var53 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var52);
    java.util.Map var54 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var55 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var52, var54);
    java.util.Map var56 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var57 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var52, var56);
    var40.setLocale(var52);
    java.util.Map var59 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var60 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var52, var59);
    var28.setLocale(var52);
    java.lang.Object var63 = var28.parseObject("hi!");
    java.util.Map var66 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var67 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var66);
    java.text.Format[] var68 = var67.getFormats();
    java.lang.String var69 = java.text.MessageFormat.format("", (java.lang.Object[])var68);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var68);
    java.text.AttributedCharacterIterator var71 = var28.formatToCharacterIterator((java.lang.Object)var68);
    java.lang.Object var72 = var28.clone();
    java.util.Locale var73 = var28.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var74 = var2.formatToCharacterIterator((java.lang.Object)var28);
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
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + ""+ "'", var42.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + ""+ "'", var69.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test7"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.lang.Object var5 = var2.clone();
    var2.applyPattern("");
    java.util.Locale var8 = var2.getLocale();
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
    java.text.Format[] var13 = var12.getFormats();
    java.lang.String var14 = var12.toPattern();
    java.util.Locale var16 = null;
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16, var17);
    boolean var19 = var12.equals((java.lang.Object)var16);
    var12.applyPattern("");
    java.util.Map var24 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24);
    boolean var27 = var25.equals((java.lang.Object)1L);
    java.util.Locale var28 = var25.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var28);
    java.util.Map var31 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var31);
    java.text.Format[] var33 = var32.getFormats();
    java.util.Map var36 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var37 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var36);
    boolean var39 = var37.equals((java.lang.Object)1L);
    java.util.Locale var40 = var37.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var41 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var40);
    var32.setLocale(var40);
    var29.setLocale(var40);
    java.util.Locale var44 = var29.getLocale();
    var12.setLocale(var44);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(0, (java.text.Format)var12);
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test8"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.text.Format[] var4 = var2.getFormats();
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    boolean var10 = var8.equals((java.lang.Object)1L);
    java.lang.Object var11 = var8.clone();
    java.text.Format[] var12 = var8.getFormatsByArgumentIndex();
    java.text.Format[] var13 = var8.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(10, (java.text.Format)var8);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test9"); }


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
    java.lang.Object[] var38 = new java.lang.Object[] { (-1)};
    org.apache.commons.lang.Validate.noNullElements(var38);
    org.apache.commons.lang.Validate.noNullElements(var38);
    java.lang.String var41 = java.text.MessageFormat.format("", var38);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var42 = var25.formatToCharacterIterator((java.lang.Object)var41);
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
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + ""+ "'", var41.equals(""));

  }

  public void test10() {}
//   public void test10() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test10"); }
// 
// 
//     java.util.Locale var3 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var3);
//     java.lang.Object var5 = var4.clone();
//     org.apache.commons.lang.Validate.isTrue(true, "hi!", (java.lang.Object)var4);
//     var4.applyPattern("");
//     java.text.ParsePosition var10 = null;
//     java.lang.Object var11 = var4.parseObject("", var10);
// 
//   }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test11"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.lang.Object var5 = var2.clone();
    java.util.Locale var6 = var2.getLocale();
    java.text.Format[] var7 = var2.getFormatsByArgumentIndex();
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    boolean var13 = var11.equals((java.lang.Object)1L);
    java.util.Locale var14 = var11.getLocale();
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
    var11.setLocale(var29);
    java.util.Map var37 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var38 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var29, var37);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var39 = var2.format((java.lang.Object)var38);
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
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

  public void test12() {}
//   public void test12() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test12"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     var2.applyPattern("");
//     var2.applyPattern("");
//     java.util.Locale var8 = var2.getLocale();
//     java.text.Format[] var9 = var2.getFormats();
//     java.lang.Object[] var10 = null;
//     java.lang.StringBuffer var11 = null;
//     java.text.FieldPosition var12 = null;
//     java.lang.StringBuffer var13 = var2.format(var10, var11, var12);
// 
//   }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test13"); }


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
    var25.applyPattern("");
    java.util.Map var43 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var44 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var43);
    boolean var46 = var44.equals((java.lang.Object)1L);
    java.util.Locale var47 = var44.getLocale();
    java.text.Format[] var48 = var44.getFormatsByArgumentIndex();
    java.text.Format[] var49 = var44.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var44);
    var44.applyPattern("");
    java.text.Format[] var53 = var44.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var25.setFormats(var53);
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
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test14"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Map var8 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
    boolean var11 = var9.equals((java.lang.Object)1L);
    java.util.Locale var12 = var9.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var12);
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var12, var14);
    var2.setLocale(var12);
    java.util.Locale var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
    java.text.Format[] var20 = var19.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var20, "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var23 = var2.formatToCharacterIterator((java.lang.Object)"hi!");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test15"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    java.text.Format[] var5 = var4.getFormats();
    java.lang.Object var6 = var4.clone();
    var4.applyPattern("");
    org.apache.commons.lang.Validate.isTrue(true, "", (java.lang.Object)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var4.parseObject("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test16"); }


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
    var25.applyPattern("hi!");
    java.lang.Object var29 = var25.parseObject("hi!");
    java.util.Locale var30 = var25.getLocale();
    java.util.Map var32 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var32);
    boolean var35 = var33.equals((java.lang.Object)1L);
    java.lang.Object var36 = var33.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var37 = var25.format((java.lang.Object)var33);
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
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test17"); }


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
    java.util.Map var40 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var41 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var40);
    boolean var43 = var41.equals((java.lang.Object)1L);
    java.util.Locale var44 = var41.getLocale();
    boolean var45 = var2.equals((java.lang.Object)var44);
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
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);

  }

  public void test18() {}
//   public void test18() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test18"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     boolean var4 = var2.equals((java.lang.Object)1L);
//     java.util.Locale var5 = var2.getLocale();
//     java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
//     java.text.Format[] var7 = var2.getFormats();
//     org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
//     java.lang.String var9 = var2.toPattern();
//     java.text.ParsePosition var11 = null;
//     java.lang.Object var12 = var2.parseObject("hi!", var11);
// 
//   }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test19"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var22 = var2.parseObject("hi!");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test20"); }


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
    java.util.Locale var29 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var29);
    java.lang.Object var31 = var30.clone();
    org.apache.commons.lang.Validate.isTrue(true, "hi!", (java.lang.Object)var30);
    java.text.Format[] var33 = var30.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var23.setFormatsByArgumentIndex(var33);
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
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test21"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    java.text.Format[] var4 = var3.getFormats();
    java.lang.String var5 = var3.toPattern();
    java.lang.Object var6 = var3.clone();
    java.lang.String var7 = var3.toPattern();
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
    boolean var14 = var12.equals((java.lang.Object)1L);
    java.util.Locale var15 = var12.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var15);
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    var3.setLocale(var15);
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    java.util.Locale var20 = var19.getLocale();
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    boolean var25 = var23.equals((java.lang.Object)1L);
    java.util.Locale var26 = var23.getLocale();
    java.text.Format[] var27 = var23.getFormatsByArgumentIndex();
    java.text.Format[] var28 = var23.getFormats();
    java.util.Locale var29 = var23.getLocale();
    boolean var30 = var19.equals((java.lang.Object)var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var32 = var23.parse("hi!");
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
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test22"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    java.text.Format[] var4 = var3.getFormats();
    java.lang.String var5 = var3.toPattern();
    java.text.Format[] var6 = var3.getFormatsByArgumentIndex();
    java.lang.String var7 = java.text.MessageFormat.format("", (java.lang.Object[])var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var6);
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
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test23"); }


    java.util.Locale var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var3);
    boolean var6 = var4.equals((java.lang.Object)(byte)(-1));
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    boolean var13 = var11.equals((java.lang.Object)1L);
    java.util.Locale var14 = var11.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var14);
    java.util.Map var16 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var14, var16);
    var4.setLocale(var14);
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test24"); }


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
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var10, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
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

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test25"); }


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
    java.text.Format[] var22 = var2.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var22, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
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
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test26"); }


    java.util.Locale var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var4);
    boolean var7 = var5.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var8 = var5.getLocale();
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    boolean var13 = var11.equals((java.lang.Object)1L);
    java.util.Locale var14 = var11.getLocale();
    java.text.Format[] var15 = var11.getFormatsByArgumentIndex();
    java.text.Format[] var16 = var11.getFormats();
    java.text.AttributedCharacterIterator var17 = var5.formatToCharacterIterator((java.lang.Object)var16);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var23);
    boolean var26 = var24.equals((java.lang.Object)1L);
    java.util.Locale var27 = var24.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27);
    java.util.Map var29 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27, var29);
    java.util.Map var31 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var27, var31);
    java.util.Map var33 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var27, var33);
    var5.setLocale(var27);
    java.util.Map var37 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var38 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var37);
    boolean var40 = var38.equals((java.lang.Object)1L);
    java.util.Locale var41 = var38.getLocale();
    java.text.Format[] var42 = var38.getFormatsByArgumentIndex();
    java.text.Format[] var43 = var38.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var38);
    java.util.Locale var46 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var47 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var46);
    boolean var49 = var47.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var50 = var47.getLocale();
    java.util.Map var54 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var55 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var54);
    boolean var57 = var55.equals((java.lang.Object)1L);
    java.util.Locale var58 = var55.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var59 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var58);
    java.util.Map var60 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var61 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var58, var60);
    var47.setLocale(var58);
    var38.setLocale(var58);
    var5.setLocale(var58);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var58);
    org.apache.commons.lang.text.ExtendedMessageFormat var66 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var58);
    org.apache.commons.lang.Validate.isTrue(true, "", (java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test27() {}
//   public void test27() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test27"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.lang.Object var3 = var2.clone();
//     java.lang.String var4 = var2.toPattern();
//     java.text.Format[] var5 = var2.getFormats();
//     var2.applyPattern("hi!");
//     java.util.Locale var8 = var2.getLocale();
//     java.lang.Object[] var10 = new java.lang.Object[] { (-1)};
//     org.apache.commons.lang.Validate.noNullElements(var10);
//     org.apache.commons.lang.Validate.notNull((java.lang.Object)var10, "hi!");
//     org.apache.commons.lang.Validate.notEmpty(var10);
//     org.apache.commons.lang.Validate.notEmpty(var10, "");
//     java.lang.StringBuffer var17 = null;
//     java.text.FieldPosition var18 = null;
//     java.lang.StringBuffer var19 = var2.format(var10, var17, var18);
// 
//   }

  public void test28() {}
//   public void test28() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test28"); }
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
//     org.apache.commons.lang.Validate.notNull((java.lang.Object)var2, "");
//     java.text.ParsePosition var25 = null;
//     java.lang.Object[] var26 = var2.parse("hi!", var25);
// 
//   }

  public void test29() {}
//   public void test29() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test29"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     boolean var4 = var2.equals((java.lang.Object)1L);
//     java.util.Locale var5 = var2.getLocale();
//     java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
//     boolean var8 = var2.equals((java.lang.Object)' ');
//     var2.applyPattern("");
//     java.text.ParsePosition var12 = null;
//     java.lang.Object[] var13 = var2.parse("hi!", var12);
// 
//   }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test30"); }


    java.util.Locale var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var5);
    java.text.Format[] var7 = var6.getFormats();
    org.apache.commons.lang.Validate.isTrue(true, "", (java.lang.Object)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "hi!", (java.lang.Object)var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test31() {}
//   public void test31() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test31"); }
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
//     java.util.Locale var14 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var14);
//     boolean var17 = var15.equals((java.lang.Object)(byte)(-1));
//     java.util.Locale var18 = var15.getLocale();
//     var15.applyPattern("");
//     java.util.Locale var22 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
//     java.text.Format[] var24 = var23.getFormats();
//     java.lang.String var25 = var15.format((java.lang.Object)var24);
//     java.lang.StringBuffer var26 = null;
//     java.text.FieldPosition var27 = null;
//     java.lang.StringBuffer var28 = var2.format((java.lang.Object[])var24, var26, var27);
// 
//   }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test32"); }


    org.apache.commons.lang.Validate.notNull((java.lang.Object)1.0f, "");

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test33"); }


    java.lang.Object var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "hi!", var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test34"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    java.text.Format[] var7 = var2.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
    java.lang.String var9 = var2.toPattern();
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
    org.apache.commons.lang.text.ExtendedMessageFormat var37 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var27);
    java.text.Format[] var38 = var37.getFormatsByArgumentIndex();
    java.text.Format[] var39 = var37.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var39);
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
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
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
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test35"); }


    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8, var10);
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var8, var12);
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
    org.apache.commons.lang.text.ExtendedMessageFormat var37 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var29, var36);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var38 = var13.format((java.lang.Object)var37);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
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

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test36"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    var2.applyPattern("");
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
    java.util.Locale var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.text.Format[] var11 = var10.getFormats();
    java.lang.String var12 = java.text.MessageFormat.format("hi!", (java.lang.Object[])var11);
    java.lang.String var13 = var2.format((java.lang.Object)var11);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test37"); }


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
    java.util.Locale var41 = null;
    java.util.Map var42 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var43 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var41, var42);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat(1, (java.text.Format)var43);
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

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test38"); }


    java.util.Locale var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var3);
    boolean var6 = var4.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var7 = var4.getLocale();
    var4.applyPattern("");
    boolean var11 = var4.equals((java.lang.Object)(byte)100);
    org.apache.commons.lang.Validate.isTrue(true, "", (java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test39() {}
//   public void test39() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test39"); }
// 
// 
//     org.apache.commons.lang.text.ExtendedMessageFormat var1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
//     java.text.Format[] var2 = var1.getFormatsByArgumentIndex();
//     java.util.Map var4 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
//     java.text.Format[] var6 = var5.getFormats();
//     java.util.Map var9 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
//     boolean var12 = var10.equals((java.lang.Object)1L);
//     java.util.Locale var13 = var10.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
//     var5.setLocale(var13);
//     java.util.Map var18 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
//     boolean var21 = var19.equals((java.lang.Object)1L);
//     java.util.Locale var22 = var19.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var22);
//     java.util.Map var25 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25);
//     java.text.Format[] var27 = var26.getFormats();
//     java.util.Map var30 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var30);
//     boolean var33 = var31.equals((java.lang.Object)1L);
//     java.util.Locale var34 = var31.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var35 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var34);
//     var26.setLocale(var34);
//     var23.setLocale(var34);
//     java.util.Locale var38 = var23.getLocale();
//     boolean var39 = var5.equals((java.lang.Object)var23);
//     boolean var40 = var1.equals((java.lang.Object)var5);
//     java.text.ParsePosition var42 = null;
//     java.lang.Object[] var43 = var5.parse("", var42);
// 
//   }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test40"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.text.Format[] var3 = var2.getFormatsByArgumentIndex();
    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    java.text.Format[] var8 = var7.getFormats();
    java.lang.String var9 = var7.toPattern();
    java.lang.Object var10 = var7.clone();
    java.lang.String var11 = var7.toPattern();
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    boolean var18 = var16.equals((java.lang.Object)1L);
    java.util.Locale var19 = var16.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19);
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19);
    var7.setLocale(var19);
    java.util.Map var26 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26);
    boolean var29 = var27.equals((java.lang.Object)1L);
    java.util.Locale var30 = var27.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var30);
    java.util.Map var32 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var30, var32);
    var7.setLocale(var30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(1, (java.text.Format)var7);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test41"); }


    org.apache.commons.lang.Validate.isTrue(true, "hi!", (-1L));

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test42"); }


    org.apache.commons.lang.text.ExtendedMessageFormat var1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
    java.text.Format[] var2 = var1.getFormatsByArgumentIndex();
    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    java.text.Format[] var6 = var5.getFormats();
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    boolean var12 = var10.equals((java.lang.Object)1L);
    java.util.Locale var13 = var10.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    var5.setLocale(var13);
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
    boolean var21 = var19.equals((java.lang.Object)1L);
    java.util.Locale var22 = var19.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var22);
    java.util.Map var25 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25);
    java.text.Format[] var27 = var26.getFormats();
    java.util.Map var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var30);
    boolean var33 = var31.equals((java.lang.Object)1L);
    java.util.Locale var34 = var31.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var35 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var34);
    var26.setLocale(var34);
    var23.setLocale(var34);
    java.util.Locale var38 = var23.getLocale();
    boolean var39 = var5.equals((java.lang.Object)var23);
    boolean var40 = var1.equals((java.lang.Object)var5);
    java.util.Map var44 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var45 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var44);
    boolean var47 = var45.equals((java.lang.Object)1L);
    java.util.Locale var48 = var45.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var49 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var48);
    java.util.Map var50 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var51 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var48, var50);
    java.util.Locale var53 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var54 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var53);
    boolean var56 = var54.equals((java.lang.Object)(byte)(-1));
    java.util.Map var62 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var63 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var62);
    boolean var65 = var63.equals((java.lang.Object)1L);
    java.util.Locale var66 = var63.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var67 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var66);
    java.util.Map var68 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var69 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var66, var68);
    java.util.Map var70 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var71 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var66, var70);
    org.apache.commons.lang.text.ExtendedMessageFormat var72 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var66);
    var54.setLocale(var66);
    boolean var74 = var51.equals((java.lang.Object)var54);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var75 = var1.formatToCharacterIterator((java.lang.Object)var54);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == true);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test43"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    boolean var8 = var2.equals((java.lang.Object)' ');
    java.text.Format var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat(0, var10);
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

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test44"); }


    org.apache.commons.lang.Validate.isTrue(true, "hi!", 1.0d);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test45"); }


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
    java.lang.Object var27 = var23.clone();
    java.text.Format[] var28 = var23.getFormatsByArgumentIndex();
    java.util.Map var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var30);
    java.text.Format[] var32 = var31.getFormats();
    java.lang.String var33 = var31.toPattern();
    java.lang.Object var34 = var31.clone();
    java.lang.String var35 = var31.toPattern();
    java.util.Map var39 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var40 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var39);
    boolean var42 = var40.equals((java.lang.Object)1L);
    java.util.Locale var43 = var40.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var44 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var43);
    org.apache.commons.lang.text.ExtendedMessageFormat var45 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var43);
    var31.setLocale(var43);
    java.util.Map var50 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var51 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var50);
    boolean var53 = var51.equals((java.lang.Object)1L);
    java.util.Locale var54 = var51.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var55 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var54);
    java.util.Map var56 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var57 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var54, var56);
    var31.setLocale(var54);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var59 = var23.format((java.lang.Object)var54);
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + ""+ "'", var35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test46"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    java.text.Format[] var5 = var4.getFormats();
    java.lang.String var6 = var4.toPattern();
    java.lang.Object var7 = var4.clone();
    java.lang.String var8 = var4.toPattern();
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    boolean var15 = var13.equals((java.lang.Object)1L);
    java.util.Locale var16 = var13.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16);
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    var4.setLocale(var16);
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    java.util.Map var21 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16, var21);
    java.util.Map var24 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24);
    boolean var27 = var25.equals((java.lang.Object)1L);
    java.lang.Object var28 = var25.clone();
    java.text.Format[] var29 = var25.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var22.setFormats(var29);
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
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test47"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var2);
    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    boolean var8 = var6.equals((java.lang.Object)1L);
    java.util.Locale var9 = var6.getLocale();
    java.text.Format[] var10 = var6.getFormatsByArgumentIndex();
    boolean var11 = var3.equals((java.lang.Object)var10);
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
    org.apache.commons.lang.text.ExtendedMessageFormat var35 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27, var34);
    var3.setLocale(var27);
    java.lang.Object var38 = var3.parseObject("hi!");
    java.util.Map var41 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var42 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var41);
    java.text.Format[] var43 = var42.getFormats();
    java.lang.String var44 = java.text.MessageFormat.format("", (java.lang.Object[])var43);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var43);
    java.text.AttributedCharacterIterator var46 = var3.formatToCharacterIterator((java.lang.Object)var43);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var43);
    java.lang.String var48 = java.text.MessageFormat.format("hi!", (java.lang.Object[])var43);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var43, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
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
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + ""+ "'", var44.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test48"); }


    java.util.Locale var3 = null;
    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3, var4);
    org.apache.commons.lang.Validate.isTrue(true, "", (java.lang.Object)var4);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test49"); }


    java.util.Locale var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var3);
    java.lang.Object var5 = var4.clone();
    org.apache.commons.lang.Validate.isTrue(true, "hi!", (java.lang.Object)var4);
    java.text.Format[] var7 = var4.getFormatsByArgumentIndex();
    java.util.Locale var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var11);
    boolean var14 = var12.equals((java.lang.Object)(byte)(-1));
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var20);
    boolean var23 = var21.equals((java.lang.Object)1L);
    java.util.Locale var24 = var21.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24);
    java.util.Map var26 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24, var26);
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var24, var28);
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24);
    var12.setLocale(var24);
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.setFormat(0, (java.text.Format)var32);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test50"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    var2.applyPattern("");
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
    java.util.Locale var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.text.Format[] var11 = var10.getFormats();
    java.lang.String var12 = java.text.MessageFormat.format("hi!", (java.lang.Object[])var11);
    java.lang.String var13 = var2.format((java.lang.Object)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var2.parseObject("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test51"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    java.text.Format[] var5 = var2.getFormatsByArgumentIndex();
    java.text.Format var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(1, var7);
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

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test52"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    boolean var5 = var3.equals((java.lang.Object)1L);
    java.lang.Object var6 = var3.clone();
    java.util.Locale var7 = var3.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)"hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test53"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Map var8 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
    boolean var11 = var9.equals((java.lang.Object)1L);
    java.util.Locale var12 = var9.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var12);
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var12, var14);
    var2.setLocale(var12);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var20);
    boolean var23 = var21.equals((java.lang.Object)1L);
    java.lang.Object var24 = var21.clone();
    java.util.Locale var25 = var21.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex((-1), (java.text.Format)var26);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test54"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    var2.applyPattern("hi!");
    java.text.Format[] var7 = var2.getFormatsByArgumentIndex();
    var2.applyPattern("");
    org.apache.commons.lang.Validate.notNull((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test55"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    java.text.Format[] var7 = var6.getFormats();
    java.text.Format[] var8 = var6.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var8);
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

  public void test56() {}
//   public void test56() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test56"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
//     java.lang.Object var3 = var2.clone();
//     java.util.Map var5 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var5);
//     java.util.Map var8 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
//     boolean var11 = var9.equals((java.lang.Object)1L);
//     java.util.Locale var12 = var9.getLocale();
//     java.text.Format[] var13 = var9.getFormatsByArgumentIndex();
//     boolean var14 = var6.equals((java.lang.Object)var13);
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
//     org.apache.commons.lang.text.ExtendedMessageFormat var38 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var30, var37);
//     var6.setLocale(var30);
//     org.apache.commons.lang.text.ExtendedMessageFormat var41 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
//     boolean var42 = var6.equals((java.lang.Object)var41);
//     java.util.Map var44 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var45 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var44);
//     boolean var47 = var45.equals((java.lang.Object)1L);
//     java.util.Locale var48 = var45.getLocale();
//     boolean var49 = var6.equals((java.lang.Object)var48);
//     java.text.Format[] var50 = var6.getFormats();
//     java.lang.StringBuffer var51 = null;
//     java.text.FieldPosition var52 = null;
//     java.lang.StringBuffer var53 = var2.format((java.lang.Object[])var50, var51, var52);
// 
//   }

  public void test57() {}
//   public void test57() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test57"); }
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
//     org.apache.commons.lang.Validate.notNull((java.lang.Object)var2, "");
//     java.lang.String var21 = var2.toPattern();
//     java.text.ParsePosition var23 = null;
//     java.lang.Object var24 = var2.parseObject("hi!", var23);
// 
//   }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test58"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.lang.Object var3 = var2.clone();
    java.util.Locale var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    java.text.Format[] var7 = var6.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var7);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test59() {}
//   public void test59() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test59"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
//     boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
//     java.util.Locale var5 = var2.getLocale();
//     var2.applyPattern("");
//     var2.applyPattern("hi!");
//     java.lang.Object[] var11 = new java.lang.Object[] { (-1)};
//     org.apache.commons.lang.Validate.noNullElements(var11);
//     org.apache.commons.lang.Validate.noNullElements(var11, "");
//     org.apache.commons.lang.Validate.noNullElements(var11);
//     java.lang.StringBuffer var16 = null;
//     java.text.FieldPosition var17 = null;
//     java.lang.StringBuffer var18 = var2.format(var11, var16, var17);
// 
//   }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test60"); }


    java.util.Locale var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var2);
    boolean var5 = var3.equals((java.lang.Object)(byte)(-1));
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
    boolean var14 = var12.equals((java.lang.Object)1L);
    java.util.Locale var15 = var12.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15, var17);
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var15, var19);
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    var3.setLocale(var15);
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    var23.applyPattern("");
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var28);
    java.text.Format[] var30 = var29.getFormats();
    java.lang.String var31 = var29.toPattern();
    java.util.Locale var33 = null;
    java.util.Map var34 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var35 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var33, var34);
    boolean var36 = var29.equals((java.lang.Object)var33);
    var29.applyPattern("");
    java.text.Format[] var39 = var29.getFormats();
    java.lang.String var40 = java.text.MessageFormat.format("", (java.lang.Object[])var39);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var23.setFormatsByArgumentIndex(var39);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + ""+ "'", var40.equals(""));

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test61"); }


    java.util.Locale var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var3);
    boolean var6 = var4.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var7 = var4.getLocale();
    var4.applyPattern("");
    boolean var11 = var4.equals((java.lang.Object)(byte)100);
    java.text.Format[] var12 = var4.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "", (java.lang.Object)var12);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test62() {}
//   public void test62() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test62"); }
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
//     java.lang.Object var31 = var27.parseObject("", var30);
// 
//   }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test63"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.util.Locale var4 = var2.getLocale();
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    boolean var13 = var11.equals((java.lang.Object)1L);
    java.util.Locale var14 = var11.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14);
    java.util.Map var16 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14, var16);
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var14, var18);
    java.lang.Object var20 = var19.clone();
    java.util.Locale var21 = null;
    var19.setLocale(var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(100, (java.text.Format)var19);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test64"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var5 = var2.getLocale();
    var2.applyPattern("");
    boolean var9 = var2.equals((java.lang.Object)(byte)100);
    java.text.Format[] var10 = var2.getFormatsByArgumentIndex();
    java.util.Locale var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var13);
    java.util.Map var16 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    boolean var19 = var17.equals((java.lang.Object)1L);
    java.util.Locale var20 = var17.getLocale();
    var14.setLocale(var20);
    java.lang.Object var22 = var14.clone();
    java.text.Format[] var23 = var14.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(100, (java.text.Format)var14);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test65() {}
//   public void test65() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test65"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     var2.applyPattern("");
//     var2.applyPattern("");
//     java.util.Locale var8 = var2.getLocale();
//     java.text.Format[] var9 = var2.getFormats();
//     java.text.ParsePosition var11 = null;
//     java.lang.Object var12 = var2.parseObject("", var11);
// 
//   }

  public void test66() {}
//   public void test66() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test66"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
//     boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
//     java.util.Map var8 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
//     boolean var11 = var9.equals((java.lang.Object)1L);
//     java.util.Locale var12 = var9.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var12);
//     java.util.Map var14 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var12, var14);
//     var2.setLocale(var12);
//     java.util.Map var18 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
//     boolean var21 = var19.equals((java.lang.Object)1L);
//     java.util.Locale var22 = var19.getLocale();
//     java.text.Format[] var23 = var19.getFormatsByArgumentIndex();
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var23, "");
//     java.lang.StringBuffer var26 = null;
//     java.text.FieldPosition var27 = null;
//     java.lang.StringBuffer var28 = var2.format((java.lang.Object[])var23, var26, var27);
// 
//   }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test67"); }


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
    java.lang.Object var26 = null;
    boolean var27 = var23.equals(var26);
    java.util.Locale var29 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var29);
    java.lang.Object var31 = var30.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var32 = var23.format((java.lang.Object)var30);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test68() {}
//   public void test68() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test68"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     boolean var4 = var2.equals((java.lang.Object)1L);
//     java.util.Locale var5 = var2.getLocale();
//     java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
//     boolean var8 = var2.equals((java.lang.Object)' ');
//     java.lang.Object var9 = var2.clone();
//     java.util.Map var15 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
//     boolean var18 = var16.equals((java.lang.Object)1L);
//     java.util.Locale var19 = var16.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19);
//     java.util.Map var21 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19, var21);
//     java.util.Map var23 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19, var23);
//     java.util.Map var25 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19, var25);
//     var2.setLocale(var19);
//     java.text.ParsePosition var29 = null;
//     java.lang.Object[] var30 = var2.parse("hi!", var29);
// 
//   }

  public void test69() {}
//   public void test69() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test69"); }
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
//     java.lang.Object var12 = var2.parseObject("", var11);
// 
//   }

  public void test70() {}
//   public void test70() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test70"); }
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
//     java.util.Map var15 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var15);
//     java.util.Map var18 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
//     boolean var21 = var19.equals((java.lang.Object)1L);
//     java.util.Locale var22 = var19.getLocale();
//     java.text.Format[] var23 = var19.getFormatsByArgumentIndex();
//     boolean var24 = var16.equals((java.lang.Object)var23);
//     java.util.Map var27 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27);
//     java.text.Format[] var29 = var28.getFormats();
//     java.lang.String var30 = var28.toPattern();
//     java.lang.Object var31 = var28.clone();
//     java.util.Map var36 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var37 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var36);
//     boolean var39 = var37.equals((java.lang.Object)1L);
//     java.util.Locale var40 = var37.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var41 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var40);
//     java.util.Map var42 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var43 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var40, var42);
//     java.util.Map var44 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var45 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var40, var44);
//     var28.setLocale(var40);
//     java.util.Map var47 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var48 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var40, var47);
//     var16.setLocale(var40);
//     java.lang.Object var51 = var16.parseObject("hi!");
//     java.util.Map var54 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var55 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var54);
//     java.text.Format[] var56 = var55.getFormats();
//     java.lang.String var57 = java.text.MessageFormat.format("", (java.lang.Object[])var56);
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var56);
//     java.text.AttributedCharacterIterator var59 = var16.formatToCharacterIterator((java.lang.Object)var56);
//     java.lang.StringBuffer var60 = null;
//     java.text.FieldPosition var61 = null;
//     java.lang.StringBuffer var62 = var13.format((java.lang.Object[])var56, var60, var61);
// 
//   }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test71"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    java.text.Format[] var4 = var3.getFormats();
    java.lang.String var5 = var3.toPattern();
    java.util.Locale var7 = null;
    java.util.Map var8 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7, var8);
    boolean var10 = var3.equals((java.lang.Object)var7);
    var3.applyPattern("");
    java.text.Format[] var13 = var3.getFormats();
    java.lang.String var14 = java.text.MessageFormat.format("hi!", (java.lang.Object[])var13);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test72"); }


    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8, var10);
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var8, var12);
    java.lang.String var14 = var13.toPattern();
    java.util.Map var16 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    boolean var19 = var17.equals((java.lang.Object)1L);
    java.util.Locale var20 = var17.getLocale();
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
    var17.setLocale(var35);
    java.text.Format[] var43 = var17.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.setFormats(var43);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
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
    assertNotNull(var43);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test73"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var3, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var3, "hi!");
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

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test74"); }


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
    var25.applyPattern("hi!");
    java.lang.Object var29 = var25.parseObject("hi!");
    java.util.Map var32 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var32);
    boolean var35 = var33.equals((java.lang.Object)1L);
    java.util.Locale var36 = var33.getLocale();
    java.text.Format[] var37 = var33.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var37, "");
    java.lang.String var40 = java.text.MessageFormat.format("", (java.lang.Object[])var37);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var25.setFormats(var37);
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
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + ""+ "'", var40.equals(""));

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test75"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.text.Format[] var3 = var2.getFormatsByArgumentIndex();
    java.text.Format[] var4 = var2.getFormatsByArgumentIndex();
    java.util.Map var8 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
    boolean var11 = var9.equals((java.lang.Object)1L);
    java.util.Locale var12 = var9.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var12, var14);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var20);
    boolean var23 = var21.equals((java.lang.Object)1L);
    java.util.Locale var24 = var21.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24);
    java.util.Map var26 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24, var26);
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var24, var28);
    var15.setLocale(var24);
    var2.setLocale(var24);
    java.util.Map var34 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var35 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var34);
    java.text.Format[] var36 = var35.getFormats();
    java.lang.String var37 = var35.toPattern();
    java.util.Locale var39 = null;
    java.util.Map var40 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var41 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var39, var40);
    boolean var42 = var35.equals((java.lang.Object)var39);
    var35.applyPattern("");
    boolean var46 = var35.equals((java.lang.Object)"hi!");
    var35.applyPattern("");
    java.util.Locale var49 = var35.getLocale();
    java.lang.Object var50 = var35.clone();
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
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test76"); }


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
    java.util.Locale var16 = var2.getLocale();
    java.lang.Object var17 = var2.clone();
    java.util.Locale var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19);
    java.text.Format[] var21 = var20.getFormatsByArgumentIndex();
    java.text.Format[] var22 = var20.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var22);
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test77"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    var2.applyPattern("");
    java.util.Locale var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7);
    boolean var10 = var8.equals((java.lang.Object)(byte)(-1));
    java.util.Map var16 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    boolean var19 = var17.equals((java.lang.Object)1L);
    java.util.Locale var20 = var17.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var20);
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var20, var22);
    java.util.Map var24 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var20, var24);
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var20);
    var8.setLocale(var20);
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var20);
    var28.applyPattern("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var31 = var2.format((java.lang.Object)var28);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test78"); }


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
    java.util.Map var44 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var45 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var44);
    java.text.Format[] var46 = var45.getFormats();
    java.lang.String var47 = var45.toPattern();
    java.lang.Object var48 = var45.clone();
    java.util.Map var53 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var54 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var53);
    boolean var56 = var54.equals((java.lang.Object)1L);
    java.util.Locale var57 = var54.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var58 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var57);
    java.util.Map var59 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var60 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var57, var59);
    java.util.Map var61 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var62 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var57, var61);
    var45.setLocale(var57);
    java.util.Map var64 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var65 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var57, var64);
    org.apache.commons.lang.text.ExtendedMessageFormat var66 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var57);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var66);
    boolean var68 = var28.equals((java.lang.Object)var66);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.setFormat(10, (java.text.Format)var28);
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
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + ""+ "'", var47.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test79"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    boolean var5 = var3.equals((java.lang.Object)1L);
    java.util.Locale var6 = var3.getLocale();
    java.util.Map var8 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
    java.text.Format[] var10 = var9.getFormats();
    java.lang.String var11 = var9.toPattern();
    java.lang.Object var12 = var9.clone();
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
    boolean var20 = var18.equals((java.lang.Object)1L);
    java.util.Locale var21 = var18.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var21);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var21, var23);
    java.util.Map var25 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var21, var25);
    var9.setLocale(var21);
    var3.setLocale(var21);
    java.util.Map var29 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var21, var29);
    java.util.Map var33 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var33);
    boolean var36 = var34.equals((java.lang.Object)1L);
    java.lang.Object var37 = var34.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var30.setFormatByArgumentIndex(0, (java.text.Format)var34);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test80() {}
//   public void test80() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test80"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     boolean var4 = var2.equals((java.lang.Object)1L);
//     java.util.Locale var5 = var2.getLocale();
//     java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
//     boolean var8 = var2.equals((java.lang.Object)' ');
//     var2.applyPattern("");
//     java.text.ParsePosition var12 = null;
//     java.lang.Object var13 = var2.parseObject("hi!", var12);
// 
//   }

  public void test81() {}
//   public void test81() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test81"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.text.Format[] var4 = var2.getFormats();
//     java.text.Format[] var5 = var2.getFormatsByArgumentIndex();
//     java.util.Locale var7 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7);
//     boolean var10 = var8.equals((java.lang.Object)(byte)(-1));
//     java.util.Locale var12 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var12);
//     boolean var14 = var8.equals((java.lang.Object)var12);
//     java.lang.String var15 = var8.toPattern();
//     java.util.Locale var17 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var17);
//     boolean var20 = var18.equals((java.lang.Object)(byte)(-1));
//     java.util.Map var26 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26);
//     boolean var29 = var27.equals((java.lang.Object)1L);
//     java.util.Locale var30 = var27.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var30);
//     java.util.Map var32 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var30, var32);
//     java.util.Map var34 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var35 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var30, var34);
//     org.apache.commons.lang.text.ExtendedMessageFormat var36 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var30);
//     var18.setLocale(var30);
//     var8.setLocale(var30);
//     boolean var39 = var2.equals((java.lang.Object)var8);
//     java.util.Map var44 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var45 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var44);
//     boolean var47 = var45.equals((java.lang.Object)1L);
//     java.util.Locale var48 = var45.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var49 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var48);
//     java.util.Map var50 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var51 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var48, var50);
//     java.util.Map var52 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var53 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var48, var52);
//     java.text.Format[] var54 = var53.getFormats();
//     java.lang.StringBuffer var55 = null;
//     java.text.FieldPosition var56 = null;
//     java.lang.StringBuffer var57 = var2.format((java.lang.Object[])var54, var55, var56);
// 
//   }

  public void test82() {}
//   public void test82() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test82"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
//     boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
//     java.util.Locale var5 = var2.getLocale();
//     var2.applyPattern("");
//     java.text.ParsePosition var9 = null;
//     java.lang.Object[] var10 = var2.parse("", var9);
// 
//   }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test83"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    java.text.Format[] var4 = var3.getFormats();
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    boolean var10 = var8.equals((java.lang.Object)1L);
    java.util.Locale var11 = var8.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
    var3.setLocale(var11);
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var11);
    java.util.Map var16 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    java.text.Format[] var18 = var17.getFormats();
    java.lang.String var19 = var17.toPattern();
    var17.applyPattern("hi!");
    java.text.Format[] var22 = var17.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var22, "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var14.setFormats(var22);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test84"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "", 1L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test85() {}
//   public void test85() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test85"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.util.Map var4 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
//     java.text.Format[] var6 = var5.getFormats();
//     java.util.Map var9 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
//     boolean var12 = var10.equals((java.lang.Object)1L);
//     java.util.Locale var13 = var10.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
//     var5.setLocale(var13);
//     java.util.Map var17 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var17);
//     java.util.Map var20 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var20);
//     boolean var23 = var21.equals((java.lang.Object)1L);
//     java.util.Locale var24 = var21.getLocale();
//     java.text.Format[] var25 = var21.getFormatsByArgumentIndex();
//     boolean var26 = var18.equals((java.lang.Object)var25);
//     java.lang.String var27 = var5.format((java.lang.Object)var25);
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var25);
//     java.lang.StringBuffer var29 = null;
//     java.text.FieldPosition var30 = null;
//     java.lang.StringBuffer var31 = var2.format((java.lang.Object[])var25, var29, var30);
// 
//   }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test86"); }


    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var8);
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var8, var10);
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14);
    java.text.Format[] var16 = var15.getFormats();
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19);
    boolean var22 = var20.equals((java.lang.Object)1L);
    java.util.Locale var23 = var20.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var23);
    var15.setLocale(var23);
    java.util.Map var27 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var27);
    java.util.Map var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var30);
    boolean var33 = var31.equals((java.lang.Object)1L);
    java.util.Locale var34 = var31.getLocale();
    java.text.Format[] var35 = var31.getFormatsByArgumentIndex();
    boolean var36 = var28.equals((java.lang.Object)var35);
    java.lang.String var37 = var15.format((java.lang.Object)var35);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var35);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var12.setFormatsByArgumentIndex(var35);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test87"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.lang.Object var5 = var2.clone();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    java.text.Format[] var7 = var2.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var2.parseObject("hi!");
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

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test88"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    var2.applyPattern("");
    var2.applyPattern("");
    java.util.Locale var8 = var2.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var10 = var2.parse("hi!");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test89"); }


    java.util.Locale var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var3);
    boolean var6 = var4.equals((java.lang.Object)(byte)(-1));
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    boolean var15 = var13.equals((java.lang.Object)1L);
    java.util.Locale var16 = var13.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16, var18);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var20);
    org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    var4.setLocale(var16);
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    java.util.Locale var25 = var24.getLocale();
    java.util.Map var26 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25, var26);
    java.util.Map var31 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var31);
    java.text.Format[] var33 = var32.getFormats();
    java.lang.String var34 = java.text.MessageFormat.format("", (java.lang.Object[])var33);
    java.lang.String var35 = java.text.MessageFormat.format("", (java.lang.Object[])var33);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var33);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var27.setFormatsByArgumentIndex(var33);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + ""+ "'", var34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + ""+ "'", var35.equals(""));

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test90"); }


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
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var28);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var30);
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
    boolean var57 = var30.equals((java.lang.Object)var56);
    var30.applyPattern("");
    java.lang.Object var60 = var30.clone();
    java.lang.StringBuffer var61 = null;
    java.text.FieldPosition var62 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var63 = var2.format((java.lang.Object)var30, var61, var62);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test91"); }


    java.lang.Object[] var1 = new java.lang.Object[] { "hi!"};
    org.apache.commons.lang.Validate.noNullElements(var1);
    org.apache.commons.lang.Validate.noNullElements(var1, "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test92"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    java.text.Format[] var5 = var4.getFormats();
    java.lang.String var6 = java.text.MessageFormat.format("", (java.lang.Object[])var5);
    java.lang.String var7 = java.text.MessageFormat.format("", (java.lang.Object[])var5);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var5);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test93"); }


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
    var25.applyPattern("hi!");
    java.util.Map var31 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var31);
    boolean var34 = var32.equals((java.lang.Object)1L);
    java.util.Locale var35 = var32.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var36 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var35);
    org.apache.commons.lang.text.ExtendedMessageFormat var37 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var35);
    var25.setLocale(var35);
    java.util.Map var41 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var42 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var41);
    java.text.Format[] var43 = var42.getFormats();
    var42.applyPattern("");
    var42.applyPattern("");
    java.util.Locale var48 = var42.getLocale();
    java.util.Map var49 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var50 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var48, var49);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var50, "");
    java.text.Format[] var53 = var50.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var25.setFormatsByArgumentIndex(var53);
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
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test94"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    java.text.Format[] var9 = var8.getFormats();
    java.lang.String var10 = var8.toPattern();
    java.lang.Object var11 = var8.clone();
    java.lang.String var12 = var8.toPattern();
    var8.applyPattern("hi!");
    java.lang.Object[] var16 = var8.parse("hi!");
    java.util.Locale var17 = var8.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat(100, (java.text.Format)var8);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test95"); }


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
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19);
    java.util.Locale var31 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var31);
    boolean var34 = var32.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var35 = var32.getLocale();
    var32.applyPattern("");
    var32.applyPattern("hi!");
    java.text.Format[] var40 = var32.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var40, "");
    boolean var43 = var29.equals((java.lang.Object)"");
    org.apache.commons.lang.Validate.isTrue(true, "hi!", (java.lang.Object)"");
    
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
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test96"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.text.Format[] var3 = var2.getFormatsByArgumentIndex();
    java.text.Format[] var4 = var2.getFormatsByArgumentIndex();
    java.util.Map var8 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
    boolean var11 = var9.equals((java.lang.Object)1L);
    java.util.Locale var12 = var9.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var12, var14);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var20);
    boolean var23 = var21.equals((java.lang.Object)1L);
    java.util.Locale var24 = var21.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24);
    java.util.Map var26 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24, var26);
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var24, var28);
    var15.setLocale(var24);
    var2.setLocale(var24);
    java.util.Map var33 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var33);
    java.lang.Object var35 = var34.clone();
    java.lang.StringBuffer var36 = null;
    java.text.FieldPosition var37 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var38 = var2.format(var35, var36, var37);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
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
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test97"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.lang.Object var3 = var2.clone();
    java.lang.String var4 = var2.toPattern();
    java.text.Format[] var5 = var2.getFormats();
    var2.applyPattern("hi!");
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    java.text.Format[] var12 = var11.getFormats();
    java.lang.String var13 = var11.toPattern();
    java.util.Locale var15 = null;
    java.util.Map var16 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15, var16);
    boolean var18 = var11.equals((java.lang.Object)var15);
    java.text.Format[] var19 = var11.getFormatsByArgumentIndex();
    java.util.Map var21 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var21);
    java.text.Format[] var23 = var22.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var23, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var23, "hi!");
    java.text.AttributedCharacterIterator var28 = var11.formatToCharacterIterator((java.lang.Object)var23);
    java.util.Locale var29 = var11.getLocale();
    java.util.Locale var30 = null;
    var11.setLocale(var30);
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test98"); }


    org.apache.commons.lang.Validate.isTrue(true, "", 1L);

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test99"); }


    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    java.text.Format[] var9 = var5.getFormatsByArgumentIndex();
    java.text.Format[] var10 = var5.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var5);
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
    var5.setLocale(var25);
    java.util.Map var31 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25, var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "hi!", (java.lang.Object)var32);
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test100"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.lang.Object var3 = var2.clone();
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

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test101"); }


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
    java.util.Map var24 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24);
    java.text.Format[] var26 = var25.getFormats();
    java.lang.String var27 = var25.toPattern();
    java.lang.Object var28 = var25.clone();
    java.util.Map var33 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var33);
    boolean var36 = var34.equals((java.lang.Object)1L);
    java.util.Locale var37 = var34.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var38 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var37);
    java.util.Map var39 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var40 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var37, var39);
    java.util.Map var41 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var42 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var37, var41);
    var25.setLocale(var37);
    java.util.Map var44 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var45 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var37, var44);
    org.apache.commons.lang.text.ExtendedMessageFormat var46 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var37);
    var46.applyPattern("hi!");
    java.lang.Object var50 = var46.parseObject("hi!");
    java.util.Locale var51 = var46.getLocale();
    java.lang.StringBuffer var52 = null;
    java.text.FieldPosition var53 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var54 = var2.format((java.lang.Object)var51, var52, var53);
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test102() {}
//   public void test102() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test102"); }
// 
// 
//     org.apache.commons.lang.text.ExtendedMessageFormat var1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
//     java.lang.Object[] var4 = new java.lang.Object[] { (-1)};
//     org.apache.commons.lang.Validate.noNullElements(var4);
//     java.lang.String var6 = java.text.MessageFormat.format("hi!", var4);
//     org.apache.commons.lang.Validate.noNullElements(var4);
//     org.apache.commons.lang.Validate.noNullElements(var4, "hi!");
//     org.apache.commons.lang.Validate.notNull((java.lang.Object)var4, "");
//     java.lang.StringBuffer var12 = null;
//     java.text.FieldPosition var13 = null;
//     java.lang.StringBuffer var14 = var1.format((java.lang.Object)var4, var12, var13);
// 
//   }

  public void test103() {}
//   public void test103() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test103"); }
// 
// 
//     java.util.Locale var3 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var3);
//     java.lang.Object var5 = var4.clone();
//     org.apache.commons.lang.Validate.isTrue(true, "hi!", (java.lang.Object)var4);
//     var4.applyPattern("");
//     java.text.ParsePosition var10 = null;
//     java.lang.Object[] var11 = var4.parse("", var10);
// 
//   }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test104"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var2.parseObject("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test105() {}
//   public void test105() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test105"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
//     var2.applyPattern("");
//     java.util.Locale var5 = var2.getLocale();
//     java.text.ParsePosition var7 = null;
//     java.lang.Object[] var8 = var2.parse("hi!", var7);
// 
//   }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test106"); }


    org.apache.commons.lang.Validate.notNull((java.lang.Object)(short)1);

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test107"); }


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
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var28);
    java.text.Format[] var30 = var29.getFormats();
    java.lang.String var31 = var29.toPattern();
    java.lang.Object var32 = var29.clone();
    java.util.Map var37 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var38 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var37);
    boolean var40 = var38.equals((java.lang.Object)1L);
    java.util.Locale var41 = var38.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var42 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var41);
    java.util.Map var43 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var44 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var41, var43);
    java.util.Map var45 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var46 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var41, var45);
    var29.setLocale(var41);
    java.util.Map var48 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var49 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var41, var48);
    java.util.Map var50 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var51 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var41, var50);
    org.apache.commons.lang.Validate.isTrue(true, "", (java.lang.Object)var51);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var16.setFormat(0, (java.text.Format)var51);
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
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test108"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    java.text.Format[] var5 = var4.getFormats();
    var4.applyPattern("");
    var4.applyPattern("");
    java.util.Locale var10 = var4.getLocale();
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var10, var11);
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var10);
    java.util.Locale var14 = var13.getLocale();
    java.util.Locale var16 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16);
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19);
    boolean var22 = var20.equals((java.lang.Object)1L);
    java.util.Locale var23 = var20.getLocale();
    var17.setLocale(var23);
    java.lang.StringBuffer var25 = null;
    java.text.FieldPosition var26 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var27 = var13.format((java.lang.Object)var23, var25, var26);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test109"); }


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
    java.util.Map var56 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var57 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var56);
    java.text.Format[] var58 = var57.getFormats();
    var57.applyPattern("");
    java.util.Locale var61 = var57.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var62 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var61);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var63 = var51.formatToCharacterIterator((java.lang.Object)var62);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test110() {}
//   public void test110() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test110"); }
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
//     java.lang.Object var27 = var23.clone();
//     java.text.Format[] var28 = var23.getFormatsByArgumentIndex();
//     java.text.ParsePosition var30 = null;
//     java.lang.Object var31 = var23.parseObject("hi!", var30);
// 
//   }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test111"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    java.text.Format[] var7 = var2.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
    java.text.Format[] var13 = var12.getFormats();
    java.lang.Object var14 = var12.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex((-1), (java.text.Format)var12);
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test112"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var13);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
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

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test113"); }


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
    java.text.Format[] var29 = var27.getFormatsByArgumentIndex();
    java.util.Map var32 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var32);
    boolean var35 = var33.equals((java.lang.Object)1L);
    java.util.Locale var36 = var33.getLocale();
    java.text.Format[] var37 = var33.getFormatsByArgumentIndex();
    boolean var39 = var33.equals((java.lang.Object)(short)10);
    java.text.Format[] var40 = var33.getFormats();
    java.lang.String var41 = java.text.MessageFormat.format("", (java.lang.Object[])var40);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var42 = var27.format((java.lang.Object)var41);
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
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + ""+ "'", var41.equals(""));

  }

  public void test114() {}
//   public void test114() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test114"); }
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
//     java.util.Map var23 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var23);
//     java.text.Format[] var25 = var24.getFormats();
//     var24.applyPattern("");
//     java.util.Locale var28 = var24.getLocale();
//     var7.setLocale(var28);
//     java.text.ParsePosition var31 = null;
//     java.lang.Object[] var32 = var7.parse("hi!", var31);
// 
//   }

  public void test115() {}
//   public void test115() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test115"); }
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
//     java.util.Map var15 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9, var15);
//     java.text.ParsePosition var18 = null;
//     java.lang.Object[] var19 = var16.parse("hi!", var18);
// 
//   }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test116"); }


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
    java.util.Map var53 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var54 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var53);
    java.util.Map var56 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var57 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var56);
    boolean var59 = var57.equals((java.lang.Object)1L);
    java.util.Locale var60 = var57.getLocale();
    java.text.Format[] var61 = var57.getFormatsByArgumentIndex();
    boolean var62 = var54.equals((java.lang.Object)var61);
    java.text.Format[] var63 = var54.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var25.setFormats(var63);
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
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test117"); }


    org.apache.commons.lang.Validate.isTrue(true, "hi!", (java.lang.Object)false);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test118"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    java.text.Format[] var4 = var3.getFormats();
    java.lang.String var5 = var3.toPattern();
    java.lang.Object var6 = var3.clone();
    java.lang.String var7 = var3.toPattern();
    java.text.Format[] var8 = var3.getFormats();
    java.lang.String var9 = java.text.MessageFormat.format("hi!", (java.lang.Object[])var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var8);
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
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test119"); }


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
      java.lang.Object var39 = var25.parseObject("hi!");
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

  public void test120() {}
//   public void test120() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test120"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.lang.String var4 = var2.toPattern();
//     java.lang.Object var5 = var2.clone();
//     java.lang.String var6 = var2.toPattern();
//     var2.applyPattern("hi!");
//     java.lang.Object[] var10 = var2.parse("hi!");
//     java.util.Locale var11 = var2.getLocale();
//     java.text.ParsePosition var13 = null;
//     java.lang.Object var14 = var2.parseObject("hi!", var13);
// 
//   }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test121"); }


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
    java.util.Map var58 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var59 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var58);
    boolean var61 = var59.equals((java.lang.Object)1L);
    java.util.Locale var62 = var59.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var63 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var62);
    org.apache.commons.lang.text.ExtendedMessageFormat var64 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var62);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var64);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var64);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex((-1), (java.text.Format)var64);
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
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test122"); }


    java.lang.Object[] var2 = new java.lang.Object[] { (-1)};
    org.apache.commons.lang.Validate.noNullElements(var2);
    java.lang.String var4 = java.text.MessageFormat.format("hi!", var2);
    org.apache.commons.lang.Validate.noNullElements(var2);
    org.apache.commons.lang.Validate.noNullElements(var2, "hi!");
    org.apache.commons.lang.Validate.notEmpty(var2);
    org.apache.commons.lang.Validate.noNullElements(var2);
    org.apache.commons.lang.Validate.notEmpty(var2);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test123"); }


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
    java.lang.String var22 = var16.toPattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test124"); }


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
    java.util.Map var63 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var64 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var56, var63);
    java.util.Locale var67 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var68 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var67);
    boolean var70 = var68.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var71 = var68.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var64.setFormatByArgumentIndex(0, (java.text.Format)var68);
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
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test125"); }


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
    java.util.Locale var37 = var25.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var39 = var25.parseObject("hi!");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test126"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    java.text.Format[] var4 = var3.getFormats();
    var3.applyPattern("");
    var3.applyPattern("");
    java.util.Locale var9 = var3.getLocale();
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9, var10);
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    java.text.Format[] var15 = var14.getFormats();
    var14.applyPattern("");
    var14.applyPattern("");
    boolean var20 = var11.equals((java.lang.Object)"");
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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.setFormat(0, (java.text.Format)var24);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test127() {}
//   public void test127() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test127"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.lang.String var4 = var2.toPattern();
//     var2.applyPattern("hi!");
//     java.text.Format[] var7 = var2.getFormatsByArgumentIndex();
//     var2.applyPattern("");
//     java.util.Locale var11 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
//     java.text.Format[] var13 = var12.getFormats();
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var13, "hi!");
//     java.lang.StringBuffer var16 = null;
//     java.text.FieldPosition var17 = null;
//     java.lang.StringBuffer var18 = var2.format((java.lang.Object)var13, var16, var17);
// 
//   }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test128"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    java.text.Format[] var4 = var3.getFormats();
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    boolean var10 = var8.equals((java.lang.Object)1L);
    java.util.Locale var11 = var8.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
    var3.setLocale(var11);
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var11);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)"hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test129"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    java.text.Format[] var4 = var3.getFormats();
    java.lang.String var5 = var3.toPattern();
    java.lang.Object var6 = var3.clone();
    java.lang.String var7 = var3.toPattern();
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
    boolean var14 = var12.equals((java.lang.Object)1L);
    java.util.Locale var15 = var12.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var15);
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    var3.setLocale(var15);
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    java.util.Locale var20 = var19.getLocale();
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    boolean var25 = var23.equals((java.lang.Object)1L);
    java.util.Locale var26 = var23.getLocale();
    java.text.Format[] var27 = var23.getFormatsByArgumentIndex();
    java.text.Format[] var28 = var23.getFormats();
    java.util.Locale var29 = var23.getLocale();
    boolean var30 = var19.equals((java.lang.Object)var23);
    java.lang.Object var31 = var19.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var33 = var19.parse("");
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
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test130"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    boolean var6 = var4.equals((java.lang.Object)1L);
    java.util.Locale var7 = var4.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7, var9);
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    boolean var18 = var16.equals((java.lang.Object)1L);
    java.util.Locale var19 = var16.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19);
    java.util.Map var21 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19, var21);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19, var23);
    var10.setLocale(var19);
    java.text.Format[] var26 = var10.getFormatsByArgumentIndex();
    var10.applyPattern("");
    java.util.Map var33 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var33);
    java.text.Format[] var35 = var34.getFormats();
    java.lang.String var36 = var34.toPattern();
    java.lang.Object var37 = var34.clone();
    java.util.Map var42 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var43 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var42);
    boolean var45 = var43.equals((java.lang.Object)1L);
    java.util.Locale var46 = var43.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var47 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var46);
    java.util.Map var48 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var49 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var46, var48);
    java.util.Map var50 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var51 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var46, var50);
    var34.setLocale(var46);
    java.util.Map var53 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var54 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var46, var53);
    org.apache.commons.lang.text.ExtendedMessageFormat var55 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var46);
    org.apache.commons.lang.text.ExtendedMessageFormat var56 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var46);
    java.text.Format[] var57 = var56.getFormatsByArgumentIndex();
    java.lang.String var58 = var56.toPattern();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var59 = var10.format((java.lang.Object)var58);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
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
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "hi!"+ "'", var58.equals("hi!"));

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test131"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    boolean var6 = var4.equals((java.lang.Object)1L);
    java.util.Locale var7 = var4.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7);
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var9);
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
    java.text.Format[] var35 = var18.getFormatsByArgumentIndex();
    boolean var36 = var9.equals((java.lang.Object)var35);
    java.util.Locale var38 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var39 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var38);
    java.text.Format[] var40 = var39.getFormatsByArgumentIndex();
    var39.applyPattern("hi!");
    java.lang.Object var43 = var39.clone();
    java.text.Format[] var44 = var39.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var44);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.setFormats(var44);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test132() {}
//   public void test132() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test132"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.lang.String var4 = var2.toPattern();
//     java.lang.Object var5 = var2.clone();
//     java.lang.String var6 = var2.toPattern();
//     java.text.Format[] var7 = var2.getFormats();
//     java.text.ParsePosition var9 = null;
//     java.lang.Object var10 = var2.parseObject("hi!", var9);
// 
//   }

  public void test133() {}
//   public void test133() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test133"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.lang.Object var3 = var2.clone();
//     java.text.ParsePosition var5 = null;
//     java.lang.Object[] var6 = var2.parse("hi!", var5);
// 
//   }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test134"); }


    org.apache.commons.lang.Validate.notNull((java.lang.Object)"hi!");

  }

  public void test135() {}
//   public void test135() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test135"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.text.Format[] var4 = var2.getFormats();
//     java.text.ParsePosition var6 = null;
//     java.lang.Object var7 = var2.parseObject("", var6);
// 
//   }

  public void test136() {}
//   public void test136() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test136"); }
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
//     boolean var13 = var2.equals((java.lang.Object)"hi!");
//     var2.applyPattern("");
//     var2.applyPattern("hi!");
//     var2.applyPattern("");
//     java.text.ParsePosition var21 = null;
//     java.lang.Object var22 = var2.parseObject("", var21);
// 
//   }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test137"); }


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
    java.lang.Object var30 = var2.clone();
    java.util.Locale var33 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var33);
    java.text.Format[] var35 = var34.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex((-1), (java.text.Format)var34);
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
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test138() {}
//   public void test138() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test138"); }
// 
// 
//     java.util.Map var2 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
//     boolean var5 = var3.equals((java.lang.Object)1L);
//     java.util.Locale var6 = var3.getLocale();
//     java.util.Map var8 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
//     java.text.Format[] var10 = var9.getFormats();
//     java.lang.String var11 = var9.toPattern();
//     java.lang.Object var12 = var9.clone();
//     java.util.Map var17 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
//     boolean var20 = var18.equals((java.lang.Object)1L);
//     java.util.Locale var21 = var18.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var21);
//     java.util.Map var23 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var21, var23);
//     java.util.Map var25 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var21, var25);
//     var9.setLocale(var21);
//     var3.setLocale(var21);
//     java.util.Map var29 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var21, var29);
//     java.lang.Object[] var31 = null;
//     java.lang.StringBuffer var32 = null;
//     java.text.FieldPosition var33 = null;
//     java.lang.StringBuffer var34 = var30.format(var31, var32, var33);
// 
//   }

  public void test139() {}
//   public void test139() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test139"); }
// 
// 
//     java.util.Map var2 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
//     boolean var5 = var3.equals((java.lang.Object)1L);
//     java.lang.Object var6 = var3.clone();
//     java.util.Locale var7 = var3.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7);
//     java.util.Map var12 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
//     boolean var15 = var13.equals((java.lang.Object)1L);
//     java.util.Locale var16 = var13.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
//     java.util.Map var18 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var18);
//     java.util.Map var24 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24);
//     boolean var27 = var25.equals((java.lang.Object)1L);
//     java.util.Locale var28 = var25.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var28);
//     java.util.Map var30 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var28, var30);
//     java.util.Map var32 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var33 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var28, var32);
//     var19.setLocale(var28);
//     var8.setLocale(var28);
//     java.lang.String var36 = var8.toPattern();
//     java.util.Map var38 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var39 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var38);
//     boolean var41 = var39.equals((java.lang.Object)1L);
//     java.util.Locale var42 = var39.getLocale();
//     java.text.Format[] var43 = var39.getFormats();
//     java.lang.StringBuffer var44 = null;
//     java.text.FieldPosition var45 = null;
//     java.lang.StringBuffer var46 = var8.format((java.lang.Object[])var43, var44, var45);
// 
//   }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test140"); }


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
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var56);
    org.apache.commons.lang.text.ExtendedMessageFormat var64 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var56);
    org.apache.commons.lang.text.ExtendedMessageFormat var66 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
    java.text.Format[] var67 = var66.getFormatsByArgumentIndex();
    java.util.Map var69 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var70 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var69);
    java.text.Format[] var71 = var70.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var71, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var71);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var71);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var71);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var71);
    boolean var78 = var66.equals((java.lang.Object)var71);
    boolean var79 = var64.equals((java.lang.Object)var71);
    java.lang.Object[] var83 = new java.lang.Object[] { (-1)};
    org.apache.commons.lang.Validate.noNullElements(var83);
    java.lang.String var85 = java.text.MessageFormat.format("hi!", var83);
    java.lang.String var86 = java.text.MessageFormat.format("", var83);
    org.apache.commons.lang.Validate.notEmpty(var83);
    org.apache.commons.lang.Validate.noNullElements(var83);
    java.lang.String var89 = var64.format((java.lang.Object)var83);
    
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
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + "hi!"+ "'", var85.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var86 + "' != '" + ""+ "'", var86.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var89 + "' != '" + ""+ "'", var89.equals(""));

  }

  public void test141() {}
//   public void test141() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test141"); }
// 
// 
//     java.util.Map var3 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
//     boolean var6 = var4.equals((java.lang.Object)1L);
//     java.util.Locale var7 = var4.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
//     java.util.Map var9 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7, var9);
//     java.util.Map var15 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
//     boolean var18 = var16.equals((java.lang.Object)1L);
//     java.util.Locale var19 = var16.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19);
//     java.util.Map var21 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19, var21);
//     java.util.Map var23 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19, var23);
//     var10.setLocale(var19);
//     java.text.Format[] var26 = var10.getFormatsByArgumentIndex();
//     var10.applyPattern("");
//     java.text.ParsePosition var30 = null;
//     java.lang.Object var31 = var10.parseObject("hi!", var30);
// 
//   }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test142"); }


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
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
    java.text.Format[] var25 = var24.getFormatsByArgumentIndex();
    java.util.Map var27 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27);
    java.text.Format[] var29 = var28.getFormats();
    java.util.Map var32 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var32);
    boolean var35 = var33.equals((java.lang.Object)1L);
    java.util.Locale var36 = var33.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var37 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var36);
    var28.setLocale(var36);
    java.util.Map var41 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var42 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var41);
    boolean var44 = var42.equals((java.lang.Object)1L);
    java.util.Locale var45 = var42.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var46 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var45);
    java.util.Map var48 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var49 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var48);
    java.text.Format[] var50 = var49.getFormats();
    java.util.Map var53 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var54 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var53);
    boolean var56 = var54.equals((java.lang.Object)1L);
    java.util.Locale var57 = var54.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var58 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var57);
    var49.setLocale(var57);
    var46.setLocale(var57);
    java.util.Locale var61 = var46.getLocale();
    boolean var62 = var28.equals((java.lang.Object)var46);
    boolean var63 = var24.equals((java.lang.Object)var28);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.setFormat(0, (java.text.Format)var24);
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);

  }

  public void test143() {}
//   public void test143() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test143"); }
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
//     java.lang.Object var29 = var25.parseObject("hi!");
//     java.util.Locale var30 = var25.getLocale();
//     java.util.Map var32 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var32);
//     java.text.Format[] var34 = var33.getFormats();
//     java.lang.String var35 = var33.toPattern();
//     java.util.Locale var37 = null;
//     java.util.Map var38 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var39 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var37, var38);
//     boolean var40 = var33.equals((java.lang.Object)var37);
//     var33.applyPattern("");
//     java.text.Format[] var43 = var33.getFormats();
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var43);
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var43, "hi!");
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var43, "");
//     java.lang.StringBuffer var49 = null;
//     java.text.FieldPosition var50 = null;
//     java.lang.StringBuffer var51 = var25.format((java.lang.Object)var43, var49, var50);
// 
//   }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test144"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.lang.Object var3 = var2.clone();
    java.lang.String var4 = var2.toPattern();
    java.text.Format[] var5 = var2.getFormats();
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
    java.text.Format[] var9 = var8.getFormatsByArgumentIndex();
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
    java.text.Format[] var13 = var12.getFormats();
    java.util.Map var16 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    boolean var19 = var17.equals((java.lang.Object)1L);
    java.util.Locale var20 = var17.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var20);
    var12.setLocale(var20);
    java.util.Map var25 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25);
    boolean var28 = var26.equals((java.lang.Object)1L);
    java.util.Locale var29 = var26.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var29);
    java.util.Map var32 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var32);
    java.text.Format[] var34 = var33.getFormats();
    java.util.Map var37 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var38 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var37);
    boolean var40 = var38.equals((java.lang.Object)1L);
    java.util.Locale var41 = var38.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var42 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var41);
    var33.setLocale(var41);
    var30.setLocale(var41);
    java.util.Locale var45 = var30.getLocale();
    boolean var46 = var12.equals((java.lang.Object)var30);
    boolean var47 = var8.equals((java.lang.Object)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(1, (java.text.Format)var8);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);

  }

  public void test145() {}
//   public void test145() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test145"); }
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
//     org.apache.commons.lang.Validate.notNull((java.lang.Object)var2, "");
//     java.text.ParsePosition var22 = null;
//     java.lang.Object var23 = var2.parseObject("", var22);
// 
//   }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test146"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.lang.Object var3 = var2.clone();
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

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test147"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.lang.Object var5 = var2.clone();
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
    org.apache.commons.lang.text.ExtendedMessageFormat var43 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
    boolean var44 = var8.equals((java.lang.Object)var43);
    java.util.Map var46 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var47 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var46);
    boolean var49 = var47.equals((java.lang.Object)1L);
    java.util.Locale var50 = var47.getLocale();
    boolean var51 = var8.equals((java.lang.Object)var50);
    java.text.Format[] var52 = var8.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var52);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test148"); }


    java.util.Locale var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var4);
    boolean var7 = var5.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var8 = var5.getLocale();
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    boolean var13 = var11.equals((java.lang.Object)1L);
    java.util.Locale var14 = var11.getLocale();
    java.text.Format[] var15 = var11.getFormatsByArgumentIndex();
    java.text.Format[] var16 = var11.getFormats();
    java.text.AttributedCharacterIterator var17 = var5.formatToCharacterIterator((java.lang.Object)var16);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var23);
    boolean var26 = var24.equals((java.lang.Object)1L);
    java.util.Locale var27 = var24.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27);
    java.util.Map var29 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27, var29);
    java.util.Map var31 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var27, var31);
    java.util.Map var33 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var27, var33);
    var5.setLocale(var27);
    java.util.Map var37 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var38 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var37);
    boolean var40 = var38.equals((java.lang.Object)1L);
    java.util.Locale var41 = var38.getLocale();
    java.text.Format[] var42 = var38.getFormatsByArgumentIndex();
    java.text.Format[] var43 = var38.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var38);
    java.util.Locale var46 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var47 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var46);
    boolean var49 = var47.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var50 = var47.getLocale();
    java.util.Map var54 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var55 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var54);
    boolean var57 = var55.equals((java.lang.Object)1L);
    java.util.Locale var58 = var55.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var59 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var58);
    java.util.Map var60 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var61 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var58, var60);
    var47.setLocale(var58);
    var38.setLocale(var58);
    var5.setLocale(var58);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var58);
    org.apache.commons.lang.text.ExtendedMessageFormat var66 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var58);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "hi!", (java.lang.Object)"");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test149"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    boolean var6 = var4.equals((java.lang.Object)1L);
    java.util.Locale var7 = var4.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7);
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)"", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test150"); }


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
    java.lang.Object var48 = var2.clone();
    java.util.Map var50 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var51 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var50);
    java.text.Format[] var52 = var51.getFormats();
    java.lang.String var53 = var51.toPattern();
    java.util.Locale var55 = null;
    java.util.Map var56 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var57 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var55, var56);
    boolean var58 = var51.equals((java.lang.Object)var55);
    var51.applyPattern("");
    java.text.Format[] var61 = var51.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var61);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var61);
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
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + ""+ "'", var53.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test151"); }


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
    java.util.Map var26 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26);
    java.text.Format[] var28 = var27.getFormats();
    java.util.Map var31 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var31);
    boolean var34 = var32.equals((java.lang.Object)1L);
    java.util.Locale var35 = var32.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var36 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var35);
    var27.setLocale(var35);
    java.text.Format[] var38 = var27.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var23.setFormat(0, (java.text.Format)var27);
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
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test152"); }


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
    java.util.Locale var17 = var14.getLocale();
    java.text.Format[] var18 = var14.getFormatsByArgumentIndex();
    boolean var20 = var14.equals((java.lang.Object)(short)10);
    java.text.Format[] var21 = var14.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var21);
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test153"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.util.Locale var3 = var2.getLocale();
    var2.applyPattern("");
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    java.text.Format[] var9 = var8.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var9, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var9);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var9);
    java.text.AttributedCharacterIterator var14 = var2.formatToCharacterIterator((java.lang.Object)var9);
    java.text.Format[] var15 = var2.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var15);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test154"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    var2.applyPattern("");
    var2.applyPattern("");
    java.util.Locale var8 = var2.getLocale();
    java.util.Locale var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var10);
    boolean var13 = var11.equals((java.lang.Object)(byte)(-1));
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19);
    boolean var22 = var20.equals((java.lang.Object)1L);
    java.util.Locale var23 = var20.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var23);
    java.util.Map var25 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var23, var25);
    java.util.Map var27 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var23, var27);
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var23);
    var11.setLocale(var23);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var11, "");
    java.util.Locale var33 = var11.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var34 = var2.format((java.lang.Object)var33);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test155() {}
//   public void test155() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test155"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     boolean var4 = var2.equals((java.lang.Object)1L);
//     java.util.Locale var5 = var2.getLocale();
//     java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
//     var2.applyPattern("");
//     java.util.Locale var10 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var10);
//     boolean var13 = var11.equals((java.lang.Object)(byte)(-1));
//     java.util.Locale var14 = var11.getLocale();
//     var11.applyPattern("");
//     boolean var18 = var11.equals((java.lang.Object)(byte)100);
//     java.text.Format[] var19 = var11.getFormatsByArgumentIndex();
//     java.lang.StringBuffer var20 = null;
//     java.text.FieldPosition var21 = null;
//     java.lang.StringBuffer var22 = var2.format((java.lang.Object)var19, var20, var21);
// 
//   }

  public void test156() {}
//   public void test156() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test156"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     boolean var4 = var2.equals((java.lang.Object)1L);
//     java.util.Locale var5 = var2.getLocale();
//     java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
//     java.text.Format[] var7 = var2.getFormats();
//     org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
//     java.text.ParsePosition var10 = null;
//     java.lang.Object var11 = var2.parseObject("hi!", var10);
// 
//   }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test157"); }


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
    java.lang.Object var27 = var23.clone();
    java.util.Map var29 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var29);
    java.text.Format[] var31 = var30.getFormats();
    var30.applyPattern("");
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var30);
    java.util.Locale var37 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var38 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var37);
    java.text.Format[] var39 = var38.getFormats();
    java.lang.String var40 = java.text.MessageFormat.format("hi!", (java.lang.Object[])var39);
    java.lang.String var41 = var30.format((java.lang.Object)var39);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var39);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var39);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var39);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var23.setFormatsByArgumentIndex(var39);
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
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + ""+ "'", var41.equals(""));

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test158"); }


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
    boolean var15 = var13.equals((java.lang.Object)1L);
    java.util.Locale var16 = var13.getLocale();
    java.text.Format[] var17 = var13.getFormatsByArgumentIndex();
    java.text.Format[] var18 = var13.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var13);
    java.util.Locale var20 = null;
    var13.setLocale(var20);
    java.lang.Object var22 = var13.clone();
    java.util.Locale var23 = var13.getLocale();
    java.text.Format[] var24 = var13.getFormatsByArgumentIndex();
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test159() {}
//   public void test159() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test159"); }
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
//     java.util.Map var15 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9, var15);
//     java.lang.String var17 = var16.toPattern();
//     java.text.ParsePosition var19 = null;
//     java.lang.Object var20 = var16.parseObject("", var19);
// 
//   }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test160"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    java.text.Format[] var7 = var2.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
    java.util.Locale var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var12);
    boolean var15 = var13.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var16 = var13.getLocale();
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
    boolean var21 = var19.equals((java.lang.Object)1L);
    java.util.Locale var22 = var19.getLocale();
    java.text.Format[] var23 = var19.getFormatsByArgumentIndex();
    java.text.Format[] var24 = var19.getFormats();
    java.text.AttributedCharacterIterator var25 = var13.formatToCharacterIterator((java.lang.Object)var24);
    java.util.Map var31 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var31);
    boolean var34 = var32.equals((java.lang.Object)1L);
    java.util.Locale var35 = var32.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var36 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var35);
    java.util.Map var37 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var38 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var35, var37);
    java.util.Map var39 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var40 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var35, var39);
    java.util.Map var41 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var42 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var35, var41);
    var13.setLocale(var35);
    java.util.Map var45 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var46 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var45);
    boolean var48 = var46.equals((java.lang.Object)1L);
    java.util.Locale var49 = var46.getLocale();
    java.text.Format[] var50 = var46.getFormatsByArgumentIndex();
    java.text.Format[] var51 = var46.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var46);
    java.util.Locale var54 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var55 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var54);
    boolean var57 = var55.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var58 = var55.getLocale();
    java.util.Map var62 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var63 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var62);
    boolean var65 = var63.equals((java.lang.Object)1L);
    java.util.Locale var66 = var63.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var67 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var66);
    java.util.Map var68 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var69 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var66, var68);
    var55.setLocale(var66);
    var46.setLocale(var66);
    var13.setLocale(var66);
    org.apache.commons.lang.text.ExtendedMessageFormat var73 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var66);
    java.lang.Object var74 = var73.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(10, (java.text.Format)var73);
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test161"); }


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
    java.lang.Object[] var59 = new java.lang.Object[] { var28};
    org.apache.commons.lang.Validate.notEmpty(var59, "");
    org.apache.commons.lang.Validate.notEmpty(var59);
    boolean var63 = var25.equals((java.lang.Object)var59);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var63);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);

  }

  public void test162() {}
//   public void test162() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test162"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
//     boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
//     java.util.Locale var5 = var2.getLocale();
//     var2.applyPattern("");
//     java.util.Locale var9 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9);
//     boolean var12 = var10.equals((java.lang.Object)(byte)(-1));
//     java.util.Locale var13 = var10.getLocale();
//     java.util.Map var15 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
//     boolean var18 = var16.equals((java.lang.Object)1L);
//     java.util.Locale var19 = var16.getLocale();
//     java.text.Format[] var20 = var16.getFormatsByArgumentIndex();
//     java.text.Format[] var21 = var16.getFormats();
//     java.text.AttributedCharacterIterator var22 = var10.formatToCharacterIterator((java.lang.Object)var21);
//     java.lang.StringBuffer var23 = null;
//     java.text.FieldPosition var24 = null;
//     java.lang.StringBuffer var25 = var2.format((java.lang.Object[])var21, var23, var24);
// 
//   }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test163"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    var2.applyPattern("");
    var2.applyPattern("");
    java.util.Locale var8 = var2.getLocale();
    java.lang.Object var9 = null;
    java.lang.String var10 = var2.format(var9);
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    boolean var15 = var13.equals((java.lang.Object)1L);
    java.util.Locale var16 = var13.getLocale();
    java.text.Format[] var17 = var13.getFormatsByArgumentIndex();
    boolean var19 = var13.equals((java.lang.Object)(short)10);
    java.text.Format[] var20 = var13.getFormatsByArgumentIndex();
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test164"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    java.text.Format[] var4 = var3.getFormats();
    java.lang.String var5 = var3.toPattern();
    java.lang.Object var6 = var3.clone();
    java.lang.String var7 = var3.toPattern();
    var3.applyPattern("hi!");
    java.lang.Object[] var11 = var3.parse("hi!");
    java.util.Locale var12 = var3.getLocale();
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var12, var13);
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
    org.apache.commons.lang.text.ExtendedMessageFormat var40 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var32, var39);
    org.apache.commons.lang.text.ExtendedMessageFormat var41 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var32);
    org.apache.commons.lang.text.ExtendedMessageFormat var42 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var32);
    java.text.Format[] var43 = var42.getFormatsByArgumentIndex();
    java.text.Format[] var44 = var42.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var44, "");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var14.setFormatsByArgumentIndex(var44);
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
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test165"); }


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
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var22, "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var22);
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

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test166"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Map var8 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
    java.text.Format[] var10 = var9.getFormats();
    java.lang.String var11 = var9.toPattern();
    java.lang.Object var12 = var9.clone();
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
    boolean var20 = var18.equals((java.lang.Object)1L);
    java.util.Locale var21 = var18.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var21);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var21, var23);
    java.util.Map var25 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var21, var25);
    var9.setLocale(var21);
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var21, var28);
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var21);
    var2.setLocale(var21);
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
    boolean var55 = var2.equals((java.lang.Object)var39);
    java.util.Map var57 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var58 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var57);
    java.lang.Object var59 = var58.clone();
    java.util.Locale var61 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var62 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var61);
    java.text.Format[] var63 = var62.getFormatsByArgumentIndex();
    var62.applyPattern("hi!");
    java.lang.Object var66 = var62.clone();
    java.util.Map var69 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var70 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var69);
    boolean var72 = var70.equals((java.lang.Object)1L);
    java.util.Locale var73 = var70.getLocale();
    java.text.Format[] var74 = var70.getFormatsByArgumentIndex();
    java.lang.String var75 = java.text.MessageFormat.format("hi!", (java.lang.Object[])var74);
    boolean var76 = var62.equals((java.lang.Object)var74);
    boolean var77 = var58.equals((java.lang.Object)var74);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var39.setFormatsByArgumentIndex(var74);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
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
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "hi!"+ "'", var75.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test167"); }


    java.lang.Object[] var1 = new java.lang.Object[] { "hi!"};
    org.apache.commons.lang.Validate.noNullElements(var1);
    org.apache.commons.lang.Validate.noNullElements(var1);
    org.apache.commons.lang.Validate.notEmpty(var1, "");
    org.apache.commons.lang.Validate.notEmpty(var1, "hi!");
    org.apache.commons.lang.Validate.noNullElements(var1, "hi!");
    org.apache.commons.lang.Validate.notEmpty(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test168() {}
//   public void test168() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test168"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.util.Locale var3 = var2.getLocale();
//     var2.applyPattern("");
//     java.util.Map var7 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
//     java.text.Format[] var9 = var8.getFormats();
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var9, "");
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var9);
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var9);
//     java.text.AttributedCharacterIterator var14 = var2.formatToCharacterIterator((java.lang.Object)var9);
//     java.text.ParsePosition var16 = null;
//     java.lang.Object[] var17 = var2.parse("hi!", var16);
// 
//   }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test169"); }


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
    java.util.Map var41 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var42 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var41);
    java.util.Map var44 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var45 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var44);
    boolean var47 = var45.equals((java.lang.Object)1L);
    java.util.Locale var48 = var45.getLocale();
    java.text.Format[] var49 = var45.getFormatsByArgumentIndex();
    boolean var50 = var42.equals((java.lang.Object)var49);
    java.lang.String var51 = java.text.MessageFormat.format("", (java.lang.Object[])var49);
    java.lang.String var52 = java.text.MessageFormat.format("", (java.lang.Object[])var49);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var49);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var49);
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
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + ""+ "'", var51.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + ""+ "'", var52.equals(""));

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test170"); }


    java.lang.Object[] var1 = null;
    java.lang.String var2 = java.text.MessageFormat.format("", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test171"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    boolean var6 = var4.equals((java.lang.Object)1L);
    java.util.Locale var7 = var4.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7);
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7, var9);
    java.util.Locale var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var12);
    boolean var15 = var13.equals((java.lang.Object)(byte)(-1));
    java.util.Map var21 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var21);
    boolean var24 = var22.equals((java.lang.Object)1L);
    java.util.Locale var25 = var22.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25);
    java.util.Map var27 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25, var27);
    java.util.Map var29 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var25, var29);
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25);
    var13.setLocale(var25);
    boolean var33 = var10.equals((java.lang.Object)var13);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var36 = var10.parse("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test172"); }


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
    java.lang.Object var48 = var2.clone();
    java.lang.String var49 = var2.toPattern();
    java.util.Map var52 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var53 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var52);
    java.text.Format[] var54 = var53.getFormats();
    java.lang.String var55 = var53.toPattern();
    java.util.Locale var57 = null;
    java.util.Map var58 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var59 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var57, var58);
    boolean var60 = var53.equals((java.lang.Object)var57);
    java.text.Format[] var61 = var53.getFormatsByArgumentIndex();
    java.util.Map var63 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var64 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var63);
    java.text.Format[] var65 = var64.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var65, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var65, "hi!");
    java.text.AttributedCharacterIterator var70 = var53.formatToCharacterIterator((java.lang.Object)var65);
    java.util.Locale var71 = var53.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat(0, (java.text.Format)var53);
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
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!"+ "'", var49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + ""+ "'", var55.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test173"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    java.text.Format[] var4 = var3.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var4, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var4);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var4);
    java.lang.String var9 = java.text.MessageFormat.format("hi!", (java.lang.Object[])var4);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var9, "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test174"); }


    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8, var10);
    java.util.Locale var12 = var11.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    java.text.Format[] var14 = var13.getFormats();
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var17);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var20);
    boolean var23 = var21.equals((java.lang.Object)1L);
    java.util.Locale var24 = var21.getLocale();
    java.text.Format[] var25 = var21.getFormatsByArgumentIndex();
    boolean var26 = var18.equals((java.lang.Object)var25);
    java.text.Format[] var27 = var18.getFormatsByArgumentIndex();
    java.lang.String var28 = java.text.MessageFormat.format("", (java.lang.Object[])var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.setFormats(var27);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test175"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.text.Format[] var3 = var2.getFormatsByArgumentIndex();
    java.text.Format[] var4 = var2.getFormatsByArgumentIndex();
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    boolean var12 = var10.equals((java.lang.Object)1L);
    java.util.Locale var13 = var10.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13, var15);
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var13, var17);
    java.text.Format[] var19 = var18.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var19);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test176"); }


    java.lang.Object[] var2 = new java.lang.Object[] { "hi!"};
    org.apache.commons.lang.Validate.noNullElements(var2);
    org.apache.commons.lang.Validate.noNullElements(var2);
    org.apache.commons.lang.Validate.notEmpty(var2, "");
    java.lang.String var7 = java.text.MessageFormat.format("", var2);
    org.apache.commons.lang.Validate.noNullElements(var2, "hi!");
    org.apache.commons.lang.Validate.notNull((java.lang.Object)"hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test177"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var5 = var2.getLocale();
    var2.applyPattern("");
    var2.applyPattern("hi!");
    java.lang.Object var11 = var2.parseObject("hi!");
    java.util.Locale var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    java.lang.Object var15 = var14.clone();
    java.lang.String var16 = var14.toPattern();
    java.text.Format[] var17 = var14.getFormats();
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19);
    java.text.Format[] var21 = var20.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var21, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var21, "hi!");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var21, "hi!");
    java.text.AttributedCharacterIterator var28 = var14.formatToCharacterIterator((java.lang.Object)var21);
    java.lang.String var29 = var14.toPattern();
    java.util.Map var31 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var31);
    boolean var34 = var32.equals((java.lang.Object)1L);
    java.lang.Object var35 = var32.clone();
    var32.applyPattern("");
    java.util.Locale var38 = var32.getLocale();
    java.util.Map var42 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var43 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var42);
    boolean var45 = var43.equals((java.lang.Object)1L);
    java.util.Locale var46 = var43.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var47 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var46);
    java.util.Map var48 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var49 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var46, var48);
    var32.setLocale(var46);
    var14.setLocale(var46);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var52 = var2.format((java.lang.Object)var46);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test178"); }


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
    java.lang.Object var46 = var44.parseObject("hi!");
    java.text.Format[] var47 = var44.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var47);
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
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test179"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.lang.Object var5 = var2.clone();
    java.util.Locale var6 = var2.getLocale();
    java.text.Format[] var7 = var2.getFormatsByArgumentIndex();
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var11);
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14);
    boolean var17 = var15.equals((java.lang.Object)1L);
    java.util.Locale var18 = var15.getLocale();
    java.text.Format[] var19 = var15.getFormatsByArgumentIndex();
    boolean var20 = var12.equals((java.lang.Object)var19);
    java.lang.String var21 = java.text.MessageFormat.format("", (java.lang.Object[])var19);
    java.lang.String var22 = java.text.MessageFormat.format("", (java.lang.Object[])var19);
    java.lang.StringBuffer var23 = null;
    java.text.FieldPosition var24 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var25 = var2.format((java.lang.Object)"", var23, var24);
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
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test180"); }


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
    java.util.Map var29 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var29);
    boolean var32 = var30.equals((java.lang.Object)1L);
    java.util.Locale var33 = var30.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var33);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var35 = var25.format((java.lang.Object)"");
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
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test181() {}
//   public void test181() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test181"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     boolean var4 = var2.equals((java.lang.Object)1L);
//     java.util.Locale var5 = var2.getLocale();
//     java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
//     boolean var8 = var2.equals((java.lang.Object)(short)10);
//     java.text.Format[] var9 = var2.getFormats();
//     java.util.Map var12 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
//     boolean var15 = var13.equals((java.lang.Object)1L);
//     java.util.Locale var16 = var13.getLocale();
//     java.text.Format[] var17 = var13.getFormatsByArgumentIndex();
//     boolean var19 = var13.equals((java.lang.Object)(short)10);
//     java.text.Format[] var20 = var13.getFormats();
//     java.lang.String var21 = java.text.MessageFormat.format("", (java.lang.Object[])var20);
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var20);
//     java.lang.StringBuffer var23 = null;
//     java.text.FieldPosition var24 = null;
//     java.lang.StringBuffer var25 = var2.format((java.lang.Object[])var20, var23, var24);
// 
//   }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test182"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    boolean var6 = var4.equals((java.lang.Object)1L);
    java.util.Locale var7 = var4.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7, var9);
    java.util.Locale var11 = var10.getLocale();
    java.util.Locale var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var13);
    java.text.Format[] var15 = var14.getFormatsByArgumentIndex();
    var14.applyPattern("hi!");
    java.lang.Object var18 = var14.clone();
    java.text.Format[] var19 = var14.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.setFormats(var19);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test183() {}
//   public void test183() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test183"); }
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
//     var26.applyPattern("hi!");
//     java.util.Map var32 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var32);
//     boolean var35 = var33.equals((java.lang.Object)1L);
//     java.util.Locale var36 = var33.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var37 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var36);
//     org.apache.commons.lang.text.ExtendedMessageFormat var38 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var36);
//     var26.setLocale(var36);
//     java.util.Map var40 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var41 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var36, var40);
//     java.lang.String var42 = var41.toPattern();
//     java.text.ParsePosition var44 = null;
//     java.lang.Object var45 = var41.parseObject("", var44);
// 
//   }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test184"); }


    java.util.Locale var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var3);
    java.text.Format[] var5 = var4.getFormatsByArgumentIndex();
    var4.applyPattern("hi!");
    org.apache.commons.lang.Validate.isTrue(true, "", (java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test185"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    var2.applyPattern("");
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
    java.util.Map var8 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
    boolean var11 = var9.equals((java.lang.Object)1L);
    java.util.Locale var12 = var9.getLocale();
    java.text.Format[] var13 = var9.getFormatsByArgumentIndex();
    java.text.Format[] var14 = var9.getFormats();
    java.text.AttributedCharacterIterator var15 = var2.formatToCharacterIterator((java.lang.Object)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var14, "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test186"); }


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
    java.text.Format[] var21 = var2.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var23 = var2.parseObject("hi!");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test187() {}
//   public void test187() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test187"); }
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
//     var2.applyPattern("");
//     java.text.ParsePosition var25 = null;
//     java.lang.Object var26 = var2.parseObject("", var25);
// 
//   }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test188"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.lang.Object var5 = var2.clone();
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

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test189"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var2);
    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    boolean var8 = var6.equals((java.lang.Object)1L);
    java.util.Locale var9 = var6.getLocale();
    java.text.Format[] var10 = var6.getFormatsByArgumentIndex();
    boolean var11 = var3.equals((java.lang.Object)var10);
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
    org.apache.commons.lang.text.ExtendedMessageFormat var35 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27, var34);
    var3.setLocale(var27);
    java.lang.Object var38 = var3.parseObject("hi!");
    java.util.Map var41 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var42 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var41);
    java.text.Format[] var43 = var42.getFormats();
    java.lang.String var44 = java.text.MessageFormat.format("", (java.lang.Object[])var43);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var43);
    java.text.AttributedCharacterIterator var46 = var3.formatToCharacterIterator((java.lang.Object)var43);
    java.lang.Object var47 = var3.clone();
    java.util.Locale var48 = var3.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var49 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var48);
    java.util.Locale var52 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var53 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var52);
    java.text.Format[] var54 = var53.getFormatsByArgumentIndex();
    var53.applyPattern("hi!");
    java.lang.Object var57 = var53.clone();
    java.util.Map var60 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var61 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var60);
    boolean var63 = var61.equals((java.lang.Object)1L);
    java.util.Locale var64 = var61.getLocale();
    java.text.Format[] var65 = var61.getFormatsByArgumentIndex();
    java.lang.String var66 = java.text.MessageFormat.format("hi!", (java.lang.Object[])var65);
    boolean var67 = var53.equals((java.lang.Object)var65);
    var53.applyPattern("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var49.setFormat(0, (java.text.Format)var53);
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
    assertTrue(var11 == false);
    
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
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + ""+ "'", var44.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "hi!"+ "'", var66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test190"); }


    java.util.Locale var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var4);
    java.lang.Object var6 = var5.clone();
    org.apache.commons.lang.Validate.isTrue(true, "hi!", (java.lang.Object)var5);
    java.text.Format[] var8 = var5.getFormatsByArgumentIndex();
    java.lang.String var9 = java.text.MessageFormat.format("hi!", (java.lang.Object[])var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var8, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test191"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    java.text.Format[] var4 = var3.getFormats();
    java.lang.String var5 = var3.toPattern();
    java.lang.Object var6 = var3.clone();
    java.lang.String var7 = var3.toPattern();
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
    boolean var14 = var12.equals((java.lang.Object)1L);
    java.util.Locale var15 = var12.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var15);
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    var3.setLocale(var15);
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var21 = var19.parseObject("");
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
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test192"); }


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
    java.util.Map var40 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var41 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var40);
    boolean var43 = var41.equals((java.lang.Object)1L);
    java.util.Locale var44 = var41.getLocale();
    boolean var45 = var2.equals((java.lang.Object)var44);
    java.util.Locale var47 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var48 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var47);
    java.text.Format[] var49 = var48.getFormatsByArgumentIndex();
    java.text.Format[] var50 = var48.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var50, "");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var50);
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
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test193"); }


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
    java.text.Format var17 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var15.setFormat((-1), var17);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test194"); }


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
      java.lang.Object[] var28 = var25.parse("");
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

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test195"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    java.text.Format[] var4 = var3.getFormats();
    java.lang.String var5 = var3.toPattern();
    java.lang.Object var6 = var3.clone();
    java.lang.String var7 = var3.toPattern();
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
    boolean var14 = var12.equals((java.lang.Object)1L);
    java.util.Locale var15 = var12.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var15);
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    var3.setLocale(var15);
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    java.util.Locale var20 = var19.getLocale();
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    boolean var25 = var23.equals((java.lang.Object)1L);
    java.util.Locale var26 = var23.getLocale();
    java.text.Format[] var27 = var23.getFormatsByArgumentIndex();
    java.text.Format[] var28 = var23.getFormats();
    java.util.Locale var29 = var23.getLocale();
    boolean var30 = var19.equals((java.lang.Object)var23);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);

  }

  public void test196() {}
//   public void test196() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test196"); }
// 
// 
//     java.util.Map var2 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
//     java.text.Format[] var4 = var3.getFormats();
//     java.lang.String var5 = var3.toPattern();
//     java.lang.Object var6 = var3.clone();
//     java.lang.String var7 = var3.toPattern();
//     var3.applyPattern("hi!");
//     java.lang.Object[] var11 = var3.parse("hi!");
//     java.util.Locale var12 = var3.getLocale();
//     java.util.Map var13 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var12, var13);
//     java.lang.String var15 = var14.toPattern();
//     java.text.ParsePosition var17 = null;
//     java.lang.Object[] var18 = var14.parse("hi!", var17);
// 
//   }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test197"); }


    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8, var10);
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var8, var12);
    java.lang.String var14 = var13.toPattern();
    var13.applyPattern("");
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
    java.text.Format[] var20 = var19.getFormats();
    var19.applyPattern("");
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var19);
    java.lang.Object var24 = null;
    boolean var25 = var19.equals(var24);
    java.util.Locale var26 = var19.getLocale();
    var13.setLocale(var26);
    java.util.Locale var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var30);
    boolean var33 = var31.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var34 = var31.getLocale();
    var31.applyPattern("");
    var31.applyPattern("hi!");
    java.text.Format[] var39 = var31.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.setFormatByArgumentIndex(100, (java.text.Format)var31);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test198"); }


    org.apache.commons.lang.Validate.isTrue(true, "", (-1L));

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test199"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.lang.Object var5 = var2.clone();
    var2.applyPattern("");
    java.text.Format[] var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var8);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test200() {}
//   public void test200() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test200"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     boolean var4 = var2.equals((java.lang.Object)1L);
//     java.lang.Object var5 = var2.clone();
//     java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
//     java.text.Format[] var7 = var2.getFormats();
//     org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
//     java.text.Format[] var10 = var9.getFormatsByArgumentIndex();
//     java.util.Map var12 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
//     java.text.Format[] var14 = var13.getFormats();
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var14, "");
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var14);
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var14);
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var14);
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var14);
//     boolean var21 = var9.equals((java.lang.Object)var14);
//     java.lang.StringBuffer var22 = null;
//     java.text.FieldPosition var23 = null;
//     java.lang.StringBuffer var24 = var2.format((java.lang.Object[])var14, var22, var23);
// 
//   }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test201"); }


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
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var56);
    org.apache.commons.lang.text.ExtendedMessageFormat var64 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var56);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var66 = var64.formatToCharacterIterator((java.lang.Object)(short)100);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
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

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test202"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    boolean var9 = var7.equals((java.lang.Object)1L);
    java.util.Locale var10 = var7.getLocale();
    java.text.Format[] var11 = var7.getFormatsByArgumentIndex();
    java.text.Format[] var12 = var7.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var7);
    java.util.Locale var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var15);
    boolean var18 = var16.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var19 = var16.getLocale();
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var23);
    boolean var26 = var24.equals((java.lang.Object)1L);
    java.util.Locale var27 = var24.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27);
    java.util.Map var29 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27, var29);
    var16.setLocale(var27);
    var7.setLocale(var27);
    java.util.Map var33 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27, var33);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var35 = var2.formatToCharacterIterator((java.lang.Object)var27);
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test203() {}
//   public void test203() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test203"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
//     java.util.Map var4 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
//     boolean var7 = var5.equals((java.lang.Object)1L);
//     java.util.Locale var8 = var5.getLocale();
//     var2.setLocale(var8);
//     java.lang.Object var10 = var2.clone();
//     java.lang.Object var11 = var2.clone();
//     java.text.ParsePosition var13 = null;
//     java.lang.Object[] var14 = var2.parse("hi!", var13);
// 
//   }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test204"); }


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
    java.util.Map var27 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27);
    boolean var30 = var28.equals((java.lang.Object)1L);
    java.lang.Object var31 = var28.clone();
    var28.applyPattern("");
    java.util.Locale var34 = var28.getLocale();
    java.util.Map var38 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var39 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var38);
    boolean var41 = var39.equals((java.lang.Object)1L);
    java.util.Locale var42 = var39.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var43 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var42);
    java.util.Map var44 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var45 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var42, var44);
    var28.setLocale(var42);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var47 = var2.formatToCharacterIterator((java.lang.Object)var28);
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
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test205"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    boolean var6 = var4.equals((java.lang.Object)1L);
    java.util.Locale var7 = var4.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7, var9);
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    boolean var18 = var16.equals((java.lang.Object)1L);
    java.util.Locale var19 = var16.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19);
    java.util.Map var21 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19, var21);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19, var23);
    java.lang.String var25 = var24.toPattern();
    boolean var26 = var10.equals((java.lang.Object)var25);
    java.util.Map var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var30);
    boolean var33 = var31.equals((java.lang.Object)1L);
    java.util.Locale var34 = var31.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var35 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var34);
    java.util.Map var36 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var37 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var34, var36);
    java.util.Locale var39 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var40 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var39);
    boolean var42 = var40.equals((java.lang.Object)(byte)(-1));
    java.util.Map var48 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var49 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var48);
    boolean var51 = var49.equals((java.lang.Object)1L);
    java.util.Locale var52 = var49.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var53 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var52);
    java.util.Map var54 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var55 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var52, var54);
    java.util.Map var56 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var57 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var52, var56);
    org.apache.commons.lang.text.ExtendedMessageFormat var58 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var52);
    var40.setLocale(var52);
    boolean var60 = var37.equals((java.lang.Object)var40);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var61 = var10.formatToCharacterIterator((java.lang.Object)var60);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
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
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test206"); }


    org.apache.commons.lang.Validate.notNull((java.lang.Object)10.0f);

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test207"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    java.lang.Object var5 = var2.clone();
    java.util.Locale var6 = var2.getLocale();
    java.util.Locale var7 = var2.getLocale();
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
    java.util.Map var37 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var38 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var37);
    boolean var40 = var38.equals((java.lang.Object)1L);
    java.util.Locale var41 = var38.getLocale();
    java.text.Format[] var42 = var38.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var42, "");
    boolean var45 = var35.equals((java.lang.Object)var42);
    java.lang.String var46 = var35.toPattern();
    java.util.Map var51 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var52 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var51);
    boolean var54 = var52.equals((java.lang.Object)1L);
    java.util.Locale var55 = var52.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var56 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var55);
    java.util.Map var57 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var58 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var55, var57);
    java.util.Map var59 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var60 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var55, var59);
    var35.setLocale(var55);
    org.apache.commons.lang.text.ExtendedMessageFormat var62 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var55);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat(0, (java.text.Format)var62);
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
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
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
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + ""+ "'", var46.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test208"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var3, "");
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var3, "hi!");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var3);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var3);
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

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test209"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    var2.applyPattern("");
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
    java.util.Map var8 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
    boolean var11 = var9.equals((java.lang.Object)1L);
    java.util.Locale var12 = var9.getLocale();
    java.text.Format[] var13 = var9.getFormatsByArgumentIndex();
    java.text.Format[] var14 = var9.getFormats();
    java.text.AttributedCharacterIterator var15 = var2.formatToCharacterIterator((java.lang.Object)var14);
    java.util.Locale var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var18);
    boolean var21 = var19.equals((java.lang.Object)(byte)(-1));
    java.util.Map var27 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27);
    boolean var30 = var28.equals((java.lang.Object)1L);
    java.util.Locale var31 = var28.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var31);
    java.util.Map var33 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var31, var33);
    java.util.Map var35 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var36 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var31, var35);
    org.apache.commons.lang.text.ExtendedMessageFormat var37 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var31);
    var19.setLocale(var31);
    org.apache.commons.lang.text.ExtendedMessageFormat var39 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var31);
    var2.setLocale(var31);
    java.util.Locale var42 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var43 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var42);
    java.lang.Object var44 = var43.clone();
    java.lang.String var45 = var43.toPattern();
    java.text.Format[] var46 = var43.getFormats();
    java.util.Map var48 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var49 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var48);
    java.text.Format[] var50 = var49.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var50, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var50, "hi!");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var50, "hi!");
    java.text.AttributedCharacterIterator var57 = var43.formatToCharacterIterator((java.lang.Object)var50);
    java.lang.String var58 = var43.toPattern();
    java.lang.StringBuffer var59 = null;
    java.text.FieldPosition var60 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var61 = var2.format((java.lang.Object)var43, var59, var60);
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + ""+ "'", var45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + ""+ "'", var58.equals(""));

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test210"); }


    java.util.Locale var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var2);
    boolean var5 = var3.equals((java.lang.Object)(byte)(-1));
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    boolean var12 = var10.equals((java.lang.Object)1L);
    java.util.Locale var13 = var10.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var13);
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var13, var15);
    var3.setLocale(var13);
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13, var18);
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
    java.lang.Object var46 = var44.parseObject("hi!");
    java.text.Format[] var47 = var44.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var19.setFormat(1, (java.text.Format)var44);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
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
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test211"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var6);
    boolean var8 = var2.equals((java.lang.Object)var6);
    java.lang.String var9 = var2.toPattern();
    java.util.Locale var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var11);
    boolean var14 = var12.equals((java.lang.Object)(byte)(-1));
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var20);
    boolean var23 = var21.equals((java.lang.Object)1L);
    java.util.Locale var24 = var21.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24);
    java.util.Map var26 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24, var26);
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var24, var28);
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24);
    var12.setLocale(var24);
    var2.setLocale(var24);
    java.lang.String var33 = var2.toPattern();
    java.util.Map var35 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var36 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var35);
    java.util.Map var38 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var39 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var38);
    boolean var41 = var39.equals((java.lang.Object)1L);
    java.util.Locale var42 = var39.getLocale();
    java.text.Format[] var43 = var39.getFormatsByArgumentIndex();
    boolean var44 = var36.equals((java.lang.Object)var43);
    java.util.Map var47 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var48 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var47);
    java.text.Format[] var49 = var48.getFormats();
    java.lang.String var50 = var48.toPattern();
    java.lang.Object var51 = var48.clone();
    java.util.Map var56 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var57 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var56);
    boolean var59 = var57.equals((java.lang.Object)1L);
    java.util.Locale var60 = var57.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var61 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var60);
    java.util.Map var62 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var63 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var60, var62);
    java.util.Map var64 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var65 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var60, var64);
    var48.setLocale(var60);
    java.util.Map var67 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var68 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var60, var67);
    var36.setLocale(var60);
    org.apache.commons.lang.text.ExtendedMessageFormat var71 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
    boolean var72 = var36.equals((java.lang.Object)var71);
    java.util.Locale var75 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var76 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var75);
    java.util.Map var78 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var79 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var78);
    boolean var81 = var79.equals((java.lang.Object)1L);
    java.util.Locale var82 = var79.getLocale();
    var76.setLocale(var82);
    org.apache.commons.lang.text.ExtendedMessageFormat var84 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var82);
    java.lang.Object var85 = var84.clone();
    java.util.Map var87 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var88 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var87);
    boolean var90 = var88.equals((java.lang.Object)1L);
    java.util.Locale var91 = var88.getLocale();
    java.text.Format[] var92 = var88.getFormatsByArgumentIndex();
    java.text.Format[] var93 = var88.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var93);
    java.text.AttributedCharacterIterator var95 = var84.formatToCharacterIterator((java.lang.Object)var93);
    java.util.Locale var96 = var84.getLocale();
    boolean var97 = var36.equals((java.lang.Object)var84);
    boolean var98 = var2.equals((java.lang.Object)var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + ""+ "'", var50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var98 == false);

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test212"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    var2.setLocale(var8);
    java.lang.Object var10 = var2.clone();
    java.text.Format[] var11 = var2.getFormats();
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
    java.lang.StringBuffer var33 = null;
    java.text.FieldPosition var34 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var35 = var2.format((java.lang.Object)var14, var33, var34);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
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

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test213"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    java.text.Format[] var9 = var5.getFormatsByArgumentIndex();
    boolean var10 = var2.equals((java.lang.Object)var9);
    java.text.Format[] var11 = var2.getFormatsByArgumentIndex();
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    boolean var16 = var14.equals((java.lang.Object)1L);
    java.lang.Object var17 = var14.clone();
    var14.applyPattern("");
    java.text.Format[] var20 = var14.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var20, "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var23 = var2.formatToCharacterIterator((java.lang.Object)"hi!");
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test214"); }


    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var4);
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    boolean var10 = var8.equals((java.lang.Object)1L);
    java.util.Locale var11 = var8.getLocale();
    java.text.Format[] var12 = var8.getFormatsByArgumentIndex();
    boolean var13 = var5.equals((java.lang.Object)var12);
    java.lang.String var14 = java.text.MessageFormat.format("", (java.lang.Object[])var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "hi!", (java.lang.Object)"");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test215"); }


    java.lang.Object var2 = null;
    org.apache.commons.lang.Validate.isTrue(true, "hi!", var2);

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test216"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.text.Format[] var4 = var2.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test217"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    boolean var6 = var4.equals((java.lang.Object)1L);
    java.util.Locale var7 = var4.getLocale();
    java.text.Format[] var8 = var4.getFormatsByArgumentIndex();
    boolean var10 = var4.equals((java.lang.Object)' ');
    java.lang.Object var11 = var4.clone();
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
    boolean var20 = var18.equals((java.lang.Object)1L);
    java.util.Locale var21 = var18.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var21);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var21, var23);
    java.util.Map var25 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var21, var25);
    java.util.Map var27 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var21, var27);
    var4.setLocale(var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "hi!", (java.lang.Object)var21);
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test218() {}
//   public void test218() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test218"); }
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
//     java.util.Locale var13 = var11.getLocale();
//     java.text.ParsePosition var15 = null;
//     java.lang.Object var16 = var11.parseObject("", var15);
// 
//   }

  public void test219() {}
//   public void test219() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test219"); }
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
//     java.text.Format[] var29 = var27.getFormatsByArgumentIndex();
//     java.text.Format[] var30 = var27.getFormatsByArgumentIndex();
//     java.util.Map var32 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var33 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var32);
//     java.util.Map var35 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var36 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var35);
//     boolean var38 = var36.equals((java.lang.Object)1L);
//     java.util.Locale var39 = var36.getLocale();
//     java.text.Format[] var40 = var36.getFormatsByArgumentIndex();
//     boolean var41 = var33.equals((java.lang.Object)var40);
//     java.util.Map var44 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var45 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var44);
//     java.text.Format[] var46 = var45.getFormats();
//     java.lang.String var47 = var45.toPattern();
//     java.lang.Object var48 = var45.clone();
//     java.util.Map var53 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var54 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var53);
//     boolean var56 = var54.equals((java.lang.Object)1L);
//     java.util.Locale var57 = var54.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var58 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var57);
//     java.util.Map var59 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var60 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var57, var59);
//     java.util.Map var61 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var62 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var57, var61);
//     var45.setLocale(var57);
//     java.util.Map var64 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var65 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var57, var64);
//     var33.setLocale(var57);
//     java.lang.Object var68 = var33.parseObject("hi!");
//     java.util.Map var71 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var72 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var71);
//     java.text.Format[] var73 = var72.getFormats();
//     java.lang.String var74 = java.text.MessageFormat.format("", (java.lang.Object[])var73);
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var73);
//     java.text.AttributedCharacterIterator var76 = var33.formatToCharacterIterator((java.lang.Object)var73);
//     java.text.Format[] var77 = var33.getFormatsByArgumentIndex();
//     java.lang.StringBuffer var78 = null;
//     java.text.FieldPosition var79 = null;
//     java.lang.StringBuffer var80 = var27.format((java.lang.Object[])var77, var78, var79);
// 
//   }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test220"); }


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
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    boolean var25 = var23.equals((java.lang.Object)1L);
    java.util.Locale var26 = var23.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26);
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26, var28);
    java.util.Locale var30 = var29.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var30);
    java.text.Format[] var32 = var31.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var16.setFormatsByArgumentIndex(var32);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test221"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    boolean var6 = var4.equals((java.lang.Object)1L);
    java.util.Locale var7 = var4.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7);
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var9);
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
    java.text.Format[] var35 = var18.getFormatsByArgumentIndex();
    boolean var36 = var9.equals((java.lang.Object)var35);
    var9.applyPattern("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var40 = var9.parseObject("hi!");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test222"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    boolean var6 = var4.equals((java.lang.Object)1L);
    java.lang.Object var7 = var4.clone();
    java.text.Format[] var8 = var4.getFormatsByArgumentIndex();
    java.text.Format[] var9 = var4.getFormats();
    java.lang.String var10 = java.text.MessageFormat.format("hi!", (java.lang.Object[])var9);
    java.lang.String var11 = java.text.MessageFormat.format("hi!", (java.lang.Object[])var9);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var9, "");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var9);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test223"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    java.text.Format[] var4 = var3.getFormats();
    java.lang.String var5 = var3.toPattern();
    java.lang.Object var6 = var3.clone();
    java.lang.String var7 = var3.toPattern();
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
    boolean var14 = var12.equals((java.lang.Object)1L);
    java.util.Locale var15 = var12.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var15);
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    var3.setLocale(var15);
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var15, var19);
    java.util.Locale var25 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var25);
    java.text.Format[] var27 = var26.getFormats();
    org.apache.commons.lang.Validate.isTrue(true, "", (java.lang.Object)var27);
    java.lang.String var29 = java.text.MessageFormat.format("hi!", (java.lang.Object[])var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var20.setFormatsByArgumentIndex(var27);
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
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test224"); }


    org.apache.commons.lang.text.ExtendedMessageFormat var1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
    java.text.Format[] var2 = var1.getFormatsByArgumentIndex();
    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    java.text.Format[] var6 = var5.getFormats();
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    boolean var12 = var10.equals((java.lang.Object)1L);
    java.util.Locale var13 = var10.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    var5.setLocale(var13);
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
    boolean var21 = var19.equals((java.lang.Object)1L);
    java.util.Locale var22 = var19.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var22);
    java.util.Map var25 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25);
    java.text.Format[] var27 = var26.getFormats();
    java.util.Map var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var30);
    boolean var33 = var31.equals((java.lang.Object)1L);
    java.util.Locale var34 = var31.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var35 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var34);
    var26.setLocale(var34);
    var23.setLocale(var34);
    java.util.Locale var38 = var23.getLocale();
    boolean var39 = var5.equals((java.lang.Object)var23);
    boolean var40 = var1.equals((java.lang.Object)var5);
    java.util.Map var43 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var44 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var43);
    java.text.Format[] var45 = var44.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setFormat(0, (java.text.Format)var44);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test225() {}
//   public void test225() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test225"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     boolean var4 = var2.equals((java.lang.Object)1L);
//     java.util.Locale var5 = var2.getLocale();
//     java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
//     boolean var8 = var2.equals((java.lang.Object)' ');
//     java.lang.Object var9 = var2.clone();
//     java.util.Map var15 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
//     boolean var18 = var16.equals((java.lang.Object)1L);
//     java.util.Locale var19 = var16.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19);
//     java.util.Map var21 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19, var21);
//     java.util.Map var23 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19, var23);
//     java.util.Map var25 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19, var25);
//     var2.setLocale(var19);
//     org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
//     java.text.Format[] var30 = var29.getFormatsByArgumentIndex();
//     java.text.AttributedCharacterIterator var31 = var2.formatToCharacterIterator((java.lang.Object)var30);
//     java.text.ParsePosition var33 = null;
//     java.lang.Object var34 = var2.parseObject("", var33);
// 
//   }

  public void test226() {}
//   public void test226() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test226"); }
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
//     java.lang.Object var29 = var25.parseObject("", var28);
// 
//   }

  public void test227() {}
//   public void test227() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test227"); }
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
//     java.lang.String var25 = var2.toPattern();
//     java.util.Locale var26 = var2.getLocale();
//     java.text.ParsePosition var28 = null;
//     java.lang.Object var29 = var2.parseObject("", var28);
// 
//   }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test228"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var49 = var2.parse("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
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

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test229"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.util.Locale var3 = var2.getLocale();
    var2.applyPattern("");
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    java.text.Format[] var9 = var8.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var9, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var9);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var9);
    java.text.AttributedCharacterIterator var14 = var2.formatToCharacterIterator((java.lang.Object)var9);
    java.text.Format[] var15 = var2.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var17 = var2.parseObject("hi!");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test230"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    java.text.Format[] var5 = var4.getFormats();
    java.util.Map var8 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
    boolean var11 = var9.equals((java.lang.Object)1L);
    java.util.Locale var12 = var9.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    var4.setLocale(var12);
    java.util.Map var16 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16);
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19);
    boolean var22 = var20.equals((java.lang.Object)1L);
    java.util.Locale var23 = var20.getLocale();
    java.text.Format[] var24 = var20.getFormatsByArgumentIndex();
    boolean var25 = var17.equals((java.lang.Object)var24);
    java.lang.String var26 = var4.format((java.lang.Object)var24);
    java.lang.Object var27 = var4.clone();
    java.text.Format[] var28 = var4.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "", (java.lang.Object)var28);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test231() {}
//   public void test231() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test231"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.util.Locale var3 = var2.getLocale();
//     var2.applyPattern("");
//     java.text.ParsePosition var7 = null;
//     java.lang.Object var8 = var2.parseObject("hi!", var7);
// 
//   }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test232"); }


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
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    boolean var25 = var23.equals((java.lang.Object)1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var26 = var2.formatToCharacterIterator((java.lang.Object)1L);
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
    assertTrue(var25 == false);

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test233"); }


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
    org.apache.commons.lang.text.ExtendedMessageFormat var49 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var48);
    java.text.Format[] var50 = var49.getFormats();
    java.lang.String var51 = var49.toPattern();
    java.lang.Object var52 = var49.clone();
    java.util.Map var57 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var58 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var57);
    boolean var60 = var58.equals((java.lang.Object)1L);
    java.util.Locale var61 = var58.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var62 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var61);
    java.util.Map var63 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var64 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var61, var63);
    java.util.Map var65 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var66 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var61, var65);
    var49.setLocale(var61);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(1, (java.text.Format)var49);
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
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + ""+ "'", var51.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test234"); }


    java.util.Locale var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var2);
    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    boolean var8 = var6.equals((java.lang.Object)1L);
    java.util.Locale var9 = var6.getLocale();
    var3.setLocale(var9);
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9, var11);
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
    boolean var20 = var18.equals((java.lang.Object)1L);
    java.util.Locale var21 = var18.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var21);
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var21);
    java.util.Map var27 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27);
    java.text.Format[] var29 = var28.getFormats();
    java.lang.String var30 = var28.toPattern();
    java.lang.Object var31 = var28.clone();
    java.util.Map var36 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var37 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var36);
    boolean var39 = var37.equals((java.lang.Object)1L);
    java.util.Locale var40 = var37.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var41 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var40);
    java.util.Map var42 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var43 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var40, var42);
    java.util.Map var44 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var45 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var40, var44);
    var28.setLocale(var40);
    java.util.Map var47 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var48 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var40, var47);
    org.apache.commons.lang.text.ExtendedMessageFormat var49 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var40);
    java.util.Map var51 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var52 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var51);
    boolean var54 = var52.equals((java.lang.Object)1L);
    java.util.Locale var55 = var52.getLocale();
    java.text.Format[] var56 = var52.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var56, "");
    boolean var59 = var49.equals((java.lang.Object)var56);
    java.lang.String var60 = var49.toPattern();
    java.util.Map var65 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var66 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var65);
    boolean var68 = var66.equals((java.lang.Object)1L);
    java.util.Locale var69 = var66.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var70 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var69);
    java.util.Map var71 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var72 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var69, var71);
    java.util.Map var73 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var74 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var69, var73);
    var49.setLocale(var69);
    java.lang.String var76 = var49.toPattern();
    boolean var77 = var23.equals((java.lang.Object)var49);
    java.util.Map var82 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var83 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var82);
    boolean var85 = var83.equals((java.lang.Object)1L);
    java.util.Locale var86 = var83.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var87 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var86);
    java.util.Map var88 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var89 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var86, var88);
    java.util.Map var90 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var91 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var86, var90);
    java.lang.Object var92 = var91.clone();
    java.util.Locale var93 = var91.getLocale();
    var23.setLocale(var93);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var12.setFormatByArgumentIndex(100, (java.text.Format)var23);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + ""+ "'", var60.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + ""+ "'", var76.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);

  }

  public void test235() {}
//   public void test235() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test235"); }
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
//     java.util.Map var22 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var22);
//     java.util.Map var25 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25);
//     boolean var28 = var26.equals((java.lang.Object)1L);
//     java.util.Locale var29 = var26.getLocale();
//     java.text.Format[] var30 = var26.getFormatsByArgumentIndex();
//     boolean var31 = var23.equals((java.lang.Object)var30);
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var30, "");
//     java.lang.StringBuffer var34 = null;
//     java.text.FieldPosition var35 = null;
//     java.lang.StringBuffer var36 = var2.format((java.lang.Object[])var30, var34, var35);
// 
//   }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test236"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.lang.Object var3 = var2.clone();
    java.lang.String var4 = var2.toPattern();
    java.text.Format[] var5 = var2.getFormats();
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    java.text.Format[] var9 = var8.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var9, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var9, "hi!");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var9, "hi!");
    java.text.AttributedCharacterIterator var16 = var2.formatToCharacterIterator((java.lang.Object)var9);
    java.util.Locale var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var18);
    java.util.Map var21 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var21);
    boolean var24 = var22.equals((java.lang.Object)1L);
    java.util.Locale var25 = var22.getLocale();
    var19.setLocale(var25);
    java.lang.Object var27 = var19.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var28 = var2.format(var27);
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test237"); }


    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8, var10);
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var8, var12);
    java.lang.String var14 = var13.toPattern();
    var13.applyPattern("");
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19);
    java.text.Format[] var21 = var20.getFormats();
    java.lang.Object var22 = var20.clone();
    var20.applyPattern("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.setFormat(1, (java.text.Format)var20);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test238"); }


    java.lang.Object[] var3 = new java.lang.Object[] { "hi!"};
    org.apache.commons.lang.Validate.noNullElements(var3);
    org.apache.commons.lang.Validate.isTrue(true, "hi!", (java.lang.Object)var3);
    org.apache.commons.lang.Validate.noNullElements(var3);
    org.apache.commons.lang.Validate.notEmpty(var3, "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test239"); }


    java.util.Locale var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var2);
    boolean var5 = var3.equals((java.lang.Object)(byte)(-1));
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
    boolean var14 = var12.equals((java.lang.Object)1L);
    java.util.Locale var15 = var12.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15, var17);
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var15, var19);
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    var3.setLocale(var15);
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    java.util.Locale var24 = var23.getLocale();
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var28);
    java.text.Format[] var30 = var29.getFormats();
    java.lang.String var31 = var29.toPattern();
    java.lang.Object var32 = var29.clone();
    java.lang.String var33 = var29.toPattern();
    var29.applyPattern("hi!");
    java.lang.Object[] var37 = var29.parse("hi!");
    java.util.Locale var38 = var29.getLocale();
    java.util.Map var39 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var40 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var38, var39);
    java.lang.Object var41 = var40.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var23.setFormatByArgumentIndex(0, (java.text.Format)var40);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test240"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.lang.Object var3 = var2.clone();
    java.lang.String var4 = var2.toPattern();
    java.text.Format[] var5 = var2.getFormats();
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    java.text.Format[] var9 = var8.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var9, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var9, "hi!");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var9, "hi!");
    java.text.AttributedCharacterIterator var16 = var2.formatToCharacterIterator((java.lang.Object)var9);
    java.lang.String var17 = var2.toPattern();
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19);
    boolean var22 = var20.equals((java.lang.Object)1L);
    java.lang.Object var23 = var20.clone();
    var20.applyPattern("");
    java.util.Locale var26 = var20.getLocale();
    java.util.Map var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var30);
    boolean var33 = var31.equals((java.lang.Object)1L);
    java.util.Locale var34 = var31.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var35 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var34);
    java.util.Map var36 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var37 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var34, var36);
    var20.setLocale(var34);
    var2.setLocale(var34);
    java.util.Map var41 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var42 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var41);
    java.text.Format[] var43 = var42.getFormats();
    var42.applyPattern("");
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var42);
    java.util.Locale var49 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var50 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var49);
    java.text.Format[] var51 = var50.getFormats();
    java.lang.String var52 = java.text.MessageFormat.format("hi!", (java.lang.Object[])var51);
    java.lang.String var53 = var42.format((java.lang.Object)var51);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var51);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var51);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var51);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var51);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + ""+ "'", var53.equals(""));

  }

  public void test241() {}
//   public void test241() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test241"); }
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
//     java.util.Map var15 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9, var15);
//     org.apache.commons.lang.Validate.notNull((java.lang.Object)var16);
//     java.util.Map var19 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19);
//     boolean var21 = var16.equals((java.lang.Object)var20);
//     java.util.Map var23 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var23);
//     boolean var26 = var24.equals((java.lang.Object)1L);
//     java.lang.Object var27 = var24.clone();
//     java.text.Format[] var28 = var24.getFormatsByArgumentIndex();
//     java.text.Format[] var29 = var24.getFormats();
//     java.lang.StringBuffer var30 = null;
//     java.text.FieldPosition var31 = null;
//     java.lang.StringBuffer var32 = var20.format((java.lang.Object[])var29, var30, var31);
// 
//   }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test242"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.lang.Object var5 = var2.clone();
    var2.applyPattern("");
    java.util.Locale var8 = var2.getLocale();
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
    var34.applyPattern("hi!");
    java.util.Map var40 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var41 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var40);
    boolean var43 = var41.equals((java.lang.Object)1L);
    java.util.Locale var44 = var41.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var45 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var44);
    org.apache.commons.lang.text.ExtendedMessageFormat var46 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var44);
    var34.setLocale(var44);
    java.text.Format[] var48 = var34.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var48);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test243() {}
//   public void test243() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test243"); }
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
//     java.util.Map var21 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var21);
//     boolean var24 = var22.equals((java.lang.Object)1L);
//     java.util.Locale var25 = var22.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25);
//     java.util.Map var27 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25, var27);
//     var2.setLocale(var25);
//     java.text.ParsePosition var31 = null;
//     java.lang.Object[] var32 = var2.parse("", var31);
// 
//   }

  public void test244() {}
//   public void test244() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test244"); }
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
//     java.lang.Object var37 = null;
//     java.lang.StringBuffer var38 = null;
//     java.text.FieldPosition var39 = null;
//     java.lang.StringBuffer var40 = var2.format(var37, var38, var39);
// 
//   }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test245"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.text.Format[] var4 = var2.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var6 = var2.parse("hi!");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test246"); }


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
    java.util.Map var32 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var32);
    java.text.Format[] var34 = var33.getFormats();
    java.lang.String var35 = var33.toPattern();
    java.lang.Object var36 = var33.clone();
    java.util.Map var41 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var42 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var41);
    boolean var44 = var42.equals((java.lang.Object)1L);
    java.util.Locale var45 = var42.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var46 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var45);
    java.util.Map var47 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var48 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var45, var47);
    java.util.Map var49 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var50 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var45, var49);
    var33.setLocale(var45);
    java.util.Map var52 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var53 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var45, var52);
    org.apache.commons.lang.text.ExtendedMessageFormat var54 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var45);
    var54.applyPattern("hi!");
    java.util.Map var60 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var61 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var60);
    boolean var63 = var61.equals((java.lang.Object)1L);
    java.util.Locale var64 = var61.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var65 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var64);
    org.apache.commons.lang.text.ExtendedMessageFormat var66 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var64);
    var54.setLocale(var64);
    java.text.Format[] var68 = var54.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var27.setFormatsByArgumentIndex(var68);
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
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + ""+ "'", var35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);

  }

  public void test247() {}
//   public void test247() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test247"); }
// 
// 
//     java.util.Locale var3 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var3);
//     java.lang.Object var5 = var4.clone();
//     org.apache.commons.lang.Validate.isTrue(true, "hi!", (java.lang.Object)var4);
//     org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
//     boolean var9 = var4.equals((java.lang.Object)"");
//     org.apache.commons.lang.Validate var10 = new org.apache.commons.lang.Validate();
//     org.apache.commons.lang.Validate.notNull((java.lang.Object)var10, "hi!");
//     boolean var13 = var4.equals((java.lang.Object)var10);
//     java.text.ParsePosition var15 = null;
//     java.lang.Object var16 = var4.parseObject("", var15);
// 
//   }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test248"); }


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
    java.util.Locale var16 = var2.getLocale();
    java.lang.Object var17 = var2.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var19 = var2.parse("");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test249"); }


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
    java.util.Locale var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var28);
    java.util.Map var31 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var31);
    boolean var34 = var32.equals((java.lang.Object)1L);
    java.util.Locale var35 = var32.getLocale();
    var29.setLocale(var35);
    org.apache.commons.lang.text.ExtendedMessageFormat var37 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var35);
    java.lang.Object var38 = var37.clone();
    java.util.Locale var39 = var37.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var40 = var2.formatToCharacterIterator((java.lang.Object)var37);
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
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test250() {}
//   public void test250() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test250"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
//     java.text.Format[] var3 = var2.getFormatsByArgumentIndex();
//     java.lang.String var4 = var2.toPattern();
//     java.util.Locale var6 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
//     java.lang.Object var8 = var7.clone();
//     java.lang.String var9 = var7.toPattern();
//     java.text.Format[] var10 = var7.getFormats();
//     var7.applyPattern("hi!");
//     java.lang.Object[] var14 = var7.parse("hi!");
//     java.lang.StringBuffer var15 = null;
//     java.text.FieldPosition var16 = null;
//     java.lang.StringBuffer var17 = var2.format(var14, var15, var16);
// 
//   }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test251"); }


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
      java.lang.Object[] var25 = var23.parse("hi!");
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

  }

  public void test252() {}
//   public void test252() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test252"); }
// 
// 
//     java.util.Locale var3 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var3);
//     java.lang.Object var5 = var4.clone();
//     org.apache.commons.lang.Validate.isTrue(true, "hi!", (java.lang.Object)var4);
//     java.lang.Object var7 = null;
//     java.lang.String var8 = var4.format(var7);
//     java.util.Locale var10 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var10);
//     java.text.Format[] var12 = var11.getFormatsByArgumentIndex();
//     java.text.Format[] var13 = var11.getFormats();
//     java.lang.StringBuffer var14 = null;
//     java.text.FieldPosition var15 = null;
//     java.lang.StringBuffer var16 = var4.format((java.lang.Object)var13, var14, var15);
// 
//   }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test253"); }


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
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    java.text.Format[] var24 = var23.getFormats();
    var23.applyPattern("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat((-1), (java.text.Format)var23);
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
    assertNotNull(var24);

  }

  public void test254() {}
//   public void test254() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test254"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
//     boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
//     java.util.Locale var5 = var2.getLocale();
//     var2.applyPattern("");
//     java.text.ParsePosition var9 = null;
//     java.lang.Object var10 = var2.parseObject("", var9);
// 
//   }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test255"); }


    java.util.Locale var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var3);
    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    boolean var9 = var7.equals((java.lang.Object)1L);
    java.util.Locale var10 = var7.getLocale();
    var4.setLocale(var10);
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var10, var12);
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    java.util.Map var16 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    java.text.Format[] var18 = var17.getFormats();
    java.util.Map var21 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var21);
    boolean var24 = var22.equals((java.lang.Object)1L);
    java.util.Locale var25 = var22.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25);
    var17.setLocale(var25);
    java.util.Map var29 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var29);
    java.util.Map var32 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var32);
    boolean var35 = var33.equals((java.lang.Object)1L);
    java.util.Locale var36 = var33.getLocale();
    java.text.Format[] var37 = var33.getFormatsByArgumentIndex();
    boolean var38 = var30.equals((java.lang.Object)var37);
    java.lang.String var39 = var17.format((java.lang.Object)var37);
    java.text.Format[] var40 = var17.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var14.setFormats(var40);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + ""+ "'", var39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test256"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    boolean var6 = var4.equals((java.lang.Object)1L);
    java.lang.Object var7 = var4.clone();
    java.text.Format[] var8 = var4.getFormatsByArgumentIndex();
    java.text.Format[] var9 = var4.getFormats();
    java.lang.String var10 = java.text.MessageFormat.format("hi!", (java.lang.Object[])var9);
    java.lang.String var11 = java.text.MessageFormat.format("hi!", (java.lang.Object[])var9);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var9);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test257"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.lang.Object var3 = var2.clone();
    java.text.Format[] var4 = var2.getFormats();
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    java.text.Format[] var9 = var8.getFormats();
    var8.applyPattern("");
    java.util.Locale var12 = var8.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(100, (java.text.Format)var8);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test258"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.lang.Object var5 = var2.clone();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.text.Format[] var11 = var10.getFormats();
    java.lang.String var12 = var10.toPattern();
    java.util.Locale var14 = null;
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14, var15);
    boolean var17 = var10.equals((java.lang.Object)var14);
    boolean var18 = var2.equals((java.lang.Object)var14);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var20);
    boolean var23 = var21.equals((java.lang.Object)1L);
    java.util.Locale var24 = var21.getLocale();
    java.text.Format[] var25 = var21.getFormatsByArgumentIndex();
    java.text.Format[] var26 = var21.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var21);
    java.util.Locale var29 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var29);
    boolean var32 = var30.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var33 = var30.getLocale();
    java.util.Map var37 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var38 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var37);
    boolean var40 = var38.equals((java.lang.Object)1L);
    java.util.Locale var41 = var38.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var42 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var41);
    java.util.Map var43 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var44 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var41, var43);
    var30.setLocale(var41);
    var21.setLocale(var41);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var21, "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var49 = var2.format((java.lang.Object)var21);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test259() {}
//   public void test259() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test259"); }
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
//     java.util.Map var19 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var15, var19);
//     java.lang.Object[] var21 = null;
//     java.lang.StringBuffer var22 = null;
//     java.text.FieldPosition var23 = null;
//     java.lang.StringBuffer var24 = var20.format(var21, var22, var23);
// 
//   }

  public void test260() {}
//   public void test260() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test260"); }
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
//     java.text.Format[] var29 = var27.getFormatsByArgumentIndex();
//     java.text.Format[] var30 = var27.getFormatsByArgumentIndex();
//     java.text.ParsePosition var32 = null;
//     java.lang.Object var33 = var27.parseObject("", var32);
// 
//   }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test261"); }


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
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var13, "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var18 = var13.parse("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test262() {}
//   public void test262() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test262"); }
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
//     java.util.Locale var21 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var21);
//     java.text.Format[] var23 = var22.getFormatsByArgumentIndex();
//     java.text.Format[] var24 = var22.getFormatsByArgumentIndex();
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var24, "");
//     java.lang.StringBuffer var27 = null;
//     java.text.FieldPosition var28 = null;
//     java.lang.StringBuffer var29 = var10.format((java.lang.Object[])var24, var27, var28);
// 
//   }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test263"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.text.Format[] var4 = var2.getFormats();
    java.text.Format[] var5 = var2.getFormatsByArgumentIndex();
    java.lang.String var6 = var2.toPattern();
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    java.text.Format[] var11 = var10.getFormats();
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14);
    boolean var17 = var15.equals((java.lang.Object)1L);
    java.util.Locale var18 = var15.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
    var10.setLocale(var18);
    java.text.Format[] var21 = var10.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat((-1), (java.text.Format)var10);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test264"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    var2.applyPattern("hi!");
    java.text.Format[] var7 = var2.getFormats();
    java.lang.Object var9 = var2.parseObject("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var2.parseObject("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test265() {}
//   public void test265() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test265"); }
// 
// 
//     java.util.Map var2 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
//     boolean var5 = var3.equals((java.lang.Object)1L);
//     java.lang.Object var6 = var3.clone();
//     java.util.Locale var7 = var3.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7);
//     java.util.Map var12 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
//     boolean var15 = var13.equals((java.lang.Object)1L);
//     java.util.Locale var16 = var13.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
//     java.util.Map var18 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var18);
//     java.util.Map var24 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24);
//     boolean var27 = var25.equals((java.lang.Object)1L);
//     java.util.Locale var28 = var25.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var28);
//     java.util.Map var30 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var28, var30);
//     java.util.Map var32 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var33 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var28, var32);
//     var19.setLocale(var28);
//     var8.setLocale(var28);
//     java.text.ParsePosition var37 = null;
//     java.lang.Object[] var38 = var8.parse("", var37);
// 
//   }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test266"); }


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
    java.text.Format[] var30 = var2.getFormatsByArgumentIndex();
    java.util.Locale var34 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var35 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var34);
    java.lang.Object var36 = var35.clone();
    org.apache.commons.lang.Validate.isTrue(true, "hi!", (java.lang.Object)var35);
    java.lang.Object var38 = null;
    java.lang.String var39 = var35.format(var38);
    java.lang.StringBuffer var40 = null;
    java.text.FieldPosition var41 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var42 = var2.format((java.lang.Object)var35, var40, var41);
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test267"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    boolean var8 = var2.equals((java.lang.Object)' ');
    java.lang.Object var9 = var2.clone();
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    boolean var18 = var16.equals((java.lang.Object)1L);
    java.util.Locale var19 = var16.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19);
    java.util.Map var21 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19, var21);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19, var23);
    java.util.Map var25 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19, var25);
    var2.setLocale(var19);
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
    java.text.Format[] var30 = var29.getFormatsByArgumentIndex();
    java.text.AttributedCharacterIterator var31 = var2.formatToCharacterIterator((java.lang.Object)var30);
    java.util.Map var36 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var37 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var36);
    java.text.Format[] var38 = var37.getFormats();
    java.lang.String var39 = var37.toPattern();
    java.lang.Object var40 = var37.clone();
    java.util.Map var45 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var46 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var45);
    boolean var48 = var46.equals((java.lang.Object)1L);
    java.util.Locale var49 = var46.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var50 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var49);
    java.util.Map var51 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var52 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var49, var51);
    java.util.Map var53 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var54 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var49, var53);
    var37.setLocale(var49);
    java.util.Map var56 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var57 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var49, var56);
    org.apache.commons.lang.text.ExtendedMessageFormat var58 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var49);
    java.util.Map var60 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var61 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var60);
    boolean var63 = var61.equals((java.lang.Object)1L);
    java.util.Locale var64 = var61.getLocale();
    java.text.Format[] var65 = var61.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var65, "");
    boolean var68 = var58.equals((java.lang.Object)var65);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat(0, (java.text.Format)var58);
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
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + ""+ "'", var39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test268"); }


    org.apache.commons.lang.Validate.isTrue(true, "hi!", (java.lang.Object)(-1.0d));

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test269"); }


    java.util.Locale var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var3);
    boolean var6 = var4.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var8 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var8);
    boolean var10 = var4.equals((java.lang.Object)var8);
    java.lang.String var11 = var4.toPattern();
    java.util.Locale var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var13);
    boolean var16 = var14.equals((java.lang.Object)(byte)(-1));
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    boolean var25 = var23.equals((java.lang.Object)1L);
    java.util.Locale var26 = var23.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26);
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26, var28);
    java.util.Map var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var26, var30);
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26);
    var14.setLocale(var26);
    var4.setLocale(var26);
    java.lang.String var35 = var4.toPattern();
    org.apache.commons.lang.Validate.isTrue(true, "", (java.lang.Object)var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test270"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var5 = var2.getLocale();
    var2.applyPattern("");
    var2.applyPattern("hi!");
    java.text.Format[] var10 = var2.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var10, "");
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

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test271"); }


    org.apache.commons.lang.Validate.isTrue(true, "hi!", 0.0d);

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test272"); }


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
    java.util.Locale var16 = var2.getLocale();
    java.lang.Object var17 = var2.clone();
    java.lang.Object var18 = var2.clone();
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    java.text.Format[] var24 = var23.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var24, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var24);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var24);
    java.lang.String var29 = java.text.MessageFormat.format("", (java.lang.Object[])var24);
    java.lang.String var30 = java.text.MessageFormat.format("hi!", (java.lang.Object[])var24);
    java.lang.StringBuffer var31 = null;
    java.text.FieldPosition var32 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var33 = var2.format((java.lang.Object)"hi!", var31, var32);
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test273"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.lang.String var3 = var2.toPattern();
    var2.applyPattern("");
    java.util.Locale var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7);
    java.text.Format[] var9 = var8.getFormatsByArgumentIndex();
    java.text.Format[] var10 = var8.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var10);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test274"); }


    org.apache.commons.lang.text.ExtendedMessageFormat var1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
    java.text.Format[] var2 = var1.getFormatsByArgumentIndex();
    java.lang.Object[] var7 = new java.lang.Object[] { (-1)};
    org.apache.commons.lang.Validate.noNullElements(var7);
    java.lang.String var9 = java.text.MessageFormat.format("hi!", var7);
    java.lang.String var10 = java.text.MessageFormat.format("", var7);
    java.lang.String var11 = java.text.MessageFormat.format("hi!", var7);
    java.lang.Object[] var12 = new java.lang.Object[] { var11};
    org.apache.commons.lang.Validate.notEmpty(var12);
    java.text.AttributedCharacterIterator var14 = var1.formatToCharacterIterator((java.lang.Object)var12);
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
    java.text.Format[] var19 = var18.getFormats();
    java.lang.String var20 = var18.toPattern();
    java.lang.Object var21 = var18.clone();
    java.lang.String var22 = var18.toPattern();
    java.util.Map var26 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26);
    boolean var29 = var27.equals((java.lang.Object)1L);
    java.util.Locale var30 = var27.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var30);
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var30);
    var18.setLocale(var30);
    java.util.Map var34 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var35 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var30, var34);
    java.util.Locale var36 = var35.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var37 = var1.formatToCharacterIterator((java.lang.Object)var36);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test275"); }


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
    org.apache.commons.lang.text.ExtendedMessageFormat var54 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var44);
    java.text.Format[] var55 = var54.getFormatsByArgumentIndex();
    java.text.Format[] var56 = var54.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var56, "");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var23.setFormatsByArgumentIndex(var56);
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
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test276"); }


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
    boolean var41 = var2.equals((java.lang.Object)var40);
    java.util.Map var46 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var47 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var46);
    boolean var49 = var47.equals((java.lang.Object)1L);
    java.util.Locale var50 = var47.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var51 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var50);
    java.util.Map var52 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var53 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var50, var52);
    java.util.Locale var54 = var53.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var55 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var54);
    java.text.Format[] var56 = var55.getFormats();
    org.apache.commons.lang.text.ExtendedMessageFormat var58 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
    java.text.Format[] var59 = var58.getFormatsByArgumentIndex();
    java.lang.String var60 = var55.format((java.lang.Object)var59);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var59);
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
    assertTrue(var13 == false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + ""+ "'", var60.equals(""));

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test277"); }


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
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var28);
    java.text.Format[] var30 = var29.getFormats();
    java.lang.Object var31 = var29.clone();
    var29.applyPattern("");
    org.apache.commons.lang.Validate.isTrue(true, "", (java.lang.Object)var29);
    java.util.Map var36 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var37 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var36);
    boolean var39 = var37.equals((java.lang.Object)1L);
    java.lang.Object var40 = var37.clone();
    var37.applyPattern("");
    java.util.Locale var43 = var37.getLocale();
    java.util.Map var47 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var48 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var47);
    boolean var50 = var48.equals((java.lang.Object)1L);
    java.util.Locale var51 = var48.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var52 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var51);
    java.util.Map var53 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var54 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var51, var53);
    var37.setLocale(var51);
    var29.setLocale(var51);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.setFormat(0, (java.text.Format)var29);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test278"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var5 = var2.getLocale();
    var2.applyPattern("");
    boolean var9 = var2.equals((java.lang.Object)(byte)100);
    java.lang.String var10 = var2.toPattern();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var2.parseObject("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test279"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    boolean var5 = var3.equals((java.lang.Object)1L);
    java.lang.Object var6 = var3.clone();
    java.util.Locale var7 = var3.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var8, "");
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    java.text.Format[] var14 = var13.getFormats();
    java.lang.String var15 = var13.toPattern();
    java.lang.Object var16 = var13.clone();
    java.lang.String var17 = var13.toPattern();
    java.util.Map var21 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var21);
    boolean var24 = var22.equals((java.lang.Object)1L);
    java.util.Locale var25 = var22.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var25);
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25);
    var13.setLocale(var25);
    java.util.Map var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var30);
    java.text.Format[] var32 = var31.getFormats();
    java.lang.String var33 = var31.toPattern();
    java.lang.Object var34 = var31.clone();
    java.util.Locale var35 = var31.getLocale();
    var13.setLocale(var35);
    java.text.Format[] var37 = var13.getFormats();
    java.util.Locale var40 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var41 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var40);
    java.util.Map var43 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var44 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var43);
    boolean var46 = var44.equals((java.lang.Object)1L);
    java.util.Locale var47 = var44.getLocale();
    var41.setLocale(var47);
    org.apache.commons.lang.text.ExtendedMessageFormat var49 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var47);
    java.lang.Object var50 = var49.clone();
    java.util.Map var52 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var53 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var52);
    boolean var55 = var53.equals((java.lang.Object)1L);
    java.util.Locale var56 = var53.getLocale();
    java.text.Format[] var57 = var53.getFormatsByArgumentIndex();
    java.text.Format[] var58 = var53.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var58);
    java.text.AttributedCharacterIterator var60 = var49.formatToCharacterIterator((java.lang.Object)var58);
    boolean var61 = var13.equals((java.lang.Object)var60);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var62 = var8.format((java.lang.Object)var61);
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);

  }

  public void test280() {}
//   public void test280() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test280"); }
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
//     java.text.Format[] var26 = var23.getFormats();
//     java.text.Format[] var27 = var23.getFormatsByArgumentIndex();
//     java.lang.Object[] var30 = new java.lang.Object[] { (-1)};
//     org.apache.commons.lang.Validate.noNullElements(var30);
//     java.lang.String var32 = java.text.MessageFormat.format("hi!", var30);
//     org.apache.commons.lang.Validate.noNullElements(var30);
//     org.apache.commons.lang.Validate.noNullElements(var30, "hi!");
//     org.apache.commons.lang.Validate.notEmpty(var30);
//     org.apache.commons.lang.Validate.noNullElements(var30);
//     java.lang.StringBuffer var38 = null;
//     java.text.FieldPosition var39 = null;
//     java.lang.StringBuffer var40 = var23.format(var30, var38, var39);
// 
//   }

  public void test281() {}
//   public void test281() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test281"); }
// 
// 
//     java.util.Locale var3 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var3);
//     boolean var6 = var4.equals((java.lang.Object)(byte)(-1));
//     java.util.Map var12 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
//     boolean var15 = var13.equals((java.lang.Object)1L);
//     java.util.Locale var16 = var13.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
//     java.util.Map var18 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16, var18);
//     java.util.Map var20 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var16, var20);
//     org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
//     var4.setLocale(var16);
//     org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
//     java.util.Locale var25 = var24.getLocale();
//     java.util.Map var26 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25, var26);
//     java.lang.Object var28 = null;
//     java.text.AttributedCharacterIterator var29 = var27.formatToCharacterIterator(var28);
// 
//   }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test282"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    var2.applyPattern("hi!");
    java.text.Format[] var7 = var2.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var7, "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var7, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test283"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    java.lang.Object var5 = var2.clone();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
    var2.applyPattern("hi!");
    java.text.Format[] var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var9);
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

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test284"); }


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
    boolean var69 = var67.equals((java.lang.Object)1L);
    java.util.Locale var70 = var67.getLocale();
    java.text.Format[] var71 = var67.getFormatsByArgumentIndex();
    boolean var73 = var67.equals((java.lang.Object)(short)10);
    java.text.Format[] var74 = var67.getFormatsByArgumentIndex();
    java.text.Format[] var75 = var67.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var63.setFormatByArgumentIndex((-1), (java.text.Format)var67);
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
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test285"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    java.text.Format[] var9 = var5.getFormatsByArgumentIndex();
    boolean var10 = var2.equals((java.lang.Object)var9);
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

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test286"); }


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
    java.lang.String var52 = var25.toPattern();
    java.util.Map var55 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var56 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var55);
    java.lang.Object var57 = var56.clone();
    java.util.Locale var59 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var60 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var59);
    java.text.Format[] var61 = var60.getFormatsByArgumentIndex();
    var60.applyPattern("hi!");
    java.lang.Object var64 = var60.clone();
    java.util.Map var67 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var68 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var67);
    boolean var70 = var68.equals((java.lang.Object)1L);
    java.util.Locale var71 = var68.getLocale();
    java.text.Format[] var72 = var68.getFormatsByArgumentIndex();
    java.lang.String var73 = java.text.MessageFormat.format("hi!", (java.lang.Object[])var72);
    boolean var74 = var60.equals((java.lang.Object)var72);
    boolean var75 = var56.equals((java.lang.Object)var72);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var25.setFormatByArgumentIndex(0, (java.text.Format)var56);
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
    assertTrue("'" + var52 + "' != '" + ""+ "'", var52.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "hi!"+ "'", var73.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test287"); }


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
    java.util.Locale var21 = null;
    var2.setLocale(var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var24 = var2.parseObject("");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test288"); }


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
    java.util.Map var25 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25);
    java.text.Format[] var27 = var26.getFormats();
    java.lang.String var28 = var26.toPattern();
    java.lang.Object var29 = var26.clone();
    java.lang.String var30 = var26.toPattern();
    java.util.Map var34 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var35 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var34);
    boolean var37 = var35.equals((java.lang.Object)1L);
    java.util.Locale var38 = var35.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var39 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var38);
    org.apache.commons.lang.text.ExtendedMessageFormat var40 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var38);
    var26.setLocale(var38);
    org.apache.commons.lang.text.ExtendedMessageFormat var42 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var38);
    java.util.Map var43 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var44 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var38, var43);
    java.lang.String var45 = var16.format((java.lang.Object)var43);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var47 = var16.parseObject("");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test289"); }


    org.apache.commons.lang.Validate.isTrue(true, "", 1.0d);

  }

  public void test290() {}
//   public void test290() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test290"); }
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
//     java.util.Map var23 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var23);
//     java.text.Format[] var25 = var24.getFormats();
//     java.lang.String var26 = var24.toPattern();
//     java.lang.Object var27 = var24.clone();
//     java.util.Locale var28 = var24.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var28);
//     boolean var30 = var19.equals((java.lang.Object)var29);
//     java.util.Map var32 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var32);
//     java.text.Format[] var34 = var33.getFormats();
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var34, "");
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var34);
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var34);
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var34);
//     java.lang.StringBuffer var40 = null;
//     java.text.FieldPosition var41 = null;
//     java.lang.StringBuffer var42 = var19.format((java.lang.Object[])var34, var40, var41);
// 
//   }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test291"); }


    java.util.Locale var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var3);
    java.lang.Object var5 = var4.clone();
    org.apache.commons.lang.Validate.isTrue(true, "hi!", (java.lang.Object)var4);
    var4.applyPattern("");
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    java.text.Format[] var12 = var11.getFormats();
    java.lang.Object var13 = var11.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var14 = var4.format((java.lang.Object)var11);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test292() {}
//   public void test292() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test292"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.lang.Object var3 = var2.clone();
//     java.lang.String var4 = var2.toPattern();
//     java.text.Format[] var5 = var2.getFormats();
//     var2.applyPattern("hi!");
//     java.util.Locale var8 = var2.getLocale();
//     java.text.ParsePosition var10 = null;
//     java.lang.Object var11 = var2.parseObject("hi!", var10);
// 
//   }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test293"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    boolean var9 = var7.equals((java.lang.Object)1L);
    java.util.Locale var10 = var7.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    var2.setLocale(var10);
    java.lang.String var13 = var2.toPattern();
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
    java.text.Format[] var19 = var18.getFormats();
    java.lang.String var20 = var18.toPattern();
    java.lang.Object var21 = var18.clone();
    java.util.Map var26 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26);
    boolean var29 = var27.equals((java.lang.Object)1L);
    java.util.Locale var30 = var27.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var30);
    java.util.Map var32 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var30, var32);
    java.util.Map var34 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var35 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var30, var34);
    var18.setLocale(var30);
    java.util.Map var37 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var38 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var30, var37);
    org.apache.commons.lang.text.ExtendedMessageFormat var39 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var30);
    java.util.Map var41 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var42 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var41);
    boolean var44 = var42.equals((java.lang.Object)1L);
    java.util.Locale var45 = var42.getLocale();
    java.text.Format[] var46 = var42.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var46, "");
    boolean var49 = var39.equals((java.lang.Object)var46);
    java.lang.String var50 = var39.toPattern();
    java.util.Map var55 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var56 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var55);
    boolean var58 = var56.equals((java.lang.Object)1L);
    java.util.Locale var59 = var56.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var60 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var59);
    java.util.Map var61 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var62 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var59, var61);
    java.util.Map var63 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var64 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var59, var63);
    var39.setLocale(var59);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var66 = var2.format((java.lang.Object)var59);
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
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + ""+ "'", var50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test294"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var23 = var2.parseObject("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
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
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test295"); }


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
    var30.applyPattern("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var23.setFormat(0, (java.text.Format)var30);
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

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test296"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    java.text.Format[] var4 = var3.getFormats();
    java.lang.String var5 = var3.toPattern();
    java.lang.Object var6 = var3.clone();
    java.lang.String var7 = var3.toPattern();
    var3.applyPattern("hi!");
    java.lang.Object[] var11 = var3.parse("hi!");
    java.util.Locale var12 = var3.getLocale();
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var12, var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var16 = var14.parseObject("");
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
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test297() {}
//   public void test297() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test297"); }
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
//     java.util.Map var21 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var21);
//     boolean var24 = var22.equals((java.lang.Object)1L);
//     java.util.Locale var25 = var22.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25);
//     java.util.Map var27 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25, var27);
//     var2.setLocale(var25);
//     java.text.ParsePosition var31 = null;
//     java.lang.Object var32 = var2.parseObject("", var31);
// 
//   }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test298"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    java.text.Format[] var5 = var4.getFormats();
    java.lang.Object var6 = var4.clone();
    var4.applyPattern("");
    org.apache.commons.lang.Validate.isTrue(true, "", (java.lang.Object)var4);
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
    boolean var14 = var12.equals((java.lang.Object)1L);
    java.lang.Object var15 = var12.clone();
    var12.applyPattern("");
    java.util.Locale var18 = var12.getLocale();
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    boolean var25 = var23.equals((java.lang.Object)1L);
    java.util.Locale var26 = var23.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var26);
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var26, var28);
    var12.setLocale(var26);
    var4.setLocale(var26);
    java.util.Map var35 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var36 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var35);
    java.text.Format[] var37 = var36.getFormats();
    java.lang.String var38 = java.text.MessageFormat.format("", (java.lang.Object[])var37);
    java.lang.String var39 = java.text.MessageFormat.format("", (java.lang.Object[])var37);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var37);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.setFormats(var37);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + ""+ "'", var38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + ""+ "'", var39.equals(""));

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test299"); }


    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var5);
    java.util.Map var8 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
    boolean var11 = var9.equals((java.lang.Object)1L);
    java.util.Locale var12 = var9.getLocale();
    java.text.Format[] var13 = var9.getFormatsByArgumentIndex();
    boolean var14 = var6.equals((java.lang.Object)var13);
    java.lang.String var15 = java.text.MessageFormat.format("", (java.lang.Object[])var13);
    java.lang.String var16 = java.text.MessageFormat.format("", (java.lang.Object[])var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "", (java.lang.Object)var13);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test300"); }


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
    java.lang.Object var24 = var23.clone();
    java.lang.Object var25 = var23.clone();
    java.text.Format[] var26 = var23.getFormatsByArgumentIndex();
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var28);
    java.text.Format[] var30 = var29.getFormats();
    java.lang.String var31 = var29.toPattern();
    java.util.Locale var33 = null;
    java.util.Map var34 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var35 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var33, var34);
    boolean var36 = var29.equals((java.lang.Object)var33);
    var29.applyPattern("");
    boolean var40 = var29.equals((java.lang.Object)"hi!");
    var29.applyPattern("");
    java.util.Locale var43 = var29.getLocale();
    java.lang.String var44 = var29.toPattern();
    java.text.Format[] var45 = var29.getFormats();
    java.text.AttributedCharacterIterator var46 = var23.formatToCharacterIterator((java.lang.Object)var45);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var45);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + ""+ "'", var44.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test301"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    boolean var8 = var2.equals((java.lang.Object)' ');
    java.lang.Object var9 = var2.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var11 = var2.parse("hi!");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test302() {}
//   public void test302() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test302"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
//     java.text.ParsePosition var4 = null;
//     java.lang.Object var5 = var2.parseObject("", var4);
// 
//   }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test303"); }


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
    java.util.Map var40 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var41 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var40);
    java.text.Format[] var42 = var41.getFormats();
    var41.applyPattern("");
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var41);
    java.util.Map var47 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var48 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var47);
    boolean var50 = var48.equals((java.lang.Object)1L);
    java.util.Locale var51 = var48.getLocale();
    java.text.Format[] var52 = var48.getFormatsByArgumentIndex();
    java.text.Format[] var53 = var48.getFormats();
    java.text.AttributedCharacterIterator var54 = var41.formatToCharacterIterator((java.lang.Object)var53);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var25.setFormatByArgumentIndex(1, (java.text.Format)var41);
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
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test304"); }


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
    java.lang.Object var48 = var2.clone();
    java.lang.String var49 = var2.toPattern();
    java.util.Locale var51 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var52 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var51);
    boolean var54 = var52.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var55 = var52.getLocale();
    var52.applyPattern("");
    var52.applyPattern("hi!");
    java.text.Format[] var60 = var52.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var60, "");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var60);
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
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!"+ "'", var49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test305"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    java.text.Format[] var4 = var3.getFormats();
    java.lang.String var5 = var3.toPattern();
    var3.applyPattern("hi!");
    java.text.Format[] var8 = var3.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var8, "hi!");
    java.lang.String var11 = java.text.MessageFormat.format("hi!", (java.lang.Object[])var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var8, "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test306"); }


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
    java.text.Format[] var26 = var23.getFormats();
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var28);
    boolean var31 = var29.equals((java.lang.Object)1L);
    java.util.Locale var32 = var29.getLocale();
    java.text.Format[] var33 = var29.getFormatsByArgumentIndex();
    java.text.Format[] var34 = var29.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var29);
    var29.applyPattern("");
    java.text.Format[] var38 = var29.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var29, "");
    java.lang.Object var41 = null;
    boolean var42 = var29.equals(var41);
    java.util.Locale var43 = var29.getLocale();
    java.lang.StringBuffer var44 = null;
    java.text.FieldPosition var45 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var46 = var23.format((java.lang.Object)var43, var44, var45);
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test307"); }


    java.util.Locale var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var3);
    java.lang.Object var5 = var4.clone();
    org.apache.commons.lang.Validate.isTrue(true, "hi!", (java.lang.Object)var4);
    var4.applyPattern("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var10 = var4.parse("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test308"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    java.text.Format[] var5 = var2.getFormatsByArgumentIndex();
    java.util.Locale var8 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var8);
    java.text.Format[] var10 = var9.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat(1, (java.text.Format)var9);
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
    assertNotNull(var10);

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test309"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    boolean var6 = var4.equals((java.lang.Object)1L);
    java.util.Locale var7 = var4.getLocale();
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
    var4.setLocale(var22);
    java.text.Format[] var30 = var4.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "", (java.lang.Object)var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
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
    assertNotNull(var30);

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test310"); }


    org.apache.commons.lang.Validate.notNull((java.lang.Object)0);

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test311"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    boolean var6 = var4.equals((java.lang.Object)1L);
    java.util.Locale var7 = var4.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7, var9);
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14);
    java.text.Format[] var16 = var15.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var16, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var16);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var16);
    java.lang.String var21 = java.text.MessageFormat.format("", (java.lang.Object[])var16);
    java.lang.String var22 = java.text.MessageFormat.format("hi!", (java.lang.Object[])var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.setFormats(var16);
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
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test312"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    java.lang.Object var5 = var2.clone();
    java.lang.String var6 = var2.toPattern();
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    boolean var13 = var11.equals((java.lang.Object)1L);
    java.util.Locale var14 = var11.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var14);
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14);
    var2.setLocale(var14);
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19);
    java.text.Format[] var21 = var20.getFormats();
    java.lang.String var22 = var20.toPattern();
    java.lang.Object var23 = var20.clone();
    java.util.Locale var24 = var20.getLocale();
    var2.setLocale(var24);
    java.text.Format[] var26 = var2.getFormats();
    java.util.Locale var29 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var29);
    java.util.Map var32 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var32);
    boolean var35 = var33.equals((java.lang.Object)1L);
    java.util.Locale var36 = var33.getLocale();
    var30.setLocale(var36);
    org.apache.commons.lang.text.ExtendedMessageFormat var38 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var36);
    java.lang.Object var39 = var38.clone();
    java.util.Map var41 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var42 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var41);
    boolean var44 = var42.equals((java.lang.Object)1L);
    java.util.Locale var45 = var42.getLocale();
    java.text.Format[] var46 = var42.getFormatsByArgumentIndex();
    java.text.Format[] var47 = var42.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var47);
    java.text.AttributedCharacterIterator var49 = var38.formatToCharacterIterator((java.lang.Object)var47);
    boolean var50 = var2.equals((java.lang.Object)var49);
    java.util.Map var54 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var55 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var54);
    java.text.Format[] var56 = var55.getFormats();
    java.lang.String var57 = var55.toPattern();
    java.lang.Object var58 = var55.clone();
    java.util.Map var63 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var64 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var63);
    boolean var66 = var64.equals((java.lang.Object)1L);
    java.util.Locale var67 = var64.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var68 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var67);
    java.util.Map var69 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var70 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var67, var69);
    java.util.Map var71 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var72 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var67, var71);
    var55.setLocale(var67);
    java.util.Map var74 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var75 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var67, var74);
    java.lang.Object var76 = var75.clone();
    java.lang.Object var77 = var75.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(100, (java.text.Format)var75);
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + ""+ "'", var57.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test313"); }


    org.apache.commons.lang.text.ExtendedMessageFormat var1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
    java.text.Format[] var2 = var1.getFormatsByArgumentIndex();
    java.lang.Object[] var7 = new java.lang.Object[] { (-1)};
    org.apache.commons.lang.Validate.noNullElements(var7);
    java.lang.String var9 = java.text.MessageFormat.format("hi!", var7);
    java.lang.String var10 = java.text.MessageFormat.format("", var7);
    java.lang.String var11 = java.text.MessageFormat.format("hi!", var7);
    java.lang.Object[] var12 = new java.lang.Object[] { var11};
    org.apache.commons.lang.Validate.notEmpty(var12);
    java.text.AttributedCharacterIterator var14 = var1.formatToCharacterIterator((java.lang.Object)var12);
    java.util.Map var16 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
    boolean var19 = var17.equals((java.lang.Object)1L);
    java.util.Locale var20 = var17.getLocale();
    java.text.Format[] var21 = var17.getFormatsByArgumentIndex();
    java.text.Format[] var22 = var17.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var22);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setFormats(var22);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test314"); }


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
    java.lang.Object var27 = var23.clone();
    java.text.Format[] var28 = var23.getFormatsByArgumentIndex();
    java.util.Map var31 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var31);
    boolean var34 = var32.equals((java.lang.Object)1L);
    java.util.Locale var35 = var32.getLocale();
    java.text.Format[] var36 = var32.getFormatsByArgumentIndex();
    java.text.Format[] var37 = var32.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var32);
    java.util.Locale var39 = null;
    var32.setLocale(var39);
    java.lang.Object var41 = var32.clone();
    java.util.Locale var42 = var32.getLocale();
    java.text.Format[] var43 = var32.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var23.setFormat(0, (java.text.Format)var32);
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
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test315"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    java.text.Format[] var5 = var4.getFormats();
    var4.applyPattern("");
    var4.applyPattern("");
    java.util.Locale var10 = var4.getLocale();
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var10, var11);
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var10);
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
    java.text.Format[] var19 = var18.getFormats();
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    boolean var25 = var23.equals((java.lang.Object)1L);
    java.util.Locale var26 = var23.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26);
    var18.setLocale(var26);
    java.util.Map var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var30);
    java.util.Map var33 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var33);
    boolean var36 = var34.equals((java.lang.Object)1L);
    java.util.Locale var37 = var34.getLocale();
    java.text.Format[] var38 = var34.getFormatsByArgumentIndex();
    boolean var39 = var31.equals((java.lang.Object)var38);
    java.lang.String var40 = var18.format((java.lang.Object)var38);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var38);
    org.apache.commons.lang.Validate.isTrue(true, "hi!", (java.lang.Object)var38);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.setFormatsByArgumentIndex(var38);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + ""+ "'", var40.equals(""));

  }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test316"); }


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
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var7);
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

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test317"); }


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
    java.util.Locale var15 = var14.getLocale();
    var14.applyPattern("");
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19);
    java.text.Format[] var21 = var20.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var21, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var21);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var21);
    java.text.AttributedCharacterIterator var26 = var14.formatToCharacterIterator((java.lang.Object)var21);
    java.text.Format[] var27 = var14.getFormatsByArgumentIndex();
    java.lang.String var28 = java.text.MessageFormat.format("", (java.lang.Object[])var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var27);
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
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));

  }

  public void test318() {}
//   public void test318() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test318"); }
// 
// 
//     java.util.Map var4 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
//     boolean var7 = var5.equals((java.lang.Object)1L);
//     java.util.Locale var8 = var5.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
//     java.util.Map var10 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8, var10);
//     java.util.Locale var12 = var11.getLocale();
//     java.util.Map var13 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12, var13);
//     java.text.ParsePosition var16 = null;
//     java.lang.Object[] var17 = var14.parse("", var16);
// 
//   }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test319"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.lang.Object var3 = var2.clone();
    java.lang.String var4 = var2.toPattern();
    java.text.Format[] var5 = var2.getFormats();
    var2.applyPattern("hi!");
    java.util.Locale var8 = var2.getLocale();
    var2.applyPattern("hi!");
    java.text.Format var12 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat(0, var12);
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

  }

  public void test320() {}
//   public void test320() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test320"); }
// 
// 
//     java.util.Locale var3 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var3);
//     java.lang.Object var5 = var4.clone();
//     org.apache.commons.lang.Validate.isTrue(true, "hi!", (java.lang.Object)var4);
//     java.lang.Object var7 = null;
//     java.lang.String var8 = var4.format(var7);
//     java.lang.String var9 = var4.toPattern();
//     java.text.ParsePosition var11 = null;
//     java.lang.Object[] var12 = var4.parse("hi!", var11);
// 
//   }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test321"); }


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
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var28);
    java.text.Format[] var30 = var29.getFormats();
    java.lang.String var31 = var29.toPattern();
    java.lang.Object var32 = var29.clone();
    java.util.Map var37 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var38 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var37);
    boolean var40 = var38.equals((java.lang.Object)1L);
    java.util.Locale var41 = var38.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var42 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var41);
    java.util.Map var43 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var44 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var41, var43);
    java.util.Map var45 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var46 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var41, var45);
    var29.setLocale(var41);
    java.util.Map var48 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var49 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var41, var48);
    java.lang.Object var51 = var49.parseObject("hi!");
    java.lang.String var52 = var49.toPattern();
    java.lang.Object var53 = var49.clone();
    java.util.Map var56 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var57 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var56);
    boolean var59 = var57.equals((java.lang.Object)1L);
    java.util.Locale var60 = var57.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var61 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var60);
    java.util.Map var63 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var64 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var63);
    java.text.Format[] var65 = var64.getFormats();
    java.util.Map var68 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var69 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var68);
    boolean var71 = var69.equals((java.lang.Object)1L);
    java.util.Locale var72 = var69.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var73 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var72);
    var64.setLocale(var72);
    var61.setLocale(var72);
    java.util.Locale var76 = var61.getLocale();
    var49.setLocale(var76);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.setFormatByArgumentIndex(10, (java.text.Format)var49);
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
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);

  }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test322"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    boolean var8 = var2.equals((java.lang.Object)(short)10);
    java.text.Format[] var9 = var2.getFormats();
    java.text.Format[] var10 = var2.getFormats();
    java.text.Format[] var11 = var2.getFormatsByArgumentIndex();
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var13);
    java.lang.Object var15 = var14.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var16 = var2.formatToCharacterIterator(var15);
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test323"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.text.Format[] var4 = var2.getFormats();
    java.text.Format[] var5 = var2.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var5, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test324"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.text.Format[] var4 = var2.getFormats();
    java.text.Format[] var5 = var2.getFormatsByArgumentIndex();
    java.util.Locale var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7);
    boolean var10 = var8.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var12);
    boolean var14 = var8.equals((java.lang.Object)var12);
    java.lang.String var15 = var8.toPattern();
    java.util.Locale var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var17);
    boolean var20 = var18.equals((java.lang.Object)(byte)(-1));
    java.util.Map var26 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var26);
    boolean var29 = var27.equals((java.lang.Object)1L);
    java.util.Locale var30 = var27.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var30);
    java.util.Map var32 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var30, var32);
    java.util.Map var34 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var35 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var30, var34);
    org.apache.commons.lang.text.ExtendedMessageFormat var36 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var30);
    var18.setLocale(var30);
    var8.setLocale(var30);
    boolean var39 = var2.equals((java.lang.Object)var8);
    java.util.Locale var42 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var43 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var42);
    boolean var45 = var43.equals((java.lang.Object)(byte)(-1));
    java.lang.Object var46 = var43.clone();
    java.lang.Object[] var48 = var43.parse("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormat(0, (java.text.Format)var43);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test325"); }


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
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var10, var17);
    java.util.Locale var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var20);
    boolean var23 = var21.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var25 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var25);
    boolean var27 = var21.equals((java.lang.Object)var25);
    java.lang.String var28 = var21.toPattern();
    java.util.Locale var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var30);
    boolean var33 = var31.equals((java.lang.Object)(byte)(-1));
    java.util.Map var39 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var40 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var39);
    boolean var42 = var40.equals((java.lang.Object)1L);
    java.util.Locale var43 = var40.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var44 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var43);
    java.util.Map var45 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var46 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var43, var45);
    java.util.Map var47 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var48 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var43, var47);
    org.apache.commons.lang.text.ExtendedMessageFormat var49 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var43);
    var31.setLocale(var43);
    var21.setLocale(var43);
    java.lang.StringBuffer var52 = null;
    java.text.FieldPosition var53 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var54 = var18.format((java.lang.Object)var43, var52, var53);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test326"); }


    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    java.text.Format[] var7 = var6.getFormats();
    var6.applyPattern("");
    var6.applyPattern("");
    java.util.Locale var12 = var6.getLocale();
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var12, var13);
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var12);
    java.util.Map var16 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var12, var16);
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var20 = var18.parseObject("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test327"); }


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
    java.util.Map var40 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var41 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var40);
    boolean var43 = var41.equals((java.lang.Object)1L);
    java.util.Locale var44 = var41.getLocale();
    boolean var45 = var2.equals((java.lang.Object)var44);
    java.text.Format[] var46 = var2.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var46);
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
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test328"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    var2.applyPattern("hi!");
    java.lang.Object[] var8 = new java.lang.Object[] { (-1)};
    org.apache.commons.lang.Validate.noNullElements(var8);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var8, "hi!");
    org.apache.commons.lang.Validate.notEmpty(var8);
    org.apache.commons.lang.Validate.notEmpty(var8);
    org.apache.commons.lang.Validate.notEmpty(var8, "");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var16 = var2.format((java.lang.Object)"");
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

  }

  public void test329() {}
//   public void test329() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test329"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
//     java.util.Map var6 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
//     boolean var9 = var7.equals((java.lang.Object)1L);
//     java.util.Locale var10 = var7.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
//     java.util.Map var12 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10, var12);
//     java.util.Map var18 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
//     boolean var21 = var19.equals((java.lang.Object)1L);
//     java.util.Locale var22 = var19.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
//     java.util.Map var24 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22, var24);
//     java.util.Map var26 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var22, var26);
//     java.lang.String var28 = var27.toPattern();
//     boolean var29 = var13.equals((java.lang.Object)var28);
//     boolean var30 = var2.equals((java.lang.Object)var29);
//     java.util.Locale var31 = var2.getLocale();
//     java.lang.String var32 = var2.toPattern();
//     java.text.ParsePosition var34 = null;
//     java.lang.Object var35 = var2.parseObject("hi!", var34);
// 
//   }

  public void test330() {}
//   public void test330() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test330"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
//     boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
//     java.util.Locale var6 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var6);
//     boolean var8 = var2.equals((java.lang.Object)var6);
//     java.lang.String var9 = var2.toPattern();
//     java.util.Locale var11 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var11);
//     boolean var14 = var12.equals((java.lang.Object)(byte)(-1));
//     java.util.Map var20 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var20);
//     boolean var23 = var21.equals((java.lang.Object)1L);
//     java.util.Locale var24 = var21.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24);
//     java.util.Map var26 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24, var26);
//     java.util.Map var28 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var24, var28);
//     org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24);
//     var12.setLocale(var24);
//     var2.setLocale(var24);
//     java.text.ParsePosition var34 = null;
//     java.lang.Object[] var35 = var2.parse("hi!", var34);
// 
//   }

  public void test331() {}
//   public void test331() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test331"); }
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
//     java.text.Format[] var21 = var2.getFormats();
//     java.lang.Object var22 = null;
//     java.text.AttributedCharacterIterator var23 = var2.formatToCharacterIterator(var22);
// 
//   }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test332"); }


    java.util.Locale var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var2);
    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    boolean var8 = var6.equals((java.lang.Object)1L);
    java.util.Locale var9 = var6.getLocale();
    var3.setLocale(var9);
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9, var11);
    var12.applyPattern("");
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var20);
    boolean var23 = var21.equals((java.lang.Object)1L);
    java.util.Locale var24 = var21.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24);
    java.util.Map var26 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var24, var26);
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24, var28);
    java.lang.Object var30 = null;
    java.lang.String var31 = var29.format(var30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var12.setFormatByArgumentIndex(100, (java.text.Format)var29);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test333"); }


    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    java.text.Format[] var7 = var6.getFormats();
    java.lang.String var8 = var6.toPattern();
    java.lang.Object var9 = var6.clone();
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14);
    boolean var17 = var15.equals((java.lang.Object)1L);
    java.util.Locale var18 = var15.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18, var20);
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var18, var22);
    var6.setLocale(var18);
    java.util.Map var25 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var18, var25);
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
    java.util.Map var29 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var29);
    boolean var32 = var30.equals((java.lang.Object)1L);
    java.util.Locale var33 = var30.getLocale();
    java.text.Format[] var34 = var30.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var34, "");
    boolean var37 = var27.equals((java.lang.Object)var34);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "", (java.lang.Object)var27);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test334"); }


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
    java.util.Map var25 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25);
    java.text.Format[] var27 = var26.getFormats();
    java.lang.String var28 = var26.toPattern();
    java.lang.Object var29 = var26.clone();
    java.lang.String var30 = var26.toPattern();
    java.util.Map var34 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var35 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var34);
    boolean var37 = var35.equals((java.lang.Object)1L);
    java.util.Locale var38 = var35.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var39 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var38);
    org.apache.commons.lang.text.ExtendedMessageFormat var40 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var38);
    var26.setLocale(var38);
    org.apache.commons.lang.text.ExtendedMessageFormat var42 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var38);
    java.util.Map var43 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var44 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var38, var43);
    java.lang.String var45 = var16.format((java.lang.Object)var43);
    java.util.Map var48 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var49 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var48);
    java.text.Format[] var50 = var49.getFormats();
    java.lang.String var51 = var49.toPattern();
    java.lang.Object var52 = var49.clone();
    java.util.Map var57 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var58 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var57);
    boolean var60 = var58.equals((java.lang.Object)1L);
    java.util.Locale var61 = var58.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var62 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var61);
    java.util.Map var63 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var64 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var61, var63);
    java.util.Map var65 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var66 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var61, var65);
    var49.setLocale(var61);
    java.util.Map var68 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var69 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var61, var68);
    java.lang.Object var71 = var69.parseObject("hi!");
    java.lang.String var72 = var16.format(var71);
    java.util.Map var75 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var76 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var75);
    java.text.Format[] var77 = var76.getFormats();
    java.lang.String var78 = var76.toPattern();
    var76.applyPattern("hi!");
    java.text.Format[] var81 = var76.getFormatsByArgumentIndex();
    java.lang.Object var82 = var76.clone();
    java.lang.Object[] var84 = var76.parse("hi!");
    java.util.Locale var85 = var76.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var16.setFormat(10, (java.text.Format)var76);
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
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + ""+ "'", var51.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "hi!"+ "'", var72.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + ""+ "'", var78.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);

  }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test335"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.lang.Object var5 = var2.clone();
    var2.applyPattern("");
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var9);
    java.lang.Object var11 = var10.clone();
    java.util.Locale var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var13);
    java.text.Format[] var15 = var14.getFormatsByArgumentIndex();
    var14.applyPattern("hi!");
    java.lang.Object var18 = var14.clone();
    java.util.Map var21 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var21);
    boolean var24 = var22.equals((java.lang.Object)1L);
    java.util.Locale var25 = var22.getLocale();
    java.text.Format[] var26 = var22.getFormatsByArgumentIndex();
    java.lang.String var27 = java.text.MessageFormat.format("hi!", (java.lang.Object[])var26);
    boolean var28 = var14.equals((java.lang.Object)var26);
    boolean var29 = var10.equals((java.lang.Object)var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var26);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test336() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test336"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    boolean var6 = var4.equals((java.lang.Object)1L);
    java.util.Locale var7 = var4.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7, var9);
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    boolean var18 = var16.equals((java.lang.Object)1L);
    java.util.Locale var19 = var16.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19);
    java.util.Map var21 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var19, var21);
    java.util.Map var23 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var19, var23);
    var10.setLocale(var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var27 = var10.parseObject("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
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

  }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test337"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    java.lang.Object var5 = var2.clone();
    java.lang.Object[] var7 = var2.parse("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty(var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test338"); }


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
    java.text.Format var20 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var18.setFormatByArgumentIndex(1, var20);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test339() {}
//   public void test339() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test339"); }
// 
// 
//     java.util.Locale var3 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var3);
//     java.lang.Object var5 = var4.clone();
//     org.apache.commons.lang.Validate.isTrue(true, "hi!", (java.lang.Object)var4);
//     java.lang.Object var7 = null;
//     java.lang.String var8 = var4.format(var7);
//     java.lang.String var9 = var4.toPattern();
//     java.util.Map var11 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var11);
//     java.text.Format[] var13 = var12.getFormats();
//     java.lang.String var14 = var12.toPattern();
//     java.text.Format[] var15 = var12.getFormats();
//     java.lang.StringBuffer var16 = null;
//     java.text.FieldPosition var17 = null;
//     java.lang.StringBuffer var18 = var4.format((java.lang.Object[])var15, var16, var17);
// 
//   }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test340"); }


    java.util.Locale var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var2);
    boolean var5 = var3.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var6 = var3.getLocale();
    var3.applyPattern("");
    var3.applyPattern("hi!");
    java.text.Format[] var11 = var3.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var11, "");
    java.lang.String var14 = java.text.MessageFormat.format("", (java.lang.Object[])var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test341"); }


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
    java.lang.Object var26 = null;
    boolean var27 = var23.equals(var26);
    java.util.Map var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var30);
    boolean var33 = var31.equals((java.lang.Object)1L);
    java.util.Locale var34 = var31.getLocale();
    java.text.Format[] var35 = var31.getFormatsByArgumentIndex();
    java.text.Format[] var36 = var31.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var31);
    var31.applyPattern("");
    java.text.Format[] var40 = var31.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var23.setFormat(0, (java.text.Format)var31);
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
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test342() {}
//   public void test342() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test342"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     boolean var4 = var2.equals((java.lang.Object)1L);
//     java.lang.Object var5 = var2.clone();
//     org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
//     java.text.ParsePosition var8 = null;
//     java.lang.Object[] var9 = var2.parse("hi!", var8);
// 
//   }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test343"); }


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
    java.text.Format[] var25 = var2.getFormatsByArgumentIndex();
    java.util.Map var29 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var29);
    java.text.Format[] var31 = var30.getFormats();
    java.lang.String var32 = var30.toPattern();
    java.lang.Object var33 = var30.clone();
    java.util.Locale var34 = var30.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var35 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var34);
    java.util.Map var36 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var37 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var34, var36);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var38 = var2.format((java.lang.Object)var37);
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
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test344"); }


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
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var12);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var12, "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var12, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
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

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test345"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.text.Format[] var3 = var2.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var3, "");
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

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test346"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    java.text.Format[] var5 = var4.getFormats();
    java.lang.Object var6 = var4.clone();
    var4.applyPattern("");
    org.apache.commons.lang.Validate.isTrue(true, "", (java.lang.Object)var4);
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
    boolean var14 = var12.equals((java.lang.Object)1L);
    java.lang.Object var15 = var12.clone();
    var12.applyPattern("");
    java.util.Locale var18 = var12.getLocale();
    java.util.Map var22 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
    boolean var25 = var23.equals((java.lang.Object)1L);
    java.util.Locale var26 = var23.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var26);
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var26, var28);
    var12.setLocale(var26);
    var4.setLocale(var26);
    java.util.Locale var33 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var33);
    boolean var36 = var34.equals((java.lang.Object)(byte)(-1));
    java.util.Locale var37 = var34.getLocale();
    var34.applyPattern("");
    var34.applyPattern("hi!");
    java.text.Format[] var42 = var34.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var42, "");
    java.lang.StringBuffer var45 = null;
    java.text.FieldPosition var46 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var47 = var4.format((java.lang.Object)"", var45, var46);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test347() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test347"); }


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
    java.util.Map var25 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25);
    java.text.Format[] var27 = var26.getFormats();
    var26.applyPattern("");
    var26.applyPattern("");
    java.util.Locale var32 = var26.getLocale();
    java.util.Map var33 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var32, var33);
    org.apache.commons.lang.text.ExtendedMessageFormat var35 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var32);
    java.util.Map var36 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var37 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var32, var36);
    org.apache.commons.lang.text.ExtendedMessageFormat var38 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var32);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var39 = var2.formatToCharacterIterator((java.lang.Object)var38);
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test348() {}
//   public void test348() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test348"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.lang.String var4 = var2.toPattern();
//     java.lang.Object var5 = var2.clone();
//     java.util.Map var9 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
//     java.text.Format[] var11 = var10.getFormats();
//     java.lang.String var12 = var10.toPattern();
//     java.lang.Object var13 = var10.clone();
//     java.util.Map var18 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
//     boolean var21 = var19.equals((java.lang.Object)1L);
//     java.util.Locale var22 = var19.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
//     java.util.Map var24 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22, var24);
//     java.util.Map var26 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var27 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var22, var26);
//     var10.setLocale(var22);
//     java.util.Map var29 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var22, var29);
//     org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var22);
//     java.util.Locale var33 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var33);
//     boolean var36 = var34.equals((java.lang.Object)(byte)(-1));
//     java.util.Locale var37 = var34.getLocale();
//     java.util.Map var39 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var40 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var39);
//     boolean var42 = var40.equals((java.lang.Object)1L);
//     java.util.Locale var43 = var40.getLocale();
//     java.text.Format[] var44 = var40.getFormatsByArgumentIndex();
//     java.text.Format[] var45 = var40.getFormats();
//     java.text.AttributedCharacterIterator var46 = var34.formatToCharacterIterator((java.lang.Object)var45);
//     java.util.Map var52 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var53 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var52);
//     boolean var55 = var53.equals((java.lang.Object)1L);
//     java.util.Locale var56 = var53.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var57 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var56);
//     java.util.Map var58 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var59 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var56, var58);
//     java.util.Map var60 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var61 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var56, var60);
//     java.util.Map var62 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var63 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var56, var62);
//     var34.setLocale(var56);
//     java.lang.Object[] var65 = new java.lang.Object[] { var34};
//     org.apache.commons.lang.Validate.notEmpty(var65, "");
//     org.apache.commons.lang.Validate.notEmpty(var65);
//     boolean var69 = var31.equals((java.lang.Object)var65);
//     java.lang.StringBuffer var70 = null;
//     java.text.FieldPosition var71 = null;
//     java.lang.StringBuffer var72 = var2.format(var65, var70, var71);
// 
//   }

  public void test349() {}
//   public void test349() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test349"); }
// 
// 
//     java.util.Map var3 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
//     boolean var6 = var4.equals((java.lang.Object)1L);
//     java.util.Locale var7 = var4.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
//     java.util.Map var9 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7, var9);
//     java.util.Locale var11 = var10.getLocale();
//     java.text.Format[] var12 = var10.getFormatsByArgumentIndex();
//     java.text.ParsePosition var14 = null;
//     java.lang.Object var15 = var10.parseObject("hi!", var14);
// 
//   }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test350"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var2);
    java.util.Map var5 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var5);
    boolean var8 = var6.equals((java.lang.Object)1L);
    java.util.Locale var9 = var6.getLocale();
    java.text.Format[] var10 = var6.getFormatsByArgumentIndex();
    boolean var11 = var3.equals((java.lang.Object)var10);
    java.lang.String var12 = java.text.MessageFormat.format("", (java.lang.Object[])var10);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var10, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test351"); }


    java.util.Map var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var2);
    java.text.Format[] var4 = var3.getFormats();
    java.lang.String var5 = var3.toPattern();
    java.lang.Object var6 = var3.clone();
    java.lang.String var7 = var3.toPattern();
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
    boolean var14 = var12.equals((java.lang.Object)1L);
    java.util.Locale var15 = var12.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var15);
    org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    var3.setLocale(var15);
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var15);
    java.text.Format[] var20 = var19.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var22 = var19.parse("");
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
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test352() {}
//   public void test352() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test352"); }
// 
// 
//     org.apache.commons.lang.text.ExtendedMessageFormat var1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
//     java.util.Map var3 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var3);
//     java.lang.Object var5 = var4.clone();
//     java.text.Format[] var6 = var4.getFormats();
//     java.lang.StringBuffer var7 = null;
//     java.text.FieldPosition var8 = null;
//     java.lang.StringBuffer var9 = var1.format((java.lang.Object[])var6, var7, var8);
// 
//   }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test353"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
    java.text.Format[] var5 = var4.getFormats();
    var4.applyPattern("");
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var4);
    java.lang.Object var9 = null;
    boolean var10 = var4.equals(var9);
    java.util.Locale var11 = var4.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "", (java.lang.Object)var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test354() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test354"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    boolean var8 = var2.equals((java.lang.Object)(short)10);
    java.text.Format[] var9 = var2.getFormatsByArgumentIndex();
    java.text.Format[] var10 = var2.getFormatsByArgumentIndex();
    java.text.Format[] var11 = var2.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var13 = var2.parse("hi!");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test355"); }


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
    var25.applyPattern("hi!");
    java.lang.Object var29 = var25.parseObject("hi!");
    java.util.Locale var30 = var25.getLocale();
    java.util.Map var32 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var32);
    java.text.Format[] var34 = var33.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var34, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var34);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var34);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var34);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var34);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var25.setFormats(var34);
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
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test356() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test356"); }


    java.util.Locale var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var1);
    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    boolean var7 = var5.equals((java.lang.Object)1L);
    java.util.Locale var8 = var5.getLocale();
    var2.setLocale(var8);
    java.lang.Object var10 = var2.clone();
    java.util.Locale var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var14);
    java.text.Format[] var16 = var15.getFormats();
    org.apache.commons.lang.Validate.isTrue(true, "", (java.lang.Object)var16);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var16, "");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var16);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test357"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.Object var4 = var2.clone();
    var2.applyPattern("hi!");
    java.util.Map var8 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var8);
    java.util.Map var11 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
    boolean var14 = var12.equals((java.lang.Object)1L);
    java.util.Locale var15 = var12.getLocale();
    java.text.Format[] var16 = var12.getFormatsByArgumentIndex();
    boolean var17 = var9.equals((java.lang.Object)var16);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var20);
    java.text.Format[] var22 = var21.getFormats();
    java.lang.String var23 = var21.toPattern();
    java.lang.Object var24 = var21.clone();
    java.util.Map var29 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var29);
    boolean var32 = var30.equals((java.lang.Object)1L);
    java.util.Locale var33 = var30.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var33);
    java.util.Map var35 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var36 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var33, var35);
    java.util.Map var37 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var38 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var33, var37);
    var21.setLocale(var33);
    java.util.Map var40 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var41 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var33, var40);
    var9.setLocale(var33);
    java.lang.Object var44 = var9.parseObject("hi!");
    java.util.Map var47 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var48 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var47);
    java.text.Format[] var49 = var48.getFormats();
    java.lang.String var50 = java.text.MessageFormat.format("", (java.lang.Object[])var49);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var49);
    java.text.AttributedCharacterIterator var52 = var9.formatToCharacterIterator((java.lang.Object)var49);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var49);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + ""+ "'", var50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test358"); }


    org.apache.commons.lang.Validate.notNull((java.lang.Object)(short)0);

  }

  public void test359() {}
//   public void test359() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test359"); }
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
//     var2.setLocale(var24);
//     java.lang.Object var33 = var2.clone();
//     java.util.Locale var34 = var2.getLocale();
//     java.lang.Object[] var38 = new java.lang.Object[] { (-1)};
//     org.apache.commons.lang.Validate.noNullElements(var38);
//     java.lang.String var40 = java.text.MessageFormat.format("hi!", var38);
//     org.apache.commons.lang.Validate.noNullElements(var38, "hi!");
//     org.apache.commons.lang.Validate.noNullElements(var38, "hi!");
//     org.apache.commons.lang.Validate.notEmpty(var38, "hi!");
//     java.lang.String var47 = java.text.MessageFormat.format("hi!", var38);
//     java.lang.StringBuffer var48 = null;
//     java.text.FieldPosition var49 = null;
//     java.lang.StringBuffer var50 = var2.format(var38, var48, var49);
// 
//   }

  public void test360() {}
//   public void test360() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test360"); }
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
//     var2.applyPattern("");
//     java.util.Map var25 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25);
//     java.text.Format[] var27 = var26.getFormats();
//     var26.applyPattern("");
//     org.apache.commons.lang.Validate.notNull((java.lang.Object)var26);
//     java.util.Locale var33 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var33);
//     java.text.Format[] var35 = var34.getFormats();
//     java.lang.String var36 = java.text.MessageFormat.format("hi!", (java.lang.Object[])var35);
//     java.lang.String var37 = var26.format((java.lang.Object)var35);
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var35);
//     java.lang.StringBuffer var39 = null;
//     java.text.FieldPosition var40 = null;
//     java.lang.StringBuffer var41 = var2.format((java.lang.Object)var35, var39, var40);
// 
//   }

  public void test361() {}
//   public void test361() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test361"); }
// 
// 
//     java.util.Map var3 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
//     boolean var6 = var4.equals((java.lang.Object)1L);
//     java.util.Locale var7 = var4.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
//     java.util.Map var9 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7, var9);
//     java.text.ParsePosition var12 = null;
//     java.lang.Object var13 = var10.parseObject("", var12);
// 
//   }

  public void test362() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test362"); }


    java.util.Locale var2 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var2);
    java.text.Format[] var4 = var3.getFormatsByArgumentIndex();
    java.text.Format[] var5 = var3.getFormatsByArgumentIndex();
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    boolean var12 = var10.equals((java.lang.Object)1L);
    java.util.Locale var13 = var10.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    java.util.Map var15 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var13, var15);
    java.util.Map var21 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var21);
    boolean var24 = var22.equals((java.lang.Object)1L);
    java.util.Locale var25 = var22.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25);
    java.util.Map var27 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25, var27);
    java.util.Map var29 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var30 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var25, var29);
    var16.setLocale(var25);
    var3.setLocale(var25);
    org.apache.commons.lang.text.ExtendedMessageFormat var33 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var25);
    java.util.Map var35 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var36 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var35);
    boolean var38 = var36.equals((java.lang.Object)1L);
    java.util.Locale var39 = var36.getLocale();
    java.text.Format[] var40 = var36.getFormatsByArgumentIndex();
    boolean var42 = var36.equals((java.lang.Object)(short)10);
    java.text.Format[] var43 = var36.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var33.setFormats(var43);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
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
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test363() {}
//   public void test363() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test363"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     java.text.Format[] var3 = var2.getFormats();
//     java.lang.Object var4 = var2.clone();
//     java.util.Map var7 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
//     java.text.Format[] var9 = var8.getFormats();
//     java.lang.String var10 = var8.toPattern();
//     java.lang.Object var11 = var8.clone();
//     java.lang.String var12 = var8.toPattern();
//     java.util.Map var16 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var16);
//     boolean var19 = var17.equals((java.lang.Object)1L);
//     java.util.Locale var20 = var17.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var20);
//     org.apache.commons.lang.text.ExtendedMessageFormat var22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var20);
//     var8.setLocale(var20);
//     org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var20);
//     java.util.Locale var25 = var24.getLocale();
//     java.util.Map var28 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var28);
//     java.text.Format[] var30 = var29.getFormats();
//     java.lang.String var31 = var29.toPattern();
//     java.lang.Object var32 = var29.clone();
//     java.util.Locale var33 = var29.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var33);
//     boolean var35 = var24.equals((java.lang.Object)var34);
//     java.text.Format[] var36 = var24.getFormats();
//     java.lang.StringBuffer var37 = null;
//     java.text.FieldPosition var38 = null;
//     java.lang.StringBuffer var39 = var2.format((java.lang.Object)var36, var37, var38);
// 
//   }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test364"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.util.Locale var3 = var2.getLocale();
    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    java.text.Format[] var8 = var7.getFormats();
    var7.applyPattern("");
    var7.applyPattern("");
    java.util.Locale var13 = var7.getLocale();
    java.util.Map var14 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var13, var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var16 = var2.formatToCharacterIterator((java.lang.Object)"hi!");
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test365() {}
//   public void test365() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test365"); }
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
//     java.lang.String var15 = var2.toPattern();
//     java.text.ParsePosition var17 = null;
//     java.lang.Object[] var18 = var2.parse("", var17);
// 
//   }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test366"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.util.Locale var3 = var2.getLocale();
    var2.applyPattern("");
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    java.text.Format[] var9 = var8.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var9, "");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var9);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var9);
    java.text.AttributedCharacterIterator var14 = var2.formatToCharacterIterator((java.lang.Object)var9);
    java.text.Format[] var15 = var2.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var15, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test367"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    java.lang.Object var5 = var2.clone();
    java.util.Map var10 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    boolean var13 = var11.equals((java.lang.Object)1L);
    java.util.Locale var14 = var11.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var14);
    org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var14);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var16);
    java.util.Map var20 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var20);
    boolean var23 = var21.equals((java.lang.Object)1L);
    java.util.Locale var24 = var21.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var25 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var24);
    java.util.Map var27 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27);
    java.text.Format[] var29 = var28.getFormats();
    java.util.Map var32 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var32);
    boolean var35 = var33.equals((java.lang.Object)1L);
    java.util.Locale var36 = var33.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var37 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var36);
    var28.setLocale(var36);
    var25.setLocale(var36);
    java.util.Locale var40 = var25.getLocale();
    java.text.Format[] var41 = var25.getFormatsByArgumentIndex();
    java.text.Format[] var42 = var25.getFormatsByArgumentIndex();
    boolean var43 = var16.equals((java.lang.Object)var42);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(0, (java.text.Format)var16);
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
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);

  }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test368"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.String var4 = var2.toPattern();
    var2.applyPattern("hi!");
    java.text.Format[] var7 = var2.getFormatsByArgumentIndex();
    var2.applyPattern("");
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    boolean var16 = var14.equals((java.lang.Object)1L);
    java.util.Locale var17 = var14.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
    java.util.Map var19 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17, var19);
    java.util.Locale var21 = var20.getLocale();
    java.text.Format[] var22 = var20.getFormatsByArgumentIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var23 = var2.format((java.lang.Object)var20);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test369() {}
//   public void test369() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test369"); }
// 
// 
//     java.util.Map var3 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var3);
//     boolean var6 = var4.equals((java.lang.Object)1L);
//     java.util.Locale var7 = var4.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var7);
//     org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
//     java.text.ParsePosition var11 = null;
//     java.lang.Object[] var12 = var9.parse("", var11);
// 
//   }

  public void test370() {}
//   public void test370() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test370"); }
// 
// 
//     java.util.Map var1 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
//     boolean var4 = var2.equals((java.lang.Object)1L);
//     java.util.Locale var5 = var2.getLocale();
//     java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
//     boolean var8 = var2.equals((java.lang.Object)(short)10);
//     java.text.Format[] var9 = var2.getFormatsByArgumentIndex();
//     java.util.Map var11 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var11);
//     boolean var14 = var12.equals((java.lang.Object)1L);
//     java.util.Locale var15 = var12.getLocale();
//     var2.setLocale(var15);
//     java.util.Map var18 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
//     java.text.Format[] var20 = var19.getFormats();
//     java.util.Map var23 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var23);
//     boolean var26 = var24.equals((java.lang.Object)1L);
//     java.util.Locale var27 = var24.getLocale();
//     org.apache.commons.lang.text.ExtendedMessageFormat var28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var27);
//     var19.setLocale(var27);
//     java.util.Map var31 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var32 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var31);
//     java.util.Map var34 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var35 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var34);
//     boolean var37 = var35.equals((java.lang.Object)1L);
//     java.util.Locale var38 = var35.getLocale();
//     java.text.Format[] var39 = var35.getFormatsByArgumentIndex();
//     boolean var40 = var32.equals((java.lang.Object)var39);
//     java.lang.String var41 = var19.format((java.lang.Object)var39);
//     org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var39);
//     java.lang.StringBuffer var43 = null;
//     java.text.FieldPosition var44 = null;
//     java.lang.StringBuffer var45 = var2.format((java.lang.Object[])var39, var43, var44);
// 
//   }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test371"); }


    java.util.Map var3 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var3);
    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    boolean var9 = var7.equals((java.lang.Object)1L);
    java.util.Locale var10 = var7.getLocale();
    java.text.Format[] var11 = var7.getFormatsByArgumentIndex();
    boolean var12 = var4.equals((java.lang.Object)var11);
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
    var4.setLocale(var28);
    java.lang.Object var39 = var4.parseObject("hi!");
    java.util.Map var42 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var43 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var42);
    java.text.Format[] var44 = var43.getFormats();
    java.lang.String var45 = java.text.MessageFormat.format("", (java.lang.Object[])var44);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var44);
    java.text.AttributedCharacterIterator var47 = var4.formatToCharacterIterator((java.lang.Object)var44);
    java.lang.Object var48 = var4.clone();
    java.util.Locale var49 = var4.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var50 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var49);
    java.util.Map var51 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var52 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var49, var51);
    java.util.Locale var54 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var55 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var54);
    boolean var57 = var55.equals((java.lang.Object)(byte)(-1));
    java.util.Map var61 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var62 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var61);
    java.text.Format[] var63 = var62.getFormats();
    java.lang.String var64 = var62.toPattern();
    java.lang.Object var65 = var62.clone();
    java.util.Map var70 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var71 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var70);
    boolean var73 = var71.equals((java.lang.Object)1L);
    java.util.Locale var74 = var71.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var75 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var74);
    java.util.Map var76 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var77 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var74, var76);
    java.util.Map var78 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var79 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var74, var78);
    var62.setLocale(var74);
    java.util.Map var81 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var82 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var74, var81);
    org.apache.commons.lang.text.ExtendedMessageFormat var83 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var74);
    var55.setLocale(var74);
    java.lang.StringBuffer var85 = null;
    java.text.FieldPosition var86 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var87 = var52.format((java.lang.Object)var74, var85, var86);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
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
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + ""+ "'", var45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + ""+ "'", var64.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test372"); }


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
    java.text.Format[] var46 = var2.getFormatsByArgumentIndex();
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
      var2.setFormatsByArgumentIndex(var89);
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

  public void test373() {}
//   public void test373() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test373"); }
// 
// 
//     java.util.Map var6 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
//     java.text.Format[] var8 = var7.getFormats();
//     var7.applyPattern("");
//     var7.applyPattern("");
//     java.util.Locale var13 = var7.getLocale();
//     java.util.Map var14 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var13, var14);
//     org.apache.commons.lang.text.ExtendedMessageFormat var16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var13);
//     java.util.Map var17 = null;
//     org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var13, var17);
//     org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var13);
//     org.apache.commons.lang.text.ExtendedMessageFormat var20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
//     java.lang.String var21 = var20.toPattern();
//     java.text.ParsePosition var23 = null;
//     java.lang.Object[] var24 = var20.parse("hi!", var23);
// 
//   }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test374"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    boolean var4 = var2.equals((java.lang.Object)1L);
    java.util.Locale var5 = var2.getLocale();
    java.text.Format[] var6 = var2.getFormatsByArgumentIndex();
    java.text.Format[] var7 = var2.getFormats();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
    var2.applyPattern("hi!");
    java.util.Map var12 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var12);
    java.text.Format[] var14 = var13.getFormats();
    java.text.Format[] var15 = var13.getFormats();
    java.text.Format[] var16 = var13.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormats(var16);
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test375() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test375"); }


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
    var7.applyPattern("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var28 = var7.parse("");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
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

  }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test376"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.util.Map var6 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var6);
    boolean var9 = var7.equals((java.lang.Object)1L);
    java.util.Locale var10 = var7.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var10);
    var2.setLocale(var10);
    java.text.Format[] var13 = var2.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.notEmpty((java.lang.Object[])var13, "");
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
    assertNotNull(var13);

  }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test377"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    java.lang.Object var4 = var2.clone();
    var2.applyPattern("");
    java.util.Map var8 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var8);
    java.text.Format[] var10 = var9.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var10, "");
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var10, "hi!");
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatsByArgumentIndex(var10);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test378"); }


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
    java.util.Locale var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var30);
    java.util.Map var33 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var33);
    boolean var36 = var34.equals((java.lang.Object)1L);
    java.util.Locale var37 = var34.getLocale();
    var31.setLocale(var37);
    org.apache.commons.lang.text.ExtendedMessageFormat var39 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var37);
    java.lang.Object var40 = var39.clone();
    java.util.Map var42 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var43 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var42);
    boolean var45 = var43.equals((java.lang.Object)1L);
    java.util.Locale var46 = var43.getLocale();
    java.text.Format[] var47 = var43.getFormatsByArgumentIndex();
    java.text.Format[] var48 = var43.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var48);
    java.text.AttributedCharacterIterator var50 = var39.formatToCharacterIterator((java.lang.Object)var48);
    java.util.Locale var51 = var39.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFormatByArgumentIndex(1, (java.text.Format)var39);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test379"); }


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
    java.util.Map var28 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var28);
    boolean var31 = var29.equals((java.lang.Object)1L);
    java.util.Locale var32 = var29.getLocale();
    java.text.Format[] var33 = var29.getFormatsByArgumentIndex();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var33, "");
    boolean var36 = var26.equals((java.lang.Object)var33);
    java.lang.String var37 = var26.toPattern();
    java.util.Map var42 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var43 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var42);
    boolean var45 = var43.equals((java.lang.Object)1L);
    java.util.Locale var46 = var43.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var47 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var46);
    java.util.Map var48 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var49 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var46, var48);
    java.util.Map var50 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var51 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var46, var50);
    var26.setLocale(var46);
    org.apache.commons.lang.text.ExtendedMessageFormat var53 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var46);
    java.util.Map var56 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var57 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var56);
    boolean var59 = var57.equals((java.lang.Object)1L);
    java.lang.Object var60 = var57.clone();
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var57);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var53.setFormatByArgumentIndex((-1), (java.text.Format)var57);
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
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test380"); }


    org.apache.commons.lang.text.ExtendedMessageFormat var1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
    java.text.Format[] var2 = var1.getFormatsByArgumentIndex();
    java.lang.Object[] var7 = new java.lang.Object[] { (-1)};
    org.apache.commons.lang.Validate.noNullElements(var7);
    java.lang.String var9 = java.text.MessageFormat.format("hi!", var7);
    java.lang.String var10 = java.text.MessageFormat.format("", var7);
    java.lang.String var11 = java.text.MessageFormat.format("hi!", var7);
    java.lang.Object[] var12 = new java.lang.Object[] { var11};
    org.apache.commons.lang.Validate.notEmpty(var12);
    java.text.AttributedCharacterIterator var14 = var1.formatToCharacterIterator((java.lang.Object)var12);
    java.util.Map var17 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var17);
    java.text.Format[] var19 = var18.getFormats();
    var18.applyPattern("");
    var18.applyPattern("");
    java.util.Locale var24 = var18.getLocale();
    java.util.Map var25 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var24, var25);
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var26, "");
    java.text.Format[] var29 = var26.getFormats();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var30 = var1.formatToCharacterIterator((java.lang.Object)var26);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test381"); }


    java.util.Locale var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var4);
    java.util.Map var7 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var7);
    boolean var10 = var8.equals((java.lang.Object)1L);
    java.util.Locale var11 = var8.getLocale();
    var5.setLocale(var11);
    java.util.Map var13 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var11, var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang.Validate.isTrue(false, "hi!", (java.lang.Object)var13);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test382"); }


    org.apache.commons.lang.text.ExtendedMessageFormat var1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
    java.text.Format[] var2 = var1.getFormatsByArgumentIndex();
    java.util.Map var4 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var4);
    java.text.Format[] var6 = var5.getFormats();
    java.util.Map var9 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var9);
    boolean var12 = var10.equals((java.lang.Object)1L);
    java.util.Locale var13 = var10.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var13);
    var5.setLocale(var13);
    java.util.Map var18 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var18);
    boolean var21 = var19.equals((java.lang.Object)1L);
    java.util.Locale var22 = var19.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", var22);
    java.util.Map var25 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var25);
    java.text.Format[] var27 = var26.getFormats();
    java.util.Map var30 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var30);
    boolean var33 = var31.equals((java.lang.Object)1L);
    java.util.Locale var34 = var31.getLocale();
    org.apache.commons.lang.text.ExtendedMessageFormat var35 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var34);
    var26.setLocale(var34);
    var23.setLocale(var34);
    java.util.Locale var38 = var23.getLocale();
    boolean var39 = var5.equals((java.lang.Object)var23);
    boolean var40 = var1.equals((java.lang.Object)var5);
    java.text.Format[] var41 = var1.getFormats();
    java.util.Map var43 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var44 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var43);
    java.text.Format[] var45 = var44.getFormats();
    java.lang.String var46 = var44.toPattern();
    java.util.Locale var48 = null;
    java.util.Map var49 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var50 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var48, var49);
    boolean var51 = var44.equals((java.lang.Object)var48);
    var44.applyPattern("");
    java.text.Format[] var54 = var44.getFormats();
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var54);
    org.apache.commons.lang.Validate.noNullElements((java.lang.Object[])var54, "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var58 = var1.format((java.lang.Object)"hi!");
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + ""+ "'", var46.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test383"); }


    java.util.Map var1 = null;
    org.apache.commons.lang.text.ExtendedMessageFormat var2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var1);
    java.text.Format[] var3 = var2.getFormats();
    var2.applyPattern("");
    org.apache.commons.lang.Validate.notNull((java.lang.Object)var2);
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
    org.apache.commons.lang.text.ExtendedMessageFormat var33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", var24);
    org.apache.commons.lang.text.ExtendedMessageFormat var34 = new org.apache
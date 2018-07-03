
import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test1"); }


    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.jscomp.DiagnosticType var4 = com.google.javascript.jscomp.DiagnosticType.error("hi!", ": ");
    com.google.javascript.jscomp.DiagnosticType var7 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
    com.google.javascript.rhino.Node var9 = null;
    com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at hi! line (unknown line) : (unknown column)", "hi!: hi!");
    java.lang.String[] var14 = new java.lang.String[] { "hi!: hi!"};
    com.google.javascript.jscomp.JSError var15 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3", var9, var12, var14);
    com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make(var7, var14);
    com.google.javascript.jscomp.JSError var17 = com.google.javascript.jscomp.JSError.make("hi!: ", var1, var4, var14);
    com.google.javascript.jscomp.DiagnosticType var18 = var17.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test2"); }


    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.jscomp.DiagnosticType var4 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var9 = null;
    com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.make("", var9, "hi!");
    java.lang.String[] var13 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var14 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var11, var13);
    com.google.javascript.jscomp.JSError var15 = com.google.javascript.jscomp.JSError.make("hi!", var1, var4, var13);
    com.google.javascript.jscomp.DiagnosticType var16 = var15.getType();
    int var17 = var15.getCharno();
    boolean var19 = var15.equals((java.lang.Object)(short)1);
    java.lang.String var20 = var15.toString();
    com.google.javascript.jscomp.DiagnosticType var21 = var15.getType();
    com.google.javascript.jscomp.DiagnosticType var22 = var15.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!. hi! at hi! line (unknown line) : (unknown column)"+ "'", var20.equals("hi!. hi! at hi! line (unknown line) : (unknown column)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test3"); }


    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.jscomp.DiagnosticType var4 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at hi! line (unknown line) : (unknown column)", "hi!: hi!");
    java.lang.String[] var6 = new java.lang.String[] { "hi!: hi!"};
    com.google.javascript.jscomp.JSError var7 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3", var1, var4, var6);
    java.lang.String var8 = var7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!. hi! at hi! line (unknown line) : (unknown column). hi!: hi! at hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3 line (unknown line) : (unknown column)"+ "'", var8.equals("hi!. hi! at hi! line (unknown line) : (unknown column). hi!: hi! at hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3 line (unknown line) : (unknown column)"));

  }

  public void test4() {}
//   public void test4() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test4"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var0 = null;
//     com.google.javascript.rhino.Node var2 = null;
//     com.google.javascript.rhino.Node var4 = null;
//     com.google.javascript.jscomp.DiagnosticType var7 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var12 = null;
//     com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.make("", var12, "hi!");
//     java.lang.String[] var16 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var17 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var14, var16);
//     com.google.javascript.jscomp.JSError var18 = com.google.javascript.jscomp.JSError.make("hi!", var4, var7, var16);
//     com.google.javascript.rhino.Node var20 = null;
//     com.google.javascript.jscomp.DiagnosticType var23 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var28 = null;
//     com.google.javascript.jscomp.DiagnosticType var30 = com.google.javascript.jscomp.DiagnosticType.make("", var28, "hi!");
//     java.lang.String[] var32 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var33 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var30, var32);
//     com.google.javascript.jscomp.JSError var34 = com.google.javascript.jscomp.JSError.make("hi!", var20, var23, var32);
//     com.google.javascript.jscomp.JSError var35 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var2, var7, var32);
//     com.google.javascript.jscomp.JSError var36 = com.google.javascript.jscomp.JSError.make(var0, var32);
// 
//   }

  public void test5() {}
//   public void test5() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test5"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "hi!: : . hi! at (unknown source) line (unknown line) : (unknown column): hi!. hi! at (unknown source) line (unknown line) : (unknown column): ");
// 
//   }

  public void test6() {}
//   public void test6() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test6"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
// 
//   }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test7"); }


    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.jscomp.DiagnosticType var4 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "");
    com.google.javascript.jscomp.CheckLevel var8 = null;
    com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at hi! line (unknown line) : (unknown column)", "");
    com.google.javascript.jscomp.CheckLevel var16 = null;
    com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.make("", var16, "hi!");
    java.lang.String[] var20 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var21 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var18, var20);
    com.google.javascript.jscomp.JSError var22 = com.google.javascript.jscomp.JSError.make(": ", 100, 100, var8, var11, var20);
    com.google.javascript.jscomp.JSError var23 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column): ", var1, var4, var20);
    com.google.javascript.rhino.Node var25 = null;
    com.google.javascript.jscomp.DiagnosticType var28 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
    com.google.javascript.jscomp.CheckLevel var33 = null;
    com.google.javascript.jscomp.DiagnosticType var35 = com.google.javascript.jscomp.DiagnosticType.make("", var33, "hi!");
    java.lang.String[] var37 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var38 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var35, var37);
    com.google.javascript.jscomp.JSError var39 = com.google.javascript.jscomp.JSError.make("", var25, var28, var37);
    com.google.javascript.jscomp.DiagnosticType var42 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
    int var43 = var28.compareTo(var42);
    int var44 = var4.compareTo(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 5);

  }

  public void test8() {}
//   public void test8() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test8"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var4 = null;
//     com.google.javascript.rhino.Node var6 = null;
//     com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "");
//     com.google.javascript.jscomp.CheckLevel var13 = null;
//     com.google.javascript.jscomp.DiagnosticType var16 = com.google.javascript.jscomp.DiagnosticType.disabled("", "");
//     com.google.javascript.rhino.Node var18 = null;
//     com.google.javascript.rhino.Node var20 = null;
//     com.google.javascript.jscomp.DiagnosticType var23 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var28 = null;
//     com.google.javascript.jscomp.DiagnosticType var30 = com.google.javascript.jscomp.DiagnosticType.make("", var28, "hi!");
//     java.lang.String[] var32 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var33 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var30, var32);
//     com.google.javascript.jscomp.JSError var34 = com.google.javascript.jscomp.JSError.make("hi!", var20, var23, var32);
//     com.google.javascript.rhino.Node var36 = null;
//     com.google.javascript.jscomp.DiagnosticType var39 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var44 = null;
//     com.google.javascript.jscomp.DiagnosticType var46 = com.google.javascript.jscomp.DiagnosticType.make("", var44, "hi!");
//     java.lang.String[] var48 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var49 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var46, var48);
//     com.google.javascript.jscomp.JSError var50 = com.google.javascript.jscomp.JSError.make("hi!", var36, var39, var48);
//     com.google.javascript.jscomp.JSError var51 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var18, var23, var48);
//     com.google.javascript.rhino.Node var53 = null;
//     com.google.javascript.jscomp.DiagnosticType var56 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var61 = null;
//     com.google.javascript.jscomp.DiagnosticType var63 = com.google.javascript.jscomp.DiagnosticType.make("", var61, "hi!");
//     java.lang.String[] var65 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var66 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var63, var65);
//     com.google.javascript.jscomp.JSError var67 = com.google.javascript.jscomp.JSError.make("hi!", var53, var56, var65);
//     com.google.javascript.jscomp.JSError var68 = com.google.javascript.jscomp.JSError.make(var23, var65);
//     com.google.javascript.jscomp.JSError var69 = com.google.javascript.jscomp.JSError.make("", 0, 100, var13, var16, var65);
//     com.google.javascript.jscomp.JSError var70 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column): : hi!", var6, var9, var65);
//     com.google.javascript.jscomp.JSError var71 = com.google.javascript.jscomp.JSError.make(": hi!. hi! at hi! line (unknown line) : (unknown column): hi!. hi! at hi!: hi! line 0 : -3", (-12), 109, var3, var4, var65);
// 
//   }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test9"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make(". hi! at (unknown source) line 0 : 0", var1, ".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test10"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("hi!. hi! at (unknown source) line -67 : 0", var1, "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test11"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning("hi!.  at hi!: hi! line (unknown line) : 10", "hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3");
    com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", ": hi!");
    com.google.javascript.jscomp.CheckLevel var7 = null;
    com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var7, "hi!: hi!: ");
    int var10 = var5.compareTo(var9);
    int var11 = var2.compareTo(var5);
    com.google.javascript.jscomp.CheckLevel var15 = null;
    com.google.javascript.jscomp.CheckLevel var17 = null;
    com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.make("", var17, "");
    com.google.javascript.jscomp.CheckLevel var24 = null;
    com.google.javascript.jscomp.DiagnosticType var26 = com.google.javascript.jscomp.DiagnosticType.make("", var24, "hi!");
    java.lang.String[] var28 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var29 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var26, var28);
    com.google.javascript.rhino.Node var31 = null;
    com.google.javascript.jscomp.DiagnosticType var34 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var39 = null;
    com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.make("", var39, "hi!");
    java.lang.String[] var43 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var44 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var41, var43);
    com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make("hi!", var31, var34, var43);
    com.google.javascript.jscomp.JSError var46 = com.google.javascript.jscomp.JSError.make(var26, var43);
    com.google.javascript.jscomp.JSError var47 = com.google.javascript.jscomp.JSError.make(": ", 0, (-64), var15, var19, var43);
    boolean var48 = var2.equals((java.lang.Object)var19);
    java.lang.String var49 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-12));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!.  at hi!: hi! line (unknown line) : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3"+ "'", var49.equals("hi!.  at hi!: hi! line (unknown line) : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf(".  at (unknown source) line -3 : (unknown column). hi!: hi!: hi! at hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3 line 100 : -39");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test13() {}
//   public void test13() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test13"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, ". hi! at (unknown source) line 0 : 0: ");
// 
//   }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test14"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!: : . hi! at (unknown source) line (unknown line) : (unknown column): hi!. hi! at (unknown source) line (unknown line) : (unknown column): ", ": hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test15() {}
//   public void test15() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test15"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at hi!.  at hi!: hi! line (unknown line) : 10 line 54 : -3", ". hi! at hi! line 1 : (unknown column)");
//     com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.error("", "hi!");
//     com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!.  at hi!: hi! line (unknown line) : 10", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.CheckLevel var15 = null;
//     com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var22 = null;
//     com.google.javascript.jscomp.CheckLevel var24 = null;
//     com.google.javascript.jscomp.DiagnosticType var26 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var24, "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.CheckLevel var31 = null;
//     com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.make("", var31, "hi!");
//     java.lang.String[] var35 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var36 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var33, var35);
//     com.google.javascript.rhino.Node var38 = null;
//     com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var46 = null;
//     com.google.javascript.jscomp.DiagnosticType var48 = com.google.javascript.jscomp.DiagnosticType.make("", var46, "hi!");
//     java.lang.String[] var50 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var51 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var48, var50);
//     com.google.javascript.jscomp.JSError var52 = com.google.javascript.jscomp.JSError.make("hi!", var38, var41, var50);
//     com.google.javascript.jscomp.JSError var53 = com.google.javascript.jscomp.JSError.make(var33, var50);
//     com.google.javascript.jscomp.JSError var54 = com.google.javascript.jscomp.JSError.make("", 0, 1, var22, var26, var50);
//     com.google.javascript.jscomp.JSError var55 = com.google.javascript.jscomp.JSError.make("hi!.  at hi!: hi! line (unknown line) : 10", 1, (-1), var15, var18, var50);
//     com.google.javascript.jscomp.JSError var56 = com.google.javascript.jscomp.JSError.make("", (-3), (-12), var11, var50);
//     com.google.javascript.jscomp.JSError var57 = com.google.javascript.jscomp.JSError.make(var5, var50);
//     com.google.javascript.jscomp.JSError var58 = com.google.javascript.jscomp.JSError.make(var2, var50);
//     com.google.javascript.jscomp.CheckLevel var59 = null;
//     com.google.javascript.jscomp.MessageFormatter var60 = null;
//     java.lang.String var61 = var58.format(var59, var60);
// 
//   }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test16"); }


    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.jscomp.DiagnosticType var4 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at hi! line (unknown line) : (unknown column)", "hi!: hi!");
    com.google.javascript.jscomp.CheckLevel var8 = null;
    com.google.javascript.jscomp.CheckLevel var10 = null;
    com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.make("", var10, "hi!");
    com.google.javascript.rhino.Node var14 = null;
    com.google.javascript.rhino.Node var16 = null;
    com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var24 = null;
    com.google.javascript.jscomp.DiagnosticType var26 = com.google.javascript.jscomp.DiagnosticType.make("", var24, "hi!");
    java.lang.String[] var28 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var29 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var26, var28);
    com.google.javascript.jscomp.JSError var30 = com.google.javascript.jscomp.JSError.make("hi!", var16, var19, var28);
    com.google.javascript.rhino.Node var32 = null;
    com.google.javascript.jscomp.DiagnosticType var35 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var40 = null;
    com.google.javascript.jscomp.DiagnosticType var42 = com.google.javascript.jscomp.DiagnosticType.make("", var40, "hi!");
    java.lang.String[] var44 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var42, var44);
    com.google.javascript.jscomp.JSError var46 = com.google.javascript.jscomp.JSError.make("hi!", var32, var35, var44);
    com.google.javascript.jscomp.JSError var47 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var14, var19, var44);
    com.google.javascript.jscomp.JSError var48 = com.google.javascript.jscomp.JSError.make("hi!", 0, (-1), var8, var12, var44);
    com.google.javascript.jscomp.JSError var49 = com.google.javascript.jscomp.JSError.make("", var1, var4, var44);
    com.google.javascript.jscomp.DiagnosticType var52 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    int var53 = var4.compareTo(var52);
    boolean var55 = var52.equals((java.lang.Object)(-3));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test17"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error(".  at (unknown source) line 1 : 10: hi!: hi!: ", ".  at hi!. hi! at hi! line (unknown line) : (unknown column) line -3 : 0");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test18"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make(".  at (unknown source) line 0 : 1", var1, ".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test19() {}
//   public void test19() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test19"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var1 = null;
//     com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make(".  at :  line -12 : 46", var1, "");
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.jscomp.DiagnosticType var10 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!.  at hi!: hi! line (unknown line) : 10", ".  at (unknown source) line 1 : 10");
//     com.google.javascript.rhino.Node var12 = null;
//     com.google.javascript.jscomp.DiagnosticType var15 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var20 = null;
//     com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.make("", var20, "hi!");
//     java.lang.String[] var24 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var25 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var22, var24);
//     com.google.javascript.jscomp.JSError var26 = com.google.javascript.jscomp.JSError.make("hi!", var12, var15, var24);
//     int var27 = var26.getCharno();
//     com.google.javascript.jscomp.DiagnosticType var28 = var26.getType();
//     boolean var29 = var10.equals((java.lang.Object)var28);
//     com.google.javascript.jscomp.CheckLevel var33 = null;
//     com.google.javascript.jscomp.CheckLevel var35 = null;
//     com.google.javascript.jscomp.DiagnosticType var37 = com.google.javascript.jscomp.DiagnosticType.make("", var35, "");
//     com.google.javascript.jscomp.CheckLevel var42 = null;
//     com.google.javascript.jscomp.DiagnosticType var44 = com.google.javascript.jscomp.DiagnosticType.make("", var42, "hi!");
//     java.lang.String[] var46 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var47 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var44, var46);
//     com.google.javascript.rhino.Node var49 = null;
//     com.google.javascript.jscomp.DiagnosticType var52 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var57 = null;
//     com.google.javascript.jscomp.DiagnosticType var59 = com.google.javascript.jscomp.DiagnosticType.make("", var57, "hi!");
//     java.lang.String[] var61 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var62 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var59, var61);
//     com.google.javascript.jscomp.JSError var63 = com.google.javascript.jscomp.JSError.make("hi!", var49, var52, var61);
//     com.google.javascript.jscomp.JSError var64 = com.google.javascript.jscomp.JSError.make(var44, var61);
//     com.google.javascript.jscomp.JSError var65 = com.google.javascript.jscomp.JSError.make(": ", 0, (-64), var33, var37, var61);
//     com.google.javascript.jscomp.JSError var66 = com.google.javascript.jscomp.JSError.make("", (-67), 0, var7, var28, var61);
//     com.google.javascript.jscomp.JSError var67 = com.google.javascript.jscomp.JSError.make(var3, var61);
//     com.google.javascript.jscomp.CheckLevel var68 = null;
//     com.google.javascript.jscomp.MessageFormatter var69 = null;
//     java.lang.String var70 = var67.format(var68, var69);
// 
//   }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test20"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning(".  at (unknown source) line -3 : (unknown column): .  at (unknown source) line 1 : 10: hi!: hi!: ", ".  at (unknown source) line -3 : (unknown column). hi!: hi!: hi! at hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3 line 100 : -39");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test21() {}
//   public void test21() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test21"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.jscomp.CheckLevel var5 = null;
//     com.google.javascript.jscomp.DiagnosticType var7 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var5, "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.CheckLevel var12 = null;
//     com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.make("", var12, "hi!");
//     java.lang.String[] var16 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var17 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var14, var16);
//     com.google.javascript.rhino.Node var19 = null;
//     com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var27 = null;
//     com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.make("", var27, "hi!");
//     java.lang.String[] var31 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var32 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var29, var31);
//     com.google.javascript.jscomp.JSError var33 = com.google.javascript.jscomp.JSError.make("hi!", var19, var22, var31);
//     com.google.javascript.jscomp.JSError var34 = com.google.javascript.jscomp.JSError.make(var14, var31);
//     com.google.javascript.jscomp.JSError var35 = com.google.javascript.jscomp.JSError.make("", 0, 1, var3, var7, var31);
//     com.google.javascript.rhino.Node var37 = null;
//     com.google.javascript.rhino.Node var39 = null;
//     com.google.javascript.jscomp.DiagnosticType var42 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var47 = null;
//     com.google.javascript.jscomp.DiagnosticType var49 = com.google.javascript.jscomp.DiagnosticType.make("", var47, "hi!");
//     java.lang.String[] var51 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var52 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var49, var51);
//     com.google.javascript.jscomp.JSError var53 = com.google.javascript.jscomp.JSError.make("hi!", var39, var42, var51);
//     com.google.javascript.rhino.Node var55 = null;
//     com.google.javascript.jscomp.DiagnosticType var58 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var63 = null;
//     com.google.javascript.jscomp.DiagnosticType var65 = com.google.javascript.jscomp.DiagnosticType.make("", var63, "hi!");
//     java.lang.String[] var67 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var68 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var65, var67);
//     com.google.javascript.jscomp.JSError var69 = com.google.javascript.jscomp.JSError.make("hi!", var55, var58, var67);
//     com.google.javascript.jscomp.JSError var70 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var37, var42, var67);
//     com.google.javascript.rhino.Node var72 = null;
//     com.google.javascript.jscomp.DiagnosticType var75 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var80 = null;
//     com.google.javascript.jscomp.DiagnosticType var82 = com.google.javascript.jscomp.DiagnosticType.make("", var80, "hi!");
//     java.lang.String[] var84 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var85 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var82, var84);
//     com.google.javascript.jscomp.JSError var86 = com.google.javascript.jscomp.JSError.make("hi!", var72, var75, var84);
//     com.google.javascript.jscomp.JSError var87 = com.google.javascript.jscomp.JSError.make(var42, var84);
//     boolean var88 = var7.equals((java.lang.Object)var87);
//     java.lang.String var89 = var87.toString();
//     com.google.javascript.jscomp.CheckLevel var90 = null;
//     com.google.javascript.jscomp.MessageFormatter var91 = null;
//     java.lang.String var92 = var87.format(var90, var91);
// 
//   }

  public void test22() {}
//   public void test22() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test22"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CheckLevel var2 = null;
//     com.google.javascript.jscomp.DiagnosticType var3 = null;
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.jscomp.DiagnosticType var10 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : hi!", ". hi! at (unknown source) line (unknown line) : (unknown column): hi!. hi! at (unknown source) line (unknown line) : (unknown column): ");
//     com.google.javascript.rhino.Node var12 = null;
//     com.google.javascript.jscomp.DiagnosticType var15 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!.  at hi!: hi! line (unknown line) : 10", ".  at (unknown source) line 1 : 10");
//     com.google.javascript.rhino.Node var17 = null;
//     com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var25 = null;
//     com.google.javascript.jscomp.DiagnosticType var27 = com.google.javascript.jscomp.DiagnosticType.make("", var25, "hi!");
//     java.lang.String[] var29 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var30 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var27, var29);
//     com.google.javascript.jscomp.JSError var31 = com.google.javascript.jscomp.JSError.make("hi!", var17, var20, var29);
//     int var32 = var31.getCharno();
//     com.google.javascript.jscomp.DiagnosticType var33 = var31.getType();
//     boolean var34 = var15.equals((java.lang.Object)var33);
//     com.google.javascript.jscomp.CheckLevel var39 = null;
//     com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.make("", var39, "hi!");
//     java.lang.String[] var43 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var44 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var41, var43);
//     com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make("", var12, var33, var43);
//     com.google.javascript.jscomp.JSError var46 = com.google.javascript.jscomp.JSError.make(". hi! at (unknown source) line (unknown line) : (unknown column): hi!. hi! at (unknown source) line (unknown line) : (unknown column): ", 4, 10, var7, var10, var43);
//     com.google.javascript.jscomp.JSError var47 = com.google.javascript.jscomp.JSError.make("hi!.  at hi!: hi! line (unknown line) : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3", var1, var2, var3, var43);
// 
//   }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test23"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at (unknown source) line -67 : 0", "hi!: hi!");
    java.lang.String var3 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!. hi! at (unknown source) line -67 : 0: hi!: hi!"+ "'", var3.equals("hi!. hi! at (unknown source) line -67 : 0: hi!: hi!"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test24"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error("hi!: . hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3 at (unknown source) line (unknown line) : (unknown column)", "hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test25"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error("hi!: : ", ".  at (unknown source) line -3 : (unknown column): : : hi!. hi! at hi! line (unknown line) : (unknown column)");
    com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at hi! line (unknown line) : (unknown column)", "hi!: hi!");
    com.google.javascript.jscomp.CheckLevel var10 = null;
    com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.make("", var10, "hi!");
    java.lang.String[] var14 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var15 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var12, var14);
    com.google.javascript.jscomp.DiagnosticType var16 = var15.getType();
    int var17 = var5.compareTo(var16);
    com.google.javascript.rhino.Node var19 = null;
    com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.error(".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : ", "hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3");
    java.lang.String[] var23 = null;
    com.google.javascript.jscomp.JSError var24 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at hi!.  at hi!: hi! line (unknown line) : 10 line 54 : -3", var19, var22, var23);
    com.google.javascript.jscomp.CheckLevel var28 = null;
    com.google.javascript.jscomp.DiagnosticType var31 = com.google.javascript.jscomp.DiagnosticType.warning(": ", "");
    com.google.javascript.rhino.Node var33 = null;
    com.google.javascript.jscomp.DiagnosticType var36 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    com.google.javascript.rhino.Node var38 = null;
    com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var46 = null;
    com.google.javascript.jscomp.DiagnosticType var48 = com.google.javascript.jscomp.DiagnosticType.make("", var46, "hi!");
    java.lang.String[] var50 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var51 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var48, var50);
    com.google.javascript.jscomp.JSError var52 = com.google.javascript.jscomp.JSError.make("hi!", var38, var41, var50);
    com.google.javascript.jscomp.JSError var53 = com.google.javascript.jscomp.JSError.make("hi!: hi!: ", var33, var36, var50);
    com.google.javascript.jscomp.DiagnosticType var54 = var53.getType();
    int var55 = var31.compareTo(var54);
    com.google.javascript.jscomp.CheckLevel var59 = null;
    com.google.javascript.jscomp.CheckLevel var61 = null;
    com.google.javascript.jscomp.DiagnosticType var63 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var61, "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    com.google.javascript.jscomp.CheckLevel var68 = null;
    com.google.javascript.jscomp.DiagnosticType var70 = com.google.javascript.jscomp.DiagnosticType.make("", var68, "hi!");
    java.lang.String[] var72 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var73 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var70, var72);
    com.google.javascript.rhino.Node var75 = null;
    com.google.javascript.jscomp.DiagnosticType var78 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var83 = null;
    com.google.javascript.jscomp.DiagnosticType var85 = com.google.javascript.jscomp.DiagnosticType.make("", var83, "hi!");
    java.lang.String[] var87 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var88 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var85, var87);
    com.google.javascript.jscomp.JSError var89 = com.google.javascript.jscomp.JSError.make("hi!", var75, var78, var87);
    com.google.javascript.jscomp.JSError var90 = com.google.javascript.jscomp.JSError.make(var70, var87);
    com.google.javascript.jscomp.JSError var91 = com.google.javascript.jscomp.JSError.make("", 0, 1, var59, var63, var87);
    com.google.javascript.jscomp.JSError var92 = com.google.javascript.jscomp.JSError.make("", (-39), 1, var28, var54, var87);
    com.google.javascript.jscomp.JSError var93 = com.google.javascript.jscomp.JSError.make(var22, var87);
    int var94 = var16.compareTo(var22);
    boolean var95 = var2.equals((java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == (-149));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test26"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf("hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test27"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf("hi!. hi! at (unknown source) line -67 : 0: hi!: hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test28"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf(". hi! at hi! line 0 : 0");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test29"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf(".  at hi!. hi! at hi! line (unknown line) : (unknown column) line -3 : 0");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test30() {}
//   public void test30() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test30"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning("hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3", ": hi!");
//     com.google.javascript.rhino.Node var4 = null;
//     com.google.javascript.jscomp.DiagnosticType var7 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "");
//     com.google.javascript.jscomp.CheckLevel var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.disabled("", "");
//     com.google.javascript.rhino.Node var16 = null;
//     com.google.javascript.rhino.Node var18 = null;
//     com.google.javascript.jscomp.DiagnosticType var21 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var26 = null;
//     com.google.javascript.jscomp.DiagnosticType var28 = com.google.javascript.jscomp.DiagnosticType.make("", var26, "hi!");
//     java.lang.String[] var30 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var31 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var28, var30);
//     com.google.javascript.jscomp.JSError var32 = com.google.javascript.jscomp.JSError.make("hi!", var18, var21, var30);
//     com.google.javascript.rhino.Node var34 = null;
//     com.google.javascript.jscomp.DiagnosticType var37 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var42 = null;
//     com.google.javascript.jscomp.DiagnosticType var44 = com.google.javascript.jscomp.DiagnosticType.make("", var42, "hi!");
//     java.lang.String[] var46 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var47 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var44, var46);
//     com.google.javascript.jscomp.JSError var48 = com.google.javascript.jscomp.JSError.make("hi!", var34, var37, var46);
//     com.google.javascript.jscomp.JSError var49 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var16, var21, var46);
//     com.google.javascript.rhino.Node var51 = null;
//     com.google.javascript.jscomp.DiagnosticType var54 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var59 = null;
//     com.google.javascript.jscomp.DiagnosticType var61 = com.google.javascript.jscomp.DiagnosticType.make("", var59, "hi!");
//     java.lang.String[] var63 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var64 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var61, var63);
//     com.google.javascript.jscomp.JSError var65 = com.google.javascript.jscomp.JSError.make("hi!", var51, var54, var63);
//     com.google.javascript.jscomp.JSError var66 = com.google.javascript.jscomp.JSError.make(var21, var63);
//     com.google.javascript.jscomp.JSError var67 = com.google.javascript.jscomp.JSError.make("", 0, 100, var11, var14, var63);
//     com.google.javascript.jscomp.JSError var68 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column): : hi!", var4, var7, var63);
//     com.google.javascript.jscomp.JSError var69 = com.google.javascript.jscomp.JSError.make(var2, var63);
//     com.google.javascript.jscomp.CheckLevel var70 = null;
//     com.google.javascript.jscomp.MessageFormatter var71 = null;
//     java.lang.String var72 = var69.format(var70, var71);
// 
//   }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test31"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3", "hi!: hi!: ");
    com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.warning(".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : ", "hi!: hi!");
    com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!.  at hi!: hi! line (unknown line) : 10", ": hi!");
    com.google.javascript.jscomp.CheckLevel var12 = null;
    com.google.javascript.jscomp.DiagnosticType var15 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at hi! line (unknown line) : (unknown column)", "hi!: hi!");
    com.google.javascript.jscomp.CheckLevel var20 = null;
    com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.make("", var20, "hi!");
    java.lang.String[] var24 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var25 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var22, var24);
    com.google.javascript.jscomp.JSError var26 = com.google.javascript.jscomp.JSError.make("hi!.  at hi!: hi! line (unknown line) : 10", (-8), (-64), var12, var15, var24);
    com.google.javascript.jscomp.JSError var27 = com.google.javascript.jscomp.JSError.make(var8, var24);
    com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make(var5, var24);
    com.google.javascript.jscomp.JSError var29 = com.google.javascript.jscomp.JSError.make(var2, var24);
    com.google.javascript.jscomp.CheckLevel var33 = null;
    com.google.javascript.jscomp.DiagnosticType var36 = com.google.javascript.jscomp.DiagnosticType.disabled("", "hi!");
    com.google.javascript.jscomp.CheckLevel var40 = null;
    com.google.javascript.jscomp.DiagnosticType var43 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var46 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var47 = var43.compareTo(var46);
    com.google.javascript.rhino.Node var49 = null;
    com.google.javascript.rhino.Node var51 = null;
    com.google.javascript.jscomp.DiagnosticType var54 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var59 = null;
    com.google.javascript.jscomp.DiagnosticType var61 = com.google.javascript.jscomp.DiagnosticType.make("", var59, "hi!");
    java.lang.String[] var63 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var64 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var61, var63);
    com.google.javascript.jscomp.JSError var65 = com.google.javascript.jscomp.JSError.make("hi!", var51, var54, var63);
    com.google.javascript.rhino.Node var67 = null;
    com.google.javascript.jscomp.DiagnosticType var70 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var75 = null;
    com.google.javascript.jscomp.DiagnosticType var77 = com.google.javascript.jscomp.DiagnosticType.make("", var75, "hi!");
    java.lang.String[] var79 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var80 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var77, var79);
    com.google.javascript.jscomp.JSError var81 = com.google.javascript.jscomp.JSError.make("hi!", var67, var70, var79);
    com.google.javascript.jscomp.JSError var82 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var49, var54, var79);
    com.google.javascript.jscomp.JSError var83 = com.google.javascript.jscomp.JSError.make("", 100, 1, var40, var46, var79);
    com.google.javascript.jscomp.JSError var84 = com.google.javascript.jscomp.JSError.make("", 0, (-1), var33, var36, var79);
    com.google.javascript.jscomp.DiagnosticType var85 = var84.getType();
    com.google.javascript.jscomp.CheckLevel var87 = null;
    com.google.javascript.jscomp.DiagnosticType var89 = com.google.javascript.jscomp.DiagnosticType.make(".  at (unknown source) line -3 : (unknown column)", var87, ".  at (unknown source) line 1 : 10: hi!: hi!: ");
    boolean var90 = var85.equals((java.lang.Object)".  at (unknown source) line 1 : 10: hi!: hi!: ");
    int var91 = var2.compareTo(var85);
    java.lang.String var92 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == 109);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var92 + "' != '" + "hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: hi!: hi!: "+ "'", var92.equals("hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: hi!: hi!: "));

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test32"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf(".  at (unknown source) line 100 : 1");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test33() {}
//   public void test33() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test33"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!.  at hi!: hi! line (unknown line) : 10", ".  at (unknown source) line 1 : 10");
//     com.google.javascript.rhino.Node var8 = null;
//     com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var16 = null;
//     com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.make("", var16, "hi!");
//     java.lang.String[] var20 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var21 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var18, var20);
//     com.google.javascript.jscomp.JSError var22 = com.google.javascript.jscomp.JSError.make("hi!", var8, var11, var20);
//     int var23 = var22.getCharno();
//     com.google.javascript.jscomp.DiagnosticType var24 = var22.getType();
//     boolean var25 = var6.equals((java.lang.Object)var24);
//     com.google.javascript.jscomp.CheckLevel var29 = null;
//     com.google.javascript.jscomp.CheckLevel var31 = null;
//     com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.make("", var31, "");
//     com.google.javascript.jscomp.CheckLevel var38 = null;
//     com.google.javascript.jscomp.DiagnosticType var40 = com.google.javascript.jscomp.DiagnosticType.make("", var38, "hi!");
//     java.lang.String[] var42 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var43 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var40, var42);
//     com.google.javascript.rhino.Node var45 = null;
//     com.google.javascript.jscomp.DiagnosticType var48 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var53 = null;
//     com.google.javascript.jscomp.DiagnosticType var55 = com.google.javascript.jscomp.DiagnosticType.make("", var53, "hi!");
//     java.lang.String[] var57 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var58 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var55, var57);
//     com.google.javascript.jscomp.JSError var59 = com.google.javascript.jscomp.JSError.make("hi!", var45, var48, var57);
//     com.google.javascript.jscomp.JSError var60 = com.google.javascript.jscomp.JSError.make(var40, var57);
//     com.google.javascript.jscomp.JSError var61 = com.google.javascript.jscomp.JSError.make(": ", 0, (-64), var29, var33, var57);
//     com.google.javascript.jscomp.JSError var62 = com.google.javascript.jscomp.JSError.make("", (-67), 0, var3, var24, var57);
//     int var63 = var62.getCharno();
//     com.google.javascript.jscomp.CheckLevel var64 = null;
//     com.google.javascript.jscomp.MessageFormatter var65 = null;
//     java.lang.String var66 = var62.format(var64, var65);
// 
//   }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test34"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("hi!: : : hi!: ", var1, "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test35"); }


    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.jscomp.DiagnosticType var4 = com.google.javascript.jscomp.DiagnosticType.error(": hi!", "hi!");
    com.google.javascript.rhino.Node var6 = null;
    com.google.javascript.rhino.Node var8 = null;
    com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var16 = null;
    com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.make("", var16, "hi!");
    java.lang.String[] var20 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var21 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var18, var20);
    com.google.javascript.jscomp.JSError var22 = com.google.javascript.jscomp.JSError.make("hi!", var8, var11, var20);
    com.google.javascript.rhino.Node var24 = null;
    com.google.javascript.jscomp.DiagnosticType var27 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var32 = null;
    com.google.javascript.jscomp.DiagnosticType var34 = com.google.javascript.jscomp.DiagnosticType.make("", var32, "hi!");
    java.lang.String[] var36 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var37 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var34, var36);
    com.google.javascript.jscomp.JSError var38 = com.google.javascript.jscomp.JSError.make("hi!", var24, var27, var36);
    com.google.javascript.jscomp.JSError var39 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var6, var11, var36);
    com.google.javascript.rhino.Node var41 = null;
    com.google.javascript.jscomp.DiagnosticType var44 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var49 = null;
    com.google.javascript.jscomp.DiagnosticType var51 = com.google.javascript.jscomp.DiagnosticType.make("", var49, "hi!");
    java.lang.String[] var53 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var54 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var51, var53);
    com.google.javascript.jscomp.JSError var55 = com.google.javascript.jscomp.JSError.make("hi!", var41, var44, var53);
    com.google.javascript.jscomp.JSError var56 = com.google.javascript.jscomp.JSError.make(var11, var53);
    com.google.javascript.jscomp.JSError var57 = com.google.javascript.jscomp.JSError.make(": hi!", var1, var4, var53);
    java.lang.Object var58 = null;
    boolean var59 = var57.equals(var58);
    boolean var61 = var57.equals((java.lang.Object)": : . hi! at hi! line 1 : (unknown column)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test36"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error(". hi! at (unknown source) line 0 : 0: ", "hi!. hi! at hi! line (unknown line) : (unknown column)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test37"); }


    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.jscomp.DiagnosticType var4 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var9 = null;
    com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.make("", var9, "hi!");
    java.lang.String[] var13 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var14 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var11, var13);
    com.google.javascript.jscomp.JSError var15 = com.google.javascript.jscomp.JSError.make("hi!", var1, var4, var13);
    com.google.javascript.jscomp.DiagnosticType var16 = var15.getType();
    com.google.javascript.rhino.Node var18 = null;
    com.google.javascript.jscomp.DiagnosticType var21 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var26 = null;
    com.google.javascript.jscomp.DiagnosticType var28 = com.google.javascript.jscomp.DiagnosticType.make("", var26, "hi!");
    java.lang.String[] var30 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var31 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var28, var30);
    com.google.javascript.jscomp.JSError var32 = com.google.javascript.jscomp.JSError.make("hi!", var18, var21, var30);
    com.google.javascript.jscomp.JSError var33 = com.google.javascript.jscomp.JSError.make(var16, var30);
    int var34 = var33.getCharno();
    int var35 = var33.getCharno();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == (-1));

  }

  public void test38() {}
//   public void test38() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test38"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.DiagnosticType var4 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at hi! line (unknown line) : (unknown column)", "hi!: hi!");
//     com.google.javascript.jscomp.CheckLevel var8 = null;
//     com.google.javascript.jscomp.CheckLevel var10 = null;
//     com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.make("", var10, "hi!");
//     com.google.javascript.rhino.Node var14 = null;
//     com.google.javascript.rhino.Node var16 = null;
//     com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var24 = null;
//     com.google.javascript.jscomp.DiagnosticType var26 = com.google.javascript.jscomp.DiagnosticType.make("", var24, "hi!");
//     java.lang.String[] var28 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var29 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var26, var28);
//     com.google.javascript.jscomp.JSError var30 = com.google.javascript.jscomp.JSError.make("hi!", var16, var19, var28);
//     com.google.javascript.rhino.Node var32 = null;
//     com.google.javascript.jscomp.DiagnosticType var35 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var40 = null;
//     com.google.javascript.jscomp.DiagnosticType var42 = com.google.javascript.jscomp.DiagnosticType.make("", var40, "hi!");
//     java.lang.String[] var44 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var42, var44);
//     com.google.javascript.jscomp.JSError var46 = com.google.javascript.jscomp.JSError.make("hi!", var32, var35, var44);
//     com.google.javascript.jscomp.JSError var47 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var14, var19, var44);
//     com.google.javascript.jscomp.JSError var48 = com.google.javascript.jscomp.JSError.make("hi!", 0, (-1), var8, var12, var44);
//     com.google.javascript.jscomp.JSError var49 = com.google.javascript.jscomp.JSError.make("", var1, var4, var44);
//     java.lang.String var50 = var49.toString();
//     com.google.javascript.jscomp.CheckLevel var51 = null;
//     com.google.javascript.jscomp.MessageFormatter var52 = null;
//     java.lang.String var53 = var49.format(var51, var52);
// 
//   }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test39"); }


    com.google.javascript.jscomp.CheckLevel var3 = null;
    com.google.javascript.jscomp.CheckLevel var5 = null;
    com.google.javascript.jscomp.DiagnosticType var7 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var5, "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    com.google.javascript.jscomp.CheckLevel var12 = null;
    com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.make("", var12, "hi!");
    java.lang.String[] var16 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var17 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var14, var16);
    com.google.javascript.rhino.Node var19 = null;
    com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var27 = null;
    com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.make("", var27, "hi!");
    java.lang.String[] var31 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var32 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var29, var31);
    com.google.javascript.jscomp.JSError var33 = com.google.javascript.jscomp.JSError.make("hi!", var19, var22, var31);
    com.google.javascript.jscomp.JSError var34 = com.google.javascript.jscomp.JSError.make(var14, var31);
    com.google.javascript.jscomp.JSError var35 = com.google.javascript.jscomp.JSError.make("", 0, 1, var3, var7, var31);
    com.google.javascript.rhino.Node var37 = null;
    com.google.javascript.rhino.Node var39 = null;
    com.google.javascript.jscomp.DiagnosticType var42 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var47 = null;
    com.google.javascript.jscomp.DiagnosticType var49 = com.google.javascript.jscomp.DiagnosticType.make("", var47, "hi!");
    java.lang.String[] var51 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var52 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var49, var51);
    com.google.javascript.jscomp.JSError var53 = com.google.javascript.jscomp.JSError.make("hi!", var39, var42, var51);
    com.google.javascript.rhino.Node var55 = null;
    com.google.javascript.jscomp.DiagnosticType var58 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var63 = null;
    com.google.javascript.jscomp.DiagnosticType var65 = com.google.javascript.jscomp.DiagnosticType.make("", var63, "hi!");
    java.lang.String[] var67 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var68 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var65, var67);
    com.google.javascript.jscomp.JSError var69 = com.google.javascript.jscomp.JSError.make("hi!", var55, var58, var67);
    com.google.javascript.jscomp.JSError var70 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var37, var42, var67);
    com.google.javascript.rhino.Node var72 = null;
    com.google.javascript.jscomp.DiagnosticType var75 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var80 = null;
    com.google.javascript.jscomp.DiagnosticType var82 = com.google.javascript.jscomp.DiagnosticType.make("", var80, "hi!");
    java.lang.String[] var84 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var85 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var82, var84);
    com.google.javascript.jscomp.JSError var86 = com.google.javascript.jscomp.JSError.make("hi!", var72, var75, var84);
    com.google.javascript.jscomp.JSError var87 = com.google.javascript.jscomp.JSError.make(var42, var84);
    boolean var88 = var7.equals((java.lang.Object)var87);
    int var89 = var87.getCharno();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == (-1));

  }

  public void test40() {}
//   public void test40() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test40"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, ".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3");
// 
//   }

  public void test41() {}
//   public void test41() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test41"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     java.lang.String[] var3 = null;
//     com.google.javascript.jscomp.JSError var4 = com.google.javascript.jscomp.JSError.make(var2, var3);
//     int var5 = var4.getCharno();
//     java.lang.String var6 = var4.toString();
//     java.lang.String var7 = var4.toString();
//     com.google.javascript.jscomp.CheckLevel var8 = null;
//     com.google.javascript.jscomp.MessageFormatter var9 = null;
//     java.lang.String var10 = var4.format(var8, var9);
// 
//   }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test42"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("hi!. hi! at hi! line (unknown line) : (unknown column). hi!: hi! at (unknown source) line (unknown line) : (unknown column)", var1, ". hi! at (unknown source) line 0 : 0");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test43"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf(": : hi!. hi! at hi! line (unknown line) : (unknown column).  at .  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : : hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3 line -67 : 54");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test44"); }


    com.google.javascript.jscomp.CheckLevel var4 = null;
    com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.make("", var4, "");
    com.google.javascript.rhino.Node var8 = null;
    com.google.javascript.rhino.Node var10 = null;
    com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var18 = null;
    com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.make("", var18, "hi!");
    java.lang.String[] var22 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var23 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var20, var22);
    com.google.javascript.jscomp.JSError var24 = com.google.javascript.jscomp.JSError.make("hi!", var10, var13, var22);
    com.google.javascript.rhino.Node var26 = null;
    com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var34 = null;
    com.google.javascript.jscomp.DiagnosticType var36 = com.google.javascript.jscomp.DiagnosticType.make("", var34, "hi!");
    java.lang.String[] var38 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var39 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var36, var38);
    com.google.javascript.jscomp.JSError var40 = com.google.javascript.jscomp.JSError.make("hi!", var26, var29, var38);
    com.google.javascript.jscomp.JSError var41 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var8, var13, var38);
    com.google.javascript.rhino.Node var43 = null;
    com.google.javascript.jscomp.DiagnosticType var46 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var51 = null;
    com.google.javascript.jscomp.DiagnosticType var53 = com.google.javascript.jscomp.DiagnosticType.make("", var51, "hi!");
    java.lang.String[] var55 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var56 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var53, var55);
    com.google.javascript.jscomp.JSError var57 = com.google.javascript.jscomp.JSError.make("hi!", var43, var46, var55);
    com.google.javascript.jscomp.JSError var58 = com.google.javascript.jscomp.JSError.make(var13, var55);
    java.lang.String var59 = var13.toString();
    int var60 = var6.compareTo(var13);
    java.lang.String[] var62 = new java.lang.String[] { "hi!. hi! at (unknown source) line (unknown line) : (unknown column)"};
    com.google.javascript.jscomp.JSError var63 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3", 0, 1, var6, var62);
    java.lang.String var64 = var63.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "hi!: hi!"+ "'", var59.equals("hi!: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == (-3));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + ".  at hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3 line 0 : 1"+ "'", var64.equals(".  at hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3 line 0 : 1"));

  }

  public void test45() {}
//   public void test45() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test45"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, ". hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at (unknown source) line (unknown line) : (unknown column) at (unknown source) line (unknown line) : (unknown column)");
// 
//   }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test46"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("", var1, ". hi! at (unknown source) line 0 : 0");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test47() {}
//   public void test47() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test47"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var4 = null;
//     com.google.javascript.jscomp.DiagnosticType var7 = com.google.javascript.jscomp.DiagnosticType.error("hi!.  at hi!: hi! line (unknown line) : 10: : hi!", ": : hi!. hi! at hi! line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.CheckLevel var12 = null;
//     com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.make("", var12, "");
//     com.google.javascript.rhino.Node var16 = null;
//     com.google.javascript.rhino.Node var18 = null;
//     com.google.javascript.jscomp.DiagnosticType var21 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var26 = null;
//     com.google.javascript.jscomp.DiagnosticType var28 = com.google.javascript.jscomp.DiagnosticType.make("", var26, "hi!");
//     java.lang.String[] var30 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var31 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var28, var30);
//     com.google.javascript.jscomp.JSError var32 = com.google.javascript.jscomp.JSError.make("hi!", var18, var21, var30);
//     com.google.javascript.rhino.Node var34 = null;
//     com.google.javascript.jscomp.DiagnosticType var37 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var42 = null;
//     com.google.javascript.jscomp.DiagnosticType var44 = com.google.javascript.jscomp.DiagnosticType.make("", var42, "hi!");
//     java.lang.String[] var46 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var47 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var44, var46);
//     com.google.javascript.jscomp.JSError var48 = com.google.javascript.jscomp.JSError.make("hi!", var34, var37, var46);
//     com.google.javascript.jscomp.JSError var49 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var16, var21, var46);
//     com.google.javascript.rhino.Node var51 = null;
//     com.google.javascript.jscomp.DiagnosticType var54 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var59 = null;
//     com.google.javascript.jscomp.DiagnosticType var61 = com.google.javascript.jscomp.DiagnosticType.make("", var59, "hi!");
//     java.lang.String[] var63 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var64 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var61, var63);
//     com.google.javascript.jscomp.JSError var65 = com.google.javascript.jscomp.JSError.make("hi!", var51, var54, var63);
//     com.google.javascript.jscomp.JSError var66 = com.google.javascript.jscomp.JSError.make(var21, var63);
//     com.google.javascript.jscomp.JSError var67 = com.google.javascript.jscomp.JSError.make("", (-3), (-1), var14, var63);
//     com.google.javascript.jscomp.JSError var68 = com.google.javascript.jscomp.JSError.make(var7, var63);
//     com.google.javascript.jscomp.JSError var69 = com.google.javascript.jscomp.JSError.make(".  at hi!.  at hi!: hi! line (unknown line) : 10 line 3 : 0", 0, 10, var3, var4, var63);
// 
//   }

  public void test48() {}
//   public void test48() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test48"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CheckLevel var2 = null;
//     com.google.javascript.jscomp.DiagnosticType var3 = null;
//     com.google.javascript.rhino.Node var5 = null;
//     com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at hi! line (unknown line) : (unknown column)", "hi!: hi!");
//     com.google.javascript.jscomp.CheckLevel var12 = null;
//     com.google.javascript.jscomp.CheckLevel var14 = null;
//     com.google.javascript.jscomp.DiagnosticType var16 = com.google.javascript.jscomp.DiagnosticType.make("", var14, "hi!");
//     com.google.javascript.rhino.Node var18 = null;
//     com.google.javascript.rhino.Node var20 = null;
//     com.google.javascript.jscomp.DiagnosticType var23 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var28 = null;
//     com.google.javascript.jscomp.DiagnosticType var30 = com.google.javascript.jscomp.DiagnosticType.make("", var28, "hi!");
//     java.lang.String[] var32 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var33 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var30, var32);
//     com.google.javascript.jscomp.JSError var34 = com.google.javascript.jscomp.JSError.make("hi!", var20, var23, var32);
//     com.google.javascript.rhino.Node var36 = null;
//     com.google.javascript.jscomp.DiagnosticType var39 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var44 = null;
//     com.google.javascript.jscomp.DiagnosticType var46 = com.google.javascript.jscomp.DiagnosticType.make("", var44, "hi!");
//     java.lang.String[] var48 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var49 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var46, var48);
//     com.google.javascript.jscomp.JSError var50 = com.google.javascript.jscomp.JSError.make("hi!", var36, var39, var48);
//     com.google.javascript.jscomp.JSError var51 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var18, var23, var48);
//     com.google.javascript.jscomp.JSError var52 = com.google.javascript.jscomp.JSError.make("hi!", 0, (-1), var12, var16, var48);
//     com.google.javascript.jscomp.JSError var53 = com.google.javascript.jscomp.JSError.make("", var5, var8, var48);
//     com.google.javascript.jscomp.DiagnosticType var56 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     int var57 = var8.compareTo(var56);
//     com.google.javascript.jscomp.CheckLevel var61 = null;
//     com.google.javascript.jscomp.DiagnosticType var64 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at hi! line (unknown line) : (unknown column)", "hi!: hi!");
//     com.google.javascript.jscomp.CheckLevel var69 = null;
//     com.google.javascript.jscomp.DiagnosticType var71 = com.google.javascript.jscomp.DiagnosticType.make("", var69, "hi!");
//     java.lang.String[] var73 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var74 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var71, var73);
//     com.google.javascript.jscomp.JSError var75 = com.google.javascript.jscomp.JSError.make("hi!.  at hi!: hi! line (unknown line) : 10", (-8), (-64), var61, var64, var73);
//     com.google.javascript.jscomp.JSError var76 = com.google.javascript.jscomp.JSError.make(var56, var73);
//     com.google.javascript.jscomp.JSError var77 = com.google.javascript.jscomp.JSError.make(". hi! at (unknown source) line (unknown line) : (unknown column): .  at (unknown source) line -3 : (unknown column)", var1, var2, var3, var73);
// 
//   }

  public void test49() {}
//   public void test49() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test49"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.DiagnosticType var4 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var9 = null;
//     com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.make("", var9, "hi!");
//     java.lang.String[] var13 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var14 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var11, var13);
//     com.google.javascript.jscomp.JSError var15 = com.google.javascript.jscomp.JSError.make("hi!", var1, var4, var13);
//     com.google.javascript.jscomp.DiagnosticType var16 = var15.getType();
//     int var17 = var15.getCharno();
//     boolean var19 = var15.equals((java.lang.Object)(short)1);
//     java.lang.String var20 = var15.toString();
//     com.google.javascript.jscomp.DiagnosticType var23 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     boolean var24 = var15.equals((java.lang.Object)"hi!");
//     int var25 = var15.getCharno();
//     int var26 = var15.getCharno();
//     java.lang.String var27 = var15.toString();
//     com.google.javascript.jscomp.CheckLevel var28 = null;
//     com.google.javascript.jscomp.MessageFormatter var29 = null;
//     java.lang.String var30 = var15.format(var28, var29);
// 
//   }

  public void test50() {}
//   public void test50() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test50"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, ".  at (unknown source) line (unknown line) : (unknown column): hi!: hi!: ");
// 
//   }

  public void test51() {}
//   public void test51() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test51"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.rhino.Node var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("", var11, "hi!");
//     java.lang.String[] var15 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var13, var15);
//     com.google.javascript.jscomp.JSError var17 = com.google.javascript.jscomp.JSError.make("hi!", var3, var6, var15);
//     com.google.javascript.rhino.Node var19 = null;
//     com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var27 = null;
//     com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.make("", var27, "hi!");
//     java.lang.String[] var31 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var32 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var29, var31);
//     com.google.javascript.jscomp.JSError var33 = com.google.javascript.jscomp.JSError.make("hi!", var19, var22, var31);
//     com.google.javascript.jscomp.JSError var34 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var1, var6, var31);
//     int var35 = var34.getCharno();
//     com.google.javascript.jscomp.CheckLevel var36 = null;
//     com.google.javascript.jscomp.MessageFormatter var37 = null;
//     java.lang.String var38 = var34.format(var36, var37);
// 
//   }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test52"); }


    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.jscomp.DiagnosticType var4 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "");
    com.google.javascript.jscomp.CheckLevel var8 = null;
    com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.disabled("", "");
    com.google.javascript.rhino.Node var13 = null;
    com.google.javascript.rhino.Node var15 = null;
    com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var23 = null;
    com.google.javascript.jscomp.DiagnosticType var25 = com.google.javascript.jscomp.DiagnosticType.make("", var23, "hi!");
    java.lang.String[] var27 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var25, var27);
    com.google.javascript.jscomp.JSError var29 = com.google.javascript.jscomp.JSError.make("hi!", var15, var18, var27);
    com.google.javascript.rhino.Node var31 = null;
    com.google.javascript.jscomp.DiagnosticType var34 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var39 = null;
    com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.make("", var39, "hi!");
    java.lang.String[] var43 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var44 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var41, var43);
    com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make("hi!", var31, var34, var43);
    com.google.javascript.jscomp.JSError var46 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var13, var18, var43);
    com.google.javascript.rhino.Node var48 = null;
    com.google.javascript.jscomp.DiagnosticType var51 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var56 = null;
    com.google.javascript.jscomp.DiagnosticType var58 = com.google.javascript.jscomp.DiagnosticType.make("", var56, "hi!");
    java.lang.String[] var60 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var61 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var58, var60);
    com.google.javascript.jscomp.JSError var62 = com.google.javascript.jscomp.JSError.make("hi!", var48, var51, var60);
    com.google.javascript.jscomp.JSError var63 = com.google.javascript.jscomp.JSError.make(var18, var60);
    com.google.javascript.jscomp.JSError var64 = com.google.javascript.jscomp.JSError.make("", 0, 100, var8, var11, var60);
    com.google.javascript.jscomp.JSError var65 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column): : hi!", var1, var4, var60);
    com.google.javascript.jscomp.DiagnosticType var68 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
    java.lang.String[] var69 = null;
    com.google.javascript.jscomp.JSError var70 = com.google.javascript.jscomp.JSError.make(var68, var69);
    com.google.javascript.jscomp.DiagnosticType var73 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    int var74 = var68.compareTo(var73);
    int var75 = var4.compareTo(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 67);

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test53"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled("", ": ");
    com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!.  at hi!: hi! line (unknown line) : 10", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    com.google.javascript.jscomp.CheckLevel var13 = null;
    com.google.javascript.jscomp.DiagnosticType var15 = com.google.javascript.jscomp.DiagnosticType.make("", var13, "hi!");
    com.google.javascript.rhino.Node var17 = null;
    com.google.javascript.rhino.Node var19 = null;
    com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var27 = null;
    com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.make("", var27, "hi!");
    java.lang.String[] var31 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var32 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var29, var31);
    com.google.javascript.jscomp.JSError var33 = com.google.javascript.jscomp.JSError.make("hi!", var19, var22, var31);
    com.google.javascript.rhino.Node var35 = null;
    com.google.javascript.jscomp.DiagnosticType var38 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var43 = null;
    com.google.javascript.jscomp.DiagnosticType var45 = com.google.javascript.jscomp.DiagnosticType.make("", var43, "hi!");
    java.lang.String[] var47 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var48 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var45, var47);
    com.google.javascript.jscomp.JSError var49 = com.google.javascript.jscomp.JSError.make("hi!", var35, var38, var47);
    com.google.javascript.jscomp.JSError var50 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var17, var22, var47);
    com.google.javascript.rhino.Node var52 = null;
    com.google.javascript.jscomp.DiagnosticType var55 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var60 = null;
    com.google.javascript.jscomp.DiagnosticType var62 = com.google.javascript.jscomp.DiagnosticType.make("", var60, "hi!");
    java.lang.String[] var64 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var65 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var62, var64);
    com.google.javascript.jscomp.JSError var66 = com.google.javascript.jscomp.JSError.make("hi!", var52, var55, var64);
    com.google.javascript.jscomp.JSError var67 = com.google.javascript.jscomp.JSError.make(var22, var64);
    com.google.javascript.jscomp.JSError var68 = com.google.javascript.jscomp.JSError.make("", 0, 0, var15, var64);
    com.google.javascript.jscomp.JSError var69 = com.google.javascript.jscomp.JSError.make("", (-64), (-8), var8, var64);
    com.google.javascript.jscomp.JSError var70 = com.google.javascript.jscomp.JSError.make(var2, var64);
    com.google.javascript.jscomp.DiagnosticType var71 = var70.getType();
    java.lang.Object var72 = null;
    boolean var73 = var71.equals(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test54"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf("hi!. hi! at hi! line (unknown line) : (unknown column). hi!: hi! at (unknown source) line (unknown line) : (unknown column)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test55() {}
//   public void test55() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test55"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "hi!. hi! at hi! line (unknown line) : (unknown column): hi!: hi!");
// 
//   }

  public void test56() {}
//   public void test56() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test56"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "");
//     com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var13 = null;
//     com.google.javascript.jscomp.CheckLevel var15 = null;
//     com.google.javascript.jscomp.DiagnosticType var17 = com.google.javascript.jscomp.DiagnosticType.make("", var15, "hi!");
//     com.google.javascript.rhino.Node var19 = null;
//     com.google.javascript.rhino.Node var21 = null;
//     com.google.javascript.jscomp.DiagnosticType var24 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var29 = null;
//     com.google.javascript.jscomp.DiagnosticType var31 = com.google.javascript.jscomp.DiagnosticType.make("", var29, "hi!");
//     java.lang.String[] var33 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var34 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var31, var33);
//     com.google.javascript.jscomp.JSError var35 = com.google.javascript.jscomp.JSError.make("hi!", var21, var24, var33);
//     com.google.javascript.rhino.Node var37 = null;
//     com.google.javascript.jscomp.DiagnosticType var40 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var45 = null;
//     com.google.javascript.jscomp.DiagnosticType var47 = com.google.javascript.jscomp.DiagnosticType.make("", var45, "hi!");
//     java.lang.String[] var49 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var50 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var47, var49);
//     com.google.javascript.jscomp.JSError var51 = com.google.javascript.jscomp.JSError.make("hi!", var37, var40, var49);
//     com.google.javascript.jscomp.JSError var52 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var19, var24, var49);
//     com.google.javascript.jscomp.JSError var53 = com.google.javascript.jscomp.JSError.make("hi!", 0, (-1), var13, var17, var49);
//     com.google.javascript.jscomp.JSError var54 = com.google.javascript.jscomp.JSError.make(var9, var49);
//     com.google.javascript.jscomp.JSError var55 = com.google.javascript.jscomp.JSError.make(var6, var49);
//     com.google.javascript.jscomp.JSError var56 = com.google.javascript.jscomp.JSError.make(": : hi!.  at (unknown source) line (unknown line) : (unknown column)", 46, 4, var3, var49);
// 
//   }

  public void test57() {}
//   public void test57() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test57"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at hi!.  at hi!: hi! line (unknown line) : 10 line 54 : -3. . hi! at hi! line 1 : (unknown column) at .  at (unknown source) line -3 : (unknown column) line 51 : -3");
// 
//   }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test58"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf(": hi!: ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test59"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("hi!.  at hi!: hi! line (unknown line) : 10: : hi!", var1, "hi!. hi! at hi!: hi! line 0 : -3: : : hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test60() {}
//   public void test60() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test60"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var4 = null;
//     java.lang.String[] var5 = null;
//     com.google.javascript.jscomp.JSError var6 = com.google.javascript.jscomp.JSError.make("hi!: hi!", 72, 0, var3, var4, var5);
// 
//   }

  public void test61() {}
//   public void test61() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test61"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CheckLevel var2 = null;
//     com.google.javascript.jscomp.DiagnosticType var3 = null;
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.rhino.Node var9 = null;
//     com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var17 = null;
//     com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.make("", var17, "hi!");
//     java.lang.String[] var21 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var22 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var19, var21);
//     com.google.javascript.jscomp.JSError var23 = com.google.javascript.jscomp.JSError.make("hi!", var9, var12, var21);
//     java.lang.String var24 = var12.toString();
//     com.google.javascript.jscomp.CheckLevel var31 = null;
//     com.google.javascript.jscomp.CheckLevel var33 = null;
//     com.google.javascript.jscomp.DiagnosticType var35 = com.google.javascript.jscomp.DiagnosticType.make("", var33, "hi!");
//     com.google.javascript.rhino.Node var37 = null;
//     com.google.javascript.rhino.Node var39 = null;
//     com.google.javascript.jscomp.DiagnosticType var42 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var47 = null;
//     com.google.javascript.jscomp.DiagnosticType var49 = com.google.javascript.jscomp.DiagnosticType.make("", var47, "hi!");
//     java.lang.String[] var51 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var52 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var49, var51);
//     com.google.javascript.jscomp.JSError var53 = com.google.javascript.jscomp.JSError.make("hi!", var39, var42, var51);
//     com.google.javascript.rhino.Node var55 = null;
//     com.google.javascript.jscomp.DiagnosticType var58 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var63 = null;
//     com.google.javascript.jscomp.DiagnosticType var65 = com.google.javascript.jscomp.DiagnosticType.make("", var63, "hi!");
//     java.lang.String[] var67 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var68 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var65, var67);
//     com.google.javascript.jscomp.JSError var69 = com.google.javascript.jscomp.JSError.make("hi!", var55, var58, var67);
//     com.google.javascript.jscomp.JSError var70 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var37, var42, var67);
//     com.google.javascript.jscomp.JSError var71 = com.google.javascript.jscomp.JSError.make("hi!", 0, (-1), var31, var35, var67);
//     com.google.javascript.jscomp.CheckLevel var76 = null;
//     com.google.javascript.jscomp.DiagnosticType var78 = com.google.javascript.jscomp.DiagnosticType.make("", var76, "hi!");
//     java.lang.String[] var80 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var81 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var78, var80);
//     com.google.javascript.jscomp.JSError var82 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column): : hi!", 3, 3, var35, var80);
//     com.google.javascript.jscomp.JSError var83 = com.google.javascript.jscomp.JSError.make(var12, var80);
//     com.google.javascript.rhino.Node var85 = null;
//     com.google.javascript.jscomp.DiagnosticType var88 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at hi! line (unknown line) : (unknown column)", "hi!: hi!");
//     java.lang.String[] var90 = new java.lang.String[] { "hi!: hi!"};
//     com.google.javascript.jscomp.JSError var91 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3", var85, var88, var90);
//     com.google.javascript.jscomp.JSError var92 = com.google.javascript.jscomp.JSError.make("hi!. hi!.  at hi!: hi! line (unknown line) : 10 at .  at (unknown source) line 1 : 10 line -12 : 100", 0, 0, var7, var12, var90);
//     com.google.javascript.jscomp.JSError var93 = com.google.javascript.jscomp.JSError.make(": : hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : hi!: . hi! at (unknown source) line (unknown line) : (unknown column): hi!. hi! at (unknown source) line (unknown line) : (unknown column): ", var1, var2, var3, var90);
// 
//   }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test62"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at hi!.  at hi!: hi! line (unknown line) : 10 line 54 : -3. . hi! at hi! line 1 : (unknown column) at .  at (unknown source) line -3 : (unknown column) line 51 : -3", "hi!: : . hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3 at .  at (unknown source) line (unknown line) : (unknown column): hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3 line (unknown line) : (unknown column)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test63"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error(".  at (unknown source) line -3 : (unknown column): : : hi!. hi! at hi! line (unknown line) : (unknown column)", ": : hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : hi!: . hi! at (unknown source) line (unknown line) : (unknown column): hi!. hi! at (unknown source) line (unknown line) : (unknown column): ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test64"); }


    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.jscomp.DiagnosticType var4 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var9 = null;
    com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.make("", var9, "hi!");
    java.lang.String[] var13 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var14 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var11, var13);
    com.google.javascript.jscomp.JSError var15 = com.google.javascript.jscomp.JSError.make("hi!", var1, var4, var13);
    int var16 = var15.getCharno();
    com.google.javascript.jscomp.DiagnosticType var17 = var15.getType();
    com.google.javascript.jscomp.CheckLevel var21 = null;
    com.google.javascript.jscomp.CheckLevel var23 = null;
    com.google.javascript.jscomp.DiagnosticType var25 = com.google.javascript.jscomp.DiagnosticType.make("", var23, "hi!");
    com.google.javascript.rhino.Node var27 = null;
    com.google.javascript.rhino.Node var29 = null;
    com.google.javascript.jscomp.DiagnosticType var32 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var37 = null;
    com.google.javascript.jscomp.DiagnosticType var39 = com.google.javascript.jscomp.DiagnosticType.make("", var37, "hi!");
    java.lang.String[] var41 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var42 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var39, var41);
    com.google.javascript.jscomp.JSError var43 = com.google.javascript.jscomp.JSError.make("hi!", var29, var32, var41);
    com.google.javascript.rhino.Node var45 = null;
    com.google.javascript.jscomp.DiagnosticType var48 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var53 = null;
    com.google.javascript.jscomp.DiagnosticType var55 = com.google.javascript.jscomp.DiagnosticType.make("", var53, "hi!");
    java.lang.String[] var57 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var58 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var55, var57);
    com.google.javascript.jscomp.JSError var59 = com.google.javascript.jscomp.JSError.make("hi!", var45, var48, var57);
    com.google.javascript.jscomp.JSError var60 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var27, var32, var57);
    com.google.javascript.jscomp.JSError var61 = com.google.javascript.jscomp.JSError.make("hi!", 0, (-1), var21, var25, var57);
    boolean var62 = var15.equals((java.lang.Object)var25);
    com.google.javascript.jscomp.DiagnosticType var65 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
    boolean var66 = var15.equals((java.lang.Object)var65);
    int var67 = var15.getCharno();
    com.google.javascript.jscomp.DiagnosticType var68 = var15.getType();
    com.google.javascript.jscomp.DiagnosticType var71 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at (unknown source) line -67 : 0", "hi!: hi!");
    boolean var72 = var68.equals((java.lang.Object)var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);

  }

  public void test65() {}
//   public void test65() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test65"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "hi!. hi! at hi!: hi! line 0 : -3: ");
// 
//   }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test66"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf("hi!.  at hi!: hi! line (unknown line) : 10. : hi! at hi!. hi! at (unknown source) line -67 : 0 line 2 : 54");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test67() {}
//   public void test67() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test67"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var13 = var9.compareTo(var12);
//     com.google.javascript.jscomp.DiagnosticType var16 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var20 = var16.compareTo(var19);
//     int var21 = var9.compareTo(var16);
//     java.lang.String[] var22 = null;
//     com.google.javascript.jscomp.JSError var23 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", 10, 1, var9, var22);
//     com.google.javascript.jscomp.DiagnosticType var24 = var23.getType();
//     com.google.javascript.jscomp.DiagnosticType var27 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!: hi!: ", "hi!. hi! at hi! line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.CheckLevel var31 = null;
//     com.google.javascript.jscomp.CheckLevel var33 = null;
//     com.google.javascript.jscomp.DiagnosticType var35 = com.google.javascript.jscomp.DiagnosticType.make("", var33, "hi!");
//     com.google.javascript.rhino.Node var37 = null;
//     com.google.javascript.rhino.Node var39 = null;
//     com.google.javascript.jscomp.DiagnosticType var42 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var47 = null;
//     com.google.javascript.jscomp.DiagnosticType var49 = com.google.javascript.jscomp.DiagnosticType.make("", var47, "hi!");
//     java.lang.String[] var51 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var52 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var49, var51);
//     com.google.javascript.jscomp.JSError var53 = com.google.javascript.jscomp.JSError.make("hi!", var39, var42, var51);
//     com.google.javascript.rhino.Node var55 = null;
//     com.google.javascript.jscomp.DiagnosticType var58 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var63 = null;
//     com.google.javascript.jscomp.DiagnosticType var65 = com.google.javascript.jscomp.DiagnosticType.make("", var63, "hi!");
//     java.lang.String[] var67 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var68 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var65, var67);
//     com.google.javascript.jscomp.JSError var69 = com.google.javascript.jscomp.JSError.make("hi!", var55, var58, var67);
//     com.google.javascript.jscomp.JSError var70 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var37, var42, var67);
//     com.google.javascript.jscomp.JSError var71 = com.google.javascript.jscomp.JSError.make("hi!", 0, (-1), var31, var35, var67);
//     com.google.javascript.jscomp.JSError var72 = com.google.javascript.jscomp.JSError.make(var27, var67);
//     com.google.javascript.jscomp.JSError var73 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at hi!.  at hi!: hi! line (unknown line) : 10 line 54 : -3", (-67), 0, var3, var24, var67);
//     com.google.javascript.jscomp.CheckLevel var74 = null;
//     com.google.javascript.jscomp.MessageFormatter var75 = null;
//     java.lang.String var76 = var73.format(var74, var75);
// 
//   }

  public void test68() {}
//   public void test68() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test68"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning("hi!.  at hi!: hi! line (unknown line) : 10", ".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : ");
//     com.google.javascript.jscomp.CheckLevel var6 = null;
//     com.google.javascript.jscomp.CheckLevel var8 = null;
//     com.google.javascript.jscomp.DiagnosticType var10 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var8, "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.CheckLevel var15 = null;
//     com.google.javascript.jscomp.DiagnosticType var17 = com.google.javascript.jscomp.DiagnosticType.make("", var15, "hi!");
//     java.lang.String[] var19 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var20 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var17, var19);
//     com.google.javascript.rhino.Node var22 = null;
//     com.google.javascript.jscomp.DiagnosticType var25 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var30 = null;
//     com.google.javascript.jscomp.DiagnosticType var32 = com.google.javascript.jscomp.DiagnosticType.make("", var30, "hi!");
//     java.lang.String[] var34 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var35 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var32, var34);
//     com.google.javascript.jscomp.JSError var36 = com.google.javascript.jscomp.JSError.make("hi!", var22, var25, var34);
//     com.google.javascript.jscomp.JSError var37 = com.google.javascript.jscomp.JSError.make(var17, var34);
//     com.google.javascript.jscomp.JSError var38 = com.google.javascript.jscomp.JSError.make("", 0, 1, var6, var10, var34);
//     com.google.javascript.jscomp.JSError var39 = com.google.javascript.jscomp.JSError.make(var2, var34);
//     com.google.javascript.jscomp.CheckLevel var40 = null;
//     com.google.javascript.jscomp.MessageFormatter var41 = null;
//     java.lang.String var42 = var39.format(var40, var41);
// 
//   }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test69"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make(". hi! at (unknown source) line (unknown line) : (unknown column): .  at (unknown source) line -3 : (unknown column)", var1, "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test70() {}
//   public void test70() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test70"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.DiagnosticType var4 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "");
//     com.google.javascript.jscomp.CheckLevel var8 = null;
//     com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.disabled("", "");
//     com.google.javascript.rhino.Node var13 = null;
//     com.google.javascript.rhino.Node var15 = null;
//     com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var23 = null;
//     com.google.javascript.jscomp.DiagnosticType var25 = com.google.javascript.jscomp.DiagnosticType.make("", var23, "hi!");
//     java.lang.String[] var27 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var25, var27);
//     com.google.javascript.jscomp.JSError var29 = com.google.javascript.jscomp.JSError.make("hi!", var15, var18, var27);
//     com.google.javascript.rhino.Node var31 = null;
//     com.google.javascript.jscomp.DiagnosticType var34 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var39 = null;
//     com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.make("", var39, "hi!");
//     java.lang.String[] var43 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var44 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var41, var43);
//     com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make("hi!", var31, var34, var43);
//     com.google.javascript.jscomp.JSError var46 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var13, var18, var43);
//     com.google.javascript.rhino.Node var48 = null;
//     com.google.javascript.jscomp.DiagnosticType var51 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var56 = null;
//     com.google.javascript.jscomp.DiagnosticType var58 = com.google.javascript.jscomp.DiagnosticType.make("", var56, "hi!");
//     java.lang.String[] var60 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var61 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var58, var60);
//     com.google.javascript.jscomp.JSError var62 = com.google.javascript.jscomp.JSError.make("hi!", var48, var51, var60);
//     com.google.javascript.jscomp.JSError var63 = com.google.javascript.jscomp.JSError.make(var18, var60);
//     com.google.javascript.jscomp.JSError var64 = com.google.javascript.jscomp.JSError.make("", 0, 100, var8, var11, var60);
//     com.google.javascript.jscomp.JSError var65 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column): : hi!", var1, var4, var60);
//     int var66 = var65.getCharno();
//     com.google.javascript.jscomp.DiagnosticType var67 = var65.getType();
//     com.google.javascript.jscomp.CheckLevel var68 = null;
//     com.google.javascript.jscomp.MessageFormatter var69 = null;
//     java.lang.String var70 = var65.format(var68, var69);
// 
//   }

  public void test71() {}
//   public void test71() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test71"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning("hi!. hi! at hi!: hi! line 0 : -3: ", ": hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.DiagnosticType var3 = null;
//     int var4 = var2.compareTo(var3);
// 
//   }

  public void test72() {}
//   public void test72() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test72"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.DiagnosticType var4 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var7 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var8 = var4.compareTo(var7);
//     com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var15 = var11.compareTo(var14);
//     int var16 = var4.compareTo(var11);
//     com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", ": hi!");
//     int var20 = var11.compareTo(var19);
//     java.lang.String[] var21 = null;
//     com.google.javascript.jscomp.JSError var22 = com.google.javascript.jscomp.JSError.make("", var1, var19, var21);
//     java.lang.String[] var23 = null;
//     com.google.javascript.jscomp.JSError var24 = com.google.javascript.jscomp.JSError.make(var19, var23);
//     com.google.javascript.jscomp.CheckLevel var28 = null;
//     com.google.javascript.jscomp.CheckLevel var30 = null;
//     com.google.javascript.jscomp.DiagnosticType var32 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var30, "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.CheckLevel var37 = null;
//     com.google.javascript.jscomp.DiagnosticType var39 = com.google.javascript.jscomp.DiagnosticType.make("", var37, "hi!");
//     java.lang.String[] var41 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var42 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var39, var41);
//     com.google.javascript.rhino.Node var44 = null;
//     com.google.javascript.jscomp.DiagnosticType var47 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var52 = null;
//     com.google.javascript.jscomp.DiagnosticType var54 = com.google.javascript.jscomp.DiagnosticType.make("", var52, "hi!");
//     java.lang.String[] var56 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var57 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var54, var56);
//     com.google.javascript.jscomp.JSError var58 = com.google.javascript.jscomp.JSError.make("hi!", var44, var47, var56);
//     com.google.javascript.jscomp.JSError var59 = com.google.javascript.jscomp.JSError.make(var39, var56);
//     com.google.javascript.jscomp.JSError var60 = com.google.javascript.jscomp.JSError.make("", 0, 1, var28, var32, var56);
//     com.google.javascript.jscomp.JSError var61 = com.google.javascript.jscomp.JSError.make(var19, var56);
//     int var62 = var61.getCharno();
//     java.lang.Object var63 = null;
//     boolean var64 = var61.equals(var63);
//     com.google.javascript.jscomp.DiagnosticType var65 = var61.getType();
//     com.google.javascript.jscomp.DiagnosticType var68 = com.google.javascript.jscomp.DiagnosticType.disabled(": ", "hi!: ");
//     boolean var69 = var61.equals((java.lang.Object)"hi!: ");
//     com.google.javascript.jscomp.CheckLevel var70 = null;
//     com.google.javascript.jscomp.MessageFormatter var71 = null;
//     java.lang.String var72 = var61.format(var70, var71);
// 
//   }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test73"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make(". hi! at hi! line 1 : (unknown column)", var1, ": hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at hi!.  at hi!: hi! line (unknown line) : 10 line 54 : -3. . hi! at hi! line 1 : (unknown column) at .  at (unknown source) line -3 : (unknown column) line 51 : -3");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test74"); }


    com.google.javascript.jscomp.CheckLevel var3 = null;
    com.google.javascript.rhino.Node var5 = null;
    com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var13 = null;
    com.google.javascript.jscomp.DiagnosticType var15 = com.google.javascript.jscomp.DiagnosticType.make("", var13, "hi!");
    java.lang.String[] var17 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var18 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var15, var17);
    com.google.javascript.jscomp.JSError var19 = com.google.javascript.jscomp.JSError.make("hi!", var5, var8, var17);
    com.google.javascript.jscomp.DiagnosticType var20 = var19.getType();
    com.google.javascript.rhino.Node var22 = null;
    com.google.javascript.jscomp.DiagnosticType var25 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var30 = null;
    com.google.javascript.jscomp.DiagnosticType var32 = com.google.javascript.jscomp.DiagnosticType.make("", var30, "hi!");
    java.lang.String[] var34 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var35 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var32, var34);
    com.google.javascript.jscomp.JSError var36 = com.google.javascript.jscomp.JSError.make("hi!", var22, var25, var34);
    com.google.javascript.jscomp.JSError var37 = com.google.javascript.jscomp.JSError.make(var20, var34);
    com.google.javascript.jscomp.CheckLevel var39 = null;
    com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.make(": ", var39, "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    com.google.javascript.jscomp.CheckLevel var43 = null;
    com.google.javascript.jscomp.DiagnosticType var45 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var43, "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    int var46 = var41.compareTo(var45);
    boolean var47 = var37.equals((java.lang.Object)var46);
    com.google.javascript.jscomp.DiagnosticType var48 = var37.getType();
    com.google.javascript.jscomp.DiagnosticType var54 = com.google.javascript.jscomp.DiagnosticType.warning("hi!.  at hi!: hi! line (unknown line) : 10", "hi!. hi! at hi! line (unknown line) : (unknown column)");
    com.google.javascript.rhino.Node var56 = null;
    com.google.javascript.jscomp.DiagnosticType var59 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var64 = null;
    com.google.javascript.jscomp.DiagnosticType var66 = com.google.javascript.jscomp.DiagnosticType.make("", var64, "hi!");
    java.lang.String[] var68 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var69 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var66, var68);
    com.google.javascript.jscomp.JSError var70 = com.google.javascript.jscomp.JSError.make("hi!", var56, var59, var68);
    com.google.javascript.jscomp.JSError var71 = com.google.javascript.jscomp.JSError.make("hi!", (-1), 2, var54, var68);
    com.google.javascript.jscomp.JSError var72 = com.google.javascript.jscomp.JSError.make("", (-34), 58, var3, var48, var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == (-46));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);

  }

  public void test75() {}
//   public void test75() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test75"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CheckLevel var2 = null;
//     com.google.javascript.jscomp.CheckLevel var4 = null;
//     com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.make(".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : ", var4, ".  at :  line -12 : 46");
//     com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.error("", ".  at :  line -12 : 46");
//     boolean var10 = var6.equals((java.lang.Object)".  at :  line -12 : 46");
//     com.google.javascript.jscomp.CheckLevel var14 = null;
//     com.google.javascript.jscomp.CheckLevel var16 = null;
//     com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.make("", var16, "");
//     com.google.javascript.jscomp.CheckLevel var23 = null;
//     com.google.javascript.jscomp.DiagnosticType var25 = com.google.javascript.jscomp.DiagnosticType.make("", var23, "hi!");
//     java.lang.String[] var27 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var25, var27);
//     com.google.javascript.rhino.Node var30 = null;
//     com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var38 = null;
//     com.google.javascript.jscomp.DiagnosticType var40 = com.google.javascript.jscomp.DiagnosticType.make("", var38, "hi!");
//     java.lang.String[] var42 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var43 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var40, var42);
//     com.google.javascript.jscomp.JSError var44 = com.google.javascript.jscomp.JSError.make("hi!", var30, var33, var42);
//     com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make(var25, var42);
//     com.google.javascript.jscomp.JSError var46 = com.google.javascript.jscomp.JSError.make(": ", 0, (-64), var14, var18, var42);
//     com.google.javascript.jscomp.JSError var47 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column): : hi!.  at hi!: hi! line (unknown line) : 10", var1, var2, var6, var42);
// 
//   }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test76"); }


    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.jscomp.DiagnosticType var4 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var9 = null;
    com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.make("", var9, "hi!");
    java.lang.String[] var13 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var14 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var11, var13);
    com.google.javascript.jscomp.JSError var15 = com.google.javascript.jscomp.JSError.make("hi!", var1, var4, var13);
    int var16 = var15.getCharno();
    com.google.javascript.jscomp.DiagnosticType var17 = var15.getType();
    com.google.javascript.rhino.Node var19 = null;
    com.google.javascript.jscomp.CheckLevel var23 = null;
    com.google.javascript.jscomp.DiagnosticType var26 = com.google.javascript.jscomp.DiagnosticType.warning("hi!: : ", "hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3");
    com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.warning("hi!", "");
    int var30 = var26.compareTo(var29);
    com.google.javascript.jscomp.CheckLevel var34 = null;
    com.google.javascript.jscomp.DiagnosticType var37 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!.  at hi!: hi! line (unknown line) : 10");
    com.google.javascript.rhino.Node var39 = null;
    com.google.javascript.jscomp.DiagnosticType var42 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var47 = null;
    com.google.javascript.jscomp.DiagnosticType var49 = com.google.javascript.jscomp.DiagnosticType.make("", var47, "hi!");
    java.lang.String[] var51 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var52 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var49, var51);
    com.google.javascript.jscomp.JSError var53 = com.google.javascript.jscomp.JSError.make("hi!", var39, var42, var51);
    com.google.javascript.jscomp.DiagnosticType var54 = var53.getType();
    com.google.javascript.rhino.Node var56 = null;
    com.google.javascript.jscomp.DiagnosticType var59 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var64 = null;
    com.google.javascript.jscomp.DiagnosticType var66 = com.google.javascript.jscomp.DiagnosticType.make("", var64, "hi!");
    java.lang.String[] var68 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var69 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var66, var68);
    com.google.javascript.jscomp.JSError var70 = com.google.javascript.jscomp.JSError.make("hi!", var56, var59, var68);
    com.google.javascript.jscomp.JSError var71 = com.google.javascript.jscomp.JSError.make(var54, var68);
    com.google.javascript.jscomp.JSError var72 = com.google.javascript.jscomp.JSError.make(".  at (unknown source) line 1 : 10", (-12), 100, var34, var37, var68);
    com.google.javascript.jscomp.JSError var73 = com.google.javascript.jscomp.JSError.make("", (-64), (-67), var23, var26, var68);
    com.google.javascript.rhino.Node var75 = null;
    com.google.javascript.jscomp.DiagnosticType var78 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    com.google.javascript.rhino.Node var80 = null;
    com.google.javascript.jscomp.DiagnosticType var83 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var88 = null;
    com.google.javascript.jscomp.DiagnosticType var90 = com.google.javascript.jscomp.DiagnosticType.make("", var88, "hi!");
    java.lang.String[] var92 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var93 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var90, var92);
    com.google.javascript.jscomp.JSError var94 = com.google.javascript.jscomp.JSError.make("hi!", var80, var83, var92);
    com.google.javascript.jscomp.JSError var95 = com.google.javascript.jscomp.JSError.make("hi!: hi!: ", var75, var78, var92);
    com.google.javascript.jscomp.JSError var96 = com.google.javascript.jscomp.JSError.make(".  at (unknown source) line (unknown line) : (unknown column): hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3", var19, var26, var92);
    com.google.javascript.jscomp.DiagnosticType var97 = var96.getType();
    boolean var98 = var17.equals((java.lang.Object)var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var98 == false);

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test77"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", ". hi! at hi! line 1 : (unknown column)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test78"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error(": hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at hi!.  at hi!: hi! line (unknown line) : 10 line 54 : -3. . hi! at hi! line 1 : (unknown column) at .  at (unknown source) line -3 : (unknown column) line 51 : -3", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test79"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf(": hi!: hi!: hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test80"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line -67 : 0", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test81() {}
//   public void test81() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test81"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var4 = null;
//     com.google.javascript.jscomp.CheckLevel var8 = null;
//     com.google.javascript.rhino.Node var10 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     com.google.javascript.jscomp.CheckLevel var18 = null;
//     com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.make("", var18, "hi!");
//     java.lang.String[] var22 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var23 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var20, var22);
//     com.google.javascript.jscomp.JSError var24 = com.google.javascript.jscomp.JSError.make("", var10, var13, var22);
//     java.lang.String var25 = var13.toString();
//     com.google.javascript.jscomp.DiagnosticType var31 = com.google.javascript.jscomp.DiagnosticType.warning(": : hi!. hi! at hi! line (unknown line) : (unknown column)", "");
//     com.google.javascript.jscomp.DiagnosticType var34 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.rhino.Node var36 = null;
//     com.google.javascript.jscomp.DiagnosticType var39 = com.google.javascript.jscomp.DiagnosticType.warning("hi!", "");
//     com.google.javascript.rhino.Node var41 = null;
//     com.google.javascript.jscomp.DiagnosticType var44 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     com.google.javascript.jscomp.CheckLevel var49 = null;
//     com.google.javascript.jscomp.DiagnosticType var51 = com.google.javascript.jscomp.DiagnosticType.make("", var49, "hi!");
//     java.lang.String[] var53 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var54 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var51, var53);
//     com.google.javascript.jscomp.JSError var55 = com.google.javascript.jscomp.JSError.make("", var41, var44, var53);
//     com.google.javascript.jscomp.JSError var56 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var36, var39, var53);
//     com.google.javascript.jscomp.JSError var57 = com.google.javascript.jscomp.JSError.make(var34, var53);
//     com.google.javascript.jscomp.JSError var58 = com.google.javascript.jscomp.JSError.make(".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : : hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3", (-67), 54, var31, var53);
//     com.google.javascript.jscomp.JSError var59 = com.google.javascript.jscomp.JSError.make("", 49, 0, var8, var13, var53);
//     com.google.javascript.jscomp.JSError var60 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)", (-46), (-1), var3, var4, var53);
// 
//   }

  public void test82() {}
//   public void test82() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test82"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.DiagnosticType var4 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var9 = null;
//     com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.make("", var9, "hi!");
//     java.lang.String[] var13 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var14 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var11, var13);
//     com.google.javascript.jscomp.JSError var15 = com.google.javascript.jscomp.JSError.make("hi!", var1, var4, var13);
//     com.google.javascript.jscomp.DiagnosticType var16 = var15.getType();
//     com.google.javascript.rhino.Node var18 = null;
//     com.google.javascript.jscomp.DiagnosticType var21 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var26 = null;
//     com.google.javascript.jscomp.DiagnosticType var28 = com.google.javascript.jscomp.DiagnosticType.make("", var26, "hi!");
//     java.lang.String[] var30 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var31 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var28, var30);
//     com.google.javascript.jscomp.JSError var32 = com.google.javascript.jscomp.JSError.make("hi!", var18, var21, var30);
//     com.google.javascript.jscomp.JSError var33 = com.google.javascript.jscomp.JSError.make(var16, var30);
//     int var34 = var33.getCharno();
//     com.google.javascript.jscomp.CheckLevel var35 = null;
//     com.google.javascript.jscomp.MessageFormatter var36 = null;
//     java.lang.String var37 = var33.format(var35, var36);
// 
//   }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test83"); }


    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.rhino.Node var3 = null;
    com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.error(". hi! at (unknown source) line (unknown line) : (unknown column)", "hi!. hi! at hi! line (unknown line) : (unknown column): : hi!");
    com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.error("", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    com.google.javascript.rhino.Node var11 = null;
    com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var19 = null;
    com.google.javascript.jscomp.DiagnosticType var21 = com.google.javascript.jscomp.DiagnosticType.make("", var19, "hi!");
    java.lang.String[] var23 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var24 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var21, var23);
    com.google.javascript.jscomp.JSError var25 = com.google.javascript.jscomp.JSError.make("hi!", var11, var14, var23);
    com.google.javascript.jscomp.DiagnosticType var26 = var25.getType();
    com.google.javascript.rhino.Node var28 = null;
    com.google.javascript.jscomp.DiagnosticType var31 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var36 = null;
    com.google.javascript.jscomp.DiagnosticType var38 = com.google.javascript.jscomp.DiagnosticType.make("", var36, "hi!");
    java.lang.String[] var40 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var41 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var38, var40);
    com.google.javascript.jscomp.JSError var42 = com.google.javascript.jscomp.JSError.make("hi!", var28, var31, var40);
    com.google.javascript.jscomp.JSError var43 = com.google.javascript.jscomp.JSError.make(var26, var40);
    com.google.javascript.jscomp.JSError var44 = com.google.javascript.jscomp.JSError.make(var9, var40);
    com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make(".  at (unknown source) line (unknown line) : (unknown column)", var3, var6, var40);
    com.google.javascript.jscomp.DiagnosticType var46 = var45.getType();
    com.google.javascript.jscomp.DiagnosticType var49 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!.  at hi!: hi! line (unknown line) : 10", ": hi!");
    com.google.javascript.jscomp.CheckLevel var53 = null;
    com.google.javascript.jscomp.DiagnosticType var56 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at hi! line (unknown line) : (unknown column)", "hi!: hi!");
    com.google.javascript.jscomp.CheckLevel var61 = null;
    com.google.javascript.jscomp.DiagnosticType var63 = com.google.javascript.jscomp.DiagnosticType.make("", var61, "hi!");
    java.lang.String[] var65 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var66 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var63, var65);
    com.google.javascript.jscomp.JSError var67 = com.google.javascript.jscomp.JSError.make("hi!.  at hi!: hi! line (unknown line) : 10", (-8), (-64), var53, var56, var65);
    com.google.javascript.jscomp.JSError var68 = com.google.javascript.jscomp.JSError.make(var49, var65);
    com.google.javascript.jscomp.JSError var69 = com.google.javascript.jscomp.JSError.make("hi!", var1, var46, var65);
    java.lang.String var70 = var69.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + ". hi! at (unknown source) line (unknown line) : (unknown column). hi!. hi! at hi! line (unknown line) : (unknown column): : hi! at hi! line (unknown line) : (unknown column)"+ "'", var70.equals(". hi! at (unknown source) line (unknown line) : (unknown column). hi!. hi! at hi! line (unknown line) : (unknown column): : hi! at hi! line (unknown line) : (unknown column)"));

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test84"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf("hi!. hi! at hi! line (unknown line) : (unknown column). hi!: hi! at (unknown source) line (unknown line) : (unknown column): .  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : : hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3");
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
//     com.google.javascript.jscomp.DiagnosticType var0 = null;
//     com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     com.google.javascript.rhino.Node var5 = null;
//     com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at hi! line (unknown line) : (unknown column)", "hi!: hi!");
//     java.lang.String[] var10 = new java.lang.String[] { "hi!: hi!"};
//     com.google.javascript.jscomp.JSError var11 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3", var5, var8, var10);
//     com.google.javascript.jscomp.JSError var12 = com.google.javascript.jscomp.JSError.make(var3, var10);
//     com.google.javascript.jscomp.JSError var13 = com.google.javascript.jscomp.JSError.make(var0, var10);
// 
//   }

  public void test86() {}
//   public void test86() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test86"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error(".  at (unknown source) line -3 : (unknown column)", ": : hi!. hi! at hi! line (unknown line) : (unknown column)");
//     java.lang.String var3 = var2.toString();
//     com.google.javascript.jscomp.CheckLevel var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("", var11, "hi!");
//     java.lang.String[] var15 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var13, var15);
//     com.google.javascript.rhino.Node var18 = null;
//     com.google.javascript.jscomp.DiagnosticType var21 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var26 = null;
//     com.google.javascript.jscomp.DiagnosticType var28 = com.google.javascript.jscomp.DiagnosticType.make("", var26, "hi!");
//     java.lang.String[] var30 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var31 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var28, var30);
//     com.google.javascript.jscomp.JSError var32 = com.google.javascript.jscomp.JSError.make("hi!", var18, var21, var30);
//     com.google.javascript.jscomp.JSError var33 = com.google.javascript.jscomp.JSError.make(var13, var30);
//     com.google.javascript.jscomp.CheckLevel var40 = null;
//     com.google.javascript.jscomp.CheckLevel var42 = null;
//     com.google.javascript.jscomp.DiagnosticType var44 = com.google.javascript.jscomp.DiagnosticType.make("", var42, "hi!");
//     com.google.javascript.rhino.Node var46 = null;
//     com.google.javascript.rhino.Node var48 = null;
//     com.google.javascript.jscomp.DiagnosticType var51 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var56 = null;
//     com.google.javascript.jscomp.DiagnosticType var58 = com.google.javascript.jscomp.DiagnosticType.make("", var56, "hi!");
//     java.lang.String[] var60 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var61 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var58, var60);
//     com.google.javascript.jscomp.JSError var62 = com.google.javascript.jscomp.JSError.make("hi!", var48, var51, var60);
//     com.google.javascript.rhino.Node var64 = null;
//     com.google.javascript.jscomp.DiagnosticType var67 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var72 = null;
//     com.google.javascript.jscomp.DiagnosticType var74 = com.google.javascript.jscomp.DiagnosticType.make("", var72, "hi!");
//     java.lang.String[] var76 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var77 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var74, var76);
//     com.google.javascript.jscomp.JSError var78 = com.google.javascript.jscomp.JSError.make("hi!", var64, var67, var76);
//     com.google.javascript.jscomp.JSError var79 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var46, var51, var76);
//     com.google.javascript.jscomp.JSError var80 = com.google.javascript.jscomp.JSError.make("hi!", 0, (-1), var40, var44, var76);
//     com.google.javascript.jscomp.CheckLevel var85 = null;
//     com.google.javascript.jscomp.DiagnosticType var87 = com.google.javascript.jscomp.DiagnosticType.make("", var85, "hi!");
//     java.lang.String[] var89 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var90 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var87, var89);
//     com.google.javascript.jscomp.JSError var91 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column): : hi!", 3, 3, var44, var89);
//     com.google.javascript.jscomp.JSError var92 = com.google.javascript.jscomp.JSError.make("hi!", 0, 0, var13, var89);
//     com.google.javascript.jscomp.JSError var93 = com.google.javascript.jscomp.JSError.make(var2, var89);
//     com.google.javascript.jscomp.CheckLevel var94 = null;
//     com.google.javascript.jscomp.MessageFormatter var95 = null;
//     java.lang.String var96 = var93.format(var94, var95);
// 
//   }

  public void test87() {}
//   public void test87() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test87"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at (unknown source) line (unknown line) : (unknown column): ", ".  at (unknown source) line 1 : 10: hi!: hi!: ");
//     com.google.javascript.jscomp.CheckLevel var9 = null;
//     com.google.javascript.rhino.Node var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     com.google.javascript.jscomp.CheckLevel var19 = null;
//     com.google.javascript.jscomp.DiagnosticType var21 = com.google.javascript.jscomp.DiagnosticType.make("", var19, "hi!");
//     java.lang.String[] var23 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var24 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var21, var23);
//     com.google.javascript.jscomp.JSError var25 = com.google.javascript.jscomp.JSError.make("", var11, var14, var23);
//     com.google.javascript.jscomp.DiagnosticType var28 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     int var29 = var14.compareTo(var28);
//     com.google.javascript.rhino.Node var31 = null;
//     com.google.javascript.jscomp.DiagnosticType var34 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     com.google.javascript.jscomp.CheckLevel var39 = null;
//     com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.make("", var39, "hi!");
//     java.lang.String[] var43 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var44 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var41, var43);
//     com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make("", var31, var34, var43);
//     com.google.javascript.jscomp.JSError var46 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3", 1, 46, var9, var28, var43);
//     com.google.javascript.jscomp.JSError var47 = com.google.javascript.jscomp.JSError.make(".  at (unknown source) line (unknown line) : (unknown column)", 109, (-149), var5, var43);
//     com.google.javascript.jscomp.CheckLevel var48 = null;
//     com.google.javascript.jscomp.MessageFormatter var49 = null;
//     java.lang.String var50 = var47.format(var48, var49);
// 
//   }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test88"); }


    com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var10 = null;
    com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.make("", var10, "hi!");
    java.lang.String[] var14 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var15 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var12, var14);
    com.google.javascript.rhino.Node var17 = null;
    com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var25 = null;
    com.google.javascript.jscomp.DiagnosticType var27 = com.google.javascript.jscomp.DiagnosticType.make("", var25, "hi!");
    java.lang.String[] var29 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var30 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var27, var29);
    com.google.javascript.jscomp.JSError var31 = com.google.javascript.jscomp.JSError.make("hi!", var17, var20, var29);
    com.google.javascript.jscomp.JSError var32 = com.google.javascript.jscomp.JSError.make(var12, var29);
    com.google.javascript.jscomp.JSError var33 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", (-1), (-3), var5, var29);
    java.lang.String var34 = var33.toString();
    java.lang.String var35 = var33.toString();
    int var36 = var33.getCharno();
    com.google.javascript.jscomp.DiagnosticType var37 = var33.getType();
    com.google.javascript.rhino.Node var39 = null;
    com.google.javascript.jscomp.DiagnosticType var42 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var45 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var46 = var42.compareTo(var45);
    com.google.javascript.jscomp.DiagnosticType var49 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var52 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var53 = var49.compareTo(var52);
    int var54 = var42.compareTo(var49);
    com.google.javascript.jscomp.DiagnosticType var57 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", ": hi!");
    int var58 = var49.compareTo(var57);
    java.lang.String[] var59 = null;
    com.google.javascript.jscomp.JSError var60 = com.google.javascript.jscomp.JSError.make("", var39, var57, var59);
    int var61 = var37.compareTo(var57);
    java.lang.String var62 = var37.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3"+ "'", var34.equals("hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3"+ "'", var35.equals("hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == (-3));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == (-8));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "hi!: hi!: hi!"+ "'", var62.equals("hi!: hi!: hi!"));

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test89"); }


    com.google.javascript.jscomp.CheckLevel var4 = null;
    com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.make(": hi!. hi! at hi! line (unknown line) : (unknown column)", var4, "hi!. hi! at hi!: hi! line 0 : -3");
    java.lang.String var7 = var6.toString();
    com.google.javascript.jscomp.CheckLevel var11 = null;
    com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.warning("hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3", ": hi!. hi! at hi! line (unknown line) : (unknown column)");
    com.google.javascript.jscomp.CheckLevel var18 = null;
    com.google.javascript.rhino.Node var20 = null;
    com.google.javascript.jscomp.DiagnosticType var23 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
    com.google.javascript.jscomp.CheckLevel var28 = null;
    com.google.javascript.jscomp.DiagnosticType var30 = com.google.javascript.jscomp.DiagnosticType.make("", var28, "hi!");
    java.lang.String[] var32 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var33 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var30, var32);
    com.google.javascript.jscomp.JSError var34 = com.google.javascript.jscomp.JSError.make("", var20, var23, var32);
    com.google.javascript.jscomp.DiagnosticType var37 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
    int var38 = var23.compareTo(var37);
    com.google.javascript.rhino.Node var40 = null;
    com.google.javascript.jscomp.DiagnosticType var43 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
    com.google.javascript.jscomp.CheckLevel var48 = null;
    com.google.javascript.jscomp.DiagnosticType var50 = com.google.javascript.jscomp.DiagnosticType.make("", var48, "hi!");
    java.lang.String[] var52 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var53 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var50, var52);
    com.google.javascript.jscomp.JSError var54 = com.google.javascript.jscomp.JSError.make("", var40, var43, var52);
    com.google.javascript.jscomp.JSError var55 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3", 1, 46, var18, var37, var52);
    com.google.javascript.jscomp.JSError var56 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-12), 100, var11, var14, var52);
    com.google.javascript.jscomp.JSError var57 = com.google.javascript.jscomp.JSError.make(".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : ", 49, 12, var6, var52);
    com.google.javascript.jscomp.CheckLevel var59 = null;
    com.google.javascript.jscomp.DiagnosticType var61 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var59, "");
    java.lang.String var62 = var61.toString();
    com.google.javascript.jscomp.DiagnosticType var65 = com.google.javascript.jscomp.DiagnosticType.error(".  at (unknown source) line (unknown line) : (unknown column)", "hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3");
    boolean var66 = var61.equals((java.lang.Object)var65);
    boolean var67 = var57.equals((java.lang.Object)var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ": hi!. hi! at hi! line (unknown line) : (unknown column): hi!. hi! at hi!: hi! line 0 : -3"+ "'", var7.equals(": hi!. hi! at hi! line (unknown line) : (unknown column): hi!. hi! at hi!: hi! line 0 : -3"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "hi!: "+ "'", var62.equals("hi!: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test90"); }


    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.jscomp.CheckLevel var3 = null;
    com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.make("hi!: ", var3, "hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3");
    com.google.javascript.rhino.Node var10 = null;
    com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
    com.google.javascript.jscomp.CheckLevel var18 = null;
    com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.make("", var18, "hi!");
    java.lang.String[] var22 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var23 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var20, var22);
    com.google.javascript.jscomp.JSError var24 = com.google.javascript.jscomp.JSError.make("", var10, var13, var22);
    com.google.javascript.rhino.Node var26 = null;
    com.google.javascript.rhino.Node var28 = null;
    com.google.javascript.jscomp.DiagnosticType var31 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var36 = null;
    com.google.javascript.jscomp.DiagnosticType var38 = com.google.javascript.jscomp.DiagnosticType.make("", var36, "hi!");
    java.lang.String[] var40 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var41 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var38, var40);
    com.google.javascript.jscomp.JSError var42 = com.google.javascript.jscomp.JSError.make("hi!", var28, var31, var40);
    com.google.javascript.rhino.Node var44 = null;
    com.google.javascript.jscomp.DiagnosticType var47 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var52 = null;
    com.google.javascript.jscomp.DiagnosticType var54 = com.google.javascript.jscomp.DiagnosticType.make("", var52, "hi!");
    java.lang.String[] var56 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var57 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var54, var56);
    com.google.javascript.jscomp.JSError var58 = com.google.javascript.jscomp.JSError.make("hi!", var44, var47, var56);
    com.google.javascript.jscomp.JSError var59 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var26, var31, var56);
    com.google.javascript.rhino.Node var61 = null;
    com.google.javascript.jscomp.DiagnosticType var64 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var69 = null;
    com.google.javascript.jscomp.DiagnosticType var71 = com.google.javascript.jscomp.DiagnosticType.make("", var69, "hi!");
    java.lang.String[] var73 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var74 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var71, var73);
    com.google.javascript.jscomp.JSError var75 = com.google.javascript.jscomp.JSError.make("hi!", var61, var64, var73);
    com.google.javascript.jscomp.JSError var76 = com.google.javascript.jscomp.JSError.make(var31, var73);
    com.google.javascript.jscomp.JSError var77 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var13, var73);
    com.google.javascript.jscomp.JSError var78 = com.google.javascript.jscomp.JSError.make("", var1, var5, var73);
    com.google.javascript.jscomp.DiagnosticType var81 = com.google.javascript.jscomp.DiagnosticType.error("hi!.  at hi!: hi! line (unknown line) : 10: : hi!", ": : hi!. hi! at hi! line (unknown line) : (unknown column)");
    boolean var82 = var78.equals((java.lang.Object)": : hi!. hi! at hi! line (unknown line) : (unknown column)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);

  }

  public void test91() {}
//   public void test91() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test91"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     java.lang.String[] var3 = null;
//     com.google.javascript.jscomp.JSError var4 = com.google.javascript.jscomp.JSError.make(var2, var3);
//     int var5 = var4.getCharno();
//     com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.error("hi!: ", ".  at (unknown source) line 1 : 10: hi!: hi!: ");
//     com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.error("", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.rhino.Node var13 = null;
//     com.google.javascript.jscomp.DiagnosticType var16 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var21 = null;
//     com.google.javascript.jscomp.DiagnosticType var23 = com.google.javascript.jscomp.DiagnosticType.make("", var21, "hi!");
//     java.lang.String[] var25 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var26 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var23, var25);
//     com.google.javascript.jscomp.JSError var27 = com.google.javascript.jscomp.JSError.make("hi!", var13, var16, var25);
//     com.google.javascript.jscomp.DiagnosticType var28 = var27.getType();
//     com.google.javascript.rhino.Node var30 = null;
//     com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var38 = null;
//     com.google.javascript.jscomp.DiagnosticType var40 = com.google.javascript.jscomp.DiagnosticType.make("", var38, "hi!");
//     java.lang.String[] var42 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var43 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var40, var42);
//     com.google.javascript.jscomp.JSError var44 = com.google.javascript.jscomp.JSError.make("hi!", var30, var33, var42);
//     com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make(var28, var42);
//     com.google.javascript.jscomp.JSError var46 = com.google.javascript.jscomp.JSError.make(var11, var42);
//     boolean var47 = var8.equals((java.lang.Object)var11);
//     boolean var48 = var4.equals((java.lang.Object)var11);
//     com.google.javascript.jscomp.CheckLevel var49 = null;
//     com.google.javascript.jscomp.MessageFormatter var50 = null;
//     java.lang.String var51 = var4.format(var49, var50);
// 
//   }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test92"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning("hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : hi!", ". hi! at (unknown source) line (unknown line) : (unknown column): hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test93() {}
//   public void test93() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test93"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.DiagnosticType var2 = null;
//     com.google.javascript.jscomp.CheckLevel var6 = null;
//     com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.error("", "hi!: hi!");
//     com.google.javascript.rhino.Node var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var19 = null;
//     com.google.javascript.jscomp.DiagnosticType var21 = com.google.javascript.jscomp.DiagnosticType.make("", var19, "hi!");
//     java.lang.String[] var23 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var24 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var21, var23);
//     com.google.javascript.jscomp.JSError var25 = com.google.javascript.jscomp.JSError.make("hi!", var11, var14, var23);
//     com.google.javascript.jscomp.DiagnosticType var26 = var25.getType();
//     com.google.javascript.rhino.Node var28 = null;
//     com.google.javascript.jscomp.DiagnosticType var31 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var36 = null;
//     com.google.javascript.jscomp.DiagnosticType var38 = com.google.javascript.jscomp.DiagnosticType.make("", var36, "hi!");
//     java.lang.String[] var40 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var41 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var38, var40);
//     com.google.javascript.jscomp.JSError var42 = com.google.javascript.jscomp.JSError.make("hi!", var28, var31, var40);
//     com.google.javascript.jscomp.JSError var43 = com.google.javascript.jscomp.JSError.make(var26, var40);
//     com.google.javascript.jscomp.JSError var44 = com.google.javascript.jscomp.JSError.make("hi!: hi!", 2, 0, var6, var9, var40);
//     com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make("hi!.  at (unknown source) line (unknown line) : (unknown column)", var1, var2, var40);
// 
//   }

  public void test94() {}
//   public void test94() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test94"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, ".  at (unknown source) line -3 : (unknown column). : : hi!. hi! at hi! line (unknown line) : (unknown column) at (unknown source) line (unknown line) : (unknown column)");
// 
//   }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test95"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf(": hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test96"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi!.  at hi!: hi! line (unknown line) : 10 at .  at (unknown source) line 1 : 10 line -12 : 100", ".  at (unknown source) line 1 : 10");
    java.lang.String var3 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!. hi!.  at hi!: hi! line (unknown line) : 10 at .  at (unknown source) line 1 : 10 line -12 : 100: .  at (unknown source) line 1 : 10"+ "'", var3.equals("hi!. hi!.  at hi!: hi! line (unknown line) : 10 at .  at (unknown source) line 1 : 10 line -12 : 100: .  at (unknown source) line 1 : 10"));

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test97"); }


    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.jscomp.DiagnosticType var4 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var9 = null;
    com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.make("", var9, "hi!");
    java.lang.String[] var13 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var14 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var11, var13);
    com.google.javascript.jscomp.JSError var15 = com.google.javascript.jscomp.JSError.make("hi!", var1, var4, var13);
    com.google.javascript.jscomp.DiagnosticType var16 = var15.getType();
    int var17 = var15.getCharno();
    boolean var19 = var15.equals((java.lang.Object)(short)1);
    java.lang.String var20 = var15.toString();
    com.google.javascript.jscomp.DiagnosticType var23 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    boolean var24 = var15.equals((java.lang.Object)"hi!");
    boolean var26 = var15.equals((java.lang.Object)(byte)100);
    com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var32 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var33 = var29.compareTo(var32);
    com.google.javascript.jscomp.DiagnosticType var36 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var39 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var40 = var36.compareTo(var39);
    com.google.javascript.jscomp.DiagnosticType var43 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var46 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var47 = var43.compareTo(var46);
    int var48 = var36.compareTo(var43);
    boolean var49 = var29.equals((java.lang.Object)var43);
    boolean var50 = var15.equals((java.lang.Object)var43);
    com.google.javascript.jscomp.DiagnosticType var51 = var15.getType();
    com.google.javascript.jscomp.CheckLevel var53 = null;
    com.google.javascript.jscomp.DiagnosticType var55 = com.google.javascript.jscomp.DiagnosticType.make("", var53, "hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at hi!.  at hi!: hi! line (unknown line) : 10 line 54 : -3");
    int var56 = var51.compareTo(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!. hi! at hi! line (unknown line) : (unknown column)"+ "'", var20.equals("hi!. hi! at hi! line (unknown line) : (unknown column)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 3);

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test98"); }


    com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var9 = var5.compareTo(var8);
    com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var15 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var16 = var12.compareTo(var15);
    int var17 = var5.compareTo(var12);
    java.lang.String[] var18 = null;
    com.google.javascript.jscomp.JSError var19 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", 10, 1, var5, var18);
    java.lang.String var20 = var19.toString();
    int var21 = var19.getCharno();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ".  at hi!. hi! at hi! line (unknown line) : (unknown column) line 10 : 1"+ "'", var20.equals(".  at hi!. hi! at hi! line (unknown line) : (unknown column) line 10 : 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test99"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf("hi!. hi! at hi! line (unknown line) : (unknown column). hi!: hi! at hi!.  at hi!: hi! line (unknown line) : 10 line -8 : -64");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test100() {}
//   public void test100() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test100"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.disabled("", "hi!");
//     com.google.javascript.jscomp.CheckLevel var10 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var16 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var17 = var13.compareTo(var16);
//     com.google.javascript.rhino.Node var19 = null;
//     com.google.javascript.rhino.Node var21 = null;
//     com.google.javascript.jscomp.DiagnosticType var24 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var29 = null;
//     com.google.javascript.jscomp.DiagnosticType var31 = com.google.javascript.jscomp.DiagnosticType.make("", var29, "hi!");
//     java.lang.String[] var33 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var34 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var31, var33);
//     com.google.javascript.jscomp.JSError var35 = com.google.javascript.jscomp.JSError.make("hi!", var21, var24, var33);
//     com.google.javascript.rhino.Node var37 = null;
//     com.google.javascript.jscomp.DiagnosticType var40 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var45 = null;
//     com.google.javascript.jscomp.DiagnosticType var47 = com.google.javascript.jscomp.DiagnosticType.make("", var45, "hi!");
//     java.lang.String[] var49 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var50 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var47, var49);
//     com.google.javascript.jscomp.JSError var51 = com.google.javascript.jscomp.JSError.make("hi!", var37, var40, var49);
//     com.google.javascript.jscomp.JSError var52 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var19, var24, var49);
//     com.google.javascript.jscomp.JSError var53 = com.google.javascript.jscomp.JSError.make("", 100, 1, var10, var16, var49);
//     com.google.javascript.jscomp.JSError var54 = com.google.javascript.jscomp.JSError.make("", 0, (-1), var3, var6, var49);
//     com.google.javascript.jscomp.DiagnosticType var55 = var54.getType();
//     com.google.javascript.jscomp.CheckLevel var56 = null;
//     com.google.javascript.jscomp.MessageFormatter var57 = null;
//     java.lang.String var58 = var54.format(var56, var57);
// 
//   }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test101"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error("", "hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3. : hi!. hi! at hi! line (unknown line) : (unknown column) at hi!: hi! line -12 : 100");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test102() {}
//   public void test102() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test102"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.DiagnosticType var4 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     com.google.javascript.jscomp.CheckLevel var9 = null;
//     com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.make("", var9, "hi!");
//     java.lang.String[] var13 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var14 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var11, var13);
//     com.google.javascript.jscomp.JSError var15 = com.google.javascript.jscomp.JSError.make("", var1, var4, var13);
//     int var16 = var15.getCharno();
//     int var17 = var15.getCharno();
//     com.google.javascript.jscomp.CheckLevel var18 = null;
//     com.google.javascript.jscomp.MessageFormatter var19 = null;
//     java.lang.String var20 = var15.format(var18, var19);
// 
//   }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test103"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning("hi!.  at (unknown source) line (unknown line) : (unknown column)", ".  at hi!. hi! at hi! line (unknown line) : (unknown column) line -3 : 0");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test104() {}
//   public void test104() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test104"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var0 = null;
//     com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.disabled(": ", "hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : hi!: . hi! at (unknown source) line (unknown line) : (unknown column): hi!. hi! at (unknown source) line (unknown line) : (unknown column): ");
//     com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.warning("hi!.  at hi!: hi! line (unknown line) : 10", "hi!. hi! at hi! line (unknown line) : (unknown column)");
//     com.google.javascript.rhino.Node var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var19 = null;
//     com.google.javascript.jscomp.DiagnosticType var21 = com.google.javascript.jscomp.DiagnosticType.make("", var19, "hi!");
//     java.lang.String[] var23 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var24 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var21, var23);
//     com.google.javascript.jscomp.JSError var25 = com.google.javascript.jscomp.JSError.make("hi!", var11, var14, var23);
//     com.google.javascript.jscomp.JSError var26 = com.google.javascript.jscomp.JSError.make("hi!", (-1), 2, var9, var23);
//     com.google.javascript.jscomp.JSError var27 = com.google.javascript.jscomp.JSError.make(var3, var23);
//     com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make(var0, var23);
// 
//   }

  public void test105() {}
//   public void test105() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test105"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     java.lang.String[] var3 = null;
//     com.google.javascript.jscomp.JSError var4 = com.google.javascript.jscomp.JSError.make(var2, var3);
//     int var5 = var4.getCharno();
//     com.google.javascript.jscomp.CheckLevel var6 = null;
//     com.google.javascript.jscomp.MessageFormatter var7 = null;
//     java.lang.String var8 = var4.format(var6, var7);
// 
//   }

  public void test106() {}
//   public void test106() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test106"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CheckLevel var2 = null;
//     com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.warning(". hi! at (unknown source) line (unknown line) : (unknown column)", "hi!.  at hi!: hi! line (unknown line) : 10");
//     com.google.javascript.jscomp.CheckLevel var9 = null;
//     com.google.javascript.jscomp.CheckLevel var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make(": hi!. hi! at hi! line (unknown line) : (unknown column)", var11, "hi!. hi! at hi!: hi! line 0 : -3");
//     java.lang.String var14 = var13.toString();
//     com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at (unknown source) line (unknown line) : (unknown column): ", ".  at (unknown source) line 1 : 10: hi!: hi!: ");
//     com.google.javascript.jscomp.CheckLevel var24 = null;
//     com.google.javascript.rhino.Node var26 = null;
//     com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     com.google.javascript.jscomp.CheckLevel var34 = null;
//     com.google.javascript.jscomp.DiagnosticType var36 = com.google.javascript.jscomp.DiagnosticType.make("", var34, "hi!");
//     java.lang.String[] var38 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var39 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var36, var38);
//     com.google.javascript.jscomp.JSError var40 = com.google.javascript.jscomp.JSError.make("", var26, var29, var38);
//     com.google.javascript.jscomp.DiagnosticType var43 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     int var44 = var29.compareTo(var43);
//     com.google.javascript.rhino.Node var46 = null;
//     com.google.javascript.jscomp.DiagnosticType var49 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     com.google.javascript.jscomp.CheckLevel var54 = null;
//     com.google.javascript.jscomp.DiagnosticType var56 = com.google.javascript.jscomp.DiagnosticType.make("", var54, "hi!");
//     java.lang.String[] var58 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var59 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var56, var58);
//     com.google.javascript.jscomp.JSError var60 = com.google.javascript.jscomp.JSError.make("", var46, var49, var58);
//     com.google.javascript.jscomp.JSError var61 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3", 1, 46, var24, var43, var58);
//     com.google.javascript.jscomp.JSError var62 = com.google.javascript.jscomp.JSError.make(".  at (unknown source) line (unknown line) : (unknown column)", 109, (-149), var20, var58);
//     com.google.javascript.jscomp.JSError var63 = com.google.javascript.jscomp.JSError.make(": : hi!. hi! at hi! line (unknown line) : (unknown column): hi!. hi! at hi!: hi! line 0 : -3", 39, (-58), var9, var13, var58);
//     com.google.javascript.jscomp.JSError var64 = com.google.javascript.jscomp.JSError.make(": : hi!.  at (unknown source) line (unknown line) : (unknown column)", var1, var2, var5, var58);
// 
//   }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test107"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning("hi!. hi! at hi!: hi! line 0 : -3: : hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)", ". hi! at hi! line 0 : (unknown column)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test108() {}
//   public void test108() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test108"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.rhino.Node var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "");
//     com.google.javascript.jscomp.CheckLevel var10 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.disabled("", "");
//     com.google.javascript.rhino.Node var15 = null;
//     com.google.javascript.rhino.Node var17 = null;
//     com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var25 = null;
//     com.google.javascript.jscomp.DiagnosticType var27 = com.google.javascript.jscomp.DiagnosticType.make("", var25, "hi!");
//     java.lang.String[] var29 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var30 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var27, var29);
//     com.google.javascript.jscomp.JSError var31 = com.google.javascript.jscomp.JSError.make("hi!", var17, var20, var29);
//     com.google.javascript.rhino.Node var33 = null;
//     com.google.javascript.jscomp.DiagnosticType var36 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var41 = null;
//     com.google.javascript.jscomp.DiagnosticType var43 = com.google.javascript.jscomp.DiagnosticType.make("", var41, "hi!");
//     java.lang.String[] var45 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var46 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var43, var45);
//     com.google.javascript.jscomp.JSError var47 = com.google.javascript.jscomp.JSError.make("hi!", var33, var36, var45);
//     com.google.javascript.jscomp.JSError var48 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var15, var20, var45);
//     com.google.javascript.rhino.Node var50 = null;
//     com.google.javascript.jscomp.DiagnosticType var53 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var58 = null;
//     com.google.javascript.jscomp.DiagnosticType var60 = com.google.javascript.jscomp.DiagnosticType.make("", var58, "hi!");
//     java.lang.String[] var62 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var63 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var60, var62);
//     com.google.javascript.jscomp.JSError var64 = com.google.javascript.jscomp.JSError.make("hi!", var50, var53, var62);
//     com.google.javascript.jscomp.JSError var65 = com.google.javascript.jscomp.JSError.make(var20, var62);
//     com.google.javascript.jscomp.JSError var66 = com.google.javascript.jscomp.JSError.make("", 0, 100, var10, var13, var62);
//     com.google.javascript.jscomp.JSError var67 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column): : hi!", var3, var6, var62);
//     java.lang.String[] var68 = null;
//     com.google.javascript.jscomp.JSError var69 = com.google.javascript.jscomp.JSError.make("hi!.  at hi!: hi! line (unknown line) : 10: : hi!", var1, var6, var68);
//     com.google.javascript.jscomp.CheckLevel var70 = null;
//     com.google.javascript.jscomp.MessageFormatter var71 = null;
//     java.lang.String var72 = var69.format(var70, var71);
// 
//   }

  public void test109() {}
//   public void test109() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test109"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CheckLevel var2 = null;
//     com.google.javascript.jscomp.DiagnosticType var3 = null;
//     com.google.javascript.rhino.Node var5 = null;
//     com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.disabled(": : hi!", ". hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.CheckLevel var12 = null;
//     com.google.javascript.jscomp.DiagnosticType var15 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at hi!: hi! line 0 : -3", ". hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.rhino.Node var17 = null;
//     com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!.  at hi!: hi! line (unknown line) : 10", "hi!");
//     com.google.javascript.jscomp.CheckLevel var24 = null;
//     com.google.javascript.jscomp.DiagnosticType var27 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var30 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var31 = var27.compareTo(var30);
//     com.google.javascript.jscomp.DiagnosticType var34 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var37 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var38 = var34.compareTo(var37);
//     com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var44 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var45 = var41.compareTo(var44);
//     int var46 = var34.compareTo(var41);
//     boolean var47 = var27.equals((java.lang.Object)var41);
//     com.google.javascript.rhino.Node var49 = null;
//     com.google.javascript.jscomp.DiagnosticType var52 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     com.google.javascript.jscomp.CheckLevel var57 = null;
//     com.google.javascript.jscomp.DiagnosticType var59 = com.google.javascript.jscomp.DiagnosticType.make("", var57, "hi!");
//     java.lang.String[] var61 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var62 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var59, var61);
//     com.google.javascript.jscomp.JSError var63 = com.google.javascript.jscomp.JSError.make("", var49, var52, var61);
//     com.google.javascript.jscomp.JSError var64 = com.google.javascript.jscomp.JSError.make("", 0, 1, var24, var27, var61);
//     com.google.javascript.jscomp.JSError var65 = com.google.javascript.jscomp.JSError.make("hi!.  at hi!: hi! line (unknown line) : 10: : hi!", var17, var20, var61);
//     com.google.javascript.jscomp.JSError var66 = com.google.javascript.jscomp.JSError.make("", (-149), 0, var12, var15, var61);
//     com.google.javascript.jscomp.JSError var67 = com.google.javascript.jscomp.JSError.make(". hi!. hi! at (unknown source) line (unknown line) : (unknown column) at hi!: hi! line -39 : 10", var5, var8, var61);
//     com.google.javascript.jscomp.JSError var68 = com.google.javascript.jscomp.JSError.make(". hi! at (unknown source) line (unknown line) : (unknown column). hi!. hi! at hi! line (unknown line) : (unknown column): : hi! at hi! line (unknown line) : (unknown column)", var1, var2, var3, var61);
// 
//   }

  public void test110() {}
//   public void test110() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test110"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.rhino.Node var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("", var11, "hi!");
//     java.lang.String[] var15 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var13, var15);
//     com.google.javascript.jscomp.JSError var17 = com.google.javascript.jscomp.JSError.make("hi!", var3, var6, var15);
//     com.google.javascript.rhino.Node var19 = null;
//     com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var27 = null;
//     com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.make("", var27, "hi!");
//     java.lang.String[] var31 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var32 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var29, var31);
//     com.google.javascript.jscomp.JSError var33 = com.google.javascript.jscomp.JSError.make("hi!", var19, var22, var31);
//     com.google.javascript.jscomp.JSError var34 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var1, var6, var31);
//     com.google.javascript.jscomp.DiagnosticType var37 = com.google.javascript.jscomp.DiagnosticType.warning("hi!", "");
//     com.google.javascript.jscomp.DiagnosticType var40 = com.google.javascript.jscomp.DiagnosticType.warning(".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : ", "hi!: hi!");
//     com.google.javascript.jscomp.DiagnosticType var43 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!.  at hi!: hi! line (unknown line) : 10", ": hi!");
//     com.google.javascript.jscomp.CheckLevel var47 = null;
//     com.google.javascript.jscomp.DiagnosticType var50 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at hi! line (unknown line) : (unknown column)", "hi!: hi!");
//     com.google.javascript.jscomp.CheckLevel var55 = null;
//     com.google.javascript.jscomp.DiagnosticType var57 = com.google.javascript.jscomp.DiagnosticType.make("", var55, "hi!");
//     java.lang.String[] var59 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var60 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var57, var59);
//     com.google.javascript.jscomp.JSError var61 = com.google.javascript.jscomp.JSError.make("hi!.  at hi!: hi! line (unknown line) : 10", (-8), (-64), var47, var50, var59);
//     com.google.javascript.jscomp.JSError var62 = com.google.javascript.jscomp.JSError.make(var43, var59);
//     com.google.javascript.jscomp.JSError var63 = com.google.javascript.jscomp.JSError.make(var40, var59);
//     com.google.javascript.jscomp.JSError var64 = com.google.javascript.jscomp.JSError.make(var37, var59);
//     com.google.javascript.jscomp.JSError var65 = com.google.javascript.jscomp.JSError.make(var6, var59);
//     com.google.javascript.jscomp.DiagnosticType var66 = var65.getType();
//     com.google.javascript.jscomp.CheckLevel var67 = null;
//     com.google.javascript.jscomp.MessageFormatter var68 = null;
//     java.lang.String var69 = var65.format(var67, var68);
// 
//   }

  public void test111() {}
//   public void test111() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test111"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.rhino.Node var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("", var11, "hi!");
//     java.lang.String[] var15 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var13, var15);
//     com.google.javascript.jscomp.JSError var17 = com.google.javascript.jscomp.JSError.make("hi!", var3, var6, var15);
//     com.google.javascript.rhino.Node var19 = null;
//     com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var27 = null;
//     com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.make("", var27, "hi!");
//     java.lang.String[] var31 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var32 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var29, var31);
//     com.google.javascript.jscomp.JSError var33 = com.google.javascript.jscomp.JSError.make("hi!", var19, var22, var31);
//     com.google.javascript.jscomp.JSError var34 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var1, var6, var31);
//     com.google.javascript.jscomp.DiagnosticType var37 = com.google.javascript.jscomp.DiagnosticType.warning("hi!", "");
//     com.google.javascript.jscomp.DiagnosticType var40 = com.google.javascript.jscomp.DiagnosticType.warning(".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : ", "hi!: hi!");
//     com.google.javascript.jscomp.DiagnosticType var43 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!.  at hi!: hi! line (unknown line) : 10", ": hi!");
//     com.google.javascript.jscomp.CheckLevel var47 = null;
//     com.google.javascript.jscomp.DiagnosticType var50 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at hi! line (unknown line) : (unknown column)", "hi!: hi!");
//     com.google.javascript.jscomp.CheckLevel var55 = null;
//     com.google.javascript.jscomp.DiagnosticType var57 = com.google.javascript.jscomp.DiagnosticType.make("", var55, "hi!");
//     java.lang.String[] var59 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var60 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var57, var59);
//     com.google.javascript.jscomp.JSError var61 = com.google.javascript.jscomp.JSError.make("hi!.  at hi!: hi! line (unknown line) : 10", (-8), (-64), var47, var50, var59);
//     com.google.javascript.jscomp.JSError var62 = com.google.javascript.jscomp.JSError.make(var43, var59);
//     com.google.javascript.jscomp.JSError var63 = com.google.javascript.jscomp.JSError.make(var40, var59);
//     com.google.javascript.jscomp.JSError var64 = com.google.javascript.jscomp.JSError.make(var37, var59);
//     com.google.javascript.jscomp.JSError var65 = com.google.javascript.jscomp.JSError.make(var6, var59);
//     com.google.javascript.jscomp.CheckLevel var66 = null;
//     com.google.javascript.jscomp.MessageFormatter var67 = null;
//     java.lang.String var68 = var65.format(var66, var67);
// 
//   }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test112"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning(".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3", "hi!: . hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3 at (unknown source) line (unknown line) : (unknown column)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test113"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning(". hi! at (unknown source) line 0 : 0: ", "hi!. hi! at hi!: hi! line 0 : -3: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test114() {}
//   public void test114() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test114"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CheckLevel var2 = null;
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.make("", var7, "hi!");
//     java.lang.String[] var11 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var12 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var9, var11);
//     com.google.javascript.rhino.Node var14 = null;
//     com.google.javascript.jscomp.DiagnosticType var17 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var22 = null;
//     com.google.javascript.jscomp.DiagnosticType var24 = com.google.javascript.jscomp.DiagnosticType.make("", var22, "hi!");
//     java.lang.String[] var26 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var27 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var24, var26);
//     com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make("hi!", var14, var17, var26);
//     int var29 = var28.getCharno();
//     com.google.javascript.jscomp.DiagnosticType var32 = com.google.javascript.jscomp.DiagnosticType.disabled("", "hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.rhino.Node var34 = null;
//     com.google.javascript.jscomp.DiagnosticType var37 = com.google.javascript.jscomp.DiagnosticType.error("hi!.  at hi!: hi! line (unknown line) : 10", "hi!. hi! at hi! line (unknown line) : (unknown column)");
//     com.google.javascript.rhino.Node var39 = null;
//     com.google.javascript.jscomp.DiagnosticType var42 = com.google.javascript.jscomp.DiagnosticType.error(": hi!", "hi!");
//     com.google.javascript.rhino.Node var44 = null;
//     com.google.javascript.rhino.Node var46 = null;
//     com.google.javascript.jscomp.DiagnosticType var49 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var54 = null;
//     com.google.javascript.jscomp.DiagnosticType var56 = com.google.javascript.jscomp.DiagnosticType.make("", var54, "hi!");
//     java.lang.String[] var58 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var59 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var56, var58);
//     com.google.javascript.jscomp.JSError var60 = com.google.javascript.jscomp.JSError.make("hi!", var46, var49, var58);
//     com.google.javascript.rhino.Node var62 = null;
//     com.google.javascript.jscomp.DiagnosticType var65 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var70 = null;
//     com.google.javascript.jscomp.DiagnosticType var72 = com.google.javascript.jscomp.DiagnosticType.make("", var70, "hi!");
//     java.lang.String[] var74 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var75 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var72, var74);
//     com.google.javascript.jscomp.JSError var76 = com.google.javascript.jscomp.JSError.make("hi!", var62, var65, var74);
//     com.google.javascript.jscomp.JSError var77 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var44, var49, var74);
//     com.google.javascript.rhino.Node var79 = null;
//     com.google.javascript.jscomp.DiagnosticType var82 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var87 = null;
//     com.google.javascript.jscomp.DiagnosticType var89 = com.google.javascript.jscomp.DiagnosticType.make("", var87, "hi!");
//     java.lang.String[] var91 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var92 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var89, var91);
//     com.google.javascript.jscomp.JSError var93 = com.google.javascript.jscomp.JSError.make("hi!", var79, var82, var91);
//     com.google.javascript.jscomp.JSError var94 = com.google.javascript.jscomp.JSError.make(var49, var91);
//     com.google.javascript.jscomp.JSError var95 = com.google.javascript.jscomp.JSError.make(": hi!", var39, var42, var91);
//     com.google.javascript.jscomp.JSError var96 = com.google.javascript.jscomp.JSError.make("", var34, var37, var91);
//     com.google.javascript.jscomp.JSError var97 = com.google.javascript.jscomp.JSError.make(var32, var91);
//     boolean var98 = var28.equals((java.lang.Object)var91);
//     com.google.javascript.jscomp.JSError var99 = com.google.javascript.jscomp.JSError.make(". hi! at (unknown source) line 0 : 0", var1, var2, var9, var91);
// 
//   }

  public void test115() {}
//   public void test115() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test115"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.DiagnosticType var2 = null;
//     com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.error(".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : ", "hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3");
//     com.google.javascript.jscomp.CheckLevel var12 = null;
//     com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var21 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var22 = var18.compareTo(var21);
//     com.google.javascript.jscomp.DiagnosticType var25 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var28 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var29 = var25.compareTo(var28);
//     int var30 = var18.compareTo(var25);
//     java.lang.String[] var31 = null;
//     com.google.javascript.jscomp.JSError var32 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", 10, 1, var18, var31);
//     com.google.javascript.jscomp.DiagnosticType var33 = var32.getType();
//     com.google.javascript.jscomp.DiagnosticType var36 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!: hi!: ", "hi!. hi! at hi! line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.CheckLevel var40 = null;
//     com.google.javascript.jscomp.CheckLevel var42 = null;
//     com.google.javascript.jscomp.DiagnosticType var44 = com.google.javascript.jscomp.DiagnosticType.make("", var42, "hi!");
//     com.google.javascript.rhino.Node var46 = null;
//     com.google.javascript.rhino.Node var48 = null;
//     com.google.javascript.jscomp.DiagnosticType var51 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var56 = null;
//     com.google.javascript.jscomp.DiagnosticType var58 = com.google.javascript.jscomp.DiagnosticType.make("", var56, "hi!");
//     java.lang.String[] var60 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var61 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var58, var60);
//     com.google.javascript.jscomp.JSError var62 = com.google.javascript.jscomp.JSError.make("hi!", var48, var51, var60);
//     com.google.javascript.rhino.Node var64 = null;
//     com.google.javascript.jscomp.DiagnosticType var67 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var72 = null;
//     com.google.javascript.jscomp.DiagnosticType var74 = com.google.javascript.jscomp.DiagnosticType.make("", var72, "hi!");
//     java.lang.String[] var76 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var77 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var74, var76);
//     com.google.javascript.jscomp.JSError var78 = com.google.javascript.jscomp.JSError.make("hi!", var64, var67, var76);
//     com.google.javascript.jscomp.JSError var79 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var46, var51, var76);
//     com.google.javascript.jscomp.JSError var80 = com.google.javascript.jscomp.JSError.make("hi!", 0, (-1), var40, var44, var76);
//     com.google.javascript.jscomp.JSError var81 = com.google.javascript.jscomp.JSError.make(var36, var76);
//     com.google.javascript.jscomp.JSError var82 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at hi!.  at hi!: hi! line (unknown line) : 10 line 54 : -3", (-67), 0, var12, var33, var76);
//     com.google.javascript.jscomp.JSError var83 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column). hi!: hi! at (unknown source) line (unknown line) : (unknown column)", 1, 12, var8, var76);
//     com.google.javascript.jscomp.JSError var84 = com.google.javascript.jscomp.JSError.make(". hi! at (unknown source) line 0 : 0", var1, var2, var76);
// 
//   }

  public void test116() {}
//   public void test116() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test116"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var4 = null;
//     com.google.javascript.rhino.Node var6 = null;
//     com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.error(". hi! at (unknown source) line (unknown line) : (unknown column)", "hi!. hi! at hi! line (unknown line) : (unknown column): : hi!");
//     com.google.javascript.jscomp.CheckLevel var13 = null;
//     com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var23 = var19.compareTo(var22);
//     com.google.javascript.jscomp.DiagnosticType var26 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var30 = var26.compareTo(var29);
//     int var31 = var19.compareTo(var26);
//     java.lang.String[] var32 = null;
//     com.google.javascript.jscomp.JSError var33 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", 10, 1, var19, var32);
//     com.google.javascript.jscomp.DiagnosticType var34 = var33.getType();
//     com.google.javascript.jscomp.DiagnosticType var37 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!: hi!: ", "hi!. hi! at hi! line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.CheckLevel var41 = null;
//     com.google.javascript.jscomp.CheckLevel var43 = null;
//     com.google.javascript.jscomp.DiagnosticType var45 = com.google.javascript.jscomp.DiagnosticType.make("", var43, "hi!");
//     com.google.javascript.rhino.Node var47 = null;
//     com.google.javascript.rhino.Node var49 = null;
//     com.google.javascript.jscomp.DiagnosticType var52 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var57 = null;
//     com.google.javascript.jscomp.DiagnosticType var59 = com.google.javascript.jscomp.DiagnosticType.make("", var57, "hi!");
//     java.lang.String[] var61 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var62 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var59, var61);
//     com.google.javascript.jscomp.JSError var63 = com.google.javascript.jscomp.JSError.make("hi!", var49, var52, var61);
//     com.google.javascript.rhino.Node var65 = null;
//     com.google.javascript.jscomp.DiagnosticType var68 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var73 = null;
//     com.google.javascript.jscomp.DiagnosticType var75 = com.google.javascript.jscomp.DiagnosticType.make("", var73, "hi!");
//     java.lang.String[] var77 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var78 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var75, var77);
//     com.google.javascript.jscomp.JSError var79 = com.google.javascript.jscomp.JSError.make("hi!", var65, var68, var77);
//     com.google.javascript.jscomp.JSError var80 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var47, var52, var77);
//     com.google.javascript.jscomp.JSError var81 = com.google.javascript.jscomp.JSError.make("hi!", 0, (-1), var41, var45, var77);
//     com.google.javascript.jscomp.JSError var82 = com.google.javascript.jscomp.JSError.make(var37, var77);
//     com.google.javascript.jscomp.JSError var83 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at hi!.  at hi!: hi! line (unknown line) : 10 line 54 : -3", (-67), 0, var13, var34, var77);
//     com.google.javascript.jscomp.JSError var84 = com.google.javascript.jscomp.JSError.make("hi!: . hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3 at (unknown source) line (unknown line) : (unknown column)", var6, var9, var77);
//     com.google.javascript.jscomp.JSError var85 = com.google.javascript.jscomp.JSError.make(": hi!: ", (-12), 39, var3, var4, var77);
// 
//   }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test117"); }


    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.jscomp.CheckLevel var3 = null;
    com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.make("hi!. hi!.  at hi!: hi! line (unknown line) : 10 at .  at (unknown source) line 1 : 10 line -12 : 100", var3, "hi!.  at (unknown source) line (unknown line) : (unknown column)");
    com.google.javascript.rhino.Node var7 = null;
    com.google.javascript.jscomp.DiagnosticType var10 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var14 = var10.compareTo(var13);
    com.google.javascript.jscomp.DiagnosticType var17 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var21 = var17.compareTo(var20);
    int var22 = var10.compareTo(var17);
    com.google.javascript.jscomp.DiagnosticType var25 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", ": hi!");
    int var26 = var17.compareTo(var25);
    java.lang.String[] var27 = null;
    com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make("", var7, var25, var27);
    boolean var29 = var5.equals((java.lang.Object)var27);
    com.google.javascript.jscomp.CheckLevel var33 = null;
    com.google.javascript.jscomp.CheckLevel var35 = null;
    com.google.javascript.jscomp.DiagnosticType var37 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var35, "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    com.google.javascript.jscomp.CheckLevel var42 = null;
    com.google.javascript.jscomp.DiagnosticType var44 = com.google.javascript.jscomp.DiagnosticType.make("", var42, "hi!");
    java.lang.String[] var46 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var47 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var44, var46);
    com.google.javascript.rhino.Node var49 = null;
    com.google.javascript.jscomp.DiagnosticType var52 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var57 = null;
    com.google.javascript.jscomp.DiagnosticType var59 = com.google.javascript.jscomp.DiagnosticType.make("", var57, "hi!");
    java.lang.String[] var61 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var62 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var59, var61);
    com.google.javascript.jscomp.JSError var63 = com.google.javascript.jscomp.JSError.make("hi!", var49, var52, var61);
    com.google.javascript.jscomp.JSError var64 = com.google.javascript.jscomp.JSError.make(var44, var61);
    com.google.javascript.jscomp.JSError var65 = com.google.javascript.jscomp.JSError.make("", 0, 1, var33, var37, var61);
    com.google.javascript.jscomp.JSError var66 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column): : hi!", var1, var5, var61);
    java.lang.String var67 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-8));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "hi!. hi!.  at hi!: hi! line (unknown line) : 10 at .  at (unknown source) line 1 : 10 line -12 : 100: hi!.  at (unknown source) line (unknown line) : (unknown column)"+ "'", var67.equals("hi!. hi!.  at hi!: hi! line (unknown line) : 10 at .  at (unknown source) line 1 : 10 line -12 : 100: hi!.  at (unknown source) line (unknown line) : (unknown column)"));

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test118"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!: ", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test119() {}
//   public void test119() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test119"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CheckLevel var2 = null;
//     com.google.javascript.rhino.Node var4 = null;
//     com.google.javascript.rhino.Node var6 = null;
//     com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var14 = null;
//     com.google.javascript.jscomp.DiagnosticType var16 = com.google.javascript.jscomp.DiagnosticType.make("", var14, "hi!");
//     java.lang.String[] var18 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var19 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var16, var18);
//     com.google.javascript.jscomp.JSError var20 = com.google.javascript.jscomp.JSError.make("hi!", var6, var9, var18);
//     com.google.javascript.rhino.Node var22 = null;
//     com.google.javascript.jscomp.DiagnosticType var25 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var30 = null;
//     com.google.javascript.jscomp.DiagnosticType var32 = com.google.javascript.jscomp.DiagnosticType.make("", var30, "hi!");
//     java.lang.String[] var34 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var35 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var32, var34);
//     com.google.javascript.jscomp.JSError var36 = com.google.javascript.jscomp.JSError.make("hi!", var22, var25, var34);
//     com.google.javascript.jscomp.JSError var37 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var4, var9, var34);
//     com.google.javascript.rhino.Node var39 = null;
//     com.google.javascript.jscomp.DiagnosticType var42 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var47 = null;
//     com.google.javascript.jscomp.DiagnosticType var49 = com.google.javascript.jscomp.DiagnosticType.make("", var47, "hi!");
//     java.lang.String[] var51 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var52 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var49, var51);
//     com.google.javascript.jscomp.JSError var53 = com.google.javascript.jscomp.JSError.make("hi!", var39, var42, var51);
//     com.google.javascript.jscomp.JSError var54 = com.google.javascript.jscomp.JSError.make(var9, var51);
//     java.lang.String var55 = var9.toString();
//     java.lang.String var56 = var9.toString();
//     java.lang.String[] var57 = null;
//     com.google.javascript.jscomp.JSError var58 = com.google.javascript.jscomp.JSError.make(".  at hi!. hi! at hi! line (unknown line) : (unknown column) line 10 : 1", var1, var2, var9, var57);
// 
//   }

  public void test120() {}
//   public void test120() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test120"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var0 = null;
//     com.google.javascript.rhino.Node var2 = null;
//     com.google.javascript.jscomp.CheckLevel var4 = null;
//     com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.make("hi!. hi!.  at hi!: hi! line (unknown line) : 10 at .  at (unknown source) line 1 : 10 line -12 : 100", var4, "hi!.  at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.rhino.Node var8 = null;
//     com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var15 = var11.compareTo(var14);
//     com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var21 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var22 = var18.compareTo(var21);
//     int var23 = var11.compareTo(var18);
//     com.google.javascript.jscomp.DiagnosticType var26 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", ": hi!");
//     int var27 = var18.compareTo(var26);
//     java.lang.String[] var28 = null;
//     com.google.javascript.jscomp.JSError var29 = com.google.javascript.jscomp.JSError.make("", var8, var26, var28);
//     boolean var30 = var6.equals((java.lang.Object)var28);
//     com.google.javascript.jscomp.CheckLevel var34 = null;
//     com.google.javascript.jscomp.CheckLevel var36 = null;
//     com.google.javascript.jscomp.DiagnosticType var38 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var36, "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.CheckLevel var43 = null;
//     com.google.javascript.jscomp.DiagnosticType var45 = com.google.javascript.jscomp.DiagnosticType.make("", var43, "hi!");
//     java.lang.String[] var47 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var48 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var45, var47);
//     com.google.javascript.rhino.Node var50 = null;
//     com.google.javascript.jscomp.DiagnosticType var53 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var58 = null;
//     com.google.javascript.jscomp.DiagnosticType var60 = com.google.javascript.jscomp.DiagnosticType.make("", var58, "hi!");
//     java.lang.String[] var62 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var63 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var60, var62);
//     com.google.javascript.jscomp.JSError var64 = com.google.javascript.jscomp.JSError.make("hi!", var50, var53, var62);
//     com.google.javascript.jscomp.JSError var65 = com.google.javascript.jscomp.JSError.make(var45, var62);
//     com.google.javascript.jscomp.JSError var66 = com.google.javascript.jscomp.JSError.make("", 0, 1, var34, var38, var62);
//     com.google.javascript.jscomp.JSError var67 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column): : hi!", var2, var6, var62);
//     com.google.javascript.jscomp.JSError var68 = com.google.javascript.jscomp.JSError.make(var0, var62);
// 
//   }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test121"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column): ", var1, "hi!: hi!: ");
    com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
    java.lang.String[] var7 = null;
    com.google.javascript.jscomp.JSError var8 = com.google.javascript.jscomp.JSError.make(var6, var7);
    boolean var9 = var3.equals((java.lang.Object)var8);
    java.lang.String var10 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!. hi! at (unknown source) line (unknown line) : (unknown column): : hi!: hi!: "+ "'", var10.equals("hi!. hi! at (unknown source) line (unknown line) : (unknown column): : hi!: hi!: "));

  }

  public void test122() {}
//   public void test122() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test122"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.DiagnosticType var2 = null;
//     com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!: hi!", ".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : ");
//     com.google.javascript.jscomp.CheckLevel var12 = null;
//     com.google.javascript.jscomp.DiagnosticType var15 = com.google.javascript.jscomp.DiagnosticType.error("", "hi!: hi!");
//     com.google.javascript.rhino.Node var17 = null;
//     com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var25 = null;
//     com.google.javascript.jscomp.DiagnosticType var27 = com.google.javascript.jscomp.DiagnosticType.make("", var25, "hi!");
//     java.lang.String[] var29 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var30 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var27, var29);
//     com.google.javascript.jscomp.JSError var31 = com.google.javascript.jscomp.JSError.make("hi!", var17, var20, var29);
//     com.google.javascript.jscomp.DiagnosticType var32 = var31.getType();
//     com.google.javascript.rhino.Node var34 = null;
//     com.google.javascript.jscomp.DiagnosticType var37 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var42 = null;
//     com.google.javascript.jscomp.DiagnosticType var44 = com.google.javascript.jscomp.DiagnosticType.make("", var42, "hi!");
//     java.lang.String[] var46 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var47 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var44, var46);
//     com.google.javascript.jscomp.JSError var48 = com.google.javascript.jscomp.JSError.make("hi!", var34, var37, var46);
//     com.google.javascript.jscomp.JSError var49 = com.google.javascript.jscomp.JSError.make(var32, var46);
//     com.google.javascript.jscomp.JSError var50 = com.google.javascript.jscomp.JSError.make("hi!: hi!", 2, 0, var12, var15, var46);
//     com.google.javascript.jscomp.JSError var51 = com.google.javascript.jscomp.JSError.make(".  at (unknown source) line -3 : (unknown column)", 0, 54, var8, var46);
//     com.google.javascript.jscomp.JSError var52 = com.google.javascript.jscomp.JSError.make(": : hi!.  at (unknown source) line (unknown line) : (unknown column)", var1, var2, var46);
// 
//   }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test123"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning("hi!. hi! at (unknown source) line (unknown line) : (unknown column): : hi!.  at hi!: hi! line (unknown line) : 10", ": hi!. hi! at hi! line (unknown line) : (unknown column): hi!. hi! at hi!: hi! line 0 : -3");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test124"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning(".  at (unknown source) line -3 : (unknown column). hi!: hi!: hi! at hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3 line 100 : -39", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test125"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled("", "hi!. hi! at hi! line (unknown line) : (unknown column)");
    com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var12 = var8.compareTo(var11);
    com.google.javascript.jscomp.DiagnosticType var15 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var19 = var15.compareTo(var18);
    int var20 = var8.compareTo(var15);
    java.lang.String[] var21 = null;
    com.google.javascript.jscomp.JSError var22 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", 10, 1, var8, var21);
    int var23 = var2.compareTo(var8);
    com.google.javascript.jscomp.DiagnosticType var26 = com.google.javascript.jscomp.DiagnosticType.warning("hi!.  at hi!: hi! line (unknown line) : 10", "");
    boolean var27 = var2.equals((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test126() {}
//   public void test126() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test126"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.DiagnosticType var4 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var9 = null;
//     com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.make("", var9, "hi!");
//     java.lang.String[] var13 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var14 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var11, var13);
//     com.google.javascript.jscomp.JSError var15 = com.google.javascript.jscomp.JSError.make("hi!", var1, var4, var13);
//     com.google.javascript.jscomp.DiagnosticType var16 = var15.getType();
//     com.google.javascript.rhino.Node var18 = null;
//     com.google.javascript.jscomp.DiagnosticType var21 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var26 = null;
//     com.google.javascript.jscomp.DiagnosticType var28 = com.google.javascript.jscomp.DiagnosticType.make("", var26, "hi!");
//     java.lang.String[] var30 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var31 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var28, var30);
//     com.google.javascript.jscomp.JSError var32 = com.google.javascript.jscomp.JSError.make("hi!", var18, var21, var30);
//     com.google.javascript.jscomp.JSError var33 = com.google.javascript.jscomp.JSError.make(var16, var30);
//     com.google.javascript.jscomp.CheckLevel var35 = null;
//     com.google.javascript.jscomp.DiagnosticType var37 = com.google.javascript.jscomp.DiagnosticType.make(": ", var35, "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.CheckLevel var39 = null;
//     com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var39, "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     int var42 = var37.compareTo(var41);
//     boolean var43 = var33.equals((java.lang.Object)var42);
//     java.lang.String var44 = var33.toString();
//     java.lang.String var45 = var33.toString();
//     com.google.javascript.jscomp.CheckLevel var46 = null;
//     com.google.javascript.jscomp.MessageFormatter var47 = null;
//     java.lang.String var48 = var33.format(var46, var47);
// 
//   }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test127"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error(".  at hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3 line 0 : 1", "hi!. hi! at hi! line (unknown line) : (unknown column). hi!: hi! at (unknown source) line (unknown line) : (unknown column)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test128() {}
//   public void test128() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test128"); }
// 
// 
//     com.google.javascript.rhino.Node var4 = null;
//     com.google.javascript.jscomp.DiagnosticType var7 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var12 = null;
//     com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.make("", var12, "hi!");
//     java.lang.String[] var16 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var17 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var14, var16);
//     com.google.javascript.jscomp.JSError var18 = com.google.javascript.jscomp.JSError.make("hi!", var4, var7, var16);
//     com.google.javascript.jscomp.DiagnosticType var19 = var18.getType();
//     com.google.javascript.jscomp.CheckLevel var23 = null;
//     com.google.javascript.jscomp.DiagnosticType var26 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var30 = var26.compareTo(var29);
//     com.google.javascript.rhino.Node var32 = null;
//     com.google.javascript.rhino.Node var34 = null;
//     com.google.javascript.jscomp.DiagnosticType var37 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var42 = null;
//     com.google.javascript.jscomp.DiagnosticType var44 = com.google.javascript.jscomp.DiagnosticType.make("", var42, "hi!");
//     java.lang.String[] var46 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var47 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var44, var46);
//     com.google.javascript.jscomp.JSError var48 = com.google.javascript.jscomp.JSError.make("hi!", var34, var37, var46);
//     com.google.javascript.rhino.Node var50 = null;
//     com.google.javascript.jscomp.DiagnosticType var53 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var58 = null;
//     com.google.javascript.jscomp.DiagnosticType var60 = com.google.javascript.jscomp.DiagnosticType.make("", var58, "hi!");
//     java.lang.String[] var62 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var63 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var60, var62);
//     com.google.javascript.jscomp.JSError var64 = com.google.javascript.jscomp.JSError.make("hi!", var50, var53, var62);
//     com.google.javascript.jscomp.JSError var65 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var32, var37, var62);
//     com.google.javascript.jscomp.JSError var66 = com.google.javascript.jscomp.JSError.make("", 100, 1, var23, var29, var62);
//     com.google.javascript.jscomp.JSError var67 = com.google.javascript.jscomp.JSError.make("hi!: . hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3 at (unknown source) line (unknown line) : (unknown column)", 8, 2, var19, var62);
//     com.google.javascript.jscomp.DiagnosticType var68 = var67.getType();
//     com.google.javascript.jscomp.CheckLevel var69 = null;
//     com.google.javascript.jscomp.MessageFormatter var70 = null;
//     java.lang.String var71 = var67.format(var69, var70);
// 
//   }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test129"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var1, "");
    com.google.javascript.rhino.Node var8 = null;
    com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
    com.google.javascript.jscomp.CheckLevel var16 = null;
    com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.make("", var16, "hi!");
    java.lang.String[] var20 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var21 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var18, var20);
    com.google.javascript.jscomp.JSError var22 = com.google.javascript.jscomp.JSError.make("", var8, var11, var20);
    com.google.javascript.rhino.Node var24 = null;
    com.google.javascript.rhino.Node var26 = null;
    com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var34 = null;
    com.google.javascript.jscomp.DiagnosticType var36 = com.google.javascript.jscomp.DiagnosticType.make("", var34, "hi!");
    java.lang.String[] var38 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var39 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var36, var38);
    com.google.javascript.jscomp.JSError var40 = com.google.javascript.jscomp.JSError.make("hi!", var26, var29, var38);
    com.google.javascript.rhino.Node var42 = null;
    com.google.javascript.jscomp.DiagnosticType var45 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var50 = null;
    com.google.javascript.jscomp.DiagnosticType var52 = com.google.javascript.jscomp.DiagnosticType.make("", var50, "hi!");
    java.lang.String[] var54 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var55 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var52, var54);
    com.google.javascript.jscomp.JSError var56 = com.google.javascript.jscomp.JSError.make("hi!", var42, var45, var54);
    com.google.javascript.jscomp.JSError var57 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var24, var29, var54);
    com.google.javascript.rhino.Node var59 = null;
    com.google.javascript.jscomp.DiagnosticType var62 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var67 = null;
    com.google.javascript.jscomp.DiagnosticType var69 = com.google.javascript.jscomp.DiagnosticType.make("", var67, "hi!");
    java.lang.String[] var71 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var72 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var69, var71);
    com.google.javascript.jscomp.JSError var73 = com.google.javascript.jscomp.JSError.make("hi!", var59, var62, var71);
    com.google.javascript.jscomp.JSError var74 = com.google.javascript.jscomp.JSError.make(var29, var71);
    com.google.javascript.jscomp.JSError var75 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var11, var71);
    boolean var76 = var3.equals((java.lang.Object)var11);
    java.lang.String var77 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "hi!: hi!: "+ "'", var77.equals("hi!: hi!: "));

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test130"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning("hi!: : : hi!: ", "hi!.  at hi!: hi! line (unknown line) : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3");
    com.google.javascript.jscomp.CheckLevel var6 = null;
    com.google.javascript.jscomp.CheckLevel var10 = null;
    com.google.javascript.rhino.Node var12 = null;
    com.google.javascript.jscomp.DiagnosticType var15 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var20 = null;
    com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.make("", var20, "hi!");
    java.lang.String[] var24 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var25 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var22, var24);
    com.google.javascript.jscomp.JSError var26 = com.google.javascript.jscomp.JSError.make("hi!", var12, var15, var24);
    com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var30 = var15.compareTo(var29);
    java.lang.String[] var32 = new java.lang.String[] { "hi!: hi!: "};
    com.google.javascript.jscomp.JSError var33 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", 46, (-3), var10, var29, var32);
    com.google.javascript.jscomp.CheckLevel var38 = null;
    com.google.javascript.jscomp.DiagnosticType var40 = com.google.javascript.jscomp.DiagnosticType.make("", var38, "hi!");
    com.google.javascript.rhino.Node var42 = null;
    com.google.javascript.rhino.Node var44 = null;
    com.google.javascript.jscomp.DiagnosticType var47 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var52 = null;
    com.google.javascript.jscomp.DiagnosticType var54 = com.google.javascript.jscomp.DiagnosticType.make("", var52, "hi!");
    java.lang.String[] var56 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var57 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var54, var56);
    com.google.javascript.jscomp.JSError var58 = com.google.javascript.jscomp.JSError.make("hi!", var44, var47, var56);
    com.google.javascript.rhino.Node var60 = null;
    com.google.javascript.jscomp.DiagnosticType var63 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var68 = null;
    com.google.javascript.jscomp.DiagnosticType var70 = com.google.javascript.jscomp.DiagnosticType.make("", var68, "hi!");
    java.lang.String[] var72 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var73 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var70, var72);
    com.google.javascript.jscomp.JSError var74 = com.google.javascript.jscomp.JSError.make("hi!", var60, var63, var72);
    com.google.javascript.jscomp.JSError var75 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var42, var47, var72);
    com.google.javascript.rhino.Node var77 = null;
    com.google.javascript.jscomp.DiagnosticType var80 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var85 = null;
    com.google.javascript.jscomp.DiagnosticType var87 = com.google.javascript.jscomp.DiagnosticType.make("", var85, "hi!");
    java.lang.String[] var89 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var90 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var87, var89);
    com.google.javascript.jscomp.JSError var91 = com.google.javascript.jscomp.JSError.make("hi!", var77, var80, var89);
    com.google.javascript.jscomp.JSError var92 = com.google.javascript.jscomp.JSError.make(var47, var89);
    com.google.javascript.jscomp.JSError var93 = com.google.javascript.jscomp.JSError.make("", 0, 0, var40, var89);
    com.google.javascript.jscomp.JSError var94 = com.google.javascript.jscomp.JSError.make("hi!.  at hi!: hi! line (unknown line) : 10", 3, 0, var6, var29, var89);
    com.google.javascript.jscomp.JSError var95 = com.google.javascript.jscomp.JSError.make(var2, var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);

  }

  public void test131() {}
//   public void test131() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test131"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CheckLevel var2 = null;
//     com.google.javascript.jscomp.DiagnosticType var3 = null;
//     com.google.javascript.rhino.Node var5 = null;
//     com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var16 = null;
//     com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.make("", var16, "hi!");
//     java.lang.String[] var20 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var21 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var18, var20);
//     com.google.javascript.rhino.Node var23 = null;
//     com.google.javascript.jscomp.DiagnosticType var26 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var31 = null;
//     com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.make("", var31, "hi!");
//     java.lang.String[] var35 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var36 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var33, var35);
//     com.google.javascript.jscomp.JSError var37 = com.google.javascript.jscomp.JSError.make("hi!", var23, var26, var35);
//     com.google.javascript.jscomp.JSError var38 = com.google.javascript.jscomp.JSError.make(var18, var35);
//     com.google.javascript.jscomp.JSError var39 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", (-1), (-3), var11, var35);
//     com.google.javascript.jscomp.CheckLevel var43 = null;
//     com.google.javascript.jscomp.DiagnosticType var46 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.CheckLevel var50 = null;
//     com.google.javascript.jscomp.DiagnosticType var53 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var56 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var57 = var53.compareTo(var56);
//     com.google.javascript.rhino.Node var59 = null;
//     com.google.javascript.rhino.Node var61 = null;
//     com.google.javascript.jscomp.DiagnosticType var64 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var69 = null;
//     com.google.javascript.jscomp.DiagnosticType var71 = com.google.javascript.jscomp.DiagnosticType.make("", var69, "hi!");
//     java.lang.String[] var73 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var74 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var71, var73);
//     com.google.javascript.jscomp.JSError var75 = com.google.javascript.jscomp.JSError.make("hi!", var61, var64, var73);
//     com.google.javascript.rhino.Node var77 = null;
//     com.google.javascript.jscomp.DiagnosticType var80 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var85 = null;
//     com.google.javascript.jscomp.DiagnosticType var87 = com.google.javascript.jscomp.DiagnosticType.make("", var85, "hi!");
//     java.lang.String[] var89 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var90 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var87, var89);
//     com.google.javascript.jscomp.JSError var91 = com.google.javascript.jscomp.JSError.make("hi!", var77, var80, var89);
//     com.google.javascript.jscomp.JSError var92 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var59, var64, var89);
//     com.google.javascript.jscomp.JSError var93 = com.google.javascript.jscomp.JSError.make("", 100, 1, var50, var56, var89);
//     com.google.javascript.jscomp.JSError var94 = com.google.javascript.jscomp.JSError.make(": hi!", 0, 10, var43, var46, var89);
//     com.google.javascript.jscomp.JSError var95 = com.google.javascript.jscomp.JSError.make(": hi!", var5, var11, var89);
//     com.google.javascript.jscomp.JSError var96 = com.google.javascript.jscomp.JSError.make(": hi!: hi!: hi!", var1, var2, var3, var89);
// 
//   }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test132"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.rhino.Node var4 = null;
    com.google.javascript.rhino.Node var6 = null;
    com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var14 = null;
    com.google.javascript.jscomp.DiagnosticType var16 = com.google.javascript.jscomp.DiagnosticType.make("", var14, "hi!");
    java.lang.String[] var18 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var19 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var16, var18);
    com.google.javascript.jscomp.JSError var20 = com.google.javascript.jscomp.JSError.make("hi!", var6, var9, var18);
    com.google.javascript.rhino.Node var22 = null;
    com.google.javascript.jscomp.DiagnosticType var25 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var30 = null;
    com.google.javascript.jscomp.DiagnosticType var32 = com.google.javascript.jscomp.DiagnosticType.make("", var30, "hi!");
    java.lang.String[] var34 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var35 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var32, var34);
    com.google.javascript.jscomp.JSError var36 = com.google.javascript.jscomp.JSError.make("hi!", var22, var25, var34);
    com.google.javascript.jscomp.JSError var37 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var4, var9, var34);
    com.google.javascript.rhino.Node var39 = null;
    com.google.javascript.jscomp.DiagnosticType var42 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var47 = null;
    com.google.javascript.jscomp.DiagnosticType var49 = com.google.javascript.jscomp.DiagnosticType.make("", var47, "hi!");
    java.lang.String[] var51 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var52 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var49, var51);
    com.google.javascript.jscomp.JSError var53 = com.google.javascript.jscomp.JSError.make("hi!", var39, var42, var51);
    com.google.javascript.jscomp.JSError var54 = com.google.javascript.jscomp.JSError.make(var9, var51);
    boolean var55 = var2.equals((java.lang.Object)var54);
    com.google.javascript.rhino.Node var57 = null;
    com.google.javascript.jscomp.DiagnosticType var60 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
    com.google.javascript.jscomp.CheckLevel var65 = null;
    com.google.javascript.jscomp.DiagnosticType var67 = com.google.javascript.jscomp.DiagnosticType.make("", var65, "hi!");
    java.lang.String[] var69 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var70 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var67, var69);
    com.google.javascript.jscomp.JSError var71 = com.google.javascript.jscomp.JSError.make("", var57, var60, var69);
    com.google.javascript.jscomp.DiagnosticType var74 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
    int var75 = var60.compareTo(var74);
    int var76 = var2.compareTo(var74);
    com.google.javascript.rhino.Node var78 = null;
    com.google.javascript.jscomp.DiagnosticType var81 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var86 = null;
    com.google.javascript.jscomp.DiagnosticType var88 = com.google.javascript.jscomp.DiagnosticType.make("", var86, "hi!");
    java.lang.String[] var90 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var91 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var88, var90);
    com.google.javascript.jscomp.JSError var92 = com.google.javascript.jscomp.JSError.make("hi!", var78, var81, var90);
    com.google.javascript.jscomp.DiagnosticType var95 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var96 = var81.compareTo(var95);
    int var97 = var2.compareTo(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == (-3));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == 0);

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test133"); }


    com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "");
    java.lang.String var6 = var5.toString();
    com.google.javascript.jscomp.CheckLevel var13 = null;
    com.google.javascript.jscomp.DiagnosticType var16 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var20 = var16.compareTo(var19);
    com.google.javascript.jscomp.DiagnosticType var23 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var26 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var27 = var23.compareTo(var26);
    com.google.javascript.jscomp.DiagnosticType var30 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var34 = var30.compareTo(var33);
    int var35 = var23.compareTo(var30);
    boolean var36 = var16.equals((java.lang.Object)var30);
    com.google.javascript.rhino.Node var38 = null;
    com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
    com.google.javascript.jscomp.CheckLevel var46 = null;
    com.google.javascript.jscomp.DiagnosticType var48 = com.google.javascript.jscomp.DiagnosticType.make("", var46, "hi!");
    java.lang.String[] var50 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var51 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var48, var50);
    com.google.javascript.jscomp.JSError var52 = com.google.javascript.jscomp.JSError.make("", var38, var41, var50);
    com.google.javascript.jscomp.JSError var53 = com.google.javascript.jscomp.JSError.make("", 0, 1, var13, var16, var50);
    com.google.javascript.rhino.Node var55 = null;
    com.google.javascript.jscomp.DiagnosticType var58 = com.google.javascript.jscomp.DiagnosticType.warning("hi!", "");
    com.google.javascript.rhino.Node var60 = null;
    com.google.javascript.jscomp.DiagnosticType var63 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
    com.google.javascript.jscomp.CheckLevel var68 = null;
    com.google.javascript.jscomp.DiagnosticType var70 = com.google.javascript.jscomp.DiagnosticType.make("", var68, "hi!");
    java.lang.String[] var72 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var73 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var70, var72);
    com.google.javascript.jscomp.JSError var74 = com.google.javascript.jscomp.JSError.make("", var60, var63, var72);
    com.google.javascript.jscomp.JSError var75 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var55, var58, var72);
    com.google.javascript.jscomp.JSError var76 = com.google.javascript.jscomp.JSError.make(": ", (-12), 46, var16, var72);
    com.google.javascript.jscomp.JSError var77 = com.google.javascript.jscomp.JSError.make("hi!.  at hi!: hi! line (unknown line) : 10", 54, (-3), var5, var72);
    java.lang.String var78 = var77.toString();
    java.lang.String var79 = var77.toString();
    com.google.javascript.jscomp.DiagnosticType var80 = var77.getType();
    int var81 = var77.getCharno();
    int var82 = var77.getCharno();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!. hi! at (unknown source) line (unknown line) : (unknown column): "+ "'", var6.equals("hi!. hi! at (unknown source) line (unknown line) : (unknown column): "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + "hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at hi!.  at hi!: hi! line (unknown line) : 10 line 54 : -3"+ "'", var78.equals("hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at hi!.  at hi!: hi! line (unknown line) : 10 line 54 : -3"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at hi!.  at hi!: hi! line (unknown line) : 10 line 54 : -3"+ "'", var79.equals("hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at hi!.  at hi!: hi! line (unknown line) : 10 line 54 : -3"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == (-3));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == (-3));

  }

  public void test134() {}
//   public void test134() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test134"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var0 = null;
//     com.google.javascript.rhino.Node var2 = null;
//     com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.disabled("", "");
//     java.lang.String[] var6 = null;
//     com.google.javascript.jscomp.JSError var7 = com.google.javascript.jscomp.JSError.make(var5, var6);
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.disabled("", "hi!. hi! at hi! line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.DiagnosticType var16 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "");
//     com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var23 = null;
//     com.google.javascript.jscomp.CheckLevel var25 = null;
//     com.google.javascript.jscomp.DiagnosticType var27 = com.google.javascript.jscomp.DiagnosticType.make("", var25, "hi!");
//     com.google.javascript.rhino.Node var29 = null;
//     com.google.javascript.rhino.Node var31 = null;
//     com.google.javascript.jscomp.DiagnosticType var34 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var39 = null;
//     com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.make("", var39, "hi!");
//     java.lang.String[] var43 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var44 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var41, var43);
//     com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make("hi!", var31, var34, var43);
//     com.google.javascript.rhino.Node var47 = null;
//     com.google.javascript.jscomp.DiagnosticType var50 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var55 = null;
//     com.google.javascript.jscomp.DiagnosticType var57 = com.google.javascript.jscomp.DiagnosticType.make("", var55, "hi!");
//     java.lang.String[] var59 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var60 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var57, var59);
//     com.google.javascript.jscomp.JSError var61 = com.google.javascript.jscomp.JSError.make("hi!", var47, var50, var59);
//     com.google.javascript.jscomp.JSError var62 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var29, var34, var59);
//     com.google.javascript.jscomp.JSError var63 = com.google.javascript.jscomp.JSError.make("hi!", 0, (-1), var23, var27, var59);
//     com.google.javascript.jscomp.JSError var64 = com.google.javascript.jscomp.JSError.make(var19, var59);
//     com.google.javascript.jscomp.JSError var65 = com.google.javascript.jscomp.JSError.make(var16, var59);
//     com.google.javascript.jscomp.JSError var66 = com.google.javascript.jscomp.JSError.make(": hi!. hi! at hi! line (unknown line) : (unknown column): hi!. hi! at hi!: hi! line 0 : -3", 0, 54, var13, var59);
//     com.google.javascript.jscomp.JSError var67 = com.google.javascript.jscomp.JSError.make(". hi! at (unknown source) line 0 : 0: .  at (unknown source) line -3 : (unknown column)", var2, var5, var59);
//     com.google.javascript.jscomp.JSError var68 = com.google.javascript.jscomp.JSError.make(var0, var59);
// 
//   }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test135"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", ": : hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test136"); }


    com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!: hi!", ".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : ");
    com.google.javascript.jscomp.CheckLevel var9 = null;
    com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.error("", "hi!: hi!");
    com.google.javascript.rhino.Node var14 = null;
    com.google.javascript.jscomp.DiagnosticType var17 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var22 = null;
    com.google.javascript.jscomp.DiagnosticType var24 = com.google.javascript.jscomp.DiagnosticType.make("", var22, "hi!");
    java.lang.String[] var26 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var27 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var24, var26);
    com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make("hi!", var14, var17, var26);
    com.google.javascript.jscomp.DiagnosticType var29 = var28.getType();
    com.google.javascript.rhino.Node var31 = null;
    com.google.javascript.jscomp.DiagnosticType var34 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var39 = null;
    com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.make("", var39, "hi!");
    java.lang.String[] var43 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var44 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var41, var43);
    com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make("hi!", var31, var34, var43);
    com.google.javascript.jscomp.JSError var46 = com.google.javascript.jscomp.JSError.make(var29, var43);
    com.google.javascript.jscomp.JSError var47 = com.google.javascript.jscomp.JSError.make("hi!: hi!", 2, 0, var9, var12, var43);
    com.google.javascript.jscomp.JSError var48 = com.google.javascript.jscomp.JSError.make(".  at (unknown source) line -3 : (unknown column)", 0, 54, var5, var43);
    boolean var50 = var48.equals((java.lang.Object)10L);
    java.lang.String var51 = var48.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!: hi!: hi!. .  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: :  at .  at (unknown source) line -3 : (unknown column) line 0 : 54"+ "'", var51.equals("hi!: hi!: hi!. .  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: :  at .  at (unknown source) line -3 : (unknown column) line 0 : 54"));

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test137"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf("hi!: : : hi!. hi! at hi!: hi! line 0 : -3: ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test138"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning("hi!.  at hi!: hi! line (unknown line) : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3", ": : hi!.  at (unknown source) line (unknown line) : (unknown column)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test139() {}
//   public void test139() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test139"); }
// 
// 
//     com.google.javascript.rhino.Node var4 = null;
//     com.google.javascript.rhino.Node var6 = null;
//     com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var14 = null;
//     com.google.javascript.jscomp.DiagnosticType var16 = com.google.javascript.jscomp.DiagnosticType.make("", var14, "hi!");
//     java.lang.String[] var18 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var19 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var16, var18);
//     com.google.javascript.jscomp.JSError var20 = com.google.javascript.jscomp.JSError.make("hi!", var6, var9, var18);
//     com.google.javascript.rhino.Node var22 = null;
//     com.google.javascript.jscomp.DiagnosticType var25 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var30 = null;
//     com.google.javascript.jscomp.DiagnosticType var32 = com.google.javascript.jscomp.DiagnosticType.make("", var30, "hi!");
//     java.lang.String[] var34 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var35 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var32, var34);
//     com.google.javascript.jscomp.JSError var36 = com.google.javascript.jscomp.JSError.make("hi!", var22, var25, var34);
//     com.google.javascript.jscomp.JSError var37 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var4, var9, var34);
//     com.google.javascript.jscomp.CheckLevel var41 = null;
//     com.google.javascript.jscomp.DiagnosticType var44 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var47 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var48 = var44.compareTo(var47);
//     com.google.javascript.jscomp.DiagnosticType var51 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var54 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var55 = var51.compareTo(var54);
//     com.google.javascript.jscomp.DiagnosticType var58 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var61 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var62 = var58.compareTo(var61);
//     int var63 = var51.compareTo(var58);
//     boolean var64 = var44.equals((java.lang.Object)var58);
//     com.google.javascript.rhino.Node var66 = null;
//     com.google.javascript.jscomp.DiagnosticType var69 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     com.google.javascript.jscomp.CheckLevel var74 = null;
//     com.google.javascript.jscomp.DiagnosticType var76 = com.google.javascript.jscomp.DiagnosticType.make("", var74, "hi!");
//     java.lang.String[] var78 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var79 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var76, var78);
//     com.google.javascript.jscomp.JSError var80 = com.google.javascript.jscomp.JSError.make("", var66, var69, var78);
//     com.google.javascript.jscomp.JSError var81 = com.google.javascript.jscomp.JSError.make("", 0, 1, var41, var44, var78);
//     com.google.javascript.jscomp.JSError var82 = com.google.javascript.jscomp.JSError.make("hi!: hi!", 0, (-3), var9, var78);
//     int var83 = var82.getCharno();
//     int var84 = var82.getCharno();
//     java.lang.String var85 = var82.toString();
//     int var86 = var82.getCharno();
//     com.google.javascript.jscomp.CheckLevel var87 = null;
//     com.google.javascript.jscomp.MessageFormatter var88 = null;
//     java.lang.String var89 = var82.format(var87, var88);
// 
//   }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test140"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning("hi!.  at hi!: hi! line (unknown line) : 10", "hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3");
    com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.warning("hi!.  at hi!: hi! line (unknown line) : 10", "hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3");
    com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", ": hi!");
    com.google.javascript.jscomp.CheckLevel var10 = null;
    com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var10, "hi!: hi!: ");
    int var13 = var8.compareTo(var12);
    int var14 = var5.compareTo(var8);
    com.google.javascript.jscomp.CheckLevel var18 = null;
    com.google.javascript.jscomp.CheckLevel var20 = null;
    com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.make("", var20, "");
    com.google.javascript.jscomp.CheckLevel var27 = null;
    com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.make("", var27, "hi!");
    java.lang.String[] var31 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var32 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var29, var31);
    com.google.javascript.rhino.Node var34 = null;
    com.google.javascript.jscomp.DiagnosticType var37 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var42 = null;
    com.google.javascript.jscomp.DiagnosticType var44 = com.google.javascript.jscomp.DiagnosticType.make("", var42, "hi!");
    java.lang.String[] var46 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var47 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var44, var46);
    com.google.javascript.jscomp.JSError var48 = com.google.javascript.jscomp.JSError.make("hi!", var34, var37, var46);
    com.google.javascript.jscomp.JSError var49 = com.google.javascript.jscomp.JSError.make(var29, var46);
    com.google.javascript.jscomp.JSError var50 = com.google.javascript.jscomp.JSError.make(": ", 0, (-64), var18, var22, var46);
    boolean var51 = var5.equals((java.lang.Object)var22);
    boolean var52 = var2.equals((java.lang.Object)var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-12));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test141"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var1, ": : hi!. hi! at hi! line (unknown line) : (unknown column): hi!. hi! at hi!: hi! line 0 : -3");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test142"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error(": hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at hi!.  at hi!: hi! line (unknown line) : 10 line 54 : -3. . hi! at hi! line 1 : (unknown column) at .  at (unknown source) line -3 : (unknown column) line 51 : -3", "hi!: hi!: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test143"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning(".  at (unknown source) line 1 : 10", "hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3");
    com.google.javascript.rhino.Node var4 = null;
    com.google.javascript.rhino.Node var6 = null;
    com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
    com.google.javascript.jscomp.CheckLevel var14 = null;
    com.google.javascript.jscomp.DiagnosticType var16 = com.google.javascript.jscomp.DiagnosticType.make("", var14, "hi!");
    java.lang.String[] var18 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var19 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var16, var18);
    com.google.javascript.jscomp.JSError var20 = com.google.javascript.jscomp.JSError.make("", var6, var9, var18);
    com.google.javascript.jscomp.DiagnosticType var23 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
    int var24 = var9.compareTo(var23);
    com.google.javascript.jscomp.CheckLevel var28 = null;
    com.google.javascript.jscomp.DiagnosticType var31 = com.google.javascript.jscomp.DiagnosticType.disabled("", "hi!");
    com.google.javascript.jscomp.CheckLevel var35 = null;
    com.google.javascript.jscomp.DiagnosticType var38 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var42 = var38.compareTo(var41);
    com.google.javascript.rhino.Node var44 = null;
    com.google.javascript.rhino.Node var46 = null;
    com.google.javascript.jscomp.DiagnosticType var49 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var54 = null;
    com.google.javascript.jscomp.DiagnosticType var56 = com.google.javascript.jscomp.DiagnosticType.make("", var54, "hi!");
    java.lang.String[] var58 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var59 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var56, var58);
    com.google.javascript.jscomp.JSError var60 = com.google.javascript.jscomp.JSError.make("hi!", var46, var49, var58);
    com.google.javascript.rhino.Node var62 = null;
    com.google.javascript.jscomp.DiagnosticType var65 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var70 = null;
    com.google.javascript.jscomp.DiagnosticType var72 = com.google.javascript.jscomp.DiagnosticType.make("", var70, "hi!");
    java.lang.String[] var74 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var75 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var72, var74);
    com.google.javascript.jscomp.JSError var76 = com.google.javascript.jscomp.JSError.make("hi!", var62, var65, var74);
    com.google.javascript.jscomp.JSError var77 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var44, var49, var74);
    com.google.javascript.jscomp.JSError var78 = com.google.javascript.jscomp.JSError.make("", 100, 1, var35, var41, var74);
    com.google.javascript.jscomp.JSError var79 = com.google.javascript.jscomp.JSError.make("", 0, (-1), var28, var31, var74);
    com.google.javascript.jscomp.JSError var80 = com.google.javascript.jscomp.JSError.make("", var4, var23, var74);
    java.lang.String var81 = var80.toString();
    boolean var82 = var2.equals((java.lang.Object)var80);
    java.lang.String var83 = var2.toString();
    java.lang.String var84 = var2.toString();
    java.lang.String var85 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + "hi!.  at (unknown source) line (unknown line) : (unknown column)"+ "'", var81.equals("hi!.  at (unknown source) line (unknown line) : (unknown column)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var83 + "' != '" + ".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3"+ "'", var83.equals(".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + ".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3"+ "'", var84.equals(".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + ".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3"+ "'", var85.equals(".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3"));

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test144"); }


    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.jscomp.CheckLevel var5 = null;
    com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.warning("hi!: : ", "hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3");
    com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.warning("hi!", "");
    int var12 = var8.compareTo(var11);
    com.google.javascript.jscomp.CheckLevel var16 = null;
    com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!.  at hi!: hi! line (unknown line) : 10");
    com.google.javascript.rhino.Node var21 = null;
    com.google.javascript.jscomp.DiagnosticType var24 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var29 = null;
    com.google.javascript.jscomp.DiagnosticType var31 = com.google.javascript.jscomp.DiagnosticType.make("", var29, "hi!");
    java.lang.String[] var33 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var34 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var31, var33);
    com.google.javascript.jscomp.JSError var35 = com.google.javascript.jscomp.JSError.make("hi!", var21, var24, var33);
    com.google.javascript.jscomp.DiagnosticType var36 = var35.getType();
    com.google.javascript.rhino.Node var38 = null;
    com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var46 = null;
    com.google.javascript.jscomp.DiagnosticType var48 = com.google.javascript.jscomp.DiagnosticType.make("", var46, "hi!");
    java.lang.String[] var50 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var51 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var48, var50);
    com.google.javascript.jscomp.JSError var52 = com.google.javascript.jscomp.JSError.make("hi!", var38, var41, var50);
    com.google.javascript.jscomp.JSError var53 = com.google.javascript.jscomp.JSError.make(var36, var50);
    com.google.javascript.jscomp.JSError var54 = com.google.javascript.jscomp.JSError.make(".  at (unknown source) line 1 : 10", (-12), 100, var16, var19, var50);
    com.google.javascript.jscomp.JSError var55 = com.google.javascript.jscomp.JSError.make("", (-64), (-67), var5, var8, var50);
    com.google.javascript.rhino.Node var57 = null;
    com.google.javascript.jscomp.DiagnosticType var60 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    com.google.javascript.rhino.Node var62 = null;
    com.google.javascript.jscomp.DiagnosticType var65 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var70 = null;
    com.google.javascript.jscomp.DiagnosticType var72 = com.google.javascript.jscomp.DiagnosticType.make("", var70, "hi!");
    java.lang.String[] var74 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var75 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var72, var74);
    com.google.javascript.jscomp.JSError var76 = com.google.javascript.jscomp.JSError.make("hi!", var62, var65, var74);
    com.google.javascript.jscomp.JSError var77 = com.google.javascript.jscomp.JSError.make("hi!: hi!: ", var57, var60, var74);
    com.google.javascript.jscomp.JSError var78 = com.google.javascript.jscomp.JSError.make(".  at (unknown source) line (unknown line) : (unknown column): hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3", var1, var8, var74);
    com.google.javascript.jscomp.DiagnosticType var79 = var78.getType();
    com.google.javascript.jscomp.DiagnosticType var80 = var78.getType();
    java.lang.String var81 = var80.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + "hi!: : : hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3"+ "'", var81.equals("hi!: : : hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3"));

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test145"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at hi!.  at hi!: hi! line (unknown line) : 10 line 54 : -3", ": hi!. hi! at hi! line (unknown line) : (unknown column): hi!. hi! at hi!: hi! line 0 : -3");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test146() {}
//   public void test146() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test146"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.DiagnosticType var4 = com.google.javascript.jscomp.DiagnosticType.disabled(": ", "hi!: hi!: ");
//     java.lang.String[] var5 = null;
//     com.google.javascript.jscomp.JSError var6 = com.google.javascript.jscomp.JSError.make(".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : ", var1, var4, var5);
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.jscomp.MessageFormatter var8 = null;
//     java.lang.String var9 = var6.format(var7, var8);
// 
//   }

  public void test147() {}
//   public void test147() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test147"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var0 = null;
//     com.google.javascript.rhino.Node var2 = null;
//     com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var9 = var5.compareTo(var8);
//     com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var15 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var16 = var12.compareTo(var15);
//     int var17 = var5.compareTo(var12);
//     com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", ": hi!");
//     int var21 = var12.compareTo(var20);
//     com.google.javascript.jscomp.DiagnosticType var24 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at hi! line (unknown line) : (unknown column)", "hi!: hi!");
//     com.google.javascript.jscomp.DiagnosticType var27 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var30 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var31 = var27.compareTo(var30);
//     com.google.javascript.jscomp.DiagnosticType var34 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var37 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var38 = var34.compareTo(var37);
//     int var39 = var27.compareTo(var34);
//     int var40 = var24.compareTo(var34);
//     int var41 = var20.compareTo(var34);
//     com.google.javascript.jscomp.DiagnosticType var44 = com.google.javascript.jscomp.DiagnosticType.warning(": hi!", "hi!: : ");
//     com.google.javascript.jscomp.DiagnosticType var50 = com.google.javascript.jscomp.DiagnosticType.error("", "hi!. hi! at hi! line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.CheckLevel var54 = null;
//     com.google.javascript.jscomp.DiagnosticType var57 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var61 = null;
//     com.google.javascript.jscomp.CheckLevel var63 = null;
//     com.google.javascript.jscomp.DiagnosticType var65 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var63, "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.CheckLevel var70 = null;
//     com.google.javascript.jscomp.DiagnosticType var72 = com.google.javascript.jscomp.DiagnosticType.make("", var70, "hi!");
//     java.lang.String[] var74 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var75 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var72, var74);
//     com.google.javascript.rhino.Node var77 = null;
//     com.google.javascript.jscomp.DiagnosticType var80 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var85 = null;
//     com.google.javascript.jscomp.DiagnosticType var87 = com.google.javascript.jscomp.DiagnosticType.make("", var85, "hi!");
//     java.lang.String[] var89 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var90 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var87, var89);
//     com.google.javascript.jscomp.JSError var91 = com.google.javascript.jscomp.JSError.make("hi!", var77, var80, var89);
//     com.google.javascript.jscomp.JSError var92 = com.google.javascript.jscomp.JSError.make(var72, var89);
//     com.google.javascript.jscomp.JSError var93 = com.google.javascript.jscomp.JSError.make("", 0, 1, var61, var65, var89);
//     com.google.javascript.jscomp.JSError var94 = com.google.javascript.jscomp.JSError.make("hi!.  at hi!: hi! line (unknown line) : 10", 1, (-1), var54, var57, var89);
//     com.google.javascript.jscomp.JSError var95 = com.google.javascript.jscomp.JSError.make(": ", 100, (-1), var50, var89);
//     com.google.javascript.jscomp.JSError var96 = com.google.javascript.jscomp.JSError.make(var44, var89);
//     com.google.javascript.jscomp.JSError var97 = com.google.javascript.jscomp.JSError.make(": ", var2, var34, var89);
//     com.google.javascript.jscomp.JSError var98 = com.google.javascript.jscomp.JSError.make(var0, var89);
// 
//   }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test148"); }


    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.jscomp.DiagnosticType var4 = com.google.javascript.jscomp.DiagnosticType.error(".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : ", "hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3");
    java.lang.String[] var5 = null;
    com.google.javascript.jscomp.JSError var6 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at hi!.  at hi!: hi! line (unknown line) : 10 line 54 : -3", var1, var4, var5);
    com.google.javascript.jscomp.CheckLevel var10 = null;
    com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.warning(": ", "");
    com.google.javascript.rhino.Node var15 = null;
    com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    com.google.javascript.rhino.Node var20 = null;
    com.google.javascript.jscomp.DiagnosticType var23 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var28 = null;
    com.google.javascript.jscomp.DiagnosticType var30 = com.google.javascript.jscomp.DiagnosticType.make("", var28, "hi!");
    java.lang.String[] var32 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var33 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var30, var32);
    com.google.javascript.jscomp.JSError var34 = com.google.javascript.jscomp.JSError.make("hi!", var20, var23, var32);
    com.google.javascript.jscomp.JSError var35 = com.google.javascript.jscomp.JSError.make("hi!: hi!: ", var15, var18, var32);
    com.google.javascript.jscomp.DiagnosticType var36 = var35.getType();
    int var37 = var13.compareTo(var36);
    com.google.javascript.jscomp.CheckLevel var41 = null;
    com.google.javascript.jscomp.CheckLevel var43 = null;
    com.google.javascript.jscomp.DiagnosticType var45 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var43, "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    com.google.javascript.jscomp.CheckLevel var50 = null;
    com.google.javascript.jscomp.DiagnosticType var52 = com.google.javascript.jscomp.DiagnosticType.make("", var50, "hi!");
    java.lang.String[] var54 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var55 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var52, var54);
    com.google.javascript.rhino.Node var57 = null;
    com.google.javascript.jscomp.DiagnosticType var60 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var65 = null;
    com.google.javascript.jscomp.DiagnosticType var67 = com.google.javascript.jscomp.DiagnosticType.make("", var65, "hi!");
    java.lang.String[] var69 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var70 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var67, var69);
    com.google.javascript.jscomp.JSError var71 = com.google.javascript.jscomp.JSError.make("hi!", var57, var60, var69);
    com.google.javascript.jscomp.JSError var72 = com.google.javascript.jscomp.JSError.make(var52, var69);
    com.google.javascript.jscomp.JSError var73 = com.google.javascript.jscomp.JSError.make("", 0, 1, var41, var45, var69);
    com.google.javascript.jscomp.JSError var74 = com.google.javascript.jscomp.JSError.make("", (-39), 1, var10, var36, var69);
    com.google.javascript.jscomp.JSError var75 = com.google.javascript.jscomp.JSError.make(var4, var69);
    com.google.javascript.jscomp.DiagnosticType var76 = var75.getType();
    java.lang.String var77 = var76.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + ".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : : hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3"+ "'", var77.equals(".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : : hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3"));

  }

  public void test149() {}
//   public void test149() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test149"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "hi!. hi! at hi!: hi! line 0 : -3: : : hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
// 
//   }

  public void test150() {}
//   public void test150() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test150"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, ". hi! at (unknown source) line (unknown line) : (unknown column): hi!. hi! at (unknown source) line (unknown line) : (unknown column): ");
// 
//   }

  public void test151() {}
//   public void test151() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test151"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: hi!: hi!: ");
// 
//   }

  public void test152() {}
//   public void test152() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test152"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var4 = null;
//     com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.make("", var4, "hi!");
//     com.google.javascript.rhino.Node var8 = null;
//     com.google.javascript.rhino.Node var10 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var18 = null;
//     com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.make("", var18, "hi!");
//     java.lang.String[] var22 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var23 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var20, var22);
//     com.google.javascript.jscomp.JSError var24 = com.google.javascript.jscomp.JSError.make("hi!", var10, var13, var22);
//     com.google.javascript.rhino.Node var26 = null;
//     com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var34 = null;
//     com.google.javascript.jscomp.DiagnosticType var36 = com.google.javascript.jscomp.DiagnosticType.make("", var34, "hi!");
//     java.lang.String[] var38 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var39 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var36, var38);
//     com.google.javascript.jscomp.JSError var40 = com.google.javascript.jscomp.JSError.make("hi!", var26, var29, var38);
//     com.google.javascript.jscomp.JSError var41 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var8, var13, var38);
//     com.google.javascript.rhino.Node var43 = null;
//     com.google.javascript.jscomp.DiagnosticType var46 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var51 = null;
//     com.google.javascript.jscomp.DiagnosticType var53 = com.google.javascript.jscomp.DiagnosticType.make("", var51, "hi!");
//     java.lang.String[] var55 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var56 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var53, var55);
//     com.google.javascript.jscomp.JSError var57 = com.google.javascript.jscomp.JSError.make("hi!", var43, var46, var55);
//     com.google.javascript.jscomp.JSError var58 = com.google.javascript.jscomp.JSError.make(var13, var55);
//     com.google.javascript.jscomp.JSError var59 = com.google.javascript.jscomp.JSError.make("", 0, 0, var6, var55);
//     boolean var61 = var59.equals((java.lang.Object)10);
//     java.lang.String var62 = var59.toString();
//     com.google.javascript.jscomp.CheckLevel var63 = null;
//     com.google.javascript.jscomp.MessageFormatter var64 = null;
//     java.lang.String var65 = var59.format(var63, var64);
// 
//   }

  public void test153() {}
//   public void test153() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test153"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, ".  at hi!.  at hi!: hi! line (unknown line) : 10 line 3 : 0");
// 
//   }

  public void test154() {}
//   public void test154() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test154"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.DiagnosticType var4 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var9 = null;
//     com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.make("", var9, "hi!");
//     java.lang.String[] var13 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var14 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var11, var13);
//     com.google.javascript.jscomp.JSError var15 = com.google.javascript.jscomp.JSError.make("hi!", var1, var4, var13);
//     com.google.javascript.jscomp.DiagnosticType var16 = var15.getType();
//     int var17 = var15.getCharno();
//     boolean var19 = var15.equals((java.lang.Object)(short)1);
//     com.google.javascript.jscomp.DiagnosticType var20 = var15.getType();
//     int var21 = var15.getCharno();
//     int var22 = var15.getCharno();
//     com.google.javascript.jscomp.CheckLevel var23 = null;
//     com.google.javascript.jscomp.MessageFormatter var24 = null;
//     java.lang.String var25 = var15.format(var23, var24);
// 
//   }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test155"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make(". : : hi! at . hi! at hi! line 0 : (unknown column) line (unknown line) : (unknown column)", var1, "hi!. hi! at hi!: hi! line 0 : -3: : : hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test156() {}
//   public void test156() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test156"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CheckLevel var2 = null;
//     com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.warning(".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : ", "hi!: hi!");
//     java.lang.String[] var7 = new java.lang.String[] { ". hi!. hi! at (unknown source) line (unknown line) : (unknown column) at hi!: hi! line -39 : 10"};
//     com.google.javascript.jscomp.JSError var8 = com.google.javascript.jscomp.JSError.make("hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var1, var2, var5, var7);
// 
//   }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test157"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf(": . hi!: hi!:  at (unknown source) line (unknown line) : (unknown column)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test158() {}
//   public void test158() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test158"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!.  at hi!: hi! line (unknown line) : 10", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.CheckLevel var9 = null;
//     com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var16 = null;
//     com.google.javascript.jscomp.CheckLevel var18 = null;
//     com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var18, "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.CheckLevel var25 = null;
//     com.google.javascript.jscomp.DiagnosticType var27 = com.google.javascript.jscomp.DiagnosticType.make("", var25, "hi!");
//     java.lang.String[] var29 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var30 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var27, var29);
//     com.google.javascript.rhino.Node var32 = null;
//     com.google.javascript.jscomp.DiagnosticType var35 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var40 = null;
//     com.google.javascript.jscomp.DiagnosticType var42 = com.google.javascript.jscomp.DiagnosticType.make("", var40, "hi!");
//     java.lang.String[] var44 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var42, var44);
//     com.google.javascript.jscomp.JSError var46 = com.google.javascript.jscomp.JSError.make("hi!", var32, var35, var44);
//     com.google.javascript.jscomp.JSError var47 = com.google.javascript.jscomp.JSError.make(var27, var44);
//     com.google.javascript.jscomp.JSError var48 = com.google.javascript.jscomp.JSError.make("", 0, 1, var16, var20, var44);
//     com.google.javascript.jscomp.JSError var49 = com.google.javascript.jscomp.JSError.make("hi!.  at hi!: hi! line (unknown line) : 10", 1, (-1), var9, var12, var44);
//     com.google.javascript.jscomp.JSError var50 = com.google.javascript.jscomp.JSError.make("", (-3), (-12), var5, var44);
//     com.google.javascript.jscomp.DiagnosticType var53 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!: ", "hi!: hi!");
//     boolean var54 = var50.equals((java.lang.Object)"hi!: hi!");
//     com.google.javascript.jscomp.DiagnosticType var55 = var50.getType();
//     com.google.javascript.jscomp.CheckLevel var56 = null;
//     com.google.javascript.jscomp.MessageFormatter var57 = null;
//     java.lang.String var58 = var50.format(var56, var57);
// 
//   }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test159"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning("hi!. hi! at hi!: hi! line 0 : -3: : : hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "hi!. hi! at (unknown source) line -67 : 0: hi!: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test160() {}
//   public void test160() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test160"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     java.lang.String[] var3 = null;
//     com.google.javascript.jscomp.JSError var4 = com.google.javascript.jscomp.JSError.make(var2, var3);
//     com.google.javascript.jscomp.DiagnosticType var7 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     int var8 = var2.compareTo(var7);
//     com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.warning("", ". hi! at (unknown source) line (unknown line) : (unknown column)");
//     boolean var12 = var2.equals((java.lang.Object)"");
//     com.google.javascript.jscomp.DiagnosticType var13 = null;
//     int var14 = var2.compareTo(var13);
// 
//   }

  public void test161() {}
//   public void test161() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test161"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, ": : hi!");
// 
//   }

  public void test162() {}
//   public void test162() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test162"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CheckLevel var2 = null;
//     com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var12 = var8.compareTo(var11);
//     com.google.javascript.jscomp.DiagnosticType var15 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var19 = var15.compareTo(var18);
//     int var20 = var8.compareTo(var15);
//     java.lang.String[] var21 = null;
//     com.google.javascript.jscomp.JSError var22 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", 10, 1, var8, var21);
//     com.google.javascript.rhino.Node var24 = null;
//     com.google.javascript.jscomp.DiagnosticType var27 = com.google.javascript.jscomp.DiagnosticType.error("", ".  at :  line -12 : 46");
//     com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var36 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var37 = var33.compareTo(var36);
//     com.google.javascript.jscomp.DiagnosticType var40 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var43 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var44 = var40.compareTo(var43);
//     int var45 = var33.compareTo(var40);
//     com.google.javascript.jscomp.CheckLevel var50 = null;
//     com.google.javascript.jscomp.DiagnosticType var52 = com.google.javascript.jscomp.DiagnosticType.make("", var50, "hi!");
//     java.lang.String[] var54 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var55 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var52, var54);
//     com.google.javascript.jscomp.JSError var56 = com.google.javascript.jscomp.JSError.make("hi!.  at (unknown source) line (unknown line) : (unknown column)", (-3), 2, var40, var54);
//     com.google.javascript.jscomp.JSError var57 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column). hi!: hi! at (unknown source) line (unknown line) : (unknown column)", var24, var27, var54);
//     com.google.javascript.jscomp.JSError var58 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi!: hi! line 0 : -3: : : hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var1, var2, var8, var54);
// 
//   }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test163"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at (unknown source) line (unknown line) : (unknown column): hi!.  at hi!: hi! line (unknown line) : 10: : hi!", "hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3. : hi!. hi! at hi! line (unknown line) : (unknown column) at hi!: hi! line -12 : 100");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test164"); }


    com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.warning(".  at (unknown source) line (unknown line) : (unknown column)", "hi!.  at (unknown source) line (unknown line) : (unknown column)");
    com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at (unknown source) line (unknown line) : (unknown column): ", "hi!.  at hi!: hi! line (unknown line) : 10");
    com.google.javascript.rhino.Node var10 = null;
    com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.warning("hi!", "");
    com.google.javascript.rhino.Node var15 = null;
    com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
    com.google.javascript.jscomp.CheckLevel var23 = null;
    com.google.javascript.jscomp.DiagnosticType var25 = com.google.javascript.jscomp.DiagnosticType.make("", var23, "hi!");
    java.lang.String[] var27 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var25, var27);
    com.google.javascript.jscomp.JSError var29 = com.google.javascript.jscomp.JSError.make("", var15, var18, var27);
    com.google.javascript.jscomp.JSError var30 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var10, var13, var27);
    boolean var31 = var8.equals((java.lang.Object)var13);
    int var32 = var5.compareTo(var13);
    com.google.javascript.rhino.Node var34 = null;
    com.google.javascript.rhino.Node var36 = null;
    com.google.javascript.jscomp.DiagnosticType var39 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var44 = null;
    com.google.javascript.jscomp.DiagnosticType var46 = com.google.javascript.jscomp.DiagnosticType.make("", var44, "hi!");
    java.lang.String[] var48 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var49 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var46, var48);
    com.google.javascript.jscomp.JSError var50 = com.google.javascript.jscomp.JSError.make("hi!", var36, var39, var48);
    com.google.javascript.rhino.Node var52 = null;
    com.google.javascript.jscomp.DiagnosticType var55 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var60 = null;
    com.google.javascript.jscomp.DiagnosticType var62 = com.google.javascript.jscomp.DiagnosticType.make("", var60, "hi!");
    java.lang.String[] var64 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var65 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var62, var64);
    com.google.javascript.jscomp.JSError var66 = com.google.javascript.jscomp.JSError.make("hi!", var52, var55, var64);
    com.google.javascript.jscomp.JSError var67 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var34, var39, var64);
    com.google.javascript.jscomp.DiagnosticType var70 = com.google.javascript.jscomp.DiagnosticType.warning("hi!", "");
    com.google.javascript.jscomp.DiagnosticType var73 = com.google.javascript.jscomp.DiagnosticType.warning(".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : ", "hi!: hi!");
    com.google.javascript.jscomp.DiagnosticType var76 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!.  at hi!: hi! line (unknown line) : 10", ": hi!");
    com.google.javascript.jscomp.CheckLevel var80 = null;
    com.google.javascript.jscomp.DiagnosticType var83 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at hi! line (unknown line) : (unknown column)", "hi!: hi!");
    com.google.javascript.jscomp.CheckLevel var88 = null;
    com.google.javascript.jscomp.DiagnosticType var90 = com.google.javascript.jscomp.DiagnosticType.make("", var88, "hi!");
    java.lang.String[] var92 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var93 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var90, var92);
    com.google.javascript.jscomp.JSError var94 = com.google.javascript.jscomp.JSError.make("hi!.  at hi!: hi! line (unknown line) : 10", (-8), (-64), var80, var83, var92);
    com.google.javascript.jscomp.JSError var95 = com.google.javascript.jscomp.JSError.make(var76, var92);
    com.google.javascript.jscomp.JSError var96 = com.google.javascript.jscomp.JSError.make(var73, var92);
    com.google.javascript.jscomp.JSError var97 = com.google.javascript.jscomp.JSError.make(var70, var92);
    com.google.javascript.jscomp.JSError var98 = com.google.javascript.jscomp.JSError.make(var39, var92);
    com.google.javascript.jscomp.JSError var99 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", 49, 64, var13, var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-58));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var99);

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test165"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error(".  at (unknown source) line 100 : 1", ".  at (unknown source) line -3 : (unknown column). hi!: hi!: hi! at hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3 line 100 : -39");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test166"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning("hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at hi!.  at hi!: hi! line (unknown line) : 10 line 54 : -3", ": : hi!. hi! at hi! line (unknown line) : (unknown column): hi!. hi! at hi!: hi! line 0 : -3");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test167() {}
//   public void test167() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test167"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var4 = null;
//     com.google.javascript.jscomp.DiagnosticType var10 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!: hi!: ");
//     com.google.javascript.jscomp.CheckLevel var14 = null;
//     com.google.javascript.rhino.Node var16 = null;
//     com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var24 = null;
//     com.google.javascript.jscomp.DiagnosticType var26 = com.google.javascript.jscomp.DiagnosticType.make("", var24, "hi!");
//     java.lang.String[] var28 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var29 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var26, var28);
//     com.google.javascript.jscomp.JSError var30 = com.google.javascript.jscomp.JSError.make("hi!", var16, var19, var28);
//     com.google.javascript.jscomp.DiagnosticType var31 = var30.getType();
//     int var32 = var30.getCharno();
//     boolean var34 = var30.equals((java.lang.Object)(short)1);
//     com.google.javascript.jscomp.DiagnosticType var35 = var30.getType();
//     com.google.javascript.jscomp.DiagnosticType var38 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var42 = null;
//     com.google.javascript.jscomp.CheckLevel var44 = null;
//     com.google.javascript.jscomp.DiagnosticType var46 = com.google.javascript.jscomp.DiagnosticType.make("", var44, "hi!");
//     com.google.javascript.rhino.Node var48 = null;
//     com.google.javascript.rhino.Node var50 = null;
//     com.google.javascript.jscomp.DiagnosticType var53 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var58 = null;
//     com.google.javascript.jscomp.DiagnosticType var60 = com.google.javascript.jscomp.DiagnosticType.make("", var58, "hi!");
//     java.lang.String[] var62 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var63 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var60, var62);
//     com.google.javascript.jscomp.JSError var64 = com.google.javascript.jscomp.JSError.make("hi!", var50, var53, var62);
//     com.google.javascript.rhino.Node var66 = null;
//     com.google.javascript.jscomp.DiagnosticType var69 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var74 = null;
//     com.google.javascript.jscomp.DiagnosticType var76 = com.google.javascript.jscomp.DiagnosticType.make("", var74, "hi!");
//     java.lang.String[] var78 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var79 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var76, var78);
//     com.google.javascript.jscomp.JSError var80 = com.google.javascript.jscomp.JSError.make("hi!", var66, var69, var78);
//     com.google.javascript.jscomp.JSError var81 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var48, var53, var78);
//     com.google.javascript.jscomp.JSError var82 = com.google.javascript.jscomp.JSError.make("hi!", 0, (-1), var42, var46, var78);
//     com.google.javascript.jscomp.JSError var83 = com.google.javascript.jscomp.JSError.make(var38, var78);
//     com.google.javascript.jscomp.JSError var84 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column). hi!: hi! at (unknown source) line (unknown line) : (unknown column)", 0, 12, var14, var35, var78);
//     com.google.javascript.jscomp.JSError var85 = com.google.javascript.jscomp.JSError.make(". hi! at hi! line 0 : (unknown column)", 109, 0, var10, var78);
//     com.google.javascript.jscomp.JSError var86 = com.google.javascript.jscomp.JSError.make(". hi! at (unknown source) line (unknown line) : (unknown column)", 100, 54, var3, var4, var78);
// 
//   }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test168"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!: hi!. .  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: :  at .  at (unknown source) line -3 : (unknown column) line 0 : 54", var1, ".  at (unknown source) line (unknown line) : (unknown column): hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test169() {}
//   public void test169() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test169"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var1 = null;
//     com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make(". hi! at hi! line 0 : (unknown column)", var1, "hi!. hi!.  at hi!: hi! line (unknown line) : 10 at .  at (unknown source) line 1 : 10 line -12 : 100");
//     com.google.javascript.jscomp.DiagnosticType var4 = null;
//     int var5 = var3.compareTo(var4);
// 
//   }

  public void test170() {}
//   public void test170() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test170"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CheckLevel var2 = null;
//     com.google.javascript.jscomp.DiagnosticType var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.warning("hi!.  at hi!: hi! line (unknown line) : 10", "hi!. hi! at hi! line (unknown line) : (unknown column)");
//     com.google.javascript.rhino.Node var8 = null;
//     com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at hi! line (unknown line) : (unknown column): : hi!", ".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3");
//     com.google.javascript.jscomp.CheckLevel var15 = null;
//     com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.warning("hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3", ": hi!. hi! at hi! line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.CheckLevel var22 = null;
//     com.google.javascript.rhino.Node var24 = null;
//     com.google.javascript.jscomp.DiagnosticType var27 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     com.google.javascript.jscomp.CheckLevel var32 = null;
//     com.google.javascript.jscomp.DiagnosticType var34 = com.google.javascript.jscomp.DiagnosticType.make("", var32, "hi!");
//     java.lang.String[] var36 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var37 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var34, var36);
//     com.google.javascript.jscomp.JSError var38 = com.google.javascript.jscomp.JSError.make("", var24, var27, var36);
//     com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     int var42 = var27.compareTo(var41);
//     com.google.javascript.rhino.Node var44 = null;
//     com.google.javascript.jscomp.DiagnosticType var47 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     com.google.javascript.jscomp.CheckLevel var52 = null;
//     com.google.javascript.jscomp.DiagnosticType var54 = com.google.javascript.jscomp.DiagnosticType.make("", var52, "hi!");
//     java.lang.String[] var56 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var57 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var54, var56);
//     com.google.javascript.jscomp.JSError var58 = com.google.javascript.jscomp.JSError.make("", var44, var47, var56);
//     com.google.javascript.jscomp.JSError var59 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3", 1, 46, var22, var41, var56);
//     com.google.javascript.jscomp.JSError var60 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-12), 100, var15, var18, var56);
//     com.google.javascript.jscomp.JSError var61 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi!: hi! line 0 : -3: ", var8, var11, var56);
//     com.google.javascript.jscomp.JSError var62 = com.google.javascript.jscomp.JSError.make(var6, var56);
//     com.google.javascript.jscomp.JSError var63 = com.google.javascript.jscomp.JSError.make("", var1, var2, var3, var56);
// 
//   }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test171"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make(". hi! at (unknown source) line 0 : 0", var1, ".  at (unknown source) line -3 : (unknown column)");
    java.lang.String var4 = var3.toString();
    com.google.javascript.jscomp.CheckLevel var9 = null;
    com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.make("", var9, "hi!");
    java.lang.String[] var13 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var14 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var11, var13);
    com.google.javascript.jscomp.DiagnosticType var15 = var14.getType();
    com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var21 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var22 = var18.compareTo(var21);
    com.google.javascript.jscomp.DiagnosticType var25 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var28 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var29 = var25.compareTo(var28);
    int var30 = var18.compareTo(var25);
    com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", ": hi!");
    int var34 = var25.compareTo(var33);
    int var35 = var15.compareTo(var25);
    boolean var36 = var3.equals((java.lang.Object)var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ". hi! at (unknown source) line 0 : 0: .  at (unknown source) line -3 : (unknown column)"+ "'", var4.equals(". hi! at (unknown source) line 0 : 0: .  at (unknown source) line -3 : (unknown column)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == (-8));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test172() {}
//   public void test172() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test172"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.DiagnosticType var2 = null;
//     com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!: hi!: ");
//     com.google.javascript.jscomp.CheckLevel var12 = null;
//     com.google.javascript.rhino.Node var14 = null;
//     com.google.javascript.jscomp.DiagnosticType var17 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var22 = null;
//     com.google.javascript.jscomp.DiagnosticType var24 = com.google.javascript.jscomp.DiagnosticType.make("", var22, "hi!");
//     java.lang.String[] var26 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var27 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var24, var26);
//     com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make("hi!", var14, var17, var26);
//     com.google.javascript.jscomp.DiagnosticType var29 = var28.getType();
//     int var30 = var28.getCharno();
//     boolean var32 = var28.equals((java.lang.Object)(short)1);
//     com.google.javascript.jscomp.DiagnosticType var33 = var28.getType();
//     com.google.javascript.jscomp.DiagnosticType var36 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var40 = null;
//     com.google.javascript.jscomp.CheckLevel var42 = null;
//     com.google.javascript.jscomp.DiagnosticType var44 = com.google.javascript.jscomp.DiagnosticType.make("", var42, "hi!");
//     com.google.javascript.rhino.Node var46 = null;
//     com.google.javascript.rhino.Node var48 = null;
//     com.google.javascript.jscomp.DiagnosticType var51 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var56 = null;
//     com.google.javascript.jscomp.DiagnosticType var58 = com.google.javascript.jscomp.DiagnosticType.make("", var56, "hi!");
//     java.lang.String[] var60 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var61 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var58, var60);
//     com.google.javascript.jscomp.JSError var62 = com.google.javascript.jscomp.JSError.make("hi!", var48, var51, var60);
//     com.google.javascript.rhino.Node var64 = null;
//     com.google.javascript.jscomp.DiagnosticType var67 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var72 = null;
//     com.google.javascript.jscomp.DiagnosticType var74 = com.google.javascript.jscomp.DiagnosticType.make("", var72, "hi!");
//     java.lang.String[] var76 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var77 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var74, var76);
//     com.google.javascript.jscomp.JSError var78 = com.google.javascript.jscomp.JSError.make("hi!", var64, var67, var76);
//     com.google.javascript.jscomp.JSError var79 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var46, var51, var76);
//     com.google.javascript.jscomp.JSError var80 = com.google.javascript.jscomp.JSError.make("hi!", 0, (-1), var40, var44, var76);
//     com.google.javascript.jscomp.JSError var81 = com.google.javascript.jscomp.JSError.make(var36, var76);
//     com.google.javascript.jscomp.JSError var82 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column). hi!: hi! at (unknown source) line (unknown line) : (unknown column)", 0, 12, var12, var33, var76);
//     com.google.javascript.jscomp.JSError var83 = com.google.javascript.jscomp.JSError.make(". hi! at hi! line 0 : (unknown column)", 109, 0, var8, var76);
//     com.google.javascript.jscomp.JSError var84 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column). hi!: hi! at hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3 line (unknown line) : (unknown column)", var1, var2, var76);
// 
//   }

  public void test173() {}
//   public void test173() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test173"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled("", ": ");
//     com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!.  at hi!: hi! line (unknown line) : 10", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.CheckLevel var13 = null;
//     com.google.javascript.jscomp.DiagnosticType var15 = com.google.javascript.jscomp.DiagnosticType.make("", var13, "hi!");
//     com.google.javascript.rhino.Node var17 = null;
//     com.google.javascript.rhino.Node var19 = null;
//     com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var27 = null;
//     com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.make("", var27, "hi!");
//     java.lang.String[] var31 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var32 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var29, var31);
//     com.google.javascript.jscomp.JSError var33 = com.google.javascript.jscomp.JSError.make("hi!", var19, var22, var31);
//     com.google.javascript.rhino.Node var35 = null;
//     com.google.javascript.jscomp.DiagnosticType var38 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var43 = null;
//     com.google.javascript.jscomp.DiagnosticType var45 = com.google.javascript.jscomp.DiagnosticType.make("", var43, "hi!");
//     java.lang.String[] var47 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var48 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var45, var47);
//     com.google.javascript.jscomp.JSError var49 = com.google.javascript.jscomp.JSError.make("hi!", var35, var38, var47);
//     com.google.javascript.jscomp.JSError var50 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var17, var22, var47);
//     com.google.javascript.rhino.Node var52 = null;
//     com.google.javascript.jscomp.DiagnosticType var55 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var60 = null;
//     com.google.javascript.jscomp.DiagnosticType var62 = com.google.javascript.jscomp.DiagnosticType.make("", var60, "hi!");
//     java.lang.String[] var64 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var65 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var62, var64);
//     com.google.javascript.jscomp.JSError var66 = com.google.javascript.jscomp.JSError.make("hi!", var52, var55, var64);
//     com.google.javascript.jscomp.JSError var67 = com.google.javascript.jscomp.JSError.make(var22, var64);
//     com.google.javascript.jscomp.JSError var68 = com.google.javascript.jscomp.JSError.make("", 0, 0, var15, var64);
//     com.google.javascript.jscomp.JSError var69 = com.google.javascript.jscomp.JSError.make("", (-64), (-8), var8, var64);
//     com.google.javascript.jscomp.JSError var70 = com.google.javascript.jscomp.JSError.make(var2, var64);
//     com.google.javascript.jscomp.DiagnosticType var71 = var70.getType();
//     boolean var73 = var70.equals((java.lang.Object)"hi!. hi! at hi! line (unknown line) : (unknown column). hi!: hi! at hi!.  at hi!: hi! line (unknown line) : 10 line -8 : -64");
//     com.google.javascript.jscomp.CheckLevel var74 = null;
//     com.google.javascript.jscomp.MessageFormatter var75 = null;
//     java.lang.String var76 = var70.format(var74, var75);
// 
//   }

  public void test174() {}
//   public void test174() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test174"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CheckLevel var2 = null;
//     com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.disabled("", ".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : ");
//     com.google.javascript.jscomp.CheckLevel var9 = null;
//     com.google.javascript.rhino.Node var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var19 = null;
//     com.google.javascript.jscomp.DiagnosticType var21 = com.google.javascript.jscomp.DiagnosticType.make("", var19, "hi!");
//     java.lang.String[] var23 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var24 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var21, var23);
//     com.google.javascript.jscomp.JSError var25 = com.google.javascript.jscomp.JSError.make("hi!", var11, var14, var23);
//     com.google.javascript.jscomp.DiagnosticType var26 = var25.getType();
//     int var27 = var25.getCharno();
//     boolean var29 = var25.equals((java.lang.Object)(short)1);
//     com.google.javascript.jscomp.DiagnosticType var30 = var25.getType();
//     com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var37 = null;
//     com.google.javascript.jscomp.CheckLevel var39 = null;
//     com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.make("", var39, "hi!");
//     com.google.javascript.rhino.Node var43 = null;
//     com.google.javascript.rhino.Node var45 = null;
//     com.google.javascript.jscomp.DiagnosticType var48 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var53 = null;
//     com.google.javascript.jscomp.DiagnosticType var55 = com.google.javascript.jscomp.DiagnosticType.make("", var53, "hi!");
//     java.lang.String[] var57 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var58 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var55, var57);
//     com.google.javascript.jscomp.JSError var59 = com.google.javascript.jscomp.JSError.make("hi!", var45, var48, var57);
//     com.google.javascript.rhino.Node var61 = null;
//     com.google.javascript.jscomp.DiagnosticType var64 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var69 = null;
//     com.google.javascript.jscomp.DiagnosticType var71 = com.google.javascript.jscomp.DiagnosticType.make("", var69, "hi!");
//     java.lang.String[] var73 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var74 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var71, var73);
//     com.google.javascript.jscomp.JSError var75 = com.google.javascript.jscomp.JSError.make("hi!", var61, var64, var73);
//     com.google.javascript.jscomp.JSError var76 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var43, var48, var73);
//     com.google.javascript.jscomp.JSError var77 = com.google.javascript.jscomp.JSError.make("hi!", 0, (-1), var37, var41, var73);
//     com.google.javascript.jscomp.JSError var78 = com.google.javascript.jscomp.JSError.make(var33, var73);
//     com.google.javascript.jscomp.JSError var79 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column). hi!: hi! at (unknown source) line (unknown line) : (unknown column)", 0, 12, var9, var30, var73);
//     com.google.javascript.jscomp.JSError var80 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var1, var2, var5, var73);
// 
//   }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test175"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning(". hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at (unknown source) line (unknown line) : (unknown column) at (unknown source) line (unknown line) : (unknown column)", ".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test176"); }


    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.jscomp.DiagnosticType var4 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var7 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var8 = var4.compareTo(var7);
    com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var15 = var11.compareTo(var14);
    int var16 = var4.compareTo(var11);
    com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", ": hi!");
    int var20 = var11.compareTo(var19);
    com.google.javascript.jscomp.DiagnosticType var23 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at hi! line (unknown line) : (unknown column)", "hi!: hi!");
    com.google.javascript.jscomp.DiagnosticType var26 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var30 = var26.compareTo(var29);
    com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var36 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var37 = var33.compareTo(var36);
    int var38 = var26.compareTo(var33);
    int var39 = var23.compareTo(var33);
    int var40 = var19.compareTo(var33);
    com.google.javascript.jscomp.DiagnosticType var43 = com.google.javascript.jscomp.DiagnosticType.warning(": hi!", "hi!: : ");
    com.google.javascript.jscomp.DiagnosticType var49 = com.google.javascript.jscomp.DiagnosticType.error("", "hi!. hi! at hi! line (unknown line) : (unknown column)");
    com.google.javascript.jscomp.CheckLevel var53 = null;
    com.google.javascript.jscomp.DiagnosticType var56 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var60 = null;
    com.google.javascript.jscomp.CheckLevel var62 = null;
    com.google.javascript.jscomp.DiagnosticType var64 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var62, "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    com.google.javascript.jscomp.CheckLevel var69 = null;
    com.google.javascript.jscomp.DiagnosticType var71 = com.google.javascript.jscomp.DiagnosticType.make("", var69, "hi!");
    java.lang.String[] var73 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var74 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var71, var73);
    com.google.javascript.rhino.Node var76 = null;
    com.google.javascript.jscomp.DiagnosticType var79 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var84 = null;
    com.google.javascript.jscomp.DiagnosticType var86 = com.google.javascript.jscomp.DiagnosticType.make("", var84, "hi!");
    java.lang.String[] var88 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var89 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var86, var88);
    com.google.javascript.jscomp.JSError var90 = com.google.javascript.jscomp.JSError.make("hi!", var76, var79, var88);
    com.google.javascript.jscomp.JSError var91 = com.google.javascript.jscomp.JSError.make(var71, var88);
    com.google.javascript.jscomp.JSError var92 = com.google.javascript.jscomp.JSError.make("", 0, 1, var60, var64, var88);
    com.google.javascript.jscomp.JSError var93 = com.google.javascript.jscomp.JSError.make("hi!.  at hi!: hi! line (unknown line) : 10", 1, (-1), var53, var56, var88);
    com.google.javascript.jscomp.JSError var94 = com.google.javascript.jscomp.JSError.make(": ", 100, (-1), var49, var88);
    com.google.javascript.jscomp.JSError var95 = com.google.javascript.jscomp.JSError.make(var43, var88);
    com.google.javascript.jscomp.JSError var96 = com.google.javascript.jscomp.JSError.make(": ", var1, var33, var88);
    java.lang.String var97 = var96.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-8));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var97 + "' != '" + ".  at :  line (unknown line) : (unknown column)"+ "'", var97.equals(".  at :  line (unknown line) : (unknown column)"));

  }

  public void test177() {}
//   public void test177() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test177"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CheckLevel var2 = null;
//     com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at hi! line (unknown line) : (unknown column). hi!: hi! at (unknown source) line (unknown line) : (unknown column)", ". hi! at hi! line 0 : 0");
//     com.google.javascript.rhino.Node var7 = null;
//     com.google.javascript.jscomp.DiagnosticType var10 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var14 = var10.compareTo(var13);
//     com.google.javascript.jscomp.DiagnosticType var17 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var21 = var17.compareTo(var20);
//     int var22 = var10.compareTo(var17);
//     com.google.javascript.rhino.Node var24 = null;
//     com.google.javascript.jscomp.DiagnosticType var27 = com.google.javascript.jscomp.DiagnosticType.error(": hi!", "hi!");
//     com.google.javascript.rhino.Node var29 = null;
//     com.google.javascript.rhino.Node var31 = null;
//     com.google.javascript.jscomp.DiagnosticType var34 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var39 = null;
//     com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.make("", var39, "hi!");
//     java.lang.String[] var43 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var44 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var41, var43);
//     com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make("hi!", var31, var34, var43);
//     com.google.javascript.rhino.Node var47 = null;
//     com.google.javascript.jscomp.DiagnosticType var50 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var55 = null;
//     com.google.javascript.jscomp.DiagnosticType var57 = com.google.javascript.jscomp.DiagnosticType.make("", var55, "hi!");
//     java.lang.String[] var59 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var60 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var57, var59);
//     com.google.javascript.jscomp.JSError var61 = com.google.javascript.jscomp.JSError.make("hi!", var47, var50, var59);
//     com.google.javascript.jscomp.JSError var62 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var29, var34, var59);
//     com.google.javascript.rhino.Node var64 = null;
//     com.google.javascript.jscomp.DiagnosticType var67 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var72 = null;
//     com.google.javascript.jscomp.DiagnosticType var74 = com.google.javascript.jscomp.DiagnosticType.make("", var72, "hi!");
//     java.lang.String[] var76 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var77 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var74, var76);
//     com.google.javascript.jscomp.JSError var78 = com.google.javascript.jscomp.JSError.make("hi!", var64, var67, var76);
//     com.google.javascript.jscomp.JSError var79 = com.google.javascript.jscomp.JSError.make(var34, var76);
//     com.google.javascript.jscomp.JSError var80 = com.google.javascript.jscomp.JSError.make(": hi!", var24, var27, var76);
//     com.google.javascript.jscomp.JSError var81 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var7, var17, var76);
//     com.google.javascript.jscomp.JSError var82 = com.google.javascript.jscomp.JSError.make(": hi!", var1, var2, var5, var76);
// 
//   }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test178"); }


    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.jscomp.DiagnosticType var4 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    com.google.javascript.rhino.Node var6 = null;
    com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var14 = null;
    com.google.javascript.jscomp.DiagnosticType var16 = com.google.javascript.jscomp.DiagnosticType.make("", var14, "hi!");
    java.lang.String[] var18 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var19 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var16, var18);
    com.google.javascript.jscomp.JSError var20 = com.google.javascript.jscomp.JSError.make("hi!", var6, var9, var18);
    com.google.javascript.jscomp.JSError var21 = com.google.javascript.jscomp.JSError.make("hi!: hi!: ", var1, var4, var18);
    com.google.javascript.jscomp.DiagnosticType var22 = var21.getType();
    int var23 = var21.getCharno();
    int var24 = var21.getCharno();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test179"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled(": : hi!. hi! at hi! line (unknown line) : (unknown column)", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test180"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf("hi!. hi! at hi! line (unknown line) : (unknown column): : hi!. : hi! at (unknown source) line 64 : 64");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test181() {}
//   public void test181() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test181"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CheckLevel var2 = null;
//     com.google.javascript.rhino.Node var4 = null;
//     com.google.javascript.jscomp.DiagnosticType var7 = com.google.javascript.jscomp.DiagnosticType.disabled(": ", "hi!: hi!: ");
//     java.lang.String[] var8 = null;
//     com.google.javascript.jscomp.JSError var9 = com.google.javascript.jscomp.JSError.make(".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : ", var4, var7, var8);
//     com.google.javascript.jscomp.CheckLevel var13 = null;
//     com.google.javascript.jscomp.DiagnosticType var16 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!.  at hi!: hi! line (unknown line) : 10");
//     com.google.javascript.rhino.Node var18 = null;
//     com.google.javascript.jscomp.DiagnosticType var21 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var26 = null;
//     com.google.javascript.jscomp.DiagnosticType var28 = com.google.javascript.jscomp.DiagnosticType.make("", var26, "hi!");
//     java.lang.String[] var30 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var31 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var28, var30);
//     com.google.javascript.jscomp.JSError var32 = com.google.javascript.jscomp.JSError.make("hi!", var18, var21, var30);
//     com.google.javascript.jscomp.DiagnosticType var33 = var32.getType();
//     com.google.javascript.rhino.Node var35 = null;
//     com.google.javascript.jscomp.DiagnosticType var38 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var43 = null;
//     com.google.javascript.jscomp.DiagnosticType var45 = com.google.javascript.jscomp.DiagnosticType.make("", var43, "hi!");
//     java.lang.String[] var47 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var48 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var45, var47);
//     com.google.javascript.jscomp.JSError var49 = com.google.javascript.jscomp.JSError.make("hi!", var35, var38, var47);
//     com.google.javascript.jscomp.JSError var50 = com.google.javascript.jscomp.JSError.make(var33, var47);
//     com.google.javascript.jscomp.JSError var51 = com.google.javascript.jscomp.JSError.make(".  at (unknown source) line 1 : 10", (-12), 100, var13, var16, var47);
//     com.google.javascript.jscomp.JSError var52 = com.google.javascript.jscomp.JSError.make(". : : hi! at . hi! at hi! line 0 : (unknown column) line (unknown line) : (unknown column)", var1, var2, var7, var47);
// 
//   }

  public void test182() {}
//   public void test182() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test182"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CheckLevel var2 = null;
//     com.google.javascript.jscomp.CheckLevel var4 = null;
//     com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var4, "");
//     com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.disabled("", "hi!. hi! at hi! line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.DiagnosticType var15 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var19 = var15.compareTo(var18);
//     com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var25 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var26 = var22.compareTo(var25);
//     int var27 = var15.compareTo(var22);
//     java.lang.String[] var28 = null;
//     com.google.javascript.jscomp.JSError var29 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", 10, 1, var15, var28);
//     int var30 = var9.compareTo(var15);
//     com.google.javascript.jscomp.DiagnosticType var36 = com.google.javascript.jscomp.DiagnosticType.error("", "hi!. hi! at hi! line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.CheckLevel var40 = null;
//     com.google.javascript.jscomp.DiagnosticType var43 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var47 = null;
//     com.google.javascript.jscomp.CheckLevel var49 = null;
//     com.google.javascript.jscomp.DiagnosticType var51 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var49, "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.CheckLevel var56 = null;
//     com.google.javascript.jscomp.DiagnosticType var58 = com.google.javascript.jscomp.DiagnosticType.make("", var56, "hi!");
//     java.lang.String[] var60 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var61 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var58, var60);
//     com.google.javascript.rhino.Node var63 = null;
//     com.google.javascript.jscomp.DiagnosticType var66 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var71 = null;
//     com.google.javascript.jscomp.DiagnosticType var73 = com.google.javascript.jscomp.DiagnosticType.make("", var71, "hi!");
//     java.lang.String[] var75 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var76 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var73, var75);
//     com.google.javascript.jscomp.JSError var77 = com.google.javascript.jscomp.JSError.make("hi!", var63, var66, var75);
//     com.google.javascript.jscomp.JSError var78 = com.google.javascript.jscomp.JSError.make(var58, var75);
//     com.google.javascript.jscomp.JSError var79 = com.google.javascript.jscomp.JSError.make("", 0, 1, var47, var51, var75);
//     com.google.javascript.jscomp.JSError var80 = com.google.javascript.jscomp.JSError.make("hi!.  at hi!: hi! line (unknown line) : 10", 1, (-1), var40, var43, var75);
//     com.google.javascript.jscomp.JSError var81 = com.google.javascript.jscomp.JSError.make(": ", 100, (-1), var36, var75);
//     int var82 = var15.compareTo(var36);
//     int var83 = var6.compareTo(var15);
//     java.lang.String[] var84 = null;
//     com.google.javascript.jscomp.JSError var85 = com.google.javascript.jscomp.JSError.make("hi!.  at hi!: hi! line (unknown line) : 10. : hi! at (unknown source) line (unknown line) : (unknown column)", var1, var2, var15, var84);
// 
//   }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test183"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf("hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at hi!.  at hi!: hi! line (unknown line) : 10 line 54 : -3. . hi! at hi! line 1 : (unknown column) at .  at (unknown source) line -3 : (unknown column) line 51 : -3");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test184() {}
//   public void test184() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test184"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning(".  at hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3 line 0 : 1", "hi!. hi! at hi! line (unknown line) : (unknown column). hi!: hi! at hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3 line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.DiagnosticType var3 = null;
//     int var4 = var2.compareTo(var3);
// 
//   }

  public void test185() {}
//   public void test185() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test185"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CheckLevel var2 = null;
//     com.google.javascript.jscomp.DiagnosticType var3 = null;
//     com.google.javascript.rhino.Node var5 = null;
//     com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     com.google.javascript.jscomp.CheckLevel var12 = null;
//     com.google.javascript.rhino.Node var14 = null;
//     com.google.javascript.jscomp.DiagnosticType var17 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     com.google.javascript.jscomp.CheckLevel var22 = null;
//     com.google.javascript.jscomp.DiagnosticType var24 = com.google.javascript.jscomp.DiagnosticType.make("", var22, "hi!");
//     java.lang.String[] var26 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var27 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var24, var26);
//     com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make("", var14, var17, var26);
//     com.google.javascript.jscomp.DiagnosticType var31 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     int var32 = var17.compareTo(var31);
//     com.google.javascript.rhino.Node var34 = null;
//     com.google.javascript.jscomp.DiagnosticType var37 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     com.google.javascript.jscomp.CheckLevel var42 = null;
//     com.google.javascript.jscomp.DiagnosticType var44 = com.google.javascript.jscomp.DiagnosticType.make("", var42, "hi!");
//     java.lang.String[] var46 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var47 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var44, var46);
//     com.google.javascript.jscomp.JSError var48 = com.google.javascript.jscomp.JSError.make("", var34, var37, var46);
//     com.google.javascript.jscomp.JSError var49 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3", 1, 46, var12, var31, var46);
//     com.google.javascript.jscomp.JSError var50 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column). hi!: hi! at hi!.  at hi!: hi! line (unknown line) : 10 line -8 : -64", var5, var8, var46);
//     com.google.javascript.jscomp.JSError var51 = com.google.javascript.jscomp.JSError.make(": : hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : hi!: . hi! at (unknown source) line (unknown line) : (unknown column): hi!. hi! at (unknown source) line (unknown line) : (unknown column): ", var1, var2, var3, var46);
// 
//   }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test186"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("hi!: : : hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3", var1, "hi!. hi! at hi!: hi! line 0 : -3: : hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test187() {}
//   public void test187() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test187"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.DiagnosticType var4 = com.google.javascript.jscomp.DiagnosticType.warning("hi!", "");
//     java.lang.String var5 = var4.toString();
//     com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.error("", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.rhino.Node var10 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var18 = null;
//     com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.make("", var18, "hi!");
//     java.lang.String[] var22 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var23 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var20, var22);
//     com.google.javascript.jscomp.JSError var24 = com.google.javascript.jscomp.JSError.make("hi!", var10, var13, var22);
//     com.google.javascript.jscomp.DiagnosticType var25 = var24.getType();
//     com.google.javascript.rhino.Node var27 = null;
//     com.google.javascript.jscomp.DiagnosticType var30 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var35 = null;
//     com.google.javascript.jscomp.DiagnosticType var37 = com.google.javascript.jscomp.DiagnosticType.make("", var35, "hi!");
//     java.lang.String[] var39 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var40 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var37, var39);
//     com.google.javascript.jscomp.JSError var41 = com.google.javascript.jscomp.JSError.make("hi!", var27, var30, var39);
//     com.google.javascript.jscomp.JSError var42 = com.google.javascript.jscomp.JSError.make(var25, var39);
//     com.google.javascript.jscomp.JSError var43 = com.google.javascript.jscomp.JSError.make(var8, var39);
//     com.google.javascript.jscomp.JSError var44 = com.google.javascript.jscomp.JSError.make(".  at (unknown source) line 0 : 1", var1, var4, var39);
//     com.google.javascript.jscomp.CheckLevel var45 = null;
//     com.google.javascript.jscomp.MessageFormatter var46 = null;
//     java.lang.String var47 = var44.format(var45, var46);
// 
//   }

  public void test188() {}
//   public void test188() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test188"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     java.lang.String[] var3 = null;
//     com.google.javascript.jscomp.JSError var4 = com.google.javascript.jscomp.JSError.make(var2, var3);
//     int var5 = var4.getCharno();
//     com.google.javascript.jscomp.DiagnosticType var6 = var4.getType();
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.jscomp.MessageFormatter var8 = null;
//     java.lang.String var9 = var4.format(var7, var8);
// 
//   }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test189"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf("hi!.  at hi!: hi! line (unknown line) : 10. .  at (unknown source) line 1 : 10 at hi!: hi!:  line (unknown line) : (unknown column)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test190() {}
//   public void test190() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test190"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.rhino.Node var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("", var11, "hi!");
//     java.lang.String[] var15 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var13, var15);
//     com.google.javascript.jscomp.JSError var17 = com.google.javascript.jscomp.JSError.make("hi!", var3, var6, var15);
//     com.google.javascript.rhino.Node var19 = null;
//     com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var27 = null;
//     com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.make("", var27, "hi!");
//     java.lang.String[] var31 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var32 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var29, var31);
//     com.google.javascript.jscomp.JSError var33 = com.google.javascript.jscomp.JSError.make("hi!", var19, var22, var31);
//     com.google.javascript.jscomp.JSError var34 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var1, var6, var31);
//     int var35 = var34.getCharno();
//     com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!: hi!", ".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : ");
//     com.google.javascript.jscomp.CheckLevel var45 = null;
//     com.google.javascript.jscomp.DiagnosticType var48 = com.google.javascript.jscomp.DiagnosticType.error("", "hi!: hi!");
//     com.google.javascript.rhino.Node var50 = null;
//     com.google.javascript.jscomp.DiagnosticType var53 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var58 = null;
//     com.google.javascript.jscomp.DiagnosticType var60 = com.google.javascript.jscomp.DiagnosticType.make("", var58, "hi!");
//     java.lang.String[] var62 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var63 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var60, var62);
//     com.google.javascript.jscomp.JSError var64 = com.google.javascript.jscomp.JSError.make("hi!", var50, var53, var62);
//     com.google.javascript.jscomp.DiagnosticType var65 = var64.getType();
//     com.google.javascript.rhino.Node var67 = null;
//     com.google.javascript.jscomp.DiagnosticType var70 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var75 = null;
//     com.google.javascript.jscomp.DiagnosticType var77 = com.google.javascript.jscomp.DiagnosticType.make("", var75, "hi!");
//     java.lang.String[] var79 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var80 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var77, var79);
//     com.google.javascript.jscomp.JSError var81 = com.google.javascript.jscomp.JSError.make("hi!", var67, var70, var79);
//     com.google.javascript.jscomp.JSError var82 = com.google.javascript.jscomp.JSError.make(var65, var79);
//     com.google.javascript.jscomp.JSError var83 = com.google.javascript.jscomp.JSError.make("hi!: hi!", 2, 0, var45, var48, var79);
//     com.google.javascript.jscomp.JSError var84 = com.google.javascript.jscomp.JSError.make(".  at (unknown source) line -3 : (unknown column)", 0, 54, var41, var79);
//     boolean var85 = var34.equals((java.lang.Object)var84);
//     com.google.javascript.jscomp.CheckLevel var86 = null;
//     com.google.javascript.jscomp.MessageFormatter var87 = null;
//     java.lang.String var88 = var84.format(var86, var87);
// 
//   }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test191"); }


    com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!.  at hi!: hi! line (unknown line) : 10: : hi!", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    java.lang.String[] var6 = null;
    com.google.javascript.jscomp.JSError var7 = com.google.javascript.jscomp.JSError.make("", 149, (-253), var5, var6);
    com.google.javascript.rhino.Node var9 = null;
    com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.disabled(": ", "hi!: ");
    com.google.javascript.jscomp.CheckLevel var16 = null;
    com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.disabled("", "hi!");
    com.google.javascript.jscomp.CheckLevel var23 = null;
    com.google.javascript.jscomp.DiagnosticType var26 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var30 = var26.compareTo(var29);
    com.google.javascript.rhino.Node var32 = null;
    com.google.javascript.rhino.Node var34 = null;
    com.google.javascript.jscomp.DiagnosticType var37 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var42 = null;
    com.google.javascript.jscomp.DiagnosticType var44 = com.google.javascript.jscomp.DiagnosticType.make("", var42, "hi!");
    java.lang.String[] var46 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var47 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var44, var46);
    com.google.javascript.jscomp.JSError var48 = com.google.javascript.jscomp.JSError.make("hi!", var34, var37, var46);
    com.google.javascript.rhino.Node var50 = null;
    com.google.javascript.jscomp.DiagnosticType var53 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var58 = null;
    com.google.javascript.jscomp.DiagnosticType var60 = com.google.javascript.jscomp.DiagnosticType.make("", var58, "hi!");
    java.lang.String[] var62 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var63 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var60, var62);
    com.google.javascript.jscomp.JSError var64 = com.google.javascript.jscomp.JSError.make("hi!", var50, var53, var62);
    com.google.javascript.jscomp.JSError var65 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var32, var37, var62);
    com.google.javascript.jscomp.JSError var66 = com.google.javascript.jscomp.JSError.make("", 100, 1, var23, var29, var62);
    com.google.javascript.jscomp.JSError var67 = com.google.javascript.jscomp.JSError.make("", 0, (-1), var16, var19, var62);
    com.google.javascript.jscomp.JSError var68 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column). hi!: hi! at (unknown source) line (unknown line) : (unknown column)", var9, var12, var62);
    boolean var69 = var7.equals((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);

  }

  public void test192() {}
//   public void test192() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test192"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var4 = null;
//     com.google.javascript.jscomp.DiagnosticType var10 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi!.  at hi!: hi! line (unknown line) : 10 at .  at (unknown source) line 1 : 10 line -12 : 100", "hi!. hi! at hi! line (unknown line) : (unknown column). hi!: hi! at hi!.  at hi!: hi! line (unknown line) : 10 line -8 : -64");
//     com.google.javascript.jscomp.CheckLevel var14 = null;
//     com.google.javascript.jscomp.DiagnosticType var17 = com.google.javascript.jscomp.DiagnosticType.error(".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : ", ".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3");
//     com.google.javascript.jscomp.DiagnosticType var23 = com.google.javascript.jscomp.DiagnosticType.error("", "hi!. hi! at hi! line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.CheckLevel var27 = null;
//     com.google.javascript.jscomp.DiagnosticType var30 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var34 = null;
//     com.google.javascript.jscomp.CheckLevel var36 = null;
//     com.google.javascript.jscomp.DiagnosticType var38 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var36, "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.CheckLevel var43 = null;
//     com.google.javascript.jscomp.DiagnosticType var45 = com.google.javascript.jscomp.DiagnosticType.make("", var43, "hi!");
//     java.lang.String[] var47 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var48 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var45, var47);
//     com.google.javascript.rhino.Node var50 = null;
//     com.google.javascript.jscomp.DiagnosticType var53 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var58 = null;
//     com.google.javascript.jscomp.DiagnosticType var60 = com.google.javascript.jscomp.DiagnosticType.make("", var58, "hi!");
//     java.lang.String[] var62 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var63 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var60, var62);
//     com.google.javascript.jscomp.JSError var64 = com.google.javascript.jscomp.JSError.make("hi!", var50, var53, var62);
//     com.google.javascript.jscomp.JSError var65 = com.google.javascript.jscomp.JSError.make(var45, var62);
//     com.google.javascript.jscomp.JSError var66 = com.google.javascript.jscomp.JSError.make("", 0, 1, var34, var38, var62);
//     com.google.javascript.jscomp.JSError var67 = com.google.javascript.jscomp.JSError.make("hi!.  at hi!: hi! line (unknown line) : 10", 1, (-1), var27, var30, var62);
//     com.google.javascript.jscomp.JSError var68 = com.google.javascript.jscomp.JSError.make(": ", 100, (-1), var23, var62);
//     com.google.javascript.jscomp.JSError var69 = com.google.javascript.jscomp.JSError.make("", 3, (-64), var14, var17, var62);
//     com.google.javascript.jscomp.JSError var70 = com.google.javascript.jscomp.JSError.make("hi!: : : hi!: ", 10, (-39), var10, var62);
//     com.google.javascript.jscomp.JSError var71 = com.google.javascript.jscomp.JSError.make(": hi!: hi!", 0, 0, var3, var4, var62);
// 
//   }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test193"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled(". : : hi! at . hi! at hi! line 0 : (unknown column) line (unknown line) : (unknown column)", ". hi! at (unknown source) line (unknown line) : (unknown column): hi!. hi! at (unknown source) line (unknown line) : (unknown column): ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test194"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column): : hi!: hi!: ", var1, ". hi! at (unknown source) line (unknown line) : (unknown column): .  at (unknown source) line -3 : (unknown column)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test195"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!.  at hi!: hi! line (unknown line) : 10", ": hi!");
    com.google.javascript.jscomp.CheckLevel var6 = null;
    com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at hi! line (unknown line) : (unknown column)", "hi!: hi!");
    com.google.javascript.jscomp.CheckLevel var14 = null;
    com.google.javascript.jscomp.DiagnosticType var16 = com.google.javascript.jscomp.DiagnosticType.make("", var14, "hi!");
    java.lang.String[] var18 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var19 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var16, var18);
    com.google.javascript.jscomp.JSError var20 = com.google.javascript.jscomp.JSError.make("hi!.  at hi!: hi! line (unknown line) : 10", (-8), (-64), var6, var9, var18);
    com.google.javascript.jscomp.JSError var21 = com.google.javascript.jscomp.JSError.make(var2, var18);
    com.google.javascript.jscomp.DiagnosticType var24 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!: hi!: ", "hi!. hi! at hi! line (unknown line) : (unknown column)");
    com.google.javascript.jscomp.CheckLevel var28 = null;
    com.google.javascript.jscomp.CheckLevel var30 = null;
    com.google.javascript.jscomp.DiagnosticType var32 = com.google.javascript.jscomp.DiagnosticType.make("", var30, "hi!");
    com.google.javascript.rhino.Node var34 = null;
    com.google.javascript.rhino.Node var36 = null;
    com.google.javascript.jscomp.DiagnosticType var39 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var44 = null;
    com.google.javascript.jscomp.DiagnosticType var46 = com.google.javascript.jscomp.DiagnosticType.make("", var44, "hi!");
    java.lang.String[] var48 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var49 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var46, var48);
    com.google.javascript.jscomp.JSError var50 = com.google.javascript.jscomp.JSError.make("hi!", var36, var39, var48);
    com.google.javascript.rhino.Node var52 = null;
    com.google.javascript.jscomp.DiagnosticType var55 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var60 = null;
    com.google.javascript.jscomp.DiagnosticType var62 = com.google.javascript.jscomp.DiagnosticType.make("", var60, "hi!");
    java.lang.String[] var64 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var65 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var62, var64);
    com.google.javascript.jscomp.JSError var66 = com.google.javascript.jscomp.JSError.make("hi!", var52, var55, var64);
    com.google.javascript.jscomp.JSError var67 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var34, var39, var64);
    com.google.javascript.jscomp.JSError var68 = com.google.javascript.jscomp.JSError.make("hi!", 0, (-1), var28, var32, var64);
    com.google.javascript.jscomp.JSError var69 = com.google.javascript.jscomp.JSError.make(var24, var64);
    com.google.javascript.jscomp.JSError var70 = com.google.javascript.jscomp.JSError.make(var2, var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test196"); }


    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.jscomp.DiagnosticType var4 = com.google.javascript.jscomp.DiagnosticType.error(".  at (unknown source) line 1 : 10", "hi!. hi! at (unknown source) line (unknown line) : (unknown column): ");
    com.google.javascript.jscomp.CheckLevel var6 = null;
    com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.make(": hi!", var6, ": hi!");
    int var9 = var4.compareTo(var8);
    com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.warning("hi!: : : hi!: ", "hi!");
    com.google.javascript.rhino.Node var14 = null;
    com.google.javascript.jscomp.CheckLevel var16 = null;
    com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.make("hi!: ", var16, "hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3");
    com.google.javascript.rhino.Node var23 = null;
    com.google.javascript.jscomp.DiagnosticType var26 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
    com.google.javascript.jscomp.CheckLevel var31 = null;
    com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.make("", var31, "hi!");
    java.lang.String[] var35 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var36 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var33, var35);
    com.google.javascript.jscomp.JSError var37 = com.google.javascript.jscomp.JSError.make("", var23, var26, var35);
    com.google.javascript.rhino.Node var39 = null;
    com.google.javascript.rhino.Node var41 = null;
    com.google.javascript.jscomp.DiagnosticType var44 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var49 = null;
    com.google.javascript.jscomp.DiagnosticType var51 = com.google.javascript.jscomp.DiagnosticType.make("", var49, "hi!");
    java.lang.String[] var53 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var54 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var51, var53);
    com.google.javascript.jscomp.JSError var55 = com.google.javascript.jscomp.JSError.make("hi!", var41, var44, var53);
    com.google.javascript.rhino.Node var57 = null;
    com.google.javascript.jscomp.DiagnosticType var60 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var65 = null;
    com.google.javascript.jscomp.DiagnosticType var67 = com.google.javascript.jscomp.DiagnosticType.make("", var65, "hi!");
    java.lang.String[] var69 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var70 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var67, var69);
    com.google.javascript.jscomp.JSError var71 = com.google.javascript.jscomp.JSError.make("hi!", var57, var60, var69);
    com.google.javascript.jscomp.JSError var72 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var39, var44, var69);
    com.google.javascript.rhino.Node var74 = null;
    com.google.javascript.jscomp.DiagnosticType var77 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var82 = null;
    com.google.javascript.jscomp.DiagnosticType var84 = com.google.javascript.jscomp.DiagnosticType.make("", var82, "hi!");
    java.lang.String[] var86 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var87 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var84, var86);
    com.google.javascript.jscomp.JSError var88 = com.google.javascript.jscomp.JSError.make("hi!", var74, var77, var86);
    com.google.javascript.jscomp.JSError var89 = com.google.javascript.jscomp.JSError.make(var44, var86);
    com.google.javascript.jscomp.JSError var90 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var26, var86);
    com.google.javascript.jscomp.JSError var91 = com.google.javascript.jscomp.JSError.make("", var14, var18, var86);
    com.google.javascript.jscomp.JSError var92 = com.google.javascript.jscomp.JSError.make(var12, var86);
    com.google.javascript.jscomp.JSError var93 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at (unknown source) line (unknown line) : (unknown column)", var1, var8, var86);
    com.google.javascript.jscomp.CheckLevel var95 = null;
    com.google.javascript.jscomp.DiagnosticType var97 = com.google.javascript.jscomp.DiagnosticType.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at (unknown source) line (unknown line) : (unknown column): hi!.  at hi!: hi! line (unknown line) : 10: : hi!", var95, "hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3");
    boolean var98 = var8.equals((java.lang.Object)var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-12));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var98 == false);

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test197"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error(".  at (unknown source) line (unknown line) : (unknown column): hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3", "hi!.  at hi!: hi! line (unknown line) : 10. hi!. hi! at hi! line (unknown line) : (unknown column) at (unknown source) line (unknown line) : (unknown column)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test198"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("hi!.  at hi!: hi! line (unknown line) : 10. .  at (unknown source) line 1 : 10 at hi!: hi!:  line (unknown line) : (unknown column)", var1, ": hi!: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test199"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning("hi!. hi!.  at hi!: hi! line (unknown line) : 10 at .  at (unknown source) line 1 : 10 line -12 : 100: .  at (unknown source) line 1 : 10", ". hi! at (unknown source) line (unknown line) : (unknown column). hi!. hi! at hi! line (unknown line) : (unknown column): : hi! at hi! line (unknown line) : (unknown column)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test200() {}
//   public void test200() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test200"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var10 = null;
//     com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.make("", var10, "hi!");
//     java.lang.String[] var14 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var15 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var12, var14);
//     com.google.javascript.rhino.Node var17 = null;
//     com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var25 = null;
//     com.google.javascript.jscomp.DiagnosticType var27 = com.google.javascript.jscomp.DiagnosticType.make("", var25, "hi!");
//     java.lang.String[] var29 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var30 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var27, var29);
//     com.google.javascript.jscomp.JSError var31 = com.google.javascript.jscomp.JSError.make("hi!", var17, var20, var29);
//     com.google.javascript.jscomp.JSError var32 = com.google.javascript.jscomp.JSError.make(var12, var29);
//     com.google.javascript.jscomp.JSError var33 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", (-1), (-3), var5, var29);
//     java.lang.String var34 = var33.toString();
//     java.lang.String var35 = var33.toString();
//     int var36 = var33.getCharno();
//     com.google.javascript.jscomp.DiagnosticType var37 = var33.getType();
//     int var38 = var33.getCharno();
//     java.lang.String var39 = var33.toString();
//     int var40 = var33.getCharno();
//     com.google.javascript.jscomp.CheckLevel var41 = null;
//     com.google.javascript.jscomp.MessageFormatter var42 = null;
//     java.lang.String var43 = var33.format(var41, var42);
// 
//   }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test201"); }


    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.jscomp.DiagnosticType var7 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var12 = null;
    com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.make("", var12, "hi!");
    java.lang.String[] var16 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var17 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var14, var16);
    com.google.javascript.rhino.Node var19 = null;
    com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var27 = null;
    com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.make("", var27, "hi!");
    java.lang.String[] var31 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var32 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var29, var31);
    com.google.javascript.jscomp.JSError var33 = com.google.javascript.jscomp.JSError.make("hi!", var19, var22, var31);
    com.google.javascript.jscomp.JSError var34 = com.google.javascript.jscomp.JSError.make(var14, var31);
    com.google.javascript.jscomp.JSError var35 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", (-1), (-3), var7, var31);
    com.google.javascript.jscomp.CheckLevel var39 = null;
    com.google.javascript.jscomp.DiagnosticType var42 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.CheckLevel var46 = null;
    com.google.javascript.jscomp.DiagnosticType var49 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var52 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var53 = var49.compareTo(var52);
    com.google.javascript.rhino.Node var55 = null;
    com.google.javascript.rhino.Node var57 = null;
    com.google.javascript.jscomp.DiagnosticType var60 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var65 = null;
    com.google.javascript.jscomp.DiagnosticType var67 = com.google.javascript.jscomp.DiagnosticType.make("", var65, "hi!");
    java.lang.String[] var69 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var70 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var67, var69);
    com.google.javascript.jscomp.JSError var71 = com.google.javascript.jscomp.JSError.make("hi!", var57, var60, var69);
    com.google.javascript.rhino.Node var73 = null;
    com.google.javascript.jscomp.DiagnosticType var76 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var81 = null;
    com.google.javascript.jscomp.DiagnosticType var83 = com.google.javascript.jscomp.DiagnosticType.make("", var81, "hi!");
    java.lang.String[] var85 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var86 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var83, var85);
    com.google.javascript.jscomp.JSError var87 = com.google.javascript.jscomp.JSError.make("hi!", var73, var76, var85);
    com.google.javascript.jscomp.JSError var88 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var55, var60, var85);
    com.google.javascript.jscomp.JSError var89 = com.google.javascript.jscomp.JSError.make("", 100, 1, var46, var52, var85);
    com.google.javascript.jscomp.JSError var90 = com.google.javascript.jscomp.JSError.make(": hi!", 0, 10, var39, var42, var85);
    com.google.javascript.jscomp.JSError var91 = com.google.javascript.jscomp.JSError.make(": hi!", var1, var7, var85);
    java.lang.String var92 = var7.toString();
    java.lang.String var93 = var7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var92 + "' != '" + "hi!: hi!: hi!"+ "'", var92.equals("hi!: hi!: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var93 + "' != '" + "hi!: hi!: hi!"+ "'", var93.equals("hi!: hi!: hi!"));

  }

  public void test202() {}
//   public void test202() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test202"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "hi!. hi! at hi! line (unknown line) : (unknown column). hi!: hi! at hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3 line (unknown line) : (unknown column)");
// 
//   }

  public void test203() {}
//   public void test203() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test203"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.make("hi!: ", var3, "hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3");
//     com.google.javascript.rhino.Node var10 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     com.google.javascript.jscomp.CheckLevel var18 = null;
//     com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.make("", var18, "hi!");
//     java.lang.String[] var22 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var23 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var20, var22);
//     com.google.javascript.jscomp.JSError var24 = com.google.javascript.jscomp.JSError.make("", var10, var13, var22);
//     com.google.javascript.rhino.Node var26 = null;
//     com.google.javascript.rhino.Node var28 = null;
//     com.google.javascript.jscomp.DiagnosticType var31 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var36 = null;
//     com.google.javascript.jscomp.DiagnosticType var38 = com.google.javascript.jscomp.DiagnosticType.make("", var36, "hi!");
//     java.lang.String[] var40 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var41 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var38, var40);
//     com.google.javascript.jscomp.JSError var42 = com.google.javascript.jscomp.JSError.make("hi!", var28, var31, var40);
//     com.google.javascript.rhino.Node var44 = null;
//     com.google.javascript.jscomp.DiagnosticType var47 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var52 = null;
//     com.google.javascript.jscomp.DiagnosticType var54 = com.google.javascript.jscomp.DiagnosticType.make("", var52, "hi!");
//     java.lang.String[] var56 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var57 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var54, var56);
//     com.google.javascript.jscomp.JSError var58 = com.google.javascript.jscomp.JSError.make("hi!", var44, var47, var56);
//     com.google.javascript.jscomp.JSError var59 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var26, var31, var56);
//     com.google.javascript.rhino.Node var61 = null;
//     com.google.javascript.jscomp.DiagnosticType var64 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var69 = null;
//     com.google.javascript.jscomp.DiagnosticType var71 = com.google.javascript.jscomp.DiagnosticType.make("", var69, "hi!");
//     java.lang.String[] var73 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var74 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var71, var73);
//     com.google.javascript.jscomp.JSError var75 = com.google.javascript.jscomp.JSError.make("hi!", var61, var64, var73);
//     com.google.javascript.jscomp.JSError var76 = com.google.javascript.jscomp.JSError.make(var31, var73);
//     com.google.javascript.jscomp.JSError var77 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var13, var73);
//     com.google.javascript.jscomp.JSError var78 = com.google.javascript.jscomp.JSError.make("", var1, var5, var73);
//     java.lang.String var79 = var78.toString();
//     int var80 = var78.getCharno();
//     com.google.javascript.jscomp.CheckLevel var81 = null;
//     com.google.javascript.jscomp.MessageFormatter var82 = null;
//     java.lang.String var83 = var78.format(var81, var82);
// 
//   }

  public void test204() {}
//   public void test204() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test204"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.DiagnosticType var2 = null;
//     com.google.javascript.jscomp.CheckLevel var6 = null;
//     com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at hi! line (unknown line) : (unknown column)", "");
//     com.google.javascript.jscomp.CheckLevel var14 = null;
//     com.google.javascript.jscomp.DiagnosticType var16 = com.google.javascript.jscomp.DiagnosticType.make("", var14, "hi!");
//     java.lang.String[] var18 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var19 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var16, var18);
//     com.google.javascript.jscomp.JSError var20 = com.google.javascript.jscomp.JSError.make(": ", 100, 100, var6, var9, var18);
//     com.google.javascript.jscomp.JSError var21 = com.google.javascript.jscomp.JSError.make(". hi! at (unknown source) line (unknown line) : (unknown column): hi!. hi! at (unknown source) line (unknown line) : (unknown column): ", var1, var2, var18);
// 
//   }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test205"); }


    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.rhino.Node var3 = null;
    com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var11 = null;
    com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("", var11, "hi!");
    java.lang.String[] var15 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var13, var15);
    com.google.javascript.jscomp.JSError var17 = com.google.javascript.jscomp.JSError.make("hi!", var3, var6, var15);
    com.google.javascript.jscomp.DiagnosticType var18 = var17.getType();
    int var19 = var17.getCharno();
    boolean var21 = var17.equals((java.lang.Object)(short)1);
    java.lang.String var22 = var17.toString();
    com.google.javascript.jscomp.DiagnosticType var25 = com.google.javascript.jscomp.DiagnosticType.warning("hi!", "");
    boolean var26 = var17.equals((java.lang.Object)var25);
    com.google.javascript.jscomp.CheckLevel var30 = null;
    com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var36 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var37 = var33.compareTo(var36);
    com.google.javascript.jscomp.DiagnosticType var40 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var43 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var44 = var40.compareTo(var43);
    com.google.javascript.jscomp.DiagnosticType var47 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var50 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var51 = var47.compareTo(var50);
    int var52 = var40.compareTo(var47);
    boolean var53 = var33.equals((java.lang.Object)var47);
    com.google.javascript.rhino.Node var55 = null;
    com.google.javascript.jscomp.DiagnosticType var58 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
    com.google.javascript.jscomp.CheckLevel var63 = null;
    com.google.javascript.jscomp.DiagnosticType var65 = com.google.javascript.jscomp.DiagnosticType.make("", var63, "hi!");
    java.lang.String[] var67 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var68 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var65, var67);
    com.google.javascript.jscomp.JSError var69 = com.google.javascript.jscomp.JSError.make("", var55, var58, var67);
    com.google.javascript.jscomp.JSError var70 = com.google.javascript.jscomp.JSError.make("", 0, 1, var30, var33, var67);
    com.google.javascript.jscomp.JSError var71 = com.google.javascript.jscomp.JSError.make("", var1, var25, var67);
    com.google.javascript.jscomp.DiagnosticType var72 = var71.getType();
    int var73 = var71.getCharno();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!. hi! at hi! line (unknown line) : (unknown column)"+ "'", var22.equals("hi!. hi! at hi! line (unknown line) : (unknown column)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == (-1));

  }

  public void test206() {}
//   public void test206() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test206"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.error(".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : ", "hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3");
//     com.google.javascript.jscomp.CheckLevel var9 = null;
//     com.google.javascript.jscomp.DiagnosticType var15 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var19 = var15.compareTo(var18);
//     com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var25 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var26 = var22.compareTo(var25);
//     int var27 = var15.compareTo(var22);
//     java.lang.String[] var28 = null;
//     com.google.javascript.jscomp.JSError var29 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", 10, 1, var15, var28);
//     com.google.javascript.jscomp.DiagnosticType var30 = var29.getType();
//     com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!: hi!: ", "hi!. hi! at hi! line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.CheckLevel var37 = null;
//     com.google.javascript.jscomp.CheckLevel var39 = null;
//     com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.make("", var39, "hi!");
//     com.google.javascript.rhino.Node var43 = null;
//     com.google.javascript.rhino.Node var45 = null;
//     com.google.javascript.jscomp.DiagnosticType var48 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var53 = null;
//     com.google.javascript.jscomp.DiagnosticType var55 = com.google.javascript.jscomp.DiagnosticType.make("", var53, "hi!");
//     java.lang.String[] var57 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var58 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var55, var57);
//     com.google.javascript.jscomp.JSError var59 = com.google.javascript.jscomp.JSError.make("hi!", var45, var48, var57);
//     com.google.javascript.rhino.Node var61 = null;
//     com.google.javascript.jscomp.DiagnosticType var64 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var69 = null;
//     com.google.javascript.jscomp.DiagnosticType var71 = com.google.javascript.jscomp.DiagnosticType.make("", var69, "hi!");
//     java.lang.String[] var73 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var74 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var71, var73);
//     com.google.javascript.jscomp.JSError var75 = com.google.javascript.jscomp.JSError.make("hi!", var61, var64, var73);
//     com.google.javascript.jscomp.JSError var76 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var43, var48, var73);
//     com.google.javascript.jscomp.JSError var77 = com.google.javascript.jscomp.JSError.make("hi!", 0, (-1), var37, var41, var73);
//     com.google.javascript.jscomp.JSError var78 = com.google.javascript.jscomp.JSError.make(var33, var73);
//     com.google.javascript.jscomp.JSError var79 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at hi!.  at hi!: hi! line (unknown line) : 10 line 54 : -3", (-67), 0, var9, var30, var73);
//     com.google.javascript.jscomp.JSError var80 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column). hi!: hi! at (unknown source) line (unknown line) : (unknown column)", 1, 12, var5, var73);
//     com.google.javascript.jscomp.CheckLevel var81 = null;
//     com.google.javascript.jscomp.MessageFormatter var82 = null;
//     java.lang.String var83 = var80.format(var81, var82);
// 
//   }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test207"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled("", ". hi! at (unknown source) line (unknown line) : (unknown column)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test208"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning("hi!. hi! at hi! line (unknown line) : (unknown column)", ".  at (unknown source) line 100 : 1");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test209"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error("hi!", ". hi! at (unknown source) line (unknown line) : (unknown column). hi!. hi! at hi! line (unknown line) : (unknown column): : hi! at hi! line (unknown line) : (unknown column)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test210"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make(". : : hi! at . hi! at hi! line 0 : (unknown column) line (unknown line) : (unknown column)", var1, "hi!.  at hi!: hi! line (unknown line) : 10: : hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test211"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning("hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at hi!.  at hi!: hi! line (unknown line) : 10 line 54 : -3. . hi! at hi! line 1 : (unknown column) at .  at (unknown source) line -3 : (unknown column) line 51 : -3", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test212"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make(": : . hi! at hi! line 1 : (unknown column)", var1, "hi!: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test213"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled(". hi! at (unknown source) line (unknown line) : (unknown column). hi!. hi! at hi! line (unknown line) : (unknown column): : hi! at hi! line (unknown line) : (unknown column)", ". hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at (unknown source) line (unknown line) : (unknown column) at (unknown source) line (unknown line) : (unknown column)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test214() {}
//   public void test214() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test214"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var10 = var6.compareTo(var9);
//     com.google.javascript.rhino.Node var12 = null;
//     com.google.javascript.rhino.Node var14 = null;
//     com.google.javascript.jscomp.DiagnosticType var17 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var22 = null;
//     com.google.javascript.jscomp.DiagnosticType var24 = com.google.javascript.jscomp.DiagnosticType.make("", var22, "hi!");
//     java.lang.String[] var26 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var27 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var24, var26);
//     com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make("hi!", var14, var17, var26);
//     com.google.javascript.rhino.Node var30 = null;
//     com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var38 = null;
//     com.google.javascript.jscomp.DiagnosticType var40 = com.google.javascript.jscomp.DiagnosticType.make("", var38, "hi!");
//     java.lang.String[] var42 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var43 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var40, var42);
//     com.google.javascript.jscomp.JSError var44 = com.google.javascript.jscomp.JSError.make("hi!", var30, var33, var42);
//     com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var12, var17, var42);
//     com.google.javascript.jscomp.JSError var46 = com.google.javascript.jscomp.JSError.make("", 100, 1, var3, var9, var42);
//     java.lang.String var47 = var46.toString();
//     com.google.javascript.jscomp.DiagnosticType var48 = var46.getType();
//     int var49 = var46.getCharno();
//     com.google.javascript.jscomp.CheckLevel var50 = null;
//     com.google.javascript.jscomp.MessageFormatter var51 = null;
//     java.lang.String var52 = var46.format(var50, var51);
// 
//   }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test215"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "");
    com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var9 = null;
    com.google.javascript.jscomp.CheckLevel var11 = null;
    com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("", var11, "hi!");
    com.google.javascript.rhino.Node var15 = null;
    com.google.javascript.rhino.Node var17 = null;
    com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var25 = null;
    com.google.javascript.jscomp.DiagnosticType var27 = com.google.javascript.jscomp.DiagnosticType.make("", var25, "hi!");
    java.lang.String[] var29 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var30 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var27, var29);
    com.google.javascript.jscomp.JSError var31 = com.google.javascript.jscomp.JSError.make("hi!", var17, var20, var29);
    com.google.javascript.rhino.Node var33 = null;
    com.google.javascript.jscomp.DiagnosticType var36 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var41 = null;
    com.google.javascript.jscomp.DiagnosticType var43 = com.google.javascript.jscomp.DiagnosticType.make("", var41, "hi!");
    java.lang.String[] var45 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var46 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var43, var45);
    com.google.javascript.jscomp.JSError var47 = com.google.javascript.jscomp.JSError.make("hi!", var33, var36, var45);
    com.google.javascript.jscomp.JSError var48 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var15, var20, var45);
    com.google.javascript.jscomp.JSError var49 = com.google.javascript.jscomp.JSError.make("hi!", 0, (-1), var9, var13, var45);
    com.google.javascript.jscomp.JSError var50 = com.google.javascript.jscomp.JSError.make(var5, var45);
    com.google.javascript.jscomp.JSError var51 = com.google.javascript.jscomp.JSError.make(var2, var45);
    java.lang.String var52 = var51.toString();
    int var53 = var51.getCharno();
    com.google.javascript.jscomp.DiagnosticType var56 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line -67 : 0", ". hi! at (unknown source) line 0 : 0");
    boolean var57 = var51.equals((java.lang.Object)var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at (unknown source) line (unknown line) : (unknown column)"+ "'", var52.equals("hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at (unknown source) line (unknown line) : (unknown column)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test216"); }


    com.google.javascript.jscomp.CheckLevel var3 = null;
    com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at hi! line (unknown line) : (unknown column)", "");
    com.google.javascript.jscomp.CheckLevel var11 = null;
    com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("", var11, "hi!");
    java.lang.String[] var15 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var13, var15);
    com.google.javascript.jscomp.JSError var17 = com.google.javascript.jscomp.JSError.make(": ", 100, 100, var3, var6, var15);
    java.lang.Object var18 = null;
    boolean var19 = var17.equals(var18);
    int var20 = var17.getCharno();
    java.lang.String var21 = var17.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!. hi! at hi! line (unknown line) : (unknown column).  at :  line 100 : 100"+ "'", var21.equals("hi!. hi! at hi! line (unknown line) : (unknown column).  at :  line 100 : 100"));

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test217"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("", var1, ".  at (unknown source) line (unknown line) : (unknown column): hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3");
    java.lang.String[] var4 = null;
    com.google.javascript.jscomp.JSError var5 = com.google.javascript.jscomp.JSError.make(var3, var4);
    com.google.javascript.jscomp.DiagnosticType var6 = var5.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test218"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var1, "hi!: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test219() {}
//   public void test219() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test219"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!: ", "hi!: hi!");
//     java.lang.String[] var6 = null;
//     com.google.javascript.jscomp.JSError var7 = com.google.javascript.jscomp.JSError.make("hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)", 0, 2, var5, var6);
//     com.google.javascript.jscomp.CheckLevel var8 = null;
//     com.google.javascript.jscomp.MessageFormatter var9 = null;
//     java.lang.String var10 = var7.format(var8, var9);
// 
//   }

  public void test220() {}
//   public void test220() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test220"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.jscomp.CheckLevel var9 = null;
//     com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column): ", var9, "hi!: hi!: ");
//     java.lang.String[] var12 = null;
//     com.google.javascript.jscomp.JSError var13 = com.google.javascript.jscomp.JSError.make(".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3", (-1), (-39), var7, var11, var12);
//     com.google.javascript.jscomp.DiagnosticType var14 = var13.getType();
//     com.google.javascript.rhino.Node var16 = null;
//     com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var24 = null;
//     com.google.javascript.jscomp.DiagnosticType var26 = com.google.javascript.jscomp.DiagnosticType.make("", var24, "hi!");
//     java.lang.String[] var28 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var29 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var26, var28);
//     com.google.javascript.jscomp.JSError var30 = com.google.javascript.jscomp.JSError.make("hi!", var16, var19, var28);
//     java.lang.String var31 = var19.toString();
//     com.google.javascript.jscomp.CheckLevel var38 = null;
//     com.google.javascript.jscomp.CheckLevel var40 = null;
//     com.google.javascript.jscomp.DiagnosticType var42 = com.google.javascript.jscomp.DiagnosticType.make("", var40, "hi!");
//     com.google.javascript.rhino.Node var44 = null;
//     com.google.javascript.rhino.Node var46 = null;
//     com.google.javascript.jscomp.DiagnosticType var49 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var54 = null;
//     com.google.javascript.jscomp.DiagnosticType var56 = com.google.javascript.jscomp.DiagnosticType.make("", var54, "hi!");
//     java.lang.String[] var58 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var59 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var56, var58);
//     com.google.javascript.jscomp.JSError var60 = com.google.javascript.jscomp.JSError.make("hi!", var46, var49, var58);
//     com.google.javascript.rhino.Node var62 = null;
//     com.google.javascript.jscomp.DiagnosticType var65 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var70 = null;
//     com.google.javascript.jscomp.DiagnosticType var72 = com.google.javascript.jscomp.DiagnosticType.make("", var70, "hi!");
//     java.lang.String[] var74 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var75 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var72, var74);
//     com.google.javascript.jscomp.JSError var76 = com.google.javascript.jscomp.JSError.make("hi!", var62, var65, var74);
//     com.google.javascript.jscomp.JSError var77 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var44, var49, var74);
//     com.google.javascript.jscomp.JSError var78 = com.google.javascript.jscomp.JSError.make("hi!", 0, (-1), var38, var42, var74);
//     com.google.javascript.jscomp.CheckLevel var83 = null;
//     com.google.javascript.jscomp.DiagnosticType var85 = com.google.javascript.jscomp.DiagnosticType.make("", var83, "hi!");
//     java.lang.String[] var87 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var88 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var85, var87);
//     com.google.javascript.jscomp.JSError var89 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column): : hi!", 3, 3, var42, var87);
//     com.google.javascript.jscomp.JSError var90 = com.google.javascript.jscomp.JSError.make(var19, var87);
//     com.google.javascript.jscomp.JSError var91 = com.google.javascript.jscomp.JSError.make(": hi!. hi! at hi! line (unknown line) : (unknown column)", (-38), 2, var3, var14, var87);
//     com.google.javascript.jscomp.DiagnosticType var92 = null;
//     int var93 = var14.compareTo(var92);
// 
//   }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test221"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf("hi!: : : hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test222"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("", var1, ".  at hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3 line 0 : 1");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test223() {}
//   public void test223() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test223"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.DiagnosticType var4 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at hi! line (unknown line) : (unknown column)", "hi!: hi!");
//     com.google.javascript.jscomp.DiagnosticType var7 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var10 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var11 = var7.compareTo(var10);
//     com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var17 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var18 = var14.compareTo(var17);
//     int var19 = var7.compareTo(var14);
//     int var20 = var4.compareTo(var14);
//     com.google.javascript.jscomp.DiagnosticType var26 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!.  at hi!: hi! line (unknown line) : 10", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.CheckLevel var31 = null;
//     com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.make("", var31, "hi!");
//     com.google.javascript.rhino.Node var35 = null;
//     com.google.javascript.rhino.Node var37 = null;
//     com.google.javascript.jscomp.DiagnosticType var40 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var45 = null;
//     com.google.javascript.jscomp.DiagnosticType var47 = com.google.javascript.jscomp.DiagnosticType.make("", var45, "hi!");
//     java.lang.String[] var49 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var50 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var47, var49);
//     com.google.javascript.jscomp.JSError var51 = com.google.javascript.jscomp.JSError.make("hi!", var37, var40, var49);
//     com.google.javascript.rhino.Node var53 = null;
//     com.google.javascript.jscomp.DiagnosticType var56 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var61 = null;
//     com.google.javascript.jscomp.DiagnosticType var63 = com.google.javascript.jscomp.DiagnosticType.make("", var61, "hi!");
//     java.lang.String[] var65 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var66 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var63, var65);
//     com.google.javascript.jscomp.JSError var67 = com.google.javascript.jscomp.JSError.make("hi!", var53, var56, var65);
//     com.google.javascript.jscomp.JSError var68 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var35, var40, var65);
//     com.google.javascript.rhino.Node var70 = null;
//     com.google.javascript.jscomp.DiagnosticType var73 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var78 = null;
//     com.google.javascript.jscomp.DiagnosticType var80 = com.google.javascript.jscomp.DiagnosticType.make("", var78, "hi!");
//     java.lang.String[] var82 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var83 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var80, var82);
//     com.google.javascript.jscomp.JSError var84 = com.google.javascript.jscomp.JSError.make("hi!", var70, var73, var82);
//     com.google.javascript.jscomp.JSError var85 = com.google.javascript.jscomp.JSError.make(var40, var82);
//     com.google.javascript.jscomp.JSError var86 = com.google.javascript.jscomp.JSError.make("", 0, 0, var33, var82);
//     com.google.javascript.jscomp.JSError var87 = com.google.javascript.jscomp.JSError.make("", (-64), (-8), var26, var82);
//     com.google.javascript.jscomp.JSError var88 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var1, var4, var82);
//     com.google.javascript.jscomp.CheckLevel var89 = null;
//     com.google.javascript.jscomp.MessageFormatter var90 = null;
//     java.lang.String var91 = var88.format(var89, var90);
// 
//   }

  public void test224() {}
//   public void test224() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test224"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.jscomp.CheckLevel var5 = null;
//     com.google.javascript.jscomp.DiagnosticType var7 = com.google.javascript.jscomp.DiagnosticType.make(".  at (unknown source) line -3 : (unknown column)", var5, "hi!: hi!: hi!");
//     com.google.javascript.jscomp.CheckLevel var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!.  at hi!: hi! line (unknown line) : 10");
//     com.google.javascript.rhino.Node var16 = null;
//     com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var24 = null;
//     com.google.javascript.jscomp.DiagnosticType var26 = com.google.javascript.jscomp.DiagnosticType.make("", var24, "hi!");
//     java.lang.String[] var28 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var29 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var26, var28);
//     com.google.javascript.jscomp.JSError var30 = com.google.javascript.jscomp.JSError.make("hi!", var16, var19, var28);
//     com.google.javascript.jscomp.DiagnosticType var31 = var30.getType();
//     com.google.javascript.rhino.Node var33 = null;
//     com.google.javascript.jscomp.DiagnosticType var36 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var41 = null;
//     com.google.javascript.jscomp.DiagnosticType var43 = com.google.javascript.jscomp.DiagnosticType.make("", var41, "hi!");
//     java.lang.String[] var45 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var46 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var43, var45);
//     com.google.javascript.jscomp.JSError var47 = com.google.javascript.jscomp.JSError.make("hi!", var33, var36, var45);
//     com.google.javascript.jscomp.JSError var48 = com.google.javascript.jscomp.JSError.make(var31, var45);
//     com.google.javascript.jscomp.JSError var49 = com.google.javascript.jscomp.JSError.make(".  at (unknown source) line 1 : 10", (-12), 100, var11, var14, var45);
//     com.google.javascript.rhino.Node var51 = null;
//     com.google.javascript.jscomp.DiagnosticType var54 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.rhino.Node var56 = null;
//     com.google.javascript.jscomp.DiagnosticType var59 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var64 = null;
//     com.google.javascript.jscomp.DiagnosticType var66 = com.google.javascript.jscomp.DiagnosticType.make("", var64, "hi!");
//     java.lang.String[] var68 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var69 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var66, var68);
//     com.google.javascript.jscomp.JSError var70 = com.google.javascript.jscomp.JSError.make("hi!", var56, var59, var68);
//     com.google.javascript.jscomp.JSError var71 = com.google.javascript.jscomp.JSError.make("hi!: hi!: ", var51, var54, var68);
//     com.google.javascript.jscomp.JSError var72 = com.google.javascript.jscomp.JSError.make(var14, var68);
//     com.google.javascript.jscomp.JSError var73 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3", 100, (-39), var3, var7, var68);
//     java.lang.String var74 = var73.toString();
//     com.google.javascript.jscomp.CheckLevel var75 = null;
//     com.google.javascript.jscomp.MessageFormatter var76 = null;
//     java.lang.String var77 = var73.format(var75, var76);
// 
//   }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test225"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf("hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : hi!: . hi! at (unknown source) line (unknown line) : (unknown column): hi!. hi! at (unknown source) line (unknown line) : (unknown column): ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test226() {}
//   public void test226() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test226"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var0 = null;
//     com.google.javascript.jscomp.CheckLevel var4 = null;
//     com.google.javascript.jscomp.DiagnosticType var7 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var10 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var11 = var7.compareTo(var10);
//     com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var17 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var18 = var14.compareTo(var17);
//     com.google.javascript.jscomp.DiagnosticType var21 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var24 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var25 = var21.compareTo(var24);
//     int var26 = var14.compareTo(var21);
//     boolean var27 = var7.equals((java.lang.Object)var21);
//     com.google.javascript.rhino.Node var29 = null;
//     com.google.javascript.jscomp.DiagnosticType var32 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     com.google.javascript.jscomp.CheckLevel var37 = null;
//     com.google.javascript.jscomp.DiagnosticType var39 = com.google.javascript.jscomp.DiagnosticType.make("", var37, "hi!");
//     java.lang.String[] var41 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var42 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var39, var41);
//     com.google.javascript.jscomp.JSError var43 = com.google.javascript.jscomp.JSError.make("", var29, var32, var41);
//     com.google.javascript.jscomp.JSError var44 = com.google.javascript.jscomp.JSError.make("", 0, 1, var4, var7, var41);
//     com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make(var0, var41);
// 
//   }

  public void test227() {}
//   public void test227() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test227"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.rhino.Node var5 = null;
//     com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     com.google.javascript.jscomp.CheckLevel var13 = null;
//     com.google.javascript.jscomp.DiagnosticType var15 = com.google.javascript.jscomp.DiagnosticType.make("", var13, "hi!");
//     java.lang.String[] var17 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var18 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var15, var17);
//     com.google.javascript.jscomp.JSError var19 = com.google.javascript.jscomp.JSError.make("", var5, var8, var17);
//     java.lang.String var20 = var8.toString();
//     com.google.javascript.jscomp.DiagnosticType var26 = com.google.javascript.jscomp.DiagnosticType.warning(": : hi!. hi! at hi! line (unknown line) : (unknown column)", "");
//     com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.rhino.Node var31 = null;
//     com.google.javascript.jscomp.DiagnosticType var34 = com.google.javascript.jscomp.DiagnosticType.warning("hi!", "");
//     com.google.javascript.rhino.Node var36 = null;
//     com.google.javascript.jscomp.DiagnosticType var39 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     com.google.javascript.jscomp.CheckLevel var44 = null;
//     com.google.javascript.jscomp.DiagnosticType var46 = com.google.javascript.jscomp.DiagnosticType.make("", var44, "hi!");
//     java.lang.String[] var48 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var49 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var46, var48);
//     com.google.javascript.jscomp.JSError var50 = com.google.javascript.jscomp.JSError.make("", var36, var39, var48);
//     com.google.javascript.jscomp.JSError var51 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var31, var34, var48);
//     com.google.javascript.jscomp.JSError var52 = com.google.javascript.jscomp.JSError.make(var29, var48);
//     com.google.javascript.jscomp.JSError var53 = com.google.javascript.jscomp.JSError.make(".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : : hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3", (-67), 54, var26, var48);
//     com.google.javascript.jscomp.JSError var54 = com.google.javascript.jscomp.JSError.make("", 49, 0, var3, var8, var48);
//     com.google.javascript.jscomp.CheckLevel var55 = null;
//     com.google.javascript.jscomp.MessageFormatter var56 = null;
//     java.lang.String var57 = var54.format(var55, var56);
// 
//   }

  public void test228() {}
//   public void test228() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test228"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at hi!.  at hi!: hi! line (unknown line) : 10 line 54 : -3", ". hi! at hi! line 1 : (unknown column)");
//     com.google.javascript.jscomp.CheckLevel var9 = null;
//     com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.CheckLevel var16 = null;
//     com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var23 = var19.compareTo(var22);
//     com.google.javascript.rhino.Node var25 = null;
//     com.google.javascript.rhino.Node var27 = null;
//     com.google.javascript.jscomp.DiagnosticType var30 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var35 = null;
//     com.google.javascript.jscomp.DiagnosticType var37 = com.google.javascript.jscomp.DiagnosticType.make("", var35, "hi!");
//     java.lang.String[] var39 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var40 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var37, var39);
//     com.google.javascript.jscomp.JSError var41 = com.google.javascript.jscomp.JSError.make("hi!", var27, var30, var39);
//     com.google.javascript.rhino.Node var43 = null;
//     com.google.javascript.jscomp.DiagnosticType var46 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var51 = null;
//     com.google.javascript.jscomp.DiagnosticType var53 = com.google.javascript.jscomp.DiagnosticType.make("", var51, "hi!");
//     java.lang.String[] var55 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var56 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var53, var55);
//     com.google.javascript.jscomp.JSError var57 = com.google.javascript.jscomp.JSError.make("hi!", var43, var46, var55);
//     com.google.javascript.jscomp.JSError var58 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var25, var30, var55);
//     com.google.javascript.jscomp.JSError var59 = com.google.javascript.jscomp.JSError.make("", 100, 1, var16, var22, var55);
//     com.google.javascript.jscomp.JSError var60 = com.google.javascript.jscomp.JSError.make(": hi!", 0, 10, var9, var12, var55);
//     com.google.javascript.jscomp.JSError var61 = com.google.javascript.jscomp.JSError.make(".  at (unknown source) line -3 : (unknown column)", 51, (-3), var5, var55);
//     java.lang.String var62 = var61.toString();
//     com.google.javascript.jscomp.CheckLevel var63 = null;
//     com.google.javascript.jscomp.MessageFormatter var64 = null;
//     java.lang.String var65 = var61.format(var63, var64);
// 
//   }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test229"); }


    com.google.javascript.jscomp.CheckLevel var4 = null;
    com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.make("", var4, "hi!");
    com.google.javascript.rhino.Node var8 = null;
    com.google.javascript.rhino.Node var10 = null;
    com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var18 = null;
    com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.make("", var18, "hi!");
    java.lang.String[] var22 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var23 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var20, var22);
    com.google.javascript.jscomp.JSError var24 = com.google.javascript.jscomp.JSError.make("hi!", var10, var13, var22);
    com.google.javascript.rhino.Node var26 = null;
    com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var34 = null;
    com.google.javascript.jscomp.DiagnosticType var36 = com.google.javascript.jscomp.DiagnosticType.make("", var34, "hi!");
    java.lang.String[] var38 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var39 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var36, var38);
    com.google.javascript.jscomp.JSError var40 = com.google.javascript.jscomp.JSError.make("hi!", var26, var29, var38);
    com.google.javascript.jscomp.JSError var41 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var8, var13, var38);
    com.google.javascript.rhino.Node var43 = null;
    com.google.javascript.jscomp.DiagnosticType var46 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var51 = null;
    com.google.javascript.jscomp.DiagnosticType var53 = com.google.javascript.jscomp.DiagnosticType.make("", var51, "hi!");
    java.lang.String[] var55 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var56 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var53, var55);
    com.google.javascript.jscomp.JSError var57 = com.google.javascript.jscomp.JSError.make("hi!", var43, var46, var55);
    com.google.javascript.jscomp.JSError var58 = com.google.javascript.jscomp.JSError.make(var13, var55);
    com.google.javascript.jscomp.JSError var59 = com.google.javascript.jscomp.JSError.make("", 0, 0, var6, var55);
    boolean var61 = var59.equals((java.lang.Object)10);
    com.google.javascript.jscomp.DiagnosticType var62 = var59.getType();
    com.google.javascript.jscomp.CheckLevel var64 = null;
    com.google.javascript.jscomp.DiagnosticType var66 = com.google.javascript.jscomp.DiagnosticType.make("", var64, ": hi!");
    boolean var67 = var59.equals((java.lang.Object)": hi!");
    com.google.javascript.jscomp.CheckLevel var72 = null;
    com.google.javascript.jscomp.DiagnosticType var74 = com.google.javascript.jscomp.DiagnosticType.make("", var72, "hi!");
    java.lang.String[] var76 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var77 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var74, var76);
    boolean var79 = var77.equals((java.lang.Object)(byte)(-1));
    com.google.javascript.jscomp.DiagnosticType var80 = var77.getType();
    boolean var81 = var59.equals((java.lang.Object)var77);
    java.lang.String var82 = var77.toString();
    java.lang.String var83 = var77.toString();
    int var84 = var77.getCharno();
    java.lang.String var85 = var77.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + ". hi! at hi! line 1 : (unknown column)"+ "'", var82.equals(". hi! at hi! line 1 : (unknown column)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var83 + "' != '" + ". hi! at hi! line 1 : (unknown column)"+ "'", var83.equals(". hi! at hi! line 1 : (unknown column)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + ". hi! at hi! line 1 : (unknown column)"+ "'", var85.equals(". hi! at hi! line 1 : (unknown column)"));

  }

  public void test230() {}
//   public void test230() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test230"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.rhino.Node var5 = null;
//     com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var13 = null;
//     com.google.javascript.jscomp.DiagnosticType var15 = com.google.javascript.jscomp.DiagnosticType.make("", var13, "hi!");
//     java.lang.String[] var17 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var18 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var15, var17);
//     com.google.javascript.jscomp.JSError var19 = com.google.javascript.jscomp.JSError.make("hi!", var5, var8, var17);
//     com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var23 = var8.compareTo(var22);
//     java.lang.String[] var25 = new java.lang.String[] { "hi!: hi!: "};
//     com.google.javascript.jscomp.JSError var26 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", 46, (-3), var3, var22, var25);
//     com.google.javascript.jscomp.DiagnosticType var27 = var26.getType();
//     int var28 = var26.getCharno();
//     com.google.javascript.jscomp.CheckLevel var29 = null;
//     com.google.javascript.jscomp.MessageFormatter var30 = null;
//     java.lang.String var31 = var26.format(var29, var30);
// 
//   }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test231"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf("hi!. hi! at hi!: hi! line 0 : -3: : : hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test232"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at (unknown source) line (unknown line) : (unknown column): ", "hi!. hi! at (unknown source) line (unknown line) : (unknown column): . hi!: hi!:  at : hi!. hi! at hi! line (unknown line) : (unknown column) line -38 : 2");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test233"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf("hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at hi!.  at hi!: hi! line (unknown line) : 10 line 54 : -3");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test234"); }


    com.google.javascript.rhino.Node var4 = null;
    com.google.javascript.rhino.Node var6 = null;
    com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.error(". hi! at (unknown source) line (unknown line) : (unknown column)", "hi!. hi! at hi! line (unknown line) : (unknown column): : hi!");
    com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.error("", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    com.google.javascript.rhino.Node var14 = null;
    com.google.javascript.jscomp.DiagnosticType var17 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var22 = null;
    com.google.javascript.jscomp.DiagnosticType var24 = com.google.javascript.jscomp.DiagnosticType.make("", var22, "hi!");
    java.lang.String[] var26 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var27 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var24, var26);
    com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make("hi!", var14, var17, var26);
    com.google.javascript.jscomp.DiagnosticType var29 = var28.getType();
    com.google.javascript.rhino.Node var31 = null;
    com.google.javascript.jscomp.DiagnosticType var34 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var39 = null;
    com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.make("", var39, "hi!");
    java.lang.String[] var43 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var44 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var41, var43);
    com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make("hi!", var31, var34, var43);
    com.google.javascript.jscomp.JSError var46 = com.google.javascript.jscomp.JSError.make(var29, var43);
    com.google.javascript.jscomp.JSError var47 = com.google.javascript.jscomp.JSError.make(var12, var43);
    com.google.javascript.jscomp.JSError var48 = com.google.javascript.jscomp.JSError.make(".  at (unknown source) line (unknown line) : (unknown column)", var6, var9, var43);
    com.google.javascript.jscomp.DiagnosticType var49 = var48.getType();
    com.google.javascript.jscomp.DiagnosticType var52 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!.  at hi!: hi! line (unknown line) : 10", ": hi!");
    com.google.javascript.jscomp.CheckLevel var56 = null;
    com.google.javascript.jscomp.DiagnosticType var59 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at hi! line (unknown line) : (unknown column)", "hi!: hi!");
    com.google.javascript.jscomp.CheckLevel var64 = null;
    com.google.javascript.jscomp.DiagnosticType var66 = com.google.javascript.jscomp.DiagnosticType.make("", var64, "hi!");
    java.lang.String[] var68 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var69 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var66, var68);
    com.google.javascript.jscomp.JSError var70 = com.google.javascript.jscomp.JSError.make("hi!.  at hi!: hi! line (unknown line) : 10", (-8), (-64), var56, var59, var68);
    com.google.javascript.jscomp.JSError var71 = com.google.javascript.jscomp.JSError.make(var52, var68);
    com.google.javascript.jscomp.JSError var72 = com.google.javascript.jscomp.JSError.make("hi!", var4, var49, var68);
    com.google.javascript.jscomp.DiagnosticType var75 = com.google.javascript.jscomp.DiagnosticType.warning(".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : ", "hi!: hi!");
    com.google.javascript.jscomp.DiagnosticType var78 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!.  at hi!: hi! line (unknown line) : 10", ": hi!");
    com.google.javascript.jscomp.CheckLevel var82 = null;
    com.google.javascript.jscomp.DiagnosticType var85 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at hi! line (unknown line) : (unknown column)", "hi!: hi!");
    com.google.javascript.jscomp.CheckLevel var90 = null;
    com.google.javascript.jscomp.DiagnosticType var92 = com.google.javascript.jscomp.DiagnosticType.make("", var90, "hi!");
    java.lang.String[] var94 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var95 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var92, var94);
    com.google.javascript.jscomp.JSError var96 = com.google.javascript.jscomp.JSError.make("hi!.  at hi!: hi! line (unknown line) : 10", (-8), (-64), var82, var85, var94);
    com.google.javascript.jscomp.JSError var97 = com.google.javascript.jscomp.JSError.make(var78, var94);
    com.google.javascript.jscomp.JSError var98 = com.google.javascript.jscomp.JSError.make(var75, var94);
    com.google.javascript.jscomp.JSError var99 = com.google.javascript.jscomp.JSError.make(": : hi!. hi! at hi! line (unknown line) : (unknown column)", 67, (-253), var49, var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var99);

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test235"); }


    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.jscomp.DiagnosticType var4 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var9 = null;
    com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.make("", var9, "hi!");
    java.lang.String[] var13 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var14 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var11, var13);
    com.google.javascript.jscomp.JSError var15 = com.google.javascript.jscomp.JSError.make("hi!", var1, var4, var13);
    com.google.javascript.jscomp.DiagnosticType var16 = var15.getType();
    int var17 = var15.getCharno();
    boolean var19 = var15.equals((java.lang.Object)(short)1);
    java.lang.String var20 = var15.toString();
    com.google.javascript.jscomp.DiagnosticType var23 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    boolean var24 = var15.equals((java.lang.Object)"hi!");
    boolean var26 = var15.equals((java.lang.Object)(byte)100);
    com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var32 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var33 = var29.compareTo(var32);
    com.google.javascript.jscomp.DiagnosticType var36 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var39 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var40 = var36.compareTo(var39);
    com.google.javascript.jscomp.DiagnosticType var43 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var46 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var47 = var43.compareTo(var46);
    int var48 = var36.compareTo(var43);
    boolean var49 = var29.equals((java.lang.Object)var43);
    boolean var50 = var15.equals((java.lang.Object)var43);
    int var51 = var15.getCharno();
    java.lang.String var52 = var15.toString();
    java.lang.String var53 = var15.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!. hi! at hi! line (unknown line) : (unknown column)"+ "'", var20.equals("hi!. hi! at hi! line (unknown line) : (unknown column)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!. hi! at hi! line (unknown line) : (unknown column)"+ "'", var52.equals("hi!. hi! at hi! line (unknown line) : (unknown column)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "hi!. hi! at hi! line (unknown line) : (unknown column)"+ "'", var53.equals("hi!. hi! at hi! line (unknown line) : (unknown column)"));

  }

  public void test236() {}
//   public void test236() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test236"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "");
//     java.lang.String var6 = var5.toString();
//     com.google.javascript.jscomp.CheckLevel var13 = null;
//     com.google.javascript.jscomp.DiagnosticType var16 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var20 = var16.compareTo(var19);
//     com.google.javascript.jscomp.DiagnosticType var23 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var26 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var27 = var23.compareTo(var26);
//     com.google.javascript.jscomp.DiagnosticType var30 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var34 = var30.compareTo(var33);
//     int var35 = var23.compareTo(var30);
//     boolean var36 = var16.equals((java.lang.Object)var30);
//     com.google.javascript.rhino.Node var38 = null;
//     com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     com.google.javascript.jscomp.CheckLevel var46 = null;
//     com.google.javascript.jscomp.DiagnosticType var48 = com.google.javascript.jscomp.DiagnosticType.make("", var46, "hi!");
//     java.lang.String[] var50 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var51 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var48, var50);
//     com.google.javascript.jscomp.JSError var52 = com.google.javascript.jscomp.JSError.make("", var38, var41, var50);
//     com.google.javascript.jscomp.JSError var53 = com.google.javascript.jscomp.JSError.make("", 0, 1, var13, var16, var50);
//     com.google.javascript.rhino.Node var55 = null;
//     com.google.javascript.jscomp.DiagnosticType var58 = com.google.javascript.jscomp.DiagnosticType.warning("hi!", "");
//     com.google.javascript.rhino.Node var60 = null;
//     com.google.javascript.jscomp.DiagnosticType var63 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     com.google.javascript.jscomp.CheckLevel var68 = null;
//     com.google.javascript.jscomp.DiagnosticType var70 = com.google.javascript.jscomp.DiagnosticType.make("", var68, "hi!");
//     java.lang.String[] var72 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var73 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var70, var72);
//     com.google.javascript.jscomp.JSError var74 = com.google.javascript.jscomp.JSError.make("", var60, var63, var72);
//     com.google.javascript.jscomp.JSError var75 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var55, var58, var72);
//     com.google.javascript.jscomp.JSError var76 = com.google.javascript.jscomp.JSError.make(": ", (-12), 46, var16, var72);
//     com.google.javascript.jscomp.JSError var77 = com.google.javascript.jscomp.JSError.make("hi!.  at hi!: hi! line (unknown line) : 10", 54, (-3), var5, var72);
//     com.google.javascript.jscomp.CheckLevel var78 = null;
//     com.google.javascript.jscomp.MessageFormatter var79 = null;
//     java.lang.String var80 = var77.format(var78, var79);
// 
//   }

  public void test237() {}
//   public void test237() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test237"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CheckLevel var2 = null;
//     com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.error(": : hi!.  at (unknown source) line (unknown line) : (unknown column)", ": hi!");
//     com.google.javascript.rhino.Node var7 = null;
//     com.google.javascript.jscomp.CheckLevel var9 = null;
//     com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.make("", var9, ": hi!");
//     java.lang.String var12 = var11.toString();
//     com.google.javascript.rhino.Node var14 = null;
//     com.google.javascript.jscomp.DiagnosticType var17 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     com.google.javascript.jscomp.CheckLevel var22 = null;
//     com.google.javascript.jscomp.DiagnosticType var24 = com.google.javascript.jscomp.DiagnosticType.make("", var22, "hi!");
//     java.lang.String[] var26 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var27 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var24, var26);
//     com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make("", var14, var17, var26);
//     java.lang.String var29 = var17.toString();
//     int var30 = var11.compareTo(var17);
//     com.google.javascript.rhino.Node var32 = null;
//     com.google.javascript.jscomp.DiagnosticType var35 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     com.google.javascript.jscomp.CheckLevel var40 = null;
//     com.google.javascript.jscomp.DiagnosticType var42 = com.google.javascript.jscomp.DiagnosticType.make("", var40, "hi!");
//     java.lang.String[] var44 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var42, var44);
//     com.google.javascript.jscomp.JSError var46 = com.google.javascript.jscomp.JSError.make("", var32, var35, var44);
//     com.google.javascript.jscomp.JSError var47 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column). hi!: hi! at (unknown source) line (unknown line) : (unknown column): .  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : : hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3", var7, var11, var44);
//     com.google.javascript.jscomp.JSError var48 = com.google.javascript.jscomp.JSError.make("hi!: hi!: : hi!", var1, var2, var5, var44);
// 
//   }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test238"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf("hi!. hi!.  at hi!: hi! line (unknown line) : 10 at .  at (unknown source) line 1 : 10 line -12 : 100: hi!.  at (unknown source) line (unknown line) : (unknown column)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test239() {}
//   public void test239() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test239"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, ". hi! at (unknown source) line 0 : 0");
// 
//   }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test240"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning(": . hi!: hi!:  at (unknown source) line (unknown line) : (unknown column)", "hi!. hi! at hi! line (unknown line) : (unknown column): : hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test241"); }


    com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var12 = var8.compareTo(var11);
    com.google.javascript.jscomp.DiagnosticType var15 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var19 = var15.compareTo(var18);
    int var20 = var8.compareTo(var15);
    java.lang.String[] var21 = null;
    com.google.javascript.jscomp.JSError var22 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", 10, 1, var8, var21);
    com.google.javascript.jscomp.DiagnosticType var23 = var22.getType();
    com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!.  at hi!: hi! line (unknown line) : 10", ": hi!");
    com.google.javascript.jscomp.DiagnosticType var32 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var35 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var36 = var32.compareTo(var35);
    boolean var37 = var29.equals((java.lang.Object)var36);
    com.google.javascript.jscomp.CheckLevel var41 = null;
    com.google.javascript.jscomp.DiagnosticType var44 = com.google.javascript.jscomp.DiagnosticType.error(".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : ", ".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3");
    com.google.javascript.jscomp.DiagnosticType var50 = com.google.javascript.jscomp.DiagnosticType.error("", "hi!. hi! at hi! line (unknown line) : (unknown column)");
    com.google.javascript.jscomp.CheckLevel var54 = null;
    com.google.javascript.jscomp.DiagnosticType var57 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var61 = null;
    com.google.javascript.jscomp.CheckLevel var63 = null;
    com.google.javascript.jscomp.DiagnosticType var65 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var63, "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    com.google.javascript.jscomp.CheckLevel var70 = null;
    com.google.javascript.jscomp.DiagnosticType var72 = com.google.javascript.jscomp.DiagnosticType.make("", var70, "hi!");
    java.lang.String[] var74 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var75 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var72, var74);
    com.google.javascript.rhino.Node var77 = null;
    com.google.javascript.jscomp.DiagnosticType var80 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var85 = null;
    com.google.javascript.jscomp.DiagnosticType var87 = com.google.javascript.jscomp.DiagnosticType.make("", var85, "hi!");
    java.lang.String[] var89 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var90 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var87, var89);
    com.google.javascript.jscomp.JSError var91 = com.google.javascript.jscomp.JSError.make("hi!", var77, var80, var89);
    com.google.javascript.jscomp.JSError var92 = com.google.javascript.jscomp.JSError.make(var72, var89);
    com.google.javascript.jscomp.JSError var93 = com.google.javascript.jscomp.JSError.make("", 0, 1, var61, var65, var89);
    com.google.javascript.jscomp.JSError var94 = com.google.javascript.jscomp.JSError.make("hi!.  at hi!: hi! line (unknown line) : 10", 1, (-1), var54, var57, var89);
    com.google.javascript.jscomp.JSError var95 = com.google.javascript.jscomp.JSError.make(": ", 100, (-1), var50, var89);
    com.google.javascript.jscomp.JSError var96 = com.google.javascript.jscomp.JSError.make("", 3, (-64), var41, var44, var89);
    com.google.javascript.jscomp.JSError var97 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line -67 : 0", 2, 54, var29, var89);
    com.google.javascript.jscomp.JSError var98 = com.google.javascript.jscomp.JSError.make("hi!.  at hi!: hi! line (unknown line) : 10. : hi! at hi!. hi! at (unknown source) line -67 : 0 line 2 : 54", 42, 0, var23, var89);
    java.lang.String var99 = var98.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var99 + "' != '" + ".  at hi!.  at hi!: hi! line (unknown line) : 10. : hi! at hi!. hi! at (unknown source) line -67 : 0 line 2 : 54 line 42 : 0"+ "'", var99.equals(".  at hi!.  at hi!: hi! line (unknown line) : 10. : hi! at hi!. hi! at (unknown source) line -67 : 0 line 2 : 54 line 42 : 0"));

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test242"); }


    com.google.javascript.jscomp.CheckLevel var4 = null;
    com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.make("", var4, "hi!");
    com.google.javascript.rhino.Node var8 = null;
    com.google.javascript.rhino.Node var10 = null;
    com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var18 = null;
    com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.make("", var18, "hi!");
    java.lang.String[] var22 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var23 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var20, var22);
    com.google.javascript.jscomp.JSError var24 = com.google.javascript.jscomp.JSError.make("hi!", var10, var13, var22);
    com.google.javascript.rhino.Node var26 = null;
    com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var34 = null;
    com.google.javascript.jscomp.DiagnosticType var36 = com.google.javascript.jscomp.DiagnosticType.make("", var34, "hi!");
    java.lang.String[] var38 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var39 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var36, var38);
    com.google.javascript.jscomp.JSError var40 = com.google.javascript.jscomp.JSError.make("hi!", var26, var29, var38);
    com.google.javascript.jscomp.JSError var41 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var8, var13, var38);
    com.google.javascript.rhino.Node var43 = null;
    com.google.javascript.jscomp.DiagnosticType var46 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var51 = null;
    com.google.javascript.jscomp.DiagnosticType var53 = com.google.javascript.jscomp.DiagnosticType.make("", var51, "hi!");
    java.lang.String[] var55 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var56 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var53, var55);
    com.google.javascript.jscomp.JSError var57 = com.google.javascript.jscomp.JSError.make("hi!", var43, var46, var55);
    com.google.javascript.jscomp.JSError var58 = com.google.javascript.jscomp.JSError.make(var13, var55);
    com.google.javascript.jscomp.JSError var59 = com.google.javascript.jscomp.JSError.make("", 0, 0, var6, var55);
    boolean var61 = var59.equals((java.lang.Object)10);
    com.google.javascript.jscomp.DiagnosticType var62 = var59.getType();
    com.google.javascript.jscomp.CheckLevel var64 = null;
    com.google.javascript.jscomp.DiagnosticType var66 = com.google.javascript.jscomp.DiagnosticType.make("", var64, ": hi!");
    boolean var67 = var59.equals((java.lang.Object)": hi!");
    com.google.javascript.jscomp.CheckLevel var72 = null;
    com.google.javascript.jscomp.DiagnosticType var74 = com.google.javascript.jscomp.DiagnosticType.make("", var72, "hi!");
    java.lang.String[] var76 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var77 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var74, var76);
    boolean var79 = var77.equals((java.lang.Object)(byte)(-1));
    com.google.javascript.jscomp.DiagnosticType var80 = var77.getType();
    boolean var81 = var59.equals((java.lang.Object)var77);
    java.lang.String var82 = var77.toString();
    com.google.javascript.jscomp.DiagnosticType var85 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at hi! line (unknown line) : (unknown column)", "hi!: ");
    boolean var86 = var77.equals((java.lang.Object)"hi!: ");
    com.google.javascript.jscomp.DiagnosticType var87 = var77.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + ". hi! at hi! line 1 : (unknown column)"+ "'", var82.equals(". hi! at hi! line 1 : (unknown column)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test243"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("hi!. hi! at hi! line (unknown line) : (unknown column): : hi!. : hi! at (unknown source) line 64 : 64", var1, "hi!. hi! at (unknown source) line (unknown line) : (unknown column): : hi!.  at hi!: hi! line (unknown line) : 10");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test244"); }


    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.jscomp.DiagnosticType var4 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!.  at hi!: hi! line (unknown line) : 10", ".  at (unknown source) line 1 : 10");
    com.google.javascript.rhino.Node var6 = null;
    com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var14 = null;
    com.google.javascript.jscomp.DiagnosticType var16 = com.google.javascript.jscomp.DiagnosticType.make("", var14, "hi!");
    java.lang.String[] var18 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var19 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var16, var18);
    com.google.javascript.jscomp.JSError var20 = com.google.javascript.jscomp.JSError.make("hi!", var6, var9, var18);
    int var21 = var20.getCharno();
    com.google.javascript.jscomp.DiagnosticType var22 = var20.getType();
    boolean var23 = var4.equals((java.lang.Object)var22);
    com.google.javascript.jscomp.CheckLevel var28 = null;
    com.google.javascript.jscomp.DiagnosticType var30 = com.google.javascript.jscomp.DiagnosticType.make("", var28, "hi!");
    java.lang.String[] var32 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var33 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var30, var32);
    com.google.javascript.jscomp.JSError var34 = com.google.javascript.jscomp.JSError.make("", var1, var22, var32);
    com.google.javascript.jscomp.DiagnosticType var37 = com.google.javascript.jscomp.DiagnosticType.disabled(". hi! at (unknown source) line (unknown line) : (unknown column)", ".  at (unknown source) line -3 : (unknown column)");
    int var38 = var22.compareTo(var37);
    com.google.javascript.jscomp.CheckLevel var42 = null;
    com.google.javascript.jscomp.DiagnosticType var45 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at hi! line (unknown line) : (unknown column)", "hi!: hi!");
    com.google.javascript.jscomp.CheckLevel var50 = null;
    com.google.javascript.jscomp.DiagnosticType var52 = com.google.javascript.jscomp.DiagnosticType.make("", var50, "hi!");
    java.lang.String[] var54 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var55 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var52, var54);
    com.google.javascript.jscomp.JSError var56 = com.google.javascript.jscomp.JSError.make("hi!.  at hi!: hi! line (unknown line) : 10", (-8), (-64), var42, var45, var54);
    com.google.javascript.jscomp.JSError var57 = com.google.javascript.jscomp.JSError.make(var22, var54);
    com.google.javascript.jscomp.DiagnosticType var58 = var57.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test245"); }


    com.google.javascript.rhino.Node var4 = null;
    com.google.javascript.jscomp.DiagnosticType var7 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at hi! line (unknown line) : (unknown column)", "hi!: hi!");
    java.lang.String[] var9 = new java.lang.String[] { "hi!: hi!"};
    com.google.javascript.jscomp.JSError var10 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3", var4, var7, var9);
    com.google.javascript.rhino.Node var12 = null;
    com.google.javascript.jscomp.DiagnosticType var15 = com.google.javascript.jscomp.DiagnosticType.error("hi!", ": ");
    com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
    com.google.javascript.rhino.Node var20 = null;
    com.google.javascript.jscomp.DiagnosticType var23 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at hi! line (unknown line) : (unknown column)", "hi!: hi!");
    java.lang.String[] var25 = new java.lang.String[] { "hi!: hi!"};
    com.google.javascript.jscomp.JSError var26 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3", var20, var23, var25);
    com.google.javascript.jscomp.JSError var27 = com.google.javascript.jscomp.JSError.make(var18, var25);
    com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make("hi!: ", var12, var15, var25);
    com.google.javascript.jscomp.JSError var29 = com.google.javascript.jscomp.JSError.make(".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3", 0, (-61), var7, var25);
    com.google.javascript.jscomp.CheckLevel var34 = null;
    com.google.javascript.jscomp.DiagnosticType var36 = com.google.javascript.jscomp.DiagnosticType.make("", var34, "hi!");
    com.google.javascript.rhino.Node var38 = null;
    com.google.javascript.rhino.Node var40 = null;
    com.google.javascript.jscomp.DiagnosticType var43 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var48 = null;
    com.google.javascript.jscomp.DiagnosticType var50 = com.google.javascript.jscomp.DiagnosticType.make("", var48, "hi!");
    java.lang.String[] var52 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var53 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var50, var52);
    com.google.javascript.jscomp.JSError var54 = com.google.javascript.jscomp.JSError.make("hi!", var40, var43, var52);
    com.google.javascript.rhino.Node var56 = null;
    com.google.javascript.jscomp.DiagnosticType var59 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var64 = null;
    com.google.javascript.jscomp.DiagnosticType var66 = com.google.javascript.jscomp.DiagnosticType.make("", var64, "hi!");
    java.lang.String[] var68 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var69 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var66, var68);
    com.google.javascript.jscomp.JSError var70 = com.google.javascript.jscomp.JSError.make("hi!", var56, var59, var68);
    com.google.javascript.jscomp.JSError var71 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var38, var43, var68);
    com.google.javascript.rhino.Node var73 = null;
    com.google.javascript.jscomp.DiagnosticType var76 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var81 = null;
    com.google.javascript.jscomp.DiagnosticType var83 = com.google.javascript.jscomp.DiagnosticType.make("", var81, "hi!");
    java.lang.String[] var85 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var86 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var83, var85);
    com.google.javascript.jscomp.JSError var87 = com.google.javascript.jscomp.JSError.make("hi!", var73, var76, var85);
    com.google.javascript.jscomp.JSError var88 = com.google.javascript.jscomp.JSError.make(var43, var85);
    com.google.javascript.jscomp.JSError var89 = com.google.javascript.jscomp.JSError.make("", 0, 0, var36, var85);
    boolean var91 = var89.equals((java.lang.Object)10);
    com.google.javascript.jscomp.DiagnosticType var92 = var89.getType();
    com.google.javascript.jscomp.CheckLevel var94 = null;
    com.google.javascript.jscomp.DiagnosticType var96 = com.google.javascript.jscomp.DiagnosticType.make("", var94, ": hi!");
    boolean var97 = var89.equals((java.lang.Object)": hi!");
    java.lang.String var98 = var89.toString();
    boolean var99 = var29.equals((java.lang.Object)var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var98 + "' != '" + ". hi! at (unknown source) line 0 : 0"+ "'", var98.equals(". hi! at (unknown source) line 0 : 0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var99 == false);

  }

  public void test246() {}
//   public void test246() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test246"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, ". hi! at (unknown source) line 0 : 0: .  at (unknown source) line -3 : (unknown column)");
// 
//   }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test247"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled(".  at (unknown source) line -3 : (unknown column)", "hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: hi!: hi!: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test248() {}
//   public void test248() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test248"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.DiagnosticType var2 = null;
//     com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!.  at hi!: hi! line (unknown line) : 10", ": hi!");
//     com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var15 = var11.compareTo(var14);
//     boolean var16 = var8.equals((java.lang.Object)var15);
//     com.google.javascript.jscomp.CheckLevel var20 = null;
//     com.google.javascript.jscomp.DiagnosticType var23 = com.google.javascript.jscomp.DiagnosticType.error(".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : ", ".  at (unknown source) line 1 : 10: hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3");
//     com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.error("", "hi!. hi! at hi! line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.CheckLevel var33 = null;
//     com.google.javascript.jscomp.DiagnosticType var36 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var40 = null;
//     com.google.javascript.jscomp.CheckLevel var42 = null;
//     com.google.javascript.jscomp.DiagnosticType var44 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var42, "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.CheckLevel var49 = null;
//     com.google.javascript.jscomp.DiagnosticType var51 = com.google.javascript.jscomp.DiagnosticType.make("", var49, "hi!");
//     java.lang.String[] var53 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var54 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var51, var53);
//     com.google.javascript.rhino.Node var56 = null;
//     com.google.javascript.jscomp.DiagnosticType var59 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var64 = null;
//     com.google.javascript.jscomp.DiagnosticType var66 = com.google.javascript.jscomp.DiagnosticType.make("", var64, "hi!");
//     java.lang.String[] var68 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var69 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var66, var68);
//     com.google.javascript.jscomp.JSError var70 = com.google.javascript.jscomp.JSError.make("hi!", var56, var59, var68);
//     com.google.javascript.jscomp.JSError var71 = com.google.javascript.jscomp.JSError.make(var51, var68);
//     com.google.javascript.jscomp.JSError var72 = com.google.javascript.jscomp.JSError.make("", 0, 1, var40, var44, var68);
//     com.google.javascript.jscomp.JSError var73 = com.google.javascript.jscomp.JSError.make("hi!.  at hi!: hi! line (unknown line) : 10", 1, (-1), var33, var36, var68);
//     com.google.javascript.jscomp.JSError var74 = com.google.javascript.jscomp.JSError.make(": ", 100, (-1), var29, var68);
//     com.google.javascript.jscomp.JSError var75 = com.google.javascript.jscomp.JSError.make("", 3, (-64), var20, var23, var68);
//     com.google.javascript.jscomp.JSError var76 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line -67 : 0", 2, 54, var8, var68);
//     com.google.javascript.jscomp.JSError var77 = com.google.javascript.jscomp.JSError.make(".  at (unknown source) line 100 : 1", var1, var2, var68);
// 
//   }

  public void test249() {}
//   public void test249() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test249"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CheckLevel var2 = null;
//     com.google.javascript.jscomp.DiagnosticType var3 = null;
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.jscomp.CheckLevel var9 = null;
//     com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.make("hi!. hi! at hi! line (unknown line) : (unknown column): : hi!", var9, ": hi!");
//     com.google.javascript.jscomp.CheckLevel var15 = null;
//     com.google.javascript.jscomp.CheckLevel var19 = null;
//     com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var25 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var26 = var22.compareTo(var25);
//     com.google.javascript.rhino.Node var28 = null;
//     com.google.javascript.rhino.Node var30 = null;
//     com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var38 = null;
//     com.google.javascript.jscomp.DiagnosticType var40 = com.google.javascript.jscomp.DiagnosticType.make("", var38, "hi!");
//     java.lang.String[] var42 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var43 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var40, var42);
//     com.google.javascript.jscomp.JSError var44 = com.google.javascript.jscomp.JSError.make("hi!", var30, var33, var42);
//     com.google.javascript.rhino.Node var46 = null;
//     com.google.javascript.jscomp.DiagnosticType var49 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var54 = null;
//     com.google.javascript.jscomp.DiagnosticType var56 = com.google.javascript.jscomp.DiagnosticType.make("", var54, "hi!");
//     java.lang.String[] var58 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var59 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var56, var58);
//     com.google.javascript.jscomp.JSError var60 = com.google.javascript.jscomp.JSError.make("hi!", var46, var49, var58);
//     com.google.javascript.jscomp.JSError var61 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var28, var33, var58);
//     com.google.javascript.jscomp.JSError var62 = com.google.javascript.jscomp.JSError.make("", 100, 1, var19, var25, var58);
//     com.google.javascript.rhino.Node var64 = null;
//     com.google.javascript.jscomp.DiagnosticType var67 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "");
//     com.google.javascript.jscomp.CheckLevel var72 = null;
//     com.google.javascript.jscomp.DiagnosticType var74 = com.google.javascript.jscomp.DiagnosticType.make("", var72, "hi!");
//     java.lang.String[] var76 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var77 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var74, var76);
//     com.google.javascript.jscomp.JSError var78 = com.google.javascript.jscomp.JSError.make("", var64, var67, var76);
//     com.google.javascript.jscomp.JSError var79 = com.google.javascript.jscomp.JSError.make("", 1, 10, var15, var25, var76);
//     com.google.javascript.jscomp.JSError var80 = com.google.javascript.jscomp.JSError.make("", 64, 64, var7, var11, var76);
//     com.google.javascript.jscomp.JSError var81 = com.google.javascript.jscomp.JSError.make("", var1, var2, var3, var76);
// 
//   }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test250"); }


    com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var10 = null;
    com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.make("", var10, "hi!");
    java.lang.String[] var14 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var15 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var12, var14);
    com.google.javascript.rhino.Node var17 = null;
    com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var25 = null;
    com.google.javascript.jscomp.DiagnosticType var27 = com.google.javascript.jscomp.DiagnosticType.make("", var25, "hi!");
    java.lang.String[] var29 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var30 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var27, var29);
    com.google.javascript.jscomp.JSError var31 = com.google.javascript.jscomp.JSError.make("hi!", var17, var20, var29);
    com.google.javascript.jscomp.JSError var32 = com.google.javascript.jscomp.JSError.make(var12, var29);
    com.google.javascript.jscomp.JSError var33 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", (-1), (-3), var5, var29);
    java.lang.String var34 = var33.toString();
    java.lang.String var35 = var33.toString();
    int var36 = var33.getCharno();
    com.google.javascript.jscomp.DiagnosticType var37 = var33.getType();
    com.google.javascript.rhino.Node var39 = null;
    com.google.javascript.jscomp.DiagnosticType var42 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var45 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var46 = var42.compareTo(var45);
    com.google.javascript.jscomp.DiagnosticType var49 = com.google.javascript.jscomp.DiagnosticType.error("", "");
    com.google.javascript.jscomp.DiagnosticType var52 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
    int var53 = var49.compareTo(var52);
    int var54 = var42.compareTo(var49);
    com.google.javascript.jscomp.DiagnosticType var57 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", ": hi!");
    int var58 = var49.compareTo(var57);
    java.lang.String[] var59 = null;
    com.google.javascript.jscomp.JSError var60 = com.google.javascript.jscomp.JSError.make("", var39, var57, var59);
    int var61 = var37.compareTo(var57);
    java.lang.Object var62 = null;
    boolean var63 = var57.equals(var62);
    java.lang.String var64 = var57.toString();
    java.lang.String var65 = var57.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3"+ "'", var34.equals("hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3"+ "'", var35.equals("hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == (-3));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == (-8));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "hi!: hi!: : hi!"+ "'", var64.equals("hi!: hi!: : hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "hi!: hi!: : hi!"+ "'", var65.equals("hi!: hi!: : hi!"));

  }

  public void test251() {}
//   public void test251() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test251"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "hi!. hi! at (unknown source) line (unknown line) : (unknown column): : hi!: hi!: ");
// 
//   }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test252"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled(".  at hi!.  at hi!: hi! line (unknown line) : 10 line 3 : 0", "hi!: : . hi! at (unknown source) line (unknown line) : (unknown column): hi!. hi! at (unknown source) line (unknown line) : (unknown column): ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test253() {}
//   public void test253() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test253"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CheckLevel var2 = null;
//     com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.disabled(": ", "hi!. hi! at hi! line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.warning(": ", "");
//     com.google.javascript.rhino.Node var10 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.rhino.Node var15 = null;
//     com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var23 = null;
//     com.google.javascript.jscomp.DiagnosticType var25 = com.google.javascript.jscomp.DiagnosticType.make("", var23, "hi!");
//     java.lang.String[] var27 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var25, var27);
//     com.google.javascript.jscomp.JSError var29 = com.google.javascript.jscomp.JSError.make("hi!", var15, var18, var27);
//     com.google.javascript.jscomp.JSError var30 = com.google.javascript.jscomp.JSError.make("hi!: hi!: ", var10, var13, var27);
//     com.google.javascript.jscomp.DiagnosticType var31 = var30.getType();
//     int var32 = var8.compareTo(var31);
//     int var33 = var5.compareTo(var31);
//     com.google.javascript.jscomp.CheckLevel var37 = null;
//     com.google.javascript.jscomp.DiagnosticType var40 = com.google.javascript.jscomp.DiagnosticType.disabled("", "hi!");
//     com.google.javascript.jscomp.CheckLevel var44 = null;
//     com.google.javascript.jscomp.DiagnosticType var47 = com.google.javascript.jscomp.DiagnosticType.error("", "");
//     com.google.javascript.jscomp.DiagnosticType var50 = com.google.javascript.jscomp.DiagnosticType.warning("", "");
//     int var51 = var47.compareTo(var50);
//     com.google.javascript.rhino.Node var53 = null;
//     com.google.javascript.rhino.Node var55 = null;
//     com.google.javascript.jscomp.DiagnosticType var58 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var63 = null;
//     com.google.javascript.jscomp.DiagnosticType var65 = com.google.javascript.jscomp.DiagnosticType.make("", var63, "hi!");
//     java.lang.String[] var67 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var68 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var65, var67);
//     com.google.javascript.jscomp.JSError var69 = com.google.javascript.jscomp.JSError.make("hi!", var55, var58, var67);
//     com.google.javascript.rhino.Node var71 = null;
//     com.google.javascript.jscomp.DiagnosticType var74 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var79 = null;
//     com.google.javascript.jscomp.DiagnosticType var81 = com.google.javascript.jscomp.DiagnosticType.make("", var79, "hi!");
//     java.lang.String[] var83 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var84 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var81, var83);
//     com.google.javascript.jscomp.JSError var85 = com.google.javascript.jscomp.JSError.make("hi!", var71, var74, var83);
//     com.google.javascript.jscomp.JSError var86 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var53, var58, var83);
//     com.google.javascript.jscomp.JSError var87 = com.google.javascript.jscomp.JSError.make("", 100, 1, var44, var50, var83);
//     com.google.javascript.jscomp.JSError var88 = com.google.javascript.jscomp.JSError.make("", 0, (-1), var37, var40, var83);
//     com.google.javascript.jscomp.JSError var89 = com.google.javascript.jscomp.JSError.make(". hi! at (unknown source) line 0 : 0: .  at (unknown source) line -3 : (unknown column)", var1, var2, var31, var83);
// 
//   }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test254"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled("", "hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at (unknown source) line (unknown line) : (unknown column)");
    com.google.javascript.rhino.Node var4 = null;
    com.google.javascript.jscomp.DiagnosticType var7 = com.google.javascript.jscomp.DiagnosticType.error("hi!.  at hi!: hi! line (unknown line) : 10", "hi!. hi! at hi! line (unknown line) : (unknown column)");
    com.google.javascript.rhino.Node var9 = null;
    com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.error(": hi!", "hi!");
    com.google.javascript.rhino.Node var14 = null;
    com.google.javascript.rhino.Node var16 = null;
    com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var24 = null;
    com.google.javascript.jscomp.DiagnosticType var26 = com.google.javascript.jscomp.DiagnosticType.make("", var24, "hi!");
    java.lang.String[] var28 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var29 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var26, var28);
    com.google.javascript.jscomp.JSError var30 = com.google.javascript.jscomp.JSError.make("hi!", var16, var19, var28);
    com.google.javascript.rhino.Node var32 = null;
    com.google.javascript.jscomp.DiagnosticType var35 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var40 = null;
    com.google.javascript.jscomp.DiagnosticType var42 = com.google.javascript.jscomp.DiagnosticType.make("", var40, "hi!");
    java.lang.String[] var44 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var42, var44);
    com.google.javascript.jscomp.JSError var46 = com.google.javascript.jscomp.JSError.make("hi!", var32, var35, var44);
    com.google.javascript.jscomp.JSError var47 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var14, var19, var44);
    com.google.javascript.rhino.Node var49 = null;
    com.google.javascript.jscomp.DiagnosticType var52 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var57 = null;
    com.google.javascript.jscomp.DiagnosticType var59 = com.google.javascript.jscomp.DiagnosticType.make("", var57, "hi!");
    java.lang.String[] var61 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var62 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var59, var61);
    com.google.javascript.jscomp.JSError var63 = com.google.javascript.jscomp.JSError.make("hi!", var49, var52, var61);
    com.google.javascript.jscomp.JSError var64 = com.google.javascript.jscomp.JSError.make(var19, var61);
    com.google.javascript.jscomp.JSError var65 = com.google.javascript.jscomp.JSError.make(": hi!", var9, var12, var61);
    com.google.javascript.jscomp.JSError var66 = com.google.javascript.jscomp.JSError.make("", var4, var7, var61);
    com.google.javascript.jscomp.JSError var67 = com.google.javascript.jscomp.JSError.make(var2, var61);
    java.lang.String var68 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + ": hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at (unknown source) line (unknown line) : (unknown column)"+ "'", var68.equals(": hi!. hi! at (unknown source) line (unknown line) : (unknown column).  at (unknown source) line (unknown line) : (unknown column)"));

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test255"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("", var1, "hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3: : hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test256"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled(". hi! at (unknown source) line 0 : 0", ": hi!. hi! at hi! line (unknown line) : (unknown column): hi!. hi! at hi!: hi! line 0 : -3: hi!: hi!: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test257() {}
//   public void test257() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test257"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var4 = null;
//     com.google.javascript.jscomp.CheckLevel var9 = null;
//     com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.make("", var9, "");
//     com.google.javascript.rhino.Node var13 = null;
//     com.google.javascript.rhino.Node var15 = null;
//     com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var23 = null;
//     com.google.javascript.jscomp.DiagnosticType var25 = com.google.javascript.jscomp.DiagnosticType.make("", var23, "hi!");
//     java.lang.String[] var27 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var25, var27);
//     com.google.javascript.jscomp.JSError var29 = com.google.javascript.jscomp.JSError.make("hi!", var15, var18, var27);
//     com.google.javascript.rhino.Node var31 = null;
//     com.google.javascript.jscomp.DiagnosticType var34 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var39 = null;
//     com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.make("", var39, "hi!");
//     java.lang.String[] var43 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var44 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var41, var43);
//     com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make("hi!", var31, var34, var43);
//     com.google.javascript.jscomp.JSError var46 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi! line (unknown line) : (unknown column)", var13, var18, var43);
//     com.google.javascript.rhino.Node var48 = null;
//     com.google.javascript.jscomp.DiagnosticType var51 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var56 = null;
//     com.google.javascript.jscomp.DiagnosticType var58 = com.google.javascript.jscomp.DiagnosticType.make("", var56, "hi!");
//     java.lang.String[] var60 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var61 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var58, var60);
//     com.google.javascript.jscomp.JSError var62 = com.google.javascript.jscomp.JSError.make("hi!", var48, var51, var60);
//     com.google.javascript.jscomp.JSError var63 = com.google.javascript.jscomp.JSError.make(var18, var60);
//     java.lang.String var64 = var18.toString();
//     int var65 = var11.compareTo(var18);
//     java.lang.String[] var67 = new java.lang.String[] { "hi!. hi! at (unknown source) line (unknown line) : (unknown column)"};
//     com.google.javascript.jscomp.JSError var68 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : -3", 0, 1, var11, var67);
//     com.google.javascript.jscomp.JSError var69 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-38), (-58), var3, var4, var67);
// 
//   }

  public void test258() {}
//   public void test258() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test258"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!.  at hi!: hi! line (unknown line) : 10", ".  at (unknown source) line 1 : 10");
//     com.google.javascript.rhino.Node var8 = null;
//     com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var16 = null;
//     com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.make("", var16, "hi!");
//     java.lang.String[] var20 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var21 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var18, var20);
//     com.google.javascript.jscomp.JSError var22 = com.google.javascript.jscomp.JSError.make("hi!", var8, var11, var20);
//     int var23 = var22.getCharno();
//     com.google.javascript.jscomp.DiagnosticType var24 = var22.getType();
//     boolean var25 = var6.equals((java.lang.Object)var24);
//     com.google.javascript.jscomp.CheckLevel var29 = null;
//     com.google.javascript.jscomp.CheckLevel var31 = null;
//     com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.make("", var31, "");
//     com.google.javascript.jscomp.CheckLevel var38 = null;
//     com.google.javascript.jscomp.DiagnosticType var40 = com.google.javascript.jscomp.DiagnosticType.make("", var38, "hi!");
//     java.lang.String[] var42 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var43 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var40, var42);
//     com.google.javascript.rhino.Node var45 = null;
//     com.google.javascript.jscomp.DiagnosticType var48 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.CheckLevel var53 = null;
//     com.google.javascript.jscomp.DiagnosticType var55 = com.google.javascript.jscomp.DiagnosticType.make("", var53, "hi!");
//     java.lang.String[] var57 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var58 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var55, var57);
//     com.google.javascript.jscomp.JSError var59 = com.google.javascript.jscomp.JSError.make("hi!", var45, var48, var57);
//     com.google.javascript.jscomp.JSError var60 = com.google.javascript.jscomp.JSError.make(var40, var57);
//     com.google.javascript.jscomp.JSError var61 = com.google.javascript.jscomp.JSError.make(": ", 0, (-64), var29, var33, var57);
//     com.google.javascript.jscomp.JSError var62 = com.google.javascript.jscomp.JSError.make("", (-67), 0, var3, var24, var57);
//     java.lang.String var63 = var62.toString();
//     com.google.javascript.jscomp.CheckLevel var64 = null;
//     com.google.javascript.jscomp.MessageFormatter var65 = null;
//     java.lang.String var66 = var62.format(var64, var65);
// 
//   }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test259"); }


    com.google.javascript.jscomp.CheckLevel var3 = null;
    com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at hi! line (unknown line) : (unknown column)", "hi!: hi!");
    com.google.javascript.jscomp.CheckLevel var11 = null;
    com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("", var11, "hi!");
    java.lang.String[] var15 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var13, var15);
    com.google.javascript.jscomp.DiagnosticType var17 = var16.getType();
    int var18 = var6.compareTo(var17);
    com.google.javascript.jscomp.DiagnosticType var24 = com.google.javascript.jscomp.DiagnosticType.error("", "hi!. hi! at hi! line (unknown line) : (unknown column)");
    com.google.javascript.jscomp.CheckLevel var28 = null;
    com.google.javascript.jscomp.DiagnosticType var31 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var35 = null;
    com.google.javascript.jscomp.CheckLevel var37 = null;
    com.google.javascript.jscomp.DiagnosticType var39 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var37, "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    com.google.javascript.jscomp.CheckLevel var44 = null;
    com.google.javascript.jscomp.DiagnosticType var46 = com.google.javascript.jscomp.DiagnosticType.make("", var44, "hi!");
    java.lang.String[] var48 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var49 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var46, var48);
    com.google.javascript.rhino.Node var51 = null;
    com.google.javascript.jscomp.DiagnosticType var54 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CheckLevel var59 = null;
    com.google.javascript.jscomp.DiagnosticType var61 = com.google.javascript.jscomp.DiagnosticType.make("", var59, "hi!");
    java.lang.String[] var63 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var64 = com.google.javascript.jscomp.JSError.make("hi!", 1, (-1), var61, var63);
    com.google.javascript.jscomp.JSError var65 = com.google.javascript.jscomp.JSError.make("hi!", var51, var54, var63);
    com.google.javascript.jscomp.JSError var66 = com.google.javascript.jscomp.JSError.make(var46, var63);
    com.google.javascript.jscomp.JSError var67 = com.google.javascript.jscomp.JSError.make("", 0, 1, var35, var39, var63);
    com.google.javascript.jscomp.JSError var68 = com.google.javascript.jscomp.JSError.make("hi!.  at hi!: hi! line (unknown line) : 10", 1, (-1), var28, var31, var63);
    com.google.javascript.jscomp.JSError var69 = com.google.javascript.jscomp.JSError.make(": ", 100, (-1), var24, var63);
    com.google.javascript.jscomp.JSError var70 = com.google.javascript.jscomp.JSError.make("hi!: hi!: ", (-34), (-3), var3, var6, var63);
    int var71 = var70.getCharno();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 =
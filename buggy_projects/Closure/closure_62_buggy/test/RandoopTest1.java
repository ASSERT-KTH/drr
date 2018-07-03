
import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() {}
//   public void test1() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test1"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CheckLevel var2 = null;
//     com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.warning("", ": ");
//     com.google.javascript.jscomp.CheckLevel var9 = null;
//     com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)", ": : ");
//     com.google.javascript.jscomp.CheckLevel var16 = null;
//     com.google.javascript.jscomp.CheckLevel var18 = null;
//     com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.make("hi!. hi! at hi!: hi! line 0 : 3", var18, "hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.CheckLevel var24 = null;
//     com.google.javascript.jscomp.CheckLevel var26 = null;
//     com.google.javascript.jscomp.DiagnosticType var28 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var26, "hi!");
//     java.lang.String var29 = var28.toString();
//     com.google.javascript.jscomp.CheckLevel var33 = null;
//     com.google.javascript.jscomp.CheckLevel var35 = null;
//     com.google.javascript.jscomp.DiagnosticType var37 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var35, "hi!");
//     java.lang.String var38 = var37.toString();
//     com.google.javascript.jscomp.CheckLevel var40 = null;
//     com.google.javascript.jscomp.DiagnosticType var42 = com.google.javascript.jscomp.DiagnosticType.make("", var40, "hi!");
//     int var43 = var37.compareTo(var42);
//     java.lang.String[] var44 = null;
//     com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make(var37, var44);
//     com.google.javascript.jscomp.DiagnosticType var48 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "hi!");
//     int var49 = var37.compareTo(var48);
//     com.google.javascript.rhino.Node var51 = null;
//     com.google.javascript.rhino.Node var53 = null;
//     com.google.javascript.jscomp.DiagnosticType var56 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var58 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var59 = com.google.javascript.jscomp.JSError.make("hi!", var53, var56, var58);
//     boolean var61 = var56.equals((java.lang.Object)10);
//     com.google.javascript.jscomp.CheckLevel var65 = null;
//     com.google.javascript.jscomp.DiagnosticType var68 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var70 = new java.lang.String[] { "hi!: hi!"};
//     com.google.javascript.jscomp.JSError var71 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var65, var68, var70);
//     com.google.javascript.jscomp.JSError var72 = com.google.javascript.jscomp.JSError.make("hi!", var51, var56, var70);
//     com.google.javascript.jscomp.JSError var73 = com.google.javascript.jscomp.JSError.make("hi!", 0, 100, var33, var48, var70);
//     com.google.javascript.jscomp.JSError var74 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 8, var24, var28, var70);
//     com.google.javascript.jscomp.JSError var75 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi!: hi! line 0 : 3: ", 10, 3, var16, var20, var70);
//     com.google.javascript.jscomp.JSError var76 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi!: hi! line 0 : 3", 8, 0, var9, var12, var70);
//     com.google.javascript.jscomp.JSError var77 = com.google.javascript.jscomp.JSError.make("", var1, var2, var5, var70);
// 
//   }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf(": hi!: hi!: hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() {}
//   public void test3() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test3"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CheckLevel var2 = null;
//     com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column) line 3 : 5", "hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column): hi!: hi!: hi!: hi!");
//     java.lang.String[] var6 = null;
//     com.google.javascript.jscomp.JSError var7 = com.google.javascript.jscomp.JSError.make("", var1, var2, var5, var6);
// 
//   }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test4"); }


    com.google.javascript.jscomp.CheckLevel var3 = null;
    com.google.javascript.jscomp.CheckLevel var5 = null;
    com.google.javascript.jscomp.DiagnosticType var7 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var5, "hi!");
    java.lang.String var8 = var7.toString();
    com.google.javascript.jscomp.CheckLevel var10 = null;
    com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.make("", var10, "hi!");
    int var13 = var7.compareTo(var12);
    com.google.javascript.rhino.Node var15 = null;
    com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var20 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var21 = com.google.javascript.jscomp.JSError.make("hi!", var15, var18, var20);
    com.google.javascript.jscomp.JSError var22 = com.google.javascript.jscomp.JSError.make("hi!: hi!", 0, 3, var3, var7, var20);
    com.google.javascript.jscomp.DiagnosticType var23 = var22.getType();
    com.google.javascript.jscomp.CheckLevel var27 = null;
    com.google.javascript.jscomp.CheckLevel var29 = null;
    com.google.javascript.jscomp.DiagnosticType var31 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var29, "hi!");
    java.lang.String var32 = var31.toString();
    com.google.javascript.jscomp.CheckLevel var34 = null;
    com.google.javascript.jscomp.DiagnosticType var36 = com.google.javascript.jscomp.DiagnosticType.make("", var34, "hi!");
    int var37 = var31.compareTo(var36);
    com.google.javascript.rhino.Node var39 = null;
    com.google.javascript.jscomp.DiagnosticType var42 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var44 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make("hi!", var39, var42, var44);
    com.google.javascript.jscomp.JSError var46 = com.google.javascript.jscomp.JSError.make("hi!: hi!", 0, 3, var27, var31, var44);
    com.google.javascript.jscomp.DiagnosticType var47 = var46.getType();
    boolean var48 = var22.equals((java.lang.Object)var46);
    int var49 = var46.getCharno();
    com.google.javascript.jscomp.DiagnosticType var50 = var46.getType();
    com.google.javascript.jscomp.DiagnosticType var51 = var46.getType();
    com.google.javascript.jscomp.CheckLevel var55 = null;
    com.google.javascript.rhino.Node var57 = null;
    com.google.javascript.jscomp.DiagnosticType var60 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    com.google.javascript.rhino.Node var62 = null;
    com.google.javascript.jscomp.DiagnosticType var65 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var67 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var68 = com.google.javascript.jscomp.JSError.make("hi!", var62, var65, var67);
    com.google.javascript.jscomp.JSError var69 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var57, var60, var67);
    java.lang.String[] var70 = null;
    com.google.javascript.jscomp.JSError var71 = com.google.javascript.jscomp.JSError.make("hi!: hi!: hi!: hi!", 5, 5, var55, var60, var70);
    java.lang.Object var72 = null;
    boolean var73 = var71.equals(var72);
    boolean var74 = var46.equals((java.lang.Object)var73);
    java.lang.String var75 = var46.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!: hi!"+ "'", var8.equals("hi!: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 3);
    
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
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!: hi!"+ "'", var32.equals("hi!: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 3);
    
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
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "hi!. hi! at hi!: hi! line 0 : 3"+ "'", var75.equals("hi!. hi! at hi!: hi! line 0 : 3"));

  }

  public void test5() {}
//   public void test5() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test5"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.DiagnosticType var2 = null;
//     com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.disabled(": ", "");
//     java.lang.String var6 = var5.toString();
//     com.google.javascript.jscomp.CheckLevel var10 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.warning("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.rhino.Node var15 = null;
//     com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.disabled("", "hi!. hi! at (unknown source) line (unknown line) : (unknown column). hi! at hi! line 0 : 100");
//     com.google.javascript.rhino.Node var20 = null;
//     com.google.javascript.jscomp.DiagnosticType var23 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var25 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var26 = com.google.javascript.jscomp.JSError.make("hi!", var20, var23, var25);
//     com.google.javascript.jscomp.JSError var27 = com.google.javascript.jscomp.JSError.make("", var15, var18, var25);
//     com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make(": : : hi!. hi! at hi!: hi! line 0 : 3", (-46), 58, var10, var13, var25);
//     com.google.javascript.jscomp.JSError var29 = com.google.javascript.jscomp.JSError.make(var5, var25);
//     com.google.javascript.jscomp.JSError var30 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi!: hi!: hi! line 3 : -8", var1, var2, var25);
// 
//   }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test6"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column): hi!: hi!. hi! at hi!: hi!: hi! line 0 : 100");
    java.lang.String var3 = var2.toString();
    com.google.javascript.rhino.Node var8 = null;
    com.google.javascript.rhino.Node var10 = null;
    com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var15 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("hi!", var10, var13, var15);
    boolean var18 = var13.equals((java.lang.Object)10);
    com.google.javascript.jscomp.CheckLevel var22 = null;
    com.google.javascript.jscomp.DiagnosticType var25 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var27 = new java.lang.String[] { "hi!: hi!"};
    com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var22, var25, var27);
    com.google.javascript.jscomp.JSError var29 = com.google.javascript.jscomp.JSError.make("hi!", var8, var13, var27);
    com.google.javascript.rhino.Node var31 = null;
    com.google.javascript.jscomp.DiagnosticType var34 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    com.google.javascript.rhino.Node var36 = null;
    com.google.javascript.jscomp.DiagnosticType var39 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var41 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var42 = com.google.javascript.jscomp.JSError.make("hi!", var36, var39, var41);
    com.google.javascript.jscomp.JSError var43 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var31, var34, var41);
    com.google.javascript.jscomp.JSError var44 = com.google.javascript.jscomp.JSError.make("", (-64), 100, var13, var41);
    com.google.javascript.rhino.Node var49 = null;
    com.google.javascript.rhino.Node var51 = null;
    com.google.javascript.jscomp.DiagnosticType var54 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var56 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var57 = com.google.javascript.jscomp.JSError.make("hi!", var51, var54, var56);
    boolean var59 = var54.equals((java.lang.Object)10);
    com.google.javascript.jscomp.CheckLevel var63 = null;
    com.google.javascript.jscomp.DiagnosticType var66 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var68 = new java.lang.String[] { "hi!: hi!"};
    com.google.javascript.jscomp.JSError var69 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var63, var66, var68);
    com.google.javascript.jscomp.JSError var70 = com.google.javascript.jscomp.JSError.make("hi!", var49, var54, var68);
    com.google.javascript.rhino.Node var72 = null;
    com.google.javascript.jscomp.DiagnosticType var75 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    com.google.javascript.rhino.Node var77 = null;
    com.google.javascript.jscomp.DiagnosticType var80 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var82 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var83 = com.google.javascript.jscomp.JSError.make("hi!", var77, var80, var82);
    com.google.javascript.jscomp.JSError var84 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var72, var75, var82);
    com.google.javascript.jscomp.JSError var85 = com.google.javascript.jscomp.JSError.make("", (-64), 100, var54, var82);
    com.google.javascript.jscomp.JSError var86 = com.google.javascript.jscomp.JSError.make(var13, var82);
    boolean var87 = var2.equals((java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!. hi! at (unknown source) line (unknown line) : (unknown column): hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column): hi!: hi!. hi! at hi!: hi!: hi! line 0 : 100"+ "'", var3.equals("hi!. hi! at (unknown source) line (unknown line) : (unknown column): hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column): hi!: hi!. hi! at hi!: hi!: hi! line 0 : 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
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
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test7"); }


    com.google.javascript.jscomp.CheckLevel var4 = null;
    com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.make("", var4, "hi!: hi!. hi! at (unknown source) line -64 : 100");
    com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.warning(". hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0", "hi!. hi! at hi!: hi! line 0 : 3");
    com.google.javascript.jscomp.CheckLevel var16 = null;
    com.google.javascript.jscomp.CheckLevel var18 = null;
    com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.make("", var18, "");
    com.google.javascript.jscomp.CheckLevel var24 = null;
    com.google.javascript.rhino.Node var26 = null;
    com.google.javascript.rhino.Node var28 = null;
    com.google.javascript.rhino.Node var30 = null;
    com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var35 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var36 = com.google.javascript.jscomp.JSError.make("hi!", var30, var33, var35);
    boolean var38 = var33.equals((java.lang.Object)10);
    com.google.javascript.jscomp.CheckLevel var42 = null;
    com.google.javascript.jscomp.DiagnosticType var45 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var47 = new java.lang.String[] { "hi!: hi!"};
    com.google.javascript.jscomp.JSError var48 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var42, var45, var47);
    com.google.javascript.jscomp.JSError var49 = com.google.javascript.jscomp.JSError.make("hi!", var28, var33, var47);
    com.google.javascript.jscomp.DiagnosticType var50 = var49.getType();
    com.google.javascript.jscomp.CheckLevel var54 = null;
    com.google.javascript.jscomp.CheckLevel var56 = null;
    com.google.javascript.jscomp.DiagnosticType var58 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var56, "hi!");
    java.lang.String var59 = var58.toString();
    com.google.javascript.jscomp.CheckLevel var61 = null;
    com.google.javascript.jscomp.DiagnosticType var63 = com.google.javascript.jscomp.DiagnosticType.make("", var61, "hi!");
    int var64 = var58.compareTo(var63);
    com.google.javascript.rhino.Node var66 = null;
    com.google.javascript.jscomp.DiagnosticType var69 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var71 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var72 = com.google.javascript.jscomp.JSError.make("hi!", var66, var69, var71);
    com.google.javascript.jscomp.JSError var73 = com.google.javascript.jscomp.JSError.make("hi!", (-1), 10, var54, var63, var71);
    com.google.javascript.jscomp.JSError var74 = com.google.javascript.jscomp.JSError.make(": ", var26, var50, var71);
    com.google.javascript.jscomp.CheckLevel var78 = null;
    com.google.javascript.jscomp.CheckLevel var80 = null;
    com.google.javascript.jscomp.DiagnosticType var82 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var80, "hi!: hi!");
    com.google.javascript.jscomp.DiagnosticType var85 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "hi!");
    int var86 = var82.compareTo(var85);
    com.google.javascript.rhino.Node var88 = null;
    com.google.javascript.jscomp.DiagnosticType var91 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var93 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var94 = com.google.javascript.jscomp.JSError.make("hi!", var88, var91, var93);
    com.google.javascript.jscomp.JSError var95 = com.google.javascript.jscomp.JSError.make("hi!: hi!", 12, 0, var78, var82, var93);
    com.google.javascript.jscomp.JSError var96 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi!: hi! line 0 : 3", (-1), (-8), var24, var50, var93);
    com.google.javascript.jscomp.JSError var97 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at hi!: hi! line (unknown line) : 10", (-46), 1, var16, var20, var93);
    com.google.javascript.jscomp.JSError var98 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at hi!. hi! at hi!: hi! line 0 : 3 line (unknown line) : -8", 66, 18, var12, var93);
    com.google.javascript.jscomp.JSError var99 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column). hi! at (unknown source) line 0 : 1", (-8), (-5), var6, var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
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
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "hi!: hi!"+ "'", var59.equals("hi!: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 3);
    
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
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
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

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test8"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make(". hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0: hi!: hi!: hi!: hi!: hi!: hi!: hi!: hi!", var1, "hi!: hi!. hi! at hi!. hi! at hi!: hi! line 0 : 3 line (unknown line) : -8");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test9() {}
//   public void test9() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test9"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CheckLevel var2 = null;
//     com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "hi!");
//     com.google.javascript.rhino.Node var7 = null;
//     com.google.javascript.jscomp.DiagnosticType var10 = com.google.javascript.jscomp.DiagnosticType.warning("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "");
//     com.google.javascript.rhino.Node var15 = null;
//     com.google.javascript.rhino.Node var17 = null;
//     com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var22 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var23 = com.google.javascript.jscomp.JSError.make("hi!", var17, var20, var22);
//     boolean var25 = var20.equals((java.lang.Object)10);
//     com.google.javascript.jscomp.CheckLevel var29 = null;
//     com.google.javascript.jscomp.DiagnosticType var32 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var34 = new java.lang.String[] { "hi!: hi!"};
//     com.google.javascript.jscomp.JSError var35 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var29, var32, var34);
//     com.google.javascript.jscomp.JSError var36 = com.google.javascript.jscomp.JSError.make("hi!", var15, var20, var34);
//     com.google.javascript.rhino.Node var38 = null;
//     com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.rhino.Node var43 = null;
//     com.google.javascript.jscomp.DiagnosticType var46 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var48 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var49 = com.google.javascript.jscomp.JSError.make("hi!", var43, var46, var48);
//     com.google.javascript.jscomp.JSError var50 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var38, var41, var48);
//     com.google.javascript.jscomp.JSError var51 = com.google.javascript.jscomp.JSError.make("", (-64), 100, var20, var48);
//     com.google.javascript.jscomp.JSError var52 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var7, var10, var48);
//     com.google.javascript.jscomp.JSError var53 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at : hi!. hi! at hi!: hi! line 0 : 3 line (unknown line) : (unknown column)", var1, var2, var5, var48);
// 
//   }

  public void test10() {}
//   public void test10() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test10"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!: hi!: hi!. hi! at hi!: hi!: hi! line 0 : 100", "hi!. hi! at hi!: hi! line 0 : 3");
//     com.google.javascript.jscomp.CheckLevel var9 = null;
//     com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var14 = new java.lang.String[] { "hi!: hi!"};
//     com.google.javascript.jscomp.JSError var15 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var9, var12, var14);
//     com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at : hi!. hi! at hi!: hi! line 0 : 3 line (unknown line) : (unknown column)", 0, 3, var5, var14);
//     com.google.javascript.jscomp.CheckLevel var20 = null;
//     com.google.javascript.jscomp.CheckLevel var22 = null;
//     com.google.javascript.jscomp.DiagnosticType var24 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var22, "hi!");
//     java.lang.String var25 = var24.toString();
//     com.google.javascript.jscomp.CheckLevel var27 = null;
//     com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.make("", var27, "hi!");
//     int var30 = var24.compareTo(var29);
//     com.google.javascript.rhino.Node var32 = null;
//     com.google.javascript.jscomp.DiagnosticType var35 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var37 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var38 = com.google.javascript.jscomp.JSError.make("hi!", var32, var35, var37);
//     com.google.javascript.jscomp.JSError var39 = com.google.javascript.jscomp.JSError.make("hi!: hi!", 0, 3, var20, var24, var37);
//     com.google.javascript.jscomp.DiagnosticType var40 = var39.getType();
//     com.google.javascript.jscomp.CheckLevel var44 = null;
//     com.google.javascript.jscomp.CheckLevel var46 = null;
//     com.google.javascript.jscomp.DiagnosticType var48 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var46, "hi!");
//     java.lang.String var49 = var48.toString();
//     com.google.javascript.jscomp.CheckLevel var51 = null;
//     com.google.javascript.jscomp.DiagnosticType var53 = com.google.javascript.jscomp.DiagnosticType.make("", var51, "hi!");
//     int var54 = var48.compareTo(var53);
//     com.google.javascript.rhino.Node var56 = null;
//     com.google.javascript.jscomp.DiagnosticType var59 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var61 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var62 = com.google.javascript.jscomp.JSError.make("hi!", var56, var59, var61);
//     com.google.javascript.jscomp.JSError var63 = com.google.javascript.jscomp.JSError.make("hi!: hi!", 0, 3, var44, var48, var61);
//     com.google.javascript.jscomp.DiagnosticType var64 = var63.getType();
//     boolean var65 = var39.equals((java.lang.Object)var63);
//     java.lang.String var66 = var63.toString();
//     com.google.javascript.jscomp.DiagnosticType var67 = var63.getType();
//     int var68 = var5.compareTo(var67);
//     com.google.javascript.jscomp.DiagnosticType var69 = null;
//     int var70 = var67.compareTo(var69);
// 
//   }

  public void test11() {}
//   public void test11() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test11"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var4 = null;
//     com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var4, "hi!");
//     java.lang.String var7 = var6.toString();
//     com.google.javascript.jscomp.CheckLevel var9 = null;
//     com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.make("", var9, "hi!");
//     int var12 = var6.compareTo(var11);
//     java.lang.String[] var13 = null;
//     com.google.javascript.jscomp.JSError var14 = com.google.javascript.jscomp.JSError.make(var6, var13);
//     com.google.javascript.jscomp.DiagnosticType var17 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "hi!");
//     boolean var18 = var6.equals((java.lang.Object)var17);
//     java.lang.String var19 = var6.toString();
//     com.google.javascript.rhino.Node var21 = null;
//     com.google.javascript.jscomp.DiagnosticType var24 = com.google.javascript.jscomp.DiagnosticType.warning("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "");
//     com.google.javascript.rhino.Node var29 = null;
//     com.google.javascript.rhino.Node var31 = null;
//     com.google.javascript.jscomp.DiagnosticType var34 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var36 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var37 = com.google.javascript.jscomp.JSError.make("hi!", var31, var34, var36);
//     boolean var39 = var34.equals((java.lang.Object)10);
//     com.google.javascript.jscomp.CheckLevel var43 = null;
//     com.google.javascript.jscomp.DiagnosticType var46 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var48 = new java.lang.String[] { "hi!: hi!"};
//     com.google.javascript.jscomp.JSError var49 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var43, var46, var48);
//     com.google.javascript.jscomp.JSError var50 = com.google.javascript.jscomp.JSError.make("hi!", var29, var34, var48);
//     com.google.javascript.rhino.Node var52 = null;
//     com.google.javascript.jscomp.DiagnosticType var55 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.rhino.Node var57 = null;
//     com.google.javascript.jscomp.DiagnosticType var60 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var62 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var63 = com.google.javascript.jscomp.JSError.make("hi!", var57, var60, var62);
//     com.google.javascript.jscomp.JSError var64 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var52, var55, var62);
//     com.google.javascript.jscomp.JSError var65 = com.google.javascript.jscomp.JSError.make("", (-64), 100, var34, var62);
//     com.google.javascript.jscomp.JSError var66 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var21, var24, var62);
//     com.google.javascript.jscomp.JSError var67 = com.google.javascript.jscomp.JSError.make("", (-1), 5, var6, var62);
//     java.lang.Object var68 = null;
//     boolean var69 = var67.equals(var68);
//     int var70 = var67.getCharno();
//     com.google.javascript.jscomp.CheckLevel var71 = null;
//     com.google.javascript.jscomp.MessageFormatter var72 = null;
//     java.lang.String var73 = var67.format(var71, var72);
// 
//   }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test12"); }


    com.google.javascript.jscomp.CheckLevel var4 = null;
    com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var4, "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    com.google.javascript.rhino.Node var8 = null;
    com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var13 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var14 = com.google.javascript.jscomp.JSError.make("hi!", var8, var11, var13);
    int var15 = var6.compareTo(var11);
    com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    int var19 = var6.compareTo(var18);
    java.lang.Object var20 = null;
    boolean var21 = var6.equals(var20);
    com.google.javascript.jscomp.DiagnosticType var27 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at hi!: hi! line 0 : 3: ", "hi!: hi!. hi! at (unknown source) line -64 : 100");
    com.google.javascript.rhino.Node var29 = null;
    com.google.javascript.rhino.Node var31 = null;
    com.google.javascript.rhino.Node var33 = null;
    com.google.javascript.jscomp.DiagnosticType var36 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var38 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var39 = com.google.javascript.jscomp.JSError.make("hi!", var33, var36, var38);
    boolean var41 = var36.equals((java.lang.Object)10);
    com.google.javascript.jscomp.CheckLevel var45 = null;
    com.google.javascript.jscomp.DiagnosticType var48 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var50 = new java.lang.String[] { "hi!: hi!"};
    com.google.javascript.jscomp.JSError var51 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var45, var48, var50);
    com.google.javascript.jscomp.JSError var52 = com.google.javascript.jscomp.JSError.make("hi!", var31, var36, var50);
    com.google.javascript.jscomp.DiagnosticType var53 = var52.getType();
    com.google.javascript.jscomp.DiagnosticType var56 = com.google.javascript.jscomp.DiagnosticType.error(". hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0", "hi!. hi! at hi!: hi! line 0 : 3");
    int var57 = var53.compareTo(var56);
    com.google.javascript.jscomp.DiagnosticType var63 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!: hi!: hi!", "hi!: hi!: hi!: hi!");
    com.google.javascript.jscomp.CheckLevel var67 = null;
    com.google.javascript.jscomp.CheckLevel var69 = null;
    com.google.javascript.jscomp.DiagnosticType var71 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var69, "hi!: hi!");
    com.google.javascript.jscomp.DiagnosticType var74 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "hi!");
    int var75 = var71.compareTo(var74);
    com.google.javascript.rhino.Node var77 = null;
    com.google.javascript.jscomp.DiagnosticType var80 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var82 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var83 = com.google.javascript.jscomp.JSError.make("hi!", var77, var80, var82);
    com.google.javascript.jscomp.JSError var84 = com.google.javascript.jscomp.JSError.make("hi!: hi!", 12, 0, var67, var71, var82);
    com.google.javascript.jscomp.JSError var85 = com.google.javascript.jscomp.JSError.make(". hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0", (-1), 0, var63, var82);
    com.google.javascript.jscomp.JSError var86 = com.google.javascript.jscomp.JSError.make("hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var29, var53, var82);
    com.google.javascript.jscomp.JSError var87 = com.google.javascript.jscomp.JSError.make("hi!: hi!: ", (-43), 0, var27, var82);
    com.google.javascript.jscomp.JSError var88 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column). hi! at (unknown source) line 0 : 1", (-28), 66, var6, var82);
    com.google.javascript.jscomp.DiagnosticType var89 = var88.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
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
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
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

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test13"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error("", "hi!: hi!. hi! at (unknown source) line 66 : -12");
    com.google.javascript.jscomp.CheckLevel var4 = null;
    com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var4, "hi!: hi!. hi! at (unknown source) line -64 : 100");
    int var7 = var2.compareTo(var6);
    com.google.javascript.jscomp.DiagnosticType var10 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!. hi! at : hi!. hi! at hi!: hi! line 0 : 3 line (unknown line) : (unknown column)", "hi!: hi!. hi! at (unknown source) line -64 : 100");
    boolean var11 = var6.equals((java.lang.Object)"hi!: hi!. hi! at : hi!. hi! at hi!: hi! line 0 : 3 line (unknown line) : (unknown column)");
    com.google.javascript.jscomp.CheckLevel var15 = null;
    com.google.javascript.jscomp.CheckLevel var17 = null;
    com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var17, ". hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0");
    java.lang.String var20 = var19.toString();
    com.google.javascript.jscomp.CheckLevel var24 = null;
    com.google.javascript.jscomp.DiagnosticType var27 = com.google.javascript.jscomp.DiagnosticType.warning(": : ", "hi!. hi! at (unknown source) line (unknown line) : (unknown column): hi!");
    com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.warning("hi!. hi! at hi!: hi! line 0 : 3", "hi!");
    com.google.javascript.jscomp.DiagnosticType var39 = com.google.javascript.jscomp.DiagnosticType.warning("hi!: hi!", "hi!: hi!");
    com.google.javascript.jscomp.CheckLevel var43 = null;
    com.google.javascript.jscomp.DiagnosticType var46 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var48 = new java.lang.String[] { "hi!: hi!"};
    com.google.javascript.jscomp.JSError var49 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var43, var46, var48);
    com.google.javascript.jscomp.JSError var50 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 100, var39, var48);
    com.google.javascript.jscomp.JSError var51 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column). hi! at hi! line 0 : 100", (-28), (-3), var33, var48);
    com.google.javascript.jscomp.JSError var52 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at hi!: hi!. hi! at hi!: hi! line (unknown line) : 10 line (unknown line) : (unknown column)", (-58), (-28), var24, var27, var48);
    com.google.javascript.jscomp.JSError var53 = com.google.javascript.jscomp.JSError.make(": hi!. hi! at hi!: hi! line 0 : 3: hi!: hi!: hi!. hi! at hi!: hi!: hi! line 0 : 100", (-3), 5, var15, var19, var48);
    java.lang.String var54 = var19.toString();
    boolean var55 = var6.equals((java.lang.Object)var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-77));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column): . hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0"+ "'", var20.equals("hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column): . hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
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
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column): . hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0"+ "'", var54.equals("hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column): . hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test14"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!: ", "hi!: hi!: hi!: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test15"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning("hi!: hi!. hi! at hi!: hi!. hi! at hi!: hi! line (unknown line) : 10 line (unknown line) : (unknown column)", "hi!: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test16"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!: hi!: hi!", "hi!: hi!: hi!: hi!");
    java.lang.String var3 = var2.toString();
    com.google.javascript.rhino.Node var5 = null;
    com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.disabled("", "hi!. hi! at (unknown source) line (unknown line) : (unknown column). hi! at hi! line 0 : 100");
    com.google.javascript.rhino.Node var10 = null;
    com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var15 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("hi!", var10, var13, var15);
    com.google.javascript.jscomp.JSError var17 = com.google.javascript.jscomp.JSError.make("", var5, var8, var15);
    int var18 = var2.compareTo(var8);
    com.google.javascript.jscomp.CheckLevel var20 = null;
    com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column): : : ", var20, "hi!: hi!. hi! at hi!: hi! line -8 : 10. hi! at hi!: hi!. hi! at hi! line (unknown line) : (unknown column) line 0 : -12");
    int var23 = var2.compareTo(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!: hi!: hi!: hi!: hi!: hi!: hi!: hi!"+ "'", var3.equals("hi!: hi!: hi!: hi!: hi!: hi!: hi!: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 12);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test17"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning("hi!: hi!. hi!. hi! at (unknown source) line (unknown line) : (unknown column) at (unknown source) line (unknown line) : (unknown column)", "hi!: hi!. hi! at (unknown source) line 66 : -12");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test18"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!: hi!: hi!", var1, ". hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0");
    com.google.javascript.rhino.Node var5 = null;
    com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line (unknown line) : (unknown column). hi! at hi! line 0 : 100", "hi!. hi! at (unknown source) line (unknown line) : (unknown column). :  at (unknown source) line 8 : 12");
    com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.disabled(": : ", "hi!. hi! at hi!: hi! line 0 : 3");
    com.google.javascript.jscomp.CheckLevel var18 = null;
    com.google.javascript.jscomp.CheckLevel var20 = null;
    com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.make("hi!. hi! at hi!: hi! line 0 : 3", var20, "");
    com.google.javascript.jscomp.CheckLevel var26 = null;
    com.google.javascript.jscomp.CheckLevel var28 = null;
    com.google.javascript.jscomp.DiagnosticType var30 = com.google.javascript.jscomp.DiagnosticType.make("hi!. hi! at hi!: hi! line 0 : 3", var28, "hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    com.google.javascript.jscomp.CheckLevel var34 = null;
    com.google.javascript.jscomp.CheckLevel var36 = null;
    com.google.javascript.jscomp.DiagnosticType var38 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var36, "hi!");
    java.lang.String var39 = var38.toString();
    com.google.javascript.jscomp.CheckLevel var43 = null;
    com.google.javascript.jscomp.CheckLevel var45 = null;
    com.google.javascript.jscomp.DiagnosticType var47 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var45, "hi!");
    java.lang.String var48 = var47.toString();
    com.google.javascript.jscomp.CheckLevel var50 = null;
    com.google.javascript.jscomp.DiagnosticType var52 = com.google.javascript.jscomp.DiagnosticType.make("", var50, "hi!");
    int var53 = var47.compareTo(var52);
    java.lang.String[] var54 = null;
    com.google.javascript.jscomp.JSError var55 = com.google.javascript.jscomp.JSError.make(var47, var54);
    com.google.javascript.jscomp.DiagnosticType var58 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "hi!");
    int var59 = var47.compareTo(var58);
    com.google.javascript.rhino.Node var61 = null;
    com.google.javascript.rhino.Node var63 = null;
    com.google.javascript.jscomp.DiagnosticType var66 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var68 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var69 = com.google.javascript.jscomp.JSError.make("hi!", var63, var66, var68);
    boolean var71 = var66.equals((java.lang.Object)10);
    com.google.javascript.jscomp.CheckLevel var75 = null;
    com.google.javascript.jscomp.DiagnosticType var78 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var80 = new java.lang.String[] { "hi!: hi!"};
    com.google.javascript.jscomp.JSError var81 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var75, var78, var80);
    com.google.javascript.jscomp.JSError var82 = com.google.javascript.jscomp.JSError.make("hi!", var61, var66, var80);
    com.google.javascript.jscomp.JSError var83 = com.google.javascript.jscomp.JSError.make("hi!", 0, 100, var43, var58, var80);
    com.google.javascript.jscomp.JSError var84 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 8, var34, var38, var80);
    com.google.javascript.jscomp.JSError var85 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi!: hi! line 0 : 3: ", 10, 3, var26, var30, var80);
    com.google.javascript.jscomp.JSError var86 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi!. hi! at (unknown source) line (unknown line) : (unknown column) at (unknown source) line (unknown line) : (unknown column)", 30, (-3), var18, var22, var80);
    com.google.javascript.jscomp.JSError var87 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at hi!: hi!: hi! line 0 : 100: : ", (-64), 35, var14, var80);
    com.google.javascript.jscomp.JSError var88 = com.google.javascript.jscomp.JSError.make("hi!: hi!: hi!: hi!: hi!: hi!: hi!: hi!", var5, var8, var80);
    com.google.javascript.jscomp.JSError var89 = com.google.javascript.jscomp.JSError.make(var3, var80);
    java.lang.String var90 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!: hi!"+ "'", var39.equals("hi!: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!: hi!"+ "'", var48.equals("hi!: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == (-64));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
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
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var90 + "' != '" + "hi!: hi!: hi!: hi!: . hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0"+ "'", var90.equals("hi!: hi!: hi!: hi!: . hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test19"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf("hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column): hi!. hi! at hi!: hi! line 0 : 3");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test20"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!. hi! at hi!: hi! line (unknown line) : 10. hi!: hi!. hi! at hi!: hi!. hi! at hi!: hi! line (unknown line) : 10 line (unknown line) : (unknown column) at (unknown source) line (unknown line) : (unknown column)", var1, "hi!: hi!: hi!. hi!. hi! at (unknown source) line (unknown line) : (unknown column) at (unknown source) line (unknown line) : (unknown column)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test21"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf("hi!: hi!. hi! at hi!: hi!: hi! line 0 : 100: : : : ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test22"); }


    com.google.javascript.jscomp.CheckLevel var3 = null;
    com.google.javascript.jscomp.CheckLevel var5 = null;
    com.google.javascript.jscomp.DiagnosticType var7 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var5, "hi!");
    com.google.javascript.jscomp.CheckLevel var9 = null;
    com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var9, "hi!");
    java.lang.String var12 = var11.toString();
    com.google.javascript.jscomp.CheckLevel var14 = null;
    com.google.javascript.jscomp.DiagnosticType var16 = com.google.javascript.jscomp.DiagnosticType.make("", var14, "hi!");
    int var17 = var11.compareTo(var16);
    java.lang.String[] var18 = null;
    com.google.javascript.jscomp.JSError var19 = com.google.javascript.jscomp.JSError.make(var11, var18);
    com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "hi!");
    boolean var23 = var11.equals((java.lang.Object)var22);
    int var24 = var7.compareTo(var22);
    com.google.javascript.jscomp.CheckLevel var26 = null;
    com.google.javascript.jscomp.DiagnosticType var28 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var26, "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    com.google.javascript.rhino.Node var30 = null;
    com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var35 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var36 = com.google.javascript.jscomp.JSError.make("hi!", var30, var33, var35);
    int var37 = var28.compareTo(var33);
    com.google.javascript.rhino.Node var39 = null;
    com.google.javascript.jscomp.DiagnosticType var42 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    com.google.javascript.rhino.Node var44 = null;
    com.google.javascript.jscomp.DiagnosticType var47 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var49 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var50 = com.google.javascript.jscomp.JSError.make("hi!", var44, var47, var49);
    com.google.javascript.jscomp.JSError var51 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var39, var42, var49);
    com.google.javascript.jscomp.JSError var52 = com.google.javascript.jscomp.JSError.make(var28, var49);
    com.google.javascript.jscomp.JSError var53 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)", 66, 46, var3, var7, var49);
    java.lang.String var54 = var53.toString();
    java.lang.Object var55 = null;
    boolean var56 = var53.equals(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!: hi!"+ "'", var12.equals("hi!: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi!: hi!. hi! at hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column) line 66 : 46"+ "'", var54.equals("hi!: hi!. hi! at hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column) line 66 : 46"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test23"); }


    com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.warning("hi!: hi!", "hi!: hi!");
    com.google.javascript.jscomp.CheckLevel var9 = null;
    com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var14 = new java.lang.String[] { "hi!: hi!"};
    com.google.javascript.jscomp.JSError var15 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var9, var12, var14);
    com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 100, var5, var14);
    int var17 = var16.getCharno();
    int var18 = var16.getCharno();
    java.lang.String var19 = var16.toString();
    
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
    assertTrue(var17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!: hi!. hi!: hi! at hi!: hi! line (unknown line) : 100"+ "'", var19.equals("hi!: hi!. hi!: hi! at hi!: hi! line (unknown line) : 100"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test24"); }


    com.google.javascript.jscomp.CheckLevel var3 = null;
    com.google.javascript.rhino.Node var8 = null;
    com.google.javascript.rhino.Node var10 = null;
    com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var15 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("hi!", var10, var13, var15);
    boolean var18 = var13.equals((java.lang.Object)10);
    com.google.javascript.jscomp.CheckLevel var22 = null;
    com.google.javascript.jscomp.DiagnosticType var25 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var27 = new java.lang.String[] { "hi!: hi!"};
    com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var22, var25, var27);
    com.google.javascript.jscomp.JSError var29 = com.google.javascript.jscomp.JSError.make("hi!", var8, var13, var27);
    com.google.javascript.rhino.Node var31 = null;
    com.google.javascript.jscomp.DiagnosticType var34 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    com.google.javascript.rhino.Node var36 = null;
    com.google.javascript.jscomp.DiagnosticType var39 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var41 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var42 = com.google.javascript.jscomp.JSError.make("hi!", var36, var39, var41);
    com.google.javascript.jscomp.JSError var43 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var31, var34, var41);
    com.google.javascript.jscomp.JSError var44 = com.google.javascript.jscomp.JSError.make("", (-64), 100, var13, var41);
    com.google.javascript.jscomp.DiagnosticType var45 = var44.getType();
    com.google.javascript.jscomp.CheckLevel var47 = null;
    com.google.javascript.jscomp.DiagnosticType var49 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var47, "");
    boolean var50 = var44.equals((java.lang.Object)"hi!");
    com.google.javascript.jscomp.DiagnosticType var53 = com.google.javascript.jscomp.DiagnosticType.warning("hi!", "hi!: hi!. hi! at hi!: hi!: hi! line 0 : 100");
    boolean var54 = var44.equals((java.lang.Object)var53);
    java.lang.String var55 = var53.toString();
    java.lang.String[] var56 = null;
    com.google.javascript.jscomp.JSError var57 = com.google.javascript.jscomp.JSError.make("hi!: hi!", 8, 67, var3, var53, var56);
    com.google.javascript.jscomp.CheckLevel var59 = null;
    com.google.javascript.jscomp.DiagnosticType var61 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var59, "hi!");
    java.lang.String var62 = var61.toString();
    com.google.javascript.jscomp.CheckLevel var64 = null;
    com.google.javascript.jscomp.DiagnosticType var66 = com.google.javascript.jscomp.DiagnosticType.make("", var64, "hi!");
    int var67 = var61.compareTo(var66);
    java.lang.String[] var68 = null;
    com.google.javascript.jscomp.JSError var69 = com.google.javascript.jscomp.JSError.make(var61, var68);
    int var70 = var69.getCharno();
    java.lang.String var71 = var69.toString();
    com.google.javascript.jscomp.CheckLevel var75 = null;
    com.google.javascript.jscomp.CheckLevel var77 = null;
    com.google.javascript.jscomp.DiagnosticType var79 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var77, "hi!");
    java.lang.String var80 = var79.toString();
    com.google.javascript.jscomp.CheckLevel var82 = null;
    com.google.javascript.jscomp.DiagnosticType var84 = com.google.javascript.jscomp.DiagnosticType.make("", var82, "hi!");
    int var85 = var79.compareTo(var84);
    com.google.javascript.rhino.Node var87 = null;
    com.google.javascript.jscomp.DiagnosticType var90 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var92 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var93 = com.google.javascript.jscomp.JSError.make("hi!", var87, var90, var92);
    com.google.javascript.jscomp.JSError var94 = com.google.javascript.jscomp.JSError.make("hi!: hi!", 0, 3, var75, var79, var92);
    com.google.javascript.jscomp.DiagnosticType var95 = var94.getType();
    boolean var96 = var69.equals((java.lang.Object)var95);
    boolean var97 = var53.equals((java.lang.Object)var96);
    java.lang.Object var98 = null;
    boolean var99 = var53.equals(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
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
    assertNotNull(var39);
    
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
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!: hi!: hi!. hi! at hi!: hi!: hi! line 0 : 100"+ "'", var55.equals("hi!: hi!: hi!. hi! at hi!: hi!: hi! line 0 : 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "hi!: hi!"+ "'", var62.equals("hi!: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "hi!. hi! at (unknown source) line (unknown line) : (unknown column)"+ "'", var71.equals("hi!. hi! at (unknown source) line (unknown line) : (unknown column)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "hi!: hi!"+ "'", var80.equals("hi!: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 3);
    
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
    assertTrue(var96 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var99 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test25"); }


    com.google.javascript.jscomp.CheckLevel var3 = null;
    com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.error(". hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0", "hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    java.lang.String[] var7 = null;
    com.google.javascript.jscomp.JSError var8 = com.google.javascript.jscomp.JSError.make("hi!: hi!: hi!", 35, (-64), var3, var6, var7);
    java.lang.String var9 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ". hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)"+ "'", var9.equals(". hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)"));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test26"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf("hi!.  at hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column) line (unknown line) : (unknown column): hi!: hi!. hi! at hi!: hi! line (unknown line) : 10");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test27"); }


    com.google.javascript.jscomp.CheckLevel var3 = null;
    com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var8 = new java.lang.String[] { "hi!: hi!"};
    com.google.javascript.jscomp.JSError var9 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var3, var6, var8);
    com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.warning("hi!. hi! at hi!: hi! line 0 : 3", "hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    boolean var13 = var9.equals((java.lang.Object)"hi!. hi! at hi!: hi! line 0 : 3");
    java.lang.Object var14 = null;
    boolean var15 = var9.equals(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test28() {}
//   public void test28() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test28"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.DiagnosticType var4 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!: hi!: hi!: hi!: hi!: hi!: hi!: hi!");
//     com.google.javascript.rhino.Node var6 = null;
//     com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.warning("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "");
//     com.google.javascript.rhino.Node var14 = null;
//     com.google.javascript.rhino.Node var16 = null;
//     com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var21 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var22 = com.google.javascript.jscomp.JSError.make("hi!", var16, var19, var21);
//     boolean var24 = var19.equals((java.lang.Object)10);
//     com.google.javascript.jscomp.CheckLevel var28 = null;
//     com.google.javascript.jscomp.DiagnosticType var31 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var33 = new java.lang.String[] { "hi!: hi!"};
//     com.google.javascript.jscomp.JSError var34 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var28, var31, var33);
//     com.google.javascript.jscomp.JSError var35 = com.google.javascript.jscomp.JSError.make("hi!", var14, var19, var33);
//     com.google.javascript.rhino.Node var37 = null;
//     com.google.javascript.jscomp.DiagnosticType var40 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.rhino.Node var42 = null;
//     com.google.javascript.jscomp.DiagnosticType var45 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var47 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var48 = com.google.javascript.jscomp.JSError.make("hi!", var42, var45, var47);
//     com.google.javascript.jscomp.JSError var49 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var37, var40, var47);
//     com.google.javascript.jscomp.JSError var50 = com.google.javascript.jscomp.JSError.make("", (-64), 100, var19, var47);
//     com.google.javascript.jscomp.JSError var51 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var6, var9, var47);
//     com.google.javascript.jscomp.JSError var52 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at hi!: hi! line -8 : 10", var1, var4, var47);
//     int var53 = var52.getCharno();
//     com.google.javascript.jscomp.CheckLevel var54 = null;
//     com.google.javascript.jscomp.MessageFormatter var55 = null;
//     java.lang.String var56 = var52.format(var54, var55);
// 
//   }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test29"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at (unknown source) line (unknown line) : (unknown column). hi! at (unknown source) line 0 : 1. hi!:  at (unknown source) line (unknown line) : (unknown column)", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test30() {}
//   public void test30() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test30"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.DiagnosticType var4 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line (unknown line) : (unknown column). hi! at (unknown source) line 0 : 1", "hi!. hi! at (unknown source) line (unknown line) : (unknown column): hi!");
//     com.google.javascript.jscomp.CheckLevel var8 = null;
//     com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)", ": : ");
//     com.google.javascript.jscomp.DiagnosticType var17 = com.google.javascript.jscomp.DiagnosticType.disabled(": ", ": hi!. hi! at hi!: hi! line 0 : 3");
//     com.google.javascript.rhino.Node var19 = null;
//     com.google.javascript.rhino.Node var21 = null;
//     com.google.javascript.jscomp.DiagnosticType var24 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var26 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var27 = com.google.javascript.jscomp.JSError.make("hi!", var21, var24, var26);
//     boolean var29 = var24.equals((java.lang.Object)10);
//     com.google.javascript.jscomp.CheckLevel var33 = null;
//     com.google.javascript.jscomp.DiagnosticType var36 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var38 = new java.lang.String[] { "hi!: hi!"};
//     com.google.javascript.jscomp.JSError var39 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var33, var36, var38);
//     com.google.javascript.jscomp.JSError var40 = com.google.javascript.jscomp.JSError.make("hi!", var19, var24, var38);
//     com.google.javascript.jscomp.JSError var41 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi!: hi!: hi! line 3 : -8", (-46), 58, var17, var38);
//     com.google.javascript.jscomp.JSError var42 = com.google.javascript.jscomp.JSError.make("", (-3), 3, var8, var11, var38);
//     com.google.javascript.jscomp.JSError var43 = com.google.javascript.jscomp.JSError.make("", var1, var4, var38);
//     com.google.javascript.jscomp.CheckLevel var44 = null;
//     com.google.javascript.jscomp.MessageFormatter var45 = null;
//     java.lang.String var46 = var43.format(var44, var45);
// 
//   }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test31"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line (unknown line) : (unknown column). hi! at (unknown source) line 0 : 1", "hi!: ");
    com.google.javascript.rhino.Node var4 = null;
    com.google.javascript.rhino.Node var6 = null;
    com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var11 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var12 = com.google.javascript.jscomp.JSError.make("hi!", var6, var9, var11);
    boolean var14 = var9.equals((java.lang.Object)10);
    com.google.javascript.jscomp.CheckLevel var18 = null;
    com.google.javascript.jscomp.DiagnosticType var21 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var23 = new java.lang.String[] { "hi!: hi!"};
    com.google.javascript.jscomp.JSError var24 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var18, var21, var23);
    com.google.javascript.jscomp.JSError var25 = com.google.javascript.jscomp.JSError.make("hi!", var4, var9, var23);
    com.google.javascript.jscomp.DiagnosticType var28 = com.google.javascript.jscomp.DiagnosticType.warning("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    boolean var29 = var25.equals((java.lang.Object)"hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    boolean var30 = var2.equals((java.lang.Object)"hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test32"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("hi!. hi! at hi!: hi! line 0 : 3.  at (unknown source) line (unknown line) : (unknown column)", var1, "hi!: hi!. hi! at hi!: hi!: hi! line 0 : 100: : : : ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test33() {}
//   public void test33() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test33"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CheckLevel var2 = null;
//     com.google.javascript.jscomp.CheckLevel var4 = null;
//     com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.make("", var4, "hi!: hi!: hi!. hi! at hi!: hi!: hi! line 0 : 100: ");
//     com.google.javascript.jscomp.CheckLevel var10 = null;
//     com.google.javascript.jscomp.CheckLevel var12 = null;
//     com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.make("", var12, "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.CheckLevel var18 = null;
//     com.google.javascript.jscomp.CheckLevel var20 = null;
//     com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var20, "hi!");
//     java.lang.String var23 = var22.toString();
//     com.google.javascript.jscomp.CheckLevel var25 = null;
//     com.google.javascript.jscomp.DiagnosticType var27 = com.google.javascript.jscomp.DiagnosticType.make("", var25, "hi!");
//     int var28 = var22.compareTo(var27);
//     com.google.javascript.rhino.Node var30 = null;
//     com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var35 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var36 = com.google.javascript.jscomp.JSError.make("hi!", var30, var33, var35);
//     com.google.javascript.jscomp.JSError var37 = com.google.javascript.jscomp.JSError.make("hi!: hi!", 0, 3, var18, var22, var35);
//     com.google.javascript.jscomp.JSError var38 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi!: hi! line 0 : 3", 10, 64, var10, var14, var35);
//     com.google.javascript.jscomp.JSError var39 = com.google.javascript.jscomp.JSError.make(": : : hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var1, var2, var6, var35);
// 
//   }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test34"); }


    com.google.javascript.jscomp.CheckLevel var3 = null;
    com.google.javascript.jscomp.CheckLevel var7 = null;
    com.google.javascript.jscomp.CheckLevel var9 = null;
    com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var9, "hi!: hi!");
    com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "hi!");
    int var15 = var11.compareTo(var14);
    com.google.javascript.rhino.Node var17 = null;
    com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var22 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var23 = com.google.javascript.jscomp.JSError.make("hi!", var17, var20, var22);
    com.google.javascript.jscomp.JSError var24 = com.google.javascript.jscomp.JSError.make("hi!: hi!", 12, 0, var7, var11, var22);
    java.lang.String[] var26 = new java.lang.String[] { "hi!. hi! at hi!: hi! line 0 : 3: "};
    com.google.javascript.jscomp.JSError var27 = com.google.javascript.jscomp.JSError.make("", 30, 0, var3, var11, var26);
    com.google.javascript.jscomp.DiagnosticType var28 = var27.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test35() {}
//   public void test35() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test35"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CheckLevel var2 = null;
//     com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at hi!: hi! line 0 : 3", "hi!: hi!. hi! at hi!: hi! line (unknown line) : 10");
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var7, "hi!");
//     java.lang.String var10 = var9.toString();
//     com.google.javascript.jscomp.CheckLevel var12 = null;
//     com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.make("", var12, "hi!");
//     int var15 = var9.compareTo(var14);
//     java.lang.String[] var16 = null;
//     com.google.javascript.jscomp.JSError var17 = com.google.javascript.jscomp.JSError.make(var9, var16);
//     com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     boolean var21 = var9.equals((java.lang.Object)"hi!: hi!");
//     com.google.javascript.jscomp.CheckLevel var25 = null;
//     com.google.javascript.rhino.Node var27 = null;
//     com.google.javascript.rhino.Node var29 = null;
//     com.google.javascript.rhino.Node var31 = null;
//     com.google.javascript.jscomp.DiagnosticType var34 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var36 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var37 = com.google.javascript.jscomp.JSError.make("hi!", var31, var34, var36);
//     boolean var39 = var34.equals((java.lang.Object)10);
//     com.google.javascript.jscomp.CheckLevel var43 = null;
//     com.google.javascript.jscomp.DiagnosticType var46 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var48 = new java.lang.String[] { "hi!: hi!"};
//     com.google.javascript.jscomp.JSError var49 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var43, var46, var48);
//     com.google.javascript.jscomp.JSError var50 = com.google.javascript.jscomp.JSError.make("hi!", var29, var34, var48);
//     com.google.javascript.jscomp.DiagnosticType var51 = var50.getType();
//     com.google.javascript.jscomp.CheckLevel var55 = null;
//     com.google.javascript.jscomp.CheckLevel var57 = null;
//     com.google.javascript.jscomp.DiagnosticType var59 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var57, "hi!");
//     java.lang.String var60 = var59.toString();
//     com.google.javascript.jscomp.CheckLevel var62 = null;
//     com.google.javascript.jscomp.DiagnosticType var64 = com.google.javascript.jscomp.DiagnosticType.make("", var62, "hi!");
//     int var65 = var59.compareTo(var64);
//     com.google.javascript.rhino.Node var67 = null;
//     com.google.javascript.jscomp.DiagnosticType var70 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var72 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var73 = com.google.javascript.jscomp.JSError.make("hi!", var67, var70, var72);
//     com.google.javascript.jscomp.JSError var74 = com.google.javascript.jscomp.JSError.make("hi!", (-1), 10, var55, var64, var72);
//     com.google.javascript.jscomp.JSError var75 = com.google.javascript.jscomp.JSError.make(": ", var27, var51, var72);
//     com.google.javascript.jscomp.CheckLevel var79 = null;
//     com.google.javascript.jscomp.CheckLevel var81 = null;
//     com.google.javascript.jscomp.DiagnosticType var83 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var81, "hi!: hi!");
//     com.google.javascript.jscomp.DiagnosticType var86 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "hi!");
//     int var87 = var83.compareTo(var86);
//     com.google.javascript.rhino.Node var89 = null;
//     com.google.javascript.jscomp.DiagnosticType var92 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var94 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var95 = com.google.javascript.jscomp.JSError.make("hi!", var89, var92, var94);
//     com.google.javascript.jscomp.JSError var96 = com.google.javascript.jscomp.JSError.make("hi!: hi!", 12, 0, var79, var83, var94);
//     com.google.javascript.jscomp.JSError var97 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi!: hi! line 0 : 3", (-1), (-8), var25, var51, var94);
//     com.google.javascript.jscomp.JSError var98 = com.google.javascript.jscomp.JSError.make(var9, var94);
//     com.google.javascript.jscomp.JSError var99 = com.google.javascript.jscomp.JSError.make("", var1, var2, var5, var94);
// 
//   }

  public void test36() {}
//   public void test36() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test36"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CheckLevel var2 = null;
//     com.google.javascript.jscomp.CheckLevel var4 = null;
//     com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var4, "hi!");
//     java.lang.String var7 = var6.toString();
//     com.google.javascript.jscomp.CheckLevel var9 = null;
//     com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.make("", var9, "hi!");
//     int var12 = var6.compareTo(var11);
//     com.google.javascript.jscomp.CheckLevel var16 = null;
//     com.google.javascript.jscomp.CheckLevel var18 = null;
//     com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var18, "hi!");
//     java.lang.String var21 = var20.toString();
//     com.google.javascript.jscomp.CheckLevel var23 = null;
//     com.google.javascript.jscomp.DiagnosticType var25 = com.google.javascript.jscomp.DiagnosticType.make("", var23, "hi!");
//     int var26 = var20.compareTo(var25);
//     com.google.javascript.rhino.Node var28 = null;
//     com.google.javascript.jscomp.DiagnosticType var31 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var33 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var34 = com.google.javascript.jscomp.JSError.make("hi!", var28, var31, var33);
//     com.google.javascript.jscomp.JSError var35 = com.google.javascript.jscomp.JSError.make("hi!", (-1), 10, var16, var25, var33);
//     int var36 = var6.compareTo(var25);
//     com.google.javascript.rhino.Node var38 = null;
//     com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!: hi!. hi! at hi!: hi!. hi! at hi!: hi! line (unknown line) : 10 line (unknown line) : (unknown column)", ". hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0");
//     com.google.javascript.jscomp.CheckLevel var46 = null;
//     com.google.javascript.jscomp.DiagnosticType var48 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var46, ": hi!");
//     com.google.javascript.jscomp.DiagnosticType var51 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!: hi!. hi!. hi! at (unknown source) line (unknown line) : (unknown column) at (unknown source) line (unknown line) : (unknown column)", "hi!");
//     com.google.javascript.jscomp.CheckLevel var55 = null;
//     com.google.javascript.jscomp.DiagnosticType var58 = com.google.javascript.jscomp.DiagnosticType.warning(": : ", "hi!. hi! at (unknown source) line (unknown line) : (unknown column): hi!");
//     com.google.javascript.jscomp.DiagnosticType var64 = com.google.javascript.jscomp.DiagnosticType.warning("hi!. hi! at hi!: hi! line 0 : 3", "hi!");
//     com.google.javascript.jscomp.DiagnosticType var70 = com.google.javascript.jscomp.DiagnosticType.warning("hi!: hi!", "hi!: hi!");
//     com.google.javascript.jscomp.CheckLevel var74 = null;
//     com.google.javascript.jscomp.DiagnosticType var77 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var79 = new java.lang.String[] { "hi!: hi!"};
//     com.google.javascript.jscomp.JSError var80 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var74, var77, var79);
//     com.google.javascript.jscomp.JSError var81 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 100, var70, var79);
//     com.google.javascript.jscomp.JSError var82 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column). hi! at hi! line 0 : 100", (-28), (-3), var64, var79);
//     com.google.javascript.jscomp.JSError var83 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at hi!: hi!. hi! at hi!: hi! line (unknown line) : 10 line (unknown line) : (unknown column)", (-58), (-28), var55, var58, var79);
//     com.google.javascript.jscomp.JSError var84 = com.google.javascript.jscomp.JSError.make(var51, var79);
//     com.google.javascript.jscomp.JSError var85 = com.google.javascript.jscomp.JSError.make(". hi!: hi!. hi! at (unknown source) line 66 : -12 at (unknown source) line (unknown line) : (unknown column)", (-28), 72, var48, var79);
//     com.google.javascript.jscomp.JSError var86 = com.google.javascript.jscomp.JSError.make("hi!: hi!: hi!: hi!: hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column): hi!: hi!. hi! at (unknown source) line -64 : 100", var38, var41, var79);
//     com.google.javascript.jscomp.JSError var87 = com.google.javascript.jscomp.JSError.make(". hi!: hi!: hi!: hi!: hi!: hi!: hi!: hi! at hi!: hi!. hi! at hi!: hi! line -8 : 10 line (unknown line) : (unknown column)", var1, var2, var25, var79);
// 
//   }

  public void test37() {}
//   public void test37() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test37"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column). hi!. hi! at (unknown source) line (unknown line) : (unknown column). hi! at hi! line 0 : 100 at hi!:  line 66 : 3");
// 
//   }

  public void test38() {}
//   public void test38() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test38"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var3 = null;
//     com.google.javascript.rhino.Node var5 = null;
//     com.google.javascript.jscomp.CheckLevel var9 = null;
//     com.google.javascript.jscomp.CheckLevel var13 = null;
//     com.google.javascript.jscomp.CheckLevel var17 = null;
//     com.google.javascript.jscomp.CheckLevel var19 = null;
//     com.google.javascript.jscomp.DiagnosticType var21 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var19, "hi!");
//     java.lang.String var22 = var21.toString();
//     com.google.javascript.jscomp.CheckLevel var24 = null;
//     com.google.javascript.jscomp.DiagnosticType var26 = com.google.javascript.jscomp.DiagnosticType.make("", var24, "hi!");
//     int var27 = var21.compareTo(var26);
//     com.google.javascript.rhino.Node var29 = null;
//     com.google.javascript.jscomp.DiagnosticType var32 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var34 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var35 = com.google.javascript.jscomp.JSError.make("hi!", var29, var32, var34);
//     com.google.javascript.jscomp.JSError var36 = com.google.javascript.jscomp.JSError.make("hi!: hi!", 0, 3, var17, var21, var34);
//     java.lang.String[] var37 = null;
//     com.google.javascript.jscomp.JSError var38 = com.google.javascript.jscomp.JSError.make("hi!: hi!", 0, 10, var13, var21, var37);
//     com.google.javascript.rhino.Node var40 = null;
//     com.google.javascript.jscomp.DiagnosticType var43 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var45 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var46 = com.google.javascript.jscomp.JSError.make("hi!", var40, var43, var45);
//     com.google.javascript.jscomp.JSError var47 = com.google.javascript.jscomp.JSError.make("", (-1), 10, var9, var21, var45);
//     com.google.javascript.jscomp.DiagnosticType var50 = com.google.javascript.jscomp.DiagnosticType.warning("hi!: hi!", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     java.lang.String var51 = var50.toString();
//     boolean var52 = var21.equals((java.lang.Object)var51);
//     java.lang.String var53 = var21.toString();
//     java.lang.String var54 = var21.toString();
//     com.google.javascript.jscomp.DiagnosticType var57 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at hi!: hi! line 0 : 3", "");
//     com.google.javascript.jscomp.DiagnosticType var63 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!: hi!", "hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.rhino.Node var65 = null;
//     com.google.javascript.jscomp.CheckLevel var69 = null;
//     com.google.javascript.jscomp.DiagnosticType var72 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var74 = new java.lang.String[] { "hi!: hi!"};
//     com.google.javascript.jscomp.JSError var75 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var69, var72, var74);
//     com.google.javascript.jscomp.CheckLevel var79 = null;
//     com.google.javascript.jscomp.DiagnosticType var82 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var84 = new java.lang.String[] { "hi!: hi!"};
//     com.google.javascript.jscomp.JSError var85 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var79, var82, var84);
//     com.google.javascript.jscomp.JSError var86 = com.google.javascript.jscomp.JSError.make("hi!: hi!", var65, var72, var84);
//     com.google.javascript.jscomp.JSError var87 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)", (-42), 3, var63, var84);
//     com.google.javascript.jscomp.JSError var88 = com.google.javascript.jscomp.JSError.make(var57, var84);
//     com.google.javascript.jscomp.JSError var89 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at hi!: hi!. hi! at hi!: hi! line (unknown line) : 10 line (unknown line) : (unknown column): hi!: hi!. hi!. hi! at (unknown source) line (unknown line) : (unknown column) at hi!: hi! line (unknown line) : (unknown column)", var5, var21, var84);
//     com.google.javascript.jscomp.JSError var90 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at hi!: hi!. hi! at hi!: hi! line (unknown line) : 10 line (unknown line) : (unknown column)", 1, (-14), var3, var84);
// 
//   }

  public void test39() {}
//   public void test39() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test39"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column): hi!. hi! at hi!: hi! line 0 : 3");
// 
//   }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test40"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!: hi!. hi! at hi!: hi!: hi! line 0 : 100", ". hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test41() {}
//   public void test41() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test41"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.warning("hi!. hi! at hi!: hi! line 0 : 3", "hi!");
//     com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.warning("hi!: hi!", "hi!: hi!");
//     com.google.javascript.jscomp.CheckLevel var15 = null;
//     com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var20 = new java.lang.String[] { "hi!: hi!"};
//     com.google.javascript.jscomp.JSError var21 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var15, var18, var20);
//     com.google.javascript.jscomp.JSError var22 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 100, var11, var20);
//     com.google.javascript.jscomp.JSError var23 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column). hi! at hi! line 0 : 100", (-28), (-3), var5, var20);
//     com.google.javascript.jscomp.CheckLevel var24 = null;
//     com.google.javascript.jscomp.MessageFormatter var25 = null;
//     java.lang.String var26 = var23.format(var24, var25);
// 
//   }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test42"); }


    com.google.javascript.jscomp.CheckLevel var3 = null;
    com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.disabled("", "hi!: hi!: hi!. hi! at hi!: hi!: hi! line 0 : 100");
    com.google.javascript.jscomp.CheckLevel var10 = null;
    com.google.javascript.rhino.Node var12 = null;
    com.google.javascript.rhino.Node var14 = null;
    com.google.javascript.rhino.Node var16 = null;
    com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var21 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var22 = com.google.javascript.jscomp.JSError.make("hi!", var16, var19, var21);
    boolean var24 = var19.equals((java.lang.Object)10);
    com.google.javascript.jscomp.CheckLevel var28 = null;
    com.google.javascript.jscomp.DiagnosticType var31 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var33 = new java.lang.String[] { "hi!: hi!"};
    com.google.javascript.jscomp.JSError var34 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var28, var31, var33);
    com.google.javascript.jscomp.JSError var35 = com.google.javascript.jscomp.JSError.make("hi!", var14, var19, var33);
    com.google.javascript.jscomp.DiagnosticType var36 = var35.getType();
    com.google.javascript.jscomp.CheckLevel var40 = null;
    com.google.javascript.jscomp.CheckLevel var42 = null;
    com.google.javascript.jscomp.DiagnosticType var44 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var42, "hi!");
    java.lang.String var45 = var44.toString();
    com.google.javascript.jscomp.CheckLevel var47 = null;
    com.google.javascript.jscomp.DiagnosticType var49 = com.google.javascript.jscomp.DiagnosticType.make("", var47, "hi!");
    int var50 = var44.compareTo(var49);
    com.google.javascript.rhino.Node var52 = null;
    com.google.javascript.jscomp.DiagnosticType var55 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var57 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var58 = com.google.javascript.jscomp.JSError.make("hi!", var52, var55, var57);
    com.google.javascript.jscomp.JSError var59 = com.google.javascript.jscomp.JSError.make("hi!", (-1), 10, var40, var49, var57);
    com.google.javascript.jscomp.JSError var60 = com.google.javascript.jscomp.JSError.make(": ", var12, var36, var57);
    com.google.javascript.jscomp.CheckLevel var64 = null;
    com.google.javascript.jscomp.CheckLevel var66 = null;
    com.google.javascript.jscomp.DiagnosticType var68 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var66, "hi!: hi!");
    com.google.javascript.jscomp.DiagnosticType var71 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "hi!");
    int var72 = var68.compareTo(var71);
    com.google.javascript.rhino.Node var74 = null;
    com.google.javascript.jscomp.DiagnosticType var77 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var79 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var80 = com.google.javascript.jscomp.JSError.make("hi!", var74, var77, var79);
    com.google.javascript.jscomp.JSError var81 = com.google.javascript.jscomp.JSError.make("hi!: hi!", 12, 0, var64, var68, var79);
    com.google.javascript.jscomp.JSError var82 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi!: hi! line 0 : 3", (-1), (-8), var10, var36, var79);
    com.google.javascript.jscomp.JSError var83 = com.google.javascript.jscomp.JSError.make(". hi!: hi!: hi!: hi!: hi!: hi!: hi!: hi! at hi!: hi!. hi! at hi!: hi! line -8 : 10 line (unknown line) : (unknown column)", 0, 1, var3, var6, var79);
    java.lang.String var84 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
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
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!: hi!"+ "'", var45.equals("hi!: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 3);
    
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
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 12);
    
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
    assertTrue("'" + var84 + "' != '" + ": hi!: hi!: hi!. hi! at hi!: hi!: hi! line 0 : 100"+ "'", var84.equals(": hi!: hi!: hi!. hi! at hi!: hi!: hi! line 0 : 100"));

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test43"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled("", "hi!: hi!. hi! at (unknown source) line -64 : 100");
    java.lang.String var3 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ": hi!: hi!. hi! at (unknown source) line -64 : 100"+ "'", var3.equals(": hi!: hi!. hi! at (unknown source) line -64 : 100"));

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test44"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!. hi! at hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column) line 66 : 46", var1, "hi!. hi! at (unknown source) line (unknown line) : (unknown column). hi! at (unknown source) line 0 : 1. hi!:  at (unknown source) line (unknown line) : (unknown column)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test45"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make(": hi!. hi! at hi!: hi! line 0 : 3: hi!: hi!: hi!. hi! at hi!: hi!: hi! line 0 : 100", var1, "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test46"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf("hi!. hi! at (unknown source) line (unknown line) : (unknown column). hi! at (unknown source) line 0 : 1. hi!. hi! at (unknown source) line (unknown line) : (unknown column): hi! at (unknown source) line (unknown line) : (unknown column)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test47"); }


    com.google.javascript.jscomp.CheckLevel var3 = null;
    com.google.javascript.jscomp.CheckLevel var7 = null;
    com.google.javascript.jscomp.CheckLevel var9 = null;
    com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var9, "hi!");
    java.lang.String var12 = var11.toString();
    com.google.javascript.jscomp.CheckLevel var16 = null;
    com.google.javascript.jscomp.CheckLevel var18 = null;
    com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var18, "hi!");
    java.lang.String var21 = var20.toString();
    com.google.javascript.jscomp.CheckLevel var23 = null;
    com.google.javascript.jscomp.DiagnosticType var25 = com.google.javascript.jscomp.DiagnosticType.make("", var23, "hi!");
    int var26 = var20.compareTo(var25);
    java.lang.String[] var27 = null;
    com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make(var20, var27);
    com.google.javascript.jscomp.DiagnosticType var31 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "hi!");
    int var32 = var20.compareTo(var31);
    com.google.javascript.rhino.Node var34 = null;
    com.google.javascript.rhino.Node var36 = null;
    com.google.javascript.jscomp.DiagnosticType var39 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var41 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var42 = com.google.javascript.jscomp.JSError.make("hi!", var36, var39, var41);
    boolean var44 = var39.equals((java.lang.Object)10);
    com.google.javascript.jscomp.CheckLevel var48 = null;
    com.google.javascript.jscomp.DiagnosticType var51 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var53 = new java.lang.String[] { "hi!: hi!"};
    com.google.javascript.jscomp.JSError var54 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var48, var51, var53);
    com.google.javascript.jscomp.JSError var55 = com.google.javascript.jscomp.JSError.make("hi!", var34, var39, var53);
    com.google.javascript.jscomp.JSError var56 = com.google.javascript.jscomp.JSError.make("hi!", 0, 100, var16, var31, var53);
    com.google.javascript.jscomp.JSError var57 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 8, var7, var11, var53);
    java.lang.String[] var58 = null;
    com.google.javascript.jscomp.JSError var59 = com.google.javascript.jscomp.JSError.make(var11, var58);
    com.google.javascript.jscomp.CheckLevel var64 = null;
    com.google.javascript.jscomp.DiagnosticType var66 = com.google.javascript.jscomp.DiagnosticType.make(". hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0", var64, "hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    com.google.javascript.jscomp.CheckLevel var68 = null;
    com.google.javascript.jscomp.DiagnosticType var70 = com.google.javascript.jscomp.DiagnosticType.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var68, ": ");
    com.google.javascript.rhino.Node var72 = null;
    com.google.javascript.jscomp.CheckLevel var76 = null;
    com.google.javascript.jscomp.DiagnosticType var79 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var81 = new java.lang.String[] { "hi!: hi!"};
    com.google.javascript.jscomp.JSError var82 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var76, var79, var81);
    com.google.javascript.jscomp.CheckLevel var86 = null;
    com.google.javascript.jscomp.DiagnosticType var89 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var91 = new java.lang.String[] { "hi!: hi!"};
    com.google.javascript.jscomp.JSError var92 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var86, var89, var91);
    com.google.javascript.jscomp.JSError var93 = com.google.javascript.jscomp.JSError.make("hi!: hi!", var72, var79, var91);
    com.google.javascript.jscomp.JSError var94 = com.google.javascript.jscomp.JSError.make(var70, var91);
    com.google.javascript.jscomp.JSError var95 = com.google.javascript.jscomp.JSError.make(". hi! at hi! line (unknown line) : 10", 66, 58, var66, var91);
    com.google.javascript.jscomp.JSError var96 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column): : : ", 30, (-28), var3, var11, var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!: hi!"+ "'", var12.equals("hi!: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!: hi!"+ "'", var21.equals("hi!: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-64));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
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
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
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

  }

  public void test48() {}
//   public void test48() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test48"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, ": : : hi!. hi! at hi!: hi! line 0 : 3");
// 
//   }

  public void test49() {}
//   public void test49() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test49"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var4 = null;
//     com.google.javascript.rhino.Node var6 = null;
//     com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.warning("hi!. hi! at (unknown source) line (unknown line) : (unknown column). hi! at (unknown source) line 0 : 1", "hi!. hi! at hi!: hi!: hi! line 3 : -8");
//     com.google.javascript.rhino.Node var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.error(". hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0", "hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.disabled("", "hi!. hi! at hi!: hi! line 0 : 3");
//     com.google.javascript.jscomp.CheckLevel var24 = null;
//     com.google.javascript.jscomp.CheckLevel var26 = null;
//     com.google.javascript.jscomp.DiagnosticType var28 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var26, "hi!");
//     java.lang.String var29 = var28.toString();
//     com.google.javascript.jscomp.CheckLevel var31 = null;
//     com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.make("", var31, "hi!");
//     int var34 = var28.compareTo(var33);
//     com.google.javascript.rhino.Node var36 = null;
//     com.google.javascript.jscomp.DiagnosticType var39 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var41 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var42 = com.google.javascript.jscomp.JSError.make("hi!", var36, var39, var41);
//     com.google.javascript.jscomp.JSError var43 = com.google.javascript.jscomp.JSError.make("hi!: hi!", 0, 3, var24, var28, var41);
//     com.google.javascript.jscomp.JSError var44 = com.google.javascript.jscomp.JSError.make("", (-64), 0, var20, var41);
//     int var45 = var14.compareTo(var20);
//     com.google.javascript.rhino.Node var47 = null;
//     com.google.javascript.rhino.Node var49 = null;
//     com.google.javascript.rhino.Node var51 = null;
//     com.google.javascript.jscomp.DiagnosticType var54 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var56 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var57 = com.google.javascript.jscomp.JSError.make("hi!", var51, var54, var56);
//     boolean var59 = var54.equals((java.lang.Object)10);
//     com.google.javascript.jscomp.CheckLevel var63 = null;
//     com.google.javascript.jscomp.DiagnosticType var66 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var68 = new java.lang.String[] { "hi!: hi!"};
//     com.google.javascript.jscomp.JSError var69 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var63, var66, var68);
//     com.google.javascript.jscomp.JSError var70 = com.google.javascript.jscomp.JSError.make("hi!", var49, var54, var68);
//     com.google.javascript.jscomp.DiagnosticType var71 = var70.getType();
//     com.google.javascript.jscomp.CheckLevel var75 = null;
//     com.google.javascript.jscomp.CheckLevel var77 = null;
//     com.google.javascript.jscomp.DiagnosticType var79 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var77, "hi!");
//     java.lang.String var80 = var79.toString();
//     com.google.javascript.jscomp.CheckLevel var82 = null;
//     com.google.javascript.jscomp.DiagnosticType var84 = com.google.javascript.jscomp.DiagnosticType.make("", var82, "hi!");
//     int var85 = var79.compareTo(var84);
//     com.google.javascript.rhino.Node var87 = null;
//     com.google.javascript.jscomp.DiagnosticType var90 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var92 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var93 = com.google.javascript.jscomp.JSError.make("hi!", var87, var90, var92);
//     com.google.javascript.jscomp.JSError var94 = com.google.javascript.jscomp.JSError.make("hi!", (-1), 10, var75, var84, var92);
//     com.google.javascript.jscomp.JSError var95 = com.google.javascript.jscomp.JSError.make(": ", var47, var71, var92);
//     com.google.javascript.jscomp.JSError var96 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var11, var20, var92);
//     com.google.javascript.jscomp.JSError var97 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi!. hi! at (unknown source) line (unknown line) : (unknown column) at (unknown source) line (unknown line) : (unknown column)", var6, var9, var92);
//     com.google.javascript.jscomp.JSError var98 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column): hi!: hi!. hi! at hi!: hi!: hi! line 0 : 100", (-77), (-46), var3, var4, var92);
// 
//   }

  public void test50() {}
//   public void test50() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test50"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var1 = null;
//     com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("hi!. hi!: hi!. hi! at hi!: hi!: hi! line 0 : 100 at (unknown source) line 1 : 58", var1, "hi!: hi!. hi! at hi!: hi!. hi! at hi!: hi! line (unknown line) : 10 line (unknown line) : (unknown column). hi!: hi!: hi!: hi! at hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column): hi!: hi!. hi! at (unknown source) line -64 : 100 line -3 : -3");
//     com.google.javascript.jscomp.DiagnosticType var4 = null;
//     int var5 = var3.compareTo(var4);
// 
//   }

  public void test51() {}
//   public void test51() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test51"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CheckLevel var2 = null;
//     com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.error("", "hi!: hi!. hi! at (unknown source) line 66 : -12");
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var7, "hi!: hi!. hi! at (unknown source) line -64 : 100");
//     int var10 = var5.compareTo(var9);
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!. hi! at (unknown source) line (unknown line) : (unknown column). hi! at hi! line 0 : 100");
//     com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at hi!: hi! line 0 : 3: ", "hi!: hi!. hi! at (unknown source) line -64 : 100");
//     com.google.javascript.rhino.Node var21 = null;
//     com.google.javascript.rhino.Node var23 = null;
//     com.google.javascript.rhino.Node var25 = null;
//     com.google.javascript.jscomp.DiagnosticType var28 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var30 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var31 = com.google.javascript.jscomp.JSError.make("hi!", var25, var28, var30);
//     boolean var33 = var28.equals((java.lang.Object)10);
//     com.google.javascript.jscomp.CheckLevel var37 = null;
//     com.google.javascript.jscomp.DiagnosticType var40 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var42 = new java.lang.String[] { "hi!: hi!"};
//     com.google.javascript.jscomp.JSError var43 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var37, var40, var42);
//     com.google.javascript.jscomp.JSError var44 = com.google.javascript.jscomp.JSError.make("hi!", var23, var28, var42);
//     com.google.javascript.jscomp.DiagnosticType var45 = var44.getType();
//     com.google.javascript.jscomp.DiagnosticType var48 = com.google.javascript.jscomp.DiagnosticType.error(". hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0", "hi!. hi! at hi!: hi! line 0 : 3");
//     int var49 = var45.compareTo(var48);
//     com.google.javascript.jscomp.DiagnosticType var55 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!: hi!: hi!", "hi!: hi!: hi!: hi!");
//     com.google.javascript.jscomp.CheckLevel var59 = null;
//     com.google.javascript.jscomp.CheckLevel var61 = null;
//     com.google.javascript.jscomp.DiagnosticType var63 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var61, "hi!: hi!");
//     com.google.javascript.jscomp.DiagnosticType var66 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "hi!");
//     int var67 = var63.compareTo(var66);
//     com.google.javascript.rhino.Node var69 = null;
//     com.google.javascript.jscomp.DiagnosticType var72 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var74 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var75 = com.google.javascript.jscomp.JSError.make("hi!", var69, var72, var74);
//     com.google.javascript.jscomp.JSError var76 = com.google.javascript.jscomp.JSError.make("hi!: hi!", 12, 0, var59, var63, var74);
//     com.google.javascript.jscomp.JSError var77 = com.google.javascript.jscomp.JSError.make(". hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0", (-1), 0, var55, var74);
//     com.google.javascript.jscomp.JSError var78 = com.google.javascript.jscomp.JSError.make("hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var21, var45, var74);
//     com.google.javascript.jscomp.JSError var79 = com.google.javascript.jscomp.JSError.make("hi!: hi!: ", (-43), 0, var19, var74);
//     com.google.javascript.jscomp.JSError var80 = com.google.javascript.jscomp.JSError.make(var13, var74);
//     com.google.javascript.jscomp.JSError var81 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at hi!: hi!. hi! at hi!: hi! line (unknown line) : 10 line (unknown line) : (unknown column): hi!: hi!. hi!. hi! at (unknown source) line (unknown line) : (unknown column) at hi!: hi! line (unknown line) : (unknown column)", var1, var2, var9, var74);
// 
//   }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test52"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf("hi!: hi!: hi!: hi!: . hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test53"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning(".  at hi!: hi!. hi! at hi!: hi! line (unknown line) : 10 line -46 : 1", "hi!. hi! at (unknown source) line (unknown line) : (unknown column): hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test54"); }


    com.google.javascript.jscomp.CheckLevel var3 = null;
    com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.error(": hi!. hi! at hi!: hi! line 0 : 3", ": hi!");
    java.lang.String var7 = var6.toString();
    com.google.javascript.jscomp.CheckLevel var12 = null;
    com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var12, "hi!: hi!: hi!: hi!");
    com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.disabled(": ", ": hi!. hi! at hi!: hi! line 0 : 3");
    com.google.javascript.rhino.Node var22 = null;
    com.google.javascript.rhino.Node var24 = null;
    com.google.javascript.jscomp.DiagnosticType var27 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var29 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var30 = com.google.javascript.jscomp.JSError.make("hi!", var24, var27, var29);
    boolean var32 = var27.equals((java.lang.Object)10);
    com.google.javascript.jscomp.CheckLevel var36 = null;
    com.google.javascript.jscomp.DiagnosticType var39 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var41 = new java.lang.String[] { "hi!: hi!"};
    com.google.javascript.jscomp.JSError var42 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var36, var39, var41);
    com.google.javascript.jscomp.JSError var43 = com.google.javascript.jscomp.JSError.make("hi!", var22, var27, var41);
    com.google.javascript.jscomp.JSError var44 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi!: hi!: hi! line 3 : -8", (-46), 58, var20, var41);
    com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make(". hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0: hi!. hi! at hi!: hi! line 0 : 3", 0, (-64), var14, var41);
    com.google.javascript.jscomp.JSError var46 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column): hi!: hi!. hi! at hi!: hi!: hi! line 0 : 100", (-28), 18, var3, var6, var41);
    java.lang.String var47 = var46.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ": hi!. hi! at hi!: hi! line 0 : 3: : hi!"+ "'", var7.equals(": hi!. hi! at hi!: hi! line 0 : 3: : hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
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
    assertTrue("'" + var47 + "' != '" + ": hi!. hi! at hi!: hi! line 0 : 3. : hi! at hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column): hi!: hi!. hi! at hi!: hi!: hi! line 0 : 100 line -28 : 18"+ "'", var47.equals(": hi!. hi! at hi!: hi! line 0 : 3. : hi! at hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column): hi!: hi!. hi! at hi!: hi!: hi! line 0 : 100 line -28 : 18"));

  }

  public void test55() {}
//   public void test55() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test55"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.rhino.Node var5 = null;
//     com.google.javascript.rhino.Node var7 = null;
//     com.google.javascript.jscomp.DiagnosticType var10 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var12 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var13 = com.google.javascript.jscomp.JSError.make("hi!", var7, var10, var12);
//     boolean var15 = var10.equals((java.lang.Object)10);
//     com.google.javascript.jscomp.CheckLevel var19 = null;
//     com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var24 = new java.lang.String[] { "hi!: hi!"};
//     com.google.javascript.jscomp.JSError var25 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var19, var22, var24);
//     com.google.javascript.jscomp.JSError var26 = com.google.javascript.jscomp.JSError.make("hi!", var5, var10, var24);
//     com.google.javascript.jscomp.CheckLevel var28 = null;
//     com.google.javascript.jscomp.DiagnosticType var30 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var28, "hi!: hi!");
//     boolean var31 = var26.equals((java.lang.Object)var30);
//     com.google.javascript.jscomp.DiagnosticType var34 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at hi!: hi! line 0 : 3", "");
//     com.google.javascript.jscomp.CheckLevel var38 = null;
//     com.google.javascript.jscomp.CheckLevel var40 = null;
//     com.google.javascript.jscomp.DiagnosticType var42 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var40, "hi!");
//     java.lang.String var43 = var42.toString();
//     com.google.javascript.jscomp.CheckLevel var45 = null;
//     com.google.javascript.jscomp.DiagnosticType var47 = com.google.javascript.jscomp.DiagnosticType.make("", var45, "hi!");
//     int var48 = var42.compareTo(var47);
//     java.lang.String[] var49 = null;
//     com.google.javascript.jscomp.JSError var50 = com.google.javascript.jscomp.JSError.make(var42, var49);
//     com.google.javascript.jscomp.DiagnosticType var53 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "hi!");
//     int var54 = var42.compareTo(var53);
//     com.google.javascript.rhino.Node var56 = null;
//     com.google.javascript.jscomp.CheckLevel var60 = null;
//     com.google.javascript.jscomp.DiagnosticType var63 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var65 = new java.lang.String[] { "hi!: hi!"};
//     com.google.javascript.jscomp.JSError var66 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var60, var63, var65);
//     com.google.javascript.jscomp.CheckLevel var70 = null;
//     com.google.javascript.jscomp.DiagnosticType var73 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var75 = new java.lang.String[] { "hi!: hi!"};
//     com.google.javascript.jscomp.JSError var76 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var70, var73, var75);
//     com.google.javascript.jscomp.JSError var77 = com.google.javascript.jscomp.JSError.make("hi!: hi!", var56, var63, var75);
//     com.google.javascript.jscomp.JSError var78 = com.google.javascript.jscomp.JSError.make("", 0, 1, var38, var53, var75);
//     com.google.javascript.jscomp.JSError var79 = com.google.javascript.jscomp.JSError.make(var34, var75);
//     com.google.javascript.jscomp.JSError var80 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column). hi! at hi! line 0 : 100", (-46), (-1), var3, var30, var75);
//     java.lang.String var81 = var80.toString();
//     com.google.javascript.jscomp.CheckLevel var82 = null;
//     com.google.javascript.jscomp.MessageFormatter var83 = null;
//     java.lang.String var84 = var80.format(var82, var83);
// 
//   }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test56"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("hi!. hi! at hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column) line 3 : 5", var1, ": hi!. hi! at (unknown source) line (unknown line) : (unknown column). hi! at hi! line 0 : 100");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test57"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!: hi!", "hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!: hi!. hi! at hi!: hi! line (unknown line) : 10", "");
    int var6 = var2.compareTo(var5);
    com.google.javascript.jscomp.CheckLevel var10 = null;
    com.google.javascript.jscomp.CheckLevel var12 = null;
    com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var12, ". hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0");
    java.lang.String var15 = var14.toString();
    com.google.javascript.jscomp.CheckLevel var19 = null;
    com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.warning(": : ", "hi!. hi! at (unknown source) line (unknown line) : (unknown column): hi!");
    com.google.javascript.jscomp.DiagnosticType var28 = com.google.javascript.jscomp.DiagnosticType.warning("hi!. hi! at hi!: hi! line 0 : 3", "hi!");
    com.google.javascript.jscomp.DiagnosticType var34 = com.google.javascript.jscomp.DiagnosticType.warning("hi!: hi!", "hi!: hi!");
    com.google.javascript.jscomp.CheckLevel var38 = null;
    com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var43 = new java.lang.String[] { "hi!: hi!"};
    com.google.javascript.jscomp.JSError var44 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var38, var41, var43);
    com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 100, var34, var43);
    com.google.javascript.jscomp.JSError var46 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column). hi! at hi! line 0 : 100", (-28), (-3), var28, var43);
    com.google.javascript.jscomp.JSError var47 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at hi!: hi!. hi! at hi!: hi! line (unknown line) : 10 line (unknown line) : (unknown column)", (-58), (-28), var19, var22, var43);
    com.google.javascript.jscomp.JSError var48 = com.google.javascript.jscomp.JSError.make(": hi!. hi! at hi!: hi! line 0 : 3: hi!: hi!: hi!. hi! at hi!: hi!: hi! line 0 : 100", (-3), 5, var10, var14, var43);
    java.lang.String var49 = var14.toString();
    int var50 = var5.compareTo(var14);
    java.lang.String var51 = var14.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-42));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column): . hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0"+ "'", var15.equals("hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column): . hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
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
    assertTrue("'" + var49 + "' != '" + "hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column): . hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0"+ "'", var49.equals("hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column): . hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == (-12));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column): . hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0"+ "'", var51.equals("hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column): . hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0"));

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test58"); }


    com.google.javascript.jscomp.CheckLevel var6 = null;
    com.google.javascript.jscomp.CheckLevel var8 = null;
    com.google.javascript.jscomp.DiagnosticType var10 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var8, "hi!");
    java.lang.String var11 = var10.toString();
    com.google.javascript.jscomp.CheckLevel var13 = null;
    com.google.javascript.jscomp.DiagnosticType var15 = com.google.javascript.jscomp.DiagnosticType.make("", var13, "hi!");
    int var16 = var10.compareTo(var15);
    java.lang.String[] var17 = null;
    com.google.javascript.jscomp.JSError var18 = com.google.javascript.jscomp.JSError.make(var10, var17);
    com.google.javascript.jscomp.DiagnosticType var21 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "hi!");
    int var22 = var10.compareTo(var21);
    com.google.javascript.rhino.Node var24 = null;
    com.google.javascript.jscomp.CheckLevel var28 = null;
    com.google.javascript.jscomp.DiagnosticType var31 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var33 = new java.lang.String[] { "hi!: hi!"};
    com.google.javascript.jscomp.JSError var34 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var28, var31, var33);
    com.google.javascript.jscomp.CheckLevel var38 = null;
    com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var43 = new java.lang.String[] { "hi!: hi!"};
    com.google.javascript.jscomp.JSError var44 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var38, var41, var43);
    com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make("hi!: hi!", var24, var31, var43);
    com.google.javascript.jscomp.JSError var46 = com.google.javascript.jscomp.JSError.make("", 0, 1, var6, var21, var43);
    com.google.javascript.jscomp.CheckLevel var50 = null;
    com.google.javascript.jscomp.CheckLevel var52 = null;
    com.google.javascript.jscomp.DiagnosticType var54 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var52, "hi!");
    java.lang.String var55 = var54.toString();
    com.google.javascript.jscomp.CheckLevel var57 = null;
    com.google.javascript.jscomp.DiagnosticType var59 = com.google.javascript.jscomp.DiagnosticType.make("", var57, "hi!");
    int var60 = var54.compareTo(var59);
    java.lang.String[] var61 = null;
    com.google.javascript.jscomp.JSError var62 = com.google.javascript.jscomp.JSError.make(var54, var61);
    com.google.javascript.jscomp.DiagnosticType var65 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "hi!");
    int var66 = var54.compareTo(var65);
    com.google.javascript.rhino.Node var68 = null;
    com.google.javascript.rhino.Node var70 = null;
    com.google.javascript.jscomp.DiagnosticType var73 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var75 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var76 = com.google.javascript.jscomp.JSError.make("hi!", var70, var73, var75);
    boolean var78 = var73.equals((java.lang.Object)10);
    com.google.javascript.jscomp.CheckLevel var82 = null;
    com.google.javascript.jscomp.DiagnosticType var85 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var87 = new java.lang.String[] { "hi!: hi!"};
    com.google.javascript.jscomp.JSError var88 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var82, var85, var87);
    com.google.javascript.jscomp.JSError var89 = com.google.javascript.jscomp.JSError.make("hi!", var68, var73, var87);
    com.google.javascript.jscomp.JSError var90 = com.google.javascript.jscomp.JSError.make("hi!", 0, 100, var50, var65, var87);
    com.google.javascript.jscomp.JSError var91 = com.google.javascript.jscomp.JSError.make("hi!", 10, 10, var21, var87);
    java.lang.String var92 = var21.toString();
    java.lang.String var93 = var21.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!: hi!"+ "'", var11.equals("hi!: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-64));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
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
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!: hi!"+ "'", var55.equals("hi!: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == (-64));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
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
    assertTrue("'" + var92 + "' != '" + "hi!. hi! at (unknown source) line (unknown line) : (unknown column): hi!"+ "'", var92.equals("hi!. hi! at (unknown source) line (unknown line) : (unknown column): hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var93 + "' != '" + "hi!. hi! at (unknown source) line (unknown line) : (unknown column): hi!"+ "'", var93.equals("hi!. hi! at (unknown source) line (unknown line) : (unknown column): hi!"));

  }

  public void test59() {}
//   public void test59() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test59"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, ": hi!: hi!: hi!");
// 
//   }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test60"); }


    com.google.javascript.rhino.Node var4 = null;
    com.google.javascript.rhino.Node var6 = null;
    com.google.javascript.rhino.Node var8 = null;
    com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var13 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var14 = com.google.javascript.jscomp.JSError.make("hi!", var8, var11, var13);
    boolean var16 = var11.equals((java.lang.Object)10);
    com.google.javascript.jscomp.CheckLevel var20 = null;
    com.google.javascript.jscomp.DiagnosticType var23 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var25 = new java.lang.String[] { "hi!: hi!"};
    com.google.javascript.jscomp.JSError var26 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var20, var23, var25);
    com.google.javascript.jscomp.JSError var27 = com.google.javascript.jscomp.JSError.make("hi!", var6, var11, var25);
    com.google.javascript.jscomp.DiagnosticType var28 = var27.getType();
    com.google.javascript.jscomp.CheckLevel var32 = null;
    com.google.javascript.jscomp.CheckLevel var34 = null;
    com.google.javascript.jscomp.DiagnosticType var36 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var34, "hi!");
    java.lang.String var37 = var36.toString();
    com.google.javascript.jscomp.CheckLevel var39 = null;
    com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.make("", var39, "hi!");
    int var42 = var36.compareTo(var41);
    com.google.javascript.rhino.Node var44 = null;
    com.google.javascript.jscomp.DiagnosticType var47 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var49 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var50 = com.google.javascript.jscomp.JSError.make("hi!", var44, var47, var49);
    com.google.javascript.jscomp.JSError var51 = com.google.javascript.jscomp.JSError.make("hi!", (-1), 10, var32, var41, var49);
    com.google.javascript.jscomp.JSError var52 = com.google.javascript.jscomp.JSError.make(": ", var4, var28, var49);
    com.google.javascript.jscomp.CheckLevel var54 = null;
    com.google.javascript.jscomp.DiagnosticType var56 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var54, "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    com.google.javascript.rhino.Node var58 = null;
    com.google.javascript.jscomp.DiagnosticType var61 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var63 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var64 = com.google.javascript.jscomp.JSError.make("hi!", var58, var61, var63);
    int var65 = var56.compareTo(var61);
    com.google.javascript.rhino.Node var67 = null;
    com.google.javascript.jscomp.DiagnosticType var70 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
    com.google.javascript.rhino.Node var72 = null;
    com.google.javascript.jscomp.DiagnosticType var75 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var77 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var78 = com.google.javascript.jscomp.JSError.make("hi!", var72, var75, var77);
    com.google.javascript.jscomp.JSError var79 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var67, var70, var77);
    com.google.javascript.jscomp.JSError var80 = com.google.javascript.jscomp.JSError.make(var56, var77);
    com.google.javascript.jscomp.JSError var81 = com.google.javascript.jscomp.JSError.make("", 67, 0, var28, var77);
    java.lang.String var82 = var28.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
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
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!: hi!"+ "'", var37.equals("hi!: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + "hi!: hi!: hi!"+ "'", var82.equals("hi!: hi!: hi!"));

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test61"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error("", "hi!. hi! at (unknown source) line (unknown line) : (unknown column). :  at (unknown source) line 8 : 12");
    com.google.javascript.jscomp.CheckLevel var7 = null;
    com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!. hi! at hi!: hi!: hi! line 0 : 100", var7, ". hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0");
    com.google.javascript.jscomp.DiagnosticType var15 = com.google.javascript.jscomp.DiagnosticType.warning("hi!. hi! at (unknown source) line (unknown line) : (unknown column). hi! at (unknown source) line 0 : 1", "");
    com.google.javascript.jscomp.CheckLevel var17 = null;
    com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var17, "hi!: hi!. hi! at (unknown source) line -64 : 100");
    com.google.javascript.jscomp.CheckLevel var21 = null;
    com.google.javascript.jscomp.DiagnosticType var23 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var21, "hi!");
    java.lang.String var24 = var23.toString();
    com.google.javascript.jscomp.CheckLevel var26 = null;
    com.google.javascript.jscomp.DiagnosticType var28 = com.google.javascript.jscomp.DiagnosticType.make("", var26, "hi!");
    int var29 = var23.compareTo(var28);
    java.lang.String[] var30 = null;
    com.google.javascript.jscomp.JSError var31 = com.google.javascript.jscomp.JSError.make(var23, var30);
    int var32 = var31.getCharno();
    java.lang.String var33 = var31.toString();
    com.google.javascript.jscomp.CheckLevel var37 = null;
    com.google.javascript.jscomp.CheckLevel var39 = null;
    com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var39, "hi!");
    java.lang.String var42 = var41.toString();
    com.google.javascript.jscomp.CheckLevel var44 = null;
    com.google.javascript.jscomp.DiagnosticType var46 = com.google.javascript.jscomp.DiagnosticType.make("", var44, "hi!");
    int var47 = var41.compareTo(var46);
    com.google.javascript.rhino.Node var49 = null;
    com.google.javascript.jscomp.DiagnosticType var52 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var54 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var55 = com.google.javascript.jscomp.JSError.make("hi!", var49, var52, var54);
    com.google.javascript.jscomp.JSError var56 = com.google.javascript.jscomp.JSError.make("hi!: hi!", 0, 3, var37, var41, var54);
    com.google.javascript.jscomp.DiagnosticType var57 = var56.getType();
    boolean var58 = var31.equals((java.lang.Object)var57);
    com.google.javascript.jscomp.DiagnosticType var64 = com.google.javascript.jscomp.DiagnosticType.disabled("", "hi!. hi! at hi!: hi! line 0 : 3");
    com.google.javascript.jscomp.CheckLevel var68 = null;
    com.google.javascript.jscomp.CheckLevel var70 = null;
    com.google.javascript.jscomp.DiagnosticType var72 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var70, "hi!");
    java.lang.String var73 = var72.toString();
    com.google.javascript.jscomp.CheckLevel var75 = null;
    com.google.javascript.jscomp.DiagnosticType var77 = com.google.javascript.jscomp.DiagnosticType.make("", var75, "hi!");
    int var78 = var72.compareTo(var77);
    com.google.javascript.rhino.Node var80 = null;
    com.google.javascript.jscomp.DiagnosticType var83 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var85 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var86 = com.google.javascript.jscomp.JSError.make("hi!", var80, var83, var85);
    com.google.javascript.jscomp.JSError var87 = com.google.javascript.jscomp.JSError.make("hi!: hi!", 0, 3, var68, var72, var85);
    com.google.javascript.jscomp.JSError var88 = com.google.javascript.jscomp.JSError.make("", (-64), 0, var64, var85);
    com.google.javascript.jscomp.JSError var89 = com.google.javascript.jscomp.JSError.make(var57, var85);
    com.google.javascript.jscomp.JSError var90 = com.google.javascript.jscomp.JSError.make(var19, var85);
    com.google.javascript.jscomp.JSError var91 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi!: hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column). hi! at hi! line 0 : 100 line -46 : (unknown column)", 46, 10, var15, var85);
    com.google.javascript.jscomp.JSError var92 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi!: hi! line 0 : 3: ", 45, (-1), var9, var85);
    int var93 = var2.compareTo(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!: hi!"+ "'", var24.equals("hi!: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!. hi! at (unknown source) line (unknown line) : (unknown column)"+ "'", var33.equals("hi!. hi! at (unknown source) line (unknown line) : (unknown column)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!: hi!"+ "'", var42.equals("hi!: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 3);
    
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
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "hi!: hi!"+ "'", var73.equals("hi!: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 3);
    
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
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == (-43));

  }

  public void test62() {}
//   public void test62() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test62"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CheckLevel var2 = null;
//     com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.warning("hi!: hi!. hi! at hi!. hi! at hi!: hi! line 0 : 3 line (unknown line) : -8", ": hi!. hi! at hi!: hi! line 0 : 3: hi!: hi!: hi!. hi! at hi!: hi!: hi! line 0 : 100");
//     java.lang.String[] var6 = null;
//     com.google.javascript.jscomp.JSError var7 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at hi!: hi! line (unknown line) : 10. hi!: hi!. hi! at hi!: hi!. hi! at hi!: hi! line (unknown line) : 10 line (unknown line) : (unknown column) at (unknown source) line (unknown line) : (unknown column)", var1, var2, var5, var6);
// 
//   }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test63"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf("hi!: hi!. hi!. hi! at (unknown source) line (unknown line) : (unknown column) at hi!: hi! line (unknown line) : (unknown column): ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test64"); }


    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.jscomp.CheckLevel var3 = null;
    com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var3, "hi!");
    java.lang.String var6 = var5.toString();
    com.google.javascript.jscomp.CheckLevel var8 = null;
    com.google.javascript.jscomp.DiagnosticType var10 = com.google.javascript.jscomp.DiagnosticType.make("", var8, "hi!");
    int var11 = var5.compareTo(var10);
    java.lang.String[] var12 = null;
    com.google.javascript.jscomp.JSError var13 = com.google.javascript.jscomp.JSError.make(var5, var12);
    com.google.javascript.jscomp.DiagnosticType var16 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    boolean var17 = var5.equals((java.lang.Object)"hi!: hi!");
    com.google.javascript.jscomp.CheckLevel var19 = null;
    com.google.javascript.jscomp.DiagnosticType var21 = com.google.javascript.jscomp.DiagnosticType.make(". hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0", var19, "hi!. hi! at (unknown source) line (unknown line) : (unknown column): hi!");
    com.google.javascript.jscomp.CheckLevel var25 = null;
    com.google.javascript.rhino.Node var27 = null;
    com.google.javascript.rhino.Node var29 = null;
    com.google.javascript.rhino.Node var31 = null;
    com.google.javascript.jscomp.DiagnosticType var34 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var36 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var37 = com.google.javascript.jscomp.JSError.make("hi!", var31, var34, var36);
    boolean var39 = var34.equals((java.lang.Object)10);
    com.google.javascript.jscomp.CheckLevel var43 = null;
    com.google.javascript.jscomp.DiagnosticType var46 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var48 = new java.lang.String[] { "hi!: hi!"};
    com.google.javascript.jscomp.JSError var49 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var43, var46, var48);
    com.google.javascript.jscomp.JSError var50 = com.google.javascript.jscomp.JSError.make("hi!", var29, var34, var48);
    com.google.javascript.jscomp.DiagnosticType var51 = var50.getType();
    com.google.javascript.jscomp.CheckLevel var55 = null;
    com.google.javascript.jscomp.CheckLevel var57 = null;
    com.google.javascript.jscomp.DiagnosticType var59 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var57, "hi!");
    java.lang.String var60 = var59.toString();
    com.google.javascript.jscomp.CheckLevel var62 = null;
    com.google.javascript.jscomp.DiagnosticType var64 = com.google.javascript.jscomp.DiagnosticType.make("", var62, "hi!");
    int var65 = var59.compareTo(var64);
    com.google.javascript.rhino.Node var67 = null;
    com.google.javascript.jscomp.DiagnosticType var70 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var72 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var73 = com.google.javascript.jscomp.JSError.make("hi!", var67, var70, var72);
    com.google.javascript.jscomp.JSError var74 = com.google.javascript.jscomp.JSError.make("hi!", (-1), 10, var55, var64, var72);
    com.google.javascript.jscomp.JSError var75 = com.google.javascript.jscomp.JSError.make(": ", var27, var51, var72);
    com.google.javascript.jscomp.CheckLevel var79 = null;
    com.google.javascript.jscomp.CheckLevel var81 = null;
    com.google.javascript.jscomp.DiagnosticType var83 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var81, "hi!: hi!");
    com.google.javascript.jscomp.DiagnosticType var86 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "hi!");
    int var87 = var83.compareTo(var86);
    com.google.javascript.rhino.Node var89 = null;
    com.google.javascript.jscomp.DiagnosticType var92 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var94 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var95 = com.google.javascript.jscomp.JSError.make("hi!", var89, var92, var94);
    com.google.javascript.jscomp.JSError var96 = com.google.javascript.jscomp.JSError.make("hi!: hi!", 12, 0, var79, var83, var94);
    com.google.javascript.jscomp.JSError var97 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi!: hi! line 0 : 3", (-1), (-8), var25, var51, var94);
    com.google.javascript.jscomp.JSError var98 = com.google.javascript.jscomp.JSError.make(var21, var94);
    com.google.javascript.jscomp.JSError var99 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi!. hi! at (unknown source) line (unknown line) : (unknown column) at hi!: hi! line (unknown line) : (unknown column): ", var1, var5, var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!: hi!"+ "'", var6.equals("hi!: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "hi!: hi!"+ "'", var60.equals("hi!: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 3);
    
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
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == 12);
    
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

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test65"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var1, "hi!");
    java.lang.String var4 = var3.toString();
    com.google.javascript.jscomp.CheckLevel var6 = null;
    com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.make("", var6, "hi!");
    int var9 = var3.compareTo(var8);
    com.google.javascript.jscomp.CheckLevel var13 = null;
    com.google.javascript.jscomp.CheckLevel var15 = null;
    com.google.javascript.jscomp.DiagnosticType var17 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var15, "hi!");
    java.lang.String var18 = var17.toString();
    com.google.javascript.jscomp.CheckLevel var20 = null;
    com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.make("", var20, "hi!");
    int var23 = var17.compareTo(var22);
    com.google.javascript.rhino.Node var25 = null;
    com.google.javascript.jscomp.DiagnosticType var28 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var30 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var31 = com.google.javascript.jscomp.JSError.make("hi!", var25, var28, var30);
    com.google.javascript.jscomp.JSError var32 = com.google.javascript.jscomp.JSError.make("hi!: hi!", 0, 3, var13, var17, var30);
    com.google.javascript.jscomp.DiagnosticType var33 = var32.getType();
    com.google.javascript.jscomp.CheckLevel var37 = null;
    com.google.javascript.jscomp.CheckLevel var39 = null;
    com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var39, "hi!");
    java.lang.String var42 = var41.toString();
    com.google.javascript.jscomp.CheckLevel var44 = null;
    com.google.javascript.jscomp.DiagnosticType var46 = com.google.javascript.jscomp.DiagnosticType.make("", var44, "hi!");
    int var47 = var41.compareTo(var46);
    com.google.javascript.rhino.Node var49 = null;
    com.google.javascript.jscomp.DiagnosticType var52 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var54 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var55 = com.google.javascript.jscomp.JSError.make("hi!", var49, var52, var54);
    com.google.javascript.jscomp.JSError var56 = com.google.javascript.jscomp.JSError.make("hi!: hi!", 0, 3, var37, var41, var54);
    com.google.javascript.jscomp.DiagnosticType var57 = var56.getType();
    boolean var58 = var32.equals((java.lang.Object)var56);
    boolean var59 = var8.equals((java.lang.Object)var32);
    com.google.javascript.rhino.Node var61 = null;
    com.google.javascript.rhino.Node var63 = null;
    com.google.javascript.jscomp.DiagnosticType var66 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var68 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var69 = com.google.javascript.jscomp.JSError.make("hi!", var63, var66, var68);
    boolean var71 = var66.equals((java.lang.Object)10);
    com.google.javascript.jscomp.CheckLevel var75 = null;
    com.google.javascript.jscomp.DiagnosticType var78 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var80 = new java.lang.String[] { "hi!: hi!"};
    com.google.javascript.jscomp.JSError var81 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var75, var78, var80);
    com.google.javascript.jscomp.JSError var82 = com.google.javascript.jscomp.JSError.make("hi!", var61, var66, var80);
    boolean var83 = var8.equals((java.lang.Object)var66);
    boolean var85 = var8.equals((java.lang.Object)100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!: hi!"+ "'", var4.equals("hi!: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!: hi!"+ "'", var18.equals("hi!: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 3);
    
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
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!: hi!"+ "'", var42.equals("hi!: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 3);
    
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
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test66"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf(": hi!. hi! at hi!: hi! line 0 : 3. : hi! at hi!: hi!: hi! line 30 : 12");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test67"); }


    com.google.javascript.jscomp.CheckLevel var3 = null;
    com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.warning(". hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0", "hi!. hi! at hi!: hi! line 0 : 3");
    com.google.javascript.jscomp.CheckLevel var16 = null;
    com.google.javascript.jscomp.CheckLevel var18 = null;
    com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.make("", var18, "");
    com.google.javascript.jscomp.CheckLevel var24 = null;
    com.google.javascript.rhino.Node var26 = null;
    com.google.javascript.rhino.Node var28 = null;
    com.google.javascript.rhino.Node var30 = null;
    com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var35 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var36 = com.google.javascript.jscomp.JSError.make("hi!", var30, var33, var35);
    boolean var38 = var33.equals((java.lang.Object)10);
    com.google.javascript.jscomp.CheckLevel var42 = null;
    com.google.javascript.jscomp.DiagnosticType var45 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var47 = new java.lang.String[] { "hi!: hi!"};
    com.google.javascript.jscomp.JSError var48 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var42, var45, var47);
    com.google.javascript.jscomp.JSError var49 = com.google.javascript.jscomp.JSError.make("hi!", var28, var33, var47);
    com.google.javascript.jscomp.DiagnosticType var50 = var49.getType();
    com.google.javascript.jscomp.CheckLevel var54 = null;
    com.google.javascript.jscomp.CheckLevel var56 = null;
    com.google.javascript.jscomp.DiagnosticType var58 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var56, "hi!");
    java.lang.String var59 = var58.toString();
    com.google.javascript.jscomp.CheckLevel var61 = null;
    com.google.javascript.jscomp.DiagnosticType var63 = com.google.javascript.jscomp.DiagnosticType.make("", var61, "hi!");
    int var64 = var58.compareTo(var63);
    com.google.javascript.rhino.Node var66 = null;
    com.google.javascript.jscomp.DiagnosticType var69 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var71 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var72 = com.google.javascript.jscomp.JSError.make("hi!", var66, var69, var71);
    com.google.javascript.jscomp.JSError var73 = com.google.javascript.jscomp.JSError.make("hi!", (-1), 10, var54, var63, var71);
    com.google.javascript.jscomp.JSError var74 = com.google.javascript.jscomp.JSError.make(": ", var26, var50, var71);
    com.google.javascript.jscomp.CheckLevel var78 = null;
    com.google.javascript.jscomp.CheckLevel var80 = null;
    com.google.javascript.jscomp.DiagnosticType var82 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var80, "hi!: hi!");
    com.google.javascript.jscomp.DiagnosticType var85 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "hi!");
    int var86 = var82.compareTo(var85);
    com.google.javascript.rhino.Node var88 = null;
    com.google.javascript.jscomp.DiagnosticType var91 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var93 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var94 = com.google.javascript.jscomp.JSError.make("hi!", var88, var91, var93);
    com.google.javascript.jscomp.JSError var95 = com.google.javascript.jscomp.JSError.make("hi!: hi!", 12, 0, var78, var82, var93);
    com.google.javascript.jscomp.JSError var96 = com.google.javascript.jscomp.JSError.make("hi!. hi! at hi!: hi! line 0 : 3", (-1), (-8), var24, var50, var93);
    com.google.javascript.jscomp.JSError var97 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at hi!: hi! line (unknown line) : 10", (-46), 1, var16, var20, var93);
    com.google.javascript.jscomp.JSError var98 = com.google.javascript.jscomp.JSError.make("hi!: hi!. hi! at hi!. hi! at hi!: hi! line 0 : 3 line (unknown line) : -8", 66, 18, var12, var93);
    com.google.javascript.jscomp.JSError var99 = com.google.javascript.jscomp.JSError.make("hi!: hi!: hi!. hi! at hi!: hi!: hi! line 0 : 100: ", 100, 0, var3, var6, var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
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
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "hi!: hi!"+ "'", var59.equals("hi!: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 3);
    
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
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
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

  public void test68() {}
//   public void test68() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test68"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.error(": : : hi!. hi! at hi!: hi! line 0 : 3", "");
//     com.google.javascript.rhino.Node var13 = null;
//     com.google.javascript.rhino.Node var15 = null;
//     com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var20 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var21 = com.google.javascript.jscomp.JSError.make("hi!", var15, var18, var20);
//     boolean var23 = var18.equals((java.lang.Object)10);
//     com.google.javascript.jscomp.CheckLevel var27 = null;
//     com.google.javascript.jscomp.DiagnosticType var30 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var32 = new java.lang.String[] { "hi!: hi!"};
//     com.google.javascript.jscomp.JSError var33 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var27, var30, var32);
//     com.google.javascript.jscomp.JSError var34 = com.google.javascript.jscomp.JSError.make("hi!", var13, var18, var32);
//     com.google.javascript.rhino.Node var36 = null;
//     com.google.javascript.jscomp.DiagnosticType var39 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.rhino.Node var41 = null;
//     com.google.javascript.jscomp.DiagnosticType var44 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var46 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var47 = com.google.javascript.jscomp.JSError.make("hi!", var41, var44, var46);
//     com.google.javascript.jscomp.JSError var48 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var36, var39, var46);
//     com.google.javascript.jscomp.JSError var49 = com.google.javascript.jscomp.JSError.make("", (-64), 100, var18, var46);
//     com.google.javascript.rhino.Node var51 = null;
//     com.google.javascript.jscomp.DiagnosticType var54 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var56 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var57 = com.google.javascript.jscomp.JSError.make("hi!", var51, var54, var56);
//     com.google.javascript.jscomp.JSError var58 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-8), 10, var18, var56);
//     com.google.javascript.jscomp.JSError var59 = com.google.javascript.jscomp.JSError.make(". hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0: hi!. hi! at hi!: hi! line 0 : 3", 100, (-12), var5, var56);
//     com.google.javascript.jscomp.CheckLevel var60 = null;
//     com.google.javascript.jscomp.MessageFormatter var61 = null;
//     java.lang.String var62 = var59.format(var60, var61);
// 
//   }

  public void test69() {}
//   public void test69() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test69"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var1 = null;
//     com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var1, "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.rhino.Node var5 = null;
//     com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var10 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var11 = com.google.javascript.jscomp.JSError.make("hi!", var5, var8, var10);
//     int var12 = var3.compareTo(var8);
//     com.google.javascript.rhino.Node var14 = null;
//     com.google.javascript.jscomp.DiagnosticType var17 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.rhino.Node var19 = null;
//     com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var24 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var25 = com.google.javascript.jscomp.JSError.make("hi!", var19, var22, var24);
//     com.google.javascript.jscomp.JSError var26 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var14, var17, var24);
//     com.google.javascript.jscomp.JSError var27 = com.google.javascript.jscomp.JSError.make(var3, var24);
//     com.google.javascript.jscomp.DiagnosticType var28 = var27.getType();
//     com.google.javascript.jscomp.CheckLevel var29 = null;
//     com.google.javascript.jscomp.MessageFormatter var30 = null;
//     java.lang.String var31 = var27.format(var29, var30);
// 
//   }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test70"); }


    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.rhino.Node var3 = null;
    com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var8 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var9 = com.google.javascript.jscomp.JSError.make("hi!", var3, var6, var8);
    boolean var11 = var6.equals((java.lang.Object)10);
    com.google.javascript.jscomp.CheckLevel var15 = null;
    com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
    java.lang.String[] var20 = new java.lang.String[] { "hi!: hi!"};
    com.google.javascript.jscomp.JSError var21 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var15, var18, var20);
    com.google.javascript.jscomp.JSError var22 = com.google.javascript.jscomp.JSError.make("hi!", var1, var6, var20);
    com.google.javascript.jscomp.DiagnosticType var23 = var22.getType();
    com.google.javascript.jscomp.DiagnosticType var26 = com.google.javascript.jscomp.DiagnosticType.error(". hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0", "hi!. hi! at hi!: hi! line 0 : 3");
    int var27 = var23.compareTo(var26);
    java.lang.String var28 = var26.toString();
    java.lang.String var29 = var26.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
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
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ". hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0: hi!. hi! at hi!: hi! line 0 : 3"+ "'", var28.equals(". hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0: hi!. hi! at hi!: hi! line 0 : 3"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ". hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0: hi!. hi! at hi!: hi! line 0 : 3"+ "'", var29.equals(". hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0: hi!. hi! at hi!: hi! line 0 : 3"));

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test71"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning(".  at hi!: hi!. hi! at hi!: hi! line (unknown line) : 10 line -46 : 1", ": hi!. hi! at hi!: hi! line 0 : 3. : hi! at hi!: hi!: hi! line 30 : 12");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test72"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf(": hi!. hi! at hi!: hi! line 0 : 3. : hi! at hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column): hi!: hi!. hi! at hi!: hi!: hi! line 0 : 100 line -28 : 18");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test73"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning("hi!. hi! at hi!: hi! line 0 : 3: ", "hi!: hi!. hi! at hi!: hi! line -8 : 10");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test74"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error(": hi!", "hi!: hi!. hi! at hi!: hi! line -8 : 10");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test75() {}
//   public void test75() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test75"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, ": hi!: hi!: hi!. hi! at hi!: hi!: hi! line 0 : 100");
// 
//   }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test76"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled(": hi!. hi! at hi!: hi! line 0 : 3. : hi! at hi!: hi!: hi! line 30 : 12", ". hi! at hi! line (unknown line) : 10");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test77() {}
//   public void test77() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test77"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "hi!: hi!. hi!. hi! at (unknown source) line (unknown line) : (unknown column) at hi!: hi! line (unknown line) : (unknown column): ");
// 
//   }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test78"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning("", ". hi!: hi!. hi! at (unknown source) line 66 : -12 at (unknown source) line (unknown line) : (unknown column)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test79() {}
//   public void test79() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test79"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var1 = null;
//     com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var1, ": ");
//     com.google.javascript.rhino.Node var5 = null;
//     com.google.javascript.jscomp.CheckLevel var9 = null;
//     com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var14 = new java.lang.String[] { "hi!: hi!"};
//     com.google.javascript.jscomp.JSError var15 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var9, var12, var14);
//     com.google.javascript.jscomp.CheckLevel var19 = null;
//     com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var24 = new java.lang.String[] { "hi!: hi!"};
//     com.google.javascript.jscomp.JSError var25 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var19, var22, var24);
//     com.google.javascript.jscomp.JSError var26 = com.google.javascript.jscomp.JSError.make("hi!: hi!", var5, var12, var24);
//     com.google.javascript.jscomp.JSError var27 = com.google.javascript.jscomp.JSError.make(var3, var24);
//     int var28 = var27.getCharno();
//     int var29 = var27.getCharno();
//     com.google.javascript.jscomp.CheckLevel var30 = null;
//     com.google.javascript.jscomp.MessageFormatter var31 = null;
//     java.lang.String var32 = var27.format(var30, var31);
// 
//   }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test80"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning("hi!: hi!. hi! at hi!: hi! line (unknown line) : 10", "hi!: hi!. hi!. hi! at (unknown source) line (unknown line) : (unknown column) at hi!: hi! line (unknown line) : (unknown column)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test81"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!. hi! at hi!: hi! line -8 : 10", ": ");
    java.lang.String var3 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!: hi!. hi! at hi!: hi! line -8 : 10: : "+ "'", var3.equals("hi!: hi!. hi! at hi!: hi! line -8 : 10: : "));

  }

  public void test82() {}
//   public void test82() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test82"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, ": hi!: hi!. hi! at hi!: hi!: hi! line 0 : 100");
// 
//   }

  public void test83() {}
//   public void test83() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test83"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CheckLevel var2 = null;
//     com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!: hi!: hi!. hi! at (unknown source) line (unknown line) : (unknown column)", ": ");
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.make("hi!: hi!", var7, "hi!");
//     com.google.javascript.jscomp.CheckLevel var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var11, "hi!");
//     java.lang.String var14 = var13.toString();
//     com.google.javascript.jscomp.CheckLevel var16 = null;
//     com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.make("", var16, "hi!");
//     int var19 = var13.compareTo(var18);
//     java.lang.String[] var20 = null;
//     com.google.javascript.jscomp.JSError var21 = com.google.javascript.jscomp.JSError.make(var13, var20);
//     com.google.javascript.jscomp.DiagnosticType var24 = com.google.javascript.jscomp.DiagnosticType.error("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "hi!");
//     boolean var25 = var13.equals((java.lang.Object)var24);
//     int var26 = var9.compareTo(var24);
//     boolean var27 = var5.equals((java.lang.Object)var26);
//     com.google.javascript.jscomp.CheckLevel var31 = null;
//     com.google.javascript.jscomp.CheckLevel var33 = null;
//     com.google.javascript.jscomp.DiagnosticType var35 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var33, "hi!");
//     java.lang.String var36 = var35.toString();
//     com.google.javascript.jscomp.CheckLevel var38 = null;
//     com.google.javascript.jscomp.DiagnosticType var40 = com.google.javascript.jscomp.DiagnosticType.make("", var38, "hi!");
//     int var41 = var35.compareTo(var40);
//     com.google.javascript.rhino.Node var43 = null;
//     com.google.javascript.jscomp.DiagnosticType var46 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var48 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var49 = com.google.javascript.jscomp.JSError.make("hi!", var43, var46, var48);
//     com.google.javascript.jscomp.JSError var50 = com.google.javascript.jscomp.JSError.make("hi!: hi!", 0, 3, var31, var35, var48);
//     com.google.javascript.jscomp.DiagnosticType var51 = var50.getType();
//     com.google.javascript.jscomp.CheckLevel var55 = null;
//     com.google.javascript.jscomp.CheckLevel var57 = null;
//     com.google.javascript.jscomp.DiagnosticType var59 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var57, "hi!");
//     java.lang.String var60 = var59.toString();
//     com.google.javascript.jscomp.CheckLevel var62 = null;
//     com.google.javascript.jscomp.DiagnosticType var64 = com.google.javascript.jscomp.DiagnosticType.make("", var62, "hi!");
//     int var65 = var59.compareTo(var64);
//     com.google.javascript.rhino.Node var67 = null;
//     com.google.javascript.jscomp.DiagnosticType var70 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var72 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var73 = com.google.javascript.jscomp.JSError.make("hi!", var67, var70, var72);
//     com.google.javascript.jscomp.JSError var74 = com.google.javascript.jscomp.JSError.make("hi!: hi!", 0, 3, var55, var59, var72);
//     com.google.javascript.jscomp.DiagnosticType var75 = var74.getType();
//     boolean var76 = var50.equals((java.lang.Object)var74);
//     int var77 = var74.getCharno();
//     com.google.javascript.jscomp.DiagnosticType var78 = var74.getType();
//     boolean var79 = var5.equals((java.lang.Object)var78);
//     java.lang.String[] var80 = null;
//     com.google.javascript.jscomp.JSError var81 = com.google.javascript.jscomp.JSError.make("", var1, var2, var5, var80);
// 
//   }

  public void test84() {}
//   public void test84() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test84"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var4 = null;
//     com.google.javascript.jscomp.CheckLevel var6 = null;
//     com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.make(". hi!. hi! at hi!: hi! line 0 : 3 at (unknown source) line -64 : 0", var6, "hi!. hi! at (unknown source) line (unknown line) : (unknown column): hi!");
//     com.google.javascript.jscomp.CheckLevel var12 = null;
//     com.google.javascript.rhino.Node var14 = null;
//     com.google.javascript.rhino.Node var16 = null;
//     com.google.javascript.rhino.Node var18 = null;
//     com.google.javascript.jscomp.DiagnosticType var21 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var23 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var24 = com.google.javascript.jscomp.JSError.make("hi!", var18, var21, var23);
//     boolean var26 = var21.equals((java.lang.Object)10);
//     com.google.javascript.jscomp.CheckLevel var30 = null;
//     com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.error("hi!: hi!", "hi!");
//     java.lang.String[] var35 = new java.lang.String[] { "hi!: hi!"};
//     com.google.javascript.jscomp.JSError var36 = com.google.javascript.jscomp.JSError.make("hi!: hi!", (-1), 10, var30, var33, var35);
//     com.google.javascript.jscomp.JSError var37 = com.google.javascript.jscomp.JSError.make("hi!", var16, var21, var35);
//     com.google.javascript.jscomp.DiagnosticType var38 = var37.getType();
//     com.google.javascript.jscomp.CheckLevel var42 = null;
//     com.google.javascript.jscomp.CheckLevel var44 = null;
//     com.google.javascript.jscomp
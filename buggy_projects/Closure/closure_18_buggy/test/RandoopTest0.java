
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() {}
//   public void test1() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.comma(var0, var1);
// 
//   }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = com.google.javascript.rhino.ScriptRuntime.escapeString("hi!", ' ');
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test3() {}
//   public void test3() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "");
// 
//   }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String var1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "module$"+ "'", var1.equals("module$"));

  }

  public void test5() {}
//   public void test5() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }
// 
// 
//     java.io.File var0 = null;
//     com.google.javascript.jscomp.SourceFile var1 = com.google.javascript.jscomp.SourceFile.fromFile(var0);
// 
//   }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromCode("", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() {}
//   public void test7() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var0 = null;
//     java.lang.String[] var2 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var3 = com.google.javascript.jscomp.JSError.make(var0, var2);
// 
//   }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.labelName("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.getelem(var1, var3);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test9() {}
//   public void test9() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticGroup var0 = null;
//     com.google.javascript.jscomp.DiagnosticGroup[] var1 = new com.google.javascript.jscomp.DiagnosticGroup[] { var0};
//     com.google.javascript.jscomp.DiagnosticGroup var2 = new com.google.javascript.jscomp.DiagnosticGroup(var1);
// 
//   }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    java.lang.String var3 = var1.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var4 = null;
    var1.setStaticSourceFile(var4);
    boolean var6 = var1.isDo();
    var1.setLength(1);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.labelName("hi!");
    int var11 = var10.getChildCount();
    java.lang.String var12 = var10.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var13 = null;
    var10.setStaticSourceFile(var13);
    boolean var15 = var10.isAnd();
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.labelName("hi!");
    int var18 = var17.getChildCount();
    java.lang.String var19 = var17.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var20 = null;
    var17.setStaticSourceFile(var20);
    boolean var22 = var17.isAnd();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.hook(var1, var10, var17);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.google.javascript.jscomp.AstValidator var0 = new com.google.javascript.jscomp.AstValidator();
    com.google.javascript.rhino.Node var4 = new com.google.javascript.rhino.Node(0, 10, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.validateExpression(var4);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = var1.getDouble();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    java.lang.String var3 = var1.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var4 = null;
    var1.setStaticSourceFile(var4);
    boolean var6 = var1.isAnd();
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.labelName("hi!");
    int var9 = var8.getChildCount();
    java.lang.String var10 = var8.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var11 = null;
    var8.setStaticSourceFile(var11);
    boolean var13 = var8.isDo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.catchNode(var1, var8);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setDouble(10.0d);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    java.lang.String var3 = var1.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var4 = var1.getStaticSourceFile();
    com.google.javascript.rhino.Node var9 = new com.google.javascript.rhino.Node(0, 10, 1);
    com.google.javascript.rhino.Node var10 = new com.google.javascript.rhino.Node(10, var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.catchNode(var1, var9);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.PropertyRenamingPolicy var1 = com.google.javascript.jscomp.PropertyRenamingPolicy.valueOf("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    java.lang.String var3 = var1.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var4 = null;
    var1.setStaticSourceFile(var4);
    boolean var6 = var1.isDo();
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.labelName("hi!");
    int var9 = var8.getChildCount();
    java.lang.String var10 = var8.getSourceFileName();
    boolean var11 = var8.isCatch();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.tryFinally(var1, var8);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.google.javascript.jscomp.ErrorManager var0 = null;
    com.google.javascript.jscomp.deps.JsFileParser var1 = new com.google.javascript.jscomp.deps.JsFileParser(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.deps.DependencyInfo var4 = var1.parseFile("", "hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test19() {}
//   public void test19() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.paramList(var0);
// 
//   }

  public void test20() {}
//   public void test20() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var3 = var2.getChildCount();
//     java.lang.String var4 = var2.getSourceFileName();
//     com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.sheq(var0, var2);
// 
//   }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    java.lang.String var3 = var1.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var4 = null;
    var1.setStaticSourceFile(var4);
    boolean var6 = var1.isDo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var7 = var1.getDouble();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test22() {}
//   public void test22() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }
// 
// 
//     com.google.javascript.jscomp.SourceExcerptProvider var0 = null;
//     com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var1 = null;
//     com.google.javascript.jscomp.LightweightMessageFormatter var2 = new com.google.javascript.jscomp.LightweightMessageFormatter(var0, var1);
// 
//   }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CustomPassExecutionTime var1 = com.google.javascript.jscomp.CustomPassExecutionTime.valueOf("module$");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    java.lang.String var3 = var1.getSourceFileName();
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.falseNode();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.propdef(var1, var4);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test25() {}
//   public void test25() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }
// 
// 
//     com.google.javascript.jscomp.AbstractCompiler var0 = null;
//     com.google.javascript.jscomp.type.ReverseAbstractInterpreter var1 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = null;
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.jscomp.CheckLevel var4 = null;
//     com.google.javascript.jscomp.TypeCheck var5 = new com.google.javascript.jscomp.TypeCheck(var0, var1, var2, var3, var4);
// 
//   }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.google.javascript.rhino.Node var3 = new com.google.javascript.rhino.Node(0, 10, 1);
    boolean var4 = var3.isAnd();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.labelName("hi!");
    int var7 = var6.getChildCount();
    java.lang.String var8 = var6.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var9 = null;
    var6.setStaticSourceFile(var9);
    boolean var11 = var6.isDo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.assign(var3, var6);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.pos(var1);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test28() {}
//   public void test28() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.continueNode();
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.falseNode();
//     com.google.javascript.rhino.Node var2 = var0.useSourceInfoFromForTree(var1);
//     com.google.javascript.rhino.Node var3 = null;
//     com.google.javascript.rhino.Node var4 = var2.srcref(var3);
// 
//   }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    java.lang.String var3 = var1.getSourceFileName();
    boolean var4 = var1.isCatch();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var7 = var6.isQuotedString();
    com.google.javascript.rhino.Node var11 = new com.google.javascript.rhino.Node(0, 10, 1);
    boolean var12 = var11.isLabelName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addChildAfter(var6, var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    java.lang.String var3 = var1.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var4 = null;
    var1.setStaticSourceFile(var4);
    com.google.javascript.rhino.JSTypeExpression var7 = new com.google.javascript.rhino.JSTypeExpression(var1, "hi!");
    com.google.javascript.rhino.Node var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.tryCatch(var1, var8);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.continueNode();
    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var2 = var0.useSourceInfoFromForTree(var1);
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.continueNode();
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var5 = var3.useSourceInfoFromForTree(var4);
    int var6 = var4.getChildCount();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.caseNode(var0, var4);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    com.google.javascript.rhino.Node var3 = new com.google.javascript.rhino.Node(0, 10, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setSideEffectFlags(10);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test33() {}
//   public void test33() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }
// 
// 
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
//     com.google.javascript.rhino.Node var4 = null;
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
//     var8.putBooleanProp(0, false);
//     boolean var12 = var8.isOnlyModifiesThisCall();
//     com.google.javascript.rhino.Node var13 = null;
//     com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.forNode(var3, var4, var8, var13);
// 
//   }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    boolean var1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = var1.getDouble();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    com.google.javascript.jscomp.PropertyRenamingPolicy[] var0 = com.google.javascript.jscomp.PropertyRenamingPolicy.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    boolean var3 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(var1);
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.continueNode();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var6 = var4.useSourceInfoFromForTree(var5);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var9 = var8.isQuotedString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.replaceChildAfter(var5, var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test38() {}
//   public void test38() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     var0.setCollapseProperties(false);
//     var0.enableExternExports(false);
//     com.google.javascript.jscomp.CompilerOptions.Reach var5 = null;
//     var0.setRemoveUnusedVariables(var5);
// 
//   }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.continueNode();
    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var2 = var0.useSourceInfoFromForTree(var1);
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.labelName("hi!");
    int var5 = var4.getChildCount();
    java.lang.String var6 = var4.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var7 = null;
    var4.setStaticSourceFile(var7);
    boolean var9 = var4.isAnd();
    boolean var10 = var4.isEmpty();
    boolean var11 = var4.hasMoreThanOneChild();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.doNode(var1, var4);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test40() {}
//   public void test40() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }
// 
// 
//     com.google.javascript.jscomp.ErrorManager var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
// 
//   }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }


    boolean var1 = com.google.javascript.rhino.ScriptRuntime.isJSLineTerminator((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test42() {}
//   public void test42() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.lang.Object var1 = null;
//     java.util.Iterator var2 = var0.getNeighborNodesIterator(var1);
// 
//   }

  public void test43() {}
//   public void test43() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "JSDocInfo");
// 
//   }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    java.lang.String var3 = var1.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var4 = null;
    var1.setStaticSourceFile(var4);
    boolean var6 = var1.isAnd();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.hasMoreThanOneChild();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.continueNode();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var11 = var9.useSourceInfoFromForTree(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.sheq(var1, var11);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.VariableRenamingPolicy var1 = com.google.javascript.jscomp.VariableRenamingPolicy.valueOf("JSDocInfo");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.labelName("hi!");
    int var7 = var6.getChildCount();
    com.google.javascript.rhino.jstype.JSType var8 = var6.getJSType();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.labelName("hi!");
    int var11 = var10.getChildCount();
    java.lang.String var12 = var10.getSourceFileName();
    com.google.javascript.rhino.Node var15 = new com.google.javascript.rhino.Node(153, var4, var6, var10, 0, 153);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.block(var10);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }


    int var1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test48() {}
//   public void test48() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }
// 
// 
//     com.google.javascript.rhino.jstype.JSTypeRegistry var0 = null;
//     com.google.javascript.rhino.jstype.FunctionBuilder var1 = new com.google.javascript.rhino.jstype.FunctionBuilder(var0);
//     com.google.javascript.rhino.jstype.FunctionType var2 = null;
//     com.google.javascript.rhino.jstype.FunctionBuilder var3 = var1.copyFromOtherFunction(var2);
// 
//   }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    java.lang.String var3 = var1.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var4 = null;
    var1.setStaticSourceFile(var4);
    boolean var6 = var1.isDo();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.continueNode();
    boolean var8 = var7.isOptionalArg();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.tryFinally(var1, var7);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.PropertyRenamingPolicy var1 = com.google.javascript.jscomp.PropertyRenamingPolicy.valueOf("LABEL_NAME hi!\n");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.voidNode(var1);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }


    com.google.javascript.jscomp.SourceFile.Generator var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromGenerator("", var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test53() {}
//   public void test53() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.pos(var0);
// 
//   }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    java.lang.String var3 = var1.getSourceFileName();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.labelName("hi!");
    int var6 = var5.getChildCount();
    java.lang.String var7 = var5.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var8 = null;
    var5.setStaticSourceFile(var8);
    com.google.javascript.rhino.JSTypeExpression var11 = new com.google.javascript.rhino.JSTypeExpression(var5, "hi!");
    boolean var12 = var5.isNull();
    com.google.javascript.rhino.Node var13 = var1.clonePropsFrom(var5);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.continueNode();
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.labelName("hi!");
    int var17 = var16.getChildCount();
    com.google.javascript.rhino.jstype.JSType var18 = var16.getJSType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.ifNode(var13, var14, var16);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    java.lang.String var3 = var1.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var4 = var1.getStaticSourceFile();
    var1.setLineno(10);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.labelName("hi!");
    int var9 = var8.getChildCount();
    java.lang.String var10 = var8.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var11 = null;
    var8.setStaticSourceFile(var11);
    boolean var13 = var8.isAnd();
    boolean var14 = var8.isTry();
    boolean var15 = var8.isNumber();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.getelem(var1, var8);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }


    com.google.javascript.rhino.Node var3 = new com.google.javascript.rhino.Node(0, 10, 1);
    boolean var4 = var3.isAnd();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.defaultCase(var3);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test57() {}
//   public void test57() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     java.util.Set var1 = null;
//     var0.setStripTypePrefixes(var1);
//     var0.setDeadAssignmentElimination(false);
//     var0.setInlineConstantVars(true);
//     java.util.Set var7 = null;
//     var0.setExtraAnnotationNames(var7);
// 
//   }

  public void test58() {}
//   public void test58() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "hi!");
// 
//   }

  public void test59() {}
//   public void test59() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }
// 
// 
//     com.google.javascript.rhino.jstype.JSTypeRegistry var0 = null;
//     com.google.javascript.rhino.jstype.FunctionBuilder var1 = new com.google.javascript.rhino.jstype.FunctionBuilder(var0);
//     com.google.javascript.rhino.jstype.FunctionType var2 = var1.build();
// 
//   }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("LABEL_NAME hi!\n", var1, "LABEL_NAME hi!\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test61() {}
//   public void test61() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.continueNode();
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.rhino.Node var2 = var0.useSourceInfoIfMissingFrom(var1);
// 
//   }

  public void test62() {}
//   public void test62() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }
// 
// 
//     com.google.javascript.jscomp.CodingConvention var0 = null;
//     com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention(var0);
//     java.util.Collection var2 = var1.getIndirectlyDeclaredProperties();
// 
//   }

  public void test63() {}
//   public void test63() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var4 = null;
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
//     var9.putBooleanProp(0, false);
//     com.google.javascript.jscomp.CheckLevel var13 = null;
//     com.google.javascript.jscomp.DiagnosticType var16 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
//     java.lang.String[] var18 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var19 = com.google.javascript.jscomp.JSError.make(var16, var18);
//     com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
//     java.lang.String[] var24 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var25 = com.google.javascript.jscomp.JSError.make(var22, var24);
//     com.google.javascript.jscomp.JSError var26 = com.google.javascript.jscomp.JSError.make("LABEL_NAME hi!\n", var9, var13, var16, var24);
//     com.google.javascript.jscomp.JSError var27 = com.google.javascript.jscomp.JSError.make("", (-1), 1, var3, var4, var24);
// 
//   }

  public void test64() {}
//   public void test64() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     java.util.Set var1 = null;
//     var0.setStripTypePrefixes(var1);
//     var0.setDeadAssignmentElimination(false);
//     com.google.javascript.jscomp.CompilerOptions.LanguageMode var5 = var0.getLanguageOut();
//     com.google.javascript.jscomp.CompilerOptions.Reach var6 = null;
//     var0.setInlineVariables(var6);
// 
//   }

  public void test65() {}
//   public void test65() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }
// 
// 
//     com.google.javascript.jscomp.CodingConvention var0 = null;
//     com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention(var0);
//     java.lang.String var2 = var1.getDelegateSuperclassName();
// 
//   }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.util.List var1 = var0.getEdges();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.continueNode();
    boolean var3 = var2.isTry();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var4 = var0.getInEdges((java.lang.Object)var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }


    com.google.javascript.rhino.jstype.JSType var0 = null;
    com.google.javascript.rhino.jstype.ObjectType var1 = com.google.javascript.rhino.jstype.ObjectType.cast(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.labelName("hi!");
    int var7 = var6.getChildCount();
    com.google.javascript.rhino.jstype.JSType var8 = var6.getJSType();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.labelName("hi!");
    int var11 = var10.getChildCount();
    java.lang.String var12 = var10.getSourceFileName();
    com.google.javascript.rhino.Node var15 = new com.google.javascript.rhino.Node(153, var4, var6, var10, 0, 153);
    boolean var16 = var4.isObjectLit();
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    var21.putBooleanProp(0, false);
    com.google.javascript.jscomp.CheckLevel var25 = null;
    com.google.javascript.jscomp.DiagnosticType var28 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
    java.lang.String[] var30 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var31 = com.google.javascript.jscomp.JSError.make(var28, var30);
    com.google.javascript.jscomp.DiagnosticType var34 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
    java.lang.String[] var36 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var37 = com.google.javascript.jscomp.JSError.make(var34, var36);
    com.google.javascript.jscomp.JSError var38 = com.google.javascript.jscomp.JSError.make("LABEL_NAME hi!\n", var21, var25, var28, var36);
    com.google.javascript.rhino.Node var39 = var21.removeChildren();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var40 = var21.getJsDocBuilderForNode();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.tryFinally(var4, var21);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }


    java.lang.String var2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("JSDocInfo", "LABEL_NAME hi!\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "module$JSDocInfo"+ "'", var2.equals("module$JSDocInfo"));

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    boolean var1 = var0.isDirected();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.continueNode();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var4 = var2.useSourceInfoFromForTree(var3);
    int var5 = var3.getChildCount();
    java.lang.Object var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.connect((java.lang.Object)var3, (java.lang.Object)'4', var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test71() {}
//   public void test71() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticGroup[] var0 = null;
//     com.google.javascript.jscomp.DiagnosticGroup var1 = new com.google.javascript.jscomp.DiagnosticGroup(var0);
// 
//   }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString(0, "", 1, 153);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.setDouble(0.0d);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("module$", 100, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setSideEffectFlags(0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    java.lang.String var3 = var1.getSourceFileName();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.labelName("hi!");
    int var6 = var5.getChildCount();
    java.lang.String var7 = var5.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var8 = null;
    var5.setStaticSourceFile(var8);
    com.google.javascript.rhino.JSTypeExpression var11 = new com.google.javascript.rhino.JSTypeExpression(var5, "hi!");
    boolean var12 = var5.isNull();
    com.google.javascript.rhino.Node var13 = var1.clonePropsFrom(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.var(var13);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    java.lang.String var3 = var1.getSourceFileName();
    java.lang.String var4 = var1.toStringTree();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.neg(var1);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "LABEL_NAME hi!\n"+ "'", var4.equals("LABEL_NAME hi!\n"));

  }

  public void test76() {}
//   public void test76() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
//     boolean var1 = var0.isDirected();
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var4 = var3.getChildCount();
//     java.lang.String var5 = var3.getSourceFileName();
//     com.google.javascript.rhino.jstype.StaticSourceFile var6 = null;
//     var3.setStaticSourceFile(var6);
//     com.google.javascript.rhino.JSTypeExpression var9 = new com.google.javascript.rhino.JSTypeExpression(var3, "hi!");
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var10 = var0.getDirectedGraphNode((java.lang.Object)"hi!");
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var11 = null;
//     java.util.List var12 = var0.getNeighborNodes(var11);
// 
//   }

  public void test77() {}
//   public void test77() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }
// 
// 
//     com.google.javascript.jscomp.CodingConvention var0 = null;
//     com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention(var0);
//     boolean var3 = var1.isValidEnumKey("hi!");
//     java.lang.String var4 = var1.getExportSymbolFunction();
// 
//   }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.labelName("hi!");
    int var7 = var6.getChildCount();
    com.google.javascript.rhino.jstype.JSType var8 = var6.getJSType();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.labelName("hi!");
    int var11 = var10.getChildCount();
    java.lang.String var12 = var10.getSourceFileName();
    com.google.javascript.rhino.Node var15 = new com.google.javascript.rhino.Node(153, var4, var6, var10, 0, 153);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.labelName("hi!");
    int var18 = var17.getChildCount();
    java.lang.String var19 = var17.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var20 = null;
    var17.setStaticSourceFile(var20);
    boolean var22 = var17.isAnd();
    boolean var23 = var17.isEmpty();
    boolean var24 = var10.hasChild(var17);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.labelName("hi!");
    int var27 = var26.getChildCount();
    java.lang.String var28 = var26.getSourceFileName();
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.labelName("hi!");
    int var31 = var30.getChildCount();
    java.lang.String var32 = var30.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var33 = null;
    var30.setStaticSourceFile(var33);
    com.google.javascript.rhino.JSTypeExpression var36 = new com.google.javascript.rhino.JSTypeExpression(var30, "hi!");
    boolean var37 = var30.isNull();
    com.google.javascript.rhino.Node var38 = var26.clonePropsFrom(var30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.caseNode(var17, var26);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = com.google.javascript.rhino.ScriptRuntime.getMessage0(". hi! at (unknown source) line (unknown line) : (unknown column)");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test80() {}
//   public void test80() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }
// 
// 
//     com.google.javascript.jscomp.CodingConvention var0 = null;
//     com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention(var0);
//     java.lang.String var2 = var1.getGlobalObject();
// 
//   }

  public void test81() {}
//   public void test81() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticGroup var0 = null;
//     com.google.javascript.jscomp.CheckLevel var1 = null;
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var2 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var0, var1);
//     com.google.javascript.jscomp.DiagnosticGroup var3 = null;
//     boolean var4 = var2.enables(var3);
// 
//   }

  public void test82() {}
//   public void test82() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }
// 
// 
//     com.google.javascript.rhino.jstype.JSTypeRegistry var0 = null;
//     com.google.javascript.rhino.jstype.FunctionBuilder var1 = new com.google.javascript.rhino.jstype.FunctionBuilder(var0);
//     com.google.javascript.rhino.jstype.FunctionBuilder var2 = var1.forConstructor();
//     com.google.javascript.rhino.jstype.FunctionType var3 = null;
//     com.google.javascript.rhino.jstype.FunctionBuilder var4 = var2.copyFromOtherFunction(var3);
// 
//   }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.nullNode();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var1 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }


    java.util.logging.Level var0 = null;
    com.google.javascript.jscomp.Compiler.setLoggingLevel(var0);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.nullNode();
    boolean var1 = var0.isExprResult();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString(0, "", 1, 153);
    com.google.javascript.rhino.Node[] var8 = new com.google.javascript.rhino.Node[] { var7};
    com.google.javascript.rhino.Node var9 = new com.google.javascript.rhino.Node(0, var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.call(var0, var8);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.util.List var1 = var0.getEdges();
    com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
    boolean var4 = var2.hasParameter("");
    java.util.List var5 = var2.getImplementedInterfaces();
    java.lang.String var6 = var2.getOriginalCommentString();
    com.google.javascript.rhino.JSTypeExpression var7 = var2.getBaseType();
    com.google.javascript.rhino.JSTypeExpression var8 = var2.getTypedefType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var9 = var0.getWeight((java.lang.Object)var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test87() {}
//   public void test87() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var1 = null;
//     var0.setAnonymousFunctionNaming(var1);
//     var0.setMarkAsCompiled(true);
//     com.google.javascript.jscomp.CompilerOptions.Reach var5 = null;
//     var0.setInlineFunctions(var5);
// 
//   }

  public void test88() {}
//   public void test88() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.neg(var0);
// 
//   }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    var4.putBooleanProp(0, false);
    com.google.javascript.jscomp.CheckLevel var8 = null;
    com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
    java.lang.String[] var13 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var14 = com.google.javascript.jscomp.JSError.make(var11, var13);
    com.google.javascript.jscomp.DiagnosticType var17 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
    java.lang.String[] var19 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var20 = com.google.javascript.jscomp.JSError.make(var17, var19);
    com.google.javascript.jscomp.JSError var21 = com.google.javascript.jscomp.JSError.make("LABEL_NAME hi!\n", var4, var8, var11, var19);
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.labelName("hi!");
    int var24 = var23.getChildCount();
    com.google.javascript.rhino.jstype.JSType var25 = var23.getJSType();
    java.lang.Iterable var26 = var23.children();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.doNode(var4, var23);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }


    com.google.javascript.jscomp.parsing.Config.LanguageMode var1 = null;
    com.google.javascript.jscomp.parsing.Config var3 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(true, var1, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test91() {}
//   public void test91() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }
// 
// 
//     java.lang.String var0 = com.google.javascript.jscomp.Compiler.getReleaseVersion();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var0 + "' != '" + "Unversioned directory"+ "'", var0.equals("Unversioned directory"));
// 
//   }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("module$JSDocInfo", var1, "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    boolean var1 = var0.isDirected();
    com.google.javascript.jscomp.DiagnosticGroup var2 = null;
    com.google.javascript.jscomp.CheckLevel var3 = null;
    com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var4 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var2, var3);
    com.google.javascript.jscomp.WarningsGuard[] var5 = new com.google.javascript.jscomp.WarningsGuard[] { var4};
    com.google.javascript.jscomp.ComposeWarningsGuard var6 = new com.google.javascript.jscomp.ComposeWarningsGuard(var5);
    com.google.javascript.rhino.JSDocInfo var7 = new com.google.javascript.rhino.JSDocInfo();
    boolean var9 = var7.hasParameter("");
    boolean var10 = var7.isNoTypeCheck();
    java.lang.Object var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var0.isConnectedInDirection((java.lang.Object)var5, (java.lang.Object)var7, var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test94() {}
//   public void test94() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }
// 
// 
//     com.google.javascript.jscomp.CodingConvention var0 = null;
//     com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention(var0);
//     boolean var3 = var1.isValidEnumKey("JSDocInfo");
//     java.util.Collection var4 = var1.getAssertionFunctions();
// 
//   }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }


    com.google.javascript.jscomp.ErrorManager var0 = null;
    com.google.javascript.jscomp.deps.JsFileParser var1 = new com.google.javascript.jscomp.deps.JsFileParser(var0);
    com.google.javascript.jscomp.deps.DependencyInfo var5 = var1.parseFile("", "LABEL_NAME hi!\n", "LABEL_NAME hi!\n");
    boolean var6 = var1.didParseSucceed();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.deps.DependencyInfo var9 = var1.parseFile("module$JSDocInfo", "hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test96() {}
//   public void test96() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     com.google.javascript.jscomp.PropertyRenamingPolicy var1 = null;
//     var0.setPropertyRenaming(var1);
//     var0.setInlineGetters(false);
//     com.google.javascript.jscomp.CompilerOptions.Reach var5 = null;
//     var0.setInlineVariables(var5);
// 
//   }

  public void test97() {}
//   public void test97() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }
// 
// 
//     java.io.InputStream var2 = null;
//     com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromInputStream("hi!", "module$JSDocInfo", var2);
// 
//   }

  public void test98() {}
//   public void test98() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }
// 
// 
//     com.google.javascript.rhino.Node[] var1 = null;
//     com.google.javascript.rhino.Node var4 = new com.google.javascript.rhino.Node(10, var1, 100, 153);
// 
//   }

  public void test99() {}
//   public void test99() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }
// 
// 
//     com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
//     java.util.List var2 = null;
//     boolean var3 = var1.recordTemplateTypeNames(var2);
// 
//   }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    java.lang.String var3 = var1.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var4 = null;
    var1.setStaticSourceFile(var4);
    com.google.javascript.rhino.JSTypeExpression var7 = new com.google.javascript.rhino.JSTypeExpression(var1, "hi!");
    com.google.javascript.rhino.Node var8 = var7.getRoot();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.regexp(var8);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    boolean var1 = var0.isDirected();
    java.util.Collection var2 = var0.getNodes();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
    java.lang.String[] var8 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var9 = com.google.javascript.jscomp.JSError.make(var6, var8);
    com.google.javascript.rhino.Node var14 = new com.google.javascript.rhino.Node(0, 10, 1);
    com.google.javascript.rhino.Node var15 = new com.google.javascript.rhino.Node(10, var14);
    boolean var16 = var9.equals((java.lang.Object)10);
    int var17 = var9.getCharno();
    java.lang.Object var18 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.connectIfNotFound((java.lang.Object)var3, (java.lang.Object)var9, var18);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));

  }

  public void test102() {}
//   public void test102() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.SourceMap var2 = var1.getSourceMap();
//     com.google.javascript.jscomp.PassConfig var3 = null;
//     var1.setPassConfig(var3);
// 
//   }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    com.google.javascript.rhino.jstype.JSType var3 = var1.getJSType();
    java.lang.Iterable var4 = var1.children();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.var(var1);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    boolean var1 = var0.isDirected();
    java.lang.Object var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.graph.Graph.GraphEdge var4 = var0.getFirstEdge((java.lang.Object)100.0f, var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }


    com.google.javascript.rhino.Node var4 = new com.google.javascript.rhino.Node(0, 10, 1);
    com.google.javascript.rhino.Node var5 = new com.google.javascript.rhino.Node(10, var4);
    boolean var6 = var4.isFromExterns();
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.labelName("hi!");
    int var9 = var8.getChildCount();
    java.lang.String var10 = var8.getSourceFileName();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.labelName("hi!");
    int var13 = var12.getChildCount();
    java.lang.String var14 = var12.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var15 = null;
    var12.setStaticSourceFile(var15);
    com.google.javascript.rhino.JSTypeExpression var18 = new com.google.javascript.rhino.JSTypeExpression(var12, "hi!");
    boolean var19 = var12.isNull();
    com.google.javascript.rhino.Node var20 = var8.clonePropsFrom(var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.assign(var4, var12);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test106() {}
//   public void test106() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }
// 
// 
//     com.google.javascript.jscomp.CodingConvention var0 = null;
//     com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention(var0);
//     boolean var4 = var1.isExported("LABEL_NAME hi!\n", false);
// 
//   }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }


    com.google.javascript.rhino.jstype.JSType var0 = null;
    com.google.javascript.rhino.jstype.JSType var1 = null;
    boolean var2 = com.google.javascript.rhino.jstype.JSType.isEquivalent(var0, var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }


    java.lang.String var1 = com.google.javascript.rhino.ScriptRuntime.escapeString("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.util.List var1 = var0.getEdges();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.labelName("hi!");
    int var4 = var3.getChildCount();
    java.lang.String var5 = var3.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var6 = var3.getStaticSourceFile();
    var3.setLineno(10);
    com.google.javascript.jscomp.CompilerOptions var9 = new com.google.javascript.jscomp.CompilerOptions();
    var9.setCollapseProperties(false);
    var9.enableExternExports(false);
    java.util.Set var14 = null;
    var9.setStripNamePrefixes(var14);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var16 = var9.getTweakProcessing();
    var9.setExtractPrototypeMemberDeclarations(false);
    com.google.javascript.jscomp.SourceMap.DetailLevel var19 = null;
    var9.setSourceMapDetailLevel(var19);
    var9.setPropertyAffinity(false);
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.labelName("hi!");
    int var25 = var24.getChildCount();
    java.lang.String var26 = var24.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var27 = null;
    var24.setStaticSourceFile(var27);
    com.google.javascript.rhino.JSTypeExpression var30 = new com.google.javascript.rhino.JSTypeExpression(var24, "hi!");
    com.google.javascript.rhino.Node var31 = var30.getRoot();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var32 = var0.isConnected((java.lang.Object)10, (java.lang.Object)var9, (java.lang.Object)var31);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test110() {}
//   public void test110() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }
// 
// 
//     com.google.javascript.jscomp.CodingConvention var0 = null;
//     com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention(var0);
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = null;
//     com.google.javascript.rhino.jstype.StaticScope var3 = null;
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var4 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
//     java.util.List var5 = var4.getEdges();
//     com.google.javascript.jscomp.ComposeWarningsGuard var6 = new com.google.javascript.jscomp.ComposeWarningsGuard(var5);
//     java.util.Map var7 = null;
//     var1.defineDelegateProxyPrototypeProperties(var2, var3, var5, var7);
// 
//   }

  public void test111() {}
//   public void test111() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Compiler.IntermediateState var2 = null;
//     var1.setState(var2);
// 
//   }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    var3.removeProp((-1));
    var3.setWasEmptyNode(true);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.paramList();
    boolean var9 = var8.hasOneChild();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.eq(var3, var8);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }


    com.google.javascript.jscomp.CodingConvention var0 = null;
    com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention(var0);
    boolean var3 = var1.isValidEnumKey("hi!");
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString(0, "", 1, 153);
    com.google.javascript.rhino.Node[] var10 = new com.google.javascript.rhino.Node[] { var9};
    com.google.javascript.rhino.Node var11 = new com.google.javascript.rhino.Node(0, var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var1.isVarArgsParameter(var11);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test114() {}
//   public void test114() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.SourceMap var2 = var1.getSourceMap();
//     com.google.javascript.jscomp.JSSourceFile var3 = null;
//     com.google.javascript.jscomp.JSSourceFile[] var4 = new com.google.javascript.jscomp.JSSourceFile[] { var3};
//     com.google.javascript.jscomp.JSModule var5 = null;
//     com.google.javascript.jscomp.JSModule[] var6 = new com.google.javascript.jscomp.JSModule[] { var5};
//     com.google.javascript.jscomp.CompilerOptions var7 = new com.google.javascript.jscomp.CompilerOptions();
//     var7.setCollapseProperties(false);
//     com.google.javascript.jscomp.StrictWarningsGuard var10 = new com.google.javascript.jscomp.StrictWarningsGuard();
//     var7.addWarningsGuard((com.google.javascript.jscomp.WarningsGuard)var10);
//     com.google.javascript.jscomp.CheckLevel var12 = null;
//     var7.setCheckGlobalThisLevel(var12);
//     var7.setAliasExternals(true);
//     java.util.Map var16 = null;
//     var7.setDefineReplacements(var16);
//     var1.init(var4, var6, var7);
// 
//   }

  public void test115() {}
//   public void test115() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test115"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Result var2 = var1.getResult();
// 
//   }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.labelName("hi!");
    int var7 = var6.getChildCount();
    com.google.javascript.rhino.jstype.JSType var8 = var6.getJSType();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.labelName("hi!");
    int var11 = var10.getChildCount();
    java.lang.String var12 = var10.getSourceFileName();
    com.google.javascript.rhino.Node var15 = new com.google.javascript.rhino.Node(153, var4, var6, var10, 0, 153);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.labelName("hi!");
    int var18 = var17.getChildCount();
    java.lang.String var19 = var17.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var20 = null;
    var17.setStaticSourceFile(var20);
    boolean var22 = var17.isDo();
    boolean var23 = var17.wasEmptyNode();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.tryFinally(var15, var17);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test117() {}
//   public void test117() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     var0.setCollapseProperties(false);
//     var0.enableExternExports(false);
//     var0.setLineBreak(true);
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     var0.setCheckProvides(var7);
//     com.google.javascript.jscomp.CompilerOptions.TracerMode var9 = var0.getTracerMode();
//     com.google.javascript.jscomp.CompilerOptions.Reach var10 = null;
//     var0.setInlineFunctions(var10);
// 
//   }

  public void test118() {}
//   public void test118() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     java.util.Set var1 = null;
//     var0.setStripTypePrefixes(var1);
//     var0.setDeadAssignmentElimination(false);
//     com.google.javascript.jscomp.CompilerOptions.LanguageMode var5 = var0.getLanguageOut();
//     var0.setOptimizeReturns(true);
//     com.google.javascript.jscomp.CompilerOptions.Reach var8 = null;
//     var0.setRemoveUnusedVariable(var8);
// 
//   }

  public void test119() {}
//   public void test119() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     var1.parse();
// 
//   }

  public void test120() {}
//   public void test120() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }
// 
// 
//     java.util.logging.Logger var0 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
//     com.google.javascript.jscomp.CheckLevel var2 = null;
//     com.google.javascript.jscomp.JSError var3 = null;
//     var1.println(var2, var3);
// 
//   }

  public void test121() {}
//   public void test121() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }
// 
// 
//     java.io.InputStream var2 = null;
//     com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromInputStream("InputId: hi!", "module$JSDocInfo", var2);
// 
//   }

  public void test122() {}
//   public void test122() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test122"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.SourceMap var2 = var1.getSourceMap();
//     int var3 = var1.getWarningCount();
// 
//   }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    java.lang.String var3 = var1.getSourceFileName();
    java.lang.String var4 = var1.toStringTree();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.returnNode(var1);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "LABEL_NAME hi!\n"+ "'", var4.equals("LABEL_NAME hi!\n"));

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("module$", 100, 100);
    com.google.javascript.rhino.jstype.StaticSourceFile var4 = var3.getStaticSourceFile();
    boolean var5 = var3.isIn();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.labelName("hi!");
    int var9 = var7.getIntProp(1);
    int var10 = var3.getIndexOfChild(var7);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.Node.newString(0, "", 1, 153);
    boolean var16 = var15.isDebugger();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var17 = var7.checkTreeEquals(var15);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test125() {}
//   public void test125() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test125"); }
// 
// 
//     com.google.javascript.rhino.jstype.JSTypeRegistry var0 = null;
//     com.google.javascript.rhino.jstype.FunctionBuilder var1 = new com.google.javascript.rhino.jstype.FunctionBuilder(var0);
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var4 = var3.getChildCount();
//     java.lang.String var5 = var3.getSourceFileName();
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var8 = var7.getChildCount();
//     java.lang.String var9 = var7.getSourceFileName();
//     com.google.javascript.rhino.jstype.StaticSourceFile var10 = null;
//     var7.setStaticSourceFile(var10);
//     com.google.javascript.rhino.JSTypeExpression var13 = new com.google.javascript.rhino.JSTypeExpression(var7, "hi!");
//     boolean var14 = var7.isNull();
//     com.google.javascript.rhino.Node var15 = var3.clonePropsFrom(var7);
//     boolean var16 = var7.isInc();
//     com.google.javascript.rhino.jstype.FunctionBuilder var17 = var1.withSourceNode(var7);
//     com.google.javascript.rhino.jstype.FunctionType var18 = null;
//     com.google.javascript.rhino.jstype.FunctionBuilder var19 = var17.copyFromOtherFunction(var18);
// 
//   }

  public void test126() {}
//   public void test126() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test126"); }
// 
// 
//     com.google.javascript.rhino.jstype.JSTypeRegistry var0 = null;
//     com.google.javascript.rhino.jstype.FunctionBuilder var1 = new com.google.javascript.rhino.jstype.FunctionBuilder(var0);
//     com.google.javascript.rhino.jstype.FunctionParamBuilder var2 = null;
//     com.google.javascript.rhino.jstype.FunctionBuilder var3 = var1.withParams(var2);
// 
//   }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test127"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.labelName("hi!");
    int var7 = var6.getChildCount();
    com.google.javascript.rhino.jstype.JSType var8 = var6.getJSType();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.labelName("hi!");
    int var11 = var10.getChildCount();
    java.lang.String var12 = var10.getSourceFileName();
    com.google.javascript.rhino.Node var15 = new com.google.javascript.rhino.Node(153, var4, var6, var10, 0, 153);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var16 = var15.getDouble();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test128"); }


    com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
    com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var3);
    com.google.javascript.jscomp.JSModule var5 = null;
    var4.setModule(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var4.getLineOffset(153);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test129() {}
//   public void test129() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test129"); }
// 
// 
//     java.io.InputStream var2 = null;
//     com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromInputStream("Unversioned directory", "", var2);
// 
//   }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test130"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.labelName("hi!");
    int var4 = var3.getChildCount();
    java.lang.String var5 = var3.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var6 = null;
    var3.setStaticSourceFile(var6);
    com.google.javascript.rhino.JSTypeExpression var9 = new com.google.javascript.rhino.JSTypeExpression(var3, "hi!");
    boolean var10 = var1.recordThrowType(var9);
    boolean var11 = var9.isOptionalArg();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test131() {}
//   public void test131() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test131"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     boolean var2 = var1.acceptConstKeyword();
// 
//   }

  public void test132() {}
//   public void test132() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test132"); }
// 
// 
//     java.io.InputStream var2 = null;
//     com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromInputStream("JSDocInfo", "Unversioned directory", var2);
// 
//   }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test133"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    var0.clearEdgeAnnotations();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var3 = var0.getDirectedPredNodes((java.lang.Object)(-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test134"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.jscomp.SourceFile var4 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
    com.google.javascript.jscomp.CompilerInput var5 = new com.google.javascript.jscomp.CompilerInput(var4);
    var0.setStaticSourceFile((com.google.javascript.rhino.jstype.StaticSourceFile)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.defaultCase(var0);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test135"); }


    com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
    java.lang.String var5 = var3.getLine(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var3.getLineOffset(0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test136"); }


    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.Node.newString(0, "", 1, 153);
    com.google.javascript.rhino.Node[] var6 = new com.google.javascript.rhino.Node[] { var5};
    com.google.javascript.rhino.Node var7 = new com.google.javascript.rhino.Node(0, var6);
    boolean var8 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(var7);
    com.google.javascript.rhino.Node var13 = new com.google.javascript.rhino.Node(0, 10, 1);
    com.google.javascript.rhino.Node var14 = new com.google.javascript.rhino.Node(10, var13);
    boolean var15 = var13.isFromExterns();
    boolean var16 = var13.isRegExp();
    com.google.javascript.rhino.Node var17 = var7.useSourceInfoIfMissingFrom(var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.pos(var17);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test137"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.util.List var1 = var0.getEdges();
    java.util.Collection var2 = var0.getNodes();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var4 = var0.getDirectedSuccNodes(var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test138() {}
//   public void test138() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test138"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.SourceMap var2 = var1.getSourceMap();
//     com.google.javascript.jscomp.SourceFile var6 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
//     java.lang.String var8 = var6.getLine(1);
//     com.google.javascript.jscomp.JSSourceFile var9 = null;
//     com.google.javascript.jscomp.JSSourceFile[] var10 = new com.google.javascript.jscomp.JSSourceFile[] { var9};
//     com.google.javascript.jscomp.CompilerOptions var11 = new com.google.javascript.jscomp.CompilerOptions();
//     var11.setCollapseProperties(false);
//     com.google.javascript.jscomp.StrictWarningsGuard var14 = new com.google.javascript.jscomp.StrictWarningsGuard();
//     var11.addWarningsGuard((com.google.javascript.jscomp.WarningsGuard)var14);
//     var11.setFoldConstants(false);
//     com.google.javascript.jscomp.Result var18 = var1.compile(var6, var10, var11);
// 
//   }

  public void test139() {}
//   public void test139() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test139"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.InputId var3 = new com.google.javascript.rhino.InputId("hi!");
//     java.lang.String var4 = var3.toString();
//     com.google.javascript.jscomp.CompilerInput var5 = var1.getInput(var3);
// 
//   }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test140"); }


    com.google.javascript.jscomp.CustomPassExecutionTime[] var0 = com.google.javascript.jscomp.CustomPassExecutionTime.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test141"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.labelName("hi!");
    int var7 = var6.getChildCount();
    com.google.javascript.rhino.jstype.JSType var8 = var6.getJSType();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.labelName("hi!");
    int var11 = var10.getChildCount();
    java.lang.String var12 = var10.getSourceFileName();
    com.google.javascript.rhino.Node var15 = new com.google.javascript.rhino.Node(153, var4, var6, var10, 0, 153);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.labelName("hi!");
    int var18 = var17.getChildCount();
    java.lang.String var19 = var17.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var20 = null;
    var17.setStaticSourceFile(var20);
    boolean var22 = var17.isAnd();
    boolean var23 = var17.isEmpty();
    boolean var24 = var10.hasChild(var17);
    var17.putIntProp(153, 100);
    boolean var28 = var17.isLabelName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.var(var17);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test142() {}
//   public void test142() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test142"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
//     boolean var1 = var0.isDirected();
//     com.google.javascript.jscomp.CompilerOptions var2 = new com.google.javascript.jscomp.CompilerOptions();
//     var2.setCollapseProperties(false);
//     com.google.javascript.jscomp.StrictWarningsGuard var5 = new com.google.javascript.jscomp.StrictWarningsGuard();
//     var2.addWarningsGuard((com.google.javascript.jscomp.WarningsGuard)var5);
//     var2.setRemoveAbstractMethods(false);
//     com.google.javascript.jscomp.CompilerOptions var9 = new com.google.javascript.jscomp.CompilerOptions();
//     var9.setCollapseProperties(false);
//     var9.enableExternExports(false);
//     var9.setAliasExternals(false);
//     com.google.javascript.rhino.JSDocInfo var16 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var18 = var16.hasParameter("");
//     var16.setDeprecated(true);
//     int var21 = var16.getParameterCount();
//     boolean var22 = var16.isDefine();
//     java.util.Set var23 = var16.getSuppressions();
//     var9.setStripTypes(var23);
//     var2.setStripNamePrefixes(var23);
//     java.util.List var26 = var0.getNeighborNodes((java.lang.Object)var2);
// 
//   }

  public void test143() {}
//   public void test143() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test143"); }
// 
// 
//     com.google.javascript.jscomp.AstValidator.ViolationHandler var0 = null;
//     com.google.javascript.jscomp.AstValidator var1 = new com.google.javascript.jscomp.AstValidator(var0);
//     com.google.javascript.rhino.Node var2 = null;
//     var1.validateStatement(var2);
// 
//   }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test144"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.VariableRenamingPolicy var1 = com.google.javascript.jscomp.VariableRenamingPolicy.valueOf("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test145"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    boolean var1 = var0.isDirected();
    com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
    boolean var4 = var2.hasParameter("");
    java.util.List var5 = var2.getImplementedInterfaces();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var6 = var0.getNodeDegree((java.lang.Object)var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test146() {}
//   public void test146() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test146"); }
// 
// 
//     com.google.javascript.jscomp.AstValidator.ViolationHandler var0 = null;
//     com.google.javascript.jscomp.AstValidator var1 = new com.google.javascript.jscomp.AstValidator(var0);
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.continueNode();
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.falseNode();
//     com.google.javascript.rhino.Node var4 = var2.useSourceInfoFromForTree(var3);
//     boolean var5 = var3.isFunction();
//     java.lang.Iterable var6 = var3.children();
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.Node.newString(0, "", 1, 153);
//     var1.process(var3, var11);
// 
//   }

  public void test147() {}
//   public void test147() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test147"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
//     java.lang.String[] var4 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var5 = com.google.javascript.jscomp.JSError.make(var2, var4);
//     com.google.javascript.jscomp.CompilerOptions var6 = new com.google.javascript.jscomp.CompilerOptions();
//     java.util.Set var7 = null;
//     var6.setStripTypePrefixes(var7);
//     var6.setMoveFunctionDeclarations(false);
//     boolean var11 = var5.equals((java.lang.Object)false);
//     com.google.javascript.jscomp.CheckLevel var12 = null;
//     com.google.javascript.jscomp.MessageFormatter var13 = null;
//     java.lang.String var14 = var5.format(var12, var13);
// 
//   }

  public void test148() {}
//   public void test148() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test148"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     com.google.javascript.rhino.JSTypeExpression var2 = new com.google.javascript.rhino.JSTypeExpression(var0, "module$");
//     
//     // Checks the contract:  var2.equals(var2)
//     assertTrue("Contract failed: var2.equals(var2)", var2.equals(var2));
// 
//   }

  public void test149() {}
//   public void test149() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test149"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     var1.disableThreads();
//     java.lang.String var13 = var1.toSource();
// 
//   }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test150"); }


    com.google.javascript.jscomp.SourceFile.Builder var0 = com.google.javascript.jscomp.SourceFile.builder();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test151() {}
//   public void test151() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test151"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     java.lang.String var2 = var1.toSource();
// 
//   }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test152"); }


    java.lang.String var1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("LABEL_NAME hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "(LABEL_NAME hi!)"+ "'", var1.equals("(LABEL_NAME hi!)"));

  }

  public void test153() {}
//   public void test153() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test153"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     java.lang.String[] var2 = var1.toSourceArray();
// 
//   }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test154"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.SourceFile var1 = new com.google.javascript.jscomp.SourceFile("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test155() {}
//   public void test155() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test155"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     com.google.javascript.jscomp.SourceMap var12 = var1.getSourceMap();
//     com.google.javascript.jscomp.JSSourceFile var13 = null;
//     com.google.javascript.jscomp.JSModule var15 = new com.google.javascript.jscomp.JSModule("LABEL_NAME hi!");
//     java.util.List var16 = var15.getDependencies();
//     com.google.javascript.jscomp.JSModule[] var17 = new com.google.javascript.jscomp.JSModule[] { var15};
//     com.google.javascript.jscomp.CompilerOptions var18 = new com.google.javascript.jscomp.CompilerOptions();
//     com.google.javascript.jscomp.PropertyRenamingPolicy var19 = null;
//     var18.setPropertyRenaming(var19);
//     var18.setNameAnonymousFunctionsOnly(true);
//     com.google.javascript.jscomp.Result var23 = var1.compile(var13, var17, var18);
// 
//   }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test156"); }


    com.google.javascript.jscomp.AstValidator var0 = new com.google.javascript.jscomp.AstValidator();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("hi!");
    int var3 = var2.getChildCount();
    var2.detachChildren();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.validateScript(var2);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test157"); }


    com.google.javascript.rhino.Node var3 = new com.google.javascript.rhino.Node(0, 10, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var4 = var3.detachFromParent();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test158"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
    java.lang.String[] var4 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var5 = com.google.javascript.jscomp.JSError.make(var2, var4);
    com.google.javascript.jscomp.CompilerOptions var6 = new com.google.javascript.jscomp.CompilerOptions();
    java.util.Set var7 = null;
    var6.setStripTypePrefixes(var7);
    var6.setMoveFunctionDeclarations(false);
    boolean var11 = var5.equals((java.lang.Object)false);
    java.lang.String var12 = var5.toString();
    int var13 = var5.getNodeSourceOffset();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ". hi! at (unknown source) line (unknown line) : (unknown column)"+ "'", var12.equals(". hi! at (unknown source) line (unknown line) : (unknown column)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test159"); }


    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.Node.newString(0, "", 1, 153);
    com.google.javascript.rhino.Node[] var6 = new com.google.javascript.rhino.Node[] { var5};
    com.google.javascript.rhino.Node var7 = new com.google.javascript.rhino.Node(0, var6);
    boolean var8 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(var7);
    var7.setSourceEncodedPositionForTree(1);
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.labelName("hi!");
    int var13 = var12.getChildCount();
    java.lang.String var14 = var12.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var15 = null;
    var12.setStaticSourceFile(var15);
    boolean var17 = var12.isAnd();
    boolean var18 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.getelem(var7, var12);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test160() {}
//   public void test160() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test160"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.SourceMap var2 = var1.getSourceMap();
//     com.google.javascript.jscomp.CompilerOptions var3 = new com.google.javascript.jscomp.CompilerOptions();
//     var3.setCollapseProperties(false);
//     var3.setCollapseVariableDeclarations(false);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var8 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
//     java.util.List var9 = var8.getEdges();
//     com.google.javascript.jscomp.ComposeWarningsGuard var10 = new com.google.javascript.jscomp.ComposeWarningsGuard(var9);
//     var3.setSourceMapLocationMappings(var9);
//     com.google.javascript.rhino.JSDocInfo var12 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var14 = var12.hasParameter("");
//     java.util.List var15 = var12.getImplementedInterfaces();
//     com.google.javascript.jscomp.CompilerOptions var16 = null;
//     var1.<com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.SourceFile>init(var9, var15, var16);
// 
//   }

  public void test161() {}
//   public void test161() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test161"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticGroup var1 = null;
//     com.google.javascript.jscomp.DiagnosticGroup[] var2 = new com.google.javascript.jscomp.DiagnosticGroup[] { var1};
//     com.google.javascript.jscomp.DiagnosticGroup var3 = new com.google.javascript.jscomp.DiagnosticGroup("", var2);
// 
//   }

  public void test162() {}
//   public void test162() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test162"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     var1.processDefines();
// 
//   }

  public void test163() {}
//   public void test163() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test163"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     com.google.javascript.jscomp.SourceMap var12 = var1.getSourceMap();
//     com.google.javascript.jscomp.Scope var13 = var1.getTopScope();
//     com.google.javascript.jscomp.JSModule var15 = new com.google.javascript.jscomp.JSModule("LABEL_NAME hi!");
//     var15.setDepth(153);
//     java.lang.String var18 = var1.toSource(var15);
// 
//   }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test164"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    java.lang.String var3 = var1.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var4 = null;
    var1.setStaticSourceFile(var4);
    boolean var6 = var1.isDo();
    var1.setLength(1);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.labelName("hi!");
    int var16 = var15.getChildCount();
    com.google.javascript.rhino.jstype.JSType var17 = var15.getJSType();
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.labelName("hi!");
    int var20 = var19.getChildCount();
    java.lang.String var21 = var19.getSourceFileName();
    com.google.javascript.rhino.Node var24 = new com.google.javascript.rhino.Node(153, var13, var15, var19, 0, 153);
    java.lang.Iterable var25 = var19.siblings();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.ifNode(var1, var19);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test165"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var2 = var1.cloneTree();
    com.google.javascript.rhino.Node[] var3 = new com.google.javascript.rhino.Node[] { var1};
    com.google.javascript.rhino.Node var4 = new com.google.javascript.rhino.Node(100, var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.paramList(var3);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test166() {}
//   public void test166() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test166"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     var1.disableThreads();
//     com.google.javascript.jscomp.type.ReverseAbstractInterpreter var13 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var14 = null;
//     com.google.javascript.jscomp.CheckLevel var15 = null;
//     com.google.javascript.jscomp.CheckLevel var16 = null;
//     com.google.javascript.jscomp.TypeCheck var17 = new com.google.javascript.jscomp.TypeCheck((com.google.javascript.jscomp.AbstractCompiler)var1, var13, var14, var15, var16);
// 
//   }

  public void test167() {}
//   public void test167() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test167"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticGroup var0 = null;
//     com.google.javascript.jscomp.CheckLevel var1 = null;
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var2 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var0, var1);
//     com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
//     java.lang.String[] var7 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var8 = com.google.javascript.jscomp.JSError.make(var5, var7);
//     com.google.javascript.rhino.Node var13 = new com.google.javascript.rhino.Node(0, 10, 1);
//     com.google.javascript.rhino.Node var14 = new com.google.javascript.rhino.Node(10, var13);
//     boolean var15 = var8.equals((java.lang.Object)10);
//     com.google.javascript.jscomp.CheckLevel var16 = var2.level(var8);
// 
//   }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test168"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CustomPassExecutionTime var1 = com.google.javascript.jscomp.CustomPassExecutionTime.valueOf("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test169"); }


    com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
    com.google.javascript.jscomp.parsing.Config.LanguageMode var6 = null;
    java.util.Set var8 = null;
    com.google.javascript.jscomp.parsing.Config var9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(false, var6, false, var8);
    com.google.javascript.rhino.head.ErrorReporter var10 = null;
    java.util.logging.Logger var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var12 = com.google.javascript.jscomp.parsing.ParserRunner.parse((com.google.javascript.rhino.jstype.StaticSourceFile)var3, "InputId: hi!", var9, var10, var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test170() {}
//   public void test170() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test170"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var2 = var1.getChildCount();
//     java.lang.String var3 = var1.getSourceFileName();
//     com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var6 = var5.getChildCount();
//     java.lang.String var7 = var5.getSourceFileName();
//     com.google.javascript.rhino.jstype.StaticSourceFile var8 = null;
//     var5.setStaticSourceFile(var8);
//     com.google.javascript.rhino.JSTypeExpression var11 = new com.google.javascript.rhino.JSTypeExpression(var5, "hi!");
//     boolean var12 = var5.isNull();
//     com.google.javascript.rhino.Node var13 = var1.clonePropsFrom(var5);
//     com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
//     com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var21 = var20.getChildCount();
//     com.google.javascript.rhino.jstype.JSType var22 = var20.getJSType();
//     com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var25 = var24.getChildCount();
//     java.lang.String var26 = var24.getSourceFileName();
//     com.google.javascript.rhino.Node var29 = new com.google.javascript.rhino.Node(153, var18, var20, var24, 0, 153);
//     com.google.javascript.rhino.Node var30 = var1.getChildBefore(var29);
// 
//   }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test171"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.util.List var1 = var0.getEdges();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.trueNode();
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.labelName("hi!");
    int var5 = var4.getChildCount();
    java.lang.String var6 = var4.getSourceFileName();
    java.lang.String var7 = var4.toString();
    boolean var8 = var2.isEquivalentToTyped(var4);
    boolean var9 = var2.isFor();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var0.isConnected((java.lang.Object)var9, (java.lang.Object)0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "LABEL_NAME hi!"+ "'", var7.equals("LABEL_NAME hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test172() {}
//   public void test172() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test172"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var3 = var2.getChildCount();
//     java.lang.String var4 = var2.getSourceFileName();
//     com.google.javascript.jscomp.CodingConvention.Bind var6 = var0.describeFunctionBind(var2, true);
//     com.google.javascript.rhino.Node var7 = null;
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var10 = var9.getChildCount();
//     java.lang.String var11 = var9.getSourceFileName();
//     com.google.javascript.rhino.jstype.StaticSourceFile var12 = null;
//     var9.setStaticSourceFile(var12);
//     boolean var14 = var9.isAnd();
//     boolean var15 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(var9);
//     java.lang.String var16 = var0.extractClassNameIfRequire(var7, var9);
//     com.google.javascript.rhino.jstype.FunctionType var17 = null;
//     com.google.javascript.rhino.jstype.FunctionType var18 = null;
//     com.google.javascript.rhino.jstype.ObjectType var19 = null;
//     var0.applySingletonGetter(var17, var18, var19);
// 
//   }

  public void test173() {}
//   public void test173() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test173"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     var1.disableThreads();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var13 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
//     java.util.List var14 = var13.getEdges();
//     com.google.javascript.jscomp.ComposeWarningsGuard var15 = new com.google.javascript.jscomp.ComposeWarningsGuard(var14);
//     com.google.javascript.rhino.jstype.JSTypeRegistry var16 = null;
//     com.google.javascript.rhino.jstype.FunctionBuilder var17 = new com.google.javascript.rhino.jstype.FunctionBuilder(var16);
//     com.google.javascript.rhino.JSDocInfo var18 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var20 = var18.hasParameter("");
//     boolean var21 = var18.isNoTypeCheck();
//     int var22 = var18.getImplementedInterfaceCount();
//     com.google.common.collect.ImmutableList var23 = var18.getTemplateTypeNames();
//     com.google.javascript.rhino.jstype.FunctionBuilder var24 = var17.withTemplateNames(var23);
//     com.google.javascript.jscomp.CompilerOptions var25 = null;
//     var1.<com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.SourceFile>init(var14, (java.util.List)var23, var25);
// 
//   }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test174"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    boolean var3 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(var1);
    boolean var4 = var1.hasOneChild();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.returnNode();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.add(var1, var5);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test175"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    boolean var3 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.pos(var1);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test176() {}
//   public void test176() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test176"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     com.google.javascript.jscomp.JSModule var13 = new com.google.javascript.jscomp.JSModule("LABEL_NAME hi!");
//     var13.setDepth(153);
//     com.google.javascript.jscomp.SourceFile var19 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
//     com.google.javascript.jscomp.CompilerInput var20 = new com.google.javascript.jscomp.CompilerInput(var19);
//     com.google.javascript.rhino.InputId var21 = null;
//     com.google.javascript.jscomp.CompilerInput var23 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var20, var21, false);
//     var13.addFirst(var20);
//     java.lang.String var25 = var1.toSource(var13);
// 
//   }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test177"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var2 = var1.cloneTree();
    com.google.javascript.rhino.Node[] var3 = new com.google.javascript.rhino.Node[] { var1};
    com.google.javascript.rhino.Node var4 = new com.google.javascript.rhino.Node(100, var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.script(var3);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test178"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled("JSDocInfo", "Unversioned directory");
    java.lang.String var3 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "JSDocInfo: Unversioned directory"+ "'", var3.equals("JSDocInfo: Unversioned directory"));

  }

  public void test179() {}
//   public void test179() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test179"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     com.google.javascript.jscomp.SourceMap var12 = var1.getSourceMap();
//     com.google.javascript.jscomp.Region var15 = var1.getSourceRegion("InputId: hi!", 1);
// 
//   }

  public void test180() {}
//   public void test180() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test180"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     java.lang.String[] var12 = var1.toSourceArray();
// 
//   }

  public void test181() {}
//   public void test181() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test181"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.SourceMap var2 = var1.getSourceMap();
//     java.util.Map var3 = var1.getInputsById();
// 
//   }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test182"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CustomPassExecutionTime var1 = com.google.javascript.jscomp.CustomPassExecutionTime.valueOf(": hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test183() {}
//   public void test183() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test183"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     var1.disableThreads();
//     com.google.javascript.rhino.jstype.JSTypeRegistry var13 = var1.getTypeRegistry();
// 
//   }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test184"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    java.lang.String var3 = var1.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var4 = null;
    var1.setStaticSourceFile(var4);
    boolean var6 = var1.isAnd();
    com.google.javascript.rhino.Node var10 = new com.google.javascript.rhino.Node(0, 10, 1);
    boolean var11 = var10.isAnd();
    boolean var12 = var10.isParamList();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.ifNode(var1, var10);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test185() {}
//   public void test185() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test185"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
//     int var5 = var3.getLineOfOffset(100);
//     com.google.javascript.jscomp.CompilerInput var7 = new com.google.javascript.jscomp.CompilerInput(var3, true);
//     java.util.Collection var8 = var7.getProvides();
// 
//   }

  public void test186() {}
//   public void test186() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test186"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var6 = null;
//     com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
//     com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
//     java.lang.String[] var14 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var15 = com.google.javascript.jscomp.JSError.make(var12, var14);
//     com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("JSDocInfo", 0, 0, var6, var9, var14);
//     com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
//     java.lang.String[] var21 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var22 = com.google.javascript.jscomp.JSError.make(var19, var21);
//     com.google.javascript.jscomp.JSError var23 = com.google.javascript.jscomp.JSError.make(". hi! at (unknown source) line (unknown line) : (unknown column)", 10, (-1), var9, var21);
//     int var24 = var23.getCharno();
//     com.google.javascript.jscomp.CheckLevel var25 = null;
//     com.google.javascript.jscomp.MessageFormatter var26 = null;
//     java.lang.String var27 = var23.format(var25, var26);
// 
//   }

  public void test187() {}
//   public void test187() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test187"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     java.util.Set var1 = null;
//     var0.setStripTypePrefixes(var1);
//     var0.setDeadAssignmentElimination(false);
//     com.google.javascript.jscomp.CompilerOptions.LanguageMode var5 = var0.getLanguageOut();
//     var0.setRemoveTryCatchFinally(false);
//     com.google.javascript.jscomp.CompilerOptions.Reach var8 = null;
//     var0.setInlineVariables(var8);
// 
//   }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test188"); }


    com.google.javascript.rhino.jstype.JSType var0 = null;
    com.google.javascript.rhino.jstype.FunctionType var1 = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test189"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
    boolean var4 = var2.hasParameter("");
    java.util.List var5 = var2.getImplementedInterfaces();
    java.lang.String var6 = var2.getOriginalCommentString();
    java.lang.String var7 = var2.toString();
    java.lang.String var8 = var2.getLicense();
    java.util.List var9 = var2.getImplementedInterfaces();
    com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
    var1.disableThreads();
    com.google.javascript.jscomp.NodeTraversal.Callback var13 = null;
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.Node.newString(0, "", 1, 153);
    com.google.javascript.rhino.Node[] var20 = new com.google.javascript.rhino.Node[] { var19};
    com.google.javascript.rhino.Node var21 = new com.google.javascript.rhino.Node(0, var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var13, var20);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "JSDocInfo"+ "'", var7.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test190() {}
//   public void test190() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test190"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     var0.setCollapseProperties(false);
//     var0.enableExternExports(false);
//     java.util.Set var5 = null;
//     var0.setStripNamePrefixes(var5);
//     com.google.javascript.jscomp.CompilerOptions.TweakProcessing var7 = var0.getTweakProcessing();
//     var0.setAliasAllStrings(true);
//     com.google.javascript.jscomp.CompilerOptions.Reach var10 = null;
//     var0.setInlineFunctions(var10);
// 
//   }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test191"); }


    com.google.javascript.rhino.jstype.JSType var0 = null;
    com.google.javascript.rhino.jstype.ParameterizedType var1 = com.google.javascript.rhino.jstype.JSType.toMaybeParameterizedType(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test192() {}
//   public void test192() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test192"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     var1.disableThreads();
//     com.google.javascript.jscomp.JSSourceFile var13 = null;
//     com.google.javascript.jscomp.JSModule var15 = new com.google.javascript.jscomp.JSModule("LABEL_NAME hi!");
//     var15.setDepth(153);
//     com.google.javascript.jscomp.SourceFile var21 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
//     com.google.javascript.jscomp.CompilerInput var22 = new com.google.javascript.jscomp.CompilerInput(var21);
//     com.google.javascript.rhino.InputId var23 = null;
//     com.google.javascript.jscomp.CompilerInput var25 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var22, var23, false);
//     var15.addFirst(var22);
//     com.google.javascript.jscomp.JSModule[] var27 = new com.google.javascript.jscomp.JSModule[] { var15};
//     com.google.javascript.jscomp.CompilerOptions var28 = new com.google.javascript.jscomp.CompilerOptions();
//     java.util.Set var29 = null;
//     var28.setStripTypePrefixes(var29);
//     var28.setDeadAssignmentElimination(false);
//     com.google.javascript.jscomp.PropertyRenamingPolicy var33 = null;
//     var28.setPropertyRenaming(var33);
//     com.google.javascript.jscomp.Result var35 = var1.compile(var13, var27, var28);
// 
//   }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test193"); }


    com.google.javascript.jscomp.AstValidator var0 = new com.google.javascript.jscomp.AstValidator();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("hi!");
    int var3 = var2.getChildCount();
    boolean var4 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(var2);
    java.lang.String var5 = var2.getString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.validateScript(var2);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test194"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.VariableRenamingPolicy var1 = com.google.javascript.jscomp.VariableRenamingPolicy.valueOf(". hi! at (unknown source) line (unknown line) : (unknown column)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test195() {}
//   public void test195() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test195"); }
// 
// 
//     com.google.javascript.rhino.jstype.JSTypeRegistry var0 = null;
//     com.google.javascript.rhino.jstype.FunctionBuilder var1 = new com.google.javascript.rhino.jstype.FunctionBuilder(var0);
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var4 = var3.getChildCount();
//     java.lang.String var5 = var3.getSourceFileName();
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var8 = var7.getChildCount();
//     java.lang.String var9 = var7.getSourceFileName();
//     com.google.javascript.rhino.jstype.StaticSourceFile var10 = null;
//     var7.setStaticSourceFile(var10);
//     com.google.javascript.rhino.JSTypeExpression var13 = new com.google.javascript.rhino.JSTypeExpression(var7, "hi!");
//     boolean var14 = var7.isNull();
//     com.google.javascript.rhino.Node var15 = var3.clonePropsFrom(var7);
//     boolean var16 = var7.isInc();
//     com.google.javascript.rhino.jstype.FunctionBuilder var17 = var1.withSourceNode(var7);
//     com.google.javascript.rhino.jstype.FunctionType var18 = var1.build();
// 
//   }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test196"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.util.List var1 = var0.getEdges();
    com.google.javascript.jscomp.CheckLevel var8 = null;
    com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
    com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
    java.lang.String[] var16 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var17 = com.google.javascript.jscomp.JSError.make(var14, var16);
    com.google.javascript.jscomp.JSError var18 = com.google.javascript.jscomp.JSError.make("JSDocInfo", 0, 0, var8, var11, var16);
    com.google.javascript.jscomp.DiagnosticType var21 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
    java.lang.String[] var23 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var24 = com.google.javascript.jscomp.JSError.make(var21, var23);
    com.google.javascript.jscomp.JSError var25 = com.google.javascript.jscomp.JSError.make(". hi! at (unknown source) line (unknown line) : (unknown column)", 10, (-1), var11, var23);
    com.google.javascript.jscomp.CompilerOptions var26 = new com.google.javascript.jscomp.CompilerOptions();
    var26.setRenamePrefixNamespace("JSDocInfo");
    var26.setOutputJsStringUsage(false);
    com.google.javascript.rhino.JSDocInfo var31 = new com.google.javascript.rhino.JSDocInfo();
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var33 = var32.cloneTree();
    var31.setAssociatedNode(var33);
    int var35 = var31.getParameterCount();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.connectIfNotFound((java.lang.Object)var11, (java.lang.Object)false, (java.lang.Object)var35);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);

  }

  public void test197() {}
//   public void test197() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test197"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
//     boolean var1 = var0.isDirected();
//     java.lang.String var2 = var0.getName();
//     var0.popNodeAnnotations();
// 
//   }

  public void test198() {}
//   public void test198() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test198"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     com.google.javascript.jscomp.CheckLevel var1 = null;
//     var0.setAggressiveVarCheck(var1);
//     com.google.javascript.jscomp.VariableRenamingPolicy var3 = null;
//     com.google.javascript.jscomp.PropertyRenamingPolicy var4 = null;
//     var0.setRenamingPolicy(var3, var4);
//     com.google.javascript.jscomp.CompilerOptions.Reach var6 = null;
//     var0.setInlineFunctions(var6);
// 
//   }

  public void test199() {}
//   public void test199() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test199"); }
// 
// 
//     com.google.javascript.jscomp.CodingConvention var0 = null;
//     com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention(var0);
//     boolean var3 = var1.isValidEnumKey("JSDocInfo");
//     boolean var5 = var1.isConstant("(LABEL_NAME hi!)");
//     boolean var8 = var1.isExported(": hi!", false);
// 
//   }

  public void test200() {}
//   public void test200() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test200"); }
// 
// 
//     com.google.javascript.rhino.jstype.ObjectType var0 = null;
//     com.google.javascript.rhino.jstype.ObjectType var2 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(var0, "InputId: hi!");
// 
//   }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test201"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.block();
    com.google.javascript.rhino.jstype.JSType var1 = var0.getJSType();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.defaultCase(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.throwNode(var2);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test202() {}
//   public void test202() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test202"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     var0.setCollapseProperties(false);
//     var0.enableExternExports(false);
//     var0.setLineBreak(true);
//     com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler var7 = null;
//     var0.setAliasTransformationHandler(var7);
//     var0.setCommonJSModulePathPrefix("");
//     var0.setSyntheticBlockEndMarker("JSDocInfo");
//     com.google.javascript.jscomp.CompilerOptions.Reach var13 = null;
//     var0.setRemoveUnusedVariables(var13);
// 
//   }

  public void test203() {}
//   public void test203() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test203"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var3);
//     com.google.javascript.rhino.InputId var5 = null;
//     com.google.javascript.jscomp.CompilerInput var7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var4, var5, false);
//     var4.clearAst();
//     com.google.javascript.jscomp.SourceFile var9 = var4.getSourceFile();
//     com.google.javascript.jscomp.JSModule var11 = new com.google.javascript.jscomp.JSModule("LABEL_NAME hi!");
//     var11.setDepth(153);
//     var4.setModule(var11);
//     java.util.Collection var15 = var4.getRequires();
// 
//   }

  public void test204() {}
//   public void test204() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test204"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     boolean var1 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(var0);
// 
//   }

  public void test205() {}
//   public void test205() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test205"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     com.google.javascript.jscomp.SourceMap var12 = var1.getSourceMap();
//     com.google.javascript.jscomp.Scope var13 = var1.getTopScope();
//     boolean var14 = var1.isIdeMode();
// 
//   }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test206"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    java.lang.String var3 = var1.getSourceFileName();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.labelName("hi!");
    int var6 = var5.getChildCount();
    java.lang.String var7 = var5.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var8 = null;
    var5.setStaticSourceFile(var8);
    com.google.javascript.rhino.JSTypeExpression var11 = new com.google.javascript.rhino.JSTypeExpression(var5, "hi!");
    boolean var12 = var5.isNull();
    com.google.javascript.rhino.Node var13 = var1.clonePropsFrom(var5);
    com.google.javascript.rhino.Node[] var14 = new com.google.javascript.rhino.Node[] { var13};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.script(var14);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test207() {}
//   public void test207() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test207"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var3);
//     com.google.javascript.jscomp.JSModule var5 = null;
//     var4.setModule(var5);
//     java.io.PrintStream var7 = null;
//     com.google.javascript.jscomp.Compiler var8 = new com.google.javascript.jscomp.Compiler(var7);
//     com.google.javascript.rhino.JSDocInfo var9 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var11 = var9.hasParameter("");
//     java.util.List var12 = var9.getImplementedInterfaces();
//     java.lang.String var13 = var9.getOriginalCommentString();
//     java.lang.String var14 = var9.toString();
//     java.lang.String var15 = var9.getLicense();
//     java.util.List var16 = var9.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var17 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var8, var16, var17);
//     var4.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var8);
//     com.google.javascript.rhino.JSDocInfo var20 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var22 = var20.hasParameter("");
//     boolean var23 = var20.isNoTypeCheck();
//     int var24 = var20.getImplementedInterfaceCount();
//     com.google.common.collect.ImmutableList var25 = var20.getTemplateTypeNames();
//     com.google.javascript.jscomp.JSModule[] var26 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var25);
//     java.util.List var27 = null;
//     com.google.javascript.jscomp.CompilerOptions var28 = new com.google.javascript.jscomp.CompilerOptions();
//     var28.setCollapseProperties(false);
//     var28.enableExternExports(false);
//     java.util.Set var33 = null;
//     var28.setStripNamePrefixes(var33);
//     com.google.javascript.jscomp.CompilerOptions.TweakProcessing var35 = var28.getTweakProcessing();
//     var28.setAliasAllStrings(true);
//     var8.<com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.SourceFile>init((java.util.List)var25, var27, var28);
// 
//   }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test208"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("hi!");
    int var3 = var2.getChildCount();
    java.lang.String var4 = var2.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var5 = var2.getStaticSourceFile();
    boolean var6 = var2.isQualifiedName();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    var10.putBooleanProp(0, false);
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.labelName("hi!");
    int var21 = var20.getChildCount();
    com.google.javascript.rhino.jstype.JSType var22 = var20.getJSType();
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.labelName("hi!");
    int var25 = var24.getChildCount();
    java.lang.String var26 = var24.getSourceFileName();
    com.google.javascript.rhino.Node var29 = new com.google.javascript.rhino.Node(153, var18, var20, var24, 0, 153);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.labelName("hi!");
    int var32 = var31.getChildCount();
    java.lang.String var33 = var31.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var34 = null;
    var31.setStaticSourceFile(var34);
    boolean var36 = var31.isAnd();
    boolean var37 = var31.isEmpty();
    boolean var38 = var24.hasChild(var31);
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.labelName("hi!");
    int var41 = var40.getChildCount();
    com.google.javascript.rhino.jstype.JSType var42 = var40.getJSType();
    int var43 = var40.getType();
    com.google.javascript.rhino.Node var44 = var40.cloneTree();
    com.google.javascript.rhino.Node var47 = new com.google.javascript.rhino.Node((-1), var2, var10, var31, var40, 100, 10);
    com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var54 = com.google.javascript.rhino.IR.labelName("hi!");
    int var55 = var54.getChildCount();
    com.google.javascript.rhino.jstype.JSType var56 = var54.getJSType();
    com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.labelName("hi!");
    int var59 = var58.getChildCount();
    java.lang.String var60 = var58.getSourceFileName();
    com.google.javascript.rhino.Node var63 = new com.google.javascript.rhino.Node(153, var52, var54, var58, 0, 153);
    com.google.javascript.rhino.Node var64 = var47.srcrefTree(var63);
    com.google.javascript.rhino.Node var65 = com.google.javascript.rhino.IR.continueNode();
    com.google.javascript.rhino.Node var66 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var67 = var65.useSourceInfoFromForTree(var66);
    boolean var68 = var67.isContinue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.IR.regexp(var64, var67);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test209"); }


    com.google.javascript.jscomp.ErrorManager var0 = null;
    com.google.javascript.jscomp.deps.JsFileParser var1 = new com.google.javascript.jscomp.deps.JsFileParser(var0);
    com.google.javascript.jscomp.deps.DependencyInfo var5 = var1.parseFile("", "LABEL_NAME hi!\n", "LABEL_NAME hi!\n");
    com.google.javascript.jscomp.deps.DependencyInfo var9 = var1.parseFile("", "module$", "module$JSDocInfo");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.deps.DependencyInfo var12 = var1.parseFile("goog.abstractMethod", "LABEL_NAME hi!\n");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test210"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("hi!");
    int var3 = var2.getChildCount();
    java.lang.String var4 = var2.getSourceFileName();
    com.google.javascript.jscomp.CodingConvention.Bind var6 = var0.describeFunctionBind(var2, true);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.labelName("hi!");
    int var9 = var8.getChildCount();
    java.lang.String var10 = var8.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var11 = null;
    var8.setStaticSourceFile(var11);
    boolean var13 = var8.isAnd();
    boolean var14 = var8.isTry();
    com.google.javascript.jscomp.CodingConvention.Bind var16 = var0.describeFunctionBind(var8, false);
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.labelName("hi!");
    int var24 = var23.getChildCount();
    com.google.javascript.rhino.jstype.JSType var25 = var23.getJSType();
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.labelName("hi!");
    int var28 = var27.getChildCount();
    java.lang.String var29 = var27.getSourceFileName();
    com.google.javascript.rhino.Node var32 = new com.google.javascript.rhino.Node(153, var21, var23, var27, 0, 153);
    java.lang.Iterable var33 = var27.siblings();
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.labelName("hi!");
    int var41 = var40.getChildCount();
    com.google.javascript.rhino.jstype.JSType var42 = var40.getJSType();
    com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.IR.labelName("hi!");
    int var45 = var44.getChildCount();
    java.lang.String var46 = var44.getSourceFileName();
    com.google.javascript.rhino.Node var49 = new com.google.javascript.rhino.Node(153, var38, var40, var44, 0, 153);
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.labelName("hi!");
    int var52 = var51.getChildCount();
    java.lang.String var53 = var51.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var54 = null;
    var51.setStaticSourceFile(var54);
    boolean var56 = var51.isAnd();
    boolean var57 = var51.isEmpty();
    boolean var58 = var44.hasChild(var51);
    boolean var59 = var44.isLocalResultCall();
    java.lang.String var60 = var0.extractClassNameIfRequire(var27, var44);
    com.google.javascript.rhino.Node var65 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var67 = com.google.javascript.rhino.IR.labelName("hi!");
    int var68 = var67.getChildCount();
    com.google.javascript.rhino.jstype.JSType var69 = var67.getJSType();
    com.google.javascript.rhino.Node var71 = com.google.javascript.rhino.IR.labelName("hi!");
    int var72 = var71.getChildCount();
    java.lang.String var73 = var71.getSourceFileName();
    com.google.javascript.rhino.Node var76 = new com.google.javascript.rhino.Node(153, var65, var67, var71, 0, 153);
    var65.setSourceFileForTesting("");
    com.google.javascript.rhino.Node var84 = com.google.javascript.rhino.Node.newString(0, "", 1, 153);
    com.google.javascript.rhino.Node[] var85 = new com.google.javascript.rhino.Node[] { var84};
    com.google.javascript.rhino.Node var86 = new com.google.javascript.rhino.Node(0, var85);
    boolean var87 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(var86);
    com.google.javascript.rhino.Node var92 = new com.google.javascript.rhino.Node(0, 10, 1);
    com.google.javascript.rhino.Node var93 = new com.google.javascript.rhino.Node(10, var92);
    boolean var94 = var92.isFromExterns();
    boolean var95 = var92.isRegExp();
    com.google.javascript.rhino.Node var96 = var86.useSourceInfoIfMissingFrom(var92);
    com.google.javascript.rhino.Node var97 = var65.useSourceInfoIfMissingFrom(var92);
    com.google.javascript.jscomp.CodingConvention.Bind var98 = var0.describeFunctionBind(var65);
    java.lang.String var99 = var0.getAbstractMethodName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var99 + "' != '" + "goog.abstractMethod"+ "'", var99.equals("goog.abstractMethod"));

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test211"); }


    java.lang.String var2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "module$"+ "'", var2.equals("module$"));

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test212"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    java.lang.String var3 = var1.getSourceFileName();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.labelName("hi!");
    int var6 = var5.getChildCount();
    java.lang.String var7 = var5.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var8 = null;
    var5.setStaticSourceFile(var8);
    com.google.javascript.rhino.JSTypeExpression var11 = new com.google.javascript.rhino.JSTypeExpression(var5, "hi!");
    boolean var12 = var5.isNull();
    com.google.javascript.rhino.Node var13 = var1.clonePropsFrom(var5);
    boolean var14 = var5.isInc();
    boolean var15 = var5.isDelProp();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.exprResult(var5);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test213"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    boolean var2 = var0.hasParameter("");
    java.util.List var3 = var0.getImplementedInterfaces();
    java.lang.String var4 = var0.getOriginalCommentString();
    com.google.javascript.rhino.JSTypeExpression var5 = var0.getBaseType();
    boolean var6 = var0.isNoSideEffects();
    boolean var7 = var0.containsDeclaration();
    boolean var8 = var0.isJavaDispatch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test214() {}
//   public void test214() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test214"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     com.google.javascript.jscomp.SourceMap var12 = var1.getSourceMap();
//     com.google.javascript.jscomp.Scope var13 = var1.getTopScope();
//     boolean var14 = var1.isTypeCheckingEnabled();
// 
//   }

  public void test215() {}
//   public void test215() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test215"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     com.google.javascript.jscomp.SourceMap var12 = var1.getSourceMap();
//     com.google.javascript.jscomp.Scope var13 = var1.getTopScope();
//     boolean var14 = var1.acceptConstKeyword();
// 
//   }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test216"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    java.lang.String var3 = var1.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var4 = null;
    var1.setStaticSourceFile(var4);
    boolean var6 = var1.isAnd();
    boolean var7 = var1.isTry();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.labelName("hi!");
    int var10 = var9.getChildCount();
    java.lang.String var11 = var9.getSourceFileName();
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.labelName("hi!");
    int var14 = var13.getChildCount();
    java.lang.String var15 = var13.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var16 = null;
    var13.setStaticSourceFile(var16);
    com.google.javascript.rhino.JSTypeExpression var19 = new com.google.javascript.rhino.JSTypeExpression(var13, "hi!");
    boolean var20 = var13.isNull();
    com.google.javascript.rhino.Node var21 = var9.clonePropsFrom(var13);
    com.google.javascript.rhino.Node[] var22 = new com.google.javascript.rhino.Node[] { var13};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.newNode(var1, var22);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test217"); }


    com.google.javascript.rhino.jstype.JSType var0 = null;
    com.google.javascript.rhino.jstype.TemplateType var1 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test218() {}
//   public void test218() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test218"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var3);
//     com.google.javascript.rhino.InputId var5 = null;
//     com.google.javascript.jscomp.CompilerInput var7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var4, var5, false);
//     var4.clearAst();
//     com.google.javascript.jscomp.CompilerInput var10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var4, true);
//     var4.removeRequire("goog.abstractMethod");
// 
//   }

  public void test219() {}
//   public void test219() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test219"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.SourceMap var2 = var1.getSourceMap();
//     com.google.javascript.rhino.jstype.JSTypeRegistry var3 = var1.getTypeRegistry();
// 
//   }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test220"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.SourceFile var1 = com.google.javascript.jscomp.SourceFile.fromFile("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test221"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.lang.Object var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var2 = var0.getDirectedSuccNodes(var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test222() {}
//   public void test222() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test222"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.falseNode();
//     com.google.javascript.jscomp.SourceFile var4 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
//     com.google.javascript.jscomp.CompilerInput var5 = new com.google.javascript.jscomp.CompilerInput(var4);
//     var0.setStaticSourceFile((com.google.javascript.rhino.jstype.StaticSourceFile)var4);
//     com.google.javascript.rhino.Node var7 = null;
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newNumber((-1.0d));
//     var0.addChildAfter(var7, var9);
// 
//   }

  public void test223() {}
//   public void test223() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test223"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var3);
//     com.google.javascript.rhino.InputId var5 = null;
//     com.google.javascript.jscomp.CompilerInput var7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var4, var5, false);
//     java.util.Collection var8 = var7.getProvides();
// 
//   }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test224"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
    java.lang.String[] var5 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var6 = com.google.javascript.jscomp.JSError.make(var3, var5);
    com.google.javascript.jscomp.CompilerOptions var7 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var8 = null;
    var7.setAnonymousFunctionNaming(var8);
    var7.setChainCalls(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var0.isConnectedInDirection((java.lang.Object)var6, (java.lang.Object)true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test225() {}
//   public void test225() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test225"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var2 = var1.getChildCount();
//     java.lang.String var3 = var1.getSourceFileName();
//     com.google.javascript.rhino.jstype.StaticSourceFile var4 = null;
//     var1.setStaticSourceFile(var4);
//     com.google.javascript.rhino.JSTypeExpression var7 = new com.google.javascript.rhino.JSTypeExpression(var1, "hi!");
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.Node.newString(0, "", 1, 153);
//     var1.removeChild(var12);
// 
//   }

  public void test226() {}
//   public void test226() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test226"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var3);
//     com.google.javascript.jscomp.JSModule var5 = null;
//     var4.setModule(var5);
//     java.io.PrintStream var7 = null;
//     com.google.javascript.jscomp.Compiler var8 = new com.google.javascript.jscomp.Compiler(var7);
//     com.google.javascript.rhino.JSDocInfo var9 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var11 = var9.hasParameter("");
//     java.util.List var12 = var9.getImplementedInterfaces();
//     java.lang.String var13 = var9.getOriginalCommentString();
//     java.lang.String var14 = var9.toString();
//     java.lang.String var15 = var9.getLicense();
//     java.util.List var16 = var9.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var17 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var8, var16, var17);
//     var4.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var8);
//     var8.parse();
// 
//   }

  public void test227() {}
//   public void test227() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test227"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     java.lang.String var12 = var1.getAstDotGraph();
//     com.google.javascript.jscomp.JSSourceFile var13 = null;
//     com.google.javascript.rhino.JSDocInfo var14 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var16 = var14.hasParameter("");
//     var14.setDeprecated(true);
//     int var19 = var14.getParameterCount();
//     boolean var20 = var14.isDefine();
//     java.util.List var21 = var14.getImplementedInterfaces();
//     com.google.javascript.jscomp.JSModule[] var22 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var21);
//     com.google.javascript.jscomp.CompilerOptions var23 = new com.google.javascript.jscomp.CompilerOptions();
//     var23.setCollapseProperties(false);
//     var23.enableExternExports(false);
//     java.util.Set var28 = null;
//     var23.setStripNamePrefixes(var28);
//     com.google.javascript.jscomp.CompilerOptions.TweakProcessing var30 = var23.getTweakProcessing();
//     com.google.javascript.jscomp.CheckLevel var31 = null;
//     var23.setBrokenClosureRequiresLevel(var31);
//     var23.setRuntimeTypeCheckLogFunction("LABEL_NAME hi!");
//     java.util.Map var35 = var23.getDefineReplacements();
//     com.google.javascript.jscomp.Result var36 = var1.compile(var13, var22, var23);
// 
//   }

  public void test228() {}
//   public void test228() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test228"); }
// 
// 
//     com.google.javascript.jscomp.CodingConvention var0 = null;
//     com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention(var0);
//     boolean var4 = var1.isExported(". hi! at (unknown source) line (unknown line) : (unknown column)", false);
// 
//   }

  public void test229() {}
//   public void test229() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test229"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = new com.google.javascript.rhino.Node(0);
//     com.google.javascript.rhino.Node var2 = null;
//     boolean var3 = var1.isEquivalentTo(var2);
// 
//   }

  public void test230() {}
//   public void test230() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test230"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     com.google.javascript.jscomp.type.ReverseAbstractInterpreter var12 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var13 = null;
//     com.google.javascript.jscomp.CheckLevel var14 = null;
//     com.google.javascript.jscomp.CheckLevel var15 = null;
//     com.google.javascript.jscomp.TypeCheck var16 = new com.google.javascript.jscomp.TypeCheck((com.google.javascript.jscomp.AbstractCompiler)var1, var12, var13, var14, var15);
// 
//   }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test231"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var1 = null;
    var0.setAnonymousFunctionNaming(var1);
    var0.setPreferLineBreakAtEndOfFile(false);
    java.util.logging.Logger var5 = null;
    com.google.javascript.jscomp.LoggerErrorManager var6 = new com.google.javascript.jscomp.LoggerErrorManager(var5);
    var0.setErrorHandler((com.google.javascript.jscomp.ErrorHandler)var6);
    var0.setOptimizeParameters(true);

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test232"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("hi!");
    int var3 = var2.getChildCount();
    java.lang.String var4 = var2.getSourceFileName();
    com.google.javascript.jscomp.CodingConvention.Bind var6 = var0.describeFunctionBind(var2, true);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast var11 = var0.getObjectLiteralCast(var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test233"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var2 = var1.cloneTree();
    var0.setAssociatedNode(var2);
    java.util.List var4 = var0.getThrownTypes();
    boolean var5 = var0.isNoSideEffects();
    boolean var6 = var0.hasType();
    int var7 = var0.getParameterCount();
    boolean var8 = var0.isHidden();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test234"); }


    com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
    com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var3);
    com.google.javascript.rhino.InputId var5 = null;
    com.google.javascript.jscomp.CompilerInput var7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var4, var5, false);
    var4.clearAst();
    com.google.javascript.jscomp.CompilerInput var10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var4, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var12 = var4.getLineOffset((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test235"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("hi!");
    int var3 = var2.getChildCount();
    java.lang.String var4 = var2.getSourceFileName();
    com.google.javascript.jscomp.CodingConvention.Bind var6 = var0.describeFunctionBind(var2, true);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.labelName("hi!");
    int var9 = var8.getChildCount();
    java.lang.String var10 = var8.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var11 = null;
    var8.setStaticSourceFile(var11);
    boolean var13 = var8.isAnd();
    boolean var14 = var8.isTry();
    com.google.javascript.jscomp.CodingConvention.Bind var16 = var0.describeFunctionBind(var8, false);
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.labelName("hi!");
    int var24 = var23.getChildCount();
    com.google.javascript.rhino.jstype.JSType var25 = var23.getJSType();
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.labelName("hi!");
    int var28 = var27.getChildCount();
    java.lang.String var29 = var27.getSourceFileName();
    com.google.javascript.rhino.Node var32 = new com.google.javascript.rhino.Node(153, var21, var23, var27, 0, 153);
    java.lang.Iterable var33 = var27.siblings();
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.labelName("hi!");
    int var41 = var40.getChildCount();
    com.google.javascript.rhino.jstype.JSType var42 = var40.getJSType();
    com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.IR.labelName("hi!");
    int var45 = var44.getChildCount();
    java.lang.String var46 = var44.getSourceFileName();
    com.google.javascript.rhino.Node var49 = new com.google.javascript.rhino.Node(153, var38, var40, var44, 0, 153);
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.labelName("hi!");
    int var52 = var51.getChildCount();
    java.lang.String var53 = var51.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var54 = null;
    var51.setStaticSourceFile(var54);
    boolean var56 = var51.isAnd();
    boolean var57 = var51.isEmpty();
    boolean var58 = var44.hasChild(var51);
    boolean var59 = var44.isLocalResultCall();
    java.lang.String var60 = var0.extractClassNameIfRequire(var27, var44);
    com.google.javascript.rhino.Node var65 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var67 = com.google.javascript.rhino.IR.labelName("hi!");
    int var68 = var67.getChildCount();
    com.google.javascript.rhino.jstype.JSType var69 = var67.getJSType();
    com.google.javascript.rhino.Node var71 = com.google.javascript.rhino.IR.labelName("hi!");
    int var72 = var71.getChildCount();
    java.lang.String var73 = var71.getSourceFileName();
    com.google.javascript.rhino.Node var76 = new com.google.javascript.rhino.Node(153, var65, var67, var71, 0, 153);
    var65.setSourceFileForTesting("");
    com.google.javascript.rhino.Node var84 = com.google.javascript.rhino.Node.newString(0, "", 1, 153);
    com.google.javascript.rhino.Node[] var85 = new com.google.javascript.rhino.Node[] { var84};
    com.google.javascript.rhino.Node var86 = new com.google.javascript.rhino.Node(0, var85);
    boolean var87 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(var86);
    com.google.javascript.rhino.Node var92 = new com.google.javascript.rhino.Node(0, 10, 1);
    com.google.javascript.rhino.Node var93 = new com.google.javascript.rhino.Node(10, var92);
    boolean var94 = var92.isFromExterns();
    boolean var95 = var92.isRegExp();
    com.google.javascript.rhino.Node var96 = var86.useSourceInfoIfMissingFrom(var92);
    com.google.javascript.rhino.Node var97 = var65.useSourceInfoIfMissingFrom(var92);
    com.google.javascript.jscomp.CodingConvention.Bind var98 = var0.describeFunctionBind(var65);
    java.util.Collection var99 = var0.getAssertionFunctions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var99);

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test236"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    java.util.Set var1 = null;
    var0.setStripTypePrefixes(var1);
    java.lang.Object var3 = var0.clone();
    var0.enableRuntimeTypeCheck("module$JSDocInfo");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test237() {}
//   public void test237() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test237"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticGroup var0 = null;
//     com.google.javascript.jscomp.CheckLevel var1 = null;
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var2 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var0, var1);
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
//     var7.putBooleanProp(0, false);
//     com.google.javascript.jscomp.CheckLevel var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
//     java.lang.String[] var16 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var17 = com.google.javascript.jscomp.JSError.make(var14, var16);
//     com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
//     java.lang.String[] var22 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var23 = com.google.javascript.jscomp.JSError.make(var20, var22);
//     com.google.javascript.jscomp.JSError var24 = com.google.javascript.jscomp.JSError.make("LABEL_NAME hi!\n", var7, var11, var14, var22);
//     com.google.javascript.jscomp.CheckLevel var25 = var2.level(var24);
// 
//   }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test238"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("LABEL_NAME hi!");
    var1.setDepth(153);
    com.google.javascript.jscomp.SourceFile var7 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
    com.google.javascript.jscomp.CompilerInput var8 = new com.google.javascript.jscomp.CompilerInput(var7);
    com.google.javascript.rhino.InputId var9 = null;
    com.google.javascript.jscomp.CompilerInput var11 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var8, var9, false);
    var8.clearAst();
    com.google.javascript.jscomp.SourceFile var13 = var8.getSourceFile();
    com.google.javascript.jscomp.JSModule var15 = new com.google.javascript.jscomp.JSModule("LABEL_NAME hi!");
    var15.setDepth(153);
    var8.setModule(var15);
    var1.remove(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var20 = var1.getPathRelativeToClosureBase();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test239() {}
//   public void test239() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test239"); }
// 
// 
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.Node.newString(1, "JSDocInfo");
//     com.google.javascript.rhino.Node var3 = null;
//     var2.removeChild(var3);
// 
//   }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test240"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    java.lang.String var3 = var1.getSourceFileName();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.labelName("hi!");
    int var6 = var5.getChildCount();
    java.lang.String var7 = var5.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var8 = null;
    var5.setStaticSourceFile(var8);
    com.google.javascript.rhino.JSTypeExpression var11 = new com.google.javascript.rhino.JSTypeExpression(var5, "hi!");
    boolean var12 = var5.isNull();
    com.google.javascript.rhino.Node var13 = var1.clonePropsFrom(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.not(var5);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test241() {}
//   public void test241() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test241"); }
// 
// 
//     com.google.javascript.rhino.Node[] var0 = null;
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.paramList(var0);
// 
//   }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test242"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    java.lang.String var3 = var1.getSourceFileName();
    boolean var4 = var1.isCatch();
    boolean var5 = var1.isDebugger();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.labelName("hi!");
    int var8 = var7.getChildCount();
    boolean var9 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(var7);
    java.lang.String var10 = var7.getString();
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    var14.removeProp((-1));
    var14.setWasEmptyNode(true);
    com.google.javascript.rhino.Node var19 = var7.srcref(var14);
    var1.addChildrenToFront(var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var14.setSideEffectFlags((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test243"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    com.google.javascript.rhino.jstype.JSType var3 = var1.getJSType();
    int var4 = var1.getType();
    com.google.javascript.rhino.Node var5 = var1.cloneTree();
    boolean var6 = var1.isNull();
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.labelName("hi!");
    int var9 = var8.getChildCount();
    java.lang.String var10 = var8.getSourceFileName();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.labelName("hi!");
    int var13 = var12.getChildCount();
    java.lang.String var14 = var12.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var15 = null;
    var12.setStaticSourceFile(var15);
    com.google.javascript.rhino.JSTypeExpression var18 = new com.google.javascript.rhino.JSTypeExpression(var12, "hi!");
    boolean var19 = var12.isNull();
    com.google.javascript.rhino.Node var20 = var8.clonePropsFrom(var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.comma(var1, var20);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test244"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    boolean var1 = var0.isDirected();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.continueNode();
    boolean var3 = var2.isOptionalArg();
    var2.detachChildren();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.labelName("hi!");
    int var7 = var6.getChildCount();
    com.google.javascript.rhino.jstype.JSType var8 = var6.getJSType();
    int var9 = var6.getType();
    com.google.javascript.rhino.Node var10 = var6.cloneTree();
    boolean var11 = var6.isNull();
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.labelName("hi!");
    int var14 = var13.getChildCount();
    java.lang.String var15 = var13.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var16 = null;
    var13.setStaticSourceFile(var16);
    boolean var18 = var13.isDo();
    var13.setLength(1);
    com.google.javascript.rhino.Node var21 = var6.copyInformationFrom(var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var22 = var0.getEdges((java.lang.Object)var2, (java.lang.Object)var21);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test245"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    com.google.javascript.rhino.jstype.JSType var3 = var1.getJSType();
    int var4 = var1.getType();
    com.google.javascript.rhino.Node var5 = var1.cloneTree();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.labelName("hi!");
    int var8 = var7.getChildCount();
    java.lang.String var9 = var7.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var10 = null;
    var7.setStaticSourceFile(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.tryCatch(var1, var7);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test246"); }


    com.google.javascript.jscomp.CodingConvention var0 = null;
    com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention(var0);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    var5.removeProp((-1));
    boolean var8 = var1.isOptionalParameter(var5);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var10 = var9.cloneTree();
    boolean var11 = var10.isRegExp();
    java.lang.Iterable var12 = var10.siblings();
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.labelName("hi!");
    int var15 = var14.getChildCount();
    boolean var16 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(var14);
    boolean var17 = var14.hasOneChild();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.tryCatchFinally(var5, var10, var14);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test247"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = com.google.javascript.rhino.ScriptRuntime.escapeString("goog.abstractMethod", '4');
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test248"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CustomPassExecutionTime var1 = com.google.javascript.jscomp.CustomPassExecutionTime.valueOf("(LABEL_NAME hi!)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test249"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("hi!");
    int var3 = var2.getChildCount();
    java.lang.String var4 = var2.getSourceFileName();
    com.google.javascript.jscomp.CodingConvention.Bind var6 = var0.describeFunctionBind(var2, true);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.labelName("hi!");
    int var9 = var8.getChildCount();
    java.lang.String var10 = var8.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var11 = null;
    var8.setStaticSourceFile(var11);
    boolean var13 = var8.isAnd();
    boolean var14 = var8.isTry();
    com.google.javascript.jscomp.CodingConvention.Bind var16 = var0.describeFunctionBind(var8, false);
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.labelName("hi!");
    int var24 = var23.getChildCount();
    com.google.javascript.rhino.jstype.JSType var25 = var23.getJSType();
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.labelName("hi!");
    int var28 = var27.getChildCount();
    java.lang.String var29 = var27.getSourceFileName();
    com.google.javascript.rhino.Node var32 = new com.google.javascript.rhino.Node(153, var21, var23, var27, 0, 153);
    java.lang.Iterable var33 = var27.siblings();
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.labelName("hi!");
    int var41 = var40.getChildCount();
    com.google.javascript.rhino.jstype.JSType var42 = var40.getJSType();
    com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.IR.labelName("hi!");
    int var45 = var44.getChildCount();
    java.lang.String var46 = var44.getSourceFileName();
    com.google.javascript.rhino.Node var49 = new com.google.javascript.rhino.Node(153, var38, var40, var44, 0, 153);
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.labelName("hi!");
    int var52 = var51.getChildCount();
    java.lang.String var53 = var51.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var54 = null;
    var51.setStaticSourceFile(var54);
    boolean var56 = var51.isAnd();
    boolean var57 = var51.isEmpty();
    boolean var58 = var44.hasChild(var51);
    boolean var59 = var44.isLocalResultCall();
    java.lang.String var60 = var0.extractClassNameIfRequire(var27, var44);
    com.google.javascript.rhino.Node var65 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var67 = com.google.javascript.rhino.IR.labelName("hi!");
    int var68 = var67.getChildCount();
    com.google.javascript.rhino.jstype.JSType var69 = var67.getJSType();
    com.google.javascript.rhino.Node var71 = com.google.javascript.rhino.IR.labelName("hi!");
    int var72 = var71.getChildCount();
    java.lang.String var73 = var71.getSourceFileName();
    com.google.javascript.rhino.Node var76 = new com.google.javascript.rhino.Node(153, var65, var67, var71, 0, 153);
    var65.setSourceFileForTesting("");
    com.google.javascript.rhino.Node var84 = com.google.javascript.rhino.Node.newString(0, "", 1, 153);
    com.google.javascript.rhino.Node[] var85 = new com.google.javascript.rhino.Node[] { var84};
    com.google.javascript.rhino.Node var86 = new com.google.javascript.rhino.Node(0, var85);
    boolean var87 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(var86);
    com.google.javascript.rhino.Node var92 = new com.google.javascript.rhino.Node(0, 10, 1);
    com.google.javascript.rhino.Node var93 = new com.google.javascript.rhino.Node(10, var92);
    boolean var94 = var92.isFromExterns();
    boolean var95 = var92.isRegExp();
    com.google.javascript.rhino.Node var96 = var86.useSourceInfoIfMissingFrom(var92);
    com.google.javascript.rhino.Node var97 = var65.useSourceInfoIfMissingFrom(var92);
    com.google.javascript.jscomp.CodingConvention.Bind var98 = var0.describeFunctionBind(var65);
    boolean var99 = var65.isDo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var99 == false);

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test250"); }


    java.lang.String var1 = com.google.javascript.rhino.ScriptRuntime.escapeString(". hi! at (unknown source) line (unknown line) : (unknown column)");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ". hi! at (unknown source) line (unknown line) : (unknown column)"+ "'", var1.equals(". hi! at (unknown source) line (unknown line) : (unknown column)"));

  }

  public void test251() {}
//   public void test251() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test251"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     com.google.javascript.jscomp.SourceFile var15 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
//     java.lang.String var17 = var15.getLine(1);
//     boolean var18 = var15.isExtern();
//     java.lang.String var19 = var15.getOriginalPath();
//     com.google.javascript.jscomp.JSSourceFile var20 = null;
//     com.google.javascript.jscomp.JSSourceFile[] var21 = new com.google.javascript.jscomp.JSSourceFile[] { var20};
//     com.google.javascript.jscomp.CompilerOptions var22 = new com.google.javascript.jscomp.CompilerOptions();
//     var22.setCollapseProperties(false);
//     var22.enableExternExports(false);
//     java.util.Set var27 = null;
//     var22.setStripNamePrefixes(var27);
//     var22.setTightenTypes(true);
//     com.google.javascript.jscomp.Result var31 = var1.compile(var15, var21, var22);
// 
//   }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test252"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setCollapseProperties(false);
    var0.enableExternExports(false);
    var0.setLineBreak(true);
    com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler var7 = null;
    var0.setAliasTransformationHandler(var7);
    var0.setCommonJSModulePathPrefix("");
    var0.setAliasStringsBlacklist("module$");

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test253"); }


    com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
    com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var3);
    com.google.javascript.rhino.InputId var5 = null;
    com.google.javascript.jscomp.CompilerInput var7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var4, var5, false);
    var4.clearAst();
    com.google.javascript.rhino.InputId var9 = var4.getInputId();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var10 = var4.getPathRelativeToClosureBase();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test254() {}
//   public void test254() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test254"); }
// 
// 
//     java.io.InputStream var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromInputStream("JSDocInfo", var1);
// 
//   }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test255"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var2 = var1.cloneTree();
    boolean var3 = var1.hasChildren();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.labelName("hi!");
    int var6 = var5.getChildCount();
    java.lang.String var7 = var5.getSourceFileName();
    boolean var8 = var5.isCatch();
    int var9 = var5.getSourceOffset();
    com.google.javascript.rhino.Node var10 = var5.getLastSibling();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.labelName("hi!");
    com.google.javascript.rhino.Node.AncestorIterable var13 = var12.getAncestors();
    com.google.javascript.rhino.Node var14 = new com.google.javascript.rhino.Node(1, var1, var5, var12);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var17 = var16.cloneTree();
    com.google.javascript.rhino.Node[] var18 = new com.google.javascript.rhino.Node[] { var16};
    com.google.javascript.rhino.Node var19 = new com.google.javascript.rhino.Node(100, var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.newNode(var14, var18);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test256"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var1 = com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.valueOf(": hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test257"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    java.lang.String var3 = var1.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var4 = var1.getStaticSourceFile();
    boolean var5 = var1.isQualifiedName();
    int var6 = var1.getCharno();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.block(var1);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test258() {}
//   public void test258() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test258"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticGroup var0 = null;
//     com.google.javascript.jscomp.CheckLevel var1 = null;
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var2 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var0, var1);
//     com.google.javascript.jscomp.DiagnosticGroup var3 = null;
//     boolean var4 = var2.disables(var3);
// 
//   }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test259"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.trueNode();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("hi!");
    int var3 = var2.getChildCount();
    java.lang.String var4 = var2.getSourceFileName();
    java.lang.String var5 = var2.toString();
    boolean var6 = var0.isEquivalentToTyped(var2);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.labelName("hi!");
    int var14 = var13.getChildCount();
    com.google.javascript.rhino.jstype.JSType var15 = var13.getJSType();
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.labelName("hi!");
    int var18 = var17.getChildCount();
    java.lang.String var19 = var17.getSourceFileName();
    com.google.javascript.rhino.Node var22 = new com.google.javascript.rhino.Node(153, var11, var13, var17, 0, 153);
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.labelName("hi!");
    int var25 = var24.getChildCount();
    java.lang.String var26 = var24.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var27 = null;
    var24.setStaticSourceFile(var27);
    boolean var29 = var24.isAnd();
    boolean var30 = var24.isEmpty();
    boolean var31 = var17.hasChild(var24);
    var24.putIntProp(153, 100);
    boolean var35 = var24.isLabelName();
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.nullNode();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.addChildBefore(var24, var36);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "LABEL_NAME hi!"+ "'", var5.equals("LABEL_NAME hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test260"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    java.lang.String var3 = var1.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var4 = null;
    var1.setStaticSourceFile(var4);
    com.google.javascript.rhino.JSTypeExpression var7 = new com.google.javascript.rhino.JSTypeExpression(var1, "hi!");
    com.google.javascript.rhino.Node var8 = var7.getRoot();
    com.google.javascript.rhino.JSDocInfoBuilder var10 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.jscomp.SourceFile var15 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
    java.lang.String var17 = var15.getLine(1);
    var10.markName("module$", (com.google.javascript.rhino.jstype.StaticSourceFile)var15, 0, 1);
    boolean var21 = var10.recordNoCompile();
    com.google.javascript.jscomp.SourceFile var26 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
    com.google.javascript.jscomp.CompilerInput var27 = new com.google.javascript.jscomp.CompilerInput(var26);
    com.google.javascript.rhino.InputId var28 = null;
    com.google.javascript.jscomp.CompilerInput var30 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var27, var28, false);
    var27.clearAst();
    com.google.javascript.jscomp.SourceFile var35 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
    com.google.javascript.jscomp.CompilerInput var36 = new com.google.javascript.jscomp.CompilerInput(var35);
    var27.setSourceFile(var35);
    var10.markName("InputId: hi!", (com.google.javascript.rhino.jstype.StaticSourceFile)var35, 1, 1);
    var8.setStaticSourceFile((com.google.javascript.rhino.jstype.StaticSourceFile)var35);
    com.google.javascript.jscomp.parsing.Config.LanguageMode var44 = null;
    com.google.javascript.jscomp.parsing.Config var46 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(false, var44, false);
    com.google.javascript.rhino.head.ErrorReporter var47 = null;
    java.util.logging.Logger var48 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var49 = com.google.javascript.jscomp.parsing.ParserRunner.parse((com.google.javascript.rhino.jstype.StaticSourceFile)var35, "null(null)", var46, var47, var48);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test261"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setCollapseProperties(false);
    var0.setCollapseVariableDeclarations(false);
    var0.setClosurePass(true);
    com.google.javascript.jscomp.CompilerOptions var7 = new com.google.javascript.jscomp.CompilerOptions();
    var7.setCollapseProperties(false);
    var7.enableExternExports(false);
    var7.setLineBreak(true);
    com.google.javascript.jscomp.CheckLevel var14 = null;
    var7.setCheckProvides(var14);
    byte[] var16 = new byte[] { };
    var7.setInputVariableMapSerialized(var16);
    var0.setInputPropertyMapSerialized(var16);
    var0.setRecordFunctionInformation(true);
    var0.setReplaceIdGenerators(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test262() {}
//   public void test262() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test262"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     var0.setCollapseProperties(false);
//     var0.setCollapseVariableDeclarations(false);
//     var0.setClosurePass(true);
//     var0.setGatherCssNames(false);
//     com.google.javascript.jscomp.CompilerOptions.Reach var9 = null;
//     var0.setInlineVariables(var9);
// 
//   }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test263"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    boolean var1 = var0.isDirected();
    java.lang.String var2 = var0.getName();
    com.google.javascript.rhino.JSDocInfoBuilder var4 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
    var4.markText("hi!", (-1), 10, 1, 0);
    boolean var11 = var4.recordDeprecated();
    com.google.javascript.jscomp.SourceFile var15 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
    com.google.javascript.jscomp.CompilerInput var16 = new com.google.javascript.jscomp.CompilerInput(var15);
    com.google.javascript.rhino.InputId var17 = null;
    com.google.javascript.jscomp.CompilerInput var19 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var16, var17, false);
    var16.clearAst();
    com.google.javascript.jscomp.SourceFile var24 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
    com.google.javascript.jscomp.CompilerInput var25 = new com.google.javascript.jscomp.CompilerInput(var24);
    var16.setSourceFile(var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var27 = var0.isConnected((java.lang.Object)var11, (java.lang.Object)var24);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "LinkedGraph"+ "'", var2.equals("LinkedGraph"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test264"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.labelName("hi!");
    int var4 = var3.getChildCount();
    boolean var5 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(var3);
    java.lang.String var6 = var3.getString();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    var10.removeProp((-1));
    var10.setWasEmptyNode(true);
    com.google.javascript.rhino.Node var15 = var3.srcref(var10);
    com.google.javascript.rhino.jstype.StaticSourceFile var16 = var15.getStaticSourceFile();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var17 = var1.removeChildAfter(var15);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test265"); }


    boolean var1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("JSDocInfo: Unversioned directory");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test266"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CustomPassExecutionTime var1 = com.google.javascript.jscomp.CustomPassExecutionTime.valueOf("LABEL_NAME hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test267() {}
//   public void test267() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test267"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var2 = var1.getChildCount();
//     com.google.javascript.rhino.jstype.JSType var3 = var1.getJSType();
//     int var4 = var1.getType();
//     com.google.javascript.rhino.Node var5 = var1.cloneTree();
//     com.google.javascript.rhino.Node var6 = null;
//     com.google.javascript.rhino.Node var7 = var1.srcref(var6);
// 
//   }

  public void test268() {}
//   public void test268() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test268"); }
// 
// 
//     com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var7 = var6.getChildCount();
//     com.google.javascript.rhino.jstype.JSType var8 = var6.getJSType();
//     com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var11 = var10.getChildCount();
//     java.lang.String var12 = var10.getSourceFileName();
//     com.google.javascript.rhino.Node var15 = new com.google.javascript.rhino.Node(153, var4, var6, var10, 0, 153);
//     com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var18 = var17.getChildCount();
//     java.lang.String var19 = var17.getSourceFileName();
//     com.google.javascript.rhino.jstype.StaticSourceFile var20 = null;
//     var17.setStaticSourceFile(var20);
//     boolean var22 = var17.isAnd();
//     boolean var23 = var17.isEmpty();
//     boolean var24 = var10.hasChild(var17);
//     com.google.javascript.rhino.Node var25 = null;
//     com.google.javascript.rhino.Node var26 = var10.useSourceInfoFrom(var25);
// 
//   }

  public void test269() {}
//   public void test269() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test269"); }
// 
// 
//     java.util.logging.Logger var0 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
//     com.google.javascript.jscomp.JSError[] var2 = var1.getErrors();
//     int var3 = var1.getWarningCount();
//     com.google.javascript.jscomp.CheckLevel var4 = null;
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
//     var9.putBooleanProp(0, false);
//     com.google.javascript.jscomp.CheckLevel var13 = null;
//     com.google.javascript.jscomp.DiagnosticType var16 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
//     java.lang.String[] var18 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var19 = com.google.javascript.jscomp.JSError.make(var16, var18);
//     com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
//     java.lang.String[] var24 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var25 = com.google.javascript.jscomp.JSError.make(var22, var24);
//     com.google.javascript.jscomp.JSError var26 = com.google.javascript.jscomp.JSError.make("LABEL_NAME hi!\n", var9, var13, var16, var24);
//     var1.report(var4, var26);
//     var1.generateReport();
// 
//   }

  public void test270() {}
//   public void test270() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test270"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     var0.setCollapseProperties(false);
//     com.google.javascript.jscomp.StrictWarningsGuard var3 = new com.google.javascript.jscomp.StrictWarningsGuard();
//     var0.addWarningsGuard((com.google.javascript.jscomp.WarningsGuard)var3);
//     var0.setInferTypes(true);
//     var0.setRemoveUnusedPrototypeProperties(false);
//     var0.setCheckMissingGetCssNameBlacklist(": hi!");
//     var0.setSourceMapOutputPath("");
//     com.google.javascript.jscomp.CompilerOptions.Reach var13 = null;
//     var0.setRemoveUnusedVariable(var13);
// 
//   }

  public void test271() {}
//   public void test271() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test271"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     java.lang.String var12 = var1.getAstDotGraph();
//     var1.normalize();
// 
//   }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test272"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.trueNode();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.labelName("hi!");
    int var4 = var3.getChildCount();
    java.lang.String var5 = var3.getSourceFileName();
    java.lang.String var6 = var3.toString();
    boolean var7 = var1.isEquivalentToTyped(var3);
    boolean var8 = var1.isFor();
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.labelName("hi!");
    int var16 = var15.getChildCount();
    com.google.javascript.rhino.jstype.JSType var17 = var15.getJSType();
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.labelName("hi!");
    int var20 = var19.getChildCount();
    java.lang.String var21 = var19.getSourceFileName();
    com.google.javascript.rhino.Node var24 = new com.google.javascript.rhino.Node(153, var13, var15, var19, 0, 153);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.labelName("hi!");
    int var27 = var26.getChildCount();
    java.lang.String var28 = var26.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var29 = null;
    var26.setStaticSourceFile(var29);
    boolean var31 = var26.isAnd();
    boolean var32 = var26.isEmpty();
    boolean var33 = var19.hasChild(var26);
    boolean var34 = var26.isHook();
    var26.setLength((-1));
    com.google.javascript.rhino.Node var39 = new com.google.javascript.rhino.Node(0, var1, var26, 1, 100);
    boolean var40 = var26.isNoSideEffectsCall();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "LABEL_NAME hi!"+ "'", var6.equals("LABEL_NAME hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test273"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    java.lang.String var3 = var1.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var4 = null;
    var1.setStaticSourceFile(var4);
    boolean var6 = var1.isAnd();
    boolean var7 = var1.isTry();
    boolean var8 = var1.isDec();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.labelName("hi!");
    int var11 = var10.getChildCount();
    java.lang.String var12 = var10.getSourceFileName();
    boolean var13 = var10.isCatch();
    boolean var14 = var10.isDebugger();
    com.google.javascript.rhino.Node var15 = var1.useSourceInfoFromForTree(var10);
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.labelName("hi!");
    int var19 = var18.getChildCount();
    java.lang.String var20 = var18.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var21 = var18.getStaticSourceFile();
    boolean var22 = var18.isQualifiedName();
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    var26.putBooleanProp(0, false);
    com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.labelName("hi!");
    int var37 = var36.getChildCount();
    com.google.javascript.rhino.jstype.JSType var38 = var36.getJSType();
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.labelName("hi!");
    int var41 = var40.getChildCount();
    java.lang.String var42 = var40.getSourceFileName();
    com.google.javascript.rhino.Node var45 = new com.google.javascript.rhino.Node(153, var34, var36, var40, 0, 153);
    com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.labelName("hi!");
    int var48 = var47.getChildCount();
    java.lang.String var49 = var47.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var50 = null;
    var47.setStaticSourceFile(var50);
    boolean var52 = var47.isAnd();
    boolean var53 = var47.isEmpty();
    boolean var54 = var40.hasChild(var47);
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.labelName("hi!");
    int var57 = var56.getChildCount();
    com.google.javascript.rhino.jstype.JSType var58 = var56.getJSType();
    int var59 = var56.getType();
    com.google.javascript.rhino.Node var60 = var56.cloneTree();
    com.google.javascript.rhino.Node var63 = new com.google.javascript.rhino.Node((-1), var18, var26, var47, var56, 100, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var64 = com.google.javascript.rhino.IR.label(var1, var63);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test274"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.util.List var1 = var0.getEdges();
    var0.pushNodeAnnotations();
    java.lang.Object var3 = null;
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    var8.putBooleanProp(0, false);
    com.google.javascript.jscomp.CheckLevel var12 = null;
    com.google.javascript.jscomp.DiagnosticType var15 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
    java.lang.String[] var17 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var18 = com.google.javascript.jscomp.JSError.make(var15, var17);
    com.google.javascript.jscomp.DiagnosticType var21 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
    java.lang.String[] var23 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var24 = com.google.javascript.jscomp.JSError.make(var21, var23);
    com.google.javascript.jscomp.JSError var25 = com.google.javascript.jscomp.JSError.make("LABEL_NAME hi!\n", var8, var12, var15, var23);
    com.google.javascript.rhino.Node var26 = var8.removeChildren();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var27 = var0.isConnected(var3, (java.lang.Object)var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);

  }

  public void test275() {}
//   public void test275() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test275"); }
// 
// 
//     com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("LABEL_NAME hi!");
//     var1.setDepth(153);
//     com.google.javascript.jscomp.SourceFile var7 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
//     com.google.javascript.jscomp.CompilerInput var8 = new com.google.javascript.jscomp.CompilerInput(var7);
//     com.google.javascript.rhino.InputId var9 = null;
//     com.google.javascript.jscomp.CompilerInput var11 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var8, var9, false);
//     var1.addFirst(var8);
//     java.io.PrintStream var13 = null;
//     com.google.javascript.jscomp.Compiler var14 = new com.google.javascript.jscomp.Compiler(var13);
//     com.google.javascript.jscomp.SourceMap var15 = var14.getSourceMap();
//     var8.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var14);
//     java.lang.String var17 = var14.toSource();
// 
//   }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test276"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.continueNode();
    boolean var1 = var0.isTry();
    int var2 = var0.getChildCount();
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.labelName("hi!");
    int var5 = var4.getChildCount();
    java.lang.String var6 = var4.getSourceFileName();
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.labelName("hi!");
    int var9 = var8.getChildCount();
    java.lang.String var10 = var8.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var11 = null;
    var8.setStaticSourceFile(var11);
    com.google.javascript.rhino.JSTypeExpression var14 = new com.google.javascript.rhino.JSTypeExpression(var8, "hi!");
    boolean var15 = var8.isNull();
    com.google.javascript.rhino.Node var16 = var4.clonePropsFrom(var8);
    boolean var17 = var4.isThis();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.assign(var0, var4);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test277"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.labelName("hi!");
    int var4 = var3.getChildCount();
    java.lang.String var5 = var3.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var6 = null;
    var3.setStaticSourceFile(var6);
    com.google.javascript.rhino.JSTypeExpression var9 = new com.google.javascript.rhino.JSTypeExpression(var3, "hi!");
    boolean var10 = var1.recordThrowType(var9);
    boolean var11 = var1.recordIdGenerator();
    boolean var12 = var1.recordExport();
    com.google.javascript.rhino.JSTypeExpression var13 = null;
    boolean var14 = var1.recordDefineType(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test278"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    com.google.javascript.rhino.Node.AncestorIterable var2 = var1.getAncestors();
    java.lang.String var3 = var1.getString();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString(0, "", 1, 153);
    com.google.javascript.rhino.Node[] var10 = new com.google.javascript.rhino.Node[] { var9};
    com.google.javascript.rhino.Node var11 = new com.google.javascript.rhino.Node(0, var10);
    boolean var12 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(var11);
    com.google.javascript.rhino.Node var17 = new com.google.javascript.rhino.Node(0, 10, 1);
    com.google.javascript.rhino.Node var18 = new com.google.javascript.rhino.Node(10, var17);
    boolean var19 = var17.isFromExterns();
    boolean var20 = var17.isRegExp();
    com.google.javascript.rhino.Node var21 = var11.useSourceInfoIfMissingFrom(var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.and(var1, var17);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test279() {}
//   public void test279() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test279"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.SourceMap var2 = var1.getSourceMap();
//     var1.rebuildInputsFromModules();
// 
//   }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test280"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("hi!");
    int var3 = var2.getChildCount();
    java.lang.String var4 = var2.getSourceFileName();
    com.google.javascript.jscomp.CodingConvention.Bind var6 = var0.describeFunctionBind(var2, true);
    java.lang.String var7 = var0.getAbstractMethodName();
    java.lang.String var8 = var0.getExportPropertyFunction();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.paramList();
    com.google.javascript.jscomp.CodingConvention.Bind var11 = var0.describeFunctionBind(var9, true);
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.continueNode();
    boolean var13 = var12.isOptionalArg();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var14 = var0.isPropertyTestFunction(var12);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "goog.abstractMethod"+ "'", var7.equals("goog.abstractMethod"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "goog.exportProperty"+ "'", var8.equals("goog.exportProperty"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test281"); }


    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.Node.newString(0, "", 1, 153);
    com.google.javascript.rhino.Node[] var6 = new com.google.javascript.rhino.Node[] { var5};
    com.google.javascript.rhino.Node var7 = new com.google.javascript.rhino.Node(0, var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.block(var6);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test282"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = com.google.javascript.rhino.ScriptRuntime.escapeString("(LABEL_NAME hi!)", '#');
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test283"); }


    com.google.javascript.rhino.Node var4 = new com.google.javascript.rhino.Node(0, 10, 1);
    com.google.javascript.rhino.Node var5 = new com.google.javascript.rhino.Node(10, var4);
    com.google.javascript.rhino.jstype.JSTypeRegistry var6 = null;
    com.google.javascript.rhino.jstype.FunctionBuilder var7 = new com.google.javascript.rhino.jstype.FunctionBuilder(var6);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.labelName("hi!");
    int var10 = var9.getChildCount();
    java.lang.String var11 = var9.getSourceFileName();
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.labelName("hi!");
    int var14 = var13.getChildCount();
    java.lang.String var15 = var13.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var16 = null;
    var13.setStaticSourceFile(var16);
    com.google.javascript.rhino.JSTypeExpression var19 = new com.google.javascript.rhino.JSTypeExpression(var13, "hi!");
    boolean var20 = var13.isNull();
    com.google.javascript.rhino.Node var21 = var9.clonePropsFrom(var13);
    boolean var22 = var13.isInc();
    com.google.javascript.rhino.jstype.FunctionBuilder var23 = var7.withSourceNode(var13);
    com.google.javascript.rhino.Node var24 = var4.srcref(var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var25 = var24.toStringTree();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test284"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.util.List var1 = var0.getEdges();
    java.util.Collection var2 = var0.getNodes();
    java.lang.Iterable var3 = var0.getDirectedGraphNodes();
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var5 = var4.cloneTree();
    boolean var6 = var5.isRegExp();
    java.lang.Iterable var7 = var5.siblings();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.labelName("hi!");
    int var10 = var9.getChildCount();
    java.lang.String var11 = var9.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var12 = var9.getStaticSourceFile();
    boolean var13 = var9.isQualifiedName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.disconnectInDirection((java.lang.Object)var7, (java.lang.Object)var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test285"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    java.lang.String var3 = var1.getSourceFileName();
    java.lang.String var4 = var1.toString();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var7 = var6.cloneTree();
    com.google.javascript.rhino.Node[] var8 = new com.google.javascript.rhino.Node[] { var6};
    com.google.javascript.rhino.Node var9 = new com.google.javascript.rhino.Node(100, var8);
    com.google.javascript.rhino.Node var13 = new com.google.javascript.rhino.Node(0, 10, 1);
    boolean var14 = var13.isLabelName();
    com.google.javascript.rhino.Node var15 = null;
    var9.addChildAfter(var13, var15);
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.Node.newString(0, "", 1, 153);
    com.google.javascript.rhino.Node[] var23 = new com.google.javascript.rhino.Node[] { var22};
    com.google.javascript.rhino.Node var24 = new com.google.javascript.rhino.Node(0, var23);
    boolean var25 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(var24);
    var24.setSourceEncodedPositionForTree(1);
    boolean var28 = var24.isArrayLit();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.ifNode(var1, var13, var24);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "LABEL_NAME hi!"+ "'", var4.equals("LABEL_NAME hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test286"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("module$", 100, 100);
    com.google.javascript.rhino.jstype.StaticSourceFile var4 = var3.getStaticSourceFile();
    boolean var5 = var3.isIn();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.labelName("hi!");
    int var9 = var7.getIntProp(1);
    int var10 = var3.getIndexOfChild(var7);
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.labelName("hi!");
    int var13 = var12.getChildCount();
    java.lang.String var14 = var12.getSourceFileName();
    java.lang.String var15 = var12.toString();
    java.lang.String var16 = com.google.javascript.jscomp.NodeUtil.getSourceName(var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.catchNode(var7, var12);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "LABEL_NAME hi!"+ "'", var15.equals("LABEL_NAME hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test287() {}
//   public void test287() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test287"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     java.util.Set var1 = null;
//     var0.setStripTypePrefixes(var1);
//     var0.setDeadAssignmentElimination(false);
//     com.google.javascript.jscomp.PropertyRenamingPolicy var5 = null;
//     var0.setPropertyRenaming(var5);
//     var0.setFlowSensitiveInlineVariables(false);
//     com.google.javascript.jscomp.CompilerOptions.Reach var9 = null;
//     var0.setRemoveUnusedVariables(var9);
// 
//   }

  public void test288() {}
//   public void test288() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test288"); }
// 
// 
//     java.io.InputStream var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromInputStream("", var1);
// 
//   }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test289"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var1 = var0.cloneTree();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = var0.getDouble();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test290"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    boolean var1 = var0.isDirected();
    java.lang.String var2 = var0.getName();
    com.google.javascript.jscomp.SourceFile var7 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
    com.google.javascript.jscomp.CompilerInput var8 = new com.google.javascript.jscomp.CompilerInput(var7);
    java.lang.String var9 = var7.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.disconnect((java.lang.Object)1, (java.lang.Object)var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "LinkedGraph"+ "'", var2.equals("LinkedGraph"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "module$"+ "'", var9.equals("module$"));

  }

  public void test291() {}
//   public void test291() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test291"); }
// 
// 
//     com.google.javascript.rhino.Node[] var0 = null;
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.objectlit(var0);
// 
//   }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test292"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.labelName("hi!");
    int var5 = var4.getChildCount();
    java.lang.String var6 = com.google.javascript.jscomp.NodeUtil.getSourceName(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.FunctionType var7 = var1.createInterfaceType("LinkedGraph", var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test293() {}
//   public void test293() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test293"); }
// 
// 
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, 1);
//     java.lang.Appendable var4 = null;
//     var3.appendStringTree(var4);
// 
//   }

  public void test294() {}
//   public void test294() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test294"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     com.google.javascript.jscomp.SourceMap var12 = var1.getSourceMap();
//     var1.disableThreads();
//     com.google.javascript.jscomp.JSSourceFile var14 = null;
//     com.google.javascript.jscomp.JSSourceFile[] var15 = new com.google.javascript.jscomp.JSSourceFile[] { var14};
//     com.google.javascript.jscomp.JSSourceFile var16 = null;
//     com.google.javascript.jscomp.JSSourceFile[] var17 = new com.google.javascript.jscomp.JSSourceFile[] { var16};
//     com.google.javascript.jscomp.CompilerOptions var18 = null;
//     var1.init(var15, var17, var18);
// 
//   }

  public void test295() {}
//   public void test295() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test295"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     com.google.javascript.jscomp.CompilerOptions var12 = new com.google.javascript.jscomp.CompilerOptions();
//     com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var13 = null;
//     var12.setAnonymousFunctionNaming(var13);
//     var12.setChainCalls(true);
//     var1.initOptions(var12);
//     com.google.javascript.jscomp.JSSourceFile[] var18 = null;
//     com.google.javascript.rhino.JSDocInfo var19 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var21 = var19.hasParameter("");
//     var19.setDeprecated(true);
//     int var24 = var19.getParameterCount();
//     boolean var25 = var19.isDefine();
//     java.util.List var26 = var19.getImplementedInterfaces();
//     com.google.javascript.jscomp.JSModule[] var27 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var26);
//     com.google.javascript.jscomp.CompilerOptions var28 = new com.google.javascript.jscomp.CompilerOptions();
//     var28.setRenamePrefixNamespace("JSDocInfo");
//     var28.setSpecializeInitialModule(false);
//     com.google.javascript.jscomp.Result var33 = var1.compile(var18, var27, var28);
// 
//   }

  public void test296() {}
//   public void test296() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test296"); }
// 
// 
//     com.google.javascript.rhino.jstype.JSTypeRegistry var0 = null;
//     com.google.javascript.rhino.jstype.FunctionBuilder var1 = new com.google.javascript.rhino.jstype.FunctionBuilder(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     boolean var5 = var2.isNoTypeCheck();
//     int var6 = var2.getImplementedInterfaceCount();
//     com.google.common.collect.ImmutableList var7 = var2.getTemplateTypeNames();
//     com.google.javascript.rhino.jstype.FunctionBuilder var8 = var1.withTemplateNames(var7);
//     com.google.javascript.rhino.jstype.FunctionType var9 = var8.build();
// 
//   }

  public void test297() {}
//   public void test297() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test297"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     com.google.javascript.jscomp.SourceMap var12 = var1.getSourceMap();
//     var1.check();
// 
//   }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test298"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("hi!");
    int var3 = var2.getChildCount();
    java.lang.String var4 = var2.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var5 = var2.getStaticSourceFile();
    boolean var6 = var2.isQualifiedName();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    var10.putBooleanProp(0, false);
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.labelName("hi!");
    int var21 = var20.getChildCount();
    com.google.javascript.rhino.jstype.JSType var22 = var20.getJSType();
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.labelName("hi!");
    int var25 = var24.getChildCount();
    java.lang.String var26 = var24.getSourceFileName();
    com.google.javascript.rhino.Node var29 = new com.google.javascript.rhino.Node(153, var18, var20, var24, 0, 153);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.labelName("hi!");
    int var32 = var31.getChildCount();
    java.lang.String var33 = var31.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var34 = null;
    var31.setStaticSourceFile(var34);
    boolean var36 = var31.isAnd();
    boolean var37 = var31.isEmpty();
    boolean var38 = var24.hasChild(var31);
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.labelName("hi!");
    int var41 = var40.getChildCount();
    com.google.javascript.rhino.jstype.JSType var42 = var40.getJSType();
    int var43 = var40.getType();
    com.google.javascript.rhino.Node var44 = var40.cloneTree();
    com.google.javascript.rhino.Node var47 = new com.google.javascript.rhino.Node((-1), var2, var10, var31, var40, 100, 10);
    com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var54 = com.google.javascript.rhino.IR.labelName("hi!");
    int var55 = var54.getChildCount();
    com.google.javascript.rhino.jstype.JSType var56 = var54.getJSType();
    com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.labelName("hi!");
    int var59 = var58.getChildCount();
    java.lang.String var60 = var58.getSourceFileName();
    com.google.javascript.rhino.Node var63 = new com.google.javascript.rhino.Node(153, var52, var54, var58, 0, 153);
    com.google.javascript.rhino.Node var64 = var47.srcrefTree(var63);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var65 = com.google.javascript.rhino.IR.continueNode(var64);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test299"); }


    com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
    java.lang.String var4 = var3.getOriginalPath();
    int var6 = var3.getColumnOfOffset(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "module$"+ "'", var4.equals("module$"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test300() {}
//   public void test300() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test300"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
//     boolean var1 = var0.isDirected();
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var4 = var3.getChildCount();
//     java.lang.String var5 = var3.getSourceFileName();
//     com.google.javascript.rhino.jstype.StaticSourceFile var6 = null;
//     var3.setStaticSourceFile(var6);
//     com.google.javascript.rhino.JSTypeExpression var9 = new com.google.javascript.rhino.JSTypeExpression(var3, "hi!");
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var10 = var0.getDirectedGraphNode((java.lang.Object)"hi!");
//     var0.popNodeAnnotations();
// 
//   }

  public void test301() {}
//   public void test301() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test301"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.JSSourceFile var2 = null;
//     com.google.javascript.jscomp.JSSourceFile[] var3 = new com.google.javascript.jscomp.JSSourceFile[] { var2};
//     com.google.javascript.rhino.JSDocInfo var4 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var6 = var4.hasParameter("");
//     boolean var7 = var4.isNoTypeCheck();
//     int var8 = var4.getImplementedInterfaceCount();
//     com.google.common.collect.ImmutableList var9 = var4.getTemplateTypeNames();
//     com.google.javascript.jscomp.JSModule[] var10 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var9);
//     com.google.javascript.jscomp.CompilerOptions var11 = null;
//     var1.init(var3, var10, var11);
// 
//   }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test302"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.util.List var1 = var0.getEdges();
    java.util.Collection var2 = var0.getNodes();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    var6.putBooleanProp(0, false);
    boolean var10 = var6.isOnlyModifiesThisCall();
    com.google.javascript.rhino.ErrorReporter var11 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11);
    com.google.javascript.rhino.jstype.JSType var13 = null;
    com.google.javascript.rhino.JSDocInfo var14 = new com.google.javascript.rhino.JSDocInfo();
    boolean var16 = var14.hasParameter("");
    java.util.List var17 = var14.getImplementedInterfaces();
    java.lang.String var18 = var14.getOriginalCommentString();
    java.lang.String var19 = var14.toString();
    java.util.Collection var20 = var14.getAuthors();
    java.lang.String var21 = var14.getVersion();
    java.util.List var22 = var14.getImplementedInterfaces();
    com.google.javascript.jscomp.JSModule[] var23 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var22);
    com.google.javascript.rhino.jstype.FunctionType var24 = var12.createFunctionType(var13, var22);
    com.google.javascript.rhino.JSDocInfo var25 = new com.google.javascript.rhino.JSDocInfo();
    boolean var27 = var25.hasParameter("");
    java.util.List var28 = var25.getImplementedInterfaces();
    boolean var29 = var25.hasTypedefType();
    boolean var30 = var25.isConsistentIdGenerator();
    boolean var31 = var25.hasFileOverview();
    boolean var32 = var25.isExterns();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var33 = var0.isConnected((java.lang.Object)var6, (java.lang.Object)var24, (java.lang.Object)var25);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "JSDocInfo"+ "'", var19.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test303"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.labelName("hi!");
    int var7 = var6.getChildCount();
    com.google.javascript.rhino.jstype.JSType var8 = var6.getJSType();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.labelName("hi!");
    int var11 = var10.getChildCount();
    java.lang.String var12 = var10.getSourceFileName();
    com.google.javascript.rhino.Node var15 = new com.google.javascript.rhino.Node(153, var4, var6, var10, 0, 153);
    var4.setSourceFileForTesting("");
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.trueNode();
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.labelName("hi!");
    int var22 = var21.getChildCount();
    java.lang.String var23 = var21.getSourceFileName();
    java.lang.String var24 = var21.toString();
    boolean var25 = var19.isEquivalentToTyped(var21);
    boolean var26 = var19.isFor();
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.labelName("hi!");
    int var34 = var33.getChildCount();
    com.google.javascript.rhino.jstype.JSType var35 = var33.getJSType();
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.labelName("hi!");
    int var38 = var37.getChildCount();
    java.lang.String var39 = var37.getSourceFileName();
    com.google.javascript.rhino.Node var42 = new com.google.javascript.rhino.Node(153, var31, var33, var37, 0, 153);
    com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.IR.labelName("hi!");
    int var45 = var44.getChildCount();
    java.lang.String var46 = var44.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var47 = null;
    var44.setStaticSourceFile(var47);
    boolean var49 = var44.isAnd();
    boolean var50 = var44.isEmpty();
    boolean var51 = var37.hasChild(var44);
    boolean var52 = var44.isHook();
    var44.setLength((-1));
    com.google.javascript.rhino.Node var57 = new com.google.javascript.rhino.Node(0, var19, var44, 1, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.and(var4, var57);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "LABEL_NAME hi!"+ "'", var24.equals("LABEL_NAME hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);

  }

  public void test304() {}
//   public void test304() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test304"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
//     java.util.List var1 = var0.getEdges();
//     var0.pushNodeAnnotations();
//     var0.popEdgeAnnotations();
// 
//   }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test305"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.PropertyRenamingPolicy var1 = com.google.javascript.jscomp.PropertyRenamingPolicy.valueOf("LABEL_NAME hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test306"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("module$", 100, 100);
    com.google.javascript.rhino.jstype.StaticSourceFile var4 = var3.getStaticSourceFile();
    boolean var5 = var3.isIn();
    boolean var6 = var3.isLabel();
    java.lang.String var7 = var3.toString();
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.Node.newString(0, "", 1, 153);
    com.google.javascript.rhino.Node[] var14 = new com.google.javascript.rhino.Node[] { var13};
    com.google.javascript.rhino.Node var15 = new com.google.javascript.rhino.Node(0, var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.switchNode(var3, var14);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "STRING module$ 100"+ "'", var7.equals("STRING module$ 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test307() {}
//   public void test307() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test307"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.CompilerOptions var2 = new com.google.javascript.jscomp.CompilerOptions();
//     var2.setCollapseProperties(false);
//     var2.enableExternExports(false);
//     java.util.Set var7 = null;
//     var2.setStripNamePrefixes(var7);
//     com.google.javascript.rhino.JSDocInfo var9 = new com.google.javascript.rhino.JSDocInfo();
//     com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.falseNode();
//     com.google.javascript.rhino.Node var11 = var10.cloneTree();
//     var9.setAssociatedNode(var11);
//     java.util.List var13 = var9.getThrownTypes();
//     java.util.List var14 = var9.getThrownTypes();
//     var2.setManageClosureDependencies(var14);
//     com.google.javascript.rhino.JSDocInfo var16 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var18 = var16.hasParameter("");
//     boolean var19 = var16.isNoTypeCheck();
//     int var20 = var16.getImplementedInterfaceCount();
//     com.google.common.collect.ImmutableList var21 = var16.getTemplateTypeNames();
//     com.google.javascript.jscomp.JSModule[] var22 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var21);
//     com.google.javascript.jscomp.CompilerOptions var23 = new com.google.javascript.jscomp.CompilerOptions();
//     var23.setCollapseProperties(false);
//     com.google.javascript.jscomp.StrictWarningsGuard var26 = new com.google.javascript.jscomp.StrictWarningsGuard();
//     var23.addWarningsGuard((com.google.javascript.jscomp.WarningsGuard)var26);
//     com.google.javascript.jscomp.CheckLevel var28 = null;
//     var23.setCheckGlobalThisLevel(var28);
//     var23.setAliasExternals(true);
//     java.util.Map var32 = null;
//     var23.setDefineReplacements(var32);
//     var23.setRemoveTryCatchFinally(true);
//     com.google.javascript.jscomp.CompilerOptions var36 = new com.google.javascript.jscomp.CompilerOptions();
//     var36.setCollapseProperties(false);
//     com.google.javascript.jscomp.StrictWarningsGuard var39 = new com.google.javascript.jscomp.StrictWarningsGuard();
//     var36.addWarningsGuard((com.google.javascript.jscomp.WarningsGuard)var39);
//     var23.addWarningsGuard((com.google.javascript.jscomp.WarningsGuard)var39);
//     com.google.javascript.jscomp.CompilerOptions var42 = new com.google.javascript.jscomp.CompilerOptions();
//     var42.setCollapseProperties(false);
//     com.google.javascript.jscomp.StrictWarningsGuard var45 = new com.google.javascript.jscomp.StrictWarningsGuard();
//     var42.addWarningsGuard((com.google.javascript.jscomp.WarningsGuard)var45);
//     com.google.javascript.rhino.JSDocInfo var47 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var49 = var47.hasParameter("");
//     java.util.List var50 = var47.getImplementedInterfaces();
//     boolean var51 = var47.hasTypedefType();
//     boolean var52 = var47.isConsistentIdGenerator();
//     var47.setLicense("hi!");
//     java.util.Set var55 = var47.getSuppressions();
//     var42.setIdGenerators(var55);
//     var23.setReplaceStringsReservedStrings(var55);
//     var1.<com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.SourceFile>init(var14, (java.util.List)var21, var23);
// 
//   }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test308"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.labelName("hi!");
    int var7 = var6.getChildCount();
    com.google.javascript.rhino.jstype.JSType var8 = var6.getJSType();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.labelName("hi!");
    int var11 = var10.getChildCount();
    java.lang.String var12 = var10.getSourceFileName();
    com.google.javascript.rhino.Node var15 = new com.google.javascript.rhino.Node(153, var4, var6, var10, 0, 153);
    boolean var16 = var15.isNE();
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.block();
    com.google.javascript.rhino.jstype.JSType var18 = var17.getJSType();
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.defaultCase(var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.sheq(var15, var17);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test309"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setCollapseProperties(false);
    var0.setCollapseVariableDeclarations(false);
    java.lang.Object var5 = var0.clone();
    var0.disableRuntimeTypeCheck();
    var0.setGenerateExports(false);
    var0.setAliasExternals(true);
    var0.setRemoveUnusedLocalVars(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test310() {}
//   public void test310() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test310"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var3 = new com.google.javascript.jscomp.CompilerOptions();
//     var3.setCollapseProperties(false);
//     com.google.javascript.jscomp.StrictWarningsGuard var6 = new com.google.javascript.jscomp.StrictWarningsGuard();
//     var3.addWarningsGuard((com.google.javascript.jscomp.WarningsGuard)var6);
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
//     var12.putBooleanProp(0, false);
//     com.google.javascript.jscomp.CheckLevel var16 = null;
//     com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
//     java.lang.String[] var21 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var22 = com.google.javascript.jscomp.JSError.make(var19, var21);
//     com.google.javascript.jscomp.DiagnosticType var25 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
//     java.lang.String[] var27 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make(var25, var27);
//     com.google.javascript.jscomp.JSError var29 = com.google.javascript.jscomp.JSError.make("LABEL_NAME hi!\n", var12, var16, var19, var27);
//     com.google.javascript.jscomp.CheckLevel var30 = var6.level(var29);
//     com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
//     java.lang.String[] var35 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var36 = com.google.javascript.jscomp.JSError.make(var33, var35);
//     com.google.javascript.jscomp.DiagnosticType var39 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
//     java.lang.String[] var41 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var42 = com.google.javascript.jscomp.JSError.make(var39, var41);
//     com.google.javascript.jscomp.JSError var43 = com.google.javascript.jscomp.JSError.make("LABEL_NAME hi!", 1, 153, var30, var33, var41);
//     com.google.javascript.jscomp.CompilerOptions var44 = new com.google.javascript.jscomp.CompilerOptions();
//     var44.setCollapseProperties(false);
//     com.google.javascript.jscomp.StrictWarningsGuard var47 = new com.google.javascript.jscomp.StrictWarningsGuard();
//     var44.addWarningsGuard((com.google.javascript.jscomp.WarningsGuard)var47);
//     com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
//     var53.putBooleanProp(0, false);
//     com.google.javascript.jscomp.CheckLevel var57 = null;
//     com.google.javascript.jscomp.DiagnosticType var60 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
//     java.lang.String[] var62 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var63 = com.google.javascript.jscomp.JSError.make(var60, var62);
//     com.google.javascript.jscomp.DiagnosticType var66 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
//     java.lang.String[] var68 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var69 = com.google.javascript.jscomp.JSError.make(var66, var68);
//     com.google.javascript.jscomp.JSError var70 = com.google.javascript.jscomp.JSError.make("LABEL_NAME hi!\n", var53, var57, var60, var68);
//     com.google.javascript.jscomp.CheckLevel var71 = var47.level(var70);
//     com.google.javascript.jscomp.MessageFormatter var72 = null;
//     java.lang.String var73 = var43.format(var71, var72);
// 
//   }

  public void test311() {}
//   public void test311() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test311"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var3);
//     com.google.javascript.jscomp.JSModule var5 = null;
//     var4.setModule(var5);
//     java.io.PrintStream var7 = null;
//     com.google.javascript.jscomp.Compiler var8 = new com.google.javascript.jscomp.Compiler(var7);
//     com.google.javascript.rhino.JSDocInfo var9 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var11 = var9.hasParameter("");
//     java.util.List var12 = var9.getImplementedInterfaces();
//     java.lang.String var13 = var9.getOriginalCommentString();
//     java.lang.String var14 = var9.toString();
//     java.lang.String var15 = var9.getLicense();
//     java.util.List var16 = var9.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var17 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var8, var16, var17);
//     var4.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var8);
//     com.google.javascript.jscomp.JSSourceFile var20 = null;
//     com.google.javascript.jscomp.JSSourceFile[] var21 = new com.google.javascript.jscomp.JSSourceFile[] { var20};
//     com.google.javascript.rhino.JSDocInfo var22 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var24 = var22.hasParameter("");
//     boolean var25 = var22.isNoTypeCheck();
//     int var26 = var22.getImplementedInterfaceCount();
//     com.google.common.collect.ImmutableList var27 = var22.getTemplateTypeNames();
//     com.google.javascript.jscomp.JSModule[] var28 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var27);
//     com.google.javascript.jscomp.CompilerOptions var29 = new com.google.javascript.jscomp.CompilerOptions();
//     var29.setCollapseProperties(false);
//     var29.enableExternExports(false);
//     var29.setAliasExternals(false);
//     com.google.javascript.jscomp.CodingConvention var36 = var29.getCodingConvention();
//     var29.setOutputJsStringUsage(true);
//     var29.setRemoveUnusedVars(true);
//     com.google.javascript.jscomp.Result var41 = var8.compile(var21, var28, var29);
// 
//   }

  public void test312() {}
//   public void test312() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test312"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var2 = var1.getChildCount();
//     com.google.javascript.rhino.jstype.JSType var3 = var1.getJSType();
//     java.lang.Iterable var4 = var1.children();
//     com.google.javascript.rhino.InputId var5 = var1.getInputId();
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.continueNode();
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.falseNode();
//     com.google.javascript.rhino.Node var8 = var6.useSourceInfoFromForTree(var7);
//     int var9 = var7.getChildCount();
//     com.google.javascript.rhino.Node var10 = var1.getChildBefore(var7);
// 
//   }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test313"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
    boolean var4 = var2.hasParameter("");
    java.util.List var5 = var2.getImplementedInterfaces();
    java.lang.String var6 = var2.getOriginalCommentString();
    java.lang.String var7 = var2.toString();
    java.lang.String var8 = var2.getLicense();
    java.util.List var9 = var2.getImplementedInterfaces();
    com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
    com.google.javascript.jscomp.deps.SortedDependencies var12 = new com.google.javascript.jscomp.deps.SortedDependencies(var9);
    com.google.javascript.rhino.JSDocInfo var13 = new com.google.javascript.rhino.JSDocInfo();
    boolean var15 = var13.hasParameter("");
    var13.setDeprecated(true);
    int var18 = var13.getParameterCount();
    boolean var19 = var13.isDefine();
    java.util.List var20 = var13.getImplementedInterfaces();
    java.util.List var22 = var12.getDependenciesOf(var20, true);
    com.google.javascript.jscomp.deps.DependencyInfo var24 = var12.maybeGetInputProviding("LinkedGraph");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.deps.DependencyInfo var26 = var12.getInputProviding("module$JSDocInfo");
      fail("Expected exception of type com.google.javascript.jscomp.deps.SortedDependencies.MissingProvideException");
    } catch (com.google.javascript.jscomp.deps.SortedDependencies.MissingProvideException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "JSDocInfo"+ "'", var7.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test314"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.util.List var1 = var0.getEdges();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = var0.getWeight((java.lang.Object)"");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test315"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setCollapseProperties(false);
    var0.setCollapseVariableDeclarations(false);
    java.lang.Object var5 = var0.clone();
    var0.setCollapsePropertiesOnExternTypes(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test316() {}
//   public void test316() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test316"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.trueNode();
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var3 = var2.getChildCount();
//     java.lang.String var4 = var2.getSourceFileName();
//     java.lang.String var5 = var2.toString();
//     boolean var6 = var0.isEquivalentToTyped(var2);
//     com.google.javascript.rhino.Node var8 = var0.getChildAtIndex(1);
// 
//   }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test317"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.Node.newNumber((-1.0d));
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.labelName("hi!");
    int var4 = var3.getChildCount();
    java.lang.String var5 = var3.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var6 = null;
    var3.setStaticSourceFile(var6);
    com.google.javascript.rhino.JSTypeExpression var9 = new com.google.javascript.rhino.JSTypeExpression(var3, "hi!");
    com.google.javascript.rhino.Node var10 = var3.removeFirstChild();
    com.google.javascript.rhino.Node var11 = var1.srcrefTree(var3);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.labelName("hi!");
    int var14 = var13.getChildCount();
    java.lang.String var15 = var13.getSourceFileName();
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.labelName("hi!");
    int var18 = var17.getChildCount();
    java.lang.String var19 = var17.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var20 = null;
    var17.setStaticSourceFile(var20);
    com.google.javascript.rhino.JSTypeExpression var23 = new com.google.javascript.rhino.JSTypeExpression(var17, "hi!");
    boolean var24 = var17.isNull();
    com.google.javascript.rhino.Node var25 = var13.clonePropsFrom(var17);
    boolean var26 = var17.isInc();
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.block();
    com.google.javascript.rhino.jstype.JSType var28 = var27.getJSType();
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.defaultCase(var27);
    java.util.Collection var30 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.function(var1, var17, var27);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test318"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setCollapseProperties(false);
    var0.enableExternExports(false);
    java.util.Set var5 = null;
    var0.setStripNamePrefixes(var5);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var7 = var0.getTweakProcessing();
    com.google.javascript.jscomp.CheckLevel var8 = null;
    var0.setBrokenClosureRequiresLevel(var8);
    var0.setMarkNoSideEffectCalls(true);
    var0.setRemoveUnusedPrototypePropertiesInExterns(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test319"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    java.lang.String var3 = var1.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var4 = var1.getStaticSourceFile();
    boolean var5 = var1.isIn();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.neg(var1);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test320"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled("JSDocInfo", "Unversioned directory");
    com.google.javascript.jscomp.CompilerOptions var3 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.PropertyRenamingPolicy var4 = null;
    var3.setPropertyRenaming(var4);
    var3.setNameAnonymousFunctionsOnly(true);
    boolean var8 = var2.equals((java.lang.Object)var3);
    com.google.javascript.jscomp.ClosureCodingConvention var9 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.labelName("hi!");
    int var12 = var11.getChildCount();
    java.lang.String var13 = var11.getSourceFileName();
    com.google.javascript.jscomp.CodingConvention.Bind var15 = var9.describeFunctionBind(var11, true);
    boolean var16 = var2.equals((java.lang.Object)var9);
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.labelName("hi!");
    int var19 = var18.getChildCount();
    java.lang.String var20 = var18.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var21 = var18.getStaticSourceFile();
    var18.setLineno(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var24 = var9.isPropertyTestFunction(var18);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test321"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    boolean var1 = var0.isDirected();
    com.google.javascript.rhino.JSDocInfoBuilder var3 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.labelName("hi!");
    int var6 = var5.getChildCount();
    java.lang.String var7 = var5.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var8 = null;
    var5.setStaticSourceFile(var8);
    com.google.javascript.rhino.JSTypeExpression var11 = new com.google.javascript.rhino.JSTypeExpression(var5, "hi!");
    boolean var12 = var3.recordThrowType(var11);
    boolean var14 = var3.recordReturnDescription("module$");
    com.google.javascript.rhino.JSDocInfoBuilder var16 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.labelName("hi!");
    int var19 = var18.getChildCount();
    java.lang.String var20 = var18.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var21 = null;
    var18.setStaticSourceFile(var21);
    com.google.javascript.rhino.JSTypeExpression var24 = new com.google.javascript.rhino.JSTypeExpression(var18, "hi!");
    boolean var25 = var16.recordThrowType(var24);
    com.google.javascript.rhino.JSDocInfoBuilder var27 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
    var27.markText("hi!", (-1), 10, 1, 0);
    com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.labelName("hi!");
    int var36 = var35.getChildCount();
    java.lang.String var37 = var35.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var38 = null;
    var35.setStaticSourceFile(var38);
    com.google.javascript.rhino.JSTypeExpression var41 = new com.google.javascript.rhino.JSTypeExpression(var35, "hi!");
    boolean var42 = var27.recordImplementedInterface(var41);
    boolean var43 = var16.recordTypedef(var41);
    boolean var44 = var3.recordThrowType(var41);
    boolean var45 = var3.recordImplicitCast();
    com.google.javascript.jscomp.CompilerOptions var46 = new com.google.javascript.jscomp.CompilerOptions();
    var46.setCollapseProperties(false);
    com.google.javascript.jscomp.StrictWarningsGuard var49 = new com.google.javascript.jscomp.StrictWarningsGuard();
    var46.addWarningsGuard((com.google.javascript.jscomp.WarningsGuard)var49);
    var46.setInferTypes(true);
    var46.setRemoveUnusedPrototypeProperties(false);
    var46.setCheckMissingGetCssNameBlacklist(": hi!");
    com.google.javascript.jscomp.ClosureCodingConvention var57 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var59 = com.google.javascript.rhino.IR.labelName("hi!");
    int var60 = var59.getChildCount();
    java.lang.String var61 = var59.getSourceFileName();
    com.google.javascript.jscomp.CodingConvention.Bind var63 = var57.describeFunctionBind(var59, true);
    java.lang.String var64 = var57.getAbstractMethodName();
    java.lang.String var65 = var57.getExportPropertyFunction();
    com.google.javascript.rhino.Node var70 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var72 = com.google.javascript.rhino.IR.labelName("hi!");
    int var73 = var72.getChildCount();
    com.google.javascript.rhino.jstype.JSType var74 = var72.getJSType();
    com.google.javascript.rhino.Node var76 = com.google.javascript.rhino.IR.labelName("hi!");
    int var77 = var76.getChildCount();
    java.lang.String var78 = var76.getSourceFileName();
    com.google.javascript.rhino.Node var81 = new com.google.javascript.rhino.Node(153, var70, var72, var76, 0, 153);
    com.google.javascript.rhino.Node var83 = com.google.javascript.rhino.IR.labelName("hi!");
    int var84 = var83.getChildCount();
    java.lang.String var85 = var83.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var86 = null;
    var83.setStaticSourceFile(var86);
    boolean var88 = var83.isAnd();
    boolean var89 = var83.isEmpty();
    boolean var90 = var76.hasChild(var83);
    var83.putIntProp(153, 100);
    com.google.javascript.jscomp.CodingConvention.Bind var95 = var57.describeFunctionBind(var83, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var96 = var0.isConnected((java.lang.Object)var45, (java.lang.Object)var46, (java.lang.Object)var57);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "goog.abstractMethod"+ "'", var64.equals("goog.abstractMethod"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "goog.exportProperty"+ "'", var65.equals("goog.exportProperty"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var95);

  }

  public void test322() {}
//   public void test322() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test322"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.falseNode();
//     com.google.javascript.rhino.Node var2 = var1.cloneTree();
//     boolean var3 = var2.isRegExp();
//     java.lang.Iterable var4 = var2.siblings();
//     java.util.Iterator var5 = var0.getNeighborNodesIterator((java.lang.Object)var4);
// 
//   }

  public void test323() {}
//   public void test323() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test323"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = null;
//     com.google.javascript.rhino.jstype.FunctionParamBuilder var3 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var2);
//     boolean var4 = var3.hasVarArgs();
//     com.google.javascript.rhino.ErrorReporter var5 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var5);
//     com.google.javascript.rhino.jstype.JSType var7 = null;
//     com.google.javascript.rhino.JSDocInfo var8 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var10 = var8.hasParameter("");
//     java.util.List var11 = var8.getImplementedInterfaces();
//     java.lang.String var12 = var8.getOriginalCommentString();
//     java.lang.String var13 = var8.toString();
//     java.util.Collection var14 = var8.getAuthors();
//     java.lang.String var15 = var8.getVersion();
//     java.util.List var16 = var8.getImplementedInterfaces();
//     com.google.javascript.jscomp.JSModule[] var17 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var16);
//     com.google.javascript.rhino.jstype.FunctionType var18 = var6.createFunctionType(var7, var16);
//     com.google.javascript.rhino.jstype.JSType[] var19 = new com.google.javascript.rhino.jstype.JSType[] { var7};
//     boolean var20 = var3.addRequiredParams(var19);
//     com.google.javascript.rhino.Node var21 = var1.createOptionalParameters(var19);
// 
//   }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test324"); }


    com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
    java.lang.String var4 = var3.getOriginalPath();
    java.lang.String var6 = var3.getLine(100);
    int var8 = var3.getLineOfOffset(153);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var10 = var3.getLineOffset((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "module$"+ "'", var4.equals("module$"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test325"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    boolean var2 = var0.hasParameter("");
    boolean var3 = var0.isNoTypeCheck();
    boolean var4 = var0.isNoShadow();
    int var5 = var0.getExtendedInterfacesCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test326"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var2 = var1.cloneTree();
    com.google.javascript.rhino.Node[] var3 = new com.google.javascript.rhino.Node[] { var1};
    com.google.javascript.rhino.Node var4 = new com.google.javascript.rhino.Node(100, var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.var(var4);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test327"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.ErrorReporter var2 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    com.google.javascript.rhino.JSDocInfo var5 = new com.google.javascript.rhino.JSDocInfo();
    boolean var7 = var5.hasParameter("");
    java.util.List var8 = var5.getImplementedInterfaces();
    java.lang.String var9 = var5.getOriginalCommentString();
    java.lang.String var10 = var5.toString();
    java.util.Collection var11 = var5.getAuthors();
    java.lang.String var12 = var5.getVersion();
    java.util.List var13 = var5.getImplementedInterfaces();
    com.google.javascript.jscomp.JSModule[] var14 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var13);
    com.google.javascript.rhino.jstype.FunctionType var15 = var3.createFunctionType(var4, var13);
    boolean var16 = var15.isUnknownType();
    com.google.javascript.rhino.jstype.FunctionType var17 = var15.toMaybeFunctionType();
    com.google.javascript.rhino.ErrorReporter var18 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18);
    com.google.javascript.rhino.jstype.JSType var20 = null;
    com.google.javascript.rhino.JSDocInfo var21 = new com.google.javascript.rhino.JSDocInfo();
    boolean var23 = var21.hasParameter("");
    java.util.List var24 = var21.getImplementedInterfaces();
    java.lang.String var25 = var21.getOriginalCommentString();
    java.lang.String var26 = var21.toString();
    java.util.Collection var27 = var21.getAuthors();
    java.lang.String var28 = var21.getVersion();
    java.util.List var29 = var21.getImplementedInterfaces();
    com.google.javascript.jscomp.JSModule[] var30 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var29);
    com.google.javascript.rhino.jstype.FunctionType var31 = var19.createFunctionType(var20, var29);
    boolean var32 = var31.isUnknownType();
    boolean var33 = var31.isUnknownType();
    com.google.javascript.rhino.jstype.FunctionType var34 = var1.createFunctionTypeWithNewReturnType(var15, (com.google.javascript.rhino.jstype.JSType)var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.ObjectType var35 = var34.getInstanceType();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "JSDocInfo"+ "'", var10.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "JSDocInfo"+ "'", var26.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test328"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.util.List var1 = var0.getEdges();
    var0.pushNodeAnnotations();
    java.lang.Object var3 = null;
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.continueNode();
    boolean var5 = var4.isOptionalArg();
    com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.warning("hi!", "");
    java.lang.String[] var9 = null;
    com.google.javascript.jscomp.JSError var10 = com.google.javascript.jscomp.JSError.make(var8, var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.connect(var3, (java.lang.Object)var4, (java.lang.Object)var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test329"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.lang.String var1 = var0.getName();
    com.google.javascript.jscomp.CompilerOptions var2 = new com.google.javascript.jscomp.CompilerOptions();
    var2.setCollapseProperties(false);
    var2.setCollapseVariableDeclarations(false);
    java.lang.Object var7 = var2.clone();
    var2.enableExternExports(false);
    com.google.javascript.jscomp.parsing.Config var11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var12 = var0.getDirectedGraphEdges((java.lang.Object)var2, (java.lang.Object)var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "LinkedGraph"+ "'", var1.equals("LinkedGraph"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test330"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    java.lang.String var3 = var1.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var4 = null;
    var1.setStaticSourceFile(var4);
    boolean var6 = var1.isAnd();
    boolean var7 = var1.isTry();
    boolean var8 = var1.isDec();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.labelName("hi!");
    int var11 = var10.getChildCount();
    java.lang.String var12 = var10.getSourceFileName();
    boolean var13 = var10.isCatch();
    boolean var14 = var10.isDebugger();
    com.google.javascript.rhino.Node var15 = var1.useSourceInfoFromForTree(var10);
    com.google.javascript.rhino.JSDocInfo var16 = new com.google.javascript.rhino.JSDocInfo();
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var18 = var17.cloneTree();
    var16.setAssociatedNode(var18);
    com.google.javascript.rhino.Node var20 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var15.replaceChildAfter(var18, var20);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test331() {}
//   public void test331() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test331"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     com.google.javascript.rhino.jstype.JSType var2 = null;
//     com.google.javascript.rhino.JSDocInfo var3 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var5 = var3.hasParameter("");
//     java.util.List var6 = var3.getImplementedInterfaces();
//     java.lang.String var7 = var3.getOriginalCommentString();
//     java.lang.String var8 = var3.toString();
//     java.util.Collection var9 = var3.getAuthors();
//     java.lang.String var10 = var3.getVersion();
//     java.util.List var11 = var3.getImplementedInterfaces();
//     com.google.javascript.jscomp.JSModule[] var12 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var11);
//     com.google.javascript.rhino.jstype.FunctionType var13 = var1.createFunctionType(var2, var11);
//     boolean var14 = var13.isUnknownType();
//     com.google.javascript.rhino.ErrorReporter var15 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var15);
//     com.google.javascript.rhino.jstype.JSType var17 = null;
//     com.google.javascript.rhino.JSDocInfo var18 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var20 = var18.hasParameter("");
//     java.util.List var21 = var18.getImplementedInterfaces();
//     java.lang.String var22 = var18.getOriginalCommentString();
//     java.lang.String var23 = var18.toString();
//     java.util.Collection var24 = var18.getAuthors();
//     java.lang.String var25 = var18.getVersion();
//     java.util.List var26 = var18.getImplementedInterfaces();
//     com.google.javascript.jscomp.JSModule[] var27 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var26);
//     com.google.javascript.rhino.jstype.FunctionType var28 = var16.createFunctionType(var17, var26);
//     boolean var29 = var28.isUnknownType();
//     boolean var30 = var28.isUnknownType();
//     com.google.javascript.rhino.jstype.JSType var32 = var28.findPropertyType("LABEL_NAME hi!\n");
//     com.google.javascript.rhino.jstype.JSType var33 = var13.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType)var28);
//     com.google.javascript.rhino.jstype.JSType var35 = null;
//     com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.Node.newString("module$", 100, 100);
//     com.google.javascript.rhino.jstype.StaticSourceFile var40 = var39.getStaticSourceFile();
//     boolean var41 = var39.isIn();
//     boolean var42 = var39.isLabel();
//     java.lang.String var43 = var39.toString();
//     com.google.javascript.rhino.JSDocInfo var44 = var39.getJSDocInfo();
//     boolean var45 = var28.defineDeclaredProperty(". hi! at (unknown source) line (unknown line) : (unknown column)", var35, var39);
//     com.google.javascript.rhino.ErrorReporter var46 = null;
//     com.google.javascript.rhino.ErrorReporter var47 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var47);
//     com.google.javascript.rhino.jstype.JSType var49 = null;
//     com.google.javascript.rhino.JSDocInfo var50 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var52 = var50.hasParameter("");
//     java.util.List var53 = var50.getImplementedInterfaces();
//     java.lang.String var54 = var50.getOriginalCommentString();
//     java.lang.String var55 = var50.toString();
//     java.util.Collection var56 = var50.getAuthors();
//     java.lang.String var57 = var50.getVersion();
//     java.util.List var58 = var50.getImplementedInterfaces();
//     com.google.javascript.jscomp.JSModule[] var59 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var58);
//     com.google.javascript.rhino.jstype.FunctionType var60 = var48.createFunctionType(var49, var58);
//     boolean var61 = var60.isUnknownType();
//     com.google.javascript.rhino.jstype.FunctionType var62 = var60.toMaybeFunctionType();
//     boolean var63 = var62.isFunctionPrototypeType();
//     com.google.javascript.rhino.jstype.JSType var64 = var28.resolve(var46, (com.google.javascript.rhino.jstype.StaticScope)var62);
//     com.google.common.base.Predicate var65 = null;
//     boolean var66 = var62.setValidator(var65);
// 
//   }

  public void test332() {}
//   public void test332() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test332"); }
// 
// 
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("InputId: hi!", (-1), 0);
//     com.google.javascript.rhino.Node var4 = null;
//     com.google.javascript.rhino.Node var5 = var3.useSourceInfoFromForTree(var4);
// 
//   }

  public void test333() {}
//   public void test333() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test333"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var3 = null;
//     java.lang.String[] var4 = null;
//     com.google.javascript.jscomp.JSError var5 = com.google.javascript.jscomp.JSError.make("Node tree inequality:\nTree1:\nLABEL_NAME hi!\n\n\nTree2:\nNAME . hi! at (unknown source) line (unknown line) : (unknown column)\n\n\nSubtree1: LABEL_NAME hi!\n\n\nSubtree2: NAME . hi! at (unknown source) line (unknown line) : (unknown column)\n", (-1), 100, var3, var4);
// 
//   }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test334"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setCollapseProperties(false);
    var0.enableExternExports(false);
    var0.setLineBreak(true);
    com.google.javascript.jscomp.CheckLevel var7 = null;
    var0.setCheckProvides(var7);
    com.google.javascript.jscomp.CompilerOptions.TracerMode var9 = var0.getTracerMode();
    com.google.javascript.rhino.JSDocInfo var10 = new com.google.javascript.rhino.JSDocInfo();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var12 = var11.cloneTree();
    var10.setAssociatedNode(var12);
    java.util.List var14 = var10.getThrownTypes();
    boolean var15 = var10.isNoSideEffects();
    boolean var16 = var9.equals((java.lang.Object)var15);
    java.lang.Class var17 = var9.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var19 = java.lang.Enum.<java.lang.Enum>valueOf(var17, ": hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test335() {}
//   public void test335() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test335"); }
// 
// 
//     com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("LABEL_NAME hi!");
//     var1.setDepth(153);
//     com.google.javascript.jscomp.SourceFile var7 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
//     com.google.javascript.jscomp.CompilerInput var8 = new com.google.javascript.jscomp.CompilerInput(var7);
//     com.google.javascript.rhino.InputId var9 = null;
//     com.google.javascript.jscomp.CompilerInput var11 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var8, var9, false);
//     var8.clearAst();
//     com.google.javascript.jscomp.SourceFile var13 = var8.getSourceFile();
//     com.google.javascript.jscomp.JSModule var15 = new com.google.javascript.jscomp.JSModule("LABEL_NAME hi!");
//     var15.setDepth(153);
//     var8.setModule(var15);
//     var1.remove(var8);
//     com.google.javascript.jscomp.SourceFile var23 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
//     com.google.javascript.jscomp.CompilerInput var24 = new com.google.javascript.jscomp.CompilerInput(var23);
//     com.google.javascript.rhino.InputId var25 = null;
//     com.google.javascript.jscomp.CompilerInput var27 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var24, var25, false);
//     var24.clearAst();
//     com.google.javascript.jscomp.SourceFile var32 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
//     com.google.javascript.jscomp.CompilerInput var33 = new com.google.javascript.jscomp.CompilerInput(var32);
//     var24.setSourceFile(var32);
//     var1.addFirst(var24);
//     com.google.javascript.jscomp.CompilerInput var36 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var24);
//     com.google.javascript.jscomp.AbstractCompiler var37 = null;
//     com.google.javascript.rhino.Node var38 = var24.getAstRoot(var37);
// 
//   }

  public void test336() {}
//   public void test336() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test336"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     java.lang.String var12 = var1.getAstDotGraph();
//     boolean var13 = var1.acceptEcmaScript5();
// 
//   }

  public void test337() {}
//   public void test337() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test337"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     com.google.javascript.jscomp.SourceMap var12 = var1.getSourceMap();
//     com.google.javascript.jscomp.Scope var13 = var1.getTopScope();
//     com.google.javascript.jscomp.CompilerInput var15 = var1.newExternInput("module$");
// 
//   }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test338"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
    boolean var4 = var2.hasParameter("");
    java.util.List var5 = var2.getImplementedInterfaces();
    java.lang.String var6 = var2.getOriginalCommentString();
    java.lang.String var7 = var2.toString();
    java.lang.String var8 = var2.getLicense();
    java.util.List var9 = var2.getImplementedInterfaces();
    com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
    com.google.javascript.jscomp.deps.SortedDependencies var12 = new com.google.javascript.jscomp.deps.SortedDependencies(var9);
    com.google.javascript.rhino.JSDocInfo var13 = new com.google.javascript.rhino.JSDocInfo();
    boolean var15 = var13.hasParameter("");
    var13.setDeprecated(true);
    int var18 = var13.getParameterCount();
    boolean var19 = var13.isDefine();
    java.util.List var20 = var13.getImplementedInterfaces();
    java.util.List var22 = var12.getDependenciesOf(var20, true);
    java.util.List var23 = var12.getInputsWithoutProvides();
    com.google.javascript.jscomp.deps.DependencyInfo var25 = var12.maybeGetInputProviding("");
    com.google.javascript.jscomp.deps.DependencyInfo var27 = var12.maybeGetInputProviding("module$");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "JSDocInfo"+ "'", var7.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test339"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.PropertyRenamingPolicy var1 = com.google.javascript.jscomp.PropertyRenamingPolicy.valueOf("LinkedGraph");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test340"); }


    com.google.javascript.jscomp.AstValidator var0 = new com.google.javascript.jscomp.AstValidator();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.labelName("hi!");
    int var4 = var3.getChildCount();
    java.lang.String var5 = var3.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var6 = var3.getStaticSourceFile();
    boolean var7 = var3.isQualifiedName();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    var11.putBooleanProp(0, false);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.labelName("hi!");
    int var22 = var21.getChildCount();
    com.google.javascript.rhino.jstype.JSType var23 = var21.getJSType();
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.labelName("hi!");
    int var26 = var25.getChildCount();
    java.lang.String var27 = var25.getSourceFileName();
    com.google.javascript.rhino.Node var30 = new com.google.javascript.rhino.Node(153, var19, var21, var25, 0, 153);
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.labelName("hi!");
    int var33 = var32.getChildCount();
    java.lang.String var34 = var32.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var35 = null;
    var32.setStaticSourceFile(var35);
    boolean var37 = var32.isAnd();
    boolean var38 = var32.isEmpty();
    boolean var39 = var25.hasChild(var32);
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.labelName("hi!");
    int var42 = var41.getChildCount();
    com.google.javascript.rhino.jstype.JSType var43 = var41.getJSType();
    int var44 = var41.getType();
    com.google.javascript.rhino.Node var45 = var41.cloneTree();
    com.google.javascript.rhino.Node var48 = new com.google.javascript.rhino.Node((-1), var3, var11, var32, var41, 100, 10);
    boolean var49 = var41.isDec();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.validateRoot(var41);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);

  }

  public void test341() {}
//   public void test341() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test341"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     com.google.javascript.jscomp.SourceMap var12 = var1.getSourceMap();
//     var1.optimize();
// 
//   }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test342"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("hi!");
    int var3 = var2.getChildCount();
    java.lang.String var4 = var2.getSourceFileName();
    com.google.javascript.jscomp.CodingConvention.Bind var6 = var0.describeFunctionBind(var2, true);
    java.lang.String var7 = var0.getAbstractMethodName();
    com.google.javascript.rhino.JSDocInfo var8 = new com.google.javascript.rhino.JSDocInfo();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var10 = var9.cloneTree();
    var8.setAssociatedNode(var10);
    var10.setWasEmptyNode(false);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.labelName("hi!");
    int var16 = var15.getChildCount();
    java.lang.String var17 = var15.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var18 = var15.getStaticSourceFile();
    boolean var19 = var15.isIn();
    java.lang.String var20 = var0.extractClassNameIfProvide(var10, var15);
    boolean var23 = var0.isExported("null(null)", true);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.Node.newString("module$", 100, 100);
    com.google.javascript.rhino.jstype.StaticSourceFile var28 = var27.getStaticSourceFile();
    boolean var29 = var27.isIn();
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.labelName("hi!");
    int var33 = var31.getIntProp(1);
    int var34 = var27.getIndexOfChild(var31);
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var35 = var0.getDelegateRelationship(var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.JSDocInfo var36 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(var31);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "goog.abstractMethod"+ "'", var7.equals("goog.abstractMethod"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test343"); }


    java.lang.String var1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("module$JSDocInfo");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "(module$JSDocInfo)"+ "'", var1.equals("(module$JSDocInfo)"));

  }

  public void test344() {}
//   public void test344() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test344"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     com.google.javascript.rhino.jstype.JSType var2 = null;
//     com.google.javascript.rhino.JSDocInfo var3 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var5 = var3.hasParameter("");
//     java.util.List var6 = var3.getImplementedInterfaces();
//     java.lang.String var7 = var3.getOriginalCommentString();
//     java.lang.String var8 = var3.toString();
//     java.util.Collection var9 = var3.getAuthors();
//     java.lang.String var10 = var3.getVersion();
//     java.util.List var11 = var3.getImplementedInterfaces();
//     com.google.javascript.jscomp.JSModule[] var12 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var11);
//     com.google.javascript.rhino.jstype.FunctionType var13 = var1.createFunctionType(var2, var11);
//     com.google.javascript.rhino.jstype.JSTypeNative var14 = null;
//     com.google.javascript.rhino.jstype.FunctionType var15 = var1.getNativeFunctionType(var14);
// 
//   }

  public void test345() {}
//   public void test345() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test345"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     var1.optimize();
// 
//   }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test346"); }


    com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
    java.lang.String var4 = var3.getOriginalPath();
    java.lang.String var6 = var3.getLine(100);
    int var8 = var3.getLineOfOffset(153);
    java.lang.String var9 = var3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "module$"+ "'", var4.equals("module$"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "module$"+ "'", var9.equals("module$"));

  }

  public void test347() {}
//   public void test347() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test347"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
//     int var5 = var3.getLineOfOffset(100);
//     com.google.javascript.jscomp.CompilerInput var7 = new com.google.javascript.jscomp.CompilerInput(var3, true);
//     com.google.javascript.rhino.InputId var9 = new com.google.javascript.rhino.InputId("hi!");
//     java.lang.String var10 = var9.toString();
//     com.google.javascript.jscomp.CompilerInput var12 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var7, var9, false);
//     var12.removeRequire("LinkedGraph");
// 
//   }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test348"); }


    com.google.javascript.jscomp.CheckLevel var6 = null;
    com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
    com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
    java.lang.String[] var14 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var15 = com.google.javascript.jscomp.JSError.make(var12, var14);
    com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("JSDocInfo", 0, 0, var6, var9, var14);
    com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
    java.lang.String[] var21 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var22 = com.google.javascript.jscomp.JSError.make(var19, var21);
    com.google.javascript.jscomp.JSError var23 = com.google.javascript.jscomp.JSError.make(". hi! at (unknown source) line (unknown line) : (unknown column)", 10, (-1), var9, var21);
    int var24 = var23.getNodeLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);

  }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test349"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("hi!");
    int var3 = var2.getChildCount();
    java.lang.String var4 = var2.getSourceFileName();
    com.google.javascript.jscomp.CodingConvention.Bind var6 = var0.describeFunctionBind(var2, true);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.labelName("hi!");
    int var9 = var8.getChildCount();
    java.lang.String var10 = var8.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var11 = null;
    var8.setStaticSourceFile(var11);
    boolean var13 = var8.isAnd();
    boolean var14 = var8.isTry();
    com.google.javascript.jscomp.CodingConvention.Bind var16 = var0.describeFunctionBind(var8, false);
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.labelName("hi!");
    int var24 = var23.getChildCount();
    com.google.javascript.rhino.jstype.JSType var25 = var23.getJSType();
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.labelName("hi!");
    int var28 = var27.getChildCount();
    java.lang.String var29 = var27.getSourceFileName();
    com.google.javascript.rhino.Node var32 = new com.google.javascript.rhino.Node(153, var21, var23, var27, 0, 153);
    java.lang.Iterable var33 = var27.siblings();
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.labelName("hi!");
    int var41 = var40.getChildCount();
    com.google.javascript.rhino.jstype.JSType var42 = var40.getJSType();
    com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.IR.labelName("hi!");
    int var45 = var44.getChildCount();
    java.lang.String var46 = var44.getSourceFileName();
    com.google.javascript.rhino.Node var49 = new com.google.javascript.rhino.Node(153, var38, var40, var44, 0, 153);
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.labelName("hi!");
    int var52 = var51.getChildCount();
    java.lang.String var53 = var51.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var54 = null;
    var51.setStaticSourceFile(var54);
    boolean var56 = var51.isAnd();
    boolean var57 = var51.isEmpty();
    boolean var58 = var44.hasChild(var51);
    boolean var59 = var44.isLocalResultCall();
    java.lang.String var60 = var0.extractClassNameIfRequire(var27, var44);
    com.google.javascript.rhino.Node var65 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var67 = com.google.javascript.rhino.IR.labelName("hi!");
    int var68 = var67.getChildCount();
    com.google.javascript.rhino.jstype.JSType var69 = var67.getJSType();
    com.google.javascript.rhino.Node var71 = com.google.javascript.rhino.IR.labelName("hi!");
    int var72 = var71.getChildCount();
    java.lang.String var73 = var71.getSourceFileName();
    com.google.javascript.rhino.Node var76 = new com.google.javascript.rhino.Node(153, var65, var67, var71, 0, 153);
    var65.setSourceFileForTesting("");
    com.google.javascript.rhino.Node var84 = com.google.javascript.rhino.Node.newString(0, "", 1, 153);
    com.google.javascript.rhino.Node[] var85 = new com.google.javascript.rhino.Node[] { var84};
    com.google.javascript.rhino.Node var86 = new com.google.javascript.rhino.Node(0, var85);
    boolean var87 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(var86);
    com.google.javascript.rhino.Node var92 = new com.google.javascript.rhino.Node(0, 10, 1);
    com.google.javascript.rhino.Node var93 = new com.google.javascript.rhino.Node(10, var92);
    boolean var94 = var92.isFromExterns();
    boolean var95 = var92.isRegExp();
    com.google.javascript.rhino.Node var96 = var86.useSourceInfoIfMissingFrom(var92);
    com.google.javascript.rhino.Node var97 = var65.useSourceInfoIfMissingFrom(var92);
    com.google.javascript.jscomp.CodingConvention.Bind var98 = var0.describeFunctionBind(var65);
    java.util.Collection var99 = var0.getAssertionFunctions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var99);

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test350"); }


    com.google.javascript.jscomp.JSModule var3 = new com.google.javascript.jscomp.JSModule("LABEL_NAME hi!");
    java.util.List var4 = var3.getDependencies();
    com.google.javascript.rhino.JSDocInfo var5 = new com.google.javascript.rhino.JSDocInfo();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var7 = var6.cloneTree();
    var5.setAssociatedNode(var7);
    java.util.List var9 = var5.getThrownTypes();
    java.util.List var10 = var5.getThrownTypes();
    com.google.javascript.jscomp.deps.SimpleDependencyInfo var11 = new com.google.javascript.jscomp.deps.SimpleDependencyInfo("(LABEL_NAME hi!)", "STRING module$ 100", var4, var10);
    java.lang.String var12 = var11.getPathRelativeToClosureBase();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "(LABEL_NAME hi!)"+ "'", var12.equals("(LABEL_NAME hi!)"));

  }

  public void test351() {}
//   public void test351() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test351"); }
// 
// 
//     com.google.javascript.jscomp.AstValidator.ViolationHandler var0 = null;
//     com.google.javascript.jscomp.AstValidator var1 = new com.google.javascript.jscomp.AstValidator(var0);
//     com.google.javascript.rhino.Node var2 = null;
//     var1.validateExpression(var2);
// 
//   }

  public void test352() {}
//   public void test352() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test352"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     var0.setCollapseProperties(false);
//     var0.enableExternExports(false);
//     var0.setAliasExternals(false);
//     boolean var7 = var0.isExternExportsEnabled();
//     com.google.javascript.jscomp.CompilerOptions.Reach var8 = null;
//     var0.setRemoveUnusedVariables(var8);
// 
//   }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test353"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    boolean var1 = var0.isDirected();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.labelName("hi!");
    int var4 = var3.getChildCount();
    java.lang.String var5 = var3.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var6 = null;
    var3.setStaticSourceFile(var6);
    com.google.javascript.rhino.JSTypeExpression var9 = new com.google.javascript.rhino.JSTypeExpression(var3, "hi!");
    boolean var10 = var3.isSyntheticBlock();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.labelName("hi!");
    int var13 = var12.getChildCount();
    java.lang.String var14 = var12.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var15 = null;
    var12.setStaticSourceFile(var15);
    boolean var17 = var12.isAnd();
    java.lang.Object var19 = null;
    var12.putProp(10, var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var21 = var0.getDirectedGraphEdges((java.lang.Object)var3, var19);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test354() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test354"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    boolean var1 = var0.isDirected();
    java.lang.String var2 = var0.getName();
    var0.pushEdgeAnnotations();
    com.google.javascript.rhino.JSDocInfo var4 = new com.google.javascript.rhino.JSDocInfo();
    boolean var6 = var4.hasParameter("");
    java.util.List var7 = var4.getImplementedInterfaces();
    java.lang.String var8 = var4.getOriginalCommentString();
    com.google.javascript.rhino.JSTypeExpression var9 = var4.getBaseType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var10 = var0.getOutEdges((java.lang.Object)var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "LinkedGraph"+ "'", var2.equals("LinkedGraph"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test355"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = com.google.javascript.rhino.ScriptRuntime.getMessage0("null(null)");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test356() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test356"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("LABEL_NAME hi!\n");
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.labelName("hi!");
    int var10 = var9.getChildCount();
    com.google.javascript.rhino.jstype.JSType var11 = var9.getJSType();
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.labelName("hi!");
    int var14 = var13.getChildCount();
    java.lang.String var15 = var13.getSourceFileName();
    com.google.javascript.rhino.Node var18 = new com.google.javascript.rhino.Node(153, var7, var9, var13, 0, 153);
    com.google.javascript.rhino.JSDocInfo var19 = new com.google.javascript.rhino.JSDocInfo();
    boolean var21 = var19.hasParameter("");
    var19.setDeprecated(true);
    int var24 = var19.getParameterCount();
    boolean var25 = var19.isDefine();
    java.util.List var26 = var19.getImplementedInterfaces();
    java.util.List var27 = var19.getExtendedInterfaces();
    var13.setJSDocInfo(var19);
    java.lang.String var29 = var13.toStringTree();
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.block();
    com.google.javascript.rhino.jstype.JSType var31 = var30.getJSType();
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.defaultCase(var30);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.Node.newString("module$", 100, 100);
    com.google.javascript.rhino.jstype.StaticSourceFile var37 = var36.getStaticSourceFile();
    boolean var38 = var36.isIn();
    boolean var39 = var36.isLabel();
    java.lang.String var40 = var36.toString();
    com.google.javascript.rhino.Node var41 = var30.copyInformationFrom(var36);
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.labelName("hi!");
    int var44 = var43.getChildCount();
    java.lang.String var45 = var43.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var46 = null;
    var43.setStaticSourceFile(var46);
    com.google.javascript.rhino.JSTypeExpression var49 = new com.google.javascript.rhino.JSTypeExpression(var43, "hi!");
    boolean var50 = var43.isNull();
    boolean var51 = var43.isExprResult();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var54 = new com.google.javascript.rhino.Node(153, var2, var13, var41, var43, (-1), 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "LABEL_NAME hi! [jsdoc_info: JSDocInfo]\n"+ "'", var29.equals("LABEL_NAME hi! [jsdoc_info: JSDocInfo]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "STRING module$ 100"+ "'", var40.equals("STRING module$ 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);

  }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test357"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    boolean var2 = var0.hasParameter("");
    com.google.javascript.rhino.JSTypeExpression var3 = var0.getType();
    com.google.javascript.rhino.JSTypeExpression var4 = var0.getEnumParameterType();
    java.lang.String var5 = var0.getDeprecationReason();
    com.google.javascript.rhino.JSTypeExpression var6 = var0.getReturnType();
    com.google.javascript.rhino.JSTypeExpression var7 = var0.getEnumParameterType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test358"); }


    com.google.javascript.rhino.Node var0 = null;
    com.google.javascript.rhino.InputId var1 = com.google.javascript.jscomp.NodeUtil.getInputId(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test359() {}
//   public void test359() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test359"); }
// 
// 
//     com.google.javascript.jscomp.CodingConvention var0 = null;
//     com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention(var0);
//     boolean var3 = var1.isValidEnumKey("JSDocInfo");
//     boolean var5 = var1.isConstant("(LABEL_NAME hi!)");
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString(1, "JSDocInfo");
//     boolean var9 = var1.isVarArgsParameter(var8);
//     boolean var11 = var1.isExported("");
// 
//   }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test360"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    com.google.javascript.rhino.Node.AncestorIterable var2 = var1.getAncestors();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.JSDocInfo var3 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(var1);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test361() {}
//   public void test361() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test361"); }
// 
// 
//     com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("LABEL_NAME hi!");
//     var1.setDepth(153);
//     com.google.javascript.jscomp.SourceFile var7 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
//     com.google.javascript.jscomp.CompilerInput var8 = new com.google.javascript.jscomp.CompilerInput(var7);
//     com.google.javascript.rhino.InputId var9 = null;
//     com.google.javascript.jscomp.CompilerInput var11 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var8, var9, false);
//     var1.addFirst(var8);
//     java.util.List var13 = var1.getDependencies();
//     com.google.javascript.jscomp.SourceFile var17 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
//     com.google.javascript.jscomp.CompilerInput var18 = new com.google.javascript.jscomp.CompilerInput(var17);
//     com.google.javascript.rhino.InputId var19 = null;
//     com.google.javascript.jscomp.CompilerInput var21 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var18, var19, false);
//     var18.clearAst();
//     com.google.javascript.jscomp.CompilerInput var24 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var18, true);
//     var1.add(var18);
//     var18.removeRequire("goog.abstractMethod");
// 
//   }

  public void test362() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test362"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.JSTypeNative var1 = com.google.javascript.rhino.jstype.JSTypeNative.valueOf("Node tree inequality:\nTree1:\nLABEL_NAME hi!\n\n\nTree2:\nNAME . hi! at (unknown source) line (unknown line) : (unknown column)\n\n\nSubtree1: LABEL_NAME hi!\n\n\nSubtree2: NAME . hi! at (unknown source) line (unknown line) : (unknown column)\n");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test363() {}
//   public void test363() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test363"); }
// 
// 
//     com.google.javascript.jscomp.AstValidator.ViolationHandler var0 = null;
//     com.google.javascript.jscomp.AstValidator var1 = new com.google.javascript.jscomp.AstValidator(var0);
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var4 = var3.getChildCount();
//     java.lang.String var5 = var3.getSourceFileName();
//     com.google.javascript.rhino.jstype.StaticSourceFile var6 = null;
//     var3.setStaticSourceFile(var6);
//     boolean var8 = var3.isAnd();
//     boolean var9 = var3.isTry();
//     var1.validateRoot(var3);
// 
//   }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test364"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("hi!");
    int var3 = var2.getChildCount();
    java.lang.String var4 = var2.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var5 = null;
    var2.setStaticSourceFile(var5);
    com.google.javascript.rhino.JSTypeExpression var8 = new com.google.javascript.rhino.JSTypeExpression(var2, "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var9 = var0.getNodeDegree((java.lang.Object)var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test365"); }


    boolean var1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test366"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
    boolean var4 = var2.hasParameter("");
    java.util.List var5 = var2.getImplementedInterfaces();
    java.lang.String var6 = var2.getOriginalCommentString();
    java.lang.String var7 = var2.toString();
    java.lang.String var8 = var2.getLicense();
    java.util.List var9 = var2.getImplementedInterfaces();
    com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
    com.google.javascript.jscomp.deps.SortedDependencies var12 = new com.google.javascript.jscomp.deps.SortedDependencies(var9);
    com.google.javascript.rhino.JSDocInfo var13 = new com.google.javascript.rhino.JSDocInfo();
    boolean var15 = var13.hasParameter("");
    var13.setDeprecated(true);
    int var18 = var13.getParameterCount();
    boolean var19 = var13.isDefine();
    java.util.List var20 = var13.getImplementedInterfaces();
    java.util.List var22 = var12.getDependenciesOf(var20, true);
    java.util.List var23 = var12.getInputsWithoutProvides();
    com.google.javascript.jscomp.deps.DependencyInfo var25 = var12.maybeGetInputProviding("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.deps.DependencyInfo var27 = var12.getInputProviding("JSDocInfo: Unversioned directory");
      fail("Expected exception of type com.google.javascript.jscomp.deps.SortedDependencies.MissingProvideException");
    } catch (com.google.javascript.jscomp.deps.SortedDependencies.MissingProvideException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "JSDocInfo"+ "'", var7.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test367"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.JSTypeNative var1 = com.google.javascript.rhino.jstype.JSTypeNative.valueOf(". hi! at (unknown source) line (unknown line) : (unknown column)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test368() {}
//   public void test368() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test368"); }
// 
// 
//     com.google.javascript.rhino.jstype.JSTypeRegistry var0 = null;
//     com.google.javascript.rhino.jstype.FunctionBuilder var1 = new com.google.javascript.rhino.jstype.FunctionBuilder(var0);
//     com.google.javascript.rhino.jstype.FunctionBuilder var3 = var1.setIsConstructor(false);
//     com.google.javascript.rhino.jstype.FunctionType var4 = var3.build();
// 
//   }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test369"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.util.List var1 = var0.getEdges();
    com.google.javascript.jscomp.ClosureCodingConvention var2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.labelName("hi!");
    int var5 = var4.getChildCount();
    java.lang.String var6 = var4.getSourceFileName();
    com.google.javascript.jscomp.CodingConvention.Bind var8 = var2.describeFunctionBind(var4, true);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.labelName("hi!");
    int var11 = var10.getChildCount();
    java.lang.String var12 = var10.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var13 = null;
    var10.setStaticSourceFile(var13);
    boolean var15 = var10.isAnd();
    boolean var16 = var10.isTry();
    com.google.javascript.jscomp.CodingConvention.Bind var18 = var2.describeFunctionBind(var10, false);
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.labelName("hi!");
    int var26 = var25.getChildCount();
    com.google.javascript.rhino.jstype.JSType var27 = var25.getJSType();
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.labelName("hi!");
    int var30 = var29.getChildCount();
    java.lang.String var31 = var29.getSourceFileName();
    com.google.javascript.rhino.Node var34 = new com.google.javascript.rhino.Node(153, var23, var25, var29, 0, 153);
    java.lang.Iterable var35 = var29.siblings();
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.IR.labelName("hi!");
    int var43 = var42.getChildCount();
    com.google.javascript.rhino.jstype.JSType var44 = var42.getJSType();
    com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.IR.labelName("hi!");
    int var47 = var46.getChildCount();
    java.lang.String var48 = var46.getSourceFileName();
    com.google.javascript.rhino.Node var51 = new com.google.javascript.rhino.Node(153, var40, var42, var46, 0, 153);
    com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.IR.labelName("hi!");
    int var54 = var53.getChildCount();
    java.lang.String var55 = var53.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var56 = null;
    var53.setStaticSourceFile(var56);
    boolean var58 = var53.isAnd();
    boolean var59 = var53.isEmpty();
    boolean var60 = var46.hasChild(var53);
    boolean var61 = var46.isLocalResultCall();
    java.lang.String var62 = var2.extractClassNameIfRequire(var29, var46);
    java.lang.String var63 = var2.getExportPropertyFunction();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var64 = var0.createDirectedGraphNode((java.lang.Object)var2);
    java.lang.String var65 = var2.getExportSymbolFunction();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "goog.exportProperty"+ "'", var63.equals("goog.exportProperty"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "goog.exportSymbol"+ "'", var65.equals("goog.exportSymbol"));

  }

  public void test370() {}
//   public void test370() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test370"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     java.lang.String var12 = var1.getAstDotGraph();
//     com.google.javascript.jscomp.CompilerOptions var13 = new com.google.javascript.jscomp.CompilerOptions();
//     var13.setCollapseProperties(false);
//     var13.enableExternExports(false);
//     var13.setAliasExternals(false);
//     com.google.javascript.jscomp.CodingConvention var20 = var13.getCodingConvention();
//     var13.setOutputJsStringUsage(true);
//     var13.setRemoveUnusedVars(true);
//     var13.setAcceptConstKeyword(false);
//     com.google.javascript.jscomp.DefaultPassConfig var27 = new com.google.javascript.jscomp.DefaultPassConfig(var13);
//     var1.setPassConfig((com.google.javascript.jscomp.PassConfig)var27);
//     com.google.javascript.rhino.jstype.JSTypeRegistry var29 = var1.getTypeRegistry();
// 
//   }

  public void test371() {}
//   public void test371() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test371"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode var2 = null;
//     var1.setResolveMode(var2);
//     var1.clearNamedTypes();
//     com.google.javascript.rhino.jstype.JSTypeNative var5 = null;
//     com.google.javascript.rhino.jstype.FunctionType var6 = var1.getNativeFunctionType(var5);
// 
//   }

  public void test372() {}
//   public void test372() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test372"); }
// 
// 
//     com.google.javascript.jscomp.AstValidator.ViolationHandler var0 = null;
//     com.google.javascript.jscomp.AstValidator var1 = new com.google.javascript.jscomp.AstValidator(var0);
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var9 = var8.getChildCount();
//     com.google.javascript.rhino.jstype.JSType var10 = var8.getJSType();
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var13 = var12.getChildCount();
//     java.lang.String var14 = var12.getSourceFileName();
//     com.google.javascript.rhino.Node var17 = new com.google.javascript.rhino.Node(153, var6, var8, var12, 0, 153);
//     boolean var18 = var6.isObjectLit();
//     boolean var19 = var6.isRegExp();
//     var6.setWasEmptyNode(false);
//     var1.validateRoot(var6);
// 
//   }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test373"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    java.lang.String var3 = var1.getSourceFileName();
    java.lang.String var4 = var1.toStringTree();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.labelName("hi!");
    int var7 = var6.getChildCount();
    java.lang.String var8 = var6.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var9 = var6.getStaticSourceFile();
    var6.setLineno(10);
    com.google.javascript.rhino.Node[] var12 = new com.google.javascript.rhino.Node[] { var6};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.switchNode(var1, var12);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "LABEL_NAME hi!\n"+ "'", var4.equals("LABEL_NAME hi!\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test374"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setCollapseProperties(false);
    com.google.javascript.jscomp.StrictWarningsGuard var3 = new com.google.javascript.jscomp.StrictWarningsGuard();
    var0.addWarningsGuard((com.google.javascript.jscomp.WarningsGuard)var3);
    var0.setInferTypes(true);
    var0.setRemoveUnusedPrototypeProperties(false);
    var0.setCheckMissingGetCssNameBlacklist(": hi!");
    var0.setSourceMapOutputPath("");
    var0.setInputDelimiter("goog.abstractMethod");
    var0.setOptimizeParameters(true);

  }

  public void test375() {}
//   public void test375() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test375"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     var0.setCollapseProperties(false);
//     com.google.javascript.jscomp.StrictWarningsGuard var3 = new com.google.javascript.jscomp.StrictWarningsGuard();
//     var0.addWarningsGuard((com.google.javascript.jscomp.WarningsGuard)var3);
//     com.google.javascript.jscomp.CheckLevel var5 = null;
//     var0.setCheckGlobalThisLevel(var5);
//     var0.setAliasExternals(true);
//     java.util.Map var9 = null;
//     var0.setDefineReplacements(var9);
//     var0.setRemoveTryCatchFinally(true);
//     var0.setOutputCharset("null(null)");
//     com.google.javascript.jscomp.CompilerOptions var18 = new com.google.javascript.jscomp.CompilerOptions();
//     var18.setCollapseProperties(false);
//     com.google.javascript.jscomp.StrictWarningsGuard var21 = new com.google.javascript.jscomp.StrictWarningsGuard();
//     var18.addWarningsGuard((com.google.javascript.jscomp.WarningsGuard)var21);
//     com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
//     var27.putBooleanProp(0, false);
//     com.google.javascript.jscomp.CheckLevel var31 = null;
//     com.google.javascript.jscomp.DiagnosticType var34 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
//     java.lang.String[] var36 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var37 = com.google.javascript.jscomp.JSError.make(var34, var36);
//     com.google.javascript.jscomp.DiagnosticType var40 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
//     java.lang.String[] var42 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var43 = com.google.javascript.jscomp.JSError.make(var40, var42);
//     com.google.javascript.jscomp.JSError var44 = com.google.javascript.jscomp.JSError.make("LABEL_NAME hi!\n", var27, var31, var34, var42);
//     com.google.javascript.jscomp.CheckLevel var45 = var21.level(var44);
//     com.google.javascript.jscomp.DiagnosticType var48 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
//     java.lang.String[] var50 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var51 = com.google.javascript.jscomp.JSError.make(var48, var50);
//     com.google.javascript.jscomp.DiagnosticType var54 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
//     java.lang.String[] var56 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var57 = com.google.javascript.jscomp.JSError.make(var54, var56);
//     com.google.javascript.jscomp.JSError var58 = com.google.javascript.jscomp.JSError.make("LABEL_NAME hi!", 1, 153, var45, var48, var56);
//     var0.setCheckProvides(var45);
//     com.google.javascript.jscomp.CompilerOptions.Reach var60 = null;
//     var0.setInlineFunctions(var60);
// 
//   }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test376"); }


    java.lang.String var1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix(": hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "(: hi!)"+ "'", var1.equals("(: hi!)"));

  }

  public void test377() {}
//   public void test377() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test377"); }
// 
// 
//     java.util.List var0 = null;
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.script(var0);
// 
//   }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test378"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.breakNode();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.labelName("hi!");
    int var8 = var7.getChildCount();
    com.google.javascript.rhino.jstype.JSType var9 = var7.getJSType();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.labelName("hi!");
    int var12 = var11.getChildCount();
    java.lang.String var13 = var11.getSourceFileName();
    com.google.javascript.rhino.Node var16 = new com.google.javascript.rhino.Node(153, var5, var7, var11, 0, 153);
    boolean var17 = var5.isObjectLit();
    boolean var18 = var5.isRegExp();
    var5.setWasEmptyNode(false);
    boolean var21 = var5.isQuotedString();
    com.google.javascript.rhino.Node var22 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.function(var0, var5, var22);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test379() {}
//   public void test379() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test379"); }
// 
// 
//     com.google.javascript.jscomp.AstValidator.ViolationHandler var0 = null;
//     com.google.javascript.jscomp.AstValidator var1 = new com.google.javascript.jscomp.AstValidator(var0);
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.continueNode();
//     boolean var3 = var2.isTry();
//     com.google.javascript.rhino.jstype.StaticSourceFile var4 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var2);
//     var1.validateRoot(var2);
// 
//   }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test380"); }


    com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
    com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var3);
    com.google.javascript.rhino.InputId var5 = null;
    com.google.javascript.jscomp.CompilerInput var7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var4, var5, false);
    var4.clearAst();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var9 = var4.getPathRelativeToClosureBase();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test381"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.ErrorReporter var2 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    com.google.javascript.rhino.JSDocInfo var5 = new com.google.javascript.rhino.JSDocInfo();
    boolean var7 = var5.hasParameter("");
    java.util.List var8 = var5.getImplementedInterfaces();
    java.lang.String var9 = var5.getOriginalCommentString();
    java.lang.String var10 = var5.toString();
    java.util.Collection var11 = var5.getAuthors();
    java.lang.String var12 = var5.getVersion();
    java.util.List var13 = var5.getImplementedInterfaces();
    com.google.javascript.jscomp.JSModule[] var14 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var13);
    com.google.javascript.rhino.jstype.FunctionType var15 = var3.createFunctionType(var4, var13);
    boolean var16 = var15.isUnknownType();
    com.google.javascript.rhino.jstype.FunctionType var17 = var15.toMaybeFunctionType();
    com.google.javascript.rhino.ErrorReporter var18 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18);
    com.google.javascript.rhino.jstype.JSType var20 = null;
    com.google.javascript.rhino.JSDocInfo var21 = new com.google.javascript.rhino.JSDocInfo();
    boolean var23 = var21.hasParameter("");
    java.util.List var24 = var21.getImplementedInterfaces();
    java.lang.String var25 = var21.getOriginalCommentString();
    java.lang.String var26 = var21.toString();
    java.util.Collection var27 = var21.getAuthors();
    java.lang.String var28 = var21.getVersion();
    java.util.List var29 = var21.getImplementedInterfaces();
    com.google.javascript.jscomp.JSModule[] var30 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var29);
    com.google.javascript.rhino.jstype.FunctionType var31 = var19.createFunctionType(var20, var29);
    boolean var32 = var31.isUnknownType();
    boolean var33 = var31.isUnknownType();
    com.google.javascript.rhino.jstype.FunctionType var34 = var1.createFunctionTypeWithNewReturnType(var15, (com.google.javascript.rhino.jstype.JSType)var31);
    com.google.javascript.rhino.ErrorReporter var36 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var36);
    com.google.javascript.rhino.jstype.JSType var38 = null;
    com.google.javascript.rhino.JSDocInfo var39 = new com.google.javascript.rhino.JSDocInfo();
    boolean var41 = var39.hasParameter("");
    java.util.List var42 = var39.getImplementedInterfaces();
    java.lang.String var43 = var39.getOriginalCommentString();
    java.lang.String var44 = var39.toString();
    java.util.Collection var45 = var39.getAuthors();
    java.lang.String var46 = var39.getVersion();
    java.util.List var47 = var39.getImplementedInterfaces();
    com.google.javascript.jscomp.JSModule[] var48 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var47);
    com.google.javascript.rhino.jstype.FunctionType var49 = var37.createFunctionType(var38, var47);
    boolean var50 = var49.isConstructor();
    java.lang.Iterable var51 = var49.getAllExtendedInterfaces();
    com.google.javascript.rhino.Node var56 = new com.google.javascript.rhino.Node(0, 10, 1);
    com.google.javascript.rhino.Node var57 = new com.google.javascript.rhino.Node(10, var56);
    boolean var58 = var31.defineDeclaredProperty("LinkedGraph", (com.google.javascript.rhino.jstype.JSType)var49, var56);
    com.google.javascript.jscomp.JSModule var62 = new com.google.javascript.jscomp.JSModule("LABEL_NAME hi!");
    java.util.List var63 = var62.getDependencies();
    com.google.javascript.rhino.JSDocInfo var64 = new com.google.javascript.rhino.JSDocInfo();
    com.google.javascript.rhino.Node var65 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var66 = var65.cloneTree();
    var64.setAssociatedNode(var66);
    java.util.List var68 = var64.getThrownTypes();
    java.util.List var69 = var64.getThrownTypes();
    com.google.javascript.jscomp.deps.SimpleDependencyInfo var70 = new com.google.javascript.jscomp.deps.SimpleDependencyInfo("(LABEL_NAME hi!)", "STRING module$ 100", var63, var69);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var49.setExtendedInterfaces(var69);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "JSDocInfo"+ "'", var10.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "JSDocInfo"+ "'", var26.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "JSDocInfo"+ "'", var44.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test382() {}
//   public void test382() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test382"); }
// 
// 
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
//     com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.voidNode(var3);
//     boolean var5 = var4.isLabelName();
//     com.google.javascript.rhino.Node var6 = null;
//     com.google.javascript.rhino.Node var7 = var4.useSourceInfoIfMissingFrom(var6);
// 
//   }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test383"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var3 = var2.cloneTree();
    com.google.javascript.rhino.Node[] var4 = new com.google.javascript.rhino.Node[] { var2};
    com.google.javascript.rhino.Node var5 = new com.google.javascript.rhino.Node(100, var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var8 = new com.google.javascript.rhino.Node(100, var4, 1, 153);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test384"); }


    com.google.javascript.jscomp.CompilerOptions var1 = new com.google.javascript.jscomp.CompilerOptions();
    var1.setCollapseProperties(false);
    var1.enableExternExports(false);
    java.util.Set var6 = null;
    var1.setStripNamePrefixes(var6);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var8 = var1.getTweakProcessing();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var9 = com.google.javascript.rhino.ScriptRuntime.getMessage1("LABEL_NAME hi!", (java.lang.Object)var1);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test385() {}
//   public void test385() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test385"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     com.google.javascript.rhino.jstype.JSType var2 = null;
//     com.google.javascript.rhino.JSDocInfo var3 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var5 = var3.hasParameter("");
//     java.util.List var6 = var3.getImplementedInterfaces();
//     java.lang.String var7 = var3.getOriginalCommentString();
//     java.lang.String var8 = var3.toString();
//     java.util.Collection var9 = var3.getAuthors();
//     java.lang.String var10 = var3.getVersion();
//     java.util.List var11 = var3.getImplementedInterfaces();
//     com.google.javascript.jscomp.JSModule[] var12 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var11);
//     com.google.javascript.rhino.jstype.FunctionType var13 = var1.createFunctionType(var2, var11);
//     boolean var14 = var13.isUnknownType();
//     boolean var15 = var13.isUnknownType();
//     com.google.javascript.rhino.ErrorReporter var16 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var16);
//     com.google.javascript.rhino.jstype.JSType var18 = null;
//     com.google.javascript.rhino.JSDocInfo var19 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var21 = var19.hasParameter("");
//     java.util.List var22 = var19.getImplementedInterfaces();
//     java.lang.String var23 = var19.getOriginalCommentString();
//     java.lang.String var24 = var19.toString();
//     java.util.Collection var25 = var19.getAuthors();
//     java.lang.String var26 = var19.getVersion();
//     java.util.List var27 = var19.getImplementedInterfaces();
//     com.google.javascript.jscomp.JSModule[] var28 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var27);
//     com.google.javascript.rhino.jstype.FunctionType var29 = var17.createFunctionType(var18, var27);
//     boolean var30 = var29.isConstructor();
//     java.lang.Iterable var31 = var29.getAllExtendedInterfaces();
//     boolean var32 = var13.canAssignTo((com.google.javascript.rhino.jstype.JSType)var29);
//     com.google.common.base.Predicate var33 = null;
//     boolean var34 = var29.setValidator(var33);
// 
//   }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test386"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var1 = var0.cloneTree();
    boolean var2 = var0.hasChildren();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.var(var0);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test387"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("hi!");
    int var3 = var2.getChildCount();
    java.lang.String var4 = var2.getSourceFileName();
    com.google.javascript.jscomp.CodingConvention.Bind var6 = var0.describeFunctionBind(var2, true);
    java.lang.String var7 = var0.getAbstractMethodName();
    com.google.javascript.rhino.JSDocInfo var8 = new com.google.javascript.rhino.JSDocInfo();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var10 = var9.cloneTree();
    var8.setAssociatedNode(var10);
    var10.setWasEmptyNode(false);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.labelName("hi!");
    int var16 = var15.getChildCount();
    java.lang.String var17 = var15.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var18 = var15.getStaticSourceFile();
    boolean var19 = var15.isIn();
    java.lang.String var20 = var0.extractClassNameIfProvide(var10, var15);
    java.lang.String var21 = var0.getAbstractMethodName();
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.block();
    com.google.javascript.rhino.jstype.JSType var24 = var23.getJSType();
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.defaultCase(var23);
    boolean var26 = var25.isCase();
    com.google.javascript.rhino.Node var29 = new com.google.javascript.rhino.Node(0, var25, 0, 100);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.continueNode();
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var32 = var30.useSourceInfoFromForTree(var31);
    boolean var33 = var31.isFunction();
    java.lang.Iterable var34 = var31.children();
    java.lang.String var35 = var0.extractClassNameIfRequire(var25, var31);
    int var37 = var31.getIntProp(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "goog.abstractMethod"+ "'", var7.equals("goog.abstractMethod"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "goog.abstractMethod"+ "'", var21.equals("goog.abstractMethod"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);

  }

  public void test388() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test388"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setCollapseProperties(false);
    var0.enableExternExports(false);
    var0.setLineBreak(true);
    com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler var7 = null;
    var0.setAliasTransformationHandler(var7);
    var0.setMarkAsCompiled(false);
    var0.setLabelRenaming(true);
    var0.setAliasExternals(false);

  }

  public void test389() {}
//   public void test389() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test389"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     var0.setCollapseProperties(false);
//     var0.enableExternExports(false);
//     var0.setLineBreak(true);
//     com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler var7 = null;
//     var0.setAliasTransformationHandler(var7);
//     var0.setAssumeClosuresOnlyCaptureReferences(true);
//     var0.setInlineLocalFunctions(true);
//     var0.setOptimizeArgumentsArray(false);
//     var0.setCheckControlStructures(true);
//     com.google.javascript.jscomp.CompilerOptions.Reach var17 = null;
//     var0.setInlineVariables(var17);
// 
//   }

  public void test390() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test390"); }


    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.Node.newString(0, "", 1, 153);
    com.google.javascript.rhino.Node[] var6 = new com.google.javascript.rhino.Node[] { var5};
    com.google.javascript.rhino.Node var7 = new com.google.javascript.rhino.Node(0, var6);
    boolean var8 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(var7);
    var7.setSourceEncodedPositionForTree(1);
    boolean var11 = var7.isArrayLit();
    boolean var12 = var7.isContinue();
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var15 = var14.cloneTree();
    com.google.javascript.rhino.Node[] var16 = new com.google.javascript.rhino.Node[] { var14};
    com.google.javascript.rhino.Node var17 = new com.google.javascript.rhino.Node(100, var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.newNode(var7, var16);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test391() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test391"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    java.util.Set var1 = null;
    var0.setStripTypePrefixes(var1);
    var0.setDeadAssignmentElimination(false);
    com.google.javascript.jscomp.CompilerOptions.LanguageMode var5 = var0.getLanguageOut();
    var0.setOptimizeReturns(true);
    var0.setCommonJSModulePathPrefix(": hi!");
    com.google.javascript.jscomp.CodingConvention var10 = null;
    var0.setCodingConvention(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test392() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test392"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.paramList();
    boolean var2 = var1.hasOneChild();
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.labelName("hi!");
    int var5 = var4.getChildCount();
    java.lang.String var6 = var4.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var7 = null;
    var4.setStaticSourceFile(var7);
    boolean var9 = var4.isAnd();
    java.lang.Object var11 = null;
    var4.putProp(10, var11);
    com.google.javascript.rhino.Node var13 = var1.useSourceInfoFromForTree(var4);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newString(1, "JSDocInfo");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.disconnect((java.lang.Object)var4, (java.lang.Object)1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test393() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test393"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode var2 = null;
    var1.setResolveMode(var2);
    var1.clearNamedTypes();
    com.google.javascript.rhino.JSDocInfo var5 = new com.google.javascript.rhino.JSDocInfo();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var7 = var6.cloneTree();
    var5.setAssociatedNode(var7);
    com.google.javascript.rhino.jstype.StaticScope var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.JSType var11 = var1.createFromTypeNodes(var7, "LinkedGraph", var10);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test394"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.paramList();
    boolean var1 = var0.hasOneChild();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.labelName("hi!");
    int var4 = var3.getChildCount();
    java.lang.String var5 = var3.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var6 = null;
    var3.setStaticSourceFile(var6);
    boolean var8 = var3.isAnd();
    java.lang.Object var10 = null;
    var3.putProp(10, var10);
    com.google.javascript.rhino.Node var12 = var0.useSourceInfoFromForTree(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.breakNode(var12);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test395() {}
//   public void test395() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test395"); }
// 
// 
//     com.google.javascript.jscomp.AstValidator.ViolationHandler var0 = null;
//     com.google.javascript.jscomp.AstValidator var1 = new com.google.javascript.jscomp.AstValidator(var0);
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.labelName(": hi!");
//     var1.validateCodeRoot(var3);
// 
//   }

  public void test396() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test396"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.util.List var1 = var0.getEdges();
    com.google.javascript.jscomp.CompilerOptions var2 = new com.google.javascript.jscomp.CompilerOptions();
    java.util.Set var3 = null;
    var2.setStripTypePrefixes(var3);
    var2.setDeadAssignmentElimination(false);
    var2.setInlineConstantVars(true);
    var2.setPreferLineBreakAtEndOfFile(false);
    com.google.javascript.jscomp.CompilerOptions var11 = new com.google.javascript.jscomp.CompilerOptions();
    java.util.Set var12 = null;
    var11.setStripTypePrefixes(var12);
    var11.setDeadAssignmentElimination(false);
    com.google.javascript.jscomp.CompilerOptions.LanguageMode var16 = var11.getLanguageOut();
    var11.setRemoveTryCatchFinally(false);
    var11.setRemoveUnusedPrototypeProperties(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var21 = var0.isConnectedInDirection((java.lang.Object)false, (java.lang.Object)var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test397"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var2 = var1.isQuotedString();
    boolean var3 = var1.isIf();
    com.google.javascript.rhino.Node.AncestorIterable var4 = var1.getAncestors();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test398"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var2 = var1.cloneTree();
    var0.setAssociatedNode(var2);
    var2.setWasEmptyNode(false);
    com.google.javascript.rhino.jstype.JSTypeRegistry var6 = null;
    com.google.javascript.rhino.jstype.FunctionParamBuilder var7 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var6);
    boolean var8 = var7.hasVarArgs();
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    var13.putBooleanProp(0, false);
    com.google.javascript.jscomp.CheckLevel var17 = null;
    com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
    java.lang.String[] var22 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var23 = com.google.javascript.jscomp.JSError.make(var20, var22);
    com.google.javascript.jscomp.DiagnosticType var26 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
    java.lang.String[] var28 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var29 = com.google.javascript.jscomp.JSError.make(var26, var28);
    com.google.javascript.jscomp.JSError var30 = com.google.javascript.jscomp.JSError.make("LABEL_NAME hi!\n", var13, var17, var20, var28);
    com.google.javascript.rhino.Node var31 = var13.getLastChild();
    com.google.javascript.rhino.Node var32 = var7.newParameterFromNode(var13);
    com.google.javascript.rhino.Node var33 = var2.useSourceInfoFromForTree(var32);
    com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.labelName("hi!");
    int var36 = var35.getChildCount();
    java.lang.String var37 = var35.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var38 = null;
    var35.setStaticSourceFile(var38);
    boolean var40 = var35.isAnd();
    boolean var41 = var35.isTry();
    boolean var42 = var35.isDec();
    com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.IR.labelName("hi!");
    int var45 = var44.getChildCount();
    java.lang.String var46 = var44.getSourceFileName();
    boolean var47 = var44.isCatch();
    boolean var48 = var44.isDebugger();
    com.google.javascript.rhino.Node var49 = var35.useSourceInfoFromForTree(var44);
    com.google.javascript.rhino.Node var50 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.hook(var33, var35, var50);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test399"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.rhino.JSDocInfo var3 = new com.google.javascript.rhino.JSDocInfo();
    boolean var5 = var3.hasParameter("");
    java.util.List var6 = var3.getImplementedInterfaces();
    java.lang.String var7 = var3.getOriginalCommentString();
    java.lang.String var8 = var3.toString();
    java.util.Collection var9 = var3.getAuthors();
    java.lang.String var10 = var3.getVersion();
    java.util.List var11 = var3.getImplementedInterfaces();
    com.google.javascript.jscomp.JSModule[] var12 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var11);
    com.google.javascript.rhino.jstype.FunctionType var13 = var1.createFunctionType(var2, var11);
    boolean var14 = var13.isUnknownType();
    com.google.javascript.rhino.ErrorReporter var15 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var15);
    com.google.javascript.rhino.jstype.JSType var17 = null;
    com.google.javascript.rhino.JSDocInfo var18 = new com.google.javascript.rhino.JSDocInfo();
    boolean var20 = var18.hasParameter("");
    java.util.List var21 = var18.getImplementedInterfaces();
    java.lang.String var22 = var18.getOriginalCommentString();
    java.lang.String var23 = var18.toString();
    java.util.Collection var24 = var18.getAuthors();
    java.lang.String var25 = var18.getVersion();
    java.util.List var26 = var18.getImplementedInterfaces();
    com.google.javascript.jscomp.JSModule[] var27 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var26);
    com.google.javascript.rhino.jstype.FunctionType var28 = var16.createFunctionType(var17, var26);
    boolean var29 = var28.isUnknownType();
    boolean var30 = var28.isUnknownType();
    com.google.javascript.rhino.jstype.JSType var32 = var28.findPropertyType("LABEL_NAME hi!\n");
    com.google.javascript.rhino.jstype.JSType var33 = var13.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType)var28);
    com.google.javascript.rhino.jstype.JSType var35 = null;
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.Node.newString("module$", 100, 100);
    com.google.javascript.rhino.jstype.StaticSourceFile var40 = var39.getStaticSourceFile();
    boolean var41 = var39.isIn();
    boolean var42 = var39.isLabel();
    java.lang.String var43 = var39.toString();
    com.google.javascript.rhino.JSDocInfo var44 = var39.getJSDocInfo();
    boolean var45 = var28.defineDeclaredProperty(". hi! at (unknown source) line (unknown line) : (unknown column)", var35, var39);
    java.util.Set var46 = var28.getPropertyNames();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.ObjectType var48 = var28.getTopMostDefiningType("goog.abstractMethod");
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "JSDocInfo"+ "'", var8.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "JSDocInfo"+ "'", var23.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "STRING module$ 100"+ "'", var43.equals("STRING module$ 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test400() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test400"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var2 = var1.cloneTree();
    var0.setAssociatedNode(var2);
    boolean var4 = var0.hasReturnType();
    java.lang.String var5 = var0.getMeaning();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test401"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.labelName("hi!");
    int var7 = var6.getChildCount();
    com.google.javascript.rhino.jstype.JSType var8 = var6.getJSType();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.labelName("hi!");
    int var11 = var10.getChildCount();
    java.lang.String var12 = var10.getSourceFileName();
    com.google.javascript.rhino.Node var15 = new com.google.javascript.rhino.Node(153, var4, var6, var10, 0, 153);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.labelName("hi!");
    int var18 = var17.getChildCount();
    java.lang.String var19 = var17.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var20 = null;
    var17.setStaticSourceFile(var20);
    boolean var22 = var17.isAnd();
    boolean var23 = var17.isEmpty();
    boolean var24 = var10.hasChild(var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var25 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test402"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.lang.String var1 = var0.getName();
    com.google.javascript.jscomp.CompilerOptions var2 = new com.google.javascript.jscomp.CompilerOptions();
    var2.setCollapseProperties(false);
    var2.enableExternExports(false);
    java.util.Set var7 = null;
    var2.setStripNamePrefixes(var7);
    com.google.javascript.rhino.JSDocInfo var9 = new com.google.javascript.rhino.JSDocInfo();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var11 = var10.cloneTree();
    var9.setAssociatedNode(var11);
    java.util.List var13 = var9.getThrownTypes();
    java.util.List var14 = var9.getThrownTypes();
    var2.setManageClosureDependencies(var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var16 = var0.getDirectedPredNodes((java.lang.Object)var14);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "LinkedGraph"+ "'", var1.equals("LinkedGraph"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test403() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test403"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.ErrorReporter var2 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    com.google.javascript.rhino.JSDocInfo var5 = new com.google.javascript.rhino.JSDocInfo();
    boolean var7 = var5.hasParameter("");
    java.util.List var8 = var5.getImplementedInterfaces();
    java.lang.String var9 = var5.getOriginalCommentString();
    java.lang.String var10 = var5.toString();
    java.util.Collection var11 = var5.getAuthors();
    java.lang.String var12 = var5.getVersion();
    java.util.List var13 = var5.getImplementedInterfaces();
    com.google.javascript.jscomp.JSModule[] var14 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var13);
    com.google.javascript.rhino.jstype.FunctionType var15 = var3.createFunctionType(var4, var13);
    boolean var16 = var15.isUnknownType();
    com.google.javascript.rhino.jstype.FunctionType var17 = var15.toMaybeFunctionType();
    com.google.javascript.rhino.ErrorReporter var18 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18);
    com.google.javascript.rhino.jstype.JSType var20 = null;
    com.google.javascript.rhino.JSDocInfo var21 = new com.google.javascript.rhino.JSDocInfo();
    boolean var23 = var21.hasParameter("");
    java.util.List var24 = var21.getImplementedInterfaces();
    java.lang.String var25 = var21.getOriginalCommentString();
    java.lang.String var26 = var21.toString();
    java.util.Collection var27 = var21.getAuthors();
    java.lang.String var28 = var21.getVersion();
    java.util.List var29 = var21.getImplementedInterfaces();
    com.google.javascript.jscomp.JSModule[] var30 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var29);
    com.google.javascript.rhino.jstype.FunctionType var31 = var19.createFunctionType(var20, var29);
    boolean var32 = var31.isUnknownType();
    boolean var33 = var31.isUnknownType();
    com.google.javascript.rhino.jstype.FunctionType var34 = var1.createFunctionTypeWithNewReturnType(var15, (com.google.javascript.rhino.jstype.JSType)var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.ObjectType var35 = var31.getInstanceType();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "JSDocInfo"+ "'", var10.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "JSDocInfo"+ "'", var26.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test404() {}
//   public void test404() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test404"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var3);
//     com.google.javascript.jscomp.JSModule var5 = null;
//     var4.setModule(var5);
//     java.io.PrintStream var7 = null;
//     com.google.javascript.jscomp.Compiler var8 = new com.google.javascript.jscomp.Compiler(var7);
//     com.google.javascript.rhino.JSDocInfo var9 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var11 = var9.hasParameter("");
//     java.util.List var12 = var9.getImplementedInterfaces();
//     java.lang.String var13 = var9.getOriginalCommentString();
//     java.lang.String var14 = var9.toString();
//     java.lang.String var15 = var9.getLicense();
//     java.util.List var16 = var9.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var17 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var8, var16, var17);
//     var4.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var8);
//     com.google.javascript.jscomp.SourceMap var20 = var8.getSourceMap();
//     com.google.javascript.jscomp.JSModule var22 = new com.google.javascript.jscomp.JSModule("LABEL_NAME hi!");
//     var22.setDepth(153);
//     com.google.javascript.jscomp.SourceFile var28 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
//     com.google.javascript.jscomp.CompilerInput var29 = new com.google.javascript.jscomp.CompilerInput(var28);
//     com.google.javascript.rhino.InputId var30 = null;
//     com.google.javascript.jscomp.CompilerInput var32 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var29, var30, false);
//     var22.addFirst(var29);
//     com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.IR.falseNode();
//     com.google.javascript.jscomp.SourceFile var38 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
//     com.google.javascript.jscomp.CompilerInput var39 = new com.google.javascript.jscomp.CompilerInput(var38);
//     var34.setStaticSourceFile((com.google.javascript.rhino.jstype.StaticSourceFile)var38);
//     var22.add(var38);
//     java.lang.String var42 = var38.getCode();
//     com.google.javascript.jscomp.JsAst var43 = new com.google.javascript.jscomp.JsAst(var38);
//     var43.clearAst();
//     com.google.javascript.jscomp.CompilerInput var45 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var43);
//     var8.replaceScript(var43);
// 
//   }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test405"); }


    com.google.javascript.jscomp.AstValidator var0 = new com.google.javascript.jscomp.AstValidator();
    com.google.javascript.jscomp.ClosureCodingConvention var1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.labelName("hi!");
    int var4 = var3.getChildCount();
    java.lang.String var5 = var3.getSourceFileName();
    com.google.javascript.jscomp.CodingConvention.Bind var7 = var1.describeFunctionBind(var3, true);
    boolean var9 = var1.isPrivate("module$JSDocInfo");
    boolean var11 = var1.isSuperClassReference("module$");
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.labelName("hi!");
    int var14 = var13.getChildCount();
    java.lang.String var15 = var13.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var16 = null;
    var13.setStaticSourceFile(var16);
    boolean var18 = var13.isAnd();
    boolean var19 = var13.isTry();
    boolean var20 = var13.isNumber();
    com.google.javascript.jscomp.CompilerOptions var21 = new com.google.javascript.jscomp.CompilerOptions();
    var21.setCollapseProperties(false);
    var21.enableExternExports(false);
    com.google.javascript.jscomp.CheckLevel var26 = null;
    var21.setReportMissingOverride(var26);
    var21.setSpecializeInitialModule(true);
    java.util.Map var30 = var21.getTweakReplacements();
    var1.checkForCallingConventionDefiningCalls(var13, var30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.validateScript(var13);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test406() {}
//   public void test406() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test406"); }
// 
// 
//     com.google.javascript.jscomp.CodingConvention var0 = null;
//     com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention(var0);
//     boolean var3 = var1.isValidEnumKey("JSDocInfo");
//     boolean var5 = var1.isConstant("(LABEL_NAME hi!)");
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var8 = var7.getChildCount();
//     java.lang.String var9 = var7.getSourceFileName();
//     com.google.javascript.rhino.jstype.StaticSourceFile var10 = null;
//     var7.setStaticSourceFile(var10);
//     boolean var12 = var7.isAnd();
//     boolean var13 = var7.isTry();
//     boolean var14 = var7.isDec();
//     com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var17 = var16.getChildCount();
//     java.lang.String var18 = var16.getSourceFileName();
//     boolean var19 = var16.isCatch();
//     boolean var20 = var16.isDebugger();
//     com.google.javascript.rhino.Node var21 = var7.useSourceInfoFromForTree(var16);
//     boolean var22 = var1.isOptionalParameter(var7);
//     boolean var24 = var1.isValidEnumKey("goog.exportProperty");
//     com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.falseNode();
//     boolean var26 = var25.isGetterDef();
//     com.google.javascript.jscomp.CompilerOptions var27 = new com.google.javascript.jscomp.CompilerOptions();
//     var27.setCollapseProperties(false);
//     var27.enableExternExports(false);
//     java.util.Set var32 = null;
//     var27.setStripNamePrefixes(var32);
//     com.google.javascript.jscomp.CompilerOptions.TweakProcessing var34 = var27.getTweakProcessing();
//     com.google.javascript.jscomp.CheckLevel var35 = null;
//     var27.setBrokenClosureRequiresLevel(var35);
//     var27.setRuntimeTypeCheckLogFunction("LABEL_NAME hi!");
//     java.util.Map var39 = var27.getDefineReplacements();
//     var1.checkForCallingConventionDefiningCalls(var25, var39);
// 
//   }

  public void test407() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test407"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    java.util.Set var1 = null;
    var0.setStripTypePrefixes(var1);
    var0.setDeadAssignmentElimination(false);
    var0.setLooseTypes(false);
    var0.setAliasExternals(true);
    var0.setInlineVariables(false);

  }

  public void test408() {}
//   public void test408() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test408"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
//     java.util.List var1 = var0.getEdges();
//     com.google.javascript.jscomp.ClosureCodingConvention var2 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var5 = var4.getChildCount();
//     java.lang.String var6 = var4.getSourceFileName();
//     com.google.javascript.jscomp.CodingConvention.Bind var8 = var2.describeFunctionBind(var4, true);
//     com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var11 = var10.getChildCount();
//     java.lang.String var12 = var10.getSourceFileName();
//     com.google.javascript.rhino.jstype.StaticSourceFile var13 = null;
//     var10.setStaticSourceFile(var13);
//     boolean var15 = var10.isAnd();
//     boolean var16 = var10.isTry();
//     com.google.javascript.jscomp.CodingConvention.Bind var18 = var2.describeFunctionBind(var10, false);
//     com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
//     com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var26 = var25.getChildCount();
//     com.google.javascript.rhino.jstype.JSType var27 = var25.getJSType();
//     com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var30 = var29.getChildCount();
//     java.lang.String var31 = var29.getSourceFileName();
//     com.google.javascript.rhino.Node var34 = new com.google.javascript.rhino.Node(153, var23, var25, var29, 0, 153);
//     java.lang.Iterable var35 = var29.siblings();
//     com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
//     com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var43 = var42.getChildCount();
//     com.google.javascript.rhino.jstype.JSType var44 = var42.getJSType();
//     com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var47 = var46.getChildCount();
//     java.lang.String var48 = var46.getSourceFileName();
//     com.google.javascript.rhino.Node var51 = new com.google.javascript.rhino.Node(153, var40, var42, var46, 0, 153);
//     com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var54 = var53.getChildCount();
//     java.lang.String var55 = var53.getSourceFileName();
//     com.google.javascript.rhino.jstype.StaticSourceFile var56 = null;
//     var53.setStaticSourceFile(var56);
//     boolean var58 = var53.isAnd();
//     boolean var59 = var53.isEmpty();
//     boolean var60 = var46.hasChild(var53);
//     boolean var61 = var46.isLocalResultCall();
//     java.lang.String var62 = var2.extractClassNameIfRequire(var29, var46);
//     java.lang.String var63 = var2.getExportPropertyFunction();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var64 = var0.createDirectedGraphNode((java.lang.Object)var2);
//     com.google.javascript.jscomp.ClosureCodingConvention var65 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     com.google.javascript.rhino.Node var67 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var68 = var67.getChildCount();
//     java.lang.String var69 = var67.getSourceFileName();
//     com.google.javascript.jscomp.CodingConvention.Bind var71 = var65.describeFunctionBind(var67, true);
//     java.lang.String var72 = var65.getAbstractMethodName();
//     com.google.javascript.rhino.JSDocInfo var73 = new com.google.javascript.rhino.JSDocInfo();
//     com.google.javascript.rhino.Node var74 = com.google.javascript.rhino.IR.falseNode();
//     com.google.javascript.rhino.Node var75 = var74.cloneTree();
//     var73.setAssociatedNode(var75);
//     var75.setWasEmptyNode(false);
//     com.google.javascript.rhino.Node var80 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var81 = var80.getChildCount();
//     java.lang.String var82 = var80.getSourceFileName();
//     com.google.javascript.rhino.jstype.StaticSourceFile var83 = var80.getStaticSourceFile();
//     boolean var84 = var80.isIn();
//     java.lang.String var85 = var65.extractClassNameIfProvide(var75, var80);
//     java.util.List var86 = var2.identifyTypeDeclarationCall(var80);
// 
//   }

  public void test409() {}
//   public void test409() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test409"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     java.lang.String var12 = var1.getAstDotGraph();
//     com.google.javascript.jscomp.JSSourceFile var13 = null;
//     com.google.javascript.jscomp.JSSourceFile[] var14 = new com.google.javascript.jscomp.JSSourceFile[] { var13};
//     com.google.javascript.rhino.JSDocInfo var15 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var17 = var15.hasParameter("");
//     var15.setDeprecated(true);
//     int var20 = var15.getParameterCount();
//     boolean var21 = var15.isDefine();
//     java.util.List var22 = var15.getImplementedInterfaces();
//     com.google.javascript.jscomp.JSModule[] var23 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var22);
//     com.google.javascript.jscomp.DiagnosticType var26 = com.google.javascript.jscomp.DiagnosticType.warning("hi!", "");
//     java.lang.String[] var27 = null;
//     com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make(var26, var27);
//     com.google.javascript.jscomp.CompilerOptions var29 = new com.google.javascript.jscomp.CompilerOptions();
//     var29.setCollapseProperties(false);
//     com.google.javascript.jscomp.StrictWarningsGuard var32 = new com.google.javascript.jscomp.StrictWarningsGuard();
//     var29.addWarningsGuard((com.google.javascript.jscomp.WarningsGuard)var32);
//     com.google.javascript.jscomp.CheckLevel var34 = null;
//     var29.setCheckGlobalThisLevel(var34);
//     var29.setAliasExternals(true);
//     boolean var38 = var26.equals((java.lang.Object)var29);
//     var1.init(var14, var23, var29);
// 
//   }

  public void test410() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test410"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
    boolean var4 = var2.hasParameter("");
    java.util.List var5 = var2.getImplementedInterfaces();
    java.lang.String var6 = var2.getOriginalCommentString();
    java.lang.String var7 = var2.toString();
    java.lang.String var8 = var2.getLicense();
    java.util.List var9 = var2.getImplementedInterfaces();
    com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
    java.lang.String var12 = var1.getAstDotGraph();
    com.google.javascript.jscomp.CompilerOptions var13 = new com.google.javascript.jscomp.CompilerOptions();
    var13.setCollapseProperties(false);
    var13.enableExternExports(false);
    var13.setAliasExternals(false);
    com.google.javascript.jscomp.CodingConvention var20 = var13.getCodingConvention();
    var13.setOutputJsStringUsage(true);
    var13.setRemoveUnusedVars(true);
    var13.setAcceptConstKeyword(false);
    com.google.javascript.jscomp.DefaultPassConfig var27 = new com.google.javascript.jscomp.DefaultPassConfig(var13);
    var1.setPassConfig((com.google.javascript.jscomp.PassConfig)var27);
    com.google.javascript.jscomp.CodingConvention var29 = null;
    com.google.javascript.jscomp.GoogleCodingConvention var30 = new com.google.javascript.jscomp.GoogleCodingConvention(var29);
    boolean var32 = var30.isValidEnumKey("JSDocInfo");
    boolean var34 = var30.isConstant("(LABEL_NAME hi!)");
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.Node.newString(1, "JSDocInfo");
    boolean var38 = var30.isVarArgsParameter(var37);
    com.google.javascript.jscomp.NodeTraversal.Callback var39 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.NodeTraversal.traverse((com.google.javascript.jscomp.AbstractCompiler)var1, var37, var39);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "JSDocInfo"+ "'", var7.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test411() {}
//   public void test411() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test411"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.SourceMap var2 = var1.getSourceMap();
//     com.google.javascript.jscomp.JSModule var4 = new com.google.javascript.jscomp.JSModule("LABEL_NAME hi!");
//     var4.setDepth(153);
//     com.google.javascript.jscomp.SourceFile var10 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
//     com.google.javascript.jscomp.CompilerInput var11 = new com.google.javascript.jscomp.CompilerInput(var10);
//     com.google.javascript.rhino.InputId var12 = null;
//     com.google.javascript.jscomp.CompilerInput var14 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var11, var12, false);
//     var11.clearAst();
//     com.google.javascript.jscomp.SourceFile var16 = var11.getSourceFile();
//     com.google.javascript.jscomp.JSModule var18 = new com.google.javascript.jscomp.JSModule("LABEL_NAME hi!");
//     var18.setDepth(153);
//     var11.setModule(var18);
//     var4.remove(var11);
//     java.lang.String[] var23 = var1.toSourceArray(var4);
// 
//   }

  public void test412() {}
//   public void test412() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test412"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var3 = var2.getChildCount();
//     java.lang.String var4 = var2.getSourceFileName();
//     com.google.javascript.jscomp.CodingConvention.Bind var6 = var0.describeFunctionBind(var2, true);
//     java.lang.String var7 = var0.getAbstractMethodName();
//     com.google.javascript.rhino.JSDocInfo var8 = new com.google.javascript.rhino.JSDocInfo();
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.falseNode();
//     com.google.javascript.rhino.Node var10 = var9.cloneTree();
//     var8.setAssociatedNode(var10);
//     var10.setWasEmptyNode(false);
//     com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var16 = var15.getChildCount();
//     java.lang.String var17 = var15.getSourceFileName();
//     com.google.javascript.rhino.jstype.StaticSourceFile var18 = var15.getStaticSourceFile();
//     boolean var19 = var15.isIn();
//     java.lang.String var20 = var0.extractClassNameIfProvide(var10, var15);
//     boolean var23 = var0.isExported("null(null)", true);
//     com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.Node.newString("module$", 100, 100);
//     com.google.javascript.rhino.jstype.StaticSourceFile var28 = var27.getStaticSourceFile();
//     boolean var29 = var27.isIn();
//     com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var33 = var31.getIntProp(1);
//     int var34 = var27.getIndexOfChild(var31);
//     com.google.javascript.jscomp.CodingConvention.DelegateRelationship var35 = var0.getDelegateRelationship(var31);
//     java.lang.String var36 = var0.getExportSymbolFunction();
//     com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
//     com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var44 = var43.getChildCount();
//     com.google.javascript.rhino.jstype.JSType var45 = var43.getJSType();
//     com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var48 = var47.getChildCount();
//     java.lang.String var49 = var47.getSourceFileName();
//     com.google.javascript.rhino.Node var52 = new com.google.javascript.rhino.Node(153, var41, var43, var47, 0, 153);
//     com.google.javascript.rhino.Node var54 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var55 = var54.getChildCount();
//     java.lang.String var56 = var54.getSourceFileName();
//     com.google.javascript.rhino.jstype.StaticSourceFile var57 = null;
//     var54.setStaticSourceFile(var57);
//     boolean var59 = var54.isAnd();
//     boolean var60 = var54.isEmpty();
//     boolean var61 = var47.hasChild(var54);
//     com.google.javascript.rhino.Node var62 = null;
//     java.lang.String var63 = var0.extractClassNameIfRequire(var47, var62);
// 
//   }

  public void test413() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test413"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.SourceFile var5 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
    com.google.javascript.jscomp.CompilerInput var6 = new com.google.javascript.jscomp.CompilerInput(var5);
    java.lang.String var7 = var5.getName();
    com.google.javascript.jscomp.SourceFile var11 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
    java.lang.String var12 = var11.getOriginalPath();
    java.lang.String var14 = var11.getLine(100);
    int var16 = var11.getLineOfOffset(153);
    com.google.javascript.jscomp.CompilerOptions var17 = new com.google.javascript.jscomp.CompilerOptions();
    var17.setCollapseProperties(false);
    var17.enableExternExports(false);
    java.util.Set var22 = null;
    var17.setStripNamePrefixes(var22);
    com.google.javascript.jscomp.Result var24 = var1.compile(var5, var11, var17);
    var17.setAcceptConstKeyword(true);
    var17.setRemoveUnusedVars(true);
    var17.enableRuntimeTypeCheck("InputId: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "module$"+ "'", var7.equals("module$"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "module$"+ "'", var12.equals("module$"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test414() {}
//   public void test414() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test414"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.regexp(var0);
// 
//   }

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test415"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    boolean var2 = var0.hasParameter("");
    java.util.List var3 = var0.getImplementedInterfaces();
    boolean var4 = var0.hasType();
    boolean var6 = var0.hasParameter("JSDocInfo: Unversioned directory");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test416() {}
//   public void test416() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test416"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var3 = var2.getChildCount();
//     java.lang.String var4 = var2.getSourceFileName();
//     com.google.javascript.jscomp.CodingConvention.Bind var6 = var0.describeFunctionBind(var2, true);
//     boolean var8 = var0.isPrivate("module$JSDocInfo");
//     com.google.javascript.jscomp.ClosureCodingConvention var9 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var12 = var11.getChildCount();
//     java.lang.String var13 = var11.getSourceFileName();
//     com.google.javascript.jscomp.CodingConvention.Bind var15 = var9.describeFunctionBind(var11, true);
//     java.lang.String var16 = var9.getAbstractMethodName();
//     java.lang.String var17 = var9.getExportPropertyFunction();
//     com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
//     com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var25 = var24.getChildCount();
//     com.google.javascript.rhino.jstype.JSType var26 = var24.getJSType();
//     com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var29 = var28.getChildCount();
//     java.lang.String var30 = var28.getSourceFileName();
//     com.google.javascript.rhino.Node var33 = new com.google.javascript.rhino.Node(153, var22, var24, var28, 0, 153);
//     com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var36 = var35.getChildCount();
//     java.lang.String var37 = var35.getSourceFileName();
//     com.google.javascript.rhino.jstype.StaticSourceFile var38 = null;
//     var35.setStaticSourceFile(var38);
//     boolean var40 = var35.isAnd();
//     boolean var41 = var35.isEmpty();
//     boolean var42 = var28.hasChild(var35);
//     var35.putIntProp(153, 100);
//     com.google.javascript.jscomp.CodingConvention.Bind var47 = var9.describeFunctionBind(var35, true);
//     java.lang.String var48 = var0.getSingletonGetterClassName(var35);
// 
//   }

  public void test417() {}
//   public void test417() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test417"); }
// 
// 
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("module$", 100, 100);
//     com.google.javascript.rhino.jstype.StaticSourceFile var4 = var3.getStaticSourceFile();
//     boolean var5 = var3.isIn();
//     java.lang.String var6 = var3.getString();
//     com.google.javascript.rhino.Node var7 = null;
//     com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.Node.newString(0, "", 1, 153);
//     com.google.javascript.rhino.Node[] var14 = new com.google.javascript.rhino.Node[] { var13};
//     com.google.javascript.rhino.Node var15 = new com.google.javascript.rhino.Node(0, var14);
//     boolean var16 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(var15);
//     com.google.javascript.rhino.Node var21 = new com.google.javascript.rhino.Node(0, 10, 1);
//     com.google.javascript.rhino.Node var22 = new com.google.javascript.rhino.Node(10, var21);
//     boolean var23 = var21.isFromExterns();
//     boolean var24 = var21.isRegExp();
//     com.google.javascript.rhino.Node var25 = var15.useSourceInfoIfMissingFrom(var21);
//     com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var28 = var27.getChildCount();
//     java.lang.String var29 = var27.getSourceFileName();
//     com.google.javascript.rhino.jstype.StaticSourceFile var30 = null;
//     var27.setStaticSourceFile(var30);
//     boolean var32 = var27.isAnd();
//     boolean var33 = var27.isEmpty();
//     boolean var34 = var27.hasMoreThanOneChild();
//     com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.forNode(var3, var7, var25, var27);
// 
//   }

  public void test418() {}
//   public void test418() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test418"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var3 = var1.getIntProp(1);
//     com.google.javascript.rhino.Node.SideEffectFlags var4 = null;
//     var1.setSideEffectFlags(var4);
// 
//   }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test419"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.labelName("hi!");
    int var7 = var6.getChildCount();
    com.google.javascript.rhino.jstype.JSType var8 = var6.getJSType();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.labelName("hi!");
    int var11 = var10.getChildCount();
    java.lang.String var12 = var10.getSourceFileName();
    com.google.javascript.rhino.Node var15 = new com.google.javascript.rhino.Node(153, var4, var6, var10, 0, 153);
    boolean var16 = var4.isObjectLit();
    boolean var17 = var4.isRegExp();
    var4.setWasEmptyNode(false);
    boolean var20 = var4.isQuotedString();
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.block();
    com.google.javascript.rhino.JSDocInfo var22 = new com.google.javascript.rhino.JSDocInfo();
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var24 = var23.cloneTree();
    var22.setAssociatedNode(var24);
    var24.setWasEmptyNode(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.replaceChildAfter(var21, var24);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test420() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test420"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("hi!");
    int var3 = var2.getChildCount();
    java.lang.String var4 = var2.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var5 = var2.getStaticSourceFile();
    boolean var6 = var2.isQualifiedName();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    var10.putBooleanProp(0, false);
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.labelName("hi!");
    int var21 = var20.getChildCount();
    com.google.javascript.rhino.jstype.JSType var22 = var20.getJSType();
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.labelName("hi!");
    int var25 = var24.getChildCount();
    java.lang.String var26 = var24.getSourceFileName();
    com.google.javascript.rhino.Node var29 = new com.google.javascript.rhino.Node(153, var18, var20, var24, 0, 153);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.labelName("hi!");
    int var32 = var31.getChildCount();
    java.lang.String var33 = var31.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var34 = null;
    var31.setStaticSourceFile(var34);
    boolean var36 = var31.isAnd();
    boolean var37 = var31.isEmpty();
    boolean var38 = var24.hasChild(var31);
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.labelName("hi!");
    int var41 = var40.getChildCount();
    com.google.javascript.rhino.jstype.JSType var42 = var40.getJSType();
    int var43 = var40.getType();
    com.google.javascript.rhino.Node var44 = var40.cloneTree();
    com.google.javascript.rhino.Node var47 = new com.google.javascript.rhino.Node((-1), var2, var10, var31, var40, 100, 10);
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.name(". hi! at (unknown source) line (unknown line) : (unknown column)");
    java.lang.String var50 = var31.checkTreeEquals(var49);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.JSDocInfo var51 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(var49);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "Node tree inequality:\nTree1:\nLABEL_NAME hi!\n\n\nTree2:\nNAME . hi! at (unknown source) line (unknown line) : (unknown column)\n\n\nSubtree1: LABEL_NAME hi!\n\n\nSubtree2: NAME . hi! at (unknown source) line (unknown line) : (unknown column)\n"+ "'", var50.equals("Node tree inequality:\nTree1:\nLABEL_NAME hi!\n\n\nTree2:\nNAME . hi! at (unknown source) line (unknown line) : (unknown column)\n\n\nSubtree1: LABEL_NAME hi!\n\n\nSubtree2: NAME . hi! at (unknown source) line (unknown line) : (unknown column)\n"));

  }

  public void test421() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test421"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var2 = var1.cloneTree();
    boolean var3 = var1.hasChildren();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.labelName("hi!");
    int var6 = var5.getChildCount();
    java.lang.String var7 = var5.getSourceFileName();
    boolean var8 = var5.isCatch();
    int var9 = var5.getSourceOffset();
    com.google.javascript.rhino.Node var10 = var5.getLastSibling();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.labelName("hi!");
    com.google.javascript.rhino.Node.AncestorIterable var13 = var12.getAncestors();
    com.google.javascript.rhino.Node var14 = new com.google.javascript.rhino.Node(1, var1, var5, var12);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.trueNode();
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.labelName("hi!");
    int var19 = var18.getChildCount();
    java.lang.String var20 = var18.getSourceFileName();
    java.lang.String var21 = var18.toString();
    boolean var22 = var16.isEquivalentToTyped(var18);
    boolean var23 = var16.isFor();
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.labelName("hi!");
    int var31 = var30.getChildCount();
    com.google.javascript.rhino.jstype.JSType var32 = var30.getJSType();
    com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.IR.labelName("hi!");
    int var35 = var34.getChildCount();
    java.lang.String var36 = var34.getSourceFileName();
    com.google.javascript.rhino.Node var39 = new com.google.javascript.rhino.Node(153, var28, var30, var34, 0, 153);
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.labelName("hi!");
    int var42 = var41.getChildCount();
    java.lang.String var43 = var41.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var44 = null;
    var41.setStaticSourceFile(var44);
    boolean var46 = var41.isAnd();
    boolean var47 = var41.isEmpty();
    boolean var48 = var34.hasChild(var41);
    boolean var49 = var41.isHook();
    var41.setLength((-1));
    com.google.javascript.rhino.Node var54 = new com.google.javascript.rhino.Node(0, var16, var41, 1, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var55 = com.google.javascript.rhino.IR.label(var1, var16);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "LABEL_NAME hi!"+ "'", var21.equals("LABEL_NAME hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);

  }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test422"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
    boolean var4 = var2.hasParameter("");
    java.util.List var5 = var2.getImplementedInterfaces();
    java.lang.String var6 = var2.getOriginalCommentString();
    java.lang.String var7 = var2.toString();
    java.lang.String var8 = var2.getLicense();
    java.util.List var9 = var2.getImplementedInterfaces();
    com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
    java.lang.String var12 = var1.getAstDotGraph();
    com.google.javascript.jscomp.CompilerOptions var13 = new com.google.javascript.jscomp.CompilerOptions();
    var13.setCollapseProperties(false);
    var13.enableExternExports(false);
    var13.setAliasExternals(false);
    com.google.javascript.jscomp.CodingConvention var20 = var13.getCodingConvention();
    var13.setOutputJsStringUsage(true);
    var13.setRemoveUnusedVars(true);
    var13.setAcceptConstKeyword(false);
    com.google.javascript.jscomp.DefaultPassConfig var27 = new com.google.javascript.jscomp.DefaultPassConfig(var13);
    var1.setPassConfig((com.google.javascript.jscomp.PassConfig)var27);
    com.google.javascript.jscomp.NodeTraversal.Callback var29 = null;
    com.google.javascript.jscomp.NodeTraversal var30 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var1, var29);
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var33 = var32.cloneTree();
    com.google.javascript.rhino.Node[] var34 = new com.google.javascript.rhino.Node[] { var32};
    com.google.javascript.rhino.Node var35 = new com.google.javascript.rhino.Node(100, var34);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var30.traverseRoots(var34);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "JSDocInfo"+ "'", var7.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test423() {}
//   public void test423() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test423"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
//     java.util.List var1 = var0.getEdges();
//     java.util.Collection var2 = var0.getNodes();
//     com.google.javascript.jscomp.CompilerOptions var3 = new com.google.javascript.jscomp.CompilerOptions();
//     var3.setCollapseProperties(false);
//     com.google.javascript.jscomp.StrictWarningsGuard var6 = new com.google.javascript.jscomp.StrictWarningsGuard();
//     var3.addWarningsGuard((com.google.javascript.jscomp.WarningsGuard)var6);
//     var3.setInferTypes(true);
//     var3.setRemoveUnusedPrototypeProperties(false);
//     var3.setCheckMissingGetCssNameBlacklist(": hi!");
//     var3.setSourceMapOutputPath("");
//     var3.setInputDelimiter("goog.abstractMethod");
//     java.util.Iterator var18 = var0.getNeighborNodesIterator((java.lang.Object)var3);
// 
//   }

  public void test424() {}
//   public void test424() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test424"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     java.lang.String var12 = var1.getAstDotGraph();
//     com.google.javascript.jscomp.CompilerOptions var13 = new com.google.javascript.jscomp.CompilerOptions();
//     var13.setCollapseProperties(false);
//     var13.enableExternExports(false);
//     var13.setAliasExternals(false);
//     com.google.javascript.jscomp.CodingConvention var20 = var13.getCodingConvention();
//     var13.setOutputJsStringUsage(true);
//     var13.setRemoveUnusedVars(true);
//     var13.setAcceptConstKeyword(false);
//     com.google.javascript.jscomp.DefaultPassConfig var27 = new com.google.javascript.jscomp.DefaultPassConfig(var13);
//     var1.setPassConfig((com.google.javascript.jscomp.PassConfig)var27);
//     com.google.javascript.jscomp.CodingConvention var29 = var1.getCodingConvention();
// 
//   }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test425"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.stringKey("STRING module$ 100");
    var1.setWasEmptyNode(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test426() {}
//   public void test426() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test426"); }
// 
// 
//     java.io.File var0 = null;
//     java.nio.charset.Charset var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromFile(var0, var1);
// 
//   }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test427"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.rhino.JSDocInfo var3 = new com.google.javascript.rhino.JSDocInfo();
    boolean var5 = var3.hasParameter("");
    java.util.List var6 = var3.getImplementedInterfaces();
    java.lang.String var7 = var3.getOriginalCommentString();
    java.lang.String var8 = var3.toString();
    java.util.Collection var9 = var3.getAuthors();
    java.lang.String var10 = var3.getVersion();
    java.util.List var11 = var3.getImplementedInterfaces();
    com.google.javascript.jscomp.JSModule[] var12 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var11);
    com.google.javascript.rhino.jstype.FunctionType var13 = var1.createFunctionType(var2, var11);
    com.google.javascript.rhino.ErrorReporter var14 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var14);
    com.google.javascript.rhino.jstype.JSType var16 = null;
    com.google.javascript.rhino.JSDocInfo var17 = new com.google.javascript.rhino.JSDocInfo();
    boolean var19 = var17.hasParameter("");
    java.util.List var20 = var17.getImplementedInterfaces();
    java.lang.String var21 = var17.getOriginalCommentString();
    java.lang.String var22 = var17.toString();
    java.util.Collection var23 = var17.getAuthors();
    java.lang.String var24 = var17.getVersion();
    java.util.List var25 = var17.getImplementedInterfaces();
    com.google.javascript.jscomp.JSModule[] var26 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var25);
    com.google.javascript.rhino.jstype.FunctionType var27 = var15.createFunctionType(var16, var25);
    boolean var28 = var27.isConstructor();
    java.lang.Iterable var29 = var27.getAllExtendedInterfaces();
    boolean var30 = var13.isEquivalentTo((com.google.javascript.rhino.jstype.JSType)var27);
    boolean var31 = var13.isFunctionPrototypeType();
    boolean var32 = var13.isGlobalThisType();
    com.google.javascript.rhino.ErrorReporter var33 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33);
    com.google.javascript.rhino.jstype.JSType var35 = null;
    com.google.javascript.rhino.JSDocInfo var36 = new com.google.javascript.rhino.JSDocInfo();
    boolean var38 = var36.hasParameter("");
    java.util.List var39 = var36.getImplementedInterfaces();
    java.lang.String var40 = var36.getOriginalCommentString();
    java.lang.String var41 = var36.toString();
    java.util.Collection var42 = var36.getAuthors();
    java.lang.String var43 = var36.getVersion();
    java.util.List var44 = var36.getImplementedInterfaces();
    com.google.javascript.jscomp.JSModule[] var45 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var44);
    com.google.javascript.rhino.jstype.FunctionType var46 = var34.createFunctionType(var35, var44);
    boolean var47 = var46.isUnknownType();
    com.google.javascript.rhino.ErrorReporter var48 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var48);
    com.google.javascript.rhino.jstype.JSType var50 = null;
    com.google.javascript.rhino.JSDocInfo var51 = new com.google.javascript.rhino.JSDocInfo();
    boolean var53 = var51.hasParameter("");
    java.util.List var54 = var51.getImplementedInterfaces();
    java.lang.String var55 = var51.getOriginalCommentString();
    java.lang.String var56 = var51.toString();
    java.util.Collection var57 = var51.getAuthors();
    java.lang.String var58 = var51.getVersion();
    java.util.List var59 = var51.getImplementedInterfaces();
    com.google.javascript.jscomp.JSModule[] var60 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var59);
    com.google.javascript.rhino.jstype.FunctionType var61 = var49.createFunctionType(var50, var59);
    boolean var62 = var61.isUnknownType();
    boolean var63 = var61.isUnknownType();
    com.google.javascript.rhino.jstype.JSType var65 = var61.findPropertyType("LABEL_NAME hi!\n");
    com.google.javascript.rhino.jstype.JSType var66 = var46.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType)var61);
    com.google.javascript.rhino.jstype.JSType var68 = null;
    com.google.javascript.rhino.Node var72 = com.google.javascript.rhino.Node.newString("module$", 100, 100);
    com.google.javascript.rhino.jstype.StaticSourceFile var73 = var72.getStaticSourceFile();
    boolean var74 = var72.isIn();
    boolean var75 = var72.isLabel();
    java.lang.String var76 = var72.toString();
    com.google.javascript.rhino.JSDocInfo var77 = var72.getJSDocInfo();
    boolean var78 = var61.defineDeclaredProperty(". hi! at (unknown source) line (unknown line) : (unknown column)", var68, var72);
    com.google.javascript.rhino.ErrorReporter var79 = null;
    com.google.javascript.rhino.ErrorReporter var80 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var81 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var80);
    com.google.javascript.rhino.jstype.JSType var82 = null;
    com.google.javascript.rhino.JSDocInfo var83 = new com.google.javascript.rhino.JSDocInfo();
    boolean var85 = var83.hasParameter("");
    java.util.List var86 = var83.getImplementedInterfaces();
    java.lang.String var87 = var83.getOriginalCommentString();
    java.lang.String var88 = var83.toString();
    java.util.Collection var89 = var83.getAuthors();
    java.lang.String var90 = var83.getVersion();
    java.util.List var91 = var83.getImplementedInterfaces();
    com.google.javascript.jscomp.JSModule[] var92 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var91);
    com.google.javascript.rhino.jstype.FunctionType var93 = var81.createFunctionType(var82, var91);
    boolean var94 = var93.isUnknownType();
    com.google.javascript.rhino.jstype.FunctionType var95 = var93.toMaybeFunctionType();
    boolean var96 = var95.isFunctionPrototypeType();
    com.google.javascript.rhino.jstype.JSType var97 = var61.resolve(var79, (com.google.javascript.rhino.jstype.StaticScope)var95);
    boolean var98 = var13.isSubtype((com.google.javascript.rhino.jstype.JSType)var61);
    boolean var99 = var13.isObject();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "JSDocInfo"+ "'", var8.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "JSDocInfo"+ "'", var22.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "JSDocInfo"+ "'", var41.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "JSDocInfo"+ "'", var56.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "STRING module$ 100"+ "'", var76.equals("STRING module$ 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + "JSDocInfo"+ "'", var88.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var98 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var99 == true);

  }

  public void test428() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test428"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("hi!");
    int var3 = var2.getChildCount();
    java.lang.String var4 = var2.getSourceFileName();
    com.google.javascript.jscomp.CodingConvention.Bind var6 = var0.describeFunctionBind(var2, true);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.labelName("hi!");
    int var9 = var8.getChildCount();
    java.lang.String var10 = var8.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var11 = null;
    var8.setStaticSourceFile(var11);
    boolean var13 = var8.isAnd();
    boolean var14 = var8.isTry();
    com.google.javascript.jscomp.CodingConvention.Bind var16 = var0.describeFunctionBind(var8, false);
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.labelName("hi!");
    int var24 = var23.getChildCount();
    com.google.javascript.rhino.jstype.JSType var25 = var23.getJSType();
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.labelName("hi!");
    int var28 = var27.getChildCount();
    java.lang.String var29 = var27.getSourceFileName();
    com.google.javascript.rhino.Node var32 = new com.google.javascript.rhino.Node(153, var21, var23, var27, 0, 153);
    java.lang.Iterable var33 = var27.siblings();
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.labelName("hi!");
    int var41 = var40.getChildCount();
    com.google.javascript.rhino.jstype.JSType var42 = var40.getJSType();
    com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.IR.labelName("hi!");
    int var45 = var44.getChildCount();
    java.lang.String var46 = var44.getSourceFileName();
    com.google.javascript.rhino.Node var49 = new com.google.javascript.rhino.Node(153, var38, var40, var44, 0, 153);
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.labelName("hi!");
    int var52 = var51.getChildCount();
    java.lang.String var53 = var51.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var54 = null;
    var51.setStaticSourceFile(var54);
    boolean var56 = var51.isAnd();
    boolean var57 = var51.isEmpty();
    boolean var58 = var44.hasChild(var51);
    boolean var59 = var44.isLocalResultCall();
    java.lang.String var60 = var0.extractClassNameIfRequire(var27, var44);
    java.lang.String var61 = var0.getExportPropertyFunction();
    java.util.Collection var62 = var0.getIndirectlyDeclaredProperties();
    com.google.javascript.rhino.Node var67 = new com.google.javascript.rhino.Node(0, 10, 1);
    com.google.javascript.rhino.Node var68 = new com.google.javascript.rhino.Node(10, var67);
    com.google.javascript.rhino.jstype.JSTypeRegistry var69 = null;
    com.google.javascript.rhino.jstype.FunctionBuilder var70 = new com.google.javascript.rhino.jstype.FunctionBuilder(var69);
    com.google.javascript.rhino.Node var72 = com.google.javascript.rhino.IR.labelName("hi!");
    int var73 = var72.getChildCount();
    java.lang.String var74 = var72.getSourceFileName();
    com.google.javascript.rhino.Node var76 = com.google.javascript.rhino.IR.labelName("hi!");
    int var77 = var76.getChildCount();
    java.lang.String var78 = var76.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var79 = null;
    var76.setStaticSourceFile(var79);
    com.google.javascript.rhino.JSTypeExpression var82 = new com.google.javascript.rhino.JSTypeExpression(var76, "hi!");
    boolean var83 = var76.isNull();
    com.google.javascript.rhino.Node var84 = var72.clonePropsFrom(var76);
    boolean var85 = var76.isInc();
    com.google.javascript.rhino.jstype.FunctionBuilder var86 = var70.withSourceNode(var76);
    com.google.javascript.rhino.Node var87 = var67.srcref(var76);
    int var88 = var76.getSideEffectFlags();
    boolean var89 = var76.isAnd();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var90 = var0.isPropertyTestFunction(var76);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "goog.exportProperty"+ "'", var61.equals("goog.exportProperty"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);

  }

  public void test429() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test429"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.jscomp.SourceFile var6 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
    java.lang.String var8 = var6.getLine(1);
    var1.markName("module$", (com.google.javascript.rhino.jstype.StaticSourceFile)var6, 0, 1);
    boolean var12 = var1.recordNoCompile();
    com.google.javascript.rhino.JSTypeExpression var13 = null;
    boolean var14 = var1.recordImplementedInterface(var13);
    java.io.PrintStream var15 = null;
    com.google.javascript.jscomp.Compiler var16 = new com.google.javascript.jscomp.Compiler(var15);
    com.google.javascript.rhino.JSDocInfo var17 = new com.google.javascript.rhino.JSDocInfo();
    boolean var19 = var17.hasParameter("");
    java.util.List var20 = var17.getImplementedInterfaces();
    java.lang.String var21 = var17.getOriginalCommentString();
    java.lang.String var22 = var17.toString();
    java.lang.String var23 = var17.getLicense();
    java.util.List var24 = var17.getImplementedInterfaces();
    com.google.javascript.jscomp.NodeTraversal.Callback var25 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var16, var24, var25);
    com.google.javascript.jscomp.deps.SortedDependencies var27 = new com.google.javascript.jscomp.deps.SortedDependencies(var24);
    com.google.javascript.rhino.JSDocInfo var28 = new com.google.javascript.rhino.JSDocInfo();
    boolean var30 = var28.hasParameter("");
    var28.setDeprecated(true);
    int var33 = var28.getParameterCount();
    boolean var34 = var28.isDefine();
    java.util.List var35 = var28.getImplementedInterfaces();
    java.util.List var37 = var27.getDependenciesOf(var35, true);
    java.util.List var38 = var27.getInputsWithoutProvides();
    boolean var39 = var1.recordTemplateTypeNames(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "JSDocInfo"+ "'", var22.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);

  }

  public void test430() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test430"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.continueNode();
    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var2 = var0.useSourceInfoFromForTree(var1);
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.block();
    com.google.javascript.rhino.jstype.JSType var5 = var4.getJSType();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.defaultCase(var4);
    boolean var7 = var6.isCase();
    com.google.javascript.rhino.Node var10 = new com.google.javascript.rhino.Node(0, var6, 0, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.tryCatch(var2, var6);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test431() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test431"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setCollapseProperties(false);
    var0.enableExternExports(false);
    java.util.Set var5 = null;
    var0.setStripNamePrefixes(var5);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var7 = var0.getTweakProcessing();
    var0.setDefineToBooleanLiteral("LABEL_NAME hi!\n", true);
    com.google.javascript.jscomp.CheckLevel var11 = null;
    var0.setReportMissingOverride(var11);
    com.google.javascript.jscomp.CheckLevel var13 = null;
    var0.setBrokenClosureRequiresLevel(var13);
    var0.setIgnoreCajaProperties(false);
    var0.setInlineGetters(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test432() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test432"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CustomPassExecutionTime var1 = com.google.javascript.jscomp.CustomPassExecutionTime.valueOf("InputId: hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test433() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test433"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    java.lang.String var3 = var1.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var4 = null;
    var1.setStaticSourceFile(var4);
    boolean var6 = var1.isAnd();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isParamList();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.throwNode(var1);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test434() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test434"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.rhino.JSDocInfo var3 = new com.google.javascript.rhino.JSDocInfo();
    boolean var5 = var3.hasParameter("");
    java.util.List var6 = var3.getImplementedInterfaces();
    java.lang.String var7 = var3.getOriginalCommentString();
    java.lang.String var8 = var3.toString();
    java.util.Collection var9 = var3.getAuthors();
    java.lang.String var10 = var3.getVersion();
    java.util.List var11 = var3.getImplementedInterfaces();
    com.google.javascript.jscomp.JSModule[] var12 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var11);
    com.google.javascript.rhino.jstype.FunctionType var13 = var1.createFunctionType(var2, var11);
    com.google.javascript.rhino.ErrorReporter var14 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var14);
    com.google.javascript.rhino.jstype.JSType var16 = null;
    com.google.javascript.rhino.JSDocInfo var17 = new com.google.javascript.rhino.JSDocInfo();
    boolean var19 = var17.hasParameter("");
    java.util.List var20 = var17.getImplementedInterfaces();
    java.lang.String var21 = var17.getOriginalCommentString();
    java.lang.String var22 = var17.toString();
    java.util.Collection var23 = var17.getAuthors();
    java.lang.String var24 = var17.getVersion();
    java.util.List var25 = var17.getImplementedInterfaces();
    com.google.javascript.jscomp.JSModule[] var26 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var25);
    com.google.javascript.rhino.jstype.FunctionType var27 = var15.createFunctionType(var16, var25);
    boolean var28 = var27.isConstructor();
    java.lang.Iterable var29 = var27.getAllExtendedInterfaces();
    boolean var30 = var13.isEquivalentTo((com.google.javascript.rhino.jstype.JSType)var27);
    com.google.javascript.rhino.ErrorReporter var31 = null;
    com.google.javascript.rhino.ErrorReporter var32 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32);
    com.google.javascript.rhino.ErrorReporter var34 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var34);
    com.google.javascript.rhino.jstype.JSType var36 = null;
    com.google.javascript.rhino.JSDocInfo var37 = new com.google.javascript.rhino.JSDocInfo();
    boolean var39 = var37.hasParameter("");
    java.util.List var40 = var37.getImplementedInterfaces();
    java.lang.String var41 = var37.getOriginalCommentString();
    java.lang.String var42 = var37.toString();
    java.util.Collection var43 = var37.getAuthors();
    java.lang.String var44 = var37.getVersion();
    java.util.List var45 = var37.getImplementedInterfaces();
    com.google.javascript.jscomp.JSModule[] var46 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var45);
    com.google.javascript.rhino.jstype.FunctionType var47 = var35.createFunctionType(var36, var45);
    boolean var48 = var47.isConstructor();
    java.lang.Iterable var49 = var47.getAllExtendedInterfaces();
    com.google.javascript.rhino.Node var54 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.labelName("hi!");
    int var57 = var56.getChildCount();
    com.google.javascript.rhino.jstype.JSType var58 = var56.getJSType();
    com.google.javascript.rhino.Node var60 = com.google.javascript.rhino.IR.labelName("hi!");
    int var61 = var60.getChildCount();
    java.lang.String var62 = var60.getSourceFileName();
    com.google.javascript.rhino.Node var65 = new com.google.javascript.rhino.Node(153, var54, var56, var60, 0, 153);
    com.google.javascript.rhino.Node var67 = com.google.javascript.rhino.IR.labelName("hi!");
    int var68 = var67.getChildCount();
    java.lang.String var69 = var67.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var70 = null;
    var67.setStaticSourceFile(var70);
    boolean var72 = var67.isAnd();
    boolean var73 = var67.isEmpty();
    boolean var74 = var60.hasChild(var67);
    boolean var75 = var67.isHook();
    java.lang.String var76 = com.google.javascript.jscomp.NodeUtil.getSourceName(var67);
    com.google.javascript.rhino.jstype.FunctionType var77 = var33.createFunctionType((com.google.javascript.rhino.jstype.JSType)var47, var67);
    boolean var78 = var47.isInterface();
    com.google.javascript.rhino.jstype.JSType var79 = var13.resolve(var31, (com.google.javascript.rhino.jstype.StaticScope)var47);
    boolean var80 = var13.isEnumType();
    com.google.javascript.rhino.JSDocInfo var81 = new com.google.javascript.rhino.JSDocInfo();
    com.google.javascript.rhino.Node var82 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var83 = var82.cloneTree();
    var81.setAssociatedNode(var83);
    boolean var85 = var81.hasThisType();
    boolean var86 = var81.isIdGenerator();
    var13.setJSDocInfo(var81);
    boolean var88 = var13.isNominalConstructor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "JSDocInfo"+ "'", var8.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "JSDocInfo"+ "'", var22.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "JSDocInfo"+ "'", var42.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);

  }

  public void test435() {}
//   public void test435() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test435"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     java.lang.String var12 = var1.getAstDotGraph();
//     com.google.javascript.jscomp.CompilerOptions var13 = new com.google.javascript.jscomp.CompilerOptions();
//     var13.setCollapseProperties(false);
//     var13.enableExternExports(false);
//     java.util.Set var18 = null;
//     var13.setStripNamePrefixes(var18);
//     com.google.javascript.rhino.JSDocInfo var20 = new com.google.javascript.rhino.JSDocInfo();
//     com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.falseNode();
//     com.google.javascript.rhino.Node var22 = var21.cloneTree();
//     var20.setAssociatedNode(var22);
//     java.util.List var24 = var20.getThrownTypes();
//     java.util.List var25 = var20.getThrownTypes();
//     var13.setManageClosureDependencies(var25);
//     com.google.javascript.jscomp.CompilerOptions var27 = new com.google.javascript.jscomp.CompilerOptions();
//     var27.setCollapseProperties(false);
//     var27.setCollapseVariableDeclarations(false);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var32 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
//     java.util.List var33 = var32.getEdges();
//     com.google.javascript.jscomp.ComposeWarningsGuard var34 = new com.google.javascript.jscomp.ComposeWarningsGuard(var33);
//     var27.setSourceMapLocationMappings(var33);
//     com.google.javascript.jscomp.CompilerOptions var36 = new com.google.javascript.jscomp.CompilerOptions();
//     com.google.javascript.jscomp.PropertyRenamingPolicy var37 = null;
//     var36.setPropertyRenaming(var37);
//     var36.setInlineGetters(false);
//     var36.setAppNameStr("");
//     var36.setReserveRawExports(false);
//     var1.<com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.SourceFile>init(var25, var33, var36);
//     com.google.javascript.jscomp.JSSourceFile var46 = null;
//     com.google.javascript.rhino.JSDocInfo var47 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var49 = var47.hasParameter("");
//     var47.setDeprecated(true);
//     int var52 = var47.getParameterCount();
//     boolean var53 = var47.isDefine();
//     java.util.List var54 = var47.getImplementedInterfaces();
//     com.google.javascript.jscomp.JSModule[] var55 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var54);
//     com.google.javascript.jscomp.CompilerOptions var56 = new com.google.javascript.jscomp.CompilerOptions();
//     var56.setCollapseProperties(false);
//     var56.enableExternExports(false);
//     java.util.Set var61 = null;
//     var56.setStripNamePrefixes(var61);
//     com.google.javascript.jscomp.Result var63 = var1.compile(var46, var55, var56);
// 
//   }

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test436"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var2 = var1.cloneTree();
    var0.setAssociatedNode(var2);
    java.util.List var4 = var0.getThrownTypes();
    java.util.List var5 = var0.getThrownTypes();
    com.google.javascript.rhino.JSTypeExpression var6 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test437() {}
//   public void test437() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test437"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var8 = var7.getChildCount();
//     com.google.javascript.rhino.jstype.JSType var9 = var7.getJSType();
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var12 = var11.getChildCount();
//     java.lang.String var13 = var11.getSourceFileName();
//     com.google.javascript.rhino.Node var16 = new com.google.javascript.rhino.Node(153, var5, var7, var11, 0, 153);
//     boolean var17 = var5.isObjectLit();
//     boolean var18 = var5.isRegExp();
//     var5.setWasEmptyNode(false);
//     com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.add(var0, var5);
// 
//   }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test438"); }


    com.google.javascript.jscomp.ErrorManager var0 = null;
    com.google.javascript.jscomp.deps.JsFileParser var1 = new com.google.javascript.jscomp.deps.JsFileParser(var0);
    com.google.javascript.jscomp.deps.DependencyInfo var5 = var1.parseFile("", "LABEL_NAME hi!\n", "LABEL_NAME hi!\n");
    com.google.javascript.jscomp.deps.DependencyInfo var9 = var1.parseFile("", "Node tree inequality:\nTree1:\nLABEL_NAME hi!\n\n\nTree2:\nNAME . hi! at (unknown source) line (unknown line) : (unknown column)\n\n\nSubtree1: LABEL_NAME hi!\n\n\nSubtree2: NAME . hi! at (unknown source) line (unknown line) : (unknown column)\n", ". hi! at LABEL_NAME hi! line 1 : 153");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test439() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test439"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var1 = com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.valueOf(". hi! at (unknown source) line (unknown line) : (unknown column)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test440() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test440"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("hi!");
    int var3 = var2.getChildCount();
    java.lang.String var4 = var2.getSourceFileName();
    com.google.javascript.jscomp.CodingConvention.Bind var6 = var0.describeFunctionBind(var2, true);
    java.lang.String var7 = var0.getAbstractMethodName();
    com.google.javascript.rhino.JSDocInfo var8 = new com.google.javascript.rhino.JSDocInfo();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var10 = var9.cloneTree();
    var8.setAssociatedNode(var10);
    var10.setWasEmptyNode(false);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.labelName("hi!");
    int var16 = var15.getChildCount();
    java.lang.String var17 = var15.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var18 = var15.getStaticSourceFile();
    boolean var19 = var15.isIn();
    java.lang.String var20 = var0.extractClassNameIfProvide(var10, var15);
    boolean var23 = var0.isExported("null(null)", true);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.Node.newString("module$", 100, 100);
    com.google.javascript.rhino.jstype.StaticSourceFile var28 = var27.getStaticSourceFile();
    boolean var29 = var27.isIn();
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.labelName("hi!");
    int var33 = var31.getIntProp(1);
    int var34 = var27.getIndexOfChild(var31);
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var35 = var0.getDelegateRelationship(var31);
    java.lang.String var36 = var0.getExportSymbolFunction();
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.labelName("hi!");
    int var39 = var38.getChildCount();
    java.lang.String var40 = var38.getSourceFileName();
    boolean var41 = var38.isCatch();
    int var42 = var38.getSourceOffset();
    com.google.javascript.rhino.Node var43 = var38.getLastSibling();
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var50 = com.google.javascript.rhino.IR.labelName("hi!");
    int var51 = var50.getChildCount();
    com.google.javascript.rhino.jstype.JSType var52 = var50.getJSType();
    com.google.javascript.rhino.Node var54 = com.google.javascript.rhino.IR.labelName("hi!");
    int var55 = var54.getChildCount();
    java.lang.String var56 = var54.getSourceFileName();
    com.google.javascript.rhino.Node var59 = new com.google.javascript.rhino.Node(153, var48, var50, var54, 0, 153);
    boolean var60 = var59.isNE();
    com.google.javascript.rhino.Node var62 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString("goog.abstractMethod");
    com.google.javascript.rhino.Node var63 = var59.copyInformationFrom(var62);
    java.lang.String var64 = var0.extractClassNameIfProvide(var38, var62);
    com.google.javascript.rhino.Node var67 = com.google.javascript.rhino.Node.newString(1, "JSDocInfo");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var68 = var0.isInlinableFunction(var67);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "goog.abstractMethod"+ "'", var7.equals("goog.abstractMethod"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "goog.exportSymbol"+ "'", var36.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test441() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test441"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    boolean var1 = var0.isDirected();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.labelName("hi!");
    int var4 = var3.getChildCount();
    java.lang.String var5 = var3.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var6 = null;
    var3.setStaticSourceFile(var6);
    com.google.javascript.rhino.JSTypeExpression var9 = new com.google.javascript.rhino.JSTypeExpression(var3, "hi!");
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var10 = var0.getDirectedGraphNode((java.lang.Object)"hi!");
    com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
    com.google.javascript.jscomp.CompilerOptions var14 = new com.google.javascript.jscomp.CompilerOptions();
    var14.setCollapseProperties(false);
    com.google.javascript.jscomp.StrictWarningsGuard var17 = new com.google.javascript.jscomp.StrictWarningsGuard();
    var14.addWarningsGuard((com.google.javascript.jscomp.WarningsGuard)var17);
    com.google.javascript.jscomp.CheckLevel var19 = null;
    var14.setCheckGlobalThisLevel(var19);
    var14.setAliasExternals(true);
    java.util.Map var23 = null;
    var14.setDefineReplacements(var23);
    var14.setRemoveTryCatchFinally(true);
    var14.setOutputCharset("null(null)");
    com.google.javascript.jscomp.CompilerOptions var32 = new com.google.javascript.jscomp.CompilerOptions();
    var32.setCollapseProperties(false);
    com.google.javascript.jscomp.StrictWarningsGuard var35 = new com.google.javascript.jscomp.StrictWarningsGuard();
    var32.addWarningsGuard((com.google.javascript.jscomp.WarningsGuard)var35);
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    var41.putBooleanProp(0, false);
    com.google.javascript.jscomp.CheckLevel var45 = null;
    com.google.javascript.jscomp.DiagnosticType var48 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
    java.lang.String[] var50 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var51 = com.google.javascript.jscomp.JSError.make(var48, var50);
    com.google.javascript.jscomp.DiagnosticType var54 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
    java.lang.String[] var56 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var57 = com.google.javascript.jscomp.JSError.make(var54, var56);
    com.google.javascript.jscomp.JSError var58 = com.google.javascript.jscomp.JSError.make("LABEL_NAME hi!\n", var41, var45, var48, var56);
    com.google.javascript.jscomp.CheckLevel var59 = var35.level(var58);
    com.google.javascript.jscomp.DiagnosticType var62 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
    java.lang.String[] var64 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var65 = com.google.javascript.jscomp.JSError.make(var62, var64);
    com.google.javascript.jscomp.DiagnosticType var68 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
    java.lang.String[] var70 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var71 = com.google.javascript.jscomp.JSError.make(var68, var70);
    com.google.javascript.jscomp.JSError var72 = com.google.javascript.jscomp.JSError.make("LABEL_NAME hi!", 1, 153, var59, var62, var70);
    var14.setCheckProvides(var59);
    com.google.javascript.jscomp.CompilerOptions var74 = new com.google.javascript.jscomp.CompilerOptions();
    var74.setCollapseProperties(false);
    var74.enableExternExports(false);
    java.util.Set var79 = null;
    var74.setStripNamePrefixes(var79);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var81 = var74.getTweakProcessing();
    com.google.javascript.jscomp.CheckLevel var82 = null;
    var74.setBrokenClosureRequiresLevel(var82);
    var74.setRuntimeTypeCheckLogFunction("LABEL_NAME hi!");
    var74.setInlineConstantVars(false);
    var74.setAssumeStrictThis(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var90 = var0.isConnected((java.lang.Object)var13, (java.lang.Object)var59, (java.lang.Object)false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
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
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);

  }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test442"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.labelName("hi!");
    int var4 = var3.getChildCount();
    java.lang.String var5 = var3.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var6 = null;
    var3.setStaticSourceFile(var6);
    com.google.javascript.rhino.JSTypeExpression var9 = new com.google.javascript.rhino.JSTypeExpression(var3, "hi!");
    boolean var10 = var1.recordThrowType(var9);
    com.google.javascript.rhino.JSDocInfoBuilder var12 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.labelName("hi!");
    int var15 = var14.getChildCount();
    java.lang.String var16 = var14.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var17 = null;
    var14.setStaticSourceFile(var17);
    com.google.javascript.rhino.JSTypeExpression var20 = new com.google.javascript.rhino.JSTypeExpression(var14, "hi!");
    boolean var21 = var12.recordThrowType(var20);
    boolean var23 = var12.recordReturnDescription("module$");
    com.google.javascript.rhino.JSDocInfoBuilder var25 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.labelName("hi!");
    int var28 = var27.getChildCount();
    java.lang.String var29 = var27.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var30 = null;
    var27.setStaticSourceFile(var30);
    com.google.javascript.rhino.JSTypeExpression var33 = new com.google.javascript.rhino.JSTypeExpression(var27, "hi!");
    boolean var34 = var25.recordThrowType(var33);
    com.google.javascript.rhino.JSDocInfoBuilder var36 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
    var36.markText("hi!", (-1), 10, 1, 0);
    com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.IR.labelName("hi!");
    int var45 = var44.getChildCount();
    java.lang.String var46 = var44.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var47 = null;
    var44.setStaticSourceFile(var47);
    com.google.javascript.rhino.JSTypeExpression var50 = new com.google.javascript.rhino.JSTypeExpression(var44, "hi!");
    boolean var51 = var36.recordImplementedInterface(var50);
    boolean var52 = var25.recordTypedef(var50);
    boolean var53 = var12.recordThrowType(var50);
    boolean var54 = var1.recordTypedef(var50);
    com.google.javascript.rhino.JSDocInfoBuilder var56 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.labelName("hi!");
    int var59 = var58.getChildCount();
    java.lang.String var60 = var58.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var61 = null;
    var58.setStaticSourceFile(var61);
    com.google.javascript.rhino.JSTypeExpression var64 = new com.google.javascript.rhino.JSTypeExpression(var58, "hi!");
    boolean var65 = var56.recordThrowType(var64);
    boolean var66 = var56.recordIdGenerator();
    com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.IR.labelName("hi!");
    int var70 = var69.getChildCount();
    java.lang.String var71 = var69.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var72 = null;
    var69.setStaticSourceFile(var72);
    com.google.javascript.rhino.JSTypeExpression var75 = new com.google.javascript.rhino.JSTypeExpression(var69, "hi!");
    boolean var76 = var56.recordParameter("module$JSDocInfo", var75);
    boolean var77 = var1.recordReturnType(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);

  }

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test443"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    boolean var1 = var0.isDirected();
    java.util.List var2 = var0.getEdges();
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.labelName("hi!");
    com.google.javascript.rhino.Node.AncestorIterable var5 = var4.getAncestors();
    com.google.javascript.jscomp.CompilerOptions var6 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var7 = null;
    var6.setAnonymousFunctionNaming(var7);
    var6.setPreferLineBreakAtEndOfFile(false);
    var6.setPropertyAffinity(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var13 = var0.isConnected((java.lang.Object)var5, (java.lang.Object)var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test444() {}
//   public void test444() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test444"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
//     var0.popNodeAnnotations();
// 
//   }

  public void test445() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test445"); }


    com.google.javascript.jscomp.CompilerOptions var3 = new com.google.javascript.jscomp.CompilerOptions();
    var3.setCollapseProperties(false);
    com.google.javascript.jscomp.StrictWarningsGuard var6 = new com.google.javascript.jscomp.StrictWarningsGuard();
    var3.addWarningsGuard((com.google.javascript.jscomp.WarningsGuard)var6);
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    var12.putBooleanProp(0, false);
    com.google.javascript.jscomp.CheckLevel var16 = null;
    com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
    java.lang.String[] var21 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var22 = com.google.javascript.jscomp.JSError.make(var19, var21);
    com.google.javascript.jscomp.DiagnosticType var25 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
    java.lang.String[] var27 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make(var25, var27);
    com.google.javascript.jscomp.JSError var29 = com.google.javascript.jscomp.JSError.make("LABEL_NAME hi!\n", var12, var16, var19, var27);
    com.google.javascript.jscomp.CheckLevel var30 = var6.level(var29);
    com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
    java.lang.String[] var35 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var36 = com.google.javascript.jscomp.JSError.make(var33, var35);
    com.google.javascript.jscomp.DiagnosticType var39 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
    java.lang.String[] var41 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var42 = com.google.javascript.jscomp.JSError.make(var39, var41);
    com.google.javascript.jscomp.JSError var43 = com.google.javascript.jscomp.JSError.make("LABEL_NAME hi!", 1, 153, var30, var33, var41);
    com.google.javascript.jscomp.DiagnosticType var44 = var43.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
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
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
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

  }

  public void test446() {}
//   public void test446() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test446"); }
// 
// 
//     com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var7 = var6.getChildCount();
//     com.google.javascript.rhino.jstype.JSType var8 = var6.getJSType();
//     com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var11 = var10.getChildCount();
//     java.lang.String var12 = var10.getSourceFileName();
//     com.google.javascript.rhino.Node var15 = new com.google.javascript.rhino.Node(153, var4, var6, var10, 0, 153);
//     com.google.javascript.rhino.JSDocInfo var16 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var18 = var16.hasParameter("");
//     var16.setDeprecated(true);
//     int var21 = var16.getParameterCount();
//     boolean var22 = var16.isDefine();
//     java.util.List var23 = var16.getImplementedInterfaces();
//     java.util.List var24 = var16.getExtendedInterfaces();
//     var10.setJSDocInfo(var16);
//     boolean var26 = var10.isNull();
//     com.google.javascript.rhino.Node.SideEffectFlags var27 = null;
//     var10.setSideEffectFlags(var27);
// 
//   }

  public void test447() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test447"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    boolean var1 = var0.isDirected();
    com.google.javascript.rhino.ErrorReporter var2 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    com.google.javascript.rhino.JSDocInfo var5 = new com.google.javascript.rhino.JSDocInfo();
    boolean var7 = var5.hasParameter("");
    java.util.List var8 = var5.getImplementedInterfaces();
    java.lang.String var9 = var5.getOriginalCommentString();
    java.lang.String var10 = var5.toString();
    java.util.Collection var11 = var5.getAuthors();
    java.lang.String var12 = var5.getVersion();
    java.util.List var13 = var5.getImplementedInterfaces();
    com.google.javascript.jscomp.JSModule[] var14 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var13);
    com.google.javascript.rhino.jstype.FunctionType var15 = var3.createFunctionType(var4, var13);
    boolean var16 = var15.isConstructor();
    com.google.javascript.rhino.ErrorReporter var17 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var17);
    com.google.javascript.rhino.jstype.JSType var19 = null;
    com.google.javascript.rhino.JSDocInfo var20 = new com.google.javascript.rhino.JSDocInfo();
    boolean var22 = var20.hasParameter("");
    java.util.List var23 = var20.getImplementedInterfaces();
    java.lang.String var24 = var20.getOriginalCommentString();
    java.lang.String var25 = var20.toString();
    java.util.Collection var26 = var20.getAuthors();
    java.lang.String var27 = var20.getVersion();
    java.util.List var28 = var20.getImplementedInterfaces();
    com.google.javascript.jscomp.JSModule[] var29 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var28);
    com.google.javascript.rhino.jstype.FunctionType var30 = var18.createFunctionType(var19, var28);
    boolean var31 = var30.isConstructor();
    com.google.javascript.rhino.jstype.FunctionType var32 = var30.toMaybeFunctionType();
    java.lang.Object var33 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.connectIfNotFound((java.lang.Object)var15, (java.lang.Object)var32, var33);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "JSDocInfo"+ "'", var10.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "JSDocInfo"+ "'", var25.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test448() {}
//   public void test448() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test448"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.paramList();
//     boolean var2 = var1.hasOneChild();
//     com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var5 = var4.getChildCount();
//     java.lang.String var6 = var4.getSourceFileName();
//     com.google.javascript.rhino.jstype.StaticSourceFile var7 = null;
//     var4.setStaticSourceFile(var7);
//     boolean var9 = var4.isAnd();
//     java.lang.Object var11 = null;
//     var4.putProp(10, var11);
//     com.google.javascript.rhino.Node var13 = var1.useSourceInfoFromForTree(var4);
//     com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.and(var0, var13);
// 
//   }

  public void test449() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test449"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.Node.newString(1, "JSDocInfo");
    var2.setSourceEncodedPosition(153);
    var2.setVarArgs(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.pos(var2);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test450() {}
//   public void test450() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test450"); }
// 
// 
//     com.google.javascript.jscomp.SourceExcerptProvider var0 = null;
//     com.google.javascript.jscomp.LightweightMessageFormatter var1 = new com.google.javascript.jscomp.LightweightMessageFormatter(var0);
// 
//   }

  public void test451() {}
//   public void test451() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test451"); }
// 
// 
//     com.google.javascript.jscomp.CodingConvention var0 = null;
//     com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention(var0);
//     boolean var3 = var1.isValidEnumKey("JSDocInfo");
//     boolean var5 = var1.isConstant("(LABEL_NAME hi!)");
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var8 = var7.getChildCount();
//     java.lang.String var9 = var7.getSourceFileName();
//     com.google.javascript.rhino.jstype.StaticSourceFile var10 = null;
//     var7.setStaticSourceFile(var10);
//     boolean var12 = var7.isAnd();
//     boolean var13 = var7.isTry();
//     boolean var14 = var7.isDec();
//     com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var17 = var16.getChildCount();
//     java.lang.String var18 = var16.getSourceFileName();
//     boolean var19 = var16.isCatch();
//     boolean var20 = var16.isDebugger();
//     com.google.javascript.rhino.Node var21 = var7.useSourceInfoFromForTree(var16);
//     boolean var22 = var1.isOptionalParameter(var7);
//     boolean var24 = var1.isValidEnumKey("goog.exportProperty");
//     java.lang.String var25 = var1.getExportPropertyFunction();
// 
//   }

  public void test452() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test452"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.labelName("hi!");
    int var4 = var3.getChildCount();
    java.lang.String var5 = var3.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var6 = null;
    var3.setStaticSourceFile(var6);
    com.google.javascript.rhino.JSTypeExpression var9 = new com.google.javascript.rhino.JSTypeExpression(var3, "hi!");
    boolean var10 = var1.recordThrowType(var9);
    boolean var11 = var1.recordIdGenerator();
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.Node.newString(0, "", 1, 153);
    com.google.javascript.rhino.Node[] var18 = new com.google.javascript.rhino.Node[] { var17};
    com.google.javascript.rhino.Node var19 = new com.google.javascript.rhino.Node(0, var18);
    boolean var20 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(var19);
    com.google.javascript.rhino.Node var25 = new com.google.javascript.rhino.Node(0, 10, 1);
    com.google.javascript.rhino.Node var26 = new com.google.javascript.rhino.Node(10, var25);
    boolean var27 = var25.isFromExterns();
    boolean var28 = var25.isRegExp();
    com.google.javascript.rhino.Node var29 = var19.useSourceInfoIfMissingFrom(var25);
    com.google.javascript.rhino.JSDocInfo var30 = var1.build(var29);
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.labelName("hi!");
    int var33 = var32.getChildCount();
    java.lang.String var34 = var32.getSourceFileName();
    boolean var35 = var32.isCatch();
    java.lang.String var36 = var32.getString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var37 = var29.removeChildAfter(var32);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));

  }

  public void test453() {}
//   public void test453() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test453"); }
// 
// 
//     com.google.javascript.jscomp.MessageFormatter var0 = null;
//     java.util.logging.Logger var1 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var2 = new com.google.javascript.jscomp.LoggerErrorManager(var0, var1);
//     com.google.javascript.jscomp.deps.JsFileParser var3 = new com.google.javascript.jscomp.deps.JsFileParser((com.google.javascript.jscomp.ErrorManager)var2);
//     com.google.javascript.jscomp.CompilerOptions var7 = new com.google.javascript.jscomp.CompilerOptions();
//     var7.setCollapseProperties(false);
//     com.google.javascript.jscomp.StrictWarningsGuard var10 = new com.google.javascript.jscomp.StrictWarningsGuard();
//     var7.addWarningsGuard((com.google.javascript.jscomp.WarningsGuard)var10);
//     com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
//     var16.putBooleanProp(0, false);
//     com.google.javascript.jscomp.CheckLevel var20 = null;
//     com.google.javascript.jscomp.DiagnosticType var23 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
//     java.lang.String[] var25 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var26 = com.google.javascript.jscomp.JSError.make(var23, var25);
//     com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
//     java.lang.String[] var31 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var32 = com.google.javascript.jscomp.JSError.make(var29, var31);
//     com.google.javascript.jscomp.JSError var33 = com.google.javascript.jscomp.JSError.make("LABEL_NAME hi!\n", var16, var20, var23, var31);
//     com.google.javascript.jscomp.CheckLevel var34 = var10.level(var33);
//     com.google.javascript.jscomp.DiagnosticType var37 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
//     java.lang.String[] var39 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var40 = com.google.javascript.jscomp.JSError.make(var37, var39);
//     com.google.javascript.jscomp.DiagnosticType var43 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
//     java.lang.String[] var45 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var46 = com.google.javascript.jscomp.JSError.make(var43, var45);
//     com.google.javascript.jscomp.JSError var47 = com.google.javascript.jscomp.JSError.make("LABEL_NAME hi!", 1, 153, var34, var37, var45);
//     int var48 = var34.ordinal();
//     com.google.javascript.jscomp.DiagnosticType var51 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
//     java.lang.String[] var53 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var54 = com.google.javascript.jscomp.JSError.make(var51, var53);
//     com.google.javascript.rhino.Node var59 = new com.google.javascript.rhino.Node(0, 10, 1);
//     com.google.javascript.rhino.Node var60 = new com.google.javascript.rhino.Node(10, var59);
//     boolean var61 = var54.equals((java.lang.Object)10);
//     int var62 = var54.getCharno();
//     com.google.javascript.jscomp.DiagnosticType var63 = var54.getType();
//     var2.println(var34, var54);
// 
//   }

  public void test454() {}
//   public void test454() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test454"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var3);
//     com.google.javascript.rhino.InputId var5 = null;
//     com.google.javascript.jscomp.CompilerInput var7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var4, var5, false);
//     java.lang.String var8 = var4.getName();
//     com.google.javascript.jscomp.CompilerInput var11 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var4, "", true);
//     java.lang.String var13 = var11.getLine(10);
//     java.util.Collection var14 = var11.getRequires();
// 
//   }

  public void test455() {}
//   public void test455() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test455"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.JSModule var5 = new com.google.javascript.jscomp.JSModule("LABEL_NAME hi!");
//     java.util.List var6 = var5.getDependencies();
//     com.google.javascript.rhino.JSDocInfo var7 = new com.google.javascript.rhino.JSDocInfo();
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.falseNode();
//     com.google.javascript.rhino.Node var9 = var8.cloneTree();
//     var7.setAssociatedNode(var9);
//     java.util.List var11 = var7.getThrownTypes();
//     java.util.List var12 = var7.getThrownTypes();
//     com.google.javascript.jscomp.deps.SimpleDependencyInfo var13 = new com.google.javascript.jscomp.deps.SimpleDependencyInfo("(LABEL_NAME hi!)", "STRING module$ 100", var6, var12);
//     com.google.javascript.jscomp.NodeTraversal.Callback var14 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var12, var14);
//     com.google.javascript.jscomp.CompilerInput var17 = var1.newExternInput("goog.exportSymbol");
// 
//   }

  public void test456() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test456"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setCollapseProperties(false);
    com.google.javascript.jscomp.StrictWarningsGuard var3 = new com.google.javascript.jscomp.StrictWarningsGuard();
    var0.addWarningsGuard((com.google.javascript.jscomp.WarningsGuard)var3);
    com.google.javascript.jscomp.CheckLevel var5 = null;
    var0.setCheckGlobalThisLevel(var5);
    var0.setAliasExternals(true);
    var0.setLocale("(module$JSDocInfo)");

  }

  public void test457() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test457"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setCollapseProperties(false);
    var0.enableExternExports(false);
    com.google.javascript.jscomp.CheckLevel var5 = null;
    var0.setReportMissingOverride(var5);
    var0.setExternExportsPath("goog.abstractMethod");

  }

  public void test458() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test458"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    boolean var1 = var0.isDirected();
    java.util.List var2 = var0.getEdges();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var3 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.util.List var4 = var3.getEdges();
    com.google.javascript.jscomp.ClosureCodingConvention var5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.labelName("hi!");
    int var8 = var7.getChildCount();
    java.lang.String var9 = var7.getSourceFileName();
    com.google.javascript.jscomp.CodingConvention.Bind var11 = var5.describeFunctionBind(var7, true);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.labelName("hi!");
    int var14 = var13.getChildCount();
    java.lang.String var15 = var13.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var16 = null;
    var13.setStaticSourceFile(var16);
    boolean var18 = var13.isAnd();
    boolean var19 = var13.isTry();
    com.google.javascript.jscomp.CodingConvention.Bind var21 = var5.describeFunctionBind(var13, false);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.labelName("hi!");
    int var29 = var28.getChildCount();
    com.google.javascript.rhino.jstype.JSType var30 = var28.getJSType();
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.labelName("hi!");
    int var33 = var32.getChildCount();
    java.lang.String var34 = var32.getSourceFileName();
    com.google.javascript.rhino.Node var37 = new com.google.javascript.rhino.Node(153, var26, var28, var32, 0, 153);
    java.lang.Iterable var38 = var32.siblings();
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.labelName("hi!");
    int var46 = var45.getChildCount();
    com.google.javascript.rhino.jstype.JSType var47 = var45.getJSType();
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.labelName("hi!");
    int var50 = var49.getChildCount();
    java.lang.String var51 = var49.getSourceFileName();
    com.google.javascript.rhino.Node var54 = new com.google.javascript.rhino.Node(153, var43, var45, var49, 0, 153);
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.labelName("hi!");
    int var57 = var56.getChildCount();
    java.lang.String var58 = var56.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var59 = null;
    var56.setStaticSourceFile(var59);
    boolean var61 = var56.isAnd();
    boolean var62 = var56.isEmpty();
    boolean var63 = var49.hasChild(var56);
    boolean var64 = var49.isLocalResultCall();
    java.lang.String var65 = var5.extractClassNameIfRequire(var32, var49);
    java.lang.String var66 = var5.getExportPropertyFunction();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var67 = var3.createDirectedGraphNode((java.lang.Object)var5);
    java.util.List var68 = var0.getNeighborNodes(var67);
    var0.pushNodeAnnotations();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var70 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    boolean var71 = var70.isDirected();
    java.lang.String var72 = var70.getName();
    com.google.javascript.jscomp.ClosureCodingConvention var73 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var75 = com.google.javascript.rhino.IR.labelName("hi!");
    int var76 = var75.getChildCount();
    java.lang.String var77 = var75.getSourceFileName();
    com.google.javascript.jscomp.CodingConvention.Bind var79 = var73.describeFunctionBind(var75, true);
    com.google.javascript.jscomp.CompilerOptions var80 = new com.google.javascript.jscomp.CompilerOptions();
    var80.setCollapseProperties(false);
    var80.enableExternExports(false);
    com.google.javascript.jscomp.CheckLevel var85 = null;
    var80.setReportMissingOverride(var85);
    var80.setSpecializeInitialModule(true);
    var80.setNameAnonymousFunctionsOnly(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var91 = var0.isConnectedInDirection((java.lang.Object)var72, (java.lang.Object)var73, (java.lang.Object)var80);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "goog.exportProperty"+ "'", var66.equals("goog.exportProperty"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "LinkedGraph"+ "'", var72.equals("LinkedGraph"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);

  }

  public void test459() {}
//   public void test459() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test459"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     var1.disableThreads();
//     java.io.PrintStream var13 = null;
//     com.google.javascript.jscomp.Compiler var14 = new com.google.javascript.jscomp.Compiler(var13);
//     com.google.javascript.rhino.JSDocInfo var15 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var17 = var15.hasParameter("");
//     java.util.List var18 = var15.getImplementedInterfaces();
//     java.lang.String var19 = var15.getOriginalCommentString();
//     java.lang.String var20 = var15.toString();
//     java.lang.String var21 = var15.getLicense();
//     java.util.List var22 = var15.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var23 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var14, var22, var23);
//     com.google.javascript.jscomp.deps.SortedDependencies var25 = new com.google.javascript.jscomp.deps.SortedDependencies(var22);
//     java.util.List var26 = var25.getInputsWithoutProvides();
//     com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.paramList(var26);
//     com.google.javascript.jscomp.NodeTraversal.Callback var28 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var26, var28);
//     com.google.javascript.jscomp.JSModule var31 = new com.google.javascript.jscomp.JSModule("LABEL_NAME hi!");
//     int var32 = var31.getDepth();
//     java.lang.String[] var33 = var1.toSourceArray(var31);
// 
//   }

  public void test460() {}
//   public void test460() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test460"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var3 = var2.getChildCount();
//     java.lang.String var4 = var2.getSourceFileName();
//     com.google.javascript.jscomp.CodingConvention.Bind var6 = var0.describeFunctionBind(var2, true);
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var9 = var8.getChildCount();
//     java.lang.String var10 = var8.getSourceFileName();
//     com.google.javascript.rhino.jstype.StaticSourceFile var11 = null;
//     var8.setStaticSourceFile(var11);
//     boolean var13 = var8.isAnd();
//     boolean var14 = var8.isTry();
//     com.google.javascript.jscomp.CodingConvention.Bind var16 = var0.describeFunctionBind(var8, false);
//     com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
//     com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var24 = var23.getChildCount();
//     com.google.javascript.rhino.jstype.JSType var25 = var23.getJSType();
//     com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var28 = var27.getChildCount();
//     java.lang.String var29 = var27.getSourceFileName();
//     com.google.javascript.rhino.Node var32 = new com.google.javascript.rhino.Node(153, var21, var23, var27, 0, 153);
//     java.lang.Iterable var33 = var27.siblings();
//     com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
//     com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var41 = var40.getChildCount();
//     com.google.javascript.rhino.jstype.JSType var42 = var40.getJSType();
//     com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var45 = var44.getChildCount();
//     java.lang.String var46 = var44.getSourceFileName();
//     com.google.javascript.rhino.Node var49 = new com.google.javascript.rhino.Node(153, var38, var40, var44, 0, 153);
//     com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var52 = var51.getChildCount();
//     java.lang.String var53 = var51.getSourceFileName();
//     com.google.javascript.rhino.jstype.StaticSourceFile var54 = null;
//     var51.setStaticSourceFile(var54);
//     boolean var56 = var51.isAnd();
//     boolean var57 = var51.isEmpty();
//     boolean var58 = var44.hasChild(var51);
//     boolean var59 = var44.isLocalResultCall();
//     java.lang.String var60 = var0.extractClassNameIfRequire(var27, var44);
//     java.lang.String var61 = var0.getExportPropertyFunction();
//     java.util.Collection var62 = var0.getIndirectlyDeclaredProperties();
//     com.google.javascript.rhino.Node var66 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, 1);
//     com.google.javascript.jscomp.CodingConvention.SubclassRelationship var67 = var0.getClassesDefinedByCall(var66);
// 
//   }

  public void test461() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test461"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.lang.String var1 = var0.getName();
    com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromFile("module$JSDocInfo");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var4 = var0.getInEdges((java.lang.Object)"module$JSDocInfo");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "LinkedGraph"+ "'", var1.equals("LinkedGraph"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test462() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test462"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.block();
    com.google.javascript.rhino.jstype.JSType var1 = var0.getJSType();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.defaultCase(var0);
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.continueNode();
    boolean var4 = var3.isTry();
    int var5 = var3.getChildCount();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.script();
    boolean var7 = var6.isSyntheticBlock();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.addChildrenAfter(var3, var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test463() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test463"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.continueNode();
    boolean var1 = var0.isOptionalArg();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSideEffectFlags((-2147483647));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test464() {}
//   public void test464() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test464"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     com.google.javascript.rhino.jstype.JSType var2 = null;
//     com.google.javascript.rhino.JSDocInfo var3 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var5 = var3.hasParameter("");
//     java.util.List var6 = var3.getImplementedInterfaces();
//     java.lang.String var7 = var3.getOriginalCommentString();
//     java.lang.String var8 = var3.toString();
//     java.util.Collection var9 = var3.getAuthors();
//     java.lang.String var10 = var3.getVersion();
//     java.util.List var11 = var3.getImplementedInterfaces();
//     com.google.javascript.jscomp.JSModule[] var12 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var11);
//     com.google.javascript.rhino.jstype.FunctionType var13 = var1.createFunctionType(var2, var11);
//     boolean var14 = var13.isUnknownType();
//     com.google.javascript.rhino.jstype.FunctionType var15 = var13.toMaybeFunctionType();
//     com.google.common.collect.ImmutableList var16 = var15.getTemplateTypeNames();
//     com.google.common.base.Predicate var17 = null;
//     boolean var18 = var15.setValidator(var17);
// 
//   }

  public void test465() {}
//   public void test465() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test465"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
//     java.util.List var1 = var0.getEdges();
//     com.google.javascript.jscomp.ClosureCodingConvention var2 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var5 = var4.getChildCount();
//     java.lang.String var6 = var4.getSourceFileName();
//     com.google.javascript.jscomp.CodingConvention.Bind var8 = var2.describeFunctionBind(var4, true);
//     com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var11 = var10.getChildCount();
//     java.lang.String var12 = var10.getSourceFileName();
//     com.google.javascript.rhino.jstype.StaticSourceFile var13 = null;
//     var10.setStaticSourceFile(var13);
//     boolean var15 = var10.isAnd();
//     boolean var16 = var10.isTry();
//     com.google.javascript.jscomp.CodingConvention.Bind var18 = var2.describeFunctionBind(var10, false);
//     com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
//     com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var26 = var25.getChildCount();
//     com.google.javascript.rhino.jstype.JSType var27 = var25.getJSType();
//     com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var30 = var29.getChildCount();
//     java.lang.String var31 = var29.getSourceFileName();
//     com.google.javascript.rhino.Node var34 = new com.google.javascript.rhino.Node(153, var23, var25, var29, 0, 153);
//     java.lang.Iterable var35 = var29.siblings();
//     com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
//     com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var43 = var42.getChildCount();
//     com.google.javascript.rhino.jstype.JSType var44 = var42.getJSType();
//     com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var47 = var46.getChildCount();
//     java.lang.String var48 = var46.getSourceFileName();
//     com.google.javascript.rhino.Node var51 = new com.google.javascript.rhino.Node(153, var40, var42, var46, 0, 153);
//     com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var54 = var53.getChildCount();
//     java.lang.String var55 = var53.getSourceFileName();
//     com.google.javascript.rhino.jstype.StaticSourceFile var56 = null;
//     var53.setStaticSourceFile(var56);
//     boolean var58 = var53.isAnd();
//     boolean var59 = var53.isEmpty();
//     boolean var60 = var46.hasChild(var53);
//     boolean var61 = var46.isLocalResultCall();
//     java.lang.String var62 = var2.extractClassNameIfRequire(var29, var46);
//     java.lang.String var63 = var2.getExportPropertyFunction();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var64 = var0.createDirectedGraphNode((java.lang.Object)var2);
//     java.lang.String var65 = var2.getAbstractMethodName();
//     boolean var67 = var2.isSuperClassReference("STRING module$ 100");
//     com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.IR.number(0.0d);
//     com.google.javascript.jscomp.CodingConvention.SubclassRelationship var70 = var2.getClassesDefinedByCall(var69);
// 
//   }

  public void test466() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test466"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    boolean var2 = var0.hasParameter("");
    var0.setDeprecated(true);
    com.google.javascript.rhino.JSTypeExpression var5 = var0.getTypedefType();
    boolean var7 = var0.hasParameter("null(null)");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test467() {}
//   public void test467() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test467"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     java.util.Set var1 = null;
//     var0.setStripTypePrefixes(var1);
//     var0.setDeadAssignmentElimination(false);
//     var0.setInlineConstantVars(true);
//     var0.setPreferLineBreakAtEndOfFile(false);
//     var0.setTransformAMDToCJSModules(false);
//     var0.setUnaliasableGlobals("function (): ?");
//     com.google.javascript.jscomp.CompilerOptions.Reach var13 = null;
//     var0.setInlineFunctions(var13);
// 
//   }

  public void test468() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test468"); }


    com.google.javascript.rhino.Node var1 = new com.google.javascript.rhino.Node(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var2 = var1.detachFromParent();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test469() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test469"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.util.List var1 = var0.getEdges();
    var0.pushNodeAnnotations();
    com.google.javascript.jscomp.ClosureCodingConvention var3 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.labelName("hi!");
    int var6 = var5.getChildCount();
    java.lang.String var7 = var5.getSourceFileName();
    com.google.javascript.jscomp.CodingConvention.Bind var9 = var3.describeFunctionBind(var5, true);
    java.lang.String var10 = var3.getAbstractMethodName();
    com.google.javascript.rhino.JSDocInfo var11 = new com.google.javascript.rhino.JSDocInfo();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var13 = var12.cloneTree();
    var11.setAssociatedNode(var13);
    var13.setWasEmptyNode(false);
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.labelName("hi!");
    int var19 = var18.getChildCount();
    java.lang.String var20 = var18.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var21 = var18.getStaticSourceFile();
    boolean var22 = var18.isIn();
    java.lang.String var23 = var3.extractClassNameIfProvide(var13, var18);
    java.lang.String var24 = var3.getAbstractMethodName();
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.block();
    com.google.javascript.rhino.jstype.JSType var27 = var26.getJSType();
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.defaultCase(var26);
    boolean var29 = var28.isCase();
    com.google.javascript.rhino.Node var32 = new com.google.javascript.rhino.Node(0, var28, 0, 100);
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.continueNode();
    com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.IR.falseNode();
    com.google.javascript.rhino.Node var35 = var33.useSourceInfoFromForTree(var34);
    boolean var36 = var34.isFunction();
    java.lang.Iterable var37 = var34.children();
    java.lang.String var38 = var3.extractClassNameIfRequire(var28, var34);
    com.google.javascript.rhino.ErrorReporter var39 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var39);
    com.google.javascript.rhino.jstype.JSType var41 = null;
    com.google.javascript.rhino.JSDocInfo var42 = new com.google.javascript.rhino.JSDocInfo();
    boolean var44 = var42.hasParameter("");
    java.util.List var45 = var42.getImplementedInterfaces();
    java.lang.String var46 = var42.getOriginalCommentString();
    java.lang.String var47 = var42.toString();
    java.util.Collection var48 = var42.getAuthors();
    java.lang.String var49 = var42.getVersion();
    java.util.List var50 = var42.getImplementedInterfaces();
    com.google.javascript.jscomp.JSModule[] var51 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var50);
    com.google.javascript.rhino.jstype.FunctionType var52 = var40.createFunctionType(var41, var50);
    boolean var53 = var52.isUnknownType();
    com.google.javascript.rhino.jstype.FunctionType var54 = var52.toMaybeFunctionType();
    com.google.common.collect.ImmutableList var55 = var54.getTemplateTypeNames();
    com.google.common.collect.ImmutableList var56 = var54.getTemplateTypeNames();
    com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.paramList((java.util.List)var56);
    boolean var58 = var57.isScript();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.graph.Graph.GraphEdge var59 = var0.getFirstEdge((java.lang.Object)var3, (java.lang.Object)var58);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "goog.abstractMethod"+ "'", var10.equals("goog.abstractMethod"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "goog.abstractMethod"+ "'", var24.equals("goog.abstractMethod"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "JSDocInfo"+ "'", var47.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
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

  }

  public void test470() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test470"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    boolean var1 = var0.isDirected();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.labelName("hi!");
    int var4 = var3.getChildCount();
    java.lang.String var5 = var3.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var6 = null;
    var3.setStaticSourceFile(var6);
    com.google.javascript.rhino.JSTypeExpression var9 = new com.google.javascript.rhino.JSTypeExpression(var3, "hi!");
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var10 = var0.getDirectedGraphNode((java.lang.Object)"hi!");
    java.lang.Object var11 = null;
    com.google.javascript.jscomp.JSModule var13 = new com.google.javascript.jscomp.JSModule("LABEL_NAME hi!");
    var13.setDepth(153);
    var13.removeAll();
    java.util.List var17 = var13.getProvides();
    java.util.List var18 = var13.getInputs();
    com.google.javascript.jscomp.SourceFile var22 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
    java.lang.String var23 = var22.getOriginalPath();
    boolean var24 = var22.isExtern();
    com.google.javascript.jscomp.CompilerInput var26 = new com.google.javascript.jscomp.CompilerInput(var22, true);
    var13.remove(var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var28 = var0.getEdges(var11, (java.lang.Object)var13);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "module$"+ "'", var23.equals("module$"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test471() {}
//   public void test471() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test471"); }
// 
// 
//     java.io.InputStream var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromInputStream("goog.exportSymbol", var1);
// 
//   }

  public void test472() {}
//   public void test472() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test472"); }
// 
// 
//     java.lang.String var0 = com.google.javascript.jscomp.Compiler.getReleaseDate();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var0 + "' != '" + "2014/12/23 22:07"+ "'", var0.equals("2014/12/23 22:07"));
// 
//   }

  public void test473() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test473"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    int var2 = var1.getChildCount();
    java.lang.String var3 = com.google.javascript.jscomp.NodeUtil.getSourceName(var1);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.labelName("hi!");
    int var6 = var5.getChildCount();
    com.google.javascript.rhino.jstype.JSType var7 = var5.getJSType();
    int var8 = var5.getType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.propdef(var1, var5);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 153);

  }

  public void test474() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test474"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.ErrorReporter var2 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    com.google.javascript.rhino.JSDocInfo var5 = new com.google.javascript.rhino.JSDocInfo();
    boolean var7 = var5.hasParameter("");
    java.util.List var8 = var5.getImplementedInterfaces();
    java.lang.String var9 = var5.getOriginalCommentString();
    java.lang.String var10 = var5.toString();
    java.util.Collection var11 = var5.getAuthors();
    java.lang.String var12 = var5.getVersion();
    java.util.List var13 = var5.getImplementedInterfaces();
    com.google.javascript.jscomp.JSModule[] var14 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var13);
    com.google.javascript.rhino.jstype.FunctionType var15 = var3.createFunctionType(var4, var13);
    boolean var16 = var15.isConstructor();
    java.lang.Iterable var17 = var15.getAllExtendedInterfaces();
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.labelName("hi!");
    int var25 = var24.getChildCount();
    com.google.javascript.rhino.jstype.JSType var26 = var24.getJSType();
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.labelName("hi!");
    int var29 = var28.getChildCount();
    java.lang.String var30 = var28.getSourceFileName();
    com.google.javascript.rhino.Node var33 = new com.google.javascript.rhino.Node(153, var22, var24, var28, 0, 153);
    com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.labelName("hi!");
    int var36 = var35.getChildCount();
    java.lang.String var37 = var35.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var38 = null;
    var35.setStaticSourceFile(var38);
    boolean var40 = var35.isAnd();
    boolean var41 = var35.isEmpty();
    boolean var42 = var28.hasChild(var35);
    boolean var43 = var35.isHook();
    java.lang.String var44 = com.google.javascript.jscomp.NodeUtil.getSourceName(var35);
    com.google.javascript.rhino.jstype.FunctionType var45 = var1.createFunctionType((com.google.javascript.rhino.jstype.JSType)var15, var35);
    com.google.javascript.rhino.Node[] var46 = new com.google.javascript.rhino.Node[] { var35};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.block(var46);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "JSDocInfo"+ "'", var10.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test475() {}
//   public void test475() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test475"); }
// 
// 
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("module$");
//     var2.putIntProp(0, 1);
//     com.google.javascript.rhino.Node var6 = null;
//     com.google.javascript.rhino.Node var7 = new com.google.javascript.rhino.Node(0, var2, var6);
// 
//   }

  public void test476() {}
//   public void test476() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test476"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     java.lang.String var12 = var1.getAstDotGraph();
//     com.google.javascript.jscomp.CompilerOptions var13 = new com.google.javascript.jscomp.CompilerOptions();
//     var13.setCollapseProperties(false);
//     var13.enableExternExports(false);
//     var13.setAliasExternals(false);
//     com.google.javascript.jscomp.CodingConvention var20 = var13.getCodingConvention();
//     var13.setOutputJsStringUsage(true);
//     var13.setRemoveUnusedVars(true);
//     var13.setAcceptConstKeyword(false);
//     com.google.javascript.jscomp.DefaultPassConfig var27 = new com.google.javascript.jscomp.DefaultPassConfig(var13);
//     var1.setPassConfig((com.google.javascript.jscomp.PassConfig)var27);
//     com.google.javascript.jscomp.NodeTraversal.Callback var29 = null;
//     com.google.javascript.jscomp.NodeTraversal var30 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var1, var29);
//     var1.check();
// 
//   }

  public void test477() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test477"); }


    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.Node.newString(0, "", 1, 153);
    com.google.javascript.rhino.Node[] var6 = new com.google.javascript.rhino.Node[] { var5};
    com.google.javascript.rhino.Node var7 = new com.google.javascript.rhino.Node(0, var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.arraylit(var6);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test478() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test478"); }


    com.google.javascript.rhino.Node var0 = null;
    java.lang.String var1 = com.google.javascript.jscomp.NodeUtil.getSourceName(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test479() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test479"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.PropertyRenamingPolicy var1 = com.google.javascript.jscomp.PropertyRenamingPolicy.valueOf("STRING module$ 100");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test480() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test480"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("hi!");
    int var3 = var2.getChildCount();
    java.lang.String var4 = var2.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var5 = var2.getStaticSourceFile();
    boolean var6 = var2.isQualifiedName();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    var10.putBooleanProp(0, false);
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.labelName("hi!");
    int var21 = var20.getChildCount();
    com.google.javascript.rhino.jstype.JSType var22 = var20.getJSType();
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.labelName("hi!");
    int var25 = var24.getChildCount();
    java.lang.String var26 = var24.getSourceFileName();
    com.google.javascript.rhino.Node var29 = new com.google.javascript.rhino.Node(153, var18, var20, var24, 0, 153);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.labelName("hi!");
    int var32 = var31.getChildCount();
    java.lang.String var33 = var31.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var34 = null;
    var31.setStaticSourceFile(var34);
    boolean var36 = var31.isAnd();
    boolean var37 = var31.isEmpty();
    boolean var38 = var24.hasChild(var31);
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.labelName("hi!");
    int var41 = var40.getChildCount();
    com.google.javascript.rhino.jstype.JSType var42 = var40.getJSType();
    int var43 = var40.getType();
    com.google.javascript.rhino.Node var44 = var40.cloneTree();
    com.google.javascript.rhino.Node var47 = new com.google.javascript.rhino.Node((-1), var2, var10, var31, var40, 100, 10);
    boolean var48 = var2.isBlock();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.block(var2);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test481() {}
//   public void test481() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test481"); }
// 
// 
//     com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("LABEL_NAME hi!");
//     var1.setDepth(153);
//     com.google.javascript.jscomp.SourceFile var7 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
//     com.google.javascript.jscomp.CompilerInput var8 = new com.google.javascript.jscomp.CompilerInput(var7);
//     com.google.javascript.rhino.InputId var9 = null;
//     com.google.javascript.jscomp.CompilerInput var11 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var8, var9, false);
//     var1.addFirst(var8);
//     java.io.PrintStream var13 = null;
//     com.google.javascript.jscomp.Compiler var14 = new com.google.javascript.jscomp.Compiler(var13);
//     com.google.javascript.jscomp.SourceMap var15 = var14.getSourceMap();
//     var8.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var14);
//     java.lang.String var19 = var14.getSourceLine("hi!", 153);
// 
//   }

  public void test482() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test482"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.ErrorReporter var2 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    com.google.javascript.rhino.JSDocInfo var5 = new com.google.javascript.rhino.JSDocInfo();
    boolean var7 = var5.hasParameter("");
    java.util.List var8 = var5.getImplementedInterfaces();
    java.lang.String var9 = var5.getOriginalCommentString();
    java.lang.String var10 = var5.toString();
    java.util.Collection var11 = var5.getAuthors();
    java.lang.String var12 = var5.getVersion();
    java.util.List var13 = var5.getImplementedInterfaces();
    com.google.javascript.jscomp.JSModule[] var14 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var13);
    com.google.javascript.rhino.jstype.FunctionType var15 = var3.createFunctionType(var4, var13);
    boolean var16 = var15.isConstructor();
    java.lang.Iterable var17 = var15.getAllExtendedInterfaces();
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.labelName("hi!");
    int var25 = var24.getChildCount();
    com.google.javascript.rhino.jstype.JSType var26 = var24.getJSType();
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.labelName("hi!");
    int var29 = var28.getChildCount();
    java.lang.String var30 = var28.getSourceFileName();
    com.google.javascript.rhino.Node var33 = new com.google.javascript.rhino.Node(153, var22, var24, var28, 0, 153);
    com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.labelName("hi!");
    int var36 = var35.getChildCount();
    java.lang.String var37 = var35.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var38 = null;
    var35.setStaticSourceFile(var38);
    boolean var40 = var35.isAnd();
    boolean var41 = var35.isEmpty();
    boolean var42 = var28.hasChild(var35);
    boolean var43 = var35.isHook();
    java.lang.String var44 = com.google.javascript.jscomp.NodeUtil.getSourceName(var35);
    com.google.javascript.rhino.jstype.FunctionType var45 = var1.createFunctionType((com.google.javascript.rhino.jstype.JSType)var15, var35);
    var1.forwardDeclareType("Node tree inequality:\nTree1:\nLABEL_NAME hi!\n\n\nTree2:\nNAME . hi! at (unknown source) line (unknown line) : (unknown column)\n\n\nSubtree1: LABEL_NAME hi!\n\n\nSubtree2: NAME . hi! at (unknown source) line (unknown line) : (unknown column)\n");
    com.google.javascript.rhino.ErrorReporter var49 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var49);
    com.google.javascript.rhino.jstype.JSType var51 = null;
    com.google.javascript.rhino.JSDocInfo var52 = new com.google.javascript.rhino.JSDocInfo();
    boolean var54 = var52.hasParameter("");
    java.util.List var55 = var52.getImplementedInterfaces();
    java.lang.String var56 = var52.getOriginalCommentString();
    java.lang.String var57 = var52.toString();
    java.util.Collection var58 = var52.getAuthors();
    java.lang.String var59 = var52.getVersion();
    java.util.List var60 = var52.getImplementedInterfaces();
    com.google.javascript.jscomp.JSModule[] var61 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var60);
    com.google.javascript.rhino.jstype.FunctionType var62 = var50.createFunctionType(var51, var60);
    com.google.javascript.rhino.jstype.JSType var63 = var62.getParameterType();
    boolean var64 = var62.isRecordType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.overwriteDeclaredType("goog.exportSymbol", (com.google.javascript.rhino.jstype.JSType)var62);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "JSDocInfo"+ "'", var10.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "JSDocInfo"+ "'", var57.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);

  }

  public void test483() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test483"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
    boolean var4 = var2.hasParameter("");
    java.util.List var5 = var2.getImplementedInterfaces();
    java.lang.String var6 = var2.getOriginalCommentString();
    java.lang.String var7 = var2.toString();
    java.lang.String var8 = var2.getLicense();
    java.util.List var9 = var2.getImplementedInterfaces();
    com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
    var1.disableThreads();
    java.io.PrintStream var13 = null;
    com.google.javascript.jscomp.Compiler var14 = new com.google.javascript.jscomp.Compiler(var13);
    com.google.javascript.rhino.JSDocInfo var15 = new com.google.javascript.rhino.JSDocInfo();
    boolean var17 = var15.hasParameter("");
    java.util.List var18 = var15.getImplementedInterfaces();
    java.lang.String var19 = var15.getOriginalCommentString();
    java.lang.String var20 = var15.toString();
    java.lang.String var21 = var15.getLicense();
    java.util.List var22 = var15.getImplementedInterfaces();
    com.google.javascript.jscomp.NodeTraversal.Callback var23 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var14, var22, var23);
    com.google.javascript.jscomp.deps.SortedDependencies var25 = new com.google.javascript.jscomp.deps.SortedDependencies(var22);
    java.util.List var26 = var25.getInputsWithoutProvides();
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.paramList(var26);
    com.google.javascript.jscomp.NodeTraversal.Callback var28 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var26, var28);
    com.google.javascript.jscomp.ErrorManager var30 = var1.getErrorManager();
    com.google.javascript.jscomp.JSModule var32 = new com.google.javascript.jscomp.JSModule("LABEL_NAME hi!");
    var32.setDepth(153);
    var32.removeAll();
    java.util.Set var36 = var32.getThisAndAllDependencies();
    java.util.List var37 = var32.getProvides();
    com.google.javascript.rhino.JSDocInfo var40 = new com.google.javascript.rhino.JSDocInfo();
    boolean var42 = var40.hasParameter("");
    java.util.List var43 = var40.getImplementedInterfaces();
    com.google.javascript.jscomp.CompilerOptions var44 = new com.google.javascript.jscomp.CompilerOptions();
    var44.setCollapseProperties(false);
    var44.setCollapseVariableDeclarations(false);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var49 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.util.List var50 = var49.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var51 = new com.google.javascript.jscomp.ComposeWarningsGuard(var50);
    var44.setSourceMapLocationMappings(var50);
    com.google.javascript.jscomp.deps.SimpleDependencyInfo var53 = new com.google.javascript.jscomp.deps.SimpleDependencyInfo("(LABEL_NAME hi!)", ": hi!", var43, var50);
    com.google.javascript.jscomp.CompilerOptions var54 = new com.google.javascript.jscomp.CompilerOptions();
    var54.setCollapseProperties(false);
    var54.enableRuntimeTypeCheck("JSDocInfo");
    var54.setPreferLineBreakAtEndOfFile(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.Result var61 = var1.<com.google.javascript.jscomp.SourceFile>compileModules(var37, var43, var54);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "JSDocInfo"+ "'", var7.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "JSDocInfo"+ "'", var20.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test484() {}
//   public void test484() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test484"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     com.google.javascript.jscomp.SourceMap var12 = var1.getSourceMap();
//     var1.disableThreads();
//     boolean var14 = var1.isIdeMode();
// 
//   }

  public void test485() {}
//   public void test485() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test485"); }
// 
// 
//     com.google.javascript.rhino.jstype.JSTypeRegistry var0 = null;
//     com.google.javascript.rhino.jstype.FunctionBuilder var1 = new com.google.javascript.rhino.jstype.FunctionBuilder(var0);
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var4 = var3.getChildCount();
//     java.lang.String var5 = var3.getSourceFileName();
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var8 = var7.getChildCount();
//     java.lang.String var9 = var7.getSourceFileName();
//     com.google.javascript.rhino.jstype.StaticSourceFile var10 = null;
//     var7.setStaticSourceFile(var10);
//     com.google.javascript.rhino.JSTypeExpression var13 = new com.google.javascript.rhino.JSTypeExpression(var7, "hi!");
//     boolean var14 = var7.isNull();
//     com.google.javascript.rhino.Node var15 = var3.clonePropsFrom(var7);
//     boolean var16 = var7.isInc();
//     com.google.javascript.rhino.jstype.FunctionBuilder var17 = var1.withSourceNode(var7);
//     com.google.javascript.rhino.jstype.JSType var18 = null;
//     com.google.javascript.rhino.jstype.FunctionBuilder var19 = var1.withInferredReturnType(var18);
//     com.google.javascript.rhino.ErrorReporter var20 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var20);
//     com.google.javascript.rhino.jstype.JSType var22 = null;
//     com.google.javascript.rhino.JSDocInfo var23 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var25 = var23.hasParameter("");
//     java.util.List var26 = var23.getImplementedInterfaces();
//     java.lang.String var27 = var23.getOriginalCommentString();
//     java.lang.String var28 = var23.toString();
//     java.util.Collection var29 = var23.getAuthors();
//     java.lang.String var30 = var23.getVersion();
//     java.util.List var31 = var23.getImplementedInterfaces();
//     com.google.javascript.jscomp.JSModule[] var32 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var31);
//     com.google.javascript.rhino.jstype.FunctionType var33 = var21.createFunctionType(var22, var31);
//     boolean var34 = var33.isConstructor();
//     com.google.javascript.rhino.jstype.FunctionBuilder var35 = var1.withReturnType((com.google.javascript.rhino.jstype.JSType)var33);
//     com.google.javascript.rhino.jstype.JSType var36 = null;
//     com.google.javascript.rhino.jstype.JSType.TypePair var37 = var33.getTypesUnderEquality(var36);
// 
//   }

  public void test486() {}
//   public void test486() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test486"); }
// 
// 
//     com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("LABEL_NAME hi!");
//     var1.setDepth(153);
//     com.google.javascript.jscomp.SourceFile var7 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
//     com.google.javascript.jscomp.CompilerInput var8 = new com.google.javascript.jscomp.CompilerInput(var7);
//     com.google.javascript.rhino.InputId var9 = null;
//     com.google.javascript.jscomp.CompilerInput var11 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var8, var9, false);
//     var1.addFirst(var8);
//     com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.falseNode();
//     com.google.javascript.jscomp.SourceFile var17 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
//     com.google.javascript.jscomp.CompilerInput var18 = new com.google.javascript.jscomp.CompilerInput(var17);
//     var13.setStaticSourceFile((com.google.javascript.rhino.jstype.StaticSourceFile)var17);
//     var1.add(var17);
//     java.lang.String var21 = var17.getCode();
//     com.google.javascript.jscomp.JsAst var22 = new com.google.javascript.jscomp.JsAst(var17);
//     java.io.PrintStream var23 = null;
//     com.google.javascript.jscomp.Compiler var24 = new com.google.javascript.jscomp.Compiler(var23);
//     com.google.javascript.rhino.JSDocInfo var25 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var27 = var25.hasParameter("");
//     java.util.List var28 = var25.getImplementedInterfaces();
//     java.lang.String var29 = var25.getOriginalCommentString();
//     java.lang.String var30 = var25.toString();
//     java.lang.String var31 = var25.getLicense();
//     java.util.List var32 = var25.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var33 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var24, var32, var33);
//     com.google.javascript.jscomp.SourceMap var35 = var24.getSourceMap();
//     com.google.javascript.jscomp.Scope var36 = var24.getTopScope();
//     com.google.javascript.rhino.Node var37 = var22.getAstRoot((com.google.javascript.jscomp.AbstractCompiler)var24);
// 
//   }

  public void test487() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test487"); }


    com.google.javascript.jscomp.VariableRenamingPolicy[] var0 = com.google.javascript.jscomp.VariableRenamingPolicy.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test488() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test488"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("module$", 100, 100);
    com.google.javascript.rhino.jstype.StaticSourceFile var4 = var3.getStaticSourceFile();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.stringKey("STRING module$ 100");
    boolean var8 = var6.getBooleanProp(153);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.and(var3, var6);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test489() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test489"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    boolean var2 = var0.hasParameter("");
    java.util.List var3 = var0.getImplementedInterfaces();
    java.lang.String var4 = var0.getOriginalCommentString();
    java.lang.String var5 = var0.toString();
    java.util.Collection var6 = var0.getAuthors();
    java.util.Collection var7 = var0.getMarkers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "JSDocInfo"+ "'", var5.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test490() {}
//   public void test490() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test490"); }
// 
// 
//     com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var7 = var6.getChildCount();
//     com.google.javascript.rhino.jstype.JSType var8 = var6.getJSType();
//     com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var11 = var10.getChildCount();
//     java.lang.String var12 = var10.getSourceFileName();
//     com.google.javascript.rhino.Node var15 = new com.google.javascript.rhino.Node(153, var4, var6, var10, 0, 153);
//     boolean var16 = var15.isNE();
//     boolean var17 = var15.isLocalResultCall();
//     com.google.javascript.rhino.Node.SideEffectFlags var18 = null;
//     var15.setSideEffectFlags(var18);
// 
//   }

  public void test491() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test491"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("LABEL_NAME hi!");
    var1.setDepth(153);
    var1.removeAll();
    java.util.Set var5 = var1.getThisAndAllDependencies();
    java.util.List var6 = var1.getProvides();
    com.google.javascript.jscomp.JSModule var8 = new com.google.javascript.jscomp.JSModule("LABEL_NAME hi!");
    var8.setDepth(153);
    com.google.javascript.jscomp.SourceFile var14 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
    com.google.javascript.jscomp.CompilerInput var15 = new com.google.javascript.jscomp.CompilerInput(var14);
    com.google.javascript.rhino.InputId var16 = null;
    com.google.javascript.jscomp.CompilerInput var18 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var15, var16, false);
    var8.addFirst(var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.add(var15);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test492"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("hi!");
    int var3 = var2.getChildCount();
    java.lang.String var4 = var2.getSourceFileName();
    com.google.javascript.jscomp.CodingConvention.Bind var6 = var0.describeFunctionBind(var2, true);
    com.google.javascript.rhino.Node var7 = null;
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.labelName("hi!");
    int var10 = var9.getChildCount();
    java.lang.String var11 = var9.getSourceFileName();
    com.google.javascript.rhino.jstype.StaticSourceFile var12 = null;
    var9.setStaticSourceFile(var12);
    boolean var14 = var9.isAnd();
    boolean var15 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(var9);
    java.lang.String var16 = var0.extractClassNameIfRequire(var7, var9);
    com.google.javascript.rhino.Node var21 = new com.google.javascript.rhino.Node(0, 10, 1);
    com.google.javascript.rhino.Node var22 = new com.google.javascript.rhino.Node(10, var21);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.labelName("hi!");
    int var30 = var29.getChildCount();
    com.google.javascript.rhino.jstype.JSType var31 = var29.getJSType();
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.labelName("hi!");
    int var34 = var33.getChildCount();
    java.lang.String var35 = var33.getSourceFileName();
    com.google.javascript.rhino.Node var38 = new com.google.javascript.rhino.Node(153, var27, var29, var33, 0, 153);
    boolean var39 = var27.isObjectLit();
    boolean var40 = var22.isEquivalentTo(var27);
    boolean var41 = var22.isIf();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast var42 = var0.getObjectLiteralCast(var22);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test493() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test493"); }


    long var1 = com.google.javascript.rhino.ScriptRuntime.testUint32String("(: hi!)");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test494() {}
//   public void test494() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test494"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var4 = var2.hasParameter("");
//     java.util.List var5 = var2.getImplementedInterfaces();
//     java.lang.String var6 = var2.getOriginalCommentString();
//     java.lang.String var7 = var2.toString();
//     java.lang.String var8 = var2.getLicense();
//     java.util.List var9 = var2.getImplementedInterfaces();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var9, var10);
//     java.lang.String var12 = var1.getAstDotGraph();
//     com.google.javascript.jscomp.CompilerOptions var13 = new com.google.javascript.jscomp.CompilerOptions();
//     var13.setCollapseProperties(false);
//     var13.enableExternExports(false);
//     var13.setAliasExternals(false);
//     com.google.javascript.jscomp.CodingConvention var20 = var13.getCodingConvention();
//     var13.setOutputJsStringUsage(true);
//     var13.setRemoveUnusedVars(true);
//     var13.setAcceptConstKeyword(false);
//     com.google.javascript.jscomp.DefaultPassConfig var27 = new com.google.javascript.jscomp.DefaultPassConfig(var13);
//     var1.setPassConfig((com.google.javascript.jscomp.PassConfig)var27);
//     com.google.javascript.jscomp.NodeTraversal.Callback var29 = null;
//     com.google.javascript.jscomp.NodeTraversal var30 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var1, var29);
//     com.google.javascript.jscomp.JSModule var31 = var30.getModule();
// 
//   }

  public void test495() {}
//   public void test495() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test495"); }
// 
// 
//     com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("LABEL_NAME hi!");
//     var1.setDepth(153);
//     com.google.javascript.jscomp.SourceFile var7 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
//     com.google.javascript.jscomp.CompilerInput var8 = new com.google.javascript.jscomp.CompilerInput(var7);
//     com.google.javascript.rhino.InputId var9 = null;
//     com.google.javascript.jscomp.CompilerInput var11 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var8, var9, false);
//     var8.clearAst();
//     com.google.javascript.jscomp.SourceFile var13 = var8.getSourceFile();
//     com.google.javascript.jscomp.JSModule var15 = new com.google.javascript.jscomp.JSModule("LABEL_NAME hi!");
//     var15.setDepth(153);
//     var8.setModule(var15);
//     var1.remove(var8);
//     java.util.Collection var20 = var8.getProvides();
// 
//   }

  public void test496() {}
//   public void test496() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test496"); }
// 
// 
//     com.google.javascript.jscomp.AstValidator.ViolationHandler var0 = null;
//     com.google.javascript.jscomp.AstValidator var1 = new com.google.javascript.jscomp.AstValidator(var0);
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.continueNode();
//     boolean var3 = var2.isTry();
//     com.google.javascript.rhino.jstype.StaticSourceFile var4 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var2);
//     boolean var5 = var2.isIf();
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var9 = var8.getChildCount();
//     java.lang.String var10 = var8.getSourceFileName();
//     com.google.javascript.rhino.jstype.StaticSourceFile var11 = var8.getStaticSourceFile();
//     boolean var12 = var8.isQualifiedName();
//     com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
//     var16.putBooleanProp(0, false);
//     com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
//     com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var27 = var26.getChildCount();
//     com.google.javascript.rhino.jstype.JSType var28 = var26.getJSType();
//     com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var31 = var30.getChildCount();
//     java.lang.String var32 = var30.getSourceFileName();
//     com.google.javascript.rhino.Node var35 = new com.google.javascript.rhino.Node(153, var24, var26, var30, 0, 153);
//     com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var38 = var37.getChildCount();
//     java.lang.String var39 = var37.getSourceFileName();
//     com.google.javascript.rhino.jstype.StaticSourceFile var40 = null;
//     var37.setStaticSourceFile(var40);
//     boolean var42 = var37.isAnd();
//     boolean var43 = var37.isEmpty();
//     boolean var44 = var30.hasChild(var37);
//     com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var47 = var46.getChildCount();
//     com.google.javascript.rhino.jstype.JSType var48 = var46.getJSType();
//     int var49 = var46.getType();
//     com.google.javascript.rhino.Node var50 = var46.cloneTree();
//     com.google.javascript.rhino.Node var53 = new com.google.javascript.rhino.Node((-1), var8, var16, var37, var46, 100, 10);
//     com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
//     com.google.javascript.rhino.Node var60 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var61 = var60.getChildCount();
//     com.google.javascript.rhino.jstype.JSType var62 = var60.getJSType();
//     com.google.javascript.rhino.Node var64 = com.google.javascript.rhino.IR.labelName("hi!");
//     int var65 = var64.getChildCount();
//     java.lang.String var66 = var64.getSourceFileName();
//     com.google.javascript.rhino.Node var69 = new com.google.javascript.rhino.Node(153, var58, var60, var64, 0, 153);
//     com.google.javascript.rhino.Node var70 = var53.srcrefTree(var69);
//     com.google.javascript.rhino.Node var71 = var2.clonePropsFrom(var70);
//     var1.validateScript(var2);
// 
//   }

  public void test497() {}
//   public void test497() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test497"); }
// 
// 
//     com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("LABEL_NAME hi!");
//     var1.setDepth(153);
//     var1.removeAll();
//     java.util.List var5 = var1.getProvides();
//     java.util.List var6 = var1.getInputs();
//     com.google.javascript.jscomp.SourceFile var10 = com.google.javascript.jscomp.SourceFile.fromCode("module$", "module$", "");
//     java.lang.String var11 = var10.getOriginalPath();
//     boolean var12 = var10.isExtern();
//     com.google.javascript.jscomp.CompilerInput var14 = new com.google.javascript.jscomp.CompilerInput(var10, true);
//     var1.remove(var14);
//     java.util.Collection var16 = var14.getProvides();
// 
//   }

  public void test498() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test498"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = com.google.javascript.rhino.ScriptRuntime.getMessage1("hi!", (java.lang.Object)'4');
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test499() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test499"); }


    java.lang.String var1 = com.google.javascript.rhino.ScriptRuntime.escapeString("STRING module$ 100");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "STRING module$ 100"+ "'", var1.equals("STRING module$ 100"));

  }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test500"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
    java.lang.String[] var4 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var5 = com.google.javascript.jscomp.JSError.make(var2, var4);
    com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
    java.lang.String var9 = var8.toString();
    com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
    java.lang.String[] var14 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var15 = com.google.javascript.jscomp.JSError.make(var12, var14);
    com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make(var8, var14);
    boolean var17 = var2.equals((java.lang.Object)var8);
    com.google.javascript.jscomp.DiagnosticType[] var18 = new com.google.javascript.jscomp.DiagnosticType[] { var2};
    com.google.javascript.jscomp.DiagnosticGroup var19 = new com.google.javascript.jscomp.DiagnosticGroup(var18);
    com.google.javascript.jscomp.CompilerOptions var20 = new com.google.javascript.jscomp.CompilerOptions();
    var20.setCollapseProperties(false);
    com.google.javascript.jscomp.StrictWarningsGuard var23 = new com.google.javascript.jscomp.StrictWarningsGuard();
    var20.addWarningsGuard((com.google.javascript.jscomp.WarningsGuard)var23);
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.Node.newString("module$", 100, 1);
    var29.putBooleanProp(0, false);
    com.google.javascript.jscomp.CheckLevel var33 = null;
    com.google.javascript.jscomp.DiagnosticType var36 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
    java.lang.String[] var38 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var39 = com.google.javascript.jscomp.JSError.make(var36, var38);
    com.google.javascript.jscomp.DiagnosticType var42 = com.google.javascript.jscomp.DiagnosticType.warning("", "hi!");
    java.lang.String[] var44 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make(var42, var44);
    com.google.javascript.jscomp.JSError var46 = com.google.javascript.jscomp.JSError.make("LABEL_NAME hi!\n", var29, var33, var36, var44);
    com.google.javascript.jscomp.CheckLevel var47 = var23.level(var46);
    boolean var48 = var19.matches(var46);
    com.google.javascript.jscomp.DiagnosticGroup[] var49 = new com.google.javascript.jscomp.DiagnosticGroup[] { var19};
    com.google.javascript.jscomp.DiagnosticGroup var50 = new com.google.javascript.jscomp.DiagnosticGroup(var49);
    java.lang.Iterable var51 = var50.getTypes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ": hi!"+ "'", var9.equals(": hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
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
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

}

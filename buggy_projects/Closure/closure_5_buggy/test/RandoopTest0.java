
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
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.regexp(var0);
// 
//   }

  public void test2() {}
//   public void test2() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }
// 
// 
//     com.google.javascript.rhino.jstype.ObjectType var0 = null;
//     com.google.javascript.rhino.jstype.ObjectType var2 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(var0, "");
// 
//   }

  public void test3() {}
//   public void test3() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
//     int var2 = var1.getType();
//     com.google.javascript.rhino.Node var3 = null;
//     var1.addChildrenToFront(var3);
// 
//   }

  public void test4() {}
//   public void test4() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "hi!");
// 
//   }

  public void test5() {}
//   public void test5() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var1 = new com.google.javascript.jscomp.CompilerInput(var0);
// 
//   }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    int var2 = var1.getChildCount();
    var1.setString("");
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.name("");
    int var7 = var6.getType();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var10 = null;
    boolean var11 = var9.hasChild(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addChildBefore(var6, var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test7() {}
//   public void test7() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }
// 
// 
//     java.util.Collection var0 = null;
//     com.google.javascript.jscomp.JSModule[] var1 = com.google.javascript.jscomp.JSModule.sortJsModules(var0);
// 
//   }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.String var1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "(hi!)"+ "'", var1.equals("(hi!)"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var2 = null;
    boolean var3 = var1.hasChild(var2);
    var1.setCharno((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setSideEffectFlags(0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test10() {}
//   public void test10() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
//     int var3 = var2.getChildCount();
//     var2.setString("");
//     var2.setCharno(1);
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.getprop(var0, var2);
// 
//   }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.PropertyRenamingPolicy var1 = com.google.javascript.jscomp.PropertyRenamingPolicy.valueOf("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var2 = null;
    boolean var3 = var1.hasChild(var2);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    com.google.javascript.rhino.Node var8 = var1.clonePropsFrom(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.setSideEffectFlags(0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test13() {}
//   public void test13() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var4 = null;
//     java.lang.String[] var6 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var7 = com.google.javascript.jscomp.JSError.make("", 38, 0, var3, var4, var6);
// 
//   }

  public void test14() {}
//   public void test14() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }
// 
// 
//     java.util.List var0 = null;
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.script(var0);
// 
//   }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var2 = null;
    boolean var3 = var1.hasChild(var2);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    com.google.javascript.rhino.Node var8 = var1.clonePropsFrom(var5);
    boolean var9 = var1.isRegExp();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
    int var12 = var11.getChildCount();
    com.google.javascript.rhino.Node[] var13 = new com.google.javascript.rhino.Node[] { var11};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.switchNode(var1, var13);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test16() {}
//   public void test16() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var2 = null;
//     boolean var3 = var1.hasChild(var2);
//     com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var6 = null;
//     boolean var7 = var5.hasChild(var6);
//     com.google.javascript.rhino.Node var8 = var1.clonePropsFrom(var5);
//     boolean var9 = var1.isRegExp();
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
//     int var12 = var11.getChildCount();
//     var11.setString("");
//     com.google.javascript.rhino.Node var15 = var1.useSourceInfoFromForTree(var11);
//     java.lang.String var19 = var1.toString(false, true, false);
//     com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var22 = null;
//     boolean var23 = var21.hasChild(var22);
//     com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.eq(var1, var22);
// 
//   }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var2 = null;
    boolean var3 = var1.hasChild(var2);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    com.google.javascript.rhino.Node var8 = var1.clonePropsFrom(var5);
    boolean var9 = var1.isRegExp();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
    int var12 = var11.getChildCount();
    var11.setString("");
    com.google.javascript.rhino.Node var15 = var1.useSourceInfoFromForTree(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.continueNode(var1);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var2 = null;
    boolean var3 = var1.hasChild(var2);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    com.google.javascript.rhino.Node var8 = var1.clonePropsFrom(var5);
    boolean var9 = var1.isRegExp();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
    int var12 = var11.getChildCount();
    var11.setString("");
    com.google.javascript.rhino.Node var15 = var1.useSourceInfoFromForTree(var11);
    com.google.javascript.rhino.InputId var16 = var11.getInputId();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var17 = var11.getDouble();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    int var2 = var1.getType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var3 = var1.detachFromParent();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 38);

  }

  public void test20() {}
//   public void test20() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }
// 
// 
//     com.google.javascript.jscomp.AstValidator.ViolationHandler var0 = null;
//     com.google.javascript.jscomp.AstValidator var1 = new com.google.javascript.jscomp.AstValidator(var0);
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var4 = null;
//     boolean var5 = var3.hasChild(var4);
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var8 = null;
//     boolean var9 = var7.hasChild(var8);
//     com.google.javascript.rhino.Node var10 = var3.clonePropsFrom(var7);
//     boolean var11 = var3.isVoid();
//     com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var14 = null;
//     boolean var15 = var13.hasChild(var14);
//     com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var18 = null;
//     boolean var19 = var17.hasChild(var18);
//     com.google.javascript.rhino.Node var20 = var13.clonePropsFrom(var17);
//     var1.process(var3, var20);
// 
//   }

  public void test21() {}
//   public void test21() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var3 = null;
//     java.lang.String[] var5 = new java.lang.String[] { "(hi!)"};
//     com.google.javascript.jscomp.JSError var6 = com.google.javascript.jscomp.JSError.make("", (-1), 0, var3, var5);
// 
//   }

  public void test22() {}
//   public void test22() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.InputId var2 = var1.getInputId();
//     com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
//     var1.removeChild(var4);
// 
//   }

  public void test23() {}
//   public void test23() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }
// 
// 
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var3 = null;
//     boolean var4 = var2.hasChild(var3);
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var7 = null;
//     boolean var8 = var6.hasChild(var7);
//     com.google.javascript.rhino.Node var9 = var2.clonePropsFrom(var6);
//     boolean var10 = var2.isRegExp();
//     com.google.javascript.jscomp.DiagnosticType var11 = null;
//     java.lang.String[] var13 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var14 = com.google.javascript.jscomp.JSError.make("", var2, var11, var13);
// 
//   }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var5 = null;
    boolean var6 = var4.hasChild(var5);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var9 = null;
    boolean var10 = var8.hasChild(var9);
    com.google.javascript.rhino.Node var11 = var4.clonePropsFrom(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.FunctionType var12 = var1.createInterfaceType("", var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test25() {}
//   public void test25() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     com.google.javascript.rhino.jstype.JSType[] var2 = null;
//     com.google.javascript.rhino.Node var3 = var1.createParameters(var2);
// 
//   }

  public void test26() {}
//   public void test26() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var1);
//     boolean var3 = var2.isExtern();
//     com.google.javascript.jscomp.Region var5 = var2.getRegion(10);
// 
//   }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.stringKey("(hi!)");
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

  public void test28() {}
//   public void test28() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }
// 
// 
//     com.google.javascript.jscomp.AbstractCompiler var0 = null;
//     com.google.javascript.jscomp.NodeTraversal.Callback var1 = null;
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var4 = null;
//     boolean var5 = var3.hasChild(var4);
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var8 = null;
//     boolean var9 = var7.hasChild(var8);
//     com.google.javascript.rhino.Node var10 = var3.clonePropsFrom(var7);
//     boolean var11 = var3.isRegExp();
//     boolean var12 = var3.isComma();
//     com.google.javascript.rhino.Node[] var13 = new com.google.javascript.rhino.Node[] { var3};
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots(var0, var1, var13);
// 
//   }

  public void test29() {}
//   public void test29() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var1);
//     java.lang.String var4 = var2.getLine(10);
// 
//   }

  public void test30() {}
//   public void test30() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }
// 
// 
//     com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
//     java.lang.String var1 = var0.getDelegateSuperclassName();
//     com.google.javascript.rhino.jstype.FunctionType var2 = null;
//     com.google.javascript.rhino.jstype.FunctionType var3 = null;
//     com.google.javascript.rhino.jstype.ObjectType var4 = null;
//     var0.applySingletonGetter(var2, var3, var4);
// 
//   }

  public void test31() {}
//   public void test31() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     com.google.javascript.rhino.jstype.FunctionBuilder var2 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
//     com.google.javascript.rhino.jstype.JSType var3 = null;
//     com.google.javascript.rhino.jstype.JSType var5 = null;
//     com.google.javascript.rhino.jstype.JSType[] var6 = new com.google.javascript.rhino.jstype.JSType[] { var5};
//     com.google.javascript.rhino.jstype.FunctionType var7 = var1.createConstructorType(var3, true, var6);
// 
//   }

  public void test32() {}
//   public void test32() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }
// 
// 
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var3 = null;
//     boolean var4 = var2.hasChild(var3);
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var7 = null;
//     boolean var8 = var6.hasChild(var7);
//     com.google.javascript.rhino.Node var9 = var2.clonePropsFrom(var6);
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.throwNode(var11);
//     com.google.javascript.rhino.Node var13 = var2.srcref(var12);
//     com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.name("");
//     int var16 = var15.getChildCount();
//     var15.setString("");
//     var15.setCharno(1);
//     com.google.javascript.rhino.Node var21 = var13.copyInformationFrom(var15);
//     com.google.javascript.jscomp.DiagnosticType var22 = null;
//     java.lang.String[] var23 = null;
//     com.google.javascript.jscomp.JSError var24 = com.google.javascript.jscomp.JSError.make("hi!", var15, var22, var23);
// 
//   }

  public void test33() {}
//   public void test33() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "NAME ", false);
//     var3.clearAst();
// 
//   }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var2 = null;
    boolean var3 = var1.hasChild(var2);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    com.google.javascript.rhino.Node var8 = var1.clonePropsFrom(var5);
    boolean var9 = var1.isRegExp();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
    int var12 = var11.getChildCount();
    var11.setString("");
    com.google.javascript.rhino.Node var15 = var1.useSourceInfoFromForTree(var11);
    boolean var16 = var15.isDec();
    com.google.javascript.rhino.Node var17 = null;
    boolean var18 = var15.hasChild(var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var15.setDouble(0.0d);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var2 = null;
    boolean var3 = var1.hasChild(var2);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    com.google.javascript.rhino.Node var8 = var1.clonePropsFrom(var5);
    boolean var9 = var1.isVoid();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.stringKey("(hi!)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.ifNode(var1, var11);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test36() {}
//   public void test36() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }
// 
// 
//     java.util.List var0 = null;
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.paramList(var0);
// 
//   }

  public void test37() {}
//   public void test37() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }
// 
// 
//     com.google.javascript.jscomp.AstValidator var0 = new com.google.javascript.jscomp.AstValidator();
//     com.google.javascript.rhino.Node var1 = null;
//     var0.validateStatement(var1);
// 
//   }

  public void test38() {}
//   public void test38() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var1);
//     boolean var3 = var2.isExtern();
//     int var5 = var2.getLineOfOffset(1);
// 
//   }

  public void test39() {}
//   public void test39() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var4 = null;
//     boolean var5 = var3.hasChild(var4);
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var8 = null;
//     boolean var9 = var7.hasChild(var8);
//     com.google.javascript.rhino.Node var10 = var3.clonePropsFrom(var7);
//     boolean var11 = var3.isRegExp();
//     com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.name("");
//     int var14 = var13.getChildCount();
//     var13.setString("");
//     com.google.javascript.rhino.Node var17 = var3.useSourceInfoFromForTree(var13);
//     boolean var18 = var17.isDec();
//     com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.jstype.StaticSourceFile var21 = var20.getStaticSourceFile();
//     com.google.javascript.rhino.Node var24 = new com.google.javascript.rhino.Node(10, var1, var17, var20, 38, 38);
// 
//   }

  public void test40() {}
//   public void test40() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }
// 
// 
//     java.util.List var0 = null;
//     com.google.javascript.jscomp.deps.SortedDependencies var1 = new com.google.javascript.jscomp.deps.SortedDependencies(var0);
// 
//   }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }


    com.google.javascript.rhino.jstype.JSType var0 = null;
    com.google.javascript.rhino.jstype.TemplateType var1 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test42() {}
//   public void test42() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     com.google.javascript.rhino.jstype.FunctionBuilder var2 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
//     java.util.List var3 = null;
//     var1.setTemplateTypeNames(var3);
// 
//   }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }


    com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.lang.String var1 = var0.getDelegateSuperclassName();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var0.isPropertyTestFunction(var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }


    boolean var1 = com.google.javascript.rhino.ScriptRuntime.isJSLineTerminator(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test45() {}
//   public void test45() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "NAME ", false);
//     com.google.javascript.jscomp.JSModule var5 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.SourceFile.Generator var7 = null;
//     com.google.javascript.jscomp.SourceFile var8 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var7);
//     var5.add(var8);
//     var3.setSourceFile(var8);
// 
//   }

  public void test46() {}
//   public void test46() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var1);
//     boolean var3 = var2.isExtern();
//     java.lang.String var5 = var2.getLine(0);
// 
//   }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }


    com.google.javascript.jscomp.SourceAst var0 = null;
    com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "NAME ", false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = var3.getPathRelativeToClosureBase();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }

  }

  public void test48() {}
//   public void test48() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var0 = null;
//     java.lang.String[] var2 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var3 = com.google.javascript.jscomp.JSError.make(var0, var2);
// 
//   }

  public void test49() {}
//   public void test49() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     com.google.javascript.rhino.jstype.JSType[] var2 = null;
//     com.google.javascript.rhino.jstype.JSType var3 = var1.createUnionType(var2);
// 
//   }

  public void test50() {}
//   public void test50() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "NAME ", false);
//     java.lang.String var5 = var3.getLine(100);
// 
//   }

  public void test51() {}
//   public void test51() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }
// 
// 
//     com.google.javascript.rhino.Node[] var0 = null;
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.arraylit(var0);
// 
//   }

  public void test52() {}
//   public void test52() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }
// 
// 
//     com.google.javascript.jscomp.AbstractCompiler var0 = null;
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.NodeTraversal.Callback var2 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverse(var0, var1, var2);
// 
//   }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var2 = null;
    boolean var3 = var1.hasChild(var2);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    com.google.javascript.rhino.Node var8 = var1.clonePropsFrom(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var9 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.continueNode(var1);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var2 = null;
    boolean var3 = var1.hasChild(var2);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    com.google.javascript.rhino.Node var8 = var1.clonePropsFrom(var5);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.throwNode(var10);
    com.google.javascript.rhino.Node var12 = var1.srcref(var11);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.jstype.StaticSourceFile var15 = var14.getStaticSourceFile();
    boolean var16 = var14.isGetElem();
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.neg(var14);
    var14.setLineno(0);
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var22 = null;
    boolean var23 = var21.hasChild(var22);
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var26 = null;
    boolean var27 = var25.hasChild(var26);
    com.google.javascript.rhino.Node var28 = var21.clonePropsFrom(var25);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.throwNode(var30);
    com.google.javascript.rhino.Node var32 = var21.srcref(var31);
    com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.IR.name("");
    int var35 = var34.getChildCount();
    var34.setString("");
    var34.setCharno(1);
    com.google.javascript.rhino.Node var40 = var32.copyInformationFrom(var34);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var12.addChildAfter(var14, var34);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = com.google.javascript.rhino.ScriptRuntime.getMessage1("function ({253302735}): {946478791}", (java.lang.Object)"hi!");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.FunctionBuilder var2 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var10 = null;
    boolean var11 = var9.hasChild(var10);
    com.google.javascript.rhino.Node var12 = var5.clonePropsFrom(var9);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.throwNode(var14);
    com.google.javascript.rhino.Node var16 = var5.srcref(var15);
    com.google.javascript.rhino.jstype.ObjectType var17 = null;
    com.google.javascript.rhino.jstype.ObjectType var18 = var1.createObjectType("", var15, var17);
    boolean var19 = var18.isArrayType();
    boolean var20 = var18.isNominalType();
    boolean var22 = var18.hasTemplatizedType("NAME ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test58() {}
//   public void test58() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }
// 
// 
//     com.google.javascript.jscomp.SourceExcerptProvider var0 = null;
//     com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var1 = null;
//     com.google.javascript.jscomp.LightweightMessageFormatter var2 = new com.google.javascript.jscomp.LightweightMessageFormatter(var0, var1);
// 
//   }

  public void test59() {}
//   public void test59() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var2 = null;
//     boolean var3 = var1.hasChild(var2);
//     com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var6 = null;
//     boolean var7 = var5.hasChild(var6);
//     com.google.javascript.rhino.Node var8 = var1.clonePropsFrom(var5);
//     com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.throwNode(var10);
//     com.google.javascript.rhino.Node var12 = var1.srcref(var11);
//     com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("");
//     int var15 = var14.getChildCount();
//     var14.setString("");
//     var14.setCharno(1);
//     com.google.javascript.rhino.Node var20 = var12.copyInformationFrom(var14);
//     com.google.javascript.rhino.Node var22 = var12.getChildAtIndex(10);
// 
//   }

  public void test60() {}
//   public void test60() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     com.google.javascript.rhino.ErrorReporter var2 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
//     com.google.javascript.rhino.ErrorReporter var4 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var4);
//     com.google.javascript.rhino.jstype.FunctionBuilder var6 = new com.google.javascript.rhino.jstype.FunctionBuilder(var5);
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var10 = null;
//     boolean var11 = var9.hasChild(var10);
//     com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var14 = null;
//     boolean var15 = var13.hasChild(var14);
//     com.google.javascript.rhino.Node var16 = var9.clonePropsFrom(var13);
//     com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.throwNode(var18);
//     com.google.javascript.rhino.Node var20 = var9.srcref(var19);
//     com.google.javascript.rhino.jstype.ObjectType var21 = null;
//     com.google.javascript.rhino.jstype.ObjectType var22 = var5.createObjectType("", var19, var21);
//     boolean var23 = var22.isUnknownType();
//     com.google.javascript.jscomp.GoogleCodingConvention var24 = new com.google.javascript.jscomp.GoogleCodingConvention();
//     java.lang.String var25 = var24.getDelegateSuperclassName();
//     com.google.javascript.rhino.ErrorReporter var26 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var26);
//     com.google.javascript.rhino.jstype.FunctionBuilder var28 = new com.google.javascript.rhino.jstype.FunctionBuilder(var27);
//     com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var32 = null;
//     boolean var33 = var31.hasChild(var32);
//     com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var36 = null;
//     boolean var37 = var35.hasChild(var36);
//     com.google.javascript.rhino.Node var38 = var31.clonePropsFrom(var35);
//     com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.throwNode(var40);
//     com.google.javascript.rhino.Node var42 = var31.srcref(var41);
//     com.google.javascript.rhino.jstype.ObjectType var43 = null;
//     com.google.javascript.rhino.jstype.ObjectType var44 = var27.createObjectType("", var41, var43);
//     boolean var45 = var44.isUnknownType();
//     com.google.javascript.rhino.ErrorReporter var46 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var46);
//     com.google.javascript.rhino.jstype.FunctionBuilder var48 = new com.google.javascript.rhino.jstype.FunctionBuilder(var47);
//     com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var52 = null;
//     boolean var53 = var51.hasChild(var52);
//     com.google.javascript.rhino.Node var55 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var56 = null;
//     boolean var57 = var55.hasChild(var56);
//     com.google.javascript.rhino.Node var58 = var51.clonePropsFrom(var55);
//     com.google.javascript.rhino.Node var60 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var61 = com.google.javascript.rhino.IR.throwNode(var60);
//     com.google.javascript.rhino.Node var62 = var51.srcref(var61);
//     com.google.javascript.rhino.jstype.ObjectType var63 = null;
//     com.google.javascript.rhino.jstype.ObjectType var64 = var47.createObjectType("", var61, var63);
//     boolean var65 = var64.isArrayType();
//     com.google.javascript.rhino.ErrorReporter var66 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var66);
//     com.google.javascript.rhino.jstype.FunctionBuilder var68 = new com.google.javascript.rhino.jstype.FunctionBuilder(var67);
//     com.google.javascript.rhino.Node var71 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var72 = null;
//     boolean var73 = var71.hasChild(var72);
//     com.google.javascript.rhino.Node var75 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var76 = null;
//     boolean var77 = var75.hasChild(var76);
//     com.google.javascript.rhino.Node var78 = var71.clonePropsFrom(var75);
//     com.google.javascript.rhino.Node var80 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var81 = com.google.javascript.rhino.IR.throwNode(var80);
//     com.google.javascript.rhino.Node var82 = var71.srcref(var81);
//     com.google.javascript.rhino.jstype.ObjectType var83 = null;
//     com.google.javascript.rhino.jstype.ObjectType var84 = var67.createObjectType("", var81, var83);
//     boolean var85 = var84.isArrayType();
//     boolean var86 = var84.isNominalType();
//     com.google.javascript.rhino.jstype.FunctionType var87 = null;
//     com.google.javascript.rhino.jstype.FunctionType var88 = null;
//     var24.applyDelegateRelationship(var44, var64, var84, var87, var88);
//     java.util.Set var90 = var84.getPropertyNames();
//     com.google.javascript.rhino.jstype.JSType[] var91 = new com.google.javascript.rhino.jstype.JSType[] { var84};
//     com.google.javascript.rhino.jstype.FunctionType var92 = var3.createConstructorType((com.google.javascript.rhino.jstype.JSType)var22, var91);
//     com.google.javascript.rhino.jstype.FunctionType var93 = var92.cloneWithoutArrowType();
//     boolean var94 = var92.makesDicts();
//     com.google.javascript.rhino.jstype.JSType[] var95 = null;
//     com.google.javascript.rhino.jstype.FunctionType var96 = var1.createFunctionType((com.google.javascript.rhino.jstype.JSType)var92, var95);
// 
//   }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    int var2 = var1.getChildCount();
    var1.setString("");
    var1.setCharno(1);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var9 = null;
    boolean var10 = var8.hasChild(var9);
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var13 = null;
    boolean var14 = var12.hasChild(var13);
    com.google.javascript.rhino.Node var15 = var8.clonePropsFrom(var12);
    boolean var16 = var8.isRegExp();
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.name("");
    int var19 = var18.getChildCount();
    var18.setString("");
    com.google.javascript.rhino.Node var22 = var8.useSourceInfoFromForTree(var18);
    boolean var23 = var18.isCatch();
    int var24 = var18.getSideEffectFlags();
    com.google.javascript.rhino.Node[] var25 = new com.google.javascript.rhino.Node[] { var18};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.switchNode(var1, var25);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }


    java.lang.String var1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("function ({1546170474}): {1935027818}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "(function ({1546170474}): {1935027818})"+ "'", var1.equals("(function ({1546170474}): {1935027818})"));

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = var0.toSource();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test64() {}
//   public void test64() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     com.google.javascript.rhino.ErrorReporter var2 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
//     com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var3);
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var8 = null;
//     boolean var9 = var7.hasChild(var8);
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var12 = null;
//     boolean var13 = var11.hasChild(var12);
//     com.google.javascript.rhino.Node var14 = var7.clonePropsFrom(var11);
//     com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.throwNode(var16);
//     com.google.javascript.rhino.Node var18 = var7.srcref(var17);
//     com.google.javascript.rhino.jstype.ObjectType var19 = null;
//     com.google.javascript.rhino.jstype.ObjectType var20 = var3.createObjectType("", var17, var19);
//     boolean var21 = var20.isUnknownType();
//     com.google.javascript.jscomp.GoogleCodingConvention var22 = new com.google.javascript.jscomp.GoogleCodingConvention();
//     java.lang.String var23 = var22.getDelegateSuperclassName();
//     com.google.javascript.rhino.ErrorReporter var24 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24);
//     com.google.javascript.rhino.jstype.FunctionBuilder var26 = new com.google.javascript.rhino.jstype.FunctionBuilder(var25);
//     com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var30 = null;
//     boolean var31 = var29.hasChild(var30);
//     com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var34 = null;
//     boolean var35 = var33.hasChild(var34);
//     com.google.javascript.rhino.Node var36 = var29.clonePropsFrom(var33);
//     com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.throwNode(var38);
//     com.google.javascript.rhino.Node var40 = var29.srcref(var39);
//     com.google.javascript.rhino.jstype.ObjectType var41 = null;
//     com.google.javascript.rhino.jstype.ObjectType var42 = var25.createObjectType("", var39, var41);
//     boolean var43 = var42.isUnknownType();
//     com.google.javascript.rhino.ErrorReporter var44 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var44);
//     com.google.javascript.rhino.jstype.FunctionBuilder var46 = new com.google.javascript.rhino.jstype.FunctionBuilder(var45);
//     com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var50 = null;
//     boolean var51 = var49.hasChild(var50);
//     com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var54 = null;
//     boolean var55 = var53.hasChild(var54);
//     com.google.javascript.rhino.Node var56 = var49.clonePropsFrom(var53);
//     com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var59 = com.google.javascript.rhino.IR.throwNode(var58);
//     com.google.javascript.rhino.Node var60 = var49.srcref(var59);
//     com.google.javascript.rhino.jstype.ObjectType var61 = null;
//     com.google.javascript.rhino.jstype.ObjectType var62 = var45.createObjectType("", var59, var61);
//     boolean var63 = var62.isArrayType();
//     com.google.javascript.rhino.ErrorReporter var64 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var64);
//     com.google.javascript.rhino.jstype.FunctionBuilder var66 = new com.google.javascript.rhino.jstype.FunctionBuilder(var65);
//     com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var70 = null;
//     boolean var71 = var69.hasChild(var70);
//     com.google.javascript.rhino.Node var73 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var74 = null;
//     boolean var75 = var73.hasChild(var74);
//     com.google.javascript.rhino.Node var76 = var69.clonePropsFrom(var73);
//     com.google.javascript.rhino.Node var78 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var79 = com.google.javascript.rhino.IR.throwNode(var78);
//     com.google.javascript.rhino.Node var80 = var69.srcref(var79);
//     com.google.javascript.rhino.jstype.ObjectType var81 = null;
//     com.google.javascript.rhino.jstype.ObjectType var82 = var65.createObjectType("", var79, var81);
//     boolean var83 = var82.isArrayType();
//     boolean var84 = var82.isNominalType();
//     com.google.javascript.rhino.jstype.FunctionType var85 = null;
//     com.google.javascript.rhino.jstype.FunctionType var86 = null;
//     var22.applyDelegateRelationship(var42, var62, var82, var85, var86);
//     java.util.Set var88 = var82.getPropertyNames();
//     com.google.javascript.rhino.jstype.JSType[] var89 = new com.google.javascript.rhino.jstype.JSType[] { var82};
//     com.google.javascript.rhino.jstype.FunctionType var90 = var1.createConstructorType((com.google.javascript.rhino.jstype.JSType)var20, var89);
//     java.lang.String var91 = var90.toDebugHashCodeString();
//     boolean var92 = var90.hasImplementedInterfaces();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var17);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var20);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var21 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var23);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var29);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var31 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var33);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var35 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var36);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var38);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var39);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var40);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var42);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var43 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var49);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var51 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var53);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var55 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var56);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var58);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var59);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var60);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var62);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var63 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var69);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var71 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var73);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var75 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var76);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var78);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var79);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var80);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var82);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var83 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var84 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var88);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var89);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var90);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var91 + "' != '" + "function ({788694856}): {1325375508}"+ "'", var91.equals("function ({788694856}): {1325375508}"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var92 == false);
// 
//   }

  public void test65() {}
//   public void test65() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.CompilerOptions.LanguageMode var1 = var0.languageMode();
// 
//   }

  public void test66() {}
//   public void test66() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }
// 
// 
//     com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.SourceFile.Generator var3 = null;
//     com.google.javascript.jscomp.SourceFile var4 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var3);
//     var1.add(var4);
//     com.google.javascript.jscomp.CompilerInput var7 = new com.google.javascript.jscomp.CompilerInput(var4, true);
//     com.google.javascript.jscomp.Region var9 = var4.getRegion(0);
// 
//   }

  public void test67() {}
//   public void test67() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }
// 
// 
//     java.io.File var0 = null;
//     java.nio.charset.Charset var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromFile(var0, var1);
// 
//   }

  public void test68() {}
//   public void test68() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }
// 
// 
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var3 = null;
//     boolean var4 = var2.hasChild(var3);
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var7 = null;
//     boolean var8 = var6.hasChild(var7);
//     com.google.javascript.rhino.Node var9 = var2.clonePropsFrom(var6);
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.throwNode(var11);
//     com.google.javascript.rhino.Node var13 = var2.srcref(var12);
//     com.google.javascript.rhino.Node var16 = new com.google.javascript.rhino.Node(38, var12, 100, 1);
//     com.google.javascript.jscomp.DiagnosticType var17 = null;
//     java.lang.String[] var18 = null;
//     com.google.javascript.jscomp.JSError var19 = com.google.javascript.jscomp.JSError.make(var16, var17, var18);
// 
//   }

  public void test69() {}
//   public void test69() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     com.google.javascript.rhino.ErrorReporter var2 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
//     com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var3);
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var8 = null;
//     boolean var9 = var7.hasChild(var8);
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var12 = null;
//     boolean var13 = var11.hasChild(var12);
//     com.google.javascript.rhino.Node var14 = var7.clonePropsFrom(var11);
//     com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.throwNode(var16);
//     com.google.javascript.rhino.Node var18 = var7.srcref(var17);
//     com.google.javascript.rhino.jstype.ObjectType var19 = null;
//     com.google.javascript.rhino.jstype.ObjectType var20 = var3.createObjectType("", var17, var19);
//     boolean var21 = var20.isUnknownType();
//     com.google.javascript.jscomp.GoogleCodingConvention var22 = new com.google.javascript.jscomp.GoogleCodingConvention();
//     java.lang.String var23 = var22.getDelegateSuperclassName();
//     com.google.javascript.rhino.ErrorReporter var24 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24);
//     com.google.javascript.rhino.jstype.FunctionBuilder var26 = new com.google.javascript.rhino.jstype.FunctionBuilder(var25);
//     com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var30 = null;
//     boolean var31 = var29.hasChild(var30);
//     com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var34 = null;
//     boolean var35 = var33.hasChild(var34);
//     com.google.javascript.rhino.Node var36 = var29.clonePropsFrom(var33);
//     com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.throwNode(var38);
//     com.google.javascript.rhino.Node var40 = var29.srcref(var39);
//     com.google.javascript.rhino.jstype.ObjectType var41 = null;
//     com.google.javascript.rhino.jstype.ObjectType var42 = var25.createObjectType("", var39, var41);
//     boolean var43 = var42.isUnknownType();
//     com.google.javascript.rhino.ErrorReporter var44 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var44);
//     com.google.javascript.rhino.jstype.FunctionBuilder var46 = new com.google.javascript.rhino.jstype.FunctionBuilder(var45);
//     com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var50 = null;
//     boolean var51 = var49.hasChild(var50);
//     com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var54 = null;
//     boolean var55 = var53.hasChild(var54);
//     com.google.javascript.rhino.Node var56 = var49.clonePropsFrom(var53);
//     com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var59 = com.google.javascript.rhino.IR.throwNode(var58);
//     com.google.javascript.rhino.Node var60 = var49.srcref(var59);
//     com.google.javascript.rhino.jstype.ObjectType var61 = null;
//     com.google.javascript.rhino.jstype.ObjectType var62 = var45.createObjectType("", var59, var61);
//     boolean var63 = var62.isArrayType();
//     com.google.javascript.rhino.ErrorReporter var64 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var64);
//     com.google.javascript.rhino.jstype.FunctionBuilder var66 = new com.google.javascript.rhino.jstype.FunctionBuilder(var65);
//     com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var70 = null;
//     boolean var71 = var69.hasChild(var70);
//     com.google.javascript.rhino.Node var73 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var74 = null;
//     boolean var75 = var73.hasChild(var74);
//     com.google.javascript.rhino.Node var76 = var69.clonePropsFrom(var73);
//     com.google.javascript.rhino.Node var78 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var79 = com.google.javascript.rhino.IR.throwNode(var78);
//     com.google.javascript.rhino.Node var80 = var69.srcref(var79);
//     com.google.javascript.rhino.jstype.ObjectType var81 = null;
//     com.google.javascript.rhino.jstype.ObjectType var82 = var65.createObjectType("", var79, var81);
//     boolean var83 = var82.isArrayType();
//     boolean var84 = var82.isNominalType();
//     com.google.javascript.rhino.jstype.FunctionType var85 = null;
//     com.google.javascript.rhino.jstype.FunctionType var86 = null;
//     var22.applyDelegateRelationship(var42, var62, var82, var85, var86);
//     java.util.Set var88 = var82.getPropertyNames();
//     com.google.javascript.rhino.jstype.JSType[] var89 = new com.google.javascript.rhino.jstype.JSType[] { var82};
//     com.google.javascript.rhino.jstype.FunctionType var90 = var1.createConstructorType((com.google.javascript.rhino.jstype.JSType)var20, var89);
//     com.google.javascript.rhino.jstype.FunctionType var91 = var90.getSuperClassConstructor();
//     java.lang.String var92 = var90.toDebugHashCodeString();
//     com.google.common.base.Predicate var93 = null;
//     boolean var94 = var90.setValidator(var93);
// 
//   }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }


    com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.lang.String var1 = var0.getDelegateSuperclassName();
    com.google.javascript.rhino.ErrorReporter var2 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
    com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var3);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var8 = null;
    boolean var9 = var7.hasChild(var8);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var12 = null;
    boolean var13 = var11.hasChild(var12);
    com.google.javascript.rhino.Node var14 = var7.clonePropsFrom(var11);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.throwNode(var16);
    com.google.javascript.rhino.Node var18 = var7.srcref(var17);
    com.google.javascript.rhino.jstype.ObjectType var19 = null;
    com.google.javascript.rhino.jstype.ObjectType var20 = var3.createObjectType("", var17, var19);
    boolean var21 = var20.isUnknownType();
    com.google.javascript.rhino.ErrorReporter var22 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var22);
    com.google.javascript.rhino.jstype.FunctionBuilder var24 = new com.google.javascript.rhino.jstype.FunctionBuilder(var23);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var28 = null;
    boolean var29 = var27.hasChild(var28);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var32 = null;
    boolean var33 = var31.hasChild(var32);
    com.google.javascript.rhino.Node var34 = var27.clonePropsFrom(var31);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.throwNode(var36);
    com.google.javascript.rhino.Node var38 = var27.srcref(var37);
    com.google.javascript.rhino.jstype.ObjectType var39 = null;
    com.google.javascript.rhino.jstype.ObjectType var40 = var23.createObjectType("", var37, var39);
    boolean var41 = var40.isArrayType();
    com.google.javascript.rhino.ErrorReporter var42 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var42);
    com.google.javascript.rhino.jstype.FunctionBuilder var44 = new com.google.javascript.rhino.jstype.FunctionBuilder(var43);
    com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var48 = null;
    boolean var49 = var47.hasChild(var48);
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var52 = null;
    boolean var53 = var51.hasChild(var52);
    com.google.javascript.rhino.Node var54 = var47.clonePropsFrom(var51);
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.throwNode(var56);
    com.google.javascript.rhino.Node var58 = var47.srcref(var57);
    com.google.javascript.rhino.jstype.ObjectType var59 = null;
    com.google.javascript.rhino.jstype.ObjectType var60 = var43.createObjectType("", var57, var59);
    boolean var61 = var60.isArrayType();
    boolean var62 = var60.isNominalType();
    com.google.javascript.rhino.jstype.FunctionType var63 = null;
    com.google.javascript.rhino.jstype.FunctionType var64 = null;
    var0.applyDelegateRelationship(var20, var40, var60, var63, var64);
    boolean var66 = var60.isObject();
    java.lang.String var67 = var60.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + ""+ "'", var67.equals(""));

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString(100, "NAME ", 10, 0);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var7 = null;
    boolean var8 = var6.hasChild(var7);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var11 = null;
    boolean var12 = var10.hasChild(var11);
    com.google.javascript.rhino.Node var13 = var6.clonePropsFrom(var10);
    com.google.javascript.rhino.Node var14 = var6.getNext();
    com.google.javascript.rhino.Node var15 = var6.getNext();
    var6.addSuppression("hi!");
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var20 = null;
    boolean var21 = var19.hasChild(var20);
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var24 = null;
    boolean var25 = var23.hasChild(var24);
    com.google.javascript.rhino.Node var26 = var19.clonePropsFrom(var23);
    boolean var27 = var19.isRegExp();
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.name("");
    int var30 = var29.getChildCount();
    var29.setString("");
    com.google.javascript.rhino.Node var33 = var19.useSourceInfoFromForTree(var29);
    boolean var34 = var29.isCatch();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.replaceChildAfter(var6, var29);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test72() {}
//   public void test72() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Region var3 = var0.getSourceRegion("(function ({1546170474}): {1935027818})", 10);
// 
//   }

  public void test73() {}
//   public void test73() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.JsAst var1 = null;
//     var0.replaceScript(var1);
// 
//   }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }


    com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.lang.String var1 = var0.getDelegateSuperclassName();
    com.google.javascript.rhino.ErrorReporter var2 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
    com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var3);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var8 = null;
    boolean var9 = var7.hasChild(var8);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var12 = null;
    boolean var13 = var11.hasChild(var12);
    com.google.javascript.rhino.Node var14 = var7.clonePropsFrom(var11);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.throwNode(var16);
    com.google.javascript.rhino.Node var18 = var7.srcref(var17);
    com.google.javascript.rhino.jstype.ObjectType var19 = null;
    com.google.javascript.rhino.jstype.ObjectType var20 = var3.createObjectType("", var17, var19);
    boolean var21 = var20.isUnknownType();
    com.google.javascript.rhino.ErrorReporter var22 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var22);
    com.google.javascript.rhino.jstype.FunctionBuilder var24 = new com.google.javascript.rhino.jstype.FunctionBuilder(var23);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var28 = null;
    boolean var29 = var27.hasChild(var28);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var32 = null;
    boolean var33 = var31.hasChild(var32);
    com.google.javascript.rhino.Node var34 = var27.clonePropsFrom(var31);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.throwNode(var36);
    com.google.javascript.rhino.Node var38 = var27.srcref(var37);
    com.google.javascript.rhino.jstype.ObjectType var39 = null;
    com.google.javascript.rhino.jstype.ObjectType var40 = var23.createObjectType("", var37, var39);
    boolean var41 = var40.isArrayType();
    com.google.javascript.rhino.ErrorReporter var42 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var42);
    com.google.javascript.rhino.jstype.FunctionBuilder var44 = new com.google.javascript.rhino.jstype.FunctionBuilder(var43);
    com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var48 = null;
    boolean var49 = var47.hasChild(var48);
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var52 = null;
    boolean var53 = var51.hasChild(var52);
    com.google.javascript.rhino.Node var54 = var47.clonePropsFrom(var51);
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.throwNode(var56);
    com.google.javascript.rhino.Node var58 = var47.srcref(var57);
    com.google.javascript.rhino.jstype.ObjectType var59 = null;
    com.google.javascript.rhino.jstype.ObjectType var60 = var43.createObjectType("", var57, var59);
    boolean var61 = var60.isArrayType();
    boolean var62 = var60.isNominalType();
    com.google.javascript.rhino.jstype.FunctionType var63 = null;
    com.google.javascript.rhino.jstype.FunctionType var64 = null;
    var0.applyDelegateRelationship(var20, var40, var60, var63, var64);
    com.google.javascript.rhino.Node var67 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode((com.google.javascript.jscomp.CodingConvention)var0, "");
    com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var70 = null;
    boolean var71 = var69.hasChild(var70);
    com.google.javascript.rhino.Node var73 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var74 = null;
    boolean var75 = var73.hasChild(var74);
    com.google.javascript.rhino.Node var76 = var69.clonePropsFrom(var73);
    boolean var77 = var69.isRegExp();
    boolean var78 = var69.isBlock();
    boolean var79 = var0.isVarArgsParameter(var69);
    com.google.javascript.rhino.Node var81 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var82 = null;
    boolean var83 = var81.hasChild(var82);
    com.google.javascript.rhino.Node var85 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var86 = null;
    boolean var87 = var85.hasChild(var86);
    com.google.javascript.rhino.Node var88 = var81.clonePropsFrom(var85);
    com.google.javascript.rhino.Node var89 = var81.getNext();
    com.google.javascript.rhino.Node var90 = var81.getNext();
    var81.addSuppression("hi!");
    boolean var93 = var0.isOptionalParameter(var81);
    com.google.javascript.rhino.Node var94 = com.google.javascript.rhino.IR.var(var81);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var95 = com.google.javascript.rhino.IR.defaultCase(var94);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }


    com.google.javascript.rhino.Node var1 = new com.google.javascript.rhino.Node(0);
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var4 = null;
    boolean var5 = var3.hasChild(var4);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var8 = null;
    boolean var9 = var7.hasChild(var8);
    com.google.javascript.rhino.Node var10 = var3.clonePropsFrom(var7);
    boolean var11 = var3.isVoid();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.caseNode(var1, var3);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test76() {}
//   public void test76() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.JSSourceFile[] var1 = null;
//     com.google.javascript.jscomp.JSModule var3 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.SourceFile.Generator var5 = null;
//     com.google.javascript.jscomp.SourceFile var6 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var5);
//     var3.add(var6);
//     com.google.javascript.jscomp.JSModule[] var8 = new com.google.javascript.jscomp.JSModule[] { var3};
//     com.google.javascript.jscomp.CompilerOptions var9 = new com.google.javascript.jscomp.CompilerOptions();
//     var9.setPropertyAffinity(false);
//     com.google.javascript.jscomp.SourceMap.Format var12 = null;
//     var9.setSourceMapFormat(var12);
//     var0.init(var1, var8, var9);
// 
//   }

  public void test77() {}
//   public void test77() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.InputId var2 = var1.getInputId();
//     com.google.javascript.rhino.Node var3 = null;
//     com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.assign(var1, var3);
// 
//   }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setRemoveAbstractMethods(false);
    var0.setNameReferenceGraphPath("hi!");
    var0.setSaveDataStructures(false);

  }

  public void test79() {}
//   public void test79() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     int var1 = var0.getErrorCount();
// 
//   }

  public void test80() {}
//   public void test80() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "NAME ", false);
//     com.google.javascript.jscomp.JSModule var5 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.SourceFile.Generator var7 = null;
//     com.google.javascript.jscomp.SourceFile var8 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var7);
//     var5.add(var8);
//     java.util.Set var10 = var5.getAllDependencies();
//     var3.setModule(var5);
//     com.google.javascript.jscomp.Compiler var12 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.rhino.Node var13 = var3.getAstRoot((com.google.javascript.jscomp.AbstractCompiler)var12);
// 
//   }

  public void test81() {}
//   public void test81() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.pos(var0);
// 
//   }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setPropertyAffinity(false);
    boolean var3 = var0.shouldColorizeErrorOutput();
    var0.setDefineToNumberLiteral("goog.exportProperty", 38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test83() {}
//   public void test83() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var3 = null;
//     java.lang.String[] var5 = new java.lang.String[] { "(hi!)"};
//     com.google.javascript.jscomp.JSError var6 = com.google.javascript.jscomp.JSError.make("function ({1287601532}): {526237505}", 0, 100, var3, var5);
// 
//   }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf("(function ({1546170474}): {1935027818})");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test85() {}
//   public void test85() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var1);
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var2, false);
//     java.lang.String var5 = var4.getCode();
// 
//   }

  public void test86() {}
//   public void test86() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     com.google.javascript.rhino.Node var1 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(var0);
// 
//   }

  public void test87() {}
//   public void test87() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var1);
//     boolean var3 = var2.isExtern();
//     java.lang.String var4 = var2.getName();
//     java.lang.String var6 = var2.getLine(38);
// 
//   }

  public void test88() {}
//   public void test88() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.JSModule var2 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.SourceFile.Generator var4 = null;
//     com.google.javascript.jscomp.SourceFile var5 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var4);
//     var2.add(var5);
//     java.lang.String var7 = var2.toString();
//     com.google.javascript.jscomp.SourceFile.Generator var9 = null;
//     com.google.javascript.jscomp.SourceFile var10 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var9);
//     boolean var11 = var10.isExtern();
//     java.lang.String var12 = var10.getName();
//     var2.add(var10);
//     com.google.javascript.jscomp.JSSourceFile[] var14 = null;
//     com.google.javascript.jscomp.CompilerOptions var15 = new com.google.javascript.jscomp.CompilerOptions();
//     var15.setCollapseAnonymousFunctions(true);
//     com.google.javascript.jscomp.CompilerOptions.TweakProcessing var18 = null;
//     var15.setTweakProcessing(var18);
//     com.google.javascript.jscomp.Result var20 = var0.compile(var10, var14, var15);
// 
//   }

  public void test89() {}
//   public void test89() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
//     int var3 = var2.getChildCount();
//     boolean var4 = var2.hasChildren();
//     com.google.javascript.jscomp.CodingConvention.SubclassRelationship var5 = var0.getClassesDefinedByCall(var2);
// 
//   }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }


    com.google.javascript.jscomp.SourceAst var0 = null;
    com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "NAME ", false);
    com.google.javascript.jscomp.JSModule var5 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.SourceFile.Generator var7 = null;
    com.google.javascript.jscomp.SourceFile var8 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var7);
    var5.add(var8);
    java.util.Set var10 = var5.getAllDependencies();
    var3.setModule(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var12 = var5.getPathRelativeToClosureBase();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test91() {}
//   public void test91() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.trueNode();
//     com.google.javascript.rhino.Node var1 = null;
//     java.lang.String var2 = var0.checkTreeEquals(var1);
// 
//   }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var2 = null;
    boolean var3 = var1.hasChild(var2);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    com.google.javascript.rhino.Node var8 = var1.clonePropsFrom(var5);
    boolean var9 = var1.isRegExp();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
    int var12 = var11.getChildCount();
    var11.setString("");
    com.google.javascript.rhino.Node var15 = var1.useSourceInfoFromForTree(var11);
    boolean var16 = var11.isCatch();
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var19 = null;
    boolean var20 = var18.hasChild(var19);
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var23 = null;
    boolean var24 = var22.hasChild(var23);
    com.google.javascript.rhino.Node var25 = var18.clonePropsFrom(var22);
    boolean var26 = var18.isRegExp();
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.name("");
    int var29 = var28.getChildCount();
    var28.setString("");
    com.google.javascript.rhino.Node var32 = var18.useSourceInfoFromForTree(var28);
    java.lang.String var36 = var18.toString(false, true, false);
    var11.addChildrenToFront(var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.var(var18);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "NAME "+ "'", var36.equals("NAME "));

  }

  public void test93() {}
//   public void test93() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }
// 
// 
//     com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.SourceFile.Generator var3 = null;
//     com.google.javascript.jscomp.SourceFile var4 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var3);
//     var1.add(var4);
//     com.google.javascript.jscomp.CompilerInput var7 = new com.google.javascript.jscomp.CompilerInput(var4, true);
//     java.util.Collection var8 = var7.getProvides();
// 
//   }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.JSModule var2 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.CompilerInput var4 = var2.getByName("");
    java.util.List var5 = var2.getDependencies();
    com.google.javascript.jscomp.NodeTraversal.Callback var6 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var0, var5, var6);
    com.google.javascript.jscomp.SourceFile.Generator var9 = null;
    com.google.javascript.jscomp.SourceFile var10 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var9);
    boolean var11 = var10.isExtern();
    com.google.javascript.jscomp.SourceFile var14 = com.google.javascript.jscomp.SourceFile.fromCode("function ({1427496923}): {253480577}", "function ({1546170474}): {1935027818}");
    com.google.javascript.jscomp.CompilerOptions var15 = new com.google.javascript.jscomp.CompilerOptions();
    var15.setRemoveAbstractMethods(false);
    var15.setNameReferenceGraphPath("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.Result var20 = var0.compile(var10, var14, var15);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test95() {}
//   public void test95() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     com.google.javascript.rhino.ErrorReporter var2 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
//     com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var3);
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var8 = null;
//     boolean var9 = var7.hasChild(var8);
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var12 = null;
//     boolean var13 = var11.hasChild(var12);
//     com.google.javascript.rhino.Node var14 = var7.clonePropsFrom(var11);
//     com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.throwNode(var16);
//     com.google.javascript.rhino.Node var18 = var7.srcref(var17);
//     com.google.javascript.rhino.jstype.ObjectType var19 = null;
//     com.google.javascript.rhino.jstype.ObjectType var20 = var3.createObjectType("", var17, var19);
//     boolean var21 = var20.isUnknownType();
//     com.google.javascript.jscomp.GoogleCodingConvention var22 = new com.google.javascript.jscomp.GoogleCodingConvention();
//     java.lang.String var23 = var22.getDelegateSuperclassName();
//     com.google.javascript.rhino.ErrorReporter var24 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24);
//     com.google.javascript.rhino.jstype.FunctionBuilder var26 = new com.google.javascript.rhino.jstype.FunctionBuilder(var25);
//     com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var30 = null;
//     boolean var31 = var29.hasChild(var30);
//     com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var34 = null;
//     boolean var35 = var33.hasChild(var34);
//     com.google.javascript.rhino.Node var36 = var29.clonePropsFrom(var33);
//     com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.throwNode(var38);
//     com.google.javascript.rhino.Node var40 = var29.srcref(var39);
//     com.google.javascript.rhino.jstype.ObjectType var41 = null;
//     com.google.javascript.rhino.jstype.ObjectType var42 = var25.createObjectType("", var39, var41);
//     boolean var43 = var42.isUnknownType();
//     com.google.javascript.rhino.ErrorReporter var44 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var44);
//     com.google.javascript.rhino.jstype.FunctionBuilder var46 = new com.google.javascript.rhino.jstype.FunctionBuilder(var45);
//     com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var50 = null;
//     boolean var51 = var49.hasChild(var50);
//     com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var54 = null;
//     boolean var55 = var53.hasChild(var54);
//     com.google.javascript.rhino.Node var56 = var49.clonePropsFrom(var53);
//     com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var59 = com.google.javascript.rhino.IR.throwNode(var58);
//     com.google.javascript.rhino.Node var60 = var49.srcref(var59);
//     com.google.javascript.rhino.jstype.ObjectType var61 = null;
//     com.google.javascript.rhino.jstype.ObjectType var62 = var45.createObjectType("", var59, var61);
//     boolean var63 = var62.isArrayType();
//     com.google.javascript.rhino.ErrorReporter var64 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var64);
//     com.google.javascript.rhino.jstype.FunctionBuilder var66 = new com.google.javascript.rhino.jstype.FunctionBuilder(var65);
//     com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var70 = null;
//     boolean var71 = var69.hasChild(var70);
//     com.google.javascript.rhino.Node var73 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var74 = null;
//     boolean var75 = var73.hasChild(var74);
//     com.google.javascript.rhino.Node var76 = var69.clonePropsFrom(var73);
//     com.google.javascript.rhino.Node var78 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var79 = com.google.javascript.rhino.IR.throwNode(var78);
//     com.google.javascript.rhino.Node var80 = var69.srcref(var79);
//     com.google.javascript.rhino.jstype.ObjectType var81 = null;
//     com.google.javascript.rhino.jstype.ObjectType var82 = var65.createObjectType("", var79, var81);
//     boolean var83 = var82.isArrayType();
//     boolean var84 = var82.isNominalType();
//     com.google.javascript.rhino.jstype.FunctionType var85 = null;
//     com.google.javascript.rhino.jstype.FunctionType var86 = null;
//     var22.applyDelegateRelationship(var42, var62, var82, var85, var86);
//     java.util.Set var88 = var82.getPropertyNames();
//     com.google.javascript.rhino.jstype.JSType[] var89 = new com.google.javascript.rhino.jstype.JSType[] { var82};
//     com.google.javascript.rhino.jstype.FunctionType var90 = var1.createConstructorType((com.google.javascript.rhino.jstype.JSType)var20, var89);
//     com.google.javascript.rhino.jstype.FunctionType var91 = var90.getSuperClassConstructor();
//     java.lang.String var92 = var90.toDebugHashCodeString();
//     java.lang.Iterable var93 = var90.getImplementedInterfaces();
//     com.google.javascript.rhino.jstype.ObjectType var94 = null;
//     var90.setPrototypeBasedOn(var94);
// 
//   }

  public void test96() {}
//   public void test96() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }
// 
// 
//     com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.SourceFile.Generator var3 = null;
//     com.google.javascript.jscomp.SourceFile var4 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var3);
//     var1.add(var4);
//     com.google.javascript.jscomp.CompilerInput var7 = new com.google.javascript.jscomp.CompilerInput(var4, true);
//     com.google.javascript.jscomp.CompilerInput var10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var7, "function ({253302735}): {946478791}", true);
//     com.google.javascript.jscomp.Compiler var11 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.rhino.Node var12 = var10.getAstRoot((com.google.javascript.jscomp.AbstractCompiler)var11);
// 
//   }

  public void test97() {}
//   public void test97() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.JSModule var2 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.CompilerInput var4 = var2.getByName("");
//     java.util.List var5 = var2.getDependencies();
//     com.google.javascript.jscomp.NodeTraversal.Callback var6 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var0, var5, var6);
//     com.google.javascript.jscomp.SymbolTable var8 = var0.buildKnownSymbolTable();
// 
//   }

  public void test98() {}
//   public void test98() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var1);
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var2, false);
//     int var6 = var2.getLineOfOffset(0);
// 
//   }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }


    boolean var1 = com.google.javascript.rhino.ScriptRuntime.isJSLineTerminator(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test100() {}
//   public void test100() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.JSModule var2 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.CompilerInput var4 = var2.getByName("");
//     java.util.List var5 = var2.getDependencies();
//     com.google.javascript.jscomp.NodeTraversal.Callback var6 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var0, var5, var6);
//     com.google.javascript.jscomp.JSError[] var8 = var0.getWarnings();
// 
//   }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }


    com.google.javascript.rhino.jstype.JSTypeRegistry var0 = null;
    com.google.javascript.rhino.jstype.FunctionBuilder var1 = new com.google.javascript.rhino.jstype.FunctionBuilder(var0);
    com.google.javascript.rhino.jstype.FunctionBuilder var3 = var1.setIsConstructor(true);
    com.google.javascript.rhino.ErrorReporter var4 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var4);
    com.google.javascript.rhino.ErrorReporter var6 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var6);
    com.google.javascript.rhino.jstype.FunctionBuilder var8 = new com.google.javascript.rhino.jstype.FunctionBuilder(var7);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var12 = null;
    boolean var13 = var11.hasChild(var12);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var16 = null;
    boolean var17 = var15.hasChild(var16);
    com.google.javascript.rhino.Node var18 = var11.clonePropsFrom(var15);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.throwNode(var20);
    com.google.javascript.rhino.Node var22 = var11.srcref(var21);
    com.google.javascript.rhino.jstype.ObjectType var23 = null;
    com.google.javascript.rhino.jstype.ObjectType var24 = var7.createObjectType("", var21, var23);
    boolean var25 = var24.isUnknownType();
    com.google.javascript.jscomp.GoogleCodingConvention var26 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.lang.String var27 = var26.getDelegateSuperclassName();
    com.google.javascript.rhino.ErrorReporter var28 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var28);
    com.google.javascript.rhino.jstype.FunctionBuilder var30 = new com.google.javascript.rhino.jstype.FunctionBuilder(var29);
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var34 = null;
    boolean var35 = var33.hasChild(var34);
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var38 = null;
    boolean var39 = var37.hasChild(var38);
    com.google.javascript.rhino.Node var40 = var33.clonePropsFrom(var37);
    com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.throwNode(var42);
    com.google.javascript.rhino.Node var44 = var33.srcref(var43);
    com.google.javascript.rhino.jstype.ObjectType var45 = null;
    com.google.javascript.rhino.jstype.ObjectType var46 = var29.createObjectType("", var43, var45);
    boolean var47 = var46.isUnknownType();
    com.google.javascript.rhino.ErrorReporter var48 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var48);
    com.google.javascript.rhino.jstype.FunctionBuilder var50 = new com.google.javascript.rhino.jstype.FunctionBuilder(var49);
    com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var54 = null;
    boolean var55 = var53.hasChild(var54);
    com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var58 = null;
    boolean var59 = var57.hasChild(var58);
    com.google.javascript.rhino.Node var60 = var53.clonePropsFrom(var57);
    com.google.javascript.rhino.Node var62 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var63 = com.google.javascript.rhino.IR.throwNode(var62);
    com.google.javascript.rhino.Node var64 = var53.srcref(var63);
    com.google.javascript.rhino.jstype.ObjectType var65 = null;
    com.google.javascript.rhino.jstype.ObjectType var66 = var49.createObjectType("", var63, var65);
    boolean var67 = var66.isArrayType();
    com.google.javascript.rhino.ErrorReporter var68 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var68);
    com.google.javascript.rhino.jstype.FunctionBuilder var70 = new com.google.javascript.rhino.jstype.FunctionBuilder(var69);
    com.google.javascript.rhino.Node var73 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var74 = null;
    boolean var75 = var73.hasChild(var74);
    com.google.javascript.rhino.Node var77 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var78 = null;
    boolean var79 = var77.hasChild(var78);
    com.google.javascript.rhino.Node var80 = var73.clonePropsFrom(var77);
    com.google.javascript.rhino.Node var82 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var83 = com.google.javascript.rhino.IR.throwNode(var82);
    com.google.javascript.rhino.Node var84 = var73.srcref(var83);
    com.google.javascript.rhino.jstype.ObjectType var85 = null;
    com.google.javascript.rhino.jstype.ObjectType var86 = var69.createObjectType("", var83, var85);
    boolean var87 = var86.isArrayType();
    boolean var88 = var86.isNominalType();
    com.google.javascript.rhino.jstype.FunctionType var89 = null;
    com.google.javascript.rhino.jstype.FunctionType var90 = null;
    var26.applyDelegateRelationship(var46, var66, var86, var89, var90);
    java.util.Set var92 = var86.getPropertyNames();
    com.google.javascript.rhino.jstype.JSType[] var93 = new com.google.javascript.rhino.jstype.JSType[] { var86};
    com.google.javascript.rhino.jstype.FunctionType var94 = var5.createConstructorType((com.google.javascript.rhino.jstype.JSType)var24, var93);
    com.google.javascript.rhino.jstype.FunctionBuilder var95 = var1.copyFromOtherFunction(var94);
    com.google.common.collect.ImmutableList var96 = null;
    com.google.javascript.rhino.jstype.FunctionBuilder var97 = var1.withTemplateKeys(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.jstype.StaticSourceFile var3 = var2.getStaticSourceFile();
    com.google.javascript.rhino.Node[] var4 = new com.google.javascript.rhino.Node[] { var2};
    com.google.javascript.rhino.Node var5 = new com.google.javascript.rhino.Node(10, var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.script(var4);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }


    com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.lang.String var1 = var0.getDelegateSuperclassName();
    com.google.javascript.rhino.ErrorReporter var2 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
    com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var3);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var8 = null;
    boolean var9 = var7.hasChild(var8);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var12 = null;
    boolean var13 = var11.hasChild(var12);
    com.google.javascript.rhino.Node var14 = var7.clonePropsFrom(var11);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.throwNode(var16);
    com.google.javascript.rhino.Node var18 = var7.srcref(var17);
    com.google.javascript.rhino.jstype.ObjectType var19 = null;
    com.google.javascript.rhino.jstype.ObjectType var20 = var3.createObjectType("", var17, var19);
    boolean var21 = var20.isUnknownType();
    com.google.javascript.rhino.ErrorReporter var22 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var22);
    com.google.javascript.rhino.jstype.FunctionBuilder var24 = new com.google.javascript.rhino.jstype.FunctionBuilder(var23);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var28 = null;
    boolean var29 = var27.hasChild(var28);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var32 = null;
    boolean var33 = var31.hasChild(var32);
    com.google.javascript.rhino.Node var34 = var27.clonePropsFrom(var31);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.throwNode(var36);
    com.google.javascript.rhino.Node var38 = var27.srcref(var37);
    com.google.javascript.rhino.jstype.ObjectType var39 = null;
    com.google.javascript.rhino.jstype.ObjectType var40 = var23.createObjectType("", var37, var39);
    boolean var41 = var40.isArrayType();
    com.google.javascript.rhino.ErrorReporter var42 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var42);
    com.google.javascript.rhino.jstype.FunctionBuilder var44 = new com.google.javascript.rhino.jstype.FunctionBuilder(var43);
    com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var48 = null;
    boolean var49 = var47.hasChild(var48);
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var52 = null;
    boolean var53 = var51.hasChild(var52);
    com.google.javascript.rhino.Node var54 = var47.clonePropsFrom(var51);
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.throwNode(var56);
    com.google.javascript.rhino.Node var58 = var47.srcref(var57);
    com.google.javascript.rhino.jstype.ObjectType var59 = null;
    com.google.javascript.rhino.jstype.ObjectType var60 = var43.createObjectType("", var57, var59);
    boolean var61 = var60.isArrayType();
    boolean var62 = var60.isNominalType();
    com.google.javascript.rhino.jstype.FunctionType var63 = null;
    com.google.javascript.rhino.jstype.FunctionType var64 = null;
    var0.applyDelegateRelationship(var20, var40, var60, var63, var64);
    com.google.javascript.rhino.Node var67 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode((com.google.javascript.jscomp.CodingConvention)var0, "");
    com.google.javascript.rhino.Node var69 = new com.google.javascript.rhino.Node(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast var70 = var0.getObjectLiteralCast(var69);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test104() {}
//   public void test104() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     boolean var2 = var0.isPrivate("(hi!)");
//     com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.stringKey("(hi!)");
//     java.lang.String var5 = var0.getSingletonGetterClassName(var4);
// 
//   }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }


    com.google.javascript.jscomp.CheckLevel[] var0 = com.google.javascript.jscomp.CheckLevel.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test106() {}
//   public void test106() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     var0.processDefines();
// 
//   }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.ErrorReporter var2 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
    com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var3);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var8 = null;
    boolean var9 = var7.hasChild(var8);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var12 = null;
    boolean var13 = var11.hasChild(var12);
    com.google.javascript.rhino.Node var14 = var7.clonePropsFrom(var11);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.throwNode(var16);
    com.google.javascript.rhino.Node var18 = var7.srcref(var17);
    com.google.javascript.rhino.jstype.ObjectType var19 = null;
    com.google.javascript.rhino.jstype.ObjectType var20 = var3.createObjectType("", var17, var19);
    boolean var21 = var20.isUnknownType();
    com.google.javascript.jscomp.GoogleCodingConvention var22 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.lang.String var23 = var22.getDelegateSuperclassName();
    com.google.javascript.rhino.ErrorReporter var24 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24);
    com.google.javascript.rhino.jstype.FunctionBuilder var26 = new com.google.javascript.rhino.jstype.FunctionBuilder(var25);
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var30 = null;
    boolean var31 = var29.hasChild(var30);
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var34 = null;
    boolean var35 = var33.hasChild(var34);
    com.google.javascript.rhino.Node var36 = var29.clonePropsFrom(var33);
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.throwNode(var38);
    com.google.javascript.rhino.Node var40 = var29.srcref(var39);
    com.google.javascript.rhino.jstype.ObjectType var41 = null;
    com.google.javascript.rhino.jstype.ObjectType var42 = var25.createObjectType("", var39, var41);
    boolean var43 = var42.isUnknownType();
    com.google.javascript.rhino.ErrorReporter var44 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var44);
    com.google.javascript.rhino.jstype.FunctionBuilder var46 = new com.google.javascript.rhino.jstype.FunctionBuilder(var45);
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var50 = null;
    boolean var51 = var49.hasChild(var50);
    com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var54 = null;
    boolean var55 = var53.hasChild(var54);
    com.google.javascript.rhino.Node var56 = var49.clonePropsFrom(var53);
    com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var59 = com.google.javascript.rhino.IR.throwNode(var58);
    com.google.javascript.rhino.Node var60 = var49.srcref(var59);
    com.google.javascript.rhino.jstype.ObjectType var61 = null;
    com.google.javascript.rhino.jstype.ObjectType var62 = var45.createObjectType("", var59, var61);
    boolean var63 = var62.isArrayType();
    com.google.javascript.rhino.ErrorReporter var64 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var64);
    com.google.javascript.rhino.jstype.FunctionBuilder var66 = new com.google.javascript.rhino.jstype.FunctionBuilder(var65);
    com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var70 = null;
    boolean var71 = var69.hasChild(var70);
    com.google.javascript.rhino.Node var73 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var74 = null;
    boolean var75 = var73.hasChild(var74);
    com.google.javascript.rhino.Node var76 = var69.clonePropsFrom(var73);
    com.google.javascript.rhino.Node var78 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var79 = com.google.javascript.rhino.IR.throwNode(var78);
    com.google.javascript.rhino.Node var80 = var69.srcref(var79);
    com.google.javascript.rhino.jstype.ObjectType var81 = null;
    com.google.javascript.rhino.jstype.ObjectType var82 = var65.createObjectType("", var79, var81);
    boolean var83 = var82.isArrayType();
    boolean var84 = var82.isNominalType();
    com.google.javascript.rhino.jstype.FunctionType var85 = null;
    com.google.javascript.rhino.jstype.FunctionType var86 = null;
    var22.applyDelegateRelationship(var42, var62, var82, var85, var86);
    java.util.Set var88 = var82.getPropertyNames();
    com.google.javascript.rhino.jstype.JSType[] var89 = new com.google.javascript.rhino.jstype.JSType[] { var82};
    com.google.javascript.rhino.jstype.FunctionType var90 = var1.createConstructorType((com.google.javascript.rhino.jstype.JSType)var20, var89);
    var1.identifyNonNullableName("NAME ");
    com.google.javascript.jscomp.JSModule var94 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.CompilerInput var96 = var94.getByName("");
    java.util.List var97 = var94.getDependencies();
    com.google.javascript.rhino.Node var98 = var1.createParameters(var97);
    com.google.javascript.jscomp.JSModule[] var99 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var99);

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setRemoveAbstractMethods(false);
    var0.setTweakToStringLiteral("function ({788694856}): {1325375508}", "goog.exportProperty");
    com.google.javascript.jscomp.CheckLevel var6 = null;
    var0.setCheckMissingReturn(var6);
    byte[] var9 = new byte[] { (byte)10};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setInputVariableMapSerialized(var9);
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test109() {}
//   public void test109() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.JSModule var2 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.CompilerInput var4 = var2.getByName("");
//     java.util.List var5 = var2.getDependencies();
//     com.google.javascript.jscomp.NodeTraversal.Callback var6 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var0, var5, var6);
//     var0.check();
// 
//   }

  public void test110() {}
//   public void test110() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }
// 
// 
//     com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.SourceFile.Generator var3 = null;
//     com.google.javascript.jscomp.SourceFile var4 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var3);
//     var1.add(var4);
//     java.lang.String var6 = var1.toString();
//     com.google.javascript.jscomp.SourceFile.Generator var8 = null;
//     com.google.javascript.jscomp.SourceFile var9 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var8);
//     boolean var10 = var9.isExtern();
//     java.lang.String var11 = var9.getName();
//     var1.add(var9);
//     java.lang.String var13 = var9.toString();
//     com.google.javascript.jscomp.Region var15 = var9.getRegion(0);
// 
//   }

  public void test111() {}
//   public void test111() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.JSModule var2 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.CompilerInput var4 = var2.getByName("");
//     java.util.List var5 = var2.getDependencies();
//     com.google.javascript.jscomp.NodeTraversal.Callback var6 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var0, var5, var6);
//     java.util.Map var8 = var0.getInputsById();
// 
//   }

  public void test112() {}
//   public void test112() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.rhino.Node var2 = new com.google.javascript.rhino.Node(1, var1);
// 
//   }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = com.google.javascript.rhino.ScriptRuntime.escapeString("function ({253302735}): {946478791}", 'a');
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test114() {}
//   public void test114() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.JSModule var2 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.CompilerInput var4 = var2.getByName("");
//     java.util.List var5 = var2.getDependencies();
//     com.google.javascript.jscomp.NodeTraversal.Callback var6 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var0, var5, var6);
//     com.google.javascript.jscomp.Compiler.IntermediateState var8 = null;
//     var0.setState(var8);
// 
//   }

  public void test115() {}
//   public void test115() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test115"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var2 = new com.google.javascript.jscomp.CompilerInput(var0, true);
// 
//   }

  public void test116() {}
//   public void test116() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }
// 
// 
//     java.lang.String var0 = com.google.javascript.jscomp.Compiler.getReleaseVersion();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var0 + "' != '" + "Unversioned directory"+ "'", var0.equals("Unversioned directory"));
// 
//   }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.JSModule var2 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.CompilerInput var4 = var2.getByName("");
    java.util.List var5 = var2.getDependencies();
    com.google.javascript.jscomp.NodeTraversal.Callback var6 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var0, var5, var6);
    com.google.javascript.jscomp.Compiler.CodeBuilder var8 = null;
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var12 = null;
    boolean var13 = var11.hasChild(var12);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var16 = null;
    boolean var17 = var15.hasChild(var16);
    com.google.javascript.rhino.Node var18 = var11.clonePropsFrom(var15);
    boolean var19 = var11.isRegExp();
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.name("");
    int var22 = var21.getChildCount();
    var21.setString("");
    com.google.javascript.rhino.Node var25 = var11.useSourceInfoFromForTree(var21);
    boolean var26 = var25.isDec();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.toSource(var8, 10, var25);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
    int var3 = var2.getChildCount();
    var2.setString("");
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.InputId var8 = var7.getInputId();
    com.google.javascript.rhino.Node var9 = new com.google.javascript.rhino.Node((-1), var2, var7);
    boolean var10 = var2.isThrow();
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.name("");
    int var14 = var13.getChildCount();
    var13.setString("");
    var13.setCharno(1);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.name("");
    boolean var21 = var20.isVarArgs();
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.name("");
    int var24 = var23.getChildCount();
    boolean var25 = var23.isWith();
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var28 = null;
    boolean var29 = var27.hasChild(var28);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var32 = null;
    boolean var33 = var31.hasChild(var32);
    com.google.javascript.rhino.Node var34 = var27.clonePropsFrom(var31);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.throwNode(var36);
    com.google.javascript.rhino.Node var38 = var27.srcref(var37);
    com.google.javascript.rhino.Node var39 = new com.google.javascript.rhino.Node((-1), var13, var20, var23, var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.getprop(var2, var13);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test119() {}
//   public void test119() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }
// 
// 
//     java.io.File var0 = null;
//     com.google.javascript.jscomp.SourceFile var1 = com.google.javascript.jscomp.SourceFile.fromFile(var0);
// 
//   }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var2 = null;
    boolean var3 = var1.hasChild(var2);
    boolean var4 = var1.hasOneChild();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.stringKey("(hi!)");
    com.google.javascript.jscomp.GoogleCodingConvention var7 = new com.google.javascript.jscomp.GoogleCodingConvention();
    com.google.javascript.rhino.Node var9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode((com.google.javascript.jscomp.CodingConvention)var7, "");
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.propdef(var6, var9);
    boolean var11 = var10.isFromExterns();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.var(var1, var10);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
    int var3 = var2.getChildCount();
    var2.setString("");
    var2.setCharno(1);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.name("");
    boolean var10 = var9.isVarArgs();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.name("");
    int var13 = var12.getChildCount();
    boolean var14 = var12.isWith();
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var17 = null;
    boolean var18 = var16.hasChild(var17);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var21 = null;
    boolean var22 = var20.hasChild(var21);
    com.google.javascript.rhino.Node var23 = var16.clonePropsFrom(var20);
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.throwNode(var25);
    com.google.javascript.rhino.Node var27 = var16.srcref(var26);
    com.google.javascript.rhino.Node var28 = new com.google.javascript.rhino.Node((-1), var2, var9, var12, var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var16.setSideEffectFlags(100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test122() {}
//   public void test122() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test122"); }
// 
// 
//     com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.SourceFile.Generator var3 = null;
//     com.google.javascript.jscomp.SourceFile var4 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var3);
//     var1.add(var4);
//     com.google.javascript.jscomp.CompilerInput var7 = new com.google.javascript.jscomp.CompilerInput(var4, true);
//     com.google.javascript.jscomp.CompilerInput var10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var7, "function ({253302735}): {946478791}", true);
//     java.util.Collection var11 = var7.getRequires();
// 
//   }

  public void test123() {}
//   public void test123() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var2 = null;
//     boolean var3 = var1.hasChild(var2);
//     com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var6 = null;
//     boolean var7 = var5.hasChild(var6);
//     com.google.javascript.rhino.Node var8 = var1.clonePropsFrom(var5);
//     boolean var9 = var5.isAssign();
//     var5.setSourceFileForTesting("function ({253302735}): {946478791}");
//     com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var14 = null;
//     boolean var15 = var13.hasChild(var14);
//     java.lang.String var16 = var5.checkTreeEquals(var14);
// 
//   }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.FunctionBuilder var2 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var10 = null;
    boolean var11 = var9.hasChild(var10);
    com.google.javascript.rhino.Node var12 = var5.clonePropsFrom(var9);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.throwNode(var14);
    com.google.javascript.rhino.Node var16 = var5.srcref(var15);
    com.google.javascript.rhino.jstype.ObjectType var17 = null;
    com.google.javascript.rhino.jstype.ObjectType var18 = var1.createObjectType("", var15, var17);
    com.google.javascript.jscomp.GoogleCodingConvention var19 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.lang.String var20 = var19.getDelegateSuperclassName();
    com.google.javascript.rhino.ErrorReporter var21 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21);
    com.google.javascript.rhino.jstype.FunctionBuilder var23 = new com.google.javascript.rhino.jstype.FunctionBuilder(var22);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var27 = null;
    boolean var28 = var26.hasChild(var27);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var31 = null;
    boolean var32 = var30.hasChild(var31);
    com.google.javascript.rhino.Node var33 = var26.clonePropsFrom(var30);
    com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.throwNode(var35);
    com.google.javascript.rhino.Node var37 = var26.srcref(var36);
    com.google.javascript.rhino.jstype.ObjectType var38 = null;
    com.google.javascript.rhino.jstype.ObjectType var39 = var22.createObjectType("", var36, var38);
    boolean var40 = var39.isUnknownType();
    com.google.javascript.rhino.ErrorReporter var41 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var41);
    com.google.javascript.rhino.jstype.FunctionBuilder var43 = new com.google.javascript.rhino.jstype.FunctionBuilder(var42);
    com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var47 = null;
    boolean var48 = var46.hasChild(var47);
    com.google.javascript.rhino.Node var50 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var51 = null;
    boolean var52 = var50.hasChild(var51);
    com.google.javascript.rhino.Node var53 = var46.clonePropsFrom(var50);
    com.google.javascript.rhino.Node var55 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.throwNode(var55);
    com.google.javascript.rhino.Node var57 = var46.srcref(var56);
    com.google.javascript.rhino.jstype.ObjectType var58 = null;
    com.google.javascript.rhino.jstype.ObjectType var59 = var42.createObjectType("", var56, var58);
    boolean var60 = var59.isArrayType();
    com.google.javascript.rhino.ErrorReporter var61 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var61);
    com.google.javascript.rhino.jstype.FunctionBuilder var63 = new com.google.javascript.rhino.jstype.FunctionBuilder(var62);
    com.google.javascript.rhino.Node var66 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var67 = null;
    boolean var68 = var66.hasChild(var67);
    com.google.javascript.rhino.Node var70 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var71 = null;
    boolean var72 = var70.hasChild(var71);
    com.google.javascript.rhino.Node var73 = var66.clonePropsFrom(var70);
    com.google.javascript.rhino.Node var75 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var76 = com.google.javascript.rhino.IR.throwNode(var75);
    com.google.javascript.rhino.Node var77 = var66.srcref(var76);
    com.google.javascript.rhino.jstype.ObjectType var78 = null;
    com.google.javascript.rhino.jstype.ObjectType var79 = var62.createObjectType("", var76, var78);
    boolean var80 = var79.isArrayType();
    boolean var81 = var79.isNominalType();
    com.google.javascript.rhino.jstype.FunctionType var82 = null;
    com.google.javascript.rhino.jstype.FunctionType var83 = null;
    var19.applyDelegateRelationship(var39, var59, var79, var82, var83);
    com.google.javascript.rhino.jstype.ObjectType var85 = var1.createObjectType(var59);
    java.lang.String var86 = var59.toAnnotationString();
    com.google.javascript.rhino.jstype.ObjectType var87 = var59.dereference();
    boolean var88 = var87.isNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var86 + "' != '" + ""+ "'", var86.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);

  }

  public void test125() {}
//   public void test125() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test125"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var0 = null;
//     java.lang.String[] var2 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var3 = com.google.javascript.jscomp.JSError.make(var0, var2);
// 
//   }

  public void test126() {}
//   public void test126() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test126"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var4 = null;
//     java.lang.String[] var6 = new java.lang.String[] { "Unversioned directory"};
//     com.google.javascript.jscomp.JSError var7 = com.google.javascript.jscomp.JSError.make("function ({253302735}): {946478791}", 1, 1, var3, var4, var6);
// 
//   }

  public void test127() {}
//   public void test127() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test127"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.thisNode();
//     com.google.javascript.rhino.Node var2 = var0.getChildAtIndex(38);
// 
//   }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test128"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.FunctionBuilder var2 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var10 = null;
    boolean var11 = var9.hasChild(var10);
    com.google.javascript.rhino.Node var12 = var5.clonePropsFrom(var9);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.throwNode(var14);
    com.google.javascript.rhino.Node var16 = var5.srcref(var15);
    com.google.javascript.rhino.jstype.ObjectType var17 = null;
    com.google.javascript.rhino.jstype.ObjectType var18 = var1.createObjectType("", var15, var17);
    com.google.javascript.jscomp.GoogleCodingConvention var19 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.lang.String var20 = var19.getDelegateSuperclassName();
    com.google.javascript.rhino.ErrorReporter var21 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21);
    com.google.javascript.rhino.jstype.FunctionBuilder var23 = new com.google.javascript.rhino.jstype.FunctionBuilder(var22);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var27 = null;
    boolean var28 = var26.hasChild(var27);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var31 = null;
    boolean var32 = var30.hasChild(var31);
    com.google.javascript.rhino.Node var33 = var26.clonePropsFrom(var30);
    com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.throwNode(var35);
    com.google.javascript.rhino.Node var37 = var26.srcref(var36);
    com.google.javascript.rhino.jstype.ObjectType var38 = null;
    com.google.javascript.rhino.jstype.ObjectType var39 = var22.createObjectType("", var36, var38);
    boolean var40 = var39.isUnknownType();
    com.google.javascript.rhino.ErrorReporter var41 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var41);
    com.google.javascript.rhino.jstype.FunctionBuilder var43 = new com.google.javascript.rhino.jstype.FunctionBuilder(var42);
    com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var47 = null;
    boolean var48 = var46.hasChild(var47);
    com.google.javascript.rhino.Node var50 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var51 = null;
    boolean var52 = var50.hasChild(var51);
    com.google.javascript.rhino.Node var53 = var46.clonePropsFrom(var50);
    com.google.javascript.rhino.Node var55 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.throwNode(var55);
    com.google.javascript.rhino.Node var57 = var46.srcref(var56);
    com.google.javascript.rhino.jstype.ObjectType var58 = null;
    com.google.javascript.rhino.jstype.ObjectType var59 = var42.createObjectType("", var56, var58);
    boolean var60 = var59.isArrayType();
    com.google.javascript.rhino.ErrorReporter var61 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var61);
    com.google.javascript.rhino.jstype.FunctionBuilder var63 = new com.google.javascript.rhino.jstype.FunctionBuilder(var62);
    com.google.javascript.rhino.Node var66 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var67 = null;
    boolean var68 = var66.hasChild(var67);
    com.google.javascript.rhino.Node var70 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var71 = null;
    boolean var72 = var70.hasChild(var71);
    com.google.javascript.rhino.Node var73 = var66.clonePropsFrom(var70);
    com.google.javascript.rhino.Node var75 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var76 = com.google.javascript.rhino.IR.throwNode(var75);
    com.google.javascript.rhino.Node var77 = var66.srcref(var76);
    com.google.javascript.rhino.jstype.ObjectType var78 = null;
    com.google.javascript.rhino.jstype.ObjectType var79 = var62.createObjectType("", var76, var78);
    boolean var80 = var79.isArrayType();
    boolean var81 = var79.isNominalType();
    com.google.javascript.rhino.jstype.FunctionType var82 = null;
    com.google.javascript.rhino.jstype.FunctionType var83 = null;
    var19.applyDelegateRelationship(var39, var59, var79, var82, var83);
    com.google.javascript.rhino.jstype.ObjectType var85 = var1.createObjectType(var59);
    boolean var86 = var85.isFunctionPrototypeType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test129"); }


    com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.lang.String var1 = var0.getDelegateSuperclassName();
    com.google.javascript.rhino.ErrorReporter var2 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
    com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var3);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var8 = null;
    boolean var9 = var7.hasChild(var8);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var12 = null;
    boolean var13 = var11.hasChild(var12);
    com.google.javascript.rhino.Node var14 = var7.clonePropsFrom(var11);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.throwNode(var16);
    com.google.javascript.rhino.Node var18 = var7.srcref(var17);
    com.google.javascript.rhino.jstype.ObjectType var19 = null;
    com.google.javascript.rhino.jstype.ObjectType var20 = var3.createObjectType("", var17, var19);
    boolean var21 = var20.isUnknownType();
    com.google.javascript.rhino.ErrorReporter var22 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var22);
    com.google.javascript.rhino.jstype.FunctionBuilder var24 = new com.google.javascript.rhino.jstype.FunctionBuilder(var23);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var28 = null;
    boolean var29 = var27.hasChild(var28);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var32 = null;
    boolean var33 = var31.hasChild(var32);
    com.google.javascript.rhino.Node var34 = var27.clonePropsFrom(var31);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.throwNode(var36);
    com.google.javascript.rhino.Node var38 = var27.srcref(var37);
    com.google.javascript.rhino.jstype.ObjectType var39 = null;
    com.google.javascript.rhino.jstype.ObjectType var40 = var23.createObjectType("", var37, var39);
    boolean var41 = var40.isArrayType();
    com.google.javascript.rhino.ErrorReporter var42 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var42);
    com.google.javascript.rhino.jstype.FunctionBuilder var44 = new com.google.javascript.rhino.jstype.FunctionBuilder(var43);
    com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var48 = null;
    boolean var49 = var47.hasChild(var48);
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var52 = null;
    boolean var53 = var51.hasChild(var52);
    com.google.javascript.rhino.Node var54 = var47.clonePropsFrom(var51);
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.throwNode(var56);
    com.google.javascript.rhino.Node var58 = var47.srcref(var57);
    com.google.javascript.rhino.jstype.ObjectType var59 = null;
    com.google.javascript.rhino.jstype.ObjectType var60 = var43.createObjectType("", var57, var59);
    boolean var61 = var60.isArrayType();
    boolean var62 = var60.isNominalType();
    com.google.javascript.rhino.jstype.FunctionType var63 = null;
    com.google.javascript.rhino.jstype.FunctionType var64 = null;
    var0.applyDelegateRelationship(var20, var40, var60, var63, var64);
    com.google.javascript.rhino.Node var67 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode((com.google.javascript.jscomp.CodingConvention)var0, "");
    boolean var68 = var67.isUnscopedQualifiedName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.JSDocInfo var69 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(var67);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);

  }

  public void test130() {}
//   public void test130() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test130"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.PassConfig var1 = null;
//     var0.setPassConfig(var1);
// 
//   }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test131"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.FunctionBuilder var2 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var10 = null;
    boolean var11 = var9.hasChild(var10);
    com.google.javascript.rhino.Node var12 = var5.clonePropsFrom(var9);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.throwNode(var14);
    com.google.javascript.rhino.Node var16 = var5.srcref(var15);
    com.google.javascript.rhino.jstype.ObjectType var17 = null;
    com.google.javascript.rhino.jstype.ObjectType var18 = var1.createObjectType("", var15, var17);
    boolean var20 = var1.isForwardDeclaredType("NAME ");
    var1.setLastGeneration(true);
    com.google.javascript.rhino.ErrorReporter var24 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24);
    com.google.javascript.rhino.jstype.FunctionBuilder var26 = new com.google.javascript.rhino.jstype.FunctionBuilder(var25);
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var30 = null;
    boolean var31 = var29.hasChild(var30);
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var34 = null;
    boolean var35 = var33.hasChild(var34);
    com.google.javascript.rhino.Node var36 = var29.clonePropsFrom(var33);
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.throwNode(var38);
    com.google.javascript.rhino.Node var40 = var29.srcref(var39);
    com.google.javascript.rhino.jstype.ObjectType var41 = null;
    com.google.javascript.rhino.jstype.ObjectType var42 = var25.createObjectType("", var39, var41);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.overwriteDeclaredType("function ({1869362278}): {686050736}", (com.google.javascript.rhino.jstype.JSType)var42);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test132"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.stringKey("NAME \n");
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.stringKey("(hi!)");
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var4 = var3.getJsDocBuilderForNode();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.sheq(var1, var3);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test133() {}
//   public void test133() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test133"); }
// 
// 
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
//     int var3 = var2.getChildCount();
//     var2.setString("");
//     var2.setCharno(1);
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.name("");
//     boolean var10 = var9.isVarArgs();
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.name("");
//     int var13 = var12.getChildCount();
//     boolean var14 = var12.isWith();
//     com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var17 = null;
//     boolean var18 = var16.hasChild(var17);
//     com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var21 = null;
//     boolean var22 = var20.hasChild(var21);
//     com.google.javascript.rhino.Node var23 = var16.clonePropsFrom(var20);
//     com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.throwNode(var25);
//     com.google.javascript.rhino.Node var27 = var16.srcref(var26);
//     com.google.javascript.rhino.Node var28 = new com.google.javascript.rhino.Node((-1), var2, var9, var12, var16);
//     com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var31 = null;
//     boolean var32 = var30.hasChild(var31);
//     com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var35 = null;
//     boolean var36 = var34.hasChild(var35);
//     com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var39 = null;
//     boolean var40 = var38.hasChild(var39);
//     com.google.javascript.rhino.Node var41 = var34.clonePropsFrom(var38);
//     boolean var42 = var34.isRegExp();
//     com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.IR.name("");
//     int var45 = var44.getChildCount();
//     var44.setString("");
//     com.google.javascript.rhino.Node var48 = var34.useSourceInfoFromForTree(var44);
//     boolean var49 = var48.isDec();
//     boolean var50 = var48.isNot();
//     com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.var(var48);
//     boolean var52 = var48.hasMoreThanOneChild();
//     com.google.javascript.rhino.Node var54 = com.google.javascript.rhino.IR.stringKey("(hi!)");
//     com.google.javascript.jscomp.GoogleCodingConvention var55 = new com.google.javascript.jscomp.GoogleCodingConvention();
//     com.google.javascript.rhino.Node var57 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode((com.google.javascript.jscomp.CodingConvention)var55, "");
//     com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.propdef(var54, var57);
//     com.google.javascript.jscomp.GoogleCodingConvention var59 = new com.google.javascript.jscomp.GoogleCodingConvention();
//     com.google.javascript.rhino.Node var61 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var62 = null;
//     boolean var63 = var61.hasChild(var62);
//     var61.setVarArgs(false);
//     com.google.javascript.rhino.Node var66 = com.google.javascript.rhino.IR.thisNode();
//     java.lang.String var67 = var59.extractClassNameIfProvide(var61, var66);
//     com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var70 = null;
//     boolean var71 = var69.hasChild(var70);
//     com.google.javascript.rhino.Node var73 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var74 = null;
//     boolean var75 = var73.hasChild(var74);
//     com.google.javascript.rhino.Node var76 = var69.clonePropsFrom(var73);
//     com.google.javascript.rhino.Node var78 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var79 = com.google.javascript.rhino.IR.throwNode(var78);
//     com.google.javascript.rhino.Node var80 = var69.srcref(var79);
//     com.google.javascript.jscomp.CodingConvention.Bind var82 = var59.describeFunctionBind(var69, false);
//     var57.addChildrenToFront(var69);
//     com.google.javascript.rhino.Node var84 = com.google.javascript.rhino.IR.forNode(var12, var31, var48, var57);
// 
//   }

  public void test134() {}
//   public void test134() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test134"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Compiler.IntermediateState var1 = var0.getState();
//     com.google.javascript.jscomp.JSError var2 = null;
//     var0.report(var2);
// 
//   }

  public void test135() {}
//   public void test135() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test135"); }
// 
// 
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
//     int var3 = var2.getChildCount();
//     var2.setString("");
//     var2.setCharno(1);
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.name("");
//     boolean var10 = var9.isVarArgs();
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.name("");
//     int var13 = var12.getChildCount();
//     boolean var14 = var12.isWith();
//     com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var17 = null;
//     boolean var18 = var16.hasChild(var17);
//     com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var21 = null;
//     boolean var22 = var20.hasChild(var21);
//     com.google.javascript.rhino.Node var23 = var16.clonePropsFrom(var20);
//     com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.throwNode(var25);
//     com.google.javascript.rhino.Node var27 = var16.srcref(var26);
//     com.google.javascript.rhino.Node var28 = new com.google.javascript.rhino.Node((-1), var2, var9, var12, var16);
//     boolean var29 = var28.isCatch();
//     com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.thisNode();
//     java.lang.String var31 = var30.getSourceFileName();
//     com.google.javascript.rhino.Node var32 = var28.useSourceInfoFrom(var30);
//     com.google.javascript.rhino.Node var33 = null;
//     com.google.javascript.rhino.Node var34 = var28.copyInformationFromForTree(var33);
// 
//   }

  public void test136() {}
//   public void test136() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test136"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     com.google.javascript.rhino.jstype.FunctionBuilder var2 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
//     com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var6 = null;
//     boolean var7 = var5.hasChild(var6);
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var10 = null;
//     boolean var11 = var9.hasChild(var10);
//     com.google.javascript.rhino.Node var12 = var5.clonePropsFrom(var9);
//     com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.throwNode(var14);
//     com.google.javascript.rhino.Node var16 = var5.srcref(var15);
//     com.google.javascript.rhino.jstype.ObjectType var17 = null;
//     com.google.javascript.rhino.jstype.ObjectType var18 = var1.createObjectType("", var15, var17);
//     com.google.javascript.jscomp.GoogleCodingConvention var19 = new com.google.javascript.jscomp.GoogleCodingConvention();
//     java.lang.String var20 = var19.getDelegateSuperclassName();
//     com.google.javascript.rhino.ErrorReporter var21 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21);
//     com.google.javascript.rhino.jstype.FunctionBuilder var23 = new com.google.javascript.rhino.jstype.FunctionBuilder(var22);
//     com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var27 = null;
//     boolean var28 = var26.hasChild(var27);
//     com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var31 = null;
//     boolean var32 = var30.hasChild(var31);
//     com.google.javascript.rhino.Node var33 = var26.clonePropsFrom(var30);
//     com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.throwNode(var35);
//     com.google.javascript.rhino.Node var37 = var26.srcref(var36);
//     com.google.javascript.rhino.jstype.ObjectType var38 = null;
//     com.google.javascript.rhino.jstype.ObjectType var39 = var22.createObjectType("", var36, var38);
//     boolean var40 = var39.isUnknownType();
//     com.google.javascript.rhino.ErrorReporter var41 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var41);
//     com.google.javascript.rhino.jstype.FunctionBuilder var43 = new com.google.javascript.rhino.jstype.FunctionBuilder(var42);
//     com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var47 = null;
//     boolean var48 = var46.hasChild(var47);
//     com.google.javascript.rhino.Node var50 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var51 = null;
//     boolean var52 = var50.hasChild(var51);
//     com.google.javascript.rhino.Node var53 = var46.clonePropsFrom(var50);
//     com.google.javascript.rhino.Node var55 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.throwNode(var55);
//     com.google.javascript.rhino.Node var57 = var46.srcref(var56);
//     com.google.javascript.rhino.jstype.ObjectType var58 = null;
//     com.google.javascript.rhino.jstype.ObjectType var59 = var42.createObjectType("", var56, var58);
//     boolean var60 = var59.isArrayType();
//     com.google.javascript.rhino.ErrorReporter var61 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var61);
//     com.google.javascript.rhino.jstype.FunctionBuilder var63 = new com.google.javascript.rhino.jstype.FunctionBuilder(var62);
//     com.google.javascript.rhino.Node var66 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var67 = null;
//     boolean var68 = var66.hasChild(var67);
//     com.google.javascript.rhino.Node var70 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var71 = null;
//     boolean var72 = var70.hasChild(var71);
//     com.google.javascript.rhino.Node var73 = var66.clonePropsFrom(var70);
//     com.google.javascript.rhino.Node var75 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var76 = com.google.javascript.rhino.IR.throwNode(var75);
//     com.google.javascript.rhino.Node var77 = var66.srcref(var76);
//     com.google.javascript.rhino.jstype.ObjectType var78 = null;
//     com.google.javascript.rhino.jstype.ObjectType var79 = var62.createObjectType("", var76, var78);
//     boolean var80 = var79.isArrayType();
//     boolean var81 = var79.isNominalType();
//     com.google.javascript.rhino.jstype.FunctionType var82 = null;
//     com.google.javascript.rhino.jstype.FunctionType var83 = null;
//     var19.applyDelegateRelationship(var39, var59, var79, var82, var83);
//     com.google.javascript.rhino.jstype.ObjectType var85 = var1.createObjectType(var59);
//     java.lang.Iterable var87 = var1.getTypesWithProperty("");
//     com.google.javascript.rhino.jstype.JSType var89 = var1.getType("");
//     com.google.javascript.rhino.jstype.JSType var90 = null;
//     com.google.javascript.rhino.jstype.JSType var91 = var1.createDefaultObjectUnion(var90);
// 
//   }

  public void test137() {}
//   public void test137() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test137"); }
// 
// 
//     com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
//     com.google.javascript.rhino.Node var1 = null;
//     java.util.List var2 = var0.identifyTypeDeclarationCall(var1);
// 
//   }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test138"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    int var2 = var1.getChildCount();
    boolean var3 = var1.isWith();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setDouble(1.0d);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test139() {}
//   public void test139() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test139"); }
// 
// 
//     com.google.javascript.jscomp.AstValidator.ViolationHandler var0 = null;
//     com.google.javascript.jscomp.AstValidator var1 = new com.google.javascript.jscomp.AstValidator(var0);
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var4 = null;
//     boolean var5 = var3.hasChild(var4);
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var8 = null;
//     boolean var9 = var7.hasChild(var8);
//     com.google.javascript.rhino.Node var10 = var3.clonePropsFrom(var7);
//     boolean var11 = var3.isRegExp();
//     boolean var12 = var3.isComma();
//     com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.neg(var3);
//     com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.name("");
//     int var16 = var15.getType();
//     boolean var17 = var15.isUnscopedQualifiedName();
//     var1.process(var3, var15);
// 
//   }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test140"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.lang.Object var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = var0.getWeight(var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test141"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var4 = null;
    boolean var5 = var3.hasChild(var4);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var8 = null;
    boolean var9 = var7.hasChild(var8);
    com.google.javascript.rhino.Node var10 = var3.clonePropsFrom(var7);
    boolean var11 = var3.isRegExp();
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.name("");
    int var14 = var13.getChildCount();
    var13.setString("");
    com.google.javascript.rhino.Node var17 = var3.useSourceInfoFromForTree(var13);
    java.lang.String var21 = var3.toString(false, true, false);
    var3.setLength(38);
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.jstype.StaticSourceFile var26 = var25.getStaticSourceFile();
    boolean var27 = var25.isComma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.forIn(var1, var3, var25);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "NAME "+ "'", var21.equals("NAME "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test142() {}
//   public void test142() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test142"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "NAME ", false);
//     com.google.javascript.jscomp.JSModule var5 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.SourceFile.Generator var7 = null;
//     com.google.javascript.jscomp.SourceFile var8 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var7);
//     var5.add(var8);
//     java.util.Set var10 = var5.getAllDependencies();
//     var3.setModule(var5);
//     com.google.javascript.jscomp.CompilerInput var14 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var3, "function ({1869362278}): {686050736}", false);
// 
//   }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test143"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.ErrorManager var1 = var0.getErrorManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.optimize();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test144"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    java.util.Collection var1 = var0.getAssertionFunctions();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.name("");
    int var4 = var3.getType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast var5 = var0.getObjectLiteralCast(var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 38);

  }

  public void test145() {}
//   public void test145() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test145"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.not(var0);
// 
//   }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test146"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var2 = null;
    boolean var3 = var1.hasChild(var2);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    com.google.javascript.rhino.Node var8 = var1.clonePropsFrom(var5);
    boolean var9 = var1.isRegExp();
    boolean var10 = var1.isComma();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.neg(var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var12 = var11.getDouble();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test147"); }


    com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var3 = null;
    boolean var4 = var2.hasChild(var3);
    var2.setVarArgs(false);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.thisNode();
    java.lang.String var8 = var0.extractClassNameIfProvide(var2, var7);
    boolean var9 = var7.isThrow();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.JSDocInfo var10 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(var7);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test148() {}
//   public void test148() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test148"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     com.google.javascript.rhino.Node var2 = new com.google.javascript.rhino.Node(0);
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.add(var0, var2);
// 
//   }

  public void test149() {}
//   public void test149() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test149"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.jstype.StaticSourceFile var2 = var1.getStaticSourceFile();
//     boolean var3 = var1.isGetElem();
//     com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var6 = null;
//     boolean var7 = var5.hasChild(var6);
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var10 = null;
//     boolean var11 = var9.hasChild(var10);
//     com.google.javascript.rhino.Node var12 = var5.clonePropsFrom(var9);
//     boolean var13 = var9.isAssign();
//     com.google.javascript.rhino.Node var14 = var1.getChildBefore(var9);
// 
//   }

  public void test150() {}
//   public void test150() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test150"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     com.google.javascript.rhino.ErrorReporter var2 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
//     com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var3);
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var8 = null;
//     boolean var9 = var7.hasChild(var8);
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var12 = null;
//     boolean var13 = var11.hasChild(var12);
//     com.google.javascript.rhino.Node var14 = var7.clonePropsFrom(var11);
//     com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.throwNode(var16);
//     com.google.javascript.rhino.Node var18 = var7.srcref(var17);
//     com.google.javascript.rhino.jstype.ObjectType var19 = null;
//     com.google.javascript.rhino.jstype.ObjectType var20 = var3.createObjectType("", var17, var19);
//     boolean var21 = var20.isUnknownType();
//     com.google.javascript.jscomp.GoogleCodingConvention var22 = new com.google.javascript.jscomp.GoogleCodingConvention();
//     java.lang.String var23 = var22.getDelegateSuperclassName();
//     com.google.javascript.rhino.ErrorReporter var24 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24);
//     com.google.javascript.rhino.jstype.FunctionBuilder var26 = new com.google.javascript.rhino.jstype.FunctionBuilder(var25);
//     com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var30 = null;
//     boolean var31 = var29.hasChild(var30);
//     com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var34 = null;
//     boolean var35 = var33.hasChild(var34);
//     com.google.javascript.rhino.Node var36 = var29.clonePropsFrom(var33);
//     com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.throwNode(var38);
//     com.google.javascript.rhino.Node var40 = var29.srcref(var39);
//     com.google.javascript.rhino.jstype.ObjectType var41 = null;
//     com.google.javascript.rhino.jstype.ObjectType var42 = var25.createObjectType("", var39, var41);
//     boolean var43 = var42.isUnknownType();
//     com.google.javascript.rhino.ErrorReporter var44 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var44);
//     com.google.javascript.rhino.jstype.FunctionBuilder var46 = new com.google.javascript.rhino.jstype.FunctionBuilder(var45);
//     com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var50 = null;
//     boolean var51 = var49.hasChild(var50);
//     com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var54 = null;
//     boolean var55 = var53.hasChild(var54);
//     com.google.javascript.rhino.Node var56 = var49.clonePropsFrom(var53);
//     com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var59 = com.google.javascript.rhino.IR.throwNode(var58);
//     com.google.javascript.rhino.Node var60 = var49.srcref(var59);
//     com.google.javascript.rhino.jstype.ObjectType var61 = null;
//     com.google.javascript.rhino.jstype.ObjectType var62 = var45.createObjectType("", var59, var61);
//     boolean var63 = var62.isArrayType();
//     com.google.javascript.rhino.ErrorReporter var64 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var64);
//     com.google.javascript.rhino.jstype.FunctionBuilder var66 = new com.google.javascript.rhino.jstype.FunctionBuilder(var65);
//     com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var70 = null;
//     boolean var71 = var69.hasChild(var70);
//     com.google.javascript.rhino.Node var73 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var74 = null;
//     boolean var75 = var73.hasChild(var74);
//     com.google.javascript.rhino.Node var76 = var69.clonePropsFrom(var73);
//     com.google.javascript.rhino.Node var78 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var79 = com.google.javascript.rhino.IR.throwNode(var78);
//     com.google.javascript.rhino.Node var80 = var69.srcref(var79);
//     com.google.javascript.rhino.jstype.ObjectType var81 = null;
//     com.google.javascript.rhino.jstype.ObjectType var82 = var65.createObjectType("", var79, var81);
//     boolean var83 = var82.isArrayType();
//     boolean var84 = var82.isNominalType();
//     com.google.javascript.rhino.jstype.FunctionType var85 = null;
//     com.google.javascript.rhino.jstype.FunctionType var86 = null;
//     var22.applyDelegateRelationship(var42, var62, var82, var85, var86);
//     java.util.Set var88 = var82.getPropertyNames();
//     com.google.javascript.rhino.jstype.JSType[] var89 = new com.google.javascript.rhino.jstype.JSType[] { var82};
//     com.google.javascript.rhino.jstype.FunctionType var90 = var1.createConstructorType((com.google.javascript.rhino.jstype.JSType)var20, var89);
//     java.lang.String var91 = var90.toDebugHashCodeString();
//     com.google.javascript.rhino.jstype.ObjectType var92 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType)var90);
//     boolean var93 = var92.isUnionType();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var17);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var20);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var21 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var23);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var29);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var31 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var33);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var35 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var36);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var38);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var39);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var40);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var42);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var43 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var49);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var51 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var53);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var55 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var56);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var58);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var59);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var60);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var62);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var63 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var69);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var71 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var73);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var75 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var76);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var78);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var79);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var80);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var82);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var83 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var84 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var88);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var89);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var90);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var91 + "' != '" + "function ({211361749}): {418963305}"+ "'", var91.equals("function ({211361749}): {418963305}"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var92);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var93 == false);
// 
//   }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test151"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.CompilerOptions var1 = new com.google.javascript.jscomp.CompilerOptions();
    var1.setPropertyAffinity(false);
    com.google.javascript.jscomp.JSModule var5 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.CompilerInput var7 = var5.getByName("");
    java.util.List var8 = var5.getDependencies();
    var1.setReplaceStringsFunctionDescriptions(var8);
    com.google.javascript.jscomp.JSModule var11 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.CompilerInput var13 = var11.getByName("");
    java.util.List var14 = var11.getDependencies();
    com.google.javascript.jscomp.CompilerOptions var15 = new com.google.javascript.jscomp.CompilerOptions();
    var15.setRemoveAbstractMethods(false);
    var15.setTweakToStringLiteral("function ({788694856}): {1325375508}", "goog.exportProperty");
    com.google.javascript.jscomp.Result var21 = var0.<com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.SourceFile>compile(var8, var14, var15);
    com.google.javascript.jscomp.SourceMap var22 = var0.getSourceMap();
    com.google.javascript.jscomp.JSModule var24 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.CompilerInput var26 = var24.getByName("");
    java.lang.String[] var27 = var0.toSourceArray(var24);
    com.google.javascript.jscomp.LightweightMessageFormatter var28 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var0);
    var0.parse();
    com.google.javascript.jscomp.NodeTraversal.Callback var30 = null;
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.jstype.StaticSourceFile var34 = var33.getStaticSourceFile();
    com.google.javascript.rhino.Node[] var35 = new com.google.javascript.rhino.Node[] { var33};
    com.google.javascript.rhino.Node var36 = new com.google.javascript.rhino.Node(10, var35);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var0, var30, var35);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test152() {}
//   public void test152() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test152"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.trueNode();
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.ifNode(var0, var1);
// 
//   }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test153"); }


    java.util.logging.Level var0 = null;
    com.google.javascript.jscomp.Compiler.setLoggingLevel(var0);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test154"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var2 = null;
    boolean var3 = var1.hasChild(var2);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    com.google.javascript.rhino.Node var8 = var1.clonePropsFrom(var5);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.throwNode(var10);
    com.google.javascript.rhino.Node var12 = var1.srcref(var11);
    var11.setOptionalArg(true);
    java.lang.Iterable var15 = var11.children();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.setDouble(0.0d);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test155() {}
//   public void test155() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test155"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.CompilerOptions var1 = new com.google.javascript.jscomp.CompilerOptions();
//     var1.setPropertyAffinity(false);
//     com.google.javascript.jscomp.JSModule var5 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.CompilerInput var7 = var5.getByName("");
//     java.util.List var8 = var5.getDependencies();
//     var1.setReplaceStringsFunctionDescriptions(var8);
//     com.google.javascript.jscomp.JSModule var11 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.CompilerInput var13 = var11.getByName("");
//     java.util.List var14 = var11.getDependencies();
//     com.google.javascript.jscomp.CompilerOptions var15 = new com.google.javascript.jscomp.CompilerOptions();
//     var15.setRemoveAbstractMethods(false);
//     var15.setTweakToStringLiteral("function ({788694856}): {1325375508}", "goog.exportProperty");
//     com.google.javascript.jscomp.Result var21 = var0.<com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.SourceFile>compile(var8, var14, var15);
//     com.google.javascript.jscomp.SourceMap var22 = var0.getSourceMap();
//     com.google.javascript.jscomp.JSModule var24 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.CompilerInput var26 = var24.getByName("");
//     java.lang.String[] var27 = var0.toSourceArray(var24);
//     com.google.javascript.jscomp.JSModule var29 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.SourceFile.Generator var31 = null;
//     com.google.javascript.jscomp.SourceFile var32 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var31);
//     var29.add(var32);
//     java.lang.String var34 = var29.toString();
//     com.google.javascript.jscomp.SourceFile.Generator var36 = null;
//     com.google.javascript.jscomp.SourceFile var37 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var36);
//     boolean var38 = var37.isExtern();
//     java.lang.String var39 = var37.getName();
//     var29.add(var37);
//     com.google.javascript.rhino.Node var41 = var0.parse(var37);
// 
//   }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test156"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.jstype.StaticSourceFile var4 = var3.getStaticSourceFile();
    com.google.javascript.rhino.Node[] var5 = new com.google.javascript.rhino.Node[] { var3};
    com.google.javascript.rhino.Node var6 = new com.google.javascript.rhino.Node(10, var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var9 = new com.google.javascript.rhino.Node(100, var5, 100, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test157"); }


    com.google.javascript.jscomp.AstValidator var0 = new com.google.javascript.jscomp.AstValidator();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
    int var3 = var2.getChildCount();
    var2.setString("");
    boolean var6 = var2.isFunction();
    boolean var7 = var2.isNoSideEffectsCall();
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
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test158"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var2 = null;
    boolean var3 = var1.hasChild(var2);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    com.google.javascript.rhino.Node var8 = var1.clonePropsFrom(var5);
    boolean var9 = var1.isRegExp();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
    int var12 = var11.getChildCount();
    var11.setString("");
    com.google.javascript.rhino.Node var15 = var1.useSourceInfoFromForTree(var11);
    boolean var16 = var15.isDec();
    boolean var17 = var15.isNot();
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.var(var15);
    boolean var19 = var15.isCast();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test159() {}
//   public void test159() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test159"); }
// 
// 
//     java.io.InputStream var2 = null;
//     com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromInputStream("function ({743976902}): {1369999080}", "function ({788694856}): {1325375508}", var2);
// 
//   }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test160"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.jstype.StaticSourceFile var4 = var3.getStaticSourceFile();
    com.google.javascript.rhino.Node[] var5 = new com.google.javascript.rhino.Node[] { var3};
    com.google.javascript.rhino.Node var6 = new com.google.javascript.rhino.Node(10, var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var7 = new com.google.javascript.rhino.Node(38, var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test161"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.SourceFile.Generator var3 = null;
    com.google.javascript.jscomp.SourceFile var4 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var3);
    var1.add(var4);
    java.lang.String var6 = var1.toString();
    com.google.javascript.jscomp.SourceFile.Generator var8 = null;
    com.google.javascript.jscomp.SourceFile var9 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var8);
    boolean var10 = var9.isExtern();
    java.lang.String var11 = var9.getName();
    var1.add(var9);
    com.google.javascript.jscomp.JSModule var14 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.SourceFile.Generator var16 = null;
    com.google.javascript.jscomp.SourceFile var17 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var16);
    var14.add(var17);
    java.lang.String var19 = var14.toString();
    var1.addDependency(var14);
    com.google.javascript.jscomp.JSModule var22 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.SourceFile.Generator var24 = null;
    com.google.javascript.jscomp.SourceFile var25 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var24);
    var22.add(var25);
    com.google.javascript.jscomp.CompilerInput var28 = new com.google.javascript.jscomp.CompilerInput(var25, true);
    var14.remove(var28);
    com.google.javascript.jscomp.JSModule var31 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.SourceFile.Generator var33 = null;
    com.google.javascript.jscomp.SourceFile var34 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var33);
    com.google.javascript.jscomp.CompilerInput var36 = new com.google.javascript.jscomp.CompilerInput(var34, false);
    var31.add(var36);
    com.google.javascript.jscomp.CompilerInput var38 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var14.addAfter(var36, var38);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "NAME "+ "'", var6.equals("NAME "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "NAME "+ "'", var19.equals("NAME "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test162"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var1 = com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.valueOf("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test163"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = com.google.javascript.rhino.ScriptRuntime.getMessage0("function ({297922085}): {1392101438}");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test164"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.SourceFile.Generator var3 = null;
    com.google.javascript.jscomp.SourceFile var4 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var3);
    var1.add(var4);
    boolean var7 = var1.removeByName("NAME ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test165"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
    int var3 = var2.getChildCount();
    var2.setString("");
    var2.setCharno(1);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.name("");
    boolean var10 = var9.isVarArgs();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.name("");
    int var13 = var12.getChildCount();
    boolean var14 = var12.isWith();
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var17 = null;
    boolean var18 = var16.hasChild(var17);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var21 = null;
    boolean var22 = var20.hasChild(var21);
    com.google.javascript.rhino.Node var23 = var16.clonePropsFrom(var20);
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.throwNode(var25);
    com.google.javascript.rhino.Node var27 = var16.srcref(var26);
    com.google.javascript.rhino.Node var28 = new com.google.javascript.rhino.Node((-1), var2, var9, var12, var16);
    boolean var29 = var2.isString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.continueNode(var2);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test166"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.jstype.StaticSourceFile var4 = var3.getStaticSourceFile();
    com.google.javascript.rhino.Node[] var5 = new com.google.javascript.rhino.Node[] { var3};
    com.google.javascript.rhino.Node var6 = new com.google.javascript.rhino.Node(10, var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var7 = new com.google.javascript.rhino.Node(1, var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test167"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.CompilerOptions var1 = new com.google.javascript.jscomp.CompilerOptions();
    var1.setPropertyAffinity(false);
    com.google.javascript.jscomp.JSModule var5 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.CompilerInput var7 = var5.getByName("");
    java.util.List var8 = var5.getDependencies();
    var1.setReplaceStringsFunctionDescriptions(var8);
    com.google.javascript.jscomp.JSModule var11 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.CompilerInput var13 = var11.getByName("");
    java.util.List var14 = var11.getDependencies();
    com.google.javascript.jscomp.CompilerOptions var15 = new com.google.javascript.jscomp.CompilerOptions();
    var15.setRemoveAbstractMethods(false);
    var15.setTweakToStringLiteral("function ({788694856}): {1325375508}", "goog.exportProperty");
    com.google.javascript.jscomp.Result var21 = var0.<com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.SourceFile>compile(var8, var14, var15);
    com.google.javascript.jscomp.SourceMap var22 = var0.getSourceMap();
    com.google.javascript.jscomp.JSModule var24 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.CompilerInput var26 = var24.getByName("");
    java.lang.String[] var27 = var0.toSourceArray(var24);
    com.google.javascript.jscomp.LightweightMessageFormatter var28 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var0);
    com.google.javascript.jscomp.JSError[] var29 = var0.getMessages();
    com.google.javascript.jscomp.CompilerOptions var30 = new com.google.javascript.jscomp.CompilerOptions();
    var30.setRemoveAbstractMethods(false);
    var30.setTweakToStringLiteral("function ({788694856}): {1325375508}", "goog.exportProperty");
    var30.setRemoveClosureAsserts(false);
    var30.setRemoveUnusedLocalVars(true);
    var30.setLocale("NAME \n");
    com.google.javascript.jscomp.DefaultPassConfig var42 = new com.google.javascript.jscomp.DefaultPassConfig(var30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setPassConfig((com.google.javascript.jscomp.PassConfig)var42);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test168"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.SourceFile.Generator var3 = null;
    com.google.javascript.jscomp.SourceFile var4 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var3);
    var1.add(var4);
    java.lang.String var6 = var1.toString();
    com.google.javascript.jscomp.SourceFile.Generator var8 = null;
    com.google.javascript.jscomp.SourceFile var9 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var8);
    boolean var10 = var9.isExtern();
    java.lang.String var11 = var9.getName();
    var1.add(var9);
    var9.setOriginalPath("function ({1989090318}): {763041777}");
    com.google.javascript.jscomp.parsing.Config var17 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(true);
    com.google.javascript.rhino.head.ErrorReporter var18 = null;
    java.util.logging.Logger var19 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var20 = com.google.javascript.jscomp.parsing.ParserRunner.parse((com.google.javascript.rhino.jstype.StaticSourceFile)var9, "function ({211361749}): {418963305}", var17, var18, var19);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "NAME "+ "'", var6.equals("NAME "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test169"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.CompilerOptions var1 = new com.google.javascript.jscomp.CompilerOptions();
    var1.setPropertyAffinity(false);
    com.google.javascript.jscomp.JSModule var5 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.CompilerInput var7 = var5.getByName("");
    java.util.List var8 = var5.getDependencies();
    var1.setReplaceStringsFunctionDescriptions(var8);
    com.google.javascript.jscomp.JSModule var11 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.CompilerInput var13 = var11.getByName("");
    java.util.List var14 = var11.getDependencies();
    com.google.javascript.jscomp.CompilerOptions var15 = new com.google.javascript.jscomp.CompilerOptions();
    var15.setRemoveAbstractMethods(false);
    var15.setTweakToStringLiteral("function ({788694856}): {1325375508}", "goog.exportProperty");
    com.google.javascript.jscomp.Result var21 = var0.<com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.SourceFile>compile(var8, var14, var15);
    com.google.javascript.jscomp.SourceMap var22 = var0.getSourceMap();
    com.google.javascript.jscomp.JSModule var24 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.CompilerInput var26 = var24.getByName("");
    java.lang.String[] var27 = var0.toSourceArray(var24);
    com.google.javascript.rhino.InputId var28 = null;
    com.google.javascript.jscomp.CompilerInput var29 = var0.getInput(var28);
    com.google.javascript.rhino.Node var30 = var0.getRoot();
    com.google.javascript.jscomp.NodeTraversal.Callback var31 = null;
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.jstype.StaticSourceFile var34 = var33.getStaticSourceFile();
    boolean var35 = var33.isComma();
    com.google.javascript.rhino.Node[] var36 = new com.google.javascript.rhino.Node[] { var33};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var0, var31, var36);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test170() {}
//   public void test170() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test170"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var1);
//     java.lang.String var3 = var2.toString();
//     com.google.javascript.jscomp.CompilerInput var5 = new com.google.javascript.jscomp.CompilerInput(var2, false);
//     int var6 = var5.getNumLines();
// 
//   }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test171"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var2 = null;
    boolean var3 = var1.hasChild(var2);
    boolean var4 = var1.hasOneChild();
    boolean var5 = var1.isLocalResultCall();
    com.google.javascript.rhino.Node[] var6 = new com.google.javascript.rhino.Node[] { var1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.block(var6);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test172"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
    int var3 = var2.getChildCount();
    var2.setString("");
    var2.setCharno(1);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.name("");
    boolean var10 = var9.isVarArgs();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.name("");
    int var13 = var12.getChildCount();
    boolean var14 = var12.isWith();
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var17 = null;
    boolean var18 = var16.hasChild(var17);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var21 = null;
    boolean var22 = var20.hasChild(var21);
    com.google.javascript.rhino.Node var23 = var16.clonePropsFrom(var20);
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.throwNode(var25);
    com.google.javascript.rhino.Node var27 = var16.srcref(var26);
    com.google.javascript.rhino.Node var28 = new com.google.javascript.rhino.Node((-1), var2, var9, var12, var16);
    boolean var29 = var28.isCatch();
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.thisNode();
    java.lang.String var31 = var30.getSourceFileName();
    com.google.javascript.rhino.Node var32 = var28.useSourceInfoFrom(var30);
    boolean var33 = var32.isSyntheticBlock();
    com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var36 = null;
    boolean var37 = var35.hasChild(var36);
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var40 = null;
    boolean var41 = var39.hasChild(var40);
    com.google.javascript.rhino.Node var42 = var35.clonePropsFrom(var39);
    boolean var43 = var35.isRegExp();
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.name("");
    int var46 = var45.getChildCount();
    var45.setString("");
    com.google.javascript.rhino.Node var49 = var35.useSourceInfoFromForTree(var45);
    boolean var50 = var49.isDec();
    boolean var51 = var49.isNot();
    com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.IR.var(var49);
    com.google.javascript.rhino.Node var54 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.jstype.StaticSourceFile var55 = var54.getStaticSourceFile();
    boolean var56 = var54.isGetElem();
    com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.jstype.StaticSourceFile var59 = var58.getStaticSourceFile();
    boolean var60 = var58.isGetElem();
    com.google.javascript.rhino.Node var61 = com.google.javascript.rhino.IR.neg(var58);
    com.google.javascript.rhino.Node var64 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var65 = null;
    boolean var66 = var64.hasChild(var65);
    com.google.javascript.rhino.Node var68 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var69 = null;
    boolean var70 = var68.hasChild(var69);
    com.google.javascript.rhino.Node var71 = var64.clonePropsFrom(var68);
    boolean var72 = var68.isAssign();
    com.google.javascript.rhino.Node var74 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.jstype.StaticSourceFile var75 = var74.getStaticSourceFile();
    boolean var76 = var74.isComma();
    int var77 = var74.getLineno();
    com.google.javascript.rhino.Node var78 = new com.google.javascript.rhino.Node((-1), var68, var74);
    com.google.javascript.rhino.Node var79 = var61.copyInformationFromForTree(var68);
    com.google.javascript.rhino.Node var80 = com.google.javascript.rhino.IR.assign(var54, var79);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var81 = com.google.javascript.rhino.IR.ifNode(var32, var52, var54);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test173() {}
//   public void test173() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test173"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var1 = null;
//     java.util.List var2 = var0.getNeighborNodes(var1);
// 
//   }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test174"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.lang.Object var1 = null;
    com.google.javascript.jscomp.graph.GraphNode var2 = var0.getNode(var1);
    var0.clearNodeAnnotations();
    com.google.javascript.jscomp.Compiler var4 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.ErrorManager var5 = var4.getErrorManager();
    java.lang.String var6 = var4.getAstDotGraph();
    com.google.javascript.jscomp.JSModule var8 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.SourceFile.Generator var10 = null;
    com.google.javascript.jscomp.SourceFile var11 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var10);
    var8.add(var11);
    com.google.javascript.jscomp.CompilerInput var14 = new com.google.javascript.jscomp.CompilerInput(var11, true);
    java.lang.String var15 = var14.getName();
    com.google.javascript.jscomp.CompilerInput var17 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var14, false);
    var17.clearAst();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var19 = var0.getEdges((java.lang.Object)var6, (java.lang.Object)var17);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test175"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.lang.Object var1 = null;
    com.google.javascript.jscomp.graph.GraphNode var2 = var0.getNode(var1);
    java.lang.Object var4 = null;
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    int var8 = var7.getChildCount();
    var7.setString("");
    var7.setCharno(1);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("");
    boolean var15 = var14.isVarArgs();
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.name("");
    int var18 = var17.getChildCount();
    boolean var19 = var17.isWith();
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var22 = null;
    boolean var23 = var21.hasChild(var22);
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var26 = null;
    boolean var27 = var25.hasChild(var26);
    com.google.javascript.rhino.Node var28 = var21.clonePropsFrom(var25);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.throwNode(var30);
    com.google.javascript.rhino.Node var32 = var21.srcref(var31);
    com.google.javascript.rhino.Node var33 = new com.google.javascript.rhino.Node((-1), var7, var14, var17, var21);
    boolean var34 = var33.isCatch();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.connect((java.lang.Object)'4', var4, (java.lang.Object)var34);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test176() {}
//   public void test176() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test176"); }
// 
// 
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var3 = null;
//     boolean var4 = var2.hasChild(var3);
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var7 = null;
//     boolean var8 = var6.hasChild(var7);
//     com.google.javascript.rhino.Node var9 = var2.clonePropsFrom(var6);
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.throwNode(var11);
//     com.google.javascript.rhino.Node var13 = var2.srcref(var12);
//     com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var16 = null;
//     boolean var17 = var15.hasChild(var16);
//     com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var20 = null;
//     boolean var21 = var19.hasChild(var20);
//     com.google.javascript.rhino.Node var22 = var15.clonePropsFrom(var19);
//     boolean var23 = var15.isRegExp();
//     com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.name("");
//     int var26 = var25.getChildCount();
//     var25.setString("");
//     com.google.javascript.rhino.Node var29 = var15.useSourceInfoFromForTree(var25);
//     boolean var30 = var29.isDec();
//     int var31 = var29.getCharno();
//     boolean var32 = var29.isVarArgs();
//     com.google.javascript.rhino.Node var33 = var13.srcrefTree(var29);
//     com.google.javascript.jscomp.CheckLevel var34 = null;
//     com.google.javascript.jscomp.DiagnosticType var35 = null;
//     java.lang.String[] var37 = new java.lang.String[] { "Unversioned directory"};
//     com.google.javascript.jscomp.JSError var38 = com.google.javascript.jscomp.JSError.make("goog.exportProperty", var33, var34, var35, var37);
// 
//   }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test177"); }


    boolean var1 = com.google.javascript.rhino.TokenStream.isJSIdentifier("NAME ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test178() {}
//   public void test178() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test178"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var3 = null;
//     boolean var4 = var2.hasChild(var3);
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var7 = null;
//     boolean var8 = var6.hasChild(var7);
//     com.google.javascript.rhino.Node var9 = var2.clonePropsFrom(var6);
//     boolean var10 = var2.isRegExp();
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.name("");
//     int var13 = var12.getChildCount();
//     var12.setString("");
//     com.google.javascript.rhino.Node var16 = var2.useSourceInfoFromForTree(var12);
//     java.lang.String var20 = var2.toString(false, true, false);
//     boolean var21 = var2.isGetElem();
//     com.google.javascript.rhino.Node var22 = null;
//     java.lang.String var23 = var0.extractClassNameIfRequire(var2, var22);
// 
//   }

  public void test179() {}
//   public void test179() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test179"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.stringKey("NAME \n");
//     java.lang.Appendable var2 = null;
//     var1.appendStringTree(var2);
// 
//   }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test180"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.lang.Object var1 = null;
    com.google.javascript.jscomp.graph.GraphNode var2 = var0.getNode(var1);
    var0.clearNodeAnnotations();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var5 = var0.getDirectedSuccNodes(var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test181() {}
//   public void test181() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test181"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     com.google.javascript.rhino.jstype.FunctionBuilder var2 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
//     com.google.javascript.rhino.jstype.JSTypeNative var3 = null;
//     com.google.javascript.rhino.jstype.ObjectType var4 = var1.getNativeObjectType(var3);
// 
//   }

  public void test182() {}
//   public void test182() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test182"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.ErrorManager var1 = var0.getErrorManager();
//     java.lang.String var2 = var0.getAstDotGraph();
//     com.google.javascript.jscomp.CompilerInput var4 = var0.newExternInput("function ({297922085}): {1392101438}");
// 
//   }

  public void test183() {}
//   public void test183() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test183"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticGroup var0 = null;
//     com.google.javascript.jscomp.DiagnosticGroup[] var1 = new com.google.javascript.jscomp.DiagnosticGroup[] { var0};
//     com.google.javascript.jscomp.DiagnosticGroup var2 = new com.google.javascript.jscomp.DiagnosticGroup(var1);
// 
//   }

  public void test184() {}
//   public void test184() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test184"); }
// 
// 
//     com.google.javascript.jscomp.CodingConvention var0 = null;
//     com.google.javascript.rhino.Node var2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(var0, "NAME ");
// 
//   }

  public void test185() {}
//   public void test185() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test185"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var2 = null;
//     boolean var3 = var1.hasChild(var2);
//     com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var6 = null;
//     boolean var7 = var5.hasChild(var6);
//     com.google.javascript.rhino.Node var8 = var1.clonePropsFrom(var5);
//     boolean var9 = var1.isRegExp();
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
//     int var12 = var11.getChildCount();
//     var11.setString("");
//     com.google.javascript.rhino.Node var15 = var1.useSourceInfoFromForTree(var11);
//     boolean var16 = var11.isCatch();
//     com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var19 = null;
//     boolean var20 = var18.hasChild(var19);
//     com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var23 = null;
//     boolean var24 = var22.hasChild(var23);
//     com.google.javascript.rhino.Node var25 = var18.clonePropsFrom(var22);
//     boolean var26 = var18.isRegExp();
//     com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.name("");
//     int var29 = var28.getChildCount();
//     var28.setString("");
//     com.google.javascript.rhino.Node var32 = var18.useSourceInfoFromForTree(var28);
//     java.lang.String var36 = var18.toString(false, true, false);
//     var11.addChildrenToFront(var18);
//     com.google.javascript.rhino.Node var38 = null;
//     com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.getprop(var11, var38);
// 
//   }

  public void test186() {}
//   public void test186() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test186"); }
// 
// 
//     com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.SourceFile.Generator var3 = null;
//     com.google.javascript.jscomp.SourceFile var4 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var3);
//     var1.add(var4);
//     com.google.javascript.jscomp.CompilerInput var7 = new com.google.javascript.jscomp.CompilerInput(var4, true);
//     com.google.javascript.jscomp.CompilerInput var10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var7, "function ({253302735}): {946478791}", true);
//     com.google.javascript.jscomp.Region var12 = var10.getRegion(1);
// 
//   }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test187"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var2 = null;
    boolean var3 = var1.hasChild(var2);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    com.google.javascript.rhino.Node var8 = var1.clonePropsFrom(var5);
    boolean var9 = var5.isAssign();
    var5.setSourceFileForTesting("function ({253302735}): {946478791}");
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var14 = null;
    boolean var15 = var13.hasChild(var14);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var18 = null;
    boolean var19 = var17.hasChild(var18);
    com.google.javascript.rhino.Node var20 = var13.clonePropsFrom(var17);
    boolean var21 = var13.isRegExp();
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.name("");
    int var24 = var23.getChildCount();
    var23.setString("");
    com.google.javascript.rhino.Node var27 = var13.useSourceInfoFromForTree(var23);
    java.lang.String var31 = var13.toString(false, true, false);
    var13.setLength(38);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.IR.tryCatch(var5, var13);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "NAME "+ "'", var31.equals("NAME "));

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test188"); }


    com.google.javascript.rhino.Node var2 = new com.google.javascript.rhino.Node((-1));
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    int var6 = var5.getChildCount();
    var5.setString("");
    var5.setCharno(1);
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.name("");
    boolean var13 = var12.isVarArgs();
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.name("");
    int var16 = var15.getChildCount();
    boolean var17 = var15.isWith();
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var20 = null;
    boolean var21 = var19.hasChild(var20);
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var24 = null;
    boolean var25 = var23.hasChild(var24);
    com.google.javascript.rhino.Node var26 = var19.clonePropsFrom(var23);
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.throwNode(var28);
    com.google.javascript.rhino.Node var30 = var19.srcref(var29);
    com.google.javascript.rhino.Node var31 = new com.google.javascript.rhino.Node((-1), var5, var12, var15, var19);
    boolean var32 = var31.isCatch();
    boolean var33 = var31.isGetElem();
    com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var36 = null;
    boolean var37 = var35.hasChild(var36);
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var40 = null;
    boolean var41 = var39.hasChild(var40);
    com.google.javascript.rhino.Node var42 = var35.clonePropsFrom(var39);
    boolean var43 = var35.isVoid();
    boolean var44 = var35.isScript();
    com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var47 = null;
    boolean var48 = var46.hasChild(var47);
    boolean var49 = var46.hasOneChild();
    com.google.javascript.rhino.Node var50 = var35.clonePropsFrom(var46);
    com.google.javascript.rhino.Node var53 = new com.google.javascript.rhino.Node(10, var2, var31, var46, (-1), 0);
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.name("");
    int var57 = var56.getChildCount();
    var56.setString("");
    var56.setCharno(1);
    com.google.javascript.rhino.Node var63 = com.google.javascript.rhino.IR.name("");
    boolean var64 = var63.isVarArgs();
    com.google.javascript.rhino.Node var66 = com.google.javascript.rhino.IR.name("");
    int var67 = var66.getChildCount();
    boolean var68 = var66.isWith();
    com.google.javascript.rhino.Node var70 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var71 = null;
    boolean var72 = var70.hasChild(var71);
    com.google.javascript.rhino.Node var74 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var75 = null;
    boolean var76 = var74.hasChild(var75);
    com.google.javascript.rhino.Node var77 = var70.clonePropsFrom(var74);
    com.google.javascript.rhino.Node var79 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var80 = com.google.javascript.rhino.IR.throwNode(var79);
    com.google.javascript.rhino.Node var81 = var70.srcref(var80);
    com.google.javascript.rhino.Node var82 = new com.google.javascript.rhino.Node((-1), var56, var63, var66, var70);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var83 = com.google.javascript.rhino.IR.comma(var46, var70);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);

  }

  public void test189() {}
//   public void test189() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test189"); }
// 
// 
//     com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
//     java.lang.String var1 = var0.getDelegateSuperclassName();
//     com.google.javascript.rhino.ErrorReporter var2 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
//     com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var3);
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var8 = null;
//     boolean var9 = var7.hasChild(var8);
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var12 = null;
//     boolean var13 = var11.hasChild(var12);
//     com.google.javascript.rhino.Node var14 = var7.clonePropsFrom(var11);
//     com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.throwNode(var16);
//     com.google.javascript.rhino.Node var18 = var7.srcref(var17);
//     com.google.javascript.rhino.jstype.ObjectType var19 = null;
//     com.google.javascript.rhino.jstype.ObjectType var20 = var3.createObjectType("", var17, var19);
//     boolean var21 = var20.isUnknownType();
//     com.google.javascript.rhino.ErrorReporter var22 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var22);
//     com.google.javascript.rhino.jstype.FunctionBuilder var24 = new com.google.javascript.rhino.jstype.FunctionBuilder(var23);
//     com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var28 = null;
//     boolean var29 = var27.hasChild(var28);
//     com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var32 = null;
//     boolean var33 = var31.hasChild(var32);
//     com.google.javascript.rhino.Node var34 = var27.clonePropsFrom(var31);
//     com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.throwNode(var36);
//     com.google.javascript.rhino.Node var38 = var27.srcref(var37);
//     com.google.javascript.rhino.jstype.ObjectType var39 = null;
//     com.google.javascript.rhino.jstype.ObjectType var40 = var23.createObjectType("", var37, var39);
//     boolean var41 = var40.isArrayType();
//     com.google.javascript.rhino.ErrorReporter var42 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var42);
//     com.google.javascript.rhino.jstype.FunctionBuilder var44 = new com.google.javascript.rhino.jstype.FunctionBuilder(var43);
//     com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var48 = null;
//     boolean var49 = var47.hasChild(var48);
//     com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var52 = null;
//     boolean var53 = var51.hasChild(var52);
//     com.google.javascript.rhino.Node var54 = var47.clonePropsFrom(var51);
//     com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.throwNode(var56);
//     com.google.javascript.rhino.Node var58 = var47.srcref(var57);
//     com.google.javascript.rhino.jstype.ObjectType var59 = null;
//     com.google.javascript.rhino.jstype.ObjectType var60 = var43.createObjectType("", var57, var59);
//     boolean var61 = var60.isArrayType();
//     boolean var62 = var60.isNominalType();
//     com.google.javascript.rhino.jstype.FunctionType var63 = null;
//     com.google.javascript.rhino.jstype.FunctionType var64 = null;
//     var0.applyDelegateRelationship(var20, var40, var60, var63, var64);
//     com.google.javascript.rhino.Node var67 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode((com.google.javascript.jscomp.CodingConvention)var0, "");
//     boolean var68 = var67.isInc();
//     com.google.javascript.jscomp.DiagnosticType var69 = null;
//     com.google.javascript.jscomp.Compiler var70 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.CompilerOptions var71 = new com.google.javascript.jscomp.CompilerOptions();
//     var71.setPropertyAffinity(false);
//     com.google.javascript.jscomp.JSModule var75 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.CompilerInput var77 = var75.getByName("");
//     java.util.List var78 = var75.getDependencies();
//     var71.setReplaceStringsFunctionDescriptions(var78);
//     com.google.javascript.jscomp.JSModule var81 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.CompilerInput var83 = var81.getByName("");
//     java.util.List var84 = var81.getDependencies();
//     com.google.javascript.jscomp.CompilerOptions var85 = new com.google.javascript.jscomp.CompilerOptions();
//     var85.setRemoveAbstractMethods(false);
//     var85.setTweakToStringLiteral("function ({788694856}): {1325375508}", "goog.exportProperty");
//     com.google.javascript.jscomp.Result var91 = var70.<com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.SourceFile>compile(var78, var84, var85);
//     com.google.javascript.jscomp.SourceMap var92 = var70.getSourceMap();
//     com.google.javascript.jscomp.JSModule var94 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.CompilerInput var96 = var94.getByName("");
//     java.lang.String[] var97 = var70.toSourceArray(var94);
//     com.google.javascript.jscomp.JSError var98 = com.google.javascript.jscomp.JSError.make(var67, var69, var97);
// 
//   }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test190"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.CompilerOptions var1 = new com.google.javascript.jscomp.CompilerOptions();
    var1.setPropertyAffinity(false);
    com.google.javascript.jscomp.JSModule var5 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.CompilerInput var7 = var5.getByName("");
    java.util.List var8 = var5.getDependencies();
    var1.setReplaceStringsFunctionDescriptions(var8);
    com.google.javascript.jscomp.JSModule var11 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.CompilerInput var13 = var11.getByName("");
    java.util.List var14 = var11.getDependencies();
    com.google.javascript.jscomp.CompilerOptions var15 = new com.google.javascript.jscomp.CompilerOptions();
    var15.setRemoveAbstractMethods(false);
    var15.setTweakToStringLiteral("function ({788694856}): {1325375508}", "goog.exportProperty");
    com.google.javascript.jscomp.Result var21 = var0.<com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.SourceFile>compile(var8, var14, var15);
    var15.setCheckSymbols(true);
    com.google.javascript.jscomp.VariableRenamingPolicy var24 = null;
    var15.setVariableRenaming(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test191"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    java.util.Collection var1 = var0.getAssertionFunctions();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var4 = null;
    boolean var5 = var3.hasChild(var4);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var8 = null;
    boolean var9 = var7.hasChild(var8);
    com.google.javascript.rhino.Node var10 = var3.clonePropsFrom(var7);
    com.google.javascript.jscomp.CodingConvention.Bind var12 = var0.describeFunctionBind(var3, true);
    com.google.javascript.jscomp.GoogleCodingConvention var13 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.lang.String var14 = var13.getDelegateSuperclassName();
    com.google.javascript.rhino.ErrorReporter var15 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var15);
    com.google.javascript.rhino.jstype.FunctionBuilder var17 = new com.google.javascript.rhino.jstype.FunctionBuilder(var16);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var21 = null;
    boolean var22 = var20.hasChild(var21);
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var25 = null;
    boolean var26 = var24.hasChild(var25);
    com.google.javascript.rhino.Node var27 = var20.clonePropsFrom(var24);
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.throwNode(var29);
    com.google.javascript.rhino.Node var31 = var20.srcref(var30);
    com.google.javascript.rhino.jstype.ObjectType var32 = null;
    com.google.javascript.rhino.jstype.ObjectType var33 = var16.createObjectType("", var30, var32);
    boolean var34 = var33.isUnknownType();
    com.google.javascript.rhino.ErrorReporter var35 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var35);
    com.google.javascript.rhino.jstype.FunctionBuilder var37 = new com.google.javascript.rhino.jstype.FunctionBuilder(var36);
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var41 = null;
    boolean var42 = var40.hasChild(var41);
    com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var45 = null;
    boolean var46 = var44.hasChild(var45);
    com.google.javascript.rhino.Node var47 = var40.clonePropsFrom(var44);
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var50 = com.google.javascript.rhino.IR.throwNode(var49);
    com.google.javascript.rhino.Node var51 = var40.srcref(var50);
    com.google.javascript.rhino.jstype.ObjectType var52 = null;
    com.google.javascript.rhino.jstype.ObjectType var53 = var36.createObjectType("", var50, var52);
    boolean var54 = var53.isArrayType();
    com.google.javascript.rhino.ErrorReporter var55 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var55);
    com.google.javascript.rhino.jstype.FunctionBuilder var57 = new com.google.javascript.rhino.jstype.FunctionBuilder(var56);
    com.google.javascript.rhino.Node var60 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var61 = null;
    boolean var62 = var60.hasChild(var61);
    com.google.javascript.rhino.Node var64 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var65 = null;
    boolean var66 = var64.hasChild(var65);
    com.google.javascript.rhino.Node var67 = var60.clonePropsFrom(var64);
    com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var70 = com.google.javascript.rhino.IR.throwNode(var69);
    com.google.javascript.rhino.Node var71 = var60.srcref(var70);
    com.google.javascript.rhino.jstype.ObjectType var72 = null;
    com.google.javascript.rhino.jstype.ObjectType var73 = var56.createObjectType("", var70, var72);
    boolean var74 = var73.isArrayType();
    boolean var75 = var73.isNominalType();
    com.google.javascript.rhino.jstype.FunctionType var76 = null;
    com.google.javascript.rhino.jstype.FunctionType var77 = null;
    var13.applyDelegateRelationship(var33, var53, var73, var76, var77);
    com.google.javascript.rhino.Node var80 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode((com.google.javascript.jscomp.CodingConvention)var13, "");
    com.google.javascript.rhino.Node var82 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var83 = null;
    boolean var84 = var82.hasChild(var83);
    com.google.javascript.rhino.Node var86 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var87 = null;
    boolean var88 = var86.hasChild(var87);
    com.google.javascript.rhino.Node var89 = var82.clonePropsFrom(var86);
    boolean var90 = var82.isRegExp();
    boolean var91 = var82.isBlock();
    boolean var92 = var13.isVarArgsParameter(var82);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var93 = var0.isPropertyTestFunction(var82);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test192"); }


    com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.lang.String var1 = var0.getDelegateSuperclassName();
    com.google.javascript.rhino.ErrorReporter var2 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
    com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var3);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var8 = null;
    boolean var9 = var7.hasChild(var8);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var12 = null;
    boolean var13 = var11.hasChild(var12);
    com.google.javascript.rhino.Node var14 = var7.clonePropsFrom(var11);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.throwNode(var16);
    com.google.javascript.rhino.Node var18 = var7.srcref(var17);
    com.google.javascript.rhino.jstype.ObjectType var19 = null;
    com.google.javascript.rhino.jstype.ObjectType var20 = var3.createObjectType("", var17, var19);
    boolean var21 = var20.isUnknownType();
    com.google.javascript.rhino.ErrorReporter var22 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var22);
    com.google.javascript.rhino.jstype.FunctionBuilder var24 = new com.google.javascript.rhino.jstype.FunctionBuilder(var23);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var28 = null;
    boolean var29 = var27.hasChild(var28);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var32 = null;
    boolean var33 = var31.hasChild(var32);
    com.google.javascript.rhino.Node var34 = var27.clonePropsFrom(var31);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.throwNode(var36);
    com.google.javascript.rhino.Node var38 = var27.srcref(var37);
    com.google.javascript.rhino.jstype.ObjectType var39 = null;
    com.google.javascript.rhino.jstype.ObjectType var40 = var23.createObjectType("", var37, var39);
    boolean var41 = var40.isArrayType();
    com.google.javascript.rhino.ErrorReporter var42 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var42);
    com.google.javascript.rhino.jstype.FunctionBuilder var44 = new com.google.javascript.rhino.jstype.FunctionBuilder(var43);
    com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var48 = null;
    boolean var49 = var47.hasChild(var48);
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var52 = null;
    boolean var53 = var51.hasChild(var52);
    com.google.javascript.rhino.Node var54 = var47.clonePropsFrom(var51);
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.throwNode(var56);
    com.google.javascript.rhino.Node var58 = var47.srcref(var57);
    com.google.javascript.rhino.jstype.ObjectType var59 = null;
    com.google.javascript.rhino.jstype.ObjectType var60 = var43.createObjectType("", var57, var59);
    boolean var61 = var60.isArrayType();
    boolean var62 = var60.isNominalType();
    com.google.javascript.rhino.jstype.FunctionType var63 = null;
    com.google.javascript.rhino.jstype.FunctionType var64 = null;
    var0.applyDelegateRelationship(var20, var40, var60, var63, var64);
    java.util.Set var66 = var60.getPropertyNames();
    boolean var67 = var60.isCheckedUnknownType();
    com.google.javascript.rhino.jstype.JSType var69 = var60.findPropertyType("");
    boolean var70 = var60.isFunctionType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);

  }

  public void test193() {}
//   public void test193() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test193"); }
// 
// 
//     com.google.javascript.rhino.Node var2 = new com.google.javascript.rhino.Node(0);
//     com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var5 = null;
//     boolean var6 = var4.hasChild(var5);
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var9 = null;
//     boolean var10 = var8.hasChild(var9);
//     com.google.javascript.rhino.Node var11 = var4.clonePropsFrom(var8);
//     boolean var12 = var4.isRegExp();
//     com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("");
//     int var15 = var14.getChildCount();
//     var14.setString("");
//     com.google.javascript.rhino.Node var18 = var4.useSourceInfoFromForTree(var14);
//     com.google.javascript.rhino.Node var19 = null;
//     com.google.javascript.jscomp.GoogleCodingConvention var20 = new com.google.javascript.jscomp.GoogleCodingConvention();
//     java.lang.String var21 = var20.getDelegateSuperclassName();
//     com.google.javascript.rhino.ErrorReporter var22 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var22);
//     com.google.javascript.rhino.jstype.FunctionBuilder var24 = new com.google.javascript.rhino.jstype.FunctionBuilder(var23);
//     com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var28 = null;
//     boolean var29 = var27.hasChild(var28);
//     com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var32 = null;
//     boolean var33 = var31.hasChild(var32);
//     com.google.javascript.rhino.Node var34 = var27.clonePropsFrom(var31);
//     com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.throwNode(var36);
//     com.google.javascript.rhino.Node var38 = var27.srcref(var37);
//     com.google.javascript.rhino.jstype.ObjectType var39 = null;
//     com.google.javascript.rhino.jstype.ObjectType var40 = var23.createObjectType("", var37, var39);
//     boolean var41 = var40.isUnknownType();
//     com.google.javascript.rhino.ErrorReporter var42 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var42);
//     com.google.javascript.rhino.jstype.FunctionBuilder var44 = new com.google.javascript.rhino.jstype.FunctionBuilder(var43);
//     com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var48 = null;
//     boolean var49 = var47.hasChild(var48);
//     com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var52 = null;
//     boolean var53 = var51.hasChild(var52);
//     com.google.javascript.rhino.Node var54 = var47.clonePropsFrom(var51);
//     com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.throwNode(var56);
//     com.google.javascript.rhino.Node var58 = var47.srcref(var57);
//     com.google.javascript.rhino.jstype.ObjectType var59 = null;
//     com.google.javascript.rhino.jstype.ObjectType var60 = var43.createObjectType("", var57, var59);
//     boolean var61 = var60.isArrayType();
//     com.google.javascript.rhino.ErrorReporter var62 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var62);
//     com.google.javascript.rhino.jstype.FunctionBuilder var64 = new com.google.javascript.rhino.jstype.FunctionBuilder(var63);
//     com.google.javascript.rhino.Node var67 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var68 = null;
//     boolean var69 = var67.hasChild(var68);
//     com.google.javascript.rhino.Node var71 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var72 = null;
//     boolean var73 = var71.hasChild(var72);
//     com.google.javascript.rhino.Node var74 = var67.clonePropsFrom(var71);
//     com.google.javascript.rhino.Node var76 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var77 = com.google.javascript.rhino.IR.throwNode(var76);
//     com.google.javascript.rhino.Node var78 = var67.srcref(var77);
//     com.google.javascript.rhino.jstype.ObjectType var79 = null;
//     com.google.javascript.rhino.jstype.ObjectType var80 = var63.createObjectType("", var77, var79);
//     boolean var81 = var80.isArrayType();
//     boolean var82 = var80.isNominalType();
//     com.google.javascript.rhino.jstype.FunctionType var83 = null;
//     com.google.javascript.rhino.jstype.FunctionType var84 = null;
//     var20.applyDelegateRelationship(var40, var60, var80, var83, var84);
//     com.google.javascript.rhino.Node var87 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode((com.google.javascript.jscomp.CodingConvention)var20, "");
//     boolean var88 = var87.isInc();
//     boolean var89 = var87.isEmpty();
//     com.google.javascript.rhino.Node var92 = new com.google.javascript.rhino.Node(100, var2, var18, var19, var87, (-1), 10);
// 
//   }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test194"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.ErrorReporter var2 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
    com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var3);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var8 = null;
    boolean var9 = var7.hasChild(var8);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var12 = null;
    boolean var13 = var11.hasChild(var12);
    com.google.javascript.rhino.Node var14 = var7.clonePropsFrom(var11);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.throwNode(var16);
    com.google.javascript.rhino.Node var18 = var7.srcref(var17);
    com.google.javascript.rhino.jstype.ObjectType var19 = null;
    com.google.javascript.rhino.jstype.ObjectType var20 = var3.createObjectType("", var17, var19);
    boolean var21 = var20.isUnknownType();
    com.google.javascript.jscomp.GoogleCodingConvention var22 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.lang.String var23 = var22.getDelegateSuperclassName();
    com.google.javascript.rhino.ErrorReporter var24 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24);
    com.google.javascript.rhino.jstype.FunctionBuilder var26 = new com.google.javascript.rhino.jstype.FunctionBuilder(var25);
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var30 = null;
    boolean var31 = var29.hasChild(var30);
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var34 = null;
    boolean var35 = var33.hasChild(var34);
    com.google.javascript.rhino.Node var36 = var29.clonePropsFrom(var33);
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.throwNode(var38);
    com.google.javascript.rhino.Node var40 = var29.srcref(var39);
    com.google.javascript.rhino.jstype.ObjectType var41 = null;
    com.google.javascript.rhino.jstype.ObjectType var42 = var25.createObjectType("", var39, var41);
    boolean var43 = var42.isUnknownType();
    com.google.javascript.rhino.ErrorReporter var44 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var44);
    com.google.javascript.rhino.jstype.FunctionBuilder var46 = new com.google.javascript.rhino.jstype.FunctionBuilder(var45);
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var50 = null;
    boolean var51 = var49.hasChild(var50);
    com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var54 = null;
    boolean var55 = var53.hasChild(var54);
    com.google.javascript.rhino.Node var56 = var49.clonePropsFrom(var53);
    com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var59 = com.google.javascript.rhino.IR.throwNode(var58);
    com.google.javascript.rhino.Node var60 = var49.srcref(var59);
    com.google.javascript.rhino.jstype.ObjectType var61 = null;
    com.google.javascript.rhino.jstype.ObjectType var62 = var45.createObjectType("", var59, var61);
    boolean var63 = var62.isArrayType();
    com.google.javascript.rhino.ErrorReporter var64 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var64);
    com.google.javascript.rhino.jstype.FunctionBuilder var66 = new com.google.javascript.rhino.jstype.FunctionBuilder(var65);
    com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var70 = null;
    boolean var71 = var69.hasChild(var70);
    com.google.javascript.rhino.Node var73 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var74 = null;
    boolean var75 = var73.hasChild(var74);
    com.google.javascript.rhino.Node var76 = var69.clonePropsFrom(var73);
    com.google.javascript.rhino.Node var78 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var79 = com.google.javascript.rhino.IR.throwNode(var78);
    com.google.javascript.rhino.Node var80 = var69.srcref(var79);
    com.google.javascript.rhino.jstype.ObjectType var81 = null;
    com.google.javascript.rhino.jstype.ObjectType var82 = var65.createObjectType("", var79, var81);
    boolean var83 = var82.isArrayType();
    boolean var84 = var82.isNominalType();
    com.google.javascript.rhino.jstype.FunctionType var85 = null;
    com.google.javascript.rhino.jstype.FunctionType var86 = null;
    var22.applyDelegateRelationship(var42, var62, var82, var85, var86);
    java.util.Set var88 = var82.getPropertyNames();
    com.google.javascript.rhino.jstype.JSType[] var89 = new com.google.javascript.rhino.jstype.JSType[] { var82};
    com.google.javascript.rhino.jstype.FunctionType var90 = var1.createConstructorType((com.google.javascript.rhino.jstype.JSType)var20, var89);
    com.google.javascript.rhino.jstype.FunctionType var91 = var90.cloneWithoutArrowType();
    boolean var92 = var90.isResolved();
    com.google.javascript.rhino.jstype.JSType var94 = var90.getPropertyType("function ({619269219}): {1352010371}");
    boolean var95 = var94.isStruct();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == false);

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test195"); }


    com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.lang.String var1 = var0.getDelegateSuperclassName();
    com.google.javascript.rhino.ErrorReporter var2 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
    com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var3);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var8 = null;
    boolean var9 = var7.hasChild(var8);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var12 = null;
    boolean var13 = var11.hasChild(var12);
    com.google.javascript.rhino.Node var14 = var7.clonePropsFrom(var11);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.throwNode(var16);
    com.google.javascript.rhino.Node var18 = var7.srcref(var17);
    com.google.javascript.rhino.jstype.ObjectType var19 = null;
    com.google.javascript.rhino.jstype.ObjectType var20 = var3.createObjectType("", var17, var19);
    boolean var21 = var20.isUnknownType();
    com.google.javascript.rhino.ErrorReporter var22 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var22);
    com.google.javascript.rhino.jstype.FunctionBuilder var24 = new com.google.javascript.rhino.jstype.FunctionBuilder(var23);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var28 = null;
    boolean var29 = var27.hasChild(var28);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var32 = null;
    boolean var33 = var31.hasChild(var32);
    com.google.javascript.rhino.Node var34 = var27.clonePropsFrom(var31);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.throwNode(var36);
    com.google.javascript.rhino.Node var38 = var27.srcref(var37);
    com.google.javascript.rhino.jstype.ObjectType var39 = null;
    com.google.javascript.rhino.jstype.ObjectType var40 = var23.createObjectType("", var37, var39);
    boolean var41 = var40.isArrayType();
    com.google.javascript.rhino.ErrorReporter var42 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var42);
    com.google.javascript.rhino.jstype.FunctionBuilder var44 = new com.google.javascript.rhino.jstype.FunctionBuilder(var43);
    com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var48 = null;
    boolean var49 = var47.hasChild(var48);
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var52 = null;
    boolean var53 = var51.hasChild(var52);
    com.google.javascript.rhino.Node var54 = var47.clonePropsFrom(var51);
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.throwNode(var56);
    com.google.javascript.rhino.Node var58 = var47.srcref(var57);
    com.google.javascript.rhino.jstype.ObjectType var59 = null;
    com.google.javascript.rhino.jstype.ObjectType var60 = var43.createObjectType("", var57, var59);
    boolean var61 = var60.isArrayType();
    boolean var62 = var60.isNominalType();
    com.google.javascript.rhino.jstype.FunctionType var63 = null;
    com.google.javascript.rhino.jstype.FunctionType var64 = null;
    var0.applyDelegateRelationship(var20, var40, var60, var63, var64);
    boolean var66 = var60.isObject();
    boolean var67 = var60.isNominalConstructor();
    boolean var68 = var60.isBooleanObjectType();
    com.google.javascript.rhino.jstype.UnionType var69 = var60.toMaybeUnionType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test196"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.name("");
    int var4 = var3.getChildCount();
    var3.setString("");
    var3.setCharno(1);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.name("");
    boolean var11 = var10.isVarArgs();
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.name("");
    int var14 = var13.getChildCount();
    boolean var15 = var13.isWith();
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var18 = null;
    boolean var19 = var17.hasChild(var18);
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var22 = null;
    boolean var23 = var21.hasChild(var22);
    com.google.javascript.rhino.Node var24 = var17.clonePropsFrom(var21);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.throwNode(var26);
    com.google.javascript.rhino.Node var28 = var17.srcref(var27);
    com.google.javascript.rhino.Node var29 = new com.google.javascript.rhino.Node((-1), var3, var10, var13, var17);
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.name("");
    int var33 = var32.getChildCount();
    var32.setString("");
    var32.setCharno(1);
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.name("");
    boolean var40 = var39.isVarArgs();
    com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.IR.name("");
    int var43 = var42.getChildCount();
    boolean var44 = var42.isWith();
    com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var47 = null;
    boolean var48 = var46.hasChild(var47);
    com.google.javascript.rhino.Node var50 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var51 = null;
    boolean var52 = var50.hasChild(var51);
    com.google.javascript.rhino.Node var53 = var46.clonePropsFrom(var50);
    com.google.javascript.rhino.Node var55 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.throwNode(var55);
    com.google.javascript.rhino.Node var57 = var46.srcref(var56);
    com.google.javascript.rhino.Node var58 = new com.google.javascript.rhino.Node((-1), var32, var39, var42, var46);
    boolean var59 = var58.isCatch();
    com.google.javascript.rhino.Node var60 = com.google.javascript.rhino.IR.thisNode();
    java.lang.String var61 = var60.getSourceFileName();
    com.google.javascript.rhino.Node var62 = var58.useSourceInfoFrom(var60);
    com.google.javascript.rhino.Node var64 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var65 = null;
    boolean var66 = var64.hasChild(var65);
    com.google.javascript.rhino.Node var68 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var69 = null;
    boolean var70 = var68.hasChild(var69);
    com.google.javascript.rhino.Node var71 = var64.clonePropsFrom(var68);
    boolean var72 = var64.isRegExp();
    com.google.javascript.rhino.Node var74 = com.google.javascript.rhino.IR.name("");
    int var75 = var74.getChildCount();
    var74.setString("");
    com.google.javascript.rhino.Node var78 = var64.useSourceInfoFromForTree(var74);
    boolean var79 = var78.isDec();
    com.google.javascript.rhino.Node var81 = com.google.javascript.rhino.IR.name("");
    int var82 = var81.getChildCount();
    var81.setString("");
    boolean var85 = var81.isFunction();
    boolean var86 = var81.isNew();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var89 = new com.google.javascript.rhino.Node(0, var13, var62, var78, var81, 0, 38);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test197"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setRemoveAbstractMethods(false);
    var0.setTweakToStringLiteral("function ({788694856}): {1325375508}", "goog.exportProperty");
    var0.setRemoveClosureAsserts(false);
    var0.setRemoveUnusedLocalVars(true);
    com.google.javascript.jscomp.GoogleCodingConvention var10 = new com.google.javascript.jscomp.GoogleCodingConvention();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var13 = null;
    boolean var14 = var12.hasChild(var13);
    var12.setVarArgs(false);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.thisNode();
    java.lang.String var18 = var10.extractClassNameIfProvide(var12, var17);
    var0.setCodingConvention((com.google.javascript.jscomp.CodingConvention)var10);
    var0.setUnaliasableGlobals("");
    var0.setLooseTypes(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test198"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.ErrorManager var1 = var0.getErrorManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.SymbolTable var2 = var0.buildKnownSymbolTable();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test199"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    com.google.javascript.rhino.ErrorReporter var1 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var1);
    com.google.javascript.rhino.jstype.FunctionBuilder var3 = new com.google.javascript.rhino.jstype.FunctionBuilder(var2);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var7 = null;
    boolean var8 = var6.hasChild(var7);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var11 = null;
    boolean var12 = var10.hasChild(var11);
    com.google.javascript.rhino.Node var13 = var6.clonePropsFrom(var10);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.throwNode(var15);
    com.google.javascript.rhino.Node var17 = var6.srcref(var16);
    com.google.javascript.rhino.jstype.ObjectType var18 = null;
    com.google.javascript.rhino.jstype.ObjectType var19 = var2.createObjectType("", var16, var18);
    com.google.javascript.jscomp.GoogleCodingConvention var20 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.lang.String var21 = var20.getDelegateSuperclassName();
    com.google.javascript.rhino.ErrorReporter var22 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var22);
    com.google.javascript.rhino.jstype.FunctionBuilder var24 = new com.google.javascript.rhino.jstype.FunctionBuilder(var23);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var28 = null;
    boolean var29 = var27.hasChild(var28);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var32 = null;
    boolean var33 = var31.hasChild(var32);
    com.google.javascript.rhino.Node var34 = var27.clonePropsFrom(var31);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.throwNode(var36);
    com.google.javascript.rhino.Node var38 = var27.srcref(var37);
    com.google.javascript.rhino.jstype.ObjectType var39 = null;
    com.google.javascript.rhino.jstype.ObjectType var40 = var23.createObjectType("", var37, var39);
    boolean var41 = var40.isUnknownType();
    com.google.javascript.rhino.ErrorReporter var42 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var42);
    com.google.javascript.rhino.jstype.FunctionBuilder var44 = new com.google.javascript.rhino.jstype.FunctionBuilder(var43);
    com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var48 = null;
    boolean var49 = var47.hasChild(var48);
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var52 = null;
    boolean var53 = var51.hasChild(var52);
    com.google.javascript.rhino.Node var54 = var47.clonePropsFrom(var51);
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.throwNode(var56);
    com.google.javascript.rhino.Node var58 = var47.srcref(var57);
    com.google.javascript.rhino.jstype.ObjectType var59 = null;
    com.google.javascript.rhino.jstype.ObjectType var60 = var43.createObjectType("", var57, var59);
    boolean var61 = var60.isArrayType();
    com.google.javascript.rhino.ErrorReporter var62 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var62);
    com.google.javascript.rhino.jstype.FunctionBuilder var64 = new com.google.javascript.rhino.jstype.FunctionBuilder(var63);
    com.google.javascript.rhino.Node var67 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var68 = null;
    boolean var69 = var67.hasChild(var68);
    com.google.javascript.rhino.Node var71 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var72 = null;
    boolean var73 = var71.hasChild(var72);
    com.google.javascript.rhino.Node var74 = var67.clonePropsFrom(var71);
    com.google.javascript.rhino.Node var76 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var77 = com.google.javascript.rhino.IR.throwNode(var76);
    com.google.javascript.rhino.Node var78 = var67.srcref(var77);
    com.google.javascript.rhino.jstype.ObjectType var79 = null;
    com.google.javascript.rhino.jstype.ObjectType var80 = var63.createObjectType("", var77, var79);
    boolean var81 = var80.isArrayType();
    boolean var82 = var80.isNominalType();
    com.google.javascript.rhino.jstype.FunctionType var83 = null;
    com.google.javascript.rhino.jstype.FunctionType var84 = null;
    var20.applyDelegateRelationship(var40, var60, var80, var83, var84);
    com.google.javascript.rhino.jstype.ObjectType var86 = var2.createObjectType(var60);
    java.lang.Iterable var88 = var2.getTypesWithProperty("");
    com.google.javascript.rhino.Node var91 = com.google.javascript.rhino.IR.name("");
    int var92 = var91.getChildCount();
    var91.setString("");
    com.google.javascript.rhino.Node var96 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.InputId var97 = var96.getInputId();
    com.google.javascript.rhino.Node var98 = new com.google.javascript.rhino.Node((-1), var91, var96);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.graph.Graph.GraphEdge var99 = var0.getFirstEdge((java.lang.Object)"", (java.lang.Object)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var97);

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test200"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.trueNode();
    boolean var1 = var0.isInstanceOf();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test201"); }


    com.google.javascript.rhino.Node var2 = new com.google.javascript.rhino.Node((-1));
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    int var6 = var5.getChildCount();
    var5.setString("");
    var5.setCharno(1);
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.name("");
    boolean var13 = var12.isVarArgs();
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.name("");
    int var16 = var15.getChildCount();
    boolean var17 = var15.isWith();
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var20 = null;
    boolean var21 = var19.hasChild(var20);
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var24 = null;
    boolean var25 = var23.hasChild(var24);
    com.google.javascript.rhino.Node var26 = var19.clonePropsFrom(var23);
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.throwNode(var28);
    com.google.javascript.rhino.Node var30 = var19.srcref(var29);
    com.google.javascript.rhino.Node var31 = new com.google.javascript.rhino.Node((-1), var5, var12, var15, var19);
    boolean var32 = var31.isCatch();
    boolean var33 = var31.isGetElem();
    com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var36 = null;
    boolean var37 = var35.hasChild(var36);
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var40 = null;
    boolean var41 = var39.hasChild(var40);
    com.google.javascript.rhino.Node var42 = var35.clonePropsFrom(var39);
    boolean var43 = var35.isVoid();
    boolean var44 = var35.isScript();
    com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var47 = null;
    boolean var48 = var46.hasChild(var47);
    boolean var49 = var46.hasOneChild();
    com.google.javascript.rhino.Node var50 = var35.clonePropsFrom(var46);
    com.google.javascript.rhino.Node var53 = new com.google.javascript.rhino.Node(10, var2, var31, var46, (-1), 0);
    com.google.javascript.rhino.Node var54 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var55 = com.google.javascript.rhino.IR.catchNode(var53, var54);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test202"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.CompilerOptions var1 = new com.google.javascript.jscomp.CompilerOptions();
    var1.setPropertyAffinity(false);
    com.google.javascript.jscomp.JSModule var5 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.CompilerInput var7 = var5.getByName("");
    java.util.List var8 = var5.getDependencies();
    var1.setReplaceStringsFunctionDescriptions(var8);
    com.google.javascript.jscomp.JSModule var11 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.CompilerInput var13 = var11.getByName("");
    java.util.List var14 = var11.getDependencies();
    com.google.javascript.jscomp.CompilerOptions var15 = new com.google.javascript.jscomp.CompilerOptions();
    var15.setRemoveAbstractMethods(false);
    var15.setTweakToStringLiteral("function ({788694856}): {1325375508}", "goog.exportProperty");
    com.google.javascript.jscomp.Result var21 = var0.<com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.SourceFile>compile(var8, var14, var15);
    com.google.javascript.jscomp.SourceMap var22 = var0.getSourceMap();
    com.google.javascript.jscomp.JSModule var24 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.CompilerInput var26 = var24.getByName("");
    java.lang.String[] var27 = var0.toSourceArray(var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.optimize();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test203"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    java.util.Collection var1 = var0.getAssertionFunctions();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var4 = null;
    boolean var5 = var3.hasChild(var4);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var8 = null;
    boolean var9 = var7.hasChild(var8);
    com.google.javascript.rhino.Node var10 = var3.clonePropsFrom(var7);
    com.google.javascript.jscomp.CodingConvention.Bind var12 = var0.describeFunctionBind(var3, true);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.name("");
    int var16 = var15.getChildCount();
    var15.setString("");
    var15.setCharno(1);
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.name("");
    boolean var23 = var22.isVarArgs();
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.name("");
    int var26 = var25.getChildCount();
    boolean var27 = var25.isWith();
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var30 = null;
    boolean var31 = var29.hasChild(var30);
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var34 = null;
    boolean var35 = var33.hasChild(var34);
    com.google.javascript.rhino.Node var36 = var29.clonePropsFrom(var33);
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.throwNode(var38);
    com.google.javascript.rhino.Node var40 = var29.srcref(var39);
    com.google.javascript.rhino.Node var41 = new com.google.javascript.rhino.Node((-1), var15, var22, var25, var29);
    boolean var42 = var15.isString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.doNode(var3, var15);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test204"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setCollapseAnonymousFunctions(true);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var3 = null;
    var0.setTweakProcessing(var3);
    var0.setExtractPrototypeMemberDeclarations(true);
    com.google.javascript.jscomp.MessageBundle var7 = null;
    var0.setMessageBundle(var7);
    var0.setReportPath("NAME ");

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test205"); }


    com.google.javascript.jscomp.SourceFile.Generator var1 = null;
    com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var1);
    boolean var3 = var2.isExtern();
    java.lang.String var4 = var2.getName();
    com.google.javascript.jscomp.parsing.Config var7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(true);
    com.google.javascript.rhino.head.ErrorReporter var8 = null;
    java.util.logging.Logger var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var10 = com.google.javascript.jscomp.parsing.ParserRunner.parse((com.google.javascript.rhino.jstype.StaticSourceFile)var2, "function ({1287601532}): {526237505}", var7, var8, var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test206"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    int var2 = var1.getChildCount();
    boolean var3 = var1.isWith();
    java.lang.Iterable var4 = var1.children();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.InputId var7 = var6.getInputId();
    boolean var8 = var1.isEquivalentTo(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.JSDocInfo var9 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(var6);
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
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test207"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var2 = null;
    boolean var3 = var1.hasChild(var2);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    com.google.javascript.rhino.Node var8 = var1.clonePropsFrom(var5);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.throwNode(var10);
    com.google.javascript.rhino.Node var12 = var1.srcref(var11);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("");
    int var15 = var14.getChildCount();
    var14.setString("");
    var14.setCharno(1);
    com.google.javascript.rhino.Node var20 = var12.copyInformationFrom(var14);
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var23 = null;
    boolean var24 = var22.hasChild(var23);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var27 = null;
    boolean var28 = var26.hasChild(var27);
    com.google.javascript.rhino.Node var29 = var22.clonePropsFrom(var26);
    boolean var30 = var22.isVoid();
    com.google.javascript.rhino.Node var31 = var20.clonePropsFrom(var22);
    com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.jstype.StaticSourceFile var35 = var34.getStaticSourceFile();
    com.google.javascript.rhino.Node[] var36 = new com.google.javascript.rhino.Node[] { var34};
    com.google.javascript.rhino.Node var37 = new com.google.javascript.rhino.Node(10, var36);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.call(var31, var36);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test208"); }


    java.lang.String var1 = com.google.javascript.rhino.ScriptRuntime.escapeString("function ({1061724239}): {957661950}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "function ({1061724239}): {957661950}"+ "'", var1.equals("function ({1061724239}): {957661950}"));

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test209"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var1 = com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.valueOf("function ({788694856}): {1325375508}");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test210"); }


    com.google.javascript.jscomp.SourceAst var0 = null;
    com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "NAME ", false);
    boolean var4 = var3.isExtern();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = var3.getPathRelativeToClosureBase();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test211"); }


    com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.lang.String var1 = var0.getDelegateSuperclassName();
    com.google.javascript.rhino.ErrorReporter var2 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
    com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var3);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var8 = null;
    boolean var9 = var7.hasChild(var8);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var12 = null;
    boolean var13 = var11.hasChild(var12);
    com.google.javascript.rhino.Node var14 = var7.clonePropsFrom(var11);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.throwNode(var16);
    com.google.javascript.rhino.Node var18 = var7.srcref(var17);
    com.google.javascript.rhino.jstype.ObjectType var19 = null;
    com.google.javascript.rhino.jstype.ObjectType var20 = var3.createObjectType("", var17, var19);
    boolean var21 = var20.isUnknownType();
    com.google.javascript.rhino.ErrorReporter var22 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var22);
    com.google.javascript.rhino.jstype.FunctionBuilder var24 = new com.google.javascript.rhino.jstype.FunctionBuilder(var23);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var28 = null;
    boolean var29 = var27.hasChild(var28);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var32 = null;
    boolean var33 = var31.hasChild(var32);
    com.google.javascript.rhino.Node var34 = var27.clonePropsFrom(var31);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.throwNode(var36);
    com.google.javascript.rhino.Node var38 = var27.srcref(var37);
    com.google.javascript.rhino.jstype.ObjectType var39 = null;
    com.google.javascript.rhino.jstype.ObjectType var40 = var23.createObjectType("", var37, var39);
    boolean var41 = var40.isArrayType();
    com.google.javascript.rhino.ErrorReporter var42 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var42);
    com.google.javascript.rhino.jstype.FunctionBuilder var44 = new com.google.javascript.rhino.jstype.FunctionBuilder(var43);
    com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var48 = null;
    boolean var49 = var47.hasChild(var48);
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var52 = null;
    boolean var53 = var51.hasChild(var52);
    com.google.javascript.rhino.Node var54 = var47.clonePropsFrom(var51);
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.throwNode(var56);
    com.google.javascript.rhino.Node var58 = var47.srcref(var57);
    com.google.javascript.rhino.jstype.ObjectType var59 = null;
    com.google.javascript.rhino.jstype.ObjectType var60 = var43.createObjectType("", var57, var59);
    boolean var61 = var60.isArrayType();
    boolean var62 = var60.isNominalType();
    com.google.javascript.rhino.jstype.FunctionType var63 = null;
    com.google.javascript.rhino.jstype.FunctionType var64 = null;
    var0.applyDelegateRelationship(var20, var40, var60, var63, var64);
    java.util.Set var66 = var60.getPropertyNames();
    com.google.javascript.rhino.jstype.ParameterizedType var67 = com.google.javascript.rhino.jstype.JSType.toMaybeParameterizedType((com.google.javascript.rhino.jstype.JSType)var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test212"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    boolean var2 = var0.isPrivate("(hi!)");
    java.util.Collection var3 = var0.getIndirectlyDeclaredProperties();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.labelName("function ({1869362278}): {686050736}");
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.jstype.StaticSourceFile var8 = var7.getStaticSourceFile();
    boolean var9 = var7.isGetElem();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.neg(var7);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var14 = null;
    boolean var15 = var13.hasChild(var14);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var18 = null;
    boolean var19 = var17.hasChild(var18);
    com.google.javascript.rhino.Node var20 = var13.clonePropsFrom(var17);
    boolean var21 = var17.isAssign();
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.jstype.StaticSourceFile var24 = var23.getStaticSourceFile();
    boolean var25 = var23.isComma();
    int var26 = var23.getLineno();
    com.google.javascript.rhino.Node var27 = new com.google.javascript.rhino.Node((-1), var17, var23);
    com.google.javascript.rhino.Node var28 = var10.copyInformationFromForTree(var17);
    java.lang.String var29 = var0.extractClassNameIfProvide(var5, var28);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var32 = null;
    boolean var33 = var31.hasChild(var32);
    com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var36 = null;
    boolean var37 = var35.hasChild(var36);
    com.google.javascript.rhino.Node var38 = var31.clonePropsFrom(var35);
    boolean var39 = var31.isRegExp();
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.name("");
    int var42 = var41.getChildCount();
    var41.setString("");
    com.google.javascript.rhino.Node var45 = var31.useSourceInfoFromForTree(var41);
    java.lang.String var49 = var31.toString(false, true, false);
    var31.setType(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast var52 = var0.getObjectLiteralCast(var31);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "NAME "+ "'", var49.equals("NAME "));

  }

  public void test213() {}
//   public void test213() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test213"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var0 = null;
//     com.google.javascript.jscomp.DiagnosticGroup var1 = com.google.javascript.jscomp.DiagnosticGroup.forType(var0);
// 
//   }

  public void test214() {}
//   public void test214() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test214"); }
// 
// 
//     com.google.javascript.jscomp.ErrorManager var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
// 
//   }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test215"); }


    com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.lang.String var1 = var0.getDelegateSuperclassName();
    com.google.javascript.jscomp.ClosureCodingConvention var2 = new com.google.javascript.jscomp.ClosureCodingConvention((com.google.javascript.jscomp.CodingConvention)var0);
    com.google.javascript.jscomp.GoogleCodingConvention var3 = new com.google.javascript.jscomp.GoogleCodingConvention((com.google.javascript.jscomp.CodingConvention)var0);
    java.lang.String var4 = var3.getDelegateSuperclassName();
    boolean var6 = var3.isExported("goog.exportProperty");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test216"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.FunctionBuilder var2 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var10 = null;
    boolean var11 = var9.hasChild(var10);
    com.google.javascript.rhino.Node var12 = var5.clonePropsFrom(var9);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.throwNode(var14);
    com.google.javascript.rhino.Node var16 = var5.srcref(var15);
    com.google.javascript.rhino.jstype.ObjectType var17 = null;
    com.google.javascript.rhino.jstype.ObjectType var18 = var1.createObjectType("", var15, var17);
    com.google.javascript.jscomp.GoogleCodingConvention var19 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.lang.String var20 = var19.getDelegateSuperclassName();
    com.google.javascript.rhino.ErrorReporter var21 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21);
    com.google.javascript.rhino.jstype.FunctionBuilder var23 = new com.google.javascript.rhino.jstype.FunctionBuilder(var22);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var27 = null;
    boolean var28 = var26.hasChild(var27);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var31 = null;
    boolean var32 = var30.hasChild(var31);
    com.google.javascript.rhino.Node var33 = var26.clonePropsFrom(var30);
    com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.throwNode(var35);
    com.google.javascript.rhino.Node var37 = var26.srcref(var36);
    com.google.javascript.rhino.jstype.ObjectType var38 = null;
    com.google.javascript.rhino.jstype.ObjectType var39 = var22.createObjectType("", var36, var38);
    boolean var40 = var39.isUnknownType();
    com.google.javascript.rhino.ErrorReporter var41 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var41);
    com.google.javascript.rhino.jstype.FunctionBuilder var43 = new com.google.javascript.rhino.jstype.FunctionBuilder(var42);
    com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var47 = null;
    boolean var48 = var46.hasChild(var47);
    com.google.javascript.rhino.Node var50 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var51 = null;
    boolean var52 = var50.hasChild(var51);
    com.google.javascript.rhino.Node var53 = var46.clonePropsFrom(var50);
    com.google.javascript.rhino.Node var55 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.throwNode(var55);
    com.google.javascript.rhino.Node var57 = var46.srcref(var56);
    com.google.javascript.rhino.jstype.ObjectType var58 = null;
    com.google.javascript.rhino.jstype.ObjectType var59 = var42.createObjectType("", var56, var58);
    boolean var60 = var59.isArrayType();
    com.google.javascript.rhino.ErrorReporter var61 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var61);
    com.google.javascript.rhino.jstype.FunctionBuilder var63 = new com.google.javascript.rhino.jstype.FunctionBuilder(var62);
    com.google.javascript.rhino.Node var66 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var67 = null;
    boolean var68 = var66.hasChild(var67);
    com.google.javascript.rhino.Node var70 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var71 = null;
    boolean var72 = var70.hasChild(var71);
    com.google.javascript.rhino.Node var73 = var66.clonePropsFrom(var70);
    com.google.javascript.rhino.Node var75 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var76 = com.google.javascript.rhino.IR.throwNode(var75);
    com.google.javascript.rhino.Node var77 = var66.srcref(var76);
    com.google.javascript.rhino.jstype.ObjectType var78 = null;
    com.google.javascript.rhino.jstype.ObjectType var79 = var62.createObjectType("", var76, var78);
    boolean var80 = var79.isArrayType();
    boolean var81 = var79.isNominalType();
    com.google.javascript.rhino.jstype.FunctionType var82 = null;
    com.google.javascript.rhino.jstype.FunctionType var83 = null;
    var19.applyDelegateRelationship(var39, var59, var79, var82, var83);
    com.google.javascript.rhino.jstype.ObjectType var85 = var1.createObjectType(var59);
    boolean var87 = var1.isForwardDeclaredType("function ({1628313113}): {1674376470}");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test217"); }


    com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.lang.String var1 = var0.getDelegateSuperclassName();
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
    int var5 = var4.getChildCount();
    var4.setString("");
    var4.setCharno(1);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
    boolean var12 = var11.isVarArgs();
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("");
    int var15 = var14.getChildCount();
    boolean var16 = var14.isWith();
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var19 = null;
    boolean var20 = var18.hasChild(var19);
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var23 = null;
    boolean var24 = var22.hasChild(var23);
    com.google.javascript.rhino.Node var25 = var18.clonePropsFrom(var22);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.throwNode(var27);
    com.google.javascript.rhino.Node var29 = var18.srcref(var28);
    com.google.javascript.rhino.Node var30 = new com.google.javascript.rhino.Node((-1), var4, var11, var14, var18);
    boolean var31 = var4.isString();
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.name("");
    int var34 = var33.getType();
    com.google.javascript.rhino.Node var35 = var33.getLastChild();
    java.lang.String var36 = var0.extractClassNameIfRequire(var4, var33);
    boolean var37 = var4.isInc();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test218"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.trueNode();
    com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var4 = null;
    boolean var5 = var3.hasChild(var4);
    var3.setVarArgs(false);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.thisNode();
    java.lang.String var9 = var1.extractClassNameIfProvide(var3, var8);
    boolean var10 = var8.isThrow();
    int var11 = var8.getSourcePosition();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.doNode(var0, var8);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test219"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.VariableRenamingPolicy var1 = com.google.javascript.jscomp.VariableRenamingPolicy.valueOf("function ({619269219}): {1352010371}");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test220"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setRemoveAbstractMethods(false);
    var0.setTweakToStringLiteral("function ({788694856}): {1325375508}", "goog.exportProperty");
    com.google.javascript.jscomp.CheckLevel var6 = null;
    var0.setCheckMissingReturn(var6);
    com.google.javascript.jscomp.GoogleCodingConvention var8 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.lang.String var9 = var8.getDelegateSuperclassName();
    com.google.javascript.rhino.ErrorReporter var10 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var10);
    com.google.javascript.rhino.jstype.FunctionBuilder var12 = new com.google.javascript.rhino.jstype.FunctionBuilder(var11);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var16 = null;
    boolean var17 = var15.hasChild(var16);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var20 = null;
    boolean var21 = var19.hasChild(var20);
    com.google.javascript.rhino.Node var22 = var15.clonePropsFrom(var19);
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.throwNode(var24);
    com.google.javascript.rhino.Node var26 = var15.srcref(var25);
    com.google.javascript.rhino.jstype.ObjectType var27 = null;
    com.google.javascript.rhino.jstype.ObjectType var28 = var11.createObjectType("", var25, var27);
    boolean var29 = var28.isUnknownType();
    com.google.javascript.rhino.ErrorReporter var30 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var30);
    com.google.javascript.rhino.jstype.FunctionBuilder var32 = new com.google.javascript.rhino.jstype.FunctionBuilder(var31);
    com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var36 = null;
    boolean var37 = var35.hasChild(var36);
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var40 = null;
    boolean var41 = var39.hasChild(var40);
    com.google.javascript.rhino.Node var42 = var35.clonePropsFrom(var39);
    com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.throwNode(var44);
    com.google.javascript.rhino.Node var46 = var35.srcref(var45);
    com.google.javascript.rhino.jstype.ObjectType var47 = null;
    com.google.javascript.rhino.jstype.ObjectType var48 = var31.createObjectType("", var45, var47);
    boolean var49 = var48.isArrayType();
    com.google.javascript.rhino.ErrorReporter var50 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var50);
    com.google.javascript.rhino.jstype.FunctionBuilder var52 = new com.google.javascript.rhino.jstype.FunctionBuilder(var51);
    com.google.javascript.rhino.Node var55 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var56 = null;
    boolean var57 = var55.hasChild(var56);
    com.google.javascript.rhino.Node var59 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var60 = null;
    boolean var61 = var59.hasChild(var60);
    com.google.javascript.rhino.Node var62 = var55.clonePropsFrom(var59);
    com.google.javascript.rhino.Node var64 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var65 = com.google.javascript.rhino.IR.throwNode(var64);
    com.google.javascript.rhino.Node var66 = var55.srcref(var65);
    com.google.javascript.rhino.jstype.ObjectType var67 = null;
    com.google.javascript.rhino.jstype.ObjectType var68 = var51.createObjectType("", var65, var67);
    boolean var69 = var68.isArrayType();
    boolean var70 = var68.isNominalType();
    com.google.javascript.rhino.jstype.FunctionType var71 = null;
    com.google.javascript.rhino.jstype.FunctionType var72 = null;
    var8.applyDelegateRelationship(var28, var48, var68, var71, var72);
    java.util.Set var74 = var68.getPropertyNames();
    var0.setCssRenamingWhitelist(var74);
    com.google.javascript.jscomp.CheckLevel var76 = null;
    var0.setCheckGlobalNamesLevel(var76);
    var0.setTweakToDoubleLiteral("hi!", 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test221"); }


    boolean var1 = com.google.javascript.rhino.TokenStream.isKeyword("function ({2117160721}): {1463690704}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test222"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var2 = null;
    boolean var3 = var1.hasChild(var2);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    com.google.javascript.rhino.Node var8 = var1.clonePropsFrom(var5);
    boolean var9 = var1.isRegExp();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
    int var12 = var11.getChildCount();
    var11.setString("");
    com.google.javascript.rhino.Node var15 = var1.useSourceInfoFromForTree(var11);
    java.lang.String var19 = var1.toString(false, true, false);
    boolean var20 = var1.isNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "NAME "+ "'", var19.equals("NAME "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test223"); }


    com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var3 = null;
    boolean var4 = var2.hasChild(var3);
    var2.setVarArgs(false);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.thisNode();
    java.lang.String var8 = var0.extractClassNameIfProvide(var2, var7);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
    int var12 = var11.getChildCount();
    var11.setString("");
    var11.setCharno(1);
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.name("");
    boolean var19 = var18.isVarArgs();
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.name("");
    int var22 = var21.getChildCount();
    boolean var23 = var21.isWith();
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var26 = null;
    boolean var27 = var25.hasChild(var26);
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var30 = null;
    boolean var31 = var29.hasChild(var30);
    com.google.javascript.rhino.Node var32 = var25.clonePropsFrom(var29);
    com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.throwNode(var34);
    com.google.javascript.rhino.Node var36 = var25.srcref(var35);
    com.google.javascript.rhino.Node var37 = new com.google.javascript.rhino.Node((-1), var11, var18, var21, var25);
    boolean var38 = var37.isCatch();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.ifNode(var7, var37);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test224() {}
//   public void test224() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test224"); }
// 
// 
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.stringKey("(hi!)");
//     com.google.javascript.jscomp.GoogleCodingConvention var3 = new com.google.javascript.jscomp.GoogleCodingConvention();
//     com.google.javascript.rhino.Node var5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode((com.google.javascript.jscomp.CodingConvention)var3, "");
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.propdef(var2, var5);
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.jscomp.DiagnosticType var8 = null;
//     java.lang.String[] var9 = null;
//     com.google.javascript.jscomp.JSError var10 = com.google.javascript.jscomp.JSError.make("goog.exportProperty", var2, var7, var8, var9);
// 
//   }

  public void test225() {}
//   public void test225() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test225"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var3 = null;
//     com.google.javascript.jscomp.Compiler var4 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.CompilerOptions var5 = new com.google.javascript.jscomp.CompilerOptions();
//     var5.setPropertyAffinity(false);
//     com.google.javascript.jscomp.JSModule var9 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.CompilerInput var11 = var9.getByName("");
//     java.util.List var12 = var9.getDependencies();
//     var5.setReplaceStringsFunctionDescriptions(var12);
//     com.google.javascript.jscomp.JSModule var15 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.CompilerInput var17 = var15.getByName("");
//     java.util.List var18 = var15.getDependencies();
//     com.google.javascript.jscomp.CompilerOptions var19 = new com.google.javascript.jscomp.CompilerOptions();
//     var19.setRemoveAbstractMethods(false);
//     var19.setTweakToStringLiteral("function ({788694856}): {1325375508}", "goog.exportProperty");
//     com.google.javascript.jscomp.Result var25 = var4.<com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.SourceFile>compile(var12, var18, var19);
//     com.google.javascript.jscomp.SourceMap var26 = var4.getSourceMap();
//     com.google.javascript.jscomp.JSModule var28 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.CompilerInput var30 = var28.getByName("");
//     java.lang.String[] var31 = var4.toSourceArray(var28);
//     com.google.javascript.jscomp.JSError var32 = com.google.javascript.jscomp.JSError.make("function ({2117160721}): {1463690704}", 10, 1, var3, var31);
// 
//   }

  public void test226() {}
//   public void test226() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test226"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticGroup var1 = null;
//     com.google.javascript.jscomp.DiagnosticGroup[] var2 = new com.google.javascript.jscomp.DiagnosticGroup[] { var1};
//     com.google.javascript.jscomp.DiagnosticGroup var3 = new com.google.javascript.jscomp.DiagnosticGroup("NAME \n", var2);
// 
//   }

  public void test227() {}
//   public void test227() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test227"); }
// 
// 
//     com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.SourceFile.Generator var3 = null;
//     com.google.javascript.jscomp.SourceFile var4 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var3);
//     var1.add(var4);
//     java.util.Set var6 = var1.getAllDependencies();
//     java.util.Set var7 = var1.getAllDependencies();
//     com.google.javascript.jscomp.Compiler var8 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.JSModule var10 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.CompilerInput var12 = var10.getByName("");
//     java.util.List var13 = var10.getDependencies();
//     com.google.javascript.jscomp.NodeTraversal.Callback var14 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var8, var13, var14);
//     var1.sortInputsByDeps(var8);
// 
//   }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test228"); }


    java.lang.String var1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("function ({211361749}): {418963305}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "(function ({211361749}): {418963305})"+ "'", var1.equals("(function ({211361749}): {418963305})"));

  }

  public void test229() {}
//   public void test229() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test229"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("function ({1546170474}): {1935027818}");
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.ifNode(var0, var2);
// 
//   }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test230"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf("function ({2035787731}): {1774930913}");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test231"); }


    com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var3 = null;
    boolean var4 = var2.hasChild(var3);
    var2.setVarArgs(false);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.thisNode();
    java.lang.String var8 = var0.extractClassNameIfProvide(var2, var7);
    com.google.javascript.jscomp.GoogleCodingConvention var9 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.lang.String var10 = var9.getDelegateSuperclassName();
    com.google.javascript.jscomp.ClosureCodingConvention var11 = new com.google.javascript.jscomp.ClosureCodingConvention((com.google.javascript.jscomp.CodingConvention)var9);
    com.google.javascript.jscomp.GoogleCodingConvention var12 = new com.google.javascript.jscomp.GoogleCodingConvention((com.google.javascript.jscomp.CodingConvention)var9);
    java.lang.String var13 = var12.getDelegateSuperclassName();
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var16 = null;
    boolean var17 = var15.hasChild(var16);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var20 = null;
    boolean var21 = var19.hasChild(var20);
    com.google.javascript.rhino.Node var22 = var15.clonePropsFrom(var19);
    int var23 = var15.getType();
    boolean var24 = var12.isVarArgsParameter(var15);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var27 = null;
    boolean var28 = var26.hasChild(var27);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var31 = null;
    boolean var32 = var30.hasChild(var31);
    com.google.javascript.rhino.Node var33 = var26.clonePropsFrom(var30);
    boolean var34 = var26.isRegExp();
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.name("");
    int var37 = var36.getChildCount();
    var36.setString("");
    com.google.javascript.rhino.Node var40 = var26.useSourceInfoFromForTree(var36);
    var15.addChildToBack(var40);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.IR.caseNode(var2, var15);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test232"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.FunctionBuilder var2 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var10 = null;
    boolean var11 = var9.hasChild(var10);
    com.google.javascript.rhino.Node var12 = var5.clonePropsFrom(var9);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.throwNode(var14);
    com.google.javascript.rhino.Node var16 = var5.srcref(var15);
    com.google.javascript.rhino.jstype.ObjectType var17 = null;
    com.google.javascript.rhino.jstype.ObjectType var18 = var1.createObjectType("", var15, var17);
    boolean var19 = var15.isCase();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.continueNode(var15);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test233() {}
//   public void test233() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test233"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var3 = null;
//     java.lang.String[] var5 = new java.lang.String[] { "function ({1287601532}): {526237505}"};
//     com.google.javascript.jscomp.JSError var6 = com.google.javascript.jscomp.JSError.make("function ({1427496923}): {253480577}", 100, 0, var3, var5);
// 
//   }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test234"); }


    com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.lang.String var1 = var0.getDelegateSuperclassName();
    com.google.javascript.rhino.ErrorReporter var2 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
    com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var3);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var8 = null;
    boolean var9 = var7.hasChild(var8);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var12 = null;
    boolean var13 = var11.hasChild(var12);
    com.google.javascript.rhino.Node var14 = var7.clonePropsFrom(var11);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.throwNode(var16);
    com.google.javascript.rhino.Node var18 = var7.srcref(var17);
    com.google.javascript.rhino.jstype.ObjectType var19 = null;
    com.google.javascript.rhino.jstype.ObjectType var20 = var3.createObjectType("", var17, var19);
    boolean var21 = var20.isUnknownType();
    com.google.javascript.rhino.ErrorReporter var22 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var22);
    com.google.javascript.rhino.jstype.FunctionBuilder var24 = new com.google.javascript.rhino.jstype.FunctionBuilder(var23);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var28 = null;
    boolean var29 = var27.hasChild(var28);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var32 = null;
    boolean var33 = var31.hasChild(var32);
    com.google.javascript.rhino.Node var34 = var27.clonePropsFrom(var31);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.throwNode(var36);
    com.google.javascript.rhino.Node var38 = var27.srcref(var37);
    com.google.javascript.rhino.jstype.ObjectType var39 = null;
    com.google.javascript.rhino.jstype.ObjectType var40 = var23.createObjectType("", var37, var39);
    boolean var41 = var40.isArrayType();
    com.google.javascript.rhino.ErrorReporter var42 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var42);
    com.google.javascript.rhino.jstype.FunctionBuilder var44 = new com.google.javascript.rhino.jstype.FunctionBuilder(var43);
    com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var48 = null;
    boolean var49 = var47.hasChild(var48);
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var52 = null;
    boolean var53 = var51.hasChild(var52);
    com.google.javascript.rhino.Node var54 = var47.clonePropsFrom(var51);
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.throwNode(var56);
    com.google.javascript.rhino.Node var58 = var47.srcref(var57);
    com.google.javascript.rhino.jstype.ObjectType var59 = null;
    com.google.javascript.rhino.jstype.ObjectType var60 = var43.createObjectType("", var57, var59);
    boolean var61 = var60.isArrayType();
    boolean var62 = var60.isNominalType();
    com.google.javascript.rhino.jstype.FunctionType var63 = null;
    com.google.javascript.rhino.jstype.FunctionType var64 = null;
    var0.applyDelegateRelationship(var20, var40, var60, var63, var64);
    java.util.Set var66 = var60.getPropertyNames();
    boolean var67 = var60.isEnumType();
    boolean var68 = var60.isInstanceType();
    boolean var69 = var60.isVoidType();
    boolean var70 = var60.isVoidType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test235"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.SourceFile.Generator var3 = null;
    com.google.javascript.jscomp.SourceFile var4 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var3);
    com.google.javascript.jscomp.CompilerInput var6 = new com.google.javascript.jscomp.CompilerInput(var4, false);
    var1.add(var6);
    com.google.javascript.jscomp.JSModule var9 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.SourceFile.Generator var11 = null;
    com.google.javascript.jscomp.SourceFile var12 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var11);
    var9.add(var12);
    var1.add(var12);
    com.google.javascript.jscomp.SourceAst var15 = null;
    com.google.javascript.jscomp.CompilerInput var18 = new com.google.javascript.jscomp.CompilerInput(var15, "NAME ", false);
    com.google.javascript.jscomp.JSModule var20 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.SourceFile.Generator var22 = null;
    com.google.javascript.jscomp.SourceFile var23 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var22);
    var20.add(var23);
    java.util.Set var25 = var20.getAllDependencies();
    var18.setModule(var20);
    boolean var27 = var18.isExtern();
    com.google.javascript.jscomp.JSModule var29 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.SourceFile.Generator var31 = null;
    com.google.javascript.jscomp.SourceFile var32 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var31);
    var29.add(var32);
    com.google.javascript.jscomp.CompilerInput var35 = new com.google.javascript.jscomp.CompilerInput(var32, true);
    java.lang.String var36 = var35.getName();
    boolean var37 = var35.isExtern();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addAfter(var18, var35);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);

  }

  public void test236() {}
//   public void test236() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test236"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     com.google.javascript.rhino.JSDocInfo var1 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(var0);
// 
//   }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test237"); }


    java.lang.String var1 = com.google.javascript.rhino.ScriptRuntime.escapeString("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test238() {}
//   public void test238() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test238"); }
// 
// 
//     com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.SourceFile.Generator var3 = null;
//     com.google.javascript.jscomp.SourceFile var4 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var3);
//     var1.add(var4);
//     com.google.javascript.jscomp.CompilerInput var7 = new com.google.javascript.jscomp.CompilerInput(var4, true);
//     com.google.javascript.jscomp.CompilerInput var10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var7, "function ({253302735}): {946478791}", true);
//     com.google.javascript.jscomp.Compiler var11 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Compiler.IntermediateState var12 = var11.getState();
//     com.google.javascript.rhino.Node var13 = var7.getAstRoot((com.google.javascript.jscomp.AbstractCompiler)var11);
// 
//   }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test239"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var2 = null;
    boolean var3 = var1.hasChild(var2);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    com.google.javascript.rhino.Node var8 = var1.clonePropsFrom(var5);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.throwNode(var10);
    com.google.javascript.rhino.Node var12 = var1.srcref(var11);
    boolean var13 = var11.isLabelName();
    var11.setOptionalArg(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.paramList(var11);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test240() {}
//   public void test240() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test240"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     var0.setRemoveAbstractMethods(false);
//     var0.setNameReferenceGraphPath("hi!");
//     var0.setRemoveUnusedLocalVars(false);
//     var0.setPrettyPrint(true);
//     var0.setNameAnonymousFunctionsOnly(true);
//     com.google.javascript.jscomp.CompilerOptions.Reach var11 = null;
//     var0.setRemoveUnusedVariables(var11);
// 
//   }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test241"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.ErrorReporter var2 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
    com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var3);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var8 = null;
    boolean var9 = var7.hasChild(var8);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var12 = null;
    boolean var13 = var11.hasChild(var12);
    com.google.javascript.rhino.Node var14 = var7.clonePropsFrom(var11);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.throwNode(var16);
    com.google.javascript.rhino.Node var18 = var7.srcref(var17);
    com.google.javascript.rhino.jstype.ObjectType var19 = null;
    com.google.javascript.rhino.jstype.ObjectType var20 = var3.createObjectType("", var17, var19);
    boolean var21 = var20.isUnknownType();
    com.google.javascript.jscomp.GoogleCodingConvention var22 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.lang.String var23 = var22.getDelegateSuperclassName();
    com.google.javascript.rhino.ErrorReporter var24 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24);
    com.google.javascript.rhino.jstype.FunctionBuilder var26 = new com.google.javascript.rhino.jstype.FunctionBuilder(var25);
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var30 = null;
    boolean var31 = var29.hasChild(var30);
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var34 = null;
    boolean var35 = var33.hasChild(var34);
    com.google.javascript.rhino.Node var36 = var29.clonePropsFrom(var33);
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.throwNode(var38);
    com.google.javascript.rhino.Node var40 = var29.srcref(var39);
    com.google.javascript.rhino.jstype.ObjectType var41 = null;
    com.google.javascript.rhino.jstype.ObjectType var42 = var25.createObjectType("", var39, var41);
    boolean var43 = var42.isUnknownType();
    com.google.javascript.rhino.ErrorReporter var44 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var44);
    com.google.javascript.rhino.jstype.FunctionBuilder var46 = new com.google.javascript.rhino.jstype.FunctionBuilder(var45);
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var50 = null;
    boolean var51 = var49.hasChild(var50);
    com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var54 = null;
    boolean var55 = var53.hasChild(var54);
    com.google.javascript.rhino.Node var56 = var49.clonePropsFrom(var53);
    com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var59 = com.google.javascript.rhino.IR.throwNode(var58);
    com.google.javascript.rhino.Node var60 = var49.srcref(var59);
    com.google.javascript.rhino.jstype.ObjectType var61 = null;
    com.google.javascript.rhino.jstype.ObjectType var62 = var45.createObjectType("", var59, var61);
    boolean var63 = var62.isArrayType();
    com.google.javascript.rhino.ErrorReporter var64 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var64);
    com.google.javascript.rhino.jstype.FunctionBuilder var66 = new com.google.javascript.rhino.jstype.FunctionBuilder(var65);
    com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var70 = null;
    boolean var71 = var69.hasChild(var70);
    com.google.javascript.rhino.Node var73 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var74 = null;
    boolean var75 = var73.hasChild(var74);
    com.google.javascript.rhino.Node var76 = var69.clonePropsFrom(var73);
    com.google.javascript.rhino.Node var78 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var79 = com.google.javascript.rhino.IR.throwNode(var78);
    com.google.javascript.rhino.Node var80 = var69.srcref(var79);
    com.google.javascript.rhino.jstype.ObjectType var81 = null;
    com.google.javascript.rhino.jstype.ObjectType var82 = var65.createObjectType("", var79, var81);
    boolean var83 = var82.isArrayType();
    boolean var84 = var82.isNominalType();
    com.google.javascript.rhino.jstype.FunctionType var85 = null;
    com.google.javascript.rhino.jstype.FunctionType var86 = null;
    var22.applyDelegateRelationship(var42, var62, var82, var85, var86);
    java.util.Set var88 = var82.getPropertyNames();
    com.google.javascript.rhino.jstype.JSType[] var89 = new com.google.javascript.rhino.jstype.JSType[] { var82};
    com.google.javascript.rhino.jstype.FunctionType var90 = var1.createConstructorType((com.google.javascript.rhino.jstype.JSType)var20, var89);
    com.google.javascript.rhino.jstype.FunctionType var91 = var90.cloneWithoutArrowType();
    boolean var92 = var90.makesDicts();
    boolean var93 = var90.isNumberValueType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == false);

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test242"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setPropertyAffinity(false);
    var0.setRemoveClosureAsserts(false);

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test243"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.lang.Object var1 = null;
    com.google.javascript.jscomp.graph.GraphNode var2 = var0.getNode(var1);
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var5 = null;
    boolean var6 = var4.hasChild(var5);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var9 = null;
    boolean var10 = var8.hasChild(var9);
    com.google.javascript.rhino.Node var11 = var4.clonePropsFrom(var8);
    int var12 = var4.getType();
    boolean var13 = var0.hasNode((java.lang.Object)var4);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var16 = null;
    boolean var17 = var15.hasChild(var16);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var20 = null;
    boolean var21 = var19.hasChild(var20);
    com.google.javascript.rhino.Node var22 = var15.clonePropsFrom(var19);
    boolean var23 = var15.isRegExp();
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.name("");
    int var26 = var25.getChildCount();
    var25.setString("");
    com.google.javascript.rhino.Node var29 = var15.useSourceInfoFromForTree(var25);
    boolean var30 = var29.isDec();
    boolean var31 = var29.isNot();
    java.lang.Object var32 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.disconnectInDirection((java.lang.Object)var31, var32);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test244"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var3 = null;
    boolean var4 = var2.hasChild(var3);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var7 = null;
    boolean var8 = var6.hasChild(var7);
    com.google.javascript.rhino.Node var9 = var2.clonePropsFrom(var6);
    boolean var10 = var2.isRegExp();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.name("");
    int var13 = var12.getChildCount();
    var12.setString("");
    com.google.javascript.rhino.Node var16 = var2.useSourceInfoFromForTree(var12);
    boolean var17 = var16.isDec();
    boolean var18 = var16.isNot();
    com.google.javascript.rhino.Node var21 = new com.google.javascript.rhino.Node((-1), var16, 100, 0);
    var16.setWasEmptyNode(true);
    boolean var24 = var16.isIf();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test245() {}
//   public void test245() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test245"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var3 = null;
//     boolean var4 = var2.hasChild(var3);
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var7 = null;
//     boolean var8 = var6.hasChild(var7);
//     com.google.javascript.rhino.Node var9 = var2.clonePropsFrom(var6);
//     boolean var10 = var2.isRegExp();
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.name("");
//     int var13 = var12.getChildCount();
//     var12.setString("");
//     com.google.javascript.rhino.Node var16 = var2.useSourceInfoFromForTree(var12);
//     com.google.javascript.rhino.InputId var17 = var12.getInputId();
//     com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.and(var0, var12);
// 
//   }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test246"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.FunctionBuilder var2 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
    boolean var3 = var1.shouldTolerateUndefinedValues();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.name("");
    int var7 = var6.getType();
    com.google.javascript.rhino.Node var8 = var6.getLastChild();
    boolean var9 = var6.isBlock();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.name("");
    int var13 = var12.getChildCount();
    var12.setString("");
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.InputId var18 = var17.getInputId();
    com.google.javascript.rhino.Node var19 = new com.google.javascript.rhino.Node((-1), var12, var17);
    java.lang.String var20 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(var12);
    com.google.javascript.rhino.Node var21 = var6.srcref(var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.FunctionType var22 = var1.createInterfaceType("function ({982536288}): {1485630633}", var21);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test247"); }


    com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "function ({841773643}): {67351465}", "function ({297922085}): {1392101438}");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test248() {}
//   public void test248() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test248"); }
// 
// 
//     com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.SourceFile.Generator var3 = null;
//     com.google.javascript.jscomp.SourceFile var4 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var3);
//     var1.add(var4);
//     com.google.javascript.jscomp.CompilerInput var7 = new com.google.javascript.jscomp.CompilerInput(var4, true);
//     com.google.javascript.jscomp.CompilerInput var10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var7, "function ({253302735}): {946478791}", true);
//     var7.removeRequire("");
// 
//   }

  public void test249() {}
//   public void test249() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test249"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     com.google.javascript.rhino.jstype.FunctionBuilder var2 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
//     com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var6 = null;
//     boolean var7 = var5.hasChild(var6);
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var10 = null;
//     boolean var11 = var9.hasChild(var10);
//     com.google.javascript.rhino.Node var12 = var5.clonePropsFrom(var9);
//     com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.throwNode(var14);
//     com.google.javascript.rhino.Node var16 = var5.srcref(var15);
//     com.google.javascript.rhino.jstype.ObjectType var17 = null;
//     com.google.javascript.rhino.jstype.ObjectType var18 = var1.createObjectType("", var15, var17);
//     boolean var20 = var1.isForwardDeclaredType("NAME ");
//     com.google.javascript.rhino.ErrorReporter var21 = var1.getErrorReporter();
//     com.google.javascript.rhino.jstype.JSTypeNative var22 = null;
//     com.google.javascript.rhino.jstype.ObjectType var23 = var1.getNativeObjectType(var22);
// 
//   }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test250"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.CompilerOptions var1 = new com.google.javascript.jscomp.CompilerOptions();
    var1.setPropertyAffinity(false);
    com.google.javascript.jscomp.JSModule var5 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.CompilerInput var7 = var5.getByName("");
    java.util.List var8 = var5.getDependencies();
    var1.setReplaceStringsFunctionDescriptions(var8);
    com.google.javascript.jscomp.JSModule var11 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.CompilerInput var13 = var11.getByName("");
    java.util.List var14 = var11.getDependencies();
    com.google.javascript.jscomp.CompilerOptions var15 = new com.google.javascript.jscomp.CompilerOptions();
    var15.setRemoveAbstractMethods(false);
    var15.setTweakToStringLiteral("function ({788694856}): {1325375508}", "goog.exportProperty");
    com.google.javascript.jscomp.Result var21 = var0.<com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.SourceFile>compile(var8, var14, var15);
    com.google.javascript.jscomp.SourceMap var22 = var0.getSourceMap();
    com.google.javascript.jscomp.JSModule var24 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.CompilerInput var26 = var24.getByName("");
    java.lang.String[] var27 = var0.toSourceArray(var24);
    com.google.javascript.rhino.InputId var28 = null;
    com.google.javascript.jscomp.CompilerInput var29 = var0.getInput(var28);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.check();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test251"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.jstype.StaticSourceFile var3 = var2.getStaticSourceFile();
    com.google.javascript.rhino.Node[] var4 = new com.google.javascript.rhino.Node[] { var2};
    com.google.javascript.rhino.Node var5 = new com.google.javascript.rhino.Node(10, var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.objectlit(var4);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test252"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.FunctionBuilder var2 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
    boolean var3 = var1.shouldTolerateUndefinedValues();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var10 = null;
    boolean var11 = var9.hasChild(var10);
    com.google.javascript.rhino.Node var12 = var5.clonePropsFrom(var9);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.throwNode(var14);
    com.google.javascript.rhino.Node var16 = var5.srcref(var15);
    boolean var17 = var16.isSetterDef();
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.script();
    var16.addChildrenToBack(var18);
    com.google.javascript.rhino.ErrorReporter var21 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21);
    com.google.javascript.rhino.jstype.FunctionBuilder var23 = new com.google.javascript.rhino.jstype.FunctionBuilder(var22);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var27 = null;
    boolean var28 = var26.hasChild(var27);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var31 = null;
    boolean var32 = var30.hasChild(var31);
    com.google.javascript.rhino.Node var33 = var26.clonePropsFrom(var30);
    com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.throwNode(var35);
    com.google.javascript.rhino.Node var37 = var26.srcref(var36);
    com.google.javascript.rhino.jstype.ObjectType var38 = null;
    com.google.javascript.rhino.jstype.ObjectType var39 = var22.createObjectType("", var36, var38);
    boolean var40 = var39.isArrayType();
    com.google.javascript.rhino.jstype.EnumElementType var41 = var39.toMaybeEnumElementType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.JSType var42 = var1.createFromTypeNodes(var18, "FALSE", (com.google.javascript.rhino.jstype.StaticScope)var39);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test253"); }


    com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.lang.String var1 = var0.getDelegateSuperclassName();
    com.google.javascript.jscomp.ClosureCodingConvention var2 = new com.google.javascript.jscomp.ClosureCodingConvention((com.google.javascript.jscomp.CodingConvention)var0);
    com.google.javascript.jscomp.GoogleCodingConvention var3 = new com.google.javascript.jscomp.GoogleCodingConvention();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    var5.setVarArgs(false);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.thisNode();
    java.lang.String var11 = var3.extractClassNameIfProvide(var5, var10);
    boolean var12 = var10.isThrow();
    int var13 = var10.getSourcePosition();
    com.google.javascript.jscomp.CodingConvention.Bind var15 = var2.describeFunctionBind(var10, false);
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.name("");
    int var19 = var18.getChildCount();
    var18.setString("");
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.InputId var24 = var23.getInputId();
    com.google.javascript.rhino.Node var25 = new com.google.javascript.rhino.Node((-1), var18, var23);
    java.lang.String var26 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var27 = var2.isPropertyTestFunction(var18);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test254"); }


    com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.lang.String var1 = var0.getDelegateSuperclassName();
    com.google.javascript.rhino.ErrorReporter var2 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
    com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var3);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var8 = null;
    boolean var9 = var7.hasChild(var8);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var12 = null;
    boolean var13 = var11.hasChild(var12);
    com.google.javascript.rhino.Node var14 = var7.clonePropsFrom(var11);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.throwNode(var16);
    com.google.javascript.rhino.Node var18 = var7.srcref(var17);
    com.google.javascript.rhino.jstype.ObjectType var19 = null;
    com.google.javascript.rhino.jstype.ObjectType var20 = var3.createObjectType("", var17, var19);
    boolean var21 = var20.isUnknownType();
    com.google.javascript.rhino.ErrorReporter var22 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var22);
    com.google.javascript.rhino.jstype.FunctionBuilder var24 = new com.google.javascript.rhino.jstype.FunctionBuilder(var23);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var28 = null;
    boolean var29 = var27.hasChild(var28);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var32 = null;
    boolean var33 = var31.hasChild(var32);
    com.google.javascript.rhino.Node var34 = var27.clonePropsFrom(var31);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.throwNode(var36);
    com.google.javascript.rhino.Node var38 = var27.srcref(var37);
    com.google.javascript.rhino.jstype.ObjectType var39 = null;
    com.google.javascript.rhino.jstype.ObjectType var40 = var23.createObjectType("", var37, var39);
    boolean var41 = var40.isArrayType();
    com.google.javascript.rhino.ErrorReporter var42 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var42);
    com.google.javascript.rhino.jstype.FunctionBuilder var44 = new com.google.javascript.rhino.jstype.FunctionBuilder(var43);
    com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var48 = null;
    boolean var49 = var47.hasChild(var48);
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var52 = null;
    boolean var53 = var51.hasChild(var52);
    com.google.javascript.rhino.Node var54 = var47.clonePropsFrom(var51);
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.throwNode(var56);
    com.google.javascript.rhino.Node var58 = var47.srcref(var57);
    com.google.javascript.rhino.jstype.ObjectType var59 = null;
    com.google.javascript.rhino.jstype.ObjectType var60 = var43.createObjectType("", var57, var59);
    boolean var61 = var60.isArrayType();
    boolean var62 = var60.isNominalType();
    com.google.javascript.rhino.jstype.FunctionType var63 = null;
    com.google.javascript.rhino.jstype.FunctionType var64 = null;
    var0.applyDelegateRelationship(var20, var40, var60, var63, var64);
    java.util.Set var66 = var60.getPropertyNames();
    boolean var67 = var60.isCheckedUnknownType();
    boolean var68 = var60.hasCachedValues();
    com.google.javascript.rhino.jstype.FunctionType var69 = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType((com.google.javascript.rhino.jstype.JSType)var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);

  }

  public void test255() {}
//   public void test255() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test255"); }
// 
// 
//     com.google.javascript.rhino.jstype.JSTypeRegistry var0 = null;
//     com.google.javascript.rhino.jstype.FunctionBuilder var1 = new com.google.javascript.rhino.jstype.FunctionBuilder(var0);
//     com.google.javascript.rhino.jstype.FunctionBuilder var3 = var1.setIsConstructor(true);
//     com.google.javascript.rhino.jstype.FunctionBuilder var4 = var1.forConstructor();
//     com.google.common.collect.ImmutableList var5 = null;
//     com.google.javascript.rhino.jstype.FunctionBuilder var6 = var4.withTemplateKeys(var5);
//     com.google.javascript.rhino.jstype.FunctionBuilder var8 = var4.withName("function ({619269219}): {1352010371}");
//     com.google.javascript.rhino.jstype.FunctionParamBuilder var9 = null;
//     com.google.javascript.rhino.jstype.FunctionBuilder var10 = var4.withParams(var9);
// 
//   }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test256"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromCode("", "NAME \n    SCRIPT\n");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test257"); }


    com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.lang.String var1 = var0.getDelegateSuperclassName();
    com.google.javascript.jscomp.GoogleCodingConvention var2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.lang.String var3 = var2.getDelegateSuperclassName();
    com.google.javascript.rhino.ErrorReporter var4 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var4);
    com.google.javascript.rhino.jstype.FunctionBuilder var6 = new com.google.javascript.rhino.jstype.FunctionBuilder(var5);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var10 = null;
    boolean var11 = var9.hasChild(var10);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var14 = null;
    boolean var15 = var13.hasChild(var14);
    com.google.javascript.rhino.Node var16 = var9.clonePropsFrom(var13);
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.throwNode(var18);
    com.google.javascript.rhino.Node var20 = var9.srcref(var19);
    com.google.javascript.rhino.jstype.ObjectType var21 = null;
    com.google.javascript.rhino.jstype.ObjectType var22 = var5.createObjectType("", var19, var21);
    boolean var23 = var22.isUnknownType();
    com.google.javascript.rhino.ErrorReporter var24 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24);
    com.google.javascript.rhino.jstype.FunctionBuilder var26 = new com.google.javascript.rhino.jstype.FunctionBuilder(var25);
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var30 = null;
    boolean var31 = var29.hasChild(var30);
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var34 = null;
    boolean var35 = var33.hasChild(var34);
    com.google.javascript.rhino.Node var36 = var29.clonePropsFrom(var33);
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.throwNode(var38);
    com.google.javascript.rhino.Node var40 = var29.srcref(var39);
    com.google.javascript.rhino.jstype.ObjectType var41 = null;
    com.google.javascript.rhino.jstype.ObjectType var42 = var25.createObjectType("", var39, var41);
    boolean var43 = var42.isArrayType();
    com.google.javascript.rhino.ErrorReporter var44 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var44);
    com.google.javascript.rhino.jstype.FunctionBuilder var46 = new com.google.javascript.rhino.jstype.FunctionBuilder(var45);
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var50 = null;
    boolean var51 = var49.hasChild(var50);
    com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var54 = null;
    boolean var55 = var53.hasChild(var54);
    com.google.javascript.rhino.Node var56 = var49.clonePropsFrom(var53);
    com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var59 = com.google.javascript.rhino.IR.throwNode(var58);
    com.google.javascript.rhino.Node var60 = var49.srcref(var59);
    com.google.javascript.rhino.jstype.ObjectType var61 = null;
    com.google.javascript.rhino.jstype.ObjectType var62 = var45.createObjectType("", var59, var61);
    boolean var63 = var62.isArrayType();
    boolean var64 = var62.isNominalType();
    com.google.javascript.rhino.jstype.FunctionType var65 = null;
    com.google.javascript.rhino.jstype.FunctionType var66 = null;
    var2.applyDelegateRelationship(var22, var42, var62, var65, var66);
    com.google.javascript.rhino.Node var69 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode((com.google.javascript.jscomp.CodingConvention)var2, "");
    com.google.javascript.rhino.Node var71 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var72 = null;
    boolean var73 = var71.hasChild(var72);
    com.google.javascript.rhino.Node var75 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var76 = null;
    boolean var77 = var75.hasChild(var76);
    com.google.javascript.rhino.Node var78 = var71.clonePropsFrom(var75);
    boolean var79 = var71.isRegExp();
    boolean var80 = var71.isBlock();
    boolean var81 = var2.isVarArgsParameter(var71);
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var82 = var0.getDelegateRelationship(var71);
    boolean var83 = var71.isOptionalArg();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);

  }

  public void test258() {}
//   public void test258() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test258"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.CompilerOptions var1 = new com.google.javascript.jscomp.CompilerOptions();
//     var1.setPropertyAffinity(false);
//     com.google.javascript.jscomp.JSModule var5 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.CompilerInput var7 = var5.getByName("");
//     java.util.List var8 = var5.getDependencies();
//     var1.setReplaceStringsFunctionDescriptions(var8);
//     com.google.javascript.jscomp.JSModule var11 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.CompilerInput var13 = var11.getByName("");
//     java.util.List var14 = var11.getDependencies();
//     com.google.javascript.jscomp.CompilerOptions var15 = new com.google.javascript.jscomp.CompilerOptions();
//     var15.setRemoveAbstractMethods(false);
//     var15.setTweakToStringLiteral("function ({788694856}): {1325375508}", "goog.exportProperty");
//     com.google.javascript.jscomp.Result var21 = var0.<com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.SourceFile>compile(var8, var14, var15);
//     com.google.javascript.jscomp.SourceMap var22 = var0.getSourceMap();
//     com.google.javascript.jscomp.JSModule var24 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.CompilerInput var26 = var24.getByName("");
//     java.lang.String[] var27 = var0.toSourceArray(var24);
//     com.google.javascript.rhino.InputId var28 = null;
//     com.google.javascript.jscomp.CompilerInput var29 = var0.getInput(var28);
//     com.google.javascript.jscomp.SourceFile.Generator var31 = null;
//     com.google.javascript.jscomp.SourceFile var32 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var31);
//     boolean var33 = var32.isExtern();
//     java.lang.String var34 = var32.getName();
//     com.google.javascript.jscomp.JsAst var35 = new com.google.javascript.jscomp.JsAst(var32);
//     var0.addNewScript(var35);
// 
//   }

  public void test259() {}
//   public void test259() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test259"); }
// 
// 
//     com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.SourceFile.Generator var3 = null;
//     com.google.javascript.jscomp.SourceFile var4 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var3);
//     var1.add(var4);
//     com.google.javascript.jscomp.CompilerInput var7 = new com.google.javascript.jscomp.CompilerInput(var4, true);
//     java.lang.String var8 = var7.getName();
//     com.google.javascript.jscomp.CompilerInput var10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var7, false);
//     var7.removeRequire("FALSE");
// 
//   }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test260"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var2 = null;
    boolean var3 = var1.hasChild(var2);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    com.google.javascript.rhino.Node var8 = var1.clonePropsFrom(var5);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.throwNode(var10);
    com.google.javascript.rhino.Node var12 = var1.srcref(var11);
    var11.setLength(1);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var17 = null;
    boolean var18 = var16.hasChild(var17);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var21 = null;
    boolean var22 = var20.hasChild(var21);
    com.google.javascript.rhino.Node var23 = var16.clonePropsFrom(var20);
    com.google.javascript.rhino.Node var24 = var16.getNext();
    com.google.javascript.rhino.Node var25 = var16.getNext();
    var16.addSuppression("hi!");
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var30 = null;
    boolean var31 = var29.hasChild(var30);
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var34 = null;
    boolean var35 = var33.hasChild(var34);
    com.google.javascript.rhino.Node var36 = var29.clonePropsFrom(var33);
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.throwNode(var38);
    com.google.javascript.rhino.Node var40 = var29.srcref(var39);
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.getelem(var16, var40);
    com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.IR.name("");
    int var45 = var44.getChildCount();
    var44.setString("");
    var44.setCharno(1);
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.name("");
    boolean var52 = var51.isVarArgs();
    com.google.javascript.rhino.Node var54 = com.google.javascript.rhino.IR.name("");
    int var55 = var54.getChildCount();
    boolean var56 = var54.isWith();
    com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var59 = null;
    boolean var60 = var58.hasChild(var59);
    com.google.javascript.rhino.Node var62 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var63 = null;
    boolean var64 = var62.hasChild(var63);
    com.google.javascript.rhino.Node var65 = var58.clonePropsFrom(var62);
    com.google.javascript.rhino.Node var67 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var68 = com.google.javascript.rhino.IR.throwNode(var67);
    com.google.javascript.rhino.Node var69 = var58.srcref(var68);
    com.google.javascript.rhino.Node var70 = new com.google.javascript.rhino.Node((-1), var44, var51, var54, var58);
    boolean var71 = var70.isCatch();
    com.google.javascript.rhino.Node var72 = com.google.javascript.rhino.IR.thisNode();
    java.lang.String var73 = var72.getSourceFileName();
    com.google.javascript.rhino.Node var74 = var70.useSourceInfoFrom(var72);
    com.google.javascript.rhino.Node var75 = var40.useSourceInfoFrom(var74);
    com.google.javascript.rhino.Node var77 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var78 = null;
    boolean var79 = var77.hasChild(var78);
    com.google.javascript.rhino.Node var81 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var82 = null;
    boolean var83 = var81.hasChild(var82);
    com.google.javascript.rhino.Node var84 = var77.clonePropsFrom(var81);
    boolean var85 = var77.isRegExp();
    com.google.javascript.rhino.Node var87 = com.google.javascript.rhino.IR.name("");
    int var88 = var87.getChildCount();
    var87.setString("");
    com.google.javascript.rhino.Node var91 = var77.useSourceInfoFromForTree(var87);
    java.lang.String var95 = var77.toString(false, true, false);
    boolean var96 = var77.isGetElem();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.addChildrenAfter(var75, var77);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
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
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var95 + "' != '" + "NAME "+ "'", var95.equals("NAME "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == false);

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test261"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.ErrorReporter var2 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
    com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var3);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var8 = null;
    boolean var9 = var7.hasChild(var8);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var12 = null;
    boolean var13 = var11.hasChild(var12);
    com.google.javascript.rhino.Node var14 = var7.clonePropsFrom(var11);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.throwNode(var16);
    com.google.javascript.rhino.Node var18 = var7.srcref(var17);
    com.google.javascript.rhino.jstype.ObjectType var19 = null;
    com.google.javascript.rhino.jstype.ObjectType var20 = var3.createObjectType("", var17, var19);
    boolean var21 = var20.isUnknownType();
    com.google.javascript.jscomp.GoogleCodingConvention var22 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.lang.String var23 = var22.getDelegateSuperclassName();
    com.google.javascript.rhino.ErrorReporter var24 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24);
    com.google.javascript.rhino.jstype.FunctionBuilder var26 = new com.google.javascript.rhino.jstype.FunctionBuilder(var25);
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var30 = null;
    boolean var31 = var29.hasChild(var30);
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var34 = null;
    boolean var35 = var33.hasChild(var34);
    com.google.javascript.rhino.Node var36 = var29.clonePropsFrom(var33);
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.throwNode(var38);
    com.google.javascript.rhino.Node var40 = var29.srcref(var39);
    com.google.javascript.rhino.jstype.ObjectType var41 = null;
    com.google.javascript.rhino.jstype.ObjectType var42 = var25.createObjectType("", var39, var41);
    boolean var43 = var42.isUnknownType();
    com.google.javascript.rhino.ErrorReporter var44 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var44);
    com.google.javascript.rhino.jstype.FunctionBuilder var46 = new com.google.javascript.rhino.jstype.FunctionBuilder(var45);
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var50 = null;
    boolean var51 = var49.hasChild(var50);
    com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var54 = null;
    boolean var55 = var53.hasChild(var54);
    com.google.javascript.rhino.Node var56 = var49.clonePropsFrom(var53);
    com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var59 = com.google.javascript.rhino.IR.throwNode(var58);
    com.google.javascript.rhino.Node var60 = var49.srcref(var59);
    com.google.javascript.rhino.jstype.ObjectType var61 = null;
    com.google.javascript.rhino.jstype.ObjectType var62 = var45.createObjectType("", var59, var61);
    boolean var63 = var62.isArrayType();
    com.google.javascript.rhino.ErrorReporter var64 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var64);
    com.google.javascript.rhino.jstype.FunctionBuilder var66 = new com.google.javascript.rhino.jstype.FunctionBuilder(var65);
    com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var70 = null;
    boolean var71 = var69.hasChild(var70);
    com.google.javascript.rhino.Node var73 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var74 = null;
    boolean var75 = var73.hasChild(var74);
    com.google.javascript.rhino.Node var76 = var69.clonePropsFrom(var73);
    com.google.javascript.rhino.Node var78 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var79 = com.google.javascript.rhino.IR.throwNode(var78);
    com.google.javascript.rhino.Node var80 = var69.srcref(var79);
    com.google.javascript.rhino.jstype.ObjectType var81 = null;
    com.google.javascript.rhino.jstype.ObjectType var82 = var65.createObjectType("", var79, var81);
    boolean var83 = var82.isArrayType();
    boolean var84 = var82.isNominalType();
    com.google.javascript.rhino.jstype.FunctionType var85 = null;
    com.google.javascript.rhino.jstype.FunctionType var86 = null;
    var22.applyDelegateRelationship(var42, var62, var82, var85, var86);
    java.util.Set var88 = var82.getPropertyNames();
    com.google.javascript.rhino.jstype.JSType[] var89 = new com.google.javascript.rhino.jstype.JSType[] { var82};
    com.google.javascript.rhino.jstype.FunctionType var90 = var1.createConstructorType((com.google.javascript.rhino.jstype.JSType)var20, var89);
    var1.identifyNonNullableName("NAME ");
    com.google.javascript.jscomp.JSModule var94 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.CompilerInput var96 = var94.getByName("");
    java.util.List var97 = var94.getDependencies();
    com.google.javascript.rhino.Node var98 = var1.createParameters(var97);
    com.google.javascript.rhino.jstype.FunctionParamBuilder var99 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test262"); }


    com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.lang.String var1 = var0.getDelegateSuperclassName();
    com.google.javascript.jscomp.ClosureCodingConvention var2 = new com.google.javascript.jscomp.ClosureCodingConvention((com.google.javascript.jscomp.CodingConvention)var0);
    com.google.javascript.jscomp.GoogleCodingConvention var3 = new com.google.javascript.jscomp.GoogleCodingConvention();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    var5.setVarArgs(false);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.thisNode();
    java.lang.String var11 = var3.extractClassNameIfProvide(var5, var10);
    boolean var12 = var10.isThrow();
    int var13 = var10.getSourcePosition();
    com.google.javascript.jscomp.CodingConvention.Bind var15 = var2.describeFunctionBind(var10, false);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var18 = null;
    boolean var19 = var17.hasChild(var18);
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var22 = null;
    boolean var23 = var21.hasChild(var22);
    com.google.javascript.rhino.Node var24 = var17.clonePropsFrom(var21);
    boolean var25 = var17.isVoid();
    boolean var26 = var17.isScript();
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var29 = null;
    boolean var30 = var28.hasChild(var29);
    boolean var31 = var28.hasOneChild();
    com.google.javascript.rhino.Node var32 = var17.clonePropsFrom(var28);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var33 = var10.removeChildAfter(var32);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test263"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    int var2 = var1.getChildCount();
    boolean var3 = var1.isWith();
    java.lang.Iterable var4 = var1.children();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.InputId var7 = var6.getInputId();
    boolean var8 = var1.isEquivalentTo(var6);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.number(10.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.propdef(var1, var10);
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
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test264"); }


    com.google.javascript.rhino.jstype.JSTypeRegistry var0 = null;
    com.google.javascript.rhino.jstype.FunctionBuilder var1 = new com.google.javascript.rhino.jstype.FunctionBuilder(var0);
    com.google.javascript.rhino.jstype.FunctionBuilder var3 = var1.setIsConstructor(true);
    com.google.javascript.rhino.jstype.FunctionBuilder var4 = var1.forConstructor();
    com.google.common.collect.ImmutableList var5 = null;
    com.google.javascript.rhino.jstype.FunctionBuilder var6 = var4.withTemplateKeys(var5);
    com.google.javascript.rhino.jstype.FunctionBuilder var8 = var4.withName("function ({619269219}): {1352010371}");
    com.google.javascript.rhino.jstype.FunctionBuilder var10 = var8.setIsConstructor(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test265() {}
//   public void test265() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test265"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var3 = null;
//     boolean var4 = var2.hasChild(var3);
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var7 = null;
//     boolean var8 = var6.hasChild(var7);
//     com.google.javascript.rhino.Node var9 = var2.clonePropsFrom(var6);
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.throwNode(var11);
//     com.google.javascript.rhino.Node var13 = var2.srcref(var12);
//     boolean var14 = var12.isLabelName();
//     var12.setOptionalArg(false);
//     com.google.javascript.rhino.Node var17 = null;
//     com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
//     int var20 = var19.getChildCount();
//     var19.setString("");
//     boolean var23 = var19.isFunction();
//     com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.forNode(var0, var12, var17, var19);
// 
//   }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test266"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.jstype.StaticSourceFile var2 = var1.getStaticSourceFile();
    boolean var3 = var1.isGetElem();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var4 = var1.detachFromParent();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test267"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var2 = null;
    boolean var3 = var1.hasChild(var2);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    com.google.javascript.rhino.Node var8 = var1.clonePropsFrom(var5);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.throwNode(var10);
    com.google.javascript.rhino.Node var12 = var1.srcref(var11);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("");
    int var15 = var14.getChildCount();
    var14.setString("");
    var14.setCharno(1);
    com.google.javascript.rhino.Node var20 = var12.copyInformationFrom(var14);
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var23 = null;
    boolean var24 = var22.hasChild(var23);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var27 = null;
    boolean var28 = var26.hasChild(var27);
    com.google.javascript.rhino.Node var29 = var22.clonePropsFrom(var26);
    boolean var30 = var22.isVoid();
    com.google.javascript.rhino.Node var31 = var20.clonePropsFrom(var22);
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var34 = null;
    boolean var35 = var33.hasChild(var34);
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var38 = null;
    boolean var39 = var37.hasChild(var38);
    com.google.javascript.rhino.Node var40 = var33.clonePropsFrom(var37);
    boolean var41 = var33.isRegExp();
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.name("");
    int var44 = var43.getChildCount();
    var43.setString("");
    com.google.javascript.rhino.Node var47 = var33.useSourceInfoFromForTree(var43);
    var47.setIsSyntheticBlock(true);
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var52 = null;
    boolean var53 = var51.hasChild(var52);
    com.google.javascript.rhino.Node var55 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var56 = null;
    boolean var57 = var55.hasChild(var56);
    com.google.javascript.rhino.Node var58 = var51.clonePropsFrom(var55);
    com.google.javascript.rhino.Node var59 = var51.getNext();
    com.google.javascript.rhino.Node var60 = var51.getNext();
    var51.addSuppression("hi!");
    com.google.javascript.rhino.Node var64 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var65 = null;
    boolean var66 = var64.hasChild(var65);
    com.google.javascript.rhino.Node var68 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var69 = null;
    boolean var70 = var68.hasChild(var69);
    com.google.javascript.rhino.Node var71 = var64.clonePropsFrom(var68);
    com.google.javascript.rhino.Node var73 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var74 = com.google.javascript.rhino.IR.throwNode(var73);
    com.google.javascript.rhino.Node var75 = var64.srcref(var74);
    com.google.javascript.rhino.Node var76 = com.google.javascript.rhino.IR.getelem(var51, var75);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var77 = com.google.javascript.rhino.IR.ifNode(var31, var47, var76);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
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

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test268"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.block();
    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var4 = null;
    boolean var5 = var3.hasChild(var4);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var8 = null;
    boolean var9 = var7.hasChild(var8);
    com.google.javascript.rhino.Node var10 = var3.clonePropsFrom(var7);
    boolean var11 = var3.isRegExp();
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.name("");
    int var14 = var13.getChildCount();
    var13.setString("");
    com.google.javascript.rhino.Node var17 = var3.useSourceInfoFromForTree(var13);
    java.lang.String var21 = var3.toString(false, true, false);
    var3.setLength(38);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.function(var0, var1, var3);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "NAME "+ "'", var21.equals("NAME "));

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test269"); }


    boolean var1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("function ({946192704}): {544370093}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test270"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var2 = null;
    boolean var3 = var1.hasChild(var2);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    com.google.javascript.rhino.Node var8 = var1.clonePropsFrom(var5);
    boolean var9 = var1.isVoid();
    com.google.javascript.jscomp.GoogleCodingConvention var10 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.lang.String var11 = var10.getDelegateSuperclassName();
    com.google.javascript.jscomp.ClosureCodingConvention var12 = new com.google.javascript.jscomp.ClosureCodingConvention((com.google.javascript.jscomp.CodingConvention)var10);
    com.google.javascript.jscomp.GoogleCodingConvention var13 = new com.google.javascript.jscomp.GoogleCodingConvention((com.google.javascript.jscomp.CodingConvention)var10);
    java.lang.String var14 = var13.getDelegateSuperclassName();
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var17 = null;
    boolean var18 = var16.hasChild(var17);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var21 = null;
    boolean var22 = var20.hasChild(var21);
    com.google.javascript.rhino.Node var23 = var16.clonePropsFrom(var20);
    int var24 = var16.getType();
    boolean var25 = var13.isVarArgsParameter(var16);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var28 = null;
    boolean var29 = var27.hasChild(var28);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var32 = null;
    boolean var33 = var31.hasChild(var32);
    com.google.javascript.rhino.Node var34 = var27.clonePropsFrom(var31);
    boolean var35 = var27.isRegExp();
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.name("");
    int var38 = var37.getChildCount();
    var37.setString("");
    com.google.javascript.rhino.Node var41 = var27.useSourceInfoFromForTree(var37);
    var16.addChildToBack(var41);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.or(var1, var41);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test271"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.lang.Object var1 = null;
    com.google.javascript.jscomp.graph.GraphNode var2 = var0.getNode(var1);
    var0.clearNodeAnnotations();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var10 = null;
    boolean var11 = var9.hasChild(var10);
    com.google.javascript.rhino.Node var12 = var5.clonePropsFrom(var9);
    boolean var13 = var5.isRegExp();
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.name("");
    int var16 = var15.getChildCount();
    var15.setString("");
    com.google.javascript.rhino.Node var19 = var5.useSourceInfoFromForTree(var15);
    boolean var20 = var19.isBreak();
    com.google.javascript.jscomp.graph.GraphNode var21 = var0.createNode((java.lang.Object)var20);
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.name("");
    int var24 = var23.getChildCount();
    var23.setString("");
    boolean var27 = var23.isFunction();
    boolean var28 = var23.isNoSideEffectsCall();
    com.google.javascript.rhino.jstype.JSTypeRegistry var29 = null;
    com.google.javascript.rhino.jstype.FunctionBuilder var30 = new com.google.javascript.rhino.jstype.FunctionBuilder(var29);
    com.google.javascript.rhino.jstype.FunctionBuilder var32 = var30.setIsConstructor(true);
    com.google.javascript.rhino.jstype.FunctionBuilder var33 = var30.forConstructor();
    com.google.common.collect.ImmutableList var34 = null;
    com.google.javascript.rhino.jstype.FunctionBuilder var35 = var33.withTemplateKeys(var34);
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.name("");
    int var38 = var37.getChildCount();
    boolean var39 = var37.hasChildren();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var40 = var0.isConnectedInDirection((java.lang.Object)var23, (java.lang.Object)var35, (java.lang.Object)var37);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test272"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.stringKey("(hi!)");
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
    int var5 = var4.getChildCount();
    var4.setString("");
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.InputId var10 = var9.getInputId();
    com.google.javascript.rhino.Node var11 = new com.google.javascript.rhino.Node((-1), var4, var9);
    boolean var12 = var4.isThrow();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var13 = var1.removeChildAfter(var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test273"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var2 = null;
    boolean var3 = var1.hasChild(var2);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    com.google.javascript.rhino.Node var8 = var1.clonePropsFrom(var5);
    com.google.javascript.rhino.Node var9 = var1.getNext();
    com.google.javascript.rhino.Node var10 = var1.getNext();
    var1.addSuppression("hi!");
    boolean var13 = var1.isNoSideEffectsCall();
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var16 = null;
    boolean var17 = var15.hasChild(var16);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var20 = null;
    boolean var21 = var19.hasChild(var20);
    com.google.javascript.rhino.Node var22 = var15.clonePropsFrom(var19);
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.throwNode(var24);
    com.google.javascript.rhino.Node var26 = var15.srcref(var25);
    var25.setOptionalArg(true);
    java.lang.Iterable var29 = var25.children();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.catchNode(var1, var25);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
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

  }

  public void test274() {}
//   public void test274() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test274"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.paramList(var0);
// 
//   }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test275"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.lang.Object var1 = null;
    com.google.javascript.jscomp.graph.GraphNode var2 = var0.getNode(var1);
    var0.clearNodeAnnotations();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var10 = null;
    boolean var11 = var9.hasChild(var10);
    com.google.javascript.rhino.Node var12 = var5.clonePropsFrom(var9);
    boolean var13 = var5.isRegExp();
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.name("");
    int var16 = var15.getChildCount();
    var15.setString("");
    com.google.javascript.rhino.Node var19 = var5.useSourceInfoFromForTree(var15);
    boolean var20 = var19.isBreak();
    com.google.javascript.jscomp.graph.GraphNode var21 = var0.createNode((java.lang.Object)var20);
    com.google.javascript.rhino.ErrorReporter var22 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var22);
    com.google.javascript.rhino.jstype.FunctionBuilder var24 = new com.google.javascript.rhino.jstype.FunctionBuilder(var23);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var28 = null;
    boolean var29 = var27.hasChild(var28);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var32 = null;
    boolean var33 = var31.hasChild(var32);
    com.google.javascript.rhino.Node var34 = var27.clonePropsFrom(var31);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.throwNode(var36);
    com.google.javascript.rhino.Node var38 = var27.srcref(var37);
    com.google.javascript.rhino.jstype.ObjectType var39 = null;
    com.google.javascript.rhino.jstype.ObjectType var40 = var23.createObjectType("", var37, var39);
    boolean var41 = var40.isString();
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var44 = null;
    boolean var45 = var43.hasChild(var44);
    com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var48 = null;
    boolean var49 = var47.hasChild(var48);
    com.google.javascript.rhino.Node var50 = var43.clonePropsFrom(var47);
    com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.IR.throwNode(var52);
    com.google.javascript.rhino.Node var54 = var43.srcref(var53);
    boolean var55 = var54.isSetterDef();
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.script();
    var54.addChildrenToBack(var56);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var58 = var0.isConnected((java.lang.Object)var41, (java.lang.Object)var54);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test276"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.ErrorReporter var2 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
    com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var3);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var8 = null;
    boolean var9 = var7.hasChild(var8);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var12 = null;
    boolean var13 = var11.hasChild(var12);
    com.google.javascript.rhino.Node var14 = var7.clonePropsFrom(var11);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.throwNode(var16);
    com.google.javascript.rhino.Node var18 = var7.srcref(var17);
    com.google.javascript.rhino.jstype.ObjectType var19 = null;
    com.google.javascript.rhino.jstype.ObjectType var20 = var3.createObjectType("", var17, var19);
    boolean var21 = var20.isUnknownType();
    com.google.javascript.jscomp.GoogleCodingConvention var22 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.lang.String var23 = var22.getDelegateSuperclassName();
    com.google.javascript.rhino.ErrorReporter var24 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24);
    com.google.javascript.rhino.jstype.FunctionBuilder var26 = new com.google.javascript.rhino.jstype.FunctionBuilder(var25);
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var30 = null;
    boolean var31 = var29.hasChild(var30);
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var34 = null;
    boolean var35 = var33.hasChild(var34);
    com.google.javascript.rhino.Node var36 = var29.clonePropsFrom(var33);
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.throwNode(var38);
    com.google.javascript.rhino.Node var40 = var29.srcref(var39);
    com.google.javascript.rhino.jstype.ObjectType var41 = null;
    com.google.javascript.rhino.jstype.ObjectType var42 = var25.createObjectType("", var39, var41);
    boolean var43 = var42.isUnknownType();
    com.google.javascript.rhino.ErrorReporter var44 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var44);
    com.google.javascript.rhino.jstype.FunctionBuilder var46 = new com.google.javascript.rhino.jstype.FunctionBuilder(var45);
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var50 = null;
    boolean var51 = var49.hasChild(var50);
    com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var54 = null;
    boolean var55 = var53.hasChild(var54);
    com.google.javascript.rhino.Node var56 = var49.clonePropsFrom(var53);
    com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var59 = com.google.javascript.rhino.IR.throwNode(var58);
    com.google.javascript.rhino.Node var60 = var49.srcref(var59);
    com.google.javascript.rhino.jstype.ObjectType var61 = null;
    com.google.javascript.rhino.jstype.ObjectType var62 = var45.createObjectType("", var59, var61);
    boolean var63 = var62.isArrayType();
    com.google.javascript.rhino.ErrorReporter var64 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var64);
    com.google.javascript.rhino.jstype.FunctionBuilder var66 = new com.google.javascript.rhino.jstype.FunctionBuilder(var65);
    com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var70 = null;
    boolean var71 = var69.hasChild(var70);
    com.google.javascript.rhino.Node var73 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var74 = null;
    boolean var75 = var73.hasChild(var74);
    com.google.javascript.rhino.Node var76 = var69.clonePropsFrom(var73);
    com.google.javascript.rhino.Node var78 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var79 = com.google.javascript.rhino.IR.throwNode(var78);
    com.google.javascript.rhino.Node var80 = var69.srcref(var79);
    com.google.javascript.rhino.jstype.ObjectType var81 = null;
    com.google.javascript.rhino.jstype.ObjectType var82 = var65.createObjectType("", var79, var81);
    boolean var83 = var82.isArrayType();
    boolean var84 = var82.isNominalType();
    com.google.javascript.rhino.jstype.FunctionType var85 = null;
    com.google.javascript.rhino.jstype.FunctionType var86 = null;
    var22.applyDelegateRelationship(var42, var62, var82, var85, var86);
    java.util.Set var88 = var82.getPropertyNames();
    com.google.javascript.rhino.jstype.JSType[] var89 = new com.google.javascript.rhino.jstype.JSType[] { var82};
    com.google.javascript.rhino.jstype.FunctionType var90 = var1.createConstructorType((com.google.javascript.rhino.jstype.JSType)var20, var89);
    com.google.javascript.rhino.jstype.FunctionType var91 = var90.getSuperClassConstructor();
    com.google.javascript.rhino.jstype.EnumElementType var92 = var90.toMaybeEnumElementType();
    com.google.javascript.rhino.Node var94 = com.google.javascript.rhino.IR.stringKey("(hi!)");
    var90.setSource(var94);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var96 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(var94);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test277"); }


    boolean var1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test278"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.string("function ({1628313113}): {1674376470}");
    boolean var2 = var1.isAssignAdd();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.continueNode(var1);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test279() {}
//   public void test279() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test279"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "NAME ", false);
//     com.google.javascript.jscomp.SourceAst var4 = var3.getSourceAst();
//     java.lang.String var5 = var3.getCode();
// 
//   }

  public void test280() {}
//   public void test280() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test280"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.CompilerOptions var1 = new com.google.javascript.jscomp.CompilerOptions();
//     var1.setPropertyAffinity(false);
//     com.google.javascript.jscomp.JSModule var5 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.CompilerInput var7 = var5.getByName("");
//     java.util.List var8 = var5.getDependencies();
//     var1.setReplaceStringsFunctionDescriptions(var8);
//     com.google.javascript.jscomp.JSModule var11 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.CompilerInput var13 = var11.getByName("");
//     java.util.List var14 = var11.getDependencies();
//     com.google.javascript.jscomp.CompilerOptions var15 = new com.google.javascript.jscomp.CompilerOptions();
//     var15.setRemoveAbstractMethods(false);
//     var15.setTweakToStringLiteral("function ({788694856}): {1325375508}", "goog.exportProperty");
//     com.google.javascript.jscomp.Result var21 = var0.<com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.SourceFile>compile(var8, var14, var15);
//     com.google.javascript.jscomp.SourceMap var22 = var0.getSourceMap();
//     com.google.javascript.jscomp.JSModule var24 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.CompilerInput var26 = var24.getByName("");
//     java.lang.String[] var27 = var0.toSourceArray(var24);
//     com.google.javascript.jscomp.LightweightMessageFormatter var28 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var0);
//     com.google.javascript.jscomp.JSError var29 = null;
//     java.lang.String var30 = var28.formatError(var29);
// 
//   }

  public void test281() {}
//   public void test281() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test281"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.name("");
//     int var4 = var3.getChildCount();
//     var3.setString("");
//     var3.setCharno(1);
//     com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.name("");
//     boolean var11 = var10.isVarArgs();
//     com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.name("");
//     int var14 = var13.getChildCount();
//     boolean var15 = var13.isWith();
//     com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var18 = null;
//     boolean var19 = var17.hasChild(var18);
//     com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var22 = null;
//     boolean var23 = var21.hasChild(var22);
//     com.google.javascript.rhino.Node var24 = var17.clonePropsFrom(var21);
//     com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.throwNode(var26);
//     com.google.javascript.rhino.Node var28 = var17.srcref(var27);
//     com.google.javascript.rhino.Node var29 = new com.google.javascript.rhino.Node((-1), var3, var10, var13, var17);
//     boolean var30 = var3.isString();
//     com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.catchNode(var0, var3);
// 
//   }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test282"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.ErrorManager var1 = var0.getErrorManager();
    java.lang.String var2 = var0.getAstDotGraph();
    com.google.javascript.jscomp.CompilerOptions var3 = new com.google.javascript.jscomp.CompilerOptions();
    var3.setPropertyAffinity(false);
    com.google.javascript.jscomp.JSModule var7 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.CompilerInput var9 = var7.getByName("");
    java.util.List var10 = var7.getDependencies();
    var3.setReplaceStringsFunctionDescriptions(var10);
    com.google.javascript.jscomp.JSModule var13 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.SourceFile.Generator var15 = null;
    com.google.javascript.jscomp.SourceFile var16 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var15);
    var13.add(var16);
    java.util.List var18 = var13.getRequires();
    com.google.javascript.jscomp.CompilerOptions var19 = new com.google.javascript.jscomp.CompilerOptions();
    var19.setRemoveAbstractMethods(false);
    var19.setTweakToStringLiteral("function ({788694856}): {1325375508}", "goog.exportProperty");
    var19.setRemoveClosureAsserts(false);
    var19.setRemoveUnusedLocalVars(true);
    var19.setMarkNoSideEffectCalls(false);
    var0.<com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.SourceFile>init(var10, var18, var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.SymbolTable var32 = var0.buildKnownSymbolTable();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test283"); }


    com.google.javascript.jscomp.SourceFile.Generator var1 = null;
    com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var1);
    boolean var3 = var2.isExtern();
    java.lang.String var4 = var2.getName();
    com.google.javascript.jscomp.JsAst var5 = new com.google.javascript.jscomp.JsAst(var2);
    com.google.javascript.jscomp.SourceFile var8 = com.google.javascript.jscomp.SourceFile.fromCode("function ({1427496923}): {253480577}", "function ({1546170474}): {1935027818}");
    var8.setOriginalPath("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.setSourceFile(var8);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test284() {}
//   public void test284() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test284"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     com.google.javascript.rhino.jstype.FunctionBuilder var2 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
//     com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var6 = null;
//     boolean var7 = var5.hasChild(var6);
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var10 = null;
//     boolean var11 = var9.hasChild(var10);
//     com.google.javascript.rhino.Node var12 = var5.clonePropsFrom(var9);
//     com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.throwNode(var14);
//     com.google.javascript.rhino.Node var16 = var5.srcref(var15);
//     com.google.javascript.rhino.jstype.ObjectType var17 = null;
//     com.google.javascript.rhino.jstype.ObjectType var18 = var1.createObjectType("", var15, var17);
//     boolean var20 = var1.isForwardDeclaredType("NAME ");
//     com.google.javascript.rhino.jstype.JSTypeNative var21 = null;
//     com.google.javascript.rhino.jstype.FunctionType var22 = var1.getNativeFunctionType(var21);
// 
//   }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test285"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString(100, "NAME ", 10, 0);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.name("");
    int var7 = var6.getChildCount();
    var6.setString("");
    boolean var10 = var6.isFunction();
    boolean var11 = var6.isNoSideEffectsCall();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.propdef(var4, var6);
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test286"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.jstype.StaticSourceFile var3 = var2.getStaticSourceFile();
    com.google.javascript.rhino.Node[] var4 = new com.google.javascript.rhino.Node[] { var2};
    com.google.javascript.rhino.Node var5 = new com.google.javascript.rhino.Node(10, var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.paramList(var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test287() {}
//   public void test287() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test287"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     com.google.javascript.rhino.ErrorReporter var2 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
//     com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var3);
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var8 = null;
//     boolean var9 = var7.hasChild(var8);
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var12 = null;
//     boolean var13 = var11.hasChild(var12);
//     com.google.javascript.rhino.Node var14 = var7.clonePropsFrom(var11);
//     com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.throwNode(var16);
//     com.google.javascript.rhino.Node var18 = var7.srcref(var17);
//     com.google.javascript.rhino.jstype.ObjectType var19 = null;
//     com.google.javascript.rhino.jstype.ObjectType var20 = var3.createObjectType("", var17, var19);
//     boolean var21 = var20.isUnknownType();
//     com.google.javascript.jscomp.GoogleCodingConvention var22 = new com.google.javascript.jscomp.GoogleCodingConvention();
//     java.lang.String var23 = var22.getDelegateSuperclassName();
//     com.google.javascript.rhino.ErrorReporter var24 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24);
//     com.google.javascript.rhino.jstype.FunctionBuilder var26 = new com.google.javascript.rhino.jstype.FunctionBuilder(var25);
//     com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var30 = null;
//     boolean var31 = var29.hasChild(var30);
//     com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var34 = null;
//     boolean var35 = var33.hasChild(var34);
//     com.google.javascript.rhino.Node var36 = var29.clonePropsFrom(var33);
//     com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.throwNode(var38);
//     com.google.javascript.rhino.Node var40 = var29.srcref(var39);
//     com.google.javascript.rhino.jstype.ObjectType var41 = null;
//     com.google.javascript.rhino.jstype.ObjectType var42 = var25.createObjectType("", var39, var41);
//     boolean var43 = var42.isUnknownType();
//     com.google.javascript.rhino.ErrorReporter var44 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var44);
//     com.google.javascript.rhino.jstype.FunctionBuilder var46 = new com.google.javascript.rhino.jstype.FunctionBuilder(var45);
//     com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var50 = null;
//     boolean var51 = var49.hasChild(var50);
//     com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var54 = null;
//     boolean var55 = var53.hasChild(var54);
//     com.google.javascript.rhino.Node var56 = var49.clonePropsFrom(var53);
//     com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var59 = com.google.javascript.rhino.IR.throwNode(var58);
//     com.google.javascript.rhino.Node var60 = var49.srcref(var59);
//     com.google.javascript.rhino.jstype.ObjectType var61 = null;
//     com.google.javascript.rhino.jstype.ObjectType var62 = var45.createObjectType("", var59, var61);
//     boolean var63 = var62.isArrayType();
//     com.google.javascript.rhino.ErrorReporter var64 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var64);
//     com.google.javascript.rhino.jstype.FunctionBuilder var66 = new com.google.javascript.rhino.jstype.FunctionBuilder(var65);
//     com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var70 = null;
//     boolean var71 = var69.hasChild(var70);
//     com.google.javascript.rhino.Node var73 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.Node var74 = null;
//     boolean var75 = var73.hasChild(var74);
//     com.google.javascript.rhino.Node var76 = var69.clonePropsFrom(var73);
//     com.google.javascript.rhino.Node var78 = com.google.javascript.rhino.IR.name("hi!");
//     com.google.javascript.rhino.Node var79 = com.google.javascript.rhino.IR.throwNode(var78);
//     com.google.javascript.rhino.Node var80 = var69.srcref(var79);
//     com.google.javascript.rhino.jstype.ObjectType var81 = null;
//     com.google.javascript.rhino.jstype.ObjectType var82 = var65.createObjectType("", var79, var81);
//     boolean var83 = var82.isArrayType();
//     boolean var84 = var82.isNominalType();
//     com.google.javascript.rhino.jstype.FunctionType var85 = null;
//     com.google.javascript.rhino.jstype.FunctionType var86 = null;
//     var22.applyDelegateRelationship(var42, var62, var82, var85, var86);
//     java.util.Set var88 = var82.getPropertyNames();
//     com.google.javascript.rhino.jstype.JSType[] var89 = new com.google.javascript.rhino.jstype.JSType[] { var82};
//     com.google.javascript.rhino.jstype.FunctionType var90 = var1.createConstructorType((com.google.javascript.rhino.jstype.JSType)var20, var89);
//     com.google.javascript.rhino.jstype.FunctionType var91 = var90.getSuperClassConstructor();
//     java.lang.String var92 = var90.toDebugHashCodeString();
//     boolean var93 = var90.isUnknownType();
//     boolean var94 = var90.hasCachedValues();
//     com.google.javascript.rhino.jstype.FunctionType var95 = var90.getOwnerFunction();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var17);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var20);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var21 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var23);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var29);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var31 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var33);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var35 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var36);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var38);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var39);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var40);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var42);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var43 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var49);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var51 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var53);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var55 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var56);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var58);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var59);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var60);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var62);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var63 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var69);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var71 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var73);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var75 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var76);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var78);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var79);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var80);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var82);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var83 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var84 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var88);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var89);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var90);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var91);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var92 + "' != '" + "function ({43897330}): {1195534389}"+ "'", var92.equals("function ({43897330}): {1195534389}"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var93 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var94 == true);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var95);
// 
//   }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test288"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var2 = null;
    boolean var3 = var1.hasChild(var2);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    com.google.javascript.rhino.Node var8 = var1.clonePropsFrom(var5);
    boolean var9 = var1.isRegExp();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
    int var12 = var11.getChildCount();
    var11.setString("");
    com.google.javascript.rhino.Node var15 = var1.useSourceInfoFromForTree(var11);
    boolean var16 = var11.hasChildren();
    boolean var17 = var11.isNull();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test289() {}
//   public void test289() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test289"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var1);
//     boolean var3 = var2.isExtern();
//     java.lang.String var4 = var2.getName();
//     com.google.javascript.jscomp.JsAst var5 = new com.google.javascript.jscomp.JsAst(var2);
//     com.google.javascript.rhino.InputId var6 = var5.getInputId();
//     com.google.javascript.jscomp.JSModule var8 = new com.google.javascript.jscomp.JSModule("NAME ");
//     com.google.javascript.jscomp.SourceFile.Generator var10 = null;
//     com.google.javascript.jscomp.SourceFile var11 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var10);
//     var8.add(var11);
//     java.lang.String var13 = var8.toString();
//     com.google.javascript.jscomp.SourceFile.Generator var15 = null;
//     com.google.javascript.jscomp.SourceFile var16 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var15);
//     boolean var17 = var16.isExtern();
//     java.lang.String var18 = var16.getName();
//     var8.add(var16);
//     var16.setOriginalPath("function ({1989090318}): {763041777}");
//     boolean var22 = var6.equals((java.lang.Object)var16);
//     int var24 = var16.getLineOfOffset(38);
// 
//   }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test290"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.SourceFile.Generator var3 = null;
    com.google.javascript.jscomp.SourceFile var4 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var3);
    var1.add(var4);
    java.util.List var6 = var1.getRequires();
    com.google.javascript.jscomp.SourceAst var7 = null;
    com.google.javascript.jscomp.CompilerInput var10 = new com.google.javascript.jscomp.CompilerInput(var7, "NAME ", false);
    com.google.javascript.jscomp.JSModule var12 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.SourceFile.Generator var14 = null;
    com.google.javascript.jscomp.SourceFile var15 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var14);
    var12.add(var15);
    java.util.Set var17 = var12.getAllDependencies();
    var10.setModule(var12);
    boolean var19 = var10.isExtern();
    com.google.javascript.jscomp.SourceAst var20 = var10.getSourceAst();
    com.google.javascript.jscomp.JSModule var22 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.SourceFile.Generator var24 = null;
    com.google.javascript.jscomp.SourceFile var25 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var24);
    com.google.javascript.jscomp.CompilerInput var27 = new com.google.javascript.jscomp.CompilerInput(var25, false);
    var22.add(var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addAfter(var10, var27);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test291"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var2 = null;
    boolean var3 = var1.hasChild(var2);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    com.google.javascript.rhino.Node var8 = var1.clonePropsFrom(var5);
    com.google.javascript.rhino.Node var10 = var1.getAncestor(10);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.name("");
    int var14 = var13.getChildCount();
    var13.setString("");
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.InputId var19 = var18.getInputId();
    com.google.javascript.rhino.Node var20 = new com.google.javascript.rhino.Node((-1), var13, var18);
    java.lang.String var21 = var13.getString();
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.jstype.StaticSourceFile var24 = var23.getStaticSourceFile();
    boolean var25 = var23.isGetElem();
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.neg(var23);
    var23.setLineno(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.replaceChildAfter(var13, var23);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test292() {}
//   public void test292() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test292"); }
// 
// 
//     java.util.logging.Logger var0 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
//     int var2 = var1.getErrorCount();
//     com.google.javascript.jscomp.Compiler var3 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var1);
//     com.google.javascript.jscomp.SourceFile.Generator var5 = null;
//     com.google.javascript.jscomp.SourceFile var6 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var5);
//     boolean var7 = var6.isExtern();
//     java.lang.String var8 = var6.getName();
//     com.google.javascript.jscomp.JsAst var9 = new com.google.javascript.jscomp.JsAst(var6);
//     com.google.javascript.rhino.InputId var10 = var9.getInputId();
//     var3.addNewScript(var9);
// 
//   }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test293"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var2 = null;
    boolean var3 = var1.hasChild(var2);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var6 = null;
    boolean var7 = var5.hasChild(var6);
    com.google.javascript.rhino.Node var8 = var1.clonePropsFrom(var5);
    boolean var9 = var8.isGetProp();
    boolean var10 = var8.isLabel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test294"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.CompilerOptions var1 = new com.google.javascript.jscomp.CompilerOptions();
    var1.setPropertyAffinity(false);
    com.google.javascript.jscomp.JSModule var5 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.CompilerInput var7 = var5.getByName("");
    java.util.List var8 = var5.getDependencies();
    var1.setReplaceStringsFunctionDescriptions(var8);
    com.google.javascript.jscomp.JSModule var11 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.CompilerInput var13 = var11.getByName("");
    java.util.List var14 = var11.getDependencies();
    com.google.javascript.jscomp.CompilerOptions var15 = new com.google.javascript.jscomp.CompilerOptions();
    var15.setRemoveAbstractMethods(false);
    var15.setTweakToStringLiteral("function ({788694856}): {1325375508}", "goog.exportProperty");
    com.google.javascript.jscomp.Result var21 = var0.<com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.SourceFile>compile(var8, var14, var15);
    com.google.javascript.jscomp.SourceMap var22 = var0.getSourceMap();
    com.google.javascript.jscomp.JSModule var24 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.CompilerInput var26 = var24.getByName("");
    java.lang.String[] var27 = var0.toSourceArray(var24);
    com.google.javascript.jscomp.JSModule var29 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.SourceFile.Generator var31 = null;
    com.google.javascript.jscomp.SourceFile var32 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var31);
    var29.add(var32);
    com.google.javascript.jscomp.CompilerInput var35 = new com.google.javascript.jscomp.CompilerInput(var32, true);
    java.lang.String var36 = var35.getName();
    com.google.javascript.jscomp.CompilerInput var38 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var35, false);
    boolean var39 = var35.isExtern();
    com.google.javascript.jscomp.JSModule var41 = new com.google.javascript.jscomp.JSModule("NAME ");
    com.google.javascript.jscomp.SourceFile.Generator var43 = null;
    com.google.javascript.jscomp.SourceFile var44 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var43);
    var41.add(var44);
    com.google.javascript.jscomp.CompilerInput var47 = new com.google.javascript.jscomp.CompilerInput(var44, true);
    java.lang.String var48 = var47.getName();
    com.google.javascript.jscomp.CompilerInput var50 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var47, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var24.addAfter(var35, var50);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test295"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
    int var3 = var2.getChildCount();
    var2.setString("");
    var2.setCharno(1);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.name("");
    boolean var10 = var9.isVarArgs();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.name("");
    int var13 = var12.getChildCount();
    boolean var14 = var12.isWith();
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var17 = null;
    boolean var18 = var16.hasChild(var17);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var21 = null;
    boolean var22 = var20.hasChild(var21);
    com.google.javascript.rhino.Node var23 = var16.clonePropsFrom(var20);
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.throwNode(var25);
    com.google.javascript.rhino.Node var27 = var16.srcref(var26);
    com.google.javascript.rhino.Node var28 = new com.google.javascript.rhino.Node((-1), var2, var9, var12, var16);
    boolean var29 = var28.isCatch();
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.thisNode();
    java.lang.String var31 = var30.getSourceFileName();
    com.google.javascript.rhino.Node var32 = var28.useSourceInfoFrom(var30);
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.block();
    com.google.javascript.jscomp.ClosureCodingConvention var34 = new com.google.javascript.jscomp.ClosureCodingConvention();
    java.lang.String var35 = var34.getExportSymbolFunction();
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.thisNode();
    java.lang.String var37 = var36.getSourceFileName();
    var36.setWasEmptyNode(false);
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.stringKey("NAME \n");
    java.lang.String var42 = var41.getString();
    java.lang.String var43 = var34.extractClassNameIfProvide(var36, var41);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var30.addChildrenAfter(var33, var36);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "goog.exportSymbol"+ "'", var35.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "NAME \n"+ "'", var42.equals("NAME \n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);

  }

  public void test296() {}
//   public void test296() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test296"); }
// 
// 
//     java.io.InputStream var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromInputStream("function ({1869362278}): {686050736}", var1);
// 
//   }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test297"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.ErrorReporter var2 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
    com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var3);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var8 = null;
    boolean var9 = var7.hasChild(var8);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var12 = null;
    boolean var13 = var11.hasChild(var12);
    com.google.javascript.rhino.Node var14 = var7.clonePropsFrom(var11);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.throwNode(var16);
    com.google.javascript.rhino.Node var18 = var7.srcref(var17);
    com.google.javascript.rhino.jstype.ObjectType var19 = null;
    com.google.javascript.rhino.jstype.ObjectType var20 = var3.createObjectType("", var17, var19);
    boolean var21 = var20.isUnknownType();
    com.google.javascript.jscomp.GoogleCodingConvention var22 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.lang.String var23 = var22.getDelegateSuperclassName();
    com.google.javascript.rhino.ErrorReporter var24 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24);
    com.google.javascript.rhino.jstype.FunctionBuilder var26 = new com.google.javascript.rhino.jstype.FunctionBuilder(var25);
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var30 = null;
    boolean var31 = var29.hasChild(var30);
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var34 = null;
    boolean var35 = var33.hasChild(var34);
    com.google.javascript.rhino.Node var36 = var29.clonePropsFrom(var33);
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.throwNode(var38);
    com.google.javascript.rhino.Node var40 = var29.srcref(var39);
    com.google.javascript.rhino.jstype.ObjectType var41 = null;
    com.google.javascript.rhino.jstype.ObjectType var42 = var25.createObjectType("", var39, var41);
    boolean var43 = var42.isUnknownType();
    com.google.javascript.rhino.ErrorReporter var44 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var44);
    com.google.javascript.rhino.jstype.FunctionBuilder var46 = new com.google.javascript.rhino.jstype.FunctionBuilder(var45);
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var50 = null;
    boolean var51 = var49.hasChild(var50);
    com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var54 = null;
    boolean var55 = var53.hasChild(var54);
    com.google.javascript.rhino.Node var56 = var49.clonePropsFrom(var53);
    com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var59 = com.google.javascript.rhino.IR.throwNode(var58);
    com.google.javascript.rhino.Node var60 = var49.srcref(var59);
    com.google.javascript.rhino.jstype.ObjectType var61 = null;
    com.google.javascript.rhino.jstype.ObjectType var62 = var45.createObjectType("", var59, var61);
    boolean var63 = var62.isArrayType();
    com.google.javascript.rhino.ErrorReporter var64 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var64);
    com.google.javascript.rhino.jstype.FunctionBuilder var66 = new com.google.javascript.rhino.jstype.FunctionBuilder(var65);
    com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var70 = null;
    boolean var71 = var69.hasChild(var70);
    com.google.javascript.rhino.Node var73 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.Node var74 = null;
    boolean var75 = var73.hasChild(var74);
    com.google.javascript.rhino.Node var76 = var69.clonePropsFrom(var73);
    com.google.javascript.rhino.Node var78 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var79 = com.google.javascript.rhino.IR.throwNode(var78);
    com.google.javascript.rhino.Node var80 = var69.srcref(var79);
    com.google.javascript.rhino.jstype.ObjectType var81 = null;
    com.google.javascript.rhino.jstype.ObjectType var82 = var65.createObjectType("", var79, var81);
    boolean var83 = var82.isArrayType();
    boolean var84 = var82.isNominalType();
    com.google.javascript.rhino.jstype.FunctionType var85 = null;
    com.google.javascript.rhino.jstype.FunctionType var86 = null;
    var22.applyDelegateRelationship(var42, var62, var82, var85, var86);
    java.util.Set var88 = var82.getPropertyNames();
    com.google.javascript.rhino.jstype.JSType[] var89 = new com.google.javascript.rhino.jstype.JSType[] { var82};
    com.google.javascript.rhino.jstype.FunctionType var90 = var1.createConstructorType((com.google.javascript.rhino.jstype.JSType)var20, var89);
    com.google.javascript.rhino.jstype.FunctionType var91 = var90.cloneWithoutArrowType();
    java.lang.Iterable var92 = var91.getAllImplementedInterfaces();
    com.google.javascript.rhino.jstype.JSType var93 = var91.getReturnType();
    com.google.javascript.rhino.jstype.ObjectType var94 = var91.getPrototype();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code
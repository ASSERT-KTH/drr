
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
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.doNode(var0, var1);
// 
//   }

  public void test2() {}
//   public void test2() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
//     com.google.javascript.rhino.jstype.JSType var3 = null;
//     com.google.javascript.rhino.jstype.JSType[] var4 = new com.google.javascript.rhino.jstype.JSType[] { var3};
//     com.google.javascript.rhino.jstype.JSType var5 = var2.createUnionType(var4);
// 
//   }

  public void test3() {}
//   public void test3() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
//     com.google.javascript.rhino.jstype.JSTypeNative var3 = null;
//     com.google.javascript.rhino.jstype.JSTypeNative[] var4 = new com.google.javascript.rhino.jstype.JSTypeNative[] { var3};
//     com.google.javascript.rhino.jstype.JSType var5 = var2.createUnionType(var4);
// 
//   }

  public void test4() {}
//   public void test4() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.sheq(var0, var1);
// 
//   }

  public void test5() {}
//   public void test5() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
//     com.google.javascript.rhino.jstype.JSType var4 = null;
//     var2.unregisterPropertyOnType("", var4);
//     com.google.javascript.rhino.jstype.JSType var6 = null;
//     com.google.javascript.rhino.jstype.JSType var8 = null;
//     com.google.javascript.rhino.jstype.JSType[] var9 = new com.google.javascript.rhino.jstype.JSType[] { var8};
//     com.google.javascript.rhino.jstype.FunctionType var10 = var2.createFunctionType(var6, true, var9);
// 
//   }

  public void test6() {}
//   public void test6() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.add(var0, var1);
// 
//   }

  public void test7() {}
//   public void test7() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }
// 
// 
//     java.io.File var0 = null;
//     com.google.javascript.jscomp.SourceFile var1 = com.google.javascript.jscomp.SourceFile.fromFile(var0);
// 
//   }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.overwriteDeclaredType("", var4);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.google.javascript.rhino.Node var3 = new com.google.javascript.rhino.Node(0, 100, 1);
    java.lang.Appendable var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.appendStringTree(var4);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
    boolean var1 = var0.isCatch();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.script();
    boolean var3 = var2.isCatch();
    boolean var4 = var2.isDec();
    com.google.javascript.rhino.Node[] var5 = new com.google.javascript.rhino.Node[] { var2};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.switchNode(var0, var5);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test11() {}
//   public void test11() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile var0 = null;
//     com.google.javascript.jscomp.CompilerInput var2 = new com.google.javascript.jscomp.CompilerInput(var0, true);
// 
//   }

  public void test12() {}
//   public void test12() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }
// 
// 
//     java.io.InputStream var2 = null;
//     com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromInputStream("hi!", "hi!", var2);
// 
//   }

  public void test13() {}
//   public void test13() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var1 = new com.google.javascript.jscomp.CompilerInput(var0);
// 
//   }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    boolean var1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.google.javascript.jscomp.CheckLevel[] var0 = com.google.javascript.jscomp.CheckLevel.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test16() {}
//   public void test16() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
//     com.google.javascript.rhino.jstype.JSTypeNative var3 = null;
//     com.google.javascript.rhino.jstype.ObjectType var4 = var2.getNativeObjectType(var3);
// 
//   }

  public void test17() {}
//   public void test17() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "");
// 
//   }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var1 = com.google.javascript.jscomp.NodeUtil.newExpr(var0);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    var2.unregisterPropertyOnType("", var4);
    com.google.javascript.rhino.jstype.JSType var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.overwriteDeclaredType("", var7);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test20() {}
//   public void test20() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }
// 
// 
//     com.google.javascript.jscomp.CodingConvention var0 = null;
//     com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention(var0);
//     java.lang.String var2 = var1.getExportPropertyFunction();
// 
//   }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.script();
    boolean var4 = var3.isCatch();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.script();
    boolean var6 = var5.isCatch();
    boolean var7 = var5.isDec();
    var3.addChildrenToBack(var5);
    com.google.javascript.rhino.jstype.JSType var9 = var5.getJSType();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.script();
    boolean var11 = var10.isCatch();
    boolean var12 = var10.isDec();
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.script();
    boolean var14 = var13.isCatch();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var17 = new com.google.javascript.rhino.Node(1, var2, var5, var10, var13, 1, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.Node.newNumber(100.0d);
    var1.setSourceEncodedPositionForTree(10);
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.script();
    boolean var5 = var4.isCatch();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.script();
    boolean var7 = var6.isCatch();
    boolean var8 = var6.isDec();
    var4.addChildrenToBack(var6);
    com.google.javascript.rhino.jstype.JSType var10 = var6.getJSType();
    com.google.javascript.rhino.Node var11 = var6.getParent();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.label(var1, var11);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.google.javascript.jscomp.CodingConvention var0 = null;
    com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention(var0);
    com.google.javascript.rhino.Node var5 = new com.google.javascript.rhino.Node(0, 100, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var1.isOptionalParameter(var5);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test24() {}
//   public void test24() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }
// 
// 
//     com.google.javascript.jscomp.CodingConvention var0 = null;
//     com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention(var0);
//     boolean var4 = var1.isExported("hi!", false);
// 
//   }

  public void test25() {}
//   public void test25() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.script();
//     boolean var2 = var1.isAnd();
//     boolean var3 = var1.isDec();
//     boolean var4 = var1.isExprResult();
//     com.google.javascript.rhino.Node var5 = null;
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.script();
//     boolean var7 = var6.isCatch();
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.script();
//     boolean var9 = var8.isCatch();
//     boolean var10 = var8.isDec();
//     var6.addChildrenToBack(var8);
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.script();
//     boolean var13 = var12.isCatch();
//     boolean var14 = var12.isDec();
//     var8.addChildrenToBack(var12);
//     com.google.javascript.rhino.Node var18 = new com.google.javascript.rhino.Node(0, var1, var5, var8, 100, 0);
// 
//   }

  public void test26() {}
//   public void test26() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.exprResult(var0);
// 
//   }

  public void test27() {}
//   public void test27() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }
// 
// 
//     com.google.javascript.jscomp.CodingConvention var0 = null;
//     com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention(var0);
//     java.util.Collection var2 = var1.getAssertionFunctions();
// 
//   }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.lang.Object var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.connect(var1, (java.lang.Object)(-1), (java.lang.Object)0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.Node.newNumber(100.0d);
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.script();
    boolean var4 = var3.isAnd();
    boolean var5 = var3.isDec();
    boolean var6 = var3.isExprResult();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.continueNode();
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.script();
    boolean var9 = var8.isCatch();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.script();
    boolean var11 = var10.isCatch();
    boolean var12 = var10.isDec();
    var8.addChildrenToBack(var10);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.script();
    boolean var15 = var14.isCatch();
    boolean var16 = var14.isDec();
    var10.addChildrenToBack(var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var20 = new com.google.javascript.rhino.Node(10, var2, var3, var7, var10, (-1), 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test30() {}
//   public void test30() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile var0 = null;
//     com.google.javascript.jscomp.CompilerInput var1 = new com.google.javascript.jscomp.CompilerInput(var0);
// 
//   }

  public void test31() {}
//   public void test31() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
//     com.google.javascript.rhino.jstype.JSType[] var3 = null;
//     com.google.javascript.rhino.Node var4 = var2.createOptionalParameters(var3);
// 
//   }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("hi!");
    boolean var2 = var1.isDo();
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
    assertTrue(var2 == false);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
    boolean var1 = var0.isAnd();
    boolean var2 = var0.isDec();
    boolean var3 = var0.isExprResult();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.neg(var0);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test34() {}
//   public void test34() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.Node.newNumber(100.0d);
//     boolean var2 = var1.isFalse();
//     com.google.javascript.rhino.Node var3 = null;
//     var1.removeChild(var3);
// 
//   }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.lang.Iterable var1 = var0.getDirectedGraphNodes();
    com.google.javascript.rhino.ErrorReporter var2 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2, false);
    java.lang.Iterable var6 = var4.getEachReferenceTypeWithProperty("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var7 = var0.getOutEdges((java.lang.Object)var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    com.google.javascript.rhino.jstype.JSType var0 = null;
    com.google.javascript.rhino.jstype.TemplateType var1 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test37() {}
//   public void test37() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
//     java.lang.Iterable var4 = var2.getEachReferenceTypeWithProperty("");
//     com.google.javascript.rhino.jstype.ObjectType var5 = null;
//     com.google.javascript.rhino.jstype.JSType var6 = null;
//     java.util.List var7 = null;
//     com.google.javascript.rhino.jstype.JSType var8 = var2.createFunctionType(var5, var6, var7);
// 
//   }

  public void test38() {}
//   public void test38() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }
// 
// 
//     java.util.List var0 = null;
//     com.google.javascript.jscomp.ComposeWarningsGuard var1 = new com.google.javascript.jscomp.ComposeWarningsGuard(var0);
// 
//   }

  public void test39() {}
//   public void test39() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
//     var0.popNodeAnnotations();
// 
//   }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    java.lang.Object var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = com.google.javascript.rhino.ScriptRuntime.getMessage1("", var1);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.VariableRenamingPolicy var1 = com.google.javascript.jscomp.VariableRenamingPolicy.valueOf("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var1 = com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.valueOf("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
    com.google.javascript.rhino.jstype.JSType var3 = null;
    com.google.javascript.rhino.jstype.JSType var5 = var2.getGreatestSubtypeWithProperty(var3, "hi!");
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newNumber(100.0d);
    boolean var9 = var8.isFalse();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.FunctionType var10 = var2.createInterfaceType("hi!", var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    var2.unregisterPropertyOnType("", var4);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.script();
    boolean var7 = var6.isCatch();
    var6.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.script();
    boolean var12 = var6.isEquivalentTo(var11);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.script();
    boolean var14 = var13.isAnd();
    int var15 = var13.getSourceOffset();
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.script();
    boolean var17 = var16.isAnd();
    boolean var18 = var16.isDec();
    com.google.javascript.rhino.Node var19 = var13.clonePropsFrom(var16);
    com.google.javascript.rhino.Node var20 = var11.copyInformationFrom(var13);
    com.google.javascript.rhino.jstype.StaticScope var22 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.JSType var23 = var2.createFromTypeNodes(var20, "hi!", var22);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test45() {}
//   public void test45() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.script();
//     boolean var2 = var1.isCatch();
//     var1.putIntProp((-1), 0);
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.script();
//     boolean var7 = var1.isEquivalentTo(var6);
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newNumber(100.0d);
//     com.google.javascript.rhino.Node var10 = null;
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.script();
//     boolean var12 = var11.isCatch();
//     com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.script();
//     boolean var14 = var13.isCatch();
//     boolean var15 = var13.isDec();
//     var11.addChildrenToBack(var13);
//     com.google.javascript.rhino.jstype.JSType var17 = var13.getJSType();
//     com.google.javascript.rhino.Node var18 = var13.getParent();
//     com.google.javascript.rhino.Node var19 = new com.google.javascript.rhino.Node(10, var6, var9, var10, var13);
// 
//   }

  public void test46() {}
//   public void test46() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }
// 
// 
//     com.google.javascript.jscomp.CodingConvention var0 = null;
//     com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention(var0);
//     boolean var3 = var1.isPrivate("hi!");
//     com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.block();
//     int var5 = var4.getLength();
//     com.google.javascript.jscomp.CodingConvention.DelegateRelationship var6 = var1.getDelegateRelationship(var4);
// 
//   }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
    com.google.javascript.rhino.jstype.JSType var3 = null;
    com.google.javascript.rhino.jstype.JSType var5 = var2.getGreatestSubtypeWithProperty(var3, "hi!");
    com.google.javascript.rhino.jstype.JSType var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.overwriteDeclaredType("hi!", var7);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test48() {}
//   public void test48() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }
// 
// 
//     com.google.javascript.jscomp.CodingConvention var0 = null;
//     com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention(var0);
//     com.google.javascript.rhino.Node var2 = null;
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.script();
//     boolean var4 = var3.isAnd();
//     boolean var5 = var3.isDec();
//     boolean var6 = var3.isExprResult();
//     java.lang.String var7 = var1.extractClassNameIfRequire(var2, var3);
// 
//   }

  public void test49() {}
//   public void test49() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }
// 
// 
//     com.google.javascript.jscomp.AbstractCompiler var0 = null;
//     com.google.javascript.jscomp.NodeTraversal.Callback var1 = null;
//     com.google.javascript.rhino.Node[] var2 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots(var0, var1, var2);
// 
//   }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
    java.lang.Iterable var4 = var2.getEachReferenceTypeWithProperty("");
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newNumber(100.0d);
    boolean var8 = var7.isFalse();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.script();
    boolean var10 = var9.isAnd();
    int var11 = var9.getSourceOffset();
    com.google.javascript.rhino.ErrorReporter var12 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var12, false);
    com.google.javascript.rhino.jstype.ObjectType var15 = null;
    com.google.javascript.rhino.jstype.ObjectType var16 = var14.createObjectType(var15);
    boolean var17 = var16.isString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.FunctionType var18 = var2.createConstructorType("", var7, var9, (com.google.javascript.rhino.jstype.JSType)var16);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = com.google.javascript.rhino.ScriptRuntime.getMessage0("");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }


    boolean var1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test53() {}
//   public void test53() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }
// 
// 
//     com.google.javascript.jscomp.WarningsGuard var0 = null;
//     com.google.javascript.jscomp.WarningsGuard[] var1 = new com.google.javascript.jscomp.WarningsGuard[] { var0};
//     com.google.javascript.jscomp.ComposeWarningsGuard var2 = new com.google.javascript.jscomp.ComposeWarningsGuard(var1);
// 
//   }

  public void test54() {}
//   public void test54() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.continueNode();
//     java.util.Set var1 = null;
//     var0.setDirectives(var1);
//     boolean var3 = var0.isScript();
//     com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.script();
//     boolean var5 = var4.isCatch();
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.script();
//     boolean var7 = var6.isCatch();
//     boolean var8 = var6.isDec();
//     var4.addChildrenToBack(var6);
//     com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.continueNode();
//     int var12 = var10.getIntProp(0);
//     com.google.javascript.rhino.Node var13 = var6.copyInformationFromForTree(var10);
//     var0.removeChild(var6);
// 
//   }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
    boolean var1 = var0.isAnd();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setQuotedString();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.JSTypeNative var1 = com.google.javascript.rhino.jstype.JSTypeNative.valueOf("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.continueNode();
    java.util.Set var2 = null;
    var1.setDirectives(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = com.google.javascript.rhino.ScriptRuntime.getMessage1("", (java.lang.Object)var2);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }


    java.lang.String var2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "module$"+ "'", var2.equals("module$"));

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }


    com.google.javascript.jscomp.DiagnosticGroups var0 = new com.google.javascript.jscomp.DiagnosticGroups();
    com.google.javascript.jscomp.DiagnosticGroup var2 = var0.forName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
    boolean var1 = var0.isAnd();
    boolean var2 = var0.isDec();
    boolean var3 = var0.isExprResult();
    com.google.javascript.rhino.JSDocInfo var4 = var0.getJSDocInfo();
    com.google.javascript.rhino.InputId var5 = com.google.javascript.jscomp.NodeUtil.getInputId(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.regexp(var0);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test61() {}
//   public void test61() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
//     java.lang.Iterable var1 = var0.getDirectedGraphNodes();
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.script();
//     boolean var3 = var2.isAnd();
//     int var4 = var2.getSourceOffset();
//     com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.script();
//     boolean var6 = var5.isAnd();
//     boolean var7 = var5.isDec();
//     com.google.javascript.rhino.Node var8 = var2.clonePropsFrom(var5);
//     java.util.Iterator var9 = var0.getNeighborNodesIterator((java.lang.Object)var2);
// 
//   }

  public void test62() {}
//   public void test62() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.rhino.InputId var2 = new com.google.javascript.rhino.InputId("");
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var0, var2, true);
//     var4.clearAst();
// 
//   }

  public void test63() {}
//   public void test63() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.rhino.InputId var2 = new com.google.javascript.rhino.InputId("");
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var0, var2, true);
//     java.lang.String var5 = var4.getCode();
// 
//   }

  public void test64() {}
//   public void test64() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
//     boolean var4 = var2.isForwardDeclaredType("");
//     com.google.javascript.rhino.ErrorReporter var5 = var2.getErrorReporter();
//     com.google.javascript.rhino.ErrorReporter var6 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var6, false);
//     com.google.javascript.rhino.jstype.ObjectType var9 = null;
//     com.google.javascript.rhino.jstype.ObjectType var10 = var8.createObjectType(var9);
//     com.google.javascript.rhino.ErrorReporter var11 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11, false);
//     com.google.javascript.rhino.jstype.JSType var14 = null;
//     com.google.javascript.rhino.jstype.JSType var16 = var13.getGreatestSubtypeWithProperty(var14, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var17 = var16.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var18 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18, false);
//     com.google.javascript.rhino.jstype.ObjectType var21 = null;
//     com.google.javascript.rhino.jstype.ObjectType var22 = var20.createObjectType(var21);
//     boolean var23 = var22.isString();
//     var16.matchConstraint(var22);
//     com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.script();
//     boolean var26 = var25.isCatch();
//     var25.putIntProp((-1), 0);
//     com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.script();
//     boolean var31 = var25.isEquivalentTo(var30);
//     com.google.javascript.rhino.ErrorReporter var32 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32, false);
//     com.google.javascript.rhino.jstype.JSType var35 = null;
//     com.google.javascript.rhino.jstype.JSType var37 = var34.getGreatestSubtypeWithProperty(var35, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var38 = var37.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var39 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var39, false);
//     com.google.javascript.rhino.jstype.ObjectType var42 = null;
//     com.google.javascript.rhino.jstype.ObjectType var43 = var41.createObjectType(var42);
//     boolean var44 = var43.isString();
//     var37.matchConstraint(var43);
//     var25.setJSType(var37);
//     boolean var47 = var37.isNumber();
//     com.google.javascript.rhino.jstype.JSType var48 = var16.getGreatestSubtype(var37);
//     java.util.List var49 = null;
//     com.google.javascript.rhino.jstype.JSType var50 = var2.createFunctionTypeWithVarArgs(var9, var48, var49);
// 
//   }

  public void test65() {}
//   public void test65() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }
// 
// 
//     com.google.javascript.jscomp.JSModule var0 = null;
//     com.google.javascript.jscomp.JSModule[] var1 = new com.google.javascript.jscomp.JSModule[] { var0};
//     com.google.javascript.jscomp.JSModuleGraph var2 = new com.google.javascript.jscomp.JSModuleGraph(var1);
// 
//   }

  public void test66() {}
//   public void test66() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }
// 
// 
//     com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
//     boolean var2 = var0.isConstant("");
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.script();
//     boolean var4 = var3.isCatch();
//     var3.putIntProp((-1), 0);
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.script();
//     boolean var9 = var3.isEquivalentTo(var8);
//     com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.script();
//     boolean var11 = var10.isAnd();
//     int var12 = var10.getSourceOffset();
//     com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.script();
//     boolean var14 = var13.isAnd();
//     boolean var15 = var13.isDec();
//     com.google.javascript.rhino.Node var16 = var10.clonePropsFrom(var13);
//     com.google.javascript.rhino.Node var17 = var8.copyInformationFrom(var10);
//     java.lang.String var18 = var0.getSingletonGetterClassName(var10);
// 
//   }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
    boolean var1 = var0.isAnd();
    int var2 = var0.getSourceOffset();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setString("");
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test68() {}
//   public void test68() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.rhino.InputId var2 = new com.google.javascript.rhino.InputId("");
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var0, var2, true);
//     com.google.javascript.jscomp.AbstractCompiler var5 = null;
//     com.google.javascript.rhino.Node var6 = var4.getAstRoot(var5);
// 
//   }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
    boolean var4 = var2.isForwardDeclaredType("");
    com.google.javascript.rhino.ErrorReporter var5 = var2.getErrorReporter();
    var2.clearTemplateTypeNames();
    com.google.javascript.rhino.Node var11 = new com.google.javascript.rhino.Node(0, 100, 1);
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.script();
    boolean var13 = var12.isCatch();
    boolean var14 = var12.isDec();
    com.google.javascript.rhino.Node var15 = var12.getLastChild();
    com.google.javascript.rhino.ErrorReporter var16 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var16, false);
    com.google.javascript.rhino.jstype.JSType var19 = null;
    com.google.javascript.rhino.jstype.JSType var21 = var18.getGreatestSubtypeWithProperty(var19, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var22 = var21.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var23 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var23, false);
    com.google.javascript.rhino.jstype.ObjectType var26 = null;
    com.google.javascript.rhino.jstype.ObjectType var27 = var25.createObjectType(var26);
    boolean var28 = var27.isString();
    var21.matchConstraint(var27);
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.script();
    boolean var33 = var32.isCatch();
    var32.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.script();
    boolean var38 = var32.isEquivalentTo(var37);
    com.google.javascript.rhino.ErrorReporter var39 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var39, false);
    com.google.javascript.rhino.jstype.JSType var42 = null;
    com.google.javascript.rhino.jstype.JSType var44 = var41.getGreatestSubtypeWithProperty(var42, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var45 = var44.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var46 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var46, false);
    com.google.javascript.rhino.jstype.ObjectType var49 = null;
    com.google.javascript.rhino.jstype.ObjectType var50 = var48.createObjectType(var49);
    boolean var51 = var50.isString();
    var44.matchConstraint(var50);
    var32.setJSType(var44);
    boolean var54 = var44.isNumber();
    com.google.javascript.rhino.jstype.JSType var55 = var44.restrictByNotNullOrUndefined();
    com.google.javascript.rhino.jstype.SimpleSlot var57 = new com.google.javascript.rhino.jstype.SimpleSlot("", var55, true);
    com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.script();
    boolean var59 = var58.isCatch();
    var58.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var63 = com.google.javascript.rhino.IR.script();
    boolean var64 = var58.isEquivalentTo(var63);
    com.google.javascript.rhino.ErrorReporter var65 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var65, false);
    com.google.javascript.rhino.jstype.JSType var68 = null;
    com.google.javascript.rhino.jstype.JSType var70 = var67.getGreatestSubtypeWithProperty(var68, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var71 = var70.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var72 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var72, false);
    com.google.javascript.rhino.jstype.ObjectType var75 = null;
    com.google.javascript.rhino.jstype.ObjectType var76 = var74.createObjectType(var75);
    boolean var77 = var76.isString();
    var70.matchConstraint(var76);
    var58.setJSType(var70);
    int var80 = var58.getSourcePosition();
    boolean var81 = var27.defineSynthesizedProperty("", var55, var58);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.FunctionType var82 = var2.createConstructorType("module$", var11, var12, var55);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == true);

  }

  public void test70() {}
//   public void test70() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var4 = null;
//     java.lang.String[] var6 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var7 = com.google.javascript.jscomp.JSError.make("", 100, (-1), var3, var4, var6);
// 
//   }

  public void test71() {}
//   public void test71() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var4 = null;
//     java.lang.String[] var6 = new java.lang.String[] { "module$"};
//     com.google.javascript.jscomp.JSError var7 = com.google.javascript.jscomp.JSError.make("", 100, 0, var3, var4, var6);
// 
//   }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.lang.Iterable var1 = var0.getDirectedGraphNodes();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var3 = var0.getDirectedSuccNodes(var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
    boolean var1 = var0.isAnd();
    int var2 = var0.getSourceOffset();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.script();
    boolean var4 = var3.isAnd();
    boolean var5 = var3.isDec();
    com.google.javascript.rhino.Node var6 = var0.clonePropsFrom(var3);
    com.google.javascript.rhino.JSTypeExpression var8 = new com.google.javascript.rhino.JSTypeExpression(var0, "hi!");
    com.google.javascript.rhino.JSTypeExpression var9 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(var8);
    com.google.javascript.rhino.ErrorReporter var10 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var10, false);
    com.google.javascript.rhino.jstype.ObjectType var13 = null;
    com.google.javascript.rhino.jstype.ObjectType var14 = var12.createObjectType(var13);
    boolean var15 = var14.isString();
    com.google.javascript.rhino.ErrorReporter var16 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var16, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.JSType var19 = var8.evaluate((com.google.javascript.rhino.jstype.StaticScope)var14, var18);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test74() {}
//   public void test74() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }
// 
// 
//     com.google.javascript.jscomp.SourceExcerptProvider var0 = null;
//     com.google.javascript.jscomp.LightweightMessageFormatter var1 = new com.google.javascript.jscomp.LightweightMessageFormatter(var0);
// 
//   }

  public void test75() {}
//   public void test75() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.rhino.InputId var2 = new com.google.javascript.rhino.InputId("");
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var0, var2, true);
//     com.google.javascript.jscomp.SourceFile var5 = null;
//     var4.setSourceFile(var5);
// 
//   }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }


    com.google.javascript.jscomp.AstValidator var0 = new com.google.javascript.jscomp.AstValidator();
    com.google.javascript.rhino.ErrorReporter var1 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var1, false);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    com.google.javascript.rhino.jstype.JSType var6 = var3.getGreatestSubtypeWithProperty(var4, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var7 = var6.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8, false);
    com.google.javascript.rhino.jstype.ObjectType var11 = null;
    com.google.javascript.rhino.jstype.ObjectType var12 = var10.createObjectType(var11);
    boolean var13 = var12.isString();
    var6.matchConstraint(var12);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.script();
    boolean var18 = var17.isCatch();
    var17.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.script();
    boolean var23 = var17.isEquivalentTo(var22);
    com.google.javascript.rhino.ErrorReporter var24 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24, false);
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.rhino.jstype.JSType var29 = var26.getGreatestSubtypeWithProperty(var27, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var30 = var29.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var31 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var31, false);
    com.google.javascript.rhino.jstype.ObjectType var34 = null;
    com.google.javascript.rhino.jstype.ObjectType var35 = var33.createObjectType(var34);
    boolean var36 = var35.isString();
    var29.matchConstraint(var35);
    var17.setJSType(var29);
    boolean var39 = var29.isNumber();
    com.google.javascript.rhino.jstype.JSType var40 = var29.restrictByNotNullOrUndefined();
    com.google.javascript.rhino.jstype.SimpleSlot var42 = new com.google.javascript.rhino.jstype.SimpleSlot("", var40, true);
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.script();
    boolean var44 = var43.isCatch();
    var43.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.script();
    boolean var49 = var43.isEquivalentTo(var48);
    com.google.javascript.rhino.ErrorReporter var50 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var50, false);
    com.google.javascript.rhino.jstype.JSType var53 = null;
    com.google.javascript.rhino.jstype.JSType var55 = var52.getGreatestSubtypeWithProperty(var53, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var56 = var55.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var57 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var57, false);
    com.google.javascript.rhino.jstype.ObjectType var60 = null;
    com.google.javascript.rhino.jstype.ObjectType var61 = var59.createObjectType(var60);
    boolean var62 = var61.isString();
    var55.matchConstraint(var61);
    var43.setJSType(var55);
    int var65 = var43.getSourcePosition();
    boolean var66 = var12.defineSynthesizedProperty("", var40, var43);
    com.google.javascript.rhino.Node var67 = com.google.javascript.rhino.IR.script();
    boolean var68 = var67.isAnd();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.process(var43, var67);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.PropertyRenamingPolicy var1 = com.google.javascript.jscomp.PropertyRenamingPolicy.valueOf("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test78() {}
//   public void test78() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
//     boolean var1 = var0.isCatch();
//     var0.putIntProp((-1), 0);
//     com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.script();
//     boolean var6 = var0.isEquivalentTo(var5);
//     com.google.javascript.rhino.ErrorReporter var7 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7, false);
//     com.google.javascript.rhino.jstype.JSType var10 = null;
//     com.google.javascript.rhino.jstype.JSType var12 = var9.getGreatestSubtypeWithProperty(var10, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var13 = var12.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var14 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var14, false);
//     com.google.javascript.rhino.jstype.ObjectType var17 = null;
//     com.google.javascript.rhino.jstype.ObjectType var18 = var16.createObjectType(var17);
//     boolean var19 = var18.isString();
//     var12.matchConstraint(var18);
//     var0.setJSType(var12);
//     boolean var22 = var12.isNumber();
//     com.google.javascript.rhino.jstype.JSType var23 = var12.restrictByNotNullOrUndefined();
//     com.google.javascript.rhino.jstype.JSType var24 = null;
//     com.google.javascript.rhino.jstype.JSType.TypePair var25 = var12.getTypesUnderInequality(var24);
// 
//   }

  public void test79() {}
//   public void test79() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.rhino.InputId var2 = new com.google.javascript.rhino.InputId("");
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var0, var2, true);
//     com.google.javascript.rhino.InputId var5 = var4.getInputId();
//     int var7 = var4.getLineOffset(0);
// 
//   }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
    boolean var1 = var0.isCatch();
    var0.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.script();
    boolean var6 = var0.isEquivalentTo(var5);
    com.google.javascript.rhino.ErrorReporter var7 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7, false);
    com.google.javascript.rhino.jstype.JSType var10 = null;
    com.google.javascript.rhino.jstype.JSType var12 = var9.getGreatestSubtypeWithProperty(var10, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var13 = var12.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var14 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var14, false);
    com.google.javascript.rhino.jstype.ObjectType var17 = null;
    com.google.javascript.rhino.jstype.ObjectType var18 = var16.createObjectType(var17);
    boolean var19 = var18.isString();
    var12.matchConstraint(var18);
    var0.setJSType(var12);
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.script();
    boolean var23 = var22.isAnd();
    boolean var24 = var22.isDec();
    com.google.javascript.rhino.Node var25 = null;
    var0.addChildAfter(var22, var25);
    com.google.javascript.rhino.Node var27 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.sheq(var22, var27);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.continueNode();
    java.util.Set var1 = null;
    var0.setDirectives(var1);
    boolean var3 = var0.isDebugger();
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.script();
    boolean var5 = var4.isCatch();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.script();
    boolean var7 = var6.isCatch();
    boolean var8 = var6.isDec();
    var4.addChildrenToBack(var6);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.continueNode();
    int var12 = var10.getIntProp(0);
    com.google.javascript.rhino.Node var13 = var6.copyInformationFromForTree(var10);
    boolean var14 = var10.isLabelName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.sub(var0, var10);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test82() {}
//   public void test82() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }
// 
// 
//     java.util.List var0 = null;
//     com.google.javascript.jscomp.JSModuleGraph var1 = new com.google.javascript.jscomp.JSModuleGraph(var0);
// 
//   }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = com.google.javascript.rhino.ScriptRuntime.escapeString("", '#');
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
    boolean var1 = var0.isAnd();
    int var2 = var0.getSourceOffset();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.script();
    boolean var4 = var3.isAnd();
    boolean var5 = var3.isDec();
    com.google.javascript.rhino.Node var6 = var0.clonePropsFrom(var3);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.script();
    boolean var8 = var7.isCatch();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.script();
    boolean var10 = var9.isCatch();
    boolean var11 = var9.isDec();
    var7.addChildrenToBack(var9);
    com.google.javascript.rhino.jstype.StaticSourceFile var13 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var9);
    int var14 = var9.getChildCount();
    com.google.javascript.rhino.Node var18 = new com.google.javascript.rhino.Node(0, 100, 0);
    com.google.javascript.rhino.Node var19 = var18.getParent();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.replaceChildAfter(var9, var18);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
    boolean var4 = var2.isForwardDeclaredType("");
    var2.incrementGeneration();
    com.google.javascript.rhino.ErrorReporter var6 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var6, false);
    com.google.javascript.rhino.jstype.ObjectType var9 = null;
    com.google.javascript.rhino.jstype.ObjectType var10 = var8.createObjectType(var9);
    com.google.javascript.rhino.ErrorReporter var11 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11, false);
    com.google.javascript.rhino.jstype.ObjectType var14 = null;
    com.google.javascript.rhino.jstype.ObjectType var15 = var13.createObjectType(var14);
    boolean var16 = var15.isString();
    boolean var17 = var2.resetImplicitPrototype((com.google.javascript.rhino.jstype.JSType)var9, var15);
    com.google.javascript.rhino.ErrorReporter var19 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var19, false);
    com.google.javascript.rhino.jstype.ObjectType var22 = null;
    com.google.javascript.rhino.jstype.ObjectType var23 = var21.createObjectType(var22);
    boolean var24 = var23.isString();
    com.google.javascript.rhino.JSDocInfo var25 = null;
    var23.setJSDocInfo(var25);
    com.google.javascript.rhino.JSDocInfo var27 = var23.getJSDocInfo();
    boolean var28 = var2.declareType("", (com.google.javascript.rhino.jstype.JSType)var23);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.script();
    boolean var31 = var30.isCatch();
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.script();
    boolean var33 = var32.isCatch();
    boolean var34 = var32.isDec();
    var30.addChildrenToBack(var32);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.continueNode();
    int var38 = var36.getIntProp(0);
    com.google.javascript.rhino.Node var39 = var32.copyInformationFromForTree(var36);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.FunctionType var40 = var2.createInterfaceType("None", var36);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = com.google.javascript.rhino.ScriptRuntime.getMessage1("", (java.lang.Object)(byte)(-1));
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }


    boolean var1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("module$");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test88() {}
//   public void test88() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.rhino.InputId var2 = new com.google.javascript.rhino.InputId("");
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var0, var2, true);
//     com.google.javascript.rhino.InputId var5 = var4.getInputId();
//     com.google.javascript.jscomp.AbstractCompiler var6 = null;
//     com.google.javascript.rhino.Node var7 = var4.getAstRoot(var6);
// 
//   }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.lang.Iterable var1 = var0.getDirectedGraphNodes();
    com.google.javascript.jscomp.GoogleCodingConvention var2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    com.google.javascript.rhino.Node var4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode((com.google.javascript.jscomp.CodingConvention)var2, "hi!");
    java.lang.Object var5 = new java.lang.Object();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.disconnectInDirection((java.lang.Object)var2, var5);
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

  }

  public void test90() {}
//   public void test90() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.script();
//     boolean var2 = var1.isAnd();
//     boolean var3 = var1.isDec();
//     boolean var4 = var1.isExprResult();
//     int var5 = var1.getSourceOffset();
//     com.google.javascript.rhino.Node var6 = null;
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.script();
//     boolean var8 = var7.isAnd();
//     boolean var9 = var7.isDec();
//     boolean var10 = var7.isExprResult();
//     int var11 = var7.getSourceOffset();
//     com.google.javascript.rhino.Node var14 = new com.google.javascript.rhino.Node(1, var1, var6, var7, (-1), 0);
// 
//   }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }


    com.google.javascript.jscomp.AnonymousFunctionNamingPolicy[] var0 = com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.block();
    int var1 = var0.getLength();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.returnNode(var0);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
    boolean var1 = var0.isCatch();
    var0.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.script();
    boolean var6 = var0.isEquivalentTo(var5);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.script();
    boolean var8 = var7.isCatch();
    var7.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.script();
    boolean var13 = var7.isEquivalentTo(var12);
    com.google.javascript.rhino.ErrorReporter var14 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var14, false);
    com.google.javascript.rhino.jstype.JSType var17 = null;
    com.google.javascript.rhino.jstype.JSType var19 = var16.getGreatestSubtypeWithProperty(var17, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var20 = var19.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var21 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21, false);
    com.google.javascript.rhino.jstype.ObjectType var24 = null;
    com.google.javascript.rhino.jstype.ObjectType var25 = var23.createObjectType(var24);
    boolean var26 = var25.isString();
    var19.matchConstraint(var25);
    var7.setJSType(var19);
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.script();
    boolean var30 = var29.isAnd();
    boolean var31 = var29.isDec();
    com.google.javascript.rhino.Node var32 = null;
    var7.addChildAfter(var29, var32);
    com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.IR.script();
    boolean var35 = var34.isCatch();
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.script();
    boolean var37 = var36.isCatch();
    boolean var38 = var36.isDec();
    var34.addChildrenToBack(var36);
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.script();
    boolean var41 = var40.isCatch();
    boolean var42 = var40.isDec();
    var36.addChildrenToBack(var40);
    int var44 = var40.getLength();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addChildrenAfter(var29, var40);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);

  }

  public void test94() {}
//   public void test94() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.rhino.InputId var2 = new com.google.javascript.rhino.InputId("");
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var0, var2, true);
//     com.google.javascript.jscomp.CompilerInput var7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var4, "", true);
// 
//   }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }


    com.google.javascript.rhino.ErrorReporter var1 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var1, false);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    com.google.javascript.rhino.jstype.JSType var6 = var3.getGreatestSubtypeWithProperty(var4, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var7 = var6.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8, false);
    com.google.javascript.rhino.jstype.ObjectType var11 = null;
    com.google.javascript.rhino.jstype.ObjectType var12 = var10.createObjectType(var11);
    boolean var13 = var12.isString();
    var6.matchConstraint(var12);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.script();
    boolean var16 = var15.isCatch();
    var15.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.script();
    boolean var21 = var15.isEquivalentTo(var20);
    com.google.javascript.rhino.ErrorReporter var22 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var22, false);
    com.google.javascript.rhino.jstype.JSType var25 = null;
    com.google.javascript.rhino.jstype.JSType var27 = var24.getGreatestSubtypeWithProperty(var25, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var28 = var27.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var29 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29, false);
    com.google.javascript.rhino.jstype.ObjectType var32 = null;
    com.google.javascript.rhino.jstype.ObjectType var33 = var31.createObjectType(var32);
    boolean var34 = var33.isString();
    var27.matchConstraint(var33);
    var15.setJSType(var27);
    boolean var37 = var27.isNumber();
    com.google.javascript.rhino.jstype.JSType var38 = var6.getGreatestSubtype(var27);
    com.google.javascript.rhino.JSDocInfo var39 = var27.getJSDocInfo();
    com.google.javascript.rhino.jstype.SimpleSlot var41 = new com.google.javascript.rhino.jstype.SimpleSlot("None", var27, true);
    boolean var42 = var27.isDateType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("hi!");
    boolean var3 = var2.isDo();
    int var4 = var2.getLength();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.sheq(var0, var2);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test97() {}
//   public void test97() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }
// 
// 
//     com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
//     boolean var2 = var0.isConstant("");
//     com.google.javascript.rhino.Node var6 = new com.google.javascript.rhino.Node(0, 100, 1);
//     java.util.List var7 = var0.identifyTypeDeclarationCall(var6);
// 
//   }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
    boolean var1 = var0.isCatch();
    var0.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.script();
    boolean var6 = var0.isEquivalentTo(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var7 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.continueNode();
    java.util.Set var2 = null;
    var1.setDirectives(var2);
    boolean var4 = var1.isDebugger();
    com.google.javascript.rhino.Node[] var5 = new com.google.javascript.rhino.Node[] { var1};
    com.google.javascript.rhino.Node var8 = new com.google.javascript.rhino.Node((-1), var5, (-1), 0);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.script();
    boolean var10 = var9.isCatch();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.script();
    boolean var12 = var11.isCatch();
    boolean var13 = var11.isDec();
    var9.addChildrenToBack(var11);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.script();
    boolean var16 = var15.isCatch();
    boolean var17 = var15.isDec();
    var11.addChildrenToBack(var15);
    int var19 = var15.getLength();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.regexp(var8, var15);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test100() {}
//   public void test100() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }
// 
// 
//     com.google.javascript.jscomp.AbstractCompiler var0 = null;
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.script();
//     boolean var2 = var1.isCatch();
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.script();
//     boolean var4 = var3.isCatch();
//     boolean var5 = var3.isDec();
//     var1.addChildrenToBack(var3);
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.script();
//     boolean var8 = var7.isCatch();
//     boolean var9 = var7.isDec();
//     var3.addChildrenToBack(var7);
//     com.google.javascript.rhino.Node var11 = var3.getParent();
//     boolean var12 = var11.isAdd();
//     var11.removeProp(0);
//     boolean var15 = var11.isGetProp();
//     com.google.javascript.jscomp.NodeTraversal.Callback var16 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverse(var0, var11, var16);
// 
//   }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.Node.newNumber(0.0d);
    int var2 = var1.getCharno();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setSideEffectFlags(1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test102() {}
//   public void test102() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("hi!");
//     boolean var2 = var1.isDo();
//     com.google.javascript.rhino.JSTypeExpression var4 = new com.google.javascript.rhino.JSTypeExpression(var1, "module$");
//     com.google.javascript.rhino.Node var5 = null;
//     com.google.javascript.rhino.Node var6 = var1.srcrefTree(var5);
// 
//   }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.lang.Iterable var1 = var0.getDirectedGraphNodes();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.script();
    boolean var3 = var2.isCatch();
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.script();
    boolean var5 = var4.isCatch();
    boolean var6 = var4.isDec();
    var2.addChildrenToBack(var4);
    com.google.javascript.rhino.jstype.JSType var8 = var4.getJSType();
    com.google.javascript.rhino.Node var9 = var4.getParent();
    com.google.javascript.rhino.Node var10 = var4.getFirstChild();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var11 = var0.getOutEdges((java.lang.Object)var4);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
    boolean var1 = var0.isCatch();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.script();
    boolean var3 = var2.isCatch();
    boolean var4 = var2.isDec();
    var0.addChildrenToBack(var2);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.continueNode();
    int var8 = var6.getIntProp(0);
    com.google.javascript.rhino.Node var9 = var2.copyInformationFromForTree(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.var(var9);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test105() {}
//   public void test105() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
//     com.google.javascript.rhino.jstype.JSType var4 = null;
//     var2.unregisterPropertyOnType("", var4);
//     com.google.javascript.rhino.ErrorReporter var6 = var2.getErrorReporter();
//     java.util.List var7 = null;
//     com.google.javascript.rhino.Node var8 = var2.createParameters(var7);
// 
//   }

  public void test106() {}
//   public void test106() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }
// 
// 
//     com.google.javascript.jscomp.AbstractCompiler var0 = null;
//     com.google.javascript.jscomp.type.ReverseAbstractInterpreter var1 = null;
//     com.google.javascript.rhino.ErrorReporter var2 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2, false);
//     boolean var6 = var4.isForwardDeclaredType("");
//     var4.incrementGeneration();
//     com.google.javascript.jscomp.CheckLevel var8 = null;
//     com.google.javascript.jscomp.CheckLevel var9 = null;
//     com.google.javascript.jscomp.TypeCheck var10 = new com.google.javascript.jscomp.TypeCheck(var0, var1, var4, var8, var9);
// 
//   }

  public void test107() {}
//   public void test107() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }
// 
// 
//     java.util.List var0 = null;
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.paramList(var0);
// 
//   }

  public void test108() {}
//   public void test108() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.rhino.InputId var2 = new com.google.javascript.rhino.InputId("");
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var0, var2, true);
//     com.google.javascript.rhino.InputId var5 = var4.getInputId();
//     java.lang.String var6 = var4.toString();
//     java.lang.String var8 = var4.getLine(1);
// 
//   }

  public void test109() {}
//   public void test109() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
//     com.google.javascript.rhino.jstype.JSType var3 = null;
//     com.google.javascript.rhino.jstype.JSType var5 = var2.getGreatestSubtypeWithProperty(var3, "hi!");
//     com.google.javascript.rhino.jstype.JSType var6 = null;
//     java.util.List var7 = null;
//     com.google.javascript.rhino.jstype.FunctionType var8 = var2.createFunctionType(var6, var7);
// 
//   }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }


    com.google.javascript.rhino.Node var3 = new com.google.javascript.rhino.Node(0, 100, 1);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.string("hi!");
    boolean var6 = var5.isWhile();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.add(var3, var5);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
    boolean var1 = var0.isCatch();
    var0.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.script();
    boolean var6 = var0.isEquivalentTo(var5);
    com.google.javascript.rhino.ErrorReporter var7 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7, false);
    com.google.javascript.rhino.jstype.JSType var10 = null;
    com.google.javascript.rhino.jstype.JSType var12 = var9.getGreatestSubtypeWithProperty(var10, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var13 = var12.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var14 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var14, false);
    com.google.javascript.rhino.jstype.ObjectType var17 = null;
    com.google.javascript.rhino.jstype.ObjectType var18 = var16.createObjectType(var17);
    boolean var19 = var18.isString();
    var12.matchConstraint(var18);
    var0.setJSType(var12);
    boolean var22 = var0.isInc();
    com.google.javascript.jscomp.GoogleCodingConvention var24 = new com.google.javascript.jscomp.GoogleCodingConvention();
    com.google.javascript.rhino.Node var26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode((com.google.javascript.jscomp.CodingConvention)var24, "hi!");
    com.google.javascript.rhino.Node var30 = new com.google.javascript.rhino.Node(0, 100, 0);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.script();
    boolean var32 = var31.isCatch();
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.script();
    boolean var34 = var33.isCatch();
    boolean var35 = var33.isDec();
    var31.addChildrenToBack(var33);
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.script();
    boolean var38 = var37.isCatch();
    boolean var39 = var37.isDec();
    var33.addChildrenToBack(var37);
    com.google.javascript.rhino.Node var41 = var33.getParent();
    com.google.javascript.rhino.Node var42 = var41.cloneNode();
    com.google.javascript.rhino.Node var45 = new com.google.javascript.rhino.Node((-1), var26, var30, var41, 0, 0);
    com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.IR.script();
    boolean var47 = var46.isCatch();
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.script();
    boolean var49 = var48.isCatch();
    boolean var50 = var48.isDec();
    var46.addChildrenToBack(var48);
    com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.IR.script();
    boolean var53 = var52.isCatch();
    boolean var54 = var52.isDec();
    var48.addChildrenToBack(var52);
    com.google.javascript.rhino.Node var56 = var48.getParent();
    com.google.javascript.rhino.Node var57 = var56.cloneNode();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var59 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.lang.Iterable var60 = var59.getDirectedGraphNodes();
    com.google.javascript.rhino.Node var62 = com.google.javascript.rhino.Node.newNumber(100.0d);
    boolean var63 = var59.hasNode((java.lang.Object)var62);
    var56.putProp((-1), (java.lang.Object)var59);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addChildAfter(var30, var56);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }


    com.google.javascript.rhino.Node var3 = new com.google.javascript.rhino.Node(0, 100, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.defaultCase(var3);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test113() {}
//   public void test113() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }
// 
// 
//     java.util.List var0 = null;
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.block(var0);
// 
//   }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.rhino.ErrorReporter var1 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var1, false);
    com.google.javascript.rhino.jstype.ObjectType var4 = null;
    com.google.javascript.rhino.jstype.ObjectType var5 = var3.createObjectType(var4);
    boolean var6 = var5.isString();
    com.google.javascript.rhino.JSDocInfo var7 = null;
    var5.setJSDocInfo(var7);
    com.google.javascript.rhino.ErrorReporter var9 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var9, false);
    com.google.javascript.rhino.jstype.JSType var12 = null;
    com.google.javascript.rhino.jstype.JSType var14 = var11.getGreatestSubtypeWithProperty(var12, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var15 = var14.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var16 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var16, false);
    com.google.javascript.rhino.jstype.ObjectType var19 = null;
    com.google.javascript.rhino.jstype.ObjectType var20 = var18.createObjectType(var19);
    boolean var21 = var20.isString();
    var14.matchConstraint(var20);
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.script();
    boolean var24 = var23.isCatch();
    var23.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.script();
    boolean var29 = var23.isEquivalentTo(var28);
    com.google.javascript.rhino.ErrorReporter var30 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var30, false);
    com.google.javascript.rhino.jstype.JSType var33 = null;
    com.google.javascript.rhino.jstype.JSType var35 = var32.getGreatestSubtypeWithProperty(var33, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var36 = var35.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var37 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var37, false);
    com.google.javascript.rhino.jstype.ObjectType var40 = null;
    com.google.javascript.rhino.jstype.ObjectType var41 = var39.createObjectType(var40);
    boolean var42 = var41.isString();
    var35.matchConstraint(var41);
    var23.setJSType(var35);
    boolean var45 = var35.isNumber();
    com.google.javascript.rhino.jstype.JSType var46 = var14.getGreatestSubtype(var35);
    com.google.javascript.rhino.JSDocInfo var47 = var35.getJSDocInfo();
    com.google.javascript.rhino.jstype.JSType.TypePair var48 = var5.getTypesUnderEquality(var35);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var49 = var0.getDirectedPredNodes((java.lang.Object)var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test115() {}
//   public void test115() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test115"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
//     boolean var1 = var0.isCatch();
//     var0.putIntProp((-1), 0);
//     com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.script();
//     boolean var6 = var0.isEquivalentTo(var5);
//     com.google.javascript.rhino.ErrorReporter var7 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7, false);
//     com.google.javascript.rhino.jstype.JSType var10 = null;
//     com.google.javascript.rhino.jstype.JSType var12 = var9.getGreatestSubtypeWithProperty(var10, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var13 = var12.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var14 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var14, false);
//     com.google.javascript.rhino.jstype.ObjectType var17 = null;
//     com.google.javascript.rhino.jstype.ObjectType var18 = var16.createObjectType(var17);
//     boolean var19 = var18.isString();
//     var12.matchConstraint(var18);
//     var0.setJSType(var12);
//     boolean var22 = var12.isBooleanObjectType();
//     com.google.javascript.rhino.jstype.ObjectType var23 = var12.dereference();
//     com.google.javascript.rhino.jstype.ObjectType var24 = var23.getTypeOfThis();
//     boolean var25 = var24.isArrayType();
//     com.google.common.base.Predicate var26 = null;
//     boolean var27 = var24.setValidator(var26);
// 
//   }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
    boolean var1 = var0.isCatch();
    var0.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.script();
    boolean var6 = var0.isEquivalentTo(var5);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.script();
    boolean var8 = var7.isCatch();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.script();
    boolean var10 = var9.isCatch();
    boolean var11 = var9.isDec();
    var7.addChildrenToBack(var9);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.script();
    boolean var14 = var13.isCatch();
    boolean var15 = var13.isDec();
    var9.addChildrenToBack(var13);
    com.google.javascript.rhino.Node var17 = var5.srcrefTree(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var18 = var17.getDouble();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("hi!");
    boolean var2 = var1.isDo();
    int var3 = var1.getLength();
    boolean var4 = var1.isTrue();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.script();
    boolean var6 = var5.isAnd();
    int var7 = var5.getSourceOffset();
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.script();
    boolean var9 = var8.isCatch();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.script();
    boolean var11 = var10.isCatch();
    boolean var12 = var10.isDec();
    var8.addChildrenToBack(var10);
    com.google.javascript.rhino.jstype.JSType var14 = var10.getJSType();
    com.google.javascript.rhino.Node var15 = var10.getParent();
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.script();
    boolean var17 = var16.isCatch();
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.script();
    boolean var19 = var18.isCatch();
    boolean var20 = var18.isDec();
    var16.addChildrenToBack(var18);
    com.google.javascript.rhino.jstype.JSType var22 = var18.getJSType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.forNode(var1, var5, var10, var18);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
    boolean var1 = var0.isCatch();
    var0.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.script();
    boolean var6 = var0.isEquivalentTo(var5);
    com.google.javascript.rhino.ErrorReporter var7 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7, false);
    com.google.javascript.rhino.jstype.JSType var10 = null;
    com.google.javascript.rhino.jstype.JSType var12 = var9.getGreatestSubtypeWithProperty(var10, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var13 = var12.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var14 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var14, false);
    com.google.javascript.rhino.jstype.ObjectType var17 = null;
    com.google.javascript.rhino.jstype.ObjectType var18 = var16.createObjectType(var17);
    boolean var19 = var18.isString();
    var12.matchConstraint(var18);
    var0.setJSType(var12);
    com.google.javascript.rhino.jstype.JSType var23 = var12.getRestrictedTypeGivenToBooleanOutcome(true);
    com.google.javascript.rhino.jstype.TemplateType var24 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test119() {}
//   public void test119() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
//     boolean var4 = var2.isForwardDeclaredType("");
//     com.google.javascript.rhino.ErrorReporter var5 = var2.getErrorReporter();
//     java.util.List var6 = null;
//     com.google.javascript.rhino.Node var7 = var2.createParametersWithVarArgs(var6);
// 
//   }

  public void test120() {}
//   public void test120() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }
// 
// 
//     com.google.javascript.jscomp.AstValidator var0 = new com.google.javascript.jscomp.AstValidator();
//     com.google.javascript.rhino.Node var1 = null;
//     var0.validateScript(var1);
// 
//   }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.throwNode(var0);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test122"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.paramList();
    com.google.javascript.rhino.Node var4 = new com.google.javascript.rhino.Node(0, 100, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.doNode(var0, var4);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
    boolean var4 = var2.isForwardDeclaredType("");
    var2.incrementGeneration();
    com.google.javascript.rhino.ErrorReporter var6 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var6, false);
    com.google.javascript.rhino.jstype.ObjectType var9 = null;
    com.google.javascript.rhino.jstype.ObjectType var10 = var8.createObjectType(var9);
    com.google.javascript.rhino.ErrorReporter var11 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11, false);
    com.google.javascript.rhino.jstype.ObjectType var14 = null;
    com.google.javascript.rhino.jstype.ObjectType var15 = var13.createObjectType(var14);
    boolean var16 = var15.isString();
    boolean var17 = var2.resetImplicitPrototype((com.google.javascript.rhino.jstype.JSType)var9, var15);
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.script();
    boolean var19 = var18.isCatch();
    var18.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.script();
    boolean var24 = var18.isEquivalentTo(var23);
    com.google.javascript.rhino.ErrorReporter var25 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25, false);
    com.google.javascript.rhino.jstype.JSType var28 = null;
    com.google.javascript.rhino.jstype.JSType var30 = var27.getGreatestSubtypeWithProperty(var28, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var31 = var30.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var32 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32, false);
    com.google.javascript.rhino.jstype.ObjectType var35 = null;
    com.google.javascript.rhino.jstype.ObjectType var36 = var34.createObjectType(var35);
    boolean var37 = var36.isString();
    var30.matchConstraint(var36);
    var18.setJSType(var30);
    com.google.javascript.rhino.jstype.JSType var41 = var30.getRestrictedTypeGivenToBooleanOutcome(true);
    com.google.javascript.rhino.ErrorReporter var42 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var42, false);
    boolean var46 = var44.isForwardDeclaredType("");
    com.google.javascript.rhino.jstype.JSType var48 = null;
    var44.unregisterPropertyOnType("", var48);
    com.google.javascript.rhino.ErrorReporter var50 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var50, false);
    com.google.javascript.rhino.jstype.JSType var53 = null;
    com.google.javascript.rhino.jstype.JSType var55 = var52.getGreatestSubtypeWithProperty(var53, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var56 = var55.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var57 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var57, false);
    com.google.javascript.rhino.jstype.ObjectType var60 = null;
    com.google.javascript.rhino.jstype.ObjectType var61 = var59.createObjectType(var60);
    boolean var62 = var61.isString();
    var55.matchConstraint(var61);
    com.google.javascript.rhino.Node var64 = com.google.javascript.rhino.IR.script();
    boolean var65 = var64.isCatch();
    var64.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.IR.script();
    boolean var70 = var64.isEquivalentTo(var69);
    com.google.javascript.rhino.ErrorReporter var71 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var71, false);
    com.google.javascript.rhino.jstype.JSType var74 = null;
    com.google.javascript.rhino.jstype.JSType var76 = var73.getGreatestSubtypeWithProperty(var74, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var77 = var76.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var78 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var78, false);
    com.google.javascript.rhino.jstype.ObjectType var81 = null;
    com.google.javascript.rhino.jstype.ObjectType var82 = var80.createObjectType(var81);
    boolean var83 = var82.isString();
    var76.matchConstraint(var82);
    var64.setJSType(var76);
    boolean var86 = var76.isNumber();
    com.google.javascript.rhino.jstype.JSType var87 = var55.getGreatestSubtype(var76);
    com.google.javascript.rhino.jstype.JSType[] var88 = new com.google.javascript.rhino.jstype.JSType[] { var55};
    com.google.javascript.rhino.Node var89 = var44.createParameters(var88);
    com.google.javascript.rhino.jstype.FunctionType var90 = var2.createFunctionTypeWithVarArgs(var41, var88);
    java.util.List var91 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var90.setExtendedInterfaces(var91);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
    com.google.javascript.rhino.jstype.ObjectType var3 = null;
    com.google.javascript.rhino.jstype.ObjectType var4 = var2.createObjectType(var3);
    boolean var5 = var4.isString();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.script();
    boolean var7 = var6.isCatch();
    var6.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.script();
    boolean var12 = var6.isEquivalentTo(var11);
    com.google.javascript.rhino.ErrorReporter var13 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13, false);
    com.google.javascript.rhino.jstype.JSType var16 = null;
    com.google.javascript.rhino.jstype.JSType var18 = var15.getGreatestSubtypeWithProperty(var16, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var19 = var18.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var20 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var20, false);
    com.google.javascript.rhino.jstype.ObjectType var23 = null;
    com.google.javascript.rhino.jstype.ObjectType var24 = var22.createObjectType(var23);
    boolean var25 = var24.isString();
    var18.matchConstraint(var24);
    var6.setJSType(var18);
    boolean var28 = var18.isNumber();
    com.google.javascript.rhino.jstype.JSType var29 = var18.restrictByNotNullOrUndefined();
    boolean var30 = var29.isStringObjectType();
    com.google.javascript.rhino.jstype.UnionType var31 = var29.toMaybeUnionType();
    com.google.javascript.rhino.jstype.JSType var32 = var4.getLeastSupertype(var29);
    var29.clearResolved();
    boolean var34 = var29.isNoType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);

  }

  public void test125() {}
//   public void test125() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test125"); }
// 
// 
//     java.io.InputStream var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromInputStream("None", var1);
// 
//   }

  public void test126() {}
//   public void test126() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test126"); }
// 
// 
//     java.io.InputStream var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromInputStream("module$", var1);
// 
//   }

  public void test127() {}
//   public void test127() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test127"); }
// 
// 
//     com.google.javascript.jscomp.AbstractCompiler var0 = null;
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.script();
//     boolean var2 = var1.isCatch();
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.script();
//     boolean var4 = var3.isCatch();
//     boolean var5 = var3.isDec();
//     var1.addChildrenToBack(var3);
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.script();
//     boolean var8 = var7.isCatch();
//     boolean var9 = var7.isDec();
//     var3.addChildrenToBack(var7);
//     com.google.javascript.rhino.Node var11 = var3.getParent();
//     com.google.javascript.rhino.Node var12 = var11.cloneNode();
//     com.google.javascript.jscomp.NodeTraversal.Callback var13 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverse(var0, var11, var13);
// 
//   }

  public void test128() {}
//   public void test128() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test128"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.DiagnosticGroup var3 = com.google.javascript.jscomp.DiagnosticGroup.forType(var2);
//     com.google.javascript.jscomp.DiagnosticType[] var4 = new com.google.javascript.jscomp.DiagnosticType[] { var2};
//     com.google.javascript.jscomp.DiagnosticGroup var5 = new com.google.javascript.jscomp.DiagnosticGroup(var4);
//     com.google.javascript.jscomp.CheckLevel var9 = null;
//     com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.DiagnosticGroup var13 = com.google.javascript.jscomp.DiagnosticGroup.forType(var12);
//     com.google.javascript.jscomp.AstValidator var14 = new com.google.javascript.jscomp.AstValidator();
//     boolean var15 = var12.equals((java.lang.Object)var14);
//     java.lang.String[] var17 = new java.lang.String[] { "None"};
//     com.google.javascript.jscomp.JSError var18 = com.google.javascript.jscomp.JSError.make("module$", 1, 1, var9, var12, var17);
//     boolean var19 = var5.matches(var18);
//     com.google.javascript.jscomp.CheckLevel var20 = var18.getDefaultLevel();
//     com.google.javascript.jscomp.DiagnosticType var23 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.DiagnosticGroup var24 = com.google.javascript.jscomp.DiagnosticGroup.forType(var23);
//     com.google.javascript.jscomp.DiagnosticType[] var25 = new com.google.javascript.jscomp.DiagnosticType[] { var23};
//     com.google.javascript.jscomp.DiagnosticGroup var26 = new com.google.javascript.jscomp.DiagnosticGroup(var25);
//     com.google.javascript.jscomp.CheckLevel var30 = null;
//     com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.DiagnosticGroup var34 = com.google.javascript.jscomp.DiagnosticGroup.forType(var33);
//     com.google.javascript.jscomp.AstValidator var35 = new com.google.javascript.jscomp.AstValidator();
//     boolean var36 = var33.equals((java.lang.Object)var35);
//     java.lang.String[] var38 = new java.lang.String[] { "None"};
//     com.google.javascript.jscomp.JSError var39 = com.google.javascript.jscomp.JSError.make("module$", 1, 1, var30, var33, var38);
//     boolean var40 = var26.matches(var39);
//     com.google.javascript.jscomp.CheckLevel var41 = var39.getDefaultLevel();
//     com.google.javascript.jscomp.MessageFormatter var42 = null;
//     java.lang.String var43 = var18.format(var41, var42);
// 
//   }

  public void test129() {}
//   public void test129() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test129"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
//     com.google.javascript.rhino.ErrorReporter var3 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var3, false);
//     boolean var7 = var5.isForwardDeclaredType("");
//     com.google.javascript.rhino.jstype.JSType var9 = null;
//     var5.unregisterPropertyOnType("", var9);
//     com.google.javascript.rhino.ErrorReporter var11 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11, false);
//     com.google.javascript.rhino.jstype.JSType var14 = null;
//     com.google.javascript.rhino.jstype.JSType var16 = var13.getGreatestSubtypeWithProperty(var14, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var17 = var16.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var18 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18, false);
//     com.google.javascript.rhino.jstype.ObjectType var21 = null;
//     com.google.javascript.rhino.jstype.ObjectType var22 = var20.createObjectType(var21);
//     boolean var23 = var22.isString();
//     var16.matchConstraint(var22);
//     com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.script();
//     boolean var26 = var25.isCatch();
//     var25.putIntProp((-1), 0);
//     com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.script();
//     boolean var31 = var25.isEquivalentTo(var30);
//     com.google.javascript.rhino.ErrorReporter var32 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32, false);
//     com.google.javascript.rhino.jstype.JSType var35 = null;
//     com.google.javascript.rhino.jstype.JSType var37 = var34.getGreatestSubtypeWithProperty(var35, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var38 = var37.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var39 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var39, false);
//     com.google.javascript.rhino.jstype.ObjectType var42 = null;
//     com.google.javascript.rhino.jstype.ObjectType var43 = var41.createObjectType(var42);
//     boolean var44 = var43.isString();
//     var37.matchConstraint(var43);
//     var25.setJSType(var37);
//     boolean var47 = var37.isNumber();
//     com.google.javascript.rhino.jstype.JSType var48 = var16.getGreatestSubtype(var37);
//     com.google.javascript.rhino.jstype.JSType[] var49 = new com.google.javascript.rhino.jstype.JSType[] { var16};
//     com.google.javascript.rhino.Node var50 = var5.createParameters(var49);
//     com.google.javascript.rhino.jstype.JSType var51 = var2.createUnionType(var49);
//     com.google.javascript.rhino.ErrorReporter var52 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var52, false);
//     com.google.javascript.rhino.jstype.JSType var55 = null;
//     com.google.javascript.rhino.jstype.JSType var57 = var54.getGreatestSubtypeWithProperty(var55, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var58 = var57.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var59 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var59, false);
//     com.google.javascript.rhino.jstype.ObjectType var62 = null;
//     com.google.javascript.rhino.jstype.ObjectType var63 = var61.createObjectType(var62);
//     boolean var64 = var63.isString();
//     var57.matchConstraint(var63);
//     com.google.javascript.rhino.Node var66 = com.google.javascript.rhino.IR.script();
//     boolean var67 = var66.isCatch();
//     var66.putIntProp((-1), 0);
//     com.google.javascript.rhino.Node var71 = com.google.javascript.rhino.IR.script();
//     boolean var72 = var66.isEquivalentTo(var71);
//     com.google.javascript.rhino.ErrorReporter var73 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var73, false);
//     com.google.javascript.rhino.jstype.JSType var76 = null;
//     com.google.javascript.rhino.jstype.JSType var78 = var75.getGreatestSubtypeWithProperty(var76, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var79 = var78.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var80 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var82 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var80, false);
//     com.google.javascript.rhino.jstype.ObjectType var83 = null;
//     com.google.javascript.rhino.jstype.ObjectType var84 = var82.createObjectType(var83);
//     boolean var85 = var84.isString();
//     var78.matchConstraint(var84);
//     var66.setJSType(var78);
//     boolean var88 = var78.isNumber();
//     com.google.javascript.rhino.jstype.JSType var89 = var57.getGreatestSubtype(var78);
//     boolean var90 = var89.hasDisplayName();
//     com.google.javascript.rhino.jstype.JSType[] var91 = null;
//     com.google.javascript.rhino.jstype.FunctionType var92 = var2.createConstructorType(var89, var91);
// 
//   }

  public void test130() {}
//   public void test130() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test130"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile var0 = null;
//     com.google.javascript.jscomp.JsAst var1 = new com.google.javascript.jscomp.JsAst(var0);
// 
//   }

  public void test131() {}
//   public void test131() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test131"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
//     java.util.List var3 = null;
//     var2.setTemplateTypeNames(var3);
// 
//   }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test132"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
    com.google.javascript.rhino.jstype.ObjectType var3 = null;
    com.google.javascript.rhino.jstype.ObjectType var4 = var2.createObjectType(var3);
    com.google.javascript.rhino.ErrorReporter var6 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var6, false);
    com.google.javascript.rhino.jstype.JSType var9 = null;
    com.google.javascript.rhino.jstype.JSType var11 = var8.getGreatestSubtypeWithProperty(var9, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var12 = var11.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var13 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13, false);
    com.google.javascript.rhino.jstype.ObjectType var16 = null;
    com.google.javascript.rhino.jstype.ObjectType var17 = var15.createObjectType(var16);
    boolean var18 = var17.isString();
    var11.matchConstraint(var17);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.script();
    boolean var21 = var20.isCatch();
    var20.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.script();
    boolean var26 = var20.isEquivalentTo(var25);
    com.google.javascript.rhino.ErrorReporter var27 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var27, false);
    com.google.javascript.rhino.jstype.JSType var30 = null;
    com.google.javascript.rhino.jstype.JSType var32 = var29.getGreatestSubtypeWithProperty(var30, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var33 = var32.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var34 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var34, false);
    com.google.javascript.rhino.jstype.ObjectType var37 = null;
    com.google.javascript.rhino.jstype.ObjectType var38 = var36.createObjectType(var37);
    boolean var39 = var38.isString();
    var32.matchConstraint(var38);
    var20.setJSType(var32);
    boolean var42 = var32.isNumber();
    com.google.javascript.rhino.jstype.JSType var43 = var11.getGreatestSubtype(var32);
    com.google.javascript.rhino.JSDocInfo var44 = var32.getJSDocInfo();
    com.google.javascript.rhino.jstype.SimpleSlot var46 = new com.google.javascript.rhino.jstype.SimpleSlot("None", var32, true);
    com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.script();
    boolean var48 = var47.isCatch();
    var47.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.IR.script();
    boolean var53 = var47.isEquivalentTo(var52);
    com.google.javascript.rhino.ErrorReporter var54 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var54, false);
    com.google.javascript.rhino.jstype.JSType var57 = null;
    com.google.javascript.rhino.jstype.JSType var59 = var56.getGreatestSubtypeWithProperty(var57, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var60 = var59.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var61 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var61, false);
    com.google.javascript.rhino.jstype.ObjectType var64 = null;
    com.google.javascript.rhino.jstype.ObjectType var65 = var63.createObjectType(var64);
    boolean var66 = var65.isString();
    var59.matchConstraint(var65);
    var47.setJSType(var59);
    boolean var69 = var59.isBooleanObjectType();
    com.google.javascript.rhino.jstype.ObjectType var70 = var59.dereference();
    com.google.javascript.rhino.jstype.ObjectType var71 = var70.getTypeOfThis();
    boolean var72 = var71.isArrayType();
    com.google.javascript.rhino.Node var73 = com.google.javascript.rhino.IR.script();
    boolean var74 = var73.isCatch();
    var73.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var78 = com.google.javascript.rhino.IR.script();
    boolean var79 = var73.isEquivalentTo(var78);
    com.google.javascript.rhino.ErrorReporter var80 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var82 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var80, false);
    com.google.javascript.rhino.jstype.JSType var83 = null;
    com.google.javascript.rhino.jstype.JSType var85 = var82.getGreatestSubtypeWithProperty(var83, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var86 = var85.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var87 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var89 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var87, false);
    com.google.javascript.rhino.jstype.ObjectType var90 = null;
    com.google.javascript.rhino.jstype.ObjectType var91 = var89.createObjectType(var90);
    boolean var92 = var91.isString();
    var85.matchConstraint(var91);
    var73.setJSType(var85);
    com.google.javascript.rhino.jstype.JSType var96 = var85.getRestrictedTypeGivenToBooleanOutcome(true);
    boolean var97 = var71.canTestForShallowEqualityWith(var85);
    com.google.javascript.rhino.jstype.JSType.TypePair var98 = var32.getTypesUnderShallowEquality(var85);
    com.google.javascript.rhino.jstype.JSType var99 = var2.createOptionalType(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var99);

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test133"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.continueNode();
    java.util.Set var2 = null;
    var1.setDirectives(var2);
    boolean var4 = var1.isDebugger();
    com.google.javascript.rhino.Node[] var5 = new com.google.javascript.rhino.Node[] { var1};
    com.google.javascript.rhino.Node var8 = new com.google.javascript.rhino.Node((-1), var5, (-1), 0);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.script();
    boolean var10 = var9.isCatch();
    var9.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.script();
    boolean var15 = var9.isEquivalentTo(var14);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.script();
    boolean var17 = var16.isCatch();
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.script();
    boolean var19 = var18.isCatch();
    boolean var20 = var18.isDec();
    var16.addChildrenToBack(var18);
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.script();
    boolean var23 = var22.isCatch();
    boolean var24 = var22.isDec();
    var18.addChildrenToBack(var22);
    com.google.javascript.rhino.Node var26 = var14.srcrefTree(var18);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.script();
    boolean var28 = var27.isCatch();
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.script();
    boolean var30 = var29.isCatch();
    boolean var31 = var29.isDec();
    var27.addChildrenToBack(var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.tryCatchFinally(var8, var14, var27);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
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

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test134"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
    com.google.javascript.rhino.jstype.JSType var3 = null;
    com.google.javascript.rhino.jstype.JSType var5 = var2.getGreatestSubtypeWithProperty(var3, "hi!");
    com.google.javascript.rhino.ErrorReporter var6 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var6, false);
    com.google.javascript.rhino.jstype.ObjectType var9 = null;
    com.google.javascript.rhino.jstype.ObjectType var10 = var8.createObjectType(var9);
    boolean var11 = var10.isString();
    com.google.javascript.rhino.JSDocInfo var12 = null;
    var10.setJSDocInfo(var12);
    var2.resolveTypesInScope((com.google.javascript.rhino.jstype.StaticScope)var10);
    com.google.javascript.rhino.ErrorReporter var16 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var16, false);
    com.google.javascript.rhino.jstype.JSType var19 = null;
    com.google.javascript.rhino.jstype.JSType var21 = var18.getGreatestSubtypeWithProperty(var19, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var22 = var21.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var23 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var23, false);
    com.google.javascript.rhino.jstype.ObjectType var26 = null;
    com.google.javascript.rhino.jstype.ObjectType var27 = var25.createObjectType(var26);
    boolean var28 = var27.isString();
    var21.matchConstraint(var27);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.script();
    boolean var31 = var30.isCatch();
    var30.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.script();
    boolean var36 = var30.isEquivalentTo(var35);
    com.google.javascript.rhino.ErrorReporter var37 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var37, false);
    com.google.javascript.rhino.jstype.JSType var40 = null;
    com.google.javascript.rhino.jstype.JSType var42 = var39.getGreatestSubtypeWithProperty(var40, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var43 = var42.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var44 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var44, false);
    com.google.javascript.rhino.jstype.ObjectType var47 = null;
    com.google.javascript.rhino.jstype.ObjectType var48 = var46.createObjectType(var47);
    boolean var49 = var48.isString();
    var42.matchConstraint(var48);
    var30.setJSType(var42);
    boolean var52 = var42.isNumber();
    com.google.javascript.rhino.jstype.JSType var53 = var21.getGreatestSubtype(var42);
    com.google.javascript.rhino.JSDocInfo var54 = var42.getJSDocInfo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.overwriteDeclaredType("SCRIPT", var42);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test135"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
    boolean var1 = var0.isCatch();
    var0.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.script();
    boolean var6 = var0.isEquivalentTo(var5);
    com.google.javascript.rhino.ErrorReporter var7 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7, false);
    com.google.javascript.rhino.jstype.JSType var10 = null;
    com.google.javascript.rhino.jstype.JSType var12 = var9.getGreatestSubtypeWithProperty(var10, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var13 = var12.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var14 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var14, false);
    com.google.javascript.rhino.jstype.ObjectType var17 = null;
    com.google.javascript.rhino.jstype.ObjectType var18 = var16.createObjectType(var17);
    boolean var19 = var18.isString();
    var12.matchConstraint(var18);
    var0.setJSType(var12);
    boolean var22 = var12.isBooleanObjectType();
    boolean var23 = var12.isNominalConstructor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test136"); }


    com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
    com.google.javascript.rhino.Node var2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode((com.google.javascript.jscomp.CodingConvention)var0, "hi!");
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.continueNode();
    java.util.Set var5 = null;
    var4.setDirectives(var5);
    boolean var7 = var4.isDebugger();
    com.google.javascript.rhino.Node[] var8 = new com.google.javascript.rhino.Node[] { var4};
    com.google.javascript.rhino.Node var11 = new com.google.javascript.rhino.Node((-1), var8, (-1), 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var0.isVarArgsParameter(var11);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test137"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.lang.Iterable var1 = var0.getDirectedGraphNodes();
    var0.pushNodeAnnotations();
    var0.popNodeAnnotations();
    com.google.javascript.jscomp.VariableRenamingPolicy[] var4 = com.google.javascript.jscomp.VariableRenamingPolicy.values();
    com.google.javascript.jscomp.SourceAst var5 = null;
    com.google.javascript.rhino.InputId var7 = new com.google.javascript.rhino.InputId("");
    com.google.javascript.jscomp.CompilerInput var9 = new com.google.javascript.jscomp.CompilerInput(var5, var7, true);
    com.google.javascript.rhino.InputId var10 = var9.getInputId();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var0.isConnectedInDirection((java.lang.Object)var4, (java.lang.Object)var10);
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
    assertNotNull(var10);

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test138"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
    boolean var1 = var0.isCatch();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.script();
    boolean var3 = var2.isCatch();
    boolean var4 = var2.isDec();
    var0.addChildrenToBack(var2);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.script();
    boolean var7 = var6.isCatch();
    boolean var8 = var6.isDec();
    var2.addChildrenToBack(var6);
    com.google.javascript.rhino.Node var10 = var2.getParent();
    com.google.javascript.rhino.Node var11 = var10.cloneNode();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var13 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.lang.Iterable var14 = var13.getDirectedGraphNodes();
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newNumber(100.0d);
    boolean var17 = var13.hasNode((java.lang.Object)var16);
    var10.putProp((-1), (java.lang.Object)var13);
    java.lang.String var19 = var10.getSourceFileName();
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.script();
    boolean var21 = var20.isCatch();
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.script();
    boolean var23 = var22.isCatch();
    boolean var24 = var22.isDec();
    var20.addChildrenToBack(var22);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.continueNode();
    int var28 = var26.getIntProp(0);
    com.google.javascript.rhino.Node var29 = var22.copyInformationFromForTree(var26);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.continueNode();
    java.lang.String var31 = com.google.javascript.jscomp.NodeUtil.getSourceName(var30);
    java.lang.Iterable var32 = var30.siblings();
    com.google.javascript.rhino.Node var33 = var22.copyInformationFromForTree(var30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var34 = var10.clonePropsFrom(var22);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
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

  }

  public void test139() {}
//   public void test139() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test139"); }
// 
// 
//     java.lang.String var0 = com.google.javascript.jscomp.Compiler.getReleaseDate();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var0 + "' != '" + "2014/12/23 21:59"+ "'", var0.equals("2014/12/23 21:59"));
// 
//   }

  public void test140() {}
//   public void test140() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test140"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
//     boolean var1 = var0.isCatch();
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.script();
//     boolean var3 = var2.isCatch();
//     boolean var4 = var2.isDec();
//     var0.addChildrenToBack(var2);
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.script();
//     boolean var7 = var6.isCatch();
//     boolean var8 = var6.isDec();
//     var2.addChildrenToBack(var6);
//     com.google.javascript.rhino.Node var10 = var2.getParent();
//     com.google.javascript.rhino.Node var11 = var10.cloneNode();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var13 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
//     java.lang.Iterable var14 = var13.getDirectedGraphNodes();
//     com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newNumber(100.0d);
//     boolean var17 = var13.hasNode((java.lang.Object)var16);
//     var10.putProp((-1), (java.lang.Object)var13);
//     var13.popNodeAnnotations();
// 
//   }

  public void test141() {}
//   public void test141() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test141"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.rhino.InputId var2 = new com.google.javascript.rhino.InputId("");
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var0, var2, true);
//     com.google.javascript.rhino.InputId var5 = var4.getInputId();
//     int var7 = var4.getLineOffset(1);
// 
//   }

  public void test142() {}
//   public void test142() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test142"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.rhino.InputId var2 = new com.google.javascript.rhino.InputId("");
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var0, var2, true);
//     com.google.javascript.rhino.InputId var5 = var4.getInputId();
//     java.lang.String var6 = var4.toString();
//     java.util.Collection var7 = var4.getProvides();
// 
//   }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test143"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.SourceFile var1 = new com.google.javascript.jscomp.SourceFile("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test144() {}
//   public void test144() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test144"); }
// 
// 
//     com.google.javascript.jscomp.MessageFormatter var0 = null;
//     java.util.logging.Logger var1 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var2 = new com.google.javascript.jscomp.LoggerErrorManager(var0, var1);
//     int var3 = var2.getErrorCount();
//     com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.DiagnosticGroup var7 = com.google.javascript.jscomp.DiagnosticGroup.forType(var6);
//     com.google.javascript.jscomp.DiagnosticType var10 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.DiagnosticGroup var11 = com.google.javascript.jscomp.DiagnosticGroup.forType(var10);
//     com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.DiagnosticGroup var15 = com.google.javascript.jscomp.DiagnosticGroup.forType(var14);
//     com.google.javascript.jscomp.DiagnosticType[] var16 = new com.google.javascript.jscomp.DiagnosticType[] { var14};
//     com.google.javascript.jscomp.DiagnosticGroup var17 = new com.google.javascript.jscomp.DiagnosticGroup(var16);
//     com.google.javascript.jscomp.CheckLevel var21 = null;
//     com.google.javascript.jscomp.DiagnosticType var24 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.DiagnosticGroup var25 = com.google.javascript.jscomp.DiagnosticGroup.forType(var24);
//     com.google.javascript.jscomp.AstValidator var26 = new com.google.javascript.jscomp.AstValidator();
//     boolean var27 = var24.equals((java.lang.Object)var26);
//     java.lang.String[] var29 = new java.lang.String[] { "None"};
//     com.google.javascript.jscomp.JSError var30 = com.google.javascript.jscomp.JSError.make("module$", 1, 1, var21, var24, var29);
//     boolean var31 = var17.matches(var30);
//     com.google.javascript.jscomp.CheckLevel var32 = var30.getDefaultLevel();
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var33 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var11, var32);
//     java.lang.Class var34 = var32.getDeclaringClass();
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var35 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var7, var32);
//     com.google.javascript.jscomp.DiagnosticType var38 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.DiagnosticGroup var39 = com.google.javascript.jscomp.DiagnosticGroup.forType(var38);
//     java.lang.String[] var40 = null;
//     com.google.javascript.jscomp.JSError var41 = com.google.javascript.jscomp.JSError.make(var38, var40);
//     var2.println(var32, var41);
// 
//   }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test145"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.script();
    boolean var2 = var1.isCatch();
    var1.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.script();
    boolean var7 = var1.isEquivalentTo(var6);
    com.google.javascript.rhino.Node var10 = new com.google.javascript.rhino.Node(0, var1, (-1), 0);
    boolean var11 = var1.isContinue();
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.continueNode();
    java.util.Set var14 = null;
    var13.setDirectives(var14);
    boolean var16 = var13.isScript();
    com.google.javascript.rhino.ErrorReporter var17 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var17, false);
    com.google.javascript.rhino.jstype.JSType var20 = null;
    com.google.javascript.rhino.jstype.JSType var22 = var19.getGreatestSubtypeWithProperty(var20, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var23 = var22.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var24 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24, false);
    com.google.javascript.rhino.jstype.ObjectType var27 = null;
    com.google.javascript.rhino.jstype.ObjectType var28 = var26.createObjectType(var27);
    boolean var29 = var28.isString();
    var22.matchConstraint(var28);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.script();
    boolean var32 = var31.isCatch();
    var31.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.script();
    boolean var37 = var31.isEquivalentTo(var36);
    com.google.javascript.rhino.ErrorReporter var38 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var38, false);
    com.google.javascript.rhino.jstype.JSType var41 = null;
    com.google.javascript.rhino.jstype.JSType var43 = var40.getGreatestSubtypeWithProperty(var41, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var44 = var43.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var45 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var45, false);
    com.google.javascript.rhino.jstype.ObjectType var48 = null;
    com.google.javascript.rhino.jstype.ObjectType var49 = var47.createObjectType(var48);
    boolean var50 = var49.isString();
    var43.matchConstraint(var49);
    var31.setJSType(var43);
    boolean var53 = var43.isNumber();
    com.google.javascript.rhino.jstype.JSType var54 = var22.getGreatestSubtype(var43);
    boolean var55 = var54.hasDisplayName();
    var13.setJSType(var54);
    com.google.javascript.rhino.Node[] var57 = new com.google.javascript.rhino.Node[] { var13};
    com.google.javascript.rhino.Node var58 = new com.google.javascript.rhino.Node((-1), var57);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var59 = com.google.javascript.rhino.IR.switchNode(var1, var57);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test146"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.paramList();
    boolean var1 = var0.isParamList();
    boolean var2 = var0.isFunction();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var3 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test147"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.rhino.ErrorReporter var2 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2, false);
    com.google.javascript.rhino.jstype.ObjectType var5 = null;
    com.google.javascript.rhino.jstype.ObjectType var6 = var4.createObjectType(var5);
    boolean var7 = var6.isString();
    com.google.javascript.rhino.JSDocInfo var8 = null;
    var6.setJSDocInfo(var8);
    com.google.javascript.rhino.ErrorReporter var10 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var10, false);
    com.google.javascript.rhino.jstype.JSType var13 = null;
    com.google.javascript.rhino.jstype.JSType var15 = var12.getGreatestSubtypeWithProperty(var13, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var16 = var15.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var17 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var17, false);
    com.google.javascript.rhino.jstype.ObjectType var20 = null;
    com.google.javascript.rhino.jstype.ObjectType var21 = var19.createObjectType(var20);
    boolean var22 = var21.isString();
    var15.matchConstraint(var21);
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.script();
    boolean var25 = var24.isCatch();
    var24.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.script();
    boolean var30 = var24.isEquivalentTo(var29);
    com.google.javascript.rhino.ErrorReporter var31 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var31, false);
    com.google.javascript.rhino.jstype.JSType var34 = null;
    com.google.javascript.rhino.jstype.JSType var36 = var33.getGreatestSubtypeWithProperty(var34, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var37 = var36.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var38 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var38, false);
    com.google.javascript.rhino.jstype.ObjectType var41 = null;
    com.google.javascript.rhino.jstype.ObjectType var42 = var40.createObjectType(var41);
    boolean var43 = var42.isString();
    var36.matchConstraint(var42);
    var24.setJSType(var36);
    boolean var46 = var36.isNumber();
    com.google.javascript.rhino.jstype.JSType var47 = var15.getGreatestSubtype(var36);
    com.google.javascript.rhino.JSDocInfo var48 = var36.getJSDocInfo();
    com.google.javascript.rhino.jstype.JSType.TypePair var49 = var6.getTypesUnderEquality(var36);
    java.lang.String var50 = var36.toString();
    boolean var51 = var36.isFunctionPrototypeType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.disconnectInDirection((java.lang.Object)0L, (java.lang.Object)var51);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "None"+ "'", var50.equals("None"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);

  }

  public void test148() {}
//   public void test148() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test148"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
//     boolean var4 = var2.isForwardDeclaredType("");
//     com.google.javascript.rhino.ErrorReporter var5 = var2.getErrorReporter();
//     boolean var7 = var2.hasNamespace("hi!");
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.script();
//     boolean var9 = var8.isCatch();
//     var8.putIntProp((-1), 0);
//     com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.script();
//     boolean var14 = var8.isEquivalentTo(var13);
//     com.google.javascript.rhino.ErrorReporter var15 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var15, false);
//     com.google.javascript.rhino.jstype.JSType var18 = null;
//     com.google.javascript.rhino.jstype.JSType var20 = var17.getGreatestSubtypeWithProperty(var18, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var21 = var20.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var22 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var22, false);
//     com.google.javascript.rhino.jstype.ObjectType var25 = null;
//     com.google.javascript.rhino.jstype.ObjectType var26 = var24.createObjectType(var25);
//     boolean var27 = var26.isString();
//     var20.matchConstraint(var26);
//     var8.setJSType(var20);
//     boolean var30 = var20.isNumber();
//     com.google.javascript.rhino.jstype.JSType var31 = var20.restrictByNotNullOrUndefined();
//     boolean var32 = var31.isFunctionPrototypeType();
//     com.google.javascript.rhino.jstype.JSType var33 = var2.createOptionalType(var31);
//     com.google.javascript.rhino.jstype.JSTypeNative var34 = null;
//     com.google.javascript.rhino.jstype.JSTypeNative[] var35 = new com.google.javascript.rhino.jstype.JSTypeNative[] { var34};
//     com.google.javascript.rhino.jstype.JSType var36 = var2.createUnionType(var35);
// 
//   }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test149"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.script();
    boolean var2 = var1.isAnd();
    int var3 = var1.getSourceOffset();
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.script();
    boolean var5 = var4.isAnd();
    boolean var6 = var4.isDec();
    com.google.javascript.rhino.Node var7 = var1.clonePropsFrom(var4);
    var7.putBooleanProp(10, true);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.script();
    boolean var12 = var11.isCatch();
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.script();
    boolean var14 = var13.isCatch();
    boolean var15 = var13.isDec();
    var11.addChildrenToBack(var13);
    com.google.javascript.rhino.jstype.JSType var17 = var13.getJSType();
    boolean var18 = var13.isTrue();
    com.google.javascript.rhino.Node var19 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var20 = new com.google.javascript.rhino.Node(1, var7, var13, var19);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test150() {}
//   public void test150() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test150"); }
// 
// 
//     java.util.List var0 = null;
//     com.google.javascript.jscomp.deps.SortedDependencies var1 = new com.google.javascript.jscomp.deps.SortedDependencies(var0);
// 
//   }

  public void test151() {}
//   public void test151() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test151"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.empty();
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.script();
//     boolean var2 = var1.isCatch();
//     var1.putIntProp((-1), 0);
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.script();
//     boolean var7 = var1.isEquivalentTo(var6);
//     com.google.javascript.rhino.ErrorReporter var8 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8, false);
//     com.google.javascript.rhino.jstype.JSType var11 = null;
//     com.google.javascript.rhino.jstype.JSType var13 = var10.getGreatestSubtypeWithProperty(var11, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var14 = var13.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var15 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var15, false);
//     com.google.javascript.rhino.jstype.ObjectType var18 = null;
//     com.google.javascript.rhino.jstype.ObjectType var19 = var17.createObjectType(var18);
//     boolean var20 = var19.isString();
//     var13.matchConstraint(var19);
//     var1.setJSType(var13);
//     com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.script();
//     boolean var24 = var23.isAnd();
//     boolean var25 = var23.isDec();
//     com.google.javascript.rhino.Node var26 = null;
//     var1.addChildAfter(var23, var26);
//     com.google.javascript.rhino.Node var28 = var0.useSourceInfoFromForTree(var26);
// 
//   }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test152"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.string("hi!");
    com.google.javascript.jscomp.ClosureCodingConvention var2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.continueNode();
    java.util.Set var4 = null;
    var3.setDirectives(var4);
    boolean var6 = var3.isDebugger();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.script();
    boolean var8 = var7.isAnd();
    boolean var9 = var7.isDec();
    boolean var10 = var7.isExprResult();
    com.google.javascript.rhino.JSDocInfo var11 = var7.getJSDocInfo();
    com.google.javascript.rhino.InputId var12 = com.google.javascript.jscomp.NodeUtil.getInputId(var7);
    java.lang.String var13 = var7.toString();
    java.lang.String var14 = var2.extractClassNameIfProvide(var3, var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.doNode(var1, var3);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "SCRIPT"+ "'", var13.equals("SCRIPT"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test153() {}
//   public void test153() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test153"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
//     com.google.javascript.rhino.jstype.JSType var4 = null;
//     var2.unregisterPropertyOnType("", var4);
//     com.google.javascript.rhino.jstype.JSTypeNative var6 = null;
//     com.google.javascript.rhino.jstype.ObjectType var7 = var2.getNativeObjectType(var6);
// 
//   }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test154"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.nullNode();
    var0.setSourceEncodedPosition((-1));
    com.google.javascript.rhino.Node var6 = new com.google.javascript.rhino.Node(0, 100, 1);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.script();
    boolean var8 = var7.isCatch();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.script();
    boolean var10 = var9.isCatch();
    boolean var11 = var9.isDec();
    var7.addChildrenToBack(var9);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.continueNode();
    int var15 = var13.getIntProp(0);
    com.google.javascript.rhino.Node var16 = var9.copyInformationFromForTree(var13);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.continueNode();
    java.lang.String var18 = com.google.javascript.jscomp.NodeUtil.getSourceName(var17);
    java.lang.Iterable var19 = var17.siblings();
    com.google.javascript.rhino.Node var20 = var9.copyInformationFromForTree(var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addChildrenAfter(var6, var17);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test155"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.DiagnosticGroup var3 = com.google.javascript.jscomp.DiagnosticGroup.forType(var2);
    com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.DiagnosticGroup var7 = com.google.javascript.jscomp.DiagnosticGroup.forType(var6);
    com.google.javascript.jscomp.DiagnosticType[] var8 = new com.google.javascript.jscomp.DiagnosticType[] { var6};
    com.google.javascript.jscomp.DiagnosticGroup var9 = new com.google.javascript.jscomp.DiagnosticGroup(var8);
    com.google.javascript.jscomp.CheckLevel var13 = null;
    com.google.javascript.jscomp.DiagnosticType var16 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.DiagnosticGroup var17 = com.google.javascript.jscomp.DiagnosticGroup.forType(var16);
    com.google.javascript.jscomp.AstValidator var18 = new com.google.javascript.jscomp.AstValidator();
    boolean var19 = var16.equals((java.lang.Object)var18);
    java.lang.String[] var21 = new java.lang.String[] { "None"};
    com.google.javascript.jscomp.JSError var22 = com.google.javascript.jscomp.JSError.make("module$", 1, 1, var13, var16, var21);
    boolean var23 = var9.matches(var22);
    com.google.javascript.jscomp.CheckLevel var24 = var22.getDefaultLevel();
    com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var25 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var3, var24);
    java.lang.Class var26 = var24.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var28 = java.lang.Enum.<java.lang.Enum>valueOf(var26, "function (function (this:me, {1585222203}): me): function (this:me, {1147441139}): me");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test156"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(0.0d);
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.script();
    boolean var3 = var2.isAnd();
    int var4 = var2.getSourceOffset();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.script();
    boolean var6 = var5.isAnd();
    boolean var7 = var5.isDec();
    com.google.javascript.rhino.Node var8 = var2.clonePropsFrom(var5);
    var8.putBooleanProp(10, true);
    boolean var12 = var8.isReturn();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.assign(var1, var8);
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
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test157"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
    com.google.javascript.rhino.jstype.JSType var3 = null;
    com.google.javascript.rhino.jstype.JSType var5 = var2.getGreatestSubtypeWithProperty(var3, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var6 = var5.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var7 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7, false);
    com.google.javascript.rhino.jstype.ObjectType var10 = null;
    com.google.javascript.rhino.jstype.ObjectType var11 = var9.createObjectType(var10);
    boolean var12 = var11.isString();
    var5.matchConstraint(var11);
    boolean var14 = var5.isNominalConstructor();
    boolean var15 = var5.isRecordType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test158"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
    boolean var1 = var0.isAnd();
    int var2 = var0.getSourceOffset();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.script();
    boolean var4 = var3.isAnd();
    boolean var5 = var3.isDec();
    com.google.javascript.rhino.Node var6 = var0.clonePropsFrom(var3);
    var6.putBooleanProp(10, true);
    boolean var10 = var6.isReturn();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var11 = var6.getDouble();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test159"); }


    com.google.javascript.jscomp.SourceFile.Builder var0 = com.google.javascript.jscomp.SourceFile.builder();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test160"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
    boolean var1 = var0.isCatch();
    var0.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.script();
    boolean var6 = var0.isEquivalentTo(var5);
    com.google.javascript.rhino.ErrorReporter var7 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7, false);
    com.google.javascript.rhino.jstype.JSType var10 = null;
    com.google.javascript.rhino.jstype.JSType var12 = var9.getGreatestSubtypeWithProperty(var10, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var13 = var12.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var14 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var14, false);
    com.google.javascript.rhino.jstype.ObjectType var17 = null;
    com.google.javascript.rhino.jstype.ObjectType var18 = var16.createObjectType(var17);
    boolean var19 = var18.isString();
    var12.matchConstraint(var18);
    var0.setJSType(var12);
    com.google.javascript.rhino.jstype.JSType var23 = var12.getRestrictedTypeGivenToBooleanOutcome(true);
    com.google.javascript.rhino.jstype.JSType var25 = var23.findPropertyType("SCRIPT");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test161"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.lang.Iterable var1 = var0.getDirectedGraphNodes();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.script();
    boolean var4 = var3.isCatch();
    var3.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.script();
    boolean var9 = var3.isEquivalentTo(var8);
    com.google.javascript.rhino.ErrorReporter var10 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var10, false);
    com.google.javascript.rhino.jstype.JSType var13 = null;
    com.google.javascript.rhino.jstype.JSType var15 = var12.getGreatestSubtypeWithProperty(var13, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var16 = var15.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var17 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var17, false);
    com.google.javascript.rhino.jstype.ObjectType var20 = null;
    com.google.javascript.rhino.jstype.ObjectType var21 = var19.createObjectType(var20);
    boolean var22 = var21.isString();
    var15.matchConstraint(var21);
    var3.setJSType(var15);
    boolean var25 = var15.isNumber();
    com.google.javascript.rhino.jstype.JSType var26 = var15.restrictByNotNullOrUndefined();
    com.google.javascript.rhino.jstype.SimpleSlot var28 = new com.google.javascript.rhino.jstype.SimpleSlot("", var26, true);
    com.google.javascript.rhino.jstype.JSType var29 = var28.getType();
    boolean var30 = var28.isTypeInferred();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var31 = var0.getOutEdges((java.lang.Object)var28);
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
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test162"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
    boolean var1 = var0.isCatch();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.script();
    boolean var3 = var2.isCatch();
    boolean var4 = var2.isDec();
    var0.addChildrenToBack(var2);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.script();
    boolean var7 = var6.isCatch();
    boolean var8 = var6.isDec();
    var2.addChildrenToBack(var6);
    boolean var10 = var6.isDelProp();
    com.google.javascript.rhino.Node var11 = var6.getFirstChild();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test163() {}
//   public void test163() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test163"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
//     var0.popEdgeAnnotations();
// 
//   }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test164"); }


    com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    com.google.javascript.rhino.Node var3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode((com.google.javascript.jscomp.CodingConvention)var1, "hi!");
    com.google.javascript.rhino.Node var7 = new com.google.javascript.rhino.Node(0, 100, 0);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.script();
    boolean var9 = var8.isCatch();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.script();
    boolean var11 = var10.isCatch();
    boolean var12 = var10.isDec();
    var8.addChildrenToBack(var10);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.script();
    boolean var15 = var14.isCatch();
    boolean var16 = var14.isDec();
    var10.addChildrenToBack(var14);
    com.google.javascript.rhino.Node var18 = var10.getParent();
    com.google.javascript.rhino.Node var19 = var18.cloneNode();
    com.google.javascript.rhino.Node var22 = new com.google.javascript.rhino.Node((-1), var3, var7, var18, 0, 0);
    boolean var23 = var18.isAssignAdd();
    boolean var24 = var18.isScript();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test165"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
    boolean var4 = var2.isForwardDeclaredType("");
    var2.incrementGeneration();
    com.google.javascript.rhino.ErrorReporter var6 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var6, false);
    com.google.javascript.rhino.jstype.ObjectType var9 = null;
    com.google.javascript.rhino.jstype.ObjectType var10 = var8.createObjectType(var9);
    com.google.javascript.rhino.ErrorReporter var11 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11, false);
    com.google.javascript.rhino.jstype.ObjectType var14 = null;
    com.google.javascript.rhino.jstype.ObjectType var15 = var13.createObjectType(var14);
    boolean var16 = var15.isString();
    boolean var17 = var2.resetImplicitPrototype((com.google.javascript.rhino.jstype.JSType)var9, var15);
    com.google.javascript.rhino.ErrorReporter var18 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18, false);
    com.google.javascript.rhino.ErrorReporter var21 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21, false);
    boolean var25 = var23.isForwardDeclaredType("");
    com.google.javascript.rhino.jstype.JSType var27 = null;
    var23.unregisterPropertyOnType("", var27);
    com.google.javascript.rhino.ErrorReporter var29 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29, false);
    com.google.javascript.rhino.jstype.JSType var32 = null;
    com.google.javascript.rhino.jstype.JSType var34 = var31.getGreatestSubtypeWithProperty(var32, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var35 = var34.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var36 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var36, false);
    com.google.javascript.rhino.jstype.ObjectType var39 = null;
    com.google.javascript.rhino.jstype.ObjectType var40 = var38.createObjectType(var39);
    boolean var41 = var40.isString();
    var34.matchConstraint(var40);
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.script();
    boolean var44 = var43.isCatch();
    var43.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.script();
    boolean var49 = var43.isEquivalentTo(var48);
    com.google.javascript.rhino.ErrorReporter var50 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var50, false);
    com.google.javascript.rhino.jstype.JSType var53 = null;
    com.google.javascript.rhino.jstype.JSType var55 = var52.getGreatestSubtypeWithProperty(var53, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var56 = var55.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var57 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var57, false);
    com.google.javascript.rhino.jstype.ObjectType var60 = null;
    com.google.javascript.rhino.jstype.ObjectType var61 = var59.createObjectType(var60);
    boolean var62 = var61.isString();
    var55.matchConstraint(var61);
    var43.setJSType(var55);
    boolean var65 = var55.isNumber();
    com.google.javascript.rhino.jstype.JSType var66 = var34.getGreatestSubtype(var55);
    com.google.javascript.rhino.jstype.JSType[] var67 = new com.google.javascript.rhino.jstype.JSType[] { var34};
    com.google.javascript.rhino.Node var68 = var23.createParameters(var67);
    com.google.javascript.rhino.jstype.JSType var69 = var20.createUnionType(var67);
    com.google.javascript.rhino.Node var70 = var2.createParameters(var67);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var70.setString("module$");
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
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

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test166"); }


    com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.util.Collection var1 = var0.getAssertionFunctions();
    boolean var3 = var0.isConstant("SCRIPT");
    java.lang.String var4 = var0.getAbstractMethodName();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.script();
    boolean var6 = var5.isAnd();
    int var7 = var5.getSourceOffset();
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.script();
    boolean var9 = var8.isAnd();
    boolean var10 = var8.isDec();
    com.google.javascript.rhino.Node var11 = var5.clonePropsFrom(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var0.isOptionalParameter(var8);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "goog.abstractMethod"+ "'", var4.equals("goog.abstractMethod"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test167() {}
//   public void test167() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test167"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
//     boolean var4 = var2.isForwardDeclaredType("");
//     var2.incrementGeneration();
//     com.google.javascript.rhino.ErrorReporter var6 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var6, false);
//     com.google.javascript.rhino.jstype.ObjectType var9 = null;
//     com.google.javascript.rhino.jstype.ObjectType var10 = var8.createObjectType(var9);
//     com.google.javascript.rhino.ErrorReporter var11 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11, false);
//     com.google.javascript.rhino.jstype.ObjectType var14 = null;
//     com.google.javascript.rhino.jstype.ObjectType var15 = var13.createObjectType(var14);
//     boolean var16 = var15.isString();
//     boolean var17 = var2.resetImplicitPrototype((com.google.javascript.rhino.jstype.JSType)var9, var15);
//     com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.script();
//     boolean var19 = var18.isCatch();
//     var18.putIntProp((-1), 0);
//     com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.script();
//     boolean var24 = var18.isEquivalentTo(var23);
//     com.google.javascript.rhino.ErrorReporter var25 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25, false);
//     com.google.javascript.rhino.jstype.JSType var28 = null;
//     com.google.javascript.rhino.jstype.JSType var30 = var27.getGreatestSubtypeWithProperty(var28, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var31 = var30.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var32 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32, false);
//     com.google.javascript.rhino.jstype.ObjectType var35 = null;
//     com.google.javascript.rhino.jstype.ObjectType var36 = var34.createObjectType(var35);
//     boolean var37 = var36.isString();
//     var30.matchConstraint(var36);
//     var18.setJSType(var30);
//     com.google.javascript.rhino.jstype.JSType var41 = var30.getRestrictedTypeGivenToBooleanOutcome(true);
//     com.google.javascript.rhino.ErrorReporter var42 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var42, false);
//     boolean var46 = var44.isForwardDeclaredType("");
//     com.google.javascript.rhino.jstype.JSType var48 = null;
//     var44.unregisterPropertyOnType("", var48);
//     com.google.javascript.rhino.ErrorReporter var50 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var50, false);
//     com.google.javascript.rhino.jstype.JSType var53 = null;
//     com.google.javascript.rhino.jstype.JSType var55 = var52.getGreatestSubtypeWithProperty(var53, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var56 = var55.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var57 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var57, false);
//     com.google.javascript.rhino.jstype.ObjectType var60 = null;
//     com.google.javascript.rhino.jstype.ObjectType var61 = var59.createObjectType(var60);
//     boolean var62 = var61.isString();
//     var55.matchConstraint(var61);
//     com.google.javascript.rhino.Node var64 = com.google.javascript.rhino.IR.script();
//     boolean var65 = var64.isCatch();
//     var64.putIntProp((-1), 0);
//     com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.IR.script();
//     boolean var70 = var64.isEquivalentTo(var69);
//     com.google.javascript.rhino.ErrorReporter var71 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var71, false);
//     com.google.javascript.rhino.jstype.JSType var74 = null;
//     com.google.javascript.rhino.jstype.JSType var76 = var73.getGreatestSubtypeWithProperty(var74, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var77 = var76.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var78 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var78, false);
//     com.google.javascript.rhino.jstype.ObjectType var81 = null;
//     com.google.javascript.rhino.jstype.ObjectType var82 = var80.createObjectType(var81);
//     boolean var83 = var82.isString();
//     var76.matchConstraint(var82);
//     var64.setJSType(var76);
//     boolean var86 = var76.isNumber();
//     com.google.javascript.rhino.jstype.JSType var87 = var55.getGreatestSubtype(var76);
//     com.google.javascript.rhino.jstype.JSType[] var88 = new com.google.javascript.rhino.jstype.JSType[] { var55};
//     com.google.javascript.rhino.Node var89 = var44.createParameters(var88);
//     com.google.javascript.rhino.jstype.FunctionType var90 = var2.createFunctionTypeWithVarArgs(var41, var88);
//     com.google.javascript.rhino.jstype.ObjectType var91 = var90.getTypeOfThis();
//     com.google.javascript.rhino.jstype.FunctionType var93 = var90.getBindReturnType(1);
//     com.google.javascript.rhino.jstype.JSType var94 = null;
//     com.google.javascript.rhino.jstype.JSType.TypePair var95 = var90.getTypesUnderShallowEquality(var94);
// 
//   }

  public void test168() {}
//   public void test168() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test168"); }
// 
// 
//     com.google.javascript.jscomp.MessageFormatter var0 = null;
//     java.util.logging.Logger var1 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var2 = new com.google.javascript.jscomp.LoggerErrorManager(var0, var1);
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.DiagnosticGroup var7 = com.google.javascript.jscomp.DiagnosticGroup.forType(var6);
//     com.google.javascript.jscomp.DiagnosticType[] var8 = new com.google.javascript.jscomp.DiagnosticType[] { var6};
//     com.google.javascript.jscomp.DiagnosticGroup var9 = new com.google.javascript.jscomp.DiagnosticGroup(var8);
//     com.google.javascript.jscomp.CheckLevel var13 = null;
//     com.google.javascript.jscomp.DiagnosticType var16 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.DiagnosticGroup var17 = com.google.javascript.jscomp.DiagnosticGroup.forType(var16);
//     com.google.javascript.jscomp.AstValidator var18 = new com.google.javascript.jscomp.AstValidator();
//     boolean var19 = var16.equals((java.lang.Object)var18);
//     java.lang.String[] var21 = new java.lang.String[] { "None"};
//     com.google.javascript.jscomp.JSError var22 = com.google.javascript.jscomp.JSError.make("module$", 1, 1, var13, var16, var21);
//     boolean var23 = var9.matches(var22);
//     int var24 = var22.getNodeLength();
//     var2.println(var3, var22);
// 
//   }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test169"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
    boolean var4 = var2.isForwardDeclaredType("");
    var2.incrementGeneration();
    com.google.javascript.rhino.ErrorReporter var6 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var6, false);
    com.google.javascript.rhino.jstype.ObjectType var9 = null;
    com.google.javascript.rhino.jstype.ObjectType var10 = var8.createObjectType(var9);
    com.google.javascript.rhino.ErrorReporter var11 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11, false);
    com.google.javascript.rhino.jstype.ObjectType var14 = null;
    com.google.javascript.rhino.jstype.ObjectType var15 = var13.createObjectType(var14);
    boolean var16 = var15.isString();
    boolean var17 = var2.resetImplicitPrototype((com.google.javascript.rhino.jstype.JSType)var9, var15);
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.script();
    boolean var19 = var18.isCatch();
    var18.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.script();
    boolean var24 = var18.isEquivalentTo(var23);
    com.google.javascript.rhino.ErrorReporter var25 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25, false);
    com.google.javascript.rhino.jstype.JSType var28 = null;
    com.google.javascript.rhino.jstype.JSType var30 = var27.getGreatestSubtypeWithProperty(var28, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var31 = var30.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var32 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32, false);
    com.google.javascript.rhino.jstype.ObjectType var35 = null;
    com.google.javascript.rhino.jstype.ObjectType var36 = var34.createObjectType(var35);
    boolean var37 = var36.isString();
    var30.matchConstraint(var36);
    var18.setJSType(var30);
    com.google.javascript.rhino.jstype.JSType var41 = var30.getRestrictedTypeGivenToBooleanOutcome(true);
    com.google.javascript.rhino.ErrorReporter var42 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var42, false);
    boolean var46 = var44.isForwardDeclaredType("");
    com.google.javascript.rhino.jstype.JSType var48 = null;
    var44.unregisterPropertyOnType("", var48);
    com.google.javascript.rhino.ErrorReporter var50 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var50, false);
    com.google.javascript.rhino.jstype.JSType var53 = null;
    com.google.javascript.rhino.jstype.JSType var55 = var52.getGreatestSubtypeWithProperty(var53, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var56 = var55.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var57 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var57, false);
    com.google.javascript.rhino.jstype.ObjectType var60 = null;
    com.google.javascript.rhino.jstype.ObjectType var61 = var59.createObjectType(var60);
    boolean var62 = var61.isString();
    var55.matchConstraint(var61);
    com.google.javascript.rhino.Node var64 = com.google.javascript.rhino.IR.script();
    boolean var65 = var64.isCatch();
    var64.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.IR.script();
    boolean var70 = var64.isEquivalentTo(var69);
    com.google.javascript.rhino.ErrorReporter var71 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var71, false);
    com.google.javascript.rhino.jstype.JSType var74 = null;
    com.google.javascript.rhino.jstype.JSType var76 = var73.getGreatestSubtypeWithProperty(var74, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var77 = var76.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var78 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var78, false);
    com.google.javascript.rhino.jstype.ObjectType var81 = null;
    com.google.javascript.rhino.jstype.ObjectType var82 = var80.createObjectType(var81);
    boolean var83 = var82.isString();
    var76.matchConstraint(var82);
    var64.setJSType(var76);
    boolean var86 = var76.isNumber();
    com.google.javascript.rhino.jstype.JSType var87 = var55.getGreatestSubtype(var76);
    com.google.javascript.rhino.jstype.JSType[] var88 = new com.google.javascript.rhino.jstype.JSType[] { var55};
    com.google.javascript.rhino.Node var89 = var44.createParameters(var88);
    com.google.javascript.rhino.jstype.FunctionType var90 = var2.createFunctionTypeWithVarArgs(var41, var88);
    com.google.javascript.rhino.jstype.ObjectType var91 = var90.getTypeOfThis();
    var90.clearCachedValues();
    boolean var93 = var90.isOrdinaryFunction();
    var90.clearCachedValues();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.FunctionType var95 = var90.getSuperClassConstructor();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == true);
    
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
    assertTrue(var93 == true);

  }

  public void test170() {}
//   public void test170() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test170"); }
// 
// 
//     com.google.javascript.jscomp.AbstractCompiler var0 = null;
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.script();
//     boolean var2 = var1.isCatch();
//     var1.putIntProp((-1), 0);
//     com.google.javascript.jscomp.NodeTraversal.Callback var6 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverse(var0, var1, var6);
// 
//   }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test171"); }


    com.google.javascript.jscomp.AstValidator var0 = new com.google.javascript.jscomp.AstValidator();
    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.script();
    boolean var2 = var1.isCatch();
    var1.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.script();
    boolean var7 = var1.isEquivalentTo(var6);
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8, false);
    com.google.javascript.rhino.jstype.JSType var11 = null;
    com.google.javascript.rhino.jstype.JSType var13 = var10.getGreatestSubtypeWithProperty(var11, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var14 = var13.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var15 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var15, false);
    com.google.javascript.rhino.jstype.ObjectType var18 = null;
    com.google.javascript.rhino.jstype.ObjectType var19 = var17.createObjectType(var18);
    boolean var20 = var19.isString();
    var13.matchConstraint(var19);
    var1.setJSType(var13);
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.script();
    boolean var24 = var23.isAnd();
    boolean var25 = var23.isDec();
    com.google.javascript.rhino.Node var26 = null;
    var1.addChildAfter(var23, var26);
    boolean var28 = var1.isGetterDef();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.validateStatement(var1);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test172() {}
//   public void test172() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test172"); }
// 
// 
//     com.google.javascript.jscomp.MessageFormatter var0 = null;
//     java.util.logging.Logger var1 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var2 = new com.google.javascript.jscomp.LoggerErrorManager(var0, var1);
//     var2.setTypedPercent(1.0d);
//     com.google.javascript.jscomp.DiagnosticType var7 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.DiagnosticGroup var8 = com.google.javascript.jscomp.DiagnosticGroup.forType(var7);
//     com.google.javascript.jscomp.DiagnosticType[] var9 = new com.google.javascript.jscomp.DiagnosticType[] { var7};
//     com.google.javascript.jscomp.DiagnosticGroup var10 = new com.google.javascript.jscomp.DiagnosticGroup(var9);
//     com.google.javascript.jscomp.CheckLevel var14 = null;
//     com.google.javascript.jscomp.DiagnosticType var17 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.DiagnosticGroup var18 = com.google.javascript.jscomp.DiagnosticGroup.forType(var17);
//     com.google.javascript.jscomp.AstValidator var19 = new com.google.javascript.jscomp.AstValidator();
//     boolean var20 = var17.equals((java.lang.Object)var19);
//     java.lang.String[] var22 = new java.lang.String[] { "None"};
//     com.google.javascript.jscomp.JSError var23 = com.google.javascript.jscomp.JSError.make("module$", 1, 1, var14, var17, var22);
//     boolean var24 = var10.matches(var23);
//     com.google.javascript.jscomp.CheckLevel var25 = var23.getDefaultLevel();
//     java.lang.Class var26 = var25.getDeclaringClass();
//     com.google.javascript.jscomp.JSError var27 = null;
//     var2.report(var25, var27);
// 
//   }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test173"); }


    com.google.javascript.jscomp.AstValidator var0 = new com.google.javascript.jscomp.AstValidator();
    com.google.javascript.rhino.ErrorReporter var1 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var1, false);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    com.google.javascript.rhino.jstype.JSType var6 = var3.getGreatestSubtypeWithProperty(var4, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var7 = var6.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8, false);
    com.google.javascript.rhino.jstype.ObjectType var11 = null;
    com.google.javascript.rhino.jstype.ObjectType var12 = var10.createObjectType(var11);
    boolean var13 = var12.isString();
    var6.matchConstraint(var12);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.script();
    boolean var18 = var17.isCatch();
    var17.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.script();
    boolean var23 = var17.isEquivalentTo(var22);
    com.google.javascript.rhino.ErrorReporter var24 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24, false);
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.rhino.jstype.JSType var29 = var26.getGreatestSubtypeWithProperty(var27, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var30 = var29.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var31 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var31, false);
    com.google.javascript.rhino.jstype.ObjectType var34 = null;
    com.google.javascript.rhino.jstype.ObjectType var35 = var33.createObjectType(var34);
    boolean var36 = var35.isString();
    var29.matchConstraint(var35);
    var17.setJSType(var29);
    boolean var39 = var29.isNumber();
    com.google.javascript.rhino.jstype.JSType var40 = var29.restrictByNotNullOrUndefined();
    com.google.javascript.rhino.jstype.SimpleSlot var42 = new com.google.javascript.rhino.jstype.SimpleSlot("", var40, true);
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.script();
    boolean var44 = var43.isCatch();
    var43.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.script();
    boolean var49 = var43.isEquivalentTo(var48);
    com.google.javascript.rhino.ErrorReporter var50 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var50, false);
    com.google.javascript.rhino.jstype.JSType var53 = null;
    com.google.javascript.rhino.jstype.JSType var55 = var52.getGreatestSubtypeWithProperty(var53, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var56 = var55.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var57 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var57, false);
    com.google.javascript.rhino.jstype.ObjectType var60 = null;
    com.google.javascript.rhino.jstype.ObjectType var61 = var59.createObjectType(var60);
    boolean var62 = var61.isString();
    var55.matchConstraint(var61);
    var43.setJSType(var55);
    int var65 = var43.getSourcePosition();
    boolean var66 = var12.defineSynthesizedProperty("", var40, var43);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.validateExpression(var43);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test174"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
    boolean var1 = var0.isCatch();
    boolean var2 = var0.isDec();
    java.lang.String var3 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(var0);
    com.google.javascript.rhino.Node[] var4 = new com.google.javascript.rhino.Node[] { var0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.objectlit(var4);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test175"); }


    java.lang.String var1 = com.google.javascript.rhino.ScriptRuntime.escapeString("function (function (this:me, {1585222203}): me): function (this:me, {1147441139}): me");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "function (function (this:me, {1585222203}): me): function (this:me, {1147441139}): me"+ "'", var1.equals("function (function (this:me, {1585222203}): me): function (this:me, {1147441139}): me"));

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test176"); }


    com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromCode("SCRIPT", "");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = var2.getLineOffset((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test177"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.script();
    boolean var2 = var1.isCatch();
    var1.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.script();
    boolean var7 = var1.isEquivalentTo(var6);
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8, false);
    com.google.javascript.rhino.jstype.JSType var11 = null;
    com.google.javascript.rhino.jstype.JSType var13 = var10.getGreatestSubtypeWithProperty(var11, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var14 = var13.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var15 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var15, false);
    com.google.javascript.rhino.jstype.ObjectType var18 = null;
    com.google.javascript.rhino.jstype.ObjectType var19 = var17.createObjectType(var18);
    boolean var20 = var19.isString();
    var13.matchConstraint(var19);
    var1.setJSType(var13);
    boolean var23 = var13.isNumber();
    com.google.javascript.rhino.jstype.JSType var24 = var13.restrictByNotNullOrUndefined();
    boolean var25 = var24.isStringObjectType();
    com.google.javascript.rhino.jstype.UnionType var26 = var24.toMaybeUnionType();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var27 = var0.createDirectedGraphNode((java.lang.Object)var24);
    com.google.javascript.rhino.ErrorReporter var28 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var28, false);
    boolean var32 = var30.isForwardDeclaredType("");
    var30.incrementGeneration();
    com.google.javascript.rhino.ErrorReporter var34 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var34, false);
    com.google.javascript.rhino.jstype.ObjectType var37 = null;
    com.google.javascript.rhino.jstype.ObjectType var38 = var36.createObjectType(var37);
    com.google.javascript.rhino.ErrorReporter var39 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var39, false);
    com.google.javascript.rhino.jstype.ObjectType var42 = null;
    com.google.javascript.rhino.jstype.ObjectType var43 = var41.createObjectType(var42);
    boolean var44 = var43.isString();
    boolean var45 = var30.resetImplicitPrototype((com.google.javascript.rhino.jstype.JSType)var37, var43);
    com.google.javascript.rhino.ErrorReporter var47 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var47, false);
    com.google.javascript.rhino.jstype.ObjectType var50 = null;
    com.google.javascript.rhino.jstype.ObjectType var51 = var49.createObjectType(var50);
    boolean var52 = var51.isString();
    com.google.javascript.rhino.JSDocInfo var53 = null;
    var51.setJSDocInfo(var53);
    com.google.javascript.rhino.JSDocInfo var55 = var51.getJSDocInfo();
    boolean var56 = var30.declareType("", (com.google.javascript.rhino.jstype.JSType)var51);
    com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.script();
    boolean var58 = var57.isCatch();
    com.google.javascript.rhino.Node var59 = com.google.javascript.rhino.IR.script();
    boolean var60 = var59.isCatch();
    boolean var61 = var59.isDec();
    var57.addChildrenToBack(var59);
    com.google.javascript.rhino.jstype.JSType var63 = var59.getJSType();
    com.google.javascript.rhino.Node var64 = var59.getParent();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var65 = var0.isConnected((java.lang.Object)"", (java.lang.Object)var64);
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
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test178"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
    boolean var1 = var0.isCatch();
    var0.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.script();
    boolean var6 = var0.isEquivalentTo(var5);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.script();
    boolean var8 = var7.isAnd();
    int var9 = var7.getSourceOffset();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.script();
    boolean var11 = var10.isAnd();
    boolean var12 = var10.isDec();
    com.google.javascript.rhino.Node var13 = var7.clonePropsFrom(var10);
    com.google.javascript.rhino.Node var14 = var5.copyInformationFrom(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.continueNode(var7);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test179() {}
//   public void test179() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test179"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.continueNode();
//     java.util.Set var2 = null;
//     var1.setDirectives(var2);
//     boolean var4 = var1.isDebugger();
//     com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.script();
//     boolean var6 = var5.isAnd();
//     boolean var7 = var5.isDec();
//     boolean var8 = var5.isExprResult();
//     com.google.javascript.rhino.JSDocInfo var9 = var5.getJSDocInfo();
//     com.google.javascript.rhino.InputId var10 = com.google.javascript.jscomp.NodeUtil.getInputId(var5);
//     java.lang.String var11 = var5.toString();
//     java.lang.String var12 = var0.extractClassNameIfProvide(var1, var5);
//     com.google.javascript.rhino.Node var16 = new com.google.javascript.rhino.Node(0, (-1), 10);
//     com.google.javascript.jscomp.CodingConvention.SubclassRelationship var17 = var0.getClassesDefinedByCall(var16);
// 
//   }

  public void test180() {}
//   public void test180() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test180"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
//     boolean var4 = var2.isForwardDeclaredType("");
//     var2.incrementGeneration();
//     com.google.javascript.rhino.ErrorReporter var6 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var6, false);
//     com.google.javascript.rhino.jstype.ObjectType var9 = null;
//     com.google.javascript.rhino.jstype.ObjectType var10 = var8.createObjectType(var9);
//     com.google.javascript.rhino.ErrorReporter var11 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11, false);
//     com.google.javascript.rhino.jstype.ObjectType var14 = null;
//     com.google.javascript.rhino.jstype.ObjectType var15 = var13.createObjectType(var14);
//     boolean var16 = var15.isString();
//     boolean var17 = var2.resetImplicitPrototype((com.google.javascript.rhino.jstype.JSType)var9, var15);
//     com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.script();
//     boolean var19 = var18.isCatch();
//     var18.putIntProp((-1), 0);
//     com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.script();
//     boolean var24 = var18.isEquivalentTo(var23);
//     com.google.javascript.rhino.ErrorReporter var25 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25, false);
//     com.google.javascript.rhino.jstype.JSType var28 = null;
//     com.google.javascript.rhino.jstype.JSType var30 = var27.getGreatestSubtypeWithProperty(var28, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var31 = var30.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var32 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32, false);
//     com.google.javascript.rhino.jstype.ObjectType var35 = null;
//     com.google.javascript.rhino.jstype.ObjectType var36 = var34.createObjectType(var35);
//     boolean var37 = var36.isString();
//     var30.matchConstraint(var36);
//     var18.setJSType(var30);
//     com.google.javascript.rhino.jstype.JSType var41 = var30.getRestrictedTypeGivenToBooleanOutcome(true);
//     com.google.javascript.rhino.ErrorReporter var42 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var42, false);
//     boolean var46 = var44.isForwardDeclaredType("");
//     com.google.javascript.rhino.jstype.JSType var48 = null;
//     var44.unregisterPropertyOnType("", var48);
//     com.google.javascript.rhino.ErrorReporter var50 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var50, false);
//     com.google.javascript.rhino.jstype.JSType var53 = null;
//     com.google.javascript.rhino.jstype.JSType var55 = var52.getGreatestSubtypeWithProperty(var53, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var56 = var55.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var57 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var57, false);
//     com.google.javascript.rhino.jstype.ObjectType var60 = null;
//     com.google.javascript.rhino.jstype.ObjectType var61 = var59.createObjectType(var60);
//     boolean var62 = var61.isString();
//     var55.matchConstraint(var61);
//     com.google.javascript.rhino.Node var64 = com.google.javascript.rhino.IR.script();
//     boolean var65 = var64.isCatch();
//     var64.putIntProp((-1), 0);
//     com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.IR.script();
//     boolean var70 = var64.isEquivalentTo(var69);
//     com.google.javascript.rhino.ErrorReporter var71 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var71, false);
//     com.google.javascript.rhino.jstype.JSType var74 = null;
//     com.google.javascript.rhino.jstype.JSType var76 = var73.getGreatestSubtypeWithProperty(var74, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var77 = var76.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var78 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var78, false);
//     com.google.javascript.rhino.jstype.ObjectType var81 = null;
//     com.google.javascript.rhino.jstype.ObjectType var82 = var80.createObjectType(var81);
//     boolean var83 = var82.isString();
//     var76.matchConstraint(var82);
//     var64.setJSType(var76);
//     boolean var86 = var76.isNumber();
//     com.google.javascript.rhino.jstype.JSType var87 = var55.getGreatestSubtype(var76);
//     com.google.javascript.rhino.jstype.JSType[] var88 = new com.google.javascript.rhino.jstype.JSType[] { var55};
//     com.google.javascript.rhino.Node var89 = var44.createParameters(var88);
//     com.google.javascript.rhino.jstype.FunctionType var90 = var2.createFunctionTypeWithVarArgs(var41, var88);
//     java.lang.String var91 = var90.toDebugHashCodeString();
//     boolean var92 = var90.canBeCalled();
//     boolean var93 = var90.hasCachedValues();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.jstype.ObjectType var94 = var90.getInstanceType();
//       fail("Expected exception of type java.lang.IllegalStateException");
//     } catch (java.lang.IllegalStateException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var10);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var23);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var24 == true);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var30);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var31);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var36);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var37 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var41);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var46 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var55);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var56);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var61);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var62 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var64);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var65 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var69);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var70 == true);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var76);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var77);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var82);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var83 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var86 == true);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var87);
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
//     assertTrue("'" + var91 + "' != '" + "function (function (this:me, {1171696270}): me): function (this:me, {274166900}): me"+ "'", var91.equals("function (function (this:me, {1171696270}): me): function (this:me, {274166900}): me"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var92 == true);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var93 == false);
// 
//   }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test181"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.script();
    boolean var2 = var1.isCatch();
    var1.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.script();
    boolean var7 = var1.isEquivalentTo(var6);
    com.google.javascript.rhino.Node var10 = new com.google.javascript.rhino.Node(0, var1, (-1), 0);
    com.google.javascript.rhino.Node var11 = var10.getParent();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var12 = var10.getString();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test182"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.script();
    boolean var2 = var1.isCatch();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.script();
    boolean var4 = var3.isCatch();
    boolean var5 = var3.isDec();
    var1.addChildrenToBack(var3);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.script();
    boolean var8 = var7.isCatch();
    boolean var9 = var7.isDec();
    var3.addChildrenToBack(var7);
    int var11 = var7.getLength();
    int var12 = var7.getLength();
    com.google.javascript.rhino.jstype.JSType var13 = var7.getJSType();
    boolean var14 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(var7);
    com.google.javascript.jscomp.GoogleCodingConvention var16 = new com.google.javascript.jscomp.GoogleCodingConvention();
    com.google.javascript.rhino.Node var18 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode((com.google.javascript.jscomp.CodingConvention)var16, "hi!");
    com.google.javascript.rhino.Node var22 = new com.google.javascript.rhino.Node(0, 100, 0);
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.script();
    boolean var24 = var23.isCatch();
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.script();
    boolean var26 = var25.isCatch();
    boolean var27 = var25.isDec();
    var23.addChildrenToBack(var25);
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.script();
    boolean var30 = var29.isCatch();
    boolean var31 = var29.isDec();
    var25.addChildrenToBack(var29);
    com.google.javascript.rhino.Node var33 = var25.getParent();
    com.google.javascript.rhino.Node var34 = var33.cloneNode();
    com.google.javascript.rhino.Node var37 = new com.google.javascript.rhino.Node((-1), var18, var22, var33, 0, 0);
    com.google.javascript.rhino.Node var38 = null;
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.string("hi!");
    com.google.javascript.rhino.Node var42 = var41.getNext();
    com.google.javascript.rhino.Node var43 = var41.getLastSibling();
    com.google.javascript.rhino.Node var44 = new com.google.javascript.rhino.Node((-1), var43);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var45 = new com.google.javascript.rhino.Node(10, var7, var22, var38, var44);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test183"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.continueNode();
    java.util.Set var1 = null;
    var0.setDirectives(var1);
    boolean var3 = var0.isDebugger();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.string("hi!");
    boolean var6 = var5.isWhile();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.script();
    boolean var8 = var7.isAnd();
    boolean var9 = var7.isDec();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.script();
    boolean var11 = var10.isCatch();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.script();
    boolean var13 = var12.isCatch();
    boolean var14 = var12.isDec();
    var10.addChildrenToBack(var12);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.script();
    boolean var17 = var16.isCatch();
    boolean var18 = var16.isDec();
    var12.addChildrenToBack(var16);
    com.google.javascript.rhino.Node var20 = var12.getParent();
    com.google.javascript.rhino.Node var21 = var20.cloneNode();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.forNode(var0, var5, var7, var20);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test184"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.DiagnosticGroup var3 = com.google.javascript.jscomp.DiagnosticGroup.forType(var2);
    com.google.javascript.jscomp.CheckLevel var7 = null;
    com.google.javascript.jscomp.DiagnosticType var10 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.DiagnosticGroup var11 = com.google.javascript.jscomp.DiagnosticGroup.forType(var10);
    com.google.javascript.jscomp.AstValidator var12 = new com.google.javascript.jscomp.AstValidator();
    boolean var13 = var10.equals((java.lang.Object)var12);
    java.lang.String[] var15 = new java.lang.String[] { "None"};
    com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("module$", 1, 1, var7, var10, var15);
    com.google.javascript.jscomp.JSError var17 = com.google.javascript.jscomp.JSError.make(var2, var15);
    com.google.javascript.jscomp.DiagnosticGroup var18 = com.google.javascript.jscomp.DiagnosticGroup.forType(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test185"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("hi!");
    boolean var2 = var1.isDo();
    com.google.javascript.rhino.JSTypeExpression var4 = new com.google.javascript.rhino.JSTypeExpression(var1, "module$");
    com.google.javascript.rhino.Node var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.propdef(var1, var5);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test186() {}
//   public void test186() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test186"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.rhino.InputId var2 = new com.google.javascript.rhino.InputId("");
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var0, var2, true);
//     com.google.javascript.rhino.InputId var5 = var4.getInputId();
//     com.google.javascript.jscomp.CompilerInput var8 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var4, "goog.exportSymbol", false);
// 
//   }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test187"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.VariableRenamingPolicy var1 = com.google.javascript.jscomp.VariableRenamingPolicy.valueOf("function (function (this:me, {867027876}): me): function (this:me, {1460967037}): me");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test188"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.block();
    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.continueNode();
    java.util.Set var2 = null;
    var1.setDirectives(var2);
    boolean var4 = var1.isDebugger();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.sheq(var0, var1);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test189"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    java.util.Collection var1 = var0.getIndirectlyDeclaredProperties();
    java.lang.String var2 = var0.getExportSymbolFunction();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "goog.exportSymbol"+ "'", var2.equals("goog.exportSymbol"));

  }

  public void test190() {}
//   public void test190() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test190"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
//     boolean var1 = var0.isCatch();
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.script();
//     boolean var3 = var2.isCatch();
//     boolean var4 = var2.isDec();
//     var0.addChildrenToBack(var2);
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.script();
//     boolean var7 = var6.isCatch();
//     boolean var8 = var6.isDec();
//     var2.addChildrenToBack(var6);
//     com.google.javascript.rhino.Node var10 = var2.getParent();
//     com.google.javascript.rhino.Node var11 = var10.cloneNode();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var13 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
//     java.lang.Iterable var14 = var13.getDirectedGraphNodes();
//     com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newNumber(100.0d);
//     boolean var17 = var13.hasNode((java.lang.Object)var16);
//     var10.putProp((-1), (java.lang.Object)var13);
//     var13.popEdgeAnnotations();
// 
//   }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test191"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.script();
    boolean var2 = var1.isCatch();
    var1.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.script();
    boolean var7 = var1.isEquivalentTo(var6);
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8, false);
    com.google.javascript.rhino.jstype.JSType var11 = null;
    com.google.javascript.rhino.jstype.JSType var13 = var10.getGreatestSubtypeWithProperty(var11, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var14 = var13.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var15 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var15, false);
    com.google.javascript.rhino.jstype.ObjectType var18 = null;
    com.google.javascript.rhino.jstype.ObjectType var19 = var17.createObjectType(var18);
    boolean var20 = var19.isString();
    var13.matchConstraint(var19);
    var1.setJSType(var13);
    boolean var23 = var13.isNumber();
    com.google.javascript.rhino.jstype.JSType var24 = var13.restrictByNotNullOrUndefined();
    com.google.javascript.rhino.jstype.SimpleSlot var26 = new com.google.javascript.rhino.jstype.SimpleSlot("", var24, true);
    com.google.javascript.rhino.jstype.JSType var27 = var26.getType();
    boolean var28 = var27.hasAnyTemplate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test192"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.thisNode();
    var0.addSuppression("function (function (this:me, {247039238}): me): function (this:me, {902583415}): me");
    com.google.javascript.rhino.Node var4 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString("hi!");
    var4.setIsSyntheticBlock(false);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.name("hi!");
    boolean var9 = var8.isDo();
    boolean var10 = var8.isFalse();
    java.lang.String var11 = var4.checkTreeEquals(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.caseNode(var0, var8);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Node tree inequality:\nTree1:\nBANG 0\n    STRING hi 0 [length: 2]\n\n\nTree2:\nNAME hi!\n\n\nSubtree1: BANG 0\n    STRING hi 0 [length: 2]\n\n\nSubtree2: NAME hi!\n"+ "'", var11.equals("Node tree inequality:\nTree1:\nBANG 0\n    STRING hi 0 [length: 2]\n\n\nTree2:\nNAME hi!\n\n\nSubtree1: BANG 0\n    STRING hi 0 [length: 2]\n\n\nSubtree2: NAME hi!\n"));

  }

  public void test193() {}
//   public void test193() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test193"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
//     boolean var4 = var2.isForwardDeclaredType("");
//     var2.incrementGeneration();
//     com.google.javascript.rhino.ErrorReporter var6 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var6, false);
//     com.google.javascript.rhino.jstype.ObjectType var9 = null;
//     com.google.javascript.rhino.jstype.ObjectType var10 = var8.createObjectType(var9);
//     com.google.javascript.rhino.ErrorReporter var11 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11, false);
//     com.google.javascript.rhino.jstype.ObjectType var14 = null;
//     com.google.javascript.rhino.jstype.ObjectType var15 = var13.createObjectType(var14);
//     boolean var16 = var15.isString();
//     boolean var17 = var2.resetImplicitPrototype((com.google.javascript.rhino.jstype.JSType)var9, var15);
//     com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.script();
//     boolean var19 = var18.isCatch();
//     var18.putIntProp((-1), 0);
//     com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.script();
//     boolean var24 = var18.isEquivalentTo(var23);
//     com.google.javascript.rhino.ErrorReporter var25 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25, false);
//     com.google.javascript.rhino.jstype.JSType var28 = null;
//     com.google.javascript.rhino.jstype.JSType var30 = var27.getGreatestSubtypeWithProperty(var28, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var31 = var30.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var32 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32, false);
//     com.google.javascript.rhino.jstype.ObjectType var35 = null;
//     com.google.javascript.rhino.jstype.ObjectType var36 = var34.createObjectType(var35);
//     boolean var37 = var36.isString();
//     var30.matchConstraint(var36);
//     var18.setJSType(var30);
//     com.google.javascript.rhino.jstype.JSType var41 = var30.getRestrictedTypeGivenToBooleanOutcome(true);
//     com.google.javascript.rhino.ErrorReporter var42 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var42, false);
//     boolean var46 = var44.isForwardDeclaredType("");
//     com.google.javascript.rhino.jstype.JSType var48 = null;
//     var44.unregisterPropertyOnType("", var48);
//     com.google.javascript.rhino.ErrorReporter var50 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var50, false);
//     com.google.javascript.rhino.jstype.JSType var53 = null;
//     com.google.javascript.rhino.jstype.JSType var55 = var52.getGreatestSubtypeWithProperty(var53, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var56 = var55.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var57 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var57, false);
//     com.google.javascript.rhino.jstype.ObjectType var60 = null;
//     com.google.javascript.rhino.jstype.ObjectType var61 = var59.createObjectType(var60);
//     boolean var62 = var61.isString();
//     var55.matchConstraint(var61);
//     com.google.javascript.rhino.Node var64 = com.google.javascript.rhino.IR.script();
//     boolean var65 = var64.isCatch();
//     var64.putIntProp((-1), 0);
//     com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.IR.script();
//     boolean var70 = var64.isEquivalentTo(var69);
//     com.google.javascript.rhino.ErrorReporter var71 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var71, false);
//     com.google.javascript.rhino.jstype.JSType var74 = null;
//     com.google.javascript.rhino.jstype.JSType var76 = var73.getGreatestSubtypeWithProperty(var74, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var77 = var76.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var78 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var78, false);
//     com.google.javascript.rhino.jstype.ObjectType var81 = null;
//     com.google.javascript.rhino.jstype.ObjectType var82 = var80.createObjectType(var81);
//     boolean var83 = var82.isString();
//     var76.matchConstraint(var82);
//     var64.setJSType(var76);
//     boolean var86 = var76.isNumber();
//     com.google.javascript.rhino.jstype.JSType var87 = var55.getGreatestSubtype(var76);
//     com.google.javascript.rhino.jstype.JSType[] var88 = new com.google.javascript.rhino.jstype.JSType[] { var55};
//     com.google.javascript.rhino.Node var89 = var44.createParameters(var88);
//     com.google.javascript.rhino.jstype.FunctionType var90 = var2.createFunctionTypeWithVarArgs(var41, var88);
//     com.google.javascript.rhino.jstype.FunctionType var91 = var90.getOwnerFunction();
//     boolean var92 = var90.isConstructor();
//     com.google.common.base.Predicate var93 = null;
//     boolean var94 = var90.setValidator(var93);
// 
//   }

  public void test194() {}
//   public void test194() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test194"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
//     boolean var4 = var2.isForwardDeclaredType("");
//     var2.incrementGeneration();
//     com.google.javascript.rhino.ErrorReporter var6 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var6, false);
//     com.google.javascript.rhino.jstype.ObjectType var9 = null;
//     com.google.javascript.rhino.jstype.ObjectType var10 = var8.createObjectType(var9);
//     com.google.javascript.rhino.ErrorReporter var11 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11, false);
//     com.google.javascript.rhino.jstype.ObjectType var14 = null;
//     com.google.javascript.rhino.jstype.ObjectType var15 = var13.createObjectType(var14);
//     boolean var16 = var15.isString();
//     boolean var17 = var2.resetImplicitPrototype((com.google.javascript.rhino.jstype.JSType)var9, var15);
//     com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.script();
//     boolean var19 = var18.isCatch();
//     var18.putIntProp((-1), 0);
//     com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.script();
//     boolean var24 = var18.isEquivalentTo(var23);
//     com.google.javascript.rhino.ErrorReporter var25 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25, false);
//     com.google.javascript.rhino.jstype.JSType var28 = null;
//     com.google.javascript.rhino.jstype.JSType var30 = var27.getGreatestSubtypeWithProperty(var28, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var31 = var30.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var32 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32, false);
//     com.google.javascript.rhino.jstype.ObjectType var35 = null;
//     com.google.javascript.rhino.jstype.ObjectType var36 = var34.createObjectType(var35);
//     boolean var37 = var36.isString();
//     var30.matchConstraint(var36);
//     var18.setJSType(var30);
//     com.google.javascript.rhino.jstype.JSType var41 = var30.getRestrictedTypeGivenToBooleanOutcome(true);
//     com.google.javascript.rhino.ErrorReporter var42 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var42, false);
//     boolean var46 = var44.isForwardDeclaredType("");
//     com.google.javascript.rhino.jstype.JSType var48 = null;
//     var44.unregisterPropertyOnType("", var48);
//     com.google.javascript.rhino.ErrorReporter var50 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var50, false);
//     com.google.javascript.rhino.jstype.JSType var53 = null;
//     com.google.javascript.rhino.jstype.JSType var55 = var52.getGreatestSubtypeWithProperty(var53, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var56 = var55.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var57 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var57, false);
//     com.google.javascript.rhino.jstype.ObjectType var60 = null;
//     com.google.javascript.rhino.jstype.ObjectType var61 = var59.createObjectType(var60);
//     boolean var62 = var61.isString();
//     var55.matchConstraint(var61);
//     com.google.javascript.rhino.Node var64 = com.google.javascript.rhino.IR.script();
//     boolean var65 = var64.isCatch();
//     var64.putIntProp((-1), 0);
//     com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.IR.script();
//     boolean var70 = var64.isEquivalentTo(var69);
//     com.google.javascript.rhino.ErrorReporter var71 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var71, false);
//     com.google.javascript.rhino.jstype.JSType var74 = null;
//     com.google.javascript.rhino.jstype.JSType var76 = var73.getGreatestSubtypeWithProperty(var74, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var77 = var76.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var78 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var78, false);
//     com.google.javascript.rhino.jstype.ObjectType var81 = null;
//     com.google.javascript.rhino.jstype.ObjectType var82 = var80.createObjectType(var81);
//     boolean var83 = var82.isString();
//     var76.matchConstraint(var82);
//     var64.setJSType(var76);
//     boolean var86 = var76.isNumber();
//     com.google.javascript.rhino.jstype.JSType var87 = var55.getGreatestSubtype(var76);
//     com.google.javascript.rhino.jstype.JSType[] var88 = new com.google.javascript.rhino.jstype.JSType[] { var55};
//     com.google.javascript.rhino.Node var89 = var44.createParameters(var88);
//     com.google.javascript.rhino.jstype.FunctionType var90 = var2.createFunctionTypeWithVarArgs(var41, var88);
//     java.lang.String var91 = var90.toDebugHashCodeString();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.jstype.FunctionType var92 = var90.cloneWithoutArrowType();
//       fail("Expected exception of type java.lang.IllegalStateException");
//     } catch (java.lang.IllegalStateException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var10);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var23);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var24 == true);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var30);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var31);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var36);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var37 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var41);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var46 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var55);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var56);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var61);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var62 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var64);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var65 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var69);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var70 == true);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var76);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var77);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var82);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var83 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var86 == true);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var87);
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
//     assertTrue("'" + var91 + "' != '" + "function (function (this:me, {921103459}): me): function (this:me, {1923707837}): me"+ "'", var91.equals("function (function (this:me, {921103459}): me): function (this:me, {1923707837}): me"));
// 
//   }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test195"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.string("hi!");
    com.google.javascript.rhino.Node var2 = var1.getNext();
    java.lang.Object var4 = var1.getProp(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test196"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.DiagnosticGroup var3 = com.google.javascript.jscomp.DiagnosticGroup.forType(var2);
    com.google.javascript.jscomp.AstValidator var4 = new com.google.javascript.jscomp.AstValidator();
    boolean var5 = var2.equals((java.lang.Object)var4);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.script();
    boolean var7 = var6.isCatch();
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.script();
    boolean var9 = var8.isCatch();
    boolean var10 = var8.isDec();
    var6.addChildrenToBack(var8);
    com.google.javascript.rhino.jstype.JSType var12 = var8.getJSType();
    com.google.javascript.rhino.Node var13 = var8.getParent();
    var8.setIsSyntheticBlock(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.validateScript(var8);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test197"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.continueNode();
    java.util.Set var2 = null;
    var1.setDirectives(var2);
    boolean var4 = var1.isDebugger();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.script();
    boolean var6 = var5.isAnd();
    boolean var7 = var5.isDec();
    boolean var8 = var5.isExprResult();
    com.google.javascript.rhino.JSDocInfo var9 = var5.getJSDocInfo();
    com.google.javascript.rhino.InputId var10 = com.google.javascript.jscomp.NodeUtil.getInputId(var5);
    java.lang.String var11 = var5.toString();
    java.lang.String var12 = var0.extractClassNameIfProvide(var1, var5);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.script();
    boolean var14 = var13.isCatch();
    var13.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.script();
    boolean var19 = var13.isEquivalentTo(var18);
    com.google.javascript.rhino.ErrorReporter var20 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var20, false);
    com.google.javascript.rhino.jstype.JSType var23 = null;
    com.google.javascript.rhino.jstype.JSType var25 = var22.getGreatestSubtypeWithProperty(var23, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var26 = var25.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var27 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var27, false);
    com.google.javascript.rhino.jstype.ObjectType var30 = null;
    com.google.javascript.rhino.jstype.ObjectType var31 = var29.createObjectType(var30);
    boolean var32 = var31.isString();
    var25.matchConstraint(var31);
    var13.setJSType(var25);
    com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.script();
    boolean var36 = var35.isAnd();
    boolean var37 = var35.isDec();
    com.google.javascript.rhino.Node var38 = null;
    var13.addChildAfter(var35, var38);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var40 = var0.isPropertyTestFunction(var35);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "SCRIPT"+ "'", var11.equals("SCRIPT"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test198"); }


    com.google.javascript.jscomp.DiagnosticType var4 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.DiagnosticGroup var5 = com.google.javascript.jscomp.DiagnosticGroup.forType(var4);
    com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.DiagnosticGroup var9 = com.google.javascript.jscomp.DiagnosticGroup.forType(var8);
    com.google.javascript.jscomp.DiagnosticType[] var10 = new com.google.javascript.jscomp.DiagnosticType[] { var8};
    com.google.javascript.jscomp.DiagnosticGroup var11 = new com.google.javascript.jscomp.DiagnosticGroup(var10);
    com.google.javascript.jscomp.CheckLevel var15 = null;
    com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.DiagnosticGroup var19 = com.google.javascript.jscomp.DiagnosticGroup.forType(var18);
    com.google.javascript.jscomp.AstValidator var20 = new com.google.javascript.jscomp.AstValidator();
    boolean var21 = var18.equals((java.lang.Object)var20);
    java.lang.String[] var23 = new java.lang.String[] { "None"};
    com.google.javascript.jscomp.JSError var24 = com.google.javascript.jscomp.JSError.make("module$", 1, 1, var15, var18, var23);
    boolean var25 = var11.matches(var24);
    com.google.javascript.jscomp.CheckLevel var26 = var24.getDefaultLevel();
    com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var27 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var5, var26);
    java.lang.Class var28 = var26.getDeclaringClass();
    com.google.javascript.jscomp.DiagnosticType var30 = com.google.javascript.jscomp.DiagnosticType.make("function (function (this:me, {763763032}): me): function (this:me, {1055520705}): me", var26, "function (function (this:me, {1034161397}): me): function (this:me, {1565444208}): me");
    com.google.javascript.jscomp.DiagnosticType var32 = com.google.javascript.jscomp.DiagnosticType.make("", var26, "function (function (this:me, {1515367969}): me): function (this:me, {1780885210}): me");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test199() {}
//   public void test199() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test199"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.CodingConvention var1 = var0.getCodingConvention();
// 
//   }

  public void test200() {}
//   public void test200() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test200"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
//     com.google.javascript.rhino.jstype.JSType var3 = null;
//     com.google.javascript.rhino.jstype.JSType var5 = var2.getGreatestSubtypeWithProperty(var3, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var6 = var5.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var7 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7, false);
//     com.google.javascript.rhino.jstype.ObjectType var10 = null;
//     com.google.javascript.rhino.jstype.ObjectType var11 = var9.createObjectType(var10);
//     boolean var12 = var11.isString();
//     var5.matchConstraint(var11);
//     com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.script();
//     boolean var15 = var14.isCatch();
//     var14.putIntProp((-1), 0);
//     com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.script();
//     boolean var20 = var14.isEquivalentTo(var19);
//     com.google.javascript.rhino.ErrorReporter var21 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21, false);
//     com.google.javascript.rhino.jstype.JSType var24 = null;
//     com.google.javascript.rhino.jstype.JSType var26 = var23.getGreatestSubtypeWithProperty(var24, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var27 = var26.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var28 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var28, false);
//     com.google.javascript.rhino.jstype.ObjectType var31 = null;
//     com.google.javascript.rhino.jstype.ObjectType var32 = var30.createObjectType(var31);
//     boolean var33 = var32.isString();
//     var26.matchConstraint(var32);
//     var14.setJSType(var26);
//     boolean var36 = var26.isNumber();
//     com.google.javascript.rhino.jstype.JSType var37 = var5.getGreatestSubtype(var26);
//     boolean var38 = var26.isOrdinaryFunction();
//     java.lang.String var39 = var26.toDebugHashCodeString();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var19);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var20 == true);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var26);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var27);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var32);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var33 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var36 == true);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var37);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var38 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var39 + "' != '" + "function (this:me, {445626636}): me"+ "'", var39.equals("function (this:me, {445626636}): me"));
// 
//   }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test201"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
    boolean var1 = var0.isCatch();
    var0.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.script();
    boolean var6 = var0.isEquivalentTo(var5);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.script();
    boolean var8 = var7.isAnd();
    int var9 = var7.getSourceOffset();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.script();
    boolean var11 = var10.isAnd();
    boolean var12 = var10.isDec();
    com.google.javascript.rhino.Node var13 = var7.clonePropsFrom(var10);
    com.google.javascript.rhino.Node var14 = var5.copyInformationFrom(var7);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.script();
    boolean var16 = var15.isCatch();
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.script();
    boolean var18 = var17.isCatch();
    boolean var19 = var17.isDec();
    var15.addChildrenToBack(var17);
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.script();
    boolean var22 = var21.isCatch();
    boolean var23 = var21.isDec();
    var17.addChildrenToBack(var21);
    com.google.javascript.rhino.Node var25 = var17.getParent();
    com.google.javascript.rhino.Node var26 = var25.cloneNode();
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.script();
    boolean var28 = var27.isCatch();
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.script();
    boolean var30 = var29.isCatch();
    boolean var31 = var29.isDec();
    var27.addChildrenToBack(var29);
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.script();
    boolean var34 = var33.isCatch();
    boolean var35 = var33.isDec();
    var29.addChildrenToBack(var33);
    int var37 = var33.getLength();
    int var38 = var33.getLength();
    boolean var39 = var33.isOptionalArg();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.forIn(var14, var26, var33);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
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
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
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
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test202() {}
//   public void test202() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test202"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     java.util.Map var1 = var0.getInputsById();
// 
//   }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test203"); }


    java.util.logging.Level var0 = null;
    com.google.javascript.jscomp.Compiler.setLoggingLevel(var0);

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test204"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.script();
    boolean var2 = var1.isCatch();
    var1.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.script();
    boolean var7 = var1.isEquivalentTo(var6);
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8, false);
    com.google.javascript.rhino.jstype.JSType var11 = null;
    com.google.javascript.rhino.jstype.JSType var13 = var10.getGreatestSubtypeWithProperty(var11, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var14 = var13.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var15 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var15, false);
    com.google.javascript.rhino.jstype.ObjectType var18 = null;
    com.google.javascript.rhino.jstype.ObjectType var19 = var17.createObjectType(var18);
    boolean var20 = var19.isString();
    var13.matchConstraint(var19);
    var1.setJSType(var13);
    boolean var23 = var13.isNumber();
    com.google.javascript.rhino.jstype.JSType var24 = var13.restrictByNotNullOrUndefined();
    boolean var25 = var24.isStringObjectType();
    com.google.javascript.rhino.jstype.UnionType var26 = var24.toMaybeUnionType();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var27 = var0.createDirectedGraphNode((java.lang.Object)var24);
    com.google.javascript.rhino.ErrorReporter var28 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var28, false);
    com.google.javascript.rhino.ErrorReporter var31 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var31, false);
    boolean var35 = var33.isForwardDeclaredType("");
    com.google.javascript.rhino.jstype.JSType var37 = null;
    var33.unregisterPropertyOnType("", var37);
    com.google.javascript.rhino.ErrorReporter var39 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var39, false);
    com.google.javascript.rhino.jstype.JSType var42 = null;
    com.google.javascript.rhino.jstype.JSType var44 = var41.getGreatestSubtypeWithProperty(var42, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var45 = var44.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var46 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var46, false);
    com.google.javascript.rhino.jstype.ObjectType var49 = null;
    com.google.javascript.rhino.jstype.ObjectType var50 = var48.createObjectType(var49);
    boolean var51 = var50.isString();
    var44.matchConstraint(var50);
    com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.IR.script();
    boolean var54 = var53.isCatch();
    var53.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.script();
    boolean var59 = var53.isEquivalentTo(var58);
    com.google.javascript.rhino.ErrorReporter var60 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var60, false);
    com.google.javascript.rhino.jstype.JSType var63 = null;
    com.google.javascript.rhino.jstype.JSType var65 = var62.getGreatestSubtypeWithProperty(var63, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var66 = var65.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var67 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var67, false);
    com.google.javascript.rhino.jstype.ObjectType var70 = null;
    com.google.javascript.rhino.jstype.ObjectType var71 = var69.createObjectType(var70);
    boolean var72 = var71.isString();
    var65.matchConstraint(var71);
    var53.setJSType(var65);
    boolean var75 = var65.isNumber();
    com.google.javascript.rhino.jstype.JSType var76 = var44.getGreatestSubtype(var65);
    com.google.javascript.rhino.jstype.JSType[] var77 = new com.google.javascript.rhino.jstype.JSType[] { var44};
    com.google.javascript.rhino.Node var78 = var33.createParameters(var77);
    com.google.javascript.rhino.jstype.JSType var79 = var30.createUnionType(var77);
    com.google.javascript.rhino.ErrorReporter var80 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var82 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var80, false);
    com.google.javascript.rhino.jstype.ObjectType var83 = null;
    com.google.javascript.rhino.jstype.ObjectType var84 = var82.createObjectType(var83);
    boolean var85 = var84.isString();
    com.google.javascript.rhino.JSDocInfo var86 = null;
    var84.setJSDocInfo(var86);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var88 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.lang.Iterable var89 = var88.getDirectedGraphNodes();
    com.google.javascript.rhino.Node var91 = com.google.javascript.rhino.Node.newNumber(100.0d);
    boolean var92 = var88.hasNode((java.lang.Object)var91);
    boolean var93 = var91.isVarArgs();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var94 = var0.isConnected((java.lang.Object)var30, (java.lang.Object)var86, (java.lang.Object)var93);
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
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == false);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test205"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.script();
    boolean var2 = var1.isCatch();
    var1.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.script();
    boolean var7 = var1.isEquivalentTo(var6);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.script();
    boolean var9 = var8.isAnd();
    int var10 = var8.getSourceOffset();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.script();
    boolean var12 = var11.isAnd();
    boolean var13 = var11.isDec();
    com.google.javascript.rhino.Node var14 = var8.clonePropsFrom(var11);
    com.google.javascript.rhino.Node var15 = var6.copyInformationFrom(var8);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var18 = var8.useSourceInfoFrom(var17);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var19 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.lang.Iterable var20 = var19.getDirectedGraphNodes();
    var19.pushNodeAnnotations();
    var19.popNodeAnnotations();
    java.lang.Object var23 = null;
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var24 = var19.getDirectedGraphNode(var23);
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.script();
    boolean var26 = var25.isCatch();
    var25.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.script();
    boolean var31 = var25.isEquivalentTo(var30);
    com.google.javascript.rhino.ErrorReporter var32 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32, false);
    com.google.javascript.rhino.jstype.JSType var35 = null;
    com.google.javascript.rhino.jstype.JSType var37 = var34.getGreatestSubtypeWithProperty(var35, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var38 = var37.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var39 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var39, false);
    com.google.javascript.rhino.jstype.ObjectType var42 = null;
    com.google.javascript.rhino.jstype.ObjectType var43 = var41.createObjectType(var42);
    boolean var44 = var43.isString();
    var37.matchConstraint(var43);
    var25.setJSType(var37);
    boolean var47 = var37.isBooleanObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var48 = var0.isConnectedInDirection((java.lang.Object)var8, var23, (java.lang.Object)var47);
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
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
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
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test206"); }


    int var1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test207() {}
//   public void test207() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test207"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.MessageFormatter var1 = null;
//     java.util.logging.Logger var2 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var3 = new com.google.javascript.jscomp.LoggerErrorManager(var1, var2);
//     var3.setTypedPercent((-1.0d));
//     var0.setErrorManager((com.google.javascript.jscomp.ErrorManager)var3);
//     boolean var7 = var0.hasErrors();
// 
//   }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test208"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.DiagnosticGroup var3 = com.google.javascript.jscomp.DiagnosticGroup.forType(var2);
    com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.DiagnosticGroup var7 = com.google.javascript.jscomp.DiagnosticGroup.forType(var6);
    com.google.javascript.jscomp.DiagnosticType[] var8 = new com.google.javascript.jscomp.DiagnosticType[] { var6};
    com.google.javascript.jscomp.DiagnosticGroup var9 = new com.google.javascript.jscomp.DiagnosticGroup(var8);
    com.google.javascript.jscomp.CheckLevel var13 = null;
    com.google.javascript.jscomp.DiagnosticType var16 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.DiagnosticGroup var17 = com.google.javascript.jscomp.DiagnosticGroup.forType(var16);
    com.google.javascript.jscomp.AstValidator var18 = new com.google.javascript.jscomp.AstValidator();
    boolean var19 = var16.equals((java.lang.Object)var18);
    java.lang.String[] var21 = new java.lang.String[] { "None"};
    com.google.javascript.jscomp.JSError var22 = com.google.javascript.jscomp.JSError.make("module$", 1, 1, var13, var16, var21);
    boolean var23 = var9.matches(var22);
    com.google.javascript.jscomp.CheckLevel var24 = var22.getDefaultLevel();
    com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var25 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var3, var24);
    java.lang.Class var26 = var24.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var28 = java.lang.Enum.<java.lang.Enum>valueOf(var26, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test209"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
    boolean var1 = var0.isAnd();
    boolean var2 = var0.isDec();
    boolean var3 = var0.isExprResult();
    com.google.javascript.rhino.JSDocInfo var4 = var0.getJSDocInfo();
    com.google.javascript.rhino.InputId var5 = com.google.javascript.jscomp.NodeUtil.getInputId(var0);
    java.lang.String var6 = var0.toString();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.script();
    boolean var8 = var7.isCatch();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.script();
    boolean var10 = var9.isCatch();
    boolean var11 = var9.isDec();
    var7.addChildrenToBack(var9);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.script();
    boolean var14 = var13.isCatch();
    boolean var15 = var13.isDec();
    var9.addChildrenToBack(var13);
    com.google.javascript.rhino.Node var17 = var9.getParent();
    boolean var18 = var17.isAdd();
    var17.removeProp(0);
    var0.addChildToFront(var17);
    java.lang.Iterable var22 = var0.siblings();
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.script();
    boolean var24 = var23.isCatch();
    var23.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.script();
    boolean var29 = var23.isEquivalentTo(var28);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.add(var0, var28);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "SCRIPT"+ "'", var6.equals("SCRIPT"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test210"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.continueNode();
    java.util.Set var1 = null;
    var0.setDirectives(var1);
    boolean var3 = var0.isScript();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.continueNode();
    java.util.Set var6 = null;
    var5.setDirectives(var6);
    boolean var8 = var5.isScript();
    com.google.javascript.rhino.ErrorReporter var9 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var9, false);
    com.google.javascript.rhino.jstype.JSType var12 = null;
    com.google.javascript.rhino.jstype.JSType var14 = var11.getGreatestSubtypeWithProperty(var12, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var15 = var14.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var16 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var16, false);
    com.google.javascript.rhino.jstype.ObjectType var19 = null;
    com.google.javascript.rhino.jstype.ObjectType var20 = var18.createObjectType(var19);
    boolean var21 = var20.isString();
    var14.matchConstraint(var20);
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.script();
    boolean var24 = var23.isCatch();
    var23.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.script();
    boolean var29 = var23.isEquivalentTo(var28);
    com.google.javascript.rhino.ErrorReporter var30 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var30, false);
    com.google.javascript.rhino.jstype.JSType var33 = null;
    com.google.javascript.rhino.jstype.JSType var35 = var32.getGreatestSubtypeWithProperty(var33, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var36 = var35.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var37 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var37, false);
    com.google.javascript.rhino.jstype.ObjectType var40 = null;
    com.google.javascript.rhino.jstype.ObjectType var41 = var39.createObjectType(var40);
    boolean var42 = var41.isString();
    var35.matchConstraint(var41);
    var23.setJSType(var35);
    boolean var45 = var35.isNumber();
    com.google.javascript.rhino.jstype.JSType var46 = var14.getGreatestSubtype(var35);
    boolean var47 = var46.hasDisplayName();
    var5.setJSType(var46);
    com.google.javascript.rhino.Node[] var49 = new com.google.javascript.rhino.Node[] { var5};
    com.google.javascript.rhino.Node var50 = new com.google.javascript.rhino.Node((-1), var49);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.switchNode(var0, var49);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test211"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
    boolean var1 = var0.isCatch();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.script();
    boolean var3 = var2.isCatch();
    boolean var4 = var2.isDec();
    var0.addChildrenToBack(var2);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.continueNode();
    int var8 = var6.getIntProp(0);
    com.google.javascript.rhino.Node var9 = var2.copyInformationFromForTree(var6);
    com.google.javascript.rhino.Node[] var10 = new com.google.javascript.rhino.Node[] { var2};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.paramList(var10);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test212"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.script();
    boolean var2 = var1.isCatch();
    boolean var3 = var1.isDec();
    java.lang.String var4 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(var1);
    com.google.javascript.rhino.Node var7 = new com.google.javascript.rhino.Node(100, var1, 100, 0);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.script();
    boolean var9 = var8.isCatch();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.script();
    boolean var11 = var10.isCatch();
    boolean var12 = var10.isDec();
    var8.addChildrenToBack(var10);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.script();
    boolean var15 = var14.isCatch();
    boolean var16 = var14.isDec();
    var10.addChildrenToBack(var14);
    int var18 = var14.getLength();
    var14.setSourceFileForTesting("function (function (this:me, {763763032}): me): function (this:me, {1055520705}): me");
    com.google.javascript.jscomp.GoogleCodingConvention var22 = new com.google.javascript.jscomp.GoogleCodingConvention();
    com.google.javascript.rhino.Node var24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode((com.google.javascript.jscomp.CodingConvention)var22, "hi!");
    com.google.javascript.rhino.Node var28 = new com.google.javascript.rhino.Node(0, 100, 0);
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.script();
    boolean var30 = var29.isCatch();
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.script();
    boolean var32 = var31.isCatch();
    boolean var33 = var31.isDec();
    var29.addChildrenToBack(var31);
    com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.script();
    boolean var36 = var35.isCatch();
    boolean var37 = var35.isDec();
    var31.addChildrenToBack(var35);
    com.google.javascript.rhino.Node var39 = var31.getParent();
    com.google.javascript.rhino.Node var40 = var39.cloneNode();
    com.google.javascript.rhino.Node var43 = new com.google.javascript.rhino.Node((-1), var24, var28, var39, 0, 0);
    boolean var44 = var39.isAssignAdd();
    boolean var45 = var39.isArrayLit();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.IR.forIn(var7, var14, var39);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test213"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
    com.google.javascript.rhino.jstype.JSType var3 = null;
    com.google.javascript.rhino.jstype.JSType var5 = var2.getGreatestSubtypeWithProperty(var3, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var6 = var5.toMaybeTemplateType();
    com.google.javascript.rhino.jstype.TemplateType var7 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test214() {}
//   public void test214() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test214"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.JSModule var1 = null;
//     java.lang.String var2 = var0.toSource(var1);
// 
//   }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test215"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf("function (function (this:me, {1308183468}): me): function (this:me, {701968690}): me");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test216() {}
//   public void test216() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test216"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
//     boolean var1 = var0.isCatch();
//     var0.putIntProp((-1), 0);
//     com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.script();
//     boolean var6 = var0.isEquivalentTo(var5);
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.script();
//     boolean var8 = var7.isAnd();
//     int var9 = var7.getSourceOffset();
//     com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.script();
//     boolean var11 = var10.isAnd();
//     boolean var12 = var10.isDec();
//     com.google.javascript.rhino.Node var13 = var7.clonePropsFrom(var10);
//     com.google.javascript.rhino.Node var14 = var5.copyInformationFrom(var7);
//     boolean var15 = var7.isUnscopedQualifiedName();
//     boolean var16 = var7.hasMoreThanOneChild();
//     com.google.javascript.rhino.ErrorReporter var17 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var17, false);
//     com.google.javascript.rhino.jstype.JSType var20 = null;
//     com.google.javascript.rhino.jstype.JSType var22 = var19.getGreatestSubtypeWithProperty(var20, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var23 = var22.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var24 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24, false);
//     com.google.javascript.rhino.jstype.ObjectType var27 = null;
//     com.google.javascript.rhino.jstype.ObjectType var28 = var26.createObjectType(var27);
//     boolean var29 = var28.isString();
//     var22.matchConstraint(var28);
//     com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.script();
//     boolean var34 = var33.isCatch();
//     var33.putIntProp((-1), 0);
//     com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.script();
//     boolean var39 = var33.isEquivalentTo(var38);
//     com.google.javascript.rhino.ErrorReporter var40 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var40, false);
//     com.google.javascript.rhino.jstype.JSType var43 = null;
//     com.google.javascript.rhino.jstype.JSType var45 = var42.getGreatestSubtypeWithProperty(var43, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var46 = var45.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var47 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var47, false);
//     com.google.javascript.rhino.jstype.ObjectType var50 = null;
//     com.google.javascript.rhino.jstype.ObjectType var51 = var49.createObjectType(var50);
//     boolean var52 = var51.isString();
//     var45.matchConstraint(var51);
//     var33.setJSType(var45);
//     boolean var55 = var45.isNumber();
//     com.google.javascript.rhino.jstype.JSType var56 = var45.restrictByNotNullOrUndefined();
//     com.google.javascript.rhino.jstype.SimpleSlot var58 = new com.google.javascript.rhino.jstype.SimpleSlot("", var56, true);
//     com.google.javascript.rhino.Node var59 = com.google.javascript.rhino.IR.script();
//     boolean var60 = var59.isCatch();
//     var59.putIntProp((-1), 0);
//     com.google.javascript.rhino.Node var64 = com.google.javascript.rhino.IR.script();
//     boolean var65 = var59.isEquivalentTo(var64);
//     com.google.javascript.rhino.ErrorReporter var66 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var66, false);
//     com.google.javascript.rhino.jstype.JSType var69 = null;
//     com.google.javascript.rhino.jstype.JSType var71 = var68.getGreatestSubtypeWithProperty(var69, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var72 = var71.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var73 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var73, false);
//     com.google.javascript.rhino.jstype.ObjectType var76 = null;
//     com.google.javascript.rhino.jstype.ObjectType var77 = var75.createObjectType(var76);
//     boolean var78 = var77.isString();
//     var71.matchConstraint(var77);
//     var59.setJSType(var71);
//     int var81 = var59.getSourcePosition();
//     boolean var82 = var28.defineSynthesizedProperty("", var56, var59);
//     var7.removeChild(var59);
// 
//   }

  public void test217() {}
//   public void test217() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test217"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.MessageFormatter var1 = null;
//     java.util.logging.Logger var2 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var3 = new com.google.javascript.jscomp.LoggerErrorManager(var1, var2);
//     var3.setTypedPercent((-1.0d));
//     var0.setErrorManager((com.google.javascript.jscomp.ErrorManager)var3);
//     var0.check();
// 
//   }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test218"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
    boolean var1 = var0.isCatch();
    var0.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.script();
    boolean var6 = var0.isEquivalentTo(var5);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.script();
    boolean var8 = var7.isAnd();
    int var9 = var7.getSourceOffset();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.script();
    boolean var11 = var10.isAnd();
    boolean var12 = var10.isDec();
    com.google.javascript.rhino.Node var13 = var7.clonePropsFrom(var10);
    com.google.javascript.rhino.Node var14 = var5.copyInformationFrom(var7);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var17 = var7.useSourceInfoFrom(var16);
    com.google.javascript.rhino.Node var21 = new com.google.javascript.rhino.Node(0, 100, 1);
    com.google.javascript.rhino.Node var22 = var7.copyInformationFrom(var21);
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.script();
    boolean var24 = var23.isCatch();
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.script();
    boolean var26 = var25.isCatch();
    boolean var27 = var25.isDec();
    var23.addChildrenToBack(var25);
    com.google.javascript.rhino.jstype.JSType var29 = var25.getJSType();
    boolean var30 = var25.isTrue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var31 = var21.removeChildAfter(var25);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test219"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.continueNode();
    java.lang.String var1 = com.google.javascript.jscomp.NodeUtil.getSourceName(var0);
    com.google.javascript.rhino.InputId var2 = var0.getInputId();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.script();
    boolean var4 = var3.isCatch();
    var3.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.script();
    boolean var9 = var3.isEquivalentTo(var8);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.script();
    boolean var11 = var10.isAnd();
    int var12 = var10.getSourceOffset();
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.script();
    boolean var14 = var13.isAnd();
    boolean var15 = var13.isDec();
    com.google.javascript.rhino.Node var16 = var10.clonePropsFrom(var13);
    com.google.javascript.rhino.Node var17 = var8.copyInformationFrom(var10);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var20 = var10.useSourceInfoFrom(var19);
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.block();
    int var22 = var21.getLength();
    boolean var23 = var21.isAnd();
    boolean var24 = var21.isAdd();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.forIn(var0, var20, var21);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test220"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.Node.newNumber(0.0d);
    int var2 = var1.getCharno();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.var(var1);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test221() {}
//   public void test221() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test221"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
//     com.google.javascript.rhino.ErrorReporter var3 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var3, false);
//     boolean var7 = var5.isForwardDeclaredType("");
//     com.google.javascript.rhino.jstype.JSType var9 = null;
//     var5.unregisterPropertyOnType("", var9);
//     com.google.javascript.rhino.ErrorReporter var11 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11, false);
//     com.google.javascript.rhino.jstype.JSType var14 = null;
//     com.google.javascript.rhino.jstype.JSType var16 = var13.getGreatestSubtypeWithProperty(var14, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var17 = var16.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var18 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18, false);
//     com.google.javascript.rhino.jstype.ObjectType var21 = null;
//     com.google.javascript.rhino.jstype.ObjectType var22 = var20.createObjectType(var21);
//     boolean var23 = var22.isString();
//     var16.matchConstraint(var22);
//     com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.script();
//     boolean var26 = var25.isCatch();
//     var25.putIntProp((-1), 0);
//     com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.script();
//     boolean var31 = var25.isEquivalentTo(var30);
//     com.google.javascript.rhino.ErrorReporter var32 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32, false);
//     com.google.javascript.rhino.jstype.JSType var35 = null;
//     com.google.javascript.rhino.jstype.JSType var37 = var34.getGreatestSubtypeWithProperty(var35, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var38 = var37.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var39 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var39, false);
//     com.google.javascript.rhino.jstype.ObjectType var42 = null;
//     com.google.javascript.rhino.jstype.ObjectType var43 = var41.createObjectType(var42);
//     boolean var44 = var43.isString();
//     var37.matchConstraint(var43);
//     var25.setJSType(var37);
//     boolean var47 = var37.isNumber();
//     com.google.javascript.rhino.jstype.JSType var48 = var16.getGreatestSubtype(var37);
//     com.google.javascript.rhino.jstype.JSType[] var49 = new com.google.javascript.rhino.jstype.JSType[] { var16};
//     com.google.javascript.rhino.Node var50 = var5.createParameters(var49);
//     com.google.javascript.rhino.jstype.JSType var51 = var2.createUnionType(var49);
//     com.google.javascript.rhino.jstype.JSType var56 = var2.createNamedType("", "2014/12/23 21:59", (-1), 100);
//     com.google.javascript.rhino.jstype.JSTypeNative var57 = null;
//     com.google.javascript.rhino.jstype.FunctionType var58 = var2.getNativeFunctionType(var57);
// 
//   }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test222"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.MessageFormatter var1 = null;
    java.util.logging.Logger var2 = null;
    com.google.javascript.jscomp.LoggerErrorManager var3 = new com.google.javascript.jscomp.LoggerErrorManager(var1, var2);
    var3.setTypedPercent((-1.0d));
    var0.setErrorManager((com.google.javascript.jscomp.ErrorManager)var3);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var7 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.lang.Iterable var8 = var7.getDirectedGraphNodes();
    var7.pushNodeAnnotations();
    var7.popNodeAnnotations();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var11 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.script();
    boolean var13 = var12.isCatch();
    var12.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.script();
    boolean var18 = var12.isEquivalentTo(var17);
    com.google.javascript.rhino.ErrorReporter var19 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var19, false);
    com.google.javascript.rhino.jstype.JSType var22 = null;
    com.google.javascript.rhino.jstype.JSType var24 = var21.getGreatestSubtypeWithProperty(var22, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var25 = var24.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var26 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var26, false);
    com.google.javascript.rhino.jstype.ObjectType var29 = null;
    com.google.javascript.rhino.jstype.ObjectType var30 = var28.createObjectType(var29);
    boolean var31 = var30.isString();
    var24.matchConstraint(var30);
    var12.setJSType(var24);
    boolean var34 = var24.isNumber();
    com.google.javascript.rhino.jstype.JSType var35 = var24.restrictByNotNullOrUndefined();
    boolean var36 = var35.isStringObjectType();
    com.google.javascript.rhino.jstype.UnionType var37 = var35.toMaybeUnionType();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var38 = var11.createDirectedGraphNode((java.lang.Object)var35);
    java.util.List var39 = var7.getDirectedPredNodes(var38);
    com.google.javascript.jscomp.NodeTraversal.Callback var40 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var0, var39, var40);
    com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.IR.continueNode();
    java.util.Set var43 = null;
    var42.setDirectives(var43);
    boolean var45 = var42.isBlock();
    boolean var46 = var42.isIf();
    boolean var47 = var42.isGetterDef();
    com.google.javascript.jscomp.NodeTraversal.Callback var48 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.NodeTraversal.traverse((com.google.javascript.jscomp.AbstractCompiler)var0, var42, var48);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test223"); }


    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.DiagnosticGroup var4 = com.google.javascript.jscomp.DiagnosticGroup.forType(var3);
    com.google.javascript.jscomp.DiagnosticType[] var5 = new com.google.javascript.jscomp.DiagnosticType[] { var3};
    com.google.javascript.jscomp.DiagnosticGroup var6 = new com.google.javascript.jscomp.DiagnosticGroup(var5);
    com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.DiagnosticGroup var10 = com.google.javascript.jscomp.DiagnosticGroup.forType(var9);
    com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.DiagnosticGroup var14 = com.google.javascript.jscomp.DiagnosticGroup.forType(var13);
    com.google.javascript.jscomp.DiagnosticType[] var15 = new com.google.javascript.jscomp.DiagnosticType[] { var13};
    com.google.javascript.jscomp.DiagnosticGroup var16 = new com.google.javascript.jscomp.DiagnosticGroup(var15);
    com.google.javascript.jscomp.CheckLevel var20 = null;
    com.google.javascript.jscomp.DiagnosticType var23 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.DiagnosticGroup var24 = com.google.javascript.jscomp.DiagnosticGroup.forType(var23);
    com.google.javascript.jscomp.AstValidator var25 = new com.google.javascript.jscomp.AstValidator();
    boolean var26 = var23.equals((java.lang.Object)var25);
    java.lang.String[] var28 = new java.lang.String[] { "None"};
    com.google.javascript.jscomp.JSError var29 = com.google.javascript.jscomp.JSError.make("module$", 1, 1, var20, var23, var28);
    boolean var30 = var16.matches(var29);
    com.google.javascript.jscomp.CheckLevel var31 = var29.getDefaultLevel();
    com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var32 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var10, var31);
    com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var33 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var6, var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var34 = com.google.javascript.rhino.ScriptRuntime.getMessage1("function (function (this:me, {763763032}): me): function (this:me, {1055520705}): me", (java.lang.Object)var6);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test224"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
    com.google.javascript.rhino.jstype.JSType var3 = null;
    com.google.javascript.rhino.jstype.JSType var5 = var2.getGreatestSubtypeWithProperty(var3, "hi!");
    var2.incrementGeneration();
    java.lang.Iterable var8 = var2.getTypesWithProperty("function (function (this:me, {837652477}): me): function (this:me, {1669874854}): me");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test225() {}
//   public void test225() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test225"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.rhino.InputId var2 = new com.google.javascript.rhino.InputId("");
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var0, var2, true);
//     com.google.javascript.rhino.InputId var5 = var4.getInputId();
//     java.lang.String var6 = var4.toString();
//     com.google.javascript.jscomp.SourceAst var7 = var4.getSourceAst();
//     com.google.javascript.jscomp.Compiler var8 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.MessageFormatter var9 = null;
//     java.util.logging.Logger var10 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var11 = new com.google.javascript.jscomp.LoggerErrorManager(var9, var10);
//     var11.setTypedPercent((-1.0d));
//     var8.setErrorManager((com.google.javascript.jscomp.ErrorManager)var11);
//     var4.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var8);
//     boolean var16 = var8.isIdeMode();
// 
//   }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test226"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.continueNode();
    java.util.Set var1 = null;
    var0.setDirectives(var1);
    boolean var3 = var0.isBlock();
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.script();
    boolean var5 = var4.isCatch();
    var4.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.script();
    boolean var10 = var4.isEquivalentTo(var9);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.script();
    boolean var12 = var11.isAnd();
    int var13 = var11.getSourceOffset();
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.script();
    boolean var15 = var14.isAnd();
    boolean var16 = var14.isDec();
    com.google.javascript.rhino.Node var17 = var11.clonePropsFrom(var14);
    com.google.javascript.rhino.Node var18 = var9.copyInformationFrom(var11);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.name("hi!");
    com.google.javascript.rhino.Node var21 = var11.useSourceInfoFrom(var20);
    com.google.javascript.rhino.Node var22 = var20.cloneNode();
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.script();
    boolean var24 = var23.isCatch();
    var23.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.script();
    boolean var29 = var23.isEquivalentTo(var28);
    com.google.javascript.rhino.ErrorReporter var30 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var30, false);
    com.google.javascript.rhino.jstype.JSType var33 = null;
    com.google.javascript.rhino.jstype.JSType var35 = var32.getGreatestSubtypeWithProperty(var33, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var36 = var35.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var37 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var37, false);
    com.google.javascript.rhino.jstype.ObjectType var40 = null;
    com.google.javascript.rhino.jstype.ObjectType var41 = var39.createObjectType(var40);
    boolean var42 = var41.isString();
    var35.matchConstraint(var41);
    var23.setJSType(var35);
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.script();
    boolean var46 = var45.isAnd();
    boolean var47 = var45.isDec();
    com.google.javascript.rhino.Node var48 = null;
    var23.addChildAfter(var45, var48);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.replaceChild(var22, var45);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
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
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test227"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
    com.google.javascript.rhino.jstype.JSType var3 = null;
    com.google.javascript.rhino.jstype.JSType var5 = var2.getGreatestSubtypeWithProperty(var3, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var6 = var5.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var7 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7, false);
    com.google.javascript.rhino.jstype.ObjectType var10 = null;
    com.google.javascript.rhino.jstype.ObjectType var11 = var9.createObjectType(var10);
    boolean var12 = var11.isString();
    var5.matchConstraint(var11);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.script();
    boolean var15 = var14.isCatch();
    var14.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.script();
    boolean var20 = var14.isEquivalentTo(var19);
    com.google.javascript.rhino.ErrorReporter var21 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21, false);
    com.google.javascript.rhino.jstype.JSType var24 = null;
    com.google.javascript.rhino.jstype.JSType var26 = var23.getGreatestSubtypeWithProperty(var24, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var27 = var26.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var28 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var28, false);
    com.google.javascript.rhino.jstype.ObjectType var31 = null;
    com.google.javascript.rhino.jstype.ObjectType var32 = var30.createObjectType(var31);
    boolean var33 = var32.isString();
    var26.matchConstraint(var32);
    var14.setJSType(var26);
    boolean var36 = var26.isNumber();
    com.google.javascript.rhino.jstype.JSType var37 = var5.getGreatestSubtype(var26);
    boolean var38 = var5.isUnknownType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test228"); }


    java.lang.String var1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("function (function (this:me, {1116930786}): me): function (this:me, {1101161875}): me");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "module$function (function (this:me, {1116930786}): me): function (this:me, {1101161875}): me"+ "'", var1.equals("module$function (function (this:me, {1116930786}): me): function (this:me, {1101161875}): me"));

  }

  public void test229() {}
//   public void test229() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test229"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
//     boolean var4 = var2.isForwardDeclaredType("");
//     var2.incrementGeneration();
//     com.google.javascript.rhino.ErrorReporter var6 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var6, false);
//     com.google.javascript.rhino.jstype.ObjectType var9 = null;
//     com.google.javascript.rhino.jstype.ObjectType var10 = var8.createObjectType(var9);
//     com.google.javascript.rhino.ErrorReporter var11 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11, false);
//     com.google.javascript.rhino.jstype.ObjectType var14 = null;
//     com.google.javascript.rhino.jstype.ObjectType var15 = var13.createObjectType(var14);
//     boolean var16 = var15.isString();
//     boolean var17 = var2.resetImplicitPrototype((com.google.javascript.rhino.jstype.JSType)var9, var15);
//     com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.script();
//     boolean var19 = var18.isCatch();
//     var18.putIntProp((-1), 0);
//     com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.script();
//     boolean var24 = var18.isEquivalentTo(var23);
//     com.google.javascript.rhino.ErrorReporter var25 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25, false);
//     com.google.javascript.rhino.jstype.JSType var28 = null;
//     com.google.javascript.rhino.jstype.JSType var30 = var27.getGreatestSubtypeWithProperty(var28, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var31 = var30.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var32 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32, false);
//     com.google.javascript.rhino.jstype.ObjectType var35 = null;
//     com.google.javascript.rhino.jstype.ObjectType var36 = var34.createObjectType(var35);
//     boolean var37 = var36.isString();
//     var30.matchConstraint(var36);
//     var18.setJSType(var30);
//     com.google.javascript.rhino.jstype.JSType var41 = var30.getRestrictedTypeGivenToBooleanOutcome(true);
//     com.google.javascript.rhino.ErrorReporter var42 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var42, false);
//     boolean var46 = var44.isForwardDeclaredType("");
//     com.google.javascript.rhino.jstype.JSType var48 = null;
//     var44.unregisterPropertyOnType("", var48);
//     com.google.javascript.rhino.ErrorReporter var50 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var50, false);
//     com.google.javascript.rhino.jstype.JSType var53 = null;
//     com.google.javascript.rhino.jstype.JSType var55 = var52.getGreatestSubtypeWithProperty(var53, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var56 = var55.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var57 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var57, false);
//     com.google.javascript.rhino.jstype.ObjectType var60 = null;
//     com.google.javascript.rhino.jstype.ObjectType var61 = var59.createObjectType(var60);
//     boolean var62 = var61.isString();
//     var55.matchConstraint(var61);
//     com.google.javascript.rhino.Node var64 = com.google.javascript.rhino.IR.script();
//     boolean var65 = var64.isCatch();
//     var64.putIntProp((-1), 0);
//     com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.IR.script();
//     boolean var70 = var64.isEquivalentTo(var69);
//     com.google.javascript.rhino.ErrorReporter var71 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var71, false);
//     com.google.javascript.rhino.jstype.JSType var74 = null;
//     com.google.javascript.rhino.jstype.JSType var76 = var73.getGreatestSubtypeWithProperty(var74, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var77 = var76.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var78 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var78, false);
//     com.google.javascript.rhino.jstype.ObjectType var81 = null;
//     com.google.javascript.rhino.jstype.ObjectType var82 = var80.createObjectType(var81);
//     boolean var83 = var82.isString();
//     var76.matchConstraint(var82);
//     var64.setJSType(var76);
//     boolean var86 = var76.isNumber();
//     com.google.javascript.rhino.jstype.JSType var87 = var55.getGreatestSubtype(var76);
//     com.google.javascript.rhino.jstype.JSType[] var88 = new com.google.javascript.rhino.jstype.JSType[] { var55};
//     com.google.javascript.rhino.Node var89 = var44.createParameters(var88);
//     com.google.javascript.rhino.jstype.FunctionType var90 = var2.createFunctionTypeWithVarArgs(var41, var88);
//     java.lang.String var91 = var90.toDebugHashCodeString();
//     boolean var92 = var90.isNumberObjectType();
//     var90.clearCachedValues();
//     boolean var94 = var90.isUnknownType();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.jstype.ObjectType var95 = var90.getInstanceType();
//       fail("Expected exception of type java.lang.IllegalStateException");
//     } catch (java.lang.IllegalStateException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var10);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var23);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var24 == true);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var30);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var31);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var36);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var37 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var41);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var46 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var55);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var56);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var61);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var62 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var64);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var65 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var69);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var70 == true);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var76);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var77);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var82);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var83 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var86 == true);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var87);
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
//     assertTrue("'" + var91 + "' != '" + "function (function (this:me, {1074545163}): me): function (this:me, {1690566918}): me"+ "'", var91.equals("function (function (this:me, {1074545163}): me): function (this:me, {1690566918}): me"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var92 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var94 == false);
// 
//   }

  public void test230() {}
//   public void test230() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test230"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromGenerator("2014/12/23 21:59", var1);
//     java.lang.String var3 = var2.getCode();
// 
//   }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test231"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.nullNode();
    com.google.javascript.rhino.InputId var1 = var0.getInputId();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.script();
    boolean var3 = var2.isCatch();
    var2.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.script();
    boolean var8 = var2.isEquivalentTo(var7);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.script();
    boolean var10 = var9.isAnd();
    int var11 = var9.getSourceOffset();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.script();
    boolean var13 = var12.isAnd();
    boolean var14 = var12.isDec();
    com.google.javascript.rhino.Node var15 = var9.clonePropsFrom(var12);
    com.google.javascript.rhino.Node var16 = var7.copyInformationFrom(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.doNode(var0, var16);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test232() {}
//   public void test232() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test232"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
//     boolean var1 = var0.isCatch();
//     var0.putIntProp((-1), 0);
//     com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.script();
//     boolean var6 = var0.isEquivalentTo(var5);
//     com.google.javascript.rhino.ErrorReporter var7 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7, false);
//     com.google.javascript.rhino.jstype.JSType var10 = null;
//     com.google.javascript.rhino.jstype.JSType var12 = var9.getGreatestSubtypeWithProperty(var10, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var13 = var12.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var14 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var14, false);
//     com.google.javascript.rhino.jstype.ObjectType var17 = null;
//     com.google.javascript.rhino.jstype.ObjectType var18 = var16.createObjectType(var17);
//     boolean var19 = var18.isString();
//     var12.matchConstraint(var18);
//     var0.setJSType(var12);
//     com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.script();
//     boolean var23 = var22.isAnd();
//     boolean var24 = var22.isDec();
//     com.google.javascript.rhino.Node var25 = null;
//     var0.addChildAfter(var22, var25);
//     boolean var27 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(var25);
// 
//   }

  public void test233() {}
//   public void test233() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test233"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.rhino.InputId var2 = new com.google.javascript.rhino.InputId("");
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var0, var2, true);
//     com.google.javascript.rhino.InputId var5 = var4.getInputId();
//     java.lang.String var6 = var4.toString();
//     com.google.javascript.jscomp.SourceAst var7 = var4.getSourceAst();
//     com.google.javascript.jscomp.SourceFile var8 = var4.getSourceFile();
// 
//   }

  public void test234() {}
//   public void test234() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test234"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
//     java.lang.Iterable var4 = var2.getEachReferenceTypeWithProperty("");
//     boolean var6 = var2.hasNamespace("None");
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.script();
//     boolean var8 = var7.isCatch();
//     var7.putIntProp((-1), 0);
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.script();
//     boolean var13 = var7.isEquivalentTo(var12);
//     com.google.javascript.rhino.ErrorReporter var14 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var14, false);
//     com.google.javascript.rhino.jstype.JSType var17 = null;
//     com.google.javascript.rhino.jstype.JSType var19 = var16.getGreatestSubtypeWithProperty(var17, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var20 = var19.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var21 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21, false);
//     com.google.javascript.rhino.jstype.ObjectType var24 = null;
//     com.google.javascript.rhino.jstype.ObjectType var25 = var23.createObjectType(var24);
//     boolean var26 = var25.isString();
//     var19.matchConstraint(var25);
//     var7.setJSType(var19);
//     boolean var29 = var19.isBooleanObjectType();
//     com.google.javascript.rhino.jstype.ObjectType var30 = var19.dereference();
//     com.google.javascript.rhino.jstype.ObjectType var31 = var30.getTypeOfThis();
//     java.util.Collection var32 = var2.getDirectImplementors(var30);
//     com.google.javascript.rhino.jstype.JSType var33 = null;
//     com.google.javascript.rhino.jstype.JSType.TypePair var34 = var30.getTypesUnderShallowInequality(var33);
// 
//   }

  public void test235() {}
//   public void test235() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test235"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.MessageFormatter var1 = null;
//     java.util.logging.Logger var2 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var3 = new com.google.javascript.jscomp.LoggerErrorManager(var1, var2);
//     var3.setTypedPercent((-1.0d));
//     var0.setErrorManager((com.google.javascript.jscomp.ErrorManager)var3);
//     com.google.javascript.jscomp.JSSourceFile var7 = null;
//     com.google.javascript.jscomp.JSModule var8 = null;
//     com.google.javascript.jscomp.JSModule[] var9 = new com.google.javascript.jscomp.JSModule[] { var8};
//     com.google.javascript.jscomp.CompilerOptions var10 = null;
//     com.google.javascript.jscomp.Result var11 = var0.compile(var7, var9, var10);
// 
//   }

  public void test236() {}
//   public void test236() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test236"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.MessageFormatter var1 = null;
//     java.util.logging.Logger var2 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var3 = new com.google.javascript.jscomp.LoggerErrorManager(var1, var2);
//     var3.setTypedPercent((-1.0d));
//     var0.setErrorManager((com.google.javascript.jscomp.ErrorManager)var3);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var7 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
//     java.lang.Iterable var8 = var7.getDirectedGraphNodes();
//     var7.pushNodeAnnotations();
//     var7.popNodeAnnotations();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var11 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.script();
//     boolean var13 = var12.isCatch();
//     var12.putIntProp((-1), 0);
//     com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.script();
//     boolean var18 = var12.isEquivalentTo(var17);
//     com.google.javascript.rhino.ErrorReporter var19 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var19, false);
//     com.google.javascript.rhino.jstype.JSType var22 = null;
//     com.google.javascript.rhino.jstype.JSType var24 = var21.getGreatestSubtypeWithProperty(var22, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var25 = var24.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var26 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var26, false);
//     com.google.javascript.rhino.jstype.ObjectType var29 = null;
//     com.google.javascript.rhino.jstype.ObjectType var30 = var28.createObjectType(var29);
//     boolean var31 = var30.isString();
//     var24.matchConstraint(var30);
//     var12.setJSType(var24);
//     boolean var34 = var24.isNumber();
//     com.google.javascript.rhino.jstype.JSType var35 = var24.restrictByNotNullOrUndefined();
//     boolean var36 = var35.isStringObjectType();
//     com.google.javascript.rhino.jstype.UnionType var37 = var35.toMaybeUnionType();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var38 = var11.createDirectedGraphNode((java.lang.Object)var35);
//     java.util.List var39 = var7.getDirectedPredNodes(var38);
//     com.google.javascript.jscomp.NodeTraversal.Callback var40 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var0, var39, var40);
//     var0.normalize();
// 
//   }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test237"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
    boolean var1 = var0.isCatch();
    var0.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.script();
    boolean var6 = var0.isEquivalentTo(var5);
    com.google.javascript.rhino.ErrorReporter var7 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7, false);
    com.google.javascript.rhino.jstype.JSType var10 = null;
    com.google.javascript.rhino.jstype.JSType var12 = var9.getGreatestSubtypeWithProperty(var10, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var13 = var12.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var14 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var14, false);
    com.google.javascript.rhino.jstype.ObjectType var17 = null;
    com.google.javascript.rhino.jstype.ObjectType var18 = var16.createObjectType(var17);
    boolean var19 = var18.isString();
    var12.matchConstraint(var18);
    var0.setJSType(var12);
    boolean var22 = var12.isNumber();
    com.google.javascript.rhino.jstype.JSType var23 = var12.restrictByNotNullOrUndefined();
    boolean var24 = var23.isStringObjectType();
    boolean var25 = var23.isRecordType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test238"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.script();
    boolean var1 = var0.isCatch();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.script();
    boolean var3 = var2.isCatch();
    boolean var4 = var2.isDec();
    var0.addChildrenToBack(var2);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.continueNode();
    int var8 = var6.getIntProp(0);
    com.google.javascript.rhino.Node var9 = var2.copyInformationFromForTree(var6);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.continueNode();
    java.lang.String var11 = com.google.javascript.jscomp.NodeUtil.getSourceName(var10);
    java.lang.Iterable var12 = var10.siblings();
    com.google.javascript.rhino.Node var13 = var2.copyInformationFromForTree(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.block(var2);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test239"); }


    com.google.javascript.rhino.jstype.TernaryValue var1 = com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test240() {}
//   public void test240() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test240"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.MessageFormatter var1 = null;
//     java.util.logging.Logger var2 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var3 = new com.google.javascript.jscomp.LoggerErrorManager(var1, var2);
//     var3.setTypedPercent((-1.0d));
//     var0.setErrorManager((com.google.javascript.jscomp.ErrorManager)var3);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var7 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
//     java.lang.Iterable var8 = var7.getDirectedGraphNodes();
//     var7.pushNodeAnnotations();
//     var7.popNodeAnnotations();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var11 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.script();
//     boolean var13 = var12.isCatch();
//     var12.putIntProp((-1), 0);
//     com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.script();
//     boolean var18 = var12.isEquivalentTo(var17);
//     com.google.javascript.rhino.ErrorReporter var19 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var19, false);
//     com.google.javascript.rhino.jstype.JSType var22 = null;
//     com.google.javascript.rhino.jstype.JSType var24 = var21.getGreatestSubtypeWithProperty(var22, "hi!");
//     com.google.javascript.rhino.jstype.TemplateType var25 = var24.toMaybeTemplateType();
//     com.google.javascript.rhino.ErrorReporter var26 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var26, false);
//     com.google.javascript.rhino.jstype.ObjectType var29 = null;
//     com.google.javascript.rhino.jstype.ObjectType var30 = var28.createObjectType(var29);
//     boolean var31 = var30.isString();
//     var24.matchConstraint(var30);
//     var12.setJSType(var24);
//     boolean var34 = var24.isNumber();
//     com.google.javascript.rhino.jstype.JSType var35 = var24.restrictByNotNullOrUndefined();
//     boolean var36 = var35.isStringObjectType();
//     com.google.javascript.rhino.jstype.UnionType var37 = var35.toMaybeUnionType();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var38 = var11.createDirectedGraphNode((java.lang.Object)var35);
//     java.util.List var39 = var7.getDirectedPredNodes(var38);
//     com.google.javascript.jscomp.NodeTraversal.Callback var40 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var0, var39, var40);
//     com.google.javascript.jscomp.SymbolTable var42 = var0.buildKnownSymbolTable();
// 
//   }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test241"); }


    com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
    boolean var2 = var0.isConstant("");
    java.util.Collection var3 = var0.getIndirectlyDeclaredProperties();
    com.google.javascript.rhino.ErrorReporter var4 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var4, false);
    boolean var8 = var6.isForwardDeclaredType("");
    var6.incrementGeneration();
    com.google.javascript.rhino.ErrorReporter var10 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var10, false);
    com.google.javascript.rhino.jstype.ObjectType var13 = null;
    com.google.javascript.rhino.jstype.ObjectType var14 = var12.createObjectType(var13);
    com.google.javascript.rhino.ErrorReporter var15 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var15, false);
    com.google.javascript.rhino.jstype.ObjectType var18 = null;
    com.google.javascript.rhino.jstype.ObjectType var19 = var17.createObjectType(var18);
    boolean var20 = var19.isString();
    boolean var21 = var6.resetImplicitPrototype((com.google.javascript.rhino.jstype.JSType)var13, var19);
    com.google.javascript.rhino.ErrorReporter var22 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var22, false);
    com.google.javascript.rhino.jstype.ObjectType var25 = null;
    com.google.javascript.rhino.jstype.ObjectType var26 = var24.createObjectType(var25);
    java.util.List var27 = null;
    java.util.Map var28 = null;
    var0.defineDelegateProxyPrototypeProperties(var6, (com.google.javascript.rhino.jstype.StaticScope)var25, var27, var28);
    boolean var31 = var0.isSuperClassReference("module$");
    com.google.javascript.jscomp.GoogleCodingConvention var32 = new com.google.javascript.jscomp.GoogleCodingConvention();
    com.google.javascript.rhino.Node var34 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode((com.google.javascript.jscomp.CodingConvention)var32, "hi!");
    java.util.Collection var35 = var32.getIndirectlyDeclaredProperties();
    com.google.javascript.rhino.ErrorReporter var36 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var36, false);
    boolean var40 = var38.isForwardDeclaredType("");
    com.google.javascript.rhino.jstype.JSType var42 = null;
    var38.unregisterPropertyOnType("", var42);
    com.google.javascript.rhino.ErrorReporter var44 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var44, false);
    com.google.javascript.rhino.jstype.JSType var47 = null;
    com.google.javascript.rhino.jstype.JSType var49 = var46.getGreatestSubtypeWithProperty(var47, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var50 = var49.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var51 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var51, false);
    com.google.javascript.rhino.jstype.ObjectType var54 = null;
    com.google.javascript.rhino.jstype.ObjectType var55 = var53.createObjectType(var54);
    boolean var56 = var55.isString();
    var49.matchConstraint(var55);
    com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.script();
    boolean var59 = var58.isCatch();
    var58.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var63 = com.google.javascript.rhino.IR.script();
    boolean var64 = var58.isEquivalentTo(var63);
    com.google.javascript.rhino.ErrorReporter var65 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var65, false);
    com.google.javascript.rhino.jstype.JSType var68 = null;
    com.google.javascript.rhino.jstype.JSType var70 = var67.getGreatestSubtypeWithProperty(var68, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var71 = var70.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var72 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var72, false);
    com.google.javascript.rhino.jstype.ObjectType var75 = null;
    com.google.javascript.rhino.jstype.ObjectType var76 = var74.createObjectType(var75);
    boolean var77 = var76.isString();
    var70.matchConstraint(var76);
    var58.setJSType(var70);
    boolean var80 = var70.isNumber();
    com.google.javascript.rhino.jstype.JSType var81 = var49.getGreatestSubtype(var70);
    com.google.javascript.rhino.jstype.JSType[] var82 = new com.google.javascript.rhino.jstype.JSType[] { var49};
    com.google.javascript.rhino.Node var83 = var38.createParameters(var82);
    java.util.List var84 = var32.identifyTypeDeclarationCall(var83);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var85 = var0.isOptionalParameter(var83);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var84);

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test242"); }


    java.lang.String var1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("goog.exportSymbol");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "module$goog.exportSymbol"+ "'", var1.equals("module$goog.exportSymbol"));

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test243"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
    java.lang.Iterable var4 = var2.getEachReferenceTypeWithProperty("");
    boolean var6 = var2.hasNamespace("None");
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.script();
    boolean var8 = var7.isCatch();
    var7.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.script();
    boolean var13 = var7.isEquivalentTo(var12);
    com.google.javascript.rhino.ErrorReporter var14 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var14, false);
    com.google.javascript.rhino.jstype.JSType var17 = null;
    com.google.javascript.rhino.jstype.JSType var19 = var16.getGreatestSubtypeWithProperty(var17, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var20 = var19.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var21 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21, false);
    com.google.javascript.rhino.jstype.ObjectType var24 = null;
    com.google.javascript.rhino.jstype.ObjectType var25 = var23.createObjectType(var24);
    boolean var26 = var25.isString();
    var19.matchConstraint(var25);
    var7.setJSType(var19);
    boolean var29 = var19.isBooleanObjectType();
    com.google.javascript.rhino.jstype.ObjectType var30 = var19.dereference();
    com.google.javascript.rhino.jstype.ObjectType var31 = var30.getTypeOfThis();
    java.util.Collection var32 = var2.getDirectImplementors(var30);
    com.google.javascript.rhino.ErrorReporter var34 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var34);
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.script();
    boolean var38 = var37.isCatch();
    var37.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.IR.script();
    boolean var43 = var37.isEquivalentTo(var42);
    com.google.javascript.rhino.ErrorReporter var44 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var44, false);
    com.google.javascript.rhino.jstype.JSType var47 = null;
    com.google.javascript.rhino.jstype.JSType var49 = var46.getGreatestSubtypeWithProperty(var47, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var50 = var49.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var51 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var51, false);
    com.google.javascript.rhino.jstype.ObjectType var54 = null;
    com.google.javascript.rhino.jstype.ObjectType var55 = var53.createObjectType(var54);
    boolean var56 = var55.isString();
    var49.matchConstraint(var55);
    var37.setJSType(var49);
    boolean var59 = var49.isBooleanObjectType();
    com.google.javascript.rhino.jstype.ObjectType var60 = var49.dereference();
    com.google.javascript.rhino.jstype.ObjectType var61 = var60.getTypeOfThis();
    boolean var62 = var61.isArrayType();
    com.google.javascript.rhino.Node var63 = com.google.javascript.rhino.IR.script();
    boolean var64 = var63.isCatch();
    var63.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var68 = com.google.javascript.rhino.IR.script();
    boolean var69 = var63.isEquivalentTo(var68);
    com.google.javascript.rhino.ErrorReporter var70 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var70, false);
    com.google.javascript.rhino.jstype.JSType var73 = null;
    com.google.javascript.rhino.jstype.JSType var75 = var72.getGreatestSubtypeWithProperty(var73, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var76 = var75.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var77 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var79 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var77, false);
    com.google.javascript.rhino.jstype.ObjectType var80 = null;
    com.google.javascript.rhino.jstype.ObjectType var81 = var79.createObjectType(var80);
    boolean var82 = var81.isString();
    var75.matchConstraint(var81);
    var63.setJSType(var75);
    com.google.javascript.rhino.jstype.JSType var86 = var75.getRestrictedTypeGivenToBooleanOutcome(true);
    boolean var87 = var61.canTestForShallowEqualityWith(var75);
    var35.registerPropertyOnType("", (com.google.javascript.rhino.jstype.JSType)var61);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.overwriteDeclaredType("hi!", (com.google.javascript.rhino.jstype.JSType)var61);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == true);

  }

  public void test244() {}
//   public void test244() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test244"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.SourceFile var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = null;
//     com.google.javascript.jscomp.CompilerOptions var3 = null;
//     com.google.javascript.jscomp.Result var4 = var0.compile(var1, var2, var3);
// 
//   }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test245"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
    com.google.javascript.rhino.jstype.ObjectType var3 = null;
    com.google.javascript.rhino.jstype.ObjectType var4 = var2.createObjectType(var3);
    boolean var5 = var4.isString();
    com.google.javascript.rhino.JSDocInfo var6 = null;
    var4.setJSDocInfo(var6);
    boolean var8 = var4.isNominalConstructor();
    com.google.javascript.rhino.ErrorReporter var9 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var9, false);
    com.google.javascript.rhino.jstype.JSType var12 = null;
    com.google.javascript.rhino.jstype.JSType var14 = var11.getGreatestSubtypeWithProperty(var12, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var15 = var14.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var16 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var16, false);
    com.google.javascript.rhino.jstype.ObjectType var19 = null;
    com.google.javascript.rhino.jstype.ObjectType var20 = var18.createObjectType(var19);
    boolean var21 = var20.isString();
    var14.matchConstraint(var20);
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.script();
    boolean var26 = var25.isCatch();
    var25.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.script();
    boolean var31 = var25.isEquivalentTo(var30);
    com.google.javascript.rhino.ErrorReporter var32 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32, false);
    com.google.javascript.rhino.jstype.JSType var35 = null;
    com.google.javascript.rhino.jstype.JSType var37 = var34.getGreatestSubtypeWithProperty(var35, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var38 = var37.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var39 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var39, false);
    com.google.javascript.rhino.jstype.ObjectType var42 = null;
    com.google.javascript.rhino.jstype.ObjectType var43 = var41.createObjectType(var42);
    boolean var44 = var43.isString();
    var37.matchConstraint(var43);
    var25.setJSType(var37);
    boolean var47 = var37.isNumber();
    com.google.javascript.rhino.jstype.JSType var48 = var37.restrictByNotNullOrUndefined();
    com.google.javascript.rhino.jstype.SimpleSlot var50 = new com.google.javascript.rhino.jstype.SimpleSlot("", var48, true);
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.script();
    boolean var52 = var51.isCatch();
    var51.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.script();
    boolean var57 = var51.isEquivalentTo(var56);
    com.google.javascript.rhino.ErrorReporter var58 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var58, false);
    com.google.javascript.rhino.jstype.JSType var61 = null;
    com.google.javascript.rhino.jstype.JSType var63 = var60.getGreatestSubtypeWithProperty(var61, "hi!");
    com.google.javascript.rhino.jstype.TemplateType var64 = var63.toMaybeTemplateType();
    com.google.javascript.rhino.ErrorReporter var65 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var65, false);
    com.google.javascript.rhino.jstype.ObjectType var68 = null;
    com.google.javascript.rhino.jstype.ObjectType var69 = var67.createObjectType(var68);
    boolean var70 = var69.isString();
    var63
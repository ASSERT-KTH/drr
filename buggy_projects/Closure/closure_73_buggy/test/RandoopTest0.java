
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() {}
//   public void test1() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }
// 
// 
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.Context.reportError("", "", 0, "hi!", 10);
//       fail("Expected exception of type com.google.javascript.rhino.EvaluatorException");
//     } catch (com.google.javascript.rhino.EvaluatorException e) {
//       // Expected exception.
//     }
// 
//   }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.EcmaError var2 = com.google.javascript.rhino.ScriptRuntime.typeError1("", "");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test3() {}
//   public void test3() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var3 = null;
//     java.lang.String[] var5 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var6 = com.google.javascript.jscomp.JSError.make("hi!", 1, 100, var3, var5);
// 
//   }

  public void test4() {}
//   public void test4() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }
// 
// 
//     com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot var0 = null;
//     com.google.javascript.jscomp.parsing.Config var2 = null;
//     com.google.javascript.jscomp.mozilla.rhino.ErrorReporter var3 = null;
//     com.google.javascript.rhino.Node var4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(var0, "", var2, var3);
// 
//   }

  public void test5() {}
//   public void test5() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.rhino.Node var2 = null;
//     com.google.javascript.rhino.Node var3 = null;
//     com.google.javascript.rhino.Node var4 = new com.google.javascript.rhino.Node((-1), var1, var2, var3);
// 
//   }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var1 = com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.valueOf("");
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
//     com.google.javascript.rhino.Context var0 = null;
//     com.google.javascript.rhino.ScriptRuntime.storeUint32Result(var0, 100L);
// 
//   }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = com.google.javascript.rhino.ScriptRuntime.getMessage0("");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test9() {}
//   public void test9() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }
// 
// 
//     java.util.List var0 = null;
//     com.google.javascript.jscomp.ComposeWarningsGuard var1 = new com.google.javascript.jscomp.ComposeWarningsGuard(var0);
// 
//   }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Context.checkOptimizationLevel(100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test11() {}
//   public void test11() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "hi!", false);
//     com.google.javascript.jscomp.SourceFile.Generator var5 = null;
//     com.google.javascript.jscomp.JSSourceFile var6 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var5);
//     var3.setSourceFile((com.google.javascript.jscomp.SourceFile)var6);
// 
//   }

  public void test12() {}
//   public void test12() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "hi!", false);
//     com.google.javascript.jscomp.SourceFile var4 = var3.getSourceFile();
// 
//   }

  public void test13() {}
//   public void test13() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }
// 
// 
//     java.util.List var0 = null;
//     com.google.javascript.jscomp.deps.SortedDependencies var1 = new com.google.javascript.jscomp.deps.SortedDependencies(var0);
// 
//   }

  public void test14() {}
//   public void test14() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.CompilerInput var2 = var0.getInput("hi!");
// 
//   }

  public void test15() {}
//   public void test15() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "hi!", false);
//     java.util.Collection var4 = var3.getProvides();
// 
//   }

  public void test16() {}
//   public void test16() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }
// 
// 
//     com.google.javascript.jscomp.JSModule var0 = null;
//     com.google.javascript.jscomp.JSModule[] var1 = new com.google.javascript.jscomp.JSModule[] { var0};
//     com.google.javascript.jscomp.JSModuleGraph var2 = new com.google.javascript.jscomp.JSModuleGraph(var1);
// 
//   }

  public void test17() {}
//   public void test17() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }
// 
// 
//     com.google.javascript.jscomp.ErrorManager var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
// 
//   }

  public void test18() {}
//   public void test18() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     boolean var1 = var0.acceptConstKeyword();
// 
//   }

  public void test19() {}
//   public void test19() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "hi!", false);
//     java.lang.String var4 = var3.getCode();
// 
//   }

  public void test20() {}
//   public void test20() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.rhino.Node var4 = new com.google.javascript.rhino.Node(100, var1, 10, 0);
// 
//   }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.google.javascript.jscomp.CheckLevel[] var0 = com.google.javascript.jscomp.CheckLevel.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test22() {}
//   public void test22() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = com.google.javascript.rhino.Context.getCurrentContext();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var0);
// 
//   }

  public void test23() {}
//   public void test23() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "hi!", false);
//     com.google.javascript.jscomp.CompilerInput var5 = new com.google.javascript.jscomp.CompilerInput(var0, true);
// 
//   }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var3 = var0.getEdges((java.lang.Object)100.0f, (java.lang.Object)(-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test25() {}
//   public void test25() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.JSSourceFile var2 = null;
//     com.google.javascript.jscomp.JSModule var3 = null;
//     com.google.javascript.jscomp.JSModule[] var4 = new com.google.javascript.jscomp.JSModule[] { var3};
//     com.google.javascript.jscomp.CompilerOptions var5 = null;
//     com.google.javascript.jscomp.Result var6 = var1.compile(var2, var4, var5);
// 
//   }

  public void test26() {}
//   public void test26() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var4 = null;
//     java.lang.String[] var5 = null;
//     com.google.javascript.jscomp.JSError var6 = com.google.javascript.jscomp.JSError.make("", 0, 0, var3, var4, var5);
// 
//   }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    com.google.javascript.rhino.jstype.JSType var0 = null;
    com.google.javascript.rhino.jstype.ObjectType var1 = com.google.javascript.rhino.jstype.ObjectType.cast(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test28() {}
//   public void test28() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.rhino.Node var2 = null;
//     com.google.javascript.rhino.Node var5 = new com.google.javascript.rhino.Node(100, var1, var2, 0, 1);
// 
//   }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = com.google.javascript.rhino.ScriptRuntime.getMessage1("com.google.javascript.rhino.EcmaError: : hi!", (java.lang.Object)10L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Context.reportWarning("com.google.javascript.rhino.EcmaError: : hi!", "", 10, "com.google.javascript.rhino.EcmaError: : hi!", 0);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test31() {}
//   public void test31() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.JSSourceFile var3 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
//     com.google.javascript.jscomp.JSModule var4 = null;
//     com.google.javascript.jscomp.JSModule[] var5 = new com.google.javascript.jscomp.JSModule[] { var4};
//     com.google.javascript.jscomp.CompilerOptions var6 = null;
//     com.google.javascript.jscomp.Result var7 = var0.compile(var3, var5, var6);
// 
//   }

  public void test32() {}
//   public void test32() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "hi!");
// 
//   }

  public void test33() {}
//   public void test33() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }
// 
// 
//     java.io.File var0 = null;
//     java.nio.charset.Charset var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromFile(var0, var1);
// 
//   }

  public void test34() {}
//   public void test34() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }
// 
// 
//     java.io.InputStream var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromInputStream("hi!", var1);
// 
//   }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    com.google.javascript.rhino.EcmaError var6 = com.google.javascript.rhino.ScriptRuntime.constructError("", "hi!", "hi!", (-1), "hi!", 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.initColumnNumber((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test36() {}
//   public void test36() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }
// 
// 
//     java.io.File var0 = null;
//     java.nio.charset.Charset var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromFile(var0, var1);
// 
//   }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Context.reportWarning("hi!", "com.google.javascript.rhino.EcmaError: : hi!", (-1), "hi!", (-1));
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test38() {}
//   public void test38() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     boolean var2 = var0.isPrivate("");
//     com.google.javascript.rhino.Node var3 = null;
//     com.google.javascript.rhino.Node var4 = null;
//     java.lang.String var5 = var0.extractClassNameIfRequire(var3, var4);
// 
//   }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = com.google.javascript.rhino.ScriptRuntime.escapeString("hi!", '#');
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.EcmaError var1 = com.google.javascript.rhino.ScriptRuntime.typeError0("hi!");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test41() {}
//   public void test41() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     com.google.javascript.rhino.Node var1 = null;
//     boolean var2 = var0.isVarArgsParameter(var1);
//     com.google.javascript.rhino.Node var3 = null;
//     com.google.javascript.rhino.Node var4 = null;
//     java.lang.String var5 = var0.extractClassNameIfProvide(var3, var4);
// 
//   }

  public void test42() {}
//   public void test42() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }
// 
// 
//     java.util.List var1 = null;
//     com.google.javascript.rhino.Node var2 = null;
//     com.google.javascript.rhino.Node var5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("goog.exportSymbol", var1, var2, (-1), 1);
// 
//   }

  public void test43() {}
//   public void test43() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }
// 
// 
//     com.google.javascript.jscomp.MessageFormatter var0 = null;
//     java.util.logging.Logger var1 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var2 = new com.google.javascript.jscomp.LoggerErrorManager(var0, var1);
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.rhino.Node var5 = null;
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var7, "hi!");
//     java.lang.String[] var11 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var12 = com.google.javascript.jscomp.JSError.make("", var5, var9, var11);
//     var2.println(var3, var12);
// 
//   }

  public void test44() {}
//   public void test44() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.CompilerOptions var2 = null;
//     var1.initOptions(var2);
// 
//   }

  public void test45() {}
//   public void test45() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }
// 
// 
//     java.io.InputStream var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromInputStream("goog.global", var1);
// 
//   }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
    com.google.javascript.jscomp.CompilerOptions var2 = null;
    com.google.javascript.jscomp.DefaultPassConfig var3 = new com.google.javascript.jscomp.DefaultPassConfig(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setPassConfig((com.google.javascript.jscomp.PassConfig)var3);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test47() {}
//   public void test47() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var1);
//     java.lang.String var3 = var2.getCode();
// 
//   }

  public void test48() {}
//   public void test48() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.SourceMap var2 = var1.getSourceMap();
//     com.google.javascript.jscomp.CodingConvention var3 = var1.getCodingConvention();
// 
//   }

  public void test49() {}
//   public void test49() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     com.google.javascript.rhino.Node var1 = null;
//     java.util.List var2 = var0.identifyTypeDeclarationCall(var1);
// 
//   }

  public void test50() {}
//   public void test50() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.rhino.Node var2 = null;
//     com.google.javascript.rhino.Node var3 = new com.google.javascript.rhino.Node(100, var1, var2);
// 
//   }

  public void test51() {}
//   public void test51() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     com.google.javascript.jscomp.JSError[] var2 = var0.getWarnings();
// 
//   }

  public void test52() {}
//   public void test52() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     java.lang.String[] var1 = var0.toSourceArray();
// 
//   }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.io.PrintStream var1 = null;
    com.google.javascript.jscomp.Compiler var2 = new com.google.javascript.jscomp.Compiler(var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var0.isConnected((java.lang.Object)var1, (java.lang.Object)"hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var1 = var0.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var3 = var0.createDirectedGraphNode((java.lang.Object)100);
    com.google.javascript.rhino.EcmaError var10 = com.google.javascript.rhino.ScriptRuntime.constructError("", "hi!", "hi!", (-1), "hi!", 1);
    java.lang.String var11 = var10.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var12 = var0.getOutEdges((java.lang.Object)var10);
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "com.google.javascript.rhino.EcmaError: : hi!"+ "'", var11.equals("com.google.javascript.rhino.EcmaError: : hi!"));

  }

  public void test55() {}
//   public void test55() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }
// 
// 
//     java.io.InputStream var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromInputStream("", var1);
// 
//   }

  public void test56() {}
//   public void test56() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var1);
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var2, true);
//     java.lang.String var5 = var2.getCode();
// 
//   }

  public void test57() {}
//   public void test57() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     java.nio.charset.Charset var3 = null;
//     com.google.javascript.jscomp.JSSourceFile var4 = com.google.javascript.jscomp.JSSourceFile.fromFile("goog.exportProperty", var3);
//     com.google.javascript.jscomp.JSSourceFile[] var5 = new com.google.javascript.jscomp.JSSourceFile[] { var4};
//     com.google.javascript.jscomp.JSSourceFile var8 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
//     com.google.javascript.jscomp.JSSourceFile[] var9 = new com.google.javascript.jscomp.JSSourceFile[] { var8};
//     com.google.javascript.jscomp.CompilerOptions var10 = null;
//     com.google.javascript.jscomp.Result var11 = var0.compile(var5, var9, var10);
// 
//   }

  public void test58() {}
//   public void test58() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     boolean var2 = var0.isPrivate("");
//     java.lang.String var3 = var0.getExportSymbolFunction();
//     com.google.javascript.rhino.Node var4 = null;
//     java.lang.String var5 = var0.identifyTypeDefAssign(var4);
// 
//   }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.MessageFormatter var1 = null;
    java.util.logging.Logger var2 = null;
    com.google.javascript.jscomp.LoggerErrorManager var3 = new com.google.javascript.jscomp.LoggerErrorManager(var1, var2);
    com.google.javascript.rhino.EcmaError var10 = com.google.javascript.rhino.ScriptRuntime.constructError("", "hi!", "hi!", (-1), "hi!", 1);
    java.lang.String var11 = var10.toString();
    var10.initLineNumber(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.disconnect((java.lang.Object)var2, (java.lang.Object)100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "com.google.javascript.rhino.EcmaError: : hi!"+ "'", var11.equals("com.google.javascript.rhino.EcmaError: : hi!"));

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.EcmaError var2 = com.google.javascript.rhino.ScriptRuntime.typeError1("hi!", "hi!");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test61() {}
//   public void test61() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }
// 
// 
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.Context.exit();
//       fail("Expected exception of type java.lang.RuntimeException");
//     } catch (java.lang.RuntimeException e) {
//       // Expected exception.
//     }
// 
//   }

  public void test62() {}
//   public void test62() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Region var3 = var0.getSourceRegion(": hi!", 100);
// 
//   }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }


    boolean var1 = com.google.javascript.rhino.Context.isValidLanguageVersion((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var8 = var3.clonePropsFrom(var7);
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var17 = var12.clonePropsFrom(var16);
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var26 = var21.clonePropsFrom(var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.replaceChildAfter(var16, var21);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    var3.setType(10);
    var3.setOptionalArg(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setDouble(10.0d);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var1 = var0.newSubGraph();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var2 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var3 = var2.newSubGraph();
    com.google.javascript.jscomp.Compiler var5 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var6 = var5.getTopScope();
    var5.disableThreads();
    var5.disableThreads();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var0.isConnectedInDirection((java.lang.Object)var3, (java.lang.Object)(-1L), (java.lang.Object)var5);
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
    assertNull(var6);

  }

  public void test67() {}
//   public void test67() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }
// 
// 
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var2);
//     java.util.Collection var4 = var3.getRequires();
// 
//   }

  public void test68() {}
//   public void test68() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.SourceFile.Generator var3 = null;
//     com.google.javascript.jscomp.JSSourceFile var4 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var3);
//     var4.clearCachedSource();
//     com.google.javascript.rhino.Node var6 = var1.parse(var4);
// 
//   }

  public void test69() {}
//   public void test69() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.JSSourceFile var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var4 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
//     com.google.javascript.jscomp.CompilerOptions var5 = null;
//     com.google.javascript.jscomp.Result var6 = var0.compile(var1, var4, var5);
// 
//   }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }


    boolean var1 = com.google.javascript.rhino.Context.isValidOptimizationLevel(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.jscomp.SourceFile.Generator var2 = null;
    com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var2);
    com.google.javascript.jscomp.JsAst var4 = new com.google.javascript.jscomp.JsAst(var3);
    java.lang.RuntimeException var5 = com.google.javascript.rhino.ScriptRuntime.notFunctionError((java.lang.Object)var0, (java.lang.Object)var3);
    com.google.javascript.rhino.EcmaError var12 = com.google.javascript.rhino.ScriptRuntime.constructError("", "hi!", "hi!", (-1), "hi!", 1);
    java.lang.String var13 = var12.toString();
    com.google.javascript.jscomp.SourceFile.Generator var15 = null;
    com.google.javascript.jscomp.SourceFile var16 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var15);
    java.lang.Object var17 = new java.lang.Object();
    java.lang.String var18 = com.google.javascript.rhino.ScriptRuntime.toString(var17);
    java.lang.Object var19 = null;
    java.lang.RuntimeException var20 = com.google.javascript.rhino.ScriptRuntime.undefWriteError((java.lang.Object)"hi!", var17, var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var21 = var0.getDirectedGraphEdges((java.lang.Object)var12, (java.lang.Object)"hi!");
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "com.google.javascript.rhino.EcmaError: : hi!"+ "'", var13.equals("com.google.javascript.rhino.EcmaError: : hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.jscomp.SourceFile.Generator var2 = null;
    com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var2);
    com.google.javascript.jscomp.JsAst var4 = new com.google.javascript.jscomp.JsAst(var3);
    java.lang.RuntimeException var5 = com.google.javascript.rhino.ScriptRuntime.notFunctionError((java.lang.Object)var0, (java.lang.Object)var3);
    com.google.javascript.jscomp.SourceFile.Generator var7 = null;
    com.google.javascript.jscomp.SourceFile var8 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var7);
    com.google.javascript.jscomp.JsAst var9 = new com.google.javascript.jscomp.JsAst(var8);
    com.google.javascript.jscomp.MessageFormatter var10 = null;
    java.util.logging.Logger var11 = null;
    com.google.javascript.jscomp.LoggerErrorManager var12 = new com.google.javascript.jscomp.LoggerErrorManager(var10, var11);
    int var13 = var12.getErrorCount();
    double var14 = var12.getTypedPercent();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.disconnect((java.lang.Object)var9, (java.lang.Object)var14);
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);

  }

  public void test73() {}
//   public void test73() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }
// 
// 
//     java.io.File var0 = null;
//     com.google.javascript.jscomp.SourceFile var1 = com.google.javascript.jscomp.SourceFile.fromFile(var0);
// 
//   }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.VariableRenamingPolicy var1 = com.google.javascript.jscomp.VariableRenamingPolicy.valueOf("goog.global");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var1 = var0.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var3 = var0.createDirectedGraphNode((java.lang.Object)100);
    com.google.javascript.jscomp.ClosureCodingConvention var4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    java.lang.String var5 = var4.getGlobalObject();
    java.lang.String var6 = var4.getExportPropertyFunction();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var7 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var8 = var7.newSubGraph();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var0.isConnected((java.lang.Object)var4, (java.lang.Object)var7, (java.lang.Object)'4');
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
    assertTrue("'" + var5 + "' != '" + "goog.global"+ "'", var5.equals("goog.global"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "goog.exportProperty"+ "'", var6.equals("goog.exportProperty"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }


    java.lang.String var1 = com.google.javascript.rhino.ScriptRuntime.escapeString("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.EcmaError var6 = com.google.javascript.rhino.ScriptRuntime.constructError("hi!", "com.google.javascript.rhino.EcmaError: : hi!", "com.google.javascript.rhino.EcmaError: : hi!", 100, "goog.exportProperty", (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }


    com.google.javascript.rhino.EcmaError var6 = com.google.javascript.rhino.ScriptRuntime.constructError(": hi!", "hi!", "goog.exportSymbol", 100, "goog.global", 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.initLineSource("hi!");
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test79() {}
//   public void test79() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
//     com.google.javascript.rhino.Context var1 = null;
//     com.google.javascript.rhino.Context var2 = com.google.javascript.rhino.Context.enter(var1);
//     var2.setCompileFunctionsWithDynamicScope(false);
//     com.google.javascript.jscomp.MessageFormatter var5 = null;
//     java.util.logging.Logger var6 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var7 = new com.google.javascript.jscomp.LoggerErrorManager(var5, var6);
//     com.google.javascript.jscomp.CheckLevel var8 = null;
//     com.google.javascript.rhino.Node var10 = null;
//     com.google.javascript.jscomp.CheckLevel var12 = null;
//     com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var12, "hi!");
//     java.lang.String[] var16 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var17 = com.google.javascript.jscomp.JSError.make("", var10, var14, var16);
//     var7.report(var8, var17);
//     var2.removeThreadLocal((java.lang.Object)var17);
//     int var20 = var2.getInstructionObserverThreshold();
//     var2.addActivationName("goog.exportProperty");
//     com.google.javascript.jscomp.SourceAst var23 = null;
//     com.google.javascript.jscomp.CompilerInput var26 = new com.google.javascript.jscomp.CompilerInput(var23, "hi!", false);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       boolean var28 = var0.isConnectedInDirection((java.lang.Object)"goog.exportProperty", (java.lang.Object)false, (java.lang.Object)(-1L));
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var2);
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
//     assertTrue(var20 == 0);
// 
//   }

  public void test80() {}
//   public void test80() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var1 = new com.google.javascript.jscomp.CompilerInput(var0);
// 
//   }

  public void test81() {}
//   public void test81() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticGroup var0 = null;
//     com.google.javascript.jscomp.DiagnosticGroup[] var1 = new com.google.javascript.jscomp.DiagnosticGroup[] { var0};
//     com.google.javascript.jscomp.DiagnosticGroup var2 = new com.google.javascript.jscomp.DiagnosticGroup(var1);
// 
//   }

  public void test82() {}
//   public void test82() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
//     com.google.javascript.jscomp.SourceFile.Generator var2 = null;
//     com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var2);
//     com.google.javascript.jscomp.JsAst var4 = new com.google.javascript.jscomp.JsAst(var3);
//     java.lang.RuntimeException var5 = com.google.javascript.rhino.ScriptRuntime.notFunctionError((java.lang.Object)var0, (java.lang.Object)var3);
//     java.io.Reader var6 = var3.getCodeReader();
// 
//   }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Context.reportWarning(": hi!");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    java.lang.Object var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = var0.getNodeDegree(var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }


    com.google.javascript.rhino.EcmaError var6 = com.google.javascript.rhino.ScriptRuntime.constructError("", "hi!", "hi!", (-1), "hi!", 1);
    java.lang.String var7 = var6.toString();
    var6.initLineNumber(100);
    java.lang.String var10 = var6.details();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.initSourceName("goog.global");
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.google.javascript.rhino.EcmaError: : hi!"+ "'", var7.equals("com.google.javascript.rhino.EcmaError: : hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ": hi!"+ "'", var10.equals(": hi!"));

  }

  public void test86() {}
//   public void test86() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }
// 
// 
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var8 = var3.clonePropsFrom(var7);
//     com.google.javascript.rhino.jstype.JSType var9 = null;
//     var7.setJSType(var9);
//     var7.setOptionalArg(true);
//     com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var21 = var16.clonePropsFrom(var20);
//     var21.putProp((-1), (java.lang.Object)10.0d);
//     com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var33 = var28.clonePropsFrom(var32);
//     com.google.javascript.rhino.Node var34 = var21.copyInformationFrom(var33);
//     com.google.javascript.rhino.Node var35 = var7.getChildBefore(var33);
// 
//   }

  public void test87() {}
//   public void test87() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticGroup var1 = null;
//     com.google.javascript.jscomp.DiagnosticGroup[] var2 = new com.google.javascript.jscomp.DiagnosticGroup[] { var1};
//     com.google.javascript.jscomp.DiagnosticGroup var3 = new com.google.javascript.jscomp.DiagnosticGroup("goog.exportProperty", var2);
// 
//   }

  public void test88() {}
//   public void test88() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }
// 
// 
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.EvaluatorException var5 = com.google.javascript.rhino.Context.reportRuntimeError("com.google.javascript.rhino.EcmaError: : hi!", "goog.exportSymbol", 0, "goog.exportSymbol", (-1));
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
// 
//   }

  public void test89() {}
//   public void test89() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     var0.disableThreads();
//     boolean var4 = var0.isIdeMode();
// 
//   }

  public void test90() {}
//   public void test90() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.Collection var1 = var0.getNodes();
//     java.util.List var2 = var0.getEdges();
//     var0.popEdgeAnnotations();
// 
//   }

  public void test91() {}
//   public void test91() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.DiagnosticType var2 = null;
//     java.lang.String[] var4 = new java.lang.String[] { "goog.exportSymbol"};
//     com.google.javascript.jscomp.JSError var5 = com.google.javascript.jscomp.JSError.make("com.google.javascript.rhino.EcmaError: : hi!", var1, var2, var4);
// 
//   }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }


    com.google.javascript.rhino.EcmaError var7 = com.google.javascript.rhino.ScriptRuntime.constructError("", "hi!", "hi!", (-1), "hi!", 1);
    java.lang.String var8 = var7.details();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var17 = var12.clonePropsFrom(var16);
    var17.putProp((-1), (java.lang.Object)10.0d);
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var29 = var24.clonePropsFrom(var28);
    com.google.javascript.rhino.Node var30 = var17.copyInformationFrom(var29);
    com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var39 = var34.clonePropsFrom(var38);
    com.google.javascript.rhino.Node var41 = var38.getAncestor(0);
    java.lang.String var42 = var30.checkTreeEquals(var38);
    com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var47 = var46.getType();
    com.google.javascript.rhino.Node var48 = var46.cloneTree();
    com.google.javascript.rhino.Node.AncestorIterable var49 = var48.getAncestors();
    com.google.javascript.jscomp.Compiler var50 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var51 = var50.getTopScope();
    var50.disableThreads();
    var50.disableThreads();
    com.google.javascript.jscomp.NodeTraversal.Callback var54 = null;
    com.google.javascript.jscomp.NodeTraversal var55 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var50, var54);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var56 = com.google.javascript.rhino.ScriptRuntime.getMessage4("", (java.lang.Object)var8, (java.lang.Object)var30, (java.lang.Object)var48, (java.lang.Object)var54);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ": hi!"+ "'", var8.equals(": hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }


    com.google.javascript.rhino.EcmaError var6 = com.google.javascript.rhino.ScriptRuntime.constructError("", "hi!", "hi!", (-1), "hi!", 1);
    java.lang.String var7 = var6.details();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.initLineSource("goog.exportProperty");
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ": hi!"+ "'", var7.equals(": hi!"));

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
    com.google.javascript.jscomp.SourceMap var2 = var0.getSourceMap();
    com.google.javascript.jscomp.JSSourceFile var5 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
    com.google.javascript.jscomp.SourceFile.Generator var7 = null;
    com.google.javascript.jscomp.JSSourceFile var8 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var7);
    com.google.javascript.jscomp.CompilerInput var10 = new com.google.javascript.jscomp.CompilerInput(var8, true);
    com.google.javascript.jscomp.CompilerOptions var11 = new com.google.javascript.jscomp.CompilerOptions();
    var11.setAcceptConstKeyword(true);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var14 = var11.getTweakProcessing();
    var11.setRewriteNewDateGoogNow(false);
    com.google.javascript.jscomp.Result var17 = var0.compile(var5, var8, var11);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var18 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var19 = var18.newSubGraph();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var20 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var21 = var20.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var23 = var20.createDirectedGraphNode((java.lang.Object)100);
    java.util.List var24 = var18.getDirectedPredNodes(var23);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var25 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var26 = var25.newSubGraph();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var27 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var28 = var27.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var30 = var27.createDirectedGraphNode((java.lang.Object)100);
    java.util.List var31 = var25.getDirectedPredNodes(var30);
    com.google.javascript.jscomp.CompilerOptions var32 = new com.google.javascript.jscomp.CompilerOptions();
    var32.setAcceptConstKeyword(true);
    var32.setTweakToStringLiteral("goog.exportProperty", "goog.exportSymbol");
    var32.setShadowVariables(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.Result var40 = var0.compile(var24, var31, var32);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
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
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Context.checkLanguageVersion(10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var1 = com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.valueOf("com.google.javascript.rhino.EcmaError: : hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test97() {}
//   public void test97() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     var0.disableThreads();
//     com.google.javascript.jscomp.NodeTraversal.Callback var4 = null;
//     com.google.javascript.jscomp.NodeTraversal var5 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var0, var4);
//     com.google.javascript.jscomp.Compiler.CodeBuilder var6 = null;
//     com.google.javascript.rhino.Node var9 = new com.google.javascript.rhino.Node(10);
//     var0.toSource(var6, 40, var9);
// 
//   }

  public void test98() {}
//   public void test98() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     var0.disableThreads();
//     com.google.javascript.jscomp.Result var4 = var0.getResult();
// 
//   }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }


    long var1 = com.google.javascript.rhino.ScriptRuntime.testUint32String("goog.exportProperty");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test100() {}
//   public void test100() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     boolean var2 = var0.isPrivate("");
//     boolean var4 = var0.isPrivate("goog.exportProperty");
//     boolean var6 = var0.isConstant("com.google.javascript.rhino.EcmaError: : hi!");
//     com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var15 = var10.clonePropsFrom(var14);
//     com.google.javascript.rhino.jstype.JSType var16 = null;
//     var14.setJSType(var16);
//     var14.setOptionalArg(true);
//     int var20 = var14.getLineno();
//     com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var29 = var24.clonePropsFrom(var28);
//     com.google.javascript.rhino.jstype.JSType var30 = null;
//     var28.setJSType(var30);
//     java.lang.String var32 = var0.extractClassNameIfProvide(var14, var28);
//     com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var41 = var36.clonePropsFrom(var40);
//     com.google.javascript.rhino.jstype.JSType var42 = null;
//     var40.setJSType(var42);
//     var40.setOptionalArg(true);
//     int var46 = var40.getLineno();
//     boolean var47 = var40.isLocalResultCall();
//     boolean var48 = var40.isQuotedString();
//     java.util.List var49 = var0.identifyTypeDeclarationCall(var40);
// 
//   }

  public void test101() {}
//   public void test101() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var1);
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var2, true);
//     com.google.javascript.jscomp.SourceFile.Generator var6 = null;
//     com.google.javascript.jscomp.SourceFile var7 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var6);
//     com.google.javascript.jscomp.JsAst var8 = new com.google.javascript.jscomp.JsAst(var7);
//     var4.setSourceFile(var7);
//     java.lang.String var11 = var4.getLine(10);
// 
//   }

  public void test102() {}
//   public void test102() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var1);
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var2, true);
//     java.lang.String var5 = var4.getCode();
// 
//   }

  public void test103() {}
//   public void test103() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.CompilerInput var2 = var0.newExternInput("goog.exportSymbol");
// 
//   }

  public void test104() {}
//   public void test104() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }
// 
// 
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var4 = var3.getType();
//     int var5 = var3.getSourcePosition();
//     com.google.javascript.rhino.Node var6 = var3.getLastSibling();
//     com.google.javascript.rhino.Node var7 = var3.removeFirstChild();
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var16 = var11.clonePropsFrom(var15);
//     var16.putProp((-1), (java.lang.Object)10.0d);
//     com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var28 = var23.clonePropsFrom(var27);
//     com.google.javascript.rhino.Node var29 = var16.copyInformationFrom(var28);
//     com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var34 = var33.getType();
//     int var35 = var33.getSourcePosition();
//     com.google.javascript.rhino.Node var36 = var33.getLastSibling();
//     var3.addChildBefore(var29, var36);
// 
//   }

  public void test105() {}
//   public void test105() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     java.lang.String var2 = var1.toSource();
// 
//   }

  public void test106() {}
//   public void test106() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.SourceMap var2 = var1.getSourceMap();
//     boolean var3 = var1.acceptConstKeyword();
// 
//   }

  public void test107() {}
//   public void test107() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }
// 
// 
//     java.util.List var0 = null;
//     com.google.javascript.jscomp.JSModuleGraph var1 = new com.google.javascript.jscomp.JSModuleGraph(var0);
// 
//   }

  public void test108() {}
//   public void test108() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }
// 
// 
//     com.google.javascript.jscomp.MessageFormatter var0 = null;
//     java.util.logging.Logger var1 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var2 = new com.google.javascript.jscomp.LoggerErrorManager(var0, var1);
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.rhino.Node var5 = null;
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var7, "hi!");
//     java.lang.String[] var11 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var12 = com.google.javascript.jscomp.JSError.make("", var5, var9, var11);
//     var2.report(var3, var12);
//     com.google.javascript.jscomp.CheckLevel var14 = null;
//     com.google.javascript.rhino.Node var16 = null;
//     com.google.javascript.jscomp.CheckLevel var18 = null;
//     com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var18, "hi!");
//     java.lang.String[] var22 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var23 = com.google.javascript.jscomp.JSError.make("", var16, var20, var22);
//     var2.println(var14, var23);
// 
//   }

  public void test109() {}
//   public void test109() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     boolean var2 = var0.isPrivate("");
//     boolean var4 = var0.isPrivate("goog.exportProperty");
//     boolean var6 = var0.isConstant("com.google.javascript.rhino.EcmaError: : hi!");
//     com.google.javascript.rhino.Node var7 = null;
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     var11.setType(10);
//     var11.setOptionalArg(false);
//     java.lang.String var16 = var0.extractClassNameIfProvide(var7, var11);
//     com.google.javascript.rhino.jstype.FunctionType var17 = null;
//     com.google.javascript.rhino.jstype.FunctionType var18 = null;
//     com.google.javascript.rhino.jstype.ObjectType var19 = null;
//     var0.applySingletonGetter(var17, var18, var19);
// 
//   }

  public void test110() {}
//   public void test110() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.Collection var1 = var0.getNodes();
//     java.util.List var2 = var0.getEdges();
//     var0.popNodeAnnotations();
// 
//   }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }


    com.google.javascript.rhino.Context var0 = com.google.javascript.rhino.Context.enter();
    boolean var1 = var0.isGeneratingDebugChanged();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var6 = var5.getType();
    com.google.javascript.rhino.Node var7 = var5.cloneTree();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.unseal((java.lang.Object)var7);
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
    assertTrue(var6 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test112() {}
//   public void test112() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }
// 
// 
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var4 = var3.getType();
//     com.google.javascript.rhino.Node var5 = var3.cloneTree();
//     com.google.javascript.rhino.Node var7 = var5.getChildAtIndex(100);
// 
//   }

  public void test113() {}
//   public void test113() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "");
// 
//   }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.EcmaError var4 = com.google.javascript.rhino.ScriptRuntime.typeError3("com.google.javascript.rhino.EcmaError: : hi!", "goog.exportSymbol", "", "");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test115() {}
//   public void test115() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test115"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var1);
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var2, true);
//     com.google.javascript.jscomp.MessageFormatter var5 = null;
//     java.util.logging.Logger var6 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var7 = new com.google.javascript.jscomp.LoggerErrorManager(var5, var6);
//     var4.setErrorManager((com.google.javascript.jscomp.ErrorManager)var7);
//     java.util.Collection var9 = var4.getProvides();
// 
//   }

  public void test116() {}
//   public void test116() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, ": hi!");
// 
//   }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var8 = var3.clonePropsFrom(var7);
    com.google.javascript.rhino.jstype.JSType var9 = null;
    var7.setJSType(var9);
    var7.setOptionalArg(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var14 = var7.getAncestor((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }


    java.lang.String var1 = com.google.javascript.rhino.Node.tokenToName(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "eof"+ "'", var1.equals("eof"));

  }

  public void test119() {}
//   public void test119() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     var0.setAcceptConstKeyword(true);
//     com.google.javascript.jscomp.CompilerOptions.TweakProcessing var3 = var0.getTweakProcessing();
//     var0.setRewriteNewDateGoogNow(false);
//     com.google.javascript.jscomp.CompilerOptions.TweakProcessing var6 = var0.getTweakProcessing();
//     var0.setCollapsePropertiesOnExternTypes(false);
//     com.google.javascript.jscomp.WarningsGuard var9 = null;
//     var0.addWarningsGuard(var9);
// 
//   }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }


    com.google.javascript.rhino.EcmaError var6 = com.google.javascript.rhino.ScriptRuntime.constructError("", "hi!", "hi!", (-1), "hi!", 1);
    java.lang.String var7 = var6.toString();
    var6.initLineNumber(100);
    java.lang.String var10 = var6.details();
    java.lang.String var11 = var6.details();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.initLineSource("goog.global");
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.google.javascript.rhino.EcmaError: : hi!"+ "'", var7.equals("com.google.javascript.rhino.EcmaError: : hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ": hi!"+ "'", var10.equals(": hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ": hi!"+ "'", var11.equals(": hi!"));

  }

  public void test121() {}
//   public void test121() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.rhino.Node var2 = new com.google.javascript.rhino.Node(100, var1);
// 
//   }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test122"); }


    com.google.javascript.rhino.EcmaError var6 = com.google.javascript.rhino.ScriptRuntime.constructError("", "hi!", "hi!", (-1), "hi!", 1);
    java.lang.String var7 = var6.toString();
    int var8 = var6.lineNumber();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.initColumnNumber(40);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.google.javascript.rhino.EcmaError: : hi!"+ "'", var7.equals("com.google.javascript.rhino.EcmaError: : hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test123() {}
//   public void test123() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticGroup var1 = null;
//     com.google.javascript.jscomp.DiagnosticGroup[] var2 = new com.google.javascript.jscomp.DiagnosticGroup[] { var1};
//     com.google.javascript.jscomp.DiagnosticGroup var3 = new com.google.javascript.jscomp.DiagnosticGroup("com.google.javascript.rhino.EcmaError: : hi!", var2);
// 
//   }

  public void test124() {}
//   public void test124() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.SubGraph var1 = var0.newSubGraph();
//     var0.pushNodeAnnotations();
//     java.util.List var3 = var0.getGraphvizEdges();
//     java.lang.Object var4 = null;
//     java.util.List var5 = var0.getNeighborNodes(var4);
// 
//   }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test125"); }


    boolean var1 = com.google.javascript.rhino.ScriptRuntime.isJSLineTerminator((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test126"); }


    com.google.javascript.jscomp.parsing.Config var2 = null;
    com.google.javascript.jscomp.mozilla.rhino.ErrorReporter var3 = null;
    java.util.logging.Logger var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var5 = com.google.javascript.jscomp.parsing.ParserRunner.parse("goog.exportSymbol", "hi!", var2, var3, var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test127() {}
//   public void test127() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test127"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     com.google.javascript.jscomp.SourceMap var2 = var0.getSourceMap();
//     var0.reportCodeChange();
//     com.google.javascript.jscomp.CompilerInput var5 = var0.newExternInput(": hi!");
// 
//   }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test128"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    java.lang.String var2 = var0.getName();
    com.google.javascript.jscomp.ClosureCodingConvention var3 = new com.google.javascript.jscomp.ClosureCodingConvention();
    boolean var5 = var3.isPrivate("");
    boolean var7 = var3.isPrivate("goog.exportProperty");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var0.getWeight((java.lang.Object)var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "LinkedGraph"+ "'", var2.equals("LinkedGraph"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test129() {}
//   public void test129() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test129"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = com.google.javascript.rhino.Context.enter();
//     var0.setInstructionObserverThreshold(0);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var0.setInstructionObserverThreshold((-1));
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var0);
// 
//   }

  public void test130() {}
//   public void test130() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test130"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     var0.clearNodeAnnotations();
//     var0.popEdgeAnnotations();
// 
//   }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test131"); }


    com.google.javascript.jscomp.SourceFile.Generator var1 = null;
    com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var1);
    com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var2, true);
    com.google.javascript.jscomp.Compiler var5 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var6 = var5.getTopScope();
    com.google.javascript.jscomp.Scope var7 = var5.getTopScope();
    var4.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var5);
    com.google.javascript.jscomp.JSModule var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var10 = var5.toSourceArray(var9);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test132() {}
//   public void test132() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test132"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.SourceMap var2 = var1.getSourceMap();
//     com.google.javascript.jscomp.JSError[] var3 = var1.getMessages();
// 
//   }

  public void test133() {}
//   public void test133() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test133"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     var0.disableThreads();
//     com.google.javascript.jscomp.MessageFormatter var4 = null;
//     java.util.logging.Logger var5 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var6 = new com.google.javascript.jscomp.LoggerErrorManager(var4, var5);
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.rhino.Node var9 = null;
//     com.google.javascript.jscomp.CheckLevel var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var11, "hi!");
//     java.lang.String[] var15 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("", var9, var13, var15);
//     var6.report(var7, var16);
//     var0.setErrorManager((com.google.javascript.jscomp.ErrorManager)var6);
//     boolean var19 = var0.isIdeMode();
// 
//   }

  public void test134() {}
//   public void test134() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test134"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     com.google.javascript.jscomp.SourceMap var2 = var0.getSourceMap();
//     com.google.javascript.rhino.Context var3 = null;
//     com.google.javascript.rhino.Context var4 = com.google.javascript.rhino.Context.enter(var3);
//     var4.setCompileFunctionsWithDynamicScope(false);
//     com.google.javascript.jscomp.MessageFormatter var7 = null;
//     java.util.logging.Logger var8 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var9 = new com.google.javascript.jscomp.LoggerErrorManager(var7, var8);
//     com.google.javascript.jscomp.CheckLevel var10 = null;
//     com.google.javascript.rhino.Node var12 = null;
//     com.google.javascript.jscomp.CheckLevel var14 = null;
//     com.google.javascript.jscomp.DiagnosticType var16 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var14, "hi!");
//     java.lang.String[] var18 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var19 = com.google.javascript.jscomp.JSError.make("", var12, var16, var18);
//     var9.report(var10, var19);
//     var4.removeThreadLocal((java.lang.Object)var19);
//     com.google.javascript.jscomp.CheckLevel var22 = var0.getErrorLevel(var19);
// 
//   }

  public void test135() {}
//   public void test135() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test135"); }
// 
// 
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var8 = var3.clonePropsFrom(var7);
//     com.google.javascript.rhino.jstype.JSType var9 = null;
//     var7.setJSType(var9);
//     var7.setOptionalArg(true);
//     com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newString(": hi!", 100, 10);
//     var7.removeChild(var16);
// 
//   }

  public void test136() {}
//   public void test136() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test136"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = com.google.javascript.rhino.Context.enter();
//     var0.setInstructionObserverThreshold(0);
//     java.beans.PropertyChangeListener var3 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var0.addPropertyChangeListener(var3);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var0);
// 
//   }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test137"); }


    com.google.javascript.rhino.Context.checkOptimizationLevel((-1));

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test138"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var4 = var3.getType();
    int var5 = var3.getSourcePosition();
    java.lang.String var6 = var3.getQualifiedName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var3.getExistingIntProp(40);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test139"); }


    java.lang.String var1 = com.google.javascript.rhino.Node.tokenToName(40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "string"+ "'", var1.equals("string"));

  }

  public void test140() {}
//   public void test140() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test140"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.SubGraph var1 = var0.newSubGraph();
//     var0.pushNodeAnnotations();
//     java.util.List var3 = var0.getGraphvizEdges();
//     var0.popEdgeAnnotations();
// 
//   }

  public void test141() {}
//   public void test141() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test141"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = null;
//     com.google.javascript.rhino.Context var1 = com.google.javascript.rhino.Context.enter(var0);
//     var1.setCompileFunctionsWithDynamicScope(false);
//     com.google.javascript.jscomp.MessageFormatter var4 = null;
//     java.util.logging.Logger var5 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var6 = new com.google.javascript.jscomp.LoggerErrorManager(var4, var5);
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.rhino.Node var9 = null;
//     com.google.javascript.jscomp.CheckLevel var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var11, "hi!");
//     java.lang.String[] var15 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("", var9, var13, var15);
//     var6.report(var7, var16);
//     var1.removeThreadLocal((java.lang.Object)var16);
//     int var19 = var1.getInstructionObserverThreshold();
//     var1.addActivationName("goog.exportProperty");
//     com.google.javascript.jscomp.SourceFile var24 = com.google.javascript.jscomp.SourceFile.fromCode("goog.exportProperty", "goog.exportProperty");
//     java.lang.Object var25 = null;
//     var1.putThreadLocal((java.lang.Object)"goog.exportProperty", var25);
// 
//   }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test142"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.lang.Object var1 = null;
    com.google.javascript.jscomp.ClosureCodingConvention var2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var3 = null;
    boolean var4 = var2.isVarArgsParameter(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.graph.Graph.GraphEdge var5 = var0.getFirstEdge(var1, (java.lang.Object)var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test143"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    var0.clearNodeAnnotations();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var2 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
    java.io.PrintStream var3 = null;
    com.google.javascript.jscomp.Compiler var4 = new com.google.javascript.jscomp.Compiler(var3);
    com.google.javascript.jscomp.SourceMap var5 = var4.getSourceMap();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var6 = var0.getDirectedGraphEdges((java.lang.Object)var2, (java.lang.Object)var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test144"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var1 = var0.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var3 = var0.createDirectedGraphNode((java.lang.Object)100);
    java.util.List var4 = var0.getGraphvizNodes();
    var0.clearNodeAnnotations();
    com.google.javascript.jscomp.CompilerOptions var6 = new com.google.javascript.jscomp.CompilerOptions();
    var6.setAcceptConstKeyword(true);
    java.util.Map var9 = var6.getTweakReplacements();
    var6.setDefineToNumberLiteral("eof", 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var14 = var0.getDirectedGraphEdges((java.lang.Object)1, (java.lang.Object)1);
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
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test145() {}
//   public void test145() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test145"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = null;
//     com.google.javascript.rhino.Context var1 = com.google.javascript.rhino.Context.enter(var0);
//     var1.setCompileFunctionsWithDynamicScope(false);
//     com.google.javascript.jscomp.MessageFormatter var4 = null;
//     java.util.logging.Logger var5 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var6 = new com.google.javascript.jscomp.LoggerErrorManager(var4, var5);
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.rhino.Node var9 = null;
//     com.google.javascript.jscomp.CheckLevel var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var11, "hi!");
//     java.lang.String[] var15 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("", var9, var13, var15);
//     var6.report(var7, var16);
//     var1.removeThreadLocal((java.lang.Object)var16);
//     int var19 = var1.getInstructionObserverThreshold();
//     var1.addActivationName("goog.exportProperty");
//     java.util.Locale var22 = null;
//     java.util.Locale var23 = var1.setLocale(var22);
//     java.beans.PropertyChangeListener var24 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var1.addPropertyChangeListener(var24);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var23);
// 
//   }

  public void test146() {}
//   public void test146() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test146"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var1);
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var2, true);
//     com.google.javascript.jscomp.Compiler var5 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var6 = var5.getTopScope();
//     com.google.javascript.jscomp.Scope var7 = var5.getTopScope();
//     var4.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var5);
//     com.google.javascript.jscomp.JSSourceFile var9 = null;
//     com.google.javascript.jscomp.JSSourceFile var11 = com.google.javascript.jscomp.JSSourceFile.fromFile("");
//     com.google.javascript.jscomp.JSSourceFile[] var12 = new com.google.javascript.jscomp.JSSourceFile[] { var11};
//     com.google.javascript.jscomp.CompilerOptions var13 = null;
//     com.google.javascript.jscomp.Result var14 = var5.compile(var9, var12, var13);
// 
//   }

  public void test147() {}
//   public void test147() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test147"); }
// 
// 
//     java.io.Reader var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromReader(": hi!", var1);
// 
//   }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test148"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.PropertyRenamingPolicy var1 = com.google.javascript.jscomp.PropertyRenamingPolicy.valueOf(": hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test149() {}
//   public void test149() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test149"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     var0.disableThreads();
//     com.google.javascript.jscomp.Compiler.IntermediateState var4 = null;
//     var0.setState(var4);
// 
//   }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test150"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    com.google.javascript.jscomp.SourceFile.Generator var3 = null;
    com.google.javascript.jscomp.JSSourceFile var4 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var3);
    com.google.javascript.jscomp.CompilerInput var6 = new com.google.javascript.jscomp.CompilerInput(var4, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.graph.Graph.GraphEdge var8 = var0.getFirstEdge((java.lang.Object)var6, (java.lang.Object)100.0f);
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

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test151"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    com.google.javascript.jscomp.ClosureCodingConvention var2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    boolean var4 = var2.isPrivate("");
    boolean var6 = var2.isPrivate("goog.exportProperty");
    boolean var8 = var2.isConstant("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var9 = var0.getInEdges((java.lang.Object)var2);
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
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test152"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
    com.google.javascript.jscomp.SourceMap var2 = var0.getSourceMap();
    com.google.javascript.jscomp.JSSourceFile var5 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
    com.google.javascript.jscomp.SourceFile.Generator var7 = null;
    com.google.javascript.jscomp.JSSourceFile var8 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var7);
    com.google.javascript.jscomp.CompilerInput var10 = new com.google.javascript.jscomp.CompilerInput(var8, true);
    com.google.javascript.jscomp.CompilerOptions var11 = new com.google.javascript.jscomp.CompilerOptions();
    var11.setAcceptConstKeyword(true);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var14 = var11.getTweakProcessing();
    var11.setRewriteNewDateGoogNow(false);
    com.google.javascript.jscomp.Result var17 = var0.compile(var5, var8, var11);
    com.google.javascript.jscomp.CompilerOptions var18 = new com.google.javascript.jscomp.CompilerOptions();
    var18.setAcceptConstKeyword(true);
    java.util.Map var21 = var18.getTweakReplacements();
    var0.initOptions(var18);
    com.google.javascript.jscomp.Compiler var23 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var24 = var23.getTopScope();
    com.google.javascript.jscomp.SourceMap var25 = var23.getSourceMap();
    com.google.javascript.jscomp.JSSourceFile var28 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
    com.google.javascript.jscomp.SourceFile.Generator var30 = null;
    com.google.javascript.jscomp.JSSourceFile var31 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var30);
    com.google.javascript.jscomp.CompilerInput var33 = new com.google.javascript.jscomp.CompilerInput(var31, true);
    com.google.javascript.jscomp.CompilerOptions var34 = new com.google.javascript.jscomp.CompilerOptions();
    var34.setAcceptConstKeyword(true);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var37 = var34.getTweakProcessing();
    var34.setRewriteNewDateGoogNow(false);
    com.google.javascript.jscomp.Result var40 = var23.compile(var28, var31, var34);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var41 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var42 = var41.newSubGraph();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var43 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var44 = var43.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var46 = var43.createDirectedGraphNode((java.lang.Object)100);
    java.util.List var47 = var41.getDirectedPredNodes(var46);
    com.google.javascript.jscomp.JSModuleGraph var48 = new com.google.javascript.jscomp.JSModuleGraph(var47);
    com.google.javascript.jscomp.NodeTraversal.Callback var49 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var23, var47, var49);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var51 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var52 = var51.newSubGraph();
    var51.pushNodeAnnotations();
    java.util.List var54 = var51.getGraphvizEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var55 = new com.google.javascript.jscomp.ComposeWarningsGuard(var54);
    com.google.javascript.jscomp.CompilerOptions var56 = new com.google.javascript.jscomp.CompilerOptions();
    var56.setAcceptConstKeyword(true);
    var56.lineLengthThreshold(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.Result var61 = var0.compileModules(var47, var54, var56);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
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
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test153"); }


    com.google.javascript.jscomp.ClosureCodingConvention var1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var2 = null;
    boolean var3 = var1.isVarArgsParameter(var2);
    boolean var5 = var1.isPrivate("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = com.google.javascript.rhino.ScriptRuntime.getMessage1("goog.exportSymbol", (java.lang.Object)var5);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test154() {}
//   public void test154() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test154"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = com.google.javascript.rhino.Context.enter();
//     boolean var1 = var0.isGeneratingDebugChanged();
//     var0.setLanguageVersion(0);
//     java.beans.PropertyChangeListener var4 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var0.addPropertyChangeListener(var4);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == false);
// 
//   }

  public void test155() {}
//   public void test155() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test155"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     boolean var2 = var0.isPrivate("");
//     java.lang.String var3 = var0.getExportSymbolFunction();
//     boolean var5 = var0.isSuperClassReference("");
//     java.util.Collection var6 = var0.getAssertionFunctions();
//     com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var11 = var10.getType();
//     com.google.javascript.rhino.Node var12 = var10.cloneTree();
//     com.google.javascript.jscomp.CodingConvention.SubclassRelationship var13 = var0.getClassesDefinedByCall(var12);
// 
//   }

  public void test156() {}
//   public void test156() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test156"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var1);
//     com.google.javascript.jscomp.JsAst var3 = new com.google.javascript.jscomp.JsAst(var2);
//     com.google.javascript.jscomp.Compiler var4 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var5 = var4.getTopScope();
//     com.google.javascript.rhino.Node var6 = var3.getAstRoot((com.google.javascript.jscomp.AbstractCompiler)var4);
// 
//   }

  public void test157() {}
//   public void test157() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test157"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     com.google.javascript.jscomp.SourceMap var2 = var0.getSourceMap();
//     com.google.javascript.jscomp.JSSourceFile var5 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
//     com.google.javascript.jscomp.SourceFile.Generator var7 = null;
//     com.google.javascript.jscomp.JSSourceFile var8 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var7);
//     com.google.javascript.jscomp.CompilerInput var10 = new com.google.javascript.jscomp.CompilerInput(var8, true);
//     com.google.javascript.jscomp.CompilerOptions var11 = new com.google.javascript.jscomp.CompilerOptions();
//     var11.setAcceptConstKeyword(true);
//     com.google.javascript.jscomp.CompilerOptions.TweakProcessing var14 = var11.getTweakProcessing();
//     var11.setRewriteNewDateGoogNow(false);
//     com.google.javascript.jscomp.Result var17 = var0.compile(var5, var8, var11);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var18 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.SubGraph var19 = var18.newSubGraph();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var20 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.SubGraph var21 = var20.newSubGraph();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var23 = var20.createDirectedGraphNode((java.lang.Object)100);
//     java.util.List var24 = var18.getDirectedPredNodes(var23);
//     com.google.javascript.jscomp.JSModuleGraph var25 = new com.google.javascript.jscomp.JSModuleGraph(var24);
//     com.google.javascript.jscomp.NodeTraversal.Callback var26 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var0, var24, var26);
//     com.google.javascript.rhino.Node var29 = null;
//     com.google.javascript.jscomp.CheckLevel var31 = null;
//     com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var31, "hi!");
//     java.lang.String[] var35 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var36 = com.google.javascript.jscomp.JSError.make("", var29, var33, var35);
//     var0.report(var36);
// 
//   }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test158"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var4 = var3.getType();
    com.google.javascript.rhino.Node var5 = var3.cloneTree();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var11 = var10.getType();
    java.lang.String var12 = var10.getQualifiedName();
    com.google.javascript.rhino.Node var13 = new com.google.javascript.rhino.Node(100, var10);
    com.google.javascript.rhino.Node var14 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.replaceChildAfter(var10, var14);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test159"); }


    java.lang.String var1 = com.google.javascript.rhino.ScriptRuntime.escapeString("goog.abstractMethod");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "goog.abstractMethod"+ "'", var1.equals("goog.abstractMethod"));

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test160"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Context.reportWarning("com.google.javascript.rhino.EcmaError: TypeError: Cannot set property \"hi!: hi!\" of 0 to \"40\"");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test161() {}
//   public void test161() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test161"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     java.lang.String var1 = var0.getGlobalObject();
//     com.google.javascript.rhino.jstype.FunctionType var2 = null;
//     com.google.javascript.rhino.jstype.FunctionType var3 = null;
//     com.google.javascript.rhino.jstype.ObjectType var4 = null;
//     var0.applySingletonGetter(var2, var3, var4);
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
//     com.google.javascript.jscomp.SourceMap var2 = var1.getSourceMap();
//     java.nio.charset.Charset var4 = null;
//     com.google.javascript.jscomp.JSSourceFile var5 = com.google.javascript.jscomp.JSSourceFile.fromFile("goog.exportProperty", var4);
//     com.google.javascript.jscomp.JSSourceFile var6 = null;
//     com.google.javascript.jscomp.Compiler var7 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var8 = var7.getTopScope();
//     com.google.javascript.jscomp.SourceMap var9 = var7.getSourceMap();
//     com.google.javascript.jscomp.JSSourceFile var12 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
//     com.google.javascript.jscomp.SourceFile.Generator var14 = null;
//     com.google.javascript.jscomp.JSSourceFile var15 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var14);
//     com.google.javascript.jscomp.CompilerInput var17 = new com.google.javascript.jscomp.CompilerInput(var15, true);
//     com.google.javascript.jscomp.CompilerOptions var18 = new com.google.javascript.jscomp.CompilerOptions();
//     var18.setAcceptConstKeyword(true);
//     com.google.javascript.jscomp.CompilerOptions.TweakProcessing var21 = var18.getTweakProcessing();
//     var18.setRewriteNewDateGoogNow(false);
//     com.google.javascript.jscomp.Result var24 = var7.compile(var12, var15, var18);
//     var18.setTweakToStringLiteral("com.google.javascript.rhino.EcmaError: : hi!", "goog.exportSymbol");
//     com.google.javascript.jscomp.Result var28 = var1.compile(var5, var6, var18);
// 
//   }

  public void test163() {}
//   public void test163() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test163"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     var0.setAcceptConstKeyword(true);
//     com.google.javascript.jscomp.CompilerOptions.TweakProcessing var3 = var0.getTweakProcessing();
//     var0.setRewriteNewDateGoogNow(false);
//     com.google.javascript.jscomp.CompilerOptions.TweakProcessing var6 = var0.getTweakProcessing();
//     com.google.javascript.jscomp.DiagnosticGroup var7 = null;
//     com.google.javascript.jscomp.CheckLevel var8 = null;
//     var0.setWarningLevel(var7, var8);
//     java.util.Set var10 = null;
//     var0.setIdGenerators(var10);
// 
//   }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test164"); }


    java.util.logging.Level var0 = null;
    com.google.javascript.jscomp.Compiler.setLoggingLevel(var0);

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test165"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var1 = var0.newSubGraph();
    java.lang.Object var2 = null;
    com.google.javascript.jscomp.MessageFormatter var3 = null;
    java.util.logging.Logger var4 = null;
    com.google.javascript.jscomp.LoggerErrorManager var5 = new com.google.javascript.jscomp.LoggerErrorManager(var3, var4);
    int var6 = var5.getErrorCount();
    double var7 = var5.getTypedPercent();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var8 = var0.getDirectedGraphEdges(var2, (java.lang.Object)var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test166"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var5 = var4.getType();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var10 = var9.getType();
    int var11 = var9.getChildCount();
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    var9.addChildrenToFront(var15);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var21 = var20.getType();
    com.google.javascript.rhino.Node var22 = var20.cloneTree();
    var20.addSuppression("");
    com.google.javascript.rhino.EcmaError var31 = com.google.javascript.rhino.ScriptRuntime.constructError("", "hi!", "hi!", (-1), "hi!", 1);
    java.lang.RuntimeException var32 = com.google.javascript.rhino.ScriptRuntime.undefReadError((java.lang.Object)var20, (java.lang.Object)"hi!");
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var41 = var36.clonePropsFrom(var40);
    com.google.javascript.rhino.jstype.JSType var42 = null;
    var40.setJSType(var42);
    var40.setOptionalArg(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var46 = new com.google.javascript.rhino.Node(0, var4, var15, var20, var40);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test167() {}
//   public void test167() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test167"); }
// 
// 
//     com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot var0 = null;
//     com.google.javascript.jscomp.parsing.Config var2 = null;
//     com.google.javascript.jscomp.mozilla.rhino.ErrorReporter var3 = null;
//     com.google.javascript.rhino.Node var4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(var0, "STRING ", var2, var3);
// 
//   }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test168"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var8 = var3.clonePropsFrom(var7);
    boolean var9 = var8.isUnscopedQualifiedName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var10 = var8.getDouble();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test169() {}
//   public void test169() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test169"); }
// 
// 
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var2);
//     com.google.javascript.jscomp.SourceAst var4 = var3.getSourceAst();
//     java.util.Collection var5 = var3.getRequires();
// 
//   }

  public void test170() {}
//   public void test170() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test170"); }
// 
// 
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.Context.reportError("", "goog.abstractMethod", (-1), "hi!. hi! at (unknown source) line (unknown line) : (unknown column)", (-1));
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
// 
//   }

  public void test171() {}
//   public void test171() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test171"); }
// 
// 
//     java.io.InputStream var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromInputStream("null(null)", var1);
// 
//   }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test172"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
    com.google.javascript.jscomp.SourceMap var2 = var0.getSourceMap();
    var0.reportCodeChange();
    com.google.javascript.jscomp.CompilerOptions var4 = new com.google.javascript.jscomp.CompilerOptions();
    var4.setAcceptConstKeyword(true);
    var4.setTweakToStringLiteral("goog.exportProperty", "goog.exportSymbol");
    var4.setShadowVariables(true);
    var4.setColorizeErrorOutput(true);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var14 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var15 = var14.newSubGraph();
    var14.pushNodeAnnotations();
    java.util.List var17 = var14.getGraphvizEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var18 = new com.google.javascript.jscomp.ComposeWarningsGuard(var17);
    var4.setManageClosureDependencies(var17);
    com.google.javascript.jscomp.CompilerOptions var20 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var23 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var24 = var23.getNodes();
    java.util.List var25 = var23.getEdges();
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    var29.setType(10);
    com.google.javascript.rhino.Node var34 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", var25, var29, 1, 100);
    var20.setReplaceStringsConfiguration("hi!", var25);
    com.google.javascript.jscomp.CompilerOptions var36 = new com.google.javascript.jscomp.CompilerOptions();
    var36.setAcceptConstKeyword(true);
    java.util.Map var39 = var36.getTweakReplacements();
    var36.setDefineToDoubleLiteral("", 0.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.Result var43 = var0.compile(var17, var25, var36);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test173"); }


    com.google.javascript.rhino.Context.checkLanguageVersion(100);

  }

  public void test174() {}
//   public void test174() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test174"); }
// 
// 
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var8 = var3.clonePropsFrom(var7);
//     com.google.javascript.rhino.jstype.JSType var9 = null;
//     var7.setJSType(var9);
//     var7.setOptionalArg(true);
//     int var13 = var7.getLineno();
//     com.google.javascript.rhino.jstype.JSType var14 = var7.getJSType();
//     com.google.javascript.rhino.Node.SideEffectFlags var15 = null;
//     var7.setSideEffectFlags(var15);
// 
//   }

  public void test175() {}
//   public void test175() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test175"); }
// 
// 
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.Context.reportError("com.google.javascript.rhino.EcmaError: : hi!: goog.global", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)", 0, "com.google.javascript.rhino.EcmaError: TypeError: Cannot set property \"hi!: hi!\" of 0 to \"40\"", 100);
//       fail("Expected exception of type com.google.javascript.rhino.EvaluatorException");
//     } catch (com.google.javascript.rhino.EvaluatorException e) {
//       // Expected exception.
//     }
// 
//   }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test176"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var8 = var3.clonePropsFrom(var7);
    var8.putProp((-1), (java.lang.Object)10.0d);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var20 = var15.clonePropsFrom(var19);
    com.google.javascript.rhino.Node var21 = var8.copyInformationFrom(var20);
    boolean var22 = var20.hasOneChild();
    var20.setIsSyntheticBlock(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test177() {}
//   public void test177() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test177"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     var0.disableThreads();
//     var0.optimize();
// 
//   }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test178"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var9 = var4.clonePropsFrom(var8);
    com.google.javascript.rhino.Node var11 = var8.getAncestor(0);
    java.util.Set var12 = var8.getDirectives();
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    var16.setType(10);
    var16.setOptionalArg(false);
    var8.addChildrenToBack(var16);
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var30 = var25.clonePropsFrom(var29);
    var30.putProp((-1), (java.lang.Object)10.0d);
    com.google.javascript.rhino.Node var36 = new com.google.javascript.rhino.Node(10, var8, var30, 0, 1);
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var45 = var40.clonePropsFrom(var44);
    var45.putProp((-1), (java.lang.Object)10.0d);
    com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var57 = var52.clonePropsFrom(var56);
    com.google.javascript.rhino.Node var58 = var45.copyInformationFrom(var57);
    int var59 = var45.getLineno();
    com.google.javascript.rhino.Node var61 = new com.google.javascript.rhino.Node((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.addChildBefore(var45, var61);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == (-1));

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test179"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var1 = var0.newSubGraph();
    var0.pushNodeAnnotations();
    java.util.List var3 = var0.getGraphvizEdges();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var12 = var7.clonePropsFrom(var11);
    var12.putProp((-1), (java.lang.Object)10.0d);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var24 = var19.clonePropsFrom(var23);
    com.google.javascript.rhino.Node var25 = var12.copyInformationFrom(var24);
    int var26 = var12.getLineno();
    com.google.javascript.rhino.EcmaError var33 = com.google.javascript.rhino.ScriptRuntime.constructError("", "hi!", "hi!", (-1), "hi!", 1);
    java.lang.String var34 = var33.toString();
    var33.initLineNumber(100);
    java.lang.String var37 = var33.details();
    java.lang.String var38 = var33.details();
    java.lang.String var39 = var33.getSourceName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var40 = var0.isConnectedInDirection((java.lang.Object)var26, (java.lang.Object)var33);
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "com.google.javascript.rhino.EcmaError: : hi!"+ "'", var34.equals("com.google.javascript.rhino.EcmaError: : hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ": hi!"+ "'", var37.equals(": hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + ": hi!"+ "'", var38.equals(": hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test180"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var1 = var0.newSubGraph();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var2 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var3 = var2.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var5 = var2.createDirectedGraphNode((java.lang.Object)100);
    java.util.List var6 = var0.getDirectedPredNodes(var5);
    com.google.javascript.jscomp.SourceFile.Generator var8 = null;
    com.google.javascript.jscomp.JSSourceFile var9 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var8);
    com.google.javascript.jscomp.CompilerInput var11 = new com.google.javascript.jscomp.CompilerInput(var9, true);
    com.google.javascript.jscomp.SourceFile.Generator var13 = null;
    com.google.javascript.jscomp.SourceFile var14 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var13);
    com.google.javascript.jscomp.JsAst var15 = new com.google.javascript.jscomp.JsAst(var14);
    var11.setSourceFile(var14);
    com.google.javascript.jscomp.JsAst var17 = new com.google.javascript.jscomp.JsAst(var14);
    var17.clearAst();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var19 = var0.getInEdges((java.lang.Object)var17);
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
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test181"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var4 = var3.getType();
    java.lang.String var5 = var3.getQualifiedName();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var14 = var9.clonePropsFrom(var13);
    com.google.javascript.rhino.Node var15 = var3.clonePropsFrom(var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var16 = var3.detachFromParent();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test182"); }


    com.google.javascript.rhino.Context.checkLanguageVersion(0);

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test183"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var4 = var3.getType();
    com.google.javascript.rhino.Node var5 = var3.cloneTree();
    var3.addSuppression("");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test184() {}
//   public void test184() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test184"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "hi!", false);
//     com.google.javascript.jscomp.JSModule var4 = null;
//     var3.setModule(var4);
//     com.google.javascript.jscomp.Compiler var6 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var7 = var6.getTopScope();
//     var6.disableThreads();
//     var6.disableThreads();
//     var3.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var6);
//     var6.check();
// 
//   }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test185"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = com.google.javascript.rhino.ScriptRuntime.escapeString(": hi!", 'a');
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test186"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var8 = var3.clonePropsFrom(var7);
    com.google.javascript.rhino.Node var9 = var3.removeChildren();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test187"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Context.reportWarning("goog.abstractMethod");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test188() {}
//   public void test188() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test188"); }
// 
// 
//     java.io.InputStream var2 = null;
//     com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromInputStream("", "com.google.javascript.rhino.EcmaError: : hi!: goog.global", var2);
// 
//   }

  public void test189() {}
//   public void test189() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test189"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     boolean var2 = var0.isPrivate("");
//     boolean var4 = var0.isPrivate("goog.exportProperty");
//     com.google.javascript.rhino.jstype.FunctionType var5 = null;
//     com.google.javascript.rhino.jstype.FunctionType var6 = null;
//     com.google.javascript.rhino.jstype.ObjectType var7 = null;
//     var0.applySingletonGetter(var5, var6, var7);
// 
//   }

  public void test190() {}
//   public void test190() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test190"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "hi!", false);
//     com.google.javascript.jscomp.JSModule var4 = null;
//     var3.setModule(var4);
//     boolean var6 = var3.isExtern();
//     com.google.javascript.jscomp.Region var8 = var3.getRegion(100);
// 
//   }

  public void test191() {}
//   public void test191() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test191"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = com.google.javascript.rhino.Context.enter();
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var2 = var1.getTopScope();
//     com.google.javascript.jscomp.SourceMap var3 = var1.getSourceMap();
//     com.google.javascript.jscomp.JSSourceFile var6 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
//     com.google.javascript.jscomp.SourceFile.Generator var8 = null;
//     com.google.javascript.jscomp.JSSourceFile var9 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var8);
//     com.google.javascript.jscomp.CompilerInput var11 = new com.google.javascript.jscomp.CompilerInput(var9, true);
//     com.google.javascript.jscomp.CompilerOptions var12 = new com.google.javascript.jscomp.CompilerOptions();
//     var12.setAcceptConstKeyword(true);
//     com.google.javascript.jscomp.CompilerOptions.TweakProcessing var15 = var12.getTweakProcessing();
//     var12.setRewriteNewDateGoogNow(false);
//     com.google.javascript.jscomp.Result var18 = var1.compile(var6, var9, var12);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var19 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.SubGraph var20 = var19.newSubGraph();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var21 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.SubGraph var22 = var21.newSubGraph();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var24 = var21.createDirectedGraphNode((java.lang.Object)100);
//     java.util.List var25 = var19.getDirectedPredNodes(var24);
//     com.google.javascript.jscomp.JSModuleGraph var26 = new com.google.javascript.jscomp.JSModuleGraph(var25);
//     com.google.javascript.jscomp.NodeTraversal.Callback var27 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var25, var27);
//     com.google.javascript.rhino.EcmaError var35 = com.google.javascript.rhino.ScriptRuntime.constructError("", "hi!", "hi!", (-1), "hi!", 1);
//     java.lang.String var36 = var35.toString();
//     var0.putThreadLocal((java.lang.Object)var27, (java.lang.Object)var35);
// 
//   }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test192"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
    var0.disableThreads();
    com.google.javascript.rhino.Node var3 = var0.getRoot();
    com.google.javascript.jscomp.CompilerOptions var4 = null;
    com.google.javascript.jscomp.DefaultPassConfig var5 = new com.google.javascript.jscomp.DefaultPassConfig(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setPassConfig((com.google.javascript.jscomp.PassConfig)var5);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test193() {}
//   public void test193() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test193"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = null;
//     com.google.javascript.rhino.Context var1 = com.google.javascript.rhino.Context.enter(var0);
//     var1.setCompileFunctionsWithDynamicScope(false);
//     com.google.javascript.jscomp.MessageFormatter var4 = null;
//     java.util.logging.Logger var5 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var6 = new com.google.javascript.jscomp.LoggerErrorManager(var4, var5);
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.rhino.Node var9 = null;
//     com.google.javascript.jscomp.CheckLevel var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var11, "hi!");
//     java.lang.String[] var15 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("", var9, var13, var15);
//     var6.report(var7, var16);
//     var1.removeThreadLocal((java.lang.Object)var16);
//     com.google.javascript.jscomp.CheckLevel var19 = null;
//     com.google.javascript.jscomp.Compiler var20 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var21 = var20.getTopScope();
//     var20.disableThreads();
//     var20.disableThreads();
//     com.google.javascript.jscomp.MessageFormatter var24 = null;
//     java.util.logging.Logger var25 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var26 = new com.google.javascript.jscomp.LoggerErrorManager(var24, var25);
//     com.google.javascript.jscomp.CheckLevel var27 = null;
//     com.google.javascript.rhino.Node var29 = null;
//     com.google.javascript.jscomp.CheckLevel var31 = null;
//     com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var31, "hi!");
//     java.lang.String[] var35 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var36 = com.google.javascript.jscomp.JSError.make("", var29, var33, var35);
//     var26.report(var27, var36);
//     var20.setErrorManager((com.google.javascript.jscomp.ErrorManager)var26);
//     com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var39 = null;
//     com.google.javascript.jscomp.LightweightMessageFormatter var40 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var20, var39);
//     java.lang.String var41 = var16.format(var19, (com.google.javascript.jscomp.MessageFormatter)var40);
// 
//   }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test194"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var1 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var2 = var1.getNodes();
    java.util.List var3 = var1.getEdges();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    var7.setType(10);
    com.google.javascript.rhino.Node var12 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", var3, var7, 1, 100);
    com.google.javascript.jscomp.ComposeWarningsGuard var13 = new com.google.javascript.jscomp.ComposeWarningsGuard(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.deps.SortedDependencies var14 = new com.google.javascript.jscomp.deps.SortedDependencies(var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test195() {}
//   public void test195() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test195"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     com.google.javascript.jscomp.SourceMap var2 = var0.getSourceMap();
//     var0.reportCodeChange();
//     int var4 = var0.getErrorCount();
// 
//   }

  public void test196() {}
//   public void test196() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test196"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticGroup var0 = null;
//     com.google.javascript.jscomp.CheckLevel var1 = null;
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var2 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var0, var1);
//     java.lang.String var3 = var2.toString();
//     com.google.javascript.rhino.Node var6 = null;
//     com.google.javascript.jscomp.CheckLevel var8 = null;
//     com.google.javascript.jscomp.DiagnosticType var10 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var8, "hi!");
//     java.lang.String[] var12 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var13 = com.google.javascript.jscomp.JSError.make("", var6, var10, var12);
//     java.lang.RuntimeException var15 = com.google.javascript.rhino.ScriptRuntime.undefWriteError((java.lang.Object)(short)0, (java.lang.Object)var10, (java.lang.Object)40);
//     com.google.javascript.jscomp.DiagnosticType[] var16 = new com.google.javascript.jscomp.DiagnosticType[] { var10};
//     com.google.javascript.jscomp.DiagnosticGroup var17 = new com.google.javascript.jscomp.DiagnosticGroup(var16);
//     com.google.javascript.jscomp.DiagnosticGroup[] var18 = new com.google.javascript.jscomp.DiagnosticGroup[] { var17};
//     com.google.javascript.jscomp.DiagnosticGroup var19 = new com.google.javascript.jscomp.DiagnosticGroup(var18);
//     boolean var20 = var2.disables(var19);
// 
//   }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test197"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Context.reportWarning("null(null)");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test198() {}
//   public void test198() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test198"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var5 = var4.getType();
//     int var6 = var4.getSourcePosition();
//     com.google.javascript.rhino.Node var7 = var4.getLastSibling();
//     boolean var8 = var4.isSyntheticBlock();
//     com.google.javascript.rhino.Node var9 = var4.cloneNode();
//     java.lang.String var10 = var0.getSingletonGetterClassName(var4);
// 
//   }

  public void test199() {}
//   public void test199() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test199"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = com.google.javascript.rhino.Context.enter();
//     boolean var1 = var0.isGeneratingDebugChanged();
//     var0.setGeneratingSource(true);
//     int var4 = var0.getOptimizationLevel();
//     boolean var5 = var0.isGeneratingSource();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var6 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.SubGraph var7 = var6.newSubGraph();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var9 = var6.createDirectedGraphNode((java.lang.Object)100);
//     java.util.List var10 = var6.getGraphvizNodes();
//     java.lang.Object var11 = var0.getThreadLocal((java.lang.Object)var10);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.ScriptRuntime.storeUint32Result(var0, (-1L));
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == true);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var10);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var11);
// 
//   }

  public void test200() {}
//   public void test200() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test200"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = com.google.javascript.rhino.Context.enter();
//     var0.setInstructionObserverThreshold(0);
//     com.google.javascript.rhino.ErrorReporter var3 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.ErrorReporter var4 = var0.setErrorReporter(var3);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var0);
// 
//   }

  public void test201() {}
//   public void test201() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test201"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var3 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.Collection var4 = var3.getNodes();
//     java.util.List var5 = var3.getEdges();
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     var9.setType(10);
//     com.google.javascript.rhino.Node var14 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", var5, var9, 1, 100);
//     com.google.javascript.jscomp.NodeTraversal.Callback var15 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var5, var15);
//     boolean var17 = var1.isIdeMode();
// 
//   }

  public void test202() {}
//   public void test202() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test202"); }
// 
// 
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var8 = var3.clonePropsFrom(var7);
//     boolean var9 = var8.isUnscopedQualifiedName();
//     com.google.javascript.rhino.Node var11 = var8.getChildAtIndex(10);
// 
//   }

  public void test203() {}
//   public void test203() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test203"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     var0.disableThreads();
//     com.google.javascript.jscomp.MessageFormatter var4 = null;
//     java.util.logging.Logger var5 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var6 = new com.google.javascript.jscomp.LoggerErrorManager(var4, var5);
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.rhino.Node var9 = null;
//     com.google.javascript.jscomp.CheckLevel var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var11, "hi!");
//     java.lang.String[] var15 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("", var9, var13, var15);
//     var6.report(var7, var16);
//     var0.setErrorManager((com.google.javascript.jscomp.ErrorManager)var6);
//     com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var19 = null;
//     com.google.javascript.jscomp.LightweightMessageFormatter var20 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var0, var19);
//     com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var30 = var25.clonePropsFrom(var29);
//     var30.putProp((-1), (java.lang.Object)10.0d);
//     com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var42 = var37.clonePropsFrom(var41);
//     com.google.javascript.rhino.Node var43 = var30.copyInformationFrom(var42);
//     com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var52 = var47.clonePropsFrom(var51);
//     com.google.javascript.rhino.Node var54 = var51.getAncestor(0);
//     java.lang.String var55 = var43.checkTreeEquals(var51);
//     com.google.javascript.jscomp.DiagnosticType var58 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.Compiler var59 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var60 = var59.getTopScope();
//     var59.disableThreads();
//     var59.disableThreads();
//     com.google.javascript.jscomp.NodeTraversal.Callback var63 = null;
//     com.google.javascript.jscomp.NodeTraversal var64 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var59, var63);
//     com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var70 = var69.getType();
//     java.lang.String var71 = var69.getQualifiedName();
//     com.google.javascript.rhino.Node var72 = new com.google.javascript.rhino.Node(100, var69);
//     com.google.javascript.jscomp.CheckLevel var73 = null;
//     com.google.javascript.jscomp.DiagnosticType var76 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     java.lang.String[] var78 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var79 = var64.makeError(var69, var73, var76, var78);
//     com.google.javascript.jscomp.JSError var80 = com.google.javascript.jscomp.JSError.make("", var51, var58, var78);
//     java.lang.String var81 = var20.formatError(var80);
// 
//   }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test204"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    java.util.List var2 = var0.getEdges();
    com.google.javascript.jscomp.CompilerOptions var3 = new com.google.javascript.jscomp.CompilerOptions();
    var3.setAcceptConstKeyword(true);
    var3.setTweakToStringLiteral("goog.exportProperty", "goog.exportSymbol");
    var3.setShadowVariables(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var11 = var0.getOutEdges((java.lang.Object)true);
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

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test205"); }


    com.google.javascript.rhino.EcmaError var2 = com.google.javascript.rhino.ScriptRuntime.constructError("goog.global", "");
    int var3 = var2.getColumnNumber();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.initLineNumber(0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test206() {}
//   public void test206() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test206"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticGroup var0 = null;
//     com.google.javascript.jscomp.CheckLevel var1 = null;
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var2 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var0, var1);
//     com.google.javascript.rhino.Context var3 = null;
//     com.google.javascript.rhino.Context var4 = com.google.javascript.rhino.Context.enter(var3);
//     var4.setCompileFunctionsWithDynamicScope(false);
//     com.google.javascript.jscomp.MessageFormatter var7 = null;
//     java.util.logging.Logger var8 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var9 = new com.google.javascript.jscomp.LoggerErrorManager(var7, var8);
//     com.google.javascript.jscomp.CheckLevel var10 = null;
//     com.google.javascript.rhino.Node var12 = null;
//     com.google.javascript.jscomp.CheckLevel var14 = null;
//     com.google.javascript.jscomp.DiagnosticType var16 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var14, "hi!");
//     java.lang.String[] var18 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var19 = com.google.javascript.jscomp.JSError.make("", var12, var16, var18);
//     var9.report(var10, var19);
//     var4.removeThreadLocal((java.lang.Object)var19);
//     com.google.javascript.jscomp.CheckLevel var22 = var2.level(var19);
// 
//   }

  public void test207() {}
//   public void test207() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test207"); }
// 
// 
//     java.io.InputStream var2 = null;
//     com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromInputStream("hi!", "LinkedGraph", var2);
// 
//   }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test208"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    var0.clearEdgeAnnotations();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    var5.setType(10);
    boolean var8 = var5.isLocalResultCall();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var9 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var10 = var9.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var12 = var9.createDirectedGraphNode((java.lang.Object)100);
    var9.clearNodeAnnotations();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.disconnectInDirection((java.lang.Object)var8, (java.lang.Object)var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test209() {}
//   public void test209() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test209"); }
// 
// 
//     java.io.InputStream var2 = null;
//     com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromInputStream("goog.exportSymbol", "null(null)", var2);
// 
//   }

  public void test210() {}
//   public void test210() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test210"); }
// 
// 
//     com.google.javascript.jscomp.SourceExcerptProvider var0 = null;
//     com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var1 = null;
//     com.google.javascript.jscomp.LightweightMessageFormatter var2 = new com.google.javascript.jscomp.LightweightMessageFormatter(var0, var1);
// 
//   }

  public void test211() {}
//   public void test211() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test211"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticGroup var0 = null;
//     com.google.javascript.jscomp.CheckLevel var1 = null;
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var2 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var0, var1);
//     com.google.javascript.rhino.Node var5 = null;
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var7, "hi!");
//     java.lang.String[] var11 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var12 = com.google.javascript.jscomp.JSError.make("", var5, var9, var11);
//     java.lang.RuntimeException var14 = com.google.javascript.rhino.ScriptRuntime.undefWriteError((java.lang.Object)(short)0, (java.lang.Object)var9, (java.lang.Object)40);
//     com.google.javascript.jscomp.DiagnosticType[] var15 = new com.google.javascript.jscomp.DiagnosticType[] { var9};
//     com.google.javascript.jscomp.DiagnosticGroup var16 = new com.google.javascript.jscomp.DiagnosticGroup(var15);
//     boolean var17 = var2.enables(var16);
// 
//   }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test212"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var8 = var3.clonePropsFrom(var7);
    var8.putProp((-1), (java.lang.Object)10.0d);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var20 = var15.clonePropsFrom(var19);
    com.google.javascript.rhino.Node var21 = var8.copyInformationFrom(var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var22 = var8.getDouble();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test213"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var5 = var4.getType();
    java.lang.String var6 = var4.getQualifiedName();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var15 = var10.clonePropsFrom(var14);
    com.google.javascript.rhino.Node var16 = var4.clonePropsFrom(var14);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var25 = var20.clonePropsFrom(var24);
    com.google.javascript.rhino.jstype.JSType var26 = null;
    var25.setJSType(var26);
    java.util.Collection var28 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(var25);
    boolean var29 = var25.isSyntheticBlock();
    com.google.javascript.rhino.Node var32 = new com.google.javascript.rhino.Node(100, var14, var25, 1, (-1));
    java.lang.String var33 = var25.getString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var25.setSideEffectFlags(40);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));

  }

  public void test214() {}
//   public void test214() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test214"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     var0.disableThreads();
//     com.google.javascript.jscomp.NodeTraversal.Callback var4 = null;
//     com.google.javascript.jscomp.NodeTraversal var5 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var0, var4);
//     com.google.javascript.jscomp.SourceFile.Generator var7 = null;
//     com.google.javascript.jscomp.JSSourceFile var8 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var7);
//     com.google.javascript.jscomp.CompilerInput var10 = new com.google.javascript.jscomp.CompilerInput(var8, true);
//     com.google.javascript.jscomp.MessageFormatter var11 = null;
//     java.util.logging.Logger var12 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var13 = new com.google.javascript.jscomp.LoggerErrorManager(var11, var12);
//     var10.setErrorManager((com.google.javascript.jscomp.ErrorManager)var13);
//     int var15 = var13.getWarningCount();
//     var0.setErrorManager((com.google.javascript.jscomp.ErrorManager)var13);
//     var13.setTypedPercent(100.0d);
//     var13.generateReport();
// 
//   }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test215"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var1 = var0.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var3 = var0.createDirectedGraphNode((java.lang.Object)100);
    java.util.List var4 = var0.getGraphvizNodes();
    boolean var5 = var0.isDirected();
    java.lang.String var6 = var0.getName();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var16 = var11.clonePropsFrom(var15);
    com.google.javascript.rhino.Node var18 = var15.getAncestor(0);
    java.util.Set var19 = var15.getDirectives();
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    var23.setType(10);
    var23.setOptionalArg(false);
    var15.addChildrenToBack(var23);
    var23.putBooleanProp(1, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var32 = var0.getEdges((java.lang.Object)(short)0, (java.lang.Object)1);
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
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "LinkedGraph"+ "'", var6.equals("LinkedGraph"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test216() {}
//   public void test216() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test216"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     com.google.javascript.jscomp.Scope var2 = var0.getTopScope();
//     int var3 = var0.getErrorCount();
// 
//   }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test217"); }


    com.google.javascript.jscomp.SourceFile var1 = com.google.javascript.jscomp.SourceFile.fromFile("goog.exportProperty");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test218"); }


    com.google.javascript.jscomp.SourceFile.Generator var2 = null;
    com.google.javascript.jscomp.JSSourceFile var3 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var2);
    com.google.javascript.jscomp.CompilerInput var5 = new com.google.javascript.jscomp.CompilerInput(var3, true);
    com.google.javascript.jscomp.SourceFile.Generator var7 = null;
    com.google.javascript.jscomp.SourceFile var8 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var7);
    com.google.javascript.jscomp.JsAst var9 = new com.google.javascript.jscomp.JsAst(var8);
    var5.setSourceFile(var8);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var11 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var12 = var11.newSubGraph();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var13 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var14 = var13.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var16 = var13.createDirectedGraphNode((java.lang.Object)100);
    java.util.List var17 = var11.getDirectedPredNodes(var16);
    com.google.javascript.jscomp.JSModuleGraph var18 = new com.google.javascript.jscomp.JSModuleGraph(var17);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var19 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var20 = var19.getNodes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var21 = com.google.javascript.rhino.ScriptRuntime.getMessage3(": hi!", (java.lang.Object)var8, (java.lang.Object)var17, (java.lang.Object)var19);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test219() {}
//   public void test219() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test219"); }
// 
// 
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.lang.String var2 = com.google.javascript.rhino.ScriptRuntime.numberToString(1.0d, (-1));
//       fail("Expected exception of type com.google.javascript.rhino.EvaluatorException");
//     } catch (com.google.javascript.rhino.EvaluatorException e) {
//       // Expected exception.
//     }
// 
//   }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test220"); }


    com.google.javascript.jscomp.parsing.Config var2 = null;
    com.google.javascript.jscomp.mozilla.rhino.ErrorReporter var3 = null;
    java.util.logging.Logger var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var5 = com.google.javascript.jscomp.parsing.ParserRunner.parse("STRING ", "com.google.javascript.rhino.EcmaError: : hi!", var2, var3, var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test221"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var8 = var3.clonePropsFrom(var7);
    com.google.javascript.rhino.jstype.JSType var9 = null;
    var7.setJSType(var9);
    var7.setOptionalArg(true);
    int var13 = var7.getLineno();
    boolean var14 = var7.isLocalResultCall();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var18 = var7.toString(true, true, false);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test222"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var8 = var3.clonePropsFrom(var7);
    com.google.javascript.rhino.jstype.JSType var9 = null;
    var7.setJSType(var9);
    var7.setOptionalArg(true);
    int var13 = var7.getLineno();
    boolean var14 = var7.isLocalResultCall();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var15 = var7.toString();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test223() {}
//   public void test223() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test223"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var1);
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var2, true);
//     com.google.javascript.jscomp.SourceFile.Generator var6 = null;
//     com.google.javascript.jscomp.SourceFile var7 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var6);
//     com.google.javascript.jscomp.JsAst var8 = new com.google.javascript.jscomp.JsAst(var7);
//     var4.setSourceFile(var7);
//     com.google.javascript.jscomp.JSModule var10 = null;
//     var4.setModule(var10);
//     java.lang.String var12 = var4.getName();
//     java.util.Collection var13 = var4.getProvides();
// 
//   }

  public void test224() {}
//   public void test224() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test224"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.SubGraph var1 = var0.newSubGraph();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var3 = var0.createDirectedGraphNode((java.lang.Object)100);
//     java.util.List var4 = var0.getGraphvizNodes();
//     com.google.javascript.jscomp.CompilerOptions var5 = new com.google.javascript.jscomp.CompilerOptions();
//     var5.setAcceptConstKeyword(true);
//     java.util.Map var8 = var5.getTweakReplacements();
//     com.google.javascript.jscomp.VariableRenamingPolicy var9 = null;
//     com.google.javascript.jscomp.PropertyRenamingPolicy var10 = null;
//     var5.setRenamingPolicy(var9, var10);
//     java.util.List var12 = var0.getNeighborNodes((java.lang.Object)var9);
// 
//   }

  public void test225() {}
//   public void test225() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test225"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     com.google.javascript.rhino.Node var1 = com.google.javascript.jscomp.NodeUtil.newExpr(var0);
// 
//   }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test226"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Context.reportWarning("STRING ", "com.google.javascript.rhino.EcmaError: TypeError: Cannot set property \"hi!: hi!\" of 0 to \"40\"", 40, "hi!. hi! at (unknown source) line (unknown line) : (unknown column)", 0);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test227() {}
//   public void test227() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test227"); }
// 
// 
//     com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var9 = var4.clonePropsFrom(var8);
//     com.google.javascript.rhino.jstype.JSType var10 = null;
//     var8.setJSType(var10);
//     var8.setOptionalArg(true);
//     com.google.javascript.rhino.JSDocInfo var14 = null;
//     var8.setJSDocInfo(var14);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var16 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.SubGraph var17 = var16.newSubGraph();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var19 = var16.createDirectedGraphNode((java.lang.Object)100);
//     java.util.List var20 = var16.getGraphvizNodes();
//     boolean var21 = var16.isDirected();
//     java.lang.String var22 = var16.getName();
//     com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var27 = var26.getType();
//     int var28 = var26.getChildCount();
//     com.google.javascript.rhino.Context var29 = null;
//     com.google.javascript.rhino.Context var30 = com.google.javascript.rhino.Context.enter(var29);
//     var30.setCompileFunctionsWithDynamicScope(false);
//     com.google.javascript.jscomp.MessageFormatter var33 = null;
//     java.util.logging.Logger var34 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var35 = new com.google.javascript.jscomp.LoggerErrorManager(var33, var34);
//     com.google.javascript.jscomp.CheckLevel var36 = null;
//     com.google.javascript.rhino.Node var38 = null;
//     com.google.javascript.jscomp.CheckLevel var40 = null;
//     com.google.javascript.jscomp.DiagnosticType var42 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var40, "hi!");
//     java.lang.String[] var44 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make("", var38, var42, var44);
//     var35.report(var36, var45);
//     var30.removeThreadLocal((java.lang.Object)var45);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.lang.String var48 = com.google.javascript.rhino.ScriptRuntime.getMessage4("", (java.lang.Object)var8, (java.lang.Object)var16, (java.lang.Object)var26, (java.lang.Object)var30);
//       fail("Expected exception of type java.lang.RuntimeException");
//     } catch (java.lang.RuntimeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var8);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var17);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var19);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var20);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var21 == true);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var22 + "' != '" + "LinkedGraph"+ "'", var22.equals("LinkedGraph"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var26);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var27 == 40);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var28 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var30);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var42);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var44);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var45);
// 
//   }

  public void test228() {}
//   public void test228() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test228"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = com.google.javascript.rhino.Context.enter();
//     boolean var1 = var0.isGeneratingDebugChanged();
//     var0.setGeneratingSource(true);
//     java.beans.PropertyChangeListener var4 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var0.removePropertyChangeListener(var4);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == false);
// 
//   }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test229"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.EcmaError var3 = com.google.javascript.rhino.ScriptRuntime.typeError2("", "hi!", "null(null)");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test230() {}
//   public void test230() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test230"); }
// 
// 
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var2);
//     com.google.javascript.jscomp.SourceFile.Generator var5 = null;
//     com.google.javascript.jscomp.JSSourceFile var6 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var5);
//     com.google.javascript.jscomp.CompilerInput var8 = new com.google.javascript.jscomp.CompilerInput(var6, true);
//     com.google.javascript.jscomp.MessageFormatter var9 = null;
//     java.util.logging.Logger var10 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var11 = new com.google.javascript.jscomp.LoggerErrorManager(var9, var10);
//     var8.setErrorManager((com.google.javascript.jscomp.ErrorManager)var11);
//     var3.setErrorManager((com.google.javascript.jscomp.ErrorManager)var11);
//     com.google.javascript.jscomp.CheckLevel var14 = null;
//     com.google.javascript.jscomp.CheckLevel var18 = null;
//     com.google.javascript.rhino.Node var20 = null;
//     com.google.javascript.jscomp.CheckLevel var22 = null;
//     com.google.javascript.jscomp.DiagnosticType var24 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var22, "hi!");
//     java.lang.String[] var26 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var27 = com.google.javascript.jscomp.JSError.make("", var20, var24, var26);
//     java.lang.String[] var29 = new java.lang.String[] { "goog.exportProperty"};
//     com.google.javascript.jscomp.JSError var30 = com.google.javascript.jscomp.JSError.make("eof", 1, 40, var18, var24, var29);
//     var11.report(var14, var30);
//     com.google.javascript.jscomp.CheckLevel var32 = null;
//     com.google.javascript.jscomp.JSError var33 = null;
//     var11.println(var32, var33);
// 
//   }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test231"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.EcmaError var1 = com.google.javascript.rhino.ScriptRuntime.typeError0("goog.abstractMethod");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test232"); }


    com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!: hi!", "goog.abstractMethod", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test233() {}
//   public void test233() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test233"); }
// 
// 
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.Context.reportError("null(null)");
//       fail("Expected exception of type com.google.javascript.rhino.EvaluatorException");
//     } catch (com.google.javascript.rhino.EvaluatorException e) {
//       // Expected exception.
//     }
// 
//   }

  public void test234() {}
//   public void test234() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test234"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "hi!", false);
//     com.google.javascript.jscomp.JSModule var4 = null;
//     var3.setModule(var4);
//     com.google.javascript.jscomp.Compiler var6 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var7 = var6.getTopScope();
//     var6.disableThreads();
//     var6.disableThreads();
//     var3.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var6);
//     java.util.Collection var11 = var3.getRequires();
// 
//   }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test235"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var1 = var0.newSubGraph();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var2 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var3 = var2.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var5 = var2.createDirectedGraphNode((java.lang.Object)100);
    java.util.List var6 = var0.getDirectedPredNodes(var5);
    com.google.javascript.jscomp.JSModuleGraph var7 = new com.google.javascript.jscomp.JSModuleGraph(var6);
    com.google.javascript.jscomp.ClosureCodingConvention var8 = new com.google.javascript.jscomp.ClosureCodingConvention();
    boolean var10 = var8.isPrivate("");
    java.lang.String var11 = var8.getExportSymbolFunction();
    boolean var13 = var8.isSuperClassReference("");
    java.util.Collection var14 = var8.getAssertionFunctions();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.JSModule var15 = var7.getDeepestCommonDependencyInclusive(var14);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
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
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "goog.exportSymbol"+ "'", var11.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test236"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var9 = var4.clonePropsFrom(var8);
    com.google.javascript.rhino.jstype.JSType var10 = null;
    var9.setJSType(var10);
    java.util.Collection var12 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(var9);
    com.google.javascript.jscomp.DiagnosticType var16 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    var9.putProp(100, (java.lang.Object)"hi!");
    var9.setLineno(0);
    java.io.PrintStream var20 = null;
    com.google.javascript.jscomp.Compiler var21 = new com.google.javascript.jscomp.Compiler(var20);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var23 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var24 = var23.getNodes();
    java.util.List var25 = var23.getEdges();
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    var29.setType(10);
    com.google.javascript.rhino.Node var34 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", var25, var29, 1, 100);
    com.google.javascript.jscomp.NodeTraversal.Callback var35 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var21, var25, var35);
    com.google.javascript.jscomp.Compiler var37 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var38 = var37.getTopScope();
    var37.disableThreads();
    var37.disableThreads();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var41 = com.google.javascript.rhino.ScriptRuntime.getMessage3("", (java.lang.Object)0, (java.lang.Object)var25, (java.lang.Object)var37);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test237"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var4 = var3.getType();
    int var5 = var3.getChildCount();
    boolean var6 = var3.hasOneChild();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var7 = var3.detachFromParent();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test238"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var8 = var3.clonePropsFrom(var7);
    var8.putProp((-1), (java.lang.Object)10.0d);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var20 = var15.clonePropsFrom(var19);
    com.google.javascript.rhino.Node var21 = var8.copyInformationFrom(var20);
    boolean var22 = var20.hasOneChild();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var23 = var20.getDouble();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test239() {}
//   public void test239() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test239"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     com.google.javascript.jscomp.SourceMap var2 = var0.getSourceMap();
//     com.google.javascript.jscomp.JSError[] var3 = var0.getWarnings();
// 
//   }

  public void test240() {}
//   public void test240() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test240"); }
// 
// 
//     java.io.InputStream var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromInputStream("hi!", var1);
// 
//   }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test241"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
    var0.disableThreads();
    var0.disableThreads();
    com.google.javascript.jscomp.NodeTraversal.Callback var4 = null;
    com.google.javascript.jscomp.NodeTraversal var5 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var0, var4);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var11 = var10.getType();
    java.lang.String var12 = var10.getQualifiedName();
    com.google.javascript.rhino.Node var13 = new com.google.javascript.rhino.Node(100, var10);
    com.google.javascript.jscomp.CheckLevel var14 = null;
    com.google.javascript.jscomp.DiagnosticType var17 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    java.lang.String[] var19 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
    com.google.javascript.jscomp.JSError var20 = var5.makeError(var10, var14, var17, var19);
    com.google.javascript.rhino.Node var21 = var5.getCurrentNode();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var23 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var24 = var23.getNodes();
    java.util.List var25 = var23.getEdges();
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    var29.setType(10);
    com.google.javascript.rhino.Node var34 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", var25, var29, 1, 100);
    var29.setVarArgs(false);
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    var40.setType(10);
    java.lang.Object var44 = var40.getProp(40);
    var29.addChildToBack(var40);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.traverse(var40);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);

  }

  public void test242() {}
//   public void test242() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test242"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = com.google.javascript.rhino.Context.enter();
//     boolean var1 = var0.isGeneratingDebugChanged();
//     var0.setGeneratingSource(true);
//     int var4 = var0.getOptimizationLevel();
//     boolean var5 = var0.isGeneratingSource();
//     com.google.javascript.jscomp.MessageFormatter var7 = null;
//     java.util.logging.Logger var8 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var9 = new com.google.javascript.jscomp.LoggerErrorManager(var7, var8);
//     int var10 = var9.getWarningCount();
//     var0.putThreadLocal((java.lang.Object)(-1.0f), (java.lang.Object)var9);
//     com.google.javascript.rhino.ErrorReporter var12 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.ErrorReporter var13 = var0.setErrorReporter(var12);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == true);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 0);
// 
//   }

  public void test243() {}
//   public void test243() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test243"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     java.lang.String var5 = var0.getSourceLine("string", 40);
// 
//   }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test244"); }


    com.google.javascript.rhino.Context.checkOptimizationLevel(0);

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test245"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.SourceMap var2 = var1.getSourceMap();
    com.google.javascript.jscomp.CompilerOptions var3 = new com.google.javascript.jscomp.CompilerOptions();
    var3.setAcceptConstKeyword(true);
    var3.setTweakToStringLiteral("goog.exportProperty", "goog.exportSymbol");
    var3.setShadowVariables(true);
    var3.setColorizeErrorOutput(true);
    var3.setDefineToStringLiteral("com.google.javascript.rhino.EcmaError: TypeError: Cannot set property \"hi!: hi!\" of 0 to \"40\"", "");
    var1.initOptions(var3);
    boolean var17 = var1.acceptConstKeyword();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test246() {}
//   public void test246() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test246"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     var0.disableThreads();
//     com.google.javascript.jscomp.MessageFormatter var4 = null;
//     java.util.logging.Logger var5 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var6 = new com.google.javascript.jscomp.LoggerErrorManager(var4, var5);
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.rhino.Node var9 = null;
//     com.google.javascript.jscomp.CheckLevel var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var11, "hi!");
//     java.lang.String[] var15 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("", var9, var13, var15);
//     var6.report(var7, var16);
//     var0.setErrorManager((com.google.javascript.jscomp.ErrorManager)var6);
//     com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var19 = null;
//     com.google.javascript.jscomp.LightweightMessageFormatter var20 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var0, var19);
//     com.google.javascript.jscomp.NodeTraversal.Callback var21 = null;
//     com.google.javascript.jscomp.NodeTraversal var22 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var0, var21);
//     java.lang.String var23 = var22.getSourceName();
//     com.google.javascript.rhino.Node var24 = var22.getScopeRoot();
// 
//   }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test247"); }


    java.nio.charset.Charset var1 = null;
    com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromFile(": hi!", var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.Reader var3 = var2.getCodeReader();
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test248() {}
//   public void test248() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test248"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.SubGraph var1 = var0.newSubGraph();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var2 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.SubGraph var3 = var2.newSubGraph();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var5 = var2.createDirectedGraphNode((java.lang.Object)100);
//     java.util.List var6 = var0.getDirectedPredNodes(var5);
//     com.google.javascript.jscomp.JSModuleGraph var7 = new com.google.javascript.jscomp.JSModuleGraph(var6);
//     var7.coalesceDuplicateFiles();
//     com.google.javascript.jscomp.JSModule var9 = null;
//     com.google.javascript.jscomp.JSModule var10 = null;
//     boolean var11 = var7.dependsOn(var9, var10);
// 
//   }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test249"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = com.google.javascript.rhino.ScriptRuntime.escapeString("eof", 'a');
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test250() {}
//   public void test250() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test250"); }
// 
// 
//     com.google.javascript.jscomp.DefaultCodingConvention var0 = new com.google.javascript.jscomp.DefaultCodingConvention();
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CodingConvention.SubclassRelationship var2 = var0.getClassesDefinedByCall(var1);
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var7 = var6.getType();
//     com.google.javascript.rhino.Node var8 = var6.cloneTree();
//     java.util.Set var9 = null;
//     var8.setDirectives(var9);
//     boolean var11 = var0.isOptionalParameter(var8);
// 
//   }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test251"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var1 = var0.newSubGraph();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var2 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var3 = var2.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var5 = var2.createDirectedGraphNode((java.lang.Object)100);
    java.util.List var6 = var0.getDirectedPredNodes(var5);
    com.google.javascript.jscomp.SourceFile.Generator var9 = null;
    com.google.javascript.jscomp.SourceFile var10 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var9);
    com.google.javascript.jscomp.JsAst var11 = new com.google.javascript.jscomp.JsAst(var10);
    com.google.javascript.jscomp.SourceFile.Generator var13 = null;
    com.google.javascript.jscomp.SourceFile var14 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var13);
    var11.setSourceFile(var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var16 = var0.getEdges((java.lang.Object)1.0d, (java.lang.Object)var11);
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
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test252() {}
//   public void test252() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test252"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.SourceMap var2 = var1.getSourceMap();
//     com.google.javascript.jscomp.SourceMap var3 = var1.getSourceMap();
//     com.google.javascript.jscomp.SourceFile.Generator var5 = null;
//     com.google.javascript.jscomp.JSSourceFile var6 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var5);
//     var6.clearCachedSource();
//     com.google.javascript.jscomp.JSModule var8 = null;
//     com.google.javascript.jscomp.JSModule[] var9 = new com.google.javascript.jscomp.JSModule[] { var8};
//     com.google.javascript.jscomp.CompilerOptions var10 = new com.google.javascript.jscomp.CompilerOptions();
//     var10.setAcceptConstKeyword(true);
//     com.google.javascript.jscomp.CompilerOptions.TweakProcessing var13 = var10.getTweakProcessing();
//     var10.setRewriteNewDateGoogNow(false);
//     var10.setDefineToNumberLiteral("", 0);
//     com.google.javascript.jscomp.Result var19 = var1.compile(var6, var9, var10);
// 
//   }

  public void test253() {}
//   public void test253() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test253"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     boolean var2 = var0.isPrivate("");
//     boolean var4 = var0.isPrivate("goog.exportProperty");
//     boolean var6 = var0.isConstant("com.google.javascript.rhino.EcmaError: : hi!");
//     com.google.javascript.rhino.Node var7 = null;
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     var11.setType(10);
//     var11.setOptionalArg(false);
//     java.lang.String var16 = var0.extractClassNameIfProvide(var7, var11);
//     com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var21 = var20.getType();
//     int var22 = var20.getChildCount();
//     boolean var23 = var20.hasOneChild();
//     var11.addChildrenToFront(var20);
//     com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var30 = var29.getType();
//     java.lang.String var31 = var29.getQualifiedName();
//     com.google.javascript.rhino.Node var32 = new com.google.javascript.rhino.Node(100, var29);
//     var20.removeChild(var32);
// 
//   }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test254"); }


    java.nio.charset.Charset var1 = null;
    com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromFile("goog.exportProperty", var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = var2.getCode();
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test255() {}
//   public void test255() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test255"); }
// 
// 
//     java.io.File var0 = null;
//     com.google.javascript.jscomp.JSSourceFile var1 = com.google.javascript.jscomp.JSSourceFile.fromFile(var0);
// 
//   }

  public void test256() {}
//   public void test256() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test256"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.SourceMap var2 = var1.getSourceMap();
//     com.google.javascript.jscomp.Result var3 = var1.getResult();
// 
//   }

  public void test257() {}
//   public void test257() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test257"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = com.google.javascript.rhino.Context.enter();
//     boolean var1 = var0.isGeneratingDebugChanged();
//     var0.setLanguageVersion(0);
//     var0.setGeneratingSource(false);
//     com.google.javascript.rhino.ErrorReporter var6 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.ErrorReporter var7 = var0.setErrorReporter(var6);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == false);
// 
//   }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test258"); }


    com.google.javascript.jscomp.SourceFile.Generator var1 = null;
    com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var1);
    com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var2, true);
    com.google.javascript.jscomp.Compiler var5 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var6 = var5.getTopScope();
    com.google.javascript.jscomp.Scope var7 = var5.getTopScope();
    var4.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var5);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.Node.newString("goog.exportSymbol");
    java.util.Collection var11 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(var10);
    int var12 = var10.getSourcePosition();
    com.google.javascript.jscomp.NodeTraversal.Callback var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.NodeTraversal.traverse((com.google.javascript.jscomp.AbstractCompiler)var5, var10, var13);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test259() {}
//   public void test259() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test259"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = com.google.javascript.rhino.Context.enter();
//     boolean var1 = var0.isGeneratingDebugChanged();
//     var0.setGeneratingSource(true);
//     int var4 = var0.getOptimizationLevel();
//     boolean var5 = var0.isGeneratingSource();
//     com.google.javascript.jscomp.MessageFormatter var7 = null;
//     java.util.logging.Logger var8 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var9 = new com.google.javascript.jscomp.LoggerErrorManager(var7, var8);
//     int var10 = var9.getWarningCount();
//     var0.putThreadLocal((java.lang.Object)(-1.0f), (java.lang.Object)var9);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var0.setInstructionObserverThreshold((-1));
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == true);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 0);
// 
//   }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test260"); }


    com.google.javascript.jscomp.parsing.Config var2 = null;
    com.google.javascript.jscomp.mozilla.rhino.ErrorReporter var3 = null;
    java.util.logging.Logger var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var5 = com.google.javascript.jscomp.parsing.ParserRunner.parse("null(null)", "string", var2, var3, var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test261() {}
//   public void test261() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test261"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     var0.disableThreads();
//     com.google.javascript.jscomp.NodeTraversal.Callback var4 = null;
//     com.google.javascript.jscomp.NodeTraversal var5 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var0, var4);
//     com.google.javascript.jscomp.SourceFile.Generator var7 = null;
//     com.google.javascript.jscomp.JSSourceFile var8 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var7);
//     com.google.javascript.jscomp.CompilerInput var10 = new com.google.javascript.jscomp.CompilerInput(var8, true);
//     com.google.javascript.jscomp.MessageFormatter var11 = null;
//     java.util.logging.Logger var12 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var13 = new com.google.javascript.jscomp.LoggerErrorManager(var11, var12);
//     var10.setErrorManager((com.google.javascript.jscomp.ErrorManager)var13);
//     int var15 = var13.getWarningCount();
//     var0.setErrorManager((com.google.javascript.jscomp.ErrorManager)var13);
//     com.google.javascript.rhino.jstype.JSTypeRegistry var17 = var0.getTypeRegistry();
// 
//   }

  public void test262() {}
//   public void test262() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test262"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = null;
//     com.google.javascript.rhino.Context var1 = com.google.javascript.rhino.Context.enter(var0);
//     var1.setCompileFunctionsWithDynamicScope(false);
//     com.google.javascript.jscomp.MessageFormatter var4 = null;
//     java.util.logging.Logger var5 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var6 = new com.google.javascript.jscomp.LoggerErrorManager(var4, var5);
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.rhino.Node var9 = null;
//     com.google.javascript.jscomp.CheckLevel var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var11, "hi!");
//     java.lang.String[] var15 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("", var9, var13, var15);
//     var6.report(var7, var16);
//     var1.removeThreadLocal((java.lang.Object)var16);
//     boolean var19 = var1.isGeneratingDebug();
//     java.beans.PropertyChangeListener var20 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var1.removePropertyChangeListener(var20);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == false);
// 
//   }

  public void test263() {}
//   public void test263() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test263"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     com.google.javascript.rhino.Node var3 = var0.getRoot();
//     com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var4 = null;
//     com.google.javascript.jscomp.LightweightMessageFormatter var5 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var0, var4);
//     var0.optimize();
// 
//   }

  public void test264() {}
//   public void test264() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test264"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var2 = var1.getTopScope();
//     var1.disableThreads();
//     var1.disableThreads();
//     com.google.javascript.jscomp.NodeTraversal.Callback var5 = null;
//     com.google.javascript.jscomp.NodeTraversal var6 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var1, var5);
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var12 = var11.getType();
//     java.lang.String var13 = var11.getQualifiedName();
//     com.google.javascript.rhino.Node var14 = new com.google.javascript.rhino.Node(100, var11);
//     com.google.javascript.jscomp.CheckLevel var15 = null;
//     com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     java.lang.String[] var20 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var21 = var6.makeError(var11, var15, var18, var20);
//     com.google.javascript.jscomp.JSError var22 = com.google.javascript.jscomp.JSError.make(var0, var20);
// 
//   }

  public void test265() {}
//   public void test265() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test265"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.SubGraph var1 = var0.newSubGraph();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var3 = var0.createDirectedGraphNode((java.lang.Object)100);
//     com.google.javascript.jscomp.DiagnosticGroup var4 = null;
//     com.google.javascript.jscomp.CheckLevel var5 = null;
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var6 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var4, var5);
//     java.util.Iterator var7 = var0.getNeighborNodesIterator((java.lang.Object)var4);
// 
//   }

  public void test266() {}
//   public void test266() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test266"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var1);
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var2, true);
//     com.google.javascript.jscomp.MessageFormatter var5 = null;
//     java.util.logging.Logger var6 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var7 = new com.google.javascript.jscomp.LoggerErrorManager(var5, var6);
//     var4.setErrorManager((com.google.javascript.jscomp.ErrorManager)var7);
//     com.google.javascript.jscomp.Compiler var9 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var10 = var9.getTopScope();
//     com.google.javascript.jscomp.SourceMap var11 = var9.getSourceMap();
//     var9.reportCodeChange();
//     com.google.javascript.jscomp.MessageFormatter var13 = null;
//     java.util.logging.Logger var14 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var15 = new com.google.javascript.jscomp.LoggerErrorManager(var13, var14);
//     var9.setErrorManager((com.google.javascript.jscomp.ErrorManager)var15);
//     com.google.javascript.rhino.Node var17 = var4.getAstRoot((com.google.javascript.jscomp.AbstractCompiler)var9);
// 
//   }

  public void test267() {}
//   public void test267() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test267"); }
// 
// 
//     com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var5 = var4.getType();
//     int var6 = var4.getSourcePosition();
//     com.google.javascript.rhino.Node var7 = var4.getLastSibling();
//     com.google.javascript.rhino.Node var8 = var4.removeFirstChild();
//     java.lang.String var12 = var4.toString(false, true, false);
//     com.google.javascript.rhino.Node var13 = var4.removeFirstChild();
//     java.lang.String var17 = var4.toString(false, true, true);
//     com.google.javascript.rhino.Node var18 = null;
//     com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var28 = var23.clonePropsFrom(var27);
//     com.google.javascript.rhino.jstype.JSType var29 = null;
//     var28.setJSType(var29);
//     com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var39 = var34.clonePropsFrom(var38);
//     com.google.javascript.rhino.jstype.JSType var40 = null;
//     var39.setJSType(var40);
//     java.util.Collection var42 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(var39);
//     com.google.javascript.rhino.Node.AncestorIterable var43 = var39.getAncestors();
//     boolean var44 = var39.isOnlyModifiesThisCall();
//     com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var53 = var48.clonePropsFrom(var52);
//     com.google.javascript.rhino.jstype.JSType var54 = null;
//     var52.setJSType(var54);
//     var52.setOptionalArg(true);
//     int var58 = var52.getLineno();
//     boolean var59 = var52.isLocalResultCall();
//     boolean var60 = var52.isQuotedString();
//     com.google.javascript.rhino.Node var61 = new com.google.javascript.rhino.Node(0, var28, var39, var52);
//     com.google.javascript.rhino.Node var62 = var28.cloneNode();
//     com.google.javascript.rhino.Node var66 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var67 = var66.getType();
//     com.google.javascript.rhino.Node var68 = var66.cloneTree();
//     var66.addSuppression("");
//     int var71 = var66.getType();
//     com.google.javascript.rhino.Node var72 = com.google.javascript.jscomp.NodeUtil.newExpr(var66);
//     var72.setLineno((-1));
//     com.google.javascript.rhino.Node var76 = var72.getAncestor(0);
//     com.google.javascript.rhino.Node var77 = new com.google.javascript.rhino.Node(0, var4, var18, var62, var76);
// 
//   }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test268"); }


    com.google.javascript.jscomp.SourceFile.Generator var1 = null;
    com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromGenerator("goog.exportProperty", var1);
    java.lang.String var3 = var2.getOriginalPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "goog.exportProperty"+ "'", var3.equals("goog.exportProperty"));

  }

  public void test269() {}
//   public void test269() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test269"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var3 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.Collection var4 = var3.getNodes();
//     java.util.List var5 = var3.getEdges();
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     var9.setType(10);
//     com.google.javascript.rhino.Node var14 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", var5, var9, 1, 100);
//     com.google.javascript.jscomp.NodeTraversal.Callback var15 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var5, var15);
//     boolean var17 = var1.acceptEcmaScript5();
// 
//   }

  public void test270() {}
//   public void test270() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test270"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     var0.disableThreads();
//     com.google.javascript.jscomp.NodeTraversal.Callback var4 = null;
//     com.google.javascript.jscomp.NodeTraversal var5 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var0, var4);
//     com.google.javascript.rhino.Node var6 = var5.getEnclosingFunction();
//     com.google.javascript.rhino.Node var7 = var5.getCurrentNode();
//     com.google.javascript.jscomp.JSModule var8 = var5.getModule();
// 
//   }

  public void test271() {}
//   public void test271() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test271"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "hi!", false);
//     com.google.javascript.jscomp.JSModule var4 = null;
//     var3.setModule(var4);
//     com.google.javascript.jscomp.Compiler var6 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var7 = var6.getTopScope();
//     var6.disableThreads();
//     var6.disableThreads();
//     var3.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var6);
//     com.google.javascript.jscomp.Region var12 = var3.getRegion(0);
// 
//   }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test272"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Context.reportWarning("goog.global", "goog.global", 40, "goog.exportSymbol", 10);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test273() {}
//   public void test273() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test273"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     com.google.javascript.jscomp.SourceMap var2 = var0.getSourceMap();
//     com.google.javascript.jscomp.JSSourceFile var5 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
//     com.google.javascript.jscomp.SourceFile.Generator var7 = null;
//     com.google.javascript.jscomp.JSSourceFile var8 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var7);
//     com.google.javascript.jscomp.CompilerInput var10 = new com.google.javascript.jscomp.CompilerInput(var8, true);
//     com.google.javascript.jscomp.CompilerOptions var11 = new com.google.javascript.jscomp.CompilerOptions();
//     var11.setAcceptConstKeyword(true);
//     com.google.javascript.jscomp.CompilerOptions.TweakProcessing var14 = var11.getTweakProcessing();
//     var11.setRewriteNewDateGoogNow(false);
//     com.google.javascript.jscomp.Result var17 = var0.compile(var5, var8, var11);
//     com.google.javascript.jscomp.DiagnosticGroup var18 = null;
//     com.google.javascript.jscomp.CheckLevel var19 = null;
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var20 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var18, var19);
//     java.lang.String var21 = var20.toString();
//     var11.addWarningsGuard((com.google.javascript.jscomp.WarningsGuard)var20);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var24 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.Collection var25 = var24.getNodes();
//     java.util.List var26 = var24.getEdges();
//     com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     var30.setType(10);
//     com.google.javascript.rhino.Node var35 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", var26, var30, 1, 100);
//     com.google.javascript.jscomp.ComposeWarningsGuard var36 = new com.google.javascript.jscomp.ComposeWarningsGuard(var26);
//     com.google.javascript.rhino.Node var39 = null;
//     com.google.javascript.jscomp.CheckLevel var41 = null;
//     com.google.javascript.jscomp.DiagnosticType var43 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var41, "hi!");
//     java.lang.String[] var45 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var46 = com.google.javascript.jscomp.JSError.make("", var39, var43, var45);
//     java.lang.RuntimeException var48 = com.google.javascript.rhino.ScriptRuntime.undefWriteError((java.lang.Object)(short)0, (java.lang.Object)var43, (java.lang.Object)40);
//     com.google.javascript.jscomp.DiagnosticType[] var49 = new com.google.javascript.jscomp.DiagnosticType[] { var43};
//     com.google.javascript.jscomp.DiagnosticGroup var50 = new com.google.javascript.jscomp.DiagnosticGroup(var49);
//     com.google.javascript.jscomp.DiagnosticGroup[] var51 = new com.google.javascript.jscomp.DiagnosticGroup[] { var50};
//     com.google.javascript.jscomp.DiagnosticGroup var52 = new com.google.javascript.jscomp.DiagnosticGroup(var51);
//     boolean var53 = var36.enables(var52);
//     boolean var54 = var20.disables(var52);
// 
//   }

  public void test274() {}
//   public void test274() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test274"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     com.google.javascript.jscomp.SourceMap var2 = var0.getSourceMap();
//     var0.reportCodeChange();
//     com.google.javascript.jscomp.Compiler var4 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var5 = var4.getTopScope();
//     com.google.javascript.jscomp.SourceMap var6 = var4.getSourceMap();
//     com.google.javascript.jscomp.JSSourceFile var9 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
//     com.google.javascript.jscomp.SourceFile.Generator var11 = null;
//     com.google.javascript.jscomp.JSSourceFile var12 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var11);
//     com.google.javascript.jscomp.CompilerInput var14 = new com.google.javascript.jscomp.CompilerInput(var12, true);
//     com.google.javascript.jscomp.CompilerOptions var15 = new com.google.javascript.jscomp.CompilerOptions();
//     var15.setAcceptConstKeyword(true);
//     com.google.javascript.jscomp.CompilerOptions.TweakProcessing var18 = var15.getTweakProcessing();
//     var15.setRewriteNewDateGoogNow(false);
//     com.google.javascript.jscomp.Result var21 = var4.compile(var9, var12, var15);
//     com.google.javascript.rhino.Node var22 = var0.parse(var9);
//     com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var23 = null;
//     com.google.javascript.jscomp.LightweightMessageFormatter var24 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var0, var23);
//     com.google.javascript.jscomp.JSSourceFile var25 = null;
//     com.google.javascript.rhino.Node var26 = var0.parse(var25);
// 
//   }

  public void test275() {}
//   public void test275() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test275"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     var0.disableThreads();
//     com.google.javascript.jscomp.CompilerOptions var4 = new com.google.javascript.jscomp.CompilerOptions();
//     var4.setAcceptConstKeyword(true);
//     java.util.Map var7 = var4.getTweakReplacements();
//     var4.setDefineToNumberLiteral("eof", 1);
//     com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler var11 = null;
//     var4.setAliasTransformationHandler(var11);
//     var0.initOptions(var4);
//     java.util.Set var14 = null;
//     var4.setIdGenerators(var14);
// 
//   }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test276"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
    var0.disableThreads();
    var0.disableThreads();
    com.google.javascript.jscomp.MessageFormatter var4 = null;
    java.util.logging.Logger var5 = null;
    com.google.javascript.jscomp.LoggerErrorManager var6 = new com.google.javascript.jscomp.LoggerErrorManager(var4, var5);
    com.google.javascript.jscomp.CheckLevel var7 = null;
    com.google.javascript.rhino.Node var9 = null;
    com.google.javascript.jscomp.CheckLevel var11 = null;
    com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var11, "hi!");
    java.lang.String[] var15 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
    com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("", var9, var13, var15);
    var6.report(var7, var16);
    var0.setErrorManager((com.google.javascript.jscomp.ErrorManager)var6);
    com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var19 = null;
    com.google.javascript.jscomp.LightweightMessageFormatter var20 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var0, var19);
    com.google.javascript.jscomp.NodeTraversal.Callback var21 = null;
    com.google.javascript.jscomp.NodeTraversal var22 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var0, var21);
    java.lang.String var23 = var22.getSourceName();
    com.google.javascript.jscomp.Scope var24 = var22.getScope();
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var29 = var28.getType();
    int var30 = var28.getSourcePosition();
    com.google.javascript.rhino.Node var31 = var28.getLastSibling();
    boolean var32 = var28.isSyntheticBlock();
    com.google.javascript.rhino.Node var33 = var28.cloneNode();
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var42 = var37.clonePropsFrom(var41);
    com.google.javascript.rhino.jstype.JSType var43 = null;
    var41.setJSType(var43);
    var41.setOptionalArg(true);
    int var47 = var41.getLineno();
    var28.addChildrenToFront(var41);
    com.google.javascript.rhino.Node var49 = var41.removeFirstChild();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var22.traverse(var41);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test277"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var9 = var4.clonePropsFrom(var8);
    var9.putProp((-1), (java.lang.Object)10.0d);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var21 = var16.clonePropsFrom(var20);
    com.google.javascript.rhino.Node var22 = var9.copyInformationFrom(var21);
    int var23 = var9.getLineno();
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var32 = var27.clonePropsFrom(var31);
    com.google.javascript.rhino.jstype.JSType var33 = null;
    var32.setJSType(var33);
    boolean var35 = var32.hasSideEffects();
    java.lang.Iterable var36 = var32.children();
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var42 = var41.getType();
    java.lang.String var43 = var41.getQualifiedName();
    com.google.javascript.rhino.Node var44 = new com.google.javascript.rhino.Node(100, var41);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var45 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var46 = var45.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var48 = var45.createDirectedGraphNode((java.lang.Object)100);
    java.util.List var49 = var45.getGraphvizNodes();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var50 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var51 = var50.newSubGraph();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var52 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var53 = var52.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var55 = var52.createDirectedGraphNode((java.lang.Object)100);
    java.util.List var56 = var50.getDirectedPredNodes(var55);
    java.util.List var57 = var45.getDirectedPredNodes(var55);
    java.lang.Object var58 = new java.lang.Object();
    java.lang.String var59 = com.google.javascript.rhino.ScriptRuntime.toString(var58);
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var60 = var45.createDirectedGraphNode((java.lang.Object)var59);
    com.google.javascript.rhino.Node var65 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var66 = var65.getType();
    java.lang.String var67 = var65.getQualifiedName();
    com.google.javascript.rhino.Node var71 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var75 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var76 = var71.clonePropsFrom(var75);
    com.google.javascript.rhino.Node var77 = var65.clonePropsFrom(var75);
    com.google.javascript.rhino.Node var81 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var85 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var86 = var81.clonePropsFrom(var85);
    com.google.javascript.rhino.jstype.JSType var87 = null;
    var86.setJSType(var87);
    java.util.Collection var89 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(var86);
    boolean var90 = var86.isSyntheticBlock();
    com.google.javascript.rhino.Node var93 = new com.google.javascript.rhino.Node(100, var75, var86, 1, (-1));
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var94 = var45.createDirectedGraphNode((java.lang.Object)var86);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var97 = new com.google.javascript.rhino.Node(100, var9, var32, var44, var86, 40, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
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
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);

  }

  public void test278() {}
//   public void test278() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test278"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     java.lang.String var1 = var0.getGlobalObject();
//     java.lang.String var2 = var0.getExportPropertyFunction();
//     java.lang.String var3 = var0.getDelegateSuperclassName();
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var13 = var8.clonePropsFrom(var12);
//     com.google.javascript.rhino.jstype.JSType var14 = null;
//     var13.setJSType(var14);
//     com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var24 = var19.clonePropsFrom(var23);
//     com.google.javascript.rhino.jstype.JSType var25 = null;
//     var24.setJSType(var25);
//     java.util.Collection var27 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(var24);
//     com.google.javascript.rhino.Node.AncestorIterable var28 = var24.getAncestors();
//     boolean var29 = var24.isOnlyModifiesThisCall();
//     com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var38 = var33.clonePropsFrom(var37);
//     com.google.javascript.rhino.jstype.JSType var39 = null;
//     var37.setJSType(var39);
//     var37.setOptionalArg(true);
//     int var43 = var37.getLineno();
//     boolean var44 = var37.isLocalResultCall();
//     boolean var45 = var37.isQuotedString();
//     com.google.javascript.rhino.Node var46 = new com.google.javascript.rhino.Node(0, var13, var24, var37);
//     java.lang.String var47 = var0.getSingletonGetterClassName(var37);
// 
//   }

  public void test279() {}
//   public void test279() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test279"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var3 = null;
//     java.lang.String[] var4 = null;
//     com.google.javascript.jscomp.JSError var5 = com.google.javascript.jscomp.JSError.make(": hi!", (-1), 10, var3, var4);
// 
//   }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test280"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var1 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var2 = var1.getNodes();
    java.util.List var3 = var1.getEdges();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    var7.setType(10);
    com.google.javascript.rhino.Node var12 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", var3, var7, 1, 100);
    com.google.javascript.rhino.Node var13 = var7.removeFirstChild();
    var7.removeProp(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test281"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var8 = var3.clonePropsFrom(var7);
    com.google.javascript.rhino.jstype.JSType var9 = null;
    var7.setJSType(var9);
    var7.setOptionalArg(true);
    int var13 = var7.getLineno();
    com.google.javascript.rhino.jstype.JSType var14 = var7.getJSType();
    var7.addSuppression("");
    var7.setVarArgs(true);
    java.lang.Appendable var19 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.appendStringTree(var19);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test282() {}
//   public void test282() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test282"); }
// 
// 
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var4 = var3.getType();
//     int var5 = var3.getChildCount();
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     var3.addChildrenToFront(var9);
//     com.google.javascript.jscomp.ClosureCodingConvention var11 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     boolean var13 = var11.isPrivate("");
//     boolean var15 = var11.isPrivate("goog.exportProperty");
//     boolean var17 = var11.isConstant("com.google.javascript.rhino.EcmaError: : hi!");
//     com.google.javascript.rhino.Node var18 = null;
//     com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     var22.setType(10);
//     var22.setOptionalArg(false);
//     java.lang.String var27 = var11.extractClassNameIfProvide(var18, var22);
//     boolean var28 = var3.isEquivalentToTyped(var18);
// 
//   }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test283"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    boolean var2 = var0.isPrivate("");
    boolean var4 = var0.isPrivate("goog.exportProperty");
    boolean var6 = var0.isConstant("com.google.javascript.rhino.EcmaError: : hi!");
    com.google.javascript.rhino.Node var7 = null;
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    var11.setType(10);
    var11.setOptionalArg(false);
    java.lang.String var16 = var0.extractClassNameIfProvide(var7, var11);
    boolean var18 = var0.isPrivate("hi!");
    com.google.javascript.jscomp.Compiler var19 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var20 = var19.getTopScope();
    var19.disableThreads();
    var19.disableThreads();
    com.google.javascript.jscomp.NodeTraversal.Callback var23 = null;
    com.google.javascript.jscomp.NodeTraversal var24 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var19, var23);
    com.google.javascript.rhino.Node var25 = var24.getEnclosingFunction();
    com.google.javascript.rhino.Node var26 = var24.getCurrentNode();
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var35 = var30.clonePropsFrom(var34);
    var35.putProp((-1), (java.lang.Object)10.0d);
    com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var47 = var42.clonePropsFrom(var46);
    com.google.javascript.rhino.Node var48 = var35.copyInformationFrom(var47);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast var49 = var0.getObjectLiteralCast(var24, var35);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test284() {}
//   public void test284() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test284"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     var0.disableThreads();
//     com.google.javascript.jscomp.NodeTraversal.Callback var4 = null;
//     com.google.javascript.jscomp.NodeTraversal var5 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var0, var4);
//     com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var11 = var10.getType();
//     java.lang.String var12 = var10.getQualifiedName();
//     com.google.javascript.rhino.Node var13 = new com.google.javascript.rhino.Node(100, var10);
//     com.google.javascript.jscomp.CheckLevel var14 = null;
//     com.google.javascript.jscomp.DiagnosticType var17 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     java.lang.String[] var19 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var20 = var5.makeError(var10, var14, var17, var19);
//     com.google.javascript.jscomp.ClosureCodingConvention var21 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     boolean var23 = var21.isPrivate("");
//     boolean var25 = var21.isPrivate("goog.exportProperty");
//     boolean var27 = var21.isConstant("com.google.javascript.rhino.EcmaError: : hi!");
//     com.google.javascript.rhino.Node var28 = null;
//     com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     var32.setType(10);
//     var32.setOptionalArg(false);
//     java.lang.String var37 = var21.extractClassNameIfProvide(var28, var32);
//     com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var43 = var42.getType();
//     java.lang.String var44 = var42.getQualifiedName();
//     com.google.javascript.rhino.Node var45 = new com.google.javascript.rhino.Node(100, var42);
//     boolean var46 = var21.isVarArgsParameter(var45);
//     com.google.javascript.jscomp.DiagnosticType var47 = null;
//     java.lang.String[] var49 = new java.lang.String[] { "goog.abstractMethod"};
//     var5.report(var45, var47, var49);
// 
//   }

  public void test285() {}
//   public void test285() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test285"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     com.google.javascript.jscomp.SourceMap var2 = var0.getSourceMap();
//     boolean var3 = var0.hasErrors();
// 
//   }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test286"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.jscomp.SourceFile.Generator var2 = null;
    com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var2);
    com.google.javascript.jscomp.JsAst var4 = new com.google.javascript.jscomp.JsAst(var3);
    java.lang.RuntimeException var5 = com.google.javascript.rhino.ScriptRuntime.notFunctionError((java.lang.Object)var0, (java.lang.Object)var3);
    java.lang.Object var6 = null;
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var7 = var0.getDirectedGraphNode(var6);
    com.google.javascript.jscomp.DiagnosticType var10 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var11 = var0.getInEdges((java.lang.Object)var10);
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
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test287"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    java.lang.String var2 = var0.getName();
    com.google.javascript.rhino.EcmaError var9 = com.google.javascript.rhino.ScriptRuntime.constructError("", "hi!", "hi!", (-1), "hi!", 1);
    java.lang.String var10 = var9.toString();
    var9.initLineNumber(100);
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var13 = var0.getDirectedGraphNode((java.lang.Object)100);
    com.google.javascript.rhino.EcmaError var16 = com.google.javascript.rhino.ScriptRuntime.constructError("goog.global", "");
    int var17 = var16.getColumnNumber();
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var26 = var21.clonePropsFrom(var25);
    boolean var27 = var26.isUnscopedQualifiedName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.graph.Graph.GraphEdge var28 = var0.getFirstEdge((java.lang.Object)var16, (java.lang.Object)var26);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "LinkedGraph"+ "'", var2.equals("LinkedGraph"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "com.google.javascript.rhino.EcmaError: : hi!"+ "'", var10.equals("com.google.javascript.rhino.EcmaError: : hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test288"); }


    java.lang.String var1 = com.google.javascript.rhino.ScriptRuntime.escapeString("OFF");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "OFF"+ "'", var1.equals("OFF"));

  }

  public void test289() {}
//   public void test289() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test289"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var3 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.Collection var4 = var3.getNodes();
//     java.util.List var5 = var3.getEdges();
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     var9.setType(10);
//     com.google.javascript.rhino.Node var14 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", var5, var9, 1, 100);
//     com.google.javascript.jscomp.NodeTraversal.Callback var15 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var5, var15);
//     com.google.javascript.rhino.Context var17 = com.google.javascript.rhino.Context.enter();
//     boolean var18 = var17.isGeneratingDebugChanged();
//     var17.setGeneratingSource(true);
//     int var21 = var17.getOptimizationLevel();
//     boolean var22 = var17.isGeneratingSource();
//     com.google.javascript.jscomp.MessageFormatter var24 = null;
//     java.util.logging.Logger var25 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var26 = new com.google.javascript.jscomp.LoggerErrorManager(var24, var25);
//     int var27 = var26.getWarningCount();
//     var17.putThreadLocal((java.lang.Object)(-1.0f), (java.lang.Object)var26);
//     var1.setErrorManager((com.google.javascript.jscomp.ErrorManager)var26);
//     var1.rebuildInputsFromModules();
// 
//   }

  public void test290() {}
//   public void test290() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test290"); }
// 
// 
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var4 = var3.getType();
//     int var5 = var3.getSourcePosition();
//     com.google.javascript.rhino.Node var6 = var3.getLastSibling();
//     com.google.javascript.rhino.Node var7 = var3.removeFirstChild();
//     java.lang.String var8 = var3.getQualifiedName();
//     com.google.javascript.jscomp.SourceFile.Generator var10 = null;
//     com.google.javascript.jscomp.JSSourceFile var11 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var10);
//     com.google.javascript.jscomp.CompilerInput var13 = new com.google.javascript.jscomp.CompilerInput(var11, true);
//     com.google.javascript.jscomp.MessageFormatter var14 = null;
//     java.util.logging.Logger var15 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var16 = new com.google.javascript.jscomp.LoggerErrorManager(var14, var15);
//     var13.setErrorManager((com.google.javascript.jscomp.ErrorManager)var16);
//     int var18 = var16.getWarningCount();
//     com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var23 = var22.getType();
//     int var24 = var22.getSourcePosition();
//     com.google.javascript.rhino.Node var25 = var22.getLastSibling();
//     com.google.javascript.jscomp.SourceFile var28 = com.google.javascript.jscomp.SourceFile.fromCode("goog.exportProperty", "goog.exportProperty");
//     java.lang.RuntimeException var29 = com.google.javascript.rhino.ScriptRuntime.undefWriteError((java.lang.Object)var16, (java.lang.Object)var25, (java.lang.Object)"goog.exportProperty");
//     com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var38 = var33.clonePropsFrom(var37);
//     com.google.javascript.rhino.Node var40 = var37.getAncestor(0);
//     java.util.Set var41 = var37.getDirectives();
//     com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     var45.setType(10);
//     var45.setOptionalArg(false);
//     var37.addChildrenToBack(var45);
//     var3.addChildBefore(var25, var45);
// 
//   }

  public void test291() {}
//   public void test291() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test291"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     com.google.javascript.jscomp.SourceMap var2 = var0.getSourceMap();
//     var0.reportCodeChange();
//     com.google.javascript.jscomp.CompilerInput var5 = var0.getInput("");
// 
//   }

  public void test292() {}
//   public void test292() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test292"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     boolean var2 = var0.isPrivate("");
//     java.lang.String var3 = var0.getExportSymbolFunction();
//     boolean var5 = var0.isSuperClassReference("");
//     java.util.Collection var6 = var0.getAssertionFunctions();
//     java.lang.String var7 = var0.getDelegateSuperclassName();
//     java.lang.String var8 = var0.getGlobalObject();
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var17 = var12.clonePropsFrom(var16);
//     int var19 = var16.getIntProp(10);
//     java.lang.String var20 = var0.getSingletonGetterClassName(var16);
// 
//   }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test293"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.jscomp.SourceFile.Generator var2 = null;
    com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var2);
    com.google.javascript.jscomp.JsAst var4 = new com.google.javascript.jscomp.JsAst(var3);
    java.lang.RuntimeException var5 = com.google.javascript.rhino.ScriptRuntime.notFunctionError((java.lang.Object)var0, (java.lang.Object)var3);
    java.lang.String var6 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.google.javascript.rhino.EcmaError: TypeError: hi! is not a function, it is com.google.javascript.jscomp.graph.LinkedDirectedGraph."+ "'", var6.equals("com.google.javascript.rhino.EcmaError: TypeError: hi! is not a function, it is com.google.javascript.jscomp.graph.LinkedDirectedGraph."));

  }

  public void test294() {}
//   public void test294() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test294"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     var0.disableThreads();
//     com.google.javascript.jscomp.NodeTraversal.Callback var4 = null;
//     com.google.javascript.jscomp.NodeTraversal var5 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var0, var4);
//     java.lang.String var6 = var5.getSourceName();
//     com.google.javascript.jscomp.JSModule var7 = var5.getModule();
// 
//   }

  public void test295() {}
//   public void test295() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test295"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     var0.disableThreads();
//     com.google.javascript.jscomp.MessageFormatter var4 = null;
//     java.util.logging.Logger var5 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var6 = new com.google.javascript.jscomp.LoggerErrorManager(var4, var5);
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.rhino.Node var9 = null;
//     com.google.javascript.jscomp.CheckLevel var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var11, "hi!");
//     java.lang.String[] var15 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("", var9, var13, var15);
//     var6.report(var7, var16);
//     var0.setErrorManager((com.google.javascript.jscomp.ErrorManager)var6);
//     com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var19 = null;
//     com.google.javascript.jscomp.LightweightMessageFormatter var20 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var0, var19);
//     com.google.javascript.jscomp.SourceFile.Generator var22 = null;
//     com.google.javascript.jscomp.JSSourceFile var23 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var22);
//     com.google.javascript.jscomp.CompilerInput var25 = new com.google.javascript.jscomp.CompilerInput(var23, true);
//     java.lang.String var26 = var23.toString();
//     com.google.javascript.jscomp.JSSourceFile[] var27 = new com.google.javascript.jscomp.JSSourceFile[] { var23};
//     com.google.javascript.jscomp.JSModule var28 = null;
//     com.google.javascript.jscomp.JSModule[] var29 = new com.google.javascript.jscomp.JSModule[] { var28};
//     com.google.javascript.jscomp.CompilerOptions var30 = new com.google.javascript.jscomp.CompilerOptions();
//     var30.setAcceptConstKeyword(true);
//     java.util.Map var33 = var30.getTweakReplacements();
//     com.google.javascript.jscomp.VariableRenamingPolicy var34 = null;
//     com.google.javascript.jscomp.PropertyRenamingPolicy var35 = null;
//     var30.setRenamingPolicy(var34, var35);
//     com.google.javascript.jscomp.Result var37 = var0.compile(var27, var29, var30);
// 
//   }

  public void test296() {}
//   public void test296() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test296"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.SourceMap var2 = var1.getSourceMap();
//     com.google.javascript.jscomp.SourceMap var3 = var1.getSourceMap();
//     java.util.List var4 = null;
//     com.google.javascript.jscomp.NodeTraversal.Callback var5 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var4, var5);
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
//     com.google.javascript.jscomp.SourceMap var2 = var1.getSourceMap();
//     com.google.javascript.jscomp.CompilerOptions var3 = new com.google.javascript.jscomp.CompilerOptions();
//     var3.setAcceptConstKeyword(true);
//     var3.setTweakToStringLiteral("goog.exportProperty", "goog.exportSymbol");
//     var3.setShadowVariables(true);
//     var3.setColorizeErrorOutput(true);
//     var3.setDefineToStringLiteral("com.google.javascript.rhino.EcmaError: TypeError: Cannot set property \"hi!: hi!\" of 0 to \"40\"", "");
//     var1.initOptions(var3);
//     com.google.javascript.jscomp.Compiler.IntermediateState var17 = null;
//     var1.setState(var17);
// 
//   }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test298"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Context.checkLanguageVersion(40);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test299"); }


    java.lang.String var1 = com.google.javascript.rhino.Node.tokenToName(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "bitxor"+ "'", var1.equals("bitxor"));

  }

  public void test300() {}
//   public void test300() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test300"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     com.google.javascript.jscomp.SourceMap var2 = var0.getSourceMap();
//     com.google.javascript.jscomp.JSSourceFile var5 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
//     com.google.javascript.jscomp.SourceFile.Generator var7 = null;
//     com.google.javascript.jscomp.JSSourceFile var8 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var7);
//     com.google.javascript.jscomp.CompilerInput var10 = new com.google.javascript.jscomp.CompilerInput(var8, true);
//     com.google.javascript.jscomp.CompilerOptions var11 = new com.google.javascript.jscomp.CompilerOptions();
//     var11.setAcceptConstKeyword(true);
//     com.google.javascript.jscomp.CompilerOptions.TweakProcessing var14 = var11.getTweakProcessing();
//     var11.setRewriteNewDateGoogNow(false);
//     com.google.javascript.jscomp.Result var17 = var0.compile(var5, var8, var11);
//     com.google.javascript.jscomp.DiagnosticGroup var18 = null;
//     com.google.javascript.jscomp.CheckLevel var19 = null;
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var20 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var18, var19);
//     java.lang.String var21 = var20.toString();
//     var11.addWarningsGuard((com.google.javascript.jscomp.WarningsGuard)var20);
//     com.google.javascript.rhino.Node var25 = null;
//     com.google.javascript.jscomp.CheckLevel var27 = null;
//     com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var27, "hi!");
//     java.lang.String[] var31 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var32 = com.google.javascript.jscomp.JSError.make("", var25, var29, var31);
//     java.lang.RuntimeException var34 = com.google.javascript.rhino.ScriptRuntime.undefWriteError((java.lang.Object)(short)0, (java.lang.Object)var29, (java.lang.Object)40);
//     com.google.javascript.jscomp.DiagnosticType[] var35 = new com.google.javascript.jscomp.DiagnosticType[] { var29};
//     com.google.javascript.jscomp.DiagnosticGroup var36 = new com.google.javascript.jscomp.DiagnosticGroup(var35);
//     com.google.javascript.jscomp.DiagnosticGroup[] var37 = new com.google.javascript.jscomp.DiagnosticGroup[] { var36};
//     com.google.javascript.jscomp.DiagnosticGroup var38 = new com.google.javascript.jscomp.DiagnosticGroup(var37);
//     boolean var39 = var20.disables(var38);
// 
//   }

  public void test301() {}
//   public void test301() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test301"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     java.lang.String var1 = var0.getGlobalObject();
//     java.lang.String var2 = var0.getExportPropertyFunction();
//     java.lang.String var3 = var0.getDelegateSuperclassName();
//     java.lang.String var4 = var0.getAbstractMethodName();
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     var9.setType(10);
//     com.google.javascript.rhino.Node var13 = new com.google.javascript.rhino.Node(10);
//     com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var22 = var17.clonePropsFrom(var21);
//     var22.putProp((-1), (java.lang.Object)10.0d);
//     com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var34 = var29.clonePropsFrom(var33);
//     com.google.javascript.rhino.Node var35 = var22.copyInformationFrom(var34);
//     boolean var36 = var34.hasOneChild();
//     com.google.javascript.rhino.Node var38 = null;
//     com.google.javascript.jscomp.CheckLevel var40 = null;
//     com.google.javascript.jscomp.DiagnosticType var42 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var40, "hi!");
//     java.lang.String[] var44 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make("", var38, var42, var44);
//     com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var50 = var49.getType();
//     com.google.javascript.rhino.Node var51 = var49.cloneTree();
//     boolean var52 = var45.equals((java.lang.Object)var49);
//     com.google.javascript.rhino.Node var55 = new com.google.javascript.rhino.Node((-1), var9, var13, var34, var49, 0, 1);
//     com.google.javascript.jscomp.CodingConvention.SubclassRelationship var56 = var0.getClassesDefinedByCall(var13);
// 
//   }

  public void test302() {}
//   public void test302() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test302"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.SubGraph var1 = var0.newSubGraph();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var2 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.SubGraph var3 = var2.newSubGraph();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var5 = var2.createDirectedGraphNode((java.lang.Object)100);
//     java.util.List var6 = var0.getDirectedPredNodes(var5);
//     com.google.javascript.jscomp.JSModuleGraph var7 = new com.google.javascript.jscomp.JSModuleGraph(var6);
//     var7.coalesceDuplicateFiles();
//     com.google.javascript.jscomp.JSModule var9 = null;
//     com.google.javascript.jscomp.JSModule var10 = null;
//     com.google.javascript.jscomp.JSModule var11 = var7.getDeepestCommonDependencyInclusive(var9, var10);
//     java.util.Collection var12 = null;
//     com.google.javascript.jscomp.JSModule var13 = var7.getDeepestCommonDependencyInclusive(var12);
// 
//   }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test303"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.EvaluatorException var5 = new com.google.javascript.rhino.EvaluatorException("", "com.google.javascript.rhino.EcmaError: TypeError: Cannot set property \"hi!: hi!\" of 0 to \"40\"", 1, "LinkedGraph", (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test304"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setAcceptConstKeyword(true);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var3 = var0.getTweakProcessing();
    var0.setRewriteNewDateGoogNow(false);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var6 = var0.getTweakProcessing();
    com.google.javascript.jscomp.DiagnosticGroup var7 = null;
    com.google.javascript.jscomp.CheckLevel var8 = null;
    var0.setWarningLevel(var7, var8);
    var0.setProcessObjectPropertyString(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test305() {}
//   public void test305() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test305"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     com.google.javascript.jscomp.SourceMap var2 = var0.getSourceMap();
//     com.google.javascript.jscomp.JSSourceFile var5 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
//     com.google.javascript.jscomp.SourceFile.Generator var7 = null;
//     com.google.javascript.jscomp.JSSourceFile var8 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var7);
//     com.google.javascript.jscomp.CompilerInput var10 = new com.google.javascript.jscomp.CompilerInput(var8, true);
//     com.google.javascript.jscomp.CompilerOptions var11 = new com.google.javascript.jscomp.CompilerOptions();
//     var11.setAcceptConstKeyword(true);
//     com.google.javascript.jscomp.CompilerOptions.TweakProcessing var14 = var11.getTweakProcessing();
//     var11.setRewriteNewDateGoogNow(false);
//     com.google.javascript.jscomp.Result var17 = var0.compile(var5, var8, var11);
//     com.google.javascript.jscomp.LightweightMessageFormatter var18 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var0);
//     com.google.javascript.jscomp.JSError var19 = null;
//     var0.report(var19);
// 
//   }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test306"); }


    com.google.javascript.jscomp.JSSourceFile var1 = com.google.javascript.jscomp.JSSourceFile.fromFile("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = var1.getCode();
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test307"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var1 = var0.newSubGraph();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var2 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var3 = var2.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var5 = var2.createDirectedGraphNode((java.lang.Object)100);
    java.util.List var6 = var0.getDirectedPredNodes(var5);
    com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.CompilerOptions var10 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var13 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var14 = var13.getNodes();
    java.util.List var15 = var13.getEdges();
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    var19.setType(10);
    com.google.javascript.rhino.Node var24 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", var15, var19, 1, 100);
    var10.setReplaceStringsConfiguration("hi!", var15);
    java.util.Map var26 = var10.getDefineReplacements();
    var10.setDefineToDoubleLiteral("goog.abstractMethod", 0.0d);
    com.google.javascript.jscomp.CodingConvention var30 = null;
    var10.setCodingConvention(var30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var32 = var0.getEdges((java.lang.Object)var9, (java.lang.Object)var10);
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
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test308"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.jscomp.SourceFile.Generator var2 = null;
    com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var2);
    com.google.javascript.jscomp.JsAst var4 = new com.google.javascript.jscomp.JsAst(var3);
    java.lang.RuntimeException var5 = com.google.javascript.rhino.ScriptRuntime.notFunctionError((java.lang.Object)var0, (java.lang.Object)var3);
    java.lang.Object var6 = null;
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var7 = var0.getDirectedGraphNode(var6);
    com.google.javascript.jscomp.graph.SubGraph var8 = var0.newSubGraph();
    com.google.javascript.rhino.EcmaError var12 = com.google.javascript.rhino.ScriptRuntime.constructError("com.google.javascript.rhino.EcmaError: : hi!", "goog.global");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var13 = var0.getDirectedGraphEdges((java.lang.Object)(short)10, (java.lang.Object)"com.google.javascript.rhino.EcmaError: : hi!");
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
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test309"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.EcmaError var4 = com.google.javascript.rhino.ScriptRuntime.typeError3("com.google.javascript.rhino.EcmaError: : hi!", "goog.global", "bitxor", "<No stack trace available>");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test310"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    var0.clearEdgeAnnotations();
    com.google.javascript.jscomp.Compiler var2 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var3 = var2.getTopScope();
    com.google.javascript.jscomp.SourceMap var4 = var2.getSourceMap();
    var2.reportCodeChange();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var6 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var7 = var6.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var9 = var6.createDirectedGraphNode((java.lang.Object)100);
    var6.clearNodeAnnotations();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var0.isConnectedInDirection((java.lang.Object)var2, (java.lang.Object)var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test311"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var5 = var4.getType();
    int var6 = var4.getChildCount();
    com.google.javascript.rhino.Node var7 = new com.google.javascript.rhino.Node((-1), var4);
    java.lang.String var8 = var7.toStringTree();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "ERROR\n    STRING \n"+ "'", var8.equals("ERROR\n    STRING \n"));

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test312"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    var0.clearNodeAnnotations();
    java.util.List var2 = var0.getGraphvizEdges();
    com.google.javascript.jscomp.Compiler var3 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var4 = var3.getTopScope();
    com.google.javascript.jscomp.SourceMap var5 = var3.getSourceMap();
    var3.reportCodeChange();
    com.google.javascript.jscomp.Compiler var7 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var8 = var7.getTopScope();
    com.google.javascript.jscomp.SourceMap var9 = var7.getSourceMap();
    com.google.javascript.jscomp.JSSourceFile var12 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
    com.google.javascript.jscomp.SourceFile.Generator var14 = null;
    com.google.javascript.jscomp.JSSourceFile var15 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var14);
    com.google.javascript.jscomp.CompilerInput var17 = new com.google.javascript.jscomp.CompilerInput(var15, true);
    com.google.javascript.jscomp.CompilerOptions var18 = new com.google.javascript.jscomp.CompilerOptions();
    var18.setAcceptConstKeyword(true);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var21 = var18.getTweakProcessing();
    var18.setRewriteNewDateGoogNow(false);
    com.google.javascript.jscomp.Result var24 = var7.compile(var12, var15, var18);
    com.google.javascript.rhino.Node var25 = var3.parse(var12);
    var12.clearCachedSource();
    com.google.javascript.jscomp.CompilerInput var27 = new com.google.javascript.jscomp.CompilerInput(var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var28 = var0.getInEdges((java.lang.Object)var27);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test313"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var8 = var3.clonePropsFrom(var7);
    com.google.javascript.rhino.jstype.JSType var9 = null;
    var8.setJSType(var9);
    java.util.Collection var11 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(var8);
    boolean var12 = var8.isSyntheticBlock();
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var17 = var16.getType();
    int var18 = var16.getSourcePosition();
    com.google.javascript.rhino.Node var19 = var16.getLastSibling();
    boolean var20 = var16.isSyntheticBlock();
    java.lang.String var21 = var8.checkTreeEquals(var16);
    boolean var22 = var16.isQuotedString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test314() {}
//   public void test314() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test314"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     var0.disableThreads();
//     com.google.javascript.jscomp.CompilerOptions var4 = new com.google.javascript.jscomp.CompilerOptions();
//     var4.setAcceptConstKeyword(true);
//     java.util.Map var7 = var4.getTweakReplacements();
//     var4.setDefineToNumberLiteral("eof", 1);
//     com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler var11 = null;
//     var4.setAliasTransformationHandler(var11);
//     var0.initOptions(var4);
//     java.lang.String var16 = var0.getSourceLine("", 100);
// 
//   }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test315"); }


    java.lang.String var1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "()"+ "'", var1.equals("()"));

  }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test316"); }


    long var1 = com.google.javascript.rhino.ScriptRuntime.testUint32String("<No stack trace available>");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test317"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
    com.google.javascript.jscomp.SourceMap var2 = var0.getSourceMap();
    var0.reportCodeChange();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var4 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var5 = var4.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var7 = var4.createDirectedGraphNode((java.lang.Object)100);
    java.util.List var8 = var4.getGraphvizNodes();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var9 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var10 = var9.newSubGraph();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var11 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var12 = var11.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var14 = var11.createDirectedGraphNode((java.lang.Object)100);
    java.util.List var15 = var9.getDirectedPredNodes(var14);
    java.util.List var16 = var4.getDirectedPredNodes(var14);
    com.google.javascript.jscomp.CompilerOptions var17 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var20 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var21 = var20.getNodes();
    java.util.List var22 = var20.getEdges();
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    var26.setType(10);
    com.google.javascript.rhino.Node var31 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", var22, var26, 1, 100);
    var17.setReplaceStringsConfiguration("hi!", var22);
    com.google.javascript.jscomp.CompilerOptions var33 = new com.google.javascript.jscomp.CompilerOptions();
    var33.setAcceptConstKeyword(true);
    com.google.javascript.jscomp.Compiler var36 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var37 = var36.getTopScope();
    com.google.javascript.jscomp.SourceMap var38 = var36.getSourceMap();
    com.google.javascript.jscomp.JSSourceFile var41 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
    com.google.javascript.jscomp.SourceFile.Generator var43 = null;
    com.google.javascript.jscomp.JSSourceFile var44 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var43);
    com.google.javascript.jscomp.CompilerInput var46 = new com.google.javascript.jscomp.CompilerInput(var44, true);
    com.google.javascript.jscomp.CompilerOptions var47 = new com.google.javascript.jscomp.CompilerOptions();
    var47.setAcceptConstKeyword(true);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var50 = var47.getTweakProcessing();
    var47.setRewriteNewDateGoogNow(false);
    com.google.javascript.jscomp.Result var53 = var36.compile(var41, var44, var47);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var54 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var55 = var54.newSubGraph();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var56 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var57 = var56.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var59 = var56.createDirectedGraphNode((java.lang.Object)100);
    java.util.List var60 = var54.getDirectedPredNodes(var59);
    com.google.javascript.jscomp.JSModuleGraph var61 = new com.google.javascript.jscomp.JSModuleGraph(var60);
    com.google.javascript.jscomp.NodeTraversal.Callback var62 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var36, var60, var62);
    var33.setManageClosureDependencies(var60);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.Result var65 = var0.compile(var16, var22, var33);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
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
    assertNotNull(var60);

  }

  public void test318() {}
//   public void test318() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test318"); }
// 
// 
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.Context.reportError("eof");
//       fail("Expected exception of type com.google.javascript.rhino.EvaluatorException");
//     } catch (com.google.javascript.rhino.EvaluatorException e) {
//       // Expected exception.
//     }
// 
//   }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test319"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    boolean var2 = var0.isPrivate("");
    java.lang.String var3 = var0.getExportSymbolFunction();
    boolean var5 = var0.isSuperClassReference("");
    java.util.Collection var6 = var0.getAssertionFunctions();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    var10.setType(10);
    boolean var13 = var10.isLocalResultCall();
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var14 = var0.getDelegateRelationship(var10);
    com.google.javascript.rhino.jstype.ObjectType var15 = null;
    com.google.javascript.rhino.jstype.ObjectType var16 = null;
    com.google.javascript.rhino.jstype.ObjectType var17 = null;
    com.google.javascript.rhino.jstype.FunctionType var18 = null;
    com.google.javascript.rhino.jstype.FunctionType var19 = null;
    var0.applyDelegateRelationship(var15, var16, var17, var18, var19);
    com.google.javascript.jscomp.Compiler var21 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var22 = var21.getTopScope();
    var21.disableThreads();
    var21.disableThreads();
    com.google.javascript.jscomp.NodeTraversal.Callback var25 = null;
    com.google.javascript.jscomp.NodeTraversal var26 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var21, var25);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var32 = var31.getType();
    java.lang.String var33 = var31.getQualifiedName();
    com.google.javascript.rhino.Node var34 = new com.google.javascript.rhino.Node(100, var31);
    com.google.javascript.jscomp.CheckLevel var35 = null;
    com.google.javascript.jscomp.DiagnosticType var38 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    java.lang.String[] var40 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
    com.google.javascript.jscomp.JSError var41 = var26.makeError(var31, var35, var38, var40);
    com.google.javascript.rhino.Node var42 = var26.getCurrentNode();
    com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var48 = var47.getType();
    com.google.javascript.rhino.Node[] var49 = new com.google.javascript.rhino.Node[] { var47};
    com.google.javascript.rhino.Node var50 = new com.google.javascript.rhino.Node(100, var49);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast var51 = var0.getObjectLiteralCast(var26, var50);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "goog.exportSymbol"+ "'", var3.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test320"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    java.lang.String var1 = var0.getGlobalObject();
    java.lang.String var2 = var0.getExportPropertyFunction();
    com.google.javascript.rhino.jstype.JSTypeRegistry var3 = null;
    com.google.javascript.jscomp.Scope var4 = null;
    com.google.javascript.jscomp.CompilerOptions var5 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var8 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var9 = var8.getNodes();
    java.util.List var10 = var8.getEdges();
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    var14.setType(10);
    com.google.javascript.rhino.Node var19 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", var10, var14, 1, 100);
    var5.setReplaceStringsConfiguration("hi!", var10);
    var0.defineDelegateProxyPrototypeProperties(var3, var4, var10);
    com.google.javascript.jscomp.Compiler var22 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var23 = var22.getTopScope();
    var22.disableThreads();
    var22.disableThreads();
    com.google.javascript.jscomp.NodeTraversal.Callback var26 = null;
    com.google.javascript.jscomp.NodeTraversal var27 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var22, var26);
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var33 = var32.getType();
    java.lang.String var34 = var32.getQualifiedName();
    com.google.javascript.rhino.Node var35 = new com.google.javascript.rhino.Node(100, var32);
    com.google.javascript.jscomp.CheckLevel var36 = null;
    com.google.javascript.jscomp.DiagnosticType var39 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    java.lang.String[] var41 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
    com.google.javascript.jscomp.JSError var42 = var27.makeError(var32, var36, var39, var41);
    java.lang.String var43 = var27.getSourceName();
    com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var52 = var47.clonePropsFrom(var51);
    var52.putProp((-1), (java.lang.Object)10.0d);
    com.google.javascript.rhino.Node var59 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var63 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var64 = var59.clonePropsFrom(var63);
    com.google.javascript.rhino.Node var65 = var52.copyInformationFrom(var64);
    com.google.javascript.rhino.Node var66 = var65.getFirstChild();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast var67 = var0.getObjectLiteralCast(var27, var65);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "goog.global"+ "'", var1.equals("goog.global"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "goog.exportProperty"+ "'", var2.equals("goog.exportProperty"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);

  }

  public void test321() {}
//   public void test321() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test321"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = null;
//     com.google.javascript.rhino.Context var1 = com.google.javascript.rhino.Context.enter(var0);
//     var1.setCompileFunctionsWithDynamicScope(false);
//     com.google.javascript.jscomp.MessageFormatter var4 = null;
//     java.util.logging.Logger var5 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var6 = new com.google.javascript.jscomp.LoggerErrorManager(var4, var5);
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.rhino.Node var9 = null;
//     com.google.javascript.jscomp.CheckLevel var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var11, "hi!");
//     java.lang.String[] var15 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("", var9, var13, var15);
//     var6.report(var7, var16);
//     var1.removeThreadLocal((java.lang.Object)var16);
//     int var19 = var1.getInstructionObserverThreshold();
//     com.google.javascript.rhino.ErrorReporter var20 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.ErrorReporter var21 = var1.setErrorReporter(var20);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == 0);
// 
//   }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test322"); }


    com.google.javascript.jscomp.parsing.Config var2 = null;
    com.google.javascript.jscomp.mozilla.rhino.ErrorReporter var3 = null;
    java.util.logging.Logger var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var5 = com.google.javascript.jscomp.parsing.ParserRunner.parse("string", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var2, var3, var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test323() {}
//   public void test323() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test323"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = null;
//     com.google.javascript.rhino.Context var1 = com.google.javascript.rhino.Context.enter(var0);
//     var1.setCompileFunctionsWithDynamicScope(false);
//     com.google.javascript.jscomp.MessageFormatter var4 = null;
//     java.util.logging.Logger var5 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var6 = new com.google.javascript.jscomp.LoggerErrorManager(var4, var5);
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.rhino.Node var9 = null;
//     com.google.javascript.jscomp.CheckLevel var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var11, "hi!");
//     java.lang.String[] var15 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("", var9, var13, var15);
//     var6.report(var7, var16);
//     var1.removeThreadLocal((java.lang.Object)var16);
//     int var19 = var1.getInstructionObserverThreshold();
//     var1.addActivationName("goog.exportProperty");
//     int var22 = var1.getLanguageVersion();
//     int var23 = var1.getLanguageVersion();
//     var1.setCompileFunctionsWithDynamicScope(true);
//     com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var34 = var29.clonePropsFrom(var33);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var1.unseal((java.lang.Object)var29);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var22 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var23 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var29);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var33);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var34);
// 
//   }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test324"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var5 = var4.getType();
    com.google.javascript.rhino.Node var6 = var4.cloneTree();
    var4.addSuppression("");
    int var9 = var4.getType();
    com.google.javascript.rhino.Node var10 = com.google.javascript.jscomp.NodeUtil.newExpr(var4);
    var10.setLineno((-1));
    com.google.javascript.rhino.Node var14 = var10.getAncestor(0);
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var19 = var18.getType();
    int var20 = var18.getSourcePosition();
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var25 = var24.getType();
    com.google.javascript.rhino.Node var26 = var24.cloneTree();
    var24.addSuppression("");
    int var29 = var24.getType();
    com.google.javascript.rhino.Node var30 = com.google.javascript.jscomp.NodeUtil.newExpr(var24);
    var30.setLineno((-1));
    com.google.javascript.rhino.Node var34 = var30.getAncestor(0);
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var39 = var38.getType();
    com.google.javascript.rhino.Node var40 = var38.cloneTree();
    var38.addSuppression("");
    int var43 = var38.getType();
    var38.setCharno(1);
    com.google.javascript.rhino.Node var46 = new com.google.javascript.rhino.Node(40, var10, var18, var34, var38);
    com.google.javascript.rhino.Node var48 = var10.getChildAtIndex(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);

  }

  public void test325() {}
//   public void test325() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test325"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var1);
//     com.google.javascript.jscomp.JsAst var3 = new com.google.javascript.jscomp.JsAst(var2);
//     com.google.javascript.jscomp.SourceFile.Generator var5 = null;
//     com.google.javascript.jscomp.SourceFile var6 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var5);
//     var3.setSourceFile(var6);
//     java.lang.String var8 = com.google.javascript.rhino.ScriptRuntime.toString((java.lang.Object)var3);
//     var3.clearAst();
//     com.google.javascript.rhino.Context var10 = com.google.javascript.rhino.Context.enter();
//     boolean var11 = var10.isGeneratingDebugChanged();
//     var10.setGeneratingSource(true);
//     int var14 = var10.getOptimizationLevel();
//     boolean var15 = var10.isGeneratingSource();
//     com.google.javascript.jscomp.MessageFormatter var17 = null;
//     java.util.logging.Logger var18 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var19 = new com.google.javascript.jscomp.LoggerErrorManager(var17, var18);
//     int var20 = var19.getWarningCount();
//     var10.putThreadLocal((java.lang.Object)(-1.0f), (java.lang.Object)var19);
//     com.google.javascript.jscomp.Compiler var22 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var19);
//     com.google.javascript.jscomp.Compiler.IntermediateState var23 = var22.getState();
//     com.google.javascript.rhino.Node var24 = var3.getAstRoot((com.google.javascript.jscomp.AbstractCompiler)var22);
// 
//   }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test326"); }


    com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromCode("", "bitxor", "LinkedGraph");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test327() {}
//   public void test327() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test327"); }
// 
// 
//     com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var5 = var4.getType();
//     com.google.javascript.rhino.Node var6 = var4.cloneTree();
//     com.google.javascript.rhino.Node var7 = null;
//     com.google.javascript.rhino.Node var10 = new com.google.javascript.rhino.Node(40, var4, var7, 0, 0);
// 
//   }

  public void test328() {}
//   public void test328() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test328"); }
// 
// 
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.Context.reportError("com.google.javascript.rhino.EcmaError: : hi!: goog.global");
//       fail("Expected exception of type com.google.javascript.rhino.EvaluatorException");
//     } catch (com.google.javascript.rhino.EvaluatorException e) {
//       // Expected exception.
//     }
// 
//   }

  public void test329() {}
//   public void test329() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test329"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     var0.setAcceptConstKeyword(true);
//     var0.setTweakToStringLiteral("goog.exportProperty", "goog.exportSymbol");
//     var0.setShadowVariables(true);
//     java.util.Set var8 = null;
//     var0.setIdGenerators(var8);
// 
//   }

  public void test330() {}
//   public void test330() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test330"); }
// 
// 
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var4 = var3.getType();
//     int var5 = var3.getSourcePosition();
//     com.google.javascript.rhino.Node var6 = var3.getLastSibling();
//     boolean var7 = var3.isSyntheticBlock();
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var16 = var11.clonePropsFrom(var15);
//     com.google.javascript.rhino.jstype.JSType var17 = null;
//     var15.setJSType(var17);
//     var15.setOptionalArg(true);
//     var3.removeChild(var15);
// 
//   }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test331"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setAcceptConstKeyword(true);
    var0.setTweakToStringLiteral("goog.exportProperty", "goog.exportSymbol");
    var0.setShadowVariables(true);
    var0.setRemoveAbstractMethods(false);
    var0.setNameAnonymousFunctionsOnly(false);

  }

  public void test332() {}
//   public void test332() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test332"); }
// 
// 
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     var3.setType(10);
//     boolean var6 = var3.isLocalResultCall();
//     com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var15 = var10.clonePropsFrom(var14);
//     com.google.javascript.rhino.jstype.JSType var16 = null;
//     var14.setJSType(var16);
//     var14.setOptionalArg(true);
//     int var20 = var14.getLineno();
//     com.google.javascript.rhino.jstype.JSType var21 = var14.getJSType();
//     var14.addSuppression("");
//     var14.setVarArgs(true);
//     com.google.javascript.rhino.Node var26 = var3.getChildBefore(var14);
// 
//   }

  public void test333() {}
//   public void test333() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test333"); }
// 
// 
//     java.io.Reader var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromReader("goog.global", var1);
// 
//   }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test334"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
    com.google.javascript.jscomp.SourceMap var2 = var0.getSourceMap();
    com.google.javascript.jscomp.JSSourceFile var5 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
    com.google.javascript.jscomp.SourceFile.Generator var7 = null;
    com.google.javascript.jscomp.JSSourceFile var8 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var7);
    com.google.javascript.jscomp.CompilerInput var10 = new com.google.javascript.jscomp.CompilerInput(var8, true);
    com.google.javascript.jscomp.CompilerOptions var11 = new com.google.javascript.jscomp.CompilerOptions();
    var11.setAcceptConstKeyword(true);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var14 = var11.getTweakProcessing();
    var11.setRewriteNewDateGoogNow(false);
    com.google.javascript.jscomp.Result var17 = var0.compile(var5, var8, var11);
    boolean var18 = var11.shouldColorizeErrorOutput();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test335"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.jscomp.ClosureCodingConvention var1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    boolean var3 = var1.isPrivate("");
    java.lang.String var4 = var1.getExportSymbolFunction();
    boolean var6 = var1.isSuperClassReference("");
    java.util.Collection var7 = var1.getAssertionFunctions();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    var11.setType(10);
    boolean var14 = var11.isLocalResultCall();
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var15 = var1.getDelegateRelationship(var11);
    com.google.javascript.rhino.EcmaError var22 = com.google.javascript.rhino.ScriptRuntime.constructError("goog.global", "", "", 40, "null(null)", 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.disconnect((java.lang.Object)var11, (java.lang.Object)"goog.global");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "goog.exportSymbol"+ "'", var4.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test336() {}
//   public void test336() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test336"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = com.google.javascript.rhino.Context.enter();
//     boolean var1 = var0.isGeneratingDebugChanged();
//     var0.setGeneratingSource(true);
//     int var4 = var0.getOptimizationLevel();
//     boolean var5 = var0.isGeneratingSource();
//     com.google.javascript.jscomp.MessageFormatter var7 = null;
//     java.util.logging.Logger var8 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var9 = new com.google.javascript.jscomp.LoggerErrorManager(var7, var8);
//     int var10 = var9.getWarningCount();
//     var0.putThreadLocal((java.lang.Object)(-1.0f), (java.lang.Object)var9);
//     com.google.javascript.jscomp.Compiler var12 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var9);
//     com.google.javascript.jscomp.JSModule var13 = null;
//     java.lang.String[] var14 = var12.toSourceArray(var13);
// 
//   }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test337"); }


    java.lang.String var2 = com.google.javascript.rhino.ScriptRuntime.numberToString(0.0d, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "0"+ "'", var2.equals("0"));

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test338"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.EcmaError var1 = com.google.javascript.rhino.ScriptRuntime.typeError0("com.google.javascript.rhino.EcmaError: TypeError: Cannot set property \"hi!: hi!\" of 0 to \"40\"");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test339"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
    com.google.javascript.jscomp.SourceMap var2 = var0.getSourceMap();
    var0.reportCodeChange();
    com.google.javascript.jscomp.Compiler var4 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var5 = var4.getTopScope();
    com.google.javascript.jscomp.SourceMap var6 = var4.getSourceMap();
    com.google.javascript.jscomp.JSSourceFile var9 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
    com.google.javascript.jscomp.SourceFile.Generator var11 = null;
    com.google.javascript.jscomp.JSSourceFile var12 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var11);
    com.google.javascript.jscomp.CompilerInput var14 = new com.google.javascript.jscomp.CompilerInput(var12, true);
    com.google.javascript.jscomp.CompilerOptions var15 = new com.google.javascript.jscomp.CompilerOptions();
    var15.setAcceptConstKeyword(true);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var18 = var15.getTweakProcessing();
    var15.setRewriteNewDateGoogNow(false);
    com.google.javascript.jscomp.Result var21 = var4.compile(var9, var12, var15);
    com.google.javascript.rhino.Node var22 = var0.parse(var9);
    com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var23 = null;
    com.google.javascript.jscomp.LightweightMessageFormatter var24 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var0, var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.optimize();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test340"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
    com.google.javascript.jscomp.SourceMap var2 = var0.getSourceMap();
    com.google.javascript.jscomp.JSSourceFile var5 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
    com.google.javascript.jscomp.SourceFile.Generator var7 = null;
    com.google.javascript.jscomp.JSSourceFile var8 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var7);
    com.google.javascript.jscomp.CompilerInput var10 = new com.google.javascript.jscomp.CompilerInput(var8, true);
    com.google.javascript.jscomp.CompilerOptions var11 = new com.google.javascript.jscomp.CompilerOptions();
    var11.setAcceptConstKeyword(true);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var14 = var11.getTweakProcessing();
    var11.setRewriteNewDateGoogNow(false);
    com.google.javascript.jscomp.Result var17 = var0.compile(var5, var8, var11);
    com.google.javascript.jscomp.DiagnosticGroup var18 = null;
    com.google.javascript.jscomp.CheckLevel var19 = null;
    com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var20 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var18, var19);
    java.lang.String var21 = var20.toString();
    var11.addWarningsGuard((com.google.javascript.jscomp.WarningsGuard)var20);
    var11.setChainCalls(false);
    java.lang.RuntimeException var25 = com.google.javascript.rhino.ScriptRuntime.notFunctionError((java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "null(null)"+ "'", var21.equals("null(null)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test341"); }


    com.google.javascript.jscomp.DiagnosticGroups var0 = new com.google.javascript.jscomp.DiagnosticGroups();

  }

  public void test342() {}
//   public void test342() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test342"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var1);
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var2, true);
//     com.google.javascript.jscomp.SourceFile.Generator var6 = null;
//     com.google.javascript.jscomp.SourceFile var7 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var6);
//     com.google.javascript.jscomp.JsAst var8 = new com.google.javascript.jscomp.JsAst(var7);
//     var4.setSourceFile(var7);
//     com.google.javascript.jscomp.JSModule var10 = null;
//     var4.setModule(var10);
//     java.io.PrintStream var12 = null;
//     com.google.javascript.jscomp.Compiler var13 = new com.google.javascript.jscomp.Compiler(var12);
//     var4.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var13);
//     boolean var15 = var4.isExtern();
//     java.io.PrintStream var16 = null;
//     com.google.javascript.jscomp.Compiler var17 = new com.google.javascript.jscomp.Compiler(var16);
//     com.google.javascript.jscomp.SourceMap var18 = var17.getSourceMap();
//     com.google.javascript.jscomp.SourceMap var19 = var17.getSourceMap();
//     var4.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var17);
//     com.google.javascript.jscomp.AbstractCompiler var21 = null;
//     var4.setCompiler(var21);
// 
//   }

  public void test343() {}
//   public void test343() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test343"); }
// 
// 
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var2);
//     com.google.javascript.jscomp.JSModule var4 = var3.getModule();
//     java.util.Collection var5 = var3.getProvides();
// 
//   }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test344"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var1 = var0.newSubGraph();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var2 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var3 = var2.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var5 = var2.createDirectedGraphNode((java.lang.Object)100);
    java.util.List var6 = var0.getDirectedPredNodes(var5);
    com.google.javascript.jscomp.SourceFile.Generator var8 = null;
    com.google.javascript.jscomp.JSSourceFile var9 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var8);
    com.google.javascript.jscomp.CompilerInput var11 = new com.google.javascript.jscomp.CompilerInput(var9, true);
    com.google.javascript.jscomp.SourceFile.Generator var13 = null;
    com.google.javascript.jscomp.SourceFile var14 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var13);
    com.google.javascript.jscomp.JsAst var15 = new com.google.javascript.jscomp.JsAst(var14);
    var11.setSourceFile(var14);
    com.google.javascript.jscomp.JSModule var17 = null;
    var11.setModule(var17);
    java.lang.String var19 = var11.getName();
    com.google.javascript.jscomp.CompilerInput var20 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var11);
    com.google.javascript.jscomp.CompilerInput var21 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var20);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var22 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var23 = var22.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var25 = var22.createDirectedGraphNode((java.lang.Object)100);
    java.util.List var26 = var22.getGraphvizNodes();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var27 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var28 = var27.newSubGraph();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var29 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var30 = var29.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var32 = var29.createDirectedGraphNode((java.lang.Object)100);
    java.util.List var33 = var27.getDirectedPredNodes(var32);
    java.util.List var34 = var22.getDirectedPredNodes(var32);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var35 = var0.isConnected((java.lang.Object)var21, (java.lang.Object)var34);
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
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
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
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test345() {}
//   public void test345() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test345"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     com.google.javascript.jscomp.SourceMap var2 = var0.getSourceMap();
//     var0.reportCodeChange();
//     com.google.javascript.jscomp.Compiler var4 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var5 = var4.getTopScope();
//     com.google.javascript.jscomp.SourceMap var6 = var4.getSourceMap();
//     com.google.javascript.jscomp.JSSourceFile var9 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
//     com.google.javascript.jscomp.SourceFile.Generator var11 = null;
//     com.google.javascript.jscomp.JSSourceFile var12 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var11);
//     com.google.javascript.jscomp.CompilerInput var14 = new com.google.javascript.jscomp.CompilerInput(var12, true);
//     com.google.javascript.jscomp.CompilerOptions var15 = new com.google.javascript.jscomp.CompilerOptions();
//     var15.setAcceptConstKeyword(true);
//     com.google.javascript.jscomp.CompilerOptions.TweakProcessing var18 = var15.getTweakProcessing();
//     var15.setRewriteNewDateGoogNow(false);
//     com.google.javascript.jscomp.Result var21 = var4.compile(var9, var12, var15);
//     com.google.javascript.rhino.Node var22 = var0.parse(var9);
//     com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var23 = null;
//     com.google.javascript.jscomp.LightweightMessageFormatter var24 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var0, var23);
//     var24.setColorize(false);
//     var24.setColorize(true);
//     com.google.javascript.jscomp.Compiler var29 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var30 = var29.getTopScope();
//     var29.disableThreads();
//     var29.disableThreads();
//     com.google.javascript.jscomp.MessageFormatter var33 = null;
//     java.util.logging.Logger var34 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var35 = new com.google.javascript.jscomp.LoggerErrorManager(var33, var34);
//     com.google.javascript.jscomp.CheckLevel var36 = null;
//     com.google.javascript.rhino.Node var38 = null;
//     com.google.javascript.jscomp.CheckLevel var40 = null;
//     com.google.javascript.jscomp.DiagnosticType var42 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var40, "hi!");
//     java.lang.String[] var44 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make("", var38, var42, var44);
//     var35.report(var36, var45);
//     var29.setErrorManager((com.google.javascript.jscomp.ErrorManager)var35);
//     com.google.javascript.jscomp.CheckLevel var48 = null;
//     com.google.javascript.jscomp.DiagnosticType var54 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     java.lang.String[] var56 = new java.lang.String[] { "hi!: hi!"};
//     com.google.javascript.jscomp.JSError var57 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", 40, 0, var54, var56);
//     var35.report(var48, var57);
//     java.lang.String var59 = var24.formatError(var57);
// 
//   }

  public void test346() {}
//   public void test346() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test346"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     boolean var2 = var0.isPrivate("");
//     boolean var4 = var0.isPrivate("goog.exportProperty");
//     boolean var6 = var0.isConstant("com.google.javascript.rhino.EcmaError: : hi!");
//     com.google.javascript.rhino.jstype.FunctionType var7 = null;
//     com.google.javascript.rhino.jstype.FunctionType var8 = null;
//     com.google.javascript.jscomp.CodingConvention.SubclassType var9 = null;
//     var0.applySubclassRelationship(var7, var8, var9);
//     com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var19 = var14.clonePropsFrom(var18);
//     com.google.javascript.rhino.jstype.JSType var20 = null;
//     var18.setJSType(var20);
//     var18.setOptionalArg(true);
//     com.google.javascript.rhino.JSDocInfo var24 = null;
//     var18.setJSDocInfo(var24);
//     var18.detachChildren();
//     com.google.javascript.jscomp.CodingConvention.SubclassRelationship var27 = var0.getClassesDefinedByCall(var18);
// 
//   }

  public void test347() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test347"); }


    com.google.javascript.rhino.EcmaError var1 = com.google.javascript.rhino.ScriptRuntime.typeError("com.google.javascript.rhino.EcmaError: : hi!");
    int var2 = var1.columnNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test348() {}
//   public void test348() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test348"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     var0.disableThreads();
//     com.google.javascript.jscomp.MessageFormatter var4 = null;
//     java.util.logging.Logger var5 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var6 = new com.google.javascript.jscomp.LoggerErrorManager(var4, var5);
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.rhino.Node var9 = null;
//     com.google.javascript.jscomp.CheckLevel var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var11, "hi!");
//     java.lang.String[] var15 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("", var9, var13, var15);
//     var6.report(var7, var16);
//     var0.setErrorManager((com.google.javascript.jscomp.ErrorManager)var6);
//     int var19 = var6.getErrorCount();
//     var6.setTypedPercent(100.0d);
//     com.google.javascript.jscomp.CheckLevel var22 = null;
//     com.google.javascript.rhino.Context var23 = null;
//     com.google.javascript.rhino.Context var24 = com.google.javascript.rhino.Context.enter(var23);
//     var24.setCompileFunctionsWithDynamicScope(false);
//     com.google.javascript.jscomp.MessageFormatter var27 = null;
//     java.util.logging.Logger var28 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var29 = new com.google.javascript.jscomp.LoggerErrorManager(var27, var28);
//     com.google.javascript.jscomp.CheckLevel var30 = null;
//     com.google.javascript.rhino.Node var32 = null;
//     com.google.javascript.jscomp.CheckLevel var34 = null;
//     com.google.javascript.jscomp.DiagnosticType var36 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var34, "hi!");
//     java.lang.String[] var38 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var39 = com.google.javascript.jscomp.JSError.make("", var32, var36, var38);
//     var29.report(var30, var39);
//     var24.removeThreadLocal((java.lang.Object)var39);
//     com.google.javascript.rhino.EvaluatorException var47 = new com.google.javascript.rhino.EvaluatorException("OFF", "", 10, "goog.global", 1);
//     boolean var48 = var39.equals((java.lang.Object)"goog.global");
//     var6.println(var22, var39);
// 
//   }

  public void test349() {}
//   public void test349() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test349"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     com.google.javascript.jscomp.SourceMap var2 = var0.getSourceMap();
//     com.google.javascript.rhino.jstype.JSTypeRegistry var3 = var0.getTypeRegistry();
// 
//   }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test350"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var4 = var3.getType();
    com.google.javascript.rhino.Node var5 = var3.cloneTree();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var7 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var8 = var7.getNodes();
    java.util.List var9 = var7.getEdges();
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    var13.setType(10);
    com.google.javascript.rhino.Node var18 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", var9, var13, 1, 100);
    var13.setVarArgs(false);
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var25 = var24.getType();
    com.google.javascript.rhino.Node var26 = var24.cloneTree();
    var24.addSuppression("");
    com.google.javascript.rhino.EcmaError var35 = com.google.javascript.rhino.ScriptRuntime.constructError("", "hi!", "hi!", (-1), "hi!", 1);
    java.lang.RuntimeException var36 = com.google.javascript.rhino.ScriptRuntime.undefReadError((java.lang.Object)var24, (java.lang.Object)"hi!");
    com.google.javascript.rhino.Node var37 = var24.removeChildren();
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var42 = var41.getType();
    com.google.javascript.rhino.Node var43 = var41.cloneTree();
    var41.addSuppression("");
    com.google.javascript.rhino.EcmaError var52 = com.google.javascript.rhino.ScriptRuntime.constructError("", "hi!", "hi!", (-1), "hi!", 1);
    java.lang.RuntimeException var53 = com.google.javascript.rhino.ScriptRuntime.undefReadError((java.lang.Object)var41, (java.lang.Object)"hi!");
    com.google.javascript.rhino.jstype.JSType var54 = var41.getJSType();
    var13.addChildAfter(var24, var41);
    com.google.javascript.jscomp.ClosureCodingConvention var56 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var60 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var64 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var65 = var60.clonePropsFrom(var64);
    com.google.javascript.rhino.jstype.JSType var66 = null;
    var64.setJSType(var66);
    var64.setOptionalArg(true);
    java.lang.String var70 = var56.identifyTypeDefAssign(var64);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.addChildAfter(var24, var64);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test351"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var1 = var0.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var3 = var0.createDirectedGraphNode((java.lang.Object)100);
    java.util.List var4 = var0.getGraphvizNodes();
    boolean var5 = var0.isDirected();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var10 = var9.getType();
    java.util.logging.Logger var11 = null;
    com.google.javascript.jscomp.LoggerErrorManager var12 = new com.google.javascript.jscomp.LoggerErrorManager(var11);
    com.google.javascript.rhino.EcmaError var19 = com.google.javascript.rhino.ScriptRuntime.constructError("", "hi!", "hi!", (-1), "hi!", 1);
    java.lang.String var20 = var19.toString();
    var19.initLineNumber(100);
    java.lang.String var23 = var19.details();
    java.lang.String var24 = var19.details();
    java.lang.String var25 = var19.getSourceName();
    int var26 = var19.columnNumber();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var27 = var0.isConnected((java.lang.Object)var9, (java.lang.Object)var12, (java.lang.Object)var19);
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
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "com.google.javascript.rhino.EcmaError: : hi!"+ "'", var20.equals("com.google.javascript.rhino.EcmaError: : hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ": hi!"+ "'", var23.equals(": hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ": hi!"+ "'", var24.equals(": hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test352"); }


    com.google.javascript.rhino.EcmaError var6 = com.google.javascript.rhino.ScriptRuntime.constructError("", "hi!", "hi!", (-1), "hi!", 1);
    java.lang.String var7 = var6.toString();
    var6.initLineNumber(100);
    java.lang.String var10 = var6.details();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.initSourceName("com.google.javascript.rhino.EcmaError: TypeError: hi! is not a function, it is com.google.javascript.jscomp.graph.LinkedDirectedGraph.");
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.google.javascript.rhino.EcmaError: : hi!"+ "'", var7.equals("com.google.javascript.rhino.EcmaError: : hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ": hi!"+ "'", var10.equals(": hi!"));

  }

  public void test353() {}
//   public void test353() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test353"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     var0.disableThreads();
//     com.google.javascript.jscomp.MessageFormatter var4 = null;
//     java.util.logging.Logger var5 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var6 = new com.google.javascript.jscomp.LoggerErrorManager(var4, var5);
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.rhino.Node var9 = null;
//     com.google.javascript.jscomp.CheckLevel var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var11, "hi!");
//     java.lang.String[] var15 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("", var9, var13, var15);
//     var6.report(var7, var16);
//     var0.setErrorManager((com.google.javascript.jscomp.ErrorManager)var6);
//     com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var19 = null;
//     com.google.javascript.jscomp.LightweightMessageFormatter var20 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var0, var19);
//     com.google.javascript.jscomp.NodeTraversal.Callback var21 = null;
//     com.google.javascript.jscomp.NodeTraversal var22 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var0, var21);
//     java.lang.String var23 = var0.getAstDotGraph();
//     com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.DiagnosticType var35 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     java.lang.String[] var37 = new java.lang.String[] { "hi!: hi!"};
//     com.google.javascript.jscomp.JSError var38 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", 40, 0, var35, var37);
//     com.google.javascript.jscomp.JSError var39 = com.google.javascript.jscomp.JSError.make("()", (-1), 10, var29, var37);
//     var0.report(var39);
// 
//   }

  public void test354() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test354"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.VariableRenamingPolicy var1 = com.google.javascript.jscomp.VariableRenamingPolicy.valueOf("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test355"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.EcmaError var3 = com.google.javascript.rhino.ScriptRuntime.typeError2("OFF", "STRING \n", "hi!: hi!");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test356() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test356"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var1 = var0.newSubGraph();
    var0.pushNodeAnnotations();
    java.util.List var3 = var0.getGraphvizEdges();
    com.google.javascript.jscomp.Compiler var4 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var5 = var4.getTopScope();
    com.google.javascript.jscomp.SourceMap var6 = var4.getSourceMap();
    com.google.javascript.jscomp.JSSourceFile var9 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
    com.google.javascript.jscomp.SourceFile.Generator var11 = null;
    com.google.javascript.jscomp.JSSourceFile var12 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var11);
    com.google.javascript.jscomp.CompilerInput var14 = new com.google.javascript.jscomp.CompilerInput(var12, true);
    com.google.javascript.jscomp.CompilerOptions var15 = new com.google.javascript.jscomp.CompilerOptions();
    var15.setAcceptConstKeyword(true);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var18 = var15.getTweakProcessing();
    var15.setRewriteNewDateGoogNow(false);
    com.google.javascript.jscomp.Result var21 = var4.compile(var9, var12, var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var22 = var0.getDirectedPredNodes((java.lang.Object)var21);
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
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test357"); }


    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var10 = var5.clonePropsFrom(var9);
    com.google.javascript.rhino.jstype.JSType var11 = null;
    var10.setJSType(var11);
    java.util.Collection var13 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(var10);
    com.google.javascript.rhino.Node[] var14 = new com.google.javascript.rhino.Node[] { var10};
    com.google.javascript.rhino.Node var15 = new com.google.javascript.rhino.Node(10, var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var16 = new com.google.javascript.rhino.Node(1, var14);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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

  }

  public void test358() {}
//   public void test358() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test358"); }
// 
// 
//     java.io.InputStream var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromInputStream("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var1);
// 
//   }

  public void test359() {}
//   public void test359() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test359"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     java.lang.String var1 = var0.getGlobalObject();
//     java.lang.String var2 = var0.getExportPropertyFunction();
//     java.lang.String var3 = var0.getDelegateSuperclassName();
//     java.lang.String var4 = var0.getExportSymbolFunction();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var6 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.Collection var7 = var6.getNodes();
//     java.util.List var8 = var6.getEdges();
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     var12.setType(10);
//     com.google.javascript.rhino.Node var17 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", var8, var12, 1, 100);
//     com.google.javascript.rhino.Node var18 = var12.removeFirstChild();
//     com.google.javascript.jscomp.CodingConvention.SubclassRelationship var19 = var0.getClassesDefinedByCall(var12);
// 
//   }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test360"); }


    com.google.javascript.rhino.Node var2 = null;
    com.google.javascript.jscomp.CheckLevel var4 = null;
    com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var4, "hi!");
    java.lang.String[] var8 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
    com.google.javascript.jscomp.JSError var9 = com.google.javascript.jscomp.JSError.make("", var2, var6, var8);
    java.lang.RuntimeException var11 = com.google.javascript.rhino.ScriptRuntime.undefWriteError((java.lang.Object)(short)0, (java.lang.Object)var6, (java.lang.Object)40);
    com.google.javascript.jscomp.DiagnosticType[] var12 = new com.google.javascript.jscomp.DiagnosticType[] { var6};
    com.google.javascript.jscomp.DiagnosticGroup var13 = new com.google.javascript.jscomp.DiagnosticGroup(var12);
    com.google.javascript.jscomp.DiagnosticGroup[] var14 = new com.google.javascript.jscomp.DiagnosticGroup[] { var13};
    com.google.javascript.jscomp.DiagnosticGroup var15 = new com.google.javascript.jscomp.DiagnosticGroup(var14);
    com.google.javascript.jscomp.DiagnosticGroup var16 = new com.google.javascript.jscomp.DiagnosticGroup(var14);
    java.lang.String var17 = var16.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test361"); }


    com.google.javascript.rhino.Node var3 = null;
    com.google.javascript.jscomp.CheckLevel var5 = null;
    com.google.javascript.jscomp.DiagnosticType var7 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var5, "hi!");
    java.lang.String[] var9 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
    com.google.javascript.jscomp.JSError var10 = com.google.javascript.jscomp.JSError.make("", var3, var7, var9);
    java.lang.RuntimeException var12 = com.google.javascript.rhino.ScriptRuntime.undefWriteError((java.lang.Object)(short)0, (java.lang.Object)var7, (java.lang.Object)40);
    com.google.javascript.jscomp.DiagnosticType[] var13 = new com.google.javascript.jscomp.DiagnosticType[] { var7};
    com.google.javascript.jscomp.DiagnosticGroup var14 = new com.google.javascript.jscomp.DiagnosticGroup(var13);
    com.google.javascript.jscomp.DiagnosticGroup[] var15 = new com.google.javascript.jscomp.DiagnosticGroup[] { var14};
    com.google.javascript.jscomp.DiagnosticGroup var16 = new com.google.javascript.jscomp.DiagnosticGroup(var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var18 = com.google.javascript.rhino.ScriptRuntime.getMessage2("OFF", (java.lang.Object)var15, (java.lang.Object)"hi!");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test362() {}
//   public void test362() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test362"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     com.google.javascript.jscomp.SourceMap var2 = var0.getSourceMap();
//     com.google.javascript.jscomp.JSSourceFile var5 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
//     com.google.javascript.jscomp.SourceFile.Generator var7 = null;
//     com.google.javascript.jscomp.JSSourceFile var8 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var7);
//     com.google.javascript.jscomp.CompilerInput var10 = new com.google.javascript.jscomp.CompilerInput(var8, true);
//     com.google.javascript.jscomp.CompilerOptions var11 = new com.google.javascript.jscomp.CompilerOptions();
//     var11.setAcceptConstKeyword(true);
//     com.google.javascript.jscomp.CompilerOptions.TweakProcessing var14 = var11.getTweakProcessing();
//     var11.setRewriteNewDateGoogNow(false);
//     com.google.javascript.jscomp.Result var17 = var0.compile(var5, var8, var11);
//     com.google.javascript.jscomp.LightweightMessageFormatter var18 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var0);
//     com.google.javascript.jscomp.Result var19 = var0.getResult();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var20 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.SubGraph var21 = var20.newSubGraph();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var23 = var20.createDirectedGraphNode((java.lang.Object)100);
//     java.util.List var24 = var20.getGraphvizNodes();
//     var20.clearNodeAnnotations();
//     var20.pushNodeAnnotations();
//     java.util.List var27 = var20.getGraphvizEdges();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var28 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.SubGraph var29 = var28.newSubGraph();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var31 = var28.createDirectedGraphNode((java.lang.Object)100);
//     java.util.List var32 = var28.getGraphvizNodes();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var33 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.SubGraph var34 = var33.newSubGraph();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var35 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.SubGraph var36 = var35.newSubGraph();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var38 = var35.createDirectedGraphNode((java.lang.Object)100);
//     java.util.List var39 = var33.getDirectedPredNodes(var38);
//     java.util.List var40 = var28.getDirectedPredNodes(var38);
//     com.google.javascript.jscomp.Compiler var41 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var42 = var41.getTopScope();
//     com.google.javascript.jscomp.SourceMap var43 = var41.getSourceMap();
//     com.google.javascript.jscomp.JSSourceFile var46 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
//     com.google.javascript.jscomp.SourceFile.Generator var48 = null;
//     com.google.javascript.jscomp.JSSourceFile var49 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var48);
//     com.google.javascript.jscomp.CompilerInput var51 = new com.google.javascript.jscomp.CompilerInput(var49, true);
//     com.google.javascript.jscomp.CompilerOptions var52 = new com.google.javascript.jscomp.CompilerOptions();
//     var52.setAcceptConstKeyword(true);
//     com.google.javascript.jscomp.CompilerOptions.TweakProcessing var55 = var52.getTweakProcessing();
//     var52.setRewriteNewDateGoogNow(false);
//     com.google.javascript.jscomp.Result var58 = var41.compile(var46, var49, var52);
//     com.google.javascript.jscomp.DiagnosticGroup var59 = null;
//     com.google.javascript.jscomp.CheckLevel var60 = null;
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var61 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var59, var60);
//     java.lang.String var62 = var61.toString();
//     var52.addWarningsGuard((com.google.javascript.jscomp.WarningsGuard)var61);
//     var52.enableRuntimeTypeCheck("");
//     var0.initModules(var27, var40, var52);
// 
//   }

  public void test363() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test363"); }


    com.google.javascript.rhino.jstype.JSType var0 = null;
    com.google.javascript.rhino.jstype.JSType var1 = null;
    boolean var2 = com.google.javascript.rhino.jstype.JSType.isEquivalent(var0, var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test364() {}
//   public void test364() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test364"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var1);
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var2, true);
//     com.google.javascript.jscomp.SourceFile.Generator var6 = null;
//     com.google.javascript.jscomp.SourceFile var7 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var6);
//     com.google.javascript.jscomp.JsAst var8 = new com.google.javascript.jscomp.JsAst(var7);
//     var4.setSourceFile(var7);
//     com.google.javascript.jscomp.JSModule var10 = null;
//     var4.setModule(var10);
//     java.lang.String var12 = var4.getName();
//     com.google.javascript.jscomp.CompilerInput var13 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var4);
//     java.util.Collection var14 = var13.getRequires();
// 
//   }

  public void test365() {}
//   public void test365() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test365"); }
// 
// 
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var4 = var3.getType();
//     java.lang.String var5 = var3.getQualifiedName();
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var14 = var9.clonePropsFrom(var13);
//     com.google.javascript.rhino.Node var15 = var3.clonePropsFrom(var13);
//     boolean var16 = var13.isOnlyModifiesThisCall();
//     com.google.javascript.rhino.Node var17 = null;
//     com.google.javascript.rhino.Node var18 = var13.clonePropsFrom(var17);
// 
//   }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test366"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var9 = var4.clonePropsFrom(var8);
    com.google.javascript.rhino.jstype.JSType var10 = null;
    var9.setJSType(var10);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var20 = var15.clonePropsFrom(var19);
    com.google.javascript.rhino.jstype.JSType var21 = null;
    var20.setJSType(var21);
    java.util.Collection var23 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(var20);
    com.google.javascript.rhino.Node.AncestorIterable var24 = var20.getAncestors();
    boolean var25 = var20.isOnlyModifiesThisCall();
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var34 = var29.clonePropsFrom(var33);
    com.google.javascript.rhino.jstype.JSType var35 = null;
    var33.setJSType(var35);
    var33.setOptionalArg(true);
    int var39 = var33.getLineno();
    boolean var40 = var33.isLocalResultCall();
    boolean var41 = var33.isQuotedString();
    com.google.javascript.rhino.Node var42 = new com.google.javascript.rhino.Node(0, var9, var20, var33);
    com.google.javascript.jscomp.ClosureCodingConvention var43 = new com.google.javascript.jscomp.ClosureCodingConvention();
    boolean var45 = var43.isPrivate("");
    boolean var47 = var43.isPrivate("goog.exportProperty");
    boolean var49 = var43.isConstant("com.google.javascript.rhino.EcmaError: : hi!");
    com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var58 = var53.clonePropsFrom(var57);
    com.google.javascript.rhino.jstype.JSType var59 = null;
    var57.setJSType(var59);
    var57.setOptionalArg(true);
    int var63 = var57.getLineno();
    com.google.javascript.rhino.Node var67 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var71 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var72 = var67.clonePropsFrom(var71);
    com.google.javascript.rhino.jstype.JSType var73 = null;
    var71.setJSType(var73);
    java.lang.String var75 = var43.extractClassNameIfProvide(var57, var71);
    var42.addChildrenToFront(var57);
    var42.addSuppression("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);

  }

  public void test367() {}
//   public void test367() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test367"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     com.google.javascript.jscomp.SourceMap var2 = var0.getSourceMap();
//     var0.reportCodeChange();
//     com.google.javascript.jscomp.MessageFormatter var4 = null;
//     java.util.logging.Logger var5 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var6 = new com.google.javascript.jscomp.LoggerErrorManager(var4, var5);
//     var0.setErrorManager((com.google.javascript.jscomp.ErrorManager)var6);
//     com.google.javascript.jscomp.JSModule var8 = null;
//     java.lang.String[] var9 = var0.toSourceArray(var8);
// 
//   }

  public void test368() {}
//   public void test368() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test368"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     boolean var2 = var0.isPrivate("");
//     java.lang.String var3 = var0.getExportPropertyFunction();
//     boolean var5 = var0.isPrivate("com.google.javascript.rhino.EcmaError: : hi!");
//     com.google.javascript.rhino.jstype.FunctionType var6 = null;
//     com.google.javascript.rhino.jstype.FunctionType var7 = null;
//     com.google.javascript.jscomp.CodingConvention.SubclassType var8 = null;
//     var0.applySubclassRelationship(var6, var7, var8);
//     com.google.javascript.jscomp.ClosureCodingConvention var10 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     boolean var12 = var10.isPrivate("");
//     boolean var14 = var10.isPrivate("goog.exportProperty");
//     boolean var16 = var10.isConstant("com.google.javascript.rhino.EcmaError: : hi!");
//     com.google.javascript.rhino.Node var17 = null;
//     com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     var21.setType(10);
//     var21.setOptionalArg(false);
//     java.lang.String var26 = var10.extractClassNameIfProvide(var17, var21);
//     com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var32 = var31.getType();
//     java.lang.String var33 = var31.getQualifiedName();
//     com.google.javascript.rhino.Node var34 = new com.google.javascript.rhino.Node(100, var31);
//     boolean var35 = var10.isVarArgsParameter(var34);
//     java.util.Set var36 = null;
//     var34.setDirectives(var36);
//     com.google.javascript.rhino.Node var38 = null;
//     java.lang.String var39 = var0.extractClassNameIfProvide(var34, var38);
// 
//   }

  public void test369() {}
//   public void test369() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test369"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     com.google.javascript.rhino.Node var3 = var0.getRoot();
//     com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var4 = null;
//     com.google.javascript.jscomp.LightweightMessageFormatter var5 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var0, var4);
//     com.google.javascript.jscomp.Result var6 = var0.getResult();
// 
//   }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test370"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.jscomp.SourceFile.Generator var2 = null;
    com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var2);
    com.google.javascript.jscomp.JsAst var4 = new com.google.javascript.jscomp.JsAst(var3);
    java.lang.RuntimeException var5 = com.google.javascript.rhino.ScriptRuntime.notFunctionError((java.lang.Object)var0, (java.lang.Object)var3);
    java.lang.Object var6 = null;
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var7 = var0.getDirectedGraphNode(var6);
    com.google.javascript.jscomp.graph.SubGraph var8 = var0.newSubGraph();
    java.lang.Object var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var10 = var0.getNodeDegree(var9);
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
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test371"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var1 = com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.valueOf("()");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test372"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.Node.newString("goog.exportSymbol");
    java.util.Collection var2 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = var1.getExistingIntProp(10);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test373"); }


    com.google.javascript.rhino.EcmaError var6 = com.google.javascript.rhino.ScriptRuntime.constructError("", "hi!", "hi!", (-1), "hi!", 1);
    java.lang.String var7 = var6.toString();
    var6.initLineNumber(100);
    java.lang.String var10 = var6.details();
    int var11 = var6.lineNumber();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.initLineSource("com.google.javascript.rhino.EcmaError: : hi!");
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.google.javascript.rhino.EcmaError: : hi!"+ "'", var7.equals("com.google.javascript.rhino.EcmaError: : hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ": hi!"+ "'", var10.equals(": hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100);

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test374"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
    com.google.javascript.jscomp.SourceMap var2 = var0.getSourceMap();
    com.google.javascript.jscomp.JSSourceFile var5 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
    com.google.javascript.jscomp.SourceFile.Generator var7 = null;
    com.google.javascript.jscomp.JSSourceFile var8 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var7);
    com.google.javascript.jscomp.CompilerInput var10 = new com.google.javascript.jscomp.CompilerInput(var8, true);
    com.google.javascript.jscomp.CompilerOptions var11 = new com.google.javascript.jscomp.CompilerOptions();
    var11.setAcceptConstKeyword(true);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var14 = var11.getTweakProcessing();
    var11.setRewriteNewDateGoogNow(false);
    com.google.javascript.jscomp.Result var17 = var0.compile(var5, var8, var11);
    com.google.javascript.jscomp.CompilerOptions var18 = new com.google.javascript.jscomp.CompilerOptions();
    var18.setAcceptConstKeyword(true);
    java.util.Map var21 = var18.getTweakReplacements();
    var0.initOptions(var18);
    var18.skipAllCompilerPasses();
    var18.setTweakToNumberLiteral("", 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test375() {}
//   public void test375() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test375"); }
// 
// 
//     java.io.InputStream var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromInputStream("hi!: hi!", var1);
// 
//   }

  public void test376() {}
//   public void test376() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test376"); }
// 
// 
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.Node.newString("goog.exportSymbol");
//     java.util.Collection var3 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(var2);
//     com.google.javascript.jscomp.CheckLevel var4 = null;
//     com.google.javascript.jscomp.DiagnosticType var5 = null;
//     com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     java.lang.String[] var13 = new java.lang.String[] { "hi!: hi!"};
//     com.google.javascript.jscomp.JSError var14 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", 40, 0, var11, var13);
//     com.google.javascript.jscomp.JSError var15 = com.google.javascript.jscomp.JSError.make("hi!", var2, var4, var5, var13);
// 
//   }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test377"); }


    com.google.javascript.jscomp.CompilerOptions var1 = new com.google.javascript.jscomp.CompilerOptions();
    var1.setAcceptConstKeyword(true);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var4 = var1.getTweakProcessing();
    var1.setRewriteNewDateGoogNow(false);
    com.google.javascript.jscomp.CompilerOptions var7 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var10 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var11 = var10.getNodes();
    java.util.List var12 = var10.getEdges();
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    var16.setType(10);
    com.google.javascript.rhino.Node var21 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", var12, var16, 1, 100);
    var7.setReplaceStringsConfiguration("hi!", var12);
    var1.setManageClosureDependencies(var12);
    java.lang.RuntimeException var24 = com.google.javascript.rhino.ScriptRuntime.notFunctionError((java.lang.Object)var1);
    com.google.javascript.rhino.EcmaError var31 = com.google.javascript.rhino.ScriptRuntime.constructError("", "hi!", "hi!", (-1), "hi!", 1);
    java.lang.String var32 = var31.toString();
    var31.initLineNumber(100);
    java.lang.String var35 = var31.details();
    java.lang.String var36 = var31.details();
    java.lang.String var37 = var31.getSourceName();
    int var38 = var31.columnNumber();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var39 = com.google.javascript.rhino.ScriptRuntime.getMessage2("", (java.lang.Object)var1, (java.lang.Object)var38);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "com.google.javascript.rhino.EcmaError: : hi!"+ "'", var32.equals("com.google.javascript.rhino.EcmaError: : hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + ": hi!"+ "'", var35.equals(": hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ": hi!"+ "'", var36.equals(": hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 1);

  }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test378"); }


    boolean var1 = com.google.javascript.rhino.Context.isValidLanguageVersion(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test379"); }


    java.lang.String var1 = com.google.javascript.rhino.Node.tokenToName(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "eol"+ "'", var1.equals("eol"));

  }

  public void test380() {}
//   public void test380() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test380"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     com.google.javascript.rhino.Node var3 = var0.getRoot();
//     com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var4 = null;
//     com.google.javascript.jscomp.LightweightMessageFormatter var5 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var0, var4);
//     com.google.javascript.jscomp.ErrorManager var6 = var0.getErrorManager();
//     com.google.javascript.jscomp.JSSourceFile var9 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.global", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)");
//     com.google.javascript.jscomp.JSModule var10 = null;
//     com.google.javascript.jscomp.JSModule[] var11 = new com.google.javascript.jscomp.JSModule[] { var10};
//     com.google.javascript.jscomp.CompilerOptions var12 = new com.google.javascript.jscomp.CompilerOptions();
//     var12.setAcceptConstKeyword(true);
//     var12.setTweakToStringLiteral("goog.exportProperty", "goog.exportSymbol");
//     var12.setShadowVariables(true);
//     var12.setColorizeErrorOutput(true);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var22 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.SubGraph var23 = var22.newSubGraph();
//     var22.pushNodeAnnotations();
//     java.util.List var25 = var22.getGraphvizEdges();
//     com.google.javascript.jscomp.ComposeWarningsGuard var26 = new com.google.javascript.jscomp.ComposeWarningsGuard(var25);
//     var12.setManageClosureDependencies(var25);
//     var12.setTweakToDoubleLiteral("hi!: hi!", 10.0d);
//     com.google.javascript.jscomp.Result var31 = var0.compile(var9, var11, var12);
// 
//   }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test381"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var1 = var0.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var3 = var0.createDirectedGraphNode((java.lang.Object)100);
    java.util.List var4 = var0.getGraphvizNodes();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var5 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var6 = var5.newSubGraph();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var7 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var8 = var7.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var10 = var7.createDirectedGraphNode((java.lang.Object)100);
    java.util.List var11 = var5.getDirectedPredNodes(var10);
    java.util.List var12 = var0.getDirectedPredNodes(var10);
    java.lang.Object var13 = new java.lang.Object();
    java.lang.String var14 = com.google.javascript.rhino.ScriptRuntime.toString(var13);
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var15 = var0.createDirectedGraphNode((java.lang.Object)var14);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var21 = var20.getType();
    java.lang.String var22 = var20.getQualifiedName();
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var31 = var26.clonePropsFrom(var30);
    com.google.javascript.rhino.Node var32 = var20.clonePropsFrom(var30);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var41 = var36.clonePropsFrom(var40);
    com.google.javascript.rhino.jstype.JSType var42 = null;
    var41.setJSType(var42);
    java.util.Collection var44 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(var41);
    boolean var45 = var41.isSyntheticBlock();
    com.google.javascript.rhino.Node var48 = new com.google.javascript.rhino.Node(100, var30, var41, 1, (-1));
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var49 = var0.createDirectedGraphNode((java.lang.Object)var41);
    boolean var50 = var41.isNoSideEffectsCall();
    boolean var52 = var41.getBooleanProp(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);

  }

  public void test382() {}
//   public void test382() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test382"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.SubGraph var1 = var0.newSubGraph();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var3 = var0.createDirectedGraphNode((java.lang.Object)100);
//     java.util.List var4 = var0.getGraphvizNodes();
//     boolean var5 = var0.isDirected();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var6 = null;
//     java.util.List var7 = var0.getNeighborNodes(var6);
// 
//   }

  public void test383() {}
//   public void test383() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test383"); }
// 
// 
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.lang.String var2 = com.google.javascript.rhino.ScriptRuntime.numberToString(100.0d, 0);
//       fail("Expected exception of type com.google.javascript.rhino.EvaluatorException");
//     } catch (com.google.javascript.rhino.EvaluatorException e) {
//       // Expected exception.
//     }
// 
//   }

  public void test384() {}
//   public void test384() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test384"); }
// 
// 
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.EvaluatorException var1 = com.google.javascript.rhino.Context.reportRuntimeError("hi!: hi!");
//       fail("Expected exception of type com.google.javascript.rhino.EvaluatorException");
//     } catch (com.google.javascript.rhino.EvaluatorException e) {
//       // Expected exception.
//     }
// 
//   }

  public void test385() {}
//   public void test385() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test385"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     com.google.javascript.jscomp.CompilerOptions var2 = null;
//     var0.initOptions(var2);
// 
//   }

  public void test386() {}
//   public void test386() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test386"); }
// 
// 
//     com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var5 = var4.getType();
//     java.lang.String var6 = var4.getQualifiedName();
//     com.google.javascript.rhino.Node var7 = new com.google.javascript.rhino.Node(100, var4);
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var16 = var11.clonePropsFrom(var15);
//     com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var21 = var20.getType();
//     int var22 = var20.getSourcePosition();
//     com.google.javascript.rhino.Node var23 = var20.getLastSibling();
//     com.google.javascript.rhino.Node var24 = var20.removeFirstChild();
//     java.lang.String var25 = var20.getQualifiedName();
//     com.google.javascript.rhino.Node var26 = var15.copyInformationFromForTree(var20);
//     var4.removeChild(var20);
// 
//   }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test387"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    var3.putBooleanProp(0, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var3.getExistingIntProp(1);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test388() {}
//   public void test388() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test388"); }
// 
// 
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.EvaluatorException var5 = com.google.javascript.rhino.Context.reportRuntimeError("hi!: hi!", "hi!", 10, "hi!: hi!", 1);
//       fail("Expected exception of type com.google.javascript.rhino.EvaluatorException");
//     } catch (com.google.javascript.rhino.EvaluatorException e) {
//       // Expected exception.
//     }
// 
//   }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test389"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var1 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var2 = var1.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var4 = var1.createDirectedGraphNode((java.lang.Object)100);
    java.util.List var5 = var1.getGraphvizNodes();
    boolean var6 = var1.isDirected();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var11 = var10.getType();
    int var12 = var10.getSourcePosition();
    com.google.javascript.rhino.Node var13 = var10.getLastSibling();
    com.google.javascript.rhino.Node var14 = var10.removeFirstChild();
    java.lang.String var18 = var10.toString(false, true, false);
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var27 = var22.clonePropsFrom(var26);
    com.google.javascript.rhino.Node var29 = var26.getAncestor(0);
    boolean var30 = var26.isQualifiedName();
    com.google.javascript.rhino.JSDocInfo var31 = null;
    var26.setJSDocInfo(var31);
    var10.addChildToFront(var26);
    boolean var34 = var1.hasNode((java.lang.Object)var10);
    java.lang.Object var35 = null;
    com.google.javascript.jscomp.CompilerOptions var36 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var39 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var40 = var39.getNodes();
    java.util.List var41 = var39.getEdges();
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    var45.setType(10);
    com.google.javascript.rhino.Node var50 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", var41, var45, 1, 100);
    var36.setReplaceStringsConfiguration("hi!", var41);
    java.util.Map var52 = var36.getDefineReplacements();
    var36.disableRuntimeTypeCheck();
    com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler var54 = var36.getAliasTransformationHandler();
    var36.setAcceptConstKeyword(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var57 = com.google.javascript.rhino.ScriptRuntime.getMessage3("goog.exportSymbol", (java.lang.Object)var10, var35, (java.lang.Object)true);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "STRING "+ "'", var18.equals("STRING "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test390() {}
//   public void test390() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test390"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     var0.disableThreads();
//     com.google.javascript.jscomp.MessageFormatter var4 = null;
//     java.util.logging.Logger var5 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var6 = new com.google.javascript.jscomp.LoggerErrorManager(var4, var5);
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.rhino.Node var9 = null;
//     com.google.javascript.jscomp.CheckLevel var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var11, "hi!");
//     java.lang.String[] var15 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("", var9, var13, var15);
//     var6.report(var7, var16);
//     var0.setErrorManager((com.google.javascript.jscomp.ErrorManager)var6);
//     int var19 = var6.getErrorCount();
//     com.google.javascript.jscomp.CheckLevel var20 = null;
//     com.google.javascript.jscomp.JSSourceFile var23 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
//     com.google.javascript.jscomp.CompilerInput var24 = new com.google.javascript.jscomp.CompilerInput(var23);
//     com.google.javascript.jscomp.SourceFile.Generator var26 = null;
//     com.google.javascript.jscomp.JSSourceFile var27 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var26);
//     com.google.javascript.jscomp.CompilerInput var29 = new com.google.javascript.jscomp.CompilerInput(var27, true);
//     com.google.javascript.jscomp.MessageFormatter var30 = null;
//     java.util.logging.Logger var31 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var32 = new com.google.javascript.jscomp.LoggerErrorManager(var30, var31);
//     var29.setErrorManager((com.google.javascript.jscomp.ErrorManager)var32);
//     var24.setErrorManager((com.google.javascript.jscomp.ErrorManager)var32);
//     com.google.javascript.jscomp.CheckLevel var35 = null;
//     com.google.javascript.jscomp.CheckLevel var39 = null;
//     com.google.javascript.rhino.Node var41 = null;
//     com.google.javascript.jscomp.CheckLevel var43 = null;
//     com.google.javascript.jscomp.DiagnosticType var45 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var43, "hi!");
//     java.lang.String[] var47 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var48 = com.google.javascript.jscomp.JSError.make("", var41, var45, var47);
//     java.lang.String[] var50 = new java.lang.String[] { "goog.exportProperty"};
//     com.google.javascript.jscomp.JSError var51 = com.google.javascript.jscomp.JSError.make("eof", 1, 40, var39, var45, var50);
//     var32.report(var35, var51);
//     var6.println(var20, var51);
// 
//   }

  public void test391() {}
//   public void test391() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test391"); }
// 
// 
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.Context.reportError("LinkedGraph");
//       fail("Expected exception of type com.google.javascript.rhino.EvaluatorException");
//     } catch (com.google.javascript.rhino.EvaluatorException e) {
//       // Expected exception.
//     }
// 
//   }

  public void test392() {}
//   public void test392() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test392"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     var0.disableThreads();
//     com.google.javascript.jscomp.NodeTraversal.Callback var4 = null;
//     com.google.javascript.jscomp.NodeTraversal var5 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var0, var4);
//     com.google.javascript.jscomp.SourceFile.Generator var7 = null;
//     com.google.javascript.jscomp.JSSourceFile var8 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var7);
//     com.google.javascript.jscomp.CompilerInput var10 = new com.google.javascript.jscomp.CompilerInput(var8, true);
//     com.google.javascript.jscomp.MessageFormatter var11 = null;
//     java.util.logging.Logger var12 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var13 = new com.google.javascript.jscomp.LoggerErrorManager(var11, var12);
//     var10.setErrorManager((com.google.javascript.jscomp.ErrorManager)var13);
//     int var15 = var13.getWarningCount();
//     var0.setErrorManager((com.google.javascript.jscomp.ErrorManager)var13);
//     com.google.javascript.jscomp.Region var19 = var0.getSourceRegion("", 0);
//     com.google.javascript.jscomp.CompilerInput var21 = var0.newExternInput("string");
// 
//   }

  public void test393() {}
//   public void test393() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test393"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = com.google.javascript.rhino.Context.enter();
//     boolean var1 = var0.isGeneratingDebugChanged();
//     var0.setGeneratingSource(true);
//     int var4 = var0.getOptimizationLevel();
//     boolean var5 = var0.isGeneratingSource();
//     com.google.javascript.rhino.ErrorReporter var6 = var0.getErrorReporter();
//     java.beans.PropertyChangeListener var7 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var0.removePropertyChangeListener(var7);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == true);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var6);
// 
//   }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test394"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
    com.google.javascript.jscomp.SourceMap var2 = var0.getSourceMap();
    com.google.javascript.jscomp.JSSourceFile var5 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
    com.google.javascript.jscomp.SourceFile.Generator var7 = null;
    com.google.javascript.jscomp.JSSourceFile var8 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var7);
    com.google.javascript.jscomp.CompilerInput var10 = new com.google.javascript.jscomp.CompilerInput(var8, true);
    com.google.javascript.jscomp.CompilerOptions var11 = new com.google.javascript.jscomp.CompilerOptions();
    var11.setAcceptConstKeyword(true);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var14 = var11.getTweakProcessing();
    var11.setRewriteNewDateGoogNow(false);
    com.google.javascript.jscomp.Result var17 = var0.compile(var5, var8, var11);
    com.google.javascript.jscomp.ClosureCodingConvention var18 = new com.google.javascript.jscomp.ClosureCodingConvention();
    java.lang.String var19 = var18.getGlobalObject();
    java.lang.String var20 = var18.getExportPropertyFunction();
    com.google.javascript.rhino.jstype.JSTypeRegistry var21 = null;
    com.google.javascript.jscomp.Scope var22 = null;
    com.google.javascript.jscomp.CompilerOptions var23 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var26 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var27 = var26.getNodes();
    java.util.List var28 = var26.getEdges();
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    var32.setType(10);
    com.google.javascript.rhino.Node var37 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", var28, var32, 1, 100);
    var23.setReplaceStringsConfiguration("hi!", var28);
    var18.defineDelegateProxyPrototypeProperties(var21, var22, var28);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var40 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var41 = var40.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var43 = var40.createDirectedGraphNode((java.lang.Object)100);
    java.util.List var44 = var40.getGraphvizNodes();
    var40.clearNodeAnnotations();
    var40.pushNodeAnnotations();
    java.util.List var47 = var40.getGraphvizEdges();
    com.google.javascript.jscomp.CompilerOptions var48 = new com.google.javascript.jscomp.CompilerOptions();
    var48.setAcceptConstKeyword(true);
    com.google.javascript.jscomp.Compiler var51 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var52 = var51.getTopScope();
    com.google.javascript.jscomp.SourceMap var53 = var51.getSourceMap();
    com.google.javascript.jscomp.JSSourceFile var56 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
    com.google.javascript.jscomp.SourceFile.Generator var58 = null;
    com.google.javascript.jscomp.JSSourceFile var59 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var58);
    com.google.javascript.jscomp.CompilerInput var61 = new com.google.javascript.jscomp.CompilerInput(var59, true);
    com.google.javascript.jscomp.CompilerOptions var62 = new com.google.javascript.jscomp.CompilerOptions();
    var62.setAcceptConstKeyword(true);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var65 = var62.getTweakProcessing();
    var62.setRewriteNewDateGoogNow(false);
    com.google.javascript.jscomp.Result var68 = var51.compile(var56, var59, var62);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var69 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var70 = var69.newSubGraph();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var71 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var72 = var71.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var74 = var71.createDirectedGraphNode((java.lang.Object)100);
    java.util.List var75 = var69.getDirectedPredNodes(var74);
    com.google.javascript.jscomp.JSModuleGraph var76 = new com.google.javascript.jscomp.JSModuleGraph(var75);
    com.google.javascript.jscomp.NodeTraversal.Callback var77 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var51, var75, var77);
    var48.setManageClosureDependencies(var75);
    var48.setNameAnonymousFunctionsOnly(false);
    com.google.javascript.jscomp.DefaultPassConfig var82 = new com.google.javascript.jscomp.DefaultPassConfig(var48);
    com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler var83 = var48.getAliasTransformationHandler();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.Result var84 = var0.compile(var28, var47, var48);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "goog.global"+ "'", var19.equals("goog.global"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "goog.exportProperty"+ "'", var20.equals("goog.exportProperty"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
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
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);

  }

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test395"); }


    boolean var1 = com.google.javascript.rhino.Context.isValidLanguageVersion(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test396() {}
//   public void test396() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test396"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     var0.disableThreads();
//     com.google.javascript.jscomp.MessageFormatter var4 = null;
//     java.util.logging.Logger var5 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var6 = new com.google.javascript.jscomp.LoggerErrorManager(var4, var5);
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.rhino.Node var9 = null;
//     com.google.javascript.jscomp.CheckLevel var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var11, "hi!");
//     java.lang.String[] var15 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("", var9, var13, var15);
//     var6.report(var7, var16);
//     var0.setErrorManager((com.google.javascript.jscomp.ErrorManager)var6);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var20 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.Collection var21 = var20.getNodes();
//     java.util.List var22 = var20.getEdges();
//     com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     var26.setType(10);
//     com.google.javascript.rhino.Node var31 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", var22, var26, 1, 100);
//     com.google.javascript.jscomp.ComposeWarningsGuard var32 = new com.google.javascript.jscomp.ComposeWarningsGuard(var22);
//     com.google.javascript.jscomp.NodeTraversal.Callback var33 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var0, var22, var33);
//     com.google.javascript.jscomp.SourceFile.Generator var36 = null;
//     com.google.javascript.jscomp.JSSourceFile var37 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var36);
//     com.google.javascript.jscomp.CompilerInput var39 = new com.google.javascript.jscomp.CompilerInput(var37, true);
//     java.lang.String var40 = var37.toString();
//     com.google.javascript.jscomp.SourceFile.Generator var42 = null;
//     com.google.javascript.jscomp.JSSourceFile var43 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var42);
//     com.google.javascript.jscomp.CompilerInput var45 = new com.google.javascript.jscomp.CompilerInput(var43, true);
//     java.lang.String var46 = var43.toString();
//     com.google.javascript.jscomp.CompilerOptions var47 = new com.google.javascript.jscomp.CompilerOptions();
//     var47.setAcceptConstKeyword(true);
//     com.google.javascript.jscomp.CompilerOptions.TweakProcessing var50 = var47.getTweakProcessing();
//     var47.setRewriteNewDateGoogNow(false);
//     com.google.javascript.jscomp.CompilerOptions var53 = new com.google.javascript.jscomp.CompilerOptions();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var56 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.Collection var57 = var56.getNodes();
//     java.util.List var58 = var56.getEdges();
//     com.google.javascript.rhino.Node var62 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     var62.setType(10);
//     com.google.javascript.rhino.Node var67 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", var58, var62, 1, 100);
//     var53.setReplaceStringsConfiguration("hi!", var58);
//     var47.setManageClosureDependencies(var58);
//     java.lang.RuntimeException var70 = com.google.javascript.rhino.ScriptRuntime.notFunctionError((java.lang.Object)var47);
//     com.google.javascript.jscomp.Result var71 = var0.compile(var37, var43, var47);
// 
//   }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test397"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
    com.google.javascript.jscomp.CompilerOptions var2 = new com.google.javascript.jscomp.CompilerOptions();
    var2.setAcceptConstKeyword(true);
    var2.setTweakToStringLiteral("goog.exportProperty", "goog.exportSymbol");
    var2.setShadowVariables(true);
    var2.setColorizeErrorOutput(true);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var12 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var13 = var12.newSubGraph();
    var12.pushNodeAnnotations();
    java.util.List var15 = var12.getGraphvizEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var16 = new com.google.javascript.jscomp.ComposeWarningsGuard(var15);
    var2.setManageClosureDependencies(var15);
    com.google.javascript.jscomp.DefaultPassConfig var18 = new com.google.javascript.jscomp.DefaultPassConfig(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setPassConfig((com.google.javascript.jscomp.PassConfig)var18);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test398"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.EcmaError var2 = com.google.javascript.rhino.ScriptRuntime.typeError1("com.google.javascript.rhino.EcmaError: TypeError: hi! is not a function, it is com.google.javascript.jscomp.graph.LinkedDirectedGraph.", "com.google.javascript.rhino.EcmaError: : hi!");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test399() {}
//   public void test399() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test399"); }
// 
// 
//     com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var9 = var4.clonePropsFrom(var8);
//     com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var14 = var13.getType();
//     int var15 = var13.getChildCount();
//     com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var25 = var20.clonePropsFrom(var24);
//     com.google.javascript.rhino.jstype.JSType var26 = null;
//     var25.setJSType(var26);
//     com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var36 = var31.clonePropsFrom(var35);
//     com.google.javascript.rhino.jstype.JSType var37 = null;
//     var36.setJSType(var37);
//     java.util.Collection var39 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(var36);
//     com.google.javascript.rhino.Node.AncestorIterable var40 = var36.getAncestors();
//     boolean var41 = var36.isOnlyModifiesThisCall();
//     com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var50 = var45.clonePropsFrom(var49);
//     com.google.javascript.rhino.jstype.JSType var51 = null;
//     var49.setJSType(var51);
//     var49.setOptionalArg(true);
//     int var55 = var49.getLineno();
//     boolean var56 = var49.isLocalResultCall();
//     boolean var57 = var49.isQuotedString();
//     com.google.javascript.rhino.Node var58 = new com.google.javascript.rhino.Node(0, var25, var36, var49);
//     com.google.javascript.rhino.Node var59 = var25.cloneNode();
//     java.util.Set var60 = var59.getDirectives();
//     com.google.javascript.rhino.Node var61 = null;
//     com.google.javascript.rhino.Node var62 = new com.google.javascript.rhino.Node(0, var8, var13, var59, var61);
// 
//   }

  public void test400() {}
//   public void test400() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test400"); }
// 
// 
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.EvaluatorException var5 = com.google.javascript.rhino.Context.reportRuntimeError("goog.exportProperty", "hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line 40 : 0", 40, "hi!", 0);
//       fail("Expected exception of type com.google.javascript.rhino.EvaluatorException");
//     } catch (com.google.javascript.rhino.EvaluatorException e) {
//       // Expected exception.
//     }
// 
//   }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test401"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var4 = var3.getType();
    com.google.javascript.rhino.Node var5 = var3.cloneTree();
    var3.addSuppression("");
    int var8 = var3.getType();
    com.google.javascript.rhino.Node var9 = com.google.javascript.jscomp.NodeUtil.newExpr(var3);
    var9.setLineno((-1));
    com.google.javascript.rhino.EcmaError var19 = com.google.javascript.rhino.ScriptRuntime.constructError("", "hi!", "hi!", (-1), "hi!", 1);
    java.lang.String var20 = var19.details();
    int var21 = var19.lineNumber();
    var9.putProp(100, (java.lang.Object)var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var19.initColumnNumber((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ": hi!"+ "'", var20.equals(": hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);

  }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test402"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Context.reportWarning("string");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test403() {}
//   public void test403() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test403"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = com.google.javascript.rhino.Context.enter();
//     boolean var1 = var0.isGeneratingDebugChanged();
//     var0.setGeneratingSource(true);
//     int var4 = var0.getOptimizationLevel();
//     boolean var5 = var0.isGeneratingSource();
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var14 = var9.clonePropsFrom(var13);
//     com.google.javascript.rhino.jstype.JSType var15 = null;
//     var14.setJSType(var15);
//     com.google.javascript.jscomp.Compiler var17 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var18 = var17.getTopScope();
//     var17.disableThreads();
//     var17.disableThreads();
//     com.google.javascript.jscomp.MessageFormatter var21 = null;
//     java.util.logging.Logger var22 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var23 = new com.google.javascript.jscomp.LoggerErrorManager(var21, var22);
//     com.google.javascript.jscomp.CheckLevel var24 = null;
//     com.google.javascript.rhino.Node var26 = null;
//     com.google.javascript.jscomp.CheckLevel var28 = null;
//     com.google.javascript.jscomp.DiagnosticType var30 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var28, "hi!");
//     java.lang.String[] var32 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var33 = com.google.javascript.jscomp.JSError.make("", var26, var30, var32);
//     var23.report(var24, var33);
//     var17.setErrorManager((com.google.javascript.jscomp.ErrorManager)var23);
//     int var36 = var23.getErrorCount();
//     var23.setTypedPercent(0.0d);
//     var0.putThreadLocal((java.lang.Object)var15, (java.lang.Object)var23);
// 
//   }

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test404"); }


    com.google.javascript.rhino.EvaluatorException var3 = new com.google.javascript.rhino.EvaluatorException(": hi!", "goog.exportProperty", 40);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.initLineNumber(0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test405"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var1 = var0.newSubGraph();
    java.util.Collection var2 = var0.getNodes();
    java.lang.Object var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = var0.getNodeDegree(var3);
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

  public void test406() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test406"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Context.reportWarning("goog.global", "ERROR\n    STRING \n", (-1), "bitxor", 1);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test407() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test407"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
    var0.disableThreads();
    var0.disableThreads();
    com.google.javascript.jscomp.CompilerOptions var4 = new com.google.javascript.jscomp.CompilerOptions();
    var4.setAcceptConstKeyword(true);
    java.util.Map var7 = var4.getTweakReplacements();
    var4.setDefineToNumberLiteral("eof", 1);
    com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler var11 = null;
    var4.setAliasTransformationHandler(var11);
    var0.initOptions(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var14 = var0.toSourceArray();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test408() {}
//   public void test408() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test408"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     com.google.javascript.jscomp.SourceMap var2 = var0.getSourceMap();
//     var0.reportCodeChange();
//     com.google.javascript.jscomp.MessageFormatter var4 = null;
//     java.util.logging.Logger var5 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var6 = new com.google.javascript.jscomp.LoggerErrorManager(var4, var5);
//     var0.setErrorManager((com.google.javascript.jscomp.ErrorManager)var6);
//     var0.parse();
// 
//   }

  public void test409() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test409"); }


    com.google.javascript.jscomp.SourceAst var0 = null;
    com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "hi!", false);
    com.google.javascript.jscomp.JSModule var4 = null;
    var3.setModule(var4);
    com.google.javascript.jscomp.Compiler var6 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var7 = var6.getTopScope();
    var6.disableThreads();
    var6.disableThreads();
    var3.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var11 = var6.toSourceArray();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test410() {}
//   public void test410() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test410"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     com.google.javascript.jscomp.SourceMap var2 = var0.getSourceMap();
//     var0.reportCodeChange();
//     com.google.javascript.jscomp.Compiler var4 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var5 = var4.getTopScope();
//     com.google.javascript.jscomp.SourceMap var6 = var4.getSourceMap();
//     com.google.javascript.jscomp.JSSourceFile var9 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
//     com.google.javascript.jscomp.SourceFile.Generator var11 = null;
//     com.google.javascript.jscomp.JSSourceFile var12 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var11);
//     com.google.javascript.jscomp.CompilerInput var14 = new com.google.javascript.jscomp.CompilerInput(var12, true);
//     com.google.javascript.jscomp.CompilerOptions var15 = new com.google.javascript.jscomp.CompilerOptions();
//     var15.setAcceptConstKeyword(true);
//     com.google.javascript.jscomp.CompilerOptions.TweakProcessing var18 = var15.getTweakProcessing();
//     var15.setRewriteNewDateGoogNow(false);
//     com.google.javascript.jscomp.Result var21 = var4.compile(var9, var12, var15);
//     com.google.javascript.rhino.Node var22 = var0.parse(var9);
//     com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var23 = null;
//     com.google.javascript.jscomp.LightweightMessageFormatter var24 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var0, var23);
//     com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var25 = null;
//     com.google.javascript.jscomp.LightweightMessageFormatter var26 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var0, var25);
//     com.google.javascript.jscomp.JSSourceFile var27 = null;
//     com.google.javascript.rhino.Node var28 = var0.parse(var27);
// 
//   }

  public void test411() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test411"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    java.lang.Object var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = var0.getWeight(var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test412"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var5 = var4.getType();
    java.lang.String var6 = var4.getQualifiedName();
    com.google.javascript.rhino.Node var7 = new com.google.javascript.rhino.Node(100, var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.setSideEffectFlags(100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test413() {}
//   public void test413() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test413"); }
// 
// 
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.EvaluatorException var5 = com.google.javascript.rhino.Context.reportRuntimeError("@IMPLEMENTATION.VERSION@", ": hi!", 10, "", 0);
//       fail("Expected exception of type com.google.javascript.rhino.EvaluatorException");
//     } catch (com.google.javascript.rhino.EvaluatorException e) {
//       // Expected exception.
//     }
// 
//   }

  public void test414() {}
//   public void test414() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test414"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var1);
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var2, true);
//     com.google.javascript.jscomp.Compiler var5 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var6 = var5.getTopScope();
//     com.google.javascript.jscomp.Scope var7 = var5.getTopScope();
//     var4.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var5);
//     java.util.Collection var9 = var4.getProvides();
// 
//   }

  public void test415() {}
//   public void test415() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test415"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     var0.disableThreads();
//     com.google.javascript.jscomp.MessageFormatter var4 = null;
//     java.util.logging.Logger var5 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var6 = new com.google.javascript.jscomp.LoggerErrorManager(var4, var5);
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.rhino.Node var9 = null;
//     com.google.javascript.jscomp.CheckLevel var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var11, "hi!");
//     java.lang.String[] var15 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("", var9, var13, var15);
//     var6.report(var7, var16);
//     var0.setErrorManager((com.google.javascript.jscomp.ErrorManager)var6);
//     java.lang.String[] var19 = var0.toSourceArray();
// 
//   }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test416"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var1 = com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.valueOf("ERROR\n    STRING \n");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test417() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test417"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var9 = var4.clonePropsFrom(var8);
    com.google.javascript.rhino.jstype.JSType var10 = null;
    var9.setJSType(var10);
    java.util.Collection var12 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(var9);
    com.google.javascript.rhino.Node[] var13 = new com.google.javascript.rhino.Node[] { var9};
    com.google.javascript.rhino.Node var14 = new com.google.javascript.rhino.Node(10, var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var15 = var14.detachFromParent();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test418() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test418"); }


    com.google.javascript.rhino.Context var0 = com.google.javascript.rhino.Context.enter();
    boolean var1 = var0.isGeneratingDebugChanged();
    var0.setLanguageVersion(0);
    var0.setGeneratingSource(false);
    java.util.Locale var6 = var0.getLocale();
    java.beans.PropertyChangeListener var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addPropertyChangeListener(var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test419"); }


    com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromCode("eof", "bitxor", "com.google.javascript.rhino.EcmaError: TypeError: hi! is not a function, it is com.google.javascript.jscomp.graph.LinkedDirectedGraph.");
    java.lang.String var5 = var3.getLine((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test420() {}
//   public void test420() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test420"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var3 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.Collection var4 = var3.getNodes();
//     java.util.List var5 = var3.getEdges();
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     var9.setType(10);
//     com.google.javascript.rhino.Node var14 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", var5, var9, 1, 100);
//     com.google.javascript.jscomp.NodeTraversal.Callback var15 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var5, var15);
//     com.google.javascript.rhino.Context var17 = com.google.javascript.rhino.Context.enter();
//     boolean var18 = var17.isGeneratingDebugChanged();
//     var17.setGeneratingSource(true);
//     int var21 = var17.getOptimizationLevel();
//     boolean var22 = var17.isGeneratingSource();
//     com.google.javascript.jscomp.MessageFormatter var24 = null;
//     java.util.logging.Logger var25 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var26 = new com.google.javascript.jscomp.LoggerErrorManager(var24, var25);
//     int var27 = var26.getWarningCount();
//     var17.putThreadLocal((java.lang.Object)(-1.0f), (java.lang.Object)var26);
//     var1.setErrorManager((com.google.javascript.jscomp.ErrorManager)var26);
//     com.google.javascript.rhino.Context var30 = com.google.javascript.rhino.Context.enter();
//     boolean var31 = var30.isGeneratingDebugChanged();
//     var30.setGeneratingSource(true);
//     int var34 = var30.getOptimizationLevel();
//     boolean var35 = var30.isGeneratingSource();
//     com.google.javascript.jscomp.MessageFormatter var37 = null;
//     java.util.logging.Logger var38 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var39 = new com.google.javascript.jscomp.LoggerErrorManager(var37, var38);
//     int var40 = var39.getWarningCount();
//     var30.putThreadLocal((java.lang.Object)(-1.0f), (java.lang.Object)var39);
//     com.google.javascript.jscomp.Compiler var42 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var39);
//     com.google.javascript.jscomp.Compiler.IntermediateState var43 = var42.getState();
//     var1.setState(var43);
//     java.lang.String[] var45 = var1.toSourceArray();
// 
//   }

  public void test421() {}
//   public void test421() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test421"); }
// 
// 
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var8 = var3.clonePropsFrom(var7);
//     var8.putProp((-1), (java.lang.Object)10.0d);
//     com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var20 = var15.clonePropsFrom(var19);
//     com.google.javascript.rhino.Node var21 = var8.copyInformationFrom(var20);
//     com.google.javascript.rhino.Node var22 = var21.getFirstChild();
//     com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var27 = var26.getType();
//     int var28 = var26.getSourcePosition();
//     boolean var29 = var26.isVarArgs();
//     boolean var30 = var26.hasOneChild();
//     com.google.javascript.rhino.Node var31 = var21.getChildBefore(var26);
// 
//   }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test422"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    var3.setType(10);
    boolean var6 = var3.isLocalResultCall();
    boolean var7 = var3.isUnscopedQualifiedName();
    var3.setWasEmptyNode(false);
    var3.setCharno(40);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var17 = var16.getType();
    com.google.javascript.rhino.Node var18 = var16.cloneTree();
    var16.addSuppression("");
    int var21 = var16.getType();
    com.google.javascript.rhino.Node var22 = com.google.javascript.jscomp.NodeUtil.newExpr(var16);
    var22.setLineno((-1));
    com.google.javascript.rhino.Node var26 = var22.getAncestor(0);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var31 = var30.getType();
    int var32 = var30.getSourcePosition();
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var37 = var36.getType();
    com.google.javascript.rhino.Node var38 = var36.cloneTree();
    var36.addSuppression("");
    int var41 = var36.getType();
    com.google.javascript.rhino.Node var42 = com.google.javascript.jscomp.NodeUtil.newExpr(var36);
    var42.setLineno((-1));
    com.google.javascript.rhino.Node var46 = var42.getAncestor(0);
    com.google.javascript.rhino.Node var50 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var51 = var50.getType();
    com.google.javascript.rhino.Node var52 = var50.cloneTree();
    var50.addSuppression("");
    int var55 = var50.getType();
    var50.setCharno(1);
    com.google.javascript.rhino.Node var58 = new com.google.javascript.rhino.Node(40, var22, var30, var46, var50);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.addChildrenToFront(var50);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 40);

  }

  public void test423() {}
//   public void test423() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test423"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.SubGraph var1 = var0.newSubGraph();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var2 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.SubGraph var3 = var2.newSubGraph();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var5 = var2.createDirectedGraphNode((java.lang.Object)100);
//     java.util.List var6 = var0.getDirectedPredNodes(var5);
//     com.google.javascript.rhino.Context var7 = null;
//     com.google.javascript.rhino.Context var8 = com.google.javascript.rhino.Context.enter(var7);
//     var8.setCompileFunctionsWithDynamicScope(false);
//     com.google.javascript.jscomp.MessageFormatter var11 = null;
//     java.util.logging.Logger var12 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var13 = new com.google.javascript.jscomp.LoggerErrorManager(var11, var12);
//     com.google.javascript.jscomp.CheckLevel var14 = null;
//     com.google.javascript.rhino.Node var16 = null;
//     com.google.javascript.jscomp.CheckLevel var18 = null;
//     com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var18, "hi!");
//     java.lang.String[] var22 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var23 = com.google.javascript.jscomp.JSError.make("", var16, var20, var22);
//     var13.report(var14, var23);
//     var8.removeThreadLocal((java.lang.Object)var23);
//     com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var34 = var29.clonePropsFrom(var33);
//     com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var39 = var38.getType();
//     int var40 = var38.getSourcePosition();
//     com.google.javascript.rhino.Node var41 = var38.getLastSibling();
//     com.google.javascript.rhino.Node var42 = var38.removeFirstChild();
//     java.lang.String var43 = var38.getQualifiedName();
//     com.google.javascript.rhino.Node var44 = var33.copyInformationFromForTree(var38);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       boolean var45 = var0.isConnectedInDirection((java.lang.Object)var8, (java.lang.Object)var33);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var2);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var8);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var20);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var22);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var23);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var29);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var33);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var34);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var38);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var39 == 40);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var40 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var41);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var42);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var43);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var44);
// 
//   }

  public void test424() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test424"); }


    com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
    com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var2);
    java.lang.String var4 = var2.getOriginalPath();
    var2.setOriginalPath("goog.exportSymbol");
    java.lang.String var7 = var2.getOriginalPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "goog.exportSymbol"+ "'", var7.equals("goog.exportSymbol"));

  }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test425"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Context.reportWarning("com.google.javascript.rhino.EcmaError: TypeError: hi! is not a function, it is com.google.javascript.jscomp.graph.LinkedDirectedGraph.");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test426() {}
//   public void test426() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test426"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var1);
//     com.google.javascript.jscomp.JsAst var3 = new com.google.javascript.jscomp.JsAst(var2);
//     com.google.javascript.jscomp.SourceFile.Generator var5 = null;
//     com.google.javascript.jscomp.SourceFile var6 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var5);
//     var3.setSourceFile(var6);
//     java.lang.String var8 = com.google.javascript.rhino.ScriptRuntime.toString((java.lang.Object)var3);
//     var3.clearAst();
//     com.google.javascript.jscomp.SourceFile var10 = null;
//     var3.setSourceFile(var10);
// 
//   }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test427"); }


    com.google.javascript.rhino.Context var0 = null;
    com.google.javascript.rhino.Context var1 = com.google.javascript.rhino.Context.enter(var0);
    var1.setCompileFunctionsWithDynamicScope(false);
    com.google.javascript.jscomp.SourceFile.Generator var5 = null;
    com.google.javascript.jscomp.SourceFile var6 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var5);
    com.google.javascript.jscomp.JsAst var7 = new com.google.javascript.jscomp.JsAst(var6);
    var1.seal((java.lang.Object)var7);
    java.nio.charset.Charset var10 = null;
    com.google.javascript.jscomp.JSSourceFile var11 = com.google.javascript.jscomp.JSSourceFile.fromFile("goog.exportProperty", var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.setSourceFile((com.google.javascript.jscomp.SourceFile)var11);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test428() {}
//   public void test428() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test428"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = null;
//     com.google.javascript.rhino.Context var1 = com.google.javascript.rhino.Context.enter(var0);
//     var1.setCompileFunctionsWithDynamicScope(false);
//     com.google.javascript.jscomp.MessageFormatter var4 = null;
//     java.util.logging.Logger var5 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var6 = new com.google.javascript.jscomp.LoggerErrorManager(var4, var5);
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.rhino.Node var9 = null;
//     com.google.javascript.jscomp.CheckLevel var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var11, "hi!");
//     java.lang.String[] var15 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("", var9, var13, var15);
//     var6.report(var7, var16);
//     var1.removeThreadLocal((java.lang.Object)var16);
//     com.google.javascript.rhino.Context var19 = com.google.javascript.rhino.Context.enter();
//     boolean var20 = var19.isGeneratingDebugChanged();
//     var19.setLanguageVersion(0);
//     var19.setGeneratingSource(false);
//     java.util.Locale var25 = var19.getLocale();
//     java.util.Locale var26 = var1.setLocale(var25);
//     com.google.javascript.rhino.Context var27 = null;
//     com.google.javascript.rhino.Context var28 = com.google.javascript.rhino.Context.enter(var27);
//     var28.setCompileFunctionsWithDynamicScope(false);
//     com.google.javascript.jscomp.MessageFormatter var31 = null;
//     java.util.logging.Logger var32 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var33 = new com.google.javascript.jscomp.LoggerErrorManager(var31, var32);
//     com.google.javascript.jscomp.CheckLevel var34 = null;
//     com.google.javascript.rhino.Node var36 = null;
//     com.google.javascript.jscomp.CheckLevel var38 = null;
//     com.google.javascript.jscomp.DiagnosticType var40 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var38, "hi!");
//     java.lang.String[] var42 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var43 = com.google.javascript.jscomp.JSError.make("", var36, var40, var42);
//     var33.report(var34, var43);
//     var28.removeThreadLocal((java.lang.Object)var43);
//     com.google.javascript.rhino.Context var46 = com.google.javascript.rhino.Context.enter();
//     boolean var47 = var46.isGeneratingDebugChanged();
//     var46.setLanguageVersion(0);
//     var46.setGeneratingSource(false);
//     java.util.Locale var52 = var46.getLocale();
//     java.util.Locale var53 = var28.setLocale(var52);
//     java.util.Locale var54 = var1.setLocale(var52);
//     boolean var55 = var1.hasCompileFunctionsWithDynamicScope();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var19);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var20 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var25);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var26);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var28);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var40);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var42);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var43);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var46);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var47 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var52);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var53);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var54);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var55 == false);
// 
//   }

  public void test429() {}
//   public void test429() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test429"); }
// 
// 
//     com.google.javascript.rhino.Node var2 = null;
//     com.google.javascript.jscomp.CheckLevel var4 = null;
//     com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var4, "hi!");
//     java.lang.String[] var8 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var9 = com.google.javascript.jscomp.JSError.make("", var2, var6, var8);
//     java.lang.RuntimeException var11 = com.google.javascript.rhino.ScriptRuntime.undefWriteError((java.lang.Object)(short)0, (java.lang.Object)var6, (java.lang.Object)40);
//     com.google.javascript.jscomp.DiagnosticType[] var12 = new com.google.javascript.jscomp.DiagnosticType[] { var6};
//     com.google.javascript.jscomp.DiagnosticGroup var13 = new com.google.javascript.jscomp.DiagnosticGroup(var12);
//     com.google.javascript.jscomp.DiagnosticGroup[] var14 = new com.google.javascript.jscomp.DiagnosticGroup[] { var13};
//     com.google.javascript.jscomp.DiagnosticGroup var15 = new com.google.javascript.jscomp.DiagnosticGroup(var14);
//     com.google.javascript.jscomp.DiagnosticGroup var16 = new com.google.javascript.jscomp.DiagnosticGroup(var14);
//     com.google.javascript.jscomp.CheckLevel var17 = null;
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var18 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var16, var17);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var19 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.SubGraph var20 = var19.newSubGraph();
//     var19.pushNodeAnnotations();
//     java.util.List var22 = var19.getGraphvizEdges();
//     com.google.javascript.jscomp.ComposeWarningsGuard var23 = new com.google.javascript.jscomp.ComposeWarningsGuard(var22);
//     java.lang.String var24 = var23.toString();
//     com.google.javascript.jscomp.WarningsGuard[] var25 = new com.google.javascript.jscomp.WarningsGuard[] { var23};
//     com.google.javascript.jscomp.ComposeWarningsGuard var26 = new com.google.javascript.jscomp.ComposeWarningsGuard(var25);
//     com.google.javascript.rhino.Node var29 = null;
//     com.google.javascript.jscomp.CheckLevel var31 = null;
//     com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var31, "hi!");
//     java.lang.String[] var35 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var36 = com.google.javascript.jscomp.JSError.make("", var29, var33, var35);
//     java.lang.RuntimeException var38 = com.google.javascript.rhino.ScriptRuntime.undefWriteError((java.lang.Object)(short)0, (java.lang.Object)var33, (java.lang.Object)40);
//     com.google.javascript.jscomp.DiagnosticType[] var39 = new com.google.javascript.jscomp.DiagnosticType[] { var33};
//     com.google.javascript.jscomp.DiagnosticGroup var40 = new com.google.javascript.jscomp.DiagnosticGroup(var39);
//     boolean var41 = var26.enables(var40);
//     boolean var42 = var18.enables(var40);
// 
//   }

  public void test430() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test430"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    var0.clearNodeAnnotations();
    java.util.List var2 = var0.getGraphvizEdges();
    com.google.javascript.rhino.Node var7 = null;
    com.google.javascript.jscomp.CheckLevel var9 = null;
    com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var9, "hi!");
    java.lang.String[] var13 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
    com.google.javascript.jscomp.JSError var14 = com.google.javascript.jscomp.JSError.make("", var7, var11, var13);
    java.lang.String[] var15 = null;
    com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make(": hi!", 100, 0, var11, var15);
    com.google.javascript.jscomp.SourceFile var19 = com.google.javascript.jscomp.SourceFile.fromCode("goog.exportProperty", "goog.exportProperty");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var20 = var0.isConnectedInDirection((java.lang.Object)100, (java.lang.Object)"goog.exportProperty");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test431() {}
//   public void test431() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test431"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     var0.disableThreads();
//     com.google.javascript.jscomp.NodeTraversal.Callback var4 = null;
//     com.google.javascript.jscomp.NodeTraversal var5 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var0, var4);
//     com.google.javascript.jscomp.SourceFile.Generator var7 = null;
//     com.google.javascript.jscomp.JSSourceFile var8 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var7);
//     com.google.javascript.jscomp.CompilerInput var10 = new com.google.javascript.jscomp.CompilerInput(var8, true);
//     com.google.javascript.jscomp.MessageFormatter var11 = null;
//     java.util.logging.Logger var12 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var13 = new com.google.javascript.jscomp.LoggerErrorManager(var11, var12);
//     var10.setErrorManager((com.google.javascript.jscomp.ErrorManager)var13);
//     int var15 = var13.getWarningCount();
//     var0.setErrorManager((com.google.javascript.jscomp.ErrorManager)var13);
//     com.google.javascript.jscomp.Region var19 = var0.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Compiler var20 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var21 = var20.getTopScope();
//     com.google.javascript.jscomp.SourceMap var22 = var20.getSourceMap();
//     var20.reportCodeChange();
//     com.google.javascript.jscomp.MessageFormatter var24 = null;
//     java.util.logging.Logger var25 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var26 = new com.google.javascript.jscomp.LoggerErrorManager(var24, var25);
//     var20.setErrorManager((com.google.javascript.jscomp.ErrorManager)var26);
//     var0.setErrorManager((com.google.javascript.jscomp.ErrorManager)var26);
//     com.google.javascript.jscomp.CompilerInput var30 = var0.getInput("com.google.javascript.rhino.EcmaError: TypeError: hi! is not a function, it is com.google.javascript.jscomp.graph.LinkedDirectedGraph.");
// 
//   }

  public void test432() {}
//   public void test432() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test432"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var3 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.Collection var4 = var3.getNodes();
//     java.util.List var5 = var3.getEdges();
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     var9.setType(10);
//     com.google.javascript.rhino.Node var14 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", var5, var9, 1, 100);
//     com.google.javascript.jscomp.NodeTraversal.Callback var15 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var5, var15);
//     com.google.javascript.rhino.Context var17 = com.google.javascript.rhino.Context.enter();
//     boolean var18 = var17.isGeneratingDebugChanged();
//     var17.setGeneratingSource(true);
//     int var21 = var17.getOptimizationLevel();
//     boolean var22 = var17.isGeneratingSource();
//     com.google.javascript.jscomp.MessageFormatter var24 = null;
//     java.util.logging.Logger var25 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var26 = new com.google.javascript.jscomp.LoggerErrorManager(var24, var25);
//     int var27 = var26.getWarningCount();
//     var17.putThreadLocal((java.lang.Object)(-1.0f), (java.lang.Object)var26);
//     var1.setErrorManager((com.google.javascript.jscomp.ErrorManager)var26);
//     com.google.javascript.jscomp.JSError var30 = null;
//     com.google.javascript.jscomp.CheckLevel var31 = var1.getErrorLevel(var30);
// 
//   }

  public void test433() {}
//   public void test433() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test433"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = null;
//     com.google.javascript.rhino.Context var1 = com.google.javascript.rhino.Context.enter(var0);
//     java.beans.PropertyChangeListener var2 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var1.addPropertyChangeListener(var2);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var1);
// 
//   }

  public void test434() {}
//   public void test434() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test434"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     boolean var2 = var0.isPrivate("");
//     java.lang.String var3 = var0.getExportPropertyFunction();
//     boolean var5 = var0.isPrivate("com.google.javascript.rhino.EcmaError: : hi!");
//     java.lang.String var6 = var0.getAbstractMethodName();
//     java.lang.String var7 = var0.getGlobalObject();
//     com.google.javascript.rhino.Node var8 = null;
//     java.lang.String var9 = var0.getSingletonGetterClassName(var8);
// 
//   }

  public void test435() {}
//   public void test435() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test435"); }
// 
// 
//     java.io.Reader var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromReader("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", var1);
// 
//   }

  public void test436() {}
//   public void test436() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test436"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = com.google.javascript.rhino.Context.enter();
//     boolean var1 = var0.isGeneratingDebugChanged();
//     var0.setGeneratingSource(true);
//     boolean var4 = var0.isGeneratingSource();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.Context var5 = com.google.javascript.rhino.Context.enter(var0);
//       fail("Expected exception of type java.lang.RuntimeException");
//     } catch (java.lang.RuntimeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == true);
// 
//   }

  public void test437() {}
//   public void test437() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test437"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "hi!", false);
//     com.google.javascript.jscomp.JSModule var4 = null;
//     var3.setModule(var4);
//     com.google.javascript.jscomp.Compiler var6 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var7 = var6.getTopScope();
//     var6.disableThreads();
//     var6.disableThreads();
//     var3.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var6);
//     boolean var11 = var6.acceptConstKeyword();
//     com.google.javascript.jscomp.CompilerInput var13 = var6.getInput("OFF");
// 
//   }

  public void test438() {}
//   public void test438() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test438"); }
// 
// 
//     java.io.InputStream var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromInputStream("()", var1);
// 
//   }

  public void test439() {}
//   public void test439() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test439"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = com.google.javascript.rhino.Context.enter();
//     boolean var1 = var0.isGeneratingDebugChanged();
//     var0.setGeneratingSource(true);
//     int var4 = var0.getOptimizationLevel();
//     boolean var5 = var0.isGeneratingSource();
//     com.google.javascript.jscomp.MessageFormatter var7 = null;
//     java.util.logging.Logger var8 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var9 = new com.google.javascript.jscomp.LoggerErrorManager(var7, var8);
//     int var10 = var9.getWarningCount();
//     var0.putThreadLocal((java.lang.Object)(-1.0f), (java.lang.Object)var9);
//     com.google.javascript.jscomp.Compiler var12 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var9);
//     com.google.javascript.jscomp.Compiler.IntermediateState var13 = var12.getState();
//     com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newString("goog.exportSymbol");
//     com.google.javascript.rhino.Node var17 = var16.getFirstChild();
//     var16.setType(0);
//     com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var24 = var23.getType();
//     com.google.javascript.rhino.Node var25 = var23.cloneTree();
//     var23.addSuppression("");
//     int var28 = var23.getType();
//     com.google.javascript.rhino.Node var29 = com.google.javascript.jscomp.NodeUtil.newExpr(var23);
//     int var30 = var29.getChildCount();
//     com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var35 = var34.getType();
//     java.lang.String var36 = var34.getQualifiedName();
//     com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var45 = var40.clonePropsFrom(var44);
//     com.google.javascript.rhino.Node var46 = var34.clonePropsFrom(var44);
//     boolean var47 = var29.isEquivalentTo(var44);
//     com.google.javascript.rhino.Node var48 = new com.google.javascript.rhino.Node(0, var16, var44);
//     com.google.javascript.jscomp.NodeTraversal.Callback var49 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.jscomp.NodeTraversal.traverse((com.google.javascript.jscomp.AbstractCompiler)var12, var44, var49);
//       fail("Expected exception of type java.lang.RuntimeException");
//     } catch (java.lang.RuntimeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == true);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var17);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var23);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var24 == 40);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var25);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var28 == 40);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var29);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var30 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var34);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var35 == 40);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var36);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var40);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var44);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var45);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var46);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var47 == false);
// 
//   }

  public void test440() {}
//   public void test440() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test440"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     com.google.javascript.jscomp.SourceMap var2 = var0.getSourceMap();
//     var0.reportCodeChange();
//     com.google.javascript.jscomp.Compiler var4 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var5 = var4.getTopScope();
//     com.google.javascript.jscomp.SourceMap var6 = var4.getSourceMap();
//     com.google.javascript.jscomp.JSSourceFile var9 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
//     com.google.javascript.jscomp.SourceFile.Generator var11 = null;
//     com.google.javascript.jscomp.JSSourceFile var12 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var11);
//     com.google.javascript.jscomp.CompilerInput var14 = new com.google.javascript.jscomp.CompilerInput(var12, true);
//     com.google.javascript.jscomp.CompilerOptions var15 = new com.google.javascript.jscomp.CompilerOptions();
//     var15.setAcceptConstKeyword(true);
//     com.google.javascript.jscomp.CompilerOptions.TweakProcessing var18 = var15.getTweakProcessing();
//     var15.setRewriteNewDateGoogNow(false);
//     com.google.javascript.jscomp.Result var21 = var4.compile(var9, var12, var15);
//     com.google.javascript.rhino.Node var22 = var0.parse(var9);
//     com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var23 = null;
//     com.google.javascript.jscomp.LightweightMessageFormatter var24 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var0, var23);
//     var24.setColorize(false);
//     com.google.javascript.rhino.Context var27 = null;
//     com.google.javascript.rhino.Context var28 = com.google.javascript.rhino.Context.enter(var27);
//     var28.setCompileFunctionsWithDynamicScope(false);
//     com.google.javascript.jscomp.MessageFormatter var31 = null;
//     java.util.logging.Logger var32 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var33 = new com.google.javascript.jscomp.LoggerErrorManager(var31, var32);
//     com.google.javascript.jscomp.CheckLevel var34 = null;
//     com.google.javascript.rhino.Node var36 = null;
//     com.google.javascript.jscomp.CheckLevel var38 = null;
//     com.google.javascript.jscomp.DiagnosticType var40 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var38, "hi!");
//     java.lang.String[] var42 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var43 = com.google.javascript.jscomp.JSError.make("", var36, var40, var42);
//     var33.report(var34, var43);
//     var28.removeThreadLocal((java.lang.Object)var43);
//     com.google.javascript.rhino.EvaluatorException var51 = new com.google.javascript.rhino.EvaluatorException("OFF", "", 10, "goog.global", 1);
//     boolean var52 = var43.equals((java.lang.Object)"goog.global");
//     java.lang.String var53 = var24.formatWarning(var43);
// 
//   }

  public void test441() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test441"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
    var0.disableThreads();
    var0.disableThreads();
    com.google.javascript.jscomp.MessageFormatter var4 = null;
    java.util.logging.Logger var5 = null;
    com.google.javascript.jscomp.LoggerErrorManager var6 = new com.google.javascript.jscomp.LoggerErrorManager(var4, var5);
    com.google.javascript.jscomp.CheckLevel var7 = null;
    com.google.javascript.rhino.Node var9 = null;
    com.google.javascript.jscomp.CheckLevel var11 = null;
    com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var11, "hi!");
    java.lang.String[] var15 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
    com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("", var9, var13, var15);
    var6.report(var7, var16);
    var0.setErrorManager((com.google.javascript.jscomp.ErrorManager)var6);
    com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var19 = null;
    com.google.javascript.jscomp.LightweightMessageFormatter var20 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var0, var19);
    com.google.javascript.jscomp.NodeTraversal.Callback var21 = null;
    com.google.javascript.jscomp.NodeTraversal var22 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var0, var21);
    com.google.javascript.jscomp.Scope var23 = var22.getScope();
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var32 = var27.clonePropsFrom(var31);
    com.google.javascript.rhino.Node var34 = var31.getAncestor(0);
    java.util.Set var35 = var31.getDirectives();
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    var39.setType(10);
    var39.setOptionalArg(false);
    var31.addChildrenToBack(var39);
    var39.putBooleanProp(1, true);
    com.google.javascript.jscomp.ClosureCodingConvention var48 = new com.google.javascript.jscomp.ClosureCodingConvention();
    boolean var50 = var48.isPrivate("");
    com.google.javascript.rhino.jstype.FunctionType var51 = null;
    com.google.javascript.rhino.jstype.FunctionType var52 = null;
    com.google.javascript.jscomp.CodingConvention.SubclassType var53 = null;
    var48.applySubclassRelationship(var51, var52, var53);
    java.lang.String var55 = var48.getExportSymbolFunction();
    com.google.javascript.jscomp.ClosureCodingConvention var56 = new com.google.javascript.jscomp.ClosureCodingConvention();
    boolean var58 = var56.isPrivate("");
    boolean var60 = var56.isPrivate("goog.exportProperty");
    boolean var62 = var56.isConstant("com.google.javascript.rhino.EcmaError: : hi!");
    com.google.javascript.rhino.Node var63 = null;
    com.google.javascript.rhino.Node var67 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    var67.setType(10);
    var67.setOptionalArg(false);
    java.lang.String var72 = var56.extractClassNameIfProvide(var63, var67);
    boolean var73 = var48.isOptionalParameter(var67);
    java.lang.String var74 = var39.checkTreeEquals(var67);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var22.traverse(var67);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "goog.exportSymbol"+ "'", var55.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);

  }

  public void test442() {}
//   public void test442() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test442"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     boolean var2 = var0.isPrivate("");
//     boolean var4 = var0.isPrivate("goog.exportProperty");
//     boolean var6 = var0.isConstant("com.google.javascript.rhino.EcmaError: : hi!");
//     com.google.javascript.rhino.jstype.FunctionType var7 = null;
//     com.google.javascript.rhino.jstype.FunctionType var8 = null;
//     com.google.javascript.jscomp.CodingConvention.SubclassType var9 = null;
//     var0.applySubclassRelationship(var7, var8, var9);
//     com.google.javascript.rhino.jstype.ObjectType var11 = null;
//     com.google.javascript.rhino.jstype.ObjectType var12 = null;
//     com.google.javascript.rhino.jstype.ObjectType var13 = null;
//     com.google.javascript.rhino.jstype.FunctionType var14 = null;
//     com.google.javascript.rhino.jstype.FunctionType var15 = null;
//     var0.applyDelegateRelationship(var11, var12, var13, var14, var15);
//     com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var21 = var20.getType();
//     int var22 = var20.getSourcePosition();
//     com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var32 = var27.clonePropsFrom(var31);
//     com.google.javascript.rhino.jstype.JSType var33 = null;
//     var32.setJSType(var33);
//     com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var43 = var38.clonePropsFrom(var42);
//     com.google.javascript.rhino.jstype.JSType var44 = null;
//     var43.setJSType(var44);
//     java.util.Collection var46 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(var43);
//     com.google.javascript.rhino.Node.AncestorIterable var47 = var43.getAncestors();
//     boolean var48 = var43.isOnlyModifiesThisCall();
//     com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var57 = var52.clonePropsFrom(var56);
//     com.google.javascript.rhino.jstype.JSType var58 = null;
//     var56.setJSType(var58);
//     var56.setOptionalArg(true);
//     int var62 = var56.getLineno();
//     boolean var63 = var56.isLocalResultCall();
//     boolean var64 = var56.isQuotedString();
//     com.google.javascript.rhino.Node var65 = new com.google.javascript.rhino.Node(0, var32, var43, var56);
//     java.lang.String var66 = var0.extractClassNameIfRequire(var20, var43);
//     java.lang.Appendable var67 = null;
//     var43.appendStringTree(var67);
// 
//   }

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test443"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var9 = var4.clonePropsFrom(var8);
    var9.putProp((-1), (java.lang.Object)10.0d);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var21 = var16.clonePropsFrom(var20);
    com.google.javascript.rhino.Node var22 = var9.copyInformationFrom(var21);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var31 = var26.clonePropsFrom(var30);
    com.google.javascript.rhino.Node var33 = var30.getAncestor(0);
    java.lang.String var34 = var22.checkTreeEquals(var30);
    com.google.javascript.jscomp.DiagnosticType var37 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    com.google.javascript.jscomp.Compiler var38 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var39 = var38.getTopScope();
    var38.disableThreads();
    var38.disableThreads();
    com.google.javascript.jscomp.NodeTraversal.Callback var42 = null;
    com.google.javascript.jscomp.NodeTraversal var43 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var38, var42);
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var49 = var48.getType();
    java.lang.String var50 = var48.getQualifiedName();
    com.google.javascript.rhino.Node var51 = new com.google.javascript.rhino.Node(100, var48);
    com.google.javascript.jscomp.CheckLevel var52 = null;
    com.google.javascript.jscomp.DiagnosticType var55 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
    java.lang.String[] var57 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
    com.google.javascript.jscomp.JSError var58 = var43.makeError(var48, var52, var55, var57);
    com.google.javascript.jscomp.JSError var59 = com.google.javascript.jscomp.JSError.make("", var30, var37, var57);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var60 = var30.getDouble();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test444"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    var0.clearNodeAnnotations();
    com.google.javascript.jscomp.Compiler var2 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var3 = var2.getTopScope();
    com.google.javascript.jscomp.SourceMap var4 = var2.getSourceMap();
    com.google.javascript.jscomp.JSSourceFile var7 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
    com.google.javascript.jscomp.SourceFile.Generator var9 = null;
    com.google.javascript.jscomp.JSSourceFile var10 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var9);
    com.google.javascript.jscomp.CompilerInput var12 = new com.google.javascript.jscomp.CompilerInput(var10, true);
    com.google.javascript.jscomp.CompilerOptions var13 = new com.google.javascript.jscomp.CompilerOptions();
    var13.setAcceptConstKeyword(true);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var16 = var13.getTweakProcessing();
    var13.setRewriteNewDateGoogNow(false);
    com.google.javascript.jscomp.Result var19 = var2.compile(var7, var10, var13);
    var13.setRemoveAbstractMethods(false);
    var13.setTweakToBooleanLiteral("goog.exportProperty", false);
    com.google.javascript.jscomp.graph.GraphNode var25 = var0.createNode((java.lang.Object)"goog.exportProperty");
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var35 = var30.clonePropsFrom(var34);
    com.google.javascript.rhino.jstype.JSType var36 = null;
    var35.setJSType(var36);
    java.util.Collection var38 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(var35);
    boolean var39 = var35.isSyntheticBlock();
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var44 = var43.getType();
    int var45 = var43.getSourcePosition();
    com.google.javascript.rhino.Node var46 = var43.getLastSibling();
    boolean var47 = var43.isSyntheticBlock();
    java.lang.String var48 = var35.checkTreeEquals(var43);
    boolean var49 = var43.isOnlyModifiesThisCall();
    com.google.javascript.rhino.Node var50 = new com.google.javascript.rhino.Node(40, var43);
    java.util.Set var51 = null;
    var50.setDirectives(var51);
    com.google.javascript.jscomp.CompilerOptions var53 = new com.google.javascript.jscomp.CompilerOptions();
    var53.setAcceptConstKeyword(true);
    com.google.javascript.jscomp.Compiler var56 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var57 = var56.getTopScope();
    com.google.javascript.jscomp.SourceMap var58 = var56.getSourceMap();
    com.google.javascript.jscomp.JSSourceFile var61 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
    com.google.javascript.jscomp.SourceFile.Generator var63 = null;
    com.google.javascript.jscomp.JSSourceFile var64 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var63);
    com.google.javascript.jscomp.CompilerInput var66 = new com.google.javascript.jscomp.CompilerInput(var64, true);
    com.google.javascript.jscomp.CompilerOptions var67 = new com.google.javascript.jscomp.CompilerOptions();
    var67.setAcceptConstKeyword(true);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var70 = var67.getTweakProcessing();
    var67.setRewriteNewDateGoogNow(false);
    com.google.javascript.jscomp.Result var73 = var56.compile(var61, var64, var67);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var74 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var75 = var74.newSubGraph();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var76 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var77 = var76.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var79 = var76.createDirectedGraphNode((java.lang.Object)100);
    java.util.List var80 = var74.getDirectedPredNodes(var79);
    com.google.javascript.jscomp.JSModuleGraph var81 = new com.google.javascript.jscomp.JSModuleGraph(var80);
    com.google.javascript.jscomp.NodeTraversal.Callback var82 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var56, var80, var82);
    var53.setManageClosureDependencies(var80);
    var53.setNameAnonymousFunctionsOnly(false);
    com.google.javascript.jscomp.DefaultPassConfig var87 = new com.google.javascript.jscomp.DefaultPassConfig(var53);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var88 = var0.getDirectedGraphEdges((java.lang.Object)var50, (java.lang.Object)var87);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
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
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test445() {}
//   public void test445() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test445"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     var0.disableThreads();
//     com.google.javascript.jscomp.NodeTraversal.Callback var4 = null;
//     com.google.javascript.jscomp.NodeTraversal var5 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var0, var4);
//     int var6 = var5.getLineNumber();
//     com.google.javascript.jscomp.CompilerInput var7 = var5.getInput();
// 
//   }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test446"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.SourceMap var2 = var1.getSourceMap();
    com.google.javascript.jscomp.CompilerOptions var3 = new com.google.javascript.jscomp.CompilerOptions();
    var3.setAcceptConstKeyword(true);
    var3.setTweakToStringLiteral("goog.exportProperty", "goog.exportSymbol");
    var3.setShadowVariables(true);
    var3.setColorizeErrorOutput(true);
    var3.setDefineToStringLiteral("com.google.javascript.rhino.EcmaError: TypeError: Cannot set property \"hi!: hi!\" of 0 to \"40\"", "");
    var1.initOptions(var3);
    com.google.javascript.jscomp.LightweightMessageFormatter var17 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
    com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var18 = null;
    com.google.javascript.jscomp.LightweightMessageFormatter var19 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1, var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test447() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test447"); }


    com.google.javascript.jscomp.JSSourceFile var1 = com.google.javascript.jscomp.JSSourceFile.fromFile("");
    var1.setOriginalPath("");
    java.lang.String var4 = var1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test448() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test448"); }


    long var1 = com.google.javascript.rhino.ScriptRuntime.testUint32String("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test449() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test449"); }


    java.lang.String var1 = com.google.javascript.rhino.ScriptRuntime.escapeString("STRING ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "STRING "+ "'", var1.equals("STRING "));

  }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test450"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setAcceptConstKeyword(true);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var3 = var0.getTweakProcessing();
    var0.setRewriteNewDateGoogNow(false);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var6 = var0.getTweakProcessing();
    com.google.javascript.jscomp.DiagnosticGroup var7 = null;
    com.google.javascript.jscomp.CheckLevel var8 = null;
    var0.setWarningLevel(var7, var8);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var11 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var12 = var11.newSubGraph();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var13 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var14 = var13.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var16 = var13.createDirectedGraphNode((java.lang.Object)100);
    java.util.List var17 = var11.getDirectedPredNodes(var16);
    var0.setReplaceStringsConfiguration("com.google.javascript.rhino.EcmaError: : hi!", var17);
    var0.setDefineToNumberLiteral("goog.exportSymbol", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test451() {}
//   public void test451() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test451"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     com.google.javascript.jscomp.SourceMap var2 = var0.getSourceMap();
//     com.google.javascript.jscomp.JSSourceFile var5 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
//     com.google.javascript.jscomp.SourceFile.Generator var7 = null;
//     com.google.javascript.jscomp.JSSourceFile var8 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var7);
//     com.google.javascript.jscomp.CompilerInput var10 = new com.google.javascript.jscomp.CompilerInput(var8, true);
//     com.google.javascript.jscomp.CompilerOptions var11 = new com.google.javascript.jscomp.CompilerOptions();
//     var11.setAcceptConstKeyword(true);
//     com.google.javascript.jscomp.CompilerOptions.TweakProcessing var14 = var11.getTweakProcessing();
//     var11.setRewriteNewDateGoogNow(false);
//     com.google.javascript.jscomp.Result var17 = var0.compile(var5, var8, var11);
//     com.google.javascript.jscomp.DiagnosticGroup var18 = null;
//     com.google.javascript.jscomp.CheckLevel var19 = null;
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var20 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var18, var19);
//     java.lang.String var21 = var20.toString();
//     var11.addWarningsGuard((com.google.javascript.jscomp.WarningsGuard)var20);
//     var11.enableRuntimeTypeCheck("");
//     com.google.javascript.jscomp.CompilerOptions var25 = new com.google.javascript.jscomp.CompilerOptions();
//     var25.setAcceptConstKeyword(true);
//     com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler var28 = null;
//     var25.setAliasTransformationHandler(var28);
//     var25.setCollapsePropertiesOnExternTypes(false);
//     com.google.javascript.jscomp.CompilerOptions.TweakProcessing var32 = var25.getTweakProcessing();
//     var11.setTweakProcessing(var32);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var34 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.SubGraph var35 = var34.newSubGraph();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var37 = var34.createDirectedGraphNode((java.lang.Object)100);
//     java.util.List var38 = var34.getGraphvizNodes();
//     boolean var39 = var34.isDirected();
//     java.util.List var40 = var34.getGraphvizEdges();
//     var11.setManageClosureDependencies(var40);
//     var11.setRemoveClosureAsserts(true);
//     java.util.Set var44 = null;
//     var11.setIdGenerators(var44);
// 
//   }

  public void test452() {}
//   public void test452() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test452"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.SubGraph var1 = var0.newSubGraph();
//     var0.pushNodeAnnotations();
//     com.google.javascript.jscomp.graph.SubGraph var3 = var0.newSubGraph();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var4 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.SubGraph var5 = var4.newSubGraph();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var7 = var4.createDirectedGraphNode((java.lang.Object)100);
//     java.util.List var8 = var4.getGraphvizNodes();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var9 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.SubGraph var10 = var9.newSubGraph();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var11 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.SubGraph var12 = var11.newSubGraph();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var14 = var11.createDirectedGraphNode((java.lang.Object)100);
//     java.util.List var15 = var9.getDirectedPredNodes(var14);
//     java.util.List var16 = var4.getDirectedPredNodes(var14);
//     java.util.List var17 = var0.getDirectedPredNodes(var14);
//     com.google.javascript.jscomp.Compiler var18 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var19 = var18.getTopScope();
//     var18.disableThreads();
//     var18.disableThreads();
//     com.google.javascript.jscomp.NodeTraversal.Callback var22 = null;
//     com.google.javascript.jscomp.NodeTraversal var23 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var18, var22);
//     com.google.javascript.jscomp.SourceFile.Generator var25 = null;
//     com.google.javascript.jscomp.JSSourceFile var26 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var25);
//     com.google.javascript.jscomp.CompilerInput var28 = new com.google.javascript.jscomp.CompilerInput(var26, true);
//     com.google.javascript.jscomp.MessageFormatter var29 = null;
//     java.util.logging.Logger var30 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var31 = new com.google.javascript.jscomp.LoggerErrorManager(var29, var30);
//     var28.setErrorManager((com.google.javascript.jscomp.ErrorManager)var31);
//     int var33 = var31.getWarningCount();
//     var18.setErrorManager((com.google.javascript.jscomp.ErrorManager)var31);
//     var31.setTypedPercent(100.0d);
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var37 = var0.createDirectedGraphNode((java.lang.Object)100.0d);
//     java.lang.Object var38 = null;
//     com.google.javascript.jscomp.MessageFormatter var39 = null;
//     java.util.logging.Logger var40 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var41 = new com.google.javascript.jscomp.LoggerErrorManager(var39, var40);
//     int var42 = var41.getErrorCount();
//     java.lang.RuntimeException var43 = com.google.javascript.rhino.ScriptRuntime.notFunctionError(var38, (java.lang.Object)var42);
//     java.util.List var44 = var0.getNeighborNodes((java.lang.Object)var42);
// 
//   }

  public void test453() {}
//   public void test453() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test453"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var1);
//     com.google.javascript.jscomp.JsAst var3 = new com.google.javascript.jscomp.JsAst(var2);
//     com.google.javascript.jscomp.SourceFile.Generator var5 = null;
//     com.google.javascript.jscomp.SourceFile var6 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var5);
//     var3.setSourceFile(var6);
//     java.lang.String var8 = com.google.javascript.rhino.ScriptRuntime.toString((java.lang.Object)var3);
//     var3.clearAst();
//     com.google.javascript.jscomp.Compiler var10 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var11 = var10.getTopScope();
//     com.google.javascript.jscomp.SourceMap var12 = var10.getSourceMap();
//     var10.reportCodeChange();
//     com.google.javascript.rhino.Node var14 = var3.getAstRoot((com.google.javascript.jscomp.AbstractCompiler)var10);
// 
//   }

  public void test454() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test454"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Context.checkLanguageVersion((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test455"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Context.reportWarning("hi!");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test456() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test456"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.EcmaError var3 = com.google.javascript.rhino.ScriptRuntime.typeError2("", "STRING \n", "eol");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test457() {}
//   public void test457() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test457"); }
// 
// 
//     java.io.InputStream var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromInputStream("LinkedGraph", var1);
// 
//   }

  public void test458() {}
//   public void test458() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test458"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "hi!", false);
//     com.google.javascript.jscomp.JSModule var4 = null;
//     var3.setModule(var4);
//     com.google.javascript.jscomp.Compiler var6 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var7 = var6.getTopScope();
//     var6.disableThreads();
//     var6.disableThreads();
//     var3.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var6);
//     var6.parse();
// 
//   }

  public void test459() {}
//   public void test459() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test459"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     var0.disableThreads();
//     com.google.javascript.jscomp.MessageFormatter var4 = null;
//     java.util.logging.Logger var5 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var6 = new com.google.javascript.jscomp.LoggerErrorManager(var4, var5);
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.rhino.Node var9 = null;
//     com.google.javascript.jscomp.CheckLevel var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var11, "hi!");
//     java.lang.String[] var15 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("", var9, var13, var15);
//     var6.report(var7, var16);
//     var0.setErrorManager((com.google.javascript.jscomp.ErrorManager)var6);
//     com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var19 = null;
//     com.google.javascript.jscomp.LightweightMessageFormatter var20 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var0, var19);
//     com.google.javascript.jscomp.NodeTraversal.Callback var21 = null;
//     com.google.javascript.jscomp.NodeTraversal var22 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var0, var21);
//     java.lang.String var23 = var22.getSourceName();
//     com.google.javascript.jscomp.Scope var24 = var22.getScope();
//     com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var33 = var28.clonePropsFrom(var32);
//     com.google.javascript.rhino.jstype.JSType var34 = null;
//     var33.setJSType(var34);
//     java.util.Collection var36 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(var33);
//     com.google.javascript.rhino.Node.AncestorIterable var37 = var33.getAncestors();
//     var33.setCharno(10);
//     com.google.javascript.jscomp.CheckLevel var41 = null;
//     com.google.javascript.jscomp.DiagnosticType var43 = com.google.javascript.jscomp.DiagnosticType.make(": hi!", var41, "()");
//     com.google.javascript.jscomp.DiagnosticType var49 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     com.google.javascript.jscomp.DiagnosticType var55 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "hi!");
//     java.lang.String[] var57 = new java.lang.String[] { "hi!: hi!"};
//     com.google.javascript.jscomp.JSError var58 = com.google.javascript.jscomp.JSError.make("hi!. hi! at (unknown source) line (unknown line) : (unknown column)", 40, 0, var55, var57);
//     com.google.javascript.jscomp.JSError var59 = com.google.javascript.jscomp.JSError.make("()", (-1), 10, var49, var57);
//     var22.report(var33, var43, var57);
// 
//   }

  public void test460() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test460"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var1 = var0.newSubGraph();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var2 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var3 = var2.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var5 = var2.createDirectedGraphNode((java.lang.Object)100);
    java.util.List var6 = var0.getDirectedPredNodes(var5);
    com.google.javascript.jscomp.JSModuleGraph var7 = new com.google.javascript.jscomp.JSModuleGraph(var6);
    com.google.javascript.jscomp.ComposeWarningsGuard var8 = new com.google.javascript.jscomp.ComposeWarningsGuard(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.deps.SortedDependencies var9 = new com.google.javascript.jscomp.deps.SortedDependencies(var6);
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
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test461() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test461"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Context.reportWarning("goog.exportProperty");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test462() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test462"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var4 = var3.getType();
    int var5 = var3.getChildCount();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var10 = var9.getType();
    int var11 = var9.getSourcePosition();
    com.google.javascript.rhino.Node var12 = var9.getLastSibling();
    boolean var13 = var9.isSyntheticBlock();
    com.google.javascript.rhino.Node var14 = var9.cloneNode();
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var23 = var18.clonePropsFrom(var22);
    com.google.javascript.rhino.jstype.JSType var24 = null;
    var22.setJSType(var24);
    var22.setOptionalArg(true);
    int var28 = var22.getLineno();
    var9.addChildrenToFront(var22);
    com.google.javascript.rhino.Node var30 = var22.removeFirstChild();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var31 = var22.getJsDocBuilderForNode();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.addChildrenToBack(var22);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test463() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test463"); }


    long var1 = com.google.javascript.rhino.ScriptRuntime.testUint32String("string");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test464() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test464"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
    com.google.javascript.jscomp.SourceMap var2 = var0.getSourceMap();
    var0.reportCodeChange();
    com.google.javascript.jscomp.Compiler var4 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var5 = var4.getTopScope();
    com.google.javascript.jscomp.SourceMap var6 = var4.getSourceMap();
    com.google.javascript.jscomp.JSSourceFile var9 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
    com.google.javascript.jscomp.SourceFile.Generator var11 = null;
    com.google.javascript.jscomp.JSSourceFile var12 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var11);
    com.google.javascript.jscomp.CompilerInput var14 = new com.google.javascript.jscomp.CompilerInput(var12, true);
    com.google.javascript.jscomp.CompilerOptions var15 = new com.google.javascript.jscomp.CompilerOptions();
    var15.setAcceptConstKeyword(true);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var18 = var15.getTweakProcessing();
    var15.setRewriteNewDateGoogNow(false);
    com.google.javascript.jscomp.Result var21 = var4.compile(var9, var12, var15);
    com.google.javascript.rhino.Node var22 = var0.parse(var9);
    com.google.javascript.jscomp.JSSourceFile var25 = com.google.javascript.jscomp.JSSourceFile.fromCode("null(null)", "goog.global");
    com.google.javascript.jscomp.JSSourceFile[] var26 = new com.google.javascript.jscomp.JSSourceFile[] { var25};
    java.nio.charset.Charset var28 = null;
    com.google.javascript.jscomp.JSSourceFile var29 = com.google.javascript.jscomp.JSSourceFile.fromFile("goog.exportProperty", var28);
    com.google.javascript.jscomp.JSSourceFile[] var30 = new com.google.javascript.jscomp.JSSourceFile[] { var29};
    com.google.javascript.jscomp.CompilerOptions var31 = new com.google.javascript.jscomp.CompilerOptions();
    var31.setAcceptConstKeyword(true);
    java.util.Map var34 = var31.getTweakReplacements();
    var31.setDefineToNumberLiteral("eof", 1);
    com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler var38 = null;
    var31.setAliasTransformationHandler(var38);
    var31.setGenerateExports(false);
    com.google.javascript.jscomp.Result var42 = var0.compile(var26, var30, var31);
    var31.enableRuntimeTypeCheck("@IMPLEMENTATION.VERSION@");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test465() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test465"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.EcmaError var4 = com.google.javascript.rhino.ScriptRuntime.typeError3("", "hi!. hi! at (unknown source) line (unknown line) : (unknown column)", "hi!. hi! at hi!. hi! at (unknown source) line (unknown line) : (unknown column) line 40 : 0", "0");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test466() {}
//   public void test466() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test466"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Compiler.IntermediateState var2 = var1.getState();
//     com.google.javascript.jscomp.CompilerInput var4 = var1.getInput(": WARNING - hi!\n");
// 
//   }

  public void test467() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test467"); }


    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var6 = var5.getType();
    com.google.javascript.rhino.Node[] var7 = new com.google.javascript.rhino.Node[] { var5};
    com.google.javascript.rhino.Node var8 = new com.google.javascript.rhino.Node(100, var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var9 = new com.google.javascript.rhino.Node(10, var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test468() {}
//   public void test468() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test468"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticGroup var0 = null;
//     com.google.javascript.jscomp.CheckLevel var1 = null;
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var2 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var0, var1);
//     java.lang.String var3 = var2.toString();
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var9 = var8.getType();
//     int var10 = var8.getSourcePosition();
//     com.google.javascript.rhino.Node var11 = var8.getLastSibling();
//     com.google.javascript.rhino.Node var12 = var8.removeFirstChild();
//     java.lang.String var16 = var8.toString(false, true, false);
//     com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     com.google.javascript.rhino.Node var25 = var20.clonePropsFrom(var24);
//     com.google.javascript.rhino.Node var27 = var24.getAncestor(0);
//     boolean var28 = var24.isQualifiedName();
//     com.google.javascript.rhino.JSDocInfo var29 = null;
//     var24.setJSDocInfo(var29);
//     var8.addChildToFront(var24);
//     com.google.javascript.jscomp.CheckLevel var32 = null;
//     com.google.javascript.jscomp.DiagnosticType var35 = com.google.javascript.jscomp.DiagnosticType.warning("hi!", "");
//     com.google.javascript.jscomp.CheckLevel var39 = null;
//     com.google.javascript.rhino.Node var41 = null;
//     com.google.javascript.jscomp.CheckLevel var43 = null;
//     com.google.javascript.jscomp.DiagnosticType var45 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var43, "hi!");
//     java.lang.String[] var47 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var48 = com.google.javascript.jscomp.JSError.make("", var41, var45, var47);
//     java.lang.String[] var50 = new java.lang.String[] { "goog.exportProperty"};
//     com.google.javascript.jscomp.JSError var51 = com.google.javascript.jscomp.JSError.make("eof", 1, 40, var39, var45, var50);
//     com.google.javascript.jscomp.JSError var52 = com.google.javascript.jscomp.JSError.make("com.google.javascript.rhino.EcmaError: : hi!: goog.global", var8, var32, var35, var50);
//     com.google.javascript.jscomp.CheckLevel var53 = var2.level(var52);
// 
//   }

  public void test469() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test469"); }


    java.nio.charset.Charset var1 = null;
    com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromFile("STRING ", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test470() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test470"); }


    com.google.javascript.jscomp.VariableRenamingPolicy[] var0 = com.google.javascript.jscomp.VariableRenamingPolicy.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test471() {}
//   public void test471() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test471"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = com.google.javascript.rhino.Context.enter();
//     var0.setInstructionObserverThreshold(0);
//     var0.removeActivationName("ERROR\n    STRING \n");
//     com.google.javascript.rhino.ErrorReporter var5 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.ErrorReporter var6 = var0.setErrorReporter(var5);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var0);
// 
//   }

  public void test472() {}
//   public void test472() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test472"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = com.google.javascript.rhino.Context.enter();
//     var0.setInstructionObserverThreshold(0);
//     boolean var3 = var0.isGeneratingSource();
//     var0.addActivationName("null(null)");
//     com.google.javascript.rhino.ErrorReporter var6 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.ErrorReporter var7 = var0.setErrorReporter(var6);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == true);
// 
//   }

  public void test473() {}
//   public void test473() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test473"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     var0.disableThreads();
//     com.google.javascript.jscomp.NodeTraversal.Callback var4 = null;
//     com.google.javascript.jscomp.NodeTraversal var5 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var0, var4);
//     com.google.javascript.rhino.Node var6 = var5.getEnclosingFunction();
//     com.google.javascript.jscomp.CompilerInput var7 = var5.getInput();
// 
//   }

  public void test474() {}
//   public void test474() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test474"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.SubGraph var1 = var0.newSubGraph();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var3 = var0.createDirectedGraphNode((java.lang.Object)100);
//     java.util.List var4 = var0.getGraphvizNodes();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var5 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.SubGraph var6 = var5.newSubGraph();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var7 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.SubGraph var8 = var7.newSubGraph();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var10 = var7.createDirectedGraphNode((java.lang.Object)100);
//     java.util.List var11 = var5.getDirectedPredNodes(var10);
//     java.util.List var12 = var0.getDirectedPredNodes(var10);
//     java.lang.Object var13 = new java.lang.Object();
//     java.lang.String var14 = com.google.javascript.rhino.ScriptRuntime.toString(var13);
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var15 = var0.createDirectedGraphNode((java.lang.Object)var14);
//     com.google.javascript.jscomp.JSSourceFile var17 = com.google.javascript.jscomp.JSSourceFile.fromFile("");
//     java.lang.String var18 = var17.getOriginalPath();
//     com.google.javascript.jscomp.graph.GraphNode var19 = var0.getNode((java.lang.Object)var18);
//     java.lang.Object var20 = null;
//     com.google.javascript.jscomp.graph.GraphNode var21 = var0.createNode(var20);
//     var0.popEdgeAnnotations();
// 
//   }

  public void test475() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test475"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var4 = var3.getType();
    int var5 = var3.getChildCount();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    var3.addChildrenToFront(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setDouble(100.0d);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test476() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test476"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var1 = var0.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var3 = var0.createDirectedGraphNode((java.lang.Object)100);
    java.util.List var4 = var0.getGraphvizNodes();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var5 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var6 = var5.newSubGraph();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var7 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var8 = var7.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var10 = var7.createDirectedGraphNode((java.lang.Object)100);
    java.util.List var11 = var5.getDirectedPredNodes(var10);
    java.util.List var12 = var0.getDirectedPredNodes(var10);
    java.lang.Object var13 = new java.lang.Object();
    java.lang.String var14 = com.google.javascript.rhino.ScriptRuntime.toString(var13);
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var15 = var0.createDirectedGraphNode((java.lang.Object)var14);
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var16 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var17 = var0.getDirectedPredNodes(var16);
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
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
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

  public void test477() {}
//   public void test477() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test477"); }
// 
// 
//     com.google.javascript.rhino.Node[] var1 = null;
//     com.google.javascript.rhino.Node var2 = new com.google.javascript.rhino.Node(40, var1);
// 
//   }

  public void test478() {}
//   public void test478() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test478"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     var0.disableThreads();
//     com.google.javascript.jscomp.NodeTraversal.Callback var4 = null;
//     com.google.javascript.jscomp.NodeTraversal var5 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var0, var4);
//     com.google.javascript.jscomp.SourceFile.Generator var7 = null;
//     com.google.javascript.jscomp.JSSourceFile var8 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var7);
//     com.google.javascript.jscomp.CompilerInput var10 = new com.google.javascript.jscomp.CompilerInput(var8, true);
//     com.google.javascript.jscomp.MessageFormatter var11 = null;
//     java.util.logging.Logger var12 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var13 = new com.google.javascript.jscomp.LoggerErrorManager(var11, var12);
//     var10.setErrorManager((com.google.javascript.jscomp.ErrorManager)var13);
//     int var15 = var13.getWarningCount();
//     var0.setErrorManager((com.google.javascript.jscomp.ErrorManager)var13);
//     com.google.javascript.jscomp.Region var19 = var0.getSourceRegion("", 0);
//     java.lang.String var22 = var0.getSourceLine("", 10);
// 
//   }

  public void test479() {}
//   public void test479() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test479"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = null;
//     com.google.javascript.rhino.Context var1 = com.google.javascript.rhino.Context.enter(var0);
//     var1.setCompileFunctionsWithDynamicScope(false);
//     java.lang.Object var4 = var1.getDebuggerContextData();
//     com.google.javascript.rhino.ErrorReporter var5 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.ErrorReporter var6 = var1.setErrorReporter(var5);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var4);
// 
//   }

  public void test480() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test480"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var8 = var3.clonePropsFrom(var7);
    com.google.javascript.rhino.jstype.JSType var9 = null;
    var8.setJSType(var9);
    java.util.Collection var11 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(var8);
    boolean var12 = var8.isSyntheticBlock();
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var17 = var16.getType();
    int var18 = var16.getSourcePosition();
    com.google.javascript.rhino.Node var19 = var16.getLastSibling();
    boolean var20 = var16.isSyntheticBlock();
    java.lang.String var21 = var8.checkTreeEquals(var16);
    boolean var22 = var16.isOnlyModifiesThisCall();
    boolean var23 = var16.isOnlyModifiesThisCall();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test481() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test481"); }


    com.google.javascript.jscomp.JSSourceFile var1 = com.google.javascript.jscomp.JSSourceFile.fromFile("");
    var1.setOriginalPath("");
    com.google.javascript.jscomp.Region var5 = var1.getRegion((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test482() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test482"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Context.reportWarning(": WARNING - hi!\n");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test483() {}
//   public void test483() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test483"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     var0.disableThreads();
//     com.google.javascript.jscomp.MessageFormatter var4 = null;
//     java.util.logging.Logger var5 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var6 = new com.google.javascript.jscomp.LoggerErrorManager(var4, var5);
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.rhino.Node var9 = null;
//     com.google.javascript.jscomp.CheckLevel var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var11, "hi!");
//     java.lang.String[] var15 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("", var9, var13, var15);
//     var6.report(var7, var16);
//     var0.setErrorManager((com.google.javascript.jscomp.ErrorManager)var6);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var20 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.Collection var21 = var20.getNodes();
//     java.util.List var22 = var20.getEdges();
//     com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     var26.setType(10);
//     com.google.javascript.rhino.Node var31 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", var22, var26, 1, 100);
//     com.google.javascript.jscomp.ComposeWarningsGuard var32 = new com.google.javascript.jscomp.ComposeWarningsGuard(var22);
//     com.google.javascript.jscomp.NodeTraversal.Callback var33 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var0, var22, var33);
//     boolean var35 = var0.hasErrors();
// 
//   }

  public void test484() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test484"); }


    com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", ": hi!", "bitxor");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test485() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test485"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
    com.google.javascript.jscomp.SourceMap var2 = var0.getSourceMap();
    com.google.javascript.jscomp.JSSourceFile var5 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
    com.google.javascript.jscomp.SourceFile.Generator var7 = null;
    com.google.javascript.jscomp.JSSourceFile var8 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var7);
    com.google.javascript.jscomp.CompilerInput var10 = new com.google.javascript.jscomp.CompilerInput(var8, true);
    com.google.javascript.jscomp.CompilerOptions var11 = new com.google.javascript.jscomp.CompilerOptions();
    var11.setAcceptConstKeyword(true);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var14 = var11.getTweakProcessing();
    var11.setRewriteNewDateGoogNow(false);
    com.google.javascript.jscomp.Result var17 = var0.compile(var5, var8, var11);
    var11.setRemoveAbstractMethods(false);
    var11.setSummaryDetailLevel(10);
    java.util.Map var22 = var11.getDefineReplacements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test486() {}
//   public void test486() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test486"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     var0.disableThreads();
//     java.io.PrintStream var4 = null;
//     com.google.javascript.jscomp.Compiler var5 = new com.google.javascript.jscomp.Compiler(var4);
//     com.google.javascript.jscomp.Compiler.IntermediateState var6 = var5.getState();
//     var0.setState(var6);
//     var0.check();
// 
//   }

  public void test487() {}
//   public void test487() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test487"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     com.google.javascript.jscomp.SourceMap var2 = var0.getSourceMap();
//     var0.reportCodeChange();
//     com.google.javascript.jscomp.Compiler var4 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var5 = var4.getTopScope();
//     com.google.javascript.jscomp.SourceMap var6 = var4.getSourceMap();
//     com.google.javascript.jscomp.JSSourceFile var9 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
//     com.google.javascript.jscomp.SourceFile.Generator var11 = null;
//     com.google.javascript.jscomp.JSSourceFile var12 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var11);
//     com.google.javascript.jscomp.CompilerInput var14 = new com.google.javascript.jscomp.CompilerInput(var12, true);
//     com.google.javascript.jscomp.CompilerOptions var15 = new com.google.javascript.jscomp.CompilerOptions();
//     var15.setAcceptConstKeyword(true);
//     com.google.javascript.jscomp.CompilerOptions.TweakProcessing var18 = var15.getTweakProcessing();
//     var15.setRewriteNewDateGoogNow(false);
//     com.google.javascript.jscomp.Result var21 = var4.compile(var9, var12, var15);
//     com.google.javascript.rhino.Node var22 = var0.parse(var9);
//     com.google.javascript.jscomp.JSSourceFile var25 = com.google.javascript.jscomp.JSSourceFile.fromCode("null(null)", "goog.global");
//     com.google.javascript.jscomp.JSSourceFile[] var26 = new com.google.javascript.jscomp.JSSourceFile[] { var25};
//     java.nio.charset.Charset var28 = null;
//     com.google.javascript.jscomp.JSSourceFile var29 = com.google.javascript.jscomp.JSSourceFile.fromFile("goog.exportProperty", var28);
//     com.google.javascript.jscomp.JSSourceFile[] var30 = new com.google.javascript.jscomp.JSSourceFile[] { var29};
//     com.google.javascript.jscomp.CompilerOptions var31 = new com.google.javascript.jscomp.CompilerOptions();
//     var31.setAcceptConstKeyword(true);
//     java.util.Map var34 = var31.getTweakReplacements();
//     var31.setDefineToNumberLiteral("eof", 1);
//     com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler var38 = null;
//     var31.setAliasTransformationHandler(var38);
//     var31.setGenerateExports(false);
//     com.google.javascript.jscomp.Result var42 = var0.compile(var26, var30, var31);
//     java.nio.charset.Charset var44 = null;
//     com.google.javascript.jscomp.JSSourceFile var45 = com.google.javascript.jscomp.JSSourceFile.fromFile("goog.exportProperty", var44);
//     com.google.javascript.jscomp.JSSourceFile[] var46 = new com.google.javascript.jscomp.JSSourceFile[] { var45};
//     com.google.javascript.jscomp.Compiler var47 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var48 = var47.getTopScope();
//     com.google.javascript.jscomp.SourceMap var49 = var47.getSourceMap();
//     var47.reportCodeChange();
//     com.google.javascript.jscomp.Compiler var51 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var52 = var51.getTopScope();
//     com.google.javascript.jscomp.SourceMap var53 = var51.getSourceMap();
//     com.google.javascript.jscomp.JSSourceFile var56 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
//     com.google.javascript.jscomp.SourceFile.Generator var58 = null;
//     com.google.javascript.jscomp.JSSourceFile var59 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var58);
//     com.google.javascript.jscomp.CompilerInput var61 = new com.google.javascript.jscomp.CompilerInput(var59, true);
//     com.google.javascript.jscomp.CompilerOptions var62 = new com.google.javascript.jscomp.CompilerOptions();
//     var62.setAcceptConstKeyword(true);
//     com.google.javascript.jscomp.CompilerOptions.TweakProcessing var65 = var62.getTweakProcessing();
//     var62.setRewriteNewDateGoogNow(false);
//     com.google.javascript.jscomp.Result var68 = var51.compile(var56, var59, var62);
//     com.google.javascript.rhino.Node var69 = var47.parse(var56);
//     com.google.javascript.jscomp.JSSourceFile var72 = com.google.javascript.jscomp.JSSourceFile.fromCode("null(null)", "goog.global");
//     com.google.javascript.jscomp.JSSourceFile[] var73 = new com.google.javascript.jscomp.JSSourceFile[] { var72};
//     java.nio.charset.Charset var75 = null;
//     com.google.javascript.jscomp.JSSourceFile var76 = com.google.javascript.jscomp.JSSourceFile.fromFile("goog.exportProperty", var75);
//     com.google.javascript.jscomp.JSSourceFile[] var77 = new com.google.javascript.jscomp.JSSourceFile[] { var76};
//     com.google.javascript.jscomp.CompilerOptions var78 = new com.google.javascript.jscomp.CompilerOptions();
//     var78.setAcceptConstKeyword(true);
//     java.util.Map var81 = var78.getTweakReplacements();
//     var78.setDefineToNumberLiteral("eof", 1);
//     com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler var85 = null;
//     var78.setAliasTransformationHandler(var85);
//     var78.setGenerateExports(false);
//     com.google.javascript.jscomp.Result var89 = var47.compile(var73, var77, var78);
//     com.google.javascript.jscomp.CompilerOptions var90 = null;
//     com.google.javascript.jscomp.Result var91 = var0.compile(var46, var73, var90);
// 
//   }

  public void test488() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test488"); }


    boolean var1 = com.google.javascript.rhino.Context.isValidOptimizationLevel(40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test489() {}
//   public void test489() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test489"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var1);
//     com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var2, true);
//     com.google.javascript.jscomp.SourceFile.Generator var6 = null;
//     com.google.javascript.jscomp.SourceFile var7 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var6);
//     com.google.javascript.jscomp.JsAst var8 = new com.google.javascript.jscomp.JsAst(var7);
//     var4.setSourceFile(var7);
//     com.google.javascript.jscomp.JSModule var10 = null;
//     var4.setModule(var10);
//     java.lang.String var12 = var4.getName();
//     com.google.javascript.jscomp.CompilerInput var13 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var4);
//     com.google.javascript.jscomp.CompilerInput var15 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var4, true);
//     java.lang.String var16 = var4.getCode();
// 
//   }

  public void test490() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test490"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    var3.setType(10);
    boolean var6 = var3.isLocalResultCall();
    boolean var7 = var3.isUnscopedQualifiedName();
    var3.detachChildren();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test491() {}
//   public void test491() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test491"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = null;
//     com.google.javascript.rhino.Context var1 = com.google.javascript.rhino.Context.enter(var0);
//     var1.setCompileFunctionsWithDynamicScope(false);
//     java.lang.Object var4 = var1.getDebuggerContextData();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var1.setLanguageVersion((-1));
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var4);
// 
//   }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test492"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.EcmaError var1 = com.google.javascript.rhino.ScriptRuntime.typeError0("hi!. hi! at com.google.javascript.rhino.EcmaError: TypeError: Cannot set property \"hi!: hi!\" of 0 to \"40\" line (unknown line) : 0");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test493() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test493"); }


    com.google.javascript.jscomp.SourceFile var1 = com.google.javascript.jscomp.SourceFile.fromFile("hi!: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test494() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test494"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var3 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var4 = var3.getNodes();
    java.util.List var5 = var3.getEdges();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    var9.setType(10);
    com.google.javascript.rhino.Node var14 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", var5, var9, 1, 100);
    com.google.javascript.jscomp.NodeTraversal.Callback var15 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var5, var15);
    com.google.javascript.jscomp.JSModuleGraph var17 = new com.google.javascript.jscomp.JSModuleGraph(var5);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var18 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var19 = var18.newSubGraph();
    var18.pushNodeAnnotations();
    java.util.List var21 = var18.getGraphvizEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var22 = new com.google.javascript.jscomp.ComposeWarningsGuard(var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.JSModule var23 = var17.getDeepestCommonDependencyInclusive((java.util.Collection)var21);
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test495() {}
//   public void test495() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test495"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.Scope var1 = var0.getTopScope();
//     var0.disableThreads();
//     var0.disableThreads();
//     java.io.PrintStream var4 = null;
//     com.google.javascript.jscomp.Compiler var5 = new com.google.javascript.jscomp.Compiler(var4);
//     com.google.javascript.jscomp.Compiler.IntermediateState var6 = var5.getState();
//     var0.setState(var6);
//     com.google.javascript.rhino.Node var9 = null;
//     com.google.javascript.jscomp.CheckLevel var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var11, "hi!");
//     java.lang.String[] var15 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
//     com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("", var9, var13, var15);
//     com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.Node.newString("", (-1), 10);
//     int var21 = var20.getType();
//     com.google.javascript.rhino.Node var22 = var20.cloneTree();
//     boolean var23 = var16.equals((java.lang.Object)var20);
//     var0.report(var16);
// 
//   }

  public void test496() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test496"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var8 = var3.clonePropsFrom(var7);
    var8.putProp((-1), (java.lang.Object)10.0d);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var20 = var15.clonePropsFrom(var19);
    com.google.javascript.rhino.Node var21 = var8.copyInformationFrom(var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var20.setDouble(100.0d);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test497() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test497"); }


    com.google.javascript.rhino.EcmaError var6 = com.google.javascript.rhino.ScriptRuntime.constructError(": hi!", "hi!", "goog.exportSymbol", 100, "goog.global", 1);
    java.lang.String var7 = var6.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.initSourceName("com.google.javascript.rhino.EcmaError: : hi!: goog.global");
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ": hi!"+ "'", var7.equals(": hi!"));

  }

  public void test498() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test498"); }


    com.google.javascript.jscomp.SourceFile.Generator var1 = null;
    com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var1);
    com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var2, true);
    com.google.javascript.jscomp.Compiler var5 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var6 = var5.getTopScope();
    com.google.javascript.jscomp.Scope var7 = var5.getTopScope();
    var4.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var5);
    com.google.javascript.jscomp.Result var9 = var5.getResult();
    com.google.javascript.jscomp.CompilerOptions var10 = new com.google.javascript.jscomp.CompilerOptions();
    var10.setAcceptConstKeyword(true);
    com.google.javascript.jscomp.Compiler var13 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.Scope var14 = var13.getTopScope();
    com.google.javascript.jscomp.SourceMap var15 = var13.getSourceMap();
    com.google.javascript.jscomp.JSSourceFile var18 = com.google.javascript.jscomp.JSSourceFile.fromCode("", "hi!");
    com.google.javascript.jscomp.SourceFile.Generator var20 = null;
    com.google.javascript.jscomp.JSSourceFile var21 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var20);
    com.google.javascript.jscomp.CompilerInput var23 = new com.google.javascript.jscomp.CompilerInput(var21, true);
    com.google.javascript.jscomp.CompilerOptions var24 = new com.google.javascript.jscomp.CompilerOptions();
    var24.setAcceptConstKeyword(true);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var27 = var24.getTweakProcessing();
    var24.setRewriteNewDateGoogNow(false);
    com.google.javascript.jscomp.Result var30 = var13.compile(var18, var21, var24);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var31 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var32 = var31.newSubGraph();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var33 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var34 = var33.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var36 = var33.createDirectedGraphNode((java.lang.Object)100);
    java.util.List var37 = var31.getDirectedPredNodes(var36);
    com.google.javascript.jscomp.JSModuleGraph var38 = new com.google.javascript.jscomp.JSModuleGraph(var37);
    com.google.javascript.jscomp.NodeTraversal.Callback var39 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var13, var37, var39);
    var10.setManageClosureDependencies(var37);
    var10.setNameAnonymousFunctionsOnly(false);
    com.google.javascript.jscomp.DefaultPassConfig var44 = new com.google.javascript.jscomp.DefaultPassConfig(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.setPassConfig((com.google.javascript.jscomp.PassConfig)var44);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test499() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test499"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var8 = var3.clonePropsFrom(var7);
    com.google.javascript.rhino.jstype.JSType var9 = null;
    var7.setJSType(var9);
    var7.setOptionalArg(true);
    com.google.javascript.rhino.Node var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var14 = var7.clonePropsFrom(var13);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test500"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.SubGraph var1 = var0.newSubGraph();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var3 = var0.createDirectedGraphNode((java.lang.Object)100);
    java.util.List var4 = var0.getGraphvizNodes();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    var9.setType(10);
    com.google.javascript.rhino.Node var13 = new com.google.javascript.rhino.Node(10);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var22 = var17.clonePropsFrom(var21);
    var22.putProp((-1), (java.lang.Object)10.0d);
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    com.google.javascript.rhino.Node var34 = var29.clonePropsFrom(var33);
    com.google.javascript.rhino.Node var35 = var22.copyInformationFrom(var34);
    boolean var36 = var34.hasOneChild();
    com.google.javascript.rhino.Node var38 = null;
    com.google.javascript.jscomp.CheckLevel var40 = null;
    com.google.javascript.jscomp.DiagnosticType var42 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var40, "hi!");
    java.lang.String[] var44 = new java.lang.String[] { "com.google.javascript.rhino.EcmaError: : hi!"};
    com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make("", var38, var42, var44);
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.Node.newString("", (-1), 10);
    int var50 = var49.getType();
    com.google.javascript.rhino.Node var51 = var49.cloneTree();
    boolean var52 = var45.equals((java.lang.Object)var49);
    com.google.javascript.rhino.Node var55 = new com.google.javascript.rhino.Node((-1), var9, var13, var34, var49, 0, 1);
    com.google.javascript.rhino.Node var56 = var13.getLastChild();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var57 = var0.getNodeDegree((java.lang.Object)var13);
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
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
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
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);

  }

}

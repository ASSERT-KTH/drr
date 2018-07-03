
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() {}
//   public void test1() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }
// 
// 
//     java.util.List var0 = null;
//     com.google.javascript.jscomp.JSModuleGraph var1 = new com.google.javascript.jscomp.JSModuleGraph(var0);
// 
//   }

  public void test2() {}
//   public void test2() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var2 = new com.google.javascript.jscomp.CompilerInput(var0, false);
// 
//   }

  public void test3() {}
//   public void test3() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }
// 
// 
//     java.io.File var0 = null;
//     com.google.javascript.jscomp.JSSourceFile var1 = com.google.javascript.jscomp.JSSourceFile.fromFile(var0);
// 
//   }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    com.google.javascript.rhino.jstype.JSType var0 = null;
    com.google.javascript.rhino.jstype.JSType var1 = null;
    boolean var2 = com.google.javascript.rhino.jstype.JSType.isEquivalent(var0, var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Context.reportWarning("");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test6() {}
//   public void test6() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var0 = null;
//     java.lang.String[] var2 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var3 = com.google.javascript.jscomp.JSError.make(var0, var2);
// 
//   }

  public void test7() {}
//   public void test7() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }
// 
// 
//     com.google.javascript.jscomp.JSModule var0 = null;
//     com.google.javascript.jscomp.JSModule[] var1 = new com.google.javascript.jscomp.JSModule[] { var0};
//     com.google.javascript.jscomp.JSModuleGraph var2 = new com.google.javascript.jscomp.JSModuleGraph(var1);
// 
//   }

  public void test8() {}
//   public void test8() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }
// 
// 
//     java.util.List var1 = null;
//     com.google.javascript.rhino.Node var2 = null;
//     com.google.javascript.rhino.Node var5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", var1, var2, 1, 0);
// 
//   }

  public void test9() {}
//   public void test9() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Compiler.CodeBuilder var2 = null;
//     com.google.javascript.rhino.Node var4 = null;
//     var1.toSource(var2, 1, var4);
// 
//   }

  public void test10() {}
//   public void test10() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }
// 
// 
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.Context.reportError("");
//       fail("Expected exception of type com.google.javascript.rhino.EvaluatorException");
//     } catch (com.google.javascript.rhino.EvaluatorException e) {
//       // Expected exception.
//     }
// 
//   }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.google.javascript.jscomp.CheckLevel[] var0 = com.google.javascript.jscomp.CheckLevel.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Context.reportWarning("hi!", "hi!", (-1), "", 1);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test13() {}
//   public void test13() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile var0 = null;
//     com.google.javascript.jscomp.JsAst var1 = new com.google.javascript.jscomp.JsAst(var0);
// 
//   }

  public void test14() {}
//   public void test14() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var1 = null;
//     java.util.List var2 = var0.getNeighborNodes(var1);
// 
//   }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.graph.Graph.GraphEdge var3 = var0.getFirstEdge((java.lang.Object)(short)0, (java.lang.Object)' ');
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test16() {}
//   public void test16() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.SourceFile.Generator var3 = null;
//     com.google.javascript.jscomp.JSSourceFile var4 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var3);
//     com.google.javascript.jscomp.JSModule var5 = null;
//     com.google.javascript.jscomp.JSModule[] var6 = new com.google.javascript.jscomp.JSModule[] { var5};
//     com.google.javascript.jscomp.CompilerOptions var7 = null;
//     com.google.javascript.jscomp.Result var8 = var1.compile(var4, var6, var7);
// 
//   }

  public void test17() {}
//   public void test17() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     boolean var2 = var1.isIdeMode();
// 
//   }

  public void test18() {}
//   public void test18() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }
// 
// 
//     com.google.javascript.rhino.jstype.JSTypeRegistry var0 = null;
//     com.google.javascript.rhino.jstype.FunctionParamBuilder var1 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var0);
//     com.google.javascript.rhino.jstype.JSType var2 = null;
//     com.google.javascript.rhino.jstype.JSType[] var3 = new com.google.javascript.rhino.jstype.JSType[] { var2};
//     boolean var4 = var1.addOptionalParams(var3);
// 
//   }

  public void test19() {}
//   public void test19() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     boolean var2 = var1.acceptEcmaScript5();
// 
//   }

  public void test20() {}
//   public void test20() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Compiler.CodeBuilder var2 = null;
//     com.google.javascript.rhino.Node var4 = null;
//     var1.toSource(var2, 0, var4);
// 
//   }

  public void test21() {}
//   public void test21() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.JSModule var2 = null;
//     java.lang.String[] var3 = var1.toSourceArray(var2);
// 
//   }

  public void test22() {}
//   public void test22() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }
// 
// 
//     com.google.javascript.rhino.JSTypeExpression var0 = null;
//     com.google.javascript.rhino.JSTypeExpression var1 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(var0);
// 
//   }

  public void test23() {}
//   public void test23() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.SourceFile.Generator var3 = null;
//     com.google.javascript.jscomp.JSSourceFile var4 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var3);
//     com.google.javascript.jscomp.JSSourceFile[] var5 = new com.google.javascript.jscomp.JSSourceFile[] { var4};
//     com.google.javascript.jscomp.SourceFile.Generator var7 = null;
//     com.google.javascript.jscomp.JSSourceFile var8 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var7);
//     com.google.javascript.jscomp.JSSourceFile[] var9 = new com.google.javascript.jscomp.JSSourceFile[] { var8};
//     com.google.javascript.jscomp.CompilerOptions var10 = null;
//     com.google.javascript.jscomp.Result var11 = var1.compile(var5, var9, var10);
// 
//   }

  public void test24() {}
//   public void test24() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var1);
//     com.google.javascript.jscomp.Region var4 = var2.getRegion((-1));
// 
//   }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.nio.charset.Charset var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromFile("", var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test26() {}
//   public void test26() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "", true);
//     java.lang.String var5 = var3.getLine(1);
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
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.SourceFile.Generator var3 = null;
//     com.google.javascript.jscomp.JSSourceFile var4 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var3);
//     com.google.javascript.jscomp.JSSourceFile[] var5 = new com.google.javascript.jscomp.JSSourceFile[] { var4};
//     com.google.javascript.jscomp.SourceFile.Generator var7 = null;
//     com.google.javascript.jscomp.JSSourceFile var8 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var7);
//     java.lang.String var9 = var8.getName();
//     com.google.javascript.jscomp.JSSourceFile[] var10 = new com.google.javascript.jscomp.JSSourceFile[] { var8};
//     com.google.javascript.jscomp.CompilerOptions var11 = null;
//     com.google.javascript.jscomp.Result var12 = var1.compile(var5, var10, var11);
// 
//   }

  public void test29() {}
//   public void test29() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }
// 
// 
//     java.io.InputStream var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromInputStream("hi!", var1);
// 
//   }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    boolean var1 = com.google.javascript.rhino.Context.isValidLanguageVersion(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.SourceFile.Generator var3 = null;
    com.google.javascript.jscomp.JSSourceFile var4 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var3);
    java.lang.String var5 = var4.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.connect((java.lang.Object)1, (java.lang.Object)var5, (java.lang.Object)(byte)1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.Node.newString("");
    var6.putIntProp(100, 1);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.Node.newString("");
    var11.putIntProp(100, 1);
    com.google.javascript.rhino.Node var15 = var11.removeFirstChild();
    int var16 = var11.getChildCount();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.replaceChildAfter(var6, var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    long var1 = com.google.javascript.rhino.ScriptRuntime.testUint32String("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test34() {}
//   public void test34() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var1);
//     java.lang.String var3 = var2.getName();
//     java.lang.String var4 = var2.getCode();
// 
//   }

  public void test35() {}
//   public void test35() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticGroup var0 = null;
//     com.google.javascript.jscomp.DiagnosticGroup[] var1 = new com.google.javascript.jscomp.DiagnosticGroup[] { var0};
//     com.google.javascript.jscomp.DiagnosticGroup var2 = new com.google.javascript.jscomp.DiagnosticGroup(var1);
// 
//   }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.rhino.EcmaError var3 = com.google.javascript.rhino.ScriptRuntime.constructError("hi!", "hi!");
    java.lang.String var4 = var3.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.disconnectInDirection((java.lang.Object)var3, (java.lang.Object)"hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));

  }

  public void test37() {}
//   public void test37() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     java.util.List var8 = null;
//     java.util.List var9 = null;
//     com.google.javascript.jscomp.CompilerOptions var10 = null;
//     com.google.javascript.jscomp.Result var11 = var1.compile(var8, var9, var10);
// 
//   }

  public void test38() {}
//   public void test38() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     java.util.List var8 = null;
//     java.util.List var9 = null;
//     com.google.javascript.jscomp.CompilerOptions var10 = null;
//     var1.initModules(var8, var9, var10);
// 
//   }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    com.google.javascript.jscomp.VariableRenamingPolicy[] var0 = com.google.javascript.jscomp.VariableRenamingPolicy.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.Node.newString("");
    var2.putIntProp(100, 1);
    com.google.javascript.rhino.Node var6 = var2.removeFirstChild();
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var16 = new com.google.javascript.rhino.Node(1, var2, var8, var13, 1, 1);
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.Node.newString("");
    var18.putIntProp(100, 1);
    com.google.javascript.rhino.Node var22 = var18.removeFirstChild();
    int var23 = var18.getChildCount();
    com.google.javascript.rhino.Node var24 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.addChildBefore(var18, var24);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("");
    var3.putIntProp(100, 1);
    com.google.javascript.rhino.Node var7 = var3.removeFirstChild();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var17 = new com.google.javascript.rhino.Node(1, var3, var9, var14, 1, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var18 = var0.getDirectedPredNodes((java.lang.Object)1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test42() {}
//   public void test42() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "", true);
//     com.google.javascript.jscomp.Region var5 = var3.getRegion(10);
// 
//   }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }


    com.google.javascript.jscomp.PropertyRenamingPolicy[] var0 = com.google.javascript.jscomp.PropertyRenamingPolicy.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test44() {}
//   public void test44() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }
// 
// 
//     java.io.Reader var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromReader("", var1);
// 
//   }

  public void test45() {}
//   public void test45() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "", true);
//     com.google.javascript.jscomp.CompilerInput var5 = new com.google.javascript.jscomp.CompilerInput(var0, true);
// 
//   }

  public void test46() {}
//   public void test46() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var4 = null;
//     java.lang.String[] var6 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var7 = com.google.javascript.jscomp.JSError.make("hi!", 1, 0, var3, var4, var6);
// 
//   }

  public void test47() {}
//   public void test47() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.rhino.jstype.JSTypeRegistry var8 = var1.getTypeRegistry();
// 
//   }

  public void test48() {}
//   public void test48() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }
// 
// 
//     java.io.InputStream var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromInputStream("", var1);
// 
//   }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.SourceFile.Generator var2 = null;
    com.google.javascript.jscomp.JSSourceFile var3 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var2);
    java.lang.String var4 = var3.getName();
    var3.setOriginalPath("");
    com.google.javascript.rhino.EcmaError var10 = com.google.javascript.rhino.ScriptRuntime.constructError("hi!", "hi!");
    int var11 = var10.getLineNumber();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.connect((java.lang.Object)var3, (java.lang.Object)0.0d, (java.lang.Object)var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }


    java.util.logging.Level var0 = null;
    com.google.javascript.jscomp.Compiler.setLoggingLevel(var0);

  }

  public void test51() {}
//   public void test51() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }
// 
// 
//     java.io.InputStream var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromInputStream("hi!", var1);
// 
//   }

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

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.VariableRenamingPolicy var1 = com.google.javascript.jscomp.VariableRenamingPolicy.valueOf("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test54() {}
//   public void test54() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.ErrorManager var5 = null;
//     var1.setErrorManager(var5);
// 
//   }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("");
    var3.putIntProp(100, 1);
    java.lang.String var7 = var3.getString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var8 = var0.getDirectedGraphEdges((java.lang.Object)(-1), (java.lang.Object)var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.disconnectInDirection((java.lang.Object)100.0d, (java.lang.Object)(-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test57() {}
//   public void test57() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }
// 
// 
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.Node.newString("");
//     var2.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var6 = var2.removeFirstChild();
//     int var7 = var2.getChildCount();
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var13 = new com.google.javascript.rhino.Node(10, var2, var12);
//     com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newString("");
//     var16.putIntProp(100, 1);
//     com.google.javascript.rhino.Node[] var20 = new com.google.javascript.rhino.Node[] { var16};
//     com.google.javascript.rhino.Node var21 = new com.google.javascript.rhino.Node((-1), var20);
//     com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.Node.newString("");
//     var24.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var28 = var24.removeFirstChild();
//     com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var38 = new com.google.javascript.rhino.Node(1, var24, var30, var35, 1, 1);
//     int var39 = var35.getLineno();
//     var2.addChildBefore(var21, var35);
// 
//   }

  public void test58() {}
//   public void test58() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     com.google.javascript.rhino.jstype.JSTypeNative var2 = null;
//     com.google.javascript.rhino.jstype.ObjectType var3 = var1.getNativeObjectType(var2);
// 
//   }

  public void test59() {}
//   public void test59() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "", true);
//     com.google.javascript.jscomp.CompilerInput var6 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var3, "", false);
//     java.lang.String var8 = var3.getLine(0);
// 
//   }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.rhino.ErrorReporter var1 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var1);
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("");
    var4.putIntProp(100, 1);
    com.google.javascript.rhino.Node var8 = var4.removeFirstChild();
    int var9 = var4.getChildCount();
    boolean var10 = var4.hasChildren();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var0.isConnected((java.lang.Object)var1, (java.lang.Object)var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test61() {}
//   public void test61() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.lang.Object var1 = null;
//     java.util.Iterator var2 = var0.getNeighborNodesIterator(var1);
// 
//   }

  public void test62() {}
//   public void test62() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     var1.parse();
// 
//   }

  public void test63() {}
//   public void test63() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }
// 
// 
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.Node.newString("");
//     boolean var3 = var2.hasChildren();
//     com.google.javascript.jscomp.DiagnosticType var4 = null;
//     java.lang.String[] var6 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var7 = com.google.javascript.jscomp.JSError.make("STRING ", var2, var4, var6);
// 
//   }

  public void test64() {}
//   public void test64() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }
// 
// 
//     java.util.Collection var0 = null;
//     com.google.javascript.jscomp.JSModule[] var1 = com.google.javascript.jscomp.JSModule.sortJsModules(var0);
// 
//   }

  public void test65() {}
//   public void test65() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.CodingConvention var5 = var1.getCodingConvention();
// 
//   }

  public void test66() {}
//   public void test66() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     var1.processDefines();
// 
//   }

  public void test67() {}
//   public void test67() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.SourceFile.Generator var6 = null;
//     com.google.javascript.jscomp.JSSourceFile var7 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var6);
//     java.lang.String var8 = var7.getName();
//     var7.setOriginalPath("");
//     com.google.javascript.rhino.Node var11 = var1.parse(var7);
// 
//   }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("");
    var3.putIntProp(100, 1);
    com.google.javascript.rhino.Node var7 = var3.removeFirstChild();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var17 = new com.google.javascript.rhino.Node(1, var3, var9, var14, 1, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var18 = var0.getNodeDegree((java.lang.Object)var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Context.checkLanguageVersion((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.EcmaError var4 = com.google.javascript.rhino.ScriptRuntime.typeError3("STRING ", "ERROR", "hi!", "");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var1 = com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.valueOf("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test72() {}
//   public void test72() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.JSType var4 = null;
//     com.google.javascript.rhino.jstype.JSType var6 = null;
//     com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
//     com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var4, true, var7);
// 
//   }

  public void test73() {}
//   public void test73() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.JSType var4 = null;
//     com.google.javascript.rhino.jstype.JSType[] var6 = null;
//     com.google.javascript.rhino.jstype.FunctionType var7 = var1.createFunctionType(var4, true, var6);
// 
//   }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }


    com.google.javascript.jscomp.JSSourceFile var1 = com.google.javascript.jscomp.JSSourceFile.fromFile("hi!");
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

  public void test75() {}
//   public void test75() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.ErrorManager var8 = null;
//     var1.setErrorManager(var8);
// 
//   }

  public void test76() {}
//   public void test76() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.JSType var4 = null;
//     com.google.javascript.rhino.jstype.JSType[] var5 = new com.google.javascript.rhino.jstype.JSType[] { var4};
//     com.google.javascript.rhino.Node var6 = var1.createParametersWithVarArgs(var5);
// 
//   }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("");
    java.lang.String var7 = var3.toString(false, true, false);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.Node.newString("");
    var10.putIntProp(100, 1);
    com.google.javascript.rhino.Node var14 = var10.removeFirstChild();
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var24 = new com.google.javascript.rhino.Node(1, var10, var16, var21, 1, 1);
    boolean var25 = var16.hasSideEffects();
    com.google.javascript.rhino.Node var26 = var3.copyInformationFromForTree(var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.disconnectInDirection((java.lang.Object)(short)100, (java.lang.Object)var16);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "STRING "+ "'", var7.equals("STRING "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }


    java.lang.String var1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("ERROR");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "(ERROR)"+ "'", var1.equals("(ERROR)"));

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }


    com.google.javascript.jscomp.parsing.Config var2 = null;
    com.google.javascript.jscomp.mozilla.rhino.ErrorReporter var3 = null;
    java.util.logging.Logger var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var5 = com.google.javascript.jscomp.parsing.ParserRunner.parse("", "hi!", var2, var3, var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test80() {}
//   public void test80() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }
// 
// 
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.Context.reportError("ERROR  100 [synthetic: 1]\n");
//       fail("Expected exception of type com.google.javascript.rhino.EvaluatorException");
//     } catch (com.google.javascript.rhino.EvaluatorException e) {
//       // Expected exception.
//     }
// 
//   }

  public void test81() {}
//   public void test81() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "", true);
//     com.google.javascript.jscomp.SourceFile var5 = com.google.javascript.jscomp.SourceFile.fromFile("ERROR  100 [synthetic: 1]\n");
//     var3.setSourceFile(var5);
// 
//   }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    java.io.PrintStream var2 = null;
    com.google.javascript.jscomp.Compiler var3 = new com.google.javascript.jscomp.Compiler(var2);
    com.google.javascript.jscomp.Region var6 = var3.getSourceRegion("", 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var7 = var0.getOutEdges((java.lang.Object)0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.Node.newString("");
    var1.putIntProp(100, 1);
    java.lang.String var5 = var1.getString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var6 = var1.detachFromParent();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var3 = var0.getDirectedSuccNodes((java.lang.Object)10.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test85() {}
//   public void test85() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }
// 
// 
//     java.io.InputStream var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromInputStream("", var1);
// 
//   }

  public void test86() {}
//   public void test86() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     boolean var5 = var1.hasErrors();
// 
//   }

  public void test87() {}
//   public void test87() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }
// 
// 
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.EvaluatorException var5 = com.google.javascript.rhino.Context.reportRuntimeError("ERROR  100 [synthetic: 1]\n", "ERROR  100 [synthetic: 1]\n", 1, "TypeError: ", 409600);
//       fail("Expected exception of type com.google.javascript.rhino.EvaluatorException");
//     } catch (com.google.javascript.rhino.EvaluatorException e) {
//       // Expected exception.
//     }
// 
//   }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.Node.newString("");
    java.lang.String var5 = var1.toString(false, true, false);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("");
    var8.putIntProp(100, 1);
    com.google.javascript.rhino.Node var12 = var8.removeFirstChild();
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var22 = new com.google.javascript.rhino.Node(1, var8, var14, var19, 1, 1);
    boolean var23 = var14.hasSideEffects();
    com.google.javascript.rhino.Node var24 = var1.copyInformationFromForTree(var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.JSDocInfo var25 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(var24);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "STRING "+ "'", var5.equals("STRING "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test89() {}
//   public void test89() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     var1.parse();
// 
//   }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("");
    var4.putIntProp(100, 1);
    com.google.javascript.rhino.Node var8 = var4.removeFirstChild();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.FunctionType var9 = var1.createInterfaceType("ERROR  100 [synthetic: 1]\n", var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test91() {}
//   public void test91() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.JSSourceFile var6 = com.google.javascript.jscomp.JSSourceFile.fromFile("hi!");
//     com.google.javascript.jscomp.JSSourceFile var8 = com.google.javascript.jscomp.JSSourceFile.fromFile("hi!");
//     com.google.javascript.jscomp.JSSourceFile[] var9 = new com.google.javascript.jscomp.JSSourceFile[] { var8};
//     com.google.javascript.jscomp.CompilerOptions var10 = null;
//     com.google.javascript.jscomp.Result var11 = var1.compile(var6, var9, var10);
// 
//   }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var1 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var2 = var1.getNodes();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.Node.newString("");
    var5.putIntProp(100, 1);
    com.google.javascript.rhino.Node[] var9 = new com.google.javascript.rhino.Node[] { var5};
    com.google.javascript.rhino.Node var10 = new com.google.javascript.rhino.Node((-1), var9);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.Node.newString("");
    var13.putIntProp(100, 1);
    com.google.javascript.rhino.Node var17 = var13.removeFirstChild();
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var27 = new com.google.javascript.rhino.Node(1, var13, var19, var24, 1, 1);
    int var28 = var24.getLineno();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var29 = com.google.javascript.rhino.ScriptRuntime.getMessage3("STRING ", (java.lang.Object)var1, (java.lang.Object)(-1), (java.lang.Object)var28);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 100);

  }

  public void test93() {}
//   public void test93() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     var1.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var5 = null;
//     com.google.javascript.rhino.jstype.JSType var6 = null;
//     com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
//     com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
//     com.google.javascript.rhino.jstype.ObjectType var9 = var1.createAnonymousObjectType();
//     java.util.List var10 = null;
//     com.google.javascript.rhino.Node var11 = var1.createParametersWithVarArgs(var10);
// 
//   }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }


    java.lang.String var2 = com.google.javascript.rhino.ScriptRuntime.numberToString((-1.0d), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "-1"+ "'", var2.equals("-1"));

  }

  public void test95() {}
//   public void test95() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = null;
//     long var1 = com.google.javascript.rhino.ScriptRuntime.lastUint32Result(var0);
// 
//   }

  public void test96() {}
//   public void test96() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.JSSourceFile var9 = com.google.javascript.jscomp.JSSourceFile.fromFile("hi!");
//     com.google.javascript.jscomp.JSSourceFile[] var10 = new com.google.javascript.jscomp.JSSourceFile[] { var9};
//     com.google.javascript.jscomp.JSModule var11 = null;
//     com.google.javascript.jscomp.JSModule[] var12 = new com.google.javascript.jscomp.JSModule[] { var11};
//     com.google.javascript.jscomp.CompilerOptions var13 = null;
//     com.google.javascript.jscomp.Result var14 = var1.compile(var10, var12, var13);
// 
//   }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("");
    var3.putIntProp(100, 1);
    com.google.javascript.rhino.Node var7 = var3.removeFirstChild();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var17 = new com.google.javascript.rhino.Node(1, var3, var9, var14, 1, 1);
    int var18 = var14.getLineno();
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.Node.newString("");
    var21.putIntProp(100, 1);
    com.google.javascript.rhino.Node var25 = var21.removeFirstChild();
    int var26 = var21.getChildCount();
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var32 = new com.google.javascript.rhino.Node(10, var21, var31);
    com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.Node.newString("");
    java.lang.String var38 = var34.toString(false, true, false);
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.Node.newString("");
    var41.putIntProp(100, 1);
    com.google.javascript.rhino.Node var45 = var41.removeFirstChild();
    com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var55 = new com.google.javascript.rhino.Node(1, var41, var47, var52, 1, 1);
    boolean var56 = var47.hasSideEffects();
    com.google.javascript.rhino.Node var57 = var34.copyInformationFromForTree(var47);
    com.google.javascript.rhino.Node var59 = com.google.javascript.rhino.Node.newString("");
    java.lang.String var63 = var59.toString(false, true, false);
    com.google.javascript.rhino.Node var66 = com.google.javascript.rhino.Node.newString("");
    var66.putIntProp(100, 1);
    com.google.javascript.rhino.Node var70 = var66.removeFirstChild();
    com.google.javascript.rhino.Node var72 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var77 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var80 = new com.google.javascript.rhino.Node(1, var66, var72, var77, 1, 1);
    boolean var81 = var72.hasSideEffects();
    com.google.javascript.rhino.Node var82 = var59.copyInformationFromForTree(var72);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var83 = new com.google.javascript.rhino.Node(0, var14, var32, var47, var82);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "STRING "+ "'", var38.equals("STRING "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "STRING "+ "'", var63.equals("STRING "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);

  }

  public void test98() {}
//   public void test98() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     java.util.List var8 = null;
//     com.google.javascript.jscomp.NodeTraversal.Callback var9 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var8, var9);
// 
//   }

  public void test99() {}
//   public void test99() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var8 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     java.lang.String var9 = var1.toSource();
// 
//   }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    java.lang.Iterable var2 = var0.getDirectedGraphNodes();
    com.google.javascript.rhino.EcmaError var5 = com.google.javascript.rhino.ScriptRuntime.constructError("hi!", "hi!");
    int var6 = var5.getLineNumber();
    java.io.FilenameFilter var7 = null;
    java.lang.String var8 = var5.getScriptStackTrace(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var0.isConnected((java.lang.Object)var7, (java.lang.Object)0.0d);
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
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "<No stack trace available>"+ "'", var8.equals("<No stack trace available>"));

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.Node.newString("");
    var2.putIntProp(100, 1);
    com.google.javascript.rhino.Node var6 = var2.removeFirstChild();
    int var7 = var2.getChildCount();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var13 = new com.google.javascript.rhino.Node(10, var2, var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.RuntimeException var14 = com.google.javascript.rhino.ScriptRuntime.notFunctionError((java.lang.Object)var2);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test102() {}
//   public void test102() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.CompilerInput var9 = var1.getInput("<No stack trace available>");
// 
//   }

  public void test103() {}
//   public void test103() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     var1.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var5 = null;
//     com.google.javascript.rhino.jstype.JSType var6 = null;
//     com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
//     com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
//     com.google.javascript.rhino.jstype.ObjectType var9 = var1.createAnonymousObjectType();
//     boolean var10 = var9.isVoidType();
//     com.google.javascript.rhino.ErrorReporter var11 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11);
//     boolean var14 = var12.hasNamespace("hi!");
//     var12.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var16 = null;
//     com.google.javascript.rhino.jstype.JSType var17 = null;
//     com.google.javascript.rhino.jstype.JSType[] var18 = new com.google.javascript.rhino.jstype.JSType[] { var17};
//     com.google.javascript.rhino.jstype.FunctionType var19 = var12.createConstructorType(var16, var18);
//     boolean var20 = var19.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType.TypePair var21 = var9.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var19);
//     com.google.javascript.rhino.jstype.Visitor var22 = null;
//     java.lang.Object var23 = var19.visit(var22);
// 
//   }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }


    boolean var1 = com.google.javascript.rhino.ScriptRuntime.isJSLineTerminator(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test105() {}
//   public void test105() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.Collection var1 = var0.getNodes();
//     java.lang.Object var2 = null;
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var3 = var0.getDirectedGraphNode(var2);
//     var0.popEdgeAnnotations();
// 
//   }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }


    boolean var1 = com.google.javascript.rhino.ScriptRuntime.isJSLineTerminator(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }


    com.google.javascript.rhino.EcmaError var2 = com.google.javascript.rhino.ScriptRuntime.constructError("hi!", "hi!");
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

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.Node.newString("");
    var2.putIntProp(100, 1);
    com.google.javascript.rhino.Node[] var6 = new com.google.javascript.rhino.Node[] { var2};
    com.google.javascript.rhino.Node var7 = new com.google.javascript.rhino.Node((-1), var6);
    java.lang.String var11 = var7.toString(false, false, false);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.Node.newString("");
    var14.putIntProp(100, 1);
    com.google.javascript.rhino.Node var18 = var14.removeFirstChild();
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var28 = new com.google.javascript.rhino.Node(1, var14, var20, var25, 1, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.addChildrenToBack(var25);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "ERROR"+ "'", var11.equals("ERROR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }


    com.google.javascript.jscomp.SourceFile var1 = com.google.javascript.jscomp.SourceFile.fromFile("ERROR  100 [synthetic: 1]\n");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.Reader var2 = var1.getCodeReader();
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test110() {}
//   public void test110() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
//     com.google.javascript.rhino.jstype.JSTypeNative var5 = null;
//     com.google.javascript.rhino.jstype.ObjectType var6 = var1.getNativeObjectType(var5);
// 
//   }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.Node.newString("");
    java.lang.String var5 = var1.toString(false, true, false);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("");
    var8.putIntProp(100, 1);
    com.google.javascript.rhino.Node var12 = var8.removeFirstChild();
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var22 = new com.google.javascript.rhino.Node(1, var8, var14, var19, 1, 1);
    boolean var23 = var14.hasSideEffects();
    com.google.javascript.rhino.Node var24 = var1.copyInformationFromForTree(var14);
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
    assertTrue("'" + var5 + "' != '" + "STRING "+ "'", var5.equals("STRING "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.JSModule[] var2 = com.google.javascript.jscomp.JSModule.sortJsModules(var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test113() {}
//   public void test113() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.JSType[] var4 = null;
//     com.google.javascript.rhino.jstype.JSType var5 = var1.createUnionType(var4);
// 
//   }

  public void test114() {}
//   public void test114() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.SourceFile.Generator var6 = null;
//     com.google.javascript.jscomp.JSSourceFile var7 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var6);
//     var7.clearCachedSource();
//     com.google.javascript.jscomp.JSSourceFile[] var9 = new com.google.javascript.jscomp.JSSourceFile[] { var7};
//     com.google.javascript.jscomp.SourceFile.Generator var11 = null;
//     com.google.javascript.jscomp.JSSourceFile var12 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var11);
//     var12.clearCachedSource();
//     com.google.javascript.jscomp.JSSourceFile[] var14 = new com.google.javascript.jscomp.JSSourceFile[] { var12};
//     com.google.javascript.jscomp.CompilerOptions var15 = null;
//     var1.init(var9, var14, var15);
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
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.SourceFile.Generator var9 = null;
//     com.google.javascript.jscomp.JSSourceFile var10 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var9);
//     java.lang.String var11 = var10.getName();
//     com.google.javascript.jscomp.JSSourceFile[] var12 = new com.google.javascript.jscomp.JSSourceFile[] { var10};
//     com.google.javascript.jscomp.JSModule var13 = null;
//     com.google.javascript.jscomp.JSModule[] var14 = new com.google.javascript.jscomp.JSModule[] { var13};
//     com.google.javascript.jscomp.CompilerOptions var15 = null;
//     var1.init(var12, var14, var15);
// 
//   }

  public void test116() {}
//   public void test116() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.Node.newString("");
//     java.lang.String var5 = var1.toString(false, true, false);
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("");
//     var8.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var12 = var8.removeFirstChild();
//     com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var22 = new com.google.javascript.rhino.Node(1, var8, var14, var19, 1, 1);
//     boolean var23 = var14.hasSideEffects();
//     com.google.javascript.rhino.Node var24 = var1.copyInformationFromForTree(var14);
//     boolean var25 = var24.isQualifiedName();
//     com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.Node.newString("");
//     var27.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var31 = var27.removeFirstChild();
//     int var32 = var27.getChildCount();
//     boolean var33 = var27.hasChildren();
//     com.google.javascript.rhino.Node var34 = var24.getChildBefore(var27);
// 
//   }

  public void test117() {}
//   public void test117() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var8 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     java.lang.String[] var9 = var1.toSourceArray();
// 
//   }

  public void test118() {}
//   public void test118() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }
// 
// 
//     com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot var0 = null;
//     com.google.javascript.jscomp.parsing.Config.LanguageMode var3 = null;
//     com.google.javascript.jscomp.parsing.Config var5 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(false, var3, false);
//     com.google.javascript.jscomp.mozilla.rhino.ErrorReporter var6 = null;
//     com.google.javascript.rhino.Node var7 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(var0, "ERROR  100 [synthetic: 1]\n", var5, var6);
// 
//   }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var1 = com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.valueOf("TypeError: ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var6 = new com.google.javascript.rhino.JSTypeExpression(var4, "");
    com.google.javascript.rhino.jstype.StaticScope var7 = null;
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8);
    boolean var11 = var9.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.RecordTypeBuilder var12 = new com.google.javascript.rhino.jstype.RecordTypeBuilder(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.JSType var13 = var6.evaluate(var7, var9);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test121() {}
//   public void test121() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var8 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     var1.processDefines();
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
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Result var8 = var1.getResult();
// 
//   }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }


    java.lang.String var1 = com.google.javascript.rhino.Node.tokenToName(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "or"+ "'", var1.equals("or"));

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }


    com.google.javascript.jscomp.DefaultCodingConvention var0 = new com.google.javascript.jscomp.DefaultCodingConvention();
    boolean var2 = var0.isConstantKey("<No stack trace available>");
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    var7.setIsSyntheticBlock(true);
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.Node.newString("");
    var12.putIntProp(100, 1);
    com.google.javascript.rhino.Node[] var16 = new com.google.javascript.rhino.Node[] { var12};
    com.google.javascript.rhino.Node var17 = new com.google.javascript.rhino.Node((-1), var16);
    java.lang.String var21 = var17.toString(false, false, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var22 = var0.extractClassNameIfRequire(var7, var17);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "ERROR"+ "'", var21.equals("ERROR"));

  }

  public void test125() {}
//   public void test125() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test125"); }
// 
// 
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.EvaluatorException var1 = com.google.javascript.rhino.Context.reportRuntimeError("-1");
//       fail("Expected exception of type com.google.javascript.rhino.EvaluatorException");
//     } catch (com.google.javascript.rhino.EvaluatorException e) {
//       // Expected exception.
//     }
// 
//   }

  public void test126() {}
//   public void test126() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test126"); }
// 
// 
//     com.google.javascript.jscomp.WarningsGuard var0 = null;
//     com.google.javascript.jscomp.WarningsGuard[] var1 = new com.google.javascript.jscomp.WarningsGuard[] { var0};
//     com.google.javascript.jscomp.ComposeWarningsGuard var2 = new com.google.javascript.jscomp.ComposeWarningsGuard(var1);
// 
//   }

  public void test127() {}
//   public void test127() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test127"); }
// 
// 
//     java.util.logging.Logger var0 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
//     com.google.javascript.jscomp.CheckLevel var2 = null;
//     com.google.javascript.jscomp.JSError var3 = null;
//     var1.println(var2, var3);
// 
//   }

  public void test128() {}
//   public void test128() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test128"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.Collection var1 = var0.getNodes();
//     java.lang.String var2 = var0.getName();
//     var0.popEdgeAnnotations();
// 
//   }

  public void test129() {}
//   public void test129() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test129"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var8 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     com.google.javascript.jscomp.PassConfig var9 = null;
//     var1.setPassConfig(var9);
// 
//   }

  public void test130() {}
//   public void test130() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test130"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.lang.Iterable var1 = var0.getDirectedGraphNodes();
//     var0.clearEdgeAnnotations();
//     var0.popNodeAnnotations();
// 
//   }

  public void test131() {}
//   public void test131() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test131"); }
// 
// 
//     java.io.File var0 = null;
//     java.nio.charset.Charset var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromFile(var0, var1);
// 
//   }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test132"); }


    com.google.javascript.rhino.EcmaError var1 = com.google.javascript.rhino.ScriptRuntime.typeError("");
    java.lang.String var2 = var1.details();
    int var3 = var1.getColumnNumber();
    java.lang.String var4 = var1.getLineSource();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "TypeError: "+ "'", var2.equals("TypeError: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test133() {}
//   public void test133() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test133"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.SourceFile.Generator var6 = null;
//     com.google.javascript.jscomp.JSSourceFile var7 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var6);
//     java.lang.String var8 = var7.getName();
//     var7.setOriginalPath("");
//     com.google.javascript.jscomp.JSSourceFile[] var11 = new com.google.javascript.jscomp.JSSourceFile[] { var7};
//     com.google.javascript.jscomp.JSModule var13 = new com.google.javascript.jscomp.JSModule("");
//     com.google.javascript.jscomp.JSModule[] var14 = new com.google.javascript.jscomp.JSModule[] { var13};
//     com.google.javascript.jscomp.CompilerOptions var15 = null;
//     var1.init(var11, var14, var15);
// 
//   }

  public void test134() {}
//   public void test134() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test134"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var8 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.Node.newString("");
//     var12.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var16 = var12.removeFirstChild();
//     com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var26 = new com.google.javascript.rhino.Node(1, var12, var18, var23, 1, 1);
//     com.google.javascript.jscomp.CheckLevel var28 = null;
//     com.google.javascript.jscomp.DiagnosticType var30 = com.google.javascript.jscomp.DiagnosticType.make("", var28, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var32 = null;
//     com.google.javascript.jscomp.DiagnosticType var34 = com.google.javascript.jscomp.DiagnosticType.make("", var32, "(ERROR)");
//     int var35 = var30.compareTo(var34);
//     java.lang.String[] var36 = null;
//     com.google.javascript.jscomp.JSError var37 = com.google.javascript.jscomp.JSError.make("ERROR  100 [synthetic: 1]\n", var26, var30, var36);
//     com.google.javascript.jscomp.CheckLevel var38 = var1.getErrorLevel(var37);
// 
//   }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test135"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("");
    java.io.PrintStream var2 = null;
    com.google.javascript.jscomp.Compiler var3 = new com.google.javascript.jscomp.Compiler(var2);
    com.google.javascript.jscomp.Region var6 = var3.getSourceRegion("", 0);
    com.google.javascript.jscomp.Region var9 = var3.getSourceRegion("", 0);
    com.google.javascript.jscomp.LightweightMessageFormatter var10 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.sortInputsByDeps(var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test136"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var1 = com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.valueOf("LinkedGraph");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test137() {}
//   public void test137() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test137"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Result var5 = var1.getResult();
// 
//   }

  public void test138() {}
//   public void test138() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test138"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     var1.processDefines();
// 
//   }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test139"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.Node.newString("");
    var1.putIntProp(100, 1);
    com.google.javascript.rhino.Node var5 = var1.removeFirstChild();
    int var6 = var1.getChildCount();
    boolean var7 = var1.hasChildren();
    java.lang.Iterable var8 = var1.children();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setDouble(10.0d);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test140"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    java.lang.Object var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var3 = var0.getOutEdges(var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test141() {}
//   public void test141() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test141"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
//     com.google.javascript.rhino.jstype.JSType var6 = var1.getType("STRING ");
//     com.google.javascript.rhino.ErrorReporter var7 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7);
//     boolean var10 = var8.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.FunctionBuilder var11 = new com.google.javascript.rhino.jstype.FunctionBuilder(var8);
//     com.google.javascript.rhino.ErrorReporter var12 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var12);
//     boolean var15 = var13.hasNamespace("hi!");
//     var13.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var17 = null;
//     com.google.javascript.rhino.jstype.JSType var18 = null;
//     com.google.javascript.rhino.jstype.JSType[] var19 = new com.google.javascript.rhino.jstype.JSType[] { var18};
//     com.google.javascript.rhino.jstype.FunctionType var20 = var13.createConstructorType(var17, var19);
//     boolean var21 = var20.canBeCalled();
//     com.google.javascript.rhino.jstype.FunctionBuilder var23 = var11.withReturnType((com.google.javascript.rhino.jstype.JSType)var20, false);
//     com.google.javascript.rhino.ErrorReporter var25 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25);
//     boolean var28 = var26.hasNamespace("hi!");
//     var26.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var30 = null;
//     com.google.javascript.rhino.jstype.JSType var31 = null;
//     com.google.javascript.rhino.jstype.JSType[] var32 = new com.google.javascript.rhino.jstype.JSType[] { var31};
//     com.google.javascript.rhino.jstype.FunctionType var33 = var26.createConstructorType(var30, var32);
//     com.google.javascript.rhino.jstype.FunctionType var34 = var1.createConstructorType((com.google.javascript.rhino.jstype.JSType)var20, true, var32);
// 
//   }

  public void test142() {}
//   public void test142() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test142"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "", true);
//     com.google.javascript.jscomp.CompilerInput var6 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var3, "", false);
//     com.google.javascript.jscomp.JSModule var7 = null;
//     var3.setModule(var7);
//     int var10 = var3.getLineOffset(100);
// 
//   }

  public void test143() {}
//   public void test143() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test143"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.Collection var1 = var0.getNodes();
//     com.google.javascript.rhino.ErrorReporter var2 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
//     boolean var5 = var3.hasNamespace("hi!");
//     var3.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var7 = null;
//     com.google.javascript.rhino.jstype.JSType var8 = null;
//     com.google.javascript.rhino.jstype.JSType[] var9 = new com.google.javascript.rhino.jstype.JSType[] { var8};
//     com.google.javascript.rhino.jstype.FunctionType var10 = var3.createConstructorType(var7, var9);
//     com.google.javascript.rhino.ErrorReporter var11 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11);
//     boolean var14 = var12.hasNamespace("hi!");
//     var12.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var16 = null;
//     com.google.javascript.rhino.jstype.JSType var17 = null;
//     com.google.javascript.rhino.jstype.JSType[] var18 = new com.google.javascript.rhino.jstype.JSType[] { var17};
//     com.google.javascript.rhino.jstype.FunctionType var19 = var12.createConstructorType(var16, var18);
//     boolean var20 = var19.canBeCalled();
//     var10.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var19);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var22 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.Collection var23 = var22.getNodes();
//     java.lang.Iterable var24 = var22.getDirectedGraphNodes();
//     boolean var26 = var0.isConnectedInDirection((java.lang.Object)var10, (java.lang.Object)var24, (java.lang.Object)"TypeError: ");
// 
//   }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test144"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var3 = new com.google.javascript.jscomp.JSModule("");
    var1.addDependency(var3);
    java.util.List var5 = var1.getDependencies();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.ComposeWarningsGuard var6 = new com.google.javascript.jscomp.ComposeWarningsGuard(var5);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test145"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    var1.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var5 = null;
    com.google.javascript.rhino.jstype.JSType var6 = null;
    com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
    com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
    boolean var9 = var8.canBeCalled();
    com.google.javascript.rhino.ErrorReporter var10 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var10);
    boolean var13 = var11.hasNamespace("hi!");
    var11.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var15 = null;
    com.google.javascript.rhino.jstype.JSType var16 = null;
    com.google.javascript.rhino.jstype.JSType[] var17 = new com.google.javascript.rhino.jstype.JSType[] { var16};
    com.google.javascript.rhino.jstype.FunctionType var18 = var11.createConstructorType(var15, var17);
    com.google.javascript.rhino.jstype.ObjectType var19 = var11.createAnonymousObjectType();
    boolean var20 = var19.isVoidType();
    com.google.javascript.rhino.ErrorReporter var21 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21);
    boolean var24 = var22.hasNamespace("hi!");
    var22.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var26 = null;
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.rhino.jstype.JSType[] var28 = new com.google.javascript.rhino.jstype.JSType[] { var27};
    com.google.javascript.rhino.jstype.FunctionType var29 = var22.createConstructorType(var26, var28);
    boolean var30 = var29.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var31 = var19.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var29);
    boolean var32 = var19.isEmptyType();
    boolean var33 = var8.isEquivalentTo((com.google.javascript.rhino.jstype.JSType)var19);
    com.google.javascript.jscomp.JSModule var35 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var37 = new com.google.javascript.jscomp.JSModule("");
    var35.addDependency(var37);
    java.util.List var39 = var35.getDependencies();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.setExtendedInterfaces(var39);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test146"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    var0.pushEdgeAnnotations();
    com.google.javascript.rhino.EcmaError var5 = com.google.javascript.rhino.ScriptRuntime.constructError("ERROR", "(ERROR)");
    com.google.javascript.rhino.EcmaError var8 = com.google.javascript.rhino.ScriptRuntime.constructError("hi!", "hi!");
    java.lang.Object var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var0.isConnected((java.lang.Object)"ERROR", (java.lang.Object)var8, var9);
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
    assertNotNull(var8);

  }

  public void test147() {}
//   public void test147() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test147"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Compiler.CodeBuilder var8 = null;
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.Node.newString("");
//     java.lang.String var15 = var11.toString(false, true, false);
//     com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.Node.newString("");
//     var18.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var22 = var18.removeFirstChild();
//     com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var32 = new com.google.javascript.rhino.Node(1, var18, var24, var29, 1, 1);
//     boolean var33 = var24.hasSideEffects();
//     com.google.javascript.rhino.Node var34 = var11.copyInformationFromForTree(var24);
//     var1.toSource(var8, 1, var34);
// 
//   }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test148"); }


    boolean var1 = com.google.javascript.rhino.Context.isValidOptimizationLevel(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test149"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    var1.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var5 = null;
    com.google.javascript.rhino.jstype.JSType var6 = null;
    com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
    com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
    com.google.javascript.rhino.jstype.ObjectType var9 = var1.createAnonymousObjectType();
    boolean var10 = var9.isVoidType();
    com.google.javascript.rhino.ErrorReporter var11 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11);
    boolean var14 = var12.hasNamespace("hi!");
    var12.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var16 = null;
    com.google.javascript.rhino.jstype.JSType var17 = null;
    com.google.javascript.rhino.jstype.JSType[] var18 = new com.google.javascript.rhino.jstype.JSType[] { var17};
    com.google.javascript.rhino.jstype.FunctionType var19 = var12.createConstructorType(var16, var18);
    boolean var20 = var19.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var21 = var9.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var19);
    java.lang.Iterable var22 = var9.getCtorExtendedInterfaces();
    com.google.javascript.rhino.jstype.JSType var23 = var9.getParameterType();
    java.lang.Iterable var24 = var9.getCtorImplementedInterfaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test150() {}
//   public void test150() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test150"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.lang.Iterable var1 = var0.getDirectedGraphNodes();
//     var0.clearEdgeAnnotations();
//     com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("");
//     java.lang.String var8 = var4.toString(false, true, false);
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.Node.newString("");
//     var11.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var15 = var11.removeFirstChild();
//     com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var25 = new com.google.javascript.rhino.Node(1, var11, var17, var22, 1, 1);
//     boolean var26 = var17.hasSideEffects();
//     com.google.javascript.rhino.Node var27 = var4.copyInformationFromForTree(var17);
//     java.util.Iterator var28 = var0.getNeighborNodesIterator((java.lang.Object)var4);
// 
//   }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test151"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.Node.newString("");
    var1.putIntProp(100, 1);
    com.google.javascript.rhino.Node var5 = var1.removeFirstChild();
    int var6 = var1.getChildCount();
    boolean var7 = var1.hasChildren();
    java.lang.Iterable var8 = var1.children();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var9 = var1.detachFromParent();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test152() {}
//   public void test152() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test152"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     var1.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var5 = null;
//     com.google.javascript.rhino.jstype.JSType var6 = null;
//     com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
//     com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
//     com.google.javascript.rhino.jstype.ObjectType var9 = var1.createAnonymousObjectType();
//     java.util.Map var10 = null;
//     com.google.javascript.rhino.jstype.RecordType var11 = var1.createRecordType(var10);
// 
//   }

  public void test153() {}
//   public void test153() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test153"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
//     com.google.javascript.rhino.ErrorReporter var5 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var5);
//     boolean var8 = var6.hasNamespace("hi!");
//     var6.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var10 = null;
//     com.google.javascript.rhino.jstype.JSType var11 = null;
//     com.google.javascript.rhino.jstype.JSType[] var12 = new com.google.javascript.rhino.jstype.JSType[] { var11};
//     com.google.javascript.rhino.jstype.FunctionType var13 = var6.createConstructorType(var10, var12);
//     boolean var14 = var13.canBeCalled();
//     com.google.javascript.rhino.jstype.FunctionBuilder var16 = var4.withReturnType((com.google.javascript.rhino.jstype.JSType)var13, false);
//     com.google.javascript.rhino.jstype.JSTypeRegistry var17 = null;
//     com.google.javascript.rhino.jstype.FunctionParamBuilder var18 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var17);
//     com.google.javascript.rhino.ErrorReporter var19 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var19);
//     boolean var22 = var20.hasNamespace("hi!");
//     var20.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var24 = null;
//     com.google.javascript.rhino.jstype.JSType var25 = null;
//     com.google.javascript.rhino.jstype.JSType[] var26 = new com.google.javascript.rhino.jstype.JSType[] { var25};
//     com.google.javascript.rhino.jstype.FunctionType var27 = var20.createConstructorType(var24, var26);
//     com.google.javascript.rhino.jstype.ObjectType var28 = var20.createAnonymousObjectType();
//     com.google.javascript.rhino.jstype.JSType[] var29 = new com.google.javascript.rhino.jstype.JSType[] { var28};
//     boolean var30 = var18.addRequiredParams(var29);
//     com.google.javascript.rhino.jstype.FunctionBuilder var31 = var4.withParams(var18);
//     com.google.javascript.rhino.ErrorReporter var32 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32);
//     boolean var35 = var33.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.FunctionBuilder var36 = new com.google.javascript.rhino.jstype.FunctionBuilder(var33);
//     com.google.javascript.rhino.jstype.JSType var38 = var33.getType("STRING ");
//     com.google.javascript.rhino.ErrorReporter var39 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var39);
//     boolean var42 = var40.hasNamespace("hi!");
//     var40.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var44 = null;
//     com.google.javascript.rhino.jstype.JSType var45 = null;
//     com.google.javascript.rhino.jstype.JSType[] var46 = new com.google.javascript.rhino.jstype.JSType[] { var45};
//     com.google.javascript.rhino.jstype.FunctionType var47 = var40.createConstructorType(var44, var46);
//     com.google.javascript.rhino.jstype.ObjectType var48 = var40.createAnonymousObjectType();
//     boolean var49 = var48.isVoidType();
//     com.google.javascript.rhino.ErrorReporter var50 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var50);
//     boolean var53 = var51.hasNamespace("hi!");
//     var51.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var55 = null;
//     com.google.javascript.rhino.jstype.JSType var56 = null;
//     com.google.javascript.rhino.jstype.JSType[] var57 = new com.google.javascript.rhino.jstype.JSType[] { var56};
//     com.google.javascript.rhino.jstype.FunctionType var58 = var51.createConstructorType(var55, var57);
//     boolean var59 = var58.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType.TypePair var60 = var48.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var58);
//     java.lang.Iterable var61 = var58.getAllImplementedInterfaces();
//     com.google.javascript.rhino.jstype.JSType[] var62 = new com.google.javascript.rhino.jstype.JSType[] { var58};
//     com.google.javascript.rhino.Node var63 = var33.createParametersWithVarArgs(var62);
//     boolean var64 = var18.addOptionalParams(var62);
// 
//   }

  public void test154() {}
//   public void test154() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test154"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     var1.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var5 = null;
//     com.google.javascript.rhino.jstype.JSType var6 = null;
//     com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
//     com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
//     com.google.javascript.rhino.ErrorReporter var9 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var9);
//     boolean var12 = var10.hasNamespace("hi!");
//     var10.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var14 = null;
//     com.google.javascript.rhino.jstype.JSType var15 = null;
//     com.google.javascript.rhino.jstype.JSType[] var16 = new com.google.javascript.rhino.jstype.JSType[] { var15};
//     com.google.javascript.rhino.jstype.FunctionType var17 = var10.createConstructorType(var14, var16);
//     boolean var18 = var17.canBeCalled();
//     var8.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var17);
//     boolean var20 = var8.hasCachedValues();
//     var8.clearResolved();
//     java.lang.String var22 = var8.toDebugHashCodeString();
// 
//   }

  public void test155() {}
//   public void test155() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test155"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var8 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     com.google.javascript.jscomp.Compiler.IntermediateState var9 = var1.getState();
//     java.lang.String[] var10 = var1.toSourceArray();
// 
//   }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test156"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
    com.google.javascript.rhino.jstype.JSType var6 = var1.getType("STRING ");
    com.google.javascript.rhino.ErrorReporter var7 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7);
    boolean var10 = var8.hasNamespace("hi!");
    var8.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var12 = null;
    com.google.javascript.rhino.jstype.JSType var13 = null;
    com.google.javascript.rhino.jstype.JSType[] var14 = new com.google.javascript.rhino.jstype.JSType[] { var13};
    com.google.javascript.rhino.jstype.FunctionType var15 = var8.createConstructorType(var12, var14);
    boolean var16 = var15.canBeCalled();
    com.google.javascript.rhino.jstype.JSType var17 = var15.getReturnType();
    com.google.javascript.rhino.jstype.JSType var19 = var1.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType)var15, "");
    var1.setLastGeneration(false);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    var26.setIsSyntheticBlock(true);
    java.lang.String var29 = var26.getString();
    com.google.javascript.rhino.jstype.StaticScope var31 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.JSType var32 = var1.createFromTypeNodes(var26, "", var31);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test157"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    var1.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var5 = null;
    com.google.javascript.rhino.jstype.JSType var6 = null;
    com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
    com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
    com.google.javascript.rhino.ErrorReporter var9 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var9);
    boolean var12 = var10.hasNamespace("hi!");
    var10.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var14 = null;
    com.google.javascript.rhino.jstype.JSType var15 = null;
    com.google.javascript.rhino.jstype.JSType[] var16 = new com.google.javascript.rhino.jstype.JSType[] { var15};
    com.google.javascript.rhino.jstype.FunctionType var17 = var10.createConstructorType(var14, var16);
    boolean var18 = var17.canBeCalled();
    var8.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var17);
    boolean var20 = var17.canBeCalled();
    com.google.javascript.jscomp.JSModule var22 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var24 = new com.google.javascript.jscomp.JSModule("");
    var22.addDependency(var24);
    java.util.List var26 = var22.getDependencies();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var17.setImplementedInterfaces(var26);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test158"); }


    com.google.javascript.jscomp.DiagnosticGroups var0 = new com.google.javascript.jscomp.DiagnosticGroups();

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test159"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.Node.newString("");
    var2.putIntProp(100, 1);
    com.google.javascript.rhino.Node var6 = var2.removeFirstChild();
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var16 = new com.google.javascript.rhino.Node(1, var2, var8, var13, 1, 1);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.Node.newString("");
    var19.putIntProp(100, 1);
    com.google.javascript.rhino.Node var23 = var19.removeFirstChild();
    int var24 = var19.getChildCount();
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var30 = new com.google.javascript.rhino.Node(10, var19, var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var31 = var2.clonePropsFrom(var30);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test160() {}
//   public void test160() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test160"); }
// 
// 
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.Node.newString("");
//     var2.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var6 = var2.removeFirstChild();
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var16 = new com.google.javascript.rhino.Node(1, var2, var8, var13, 1, 1);
//     com.google.javascript.rhino.Node var17 = null;
//     com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.Node.newString("");
//     var19.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var23 = var19.removeFirstChild();
//     int var24 = var19.getChildCount();
//     boolean var25 = var19.hasChildren();
//     java.lang.Iterable var26 = var19.children();
//     var2.addChildAfter(var17, var19);
// 
//   }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test161"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    var1.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var5 = null;
    com.google.javascript.rhino.jstype.JSType var6 = null;
    com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
    com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
    com.google.javascript.rhino.jstype.ObjectType var9 = var1.createAnonymousObjectType();
    com.google.javascript.jscomp.JSModule var11 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var13 = new com.google.javascript.jscomp.JSModule("");
    var11.addDependency(var13);
    java.util.List var15 = var11.getDependencies();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var16 = var1.createParametersWithVarArgs(var15);
      fail("Expected exception of type java.lang.ArrayStoreException");
    } catch (java.lang.ArrayStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test162"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var6 = new com.google.javascript.rhino.JSTypeExpression(var4, "");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var7 = var4.getDouble();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test163() {}
//   public void test163() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test163"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var8 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.Node.newString("");
//     var12.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var16 = var12.removeFirstChild();
//     com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var26 = new com.google.javascript.rhino.Node(1, var12, var18, var23, 1, 1);
//     com.google.javascript.jscomp.CheckLevel var28 = null;
//     com.google.javascript.jscomp.DiagnosticType var30 = com.google.javascript.jscomp.DiagnosticType.make("", var28, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var32 = null;
//     com.google.javascript.jscomp.DiagnosticType var34 = com.google.javascript.jscomp.DiagnosticType.make("", var32, "(ERROR)");
//     int var35 = var30.compareTo(var34);
//     java.lang.String[] var36 = null;
//     com.google.javascript.jscomp.JSError var37 = com.google.javascript.jscomp.JSError.make("ERROR  100 [synthetic: 1]\n", var26, var30, var36);
//     java.lang.String var38 = var8.formatError(var37);
// 
//   }

  public void test164() {}
//   public void test164() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test164"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     java.nio.charset.Charset var3 = null;
//     com.google.javascript.jscomp.JSSourceFile var4 = com.google.javascript.jscomp.JSSourceFile.fromFile("ERROR", var3);
//     com.google.javascript.jscomp.JSSourceFile[] var5 = new com.google.javascript.jscomp.JSSourceFile[] { var4};
//     com.google.javascript.jscomp.JSModule var7 = new com.google.javascript.jscomp.JSModule("");
//     com.google.javascript.jscomp.JSModule var9 = new com.google.javascript.jscomp.JSModule("");
//     var7.addDependency(var9);
//     com.google.javascript.jscomp.JSModule[] var11 = new com.google.javascript.jscomp.JSModule[] { var7};
//     com.google.javascript.jscomp.CompilerOptions var12 = null;
//     var1.init(var5, var11, var12);
// 
//   }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test165"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.EcmaError var1 = com.google.javascript.rhino.ScriptRuntime.typeError0("LinkedGraph");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test166() {}
//   public void test166() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test166"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
//     var1.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSTypeNative var6 = null;
//     com.google.javascript.rhino.jstype.JSTypeNative[] var7 = new com.google.javascript.rhino.jstype.JSTypeNative[] { var6};
//     com.google.javascript.rhino.jstype.JSType var8 = var1.createUnionType(var7);
// 
//   }

  public void test167() {}
//   public void test167() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test167"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.RecordTypeBuilder var4 = new com.google.javascript.rhino.jstype.RecordTypeBuilder(var1);
//     com.google.javascript.rhino.ErrorReporter var5 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var5);
//     boolean var8 = var6.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.FunctionBuilder var9 = new com.google.javascript.rhino.jstype.FunctionBuilder(var6);
//     com.google.javascript.rhino.jstype.JSType var11 = var6.getType("STRING ");
//     com.google.javascript.rhino.ErrorReporter var12 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var12);
//     boolean var15 = var13.hasNamespace("hi!");
//     var13.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var17 = null;
//     com.google.javascript.rhino.jstype.JSType var18 = null;
//     com.google.javascript.rhino.jstype.JSType[] var19 = new com.google.javascript.rhino.jstype.JSType[] { var18};
//     com.google.javascript.rhino.jstype.FunctionType var20 = var13.createConstructorType(var17, var19);
//     com.google.javascript.rhino.jstype.ObjectType var21 = var13.createAnonymousObjectType();
//     boolean var22 = var21.isVoidType();
//     com.google.javascript.rhino.ErrorReporter var23 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var23);
//     boolean var26 = var24.hasNamespace("hi!");
//     var24.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var28 = null;
//     com.google.javascript.rhino.jstype.JSType var29 = null;
//     com.google.javascript.rhino.jstype.JSType[] var30 = new com.google.javascript.rhino.jstype.JSType[] { var29};
//     com.google.javascript.rhino.jstype.FunctionType var31 = var24.createConstructorType(var28, var30);
//     boolean var32 = var31.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType.TypePair var33 = var21.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var31);
//     java.lang.Iterable var34 = var31.getAllImplementedInterfaces();
//     com.google.javascript.rhino.jstype.JSType[] var35 = new com.google.javascript.rhino.jstype.JSType[] { var31};
//     com.google.javascript.rhino.Node var36 = var6.createParametersWithVarArgs(var35);
//     com.google.javascript.rhino.Node var37 = var1.createOptionalParameters(var35);
//     com.google.javascript.rhino.ErrorReporter var38 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var38);
//     boolean var41 = var39.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.FunctionBuilder var42 = new com.google.javascript.rhino.jstype.FunctionBuilder(var39);
//     com.google.javascript.rhino.jstype.JSType var44 = var39.getType("STRING ");
//     com.google.javascript.rhino.ErrorReporter var45 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var45);
//     boolean var48 = var46.hasNamespace("hi!");
//     var46.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var50 = null;
//     com.google.javascript.rhino.jstype.JSType var51 = null;
//     com.google.javascript.rhino.jstype.JSType[] var52 = new com.google.javascript.rhino.jstype.JSType[] { var51};
//     com.google.javascript.rhino.jstype.FunctionType var53 = var46.createConstructorType(var50, var52);
//     boolean var54 = var53.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType var55 = var53.getReturnType();
//     com.google.javascript.rhino.jstype.JSType var57 = var39.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType)var53, "");
//     com.google.javascript.rhino.jstype.JSType var58 = var57.unboxesTo();
//     com.google.javascript.rhino.ErrorReporter var59 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var59);
//     boolean var62 = var60.hasNamespace("hi!");
//     var60.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var64 = null;
//     com.google.javascript.rhino.jstype.JSType var65 = null;
//     com.google.javascript.rhino.jstype.JSType[] var66 = new com.google.javascript.rhino.jstype.JSType[] { var65};
//     com.google.javascript.rhino.jstype.FunctionType var67 = var60.createConstructorType(var64, var66);
//     com.google.javascript.rhino.jstype.FunctionType var68 = var1.createFunctionTypeWithVarArgs(var57, var66);
// 
//   }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test168"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
    com.google.javascript.jscomp.JSModule var6 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var8 = new com.google.javascript.jscomp.JSModule("");
    var6.addDependency(var8);
    java.util.List var10 = var6.getDependencies();
    com.google.javascript.jscomp.NodeTraversal.Callback var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var10, var11);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test169"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
    com.google.javascript.rhino.jstype.JSType var6 = var1.getType("STRING ");
    boolean var8 = var1.isForwardDeclaredType("");
    com.google.javascript.rhino.ErrorReporter var9 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var9);
    boolean var12 = var10.hasNamespace("hi!");
    var10.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var14 = null;
    com.google.javascript.rhino.jstype.JSType var15 = null;
    com.google.javascript.rhino.jstype.JSType[] var16 = new com.google.javascript.rhino.jstype.JSType[] { var15};
    com.google.javascript.rhino.jstype.FunctionType var17 = var10.createConstructorType(var14, var16);
    com.google.javascript.rhino.jstype.ObjectType var18 = var10.createAnonymousObjectType();
    boolean var19 = var18.isVoidType();
    com.google.javascript.rhino.ErrorReporter var20 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var20);
    boolean var23 = var21.hasNamespace("hi!");
    var21.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var25 = null;
    com.google.javascript.rhino.jstype.JSType var26 = null;
    com.google.javascript.rhino.jstype.JSType[] var27 = new com.google.javascript.rhino.jstype.JSType[] { var26};
    com.google.javascript.rhino.jstype.FunctionType var28 = var21.createConstructorType(var25, var27);
    boolean var29 = var28.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var30 = var18.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var28);
    boolean var31 = var18.isEmptyType();
    com.google.javascript.rhino.jstype.JSType var33 = var1.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType)var18, "(ERROR)");
    java.lang.Iterable var35 = var1.getEachReferenceTypeWithProperty("");
    com.google.javascript.jscomp.JSModule var37 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var39 = new com.google.javascript.jscomp.JSModule("");
    var37.addDependency(var39);
    java.util.List var41 = var37.getDependencies();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var42 = var1.createParameters(var41);
      fail("Expected exception of type java.lang.ArrayStoreException");
    } catch (java.lang.ArrayStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test170"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
    com.google.javascript.rhino.jstype.JSType var6 = var1.getType("STRING ");
    com.google.javascript.rhino.ErrorReporter var7 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7);
    boolean var10 = var8.hasNamespace("hi!");
    var8.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var12 = null;
    com.google.javascript.rhino.jstype.JSType var13 = null;
    com.google.javascript.rhino.jstype.JSType[] var14 = new com.google.javascript.rhino.jstype.JSType[] { var13};
    com.google.javascript.rhino.jstype.FunctionType var15 = var8.createConstructorType(var12, var14);
    com.google.javascript.rhino.jstype.ObjectType var16 = var8.createAnonymousObjectType();
    boolean var17 = var16.isVoidType();
    com.google.javascript.rhino.ErrorReporter var18 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18);
    boolean var21 = var19.hasNamespace("hi!");
    var19.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var23 = null;
    com.google.javascript.rhino.jstype.JSType var24 = null;
    com.google.javascript.rhino.jstype.JSType[] var25 = new com.google.javascript.rhino.jstype.JSType[] { var24};
    com.google.javascript.rhino.jstype.FunctionType var26 = var19.createConstructorType(var23, var25);
    boolean var27 = var26.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var28 = var16.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var26);
    java.lang.Iterable var29 = var26.getAllImplementedInterfaces();
    com.google.javascript.rhino.jstype.JSType[] var30 = new com.google.javascript.rhino.jstype.JSType[] { var26};
    com.google.javascript.rhino.Node var31 = var1.createParametersWithVarArgs(var30);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    var36.setIsSyntheticBlock(true);
    java.lang.String var39 = var36.getString();
    java.lang.String var40 = var36.toStringTree();
    com.google.javascript.rhino.jstype.StaticScope var42 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.JSType var43 = var1.createFromTypeNodes(var36, "ERROR  100", var42);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + ""+ "'", var39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "ERROR  100 [synthetic: 1]\n"+ "'", var40.equals("ERROR  100 [synthetic: 1]\n"));

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test171"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
    com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
    com.google.javascript.jscomp.Compiler.IntermediateState var8 = var1.getState();
    com.google.javascript.jscomp.NodeTraversal.Callback var9 = null;
    com.google.javascript.jscomp.NodeTraversal var10 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var1, var9);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    var15.setIsSyntheticBlock(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.traverse(var15);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test172() {}
//   public void test172() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test172"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     var1.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var5 = null;
//     com.google.javascript.rhino.jstype.JSType var6 = null;
//     com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
//     com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
//     boolean var9 = var8.canBeCalled();
//     com.google.javascript.rhino.ErrorReporter var10 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var10);
//     boolean var13 = var11.hasNamespace("hi!");
//     var11.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var15 = null;
//     com.google.javascript.rhino.jstype.JSType var16 = null;
//     com.google.javascript.rhino.jstype.JSType[] var17 = new com.google.javascript.rhino.jstype.JSType[] { var16};
//     com.google.javascript.rhino.jstype.FunctionType var18 = var11.createConstructorType(var15, var17);
//     com.google.javascript.rhino.jstype.ObjectType var19 = var11.createAnonymousObjectType();
//     boolean var20 = var19.isVoidType();
//     com.google.javascript.rhino.ErrorReporter var21 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21);
//     boolean var24 = var22.hasNamespace("hi!");
//     var22.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var26 = null;
//     com.google.javascript.rhino.jstype.JSType var27 = null;
//     com.google.javascript.rhino.jstype.JSType[] var28 = new com.google.javascript.rhino.jstype.JSType[] { var27};
//     com.google.javascript.rhino.jstype.FunctionType var29 = var22.createConstructorType(var26, var28);
//     boolean var30 = var29.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType.TypePair var31 = var19.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var29);
//     boolean var32 = var19.isEmptyType();
//     boolean var33 = var8.isEquivalentTo((com.google.javascript.rhino.jstype.JSType)var19);
//     com.google.javascript.rhino.jstype.FunctionPrototypeType var34 = null;
//     boolean var35 = var8.setPrototype(var34);
//     com.google.javascript.rhino.jstype.Visitor var36 = null;
//     java.lang.Object var37 = var8.visit(var36);
// 
//   }

  public void test173() {}
//   public void test173() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test173"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var1);
//     com.google.javascript.jscomp.Region var4 = var2.getRegion(409600);
// 
//   }

  public void test174() {}
//   public void test174() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test174"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticGroup var0 = null;
//     com.google.javascript.jscomp.CheckLevel var1 = null;
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var2 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var0, var1);
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.Node.newString("");
//     var6.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var10 = var6.removeFirstChild();
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var20 = new com.google.javascript.rhino.Node(1, var6, var12, var17, 1, 1);
//     com.google.javascript.jscomp.CheckLevel var22 = null;
//     com.google.javascript.jscomp.DiagnosticType var24 = com.google.javascript.jscomp.DiagnosticType.make("", var22, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var26 = null;
//     com.google.javascript.jscomp.DiagnosticType var28 = com.google.javascript.jscomp.DiagnosticType.make("", var26, "(ERROR)");
//     int var29 = var24.compareTo(var28);
//     java.lang.String[] var30 = null;
//     com.google.javascript.jscomp.JSError var31 = com.google.javascript.jscomp.JSError.make("ERROR  100 [synthetic: 1]\n", var20, var24, var30);
//     com.google.javascript.jscomp.CheckLevel var32 = var2.level(var31);
// 
//   }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test175"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.PropertyRenamingPolicy var1 = com.google.javascript.jscomp.PropertyRenamingPolicy.valueOf("STRING ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test176() {}
//   public void test176() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test176"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = com.google.javascript.rhino.Context.getCurrentContext();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var0);
// 
//   }

  public void test177() {}
//   public void test177() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test177"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     var1.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var5 = null;
//     com.google.javascript.rhino.jstype.JSType var6 = null;
//     com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
//     com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
//     com.google.javascript.rhino.ErrorReporter var9 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var9);
//     boolean var12 = var10.hasNamespace("hi!");
//     var10.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var14 = null;
//     com.google.javascript.rhino.jstype.JSType var15 = null;
//     com.google.javascript.rhino.jstype.JSType[] var16 = new com.google.javascript.rhino.jstype.JSType[] { var15};
//     com.google.javascript.rhino.jstype.FunctionType var17 = var10.createConstructorType(var14, var16);
//     boolean var18 = var17.canBeCalled();
//     var8.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var17);
//     boolean var20 = var8.hasCachedValues();
//     com.google.javascript.rhino.jstype.Visitor var21 = null;
//     java.lang.Object var22 = var8.visit(var21);
// 
//   }

  public void test178() {}
//   public void test178() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test178"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var8 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     com.google.javascript.jscomp.Compiler.IntermediateState var9 = var1.getState();
//     com.google.javascript.jscomp.PassConfig var10 = null;
//     var1.setPassConfig(var10);
// 
//   }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test179"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.lang.Iterable var1 = var0.getDirectedGraphNodes();
    var0.clearEdgeAnnotations();
    com.google.javascript.rhino.ErrorReporter var3 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var3);
    boolean var6 = var4.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var7 = new com.google.javascript.rhino.jstype.FunctionBuilder(var4);
    com.google.javascript.rhino.jstype.JSType var9 = var4.getType("STRING ");
    boolean var11 = var4.isForwardDeclaredType("");
    com.google.javascript.rhino.ErrorReporter var12 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var12);
    boolean var15 = var13.hasNamespace("hi!");
    var13.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var17 = null;
    com.google.javascript.rhino.jstype.JSType var18 = null;
    com.google.javascript.rhino.jstype.JSType[] var19 = new com.google.javascript.rhino.jstype.JSType[] { var18};
    com.google.javascript.rhino.jstype.FunctionType var20 = var13.createConstructorType(var17, var19);
    com.google.javascript.rhino.jstype.ObjectType var21 = var13.createAnonymousObjectType();
    boolean var22 = var21.isVoidType();
    com.google.javascript.rhino.ErrorReporter var23 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var23);
    boolean var26 = var24.hasNamespace("hi!");
    var24.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var28 = null;
    com.google.javascript.rhino.jstype.JSType var29 = null;
    com.google.javascript.rhino.jstype.JSType[] var30 = new com.google.javascript.rhino.jstype.JSType[] { var29};
    com.google.javascript.rhino.jstype.FunctionType var31 = var24.createConstructorType(var28, var30);
    boolean var32 = var31.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var33 = var21.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var31);
    boolean var34 = var21.isEmptyType();
    com.google.javascript.rhino.jstype.JSType var36 = var4.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType)var21, "(ERROR)");
    java.lang.Iterable var38 = var4.getEachReferenceTypeWithProperty("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var39 = var0.getDirectedPredNodes((java.lang.Object)var38);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test180() {}
//   public void test180() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test180"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     com.google.javascript.rhino.Node var1 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(var0);
// 
//   }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test181"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSDocInfo var5 = null;
    var4.setJSDocInfo(var5);
    com.google.javascript.rhino.Node var8 = var4.getChildAtIndex(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var10 = var4.getExistingIntProp(10);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test182() {}
//   public void test182() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test182"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Compiler.IntermediateState var8 = var1.getState();
//     com.google.javascript.jscomp.NodeTraversal.Callback var9 = null;
//     com.google.javascript.jscomp.NodeTraversal var10 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var1, var9);
//     var1.parse();
// 
//   }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test183"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.Node.newString("");
    var2.putIntProp(100, 1);
    com.google.javascript.rhino.Node var6 = var2.removeFirstChild();
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var16 = new com.google.javascript.rhino.Node(1, var2, var8, var13, 1, 1);
    com.google.javascript.rhino.Node var17 = var8.getNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var19 = var8.getExistingIntProp((-1));
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test184"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromCode("", "ERROR  100");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test185"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.rhino.ErrorReporter var1 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var1);
    boolean var4 = var2.hasNamespace("hi!");
    var2.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var6 = null;
    com.google.javascript.rhino.jstype.JSType var7 = null;
    com.google.javascript.rhino.jstype.JSType[] var8 = new com.google.javascript.rhino.jstype.JSType[] { var7};
    com.google.javascript.rhino.jstype.FunctionType var9 = var2.createConstructorType(var6, var8);
    com.google.javascript.rhino.ErrorReporter var10 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var10);
    boolean var13 = var11.hasNamespace("hi!");
    var11.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var15 = null;
    com.google.javascript.rhino.jstype.JSType var16 = null;
    com.google.javascript.rhino.jstype.JSType[] var17 = new com.google.javascript.rhino.jstype.JSType[] { var16};
    com.google.javascript.rhino.jstype.FunctionType var18 = var11.createConstructorType(var15, var17);
    boolean var19 = var18.canBeCalled();
    var9.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var18);
    boolean var21 = var18.canBeCalled();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var22 = var0.getDirectedSuccNodes((java.lang.Object)var21);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test186"); }


    java.lang.Object var1 = null;
    com.google.javascript.rhino.ErrorReporter var2 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
    boolean var5 = var3.hasNamespace("hi!");
    var3.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var7 = null;
    com.google.javascript.rhino.jstype.JSType var8 = null;
    com.google.javascript.rhino.jstype.JSType[] var9 = new com.google.javascript.rhino.jstype.JSType[] { var8};
    com.google.javascript.rhino.jstype.FunctionType var10 = var3.createConstructorType(var7, var9);
    com.google.javascript.rhino.ErrorReporter var11 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11);
    boolean var14 = var12.hasNamespace("hi!");
    var12.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var16 = null;
    com.google.javascript.rhino.jstype.JSType var17 = null;
    com.google.javascript.rhino.jstype.JSType[] var18 = new com.google.javascript.rhino.jstype.JSType[] { var17};
    com.google.javascript.rhino.jstype.FunctionType var19 = var12.createConstructorType(var16, var18);
    boolean var20 = var19.canBeCalled();
    var10.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var19);
    boolean var22 = var10.hasCachedValues();
    java.lang.Object var23 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var24 = com.google.javascript.rhino.ScriptRuntime.getMessage3("JSDocInfo", var1, (java.lang.Object)var22, var23);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test187"); }


    long var1 = com.google.javascript.rhino.ScriptRuntime.testUint32String("-1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test188"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var3 = new com.google.javascript.jscomp.JSModule("");
    var1.addDependency(var3);
    var1.setDepth(100);
    java.io.PrintStream var7 = null;
    com.google.javascript.jscomp.Compiler var8 = new com.google.javascript.jscomp.Compiler(var7);
    com.google.javascript.jscomp.Region var11 = var8.getSourceRegion("", 0);
    com.google.javascript.jscomp.Region var14 = var8.getSourceRegion("", 0);
    com.google.javascript.jscomp.LightweightMessageFormatter var15 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var8);
    com.google.javascript.jscomp.Compiler.IntermediateState var16 = var8.getState();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.sortInputsByDeps(var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test189"); }


    com.google.javascript.rhino.EcmaError var2 = com.google.javascript.rhino.ScriptRuntime.constructError("hi!", "hi!");
    int var3 = var2.getLineNumber();
    int var4 = var2.getLineNumber();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test190() {}
//   public void test190() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test190"); }
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

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test191"); }


    com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromCode("ERROR", "<No stack trace available>");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test192() {}
//   public void test192() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test192"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "", true);
//     com.google.javascript.jscomp.CompilerInput var6 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var3, "", false);
//     com.google.javascript.jscomp.JSModule var7 = null;
//     var3.setModule(var7);
//     java.lang.String var9 = var3.getCode();
// 
//   }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test193"); }


    com.google.javascript.rhino.JSDocInfoBuilder var2 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var9 = new com.google.javascript.rhino.JSTypeExpression(var7, "");
    boolean var11 = var9.equals((java.lang.Object)'4');
    boolean var12 = var2.recordBaseType(var9);
    boolean var13 = var2.recordExport();
    com.google.javascript.rhino.ErrorReporter var14 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var14);
    boolean var17 = var15.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var18 = new com.google.javascript.rhino.jstype.FunctionBuilder(var15);
    com.google.javascript.rhino.jstype.JSType var20 = var15.getType("STRING ");
    boolean var22 = var15.isForwardDeclaredType("");
    com.google.javascript.rhino.ErrorReporter var23 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var23);
    boolean var26 = var24.hasNamespace("hi!");
    var24.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var28 = null;
    com.google.javascript.rhino.jstype.JSType var29 = null;
    com.google.javascript.rhino.jstype.JSType[] var30 = new com.google.javascript.rhino.jstype.JSType[] { var29};
    com.google.javascript.rhino.jstype.FunctionType var31 = var24.createConstructorType(var28, var30);
    com.google.javascript.rhino.ErrorReporter var32 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32);
    boolean var35 = var33.hasNamespace("hi!");
    var33.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var37 = null;
    com.google.javascript.rhino.jstype.JSType var38 = null;
    com.google.javascript.rhino.jstype.JSType[] var39 = new com.google.javascript.rhino.jstype.JSType[] { var38};
    com.google.javascript.rhino.jstype.FunctionType var40 = var33.createConstructorType(var37, var39);
    boolean var41 = var40.canBeCalled();
    var31.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var40);
    boolean var43 = var40.canBeCalled();
    com.google.javascript.rhino.jstype.ObjectType var44 = var15.createObjectType((com.google.javascript.rhino.jstype.ObjectType)var40);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var45 = com.google.javascript.rhino.ScriptRuntime.getMessage2("hi!", (java.lang.Object)var13, (java.lang.Object)var40);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test194() {}
//   public void test194() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test194"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Compiler.IntermediateState var8 = var1.getState();
//     java.lang.String var11 = var1.getSourceLine("hi!", 10);
// 
//   }

  public void test195() {}
//   public void test195() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test195"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var8 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     com.google.javascript.jscomp.JSModule var10 = new com.google.javascript.jscomp.JSModule("");
//     com.google.javascript.jscomp.JSModule var12 = new com.google.javascript.jscomp.JSModule("");
//     var10.addDependency(var12);
//     java.util.List var14 = var10.getDependencies();
//     java.util.List var15 = var10.getRequires();
//     com.google.javascript.rhino.JSDocInfo var16 = new com.google.javascript.rhino.JSDocInfo();
//     java.lang.String var17 = var16.getOriginalCommentString();
//     boolean var18 = var16.isOverride();
//     java.util.List var19 = var16.getThrownTypes();
//     com.google.javascript.jscomp.CompilerOptions var20 = null;
//     var1.initModules(var15, var19, var20);
// 
//   }

  public void test196() {}
//   public void test196() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test196"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var8 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     java.util.List var9 = null;
//     com.google.javascript.jscomp.JSModule var11 = new com.google.javascript.jscomp.JSModule("");
//     com.google.javascript.jscomp.JSModule var13 = new com.google.javascript.jscomp.JSModule("");
//     var11.addDependency(var13);
//     java.util.List var15 = var11.getDependencies();
//     java.util.List var16 = var11.getRequires();
//     com.google.javascript.jscomp.CompilerOptions var17 = null;
//     com.google.javascript.jscomp.Result var18 = var1.compileModules(var9, var16, var17);
// 
//   }

  public void test197() {}
//   public void test197() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test197"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
//     com.google.javascript.rhino.jstype.JSTypeNative var5 = null;
//     com.google.javascript.rhino.jstype.JSType var6 = var1.getNativeType(var5);
// 
//   }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test198"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.Node.newString("");
    var2.putIntProp(100, 1);
    com.google.javascript.rhino.Node var6 = var2.removeFirstChild();
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var16 = new com.google.javascript.rhino.Node(1, var2, var8, var13, 1, 1);
    com.google.javascript.rhino.JSDocInfo var17 = var8.getJSDocInfo();
    var8.setSourcePositionForTree(100);
    java.lang.String var20 = var8.getString();
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.Node.newString("");
    var23.putIntProp(100, 1);
    com.google.javascript.rhino.Node[] var27 = new com.google.javascript.rhino.Node[] { var23};
    com.google.javascript.rhino.Node var28 = new com.google.javascript.rhino.Node((-1), var27);
    java.lang.String var32 = var28.toString(false, false, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var33 = var8.removeChildAfter(var28);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "ERROR"+ "'", var32.equals("ERROR"));

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test199"); }


    java.lang.String var1 = com.google.javascript.rhino.ScriptRuntime.escapeString("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test200() {}
//   public void test200() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test200"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
//     com.google.javascript.rhino.ErrorReporter var5 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var5);
//     boolean var8 = var6.hasNamespace("hi!");
//     var6.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var10 = null;
//     com.google.javascript.rhino.jstype.JSType var11 = null;
//     com.google.javascript.rhino.jstype.JSType[] var12 = new com.google.javascript.rhino.jstype.JSType[] { var11};
//     com.google.javascript.rhino.jstype.FunctionType var13 = var6.createConstructorType(var10, var12);
//     boolean var14 = var13.canBeCalled();
//     com.google.javascript.rhino.jstype.FunctionBuilder var16 = var4.withReturnType((com.google.javascript.rhino.jstype.JSType)var13, false);
//     com.google.javascript.rhino.jstype.JSTypeRegistry var17 = null;
//     com.google.javascript.rhino.jstype.FunctionParamBuilder var18 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var17);
//     com.google.javascript.rhino.ErrorReporter var19 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var19);
//     boolean var22 = var20.hasNamespace("hi!");
//     var20.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var24 = null;
//     com.google.javascript.rhino.jstype.JSType var25 = null;
//     com.google.javascript.rhino.jstype.JSType[] var26 = new com.google.javascript.rhino.jstype.JSType[] { var25};
//     com.google.javascript.rhino.jstype.FunctionType var27 = var20.createConstructorType(var24, var26);
//     com.google.javascript.rhino.jstype.ObjectType var28 = var20.createAnonymousObjectType();
//     com.google.javascript.rhino.jstype.JSType[] var29 = new com.google.javascript.rhino.jstype.JSType[] { var28};
//     boolean var30 = var18.addRequiredParams(var29);
//     com.google.javascript.rhino.jstype.FunctionBuilder var31 = var4.withParams(var18);
//     com.google.javascript.rhino.jstype.FunctionParamBuilder var32 = null;
//     com.google.javascript.rhino.jstype.FunctionBuilder var33 = var31.withParams(var32);
// 
//   }

  public void test201() {}
//   public void test201() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test201"); }
// 
// 
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.Node.newString("");
//     var2.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var6 = var2.removeFirstChild();
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var16 = new com.google.javascript.rhino.Node(1, var2, var8, var13, 1, 1);
//     com.google.javascript.rhino.Node var17 = null;
//     com.google.javascript.rhino.Node var18 = var8.copyInformationFromForTree(var17);
// 
//   }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test202"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
    com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
    com.google.javascript.jscomp.Compiler.IntermediateState var8 = var1.getState();
    com.google.javascript.jscomp.NodeTraversal.Callback var9 = null;
    com.google.javascript.jscomp.NodeTraversal var10 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var1, var9);
    com.google.javascript.jscomp.DefaultCodingConvention var11 = new com.google.javascript.jscomp.DefaultCodingConvention();
    com.google.javascript.rhino.jstype.FunctionType var12 = null;
    com.google.javascript.rhino.jstype.FunctionType var13 = null;
    com.google.javascript.jscomp.CodingConvention.SubclassType var14 = null;
    var11.applySubclassRelationship(var12, var13, var14);
    java.lang.String var16 = var11.getDelegateSuperclassName();
    java.io.PrintStream var17 = null;
    com.google.javascript.jscomp.Compiler var18 = new com.google.javascript.jscomp.Compiler(var17);
    com.google.javascript.jscomp.Region var21 = var18.getSourceRegion("", 0);
    com.google.javascript.jscomp.Region var24 = var18.getSourceRegion("", 0);
    com.google.javascript.jscomp.Compiler.IntermediateState var25 = var18.getState();
    com.google.javascript.jscomp.NodeTraversal.Callback var26 = null;
    com.google.javascript.jscomp.NodeTraversal var27 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var18, var26);
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.Node.newString("");
    boolean var30 = var29.hasChildren();
    com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSDocInfo var36 = null;
    var35.setJSDocInfo(var36);
    com.google.javascript.rhino.Node var39 = var35.getChildAtIndex(0);
    var29.addChildrenToFront(var35);
    com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast var41 = var11.getObjectLiteralCast(var27, var35);
    java.lang.Iterable var42 = var35.siblings();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.traverse(var35);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test203() {}
//   public void test203() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test203"); }
// 
// 
//     com.google.javascript.jscomp.DefaultCodingConvention var0 = new com.google.javascript.jscomp.DefaultCodingConvention();
//     com.google.javascript.rhino.jstype.FunctionType var1 = null;
//     com.google.javascript.rhino.jstype.FunctionType var2 = null;
//     com.google.javascript.jscomp.CodingConvention.SubclassType var3 = null;
//     var0.applySubclassRelationship(var1, var2, var3);
//     java.lang.String var5 = var0.getDelegateSuperclassName();
//     boolean var7 = var0.isConstant("ERROR  100 [synthetic: 1]\n");
//     java.lang.String var8 = var0.getExportSymbolFunction();
//     com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.Node.newString("");
//     boolean var11 = var10.hasChildren();
//     com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.JSDocInfo var17 = null;
//     var16.setJSDocInfo(var17);
//     com.google.javascript.rhino.Node var20 = var16.getChildAtIndex(0);
//     var10.addChildrenToFront(var16);
//     boolean var22 = var0.isVarArgsParameter(var10);
// 
//   }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test204"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.JSSourceFile var1 = com.google.javascript.jscomp.JSSourceFile.fromFile("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test205"); }


    com.google.javascript.rhino.ErrorReporter var1 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var1);
    boolean var4 = var2.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.RecordTypeBuilder var5 = new com.google.javascript.rhino.jstype.RecordTypeBuilder(var2);
    com.google.javascript.rhino.ErrorReporter var6 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var6);
    boolean var9 = var7.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var10 = new com.google.javascript.rhino.jstype.FunctionBuilder(var7);
    com.google.javascript.rhino.jstype.JSType var12 = var7.getType("STRING ");
    com.google.javascript.rhino.ErrorReporter var13 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13);
    boolean var16 = var14.hasNamespace("hi!");
    var14.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var18 = null;
    com.google.javascript.rhino.jstype.JSType var19 = null;
    com.google.javascript.rhino.jstype.JSType[] var20 = new com.google.javascript.rhino.jstype.JSType[] { var19};
    com.google.javascript.rhino.jstype.FunctionType var21 = var14.createConstructorType(var18, var20);
    com.google.javascript.rhino.jstype.ObjectType var22 = var14.createAnonymousObjectType();
    boolean var23 = var22.isVoidType();
    com.google.javascript.rhino.ErrorReporter var24 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24);
    boolean var27 = var25.hasNamespace("hi!");
    var25.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var29 = null;
    com.google.javascript.rhino.jstype.JSType var30 = null;
    com.google.javascript.rhino.jstype.JSType[] var31 = new com.google.javascript.rhino.jstype.JSType[] { var30};
    com.google.javascript.rhino.jstype.FunctionType var32 = var25.createConstructorType(var29, var31);
    boolean var33 = var32.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var34 = var22.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var32);
    java.lang.Iterable var35 = var32.getAllImplementedInterfaces();
    com.google.javascript.rhino.jstype.JSType[] var36 = new com.google.javascript.rhino.jstype.JSType[] { var32};
    com.google.javascript.rhino.Node var37 = var7.createParametersWithVarArgs(var36);
    com.google.javascript.rhino.Node var38 = var2.createOptionalParameters(var36);
    var38.setIsSyntheticBlock(false);
    com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.Node.newString("");
    java.lang.String var46 = var42.toString(false, true, false);
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.Node.newString("");
    var49.putIntProp(100, 1);
    com.google.javascript.rhino.Node var53 = var49.removeFirstChild();
    com.google.javascript.rhino.Node var55 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var60 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var63 = new com.google.javascript.rhino.Node(1, var49, var55, var60, 1, 1);
    boolean var64 = var55.hasSideEffects();
    com.google.javascript.rhino.Node var65 = var42.copyInformationFromForTree(var55);
    com.google.javascript.rhino.Node var66 = var55.cloneNode();
    com.google.javascript.jscomp.DefaultCodingConvention var67 = new com.google.javascript.jscomp.DefaultCodingConvention();
    boolean var69 = var67.isConstantKey("<No stack trace available>");
    com.google.javascript.rhino.Node var72 = com.google.javascript.rhino.Node.newString("");
    var72.putIntProp(100, 1);
    com.google.javascript.rhino.Node var76 = var72.removeFirstChild();
    com.google.javascript.rhino.Node var78 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var83 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var86 = new com.google.javascript.rhino.Node(1, var72, var78, var83, 1, 1);
    java.lang.String var87 = var67.getSingletonGetterClassName(var83);
    int var88 = var83.getType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var89 = new com.google.javascript.rhino.Node(1, var38, var66, var83);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "STRING "+ "'", var46.equals("STRING "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == (-1));

  }

  public void test206() {}
//   public void test206() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test206"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Compiler.IntermediateState var8 = var1.getState();
//     com.google.javascript.jscomp.NodeTraversal.Callback var9 = null;
//     com.google.javascript.jscomp.NodeTraversal var10 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var1, var9);
//     com.google.javascript.rhino.Node var11 = var10.getScopeRoot();
// 
//   }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test207"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.Node.newString("");
    java.lang.String var5 = var1.toString(false, true, false);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("");
    var8.putIntProp(100, 1);
    com.google.javascript.rhino.Node var12 = var8.removeFirstChild();
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var22 = new com.google.javascript.rhino.Node(1, var8, var14, var19, 1, 1);
    boolean var23 = var14.hasSideEffects();
    com.google.javascript.rhino.Node var24 = var1.copyInformationFromForTree(var14);
    com.google.javascript.rhino.Node var25 = var14.cloneNode();
    java.lang.String var26 = com.google.javascript.jscomp.NodeUtil.getSourceName(var25);
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.Node.newString("");
    var29.putIntProp(100, 1);
    com.google.javascript.rhino.Node var33 = var29.removeFirstChild();
    int var34 = var29.getChildCount();
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var40 = new com.google.javascript.rhino.Node(10, var29, var39);
    com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.Node.newString("");
    boolean var43 = var42.hasChildren();
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSDocInfo var49 = null;
    var48.setJSDocInfo(var49);
    com.google.javascript.rhino.Node var52 = var48.getChildAtIndex(0);
    var42.addChildrenToFront(var48);
    java.util.Collection var54 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(var48);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var25.addChildAfter(var29, var48);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "STRING "+ "'", var5.equals("STRING "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test208() {}
//   public void test208() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test208"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.Collection var1 = var0.getNodes();
//     java.lang.Iterable var2 = var0.getDirectedGraphNodes();
//     java.util.List var3 = var0.getGraphvizNodes();
//     com.google.javascript.jscomp.JSModuleGraph var4 = new com.google.javascript.jscomp.JSModuleGraph(var3);
//     com.google.javascript.jscomp.JSModule var6 = new com.google.javascript.jscomp.JSModule("");
//     com.google.javascript.jscomp.JSModule var7 = null;
//     com.google.javascript.jscomp.JSModule var8 = var4.getDeepestCommonDependencyInclusive(var6, var7);
// 
//   }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test209"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.EcmaError var3 = com.google.javascript.rhino.ScriptRuntime.typeError2("<No stack trace available>", "<No stack trace available>", "STRING ");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test210"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Set var1 = var0.getSuppressions();
    boolean var2 = var0.isConstructor();
    boolean var3 = var0.isExterns();
    boolean var4 = var0.isHidden();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test211() {}
//   public void test211() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test211"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "", true);
//     com.google.javascript.jscomp.CompilerInput var6 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var3, "", false);
//     com.google.javascript.jscomp.JSModule var7 = null;
//     var3.setModule(var7);
//     java.util.Collection var9 = var3.getRequires();
// 
//   }

  public void test212() {}
//   public void test212() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test212"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "", true);
//     com.google.javascript.jscomp.SourceFile var4 = var3.getSourceFile();
// 
//   }

  public void test213() {}
//   public void test213() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test213"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.JSError[] var8 = var1.getWarnings();
// 
//   }

  public void test214() {}
//   public void test214() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test214"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "", true);
//     com.google.javascript.jscomp.CompilerInput var6 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var3, "", false);
//     com.google.javascript.jscomp.JSModule var7 = null;
//     var3.setModule(var7);
//     com.google.javascript.jscomp.CompilerInput var10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var3, false);
// 
//   }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test215"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var3 = new com.google.javascript.jscomp.JSModule("");
    var1.addDependency(var3);
    java.util.List var5 = var1.getDependencies();
    java.util.List var6 = var1.getRequires();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.deps.SortedDependencies var7 = new com.google.javascript.jscomp.deps.SortedDependencies(var6);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test216"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("");
    var3.putIntProp(100, 1);
    com.google.javascript.rhino.Node var7 = var3.removeFirstChild();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var17 = new com.google.javascript.rhino.Node(1, var3, var9, var14, 1, 1);
    var17.setType(409600);
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.Node.newString("");
    var22.putIntProp(100, 1);
    com.google.javascript.rhino.Node var26 = var22.removeFirstChild();
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var36 = new com.google.javascript.rhino.Node(1, var22, var28, var33, 1, 1);
    com.google.javascript.rhino.Node var37 = var28.getNext();
    int var39 = var28.getIntProp(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var40 = new com.google.javascript.rhino.Node(0, var17, var28);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test217"); }


    com.google.javascript.jscomp.SourceFile var1 = com.google.javascript.jscomp.SourceFile.fromFile("ERROR  100 [synthetic: 1]\n");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.getOriginalPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "ERROR  100 [synthetic: 1]\n"+ "'", var2.equals("ERROR  100 [synthetic: 1]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "ERROR  100 [synthetic: 1]\n"+ "'", var3.equals("ERROR  100 [synthetic: 1]\n"));

  }

  public void test218() {}
//   public void test218() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test218"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Compiler.IntermediateState var8 = var1.getState();
//     com.google.javascript.jscomp.NodeTraversal.Callback var9 = null;
//     com.google.javascript.jscomp.NodeTraversal var10 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var1, var9);
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.Node.newString("");
//     boolean var13 = var12.hasChildren();
//     com.google.javascript.jscomp.CheckLevel var15 = null;
//     com.google.javascript.jscomp.DiagnosticType var17 = com.google.javascript.jscomp.DiagnosticType.make("", var15, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var19 = null;
//     com.google.javascript.jscomp.DiagnosticType var21 = com.google.javascript.jscomp.DiagnosticType.make("", var19, "(ERROR)");
//     int var22 = var17.compareTo(var21);
//     java.lang.String[] var24 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var25 = com.google.javascript.jscomp.JSError.make(var21, var24);
//     java.lang.String[] var27 = new java.lang.String[] { ""};
//     var10.report(var12, var21, var27);
// 
//   }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test219"); }


    com.google.javascript.jscomp.DefaultCodingConvention var0 = new com.google.javascript.jscomp.DefaultCodingConvention();
    com.google.javascript.rhino.jstype.FunctionType var1 = null;
    com.google.javascript.rhino.jstype.FunctionType var2 = null;
    com.google.javascript.jscomp.CodingConvention.SubclassType var3 = null;
    var0.applySubclassRelationship(var1, var2, var3);
    java.lang.String var5 = var0.getDelegateSuperclassName();
    boolean var7 = var0.isConstant("ERROR  100 [synthetic: 1]\n");
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("");
    var9.setWasEmptyNode(true);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.Node.newString("");
    var13.putIntProp(100, 1);
    com.google.javascript.rhino.Node var17 = var13.removeFirstChild();
    int var18 = var13.getChildCount();
    boolean var19 = var13.hasChildren();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var20 = var0.extractClassNameIfRequire(var9, var13);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test220() {}
//   public void test220() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test220"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     var1.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var5 = null;
//     com.google.javascript.rhino.jstype.JSType var6 = null;
//     com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
//     com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
//     com.google.javascript.rhino.jstype.ObjectType var9 = var1.createAnonymousObjectType();
//     com.google.javascript.rhino.jstype.JSTypeNative var10 = null;
//     com.google.javascript.rhino.jstype.JSType var11 = var1.getNativeType(var10);
// 
//   }

  public void test221() {}
//   public void test221() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test221"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
//     com.google.javascript.rhino.jstype.JSType var6 = var1.getType("STRING ");
//     com.google.javascript.rhino.ErrorReporter var7 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7);
//     boolean var10 = var8.hasNamespace("hi!");
//     var8.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var12 = null;
//     com.google.javascript.rhino.jstype.JSType var13 = null;
//     com.google.javascript.rhino.jstype.JSType[] var14 = new com.google.javascript.rhino.jstype.JSType[] { var13};
//     com.google.javascript.rhino.jstype.FunctionType var15 = var8.createConstructorType(var12, var14);
//     boolean var16 = var15.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType var17 = var15.getReturnType();
//     com.google.javascript.rhino.jstype.JSType var19 = var1.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType)var15, "");
//     com.google.javascript.rhino.jstype.JSType var24 = var1.createNamedType("hi!", "ERROR  100", 409600, 0);
//     com.google.javascript.rhino.jstype.JSTypeNative var25 = null;
//     com.google.javascript.rhino.jstype.FunctionType var26 = var1.getNativeFunctionType(var25);
// 
//   }

  public void test222() {}
//   public void test222() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test222"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     var1.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var5 = null;
//     com.google.javascript.rhino.jstype.JSType var6 = null;
//     com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
//     com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
//     com.google.javascript.rhino.jstype.ObjectType var9 = var1.createAnonymousObjectType();
//     com.google.javascript.rhino.jstype.StaticScope var10 = null;
//     var1.resolveTypesInScope(var10);
//     com.google.javascript.rhino.jstype.StaticScope var12 = null;
//     com.google.javascript.rhino.jstype.JSType var17 = var1.getType(var12, "<No stack trace available>", "ERROR  100", 0, 100);
//     com.google.javascript.rhino.jstype.StaticScope var18 = null;
//     var1.resolveTypesInScope(var18);
// 
//   }

  public void test223() {}
//   public void test223() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test223"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Compiler.IntermediateState var8 = var1.getState();
//     com.google.javascript.jscomp.NodeTraversal.Callback var9 = null;
//     com.google.javascript.jscomp.NodeTraversal var10 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var1, var9);
//     com.google.javascript.jscomp.CompilerInput var11 = var10.getInput();
// 
//   }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test224"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Set var1 = var0.getSuppressions();
    boolean var2 = var0.isConstructor();
    java.util.Collection var3 = var0.getReferences();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test225"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    var1.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var5 = null;
    com.google.javascript.rhino.jstype.JSType var6 = null;
    com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
    com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
    com.google.javascript.rhino.ErrorReporter var9 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var9);
    boolean var12 = var10.hasNamespace("hi!");
    var10.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var14 = null;
    com.google.javascript.rhino.jstype.JSType var15 = null;
    com.google.javascript.rhino.jstype.JSType[] var16 = new com.google.javascript.rhino.jstype.JSType[] { var15};
    com.google.javascript.rhino.jstype.FunctionType var17 = var10.createConstructorType(var14, var16);
    boolean var18 = var17.canBeCalled();
    var8.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var17);
    boolean var20 = var8.hasCachedValues();
    java.lang.Iterable var21 = var8.getExtendedInterfaces();
    com.google.javascript.rhino.Node var23 = var8.getPropertyNode("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test226() {}
//   public void test226() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test226"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "or");
// 
//   }

  public void test227() {}
//   public void test227() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test227"); }
// 
// 
//     com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("");
//     com.google.javascript.jscomp.JSModule var3 = new com.google.javascript.jscomp.JSModule("");
//     var1.addDependency(var3);
//     java.util.List var5 = var1.getDependencies();
//     java.util.List var6 = var1.getRequires();
//     com.google.javascript.jscomp.SourceAst var7 = null;
//     com.google.javascript.jscomp.CompilerInput var10 = new com.google.javascript.jscomp.CompilerInput(var7, "", true);
//     com.google.javascript.jscomp.SourceAst var11 = var10.getSourceAst();
//     var1.remove(var10);
//     com.google.javascript.jscomp.CompilerInput var13 = null;
//     var1.remove(var13);
// 
//   }

  public void test228() {}
//   public void test228() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test228"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     var1.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var5 = null;
//     com.google.javascript.rhino.jstype.JSType var6 = null;
//     com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
//     com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
//     com.google.javascript.rhino.jstype.ObjectType var9 = var1.createAnonymousObjectType();
//     boolean var10 = var9.isVoidType();
//     com.google.javascript.rhino.ErrorReporter var11 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11);
//     boolean var14 = var12.hasNamespace("hi!");
//     var12.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var16 = null;
//     com.google.javascript.rhino.jstype.JSType var17 = null;
//     com.google.javascript.rhino.jstype.JSType[] var18 = new com.google.javascript.rhino.jstype.JSType[] { var17};
//     com.google.javascript.rhino.jstype.FunctionType var19 = var12.createConstructorType(var16, var18);
//     boolean var20 = var19.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType.TypePair var21 = var9.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var19);
//     boolean var22 = var19.isStringValueType();
//     com.google.common.base.Predicate var23 = null;
//     boolean var24 = var19.setValidator(var23);
// 
//   }

  public void test229() {}
//   public void test229() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test229"); }
// 
// 
//     com.google.javascript.jscomp.SourceExcerptProvider var0 = null;
//     com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var1 = null;
//     com.google.javascript.jscomp.LightweightMessageFormatter var2 = new com.google.javascript.jscomp.LightweightMessageFormatter(var0, var1);
// 
//   }

  public void test230() {}
//   public void test230() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test230"); }
// 
// 
//     java.util.logging.Logger var0 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
//     double var2 = var1.getTypedPercent();
//     var1.setTypedPercent((-1.0d));
//     com.google.javascript.jscomp.CheckLevel var5 = null;
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("");
//     var9.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var13 = var9.removeFirstChild();
//     com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var23 = new com.google.javascript.rhino.Node(1, var9, var15, var20, 1, 1);
//     com.google.javascript.jscomp.CheckLevel var25 = null;
//     com.google.javascript.jscomp.DiagnosticType var27 = com.google.javascript.jscomp.DiagnosticType.make("", var25, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var29 = null;
//     com.google.javascript.jscomp.DiagnosticType var31 = com.google.javascript.jscomp.DiagnosticType.make("", var29, "(ERROR)");
//     int var32 = var27.compareTo(var31);
//     java.lang.String[] var33 = null;
//     com.google.javascript.jscomp.JSError var34 = com.google.javascript.jscomp.JSError.make("ERROR  100 [synthetic: 1]\n", var23, var27, var33);
//     var1.println(var5, var34);
// 
//   }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test231"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    java.lang.String var2 = var0.getName();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var4 = var0.getDirectedPredNodes(var3);
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

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test232"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.Node.newString("");
    var2.putIntProp(100, 1);
    com.google.javascript.rhino.Node var6 = var2.removeFirstChild();
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var16 = new com.google.javascript.rhino.Node(1, var2, var8, var13, 1, 1);
    int var17 = var13.getSourcePosition();
    com.google.javascript.rhino.Node var18 = var13.getFirstChild();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 409600);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test233() {}
//   public void test233() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test233"); }
// 
// 
//     java.io.InputStream var2 = null;
//     com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromInputStream("<No stack trace available>", "(ERROR)", var2);
// 
//   }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test234"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var3 = new com.google.javascript.jscomp.JSModule("");
    var1.addDependency(var3);
    java.util.List var5 = var1.getDependencies();
    com.google.javascript.jscomp.JSModule var7 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var9 = new com.google.javascript.jscomp.JSModule("");
    var7.addDependency(var9);
    var1.addDependency(var7);
    java.lang.String var12 = var1.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var13 = var1.getPathRelativeToClosureBase();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test235() {}
//   public void test235() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test235"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
//     com.google.javascript.rhino.ErrorReporter var5 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var5);
//     boolean var8 = var6.hasNamespace("hi!");
//     var6.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var10 = null;
//     com.google.javascript.rhino.jstype.JSType var11 = null;
//     com.google.javascript.rhino.jstype.JSType[] var12 = new com.google.javascript.rhino.jstype.JSType[] { var11};
//     com.google.javascript.rhino.jstype.FunctionType var13 = var6.createConstructorType(var10, var12);
//     com.google.javascript.rhino.ErrorReporter var14 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var14);
//     boolean var17 = var15.hasNamespace("hi!");
//     var15.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var19 = null;
//     com.google.javascript.rhino.jstype.JSType var20 = null;
//     com.google.javascript.rhino.jstype.JSType[] var21 = new com.google.javascript.rhino.jstype.JSType[] { var20};
//     com.google.javascript.rhino.jstype.FunctionType var22 = var15.createConstructorType(var19, var21);
//     boolean var23 = var22.canBeCalled();
//     var13.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var22);
//     boolean var25 = var22.canBeCalled();
//     com.google.javascript.rhino.ErrorReporter var26 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var26);
//     boolean var29 = var27.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.FunctionBuilder var30 = new com.google.javascript.rhino.jstype.FunctionBuilder(var27);
//     com.google.javascript.rhino.ErrorReporter var31 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var31);
//     boolean var34 = var32.hasNamespace("hi!");
//     var32.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var36 = null;
//     com.google.javascript.rhino.jstype.JSType var37 = null;
//     com.google.javascript.rhino.jstype.JSType[] var38 = new com.google.javascript.rhino.jstype.JSType[] { var37};
//     com.google.javascript.rhino.jstype.FunctionType var39 = var32.createConstructorType(var36, var38);
//     boolean var40 = var39.canBeCalled();
//     com.google.javascript.rhino.jstype.FunctionBuilder var42 = var30.withReturnType((com.google.javascript.rhino.jstype.JSType)var39, false);
//     com.google.javascript.rhino.jstype.JSTypeRegistry var43 = null;
//     com.google.javascript.rhino.jstype.FunctionParamBuilder var44 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var43);
//     com.google.javascript.rhino.ErrorReporter var45 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var45);
//     boolean var48 = var46.hasNamespace("hi!");
//     var46.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var50 = null;
//     com.google.javascript.rhino.jstype.JSType var51 = null;
//     com.google.javascript.rhino.jstype.JSType[] var52 = new com.google.javascript.rhino.jstype.JSType[] { var51};
//     com.google.javascript.rhino.jstype.FunctionType var53 = var46.createConstructorType(var50, var52);
//     com.google.javascript.rhino.jstype.ObjectType var54 = var46.createAnonymousObjectType();
//     com.google.javascript.rhino.jstype.JSType[] var55 = new com.google.javascript.rhino.jstype.JSType[] { var54};
//     boolean var56 = var44.addRequiredParams(var55);
//     com.google.javascript.rhino.jstype.FunctionBuilder var57 = var30.withParams(var44);
//     com.google.javascript.rhino.ErrorReporter var58 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var58);
//     boolean var61 = var59.hasNamespace("hi!");
//     var59.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var63 = null;
//     com.google.javascript.rhino.jstype.JSType var64 = null;
//     com.google.javascript.rhino.jstype.JSType[] var65 = new com.google.javascript.rhino.jstype.JSType[] { var64};
//     com.google.javascript.rhino.jstype.FunctionType var66 = var59.createConstructorType(var63, var65);
//     boolean var67 = var66.canBeCalled();
//     com.google.javascript.rhino.jstype.FunctionPrototypeType var68 = null;
//     boolean var69 = var66.setPrototype(var68);
//     com.google.javascript.rhino.jstype.JSType[] var70 = new com.google.javascript.rhino.jstype.JSType[] { var68};
//     boolean var71 = var44.addRequiredParams(var70);
//     com.google.javascript.rhino.jstype.FunctionType var72 = var1.createConstructorTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType)var22, var70);
// 
//   }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test236"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.DefaultCodingConvention var1 = new com.google.javascript.jscomp.DefaultCodingConvention();
    boolean var3 = var1.isConstantKey("<No stack trace available>");
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.Node.newString("");
    var6.putIntProp(100, 1);
    com.google.javascript.rhino.Node var10 = var6.removeFirstChild();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var20 = new com.google.javascript.rhino.Node(1, var6, var12, var17, 1, 1);
    java.lang.String var21 = var1.getSingletonGetterClassName(var17);
    boolean var22 = var17.wasEmptyNode();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var23 = var0.getInEdges((java.lang.Object)var17);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test237() {}
//   public void test237() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test237"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var8 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     var1.normalize();
// 
//   }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test238"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    java.lang.String var2 = var0.getName();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.Node.newString("");
    var5.putIntProp(100, 1);
    com.google.javascript.rhino.Node var9 = var5.removeFirstChild();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var19 = new com.google.javascript.rhino.Node(1, var5, var11, var16, 1, 1);
    int var20 = var16.getLineno();
    boolean var21 = var0.hasNode((java.lang.Object)var20);
    java.io.PrintStream var22 = null;
    com.google.javascript.jscomp.Compiler var23 = new com.google.javascript.jscomp.Compiler(var22);
    com.google.javascript.jscomp.Region var26 = var23.getSourceRegion("", 0);
    com.google.javascript.jscomp.Region var29 = var23.getSourceRegion("", 0);
    com.google.javascript.jscomp.Compiler.IntermediateState var30 = var23.getState();
    com.google.javascript.rhino.ErrorReporter var31 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var31);
    boolean var34 = var32.hasNamespace("hi!");
    var32.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var36 = null;
    com.google.javascript.rhino.jstype.JSType var37 = null;
    com.google.javascript.rhino.jstype.JSType[] var38 = new com.google.javascript.rhino.jstype.JSType[] { var37};
    com.google.javascript.rhino.jstype.FunctionType var39 = var32.createConstructorType(var36, var38);
    com.google.javascript.rhino.jstype.ObjectType var40 = var32.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var41 = null;
    com.google.javascript.rhino.jstype.StaticScope var42 = null;
    com.google.javascript.rhino.jstype.JSType var43 = var40.forceResolve(var41, var42);
    boolean var44 = var40.isBooleanObjectType();
    com.google.javascript.jscomp.SourceFile var46 = com.google.javascript.jscomp.SourceFile.fromFile("ERROR");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.connectIfNotFound((java.lang.Object)var23, (java.lang.Object)var44, (java.lang.Object)"ERROR");
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
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test239"); }


    java.util.logging.Logger var0 = null;
    com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
    double var2 = var1.getTypedPercent();
    var1.generateReport();
    com.google.javascript.jscomp.Compiler var4 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var1);
    var1.setTypedPercent(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test240"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.Scope var2 = var1.getTopScope();
    com.google.javascript.jscomp.Scope var3 = var1.getTopScope();
    com.google.javascript.jscomp.ErrorManager var4 = var1.getErrorManager();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.Node.newString("");
    java.lang.String var10 = var6.toString(false, true, false);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.Node.newString("");
    var13.putIntProp(100, 1);
    com.google.javascript.rhino.Node var17 = var13.removeFirstChild();
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var27 = new com.google.javascript.rhino.Node(1, var13, var19, var24, 1, 1);
    boolean var28 = var19.hasSideEffects();
    com.google.javascript.rhino.Node var29 = var6.copyInformationFromForTree(var19);
    com.google.javascript.jscomp.NodeTraversal.Callback var30 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.NodeTraversal.traverse((com.google.javascript.jscomp.AbstractCompiler)var1, var19, var30);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "STRING "+ "'", var10.equals("STRING "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test241() {}
//   public void test241() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test241"); }
// 
// 
//     com.google.javascript.jscomp.DefaultCodingConvention var0 = new com.google.javascript.jscomp.DefaultCodingConvention();
//     boolean var2 = var0.isConstantKey("<No stack trace available>");
//     com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.Node.newString("");
//     var5.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var9 = var5.removeFirstChild();
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var19 = new com.google.javascript.rhino.Node(1, var5, var11, var16, 1, 1);
//     java.lang.String var20 = var0.getSingletonGetterClassName(var16);
//     boolean var21 = var16.wasEmptyNode();
//     com.google.javascript.rhino.Node var23 = var16.getChildAtIndex(100);
// 
//   }

  public void test242() {}
//   public void test242() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test242"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "", true);
//     com.google.javascript.jscomp.SourceAst var4 = var3.getSourceAst();
//     com.google.javascript.jscomp.CompilerInput var7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var3, "", false);
//     java.lang.String var8 = var3.getName();
//     java.lang.String var10 = var3.getLine(10);
// 
//   }

  public void test243() {}
//   public void test243() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test243"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.JSError[] var5 = var1.getWarnings();
// 
//   }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test244"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("");
    java.util.List var2 = var1.getProvides();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.JSModuleGraph var3 = new com.google.javascript.jscomp.JSModuleGraph(var2);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test245"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Context.reportWarning("TypeError: ");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test246() {}
//   public void test246() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test246"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     var1.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var5 = null;
//     com.google.javascript.rhino.jstype.JSType var6 = null;
//     com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
//     com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
//     boolean var9 = var8.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType var10 = var8.getReturnType();
//     com.google.javascript.rhino.jstype.JSType var11 = null;
//     boolean var12 = var8.isEquivalentTo(var11);
//     java.lang.String var13 = var8.toDebugHashCodeString();
// 
//   }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test247"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.jscomp.JSModule var2 = new com.google.javascript.jscomp.JSModule("");
    java.util.List var3 = var2.getProvides();
    com.google.javascript.rhino.EcmaError var5 = com.google.javascript.rhino.ScriptRuntime.typeError("");
    java.lang.String var6 = var5.details();
    java.lang.String var7 = var5.getSourceName();
    java.lang.Throwable[] var8 = var5.getSuppressed();
    com.google.javascript.rhino.EcmaError var11 = com.google.javascript.rhino.ScriptRuntime.constructError("hi!", "hi!");
    int var12 = var11.getLineNumber();
    java.io.FilenameFilter var13 = null;
    java.lang.String var14 = var11.getScriptStackTrace(var13);
    var5.addSuppressed((java.lang.Throwable)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var16 = var0.isConnectedInDirection((java.lang.Object)var2, (java.lang.Object)var11);
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
    assertTrue("'" + var6 + "' != '" + "TypeError: "+ "'", var6.equals("TypeError: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "<No stack trace available>"+ "'", var14.equals("<No stack trace available>"));

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test248"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    java.lang.Object var2 = null;
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var3 = var0.getDirectedGraphNode(var2);
    java.lang.Iterable var4 = var0.getDirectedGraphNodes();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var5 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.lang.Iterable var6 = var5.getDirectedGraphNodes();
    var5.clearEdgeAnnotations();
    java.lang.Object var8 = null;
    com.google.javascript.rhino.JSDocInfoBuilder var10 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    boolean var11 = var10.isPopulatedWithFileOverview();
    boolean var12 = var10.isConstructorRecorded();
    com.google.javascript.rhino.JSDocInfoBuilder var14 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    boolean var15 = var14.recordJavaDispatch();
    com.google.javascript.rhino.JSDocInfoBuilder var17 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var24 = new com.google.javascript.rhino.JSTypeExpression(var22, "");
    boolean var26 = var24.equals((java.lang.Object)'4');
    boolean var27 = var17.recordBaseType(var24);
    boolean var28 = var14.recordExtendedInterface(var24);
    boolean var29 = var24.isVarArgs();
    boolean var30 = var10.recordReturnType(var24);
    com.google.javascript.rhino.JSDocInfoBuilder var32 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var39 = new com.google.javascript.rhino.JSTypeExpression(var37, "");
    boolean var41 = var39.equals((java.lang.Object)'4');
    boolean var42 = var32.recordBaseType(var39);
    boolean var44 = var32.hasParameter("ERROR  100 [synthetic: 1]\n");
    boolean var46 = var32.hasParameter("-1");
    com.google.javascript.rhino.JSDocInfoBuilder var48 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    boolean var49 = var48.recordNoSideEffects();
    com.google.javascript.rhino.JSDocInfoBuilder var51 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var58 = new com.google.javascript.rhino.JSTypeExpression(var56, "");
    boolean var60 = var58.equals((java.lang.Object)'4');
    boolean var61 = var51.recordBaseType(var58);
    boolean var62 = var48.recordDefineType(var58);
    boolean var63 = var32.recordImplementedInterface(var58);
    boolean var64 = var10.recordEnumParameterType(var58);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var65 = var0.isConnectedInDirection((java.lang.Object)var5, var8, (java.lang.Object)var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);

  }

  public void test249() {}
//   public void test249() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test249"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.rhino.Node var3 = new com.google.javascript.rhino.Node(1);
//     com.google.javascript.rhino.Node var4 = new com.google.javascript.rhino.Node((-1), var1, var3);
// 
//   }

  public void test250() {}
//   public void test250() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test250"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Scope var2 = var1.getTopScope();
//     java.lang.String var5 = var1.getSourceLine("ERROR  100 [synthetic: 1]\n", 409600);
// 
//   }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test251"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.EcmaError var3 = com.google.javascript.rhino.ScriptRuntime.typeError2("STRING ", ". (ERROR) at (unknown source) line (unknown line) : (unknown column)", "LinkedGraph");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test252() {}
//   public void test252() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test252"); }
// 
// 
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.EvaluatorException var1 = com.google.javascript.rhino.Context.reportRuntimeError("LinkedGraph");
//       fail("Expected exception of type com.google.javascript.rhino.EvaluatorException");
//     } catch (com.google.javascript.rhino.EvaluatorException e) {
//       // Expected exception.
//     }
// 
//   }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test253"); }


    com.google.javascript.rhino.EcmaError var1 = com.google.javascript.rhino.ScriptRuntime.typeError("");
    java.lang.String var2 = var1.getSourceName();
    int var3 = var1.lineNumber();
    java.lang.String var4 = var1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "TypeError"+ "'", var4.equals("TypeError"));

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test254"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
    com.google.javascript.rhino.jstype.JSType var6 = var1.getType("STRING ");
    com.google.javascript.rhino.ErrorReporter var7 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7);
    boolean var10 = var8.hasNamespace("hi!");
    var8.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var12 = null;
    com.google.javascript.rhino.jstype.JSType var13 = null;
    com.google.javascript.rhino.jstype.JSType[] var14 = new com.google.javascript.rhino.jstype.JSType[] { var13};
    com.google.javascript.rhino.jstype.FunctionType var15 = var8.createConstructorType(var12, var14);
    boolean var16 = var15.canBeCalled();
    com.google.javascript.rhino.jstype.JSType var17 = var15.getReturnType();
    com.google.javascript.rhino.jstype.JSType var19 = var1.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType)var15, "");
    com.google.javascript.rhino.jstype.JSType var24 = var1.createNamedType("hi!", "ERROR  100", 409600, 0);
    boolean var25 = var24.isNoResolvedType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test255"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var3 = new com.google.javascript.jscomp.JSModule("");
    var1.addDependency(var3);
    java.util.List var5 = var1.getDependencies();
    java.util.List var6 = var1.getRequires();
    java.io.PrintStream var7 = null;
    com.google.javascript.jscomp.Compiler var8 = new com.google.javascript.jscomp.Compiler(var7);
    com.google.javascript.jscomp.Scope var9 = var8.getTopScope();
    com.google.javascript.jscomp.Scope var10 = var8.getTopScope();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.sortInputsByDeps(var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test256"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString(100, "hi!");
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.Node.newString("");
    var6.putIntProp(100, 1);
    com.google.javascript.rhino.Node var10 = var6.removeFirstChild();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var20 = new com.google.javascript.rhino.Node(1, var6, var12, var17, 1, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var21 = new com.google.javascript.rhino.Node(0, var3, var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test257"); }


    com.google.javascript.jscomp.SourceAst var0 = null;
    com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "", true);
    com.google.javascript.jscomp.SourceAst var4 = var3.getSourceAst();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = var3.getPathRelativeToClosureBase();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test258"); }


    com.google.javascript.rhino.EcmaError var2 = com.google.javascript.rhino.ScriptRuntime.constructError("hi!", "hi!");
    int var3 = var2.getLineNumber();
    int var4 = var2.getLineNumber();
    java.lang.Throwable[] var5 = var2.getSuppressed();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.initColumnNumber(0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test259() {}
//   public void test259() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test259"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var1);
//     var2.clearCachedSource();
//     java.lang.String var4 = var2.getCode();
// 
//   }

  public void test260() {}
//   public void test260() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test260"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     var1.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var5 = null;
//     com.google.javascript.rhino.jstype.JSType var6 = null;
//     com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
//     com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
//     boolean var9 = var8.canBeCalled();
//     boolean var10 = var8.isConstructor();
//     com.google.javascript.rhino.jstype.Visitor var11 = null;
//     java.lang.Object var12 = var8.visit(var11);
// 
//   }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test261"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.JSTypeNative var1 = com.google.javascript.rhino.jstype.JSTypeNative.valueOf("<No stack trace available>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test262"); }


    com.google.javascript.jscomp.DefaultCodingConvention var0 = new com.google.javascript.jscomp.DefaultCodingConvention();
    com.google.javascript.rhino.jstype.FunctionType var1 = null;
    com.google.javascript.rhino.jstype.FunctionType var2 = null;
    com.google.javascript.jscomp.CodingConvention.SubclassType var3 = null;
    var0.applySubclassRelationship(var1, var2, var3);
    java.lang.String var5 = var0.getDelegateSuperclassName();
    java.io.PrintStream var6 = null;
    com.google.javascript.jscomp.Compiler var7 = new com.google.javascript.jscomp.Compiler(var6);
    com.google.javascript.jscomp.Region var10 = var7.getSourceRegion("", 0);
    com.google.javascript.jscomp.Region var13 = var7.getSourceRegion("", 0);
    com.google.javascript.jscomp.Compiler.IntermediateState var14 = var7.getState();
    com.google.javascript.jscomp.NodeTraversal.Callback var15 = null;
    com.google.javascript.jscomp.NodeTraversal var16 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var7, var15);
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.Node.newString("");
    boolean var19 = var18.hasChildren();
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSDocInfo var25 = null;
    var24.setJSDocInfo(var25);
    com.google.javascript.rhino.Node var28 = var24.getChildAtIndex(0);
    var18.addChildrenToFront(var24);
    com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast var30 = var0.getObjectLiteralCast(var16, var24);
    com.google.javascript.jscomp.Scope var31 = var16.getScope();
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var38 = new com.google.javascript.rhino.JSTypeExpression(var36, "");
    com.google.javascript.jscomp.CheckLevel var39 = null;
    com.google.javascript.jscomp.CheckLevel var41 = null;
    com.google.javascript.jscomp.DiagnosticType var43 = com.google.javascript.jscomp.DiagnosticType.make("", var41, "(ERROR)");
    com.google.javascript.jscomp.CheckLevel var45 = null;
    com.google.javascript.jscomp.DiagnosticType var47 = com.google.javascript.jscomp.DiagnosticType.make("", var45, "(ERROR)");
    int var48 = var43.compareTo(var47);
    com.google.javascript.jscomp.CheckLevel var50 = null;
    com.google.javascript.jscomp.DiagnosticType var52 = com.google.javascript.jscomp.DiagnosticType.make("", var50, "(ERROR)");
    com.google.javascript.jscomp.CheckLevel var54 = null;
    com.google.javascript.jscomp.DiagnosticType var56 = com.google.javascript.jscomp.DiagnosticType.make("", var54, "(ERROR)");
    com.google.javascript.jscomp.CheckLevel var58 = null;
    com.google.javascript.jscomp.DiagnosticType var60 = com.google.javascript.jscomp.DiagnosticType.make("", var58, "(ERROR)");
    int var61 = var56.compareTo(var60);
    java.lang.String[] var63 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
    com.google.javascript.jscomp.JSError var64 = com.google.javascript.jscomp.JSError.make(var60, var63);
    com.google.javascript.jscomp.JSError var65 = com.google.javascript.jscomp.JSError.make(var52, var63);
    com.google.javascript.jscomp.JSError var66 = var16.makeError(var36, var39, var47, var63);
    com.google.javascript.jscomp.Scope var67 = var16.getScope();
    com.google.javascript.rhino.Node var70 = com.google.javascript.rhino.Node.newString("");
    var70.putIntProp(100, 1);
    com.google.javascript.rhino.Node var74 = var70.removeFirstChild();
    com.google.javascript.rhino.Node var76 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var81 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var84 = new com.google.javascript.rhino.Node(1, var70, var76, var81, 1, 1);
    com.google.javascript.rhino.JSDocInfo var85 = var76.getJSDocInfo();
    var76.setSourcePositionForTree(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var16.traverse(var76);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test263"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.JSTypeNative var1 = com.google.javascript.rhino.jstype.JSTypeNative.valueOf("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test264() {}
//   public void test264() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test264"); }
// 
// 
//     com.google.javascript.rhino.jstype.JSTypeRegistry var0 = null;
//     com.google.javascript.rhino.jstype.FunctionParamBuilder var1 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var0);
//     com.google.javascript.rhino.ErrorReporter var2 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
//     boolean var5 = var3.hasNamespace("hi!");
//     var3.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var7 = null;
//     com.google.javascript.rhino.jstype.JSType var8 = null;
//     com.google.javascript.rhino.jstype.JSType[] var9 = new com.google.javascript.rhino.jstype.JSType[] { var8};
//     com.google.javascript.rhino.jstype.FunctionType var10 = var3.createConstructorType(var7, var9);
//     com.google.javascript.rhino.jstype.ObjectType var11 = var3.createAnonymousObjectType();
//     boolean var12 = var11.isVoidType();
//     com.google.javascript.rhino.ErrorReporter var13 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13);
//     boolean var16 = var14.hasNamespace("hi!");
//     var14.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var18 = null;
//     com.google.javascript.rhino.jstype.JSType var19 = null;
//     com.google.javascript.rhino.jstype.JSType[] var20 = new com.google.javascript.rhino.jstype.JSType[] { var19};
//     com.google.javascript.rhino.jstype.FunctionType var21 = var14.createConstructorType(var18, var20);
//     com.google.javascript.rhino.jstype.ObjectType var22 = var14.createAnonymousObjectType();
//     boolean var23 = var22.isVoidType();
//     java.util.Set var24 = var22.getPropertyNames();
//     boolean var26 = var22.hasOwnProperty("or");
//     com.google.javascript.rhino.jstype.TernaryValue var27 = var11.testForEquality((com.google.javascript.rhino.jstype.JSType)var22);
//     com.google.javascript.rhino.jstype.JSType[] var28 = new com.google.javascript.rhino.jstype.JSType[] { var11};
//     boolean var29 = var1.addOptionalParams(var28);
// 
//   }

  public void test265() {}
//   public void test265() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test265"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     var1.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var5 = null;
//     com.google.javascript.rhino.jstype.JSType var6 = null;
//     com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
//     com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
//     boolean var9 = var8.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType var10 = var8.getReturnType();
//     com.google.javascript.rhino.Node var11 = var8.getSource();
//     com.google.javascript.rhino.ErrorReporter var12 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var12);
//     boolean var15 = var13.hasNamespace("hi!");
//     var13.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var17 = null;
//     com.google.javascript.rhino.jstype.JSType var18 = null;
//     com.google.javascript.rhino.jstype.JSType[] var19 = new com.google.javascript.rhino.jstype.JSType[] { var18};
//     com.google.javascript.rhino.jstype.FunctionType var20 = var13.createConstructorType(var17, var19);
//     boolean var21 = var20.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType var22 = var20.getReturnType();
//     var20.clearCachedValues();
//     com.google.javascript.rhino.jstype.JSType.TypePair var24 = var8.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType)var20);
//     com.google.javascript.rhino.ErrorReporter var25 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25);
//     boolean var28 = var26.hasNamespace("hi!");
//     var26.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var30 = null;
//     com.google.javascript.rhino.jstype.JSType var31 = null;
//     com.google.javascript.rhino.jstype.JSType[] var32 = new com.google.javascript.rhino.jstype.JSType[] { var31};
//     com.google.javascript.rhino.jstype.FunctionType var33 = var26.createConstructorType(var30, var32);
//     boolean var34 = var33.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType var35 = var33.getReturnType();
//     com.google.javascript.rhino.jstype.JSType var36 = null;
//     boolean var37 = var33.isEquivalentTo(var36);
//     boolean var38 = var20.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var33);
//     boolean var39 = var20.hasCachedValues();
//     com.google.javascript.rhino.jstype.Visitor var40 = null;
//     java.lang.Object var41 = var20.visit(var40);
// 
//   }

  public void test266() {}
//   public void test266() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test266"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     var1.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var5 = null;
//     com.google.javascript.rhino.jstype.JSType var6 = null;
//     com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
//     com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
//     com.google.javascript.rhino.ErrorReporter var9 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var9);
//     boolean var12 = var10.hasNamespace("hi!");
//     var10.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var14 = null;
//     com.google.javascript.rhino.jstype.JSType var15 = null;
//     com.google.javascript.rhino.jstype.JSType[] var16 = new com.google.javascript.rhino.jstype.JSType[] { var15};
//     com.google.javascript.rhino.jstype.FunctionType var17 = var10.createConstructorType(var14, var16);
//     boolean var18 = var17.canBeCalled();
//     var8.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var17);
//     boolean var20 = var17.canBeCalled();
//     com.google.javascript.rhino.ErrorReporter var21 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21);
//     boolean var24 = var22.hasNamespace("hi!");
//     var22.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var26 = null;
//     com.google.javascript.rhino.jstype.JSType var27 = null;
//     com.google.javascript.rhino.jstype.JSType[] var28 = new com.google.javascript.rhino.jstype.JSType[] { var27};
//     com.google.javascript.rhino.jstype.FunctionType var29 = var22.createConstructorType(var26, var28);
//     com.google.javascript.rhino.jstype.ObjectType var30 = var22.createAnonymousObjectType();
//     boolean var31 = var30.isVoidType();
//     com.google.javascript.rhino.ErrorReporter var32 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32);
//     boolean var35 = var33.hasNamespace("hi!");
//     var33.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var37 = null;
//     com.google.javascript.rhino.jstype.JSType var38 = null;
//     com.google.javascript.rhino.jstype.JSType[] var39 = new com.google.javascript.rhino.jstype.JSType[] { var38};
//     com.google.javascript.rhino.jstype.FunctionType var40 = var33.createConstructorType(var37, var39);
//     boolean var41 = var40.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType.TypePair var42 = var30.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var40);
//     java.lang.Iterable var43 = var40.getAllImplementedInterfaces();
//     com.google.javascript.rhino.jstype.JSType var44 = var17.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType)var40);
//     java.lang.String var45 = var40.toDebugHashCodeString();
// 
//   }

  public void test267() {}
//   public void test267() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test267"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
//     com.google.javascript.rhino.jstype.JSType var6 = var1.getType("STRING ");
//     com.google.javascript.rhino.ErrorReporter var7 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7);
//     boolean var10 = var8.hasNamespace("hi!");
//     var8.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var12 = null;
//     com.google.javascript.rhino.jstype.JSType var13 = null;
//     com.google.javascript.rhino.jstype.JSType[] var14 = new com.google.javascript.rhino.jstype.JSType[] { var13};
//     com.google.javascript.rhino.jstype.FunctionType var15 = var8.createConstructorType(var12, var14);
//     boolean var16 = var15.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType var17 = var15.getReturnType();
//     com.google.javascript.rhino.jstype.JSType var19 = var1.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType)var15, "");
//     com.google.javascript.rhino.jstype.JSType var24 = var1.createNamedType("hi!", "ERROR  100", 409600, 0);
//     com.google.javascript.rhino.ErrorReporter var25 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25);
//     boolean var28 = var26.hasNamespace("hi!");
//     var26.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var30 = null;
//     com.google.javascript.rhino.jstype.JSType var31 = null;
//     com.google.javascript.rhino.jstype.JSType[] var32 = new com.google.javascript.rhino.jstype.JSType[] { var31};
//     com.google.javascript.rhino.jstype.FunctionType var33 = var26.createConstructorType(var30, var32);
//     com.google.javascript.rhino.jstype.ObjectType var34 = var26.createAnonymousObjectType();
//     boolean var35 = var34.isVoidType();
//     com.google.javascript.rhino.ErrorReporter var36 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var36);
//     boolean var39 = var37.hasNamespace("hi!");
//     var37.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var41 = null;
//     com.google.javascript.rhino.jstype.JSType var42 = null;
//     com.google.javascript.rhino.jstype.JSType[] var43 = new com.google.javascript.rhino.jstype.JSType[] { var42};
//     com.google.javascript.rhino.jstype.FunctionType var44 = var37.createConstructorType(var41, var43);
//     boolean var45 = var44.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType.TypePair var46 = var34.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var44);
//     boolean var47 = var34.isEmptyType();
//     com.google.javascript.rhino.jstype.JSType[] var48 = null;
//     com.google.javascript.rhino.jstype.FunctionType var49 = var1.createFunctionTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType)var34, var48);
// 
//   }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test268"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.Node.newString("");
    var1.putIntProp(100, 1);
    com.google.javascript.rhino.Node var5 = var1.removeFirstChild();
    int var6 = var1.getChildCount();
    boolean var7 = var1.hasChildren();
    java.lang.Iterable var8 = var1.children();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setSideEffectFlags(10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test269"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.Node.newString("");
    var2.putIntProp(100, 1);
    com.google.javascript.rhino.Node var6 = var2.removeFirstChild();
    int var7 = var2.getChildCount();
    boolean var8 = var2.hasChildren();
    com.google.javascript.rhino.Node var11 = new com.google.javascript.rhino.Node(100, var2, 100, (-1));
    com.google.javascript.rhino.Node var15 = new com.google.javascript.rhino.Node(0, 0, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.removeChild(var15);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test270"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
    com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
    com.google.javascript.jscomp.Compiler.IntermediateState var8 = var1.getState();
    com.google.javascript.jscomp.JSModule var10 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.SourceFile.Generator var12 = null;
    com.google.javascript.jscomp.JSSourceFile var13 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var12);
    java.lang.String var14 = var13.getName();
    var13.setOriginalPath("");
    var10.add(var13);
    com.google.javascript.jscomp.JSSourceFile[] var18 = new com.google.javascript.jscomp.JSSourceFile[] { var13};
    com.google.javascript.jscomp.JSModule var20 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var22 = new com.google.javascript.jscomp.JSModule("");
    var20.addDependency(var22);
    java.util.List var24 = var20.getDependencies();
    com.google.javascript.jscomp.JSModule var26 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var28 = new com.google.javascript.jscomp.JSModule("");
    var26.addDependency(var28);
    var20.addDependency(var26);
    com.google.javascript.jscomp.JSModule[] var31 = new com.google.javascript.jscomp.JSModule[] { var26};
    com.google.javascript.jscomp.CompilerOptions var32 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.CodingConvention var33 = var32.getCodingConvention();
    var32.enableExternExports(true);
    boolean var36 = var32.isExternExportsEnabled();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.Result var37 = var1.compile(var18, var31, var32);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test271"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.SourceFile.Generator var3 = null;
    com.google.javascript.jscomp.JSSourceFile var4 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var3);
    java.lang.String var5 = var4.getName();
    var4.setOriginalPath("");
    var1.add(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var9 = var1.getPathRelativeToClosureBase();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test272() {}
//   public void test272() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test272"); }
// 
// 
//     com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot var0 = null;
//     com.google.javascript.jscomp.parsing.Config var2 = null;
//     com.google.javascript.jscomp.mozilla.rhino.ErrorReporter var3 = null;
//     com.google.javascript.rhino.Node var4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(var0, "(ERROR)", var2, var3);
// 
//   }

  public void test273() {}
//   public void test273() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test273"); }
// 
// 
//     com.google.javascript.jscomp.DefaultCodingConvention var0 = new com.google.javascript.jscomp.DefaultCodingConvention();
//     com.google.javascript.rhino.jstype.FunctionType var1 = null;
//     com.google.javascript.rhino.jstype.FunctionType var2 = null;
//     com.google.javascript.jscomp.CodingConvention.SubclassType var3 = null;
//     var0.applySubclassRelationship(var1, var2, var3);
//     java.lang.String var5 = var0.getDelegateSuperclassName();
//     java.io.PrintStream var6 = null;
//     com.google.javascript.jscomp.Compiler var7 = new com.google.javascript.jscomp.Compiler(var6);
//     com.google.javascript.jscomp.Region var10 = var7.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var13 = var7.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Compiler.IntermediateState var14 = var7.getState();
//     com.google.javascript.jscomp.NodeTraversal.Callback var15 = null;
//     com.google.javascript.jscomp.NodeTraversal var16 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var7, var15);
//     com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.Node.newString("");
//     boolean var19 = var18.hasChildren();
//     com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.JSDocInfo var25 = null;
//     var24.setJSDocInfo(var25);
//     com.google.javascript.rhino.Node var28 = var24.getChildAtIndex(0);
//     var18.addChildrenToFront(var24);
//     com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast var30 = var0.getObjectLiteralCast(var16, var24);
//     com.google.javascript.jscomp.Scope var31 = var16.getScope();
//     com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.JSTypeExpression var38 = new com.google.javascript.rhino.JSTypeExpression(var36, "");
//     com.google.javascript.jscomp.CheckLevel var39 = null;
//     com.google.javascript.jscomp.CheckLevel var41 = null;
//     com.google.javascript.jscomp.DiagnosticType var43 = com.google.javascript.jscomp.DiagnosticType.make("", var41, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var45 = null;
//     com.google.javascript.jscomp.DiagnosticType var47 = com.google.javascript.jscomp.DiagnosticType.make("", var45, "(ERROR)");
//     int var48 = var43.compareTo(var47);
//     com.google.javascript.jscomp.CheckLevel var50 = null;
//     com.google.javascript.jscomp.DiagnosticType var52 = com.google.javascript.jscomp.DiagnosticType.make("", var50, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var54 = null;
//     com.google.javascript.jscomp.DiagnosticType var56 = com.google.javascript.jscomp.DiagnosticType.make("", var54, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var58 = null;
//     com.google.javascript.jscomp.DiagnosticType var60 = com.google.javascript.jscomp.DiagnosticType.make("", var58, "(ERROR)");
//     int var61 = var56.compareTo(var60);
//     java.lang.String[] var63 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var64 = com.google.javascript.jscomp.JSError.make(var60, var63);
//     com.google.javascript.jscomp.JSError var65 = com.google.javascript.jscomp.JSError.make(var52, var63);
//     com.google.javascript.jscomp.JSError var66 = var16.makeError(var36, var39, var47, var63);
//     com.google.javascript.rhino.Node var68 = com.google.javascript.rhino.Node.newString("");
//     boolean var69 = var68.hasChildren();
//     com.google.javascript.jscomp.DiagnosticType var70 = null;
//     java.lang.String[] var71 = null;
//     var16.report(var68, var70, var71);
// 
//   }

  public void test274() {}
//   public void test274() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test274"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Scope var2 = var1.getTopScope();
//     com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var3 = null;
//     com.google.javascript.jscomp.LightweightMessageFormatter var4 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1, var3);
//     var1.processDefines();
// 
//   }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test275"); }


    java.lang.String var1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("STRING ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "(STRING )"+ "'", var1.equals("(STRING )"));

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test276"); }


    com.google.javascript.jscomp.DefaultCodingConvention var0 = new com.google.javascript.jscomp.DefaultCodingConvention();
    boolean var2 = var0.isConstant("LinkedGraph");
    boolean var4 = var0.isPrivate("ERROR  100");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test277() {}
//   public void test277() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test277"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     java.io.PrintStream var1 = null;
//     com.google.javascript.jscomp.Compiler var2 = new com.google.javascript.jscomp.Compiler(var1);
//     com.google.javascript.jscomp.Region var5 = var2.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var8 = var2.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var9 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var2);
//     com.google.javascript.jscomp.Compiler.IntermediateState var10 = var2.getState();
//     var0.setState(var10);
//     com.google.javascript.jscomp.JSSourceFile var12 = null;
//     com.google.javascript.rhino.Node var13 = var0.parse(var12);
// 
//   }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test278"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test279"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("");
    java.util.Set var2 = var1.getAllDependencies();
    java.io.PrintStream var3 = null;
    com.google.javascript.jscomp.Compiler var4 = new com.google.javascript.jscomp.Compiler(var3);
    com.google.javascript.jscomp.Region var7 = var4.getSourceRegion("", 0);
    com.google.javascript.jscomp.Region var10 = var4.getSourceRegion("", 0);
    com.google.javascript.jscomp.Compiler.IntermediateState var11 = var4.getState();
    com.google.javascript.jscomp.SourceMap var12 = var4.getSourceMap();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.sortInputsByDeps(var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test280"); }


    com.google.javascript.jscomp.SourceAst var0 = null;
    com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "", true);
    com.google.javascript.jscomp.CompilerInput var6 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var3, "", false);
    com.google.javascript.jscomp.JSModule var8 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.SourceFile.Generator var10 = null;
    com.google.javascript.jscomp.JSSourceFile var11 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var10);
    java.lang.String var12 = var11.getName();
    var11.setOriginalPath("");
    var8.add(var11);
    var3.setModule(var8);
    com.google.javascript.jscomp.JSModule var18 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var20 = new com.google.javascript.jscomp.JSModule("");
    var18.addDependency(var20);
    java.util.List var22 = var18.getDependencies();
    com.google.javascript.jscomp.JSModule var24 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var26 = new com.google.javascript.jscomp.JSModule("");
    var24.addDependency(var26);
    var18.addDependency(var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setModule(var18);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test281"); }


    com.google.javascript.rhino.EvaluatorException var5 = new com.google.javascript.rhino.EvaluatorException("hi!", "", 10, "", 1);
    int var6 = var5.lineNumber();
    java.lang.String var7 = var5.toString();
    com.google.javascript.rhino.EcmaError var9 = com.google.javascript.rhino.ScriptRuntime.typeError("");
    java.lang.String var10 = var9.details();
    int var11 = var9.getColumnNumber();
    var5.addSuppressed((java.lang.Throwable)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.google.javascript.rhino.EvaluatorException: hi! (#10)"+ "'", var7.equals("com.google.javascript.rhino.EvaluatorException: hi! (#10)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "TypeError: "+ "'", var10.equals("TypeError: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test282"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.lang.Iterable var1 = var0.getDirectedGraphNodes();
    com.google.javascript.rhino.JSDocInfoBuilder var3 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    boolean var4 = var3.isPopulatedWithFileOverview();
    boolean var5 = var3.isConstructorRecorded();
    com.google.javascript.rhino.JSDocInfoBuilder var7 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    boolean var8 = var7.recordJavaDispatch();
    com.google.javascript.rhino.JSDocInfoBuilder var10 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var17 = new com.google.javascript.rhino.JSTypeExpression(var15, "");
    boolean var19 = var17.equals((java.lang.Object)'4');
    boolean var20 = var10.recordBaseType(var17);
    boolean var21 = var7.recordExtendedInterface(var17);
    boolean var22 = var17.isVarArgs();
    boolean var23 = var3.recordReturnType(var17);
    com.google.javascript.rhino.JSDocInfo var24 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Set var25 = var24.getSuppressions();
    boolean var26 = var24.isConstructor();
    int var27 = var24.getParameterCount();
    com.google.javascript.rhino.ErrorReporter var28 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var28);
    boolean var31 = var29.hasNamespace("hi!");
    var29.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var33 = null;
    com.google.javascript.rhino.jstype.JSType var34 = null;
    com.google.javascript.rhino.jstype.JSType[] var35 = new com.google.javascript.rhino.jstype.JSType[] { var34};
    com.google.javascript.rhino.jstype.FunctionType var36 = var29.createConstructorType(var33, var35);
    com.google.javascript.rhino.jstype.ObjectType var37 = var29.createAnonymousObjectType();
    boolean var38 = var37.isVoidType();
    com.google.javascript.rhino.ErrorReporter var39 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var39);
    boolean var42 = var40.hasNamespace("hi!");
    var40.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var44 = null;
    com.google.javascript.rhino.jstype.JSType var45 = null;
    com.google.javascript.rhino.jstype.JSType[] var46 = new com.google.javascript.rhino.jstype.JSType[] { var45};
    com.google.javascript.rhino.jstype.FunctionType var47 = var40.createConstructorType(var44, var46);
    boolean var48 = var47.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var49 = var37.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var47);
    java.lang.Iterable var50 = var37.getCtorExtendedInterfaces();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var51 = var0.isConnectedInDirection((java.lang.Object)var3, (java.lang.Object)var24, (java.lang.Object)var37);
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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test283"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("");
    var3.putIntProp(100, 1);
    com.google.javascript.rhino.Node var7 = var3.removeFirstChild();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var17 = new com.google.javascript.rhino.Node(1, var3, var9, var14, 1, 1);
    com.google.javascript.jscomp.CheckLevel var19 = null;
    com.google.javascript.jscomp.DiagnosticType var21 = com.google.javascript.jscomp.DiagnosticType.make("", var19, "(ERROR)");
    com.google.javascript.jscomp.CheckLevel var23 = null;
    com.google.javascript.jscomp.DiagnosticType var25 = com.google.javascript.jscomp.DiagnosticType.make("", var23, "(ERROR)");
    int var26 = var21.compareTo(var25);
    java.lang.String[] var27 = null;
    com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make("ERROR  100 [synthetic: 1]\n", var17, var21, var27);
    java.lang.String var29 = var28.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ". (ERROR) at ERROR  100 [synthetic: 1]\n line 1 : 1"+ "'", var29.equals(". (ERROR) at ERROR  100 [synthetic: 1]\n line 1 : 1"));

  }

  public void test284() {}
//   public void test284() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test284"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Scope var2 = var1.getTopScope();
//     com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var3 = null;
//     com.google.javascript.jscomp.LightweightMessageFormatter var4 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1, var3);
//     var1.rebuildInputsFromModules();
// 
//   }

  public void test285() {}
//   public void test285() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test285"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Compiler.IntermediateState var8 = var1.getState();
//     boolean var9 = var1.hasErrors();
// 
//   }

  public void test286() {}
//   public void test286() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test286"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = null;
//     com.google.javascript.rhino.Context var1 = com.google.javascript.rhino.Context.enter(var0);
//     var1.addActivationName("");
//     java.lang.Object var4 = var1.getDebuggerContextData();
//     java.beans.PropertyChangeListener var5 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var1.removePropertyChangeListener(var5);
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

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test287"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    var1.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var5 = null;
    com.google.javascript.rhino.jstype.JSType var6 = null;
    com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
    com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
    boolean var9 = var8.canBeCalled();
    com.google.javascript.rhino.ErrorReporter var10 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var10);
    boolean var13 = var11.hasNamespace("hi!");
    var11.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var15 = null;
    com.google.javascript.rhino.jstype.JSType var16 = null;
    com.google.javascript.rhino.jstype.JSType[] var17 = new com.google.javascript.rhino.jstype.JSType[] { var16};
    com.google.javascript.rhino.jstype.FunctionType var18 = var11.createConstructorType(var15, var17);
    com.google.javascript.rhino.jstype.ObjectType var19 = var11.createAnonymousObjectType();
    boolean var20 = var19.isVoidType();
    com.google.javascript.rhino.ErrorReporter var21 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21);
    boolean var24 = var22.hasNamespace("hi!");
    var22.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var26 = null;
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.rhino.jstype.JSType[] var28 = new com.google.javascript.rhino.jstype.JSType[] { var27};
    com.google.javascript.rhino.jstype.FunctionType var29 = var22.createConstructorType(var26, var28);
    boolean var30 = var29.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var31 = var19.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var29);
    boolean var32 = var19.isEmptyType();
    boolean var33 = var8.isEquivalentTo((com.google.javascript.rhino.jstype.JSType)var19);
    com.google.javascript.rhino.jstype.FunctionPrototypeType var34 = null;
    boolean var35 = var8.setPrototype(var34);
    com.google.javascript.rhino.JSDocInfo var37 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Set var38 = var37.getSuppressions();
    boolean var39 = var37.isConstructor();
    boolean var40 = var37.isExterns();
    var8.setPropertyJSDocInfo("-1", var37, false);
    boolean var43 = var37.isDefine();
    com.google.javascript.rhino.JSTypeExpression var45 = var37.getParameterType("");
    com.google.javascript.rhino.JSTypeExpression var46 = var37.getReturnType();
    java.lang.String var48 = var37.getDescriptionForParameter("com.google.javascript.rhino.EvaluatorException: hi! (#10)");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);

  }

  public void test288() {}
//   public void test288() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test288"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticGroup var0 = null;
//     com.google.javascript.jscomp.CheckLevel var1 = null;
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var2 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var0, var1);
//     com.google.javascript.jscomp.CheckLevel var4 = null;
//     com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.make("", var4, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var8 = null;
//     com.google.javascript.jscomp.DiagnosticType var10 = com.google.javascript.jscomp.DiagnosticType.make("", var8, "(ERROR)");
//     int var11 = var6.compareTo(var10);
//     java.lang.String[] var13 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var14 = com.google.javascript.jscomp.JSError.make(var10, var13);
//     com.google.javascript.jscomp.CheckLevel var16 = null;
//     com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.make("", var16, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var20 = null;
//     com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.make("", var20, "(ERROR)");
//     int var23 = var18.compareTo(var22);
//     java.lang.String[] var25 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var26 = com.google.javascript.jscomp.JSError.make(var22, var25);
//     com.google.javascript.jscomp.JSError var27 = com.google.javascript.jscomp.JSError.make(var10, var25);
//     com.google.javascript.jscomp.DiagnosticType[] var28 = new com.google.javascript.jscomp.DiagnosticType[] { var10};
//     com.google.javascript.jscomp.DiagnosticGroup var29 = new com.google.javascript.jscomp.DiagnosticGroup(var28);
//     boolean var30 = var2.enables(var29);
// 
//   }

  public void test289() {}
//   public void test289() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test289"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Compiler.IntermediateState var8 = var1.getState();
//     com.google.javascript.jscomp.SourceMap var9 = var1.getSourceMap();
//     com.google.javascript.jscomp.PassConfig var10 = null;
//     var1.setPassConfig(var10);
// 
//   }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test290"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    boolean var2 = var1.recordJavaDispatch();
    com.google.javascript.rhino.JSDocInfoBuilder var4 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var11 = new com.google.javascript.rhino.JSTypeExpression(var9, "");
    boolean var13 = var11.equals((java.lang.Object)'4');
    boolean var14 = var4.recordBaseType(var11);
    boolean var15 = var1.recordExtendedInterface(var11);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var22 = new com.google.javascript.rhino.JSTypeExpression(var20, "");
    boolean var24 = var22.equals((java.lang.Object)'4');
    boolean var26 = var1.recordThrowDescription(var22, "");
    var1.markName("(ERROR)", 409600, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test291"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    var1.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var5 = null;
    com.google.javascript.rhino.jstype.JSType var6 = null;
    com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
    com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
    com.google.javascript.rhino.jstype.ObjectType var9 = var1.createAnonymousObjectType();
    boolean var10 = var9.isVoidType();
    com.google.javascript.rhino.ErrorReporter var11 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11);
    boolean var14 = var12.hasNamespace("hi!");
    var12.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var16 = null;
    com.google.javascript.rhino.jstype.JSType var17 = null;
    com.google.javascript.rhino.jstype.JSType[] var18 = new com.google.javascript.rhino.jstype.JSType[] { var17};
    com.google.javascript.rhino.jstype.FunctionType var19 = var12.createConstructorType(var16, var18);
    com.google.javascript.rhino.jstype.ObjectType var20 = var12.createAnonymousObjectType();
    boolean var21 = var20.isVoidType();
    java.util.Set var22 = var20.getPropertyNames();
    boolean var24 = var20.hasOwnProperty("or");
    com.google.javascript.rhino.jstype.TernaryValue var25 = var9.testForEquality((com.google.javascript.rhino.jstype.JSType)var20);
    java.lang.String var26 = var25.toString();
    java.lang.Class var27 = var25.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var29 = java.lang.Enum.<java.lang.Enum>valueOf(var27, "com.google.javascript.rhino.EvaluatorException: hi! (#10)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "unknown"+ "'", var26.equals("unknown"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test292() {}
//   public void test292() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test292"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var8 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     com.google.javascript.jscomp.Compiler.IntermediateState var9 = var1.getState();
//     var1.rebuildInputsFromModules();
// 
//   }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test293"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var3 = new com.google.javascript.jscomp.JSModule("");
    var1.addDependency(var3);
    java.util.List var5 = var1.getDependencies();
    com.google.javascript.jscomp.JSModule var7 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var9 = new com.google.javascript.jscomp.JSModule("");
    var7.addDependency(var9);
    var1.addDependency(var7);
    com.google.javascript.jscomp.JSModule var13 = new com.google.javascript.jscomp.JSModule("hi!");
    var1.addDependency(var13);
    com.google.javascript.jscomp.SourceFile.Generator var16 = null;
    com.google.javascript.jscomp.JSSourceFile var17 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var16);
    com.google.javascript.jscomp.CompilerInput var19 = new com.google.javascript.jscomp.CompilerInput(var17, false);
    var13.add(var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var21 = var13.getPathRelativeToClosureBase();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test294"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    java.lang.Iterable var2 = var0.getDirectedGraphNodes();
    java.util.List var3 = var0.getGraphvizNodes();
    com.google.javascript.jscomp.JSModuleGraph var4 = new com.google.javascript.jscomp.JSModuleGraph(var3);
    var4.coalesceDuplicateFiles();
    var4.coalesceDuplicateFiles();
    com.google.javascript.jscomp.JSModule var8 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var10 = new com.google.javascript.jscomp.JSModule("");
    var8.addDependency(var10);
    java.util.List var12 = var8.getDependencies();
    java.util.List var13 = var8.getRequires();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.JSModule var14 = var4.getDeepestCommonDependencyInclusive((java.util.Collection)var13);
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test295"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.Scope var2 = var1.getTopScope();
    com.google.javascript.jscomp.Scope var3 = var1.getTopScope();
    var1.disableThreads();
    java.util.List var5 = null;
    com.google.javascript.jscomp.JSModule var7 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var9 = new com.google.javascript.jscomp.JSModule("");
    var7.addDependency(var9);
    java.util.List var11 = var7.getDependencies();
    java.util.List var12 = var7.getRequires();
    com.google.javascript.jscomp.CompilerOptions var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.init(var5, var12, var13);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test296() {}
//   public void test296() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test296"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var2 = null;
//     com.google.javascript.jscomp.LightweightMessageFormatter var3 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1, var2);
//     com.google.javascript.jscomp.JSSourceFile var4 = null;
//     com.google.javascript.jscomp.SourceFile.Generator var6 = null;
//     com.google.javascript.jscomp.JSSourceFile var7 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var6);
//     com.google.javascript.jscomp.CompilerInput var9 = new com.google.javascript.jscomp.CompilerInput(var7, false);
//     com.google.javascript.jscomp.JSSourceFile[] var10 = new com.google.javascript.jscomp.JSSourceFile[] { var7};
//     com.google.javascript.jscomp.CompilerOptions var11 = new com.google.javascript.jscomp.CompilerOptions();
//     com.google.javascript.jscomp.CodingConvention var12 = var11.getCodingConvention();
//     var11.enableExternExports(true);
//     boolean var15 = var11.isExternExportsEnabled();
//     var11.setTweakToBooleanLiteral("unknown", false);
//     com.google.javascript.jscomp.Result var19 = var1.compile(var4, var10, var11);
// 
//   }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test297"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    java.lang.Iterable var2 = var0.getDirectedGraphNodes();
    java.util.List var3 = var0.getGraphvizNodes();
    com.google.javascript.jscomp.JSModule var5 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.SourceFile.Generator var7 = null;
    com.google.javascript.jscomp.JSSourceFile var8 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var7);
    java.lang.String var9 = var8.getName();
    var8.setOriginalPath("");
    var5.add(var8);
    com.google.javascript.jscomp.graph.GraphNode var13 = var0.getNode((java.lang.Object)var5);
    com.google.javascript.rhino.JSDocInfoBuilder var15 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    boolean var16 = var15.isPopulatedWithFileOverview();
    boolean var17 = var15.isConstructorRecorded();
    com.google.javascript.rhino.JSDocInfoBuilder var19 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    boolean var20 = var19.recordJavaDispatch();
    com.google.javascript.rhino.JSDocInfoBuilder var22 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var29 = new com.google.javascript.rhino.JSTypeExpression(var27, "");
    boolean var31 = var29.equals((java.lang.Object)'4');
    boolean var32 = var22.recordBaseType(var29);
    boolean var33 = var19.recordExtendedInterface(var29);
    boolean var34 = var29.isVarArgs();
    boolean var35 = var15.recordReturnType(var29);
    boolean var37 = var15.recordVersion("STRING ");
    boolean var40 = var15.recordParameterDescription(". (ERROR) at (unknown source) line (unknown line) : (unknown column)", "or");
    com.google.javascript.rhino.JSDocInfoBuilder var42 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var49 = new com.google.javascript.rhino.JSTypeExpression(var47, "");
    boolean var51 = var49.equals((java.lang.Object)'4');
    boolean var52 = var42.recordBaseType(var49);
    boolean var54 = var42.hasParameter("ERROR  100 [synthetic: 1]\n");
    boolean var56 = var42.hasParameter("-1");
    boolean var57 = var42.isPopulated();
    com.google.javascript.rhino.ErrorReporter var58 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var58);
    boolean var61 = var59.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.RecordTypeBuilder var62 = new com.google.javascript.rhino.jstype.RecordTypeBuilder(var59);
    com.google.javascript.rhino.ErrorReporter var63 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var63);
    boolean var66 = var64.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var67 = new com.google.javascript.rhino.jstype.FunctionBuilder(var64);
    com.google.javascript.rhino.jstype.JSType var69 = var64.getType("STRING ");
    com.google.javascript.rhino.ErrorReporter var70 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var70);
    boolean var73 = var71.hasNamespace("hi!");
    var71.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var75 = null;
    com.google.javascript.rhino.jstype.JSType var76 = null;
    com.google.javascript.rhino.jstype.JSType[] var77 = new com.google.javascript.rhino.jstype.JSType[] { var76};
    com.google.javascript.rhino.jstype.FunctionType var78 = var71.createConstructorType(var75, var77);
    com.google.javascript.rhino.jstype.ObjectType var79 = var71.createAnonymousObjectType();
    boolean var80 = var79.isVoidType();
    com.google.javascript.rhino.ErrorReporter var81 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var82 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var81);
    boolean var84 = var82.hasNamespace("hi!");
    var82.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var86 = null;
    com.google.javascript.rhino.jstype.JSType var87 = null;
    com.google.javascript.rhino.jstype.JSType[] var88 = new com.google.javascript.rhino.jstype.JSType[] { var87};
    com.google.javascript.rhino.jstype.FunctionType var89 = var82.createConstructorType(var86, var88);
    boolean var90 = var89.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var91 = var79.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var89);
    java.lang.Iterable var92 = var89.getAllImplementedInterfaces();
    com.google.javascript.rhino.jstype.JSType[] var93 = new com.google.javascript.rhino.jstype.JSType[] { var89};
    com.google.javascript.rhino.Node var94 = var64.createParametersWithVarArgs(var93);
    com.google.javascript.rhino.Node var95 = var59.createOptionalParameters(var93);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var96 = var0.isConnectedInDirection((java.lang.Object)var40, (java.lang.Object)var42, (java.lang.Object)var95);
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == true);
    
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

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test298"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    java.io.PrintStream var1 = null;
    com.google.javascript.jscomp.Compiler var2 = new com.google.javascript.jscomp.Compiler(var1);
    com.google.javascript.jscomp.Region var5 = var2.getSourceRegion("", 0);
    com.google.javascript.jscomp.Region var8 = var2.getSourceRegion("", 0);
    com.google.javascript.jscomp.LightweightMessageFormatter var9 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var2);
    com.google.javascript.jscomp.Compiler.IntermediateState var10 = var2.getState();
    var0.setState(var10);
    com.google.javascript.jscomp.JSModule var13 = new com.google.javascript.jscomp.JSModule("");
    java.util.List var14 = var13.getProvides();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var15 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var16 = var15.getNodes();
    java.lang.Iterable var17 = var15.getDirectedGraphNodes();
    java.util.List var18 = var15.getGraphvizNodes();
    com.google.javascript.jscomp.JSModuleGraph var19 = new com.google.javascript.jscomp.JSModuleGraph(var18);
    com.google.javascript.jscomp.CompilerOptions var20 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.VariableRenamingPolicy var21 = null;
    com.google.javascript.jscomp.PropertyRenamingPolicy var22 = null;
    var20.setRenamingPolicy(var21, var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.Result var24 = var0.compile(var14, var18, var20);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
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

  public void test299() {}
//   public void test299() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test299"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     java.io.PrintStream var1 = null;
//     com.google.javascript.jscomp.Compiler var2 = new com.google.javascript.jscomp.Compiler(var1);
//     com.google.javascript.jscomp.Region var5 = var2.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var8 = var2.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var9 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var2);
//     com.google.javascript.jscomp.Compiler.IntermediateState var10 = var2.getState();
//     var0.setState(var10);
//     com.google.javascript.jscomp.SourceFile.Generator var13 = null;
//     com.google.javascript.jscomp.JSSourceFile var14 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var13);
//     com.google.javascript.rhino.Node var15 = var0.parse(var14);
// 
//   }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test300"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    java.lang.Iterable var2 = var0.getDirectedGraphNodes();
    java.lang.Object var3 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var4 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var5 = var4.getNodes();
    java.lang.Iterable var6 = var4.getDirectedGraphNodes();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    var11.setIsSyntheticBlock(true);
    java.lang.String var14 = var11.getString();
    java.lang.String var15 = var11.toStringTree();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.connectIfNotFound(var3, (java.lang.Object)var6, (java.lang.Object)var15);
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
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "ERROR  100 [synthetic: 1]\n"+ "'", var15.equals("ERROR  100 [synthetic: 1]\n"));

  }

  public void test301() {}
//   public void test301() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test301"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Compiler.IntermediateState var8 = var1.getState();
//     var1.parse();
// 
//   }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test302"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = com.google.javascript.rhino.ScriptRuntime.getMessage0("ERROR");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test303"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("");
    var3.putIntProp(100, 1);
    com.google.javascript.rhino.Node var7 = var3.removeFirstChild();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var17 = new com.google.javascript.rhino.Node(1, var3, var9, var14, 1, 1);
    com.google.javascript.rhino.JSDocInfo var18 = var9.getJSDocInfo();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var19 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var20 = var19.getNodes();
    java.lang.Iterable var21 = var19.getDirectedGraphNodes();
    java.util.List var22 = var19.getGraphvizNodes();
    com.google.javascript.jscomp.JSModule var24 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.SourceFile.Generator var26 = null;
    com.google.javascript.jscomp.JSSourceFile var27 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var26);
    java.lang.String var28 = var27.getName();
    var27.setOriginalPath("");
    var24.add(var27);
    com.google.javascript.jscomp.graph.GraphNode var32 = var19.getNode((java.lang.Object)var24);
    com.google.javascript.rhino.ErrorReporter var33 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33);
    boolean var36 = var34.hasNamespace("hi!");
    var34.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var38 = null;
    com.google.javascript.rhino.jstype.JSType var39 = null;
    com.google.javascript.rhino.jstype.JSType[] var40 = new com.google.javascript.rhino.jstype.JSType[] { var39};
    com.google.javascript.rhino.jstype.FunctionType var41 = var34.createConstructorType(var38, var40);
    com.google.javascript.rhino.ErrorReporter var42 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var42);
    boolean var45 = var43.hasNamespace("hi!");
    var43.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var47 = null;
    com.google.javascript.rhino.jstype.JSType var48 = null;
    com.google.javascript.rhino.jstype.JSType[] var49 = new com.google.javascript.rhino.jstype.JSType[] { var48};
    com.google.javascript.rhino.jstype.FunctionType var50 = var43.createConstructorType(var47, var49);
    boolean var51 = var50.canBeCalled();
    var41.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var50);
    boolean var53 = var41.hasCachedValues();
    java.lang.Iterable var54 = var41.getExtendedInterfaces();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var55 = var0.isConnectedInDirection((java.lang.Object)var9, (java.lang.Object)var24, (java.lang.Object)var41);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test304() {}
//   public void test304() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test304"); }
// 
// 
//     com.google.javascript.jscomp.DefaultCodingConvention var0 = new com.google.javascript.jscomp.DefaultCodingConvention();
//     boolean var2 = var0.isConstantKey("<No stack trace available>");
//     com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.Node.newString("");
//     var5.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var9 = var5.removeFirstChild();
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var19 = new com.google.javascript.rhino.Node(1, var5, var11, var16, 1, 1);
//     java.lang.String var20 = var0.getSingletonGetterClassName(var16);
//     int var21 = var16.getType();
//     com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.Node.newString("");
//     java.lang.String var27 = var23.toString(false, true, false);
//     com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.Node.newString("");
//     var30.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var34 = var30.removeFirstChild();
//     com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var44 = new com.google.javascript.rhino.Node(1, var30, var36, var41, 1, 1);
//     boolean var45 = var36.hasSideEffects();
//     com.google.javascript.rhino.Node var46 = var23.copyInformationFromForTree(var36);
//     boolean var47 = var46.isQualifiedName();
//     com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     var52.setIsSyntheticBlock(true);
//     var16.addChildBefore(var46, var52);
// 
//   }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test305"); }


    com.google.javascript.jscomp.JSModule var2 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var4 = new com.google.javascript.jscomp.JSModule("");
    var2.addDependency(var4);
    java.util.List var6 = var2.getDependencies();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("");
    var9.putIntProp(100, 1);
    com.google.javascript.rhino.Node var13 = var9.removeFirstChild();
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var23 = new com.google.javascript.rhino.Node(1, var9, var15, var20, 1, 1);
    com.google.javascript.rhino.Node var24 = var15.getNext();
    int var26 = var15.getIntProp(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var29 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("(ERROR)", var6, var15, 409600, 1);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);

  }

  public void test306() {}
//   public void test306() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test306"); }
// 
// 
//     java.util.logging.Logger var0 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
//     double var2 = var1.getTypedPercent();
//     var1.generateReport();
//     com.google.javascript.jscomp.Compiler var4 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var1);
//     var4.reportCodeChange();
//     com.google.javascript.jscomp.JSModule var7 = new com.google.javascript.jscomp.JSModule("");
//     com.google.javascript.jscomp.JSModule var9 = new com.google.javascript.jscomp.JSModule("");
//     var7.addDependency(var9);
//     java.util.List var11 = var7.getDependencies();
//     java.util.List var12 = null;
//     com.google.javascript.jscomp.CompilerOptions var13 = new com.google.javascript.jscomp.CompilerOptions();
//     com.google.javascript.jscomp.CodingConvention var14 = var13.getCodingConvention();
//     var13.setChainCalls(false);
//     var4.init(var11, var12, var13);
// 
//   }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test307"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    java.lang.Iterable var2 = var0.getDirectedGraphNodes();
    java.util.List var3 = var0.getGraphvizNodes();
    com.google.javascript.jscomp.JSModuleGraph var4 = new com.google.javascript.jscomp.JSModuleGraph(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.JSModule[] var5 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var3);
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

  }

  public void test308() {}
//   public void test308() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test308"); }
// 
// 
//     java.io.InputStream var2 = null;
//     com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromInputStream("(STRING )", "-1", var2);
// 
//   }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test309"); }


    com.google.javascript.jscomp.DefaultCodingConvention var0 = new com.google.javascript.jscomp.DefaultCodingConvention();
    com.google.javascript.rhino.jstype.FunctionType var1 = null;
    com.google.javascript.rhino.jstype.FunctionType var2 = null;
    com.google.javascript.jscomp.CodingConvention.SubclassType var3 = null;
    var0.applySubclassRelationship(var1, var2, var3);
    java.lang.String var5 = var0.getDelegateSuperclassName();
    java.io.PrintStream var6 = null;
    com.google.javascript.jscomp.Compiler var7 = new com.google.javascript.jscomp.Compiler(var6);
    com.google.javascript.jscomp.Region var10 = var7.getSourceRegion("", 0);
    com.google.javascript.jscomp.Region var13 = var7.getSourceRegion("", 0);
    com.google.javascript.jscomp.Compiler.IntermediateState var14 = var7.getState();
    com.google.javascript.jscomp.NodeTraversal.Callback var15 = null;
    com.google.javascript.jscomp.NodeTraversal var16 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var7, var15);
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.Node.newString("");
    boolean var19 = var18.hasChildren();
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSDocInfo var25 = null;
    var24.setJSDocInfo(var25);
    com.google.javascript.rhino.Node var28 = var24.getChildAtIndex(0);
    var18.addChildrenToFront(var24);
    com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast var30 = var0.getObjectLiteralCast(var16, var24);
    java.lang.String var31 = var0.getAbstractMethodName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test310"); }


    java.lang.String var1 = com.google.javascript.rhino.Node.tokenToName(409600);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "<unknown=409600>"+ "'", var1.equals("<unknown=409600>"));

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test311"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    var1.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var5 = null;
    com.google.javascript.rhino.jstype.JSType var6 = null;
    com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
    com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
    boolean var9 = var8.canBeCalled();
    com.google.javascript.rhino.ErrorReporter var10 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var10);
    boolean var13 = var11.hasNamespace("hi!");
    var11.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var15 = null;
    com.google.javascript.rhino.jstype.JSType var16 = null;
    com.google.javascript.rhino.jstype.JSType[] var17 = new com.google.javascript.rhino.jstype.JSType[] { var16};
    com.google.javascript.rhino.jstype.FunctionType var18 = var11.createConstructorType(var15, var17);
    com.google.javascript.rhino.jstype.ObjectType var19 = var11.createAnonymousObjectType();
    boolean var20 = var19.isVoidType();
    com.google.javascript.rhino.ErrorReporter var21 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21);
    boolean var24 = var22.hasNamespace("hi!");
    var22.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var26 = null;
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.rhino.jstype.JSType[] var28 = new com.google.javascript.rhino.jstype.JSType[] { var27};
    com.google.javascript.rhino.jstype.FunctionType var29 = var22.createConstructorType(var26, var28);
    boolean var30 = var29.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var31 = var19.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var29);
    boolean var32 = var19.isEmptyType();
    boolean var33 = var8.isEquivalentTo((com.google.javascript.rhino.jstype.JSType)var19);
    com.google.javascript.rhino.ErrorReporter var34 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var34);
    boolean var37 = var35.hasNamespace("hi!");
    var35.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var39 = null;
    com.google.javascript.rhino.jstype.JSType var40 = null;
    com.google.javascript.rhino.jstype.JSType[] var41 = new com.google.javascript.rhino.jstype.JSType[] { var40};
    com.google.javascript.rhino.jstype.FunctionType var42 = var35.createConstructorType(var39, var41);
    com.google.javascript.rhino.jstype.ObjectType var43 = var35.createAnonymousObjectType();
    boolean var44 = var43.isVoidType();
    com.google.javascript.rhino.ErrorReporter var45 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var45);
    boolean var48 = var46.hasNamespace("hi!");
    var46.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var50 = null;
    com.google.javascript.rhino.jstype.JSType var51 = null;
    com.google.javascript.rhino.jstype.JSType[] var52 = new com.google.javascript.rhino.jstype.JSType[] { var51};
    com.google.javascript.rhino.jstype.FunctionType var53 = var46.createConstructorType(var50, var52);
    boolean var54 = var53.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var55 = var43.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var53);
    boolean var56 = var8.differsFrom((com.google.javascript.rhino.jstype.JSType)var43);
    java.lang.Iterable var57 = var8.getCtorImplementedInterfaces();
    java.lang.Iterable var58 = var8.getExtendedInterfaces();
    com.google.javascript.rhino.jstype.FunctionType var59 = var8.getSuperClassConstructor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test312() {}
//   public void test312() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test312"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     java.util.List var5 = null;
//     com.google.javascript.rhino.ErrorReporter var6 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var6);
//     boolean var9 = var7.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.FunctionBuilder var10 = new com.google.javascript.rhino.jstype.FunctionBuilder(var7);
//     com.google.javascript.rhino.ErrorReporter var11 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11);
//     boolean var14 = var12.hasNamespace("hi!");
//     var12.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var16 = null;
//     com.google.javascript.rhino.jstype.JSType var17 = null;
//     com.google.javascript.rhino.jstype.JSType[] var18 = new com.google.javascript.rhino.jstype.JSType[] { var17};
//     com.google.javascript.rhino.jstype.FunctionType var19 = var12.createConstructorType(var16, var18);
//     boolean var20 = var19.canBeCalled();
//     com.google.javascript.rhino.jstype.FunctionBuilder var22 = var10.withReturnType((com.google.javascript.rhino.jstype.JSType)var19, false);
//     boolean var23 = var19.canBeCalled();
//     com.google.javascript.rhino.ErrorReporter var24 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24);
//     boolean var27 = var25.hasNamespace("hi!");
//     var25.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var29 = null;
//     com.google.javascript.rhino.jstype.JSType var30 = null;
//     com.google.javascript.rhino.jstype.JSType[] var31 = new com.google.javascript.rhino.jstype.JSType[] { var30};
//     com.google.javascript.rhino.jstype.FunctionType var32 = var25.createConstructorType(var29, var31);
//     com.google.javascript.rhino.jstype.ObjectType var33 = var25.createAnonymousObjectType();
//     boolean var34 = var33.isVoidType();
//     com.google.javascript.rhino.ErrorReporter var35 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var35);
//     boolean var38 = var36.hasNamespace("hi!");
//     var36.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var40 = null;
//     com.google.javascript.rhino.jstype.JSType var41 = null;
//     com.google.javascript.rhino.jstype.JSType[] var42 = new com.google.javascript.rhino.jstype.JSType[] { var41};
//     com.google.javascript.rhino.jstype.FunctionType var43 = var36.createConstructorType(var40, var42);
//     boolean var44 = var43.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType.TypePair var45 = var33.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var43);
//     boolean var46 = var33.isEmptyType();
//     var19.setPrototypeBasedOn(var33);
//     com.google.javascript.rhino.ErrorReporter var48 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var48);
//     boolean var51 = var49.hasNamespace("hi!");
//     var49.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var53 = null;
//     com.google.javascript.rhino.jstype.JSType var54 = null;
//     com.google.javascript.rhino.jstype.JSType[] var55 = new com.google.javascript.rhino.jstype.JSType[] { var54};
//     com.google.javascript.rhino.jstype.FunctionType var56 = var49.createConstructorType(var53, var55);
//     boolean var57 = var56.canBeCalled();
//     com.google.javascript.rhino.ErrorReporter var58 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var58);
//     boolean var61 = var59.hasNamespace("hi!");
//     var59.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var63 = null;
//     com.google.javascript.rhino.jstype.JSType var64 = null;
//     com.google.javascript.rhino.jstype.JSType[] var65 = new com.google.javascript.rhino.jstype.JSType[] { var64};
//     com.google.javascript.rhino.jstype.FunctionType var66 = var59.createConstructorType(var63, var65);
//     com.google.javascript.rhino.jstype.ObjectType var67 = var59.createAnonymousObjectType();
//     boolean var68 = var67.isVoidType();
//     com.google.javascript.rhino.ErrorReporter var69 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var69);
//     boolean var72 = var70.hasNamespace("hi!");
//     var70.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var74 = null;
//     com.google.javascript.rhino.jstype.JSType var75 = null;
//     com.google.javascript.rhino.jstype.JSType[] var76 = new com.google.javascript.rhino.jstype.JSType[] { var75};
//     com.google.javascript.rhino.jstype.FunctionType var77 = var70.createConstructorType(var74, var76);
//     boolean var78 = var77.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType.TypePair var79 = var67.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var77);
//     boolean var80 = var67.isEmptyType();
//     boolean var81 = var56.isEquivalentTo((com.google.javascript.rhino.jstype.JSType)var67);
//     com.google.javascript.rhino.jstype.FunctionPrototypeType var82 = null;
//     boolean var83 = var56.setPrototype(var82);
//     com.google.javascript.rhino.JSDocInfo var85 = new com.google.javascript.rhino.JSDocInfo();
//     java.util.Set var86 = var85.getSuppressions();
//     boolean var87 = var85.isConstructor();
//     boolean var88 = var85.isExterns();
//     var56.setPropertyJSDocInfo("-1", var85, false);
//     var33.setJSDocInfo(var85);
//     java.util.List var92 = var85.getExtendedInterfaces();
//     com.google.javascript.jscomp.CompilerOptions var93 = null;
//     com.google.javascript.jscomp.Result var94 = var1.compileModules(var5, var92, var93);
// 
//   }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test313"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    java.lang.Object var2 = null;
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var3 = var0.getDirectedGraphNode(var2);
    java.lang.Object var4 = null;
    com.google.javascript.jscomp.graph.GraphNode var5 = var0.createNode(var4);
    com.google.javascript.jscomp.GoogleCodingConvention var6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.lang.Object var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.graph.Graph.GraphEdge var8 = var0.getFirstEdge((java.lang.Object)var6, var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test314() {}
//   public void test314() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test314"); }
// 
// 
//     com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot var0 = null;
//     com.google.javascript.jscomp.parsing.Config var3 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(true);
//     com.google.javascript.jscomp.mozilla.rhino.ErrorReporter var4 = null;
//     com.google.javascript.rhino.Node var5 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(var0, "<unknown=409600>", var3, var4);
// 
//   }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test315"); }


    java.util.logging.Logger var0 = null;
    com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
    double var2 = var1.getTypedPercent();
    var1.generateReport();
    com.google.javascript.jscomp.Compiler var4 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var1);
    var4.reportCodeChange();
    com.google.javascript.jscomp.SourceFile.Generator var7 = null;
    com.google.javascript.jscomp.JSSourceFile var8 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var7);
    var8.clearCachedSource();
    com.google.javascript.jscomp.JSModule var11 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var13 = new com.google.javascript.jscomp.JSModule("");
    var11.addDependency(var13);
    java.util.List var15 = var11.getDependencies();
    com.google.javascript.jscomp.JSModule var17 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var19 = new com.google.javascript.jscomp.JSModule("");
    var17.addDependency(var19);
    var11.addDependency(var17);
    com.google.javascript.jscomp.JSModule[] var22 = new com.google.javascript.jscomp.JSModule[] { var17};
    com.google.javascript.jscomp.CompilerOptions var23 = new com.google.javascript.jscomp.CompilerOptions();
    var23.setRemoveClosureAsserts(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.Result var26 = var4.compile(var8, var22, var23);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test316"); }


    java.lang.String var1 = com.google.javascript.rhino.Node.tokenToName(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "eof"+ "'", var1.equals("eof"));

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test317"); }


    java.lang.String var1 = com.google.javascript.rhino.Node.tokenToName(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "eol"+ "'", var1.equals("eol"));

  }

  public void test318() {}
//   public void test318() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test318"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
//     com.google.javascript.rhino.jstype.JSType var6 = var1.getType("STRING ");
//     com.google.javascript.rhino.ErrorReporter var7 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7);
//     boolean var10 = var8.hasNamespace("hi!");
//     var8.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var12 = null;
//     com.google.javascript.rhino.jstype.JSType var13 = null;
//     com.google.javascript.rhino.jstype.JSType[] var14 = new com.google.javascript.rhino.jstype.JSType[] { var13};
//     com.google.javascript.rhino.jstype.FunctionType var15 = var8.createConstructorType(var12, var14);
//     com.google.javascript.rhino.jstype.ObjectType var16 = var8.createAnonymousObjectType();
//     boolean var17 = var16.isVoidType();
//     com.google.javascript.rhino.ErrorReporter var18 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18);
//     boolean var21 = var19.hasNamespace("hi!");
//     var19.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var23 = null;
//     com.google.javascript.rhino.jstype.JSType var24 = null;
//     com.google.javascript.rhino.jstype.JSType[] var25 = new com.google.javascript.rhino.jstype.JSType[] { var24};
//     com.google.javascript.rhino.jstype.FunctionType var26 = var19.createConstructorType(var23, var25);
//     boolean var27 = var26.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType.TypePair var28 = var16.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var26);
//     java.lang.Iterable var29 = var26.getAllImplementedInterfaces();
//     com.google.javascript.rhino.jstype.JSType[] var30 = new com.google.javascript.rhino.jstype.JSType[] { var26};
//     com.google.javascript.rhino.Node var31 = var1.createParametersWithVarArgs(var30);
//     java.util.List var32 = null;
//     com.google.javascript.rhino.Node var33 = var1.createParameters(var32);
// 
//   }

  public void test319() {}
//   public void test319() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test319"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var5 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     com.google.javascript.jscomp.JSError[] var6 = var1.getErrors();
// 
//   }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test320"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var3 = new com.google.javascript.jscomp.JSModule("");
    var1.addDependency(var3);
    java.util.List var5 = var1.getDependencies();
    com.google.javascript.jscomp.JSModule var7 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var9 = new com.google.javascript.jscomp.JSModule("");
    var7.addDependency(var9);
    var1.addDependency(var7);
    var7.clearAsts();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var13 = var7.getPathRelativeToClosureBase();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test321() {}
//   public void test321() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test321"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "", true);
//     com.google.javascript.jscomp.CompilerInput var6 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var3, "", false);
//     com.google.javascript.jscomp.JSModule var7 = null;
//     var3.setModule(var7);
//     boolean var9 = var3.isExtern();
//     com.google.javascript.jscomp.SourceFile.Generator var11 = null;
//     com.google.javascript.jscomp.JSSourceFile var12 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var11);
//     java.lang.String var13 = var12.getName();
//     var12.setOriginalPath("");
//     var3.setSourceFile((com.google.javascript.jscomp.SourceFile)var12);
// 
//   }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test322"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.Node.newString("");
    boolean var2 = var1.hasChildren();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSDocInfo var8 = null;
    var7.setJSDocInfo(var8);
    com.google.javascript.rhino.Node var11 = var7.getChildAtIndex(0);
    var1.addChildrenToFront(var7);
    java.util.Collection var13 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.JSDocInfo var14 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(var7);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test323"); }


    com.google.javascript.rhino.Context.checkOptimizationLevel(0);

  }

  public void test324() {}
//   public void test324() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test324"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticGroup var0 = null;
//     com.google.javascript.jscomp.CheckLevel var1 = null;
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var2 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var0, var1);
//     com.google.javascript.jscomp.CheckLevel var5 = null;
//     com.google.javascript.jscomp.DiagnosticType var7 = com.google.javascript.jscomp.DiagnosticType.make("", var5, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var9 = null;
//     com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.make("", var9, "(ERROR)");
//     int var12 = var7.compareTo(var11);
//     java.lang.String[] var14 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var15 = com.google.javascript.jscomp.JSError.make(var11, var14);
//     com.google.javascript.jscomp.CheckLevel var17 = null;
//     com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.make("", var17, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var21 = null;
//     com.google.javascript.jscomp.DiagnosticType var23 = com.google.javascript.jscomp.DiagnosticType.make("", var21, "(ERROR)");
//     int var24 = var19.compareTo(var23);
//     java.lang.String[] var26 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var27 = com.google.javascript.jscomp.JSError.make(var23, var26);
//     com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make(var11, var26);
//     com.google.javascript.jscomp.DiagnosticType[] var29 = new com.google.javascript.jscomp.DiagnosticType[] { var11};
//     com.google.javascript.jscomp.DiagnosticGroup var30 = new com.google.javascript.jscomp.DiagnosticGroup(var29);
//     com.google.javascript.jscomp.DiagnosticGroup[] var31 = new com.google.javascript.jscomp.DiagnosticGroup[] { var30};
//     com.google.javascript.jscomp.DiagnosticGroup var32 = new com.google.javascript.jscomp.DiagnosticGroup("", var31);
//     boolean var33 = var2.enables(var32);
// 
//   }

  public void test325() {}
//   public void test325() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test325"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticGroup var0 = null;
//     com.google.javascript.jscomp.CheckLevel var1 = null;
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var2 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var0, var1);
//     com.google.javascript.jscomp.WarningsGuard[] var3 = new com.google.javascript.jscomp.WarningsGuard[] { var2};
//     com.google.javascript.jscomp.ComposeWarningsGuard var4 = new com.google.javascript.jscomp.ComposeWarningsGuard(var3);
//     com.google.javascript.jscomp.DiagnosticGroup var5 = null;
//     boolean var6 = var4.enables(var5);
// 
//   }

  public void test326() {}
//   public void test326() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test326"); }
// 
// 
//     com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.Node.newString("");
//     boolean var3 = var2.hasChildren();
//     java.util.List var4 = var0.identifyTypeDeclarationCall(var2);
// 
//   }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test327"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var8 = new com.google.javascript.rhino.JSTypeExpression(var6, "");
    boolean var10 = var8.equals((java.lang.Object)'4');
    boolean var11 = var1.recordBaseType(var8);
    boolean var13 = var1.addAuthor("hi!");
    boolean var15 = var1.recordFileOverview("ERROR");
    var1.markName(": (ERROR)", 409600, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test328"); }


    com.google.javascript.jscomp.SourceAst var0 = null;
    com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "", true);
    com.google.javascript.jscomp.SourceAst var4 = var3.getSourceAst();
    com.google.javascript.jscomp.CompilerInput var7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var3, "", false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var8 = var7.getPathRelativeToClosureBase();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test329"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.EcmaError var3 = com.google.javascript.rhino.ScriptRuntime.typeError2("unknown", "hi!", "TypeError: ");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test330"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.PropertyRenamingPolicy var1 = com.google.javascript.jscomp.PropertyRenamingPolicy.valueOf("JSDocInfo");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test331"); }


    long var1 = com.google.javascript.rhino.ScriptRuntime.testUint32String("ERROR  100");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test332"); }


    com.google.javascript.rhino.EcmaError var2 = com.google.javascript.rhino.ScriptRuntime.constructError("hi!", "hi!");
    int var3 = var2.getLineNumber();
    java.io.FilenameFilter var4 = null;
    java.lang.String var5 = var2.getScriptStackTrace(var4);
    int var6 = var2.lineNumber();
    java.lang.String var7 = var2.getScriptStackTrace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "<No stack trace available>"+ "'", var5.equals("<No stack trace available>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "<No stack trace available>"+ "'", var7.equals("<No stack trace available>"));

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test333"); }


    com.google.javascript.jscomp.SourceFile.Generator var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("", var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test334() {}
//   public void test334() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test334"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var5 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     com.google.javascript.jscomp.CompilerInput var7 = var1.getInput("ERROR  100");
// 
//   }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test335"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    var1.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var5 = null;
    com.google.javascript.rhino.jstype.JSType var6 = null;
    com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
    com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
    boolean var9 = var8.canBeCalled();
    com.google.javascript.rhino.jstype.JSType var10 = var8.getReturnType();
    com.google.javascript.rhino.Node var11 = var8.getSource();
    boolean var12 = var8.isFunctionType();
    com.google.javascript.rhino.jstype.JSType var14 = var8.findPropertyType("<No stack trace available>");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.ObjectType var16 = var8.getTopMostDefiningType("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test336() {}
//   public void test336() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test336"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
//     com.google.javascript.rhino.jstype.JSTypeNative var3 = null;
//     com.google.javascript.rhino.jstype.JSTypeNative[] var4 = new com.google.javascript.rhino.jstype.JSTypeNative[] { var3};
//     com.google.javascript.rhino.jstype.JSType var5 = var2.createUnionType(var4);
// 
//   }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test337"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("hi!");
    java.util.Set var2 = var1.getAllDependencies();
    java.io.PrintStream var3 = null;
    com.google.javascript.jscomp.Compiler var4 = new com.google.javascript.jscomp.Compiler(var3);
    com.google.javascript.jscomp.Region var7 = var4.getSourceRegion("", 0);
    com.google.javascript.jscomp.Region var10 = var4.getSourceRegion("", 0);
    com.google.javascript.jscomp.LightweightMessageFormatter var11 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var4);
    com.google.javascript.jscomp.Compiler.IntermediateState var12 = var4.getState();
    com.google.javascript.jscomp.SourceFile.Generator var14 = null;
    com.google.javascript.jscomp.JSSourceFile var15 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var14);
    com.google.javascript.jscomp.CompilerInput var17 = new com.google.javascript.jscomp.CompilerInput(var15, false);
    com.google.javascript.jscomp.SourceFile.Generator var19 = null;
    com.google.javascript.jscomp.JSSourceFile var20 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var19);
    java.lang.String var21 = var20.getName();
    com.google.javascript.jscomp.CompilerOptions var22 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.VariableRenamingPolicy var23 = null;
    com.google.javascript.jscomp.PropertyRenamingPolicy var24 = null;
    var22.setRenamingPolicy(var23, var24);
    com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler var26 = null;
    var22.setAliasTransformationHandler(var26);
    com.google.javascript.jscomp.Result var28 = var4.compile(var15, var20, var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.sortInputsByDeps(var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test338"); }


    com.google.javascript.jscomp.DefaultCodingConvention var0 = new com.google.javascript.jscomp.DefaultCodingConvention();
    boolean var2 = var0.isConstant("LinkedGraph");
    java.lang.String var3 = var0.getExportSymbolFunction();
    boolean var5 = var0.isPrivate("JSDocInfo");
    com.google.javascript.rhino.ErrorReporter var6 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var6);
    boolean var9 = var7.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var10 = new com.google.javascript.rhino.jstype.FunctionBuilder(var7);
    com.google.javascript.rhino.jstype.JSType var12 = var7.getType("STRING ");
    boolean var14 = var7.isForwardDeclaredType("");
    com.google.javascript.rhino.ErrorReporter var15 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var15);
    boolean var18 = var16.hasNamespace("hi!");
    var16.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var20 = null;
    com.google.javascript.rhino.jstype.JSType var21 = null;
    com.google.javascript.rhino.jstype.JSType[] var22 = new com.google.javascript.rhino.jstype.JSType[] { var21};
    com.google.javascript.rhino.jstype.FunctionType var23 = var16.createConstructorType(var20, var22);
    com.google.javascript.rhino.jstype.ObjectType var24 = var16.createAnonymousObjectType();
    boolean var25 = var24.isVoidType();
    com.google.javascript.rhino.ErrorReporter var26 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var26);
    boolean var29 = var27.hasNamespace("hi!");
    var27.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var31 = null;
    com.google.javascript.rhino.jstype.JSType var32 = null;
    com.google.javascript.rhino.jstype.JSType[] var33 = new com.google.javascript.rhino.jstype.JSType[] { var32};
    com.google.javascript.rhino.jstype.FunctionType var34 = var27.createConstructorType(var31, var33);
    boolean var35 = var34.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var36 = var24.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var34);
    boolean var37 = var24.isEmptyType();
    com.google.javascript.rhino.jstype.JSType var39 = var7.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType)var24, "(ERROR)");
    java.lang.Iterable var41 = var7.getEachReferenceTypeWithProperty("");
    com.google.javascript.jscomp.Scope var42 = null;
    com.google.javascript.jscomp.JSModule var44 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var46 = new com.google.javascript.jscomp.JSModule("");
    var44.addDependency(var46);
    java.util.List var48 = var44.getDependencies();
    java.util.List var49 = var44.getRequires();
    var0.defineDelegateProxyPrototypeProperties(var7, var42, var49);
    com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.Node.newString("");
    var52.putIntProp(100, 1);
    com.google.javascript.rhino.Node var56 = var52.removeFirstChild();
    com.google.javascript.rhino.Node var59 = com.google.javascript.rhino.Node.newString("");
    var59.putIntProp(100, 1);
    com.google.javascript.rhino.Node var63 = var59.removeFirstChild();
    com.google.javascript.rhino.Node var65 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var70 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var73 = new com.google.javascript.rhino.Node(1, var59, var65, var70, 1, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var74 = var0.extractClassNameIfRequire(var52, var73);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test339"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.Node.newString("");
    java.lang.String var6 = var2.toString(false, true, false);
    com.google.javascript.jscomp.JSModule var8 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var10 = new com.google.javascript.jscomp.JSModule("");
    var8.addDependency(var10);
    java.util.List var12 = var8.getDependencies();
    java.util.List var13 = var8.getRequires();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var14 = com.google.javascript.rhino.ScriptRuntime.getMessage2("STRING ", (java.lang.Object)false, (java.lang.Object)var13);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "STRING "+ "'", var6.equals("STRING "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test340"); }


    com.google.javascript.rhino.EvaluatorException var1 = new com.google.javascript.rhino.EvaluatorException("Node tree inequality:\nTree1:\nSTRING \n\n\nTree2:\nERROR  100\n\n\nSubtree1: STRING \n\n\nSubtree2: ERROR  100\n");

  }

  public void test341() {}
//   public void test341() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test341"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.Node.newString("");
//     java.lang.String var5 = var1.toString(false, true, false);
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("");
//     var8.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var12 = var8.removeFirstChild();
//     com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var22 = new com.google.javascript.rhino.Node(1, var8, var14, var19, 1, 1);
//     boolean var23 = var14.hasSideEffects();
//     com.google.javascript.rhino.Node var24 = var1.copyInformationFromForTree(var14);
//     com.google.javascript.jscomp.DefaultCodingConvention var25 = new com.google.javascript.jscomp.DefaultCodingConvention();
//     boolean var27 = var25.isConstantKey("<No stack trace available>");
//     com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.Node.newString("");
//     var30.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var34 = var30.removeFirstChild();
//     com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var44 = new com.google.javascript.rhino.Node(1, var30, var36, var41, 1, 1);
//     java.lang.String var45 = var25.getSingletonGetterClassName(var41);
//     int var46 = var41.getType();
//     com.google.javascript.rhino.Node var47 = var1.getChildBefore(var41);
// 
//   }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test342"); }


    java.lang.String var2 = com.google.javascript.rhino.ScriptRuntime.numberToString(0.0d, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "0"+ "'", var2.equals("0"));

  }

  public void test343() {}
//   public void test343() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test343"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticGroup var0 = null;
//     com.google.javascript.jscomp.CheckLevel var1 = null;
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var2 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var0, var1);
//     com.google.javascript.jscomp.CheckLevel var4 = null;
//     com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.make("", var4, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var8 = null;
//     com.google.javascript.jscomp.DiagnosticType var10 = com.google.javascript.jscomp.DiagnosticType.make("", var8, "(ERROR)");
//     int var11 = var6.compareTo(var10);
//     java.lang.String[] var13 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var14 = com.google.javascript.jscomp.JSError.make(var10, var13);
//     com.google.javascript.jscomp.CheckLevel var16 = null;
//     com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.make("", var16, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var20 = null;
//     com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.make("", var20, "(ERROR)");
//     int var23 = var18.compareTo(var22);
//     java.lang.String[] var25 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var26 = com.google.javascript.jscomp.JSError.make(var22, var25);
//     com.google.javascript.jscomp.JSError var27 = com.google.javascript.jscomp.JSError.make(var10, var25);
//     com.google.javascript.jscomp.DiagnosticType[] var28 = new com.google.javascript.jscomp.DiagnosticType[] { var10};
//     com.google.javascript.jscomp.DiagnosticGroup var29 = new com.google.javascript.jscomp.DiagnosticGroup(var28);
//     boolean var30 = var2.disables(var29);
// 
//   }

  public void test344() {}
//   public void test344() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test344"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var5 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("");
//     var9.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var13 = var9.removeFirstChild();
//     com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var23 = new com.google.javascript.rhino.Node(1, var9, var15, var20, 1, 1);
//     com.google.javascript.jscomp.CheckLevel var25 = null;
//     com.google.javascript.jscomp.DiagnosticType var27 = com.google.javascript.jscomp.DiagnosticType.make("", var25, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var29 = null;
//     com.google.javascript.jscomp.DiagnosticType var31 = com.google.javascript.jscomp.DiagnosticType.make("", var29, "(ERROR)");
//     int var32 = var27.compareTo(var31);
//     java.lang.String[] var33 = null;
//     com.google.javascript.jscomp.JSError var34 = com.google.javascript.jscomp.JSError.make("ERROR  100 [synthetic: 1]\n", var23, var27, var33);
//     com.google.javascript.jscomp.CheckLevel var35 = var1.getErrorLevel(var34);
// 
//   }

  public void test345() {}
//   public void test345() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test345"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
//     com.google.javascript.rhino.jstype.JSType var6 = var1.getType("STRING ");
//     com.google.javascript.rhino.ErrorReporter var7 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7);
//     boolean var10 = var8.hasNamespace("hi!");
//     var8.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var12 = null;
//     com.google.javascript.rhino.jstype.JSType var13 = null;
//     com.google.javascript.rhino.jstype.JSType[] var14 = new com.google.javascript.rhino.jstype.JSType[] { var13};
//     com.google.javascript.rhino.jstype.FunctionType var15 = var8.createConstructorType(var12, var14);
//     boolean var16 = var15.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType var17 = var15.getReturnType();
//     com.google.javascript.rhino.jstype.JSType var19 = var1.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType)var15, "");
//     var1.setLastGeneration(false);
//     com.google.javascript.rhino.jstype.FunctionType var22 = null;
//     com.google.javascript.rhino.ErrorReporter var23 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var23);
//     boolean var26 = var24.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.FunctionBuilder var27 = new com.google.javascript.rhino.jstype.FunctionBuilder(var24);
//     com.google.javascript.rhino.ErrorReporter var28 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var28);
//     boolean var31 = var29.hasNamespace("hi!");
//     var29.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var33 = null;
//     com.google.javascript.rhino.jstype.JSType var34 = null;
//     com.google.javascript.rhino.jstype.JSType[] var35 = new com.google.javascript.rhino.jstype.JSType[] { var34};
//     com.google.javascript.rhino.jstype.FunctionType var36 = var29.createConstructorType(var33, var35);
//     boolean var37 = var36.canBeCalled();
//     com.google.javascript.rhino.jstype.FunctionBuilder var39 = var27.withReturnType((com.google.javascript.rhino.jstype.JSType)var36, false);
//     com.google.javascript.rhino.jstype.FunctionType var40 = var27.build();
//     com.google.javascript.rhino.ErrorReporter var41 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var41);
//     boolean var44 = var42.hasNamespace("hi!");
//     var42.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var46 = null;
//     com.google.javascript.rhino.jstype.JSType var47 = null;
//     com.google.javascript.rhino.jstype.JSType[] var48 = new com.google.javascript.rhino.jstype.JSType[] { var47};
//     com.google.javascript.rhino.jstype.FunctionType var49 = var42.createConstructorType(var46, var48);
//     boolean var50 = var49.canBeCalled();
//     com.google.javascript.rhino.jstype.FunctionPrototypeType var51 = null;
//     boolean var52 = var49.setPrototype(var51);
//     boolean var53 = var40.hasEqualCallType(var49);
//     com.google.javascript.rhino.jstype.FunctionType var54 = var1.createFunctionTypeWithNewReturnType(var22, (com.google.javascript.rhino.jstype.JSType)var49);
// 
//   }

  public void test346() {}
//   public void test346() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test346"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Compiler.CodeBuilder var2 = null;
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.Node.newString("");
//     var6.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var10 = var6.removeFirstChild();
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var20 = new com.google.javascript.rhino.Node(1, var6, var12, var17, 1, 1);
//     com.google.javascript.rhino.JSDocInfo var21 = var12.getJSDocInfo();
//     var12.setSourcePositionForTree(100);
//     java.lang.Object var25 = null;
//     var12.putProp((-1), var25);
//     com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     var31.setIsSyntheticBlock(true);
//     java.lang.String var34 = var31.getString();
//     var31.detachChildren();
//     boolean var36 = var12.hasChild(var31);
//     var1.toSource(var2, 0, var12);
// 
//   }

  public void test347() {}
//   public void test347() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test347"); }
// 
// 
//     com.google.javascript.jscomp.DefaultCodingConvention var0 = new com.google.javascript.jscomp.DefaultCodingConvention();
//     com.google.javascript.rhino.jstype.FunctionType var1 = null;
//     com.google.javascript.rhino.jstype.FunctionType var2 = null;
//     com.google.javascript.jscomp.CodingConvention.SubclassType var3 = null;
//     var0.applySubclassRelationship(var1, var2, var3);
//     java.lang.String var5 = var0.getDelegateSuperclassName();
//     java.io.PrintStream var6 = null;
//     com.google.javascript.jscomp.Compiler var7 = new com.google.javascript.jscomp.Compiler(var6);
//     com.google.javascript.jscomp.Region var10 = var7.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var13 = var7.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Compiler.IntermediateState var14 = var7.getState();
//     com.google.javascript.jscomp.NodeTraversal.Callback var15 = null;
//     com.google.javascript.jscomp.NodeTraversal var16 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var7, var15);
//     com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.Node.newString("");
//     boolean var19 = var18.hasChildren();
//     com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.JSDocInfo var25 = null;
//     var24.setJSDocInfo(var25);
//     com.google.javascript.rhino.Node var28 = var24.getChildAtIndex(0);
//     var18.addChildrenToFront(var24);
//     com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast var30 = var0.getObjectLiteralCast(var16, var24);
//     com.google.javascript.jscomp.Scope var31 = var16.getScope();
//     int var32 = var16.getLineNumber();
//     com.google.javascript.rhino.Node var33 = var16.getCurrentNode();
//     com.google.javascript.jscomp.CompilerInput var34 = var16.getInput();
// 
//   }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test348"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    var0.pushEdgeAnnotations();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.Node.newString("");
    var5.putIntProp(100, 1);
    com.google.javascript.rhino.Node var9 = var5.removeFirstChild();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var19 = new com.google.javascript.rhino.Node(1, var5, var11, var16, 1, 1);
    int var20 = var16.getSourcePosition();
    com.google.javascript.rhino.Node var22 = var16.getAncestor(1);
    java.lang.Object var23 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.disconnect((java.lang.Object)var16, var23);
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
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 409600);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test349"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    var1.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var5 = null;
    com.google.javascript.rhino.jstype.JSType var6 = null;
    com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
    com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
    com.google.javascript.rhino.jstype.ObjectType var9 = var1.createAnonymousObjectType();
    boolean var10 = var9.isVoidType();
    com.google.javascript.rhino.ErrorReporter var11 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11);
    boolean var14 = var12.hasNamespace("hi!");
    var12.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var16 = null;
    com.google.javascript.rhino.jstype.JSType var17 = null;
    com.google.javascript.rhino.jstype.JSType[] var18 = new com.google.javascript.rhino.jstype.JSType[] { var17};
    com.google.javascript.rhino.jstype.FunctionType var19 = var12.createConstructorType(var16, var18);
    boolean var20 = var19.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var21 = var9.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var19);
    java.lang.Iterable var22 = var9.getCtorExtendedInterfaces();
    boolean var23 = var9.isResolved();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test350() {}
//   public void test350() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test350"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var5 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     com.google.javascript.jscomp.CompilerOptions var6 = null;
//     var1.initOptions(var6);
// 
//   }

  public void test351() {}
//   public void test351() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test351"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
//     com.google.javascript.rhino.ErrorReporter var3 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var3);
//     boolean var6 = var4.hasNamespace("hi!");
//     var4.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var8 = null;
//     com.google.javascript.rhino.jstype.JSType var9 = null;
//     com.google.javascript.rhino.jstype.JSType[] var10 = new com.google.javascript.rhino.jstype.JSType[] { var9};
//     com.google.javascript.rhino.jstype.FunctionType var11 = var4.createConstructorType(var8, var10);
//     com.google.javascript.rhino.ErrorReporter var12 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var12);
//     boolean var15 = var13.hasNamespace("hi!");
//     var13.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var17 = null;
//     com.google.javascript.rhino.jstype.JSType var18 = null;
//     com.google.javascript.rhino.jstype.JSType[] var19 = new com.google.javascript.rhino.jstype.JSType[] { var18};
//     com.google.javascript.rhino.jstype.FunctionType var20 = var13.createConstructorType(var17, var19);
//     boolean var21 = var20.canBeCalled();
//     var11.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var20);
//     com.google.javascript.rhino.jstype.JSType[] var23 = null;
//     com.google.javascript.rhino.jstype.FunctionType var24 = var2.createFunctionTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType)var20, var23);
// 
//   }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test352"); }


    com.google.javascript.jscomp.CheckLevel var2 = null;
    com.google.javascript.jscomp.DiagnosticType var4 = com.google.javascript.jscomp.DiagnosticType.make("", var2, "(ERROR)");
    com.google.javascript.jscomp.CheckLevel var6 = null;
    com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.make("", var6, "(ERROR)");
    int var9 = var4.compareTo(var8);
    java.lang.String[] var11 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
    com.google.javascript.jscomp.JSError var12 = com.google.javascript.jscomp.JSError.make(var8, var11);
    com.google.javascript.jscomp.CheckLevel var14 = null;
    com.google.javascript.jscomp.DiagnosticType var16 = com.google.javascript.jscomp.DiagnosticType.make("", var14, "(ERROR)");
    com.google.javascript.jscomp.CheckLevel var18 = null;
    com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.make("", var18, "(ERROR)");
    int var21 = var16.compareTo(var20);
    java.lang.String[] var23 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
    com.google.javascript.jscomp.JSError var24 = com.google.javascript.jscomp.JSError.make(var20, var23);
    com.google.javascript.jscomp.JSError var25 = com.google.javascript.jscomp.JSError.make(var8, var23);
    com.google.javascript.jscomp.DiagnosticType[] var26 = new com.google.javascript.jscomp.DiagnosticType[] { var8};
    com.google.javascript.jscomp.DiagnosticGroup var27 = new com.google.javascript.jscomp.DiagnosticGroup(var26);
    com.google.javascript.jscomp.DiagnosticGroup[] var28 = new com.google.javascript.jscomp.DiagnosticGroup[] { var27};
    com.google.javascript.jscomp.DiagnosticGroup var29 = new com.google.javascript.jscomp.DiagnosticGroup("", var28);
    com.google.javascript.jscomp.DefaultCodingConvention var30 = new com.google.javascript.jscomp.DefaultCodingConvention();
    com.google.javascript.rhino.jstype.FunctionType var31 = null;
    com.google.javascript.rhino.jstype.FunctionType var32 = null;
    com.google.javascript.jscomp.CodingConvention.SubclassType var33 = null;
    var30.applySubclassRelationship(var31, var32, var33);
    java.lang.String var35 = var30.getDelegateSuperclassName();
    java.io.PrintStream var36 = null;
    com.google.javascript.jscomp.Compiler var37 = new com.google.javascript.jscomp.Compiler(var36);
    com.google.javascript.jscomp.Region var40 = var37.getSourceRegion("", 0);
    com.google.javascript.jscomp.Region var43 = var37.getSourceRegion("", 0);
    com.google.javascript.jscomp.Compiler.IntermediateState var44 = var37.getState();
    com.google.javascript.jscomp.NodeTraversal.Callback var45 = null;
    com.google.javascript.jscomp.NodeTraversal var46 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var37, var45);
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.Node.newString("");
    boolean var49 = var48.hasChildren();
    com.google.javascript.rhino.Node var54 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSDocInfo var55 = null;
    var54.setJSDocInfo(var55);
    com.google.javascript.rhino.Node var58 = var54.getChildAtIndex(0);
    var48.addChildrenToFront(var54);
    com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast var60 = var30.getObjectLiteralCast(var46, var54);
    com.google.javascript.jscomp.Scope var61 = var46.getScope();
    com.google.javascript.rhino.Node var66 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var68 = new com.google.javascript.rhino.JSTypeExpression(var66, "");
    com.google.javascript.jscomp.CheckLevel var69 = null;
    com.google.javascript.jscomp.CheckLevel var71 = null;
    com.google.javascript.jscomp.DiagnosticType var73 = com.google.javascript.jscomp.DiagnosticType.make("", var71, "(ERROR)");
    com.google.javascript.jscomp.CheckLevel var75 = null;
    com.google.javascript.jscomp.DiagnosticType var77 = com.google.javascript.jscomp.DiagnosticType.make("", var75, "(ERROR)");
    int var78 = var73.compareTo(var77);
    com.google.javascript.jscomp.CheckLevel var80 = null;
    com.google.javascript.jscomp.DiagnosticType var82 = com.google.javascript.jscomp.DiagnosticType.make("", var80, "(ERROR)");
    com.google.javascript.jscomp.CheckLevel var84 = null;
    com.google.javascript.jscomp.DiagnosticType var86 = com.google.javascript.jscomp.DiagnosticType.make("", var84, "(ERROR)");
    com.google.javascript.jscomp.CheckLevel var88 = null;
    com.google.javascript.jscomp.DiagnosticType var90 = com.google.javascript.jscomp.DiagnosticType.make("", var88, "(ERROR)");
    int var91 = var86.compareTo(var90);
    java.lang.String[] var93 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
    com.google.javascript.jscomp.JSError var94 = com.google.javascript.jscomp.JSError.make(var90, var93);
    com.google.javascript.jscomp.JSError var95 = com.google.javascript.jscomp.JSError.make(var82, var93);
    com.google.javascript.jscomp.JSError var96 = var46.makeError(var66, var69, var77, var93);
    java.lang.String var97 = var77.toString();
    boolean var98 = var29.matches(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var97 + "' != '" + ": (ERROR)"+ "'", var97.equals(": (ERROR)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var98 == true);

  }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test353"); }


    java.nio.charset.Charset var1 = null;
    com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromFile("TypeError", var1);
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

  public void test354() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test354"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    java.lang.Object var2 = null;
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var3 = var0.getDirectedGraphNode(var2);
    java.lang.Iterable var4 = var0.getDirectedGraphNodes();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var6 = var0.getDirectedSuccNodes(var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test355() {}
//   public void test355() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test355"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.Collection var1 = var0.getNodes();
//     java.lang.Iterable var2 = var0.getDirectedGraphNodes();
//     java.util.List var3 = var0.getGraphvizNodes();
//     var0.popEdgeAnnotations();
// 
//   }

  public void test356() {}
//   public void test356() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test356"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var1);
//     java.lang.String var3 = var2.getName();
//     com.google.javascript.jscomp.CompilerInput var5 = new com.google.javascript.jscomp.CompilerInput(var2, true);
//     com.google.javascript.jscomp.JSModule var7 = new com.google.javascript.jscomp.JSModule("");
//     com.google.javascript.jscomp.JSModule var9 = new com.google.javascript.jscomp.JSModule("");
//     var7.addDependency(var9);
//     java.util.List var11 = var7.getDependencies();
//     java.util.List var12 = var7.getRequires();
//     com.google.javascript.jscomp.SourceAst var13 = null;
//     com.google.javascript.jscomp.CompilerInput var16 = new com.google.javascript.jscomp.CompilerInput(var13, "", true);
//     com.google.javascript.jscomp.SourceAst var17 = var16.getSourceAst();
//     var7.remove(var16);
//     var5.setModule(var7);
//     java.lang.String var20 = var5.getCode();
// 
//   }

  public void test357() {}
//   public void test357() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test357"); }
// 
// 
//     com.google.javascript.jscomp.DefaultCodingConvention var0 = new com.google.javascript.jscomp.DefaultCodingConvention();
//     com.google.javascript.rhino.jstype.FunctionType var1 = null;
//     com.google.javascript.rhino.jstype.FunctionType var2 = null;
//     com.google.javascript.jscomp.CodingConvention.SubclassType var3 = null;
//     var0.applySubclassRelationship(var1, var2, var3);
//     java.lang.String var5 = var0.getDelegateSuperclassName();
//     java.io.PrintStream var6 = null;
//     com.google.javascript.jscomp.Compiler var7 = new com.google.javascript.jscomp.Compiler(var6);
//     com.google.javascript.jscomp.Region var10 = var7.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var13 = var7.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Compiler.IntermediateState var14 = var7.getState();
//     com.google.javascript.jscomp.NodeTraversal.Callback var15 = null;
//     com.google.javascript.jscomp.NodeTraversal var16 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var7, var15);
//     com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.Node.newString("");
//     boolean var19 = var18.hasChildren();
//     com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.JSDocInfo var25 = null;
//     var24.setJSDocInfo(var25);
//     com.google.javascript.rhino.Node var28 = var24.getChildAtIndex(0);
//     var18.addChildrenToFront(var24);
//     com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast var30 = var0.getObjectLiteralCast(var16, var24);
//     com.google.javascript.jscomp.Scope var31 = var16.getScope();
//     com.google.javascript.rhino.Node var32 = null;
//     com.google.javascript.jscomp.CheckLevel var34 = null;
//     com.google.javascript.jscomp.DiagnosticType var36 = com.google.javascript.jscomp.DiagnosticType.make("", var34, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var38 = null;
//     com.google.javascript.jscomp.DiagnosticType var40 = com.google.javascript.jscomp.DiagnosticType.make("", var38, "(ERROR)");
//     int var41 = var36.compareTo(var40);
//     com.google.javascript.jscomp.CheckLevel var43 = null;
//     com.google.javascript.jscomp.DiagnosticType var45 = com.google.javascript.jscomp.DiagnosticType.make("", var43, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var47 = null;
//     com.google.javascript.jscomp.DiagnosticType var49 = com.google.javascript.jscomp.DiagnosticType.make("", var47, "(ERROR)");
//     int var50 = var45.compareTo(var49);
//     java.lang.String[] var52 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var53 = com.google.javascript.jscomp.JSError.make(var49, var52);
//     com.google.javascript.jscomp.CheckLevel var55 = null;
//     com.google.javascript.jscomp.DiagnosticType var57 = com.google.javascript.jscomp.DiagnosticType.make("", var55, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var59 = null;
//     com.google.javascript.jscomp.DiagnosticType var61 = com.google.javascript.jscomp.DiagnosticType.make("", var59, "(ERROR)");
//     int var62 = var57.compareTo(var61);
//     java.lang.String[] var64 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var65 = com.google.javascript.jscomp.JSError.make(var61, var64);
//     com.google.javascript.jscomp.JSError var66 = com.google.javascript.jscomp.JSError.make(var49, var64);
//     var16.report(var32, var40, var64);
// 
//   }

  public void test358() {}
//   public void test358() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test358"); }
// 
// 
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.Node.newString("");
//     var2.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var6 = var2.removeFirstChild();
//     int var7 = var2.getChildCount();
//     boolean var8 = var2.hasChildren();
//     com.google.javascript.rhino.Node var11 = new com.google.javascript.rhino.Node(100, var2, 100, (-1));
//     java.lang.Appendable var12 = null;
//     var11.appendStringTree(var12);
// 
//   }

  public void test359() {}
//   public void test359() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test359"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     var1.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var5 = null;
//     com.google.javascript.rhino.jstype.JSType var6 = null;
//     com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
//     com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
//     com.google.javascript.rhino.ErrorReporter var9 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var9);
//     boolean var12 = var10.hasNamespace("hi!");
//     var10.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var14 = null;
//     com.google.javascript.rhino.jstype.JSType var15 = null;
//     com.google.javascript.rhino.jstype.JSType[] var16 = new com.google.javascript.rhino.jstype.JSType[] { var15};
//     com.google.javascript.rhino.jstype.FunctionType var17 = var10.createConstructorType(var14, var16);
//     boolean var18 = var17.canBeCalled();
//     var8.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var17);
//     boolean var20 = var17.canBeCalled();
//     java.lang.String var21 = var17.toString();
// 
//   }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test360"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    var1.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var5 = null;
    com.google.javascript.rhino.jstype.JSType var6 = null;
    com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
    com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
    com.google.javascript.rhino.jstype.RecordTypeBuilder var9 = new com.google.javascript.rhino.jstype.RecordTypeBuilder(var1);
    com.google.javascript.rhino.jstype.JSType var10 = var9.build();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test361"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    var1.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var5 = null;
    com.google.javascript.rhino.jstype.JSType var6 = null;
    com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
    com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
    boolean var9 = var8.canBeCalled();
    com.google.javascript.rhino.jstype.JSType var10 = var8.getReturnType();
    boolean var11 = var10.isUnknownType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test362() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test362"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    java.lang.Object var2 = null;
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var3 = var0.getDirectedGraphNode(var2);
    java.lang.Iterable var4 = var0.getDirectedGraphNodes();
    com.google.javascript.rhino.ErrorReporter var5 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var5, true);
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8);
    boolean var11 = var9.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var12 = new com.google.javascript.rhino.jstype.FunctionBuilder(var9);
    java.lang.Iterable var14 = var9.getTypesWithProperty("");
    com.google.javascript.rhino.ErrorReporter var15 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var15);
    boolean var18 = var16.hasNamespace("hi!");
    var16.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var20 = null;
    com.google.javascript.rhino.jstype.JSType var21 = null;
    com.google.javascript.rhino.jstype.JSType[] var22 = new com.google.javascript.rhino.jstype.JSType[] { var21};
    com.google.javascript.rhino.jstype.FunctionType var23 = var16.createConstructorType(var20, var22);
    boolean var24 = var23.canBeCalled();
    com.google.javascript.rhino.jstype.JSType var25 = var23.getReturnType();
    com.google.javascript.rhino.Node var26 = var23.getSource();
    boolean var27 = var23.isFunctionType();
    com.google.javascript.rhino.jstype.ObjectType var28 = var9.createObjectType((com.google.javascript.rhino.jstype.ObjectType)var23);
    java.util.Collection var29 = var7.getDirectImplementors(var28);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var30 = var0.getWeight((java.lang.Object)var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test363() {}
//   public void test363() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test363"); }
// 
// 
//     java.util.List var1 = null;
//     com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("");
//     var4.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var8 = var4.removeFirstChild();
//     com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var18 = new com.google.javascript.rhino.Node(1, var4, var10, var15, 1, 1);
//     com.google.javascript.rhino.Node var19 = var10.getNext();
//     com.google.javascript.rhino.Node var22 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(". (ERROR) at (unknown source) line (unknown line) : (unknown column)", var1, var19, 100, (-1));
// 
//   }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test364"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.RecordTypeBuilder var2 = new com.google.javascript.rhino.jstype.RecordTypeBuilder(var1);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.Node.newString("");
    var6.putIntProp(100, 1);
    com.google.javascript.rhino.Node var10 = var6.removeFirstChild();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var20 = new com.google.javascript.rhino.Node(1, var6, var12, var17, 1, 1);
    boolean var21 = var20.isQuotedString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.FunctionType var22 = var1.createInterfaceType("JSDocInfo", var20);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test365"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    java.lang.Object var2 = null;
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var3 = var0.getDirectedGraphNode(var2);
    java.lang.Iterable var4 = var0.getDirectedGraphNodes();
    com.google.javascript.rhino.JSDocInfoBuilder var6 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var13 = new com.google.javascript.rhino.JSTypeExpression(var11, "");
    boolean var15 = var13.equals((java.lang.Object)'4');
    boolean var16 = var6.recordBaseType(var13);
    boolean var18 = var6.addAuthor("hi!");
    boolean var20 = var6.recordFileOverview("ERROR");
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var27 = new com.google.javascript.rhino.JSTypeExpression(var25, "");
    boolean var29 = var27.equals((java.lang.Object)'4');
    boolean var30 = var6.recordTypedef(var27);
    java.lang.Object var31 = null;
    java.lang.Object var32 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var33 = var0.isConnected((java.lang.Object)var30, var31, var32);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test366() {}
//   public void test366() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test366"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
//     com.google.javascript.rhino.jstype.JSType var6 = var1.getType("STRING ");
//     com.google.javascript.rhino.ErrorReporter var7 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7);
//     boolean var10 = var8.hasNamespace("hi!");
//     var8.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var12 = null;
//     com.google.javascript.rhino.jstype.JSType var13 = null;
//     com.google.javascript.rhino.jstype.JSType[] var14 = new com.google.javascript.rhino.jstype.JSType[] { var13};
//     com.google.javascript.rhino.jstype.FunctionType var15 = var8.createConstructorType(var12, var14);
//     com.google.javascript.rhino.jstype.ObjectType var16 = var8.createAnonymousObjectType();
//     boolean var17 = var16.isVoidType();
//     com.google.javascript.rhino.ErrorReporter var18 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18);
//     boolean var21 = var19.hasNamespace("hi!");
//     var19.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var23 = null;
//     com.google.javascript.rhino.jstype.JSType var24 = null;
//     com.google.javascript.rhino.jstype.JSType[] var25 = new com.google.javascript.rhino.jstype.JSType[] { var24};
//     com.google.javascript.rhino.jstype.FunctionType var26 = var19.createConstructorType(var23, var25);
//     boolean var27 = var26.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType.TypePair var28 = var16.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var26);
//     java.lang.Iterable var29 = var16.getCtorExtendedInterfaces();
//     com.google.javascript.rhino.jstype.JSType var30 = var16.getParameterType();
//     com.google.javascript.rhino.jstype.JSType var31 = var1.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType)var16);
//     com.google.javascript.rhino.jstype.FunctionBuilder var32 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
//     com.google.javascript.rhino.jstype.JSTypeNative var33 = null;
//     com.google.javascript.rhino.jstype.JSType var34 = var1.getNativeType(var33);
// 
//   }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test367"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
    com.google.javascript.rhino.ErrorReporter var5 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var5);
    boolean var8 = var6.hasNamespace("hi!");
    var6.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var10 = null;
    com.google.javascript.rhino.jstype.JSType var11 = null;
    com.google.javascript.rhino.jstype.JSType[] var12 = new com.google.javascript.rhino.jstype.JSType[] { var11};
    com.google.javascript.rhino.jstype.FunctionType var13 = var6.createConstructorType(var10, var12);
    boolean var14 = var13.canBeCalled();
    com.google.javascript.rhino.jstype.FunctionBuilder var16 = var4.withReturnType((com.google.javascript.rhino.jstype.JSType)var13, false);
    com.google.javascript.rhino.jstype.JSTypeRegistry var17 = null;
    com.google.javascript.rhino.jstype.FunctionParamBuilder var18 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var17);
    com.google.javascript.rhino.ErrorReporter var19 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var19);
    boolean var22 = var20.hasNamespace("hi!");
    var20.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var24 = null;
    com.google.javascript.rhino.jstype.JSType var25 = null;
    com.google.javascript.rhino.jstype.JSType[] var26 = new com.google.javascript.rhino.jstype.JSType[] { var25};
    com.google.javascript.rhino.jstype.FunctionType var27 = var20.createConstructorType(var24, var26);
    com.google.javascript.rhino.jstype.ObjectType var28 = var20.createAnonymousObjectType();
    com.google.javascript.rhino.jstype.JSType[] var29 = new com.google.javascript.rhino.jstype.JSType[] { var28};
    boolean var30 = var18.addRequiredParams(var29);
    com.google.javascript.rhino.jstype.FunctionBuilder var31 = var4.withParams(var18);
    com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.Node.newString("");
    var34.putIntProp(100, 1);
    com.google.javascript.rhino.Node var38 = var34.removeFirstChild();
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var48 = new com.google.javascript.rhino.Node(1, var34, var40, var45, 1, 1);
    int var49 = var45.getLineno();
    java.lang.RuntimeException var50 = com.google.javascript.rhino.ScriptRuntime.undefReadError((java.lang.Object)var4, (java.lang.Object)var49);
    com.google.javascript.rhino.ErrorReporter var51 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var51);
    boolean var54 = var52.hasNamespace("hi!");
    var52.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var56 = null;
    com.google.javascript.rhino.jstype.JSType var57 = null;
    com.google.javascript.rhino.jstype.JSType[] var58 = new com.google.javascript.rhino.jstype.JSType[] { var57};
    com.google.javascript.rhino.jstype.FunctionType var59 = var52.createConstructorType(var56, var58);
    com.google.javascript.rhino.ErrorReporter var60 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var60);
    boolean var63 = var61.hasNamespace("hi!");
    var61.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var65 = null;
    com.google.javascript.rhino.jstype.JSType var66 = null;
    com.google.javascript.rhino.jstype.JSType[] var67 = new com.google.javascript.rhino.jstype.JSType[] { var66};
    com.google.javascript.rhino.jstype.FunctionType var68 = var61.createConstructorType(var65, var67);
    boolean var69 = var68.canBeCalled();
    var59.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var68);
    boolean var72 = var59.isPropertyTypeInferred("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var73 = var4.copyFromOtherFunction(var59);
    com.google.javascript.rhino.Node var75 = com.google.javascript.rhino.Node.newString("");
    boolean var76 = var75.hasChildren();
    com.google.javascript.rhino.jstype.FunctionBuilder var77 = var4.withParamsNode(var75);
    com.google.javascript.rhino.jstype.FunctionBuilder var79 = var77.withName("0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);

  }

  public void test368() {}
//   public void test368() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test368"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticGroup var0 = null;
//     com.google.javascript.jscomp.CheckLevel var1 = null;
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var2 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var0, var1);
//     com.google.javascript.jscomp.WarningsGuard[] var3 = new com.google.javascript.jscomp.WarningsGuard[] { var2};
//     com.google.javascript.jscomp.ComposeWarningsGuard var4 = new com.google.javascript.jscomp.ComposeWarningsGuard(var3);
//     com.google.javascript.jscomp.CheckLevel var6 = null;
//     com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.make("", var6, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var10 = null;
//     com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.make("", var10, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var14 = null;
//     com.google.javascript.jscomp.DiagnosticType var16 = com.google.javascript.jscomp.DiagnosticType.make("", var14, "(ERROR)");
//     int var17 = var12.compareTo(var16);
//     java.lang.String[] var19 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var20 = com.google.javascript.jscomp.JSError.make(var16, var19);
//     com.google.javascript.jscomp.JSError var21 = com.google.javascript.jscomp.JSError.make(var8, var19);
//     com.google.javascript.jscomp.CheckLevel var22 = var4.level(var21);
// 
//   }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test369"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("", var1, "(ERROR)");
    com.google.javascript.rhino.ErrorReporter var4 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var4);
    boolean var7 = var5.hasNamespace("hi!");
    var5.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var9 = null;
    com.google.javascript.rhino.jstype.JSType var10 = null;
    com.google.javascript.rhino.jstype.JSType[] var11 = new com.google.javascript.rhino.jstype.JSType[] { var10};
    com.google.javascript.rhino.jstype.FunctionType var12 = var5.createConstructorType(var9, var11);
    com.google.javascript.rhino.jstype.ObjectType var13 = var5.createAnonymousObjectType();
    com.google.javascript.rhino.jstype.StaticScope var14 = null;
    var5.resolveTypesInScope(var14);
    com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode var16 = null;
    var5.setResolveMode(var16);
    boolean var18 = var3.equals((java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test370"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    var1.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var5 = null;
    com.google.javascript.rhino.jstype.JSType var6 = null;
    com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
    com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
    boolean var9 = var8.canBeCalled();
    com.google.javascript.rhino.ErrorReporter var10 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var10);
    boolean var13 = var11.hasNamespace("hi!");
    var11.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var15 = null;
    com.google.javascript.rhino.jstype.JSType var16 = null;
    com.google.javascript.rhino.jstype.JSType[] var17 = new com.google.javascript.rhino.jstype.JSType[] { var16};
    com.google.javascript.rhino.jstype.FunctionType var18 = var11.createConstructorType(var15, var17);
    com.google.javascript.rhino.jstype.ObjectType var19 = var11.createAnonymousObjectType();
    boolean var20 = var19.isVoidType();
    com.google.javascript.rhino.ErrorReporter var21 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21);
    boolean var24 = var22.hasNamespace("hi!");
    var22.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var26 = null;
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.rhino.jstype.JSType[] var28 = new com.google.javascript.rhino.jstype.JSType[] { var27};
    com.google.javascript.rhino.jstype.FunctionType var29 = var22.createConstructorType(var26, var28);
    boolean var30 = var29.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var31 = var19.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var29);
    boolean var32 = var19.isEmptyType();
    boolean var33 = var8.isEquivalentTo((com.google.javascript.rhino.jstype.JSType)var19);
    com.google.javascript.rhino.jstype.JSType var34 = var8.restrictByNotNullOrUndefined();
    boolean var35 = var34.isNoObjectType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test371() {}
//   public void test371() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test371"); }
// 
// 
//     java.util.logging.Logger var0 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
//     double var2 = var1.getTypedPercent();
//     var1.generateReport();
//     com.google.javascript.jscomp.Compiler var4 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var1);
//     boolean var5 = var4.hasErrors();
// 
//   }

  public void test372() {}
//   public void test372() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test372"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
//     com.google.javascript.rhino.ErrorReporter var5 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var5);
//     boolean var8 = var6.hasNamespace("hi!");
//     var6.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var10 = null;
//     com.google.javascript.rhino.jstype.JSType var11 = null;
//     com.google.javascript.rhino.jstype.JSType[] var12 = new com.google.javascript.rhino.jstype.JSType[] { var11};
//     com.google.javascript.rhino.jstype.FunctionType var13 = var6.createConstructorType(var10, var12);
//     boolean var14 = var13.canBeCalled();
//     com.google.javascript.rhino.jstype.FunctionBuilder var16 = var4.withReturnType((com.google.javascript.rhino.jstype.JSType)var13, false);
//     boolean var17 = var13.canBeCalled();
//     com.google.javascript.rhino.ErrorReporter var18 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18);
//     boolean var21 = var19.hasNamespace("hi!");
//     var19.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var23 = null;
//     com.google.javascript.rhino.jstype.JSType var24 = null;
//     com.google.javascript.rhino.jstype.JSType[] var25 = new com.google.javascript.rhino.jstype.JSType[] { var24};
//     com.google.javascript.rhino.jstype.FunctionType var26 = var19.createConstructorType(var23, var25);
//     com.google.javascript.rhino.jstype.ObjectType var27 = var19.createAnonymousObjectType();
//     boolean var28 = var27.isVoidType();
//     com.google.javascript.rhino.ErrorReporter var29 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29);
//     boolean var32 = var30.hasNamespace("hi!");
//     var30.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var34 = null;
//     com.google.javascript.rhino.jstype.JSType var35 = null;
//     com.google.javascript.rhino.jstype.JSType[] var36 = new com.google.javascript.rhino.jstype.JSType[] { var35};
//     com.google.javascript.rhino.jstype.FunctionType var37 = var30.createConstructorType(var34, var36);
//     boolean var38 = var37.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType.TypePair var39 = var27.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var37);
//     boolean var40 = var27.isEmptyType();
//     var13.setPrototypeBasedOn(var27);
//     java.lang.String var42 = var13.toDebugHashCodeString();
// 
//   }

  public void test373() {}
//   public void test373() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test373"); }
// 
// 
//     com.google.javascript.rhino.jstype.JSTypeRegistry var0 = null;
//     com.google.javascript.rhino.jstype.FunctionParamBuilder var1 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var0);
//     com.google.javascript.rhino.ErrorReporter var2 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
//     boolean var5 = var3.hasNamespace("hi!");
//     var3.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var7 = null;
//     com.google.javascript.rhino.jstype.JSType var8 = null;
//     com.google.javascript.rhino.jstype.JSType[] var9 = new com.google.javascript.rhino.jstype.JSType[] { var8};
//     com.google.javascript.rhino.jstype.FunctionType var10 = var3.createConstructorType(var7, var9);
//     com.google.javascript.rhino.jstype.ObjectType var11 = var3.createAnonymousObjectType();
//     com.google.javascript.rhino.jstype.JSType[] var12 = new com.google.javascript.rhino.jstype.JSType[] { var11};
//     boolean var13 = var1.addRequiredParams(var12);
//     com.google.javascript.rhino.ErrorReporter var14 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var14);
//     boolean var17 = var15.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.FunctionBuilder var18 = new com.google.javascript.rhino.jstype.FunctionBuilder(var15);
//     com.google.javascript.rhino.jstype.JSType var20 = var15.getType("STRING ");
//     boolean var22 = var15.isForwardDeclaredType("");
//     com.google.javascript.rhino.ErrorReporter var23 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var23);
//     boolean var26 = var24.hasNamespace("hi!");
//     var24.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var28 = null;
//     com.google.javascript.rhino.jstype.JSType var29 = null;
//     com.google.javascript.rhino.jstype.JSType[] var30 = new com.google.javascript.rhino.jstype.JSType[] { var29};
//     com.google.javascript.rhino.jstype.FunctionType var31 = var24.createConstructorType(var28, var30);
//     com.google.javascript.rhino.ErrorReporter var32 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32);
//     boolean var35 = var33.hasNamespace("hi!");
//     var33.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var37 = null;
//     com.google.javascript.rhino.jstype.JSType var38 = null;
//     com.google.javascript.rhino.jstype.JSType[] var39 = new com.google.javascript.rhino.jstype.JSType[] { var38};
//     com.google.javascript.rhino.jstype.FunctionType var40 = var33.createConstructorType(var37, var39);
//     boolean var41 = var40.canBeCalled();
//     var31.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var40);
//     boolean var43 = var40.canBeCalled();
//     com.google.javascript.rhino.jstype.ObjectType var44 = var15.createObjectType((com.google.javascript.rhino.jstype.ObjectType)var40);
//     boolean var45 = var1.addVarArgs((com.google.javascript.rhino.jstype.JSType)var40);
// 
//   }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test374"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    com.google.javascript.rhino.JSDocInfo var1 = new com.google.javascript.rhino.JSDocInfo();
    java.lang.String var2 = var1.getOriginalCommentString();
    boolean var3 = var1.hasType();
    var1.setDeprecated(false);
    boolean var6 = var1.isImplicitCast();
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("");
    var8.putIntProp(100, 1);
    com.google.javascript.rhino.Node var12 = var8.removeFirstChild();
    int var13 = var8.getChildCount();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.graph.Graph.GraphEdge var14 = var0.getFirstEdge((java.lang.Object)var6, (java.lang.Object)var13);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test375() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test375"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var2 = null;
    com.google.javascript.jscomp.LightweightMessageFormatter var3 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1, var2);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.Node.newString("");
    var6.putIntProp(100, 1);
    com.google.javascript.rhino.Node var10 = var6.removeFirstChild();
    int var11 = var6.getChildCount();
    boolean var12 = var6.hasChildren();
    com.google.javascript.rhino.Node var15 = new com.google.javascript.rhino.Node(100, var6, 100, (-1));
    com.google.javascript.jscomp.NodeTraversal.Callback var16 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.NodeTraversal.traverse((com.google.javascript.jscomp.AbstractCompiler)var1, var6, var16);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test376() {}
//   public void test376() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test376"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     boolean var1 = var0.isTypeCheckingEnabled();
// 
//   }

  public void test377() {}
//   public void test377() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test377"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.Collection var1 = var0.getNodes();
//     java.lang.Iterable var2 = var0.getDirectedGraphNodes();
//     java.util.List var3 = var0.getGraphvizNodes();
//     com.google.javascript.jscomp.JSModule var5 = new com.google.javascript.jscomp.JSModule("");
//     com.google.javascript.jscomp.SourceFile.Generator var7 = null;
//     com.google.javascript.jscomp.JSSourceFile var8 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var7);
//     java.lang.String var9 = var8.getName();
//     var8.setOriginalPath("");
//     var5.add(var8);
//     com.google.javascript.jscomp.graph.GraphNode var13 = var0.getNode((java.lang.Object)var5);
//     java.lang.String var14 = var0.getName();
//     com.google.javascript.rhino.ErrorReporter var15 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var15);
//     boolean var18 = var16.hasNamespace("hi!");
//     var16.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var20 = null;
//     com.google.javascript.rhino.jstype.JSType var21 = null;
//     com.google.javascript.rhino.jstype.JSType[] var22 = new com.google.javascript.rhino.jstype.JSType[] { var21};
//     com.google.javascript.rhino.jstype.FunctionType var23 = var16.createConstructorType(var20, var22);
//     boolean var24 = var23.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType var25 = var23.getReturnType();
//     com.google.javascript.rhino.Node var26 = var23.getSource();
//     com.google.javascript.rhino.ErrorReporter var27 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var27);
//     boolean var30 = var28.hasNamespace("hi!");
//     var28.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var32 = null;
//     com.google.javascript.rhino.jstype.JSType var33 = null;
//     com.google.javascript.rhino.jstype.JSType[] var34 = new com.google.javascript.rhino.jstype.JSType[] { var33};
//     com.google.javascript.rhino.jstype.FunctionType var35 = var28.createConstructorType(var32, var34);
//     boolean var36 = var35.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType var37 = var35.getReturnType();
//     var35.clearCachedValues();
//     com.google.javascript.rhino.jstype.JSType.TypePair var39 = var23.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType)var35);
//     com.google.javascript.rhino.ErrorReporter var40 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var40);
//     boolean var43 = var41.hasNamespace("hi!");
//     var41.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var45 = null;
//     com.google.javascript.rhino.jstype.JSType var46 = null;
//     com.google.javascript.rhino.jstype.JSType[] var47 = new com.google.javascript.rhino.jstype.JSType[] { var46};
//     com.google.javascript.rhino.jstype.FunctionType var48 = var41.createConstructorType(var45, var47);
//     boolean var49 = var48.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType var50 = var48.getReturnType();
//     com.google.javascript.rhino.jstype.JSType var51 = null;
//     boolean var52 = var48.isEquivalentTo(var51);
//     boolean var53 = var35.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var48);
//     com.google.javascript.rhino.ErrorReporter var54 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var54);
//     boolean var57 = var55.hasNamespace("hi!");
//     var55.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var59 = null;
//     com.google.javascript.rhino.jstype.JSType var60 = null;
//     com.google.javascript.rhino.jstype.JSType[] var61 = new com.google.javascript.rhino.jstype.JSType[] { var60};
//     com.google.javascript.rhino.jstype.FunctionType var62 = var55.createConstructorType(var59, var61);
//     com.google.javascript.rhino.jstype.ObjectType var63 = var55.createAnonymousObjectType();
//     boolean var64 = var63.isVoidType();
//     java.util.Set var65 = var63.getPropertyNames();
//     boolean var67 = var63.hasOwnProperty("or");
//     boolean var68 = var63.isNumber();
//     boolean var69 = var0.isConnected((java.lang.Object)var35, (java.lang.Object)var63);
// 
//   }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test378"); }


    com.google.javascript.jscomp.AnonymousFunctionNamingPolicy[] var0 = com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test379"); }


    com.google.javascript.rhino.Node var3 = new com.google.javascript.rhino.Node(100);
    com.google.javascript.jscomp.CheckLevel var5 = null;
    com.google.javascript.jscomp.DiagnosticType var7 = com.google.javascript.jscomp.DiagnosticType.make("", var5, "(ERROR)");
    com.google.javascript.jscomp.CheckLevel var9 = null;
    com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.make("", var9, "(ERROR)");
    int var12 = var7.compareTo(var11);
    java.lang.String[] var14 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
    com.google.javascript.jscomp.JSError var15 = com.google.javascript.jscomp.JSError.make(var11, var14);
    com.google.javascript.jscomp.CheckLevel var17 = null;
    com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.make("", var17, "(ERROR)");
    com.google.javascript.jscomp.CheckLevel var21 = null;
    com.google.javascript.jscomp.DiagnosticType var23 = com.google.javascript.jscomp.DiagnosticType.make("", var21, "(ERROR)");
    int var24 = var19.compareTo(var23);
    java.lang.String[] var26 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
    com.google.javascript.jscomp.JSError var27 = com.google.javascript.jscomp.JSError.make(var23, var26);
    com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make(var11, var26);
    com.google.javascript.jscomp.CheckLevel var30 = null;
    com.google.javascript.jscomp.DiagnosticType var32 = com.google.javascript.jscomp.DiagnosticType.make("", var30, "(ERROR)");
    com.google.javascript.jscomp.CheckLevel var34 = null;
    com.google.javascript.jscomp.DiagnosticType var36 = com.google.javascript.jscomp.DiagnosticType.make("", var34, "(ERROR)");
    int var37 = var32.compareTo(var36);
    java.lang.String[] var39 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
    com.google.javascript.jscomp.JSError var40 = com.google.javascript.jscomp.JSError.make(var36, var39);
    com.google.javascript.jscomp.JSError var41 = com.google.javascript.jscomp.JSError.make("LinkedGraph", var3, var11, var39);
    java.lang.Object var42 = null;
    com.google.javascript.rhino.ErrorReporter var43 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var43);
    boolean var46 = var44.hasNamespace("hi!");
    var44.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var48 = null;
    com.google.javascript.rhino.jstype.JSType var49 = null;
    com.google.javascript.rhino.jstype.JSType[] var50 = new com.google.javascript.rhino.jstype.JSType[] { var49};
    com.google.javascript.rhino.jstype.FunctionType var51 = var44.createConstructorType(var48, var50);
    com.google.javascript.rhino.jstype.ObjectType var52 = var44.createAnonymousObjectType();
    boolean var53 = var52.isVoidType();
    com.google.javascript.rhino.ErrorReporter var54 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var54);
    boolean var57 = var55.hasNamespace("hi!");
    var55.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var59 = null;
    com.google.javascript.rhino.jstype.JSType var60 = null;
    com.google.javascript.rhino.jstype.JSType[] var61 = new com.google.javascript.rhino.jstype.JSType[] { var60};
    com.google.javascript.rhino.jstype.FunctionType var62 = var55.createConstructorType(var59, var61);
    boolean var63 = var62.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var64 = var52.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var62);
    boolean var65 = var62.isStringValueType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var66 = com.google.javascript.rhino.ScriptRuntime.getMessage3("ERROR", (java.lang.Object)var11, var42, (java.lang.Object)var65);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);

  }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test380"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    var1.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var5 = null;
    com.google.javascript.rhino.jstype.JSType var6 = null;
    com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
    com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
    boolean var9 = var8.canBeCalled();
    com.google.javascript.rhino.jstype.JSType var10 = var8.getReturnType();
    com.google.javascript.rhino.Node var11 = var8.getSource();
    com.google.javascript.rhino.ErrorReporter var12 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var12);
    boolean var15 = var13.hasNamespace("hi!");
    var13.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var17 = null;
    com.google.javascript.rhino.jstype.JSType var18 = null;
    com.google.javascript.rhino.jstype.JSType[] var19 = new com.google.javascript.rhino.jstype.JSType[] { var18};
    com.google.javascript.rhino.jstype.FunctionType var20 = var13.createConstructorType(var17, var19);
    boolean var21 = var20.canBeCalled();
    com.google.javascript.rhino.jstype.JSType var22 = var20.getReturnType();
    var20.clearCachedValues();
    com.google.javascript.rhino.jstype.JSType.TypePair var24 = var8.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType)var20);
    com.google.javascript.rhino.ErrorReporter var25 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25);
    boolean var28 = var26.hasNamespace("hi!");
    var26.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var30 = null;
    com.google.javascript.rhino.jstype.JSType var31 = null;
    com.google.javascript.rhino.jstype.JSType[] var32 = new com.google.javascript.rhino.jstype.JSType[] { var31};
    com.google.javascript.rhino.jstype.FunctionType var33 = var26.createConstructorType(var30, var32);
    boolean var34 = var33.canBeCalled();
    com.google.javascript.rhino.jstype.JSType var35 = var33.getReturnType();
    com.google.javascript.rhino.jstype.JSType var36 = null;
    boolean var37 = var33.isEquivalentTo(var36);
    boolean var38 = var20.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var33);
    boolean var39 = var20.isUnknownType();
    java.lang.String var40 = var20.getDisplayName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);

  }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test381"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.Node.newString(0, "ERROR");
    boolean var3 = var2.isVarArgs();
    com.google.javascript.rhino.ErrorReporter var4 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var4);
    boolean var7 = var5.hasNamespace("hi!");
    var5.clearTemplateTypeName();
    com.google.javascript.rhino.ErrorReporter var9 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var9);
    boolean var12 = var10.hasNamespace("hi!");
    var10.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var14 = null;
    com.google.javascript.rhino.jstype.JSType var15 = null;
    com.google.javascript.rhino.jstype.JSType[] var16 = new com.google.javascript.rhino.jstype.JSType[] { var15};
    com.google.javascript.rhino.jstype.FunctionType var17 = var10.createConstructorType(var14, var16);
    boolean var18 = var17.canBeCalled();
    com.google.javascript.rhino.jstype.JSType var19 = var17.getReturnType();
    com.google.javascript.rhino.jstype.JSType var20 = null;
    boolean var21 = var17.isEquivalentTo(var20);
    com.google.javascript.rhino.jstype.ObjectType var22 = null;
    com.google.javascript.rhino.jstype.FunctionType var23 = var5.createFunctionTypeWithNewThisType(var17, var22);
    com.google.javascript.rhino.ErrorReporter var24 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24);
    boolean var27 = var25.hasNamespace("hi!");
    var25.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var29 = null;
    com.google.javascript.rhino.jstype.JSType var30 = null;
    com.google.javascript.rhino.jstype.JSType[] var31 = new com.google.javascript.rhino.jstype.JSType[] { var30};
    com.google.javascript.rhino.jstype.FunctionType var32 = var25.createConstructorType(var29, var31);
    boolean var33 = var32.canBeCalled();
    com.google.javascript.rhino.jstype.JSType var34 = var32.getReturnType();
    com.google.javascript.rhino.Node var35 = var32.getSource();
    com.google.javascript.rhino.ErrorReporter var36 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var36);
    boolean var39 = var37.hasNamespace("hi!");
    var37.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var41 = null;
    com.google.javascript.rhino.jstype.JSType var42 = null;
    com.google.javascript.rhino.jstype.JSType[] var43 = new com.google.javascript.rhino.jstype.JSType[] { var42};
    com.google.javascript.rhino.jstype.FunctionType var44 = var37.createConstructorType(var41, var43);
    boolean var45 = var44.canBeCalled();
    com.google.javascript.rhino.jstype.JSType var46 = var44.getReturnType();
    var44.clearCachedValues();
    com.google.javascript.rhino.jstype.JSType.TypePair var48 = var32.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType)var44);
    com.google.javascript.rhino.jstype.JSType[] var49 = new com.google.javascript.rhino.jstype.JSType[] { var44};
    com.google.javascript.rhino.Node var50 = var5.createParametersWithVarArgs(var49);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var51 = var2.removeChildAfter(var50);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test382"); }


    com.google.javascript.jscomp.DefaultCodingConvention var0 = new com.google.javascript.jscomp.DefaultCodingConvention();
    boolean var2 = var0.isConstant("LinkedGraph");
    java.lang.String var3 = var0.getExportSymbolFunction();
    java.util.Collection var4 = var0.getAssertionFunctions();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString("");
    var7.putIntProp(100, 1);
    com.google.javascript.rhino.Node var11 = var7.removeFirstChild();
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var21 = new com.google.javascript.rhino.Node(1, var7, var13, var18, 1, 1);
    com.google.javascript.rhino.JSDocInfo var22 = var13.getJSDocInfo();
    var13.setSourcePositionForTree(100);
    java.lang.String var25 = var13.getString();
    java.lang.String var26 = var0.getSingletonGetterClassName(var13);
    java.util.Collection var27 = var0.getAssertionFunctions();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test383"); }


    com.google.javascript.jscomp.DefaultCodingConvention var0 = new com.google.javascript.jscomp.DefaultCodingConvention();
    com.google.javascript.rhino.jstype.FunctionType var1 = null;
    com.google.javascript.rhino.jstype.FunctionType var2 = null;
    com.google.javascript.jscomp.CodingConvention.SubclassType var3 = null;
    var0.applySubclassRelationship(var1, var2, var3);
    java.lang.String var5 = var0.getDelegateSuperclassName();
    boolean var8 = var0.isExported("", false);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.Node.newString("");
    var11.putIntProp(100, 1);
    com.google.javascript.rhino.Node var15 = var11.removeFirstChild();
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var25 = new com.google.javascript.rhino.Node(1, var11, var17, var22, 1, 1);
    boolean var26 = var0.isVarArgsParameter(var11);
    com.google.javascript.rhino.ErrorReporter var27 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var27);
    boolean var30 = var28.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.RecordTypeBuilder var31 = new com.google.javascript.rhino.jstype.RecordTypeBuilder(var28);
    com.google.javascript.rhino.ErrorReporter var32 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32);
    boolean var35 = var33.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var36 = new com.google.javascript.rhino.jstype.FunctionBuilder(var33);
    com.google.javascript.rhino.jstype.JSType var38 = var33.getType("STRING ");
    com.google.javascript.rhino.ErrorReporter var39 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var39);
    boolean var42 = var40.hasNamespace("hi!");
    var40.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var44 = null;
    com.google.javascript.rhino.jstype.JSType var45 = null;
    com.google.javascript.rhino.jstype.JSType[] var46 = new com.google.javascript.rhino.jstype.JSType[] { var45};
    com.google.javascript.rhino.jstype.FunctionType var47 = var40.createConstructorType(var44, var46);
    com.google.javascript.rhino.jstype.ObjectType var48 = var40.createAnonymousObjectType();
    boolean var49 = var48.isVoidType();
    com.google.javascript.rhino.ErrorReporter var50 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var50);
    boolean var53 = var51.hasNamespace("hi!");
    var51.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var55 = null;
    com.google.javascript.rhino.jstype.JSType var56 = null;
    com.google.javascript.rhino.jstype.JSType[] var57 = new com.google.javascript.rhino.jstype.JSType[] { var56};
    com.google.javascript.rhino.jstype.FunctionType var58 = var51.createConstructorType(var55, var57);
    boolean var59 = var58.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var60 = var48.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var58);
    java.lang.Iterable var61 = var58.getAllImplementedInterfaces();
    com.google.javascript.rhino.jstype.JSType[] var62 = new com.google.javascript.rhino.jstype.JSType[] { var58};
    com.google.javascript.rhino.Node var63 = var33.createParametersWithVarArgs(var62);
    com.google.javascript.rhino.Node var64 = var28.createOptionalParameters(var62);
    var64.setIsSyntheticBlock(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var67 = var11.removeChildAfter(var64);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
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

  }

  public void test384() {}
//   public void test384() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test384"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     var1.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var5 = null;
//     com.google.javascript.rhino.jstype.JSType var6 = null;
//     com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
//     com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
//     com.google.javascript.rhino.jstype.ObjectType var9 = var1.createAnonymousObjectType();
//     boolean var10 = var9.isVoidType();
//     java.util.Set var11 = var9.getPropertyNames();
//     boolean var13 = var9.hasOwnProperty("or");
//     var9.clearCachedValues();
//     com.google.javascript.rhino.jstype.Visitor var15 = null;
//     java.lang.Object var16 = var9.visit(var15);
// 
//   }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test385"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    com.google.javascript.rhino.ErrorReporter var1 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var1);
    boolean var4 = var2.hasNamespace("hi!");
    var2.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var6 = null;
    com.google.javascript.rhino.jstype.JSType var7 = null;
    com.google.javascript.rhino.jstype.JSType[] var8 = new com.google.javascript.rhino.jstype.JSType[] { var7};
    com.google.javascript.rhino.jstype.FunctionType var9 = var2.createConstructorType(var6, var8);
    boolean var10 = var9.canBeCalled();
    com.google.javascript.rhino.ErrorReporter var11 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11);
    boolean var14 = var12.hasNamespace("hi!");
    var12.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var16 = null;
    com.google.javascript.rhino.jstype.JSType var17 = null;
    com.google.javascript.rhino.jstype.JSType[] var18 = new com.google.javascript.rhino.jstype.JSType[] { var17};
    com.google.javascript.rhino.jstype.FunctionType var19 = var12.createConstructorType(var16, var18);
    com.google.javascript.rhino.jstype.ObjectType var20 = var12.createAnonymousObjectType();
    boolean var21 = var20.isVoidType();
    com.google.javascript.rhino.ErrorReporter var22 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var22);
    boolean var25 = var23.hasNamespace("hi!");
    var23.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.rhino.jstype.JSType var28 = null;
    com.google.javascript.rhino.jstype.JSType[] var29 = new com.google.javascript.rhino.jstype.JSType[] { var28};
    com.google.javascript.rhino.jstype.FunctionType var30 = var23.createConstructorType(var27, var29);
    boolean var31 = var30.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var32 = var20.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var30);
    boolean var33 = var20.isEmptyType();
    boolean var34 = var9.isEquivalentTo((com.google.javascript.rhino.jstype.JSType)var20);
    com.google.javascript.rhino.ErrorReporter var35 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var35);
    boolean var38 = var36.hasNamespace("hi!");
    var36.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var40 = null;
    com.google.javascript.rhino.jstype.JSType var41 = null;
    com.google.javascript.rhino.jstype.JSType[] var42 = new com.google.javascript.rhino.jstype.JSType[] { var41};
    com.google.javascript.rhino.jstype.FunctionType var43 = var36.createConstructorType(var40, var42);
    com.google.javascript.rhino.jstype.ObjectType var44 = var36.createAnonymousObjectType();
    boolean var45 = var44.isVoidType();
    com.google.javascript.rhino.ErrorReporter var46 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var46);
    boolean var49 = var47.hasNamespace("hi!");
    var47.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var51 = null;
    com.google.javascript.rhino.jstype.JSType var52 = null;
    com.google.javascript.rhino.jstype.JSType[] var53 = new com.google.javascript.rhino.jstype.JSType[] { var52};
    com.google.javascript.rhino.jstype.FunctionType var54 = var47.createConstructorType(var51, var53);
    boolean var55 = var54.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var56 = var44.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var54);
    boolean var57 = var9.differsFrom((com.google.javascript.rhino.jstype.JSType)var44);
    java.lang.Iterable var58 = var9.getCtorImplementedInterfaces();
    com.google.javascript.rhino.ErrorReporter var59 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var59);
    com.google.javascript.rhino.jstype.RecordTypeBuilder var61 = new com.google.javascript.rhino.jstype.RecordTypeBuilder(var60);
    com.google.javascript.rhino.jstype.JSType var63 = var60.getType("-1");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var64 = var0.getDirectedGraphEdges((java.lang.Object)var58, (java.lang.Object)var60);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);

  }

  public void test386() {}
//   public void test386() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test386"); }
// 
// 
//     com.google.javascript.jscomp.DefaultCodingConvention var0 = new com.google.javascript.jscomp.DefaultCodingConvention();
//     com.google.javascript.rhino.jstype.FunctionType var1 = null;
//     com.google.javascript.rhino.jstype.FunctionType var2 = null;
//     com.google.javascript.jscomp.CodingConvention.SubclassType var3 = null;
//     var0.applySubclassRelationship(var1, var2, var3);
//     java.lang.String var5 = var0.getDelegateSuperclassName();
//     java.io.PrintStream var6 = null;
//     com.google.javascript.jscomp.Compiler var7 = new com.google.javascript.jscomp.Compiler(var6);
//     com.google.javascript.jscomp.Region var10 = var7.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var13 = var7.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Compiler.IntermediateState var14 = var7.getState();
//     com.google.javascript.jscomp.NodeTraversal.Callback var15 = null;
//     com.google.javascript.jscomp.NodeTraversal var16 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var7, var15);
//     com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.Node.newString("");
//     boolean var19 = var18.hasChildren();
//     com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.JSDocInfo var25 = null;
//     var24.setJSDocInfo(var25);
//     com.google.javascript.rhino.Node var28 = var24.getChildAtIndex(0);
//     var18.addChildrenToFront(var24);
//     com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast var30 = var0.getObjectLiteralCast(var16, var24);
//     com.google.javascript.jscomp.Scope var31 = var16.getScope();
//     com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.JSTypeExpression var38 = new com.google.javascript.rhino.JSTypeExpression(var36, "");
//     com.google.javascript.jscomp.CheckLevel var39 = null;
//     com.google.javascript.jscomp.CheckLevel var41 = null;
//     com.google.javascript.jscomp.DiagnosticType var43 = com.google.javascript.jscomp.DiagnosticType.make("", var41, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var45 = null;
//     com.google.javascript.jscomp.DiagnosticType var47 = com.google.javascript.jscomp.DiagnosticType.make("", var45, "(ERROR)");
//     int var48 = var43.compareTo(var47);
//     com.google.javascript.jscomp.CheckLevel var50 = null;
//     com.google.javascript.jscomp.DiagnosticType var52 = com.google.javascript.jscomp.DiagnosticType.make("", var50, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var54 = null;
//     com.google.javascript.jscomp.DiagnosticType var56 = com.google.javascript.jscomp.DiagnosticType.make("", var54, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var58 = null;
//     com.google.javascript.jscomp.DiagnosticType var60 = com.google.javascript.jscomp.DiagnosticType.make("", var58, "(ERROR)");
//     int var61 = var56.compareTo(var60);
//     java.lang.String[] var63 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var64 = com.google.javascript.jscomp.JSError.make(var60, var63);
//     com.google.javascript.jscomp.JSError var65 = com.google.javascript.jscomp.JSError.make(var52, var63);
//     com.google.javascript.jscomp.JSError var66 = var16.makeError(var36, var39, var47, var63);
//     com.google.javascript.jscomp.JSModule var67 = var16.getModule();
// 
//   }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test387"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.EcmaError var3 = com.google.javascript.rhino.ScriptRuntime.typeError2("", "hi!", "com.google.javascript.rhino.EvaluatorException: hi! (#10)");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test388() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test388"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
    com.google.javascript.rhino.jstype.JSType var6 = var1.getType("STRING ");
    com.google.javascript.rhino.ErrorReporter var7 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7);
    boolean var10 = var8.hasNamespace("hi!");
    var8.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var12 = null;
    com.google.javascript.rhino.jstype.JSType var13 = null;
    com.google.javascript.rhino.jstype.JSType[] var14 = new com.google.javascript.rhino.jstype.JSType[] { var13};
    com.google.javascript.rhino.jstype.FunctionType var15 = var8.createConstructorType(var12, var14);
    com.google.javascript.rhino.jstype.ObjectType var16 = var8.createAnonymousObjectType();
    boolean var17 = var16.isVoidType();
    com.google.javascript.rhino.ErrorReporter var18 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18);
    boolean var21 = var19.hasNamespace("hi!");
    var19.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var23 = null;
    com.google.javascript.rhino.jstype.JSType var24 = null;
    com.google.javascript.rhino.jstype.JSType[] var25 = new com.google.javascript.rhino.jstype.JSType[] { var24};
    com.google.javascript.rhino.jstype.FunctionType var26 = var19.createConstructorType(var23, var25);
    boolean var27 = var26.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var28 = var16.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var26);
    java.lang.Iterable var29 = var26.getAllImplementedInterfaces();
    com.google.javascript.rhino.jstype.JSType[] var30 = new com.google.javascript.rhino.jstype.JSType[] { var26};
    com.google.javascript.rhino.Node var31 = var1.createParametersWithVarArgs(var30);
    com.google.javascript.rhino.ErrorReporter var33 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33);
    boolean var36 = var34.hasNamespace("hi!");
    var34.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var38 = null;
    com.google.javascript.rhino.jstype.JSType var39 = null;
    com.google.javascript.rhino.jstype.JSType[] var40 = new com.google.javascript.rhino.jstype.JSType[] { var39};
    com.google.javascript.rhino.jstype.FunctionType var41 = var34.createConstructorType(var38, var40);
    com.google.javascript.rhino.jstype.ObjectType var42 = var34.createAnonymousObjectType();
    boolean var43 = var42.isVoidType();
    java.util.Set var44 = var42.getPropertyNames();
    boolean var45 = var42.isVoidType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.overwriteDeclaredType("JSDocInfo", (com.google.javascript.rhino.jstype.JSType)var42);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);

  }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test389"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    var1.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var5 = null;
    com.google.javascript.rhino.jstype.JSType var6 = null;
    com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
    com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
    com.google.javascript.rhino.jstype.ObjectType var9 = var1.createAnonymousObjectType();
    boolean var10 = var9.isVoidType();
    com.google.javascript.rhino.ErrorReporter var11 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11);
    boolean var14 = var12.hasNamespace("hi!");
    var12.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var16 = null;
    com.google.javascript.rhino.jstype.JSType var17 = null;
    com.google.javascript.rhino.jstype.JSType[] var18 = new com.google.javascript.rhino.jstype.JSType[] { var17};
    com.google.javascript.rhino.jstype.FunctionType var19 = var12.createConstructorType(var16, var18);
    com.google.javascript.rhino.jstype.ObjectType var20 = var12.createAnonymousObjectType();
    boolean var21 = var20.isVoidType();
    java.util.Set var22 = var20.getPropertyNames();
    boolean var24 = var20.hasOwnProperty("or");
    com.google.javascript.rhino.jstype.TernaryValue var25 = var9.testForEquality((com.google.javascript.rhino.jstype.JSType)var20);
    java.lang.Class var26 = var25.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var28 = java.lang.Enum.<java.lang.Enum>valueOf(var26, "com.google.javascript.rhino.EvaluatorException: hi! (#10)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test390() {}
//   public void test390() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test390"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Scope var2 = var1.getTopScope();
//     com.google.javascript.jscomp.Scope var3 = var1.getTopScope();
//     java.nio.charset.Charset var5 = null;
//     com.google.javascript.jscomp.JSSourceFile var6 = com.google.javascript.jscomp.JSSourceFile.fromFile("TypeError", var5);
//     java.io.PrintStream var7 = null;
//     com.google.javascript.jscomp.Compiler var8 = new com.google.javascript.jscomp.Compiler(var7);
//     com.google.javascript.jscomp.Region var11 = var8.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var14 = var8.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Compiler.IntermediateState var15 = var8.getState();
//     com.google.javascript.jscomp.SourceMap var16 = var8.getSourceMap();
//     com.google.javascript.jscomp.SourceFile.Generator var18 = null;
//     com.google.javascript.jscomp.JSSourceFile var19 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var18);
//     java.lang.String var20 = var19.getName();
//     var19.setOriginalPath("");
//     com.google.javascript.jscomp.SourceFile.Generator var24 = null;
//     com.google.javascript.jscomp.JSSourceFile var25 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var24);
//     java.lang.String var26 = var25.getName();
//     com.google.javascript.jscomp.CompilerOptions var27 = new com.google.javascript.jscomp.CompilerOptions();
//     com.google.javascript.jscomp.CodingConvention var28 = var27.getCodingConvention();
//     var27.enableExternExports(true);
//     boolean var31 = var27.isExternExportsEnabled();
//     com.google.javascript.jscomp.Result var32 = var8.compile(var19, var25, var27);
//     com.google.javascript.jscomp.JSSourceFile[] var33 = new com.google.javascript.jscomp.JSSourceFile[] { var19};
//     com.google.javascript.jscomp.CompilerOptions var34 = new com.google.javascript.jscomp.CompilerOptions();
//     com.google.javascript.jscomp.CheckLevel var36 = null;
//     com.google.javascript.jscomp.DiagnosticType var38 = com.google.javascript.jscomp.DiagnosticType.make("", var36, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var40 = null;
//     com.google.javascript.jscomp.DiagnosticType var42 = com.google.javascript.jscomp.DiagnosticType.make("", var40, "(ERROR)");
//     int var43 = var38.compareTo(var42);
//     java.lang.String[] var45 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var46 = com.google.javascript.jscomp.JSError.make(var42, var45);
//     com.google.javascript.jscomp.CheckLevel var48 = null;
//     com.google.javascript.jscomp.DiagnosticType var50 = com.google.javascript.jscomp.DiagnosticType.make("", var48, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var52 = null;
//     com.google.javascript.jscomp.DiagnosticType var54 = com.google.javascript.jscomp.DiagnosticType.make("", var52, "(ERROR)");
//     int var55 = var50.compareTo(var54);
//     java.lang.String[] var57 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var58 = com.google.javascript.jscomp.JSError.make(var54, var57);
//     com.google.javascript.jscomp.JSError var59 = com.google.javascript.jscomp.JSError.make(var42, var57);
//     com.google.javascript.jscomp.DiagnosticType[] var60 = new com.google.javascript.jscomp.DiagnosticType[] { var42};
//     com.google.javascript.jscomp.DiagnosticGroup var61 = new com.google.javascript.jscomp.DiagnosticGroup(var60);
//     com.google.javascript.jscomp.CheckLevel var62 = null;
//     var34.setWarningLevel(var61, var62);
//     com.google.javascript.jscomp.Result var64 = var1.compile(var6, var33, var34);
// 
//   }

  public void test391() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test391"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    com.google.javascript.jscomp.SourceFile.Generator var2 = null;
    com.google.javascript.jscomp.JSSourceFile var3 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var2);
    java.lang.String var4 = var3.getName();
    com.google.javascript.jscomp.CompilerInput var6 = new com.google.javascript.jscomp.CompilerInput(var3, true);
    com.google.javascript.jscomp.JSModule var8 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var10 = new com.google.javascript.jscomp.JSModule("");
    var8.addDependency(var10);
    java.util.List var12 = var8.getDependencies();
    java.util.List var13 = var8.getRequires();
    com.google.javascript.jscomp.SourceAst var14 = null;
    com.google.javascript.jscomp.CompilerInput var17 = new com.google.javascript.jscomp.CompilerInput(var14, "", true);
    com.google.javascript.jscomp.SourceAst var18 = var17.getSourceAst();
    var8.remove(var17);
    var6.setModule(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var21 = var0.getOutEdges((java.lang.Object)var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test392() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test392"); }


    com.google.javascript.rhino.EvaluatorException var5 = new com.google.javascript.rhino.EvaluatorException("hi!", "", 10, "", 1);
    int var6 = var5.lineNumber();
    java.lang.Throwable[] var7 = var5.getSuppressed();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.initColumnNumber(409600);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test393() {}
//   public void test393() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test393"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Scope var2 = var1.getTopScope();
//     com.google.javascript.jscomp.JSError[] var3 = var1.getMessages();
// 
//   }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test394"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    var1.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var5 = null;
    com.google.javascript.rhino.jstype.JSType var6 = null;
    com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
    com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
    boolean var9 = var8.canBeCalled();
    com.google.javascript.rhino.ErrorReporter var10 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var10);
    boolean var13 = var11.hasNamespace("hi!");
    var11.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var15 = null;
    com.google.javascript.rhino.jstype.JSType var16 = null;
    com.google.javascript.rhino.jstype.JSType[] var17 = new com.google.javascript.rhino.jstype.JSType[] { var16};
    com.google.javascript.rhino.jstype.FunctionType var18 = var11.createConstructorType(var15, var17);
    com.google.javascript.rhino.jstype.ObjectType var19 = var11.createAnonymousObjectType();
    boolean var20 = var19.isVoidType();
    com.google.javascript.rhino.ErrorReporter var21 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21);
    boolean var24 = var22.hasNamespace("hi!");
    var22.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var26 = null;
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.rhino.jstype.JSType[] var28 = new com.google.javascript.rhino.jstype.JSType[] { var27};
    com.google.javascript.rhino.jstype.FunctionType var29 = var22.createConstructorType(var26, var28);
    boolean var30 = var29.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var31 = var19.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var29);
    boolean var32 = var19.isEmptyType();
    boolean var33 = var8.isEquivalentTo((com.google.javascript.rhino.jstype.JSType)var19);
    com.google.javascript.rhino.jstype.FunctionPrototypeType var34 = null;
    boolean var35 = var8.setPrototype(var34);
    com.google.javascript.rhino.JSDocInfo var37 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Set var38 = var37.getSuppressions();
    boolean var39 = var37.isConstructor();
    boolean var40 = var37.isExterns();
    var8.setPropertyJSDocInfo("-1", var37, false);
    boolean var43 = var37.isDefine();
    com.google.javascript.rhino.JSTypeExpression var45 = var37.getParameterType("");
    boolean var46 = var37.isHidden();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);

  }

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test395"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.Scope var2 = var1.getTopScope();
    com.google.javascript.jscomp.Scope var3 = var1.getTopScope();
    com.google.javascript.jscomp.ErrorManager var4 = var1.getErrorManager();
    com.google.javascript.jscomp.Compiler var5 = new com.google.javascript.jscomp.Compiler(var4);
    java.io.PrintStream var6 = null;
    com.google.javascript.jscomp.Compiler var7 = new com.google.javascript.jscomp.Compiler(var6);
    com.google.javascript.jscomp.Region var10 = var7.getSourceRegion("", 0);
    com.google.javascript.jscomp.Region var13 = var7.getSourceRegion("", 0);
    com.google.javascript.jscomp.LightweightMessageFormatter var14 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var7);
    com.google.javascript.jscomp.Compiler.IntermediateState var15 = var7.getState();
    com.google.javascript.jscomp.SourceFile.Generator var17 = null;
    com.google.javascript.jscomp.JSSourceFile var18 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var17);
    com.google.javascript.jscomp.CompilerInput var20 = new com.google.javascript.jscomp.CompilerInput(var18, false);
    com.google.javascript.jscomp.SourceFile.Generator var22 = null;
    com.google.javascript.jscomp.JSSourceFile var23 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var22);
    java.lang.String var24 = var23.getName();
    com.google.javascript.jscomp.CompilerOptions var25 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.VariableRenamingPolicy var26 = null;
    com.google.javascript.jscomp.PropertyRenamingPolicy var27 = null;
    var25.setRenamingPolicy(var26, var27);
    com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler var29 = null;
    var25.setAliasTransformationHandler(var29);
    com.google.javascript.jscomp.Result var31 = var7.compile(var18, var23, var25);
    com.google.javascript.jscomp.SourceFile.Generator var33 = null;
    com.google.javascript.jscomp.JSSourceFile var34 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var33);
    java.lang.String var35 = var34.getName();
    com.google.javascript.jscomp.CompilerInput var37 = new com.google.javascript.jscomp.CompilerInput(var34, true);
    var34.clearCachedSource();
    com.google.javascript.jscomp.SourceFile.Generator var40 = null;
    com.google.javascript.jscomp.JSSourceFile var41 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var40);
    java.lang.String var42 = var41.getName();
    var41.setOriginalPath("");
    com.google.javascript.jscomp.JSSourceFile[] var45 = new com.google.javascript.jscomp.JSSourceFile[] { var41};
    java.io.PrintStream var46 = null;
    com.google.javascript.jscomp.Compiler var47 = new com.google.javascript.jscomp.Compiler(var46);
    com.google.javascript.jscomp.Region var50 = var47.getSourceRegion("", 0);
    com.google.javascript.jscomp.Region var53 = var47.getSourceRegion("", 0);
    com.google.javascript.jscomp.Compiler.IntermediateState var54 = var47.getState();
    com.google.javascript.jscomp.SourceMap var55 = var47.getSourceMap();
    com.google.javascript.jscomp.SourceFile.Generator var57 = null;
    com.google.javascript.jscomp.JSSourceFile var58 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var57);
    java.lang.String var59 = var58.getName();
    var58.setOriginalPath("");
    com.google.javascript.jscomp.SourceFile.Generator var63 = null;
    com.google.javascript.jscomp.JSSourceFile var64 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var63);
    java.lang.String var65 = var64.getName();
    com.google.javascript.jscomp.CompilerOptions var66 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.CodingConvention var67 = var66.getCodingConvention();
    var66.enableExternExports(true);
    boolean var70 = var66.isExternExportsEnabled();
    com.google.javascript.jscomp.Result var71 = var47.compile(var58, var64, var66);
    com.google.javascript.jscomp.Result var72 = var7.compile(var34, var45, var66);
    com.google.javascript.jscomp.SourceAst var73 = null;
    com.google.javascript.jscomp.CompilerInput var76 = new com.google.javascript.jscomp.CompilerInput(var73, "", true);
    com.google.javascript.jscomp.CompilerInput var79 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var76, "", false);
    com.google.javascript.jscomp.JSModule var80 = null;
    var76.setModule(var80);
    boolean var82 = var76.isExtern();
    com.google.javascript.jscomp.JSModule var84 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var86 = new com.google.javascript.jscomp.JSModule("");
    var84.addDependency(var86);
    java.util.List var88 = var84.getDependencies();
    java.util.List var89 = var84.getRequires();
    var76.setModule(var84);
    com.google.javascript.jscomp.JSModule[] var91 = new com.google.javascript.jscomp.JSModule[] { var84};
    com.google.javascript.jscomp.CompilerOptions var92 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.CodingConvention var93 = var92.getCodingConvention();
    var92.enableExternExports(true);
    var92.setDefineToDoubleLiteral("-1", 0.0d);
    var5.init(var45, var91, var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "hi!"+ "'", var59.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "hi!"+ "'", var65.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var93);

  }

  public void test396() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test396"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var8 = new com.google.javascript.rhino.JSTypeExpression(var6, "");
    boolean var10 = var8.equals((java.lang.Object)'4');
    boolean var11 = var1.recordBaseType(var8);
    boolean var12 = var1.recordExport();
    boolean var13 = var1.recordOverride();
    com.google.javascript.rhino.JSDocInfoBuilder var15 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var22 = new com.google.javascript.rhino.JSTypeExpression(var20, "");
    boolean var24 = var22.equals((java.lang.Object)'4');
    boolean var25 = var15.recordBaseType(var22);
    boolean var27 = var15.hasParameter("ERROR  100 [synthetic: 1]\n");
    boolean var29 = var15.recordMeaning("JSDocInfo");
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.Node.newString("");
    var33.putIntProp(100, 1);
    com.google.javascript.rhino.Node var37 = var33.removeFirstChild();
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var47 = new com.google.javascript.rhino.Node(1, var33, var39, var44, 1, 1);
    com.google.javascript.jscomp.CheckLevel var49 = null;
    com.google.javascript.jscomp.DiagnosticType var51 = com.google.javascript.jscomp.DiagnosticType.make("", var49, "(ERROR)");
    com.google.javascript.jscomp.CheckLevel var53 = null;
    com.google.javascript.jscomp.DiagnosticType var55 = com.google.javascript.jscomp.DiagnosticType.make("", var53, "(ERROR)");
    int var56 = var51.compareTo(var55);
    java.lang.String[] var57 = null;
    com.google.javascript.jscomp.JSError var58 = com.google.javascript.jscomp.JSError.make("ERROR  100 [synthetic: 1]\n", var47, var51, var57);
    var15.markTypeNode(var47, 0, 10, 1, true);
    var1.markTypeNode(var47, 0, 100, 100, true);
    boolean var69 = var1.recordNoCompile();
    boolean var71 = var1.recordTemplateTypeName("");
    com.google.javascript.rhino.JSDocInfoBuilder var73 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    boolean var74 = var73.recordJavaDispatch();
    com.google.javascript.rhino.JSDocInfoBuilder var76 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var81 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var83 = new com.google.javascript.rhino.JSTypeExpression(var81, "");
    boolean var85 = var83.equals((java.lang.Object)'4');
    boolean var86 = var76.recordBaseType(var83);
    boolean var87 = var73.recordExtendedInterface(var83);
    com.google.javascript.rhino.Node var92 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var94 = new com.google.javascript.rhino.JSTypeExpression(var92, "");
    boolean var96 = var94.equals((java.lang.Object)'4');
    boolean var98 = var73.recordThrowDescription(var94, "");
    boolean var99 = var1.recordReturnType(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var98 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var99 == true);

  }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test397"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromCode("", "or", "hi!: hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test398"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Context.checkLanguageVersion(1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test399() {}
//   public void test399() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test399"); }
// 
// 
//     java.io.InputStream var2 = null;
//     com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromInputStream("ERROR  100", "(ERROR)", var2);
// 
//   }

  public void test400() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test400"); }


    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSDocInfo var6 = null;
    var5.setJSDocInfo(var6);
    com.google.javascript.rhino.Node var9 = var5.getChildAtIndex(0);
    com.google.javascript.rhino.Node var10 = var5.cloneNode();
    com.google.javascript.rhino.ErrorReporter var11 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11);
    boolean var14 = var12.hasNamespace("hi!");
    var12.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var16 = null;
    com.google.javascript.rhino.jstype.JSType var17 = null;
    com.google.javascript.rhino.jstype.JSType[] var18 = new com.google.javascript.rhino.jstype.JSType[] { var17};
    com.google.javascript.rhino.jstype.FunctionType var19 = var12.createConstructorType(var16, var18);
    com.google.javascript.rhino.jstype.ObjectType var20 = var12.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var21 = null;
    com.google.javascript.rhino.jstype.StaticScope var22 = null;
    com.google.javascript.rhino.jstype.JSType var23 = var20.forceResolve(var21, var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var24 = com.google.javascript.rhino.ScriptRuntime.getMessage2("TypeError", (java.lang.Object)var5, (java.lang.Object)var20);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test401() {}
//   public void test401() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test401"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.Node.newString("");
//     boolean var2 = var1.hasChildren();
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.JSDocInfo var8 = null;
//     var7.setJSDocInfo(var8);
//     com.google.javascript.rhino.Node var11 = var7.getChildAtIndex(0);
//     var1.addChildrenToFront(var7);
//     java.lang.Appendable var13 = null;
//     var1.appendStringTree(var13);
// 
//   }

  public void test402() {}
//   public void test402() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test402"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Scope var2 = var1.getTopScope();
//     com.google.javascript.jscomp.Scope var3 = var1.getTopScope();
//     java.lang.String var4 = var1.toSource();
// 
//   }

  public void test403() {}
//   public void test403() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test403"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticGroup var0 = null;
//     com.google.javascript.jscomp.CheckLevel var1 = null;
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var2 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var0, var1);
//     java.lang.String var3 = var2.toString();
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.make("", var7, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("", var11, "(ERROR)");
//     int var14 = var9.compareTo(var13);
//     java.lang.String[] var16 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var17 = com.google.javascript.jscomp.JSError.make(var13, var16);
//     com.google.javascript.jscomp.CheckLevel var19 = null;
//     com.google.javascript.jscomp.DiagnosticType var21 = com.google.javascript.jscomp.DiagnosticType.make("", var19, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var23 = null;
//     com.google.javascript.jscomp.DiagnosticType var25 = com.google.javascript.jscomp.DiagnosticType.make("", var23, "(ERROR)");
//     int var26 = var21.compareTo(var25);
//     java.lang.String[] var28 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var29 = com.google.javascript.jscomp.JSError.make(var25, var28);
//     com.google.javascript.jscomp.JSError var30 = com.google.javascript.jscomp.JSError.make(var13, var28);
//     com.google.javascript.jscomp.DiagnosticType[] var31 = new com.google.javascript.jscomp.DiagnosticType[] { var13};
//     com.google.javascript.jscomp.DiagnosticGroup var32 = new com.google.javascript.jscomp.DiagnosticGroup(var31);
//     com.google.javascript.jscomp.DiagnosticGroup[] var33 = new com.google.javascript.jscomp.DiagnosticGroup[] { var32};
//     com.google.javascript.jscomp.DiagnosticGroup var34 = new com.google.javascript.jscomp.DiagnosticGroup("", var33);
//     com.google.javascript.jscomp.DiagnosticGroup[] var35 = new com.google.javascript.jscomp.DiagnosticGroup[] { var34};
//     com.google.javascript.jscomp.DiagnosticGroup var36 = new com.google.javascript.jscomp.DiagnosticGroup("STRING ", var35);
//     boolean var37 = var2.disables(var36);
// 
//   }

  public void test404() {}
//   public void test404() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test404"); }
// 
// 
//     java.util.logging.Logger var0 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
//     com.google.javascript.jscomp.Compiler var2 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var1);
//     var2.reportCodeChange();
//     com.google.javascript.jscomp.SourceMap var4 = var2.getSourceMap();
//     java.io.PrintStream var5 = null;
//     com.google.javascript.jscomp.Compiler var6 = new com.google.javascript.jscomp.Compiler(var5);
//     com.google.javascript.jscomp.Region var9 = var6.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var12 = var6.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Compiler.IntermediateState var13 = var6.getState();
//     com.google.javascript.jscomp.SourceMap var14 = var6.getSourceMap();
//     com.google.javascript.jscomp.SourceFile.Generator var16 = null;
//     com.google.javascript.jscomp.JSSourceFile var17 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var16);
//     java.lang.String var18 = var17.getName();
//     var17.setOriginalPath("");
//     com.google.javascript.jscomp.SourceFile.Generator var22 = null;
//     com.google.javascript.jscomp.JSSourceFile var23 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var22);
//     java.lang.String var24 = var23.getName();
//     com.google.javascript.jscomp.CompilerOptions var25 = new com.google.javascript.jscomp.CompilerOptions();
//     com.google.javascript.jscomp.CodingConvention var26 = var25.getCodingConvention();
//     var25.enableExternExports(true);
//     boolean var29 = var25.isExternExportsEnabled();
//     com.google.javascript.jscomp.Result var30 = var6.compile(var17, var23, var25);
//     java.lang.String var31 = var23.toString();
//     com.google.javascript.rhino.Node var32 = var2.parse(var23);
// 
//   }

  public void test405() {}
//   public void test405() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test405"); }
// 
// 
//     com.google.javascript.jscomp.DefaultCodingConvention var0 = new com.google.javascript.jscomp.DefaultCodingConvention();
//     boolean var2 = var0.isConstant("LinkedGraph");
//     java.lang.String var3 = var0.getExportSymbolFunction();
//     boolean var5 = var0.isPrivate("JSDocInfo");
//     com.google.javascript.rhino.ErrorReporter var6 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var6);
//     boolean var9 = var7.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.FunctionBuilder var10 = new com.google.javascript.rhino.jstype.FunctionBuilder(var7);
//     com.google.javascript.rhino.jstype.JSType var12 = var7.getType("STRING ");
//     boolean var14 = var7.isForwardDeclaredType("");
//     com.google.javascript.rhino.ErrorReporter var15 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var15);
//     boolean var18 = var16.hasNamespace("hi!");
//     var16.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var20 = null;
//     com.google.javascript.rhino.jstype.JSType var21 = null;
//     com.google.javascript.rhino.jstype.JSType[] var22 = new com.google.javascript.rhino.jstype.JSType[] { var21};
//     com.google.javascript.rhino.jstype.FunctionType var23 = var16.createConstructorType(var20, var22);
//     com.google.javascript.rhino.jstype.ObjectType var24 = var16.createAnonymousObjectType();
//     boolean var25 = var24.isVoidType();
//     com.google.javascript.rhino.ErrorReporter var26 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var26);
//     boolean var29 = var27.hasNamespace("hi!");
//     var27.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var31 = null;
//     com.google.javascript.rhino.jstype.JSType var32 = null;
//     com.google.javascript.rhino.jstype.JSType[] var33 = new com.google.javascript.rhino.jstype.JSType[] { var32};
//     com.google.javascript.rhino.jstype.FunctionType var34 = var27.createConstructorType(var31, var33);
//     boolean var35 = var34.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType.TypePair var36 = var24.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var34);
//     boolean var37 = var24.isEmptyType();
//     com.google.javascript.rhino.jstype.JSType var39 = var7.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType)var24, "(ERROR)");
//     java.lang.Iterable var41 = var7.getEachReferenceTypeWithProperty("");
//     com.google.javascript.jscomp.Scope var42 = null;
//     com.google.javascript.jscomp.JSModule var44 = new com.google.javascript.jscomp.JSModule("");
//     com.google.javascript.jscomp.JSModule var46 = new com.google.javascript.jscomp.JSModule("");
//     var44.addDependency(var46);
//     java.util.List var48 = var44.getDependencies();
//     java.util.List var49 = var44.getRequires();
//     var0.defineDelegateProxyPrototypeProperties(var7, var42, var49);
//     com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.Node.newString("");
//     java.lang.String var56 = var52.toString(false, true, false);
//     com.google.javascript.rhino.Node var59 = com.google.javascript.rhino.Node.newString("");
//     var59.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var63 = var59.removeFirstChild();
//     com.google.javascript.rhino.Node var65 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var70 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var73 = new com.google.javascript.rhino.Node(1, var59, var65, var70, 1, 1);
//     boolean var74 = var65.hasSideEffects();
//     com.google.javascript.rhino.Node var75 = var52.copyInformationFromForTree(var65);
//     com.google.javascript.rhino.Node var77 = new com.google.javascript.rhino.Node(100);
//     var52.addChildrenToFront(var77);
//     com.google.javascript.rhino.Node var79 = var77.cloneTree();
//     boolean var80 = var0.isOptionalParameter(var79);
// 
//   }

  public void test406() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test406"); }


    java.util.logging.Logger var0 = null;
    com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
    com.google.javascript.jscomp.Compiler var2 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var1);
    com.google.javascript.jscomp.JSModule var4 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var6 = new com.google.javascript.jscomp.JSModule("");
    var4.addDependency(var6);
    java.util.List var8 = var4.getDependencies();
    com.google.javascript.jscomp.DefaultCodingConvention var9 = new com.google.javascript.jscomp.DefaultCodingConvention();
    boolean var11 = var9.isConstant("LinkedGraph");
    java.lang.String var12 = var9.getExportSymbolFunction();
    boolean var14 = var9.isPrivate("JSDocInfo");
    com.google.javascript.rhino.ErrorReporter var15 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var15);
    boolean var18 = var16.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var19 = new com.google.javascript.rhino.jstype.FunctionBuilder(var16);
    com.google.javascript.rhino.jstype.JSType var21 = var16.getType("STRING ");
    boolean var23 = var16.isForwardDeclaredType("");
    com.google.javascript.rhino.ErrorReporter var24 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24);
    boolean var27 = var25.hasNamespace("hi!");
    var25.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var29 = null;
    com.google.javascript.rhino.jstype.JSType var30 = null;
    com.google.javascript.rhino.jstype.JSType[] var31 = new com.google.javascript.rhino.jstype.JSType[] { var30};
    com.google.javascript.rhino.jstype.FunctionType var32 = var25.createConstructorType(var29, var31);
    com.google.javascript.rhino.jstype.ObjectType var33 = var25.createAnonymousObjectType();
    boolean var34 = var33.isVoidType();
    com.google.javascript.rhino.ErrorReporter var35 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var35);
    boolean var38 = var36.hasNamespace("hi!");
    var36.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var40 = null;
    com.google.javascript.rhino.jstype.JSType var41 = null;
    com.google.javascript.rhino.jstype.JSType[] var42 = new com.google.javascript.rhino.jstype.JSType[] { var41};
    com.google.javascript.rhino.jstype.FunctionType var43 = var36.createConstructorType(var40, var42);
    boolean var44 = var43.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var45 = var33.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var43);
    boolean var46 = var33.isEmptyType();
    com.google.javascript.rhino.jstype.JSType var48 = var16.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType)var33, "(ERROR)");
    java.lang.Iterable var50 = var16.getEachReferenceTypeWithProperty("");
    com.google.javascript.jscomp.Scope var51 = null;
    com.google.javascript.jscomp.JSModule var53 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var55 = new com.google.javascript.jscomp.JSModule("");
    var53.addDependency(var55);
    java.util.List var57 = var53.getDependencies();
    java.util.List var58 = var53.getRequires();
    var9.defineDelegateProxyPrototypeProperties(var16, var51, var58);
    com.google.javascript.jscomp.CompilerOptions var60 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.VariableRenamingPolicy var61 = null;
    com.google.javascript.jscomp.PropertyRenamingPolicy var62 = null;
    var60.setRenamingPolicy(var61, var62);
    com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler var64 = null;
    var60.setAliasTransformationHandler(var64);
    var60.enableExternExports(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.Result var68 = var2.compileModules(var8, var58, var60);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test407() {}
//   public void test407() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test407"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var1 = null;
//     com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("", var1, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var5 = null;
//     com.google.javascript.jscomp.DiagnosticType var7 = com.google.javascript.jscomp.DiagnosticType.make("", var5, "(ERROR)");
//     int var8 = var3.compareTo(var7);
//     java.lang.String[] var10 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var11 = com.google.javascript.jscomp.JSError.make(var7, var10);
//     com.google.javascript.jscomp.CheckLevel var13 = null;
//     com.google.javascript.jscomp.DiagnosticType var15 = com.google.javascript.jscomp.DiagnosticType.make("", var13, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var17 = null;
//     com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.make("", var17, "(ERROR)");
//     int var20 = var15.compareTo(var19);
//     java.lang.String[] var22 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var23 = com.google.javascript.jscomp.JSError.make(var19, var22);
//     com.google.javascript.jscomp.JSError var24 = com.google.javascript.jscomp.JSError.make(var7, var22);
//     com.google.javascript.jscomp.CheckLevel var25 = null;
//     java.io.PrintStream var26 = null;
//     com.google.javascript.jscomp.Compiler var27 = new com.google.javascript.jscomp.Compiler(var26);
//     com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var28 = null;
//     com.google.javascript.jscomp.LightweightMessageFormatter var29 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var27, var28);
//     java.lang.String var30 = var24.format(var25, (com.google.javascript.jscomp.MessageFormatter)var29);
// 
//   }

  public void test408() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test408"); }


    com.google.javascript.rhino.EvaluatorException var1 = new com.google.javascript.rhino.EvaluatorException("unknown");

  }

  public void test409() {}
//   public void test409() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test409"); }
// 
// 
//     java.io.File var0 = null;
//     java.nio.charset.Charset var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromFile(var0, var1);
// 
//   }

  public void test410() {}
//   public void test410() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test410"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Scope var2 = var1.getTopScope();
//     com.google.javascript.jscomp.PassConfig var3 = null;
//     var1.setPassConfig(var3);
// 
//   }

  public void test411() {}
//   public void test411() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test411"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = null;
//     com.google.javascript.rhino.Context var1 = com.google.javascript.rhino.Context.enter(var0);
//     var1.addActivationName("");
//     java.lang.Object var4 = var1.getDebuggerContextData();
//     int var5 = var1.getLanguageVersion();
//     java.beans.PropertyChangeListener var6 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var1.addPropertyChangeListener(var6);
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
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 0);
// 
//   }

  public void test412() {}
//   public void test412() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test412"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = com.google.javascript.rhino.Context.enter();
//     var0.removeActivationName("<No stack trace available>");
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var0);
// 
//   }

  public void test413() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test413"); }


    com.google.javascript.rhino.EcmaError var2 = com.google.javascript.rhino.ScriptRuntime.constructError("hi!", "hi!");
    int var3 = var2.getLineNumber();
    java.io.FilenameFilter var4 = null;
    java.lang.String var5 = var2.getScriptStackTrace(var4);
    int var6 = var2.lineNumber();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.initColumnNumber(0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "<No stack trace available>"+ "'", var5.equals("<No stack trace available>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test414() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test414"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    java.lang.Object var2 = null;
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var3 = var0.getDirectedGraphNode(var2);
    java.lang.Object var4 = null;
    com.google.javascript.jscomp.graph.GraphNode var5 = var0.createNode(var4);
    com.google.javascript.jscomp.JSModule var7 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.SourceFile.Generator var9 = null;
    com.google.javascript.jscomp.JSSourceFile var10 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var9);
    java.lang.String var11 = var10.getName();
    var10.setOriginalPath("");
    var7.add(var10);
    java.lang.String var15 = var7.toString();
    com.google.javascript.rhino.Context var16 = null;
    com.google.javascript.rhino.Context var17 = com.google.javascript.rhino.Context.enter(var16);
    int var18 = var17.getOptimizationLevel();
    boolean var19 = var17.hasCompileFunctionsWithDynamicScope();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var20 = var0.isConnected((java.lang.Object)var15, (java.lang.Object)var17);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test415"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf("ERROR  100 [synthetic: 1]\n");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test416"); }


    com.google.javascript.jscomp.JSModule var2 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.SourceFile.Generator var4 = null;
    com.google.javascript.jscomp.JSSourceFile var5 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var4);
    java.lang.String var6 = var5.getName();
    var5.setOriginalPath("");
    var2.add(var5);
    com.google.javascript.rhino.EcmaError var11 = com.google.javascript.rhino.ScriptRuntime.typeError("");
    com.google.javascript.rhino.ErrorReporter var12 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var12);
    boolean var15 = var13.hasNamespace("hi!");
    var13.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var17 = null;
    com.google.javascript.rhino.jstype.JSType var18 = null;
    com.google.javascript.rhino.jstype.JSType[] var19 = new com.google.javascript.rhino.jstype.JSType[] { var18};
    com.google.javascript.rhino.jstype.FunctionType var20 = var13.createConstructorType(var17, var19);
    boolean var21 = var20.canBeCalled();
    com.google.javascript.rhino.ErrorReporter var22 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var22);
    boolean var25 = var23.hasNamespace("hi!");
    var23.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.rhino.jstype.JSType var28 = null;
    com.google.javascript.rhino.jstype.JSType[] var29 = new com.google.javascript.rhino.jstype.JSType[] { var28};
    com.google.javascript.rhino.jstype.FunctionType var30 = var23.createConstructorType(var27, var29);
    com.google.javascript.rhino.jstype.ObjectType var31 = var23.createAnonymousObjectType();
    boolean var32 = var31.isVoidType();
    com.google.javascript.rhino.ErrorReporter var33 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33);
    boolean var36 = var34.hasNamespace("hi!");
    var34.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var38 = null;
    com.google.javascript.rhino.jstype.JSType var39 = null;
    com.google.javascript.rhino.jstype.JSType[] var40 = new com.google.javascript.rhino.jstype.JSType[] { var39};
    com.google.javascript.rhino.jstype.FunctionType var41 = var34.createConstructorType(var38, var40);
    boolean var42 = var41.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var43 = var31.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var41);
    boolean var44 = var31.isEmptyType();
    boolean var45 = var20.isEquivalentTo((com.google.javascript.rhino.jstype.JSType)var31);
    com.google.javascript.rhino.jstype.FunctionPrototypeType var46 = null;
    boolean var47 = var20.setPrototype(var46);
    com.google.javascript.rhino.JSDocInfo var49 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Set var50 = var49.getSuppressions();
    boolean var51 = var49.isConstructor();
    boolean var52 = var49.isExterns();
    var20.setPropertyJSDocInfo("-1", var49, false);
    int var55 = var49.getExtendedInterfacesCount();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var56 = com.google.javascript.rhino.ScriptRuntime.getMessage3("eol", (java.lang.Object)var2, (java.lang.Object)"", (java.lang.Object)var55);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);

  }

  public void test417() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test417"); }


    java.nio.charset.Charset var1 = null;
    com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromFile("(STRING )", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test418() {}
//   public void test418() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test418"); }
// 
// 
//     com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.JSTypeExpression var7 = new com.google.javascript.rhino.JSTypeExpression(var5, "");
//     com.google.javascript.rhino.Node var10 = new com.google.javascript.rhino.Node(1, var5, 100, (-1));
//     com.google.javascript.rhino.Node.SideEffectFlags var11 = null;
//     var10.setSideEffectFlags(var11);
// 
//   }

  public void test419() {}
//   public void test419() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test419"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var5 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.make("", var7, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var11 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.make("", var11, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var15 = null;
//     com.google.javascript.jscomp.DiagnosticType var17 = com.google.javascript.jscomp.DiagnosticType.make("", var15, "(ERROR)");
//     int var18 = var13.compareTo(var17);
//     java.lang.String[] var20 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var21 = com.google.javascript.jscomp.JSError.make(var17, var20);
//     com.google.javascript.jscomp.JSError var22 = com.google.javascript.jscomp.JSError.make(var9, var20);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var23 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.lang.Iterable var24 = var23.getDirectedGraphNodes();
//     boolean var25 = var22.equals((java.lang.Object)var24);
//     com.google.javascript.jscomp.CheckLevel var26 = var1.getErrorLevel(var22);
// 
//   }

  public void test420() {}
//   public void test420() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test420"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticGroup var0 = null;
//     com.google.javascript.jscomp.CheckLevel var1 = null;
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var2 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var0, var1);
//     com.google.javascript.jscomp.WarningsGuard[] var3 = new com.google.javascript.jscomp.WarningsGuard[] { var2};
//     com.google.javascript.jscomp.ComposeWarningsGuard var4 = new com.google.javascript.jscomp.ComposeWarningsGuard(var3);
//     com.google.javascript.jscomp.ComposeWarningsGuard var5 = new com.google.javascript.jscomp.ComposeWarningsGuard(var3);
//     com.google.javascript.jscomp.CompilerOptions var6 = new com.google.javascript.jscomp.CompilerOptions();
//     com.google.javascript.jscomp.CheckLevel var8 = null;
//     com.google.javascript.jscomp.DiagnosticType var10 = com.google.javascript.jscomp.DiagnosticType.make("", var8, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var12 = null;
//     com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.make("", var12, "(ERROR)");
//     int var15 = var10.compareTo(var14);
//     java.lang.String[] var17 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var18 = com.google.javascript.jscomp.JSError.make(var14, var17);
//     com.google.javascript.jscomp.CheckLevel var20 = null;
//     com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.make("", var20, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var24 = null;
//     com.google.javascript.jscomp.DiagnosticType var26 = com.google.javascript.jscomp.DiagnosticType.make("", var24, "(ERROR)");
//     int var27 = var22.compareTo(var26);
//     java.lang.String[] var29 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var30 = com.google.javascript.jscomp.JSError.make(var26, var29);
//     com.google.javascript.jscomp.JSError var31 = com.google.javascript.jscomp.JSError.make(var14, var29);
//     com.google.javascript.jscomp.DiagnosticType[] var32 = new com.google.javascript.jscomp.DiagnosticType[] { var14};
//     com.google.javascript.jscomp.DiagnosticGroup var33 = new com.google.javascript.jscomp.DiagnosticGroup(var32);
//     com.google.javascript.jscomp.CheckLevel var34 = null;
//     var6.setWarningLevel(var33, var34);
//     boolean var36 = var5.enables(var33);
// 
//   }

  public void test421() {}
//   public void test421() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test421"); }
// 
// 
//     com.google.javascript.jscomp.JSSourceFile var0 = null;
//     com.google.javascript.jscomp.CompilerInput var2 = new com.google.javascript.jscomp.CompilerInput(var0, false);
// 
//   }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test422"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var3 = new com.google.javascript.jscomp.JSModule("");
    var1.addDependency(var3);
    java.util.List var5 = var1.getDependencies();
    com.google.javascript.jscomp.JSModule var7 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var9 = new com.google.javascript.jscomp.JSModule("");
    var7.addDependency(var9);
    var1.addDependency(var7);
    com.google.javascript.jscomp.JSModule var13 = new com.google.javascript.jscomp.JSModule("hi!");
    var1.addDependency(var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var15 = var1.getPathRelativeToClosureBase();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test423() {}
//   public void test423() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test423"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Scope var2 = var1.getTopScope();
//     com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var3 = null;
//     com.google.javascript.jscomp.LightweightMessageFormatter var4 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1, var3);
//     com.google.javascript.jscomp.JSError var5 = null;
//     java.lang.String var6 = var4.formatError(var5);
// 
//   }

  public void test424() {}
//   public void test424() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test424"); }
// 
// 
//     com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot var0 = null;
//     com.google.javascript.jscomp.parsing.Config var3 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(true);
//     com.google.javascript.jscomp.mozilla.rhino.ErrorReporter var4 = null;
//     com.google.javascript.rhino.Node var5 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(var0, "", var3, var4);
// 
//   }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test425"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var3 = new com.google.javascript.jscomp.JSModule("");
    var1.addDependency(var3);
    java.util.List var5 = var1.getDependencies();
    java.util.List var6 = var1.getRequires();
    com.google.javascript.jscomp.SourceAst var7 = null;
    com.google.javascript.jscomp.CompilerInput var10 = new com.google.javascript.jscomp.CompilerInput(var7, "", true);
    com.google.javascript.jscomp.SourceAst var11 = var10.getSourceAst();
    var1.remove(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var13 = var1.getPathRelativeToClosureBase();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test426() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test426"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
    com.google.javascript.rhino.ErrorReporter var5 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var5);
    boolean var8 = var6.hasNamespace("hi!");
    var6.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var10 = null;
    com.google.javascript.rhino.jstype.JSType var11 = null;
    com.google.javascript.rhino.jstype.JSType[] var12 = new com.google.javascript.rhino.jstype.JSType[] { var11};
    com.google.javascript.rhino.jstype.FunctionType var13 = var6.createConstructorType(var10, var12);
    boolean var14 = var13.canBeCalled();
    com.google.javascript.rhino.ErrorReporter var15 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var15);
    boolean var18 = var16.hasNamespace("hi!");
    var16.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var20 = null;
    com.google.javascript.rhino.jstype.JSType var21 = null;
    com.google.javascript.rhino.jstype.JSType[] var22 = new com.google.javascript.rhino.jstype.JSType[] { var21};
    com.google.javascript.rhino.jstype.FunctionType var23 = var16.createConstructorType(var20, var22);
    com.google.javascript.rhino.jstype.ObjectType var24 = var16.createAnonymousObjectType();
    boolean var25 = var24.isVoidType();
    com.google.javascript.rhino.ErrorReporter var26 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var26);
    boolean var29 = var27.hasNamespace("hi!");
    var27.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var31 = null;
    com.google.javascript.rhino.jstype.JSType var32 = null;
    com.google.javascript.rhino.jstype.JSType[] var33 = new com.google.javascript.rhino.jstype.JSType[] { var32};
    com.google.javascript.rhino.jstype.FunctionType var34 = var27.createConstructorType(var31, var33);
    boolean var35 = var34.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var36 = var24.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var34);
    boolean var37 = var24.isEmptyType();
    boolean var38 = var13.isEquivalentTo((com.google.javascript.rhino.jstype.JSType)var24);
    java.lang.RuntimeException var39 = com.google.javascript.rhino.ScriptRuntime.undefReadError((java.lang.Object)var4, (java.lang.Object)var38);
    com.google.javascript.rhino.jstype.FunctionType var40 = var4.build();
    java.lang.String var41 = var40.getDisplayName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);

  }

  public void test427() {}
//   public void test427() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test427"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.Collection var1 = var0.getNodes();
//     java.lang.Iterable var2 = var0.getDirectedGraphNodes();
//     java.util.List var3 = var0.getGraphvizNodes();
//     com.google.javascript.jscomp.JSModule var5 = new com.google.javascript.jscomp.JSModule("");
//     com.google.javascript.jscomp.SourceFile.Generator var7 = null;
//     com.google.javascript.jscomp.JSSourceFile var8 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var7);
//     java.lang.String var9 = var8.getName();
//     var8.setOriginalPath("");
//     var5.add(var8);
//     com.google.javascript.jscomp.graph.GraphNode var13 = var0.getNode((java.lang.Object)var5);
//     java.lang.String var14 = var0.getName();
//     com.google.javascript.rhino.ErrorReporter var15 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var15);
//     com.google.javascript.rhino.jstype.RecordTypeBuilder var17 = new com.google.javascript.rhino.jstype.RecordTypeBuilder(var16);
//     java.util.Iterator var18 = var0.getNeighborNodesIterator((java.lang.Object)var16);
// 
//   }

  public void test428() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test428"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var8 = new com.google.javascript.rhino.JSTypeExpression(var6, "");
    boolean var10 = var8.equals((java.lang.Object)'4');
    boolean var11 = var1.recordBaseType(var8);
    boolean var12 = var1.recordExport();
    boolean var13 = var1.recordOverride();
    com.google.javascript.rhino.JSDocInfoBuilder var15 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var22 = new com.google.javascript.rhino.JSTypeExpression(var20, "");
    boolean var24 = var22.equals((java.lang.Object)'4');
    boolean var25 = var15.recordBaseType(var22);
    boolean var27 = var15.hasParameter("ERROR  100 [synthetic: 1]\n");
    boolean var29 = var15.recordMeaning("JSDocInfo");
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.Node.newString("");
    var33.putIntProp(100, 1);
    com.google.javascript.rhino.Node var37 = var33.removeFirstChild();
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var47 = new com.google.javascript.rhino.Node(1, var33, var39, var44, 1, 1);
    com.google.javascript.jscomp.CheckLevel var49 = null;
    com.google.javascript.jscomp.DiagnosticType var51 = com.google.javascript.jscomp.DiagnosticType.make("", var49, "(ERROR)");
    com.google.javascript.jscomp.CheckLevel var53 = null;
    com.google.javascript.jscomp.DiagnosticType var55 = com.google.javascript.jscomp.DiagnosticType.make("", var53, "(ERROR)");
    int var56 = var51.compareTo(var55);
    java.lang.String[] var57 = null;
    com.google.javascript.jscomp.JSError var58 = com.google.javascript.jscomp.JSError.make("ERROR  100 [synthetic: 1]\n", var47, var51, var57);
    var15.markTypeNode(var47, 0, 10, 1, true);
    var1.markTypeNode(var47, 0, 100, 100, true);
    boolean var70 = var1.addAuthor("eol");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == true);

  }

  public void test429() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test429"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    var1.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var5 = null;
    com.google.javascript.rhino.jstype.JSType var6 = null;
    com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
    com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
    boolean var9 = var8.canBeCalled();
    com.google.javascript.rhino.jstype.JSType var10 = var8.getReturnType();
    com.google.javascript.rhino.Node var11 = var8.getSource();
    boolean var12 = var8.isInstanceType();
    com.google.javascript.rhino.jstype.FunctionPrototypeType var13 = var8.getPrototype();
    boolean var14 = var13.isFunctionPrototypeType();
    java.lang.Iterable var15 = var13.getCtorExtendedInterfaces();
    com.google.javascript.rhino.JSDocInfo var16 = var13.getJSDocInfo();
    java.lang.Iterable var17 = var13.getCtorExtendedInterfaces();
    boolean var18 = var13.isFunctionPrototypeType();
    com.google.javascript.rhino.JSDocInfo var19 = var13.getJSDocInfo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test430() {}
//   public void test430() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test430"); }
// 
// 
//     com.google.javascript.rhino.jstype.JSTypeRegistry var0 = null;
//     com.google.javascript.rhino.jstype.FunctionParamBuilder var1 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var0);
//     com.google.javascript.rhino.ErrorReporter var2 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
//     boolean var5 = var3.hasNamespace("hi!");
//     var3.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var7 = null;
//     com.google.javascript.rhino.jstype.JSType var8 = null;
//     com.google.javascript.rhino.jstype.JSType[] var9 = new com.google.javascript.rhino.jstype.JSType[] { var8};
//     com.google.javascript.rhino.jstype.FunctionType var10 = var3.createConstructorType(var7, var9);
//     com.google.javascript.rhino.ErrorReporter var11 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11);
//     boolean var14 = var12.hasNamespace("hi!");
//     var12.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var16 = null;
//     com.google.javascript.rhino.jstype.JSType var17 = null;
//     com.google.javascript.rhino.jstype.JSType[] var18 = new com.google.javascript.rhino.jstype.JSType[] { var17};
//     com.google.javascript.rhino.jstype.FunctionType var19 = var12.createConstructorType(var16, var18);
//     boolean var20 = var19.canBeCalled();
//     var10.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var19);
//     boolean var22 = var10.hasCachedValues();
//     java.lang.Iterable var23 = var10.getExtendedInterfaces();
//     boolean var24 = var1.addVarArgs((com.google.javascript.rhino.jstype.JSType)var10);
// 
//   }

  public void test431() {}
//   public void test431() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test431"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Scope var2 = var1.getTopScope();
//     com.google.javascript.jscomp.Scope var3 = var1.getTopScope();
//     var1.disableThreads();
//     com.google.javascript.jscomp.PassConfig var5 = null;
//     var1.setPassConfig(var5);
// 
//   }

  public void test432() {}
//   public void test432() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test432"); }
// 
// 
//     com.google.javascript.rhino.jstype.JSTypeRegistry var0 = null;
//     com.google.javascript.rhino.jstype.FunctionParamBuilder var1 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var0);
//     com.google.javascript.rhino.ErrorReporter var2 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
//     boolean var5 = var3.hasNamespace("hi!");
//     var3.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var7 = null;
//     com.google.javascript.rhino.jstype.JSType var8 = null;
//     com.google.javascript.rhino.jstype.JSType[] var9 = new com.google.javascript.rhino.jstype.JSType[] { var8};
//     com.google.javascript.rhino.jstype.FunctionType var10 = var3.createConstructorType(var7, var9);
//     com.google.javascript.rhino.jstype.ObjectType var11 = var3.createAnonymousObjectType();
//     com.google.javascript.rhino.jstype.JSType[] var12 = new com.google.javascript.rhino.jstype.JSType[] { var11};
//     boolean var13 = var1.addRequiredParams(var12);
//     com.google.javascript.rhino.ErrorReporter var14 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var14);
//     boolean var17 = var15.hasNamespace("hi!");
//     var15.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var19 = null;
//     com.google.javascript.rhino.jstype.JSType var20 = null;
//     com.google.javascript.rhino.jstype.JSType[] var21 = new com.google.javascript.rhino.jstype.JSType[] { var20};
//     com.google.javascript.rhino.jstype.FunctionType var22 = var15.createConstructorType(var19, var21);
//     com.google.javascript.rhino.jstype.ObjectType var23 = var15.createAnonymousObjectType();
//     boolean var24 = var23.isVoidType();
//     java.util.Set var25 = var23.getPropertyNames();
//     boolean var27 = var23.hasOwnProperty("or");
//     boolean var28 = var23.canBeCalled();
//     boolean var29 = var1.addVarArgs((com.google.javascript.rhino.jstype.JSType)var23);
// 
//   }

  public void test433() {}
//   public void test433() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test433"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var5 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     com.google.javascript.rhino.jstype.JSTypeRegistry var6 = var1.getTypeRegistry();
// 
//   }

  public void test434() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test434"); }


    com.google.javascript.jscomp.SourceAst var0 = null;
    com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "", true);
    com.google.javascript.jscomp.CompilerInput var6 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var3, "", false);
    com.google.javascript.jscomp.JSModule var7 = null;
    var3.setModule(var7);
    boolean var9 = var3.isExtern();
    com.google.javascript.jscomp.JSModule var11 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var13 = new com.google.javascript.jscomp.JSModule("");
    var11.addDependency(var13);
    java.util.List var15 = var11.getDependencies();
    java.util.List var16 = var11.getRequires();
    var3.setModule(var11);
    com.google.javascript.jscomp.CompilerInput var20 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var3, "ERROR", false);
    boolean var21 = var3.isExtern();
    boolean var22 = var3.isExtern();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test435() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test435"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled("-1", "-1");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test436() {}
//   public void test436() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test436"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "", true);
//     com.google.javascript.jscomp.CompilerInput var6 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var3, "", false);
//     com.google.javascript.jscomp.JSModule var7 = null;
//     var3.setModule(var7);
//     com.google.javascript.jscomp.SourceFile.Generator var10 = null;
//     com.google.javascript.jscomp.JSSourceFile var11 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var10);
//     java.lang.String var12 = var11.getName();
//     com.google.javascript.jscomp.CompilerInput var14 = new com.google.javascript.jscomp.CompilerInput(var11, true);
//     com.google.javascript.jscomp.JSModule var16 = new com.google.javascript.jscomp.JSModule("");
//     com.google.javascript.jscomp.JSModule var18 = new com.google.javascript.jscomp.JSModule("");
//     var16.addDependency(var18);
//     java.util.List var20 = var16.getDependencies();
//     java.util.List var21 = var16.getRequires();
//     com.google.javascript.jscomp.SourceAst var22 = null;
//     com.google.javascript.jscomp.CompilerInput var25 = new com.google.javascript.jscomp.CompilerInput(var22, "", true);
//     com.google.javascript.jscomp.SourceAst var26 = var25.getSourceAst();
//     var16.remove(var25);
//     var14.setModule(var16);
//     com.google.javascript.jscomp.CompilerInput var30 = var16.getByName("TypeError: ");
//     var3.setModule(var16);
//     com.google.javascript.jscomp.CompilerInput var32 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var3);
// 
//   }

  public void test437() {}
//   public void test437() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test437"); }
// 
// 
//     java.util.List var0 = null;
//     com.google.javascript.jscomp.deps.SortedDependencies var1 = new com.google.javascript.jscomp.deps.SortedDependencies(var0);
// 
//   }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test438"); }


    com.google.javascript.jscomp.SourceAst var1 = null;
    com.google.javascript.jscomp.CompilerInput var4 = new com.google.javascript.jscomp.CompilerInput(var1, "", true);
    com.google.javascript.jscomp.SourceAst var5 = var4.getSourceAst();
    java.lang.RuntimeException var6 = com.google.javascript.rhino.ScriptRuntime.notFunctionError((java.lang.Object)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = com.google.javascript.rhino.ScriptRuntime.getMessage1("", (java.lang.Object)var4);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test439() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test439"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    boolean var2 = var1.recordExterns();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test440() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test440"); }


    java.util.logging.Logger var0 = null;
    com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
    double var2 = var1.getTypedPercent();
    var1.generateReport();
    var1.generateReport();
    double var5 = var1.getTypedPercent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);

  }

  public void test441() {}
//   public void test441() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test441"); }
// 
// 
//     com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot var0 = null;
//     com.google.javascript.jscomp.parsing.Config.LanguageMode var3 = null;
//     com.google.javascript.jscomp.parsing.Config var5 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(false, var3, true);
//     com.google.javascript.jscomp.mozilla.rhino.ErrorReporter var6 = null;
//     com.google.javascript.rhino.Node var7 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(var0, "hi!: hi!", var5, var6);
// 
//   }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test442"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    boolean var2 = var1.recordNoSideEffects();
    com.google.javascript.rhino.JSDocInfoBuilder var4 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var11 = new com.google.javascript.rhino.JSTypeExpression(var9, "");
    boolean var13 = var11.equals((java.lang.Object)'4');
    boolean var14 = var4.recordBaseType(var11);
    boolean var15 = var1.recordDefineType(var11);
    com.google.javascript.rhino.JSDocInfoBuilder var17 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    boolean var18 = var17.recordNoSideEffects();
    com.google.javascript.rhino.JSDocInfoBuilder var20 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var27 = new com.google.javascript.rhino.JSTypeExpression(var25, "");
    boolean var29 = var27.equals((java.lang.Object)'4');
    boolean var30 = var20.recordBaseType(var27);
    boolean var31 = var17.recordDefineType(var27);
    com.google.javascript.rhino.ErrorReporter var32 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32);
    boolean var35 = var33.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.RecordTypeBuilder var36 = new com.google.javascript.rhino.jstype.RecordTypeBuilder(var33);
    com.google.javascript.rhino.ErrorReporter var37 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var37);
    boolean var40 = var38.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var41 = new com.google.javascript.rhino.jstype.FunctionBuilder(var38);
    com.google.javascript.rhino.jstype.JSType var43 = var38.getType("STRING ");
    com.google.javascript.rhino.ErrorReporter var44 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var44);
    boolean var47 = var45.hasNamespace("hi!");
    var45.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var49 = null;
    com.google.javascript.rhino.jstype.JSType var50 = null;
    com.google.javascript.rhino.jstype.JSType[] var51 = new com.google.javascript.rhino.jstype.JSType[] { var50};
    com.google.javascript.rhino.jstype.FunctionType var52 = var45.createConstructorType(var49, var51);
    com.google.javascript.rhino.jstype.ObjectType var53 = var45.createAnonymousObjectType();
    boolean var54 = var53.isVoidType();
    com.google.javascript.rhino.ErrorReporter var55 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var55);
    boolean var58 = var56.hasNamespace("hi!");
    var56.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var60 = null;
    com.google.javascript.rhino.jstype.JSType var61 = null;
    com.google.javascript.rhino.jstype.JSType[] var62 = new com.google.javascript.rhino.jstype.JSType[] { var61};
    com.google.javascript.rhino.jstype.FunctionType var63 = var56.createConstructorType(var60, var62);
    boolean var64 = var63.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var65 = var53.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var63);
    java.lang.Iterable var66 = var63.getAllImplementedInterfaces();
    com.google.javascript.rhino.jstype.JSType[] var67 = new com.google.javascript.rhino.jstype.JSType[] { var63};
    com.google.javascript.rhino.Node var68 = var38.createParametersWithVarArgs(var67);
    com.google.javascript.rhino.Node var69 = var33.createOptionalParameters(var67);
    com.google.javascript.rhino.JSTypeExpression var71 = new com.google.javascript.rhino.JSTypeExpression(var69, "(ERROR)");
    boolean var72 = var17.recordBaseType(var71);
    boolean var73 = var1.recordTypedef(var71);
    com.google.javascript.rhino.jstype.StaticScope var74 = null;
    com.google.javascript.rhino.ErrorReporter var75 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var75, false);
    var77.setLastGeneration(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.JSType var80 = var71.evaluate(var74, var77);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
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
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);

  }

  public void test443() {}
//   public void test443() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test443"); }
// 
// 
//     java.util.logging.Logger var0 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
//     double var2 = var1.getTypedPercent();
//     var1.generateReport();
//     com.google.javascript.jscomp.Compiler var4 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var1);
//     com.google.javascript.rhino.Node var5 = var4.getRoot();
//     com.google.javascript.jscomp.NodeTraversal.Callback var6 = null;
//     com.google.javascript.jscomp.NodeTraversal var7 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var4, var6);
//     var4.rebuildInputsFromModules();
// 
//   }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test444"); }


    com.google.javascript.rhino.EvaluatorException var5 = new com.google.javascript.rhino.EvaluatorException("hi!", "", 10, "", 1);
    int var6 = var5.lineNumber();
    int var7 = var5.lineNumber();
    java.lang.String var8 = var5.sourceName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test445() {}
//   public void test445() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test445"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Compiler.IntermediateState var8 = var1.getState();
//     com.google.javascript.jscomp.NodeTraversal.Callback var9 = null;
//     com.google.javascript.jscomp.NodeTraversal var10 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var1, var9);
//     com.google.javascript.jscomp.Scope var11 = var1.getTopScope();
//     com.google.javascript.jscomp.JSSourceFile var13 = com.google.javascript.jscomp.JSSourceFile.fromFile("LP\n    NAME  [var_args_name: 1] : (undefined|{})\n");
//     com.google.javascript.jscomp.JSSourceFile[] var14 = new com.google.javascript.jscomp.JSSourceFile[] { var13};
//     com.google.javascript.jscomp.JSModule var16 = new com.google.javascript.jscomp.JSModule("");
//     com.google.javascript.jscomp.JSModule var18 = new com.google.javascript.jscomp.JSModule("");
//     var16.addDependency(var18);
//     com.google.javascript.jscomp.JSModule[] var20 = new com.google.javascript.jscomp.JSModule[] { var18};
//     com.google.javascript.jscomp.CompilerOptions var21 = null;
//     com.google.javascript.jscomp.Result var22 = var1.compile(var14, var20, var21);
// 
//   }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test446"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.VariableRenamingPolicy var1 = com.google.javascript.jscomp.VariableRenamingPolicy.valueOf("STRING ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test447() {}
//   public void test447() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test447"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Compiler.IntermediateState var8 = var1.getState();
//     com.google.javascript.jscomp.JSError[] var9 = var1.getMessages();
// 
//   }

  public void test448() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test448"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = com.google.javascript.rhino.ScriptRuntime.getMessage0("(STRING )");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test449() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test449"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    boolean var4 = var1.recordParameterDescription("", "-1");
    boolean var5 = var1.recordNoShadow();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test450() {}
//   public void test450() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test450"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Scope var2 = var1.getTopScope();
//     com.google.javascript.jscomp.JSModule var4 = new com.google.javascript.jscomp.JSModule("");
//     com.google.javascript.jscomp.JSModule var6 = new com.google.javascript.jscomp.JSModule("");
//     var4.addDependency(var6);
//     java.util.List var8 = var4.getDependencies();
//     java.util.List var9 = var4.getRequires();
//     java.util.List var10 = null;
//     java.io.PrintStream var11 = null;
//     com.google.javascript.jscomp.Compiler var12 = new com.google.javascript.jscomp.Compiler(var11);
//     com.google.javascript.jscomp.Region var15 = var12.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var18 = var12.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var19 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var12);
//     com.google.javascript.jscomp.Compiler.IntermediateState var20 = var12.getState();
//     com.google.javascript.jscomp.SourceFile.Generator var22 = null;
//     com.google.javascript.jscomp.JSSourceFile var23 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var22);
//     com.google.javascript.jscomp.CompilerInput var25 = new com.google.javascript.jscomp.CompilerInput(var23, false);
//     com.google.javascript.jscomp.SourceFile.Generator var27 = null;
//     com.google.javascript.jscomp.JSSourceFile var28 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var27);
//     java.lang.String var29 = var28.getName();
//     com.google.javascript.jscomp.CompilerOptions var30 = new com.google.javascript.jscomp.CompilerOptions();
//     com.google.javascript.jscomp.VariableRenamingPolicy var31 = null;
//     com.google.javascript.jscomp.PropertyRenamingPolicy var32 = null;
//     var30.setRenamingPolicy(var31, var32);
//     com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler var34 = null;
//     var30.setAliasTransformationHandler(var34);
//     com.google.javascript.jscomp.Result var36 = var12.compile(var23, var28, var30);
//     var1.init(var9, var10, var30);
// 
//   }

  public void test451() {}
//   public void test451() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test451"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
//     com.google.javascript.rhino.jstype.JSType var6 = var1.getType("STRING ");
//     com.google.javascript.rhino.ErrorReporter var7 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7);
//     boolean var10 = var8.hasNamespace("hi!");
//     var8.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var12 = null;
//     com.google.javascript.rhino.jstype.JSType var13 = null;
//     com.google.javascript.rhino.jstype.JSType[] var14 = new com.google.javascript.rhino.jstype.JSType[] { var13};
//     com.google.javascript.rhino.jstype.FunctionType var15 = var8.createConstructorType(var12, var14);
//     boolean var16 = var15.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType var17 = var15.getReturnType();
//     com.google.javascript.rhino.jstype.JSType var19 = var1.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType)var15, "");
//     com.google.javascript.rhino.jstype.JSType var24 = var1.createNamedType("hi!", "ERROR  100", 409600, 0);
//     com.google.javascript.rhino.jstype.FunctionParamBuilder var25 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var1);
//     boolean var26 = var25.hasVarArgs();
//     com.google.javascript.rhino.jstype.JSType var27 = null;
//     boolean var28 = var25.addVarArgs(var27);
// 
//   }

  public void test452() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test452"); }


    com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("");
    var3.putIntProp(100, 1);
    com.google.javascript.rhino.Node var7 = var3.removeFirstChild();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var17 = new com.google.javascript.rhino.Node(1, var3, var9, var14, 1, 1);
    com.google.javascript.rhino.JSDocInfo var18 = var9.getJSDocInfo();
    var9.setSourcePositionForTree(100);
    java.lang.Object var22 = null;
    var9.putProp((-1), var22);
    boolean var24 = var0.isVarArgsParameter(var9);
    java.lang.String var25 = var0.getExportPropertyFunction();
    java.lang.String var26 = var0.getExportPropertyFunction();
    com.google.javascript.rhino.Node var28 = new com.google.javascript.rhino.Node(1);
    boolean var29 = var28.wasEmptyNode();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var30 = var0.isOptionalParameter(var28);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "goog.exportProperty"+ "'", var25.equals("goog.exportProperty"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "goog.exportProperty"+ "'", var26.equals("goog.exportProperty"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test453() {}
//   public void test453() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test453"); }
// 
// 
//     java.util.logging.Logger var0 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
//     com.google.javascript.jscomp.Compiler var2 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var1);
//     var2.reportCodeChange();
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString("");
//     var7.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var11 = var7.removeFirstChild();
//     com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var21 = new com.google.javascript.rhino.Node(1, var7, var13, var18, 1, 1);
//     com.google.javascript.jscomp.CheckLevel var23 = null;
//     com.google.javascript.jscomp.DiagnosticType var25 = com.google.javascript.jscomp.DiagnosticType.make("", var23, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var27 = null;
//     com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.make("", var27, "(ERROR)");
//     int var30 = var25.compareTo(var29);
//     java.lang.String[] var31 = null;
//     com.google.javascript.jscomp.JSError var32 = com.google.javascript.jscomp.JSError.make("ERROR  100 [synthetic: 1]\n", var21, var25, var31);
//     com.google.javascript.jscomp.CheckLevel var33 = var2.getErrorLevel(var32);
// 
//   }

  public void test454() {}
//   public void test454() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test454"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "", true);
//     com.google.javascript.jscomp.SourceAst var4 = var3.getSourceAst();
//     com.google.javascript.jscomp.CompilerInput var7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var3, "", false);
//     com.google.javascript.jscomp.SourceFile.Generator var9 = null;
//     com.google.javascript.jscomp.JSSourceFile var10 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var9);
//     java.lang.String var11 = var10.getName();
//     var7.setSourceFile((com.google.javascript.jscomp.SourceFile)var10);
// 
//   }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test455"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var8 = new com.google.javascript.rhino.JSTypeExpression(var6, "");
    boolean var10 = var8.equals((java.lang.Object)'4');
    boolean var11 = var1.recordBaseType(var8);
    boolean var12 = var1.recordOverride();
    boolean var13 = var1.recordExport();
    boolean var14 = var1.shouldParseDocumentation();
    boolean var15 = var1.isPopulatedWithFileOverview();
    boolean var16 = var1.shouldParseDocumentation();
    boolean var18 = var1.recordTemplateTypeName(": (ERROR)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test456() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test456"); }


    com.google.javascript.jscomp.DefaultCodingConvention var1 = new com.google.javascript.jscomp.DefaultCodingConvention();
    com.google.javascript.rhino.jstype.FunctionType var2 = null;
    com.google.javascript.rhino.jstype.FunctionType var3 = null;
    com.google.javascript.jscomp.CodingConvention.SubclassType var4 = null;
    var1.applySubclassRelationship(var2, var3, var4);
    java.lang.String var6 = var1.getDelegateSuperclassName();
    java.io.PrintStream var7 = null;
    com.google.javascript.jscomp.Compiler var8 = new com.google.javascript.jscomp.Compiler(var7);
    com.google.javascript.jscomp.Region var11 = var8.getSourceRegion("", 0);
    com.google.javascript.jscomp.Region var14 = var8.getSourceRegion("", 0);
    com.google.javascript.jscomp.Compiler.IntermediateState var15 = var8.getState();
    com.google.javascript.jscomp.NodeTraversal.Callback var16 = null;
    com.google.javascript.jscomp.NodeTraversal var17 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var8, var16);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.Node.newString("");
    boolean var20 = var19.hasChildren();
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSDocInfo var26 = null;
    var25.setJSDocInfo(var26);
    com.google.javascript.rhino.Node var29 = var25.getChildAtIndex(0);
    var19.addChildrenToFront(var25);
    com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast var31 = var1.getObjectLiteralCast(var17, var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var32 = new com.google.javascript.rhino.Node((-1), var25);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);

  }

  public void test457() {}
//   public void test457() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test457"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     var1.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var5 = null;
//     com.google.javascript.rhino.jstype.JSType var6 = null;
//     com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
//     com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
//     boolean var9 = var8.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType var10 = var8.getReturnType();
//     com.google.javascript.rhino.Node var11 = var8.getSource();
//     com.google.javascript.rhino.ErrorReporter var12 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var12);
//     boolean var15 = var13.hasNamespace("hi!");
//     var13.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var17 = null;
//     com.google.javascript.rhino.jstype.JSType var18 = null;
//     com.google.javascript.rhino.jstype.JSType[] var19 = new com.google.javascript.rhino.jstype.JSType[] { var18};
//     com.google.javascript.rhino.jstype.FunctionType var20 = var13.createConstructorType(var17, var19);
//     boolean var21 = var20.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType var22 = var20.getReturnType();
//     var20.clearCachedValues();
//     com.google.javascript.rhino.jstype.JSType.TypePair var24 = var8.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType)var20);
//     com.google.javascript.rhino.ErrorReporter var25 = null;
//     com.google.javascript.rhino.jstype.StaticScope var26 = null;
//     com.google.javascript.rhino.jstype.JSType var27 = var8.resolve(var25, var26);
// 
//   }

  public void test458() {}
//   public void test458() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test458"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile var1 = com.google.javascript.jscomp.SourceFile.fromFile("ERROR  100 [synthetic: 1]\n");
//     com.google.javascript.jscomp.JsAst var2 = new com.google.javascript.jscomp.JsAst(var1);
//     com.google.javascript.jscomp.SourceFile var4 = com.google.javascript.jscomp.SourceFile.fromFile("ERROR  100 [synthetic: 1]\n");
//     var2.setSourceFile(var4);
//     com.google.javascript.jscomp.CompilerInput var6 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var2);
//     java.util.logging.Logger var7 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var8 = new com.google.javascript.jscomp.LoggerErrorManager(var7);
//     double var9 = var8.getTypedPercent();
//     var8.generateReport();
//     com.google.javascript.jscomp.Compiler var11 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var8);
//     com.google.javascript.rhino.Node var12 = var11.getRoot();
//     com.google.javascript.rhino.Node var13 = var2.getAstRoot((com.google.javascript.jscomp.AbstractCompiler)var11);
//     com.google.javascript.jscomp.Compiler.CodeBuilder var14 = null;
//     com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.Node.newString("");
//     java.lang.String var21 = var17.toString(false, true, false);
//     com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.Node.newString("");
//     var24.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var28 = var24.removeFirstChild();
//     com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var38 = new com.google.javascript.rhino.Node(1, var24, var30, var35, 1, 1);
//     boolean var39 = var30.hasSideEffects();
//     com.google.javascript.rhino.Node var40 = var17.copyInformationFromForTree(var30);
//     boolean var41 = var40.isQualifiedName();
//     var11.toSource(var14, 409600, var40);
// 
//   }

  public void test459() {}
//   public void test459() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test459"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
//     com.google.javascript.rhino.jstype.JSType var6 = var1.getType("STRING ");
//     boolean var8 = var1.isForwardDeclaredType("");
//     com.google.javascript.rhino.ErrorReporter var9 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var9);
//     boolean var12 = var10.hasNamespace("hi!");
//     var10.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var14 = null;
//     com.google.javascript.rhino.jstype.JSType var15 = null;
//     com.google.javascript.rhino.jstype.JSType[] var16 = new com.google.javascript.rhino.jstype.JSType[] { var15};
//     com.google.javascript.rhino.jstype.FunctionType var17 = var10.createConstructorType(var14, var16);
//     com.google.javascript.rhino.ErrorReporter var18 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18);
//     boolean var21 = var19.hasNamespace("hi!");
//     var19.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var23 = null;
//     com.google.javascript.rhino.jstype.JSType var24 = null;
//     com.google.javascript.rhino.jstype.JSType[] var25 = new com.google.javascript.rhino.jstype.JSType[] { var24};
//     com.google.javascript.rhino.jstype.FunctionType var26 = var19.createConstructorType(var23, var25);
//     boolean var27 = var26.canBeCalled();
//     var17.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var26);
//     boolean var29 = var26.canBeCalled();
//     com.google.javascript.rhino.jstype.ObjectType var30 = var1.createObjectType((com.google.javascript.rhino.jstype.ObjectType)var26);
//     var1.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var33 = var1.getType("com.google.javascript.rhino.EvaluatorException: hi! (#10)");
//     com.google.javascript.rhino.ErrorReporter var35 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var35);
//     boolean var38 = var36.hasNamespace("hi!");
//     var36.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var40 = null;
//     com.google.javascript.rhino.jstype.JSType var41 = null;
//     com.google.javascript.rhino.jstype.JSType[] var42 = new com.google.javascript.rhino.jstype.JSType[] { var41};
//     com.google.javascript.rhino.jstype.FunctionType var43 = var36.createConstructorType(var40, var42);
//     com.google.javascript.rhino.ErrorReporter var44 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var44);
//     boolean var47 = var45.hasNamespace("hi!");
//     var45.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var49 = null;
//     com.google.javascript.rhino.jstype.JSType var50 = null;
//     com.google.javascript.rhino.jstype.JSType[] var51 = new com.google.javascript.rhino.jstype.JSType[] { var50};
//     com.google.javascript.rhino.jstype.FunctionType var52 = var45.createConstructorType(var49, var51);
//     boolean var53 = var52.canBeCalled();
//     var43.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var52);
//     boolean var55 = var52.canBeCalled();
//     com.google.javascript.rhino.ErrorReporter var56 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var56);
//     boolean var59 = var57.hasNamespace("hi!");
//     var57.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var61 = null;
//     com.google.javascript.rhino.jstype.JSType var62 = null;
//     com.google.javascript.rhino.jstype.JSType[] var63 = new com.google.javascript.rhino.jstype.JSType[] { var62};
//     com.google.javascript.rhino.jstype.FunctionType var64 = var57.createConstructorType(var61, var63);
//     com.google.javascript.rhino.jstype.ObjectType var65 = var57.createAnonymousObjectType();
//     boolean var66 = var65.isVoidType();
//     com.google.javascript.rhino.ErrorReporter var67 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var67);
//     boolean var70 = var68.hasNamespace("hi!");
//     var68.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var72 = null;
//     com.google.javascript.rhino.jstype.JSType var73 = null;
//     com.google.javascript.rhino.jstype.JSType[] var74 = new com.google.javascript.rhino.jstype.JSType[] { var73};
//     com.google.javascript.rhino.jstype.FunctionType var75 = var68.createConstructorType(var72, var74);
//     boolean var76 = var75.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType.TypePair var77 = var65.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var75);
//     java.lang.Iterable var78 = var75.getAllImplementedInterfaces();
//     com.google.javascript.rhino.jstype.JSType var79 = var52.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType)var75);
//     boolean var80 = var75.isConstructor();
//     var1.registerPropertyOnType("-1", (com.google.javascript.rhino.jstype.JSType)var75);
//     com.google.javascript.rhino.jstype.JSTypeNative var82 = null;
//     com.google.javascript.rhino.jstype.JSType var83 = var1.getNativeType(var82);
// 
//   }

  public void test460() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test460"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
    com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
    com.google.javascript.jscomp.Compiler.IntermediateState var8 = var1.getState();
    com.google.javascript.jscomp.NodeTraversal.Callback var9 = null;
    com.google.javascript.jscomp.NodeTraversal var10 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var1, var9);
    com.google.javascript.rhino.Node var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.traverse(var11);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test461() {}
//   public void test461() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test461"); }
// 
// 
//     java.io.InputStream var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromInputStream("-1", var1);
// 
//   }

  public void test462() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test462"); }


    com.google.javascript.rhino.Context var0 = null;
    com.google.javascript.rhino.Context var1 = com.google.javascript.rhino.Context.enter(var0);
    var1.addActivationName("");
    boolean var5 = var1.isActivationNeeded("null.prototype");
    com.google.javascript.rhino.EcmaError var8 = com.google.javascript.rhino.ScriptRuntime.constructError("hi!", "hi!");
    java.lang.String var9 = var8.getName();
    var1.seal((java.lang.Object)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addActivationName("goog.exportProperty");
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test463() {}
//   public void test463() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test463"); }
// 
// 
//     com.google.javascript.rhino.Node var2 = new com.google.javascript.rhino.Node(100);
//     com.google.javascript.jscomp.CheckLevel var4 = null;
//     com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.make("", var4, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var8 = null;
//     com.google.javascript.jscomp.DiagnosticType var10 = com.google.javascript.jscomp.DiagnosticType.make("", var8, "(ERROR)");
//     int var11 = var6.compareTo(var10);
//     java.lang.String[] var13 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var14 = com.google.javascript.jscomp.JSError.make(var10, var13);
//     com.google.javascript.jscomp.CheckLevel var16 = null;
//     com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.make("", var16, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var20 = null;
//     com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.make("", var20, "(ERROR)");
//     int var23 = var18.compareTo(var22);
//     java.lang.String[] var25 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var26 = com.google.javascript.jscomp.JSError.make(var22, var25);
//     com.google.javascript.jscomp.JSError var27 = com.google.javascript.jscomp.JSError.make(var10, var25);
//     com.google.javascript.jscomp.CheckLevel var29 = null;
//     com.google.javascript.jscomp.DiagnosticType var31 = com.google.javascript.jscomp.DiagnosticType.make("", var29, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var33 = null;
//     com.google.javascript.jscomp.DiagnosticType var35 = com.google.javascript.jscomp.DiagnosticType.make("", var33, "(ERROR)");
//     int var36 = var31.compareTo(var35);
//     java.lang.String[] var38 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var39 = com.google.javascript.jscomp.JSError.make(var35, var38);
//     com.google.javascript.jscomp.JSError var40 = com.google.javascript.jscomp.JSError.make("LinkedGraph", var2, var10, var38);
//     com.google.javascript.jscomp.CheckLevel var41 = null;
//     java.io.PrintStream var42 = null;
//     com.google.javascript.jscomp.Compiler var43 = new com.google.javascript.jscomp.Compiler(var42);
//     com.google.javascript.jscomp.Region var46 = var43.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var49 = var43.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var50 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var43);
//     java.lang.String var51 = var40.format(var41, (com.google.javascript.jscomp.MessageFormatter)var50);
// 
//   }

  public void test464() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test464"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
    com.google.javascript.rhino.ErrorReporter var5 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var5);
    boolean var8 = var6.hasNamespace("hi!");
    var6.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var10 = null;
    com.google.javascript.rhino.jstype.JSType var11 = null;
    com.google.javascript.rhino.jstype.JSType[] var12 = new com.google.javascript.rhino.jstype.JSType[] { var11};
    com.google.javascript.rhino.jstype.FunctionType var13 = var6.createConstructorType(var10, var12);
    boolean var14 = var13.canBeCalled();
    com.google.javascript.rhino.jstype.FunctionBuilder var16 = var4.withReturnType((com.google.javascript.rhino.jstype.JSType)var13, false);
    com.google.javascript.rhino.jstype.FunctionType var17 = var4.build();
    com.google.javascript.rhino.ErrorReporter var18 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18);
    boolean var21 = var19.hasNamespace("hi!");
    var19.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var23 = null;
    com.google.javascript.rhino.jstype.JSType var24 = null;
    com.google.javascript.rhino.jstype.JSType[] var25 = new com.google.javascript.rhino.jstype.JSType[] { var24};
    com.google.javascript.rhino.jstype.FunctionType var26 = var19.createConstructorType(var23, var25);
    boolean var27 = var26.canBeCalled();
    com.google.javascript.rhino.jstype.FunctionPrototypeType var28 = null;
    boolean var29 = var26.setPrototype(var28);
    boolean var30 = var17.hasEqualCallType(var26);
    int var31 = var26.getExtendedInterfacesCount();
    com.google.javascript.rhino.jstype.JSType var33 = var26.getRestrictedTypeGivenToBooleanOutcome(false);
    com.google.javascript.rhino.jstype.ObjectType var34 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType)var26);
    com.google.javascript.rhino.Node var36 = var34.getPropertyNode("(STRING )");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);

  }

  public void test465() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test465"); }


    com.google.javascript.rhino.JSDocInfoBuilder var2 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    boolean var3 = var2.recordJavaDispatch();
    boolean var4 = var2.recordNoCompile();
    com.google.javascript.rhino.Node var6 = new com.google.javascript.rhino.Node(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = com.google.javascript.rhino.ScriptRuntime.getMessage2("LP\n    NAME  [var_args_name: 1] : (undefined|{})\n", (java.lang.Object)var2, (java.lang.Object)var6);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test466() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test466"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.RecordTypeBuilder var2 = new com.google.javascript.rhino.jstype.RecordTypeBuilder(var1);
    com.google.javascript.rhino.ErrorReporter var4 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var4);
    boolean var7 = var5.hasNamespace("hi!");
    var5.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var9 = null;
    com.google.javascript.rhino.jstype.JSType var10 = null;
    com.google.javascript.rhino.jstype.JSType[] var11 = new com.google.javascript.rhino.jstype.JSType[] { var10};
    com.google.javascript.rhino.jstype.FunctionType var12 = var5.createConstructorType(var9, var11);
    boolean var13 = var12.canBeCalled();
    com.google.javascript.rhino.ErrorReporter var14 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var14);
    boolean var17 = var15.hasNamespace("hi!");
    var15.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var19 = null;
    com.google.javascript.rhino.jstype.JSType var20 = null;
    com.google.javascript.rhino.jstype.JSType[] var21 = new com.google.javascript.rhino.jstype.JSType[] { var20};
    com.google.javascript.rhino.jstype.FunctionType var22 = var15.createConstructorType(var19, var21);
    com.google.javascript.rhino.jstype.ObjectType var23 = var15.createAnonymousObjectType();
    boolean var24 = var23.isVoidType();
    com.google.javascript.rhino.ErrorReporter var25 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25);
    boolean var28 = var26.hasNamespace("hi!");
    var26.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var30 = null;
    com.google.javascript.rhino.jstype.JSType var31 = null;
    com.google.javascript.rhino.jstype.JSType[] var32 = new com.google.javascript.rhino.jstype.JSType[] { var31};
    com.google.javascript.rhino.jstype.FunctionType var33 = var26.createConstructorType(var30, var32);
    boolean var34 = var33.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var35 = var23.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var33);
    boolean var36 = var23.isEmptyType();
    boolean var37 = var12.isEquivalentTo((com.google.javascript.rhino.jstype.JSType)var23);
    com.google.javascript.rhino.jstype.JSType var38 = var12.restrictByNotNullOrUndefined();
    boolean var39 = var1.declareType("TypeError: ", var38);
    boolean var41 = var1.isForwardDeclaredType("null(null)");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test467() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test467"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    var1.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var5 = null;
    com.google.javascript.rhino.jstype.JSType var6 = null;
    com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
    com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
    com.google.javascript.rhino.jstype.ObjectType var9 = var1.createAnonymousObjectType();
    com.google.javascript.rhino.jstype.StaticScope var10 = null;
    var1.resolveTypesInScope(var10);
    var1.setLastGeneration(true);
    com.google.javascript.rhino.jstype.StaticScope var14 = null;
    com.google.javascript.rhino.jstype.JSType var19 = var1.getType(var14, "TypeError: ", ". (ERROR) at ERROR  100 [synthetic: 1]\n line 1 : 1", (-1), 10);
    com.google.javascript.rhino.jstype.JSTypeNative[] var20 = com.google.javascript.rhino.jstype.JSTypeNative.values();
    com.google.javascript.rhino.jstype.JSType var21 = var1.createUnionType(var20);
    var1.setLastGeneration(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test468() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test468"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
    com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
    com.google.javascript.jscomp.LightweightMessageFormatter var8 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
    com.google.javascript.jscomp.Compiler.IntermediateState var9 = var1.getState();
    com.google.javascript.jscomp.SourceFile.Generator var11 = null;
    com.google.javascript.jscomp.JSSourceFile var12 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var11);
    com.google.javascript.jscomp.CompilerInput var14 = new com.google.javascript.jscomp.CompilerInput(var12, false);
    com.google.javascript.jscomp.SourceFile.Generator var16 = null;
    com.google.javascript.jscomp.JSSourceFile var17 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var16);
    java.lang.String var18 = var17.getName();
    com.google.javascript.jscomp.CompilerOptions var19 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.VariableRenamingPolicy var20 = null;
    com.google.javascript.jscomp.PropertyRenamingPolicy var21 = null;
    var19.setRenamingPolicy(var20, var21);
    com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler var23 = null;
    var19.setAliasTransformationHandler(var23);
    com.google.javascript.jscomp.Result var25 = var1.compile(var12, var17, var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var26 = var1.toSourceArray();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test469() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test469"); }


    com.google.javascript.jscomp.DefaultCodingConvention var0 = new com.google.javascript.jscomp.DefaultCodingConvention();
    boolean var2 = var0.isConstantKey("<No stack trace available>");
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.Node.newString("");
    var5.putIntProp(100, 1);
    com.google.javascript.rhino.Node var9 = var5.removeFirstChild();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var19 = new com.google.javascript.rhino.Node(1, var5, var11, var16, 1, 1);
    java.lang.String var20 = var0.getSingletonGetterClassName(var16);
    boolean var21 = var16.wasEmptyNode();
    var16.putIntProp((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test470() {}
//   public void test470() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test470"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile var1 = com.google.javascript.jscomp.SourceFile.fromFile("ERROR  100 [synthetic: 1]\n");
//     com.google.javascript.jscomp.JsAst var2 = new com.google.javascript.jscomp.JsAst(var1);
//     com.google.javascript.jscomp.SourceFile var4 = com.google.javascript.jscomp.SourceFile.fromFile("ERROR  100 [synthetic: 1]\n");
//     var2.setSourceFile(var4);
//     com.google.javascript.jscomp.CompilerInput var6 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var2);
//     com.google.javascript.jscomp.AbstractCompiler var7 = null;
//     var6.setCompiler(var7);
// 
//   }

  public void test471() {}
//   public void test471() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test471"); }
// 
// 
//     com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("");
//     com.google.javascript.jscomp.CompilerInput var2 = null;
//     var1.addFirst(var2);
// 
//   }

  public void test472() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test472"); }


    com.google.javascript.jscomp.SourceFile var1 = com.google.javascript.jscomp.SourceFile.fromFile("ERROR  100 [synthetic: 1]\n");
    com.google.javascript.jscomp.JsAst var2 = new com.google.javascript.jscomp.JsAst(var1);
    java.nio.charset.Charset var4 = null;
    com.google.javascript.jscomp.SourceFile var5 = com.google.javascript.jscomp.SourceFile.fromFile("TypeError", var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setSourceFile(var5);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test473() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test473"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.Node.newString("");
    java.lang.String var5 = var1.toString(false, true, false);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("");
    var8.putIntProp(100, 1);
    com.google.javascript.rhino.Node var12 = var8.removeFirstChild();
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var22 = new com.google.javascript.rhino.Node(1, var8, var14, var19, 1, 1);
    boolean var23 = var14.hasSideEffects();
    com.google.javascript.rhino.Node var24 = var1.copyInformationFromForTree(var14);
    com.google.javascript.rhino.Node var26 = new com.google.javascript.rhino.Node(100);
    var1.addChildrenToFront(var26);
    com.google.javascript.rhino.Node var28 = var26.cloneTree();
    java.lang.String var29 = var26.getQualifiedName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "STRING "+ "'", var5.equals("STRING "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);

  }

  public void test474() {}
//   public void test474() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test474"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.make("", var3, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.make("", var7, "(ERROR)");
//     int var10 = var5.compareTo(var9);
//     java.lang.String[] var12 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var13 = com.google.javascript.jscomp.JSError.make(var9, var12);
//     com.google.javascript.jscomp.CheckLevel var15 = null;
//     com.google.javascript.jscomp.DiagnosticType var17 = com.google.javascript.jscomp.DiagnosticType.make("", var15, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var19 = null;
//     com.google.javascript.jscomp.DiagnosticType var21 = com.google.javascript.jscomp.DiagnosticType.make("", var19, "(ERROR)");
//     int var22 = var17.compareTo(var21);
//     java.lang.String[] var24 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var25 = com.google.javascript.jscomp.JSError.make(var21, var24);
//     com.google.javascript.jscomp.JSError var26 = com.google.javascript.jscomp.JSError.make(var9, var24);
//     com.google.javascript.jscomp.DiagnosticType[] var27 = new com.google.javascript.jscomp.DiagnosticType[] { var9};
//     com.google.javascript.jscomp.DiagnosticGroup var28 = new com.google.javascript.jscomp.DiagnosticGroup(var27);
//     com.google.javascript.jscomp.DiagnosticGroup[] var29 = new com.google.javascript.jscomp.DiagnosticGroup[] { var28};
//     com.google.javascript.jscomp.DiagnosticGroup var30 = new com.google.javascript.jscomp.DiagnosticGroup("", var29);
//     com.google.javascript.jscomp.DiagnosticGroup[] var31 = new com.google.javascript.jscomp.DiagnosticGroup[] { var30};
//     com.google.javascript.jscomp.DiagnosticGroup var32 = new com.google.javascript.jscomp.DiagnosticGroup("STRING ", var31);
//     com.google.javascript.jscomp.CheckLevel var33 = null;
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var34 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var32, var33);
//     com.google.javascript.jscomp.CheckLevel var38 = null;
//     com.google.javascript.jscomp.DiagnosticType var40 = com.google.javascript.jscomp.DiagnosticType.make("", var38, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var42 = null;
//     com.google.javascript.jscomp.DiagnosticType var44 = com.google.javascript.jscomp.DiagnosticType.make("", var42, "(ERROR)");
//     int var45 = var40.compareTo(var44);
//     java.lang.String[] var47 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var48 = com.google.javascript.jscomp.JSError.make(var44, var47);
//     com.google.javascript.jscomp.CheckLevel var50 = null;
//     com.google.javascript.jscomp.DiagnosticType var52 = com.google.javascript.jscomp.DiagnosticType.make("", var50, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var54 = null;
//     com.google.javascript.jscomp.DiagnosticType var56 = com.google.javascript.jscomp.DiagnosticType.make("", var54, "(ERROR)");
//     int var57 = var52.compareTo(var56);
//     java.lang.String[] var59 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var60 = com.google.javascript.jscomp.JSError.make(var56, var59);
//     com.google.javascript.jscomp.JSError var61 = com.google.javascript.jscomp.JSError.make(var44, var59);
//     com.google.javascript.jscomp.DiagnosticType[] var62 = new com.google.javascript.jscomp.DiagnosticType[] { var44};
//     com.google.javascript.jscomp.DiagnosticGroup var63 = new com.google.javascript.jscomp.DiagnosticGroup(var62);
//     com.google.javascript.jscomp.DiagnosticGroup[] var64 = new com.google.javascript.jscomp.DiagnosticGroup[] { var63};
//     com.google.javascript.jscomp.DiagnosticGroup var65 = new com.google.javascript.jscomp.DiagnosticGroup("", var64);
//     com.google.javascript.jscomp.DiagnosticGroup[] var66 = new com.google.javascript.jscomp.DiagnosticGroup[] { var65};
//     com.google.javascript.jscomp.DiagnosticGroup var67 = new com.google.javascript.jscomp.DiagnosticGroup("STRING ", var66);
//     com.google.javascript.jscomp.DiagnosticGroup var68 = new com.google.javascript.jscomp.DiagnosticGroup(var66);
//     boolean var69 = var34.disables(var68);
// 
//   }

  public void test475() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test475"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    var1.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var5 = null;
    com.google.javascript.rhino.jstype.JSType var6 = null;
    com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
    com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
    com.google.javascript.rhino.ErrorReporter var9 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var9);
    boolean var12 = var10.hasNamespace("hi!");
    var10.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var14 = null;
    com.google.javascript.rhino.jstype.JSType var15 = null;
    com.google.javascript.rhino.jstype.JSType[] var16 = new com.google.javascript.rhino.jstype.JSType[] { var15};
    com.google.javascript.rhino.jstype.FunctionType var17 = var10.createConstructorType(var14, var16);
    boolean var18 = var17.canBeCalled();
    var8.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var17);
    boolean var21 = var8.isPropertyTypeInferred("hi!");
    java.util.Set var22 = var8.getOwnPropertyNames();
    boolean var23 = var8.isEmptyType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test476() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test476"); }


    com.google.javascript.rhino.EvaluatorException var3 = new com.google.javascript.rhino.EvaluatorException("eof", "", 2);

  }

  public void test477() {}
//   public void test477() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test477"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = null;
//     com.google.javascript.rhino.Context var1 = com.google.javascript.rhino.Context.enter(var0);
//     int var2 = var1.getOptimizationLevel();
//     boolean var3 = var1.hasCompileFunctionsWithDynamicScope();
//     java.lang.Object var4 = var1.getDebuggerContextData();
//     int var5 = var1.getInstructionObserverThreshold();
//     boolean var6 = var1.isGeneratingSource();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var1.setInstructionObserverThreshold((-1));
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
//     assertTrue(var2 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == true);
// 
//   }

  public void test478() {}
//   public void test478() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test478"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     com.google.javascript.rhino.jstype.RecordTypeBuilder var2 = new com.google.javascript.rhino.jstype.RecordTypeBuilder(var1);
//     com.google.javascript.rhino.jstype.JSTypeNative var3 = null;
//     com.google.javascript.rhino.jstype.JSType var4 = var1.getNativeType(var3);
// 
//   }

  public void test479() {}
//   public void test479() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test479"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.Node.newString("");
//     var1.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var5 = var1.removeFirstChild();
//     int var6 = var1.getChildCount();
//     boolean var7 = var1.hasChildren();
//     java.lang.Iterable var8 = var1.children();
//     com.google.javascript.rhino.jstype.JSTypeRegistry var10 = null;
//     com.google.javascript.rhino.jstype.FunctionParamBuilder var11 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var10);
//     var1.putProp(0, (java.lang.Object)var11);
//     com.google.javascript.jscomp.DefaultCodingConvention var13 = new com.google.javascript.jscomp.DefaultCodingConvention();
//     com.google.javascript.rhino.jstype.FunctionType var14 = null;
//     com.google.javascript.rhino.jstype.FunctionType var15 = null;
//     com.google.javascript.jscomp.CodingConvention.SubclassType var16 = null;
//     var13.applySubclassRelationship(var14, var15, var16);
//     java.lang.String var18 = var13.getDelegateSuperclassName();
//     boolean var20 = var13.isConstant("ERROR  100 [synthetic: 1]\n");
//     java.lang.String var21 = var13.getExportSymbolFunction();
//     com.google.javascript.rhino.ErrorReporter var22 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var22);
//     boolean var25 = var23.hasNamespace("hi!");
//     var23.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var27 = null;
//     com.google.javascript.rhino.jstype.JSType var28 = null;
//     com.google.javascript.rhino.jstype.JSType[] var29 = new com.google.javascript.rhino.jstype.JSType[] { var28};
//     com.google.javascript.rhino.jstype.FunctionType var30 = var23.createConstructorType(var27, var29);
//     com.google.javascript.rhino.ErrorReporter var31 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var31);
//     boolean var34 = var32.hasNamespace("hi!");
//     var32.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var36 = null;
//     com.google.javascript.rhino.jstype.JSType var37 = null;
//     com.google.javascript.rhino.jstype.JSType[] var38 = new com.google.javascript.rhino.jstype.JSType[] { var37};
//     com.google.javascript.rhino.jstype.FunctionType var39 = var32.createConstructorType(var36, var38);
//     boolean var40 = var39.canBeCalled();
//     com.google.javascript.rhino.ErrorReporter var41 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var41);
//     boolean var44 = var42.hasNamespace("hi!");
//     var42.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var46 = null;
//     com.google.javascript.rhino.jstype.JSType var47 = null;
//     com.google.javascript.rhino.jstype.JSType[] var48 = new com.google.javascript.rhino.jstype.JSType[] { var47};
//     com.google.javascript.rhino.jstype.FunctionType var49 = var42.createConstructorType(var46, var48);
//     com.google.javascript.rhino.jstype.ObjectType var50 = var42.createAnonymousObjectType();
//     boolean var51 = var50.isVoidType();
//     com.google.javascript.rhino.ErrorReporter var52 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var52);
//     boolean var55 = var53.hasNamespace("hi!");
//     var53.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var57 = null;
//     com.google.javascript.rhino.jstype.JSType var58 = null;
//     com.google.javascript.rhino.jstype.JSType[] var59 = new com.google.javascript.rhino.jstype.JSType[] { var58};
//     com.google.javascript.rhino.jstype.FunctionType var60 = var53.createConstructorType(var57, var59);
//     boolean var61 = var60.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType.TypePair var62 = var50.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var60);
//     boolean var63 = var50.isEmptyType();
//     boolean var64 = var39.isEquivalentTo((com.google.javascript.rhino.jstype.JSType)var50);
//     com.google.javascript.rhino.jstype.FunctionPrototypeType var65 = null;
//     boolean var66 = var39.setPrototype(var65);
//     com.google.javascript.rhino.JSDocInfo var68 = new com.google.javascript.rhino.JSDocInfo();
//     java.util.Set var69 = var68.getSuppressions();
//     boolean var70 = var68.isConstructor();
//     boolean var71 = var68.isExterns();
//     var39.setPropertyJSDocInfo("-1", var68, false);
//     com.google.javascript.rhino.jstype.BooleanLiteralSet var74 = var39.getPossibleToBooleanOutcomes();
//     com.google.javascript.jscomp.CodingConvention.SubclassType var75 = null;
//     var13.applySubclassRelationship(var30, var39, var75);
//     boolean var77 = var11.addVarArgs((com.google.javascript.rhino.jstype.JSType)var30);
// 
//   }

  public void test480() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test480"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    var1.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var5 = null;
    com.google.javascript.rhino.jstype.JSType var6 = null;
    com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
    com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
    boolean var9 = var8.canBeCalled();
    com.google.javascript.rhino.ErrorReporter var10 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var10);
    boolean var13 = var11.hasNamespace("hi!");
    var11.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var15 = null;
    com.google.javascript.rhino.jstype.JSType var16 = null;
    com.google.javascript.rhino.jstype.JSType[] var17 = new com.google.javascript.rhino.jstype.JSType[] { var16};
    com.google.javascript.rhino.jstype.FunctionType var18 = var11.createConstructorType(var15, var17);
    com.google.javascript.rhino.jstype.ObjectType var19 = var11.createAnonymousObjectType();
    boolean var20 = var19.isVoidType();
    com.google.javascript.rhino.ErrorReporter var21 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21);
    boolean var24 = var22.hasNamespace("hi!");
    var22.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var26 = null;
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.rhino.jstype.JSType[] var28 = new com.google.javascript.rhino.jstype.JSType[] { var27};
    com.google.javascript.rhino.jstype.FunctionType var29 = var22.createConstructorType(var26, var28);
    boolean var30 = var29.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var31 = var19.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var29);
    boolean var32 = var19.isEmptyType();
    boolean var33 = var8.isEquivalentTo((com.google.javascript.rhino.jstype.JSType)var19);
    com.google.javascript.rhino.ErrorReporter var34 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var34);
    boolean var37 = var35.hasNamespace("hi!");
    var35.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var39 = null;
    com.google.javascript.rhino.jstype.JSType var40 = null;
    com.google.javascript.rhino.jstype.JSType[] var41 = new com.google.javascript.rhino.jstype.JSType[] { var40};
    com.google.javascript.rhino.jstype.FunctionType var42 = var35.createConstructorType(var39, var41);
    com.google.javascript.rhino.jstype.ObjectType var43 = var35.createAnonymousObjectType();
    boolean var44 = var43.isVoidType();
    com.google.javascript.rhino.ErrorReporter var45 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var45);
    boolean var48 = var46.hasNamespace("hi!");
    var46.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var50 = null;
    com.google.javascript.rhino.jstype.JSType var51 = null;
    com.google.javascript.rhino.jstype.JSType[] var52 = new com.google.javascript.rhino.jstype.JSType[] { var51};
    com.google.javascript.rhino.jstype.FunctionType var53 = var46.createConstructorType(var50, var52);
    boolean var54 = var53.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var55 = var43.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var53);
    boolean var56 = var8.differsFrom((com.google.javascript.rhino.jstype.JSType)var43);
    java.lang.Iterable var57 = var8.getCtorImplementedInterfaces();
    boolean var58 = var8.isNoResolvedType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);

  }

  public void test481() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test481"); }


    com.google.javascript.rhino.Context.checkOptimizationLevel((-1));

  }

  public void test482() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test482"); }


    com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("");
    var3.putIntProp(100, 1);
    com.google.javascript.rhino.Node var7 = var3.removeFirstChild();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var17 = new com.google.javascript.rhino.Node(1, var3, var9, var14, 1, 1);
    com.google.javascript.rhino.JSDocInfo var18 = var9.getJSDocInfo();
    var9.setSourcePositionForTree(100);
    java.lang.Object var22 = null;
    var9.putProp((-1), var22);
    boolean var24 = var0.isVarArgsParameter(var9);
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    var29.setIsSyntheticBlock(true);
    java.lang.String var32 = var29.getString();
    var29.detachChildren();
    int var34 = var29.getSourcePosition();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var35 = var0.isPropertyTestFunction(var29);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 409600);

  }

  public void test483() {}
//   public void test483() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test483"); }
// 
// 
//     com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("");
//     var3.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var7 = var3.removeFirstChild();
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var17 = new com.google.javascript.rhino.Node(1, var3, var9, var14, 1, 1);
//     com.google.javascript.rhino.JSDocInfo var18 = var9.getJSDocInfo();
//     var9.setSourcePositionForTree(100);
//     java.lang.Object var22 = null;
//     var9.putProp((-1), var22);
//     boolean var24 = var0.isVarArgsParameter(var9);
//     java.lang.String var25 = var0.getExportPropertyFunction();
//     boolean var27 = var0.isConstant("JSDocInfo");
//     com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.Node.newString("");
//     var30.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var34 = var30.removeFirstChild();
//     com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var44 = new com.google.javascript.rhino.Node(1, var30, var36, var41, 1, 1);
//     boolean var45 = var36.hasSideEffects();
//     com.google.javascript.rhino.Node var46 = var36.getLastSibling();
//     boolean var47 = var0.isVarArgsParameter(var36);
//     boolean var49 = var0.isPrivate("JSDocInfo");
//     com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.Node.newString("");
//     java.lang.String var55 = var51.toString(false, true, false);
//     com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.Node.newString("");
//     var58.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var62 = var58.removeFirstChild();
//     com.google.javascript.rhino.Node var64 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var72 = new com.google.javascript.rhino.Node(1, var58, var64, var69, 1, 1);
//     boolean var73 = var64.hasSideEffects();
//     com.google.javascript.rhino.Node var74 = var51.copyInformationFromForTree(var64);
//     com.google.javascript.rhino.Node var75 = var64.cloneNode();
//     com.google.javascript.jscomp.DefaultCodingConvention var76 = new com.google.javascript.jscomp.DefaultCodingConvention();
//     boolean var78 = var76.isConstantKey("<No stack trace available>");
//     com.google.javascript.rhino.Node var81 = com.google.javascript.rhino.Node.newString("");
//     var81.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var85 = var81.removeFirstChild();
//     com.google.javascript.rhino.Node var87 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var92 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var95 = new com.google.javascript.rhino.Node(1, var81, var87, var92, 1, 1);
//     java.lang.String var96 = var76.getSingletonGetterClassName(var92);
//     java.lang.String var97 = var64.checkTreeEquals(var92);
//     java.util.List var98 = var0.identifyTypeDeclarationCall(var64);
// 
//   }

  public void test484() {}
//   public void test484() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test484"); }
// 
// 
//     com.google.javascript.jscomp.DefaultCodingConvention var0 = new com.google.javascript.jscomp.DefaultCodingConvention();
//     com.google.javascript.rhino.jstype.FunctionType var1 = null;
//     com.google.javascript.rhino.jstype.FunctionType var2 = null;
//     com.google.javascript.jscomp.CodingConvention.SubclassType var3 = null;
//     var0.applySubclassRelationship(var1, var2, var3);
//     java.lang.String var5 = var0.getDelegateSuperclassName();
//     java.io.PrintStream var6 = null;
//     com.google.javascript.jscomp.Compiler var7 = new com.google.javascript.jscomp.Compiler(var6);
//     com.google.javascript.jscomp.Region var10 = var7.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var13 = var7.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Compiler.IntermediateState var14 = var7.getState();
//     com.google.javascript.jscomp.NodeTraversal.Callback var15 = null;
//     com.google.javascript.jscomp.NodeTraversal var16 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var7, var15);
//     com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.Node.newString("");
//     boolean var19 = var18.hasChildren();
//     com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.JSDocInfo var25 = null;
//     var24.setJSDocInfo(var25);
//     com.google.javascript.rhino.Node var28 = var24.getChildAtIndex(0);
//     var18.addChildrenToFront(var24);
//     com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast var30 = var0.getObjectLiteralCast(var16, var24);
//     com.google.javascript.jscomp.CompilerInput var31 = var16.getInput();
// 
//   }

  public void test485() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test485"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    var4.setIsSyntheticBlock(true);
    java.lang.String var7 = var4.getString();
    boolean var8 = var4.hasSideEffects();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.Node.newString("");
    var11.putIntProp(100, 1);
    com.google.javascript.rhino.Node var15 = var11.removeFirstChild();
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var25 = new com.google.javascript.rhino.Node(1, var11, var17, var22, 1, 1);
    com.google.javascript.rhino.ErrorReporter var26 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var26);
    boolean var29 = var27.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var30 = new com.google.javascript.rhino.jstype.FunctionBuilder(var27);
    com.google.javascript.rhino.jstype.JSType var32 = var27.getType("STRING ");
    com.google.javascript.rhino.ErrorReporter var33 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33);
    boolean var36 = var34.hasNamespace("hi!");
    var34.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var38 = null;
    com.google.javascript.rhino.jstype.JSType var39 = null;
    com.google.javascript.rhino.jstype.JSType[] var40 = new com.google.javascript.rhino.jstype.JSType[] { var39};
    com.google.javascript.rhino.jstype.FunctionType var41 = var34.createConstructorType(var38, var40);
    com.google.javascript.rhino.jstype.ObjectType var42 = var34.createAnonymousObjectType();
    boolean var43 = var42.isVoidType();
    com.google.javascript.rhino.ErrorReporter var44 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var44);
    boolean var47 = var45.hasNamespace("hi!");
    var45.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var49 = null;
    com.google.javascript.rhino.jstype.JSType var50 = null;
    com.google.javascript.rhino.jstype.JSType[] var51 = new com.google.javascript.rhino.jstype.JSType[] { var50};
    com.google.javascript.rhino.jstype.FunctionType var52 = var45.createConstructorType(var49, var51);
    boolean var53 = var52.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var54 = var42.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var52);
    java.lang.Iterable var55 = var52.getAllImplementedInterfaces();
    com.google.javascript.rhino.jstype.JSType[] var56 = new com.google.javascript.rhino.jstype.JSType[] { var52};
    com.google.javascript.rhino.Node var57 = var27.createParametersWithVarArgs(var56);
    com.google.javascript.rhino.Node var58 = var17.copyInformationFromForTree(var57);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.addChildrenToFront(var58);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
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

  public void test486() {}
//   public void test486() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test486"); }
// 
// 
//     com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot var0 = null;
//     com.google.javascript.jscomp.parsing.Config.LanguageMode var3 = null;
//     com.google.javascript.jscomp.parsing.Config var5 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(false, var3, true);
//     com.google.javascript.jscomp.mozilla.rhino.ErrorReporter var6 = null;
//     com.google.javascript.rhino.Node var7 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(var0, "goog.exportProperty", var5, var6);
// 
//   }

  public void test487() {}
//   public void test487() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test487"); }
// 
// 
//     java.util.logging.Logger var0 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
//     double var2 = var1.getTypedPercent();
//     var1.setTypedPercent((-1.0d));
//     var1.generateReport();
//     com.google.javascript.jscomp.Compiler var6 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var1);
//     var6.optimize();
// 
//   }

  public void test488() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test488"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.JSTypeNative var1 = com.google.javascript.rhino.jstype.JSTypeNative.valueOf("window");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test489() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test489"); }


    com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromCode("LinkedGraph", "ERROR");
    java.lang.String var4 = var2.getLine(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test490() {}
//   public void test490() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test490"); }
// 
// 
//     com.google.javascript.jscomp.DefaultCodingConvention var0 = new com.google.javascript.jscomp.DefaultCodingConvention();
//     com.google.javascript.rhino.jstype.FunctionType var1 = null;
//     com.google.javascript.rhino.jstype.FunctionType var2 = null;
//     com.google.javascript.jscomp.CodingConvention.SubclassType var3 = null;
//     var0.applySubclassRelationship(var1, var2, var3);
//     java.lang.String var5 = var0.getDelegateSuperclassName();
//     java.io.PrintStream var6 = null;
//     com.google.javascript.jscomp.Compiler var7 = new com.google.javascript.jscomp.Compiler(var6);
//     com.google.javascript.jscomp.Region var10 = var7.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var13 = var7.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Compiler.IntermediateState var14 = var7.getState();
//     com.google.javascript.jscomp.NodeTraversal.Callback var15 = null;
//     com.google.javascript.jscomp.NodeTraversal var16 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var7, var15);
//     com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.Node.newString("");
//     boolean var19 = var18.hasChildren();
//     com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.JSDocInfo var25 = null;
//     var24.setJSDocInfo(var25);
//     com.google.javascript.rhino.Node var28 = var24.getChildAtIndex(0);
//     var18.addChildrenToFront(var24);
//     com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast var30 = var0.getObjectLiteralCast(var16, var24);
//     com.google.javascript.jscomp.Scope var31 = var16.getScope();
//     com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.JSTypeExpression var38 = new com.google.javascript.rhino.JSTypeExpression(var36, "");
//     com.google.javascript.jscomp.CheckLevel var39 = null;
//     com.google.javascript.jscomp.CheckLevel var41 = null;
//     com.google.javascript.jscomp.DiagnosticType var43 = com.google.javascript.jscomp.DiagnosticType.make("", var41, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var45 = null;
//     com.google.javascript.jscomp.DiagnosticType var47 = com.google.javascript.jscomp.DiagnosticType.make("", var45, "(ERROR)");
//     int var48 = var43.compareTo(var47);
//     com.google.javascript.jscomp.CheckLevel var50 = null;
//     com.google.javascript.jscomp.DiagnosticType var52 = com.google.javascript.jscomp.DiagnosticType.make("", var50, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var54 = null;
//     com.google.javascript.jscomp.DiagnosticType var56 = com.google.javascript.jscomp.DiagnosticType.make("", var54, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var58 = null;
//     com.google.javascript.jscomp.DiagnosticType var60 = com.google.javascript.jscomp.DiagnosticType.make("", var58, "(ERROR)");
//     int var61 = var56.compareTo(var60);
//     java.lang.String[] var63 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var64 = com.google.javascript.jscomp.JSError.make(var60, var63);
//     com.google.javascript.jscomp.JSError var65 = com.google.javascript.jscomp.JSError.make(var52, var63);
//     com.google.javascript.jscomp.JSError var66 = var16.makeError(var36, var39, var47, var63);
//     com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.Node.newString("");
//     var69.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var73 = var69.removeFirstChild();
//     com.google.javascript.rhino.Node var75 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var80 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var83 = new com.google.javascript.rhino.Node(1, var69, var75, var80, 1, 1);
//     com.google.javascript.rhino.JSDocInfo var84 = var75.getJSDocInfo();
//     var75.setSourcePositionForTree(100);
//     com.google.javascript.jscomp.CheckLevel var88 = null;
//     com.google.javascript.jscomp.DiagnosticType var90 = com.google.javascript.jscomp.DiagnosticType.make("", var88, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var92 = null;
//     com.google.javascript.jscomp.DiagnosticType var94 = com.google.javascript.jscomp.DiagnosticType.make("", var92, "(ERROR)");
//     int var95 = var90.compareTo(var94);
//     java.lang.String[] var97 = new java.lang.String[] { ". (ERROR) at ERROR  100 [synthetic: 1]\n line 1 : 1"};
//     var16.report(var75, var94, var97);
// 
//   }

  public void test491() {}
//   public void test491() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test491"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var1 = null;
//     com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("", var1, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var5 = null;
//     com.google.javascript.jscomp.DiagnosticType var7 = com.google.javascript.jscomp.DiagnosticType.make("", var5, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var9 = null;
//     com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.make("", var9, "(ERROR)");
//     int var12 = var7.compareTo(var11);
//     java.lang.String[] var14 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var15 = com.google.javascript.jscomp.JSError.make(var11, var14);
//     com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make(var3, var14);
//     com.google.javascript.jscomp.CheckLevel var17 = null;
//     java.io.PrintStream var18 = null;
//     com.google.javascript.jscomp.Compiler var19 = new com.google.javascript.jscomp.Compiler(var18);
//     com.google.javascript.jscomp.Region var22 = var19.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var23 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var19);
//     var23.setColorize(false);
//     java.lang.String var26 = var16.format(var17, (com.google.javascript.jscomp.MessageFormatter)var23);
// 
//   }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test492"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.lang.Iterable var1 = var0.getDirectedGraphNodes();
    java.util.Collection var2 = var0.getNodes();
    var0.pushEdgeAnnotations();
    com.google.javascript.rhino.ErrorReporter var4 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var4, false);
    var6.setLastGeneration(false);
    com.google.javascript.rhino.ErrorReporter var9 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var9);
    boolean var12 = var10.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var13 = new com.google.javascript.rhino.jstype.FunctionBuilder(var10);
    com.google.javascript.rhino.jstype.JSType var15 = var10.getType("STRING ");
    com.google.javascript.rhino.ErrorReporter var16 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var16);
    boolean var19 = var17.hasNamespace("hi!");
    var17.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var21 = null;
    com.google.javascript.rhino.jstype.JSType var22 = null;
    com.google.javascript.rhino.jstype.JSType[] var23 = new com.google.javascript.rhino.jstype.JSType[] { var22};
    com.google.javascript.rhino.jstype.FunctionType var24 = var17.createConstructorType(var21, var23);
    boolean var25 = var24.canBeCalled();
    com.google.javascript.rhino.jstype.JSType var26 = var24.getReturnType();
    com.google.javascript.rhino.jstype.JSType var28 = var10.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType)var24, "");
    var10.setLastGeneration(false);
    boolean var32 = var10.hasNamespace("-1");
    com.google.javascript.rhino.jstype.StaticScope var33 = null;
    var10.resolveTypesInScope(var33);
    com.google.javascript.rhino.jstype.JSTypeRegistry var35 = null;
    com.google.javascript.rhino.jstype.FunctionParamBuilder var36 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var35);
    com.google.javascript.rhino.ErrorReporter var37 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var37);
    boolean var40 = var38.hasNamespace("hi!");
    var38.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var42 = null;
    com.google.javascript.rhino.jstype.JSType var43 = null;
    com.google.javascript.rhino.jstype.JSType[] var44 = new com.google.javascript.rhino.jstype.JSType[] { var43};
    com.google.javascript.rhino.jstype.FunctionType var45 = var38.createConstructorType(var42, var44);
    com.google.javascript.rhino.jstype.ObjectType var46 = var38.createAnonymousObjectType();
    com.google.javascript.rhino.jstype.JSType[] var47 = new com.google.javascript.rhino.jstype.JSType[] { var46};
    boolean var48 = var36.addRequiredParams(var47);
    com.google.javascript.rhino.Node var49 = var10.createOptionalParameters(var47);
    com.google.javascript.rhino.jstype.JSType var50 = var6.createUnionType(var47);
    com.google.javascript.jscomp.JSModule var52 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var54 = new com.google.javascript.jscomp.JSModule("");
    var52.addDependency(var54);
    java.util.List var56 = var52.getDependencies();
    java.util.List var57 = var52.getRequires();
    com.google.javascript.jscomp.SourceAst var58 = null;
    com.google.javascript.jscomp.CompilerInput var61 = new com.google.javascript.jscomp.CompilerInput(var58, "", true);
    com.google.javascript.jscomp.SourceAst var62 = var61.getSourceAst();
    var52.remove(var61);
    java.lang.Object var64 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.connectIfNotFound((java.lang.Object)var47, (java.lang.Object)var61, var64);
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
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
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
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
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);

  }

  public void test493() {}
//   public void test493() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test493"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Scope var2 = var1.getTopScope();
//     com.google.javascript.jscomp.JSSourceFile[] var3 = null;
//     java.io.PrintStream var4 = null;
//     com.google.javascript.jscomp.Compiler var5 = new com.google.javascript.jscomp.Compiler(var4);
//     com.google.javascript.jscomp.Region var8 = var5.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var11 = var5.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var12 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var5);
//     com.google.javascript.jscomp.Compiler.IntermediateState var13 = var5.getState();
//     com.google.javascript.jscomp.SourceFile.Generator var15 = null;
//     com.google.javascript.jscomp.JSSourceFile var16 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var15);
//     com.google.javascript.jscomp.CompilerInput var18 = new com.google.javascript.jscomp.CompilerInput(var16, false);
//     com.google.javascript.jscomp.SourceFile.Generator var20 = null;
//     com.google.javascript.jscomp.JSSourceFile var21 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var20);
//     java.lang.String var22 = var21.getName();
//     com.google.javascript.jscomp.CompilerOptions var23 = new com.google.javascript.jscomp.CompilerOptions();
//     com.google.javascript.jscomp.VariableRenamingPolicy var24 = null;
//     com.google.javascript.jscomp.PropertyRenamingPolicy var25 = null;
//     var23.setRenamingPolicy(var24, var25);
//     com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler var27 = null;
//     var23.setAliasTransformationHandler(var27);
//     com.google.javascript.jscomp.Result var29 = var5.compile(var16, var21, var23);
//     com.google.javascript.jscomp.SourceFile.Generator var31 = null;
//     com.google.javascript.jscomp.JSSourceFile var32 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var31);
//     java.lang.String var33 = var32.getName();
//     com.google.javascript.jscomp.CompilerInput var35 = new com.google.javascript.jscomp.CompilerInput(var32, true);
//     var32.clearCachedSource();
//     com.google.javascript.jscomp.SourceFile.Generator var38 = null;
//     com.google.javascript.jscomp.JSSourceFile var39 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var38);
//     java.lang.String var40 = var39.getName();
//     var39.setOriginalPath("");
//     com.google.javascript.jscomp.JSSourceFile[] var43 = new com.google.javascript.jscomp.JSSourceFile[] { var39};
//     java.io.PrintStream var44 = null;
//     com.google.javascript.jscomp.Compiler var45 = new com.google.javascript.jscomp.Compiler(var44);
//     com.google.javascript.jscomp.Region var48 = var45.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var51 = var45.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Compiler.IntermediateState var52 = var45.getState();
//     com.google.javascript.jscomp.SourceMap var53 = var45.getSourceMap();
//     com.google.javascript.jscomp.SourceFile.Generator var55 = null;
//     com.google.javascript.jscomp.JSSourceFile var56 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var55);
//     java.lang.String var57 = var56.getName();
//     var56.setOriginalPath("");
//     com.google.javascript.jscomp.SourceFile.Generator var61 = null;
//     com.google.javascript.jscomp.JSSourceFile var62 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var61);
//     java.lang.String var63 = var62.getName();
//     com.google.javascript.jscomp.CompilerOptions var64 = new com.google.javascript.jscomp.CompilerOptions();
//     com.google.javascript.jscomp.CodingConvention var65 = var64.getCodingConvention();
//     var64.enableExternExports(true);
//     boolean var68 = var64.isExternExportsEnabled();
//     com.google.javascript.jscomp.Result var69 = var45.compile(var56, var62, var64);
//     com.google.javascript.jscomp.Result var70 = var5.compile(var32, var43, var64);
//     com.google.javascript.jscomp.CompilerOptions var71 = new com.google.javascript.jscomp.CompilerOptions();
//     com.google.javascript.jscomp.VariableRenamingPolicy var72 = null;
//     com.google.javascript.jscomp.PropertyRenamingPolicy var73 = null;
//     var71.setRenamingPolicy(var72, var73);
//     var1.init(var3, var43, var71);
// 
//   }

  public void test494() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test494"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Set var1 = var0.getSuppressions();
    com.google.javascript.rhino.JSTypeExpression var2 = var0.getThisType();
    boolean var3 = var0.isExterns();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test495() {}
//   public void test495() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test495"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var8 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     var8.setColorize(false);
//     com.google.javascript.jscomp.DefaultCodingConvention var11 = new com.google.javascript.jscomp.DefaultCodingConvention();
//     com.google.javascript.rhino.jstype.FunctionType var12 = null;
//     com.google.javascript.rhino.jstype.FunctionType var13 = null;
//     com.google.javascript.jscomp.CodingConvention.SubclassType var14 = null;
//     var11.applySubclassRelationship(var12, var13, var14);
//     java.lang.String var16 = var11.getDelegateSuperclassName();
//     java.io.PrintStream var17 = null;
//     com.google.javascript.jscomp.Compiler var18 = new com.google.javascript.jscomp.Compiler(var17);
//     com.google.javascript.jscomp.Region var21 = var18.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var24 = var18.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Compiler.IntermediateState var25 = var18.getState();
//     com.google.javascript.jscomp.NodeTraversal.Callback var26 = null;
//     com.google.javascript.jscomp.NodeTraversal var27 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var18, var26);
//     com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.Node.newString("");
//     boolean var30 = var29.hasChildren();
//     com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.JSDocInfo var36 = null;
//     var35.setJSDocInfo(var36);
//     com.google.javascript.rhino.Node var39 = var35.getChildAtIndex(0);
//     var29.addChildrenToFront(var35);
//     com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast var41 = var11.getObjectLiteralCast(var27, var35);
//     com.google.javascript.jscomp.Scope var42 = var27.getScope();
//     com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.JSTypeExpression var49 = new com.google.javascript.rhino.JSTypeExpression(var47, "");
//     com.google.javascript.jscomp.CheckLevel var50 = null;
//     com.google.javascript.jscomp.CheckLevel var52 = null;
//     com.google.javascript.jscomp.DiagnosticType var54 = com.google.javascript.jscomp.DiagnosticType.make("", var52, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var56 = null;
//     com.google.javascript.jscomp.DiagnosticType var58 = com.google.javascript.jscomp.DiagnosticType.make("", var56, "(ERROR)");
//     int var59 = var54.compareTo(var58);
//     com.google.javascript.jscomp.CheckLevel var61 = null;
//     com.google.javascript.jscomp.DiagnosticType var63 = com.google.javascript.jscomp.DiagnosticType.make("", var61, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var65 = null;
//     com.google.javascript.jscomp.DiagnosticType var67 = com.google.javascript.jscomp.DiagnosticType.make("", var65, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var69 = null;
//     com.google.javascript.jscomp.DiagnosticType var71 = com.google.javascript.jscomp.DiagnosticType.make("", var69, "(ERROR)");
//     int var72 = var67.compareTo(var71);
//     java.lang.String[] var74 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var75 = com.google.javascript.jscomp.JSError.make(var71, var74);
//     com.google.javascript.jscomp.JSError var76 = com.google.javascript.jscomp.JSError.make(var63, var74);
//     com.google.javascript.jscomp.JSError var77 = var27.makeError(var47, var50, var58, var74);
//     java.lang.String var78 = var8.formatWarning(var77);
// 
//   }

  public void test496() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test496"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    java.lang.String var1 = var0.getOriginalCommentString();
    boolean var2 = var0.isOverride();
    boolean var3 = var0.isImplicitCast();
    java.lang.String var4 = var0.getDescription();
    var0.addSuppression("Node tree inequality:\nTree1:\nSTRING \n\n\nTree2:\nERROR  100\n\n\nSubtree1: STRING \n\n\nSubtree2: ERROR  100\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test497() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test497"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Context.reportWarning("", "hi!: hi!", 409600, "", 100);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test498() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test498"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var1 = com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.valueOf("ERROR  100");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test499() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test499"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
    com.google.javascript.rhino.ErrorReporter var5 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var5);
    boolean var8 = var6.hasNamespace("hi!");
    var6.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var10 = null;
    com.google.javascript.rhino.jstype.JSType var11 = null;
    com.google.javascript.rhino.jstype.JSType[] var12 = new com.google.javascript.rhino.jstype.JSType[] { var11};
    com.google.javascript.rhino.jstype.FunctionType var13 = var6.createConstructorType(var10, var12);
    boolean var14 = var13.canBeCalled();
    com.google.javascript.rhino.jstype.FunctionBuilder var16 = var4.withReturnType((com.google.javascript.rhino.jstype.JSType)var13, false);
    com.google.javascript.rhino.jstype.JSTypeRegistry var17 = null;
    com.google.javascript.rhino.jstype.FunctionParamBuilder var18 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var17);
    com.google.javascript.rhino.ErrorReporter var19 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var19);
    boolean var22 = var20.hasNamespace("hi!");
    var20.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var24 = null;
    com.google.javascript.rhino.jstype.JSType var25 = null;
    com.google.javascript.rhino.jstype.JSType[] var26 = new com.google.javascript.rhino.jstype.JSType[] { var25};
    com.google.javascript.rhino.jstype.FunctionType var27 = var20.createConstructorType(var24, var26);
    com.google.javascript.rhino.jstype.ObjectType var28 = var20.createAnonymousObjectType();
    com.google.javascript.rhino.jstype.JSType[] var29 = new com.google.javascript.rhino.jstype.JSType[] { var28};
    boolean var30 = var18.addRequiredParams(var29);
    com.google.javascript.rhino.jstype.FunctionBuilder var31 = var4.withParams(var18);
    com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.Node.newString("");
    var34.putIntProp(100, 1);
    com.google.javascript.rhino.Node var38 = var34.removeFirstChild();
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var48 = new com.google.javascript.rhino.Node(1, var34, var40, var45, 1, 1);
    int var49 = var45.getLineno();
    java.lang.RuntimeException var50 = com.google.javascript.rhino.ScriptRuntime.undefReadError((java.lang.Object)var4, (java.lang.Object)var49);
    com.google.javascript.rhino.ErrorReporter var51 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var51);
    boolean var54 = var52.hasNamespace("hi!");
    var52.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var56 = null;
    com.google.javascript.rhino.jstype.JSType var57 = null;
    com.google.javascript.rhino.jstype.JSType[] var58 = new com.google.javascript.rhino.jstype.JSType[] { var57};
    com.google.javascript.rhino.jstype.FunctionType var59 = var52.createConstructorType(var56, var58);
    com.google.javascript.rhino.ErrorReporter var60 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var60);
    boolean var63 = var61.hasNamespace("hi!");
    var61.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var65 = null;
    com.google.javascript.rhino.jstype.JSType var66 = null;
    com.google.javascript.rhino.jstype.JSType[] var67 = new com.google.javascript.rhino.jstype.JSType[] { var66};
    com.google.javascript.rhino.jstype.FunctionType var68 = var61.createConstructorType(var65, var67);
    boolean var69 = var68.canBeCalled();
    var59.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var68);
    boolean var72 = var59.isPropertyTypeInferred("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var73 = var4.copyFromOtherFunction(var59);
    com.google.javascript.jscomp.DefaultCodingConvention var74 = new com.google.javascript.jscomp.DefaultCodingConvention();
    boolean var76 = var74.isConstantKey("<No stack trace available>");
    com.google.javascript.rhino.Node var79 = com.google.javascript.rhino.Node.newString("");
    var79.putIntProp(100, 1);
    com.google.javascript.rhino.Node var83 = var79.removeFirstChild();
    com.google.javascript.rhino.Node var85 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var90 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var93 = new com.google.javascript.rhino.Node(1, var79, var85, var90, 1, 1);
    java.lang.String var94 = var74.getSingletonGetterClassName(var90);
    boolean var95 = var90.wasEmptyNode();
    var59.setSource(var90);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.JSDocInfo var97 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(var90);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == false);

  }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test500"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
    java.lang.Iterable var6 = var1.getTypesWithProperty("");
    com.google.javascript.rhino.ErrorReporter var7 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7);
    boolean var10 = var8.hasNamespace("hi!");
    var8.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var12 = null;
    com.google.javascript.rhino.jstype.JSType var13 = null;
    com.google.javascript.rhino.jstype.JSType[] var14 = new com.google.javascript.rhino.jstype.JSType[] { var13};
    com.google.javascript.rhino.jstype.FunctionType var15 = var8.createConstructorType(var12, var14);
    com.google.javascript.rhino.ErrorReporter var16 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var16);
    boolean var19 = var17.hasNamespace("hi!");
    var17.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var21 = null;
    com.google.javascript.rhino.jstype.JSType var22 = null;
    com.google.javascript.rhino.jstype.JSType[] var23 = new com.google.javascript.rhino.jstype.JSType[] { var22};
    com.google.javascript.rhino.jstype.FunctionType var24 = var17.createConstructorType(var21, var23);
    boolean var25 = var24.canBeCalled();
    var15.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var24);
    boolean var27 = var24.isInterface();
    boolean var28 = var24.isFunctionType();
    com.google.javascript.rhino.ErrorReporter var29 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29);
    boolean var32 = var30.hasNamespace("hi!");
    var30.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var34 = null;
    com.google.javascript.rhino.jstype.JSType var35 = null;
    com.google.javascript.rhino.jstype.JSType[] var36 = new com.google.javascript.rhino.jstype.JSType[] { var35};
    com.google.javascript.rhino.jstype.FunctionType var37 = var30.createConstructorType(var34, var36);
    com.google.javascript.rhino.ErrorReporter var38 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var38);
    boolean var41 = var39.hasNamespace("hi!");
    var39.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var43 = null;
    com.google.javascript.rhino.jstype.JSType var44 = null;
    com.google.javascript.rhino.jstype.JSType[] var45 = new com.google.javascript.rhino.jstype.JSType[] { var44};
    com.google.javascript.rhino.jstype.FunctionType var46 = var39.createConstructorType(var43, var45);
    boolean var47 = var46.canBeCalled();
    var37.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var46);
    com.google.javascript.rhino.ErrorReporter var49 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var49);
    boolean var52 = var50.hasNamespace("hi!");
    var50.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var54 = null;
    com.google.javascript.rhino.jstype.JSType var55 = null;
    com.google.javascript.rhino.jstype.JSType[] var56 = new com.google.javascript.rhino.jstype.JSType[] { var55};
    com.google.javascript.rhino.jstype.FunctionType var57 = var50.createConstructorType(var54, var56);
    boolean var58 = var57.canBeCalled();
    com.google.javascript.rhino.ErrorReporter var59 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var59);
    boolean var62 = var60.hasNamespace("hi!");
    var60.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var64 = null;
    com.google.javascript.rhino.jstype.JSType var65 = null;
    com.google.javascript.rhino.jstype.JSType[] var66 = new com.google.javascript.rhino.jstype.JSType[] { var65};
    com.google.javascript.rhino.jstype.FunctionType var67 = var60.createConstructorType(var64, var66);
    com.google.javascript.rhino.jstype.ObjectType var68 = var60.createAnonymousObjectType();
    boolean var69 = var68.isVoidType();
    com.google.javascript.rhino.ErrorReporter var70 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var70);
    boolean var73 = var71.hasNamespace("hi!");
    var71.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var75 = null;
    com.google.javascript.rhino.jstype.JSType var76 = null;
    com.google.javascript.rhino.jstype.JSType[] var77 = new com.google.javascript.rhino.jstype.JSType[] { var76};
    com.google.javascript.rhino.jstype.FunctionType var78 = var71.createConstructorType(var75, var77);
    boolean var79 = var78.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var80 = var68.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var78);
    boolean var81 = var68.isEmptyType();
    boolean var82 = var57.isEquivalentTo((com.google.javascript.rhino.jstype.JSType)var68);
    com.google.javascript.rhino.jstype.FunctionPrototypeType var83 = null;
    boolean var84 = var57.setPrototype(var83);
    com.google.javascript.rhino.JSDocInfo var86 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Set var87 = var86.getSuppressions();
    boolean var88 = var86.isConstructor();
    boolean var89 = var86.isExterns();
    var57.setPropertyJSDocInfo("-1", var86, false);
    boolean var92 = var86.isDefine();
    com.google.javascript.rhino.JSTypeExpression var94 = var86.getParameterType("");
    com.google.javascript.rhino.JSTypeExpression var95 = var86.getReturnType();
    java.util.List var96 = var86.getThrownTypes();
    com.google.javascript.rhino.jstype.JSType var97 = var1.createFunctionType((com.google.javascript.rhino.jstype.ObjectType)var24, (com.google.javascript.rhino.jstype.JSType)var46, var96);
    boolean var98 = var24.isObject();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var98 == true);

  }

}

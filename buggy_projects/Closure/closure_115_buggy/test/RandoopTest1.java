
import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() {}
//   public void test1() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test1"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = new com.google.javascript.rhino.Node(0);
//     boolean var2 = var1.isFor();
//     com.google.javascript.rhino.Node var3 = null;
//     var1.addChildrenToBack(var3);
// 
//   }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test2"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.jscomp.AbstractCompiler var3 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var4 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var5 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var7 = var5.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var8 = var4.getDirectedPredNodes(var7);
    com.google.javascript.jscomp.NodeTraversal.Callback var9 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var3, var8, var9);
    com.google.javascript.rhino.jstype.FunctionType var11 = var1.createFunctionType(var2, var8);
    boolean var13 = var1.isForwardDeclaredType("ERROR");
    var1.resetForTypeCheck();
    com.google.javascript.rhino.jstype.ModificationVisitor var15 = new com.google.javascript.rhino.jstype.ModificationVisitor(var1);
    com.google.javascript.rhino.jstype.JSType var16 = var15.caseBooleanType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test3"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.CompilerOptions var1 = new com.google.javascript.jscomp.CompilerOptions();
    var1.setNameReferenceReportPath("");
    var1.setSyntheticBlockEndMarker("hi!");
    var1.setTightenTypes(true);
    java.util.Set var8 = null;
    var1.setCssRenamingWhitelist(var8);
    var1.setInlineVariables(false);
    com.google.javascript.jscomp.CheckLevel var12 = null;
    var1.setCheckUnreachableCode(var12);
    var1.setDeadAssignmentElimination(true);
    byte[] var16 = new byte[] { };
    var1.setInputVariableMapSerialized(var16);
    var1.setPrintInputDelimiter(true);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var20 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var21 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var23 = var21.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var24 = var20.getDirectedPredNodes(var23);
    var1.setSourceMapLocationMappings(var24);
    com.google.javascript.jscomp.CompilerOptions.TracerMode var26 = null;
    var1.setTracerMode(var26);
    java.util.Map var28 = var1.getDefineReplacements();
    var0.setPropertyInvalidationErrors(var28);
    var0.setExternExportsPath("goog.exportSymbol");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test4() {}
//   public void test4() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test4"); }
// 
// 
//     com.google.javascript.rhino.Node var4 = new com.google.javascript.rhino.Node(10, 10, 0);
//     com.google.javascript.rhino.Node var8 = new com.google.javascript.rhino.Node(10, 10, 0);
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.comma(var4, var8);
//     boolean var10 = var9.isNoSideEffectsCall();
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.warning("hi!", "ERROR");
//     java.lang.String[] var15 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("", var9, var13, var15);
//     com.google.javascript.jscomp.CompilerOptions var17 = new com.google.javascript.jscomp.CompilerOptions();
//     var17.setPropertyAffinity(false);
//     com.google.javascript.jscomp.CheckLevel var20 = null;
//     var17.setBrokenClosureRequiresLevel(var20);
//     boolean var22 = var16.equals((java.lang.Object)var20);
//     int var23 = var16.getLineNumber();
//     com.google.javascript.jscomp.CheckLevel var24 = null;
//     java.io.PrintStream var25 = null;
//     com.google.javascript.jscomp.Compiler var26 = new com.google.javascript.jscomp.Compiler(var25);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var27 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.List var28 = var27.getEdges();
//     com.google.javascript.jscomp.NodeTraversal.Callback var29 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var26, var28, var29);
//     double var31 = var26.getProgress();
//     com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var32 = null;
//     com.google.javascript.jscomp.LightweightMessageFormatter var33 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var26, var32);
//     java.lang.String var34 = var16.format(var24, (com.google.javascript.jscomp.MessageFormatter)var33);
// 
//   }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test5"); }


    java.util.Set var0 = com.google.javascript.jscomp.parsing.ParserRunner.getReservedVars();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test6"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.jscomp.AbstractCompiler var3 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var4 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var5 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var7 = var5.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var8 = var4.getDirectedPredNodes(var7);
    com.google.javascript.jscomp.NodeTraversal.Callback var9 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var3, var8, var9);
    com.google.javascript.rhino.jstype.FunctionType var11 = var1.createFunctionType(var2, var8);
    com.google.javascript.rhino.ErrorReporter var12 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var12);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var14 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var15 = var14.getEdges();
    com.google.javascript.jscomp.deps.SortedDependencies var16 = new com.google.javascript.jscomp.deps.SortedDependencies(var15);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var17 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var18 = var17.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var19 = new com.google.javascript.jscomp.ComposeWarningsGuard(var18);
    com.google.javascript.jscomp.JSModuleGraph var20 = new com.google.javascript.jscomp.JSModuleGraph(var18);
    java.util.List var21 = var16.getSortedDependenciesOf(var18);
    com.google.javascript.rhino.Node var22 = var13.createParametersWithVarArgs(var21);
    com.google.common.collect.ImmutableList var23 = null;
    com.google.common.collect.ImmutableList var24 = null;
    com.google.javascript.rhino.jstype.TemplateTypeMap var25 = var13.createTemplateTypeMap(var23, var24);
    java.lang.String var26 = var25.toString();
    com.google.javascript.rhino.jstype.TemplateTypeMapReplacer var27 = new com.google.javascript.rhino.jstype.TemplateTypeMapReplacer(var1, var25);
    var1.resetForTypeCheck();
    java.io.PrintStream var29 = null;
    com.google.javascript.jscomp.Compiler var30 = new com.google.javascript.jscomp.Compiler(var29);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var31 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var32 = var31.getEdges();
    com.google.javascript.jscomp.NodeTraversal.Callback var33 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var30, var32, var33);
    java.lang.String var35 = var30.getAstDotGraph();
    com.google.javascript.jscomp.CompilerOptions var36 = null;
    com.google.javascript.jscomp.DefaultPassConfig var37 = new com.google.javascript.jscomp.DefaultPassConfig(var36);
    var30.setPassConfig((com.google.javascript.jscomp.PassConfig)var37);
    java.io.PrintStream var39 = null;
    com.google.javascript.jscomp.Compiler var40 = new com.google.javascript.jscomp.Compiler(var39);
    var40.reportCodeChange();
    com.google.javascript.jscomp.SourceFile var43 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.lang.String var44 = var43.getOriginalPath();
    com.google.javascript.rhino.Node var45 = var40.parse(var43);
    var43.setOriginalPath("{ }");
    com.google.javascript.rhino.Node var48 = var30.parse(var43);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var49 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var51 = var49.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var52 = var49.getGraphvizEdges();
    com.google.javascript.jscomp.NodeTraversal.Callback var53 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var30, var52, var53);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var55 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var56 = var55.getEdges();
    com.google.javascript.jscomp.deps.SortedDependencies var57 = new com.google.javascript.jscomp.deps.SortedDependencies(var56);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var58 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var59 = var58.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var60 = new com.google.javascript.jscomp.ComposeWarningsGuard(var59);
    com.google.javascript.jscomp.JSModuleGraph var61 = new com.google.javascript.jscomp.JSModuleGraph(var59);
    java.util.List var62 = var57.getSortedDependenciesOf(var59);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var63 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var64 = var63.getEdges();
    com.google.javascript.jscomp.CompilerOptions var65 = new com.google.javascript.jscomp.CompilerOptions();
    var65.setNameReferenceReportPath("");
    var65.setSyntheticBlockEndMarker("hi!");
    var65.setTightenTypes(true);
    java.util.Set var72 = null;
    var65.setCssRenamingWhitelist(var72);
    var65.setOptimizeArgumentsArray(true);
    com.google.javascript.jscomp.Result var76 = var30.<com.google.javascript.jscomp.SourceFile>compileModules(var59, var64, var65);
    com.google.javascript.rhino.Node var77 = var1.createParameters(var64);
    com.google.javascript.jscomp.CodingConvention var78 = com.google.javascript.jscomp.CodingConventions.getDefault();
    com.google.javascript.jscomp.GoogleCodingConvention var79 = new com.google.javascript.jscomp.GoogleCodingConvention(var78);
    com.google.javascript.jscomp.ClosureCodingConvention var80 = new com.google.javascript.jscomp.ClosureCodingConvention(var78);
    com.google.javascript.rhino.Node var84 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var85 = var84.getDirectives();
    var84.putIntProp((-1), 0);
    var84.setVarArgs(false);
    com.google.javascript.rhino.jstype.StaticSourceFile var91 = var84.getStaticSourceFile();
    com.google.javascript.jscomp.CodingConvention.Bind var92 = var80.describeFunctionBind(var84);
    com.google.javascript.rhino.Node.AncestorIterable var93 = var84.getAncestors();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var94 = com.google.javascript.rhino.IR.sub(var77, var84);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "{ }"+ "'", var26.equals("{ }"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + ""+ "'", var35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test7"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setNameReferenceReportPath("");
    var0.setSyntheticBlockEndMarker("hi!");
    var0.setTightenTypes(true);
    java.util.Set var7 = null;
    var0.setCssRenamingWhitelist(var7);
    var0.setInlineVariables(false);
    com.google.javascript.jscomp.CheckLevel var11 = null;
    var0.setCheckUnreachableCode(var11);
    var0.setDeadAssignmentElimination(true);
    byte[] var15 = new byte[] { };
    var0.setInputVariableMapSerialized(var15);
    var0.setPrintInputDelimiter(true);
    var0.setShadowVariables(false);
    var0.setAliasKeywords(false);
    var0.setRemoveTryCatchFinally(true);
    var0.setUnaliasableGlobals("window");
    var0.setTweakToBooleanLiteral("2014/12/24 01:19", true);
    var0.setExternExportsPath("EXPR_RESULT");
    var0.setProtectHiddenSideEffects(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test8() {}
//   public void test8() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test8"); }
// 
// 
//     com.google.javascript.jscomp.AstValidator var0 = new com.google.javascript.jscomp.AstValidator();
//     com.google.javascript.rhino.Node var1 = null;
//     var0.validateStatement(var1);
// 
//   }

  public void test9() {}
//   public void test9() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test9"); }
// 
// 
//     com.google.javascript.rhino.Node var3 = new com.google.javascript.rhino.Node(10, 10, 0);
//     java.util.Set var4 = var3.getDirectives();
//     boolean var5 = var3.isThrow();
//     var3.removeProp(1);
//     boolean var8 = var3.isDebugger();
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.empty();
//     com.google.javascript.rhino.Node var10 = var9.cloneTree();
//     com.google.javascript.rhino.Node var11 = var3.getChildBefore(var9);
// 
//   }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test10"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.jscomp.AbstractCompiler var3 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var4 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var5 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var7 = var5.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var8 = var4.getDirectedPredNodes(var7);
    com.google.javascript.jscomp.NodeTraversal.Callback var9 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var3, var8, var9);
    com.google.javascript.rhino.jstype.FunctionType var11 = var1.createFunctionType(var2, var8);
    java.lang.Iterable var12 = var11.getImplementedInterfaces();
    boolean var13 = var11.isStruct();
    java.lang.String var14 = var11.getDisplayName();
    com.google.javascript.rhino.ErrorReporter var15 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var15);
    com.google.javascript.rhino.ErrorReporter var17 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var17);
    com.google.javascript.rhino.jstype.JSType var19 = null;
    com.google.javascript.jscomp.AbstractCompiler var20 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var21 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var22 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var24 = var22.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var25 = var21.getDirectedPredNodes(var24);
    com.google.javascript.jscomp.NodeTraversal.Callback var26 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var20, var25, var26);
    com.google.javascript.rhino.jstype.FunctionType var28 = var18.createFunctionType(var19, var25);
    com.google.javascript.rhino.jstype.JSType var29 = var16.createNullableType((com.google.javascript.rhino.jstype.JSType)var28);
    java.lang.String var30 = var29.toAnnotationString();
    boolean var31 = var11.isSubtype(var29);
    java.lang.Iterable var32 = var11.getCtorImplementedInterfaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
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
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "(function (): ?|null)"+ "'", var30.equals("(function (): ?|null)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test11"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.jscomp.AbstractCompiler var3 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var4 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var5 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var7 = var5.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var8 = var4.getDirectedPredNodes(var7);
    com.google.javascript.jscomp.NodeTraversal.Callback var9 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var3, var8, var9);
    com.google.javascript.rhino.jstype.FunctionType var11 = var1.createFunctionType(var2, var8);
    boolean var13 = var1.isForwardDeclaredType("ERROR");
    com.google.javascript.rhino.JSDocInfo var14 = null;
    com.google.javascript.rhino.jstype.ObjectType var15 = var1.createAnonymousObjectType(var14);
    com.google.javascript.jscomp.CodingConvention var17 = com.google.javascript.jscomp.CodingConventions.getDefault();
    com.google.javascript.jscomp.GoogleCodingConvention var18 = new com.google.javascript.jscomp.GoogleCodingConvention(var17);
    com.google.javascript.rhino.Node var22 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var23 = var22.getDirectives();
    var22.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.exprResult(var22);
    com.google.javascript.jscomp.CodingConvention.Bind var28 = var18.describeFunctionBind(var22);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var29 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var30 = var29.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var31 = new com.google.javascript.jscomp.ComposeWarningsGuard(var30);
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.script(var30);
    boolean var33 = var18.isPrototypeAlias(var32);
    com.google.javascript.rhino.ErrorReporter var34 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var34);
    com.google.javascript.rhino.jstype.JSType var36 = null;
    com.google.javascript.jscomp.AbstractCompiler var37 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var38 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var39 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var41 = var39.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var42 = var38.getDirectedPredNodes(var41);
    com.google.javascript.jscomp.NodeTraversal.Callback var43 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var37, var42, var43);
    com.google.javascript.rhino.jstype.FunctionType var45 = var35.createFunctionType(var36, var42);
    com.google.javascript.rhino.ErrorReporter var47 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var47);
    com.google.javascript.rhino.jstype.JSType var49 = null;
    com.google.javascript.jscomp.AbstractCompiler var50 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var51 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var52 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var54 = var52.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var55 = var51.getDirectedPredNodes(var54);
    com.google.javascript.jscomp.NodeTraversal.Callback var56 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var50, var55, var56);
    com.google.javascript.rhino.jstype.FunctionType var58 = var48.createFunctionType(var49, var55);
    com.google.javascript.rhino.Node var59 = null;
    boolean var60 = var45.defineInferredProperty("", (com.google.javascript.rhino.jstype.JSType)var58, var59);
    boolean var61 = var45.isReturnTypeInferred();
    com.google.javascript.rhino.jstype.ObjectType var62 = var1.createObjectType("(function (): ?|null)", var32, (com.google.javascript.rhino.jstype.ObjectType)var45);
    com.google.javascript.rhino.ErrorReporter var63 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var63);
    com.google.javascript.rhino.jstype.JSType var65 = null;
    com.google.javascript.jscomp.AbstractCompiler var66 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var67 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var68 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var70 = var68.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var71 = var67.getDirectedPredNodes(var70);
    com.google.javascript.jscomp.NodeTraversal.Callback var72 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var66, var71, var72);
    com.google.javascript.rhino.jstype.FunctionType var74 = var64.createFunctionType(var65, var71);
    java.lang.Iterable var75 = var74.getImplementedInterfaces();
    boolean var76 = var74.isStruct();
    java.lang.String var77 = var74.getDisplayName();
    com.google.javascript.rhino.ErrorReporter var78 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var79 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var78);
    com.google.javascript.rhino.ErrorReporter var80 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var81 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var80);
    com.google.javascript.rhino.jstype.JSType var82 = null;
    com.google.javascript.jscomp.AbstractCompiler var83 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var84 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var85 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var87 = var85.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var88 = var84.getDirectedPredNodes(var87);
    com.google.javascript.jscomp.NodeTraversal.Callback var89 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var83, var88, var89);
    com.google.javascript.rhino.jstype.FunctionType var91 = var81.createFunctionType(var82, var88);
    com.google.javascript.rhino.jstype.JSType var92 = var79.createNullableType((com.google.javascript.rhino.jstype.JSType)var91);
    java.lang.String var93 = var92.toAnnotationString();
    boolean var94 = var74.isSubtype(var92);
    java.lang.String var95 = var92.getDisplayName();
    com.google.javascript.rhino.jstype.JSType var96 = var1.createOptionalNullableType(var92);
    com.google.javascript.rhino.jstype.JSType var98 = null;
    var1.unregisterPropertyOnType("Object#Element", var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var93 + "' != '" + "(function (): ?|null)"+ "'", var93.equals("(function (): ?|null)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test12"); }


    com.google.javascript.rhino.Node var3 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var4 = var3.getDirectives();
    int var5 = var3.getChangeTime();
    boolean var6 = var3.isAssignAdd();
    java.lang.String var7 = var3.getSourceFileName();
    boolean var8 = var3.isContinue();
    int var9 = var3.getLineno();
    com.google.javascript.rhino.Node var13 = new com.google.javascript.rhino.Node(100, 1, 10);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.returnNode(var13);
    boolean var15 = var3.isEquivalentToShallow(var14);
    com.google.javascript.rhino.Node var19 = new com.google.javascript.rhino.Node(10, 10, 0);
    com.google.javascript.rhino.Node var23 = new com.google.javascript.rhino.Node(10, 10, 0);
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.comma(var19, var23);
    boolean var25 = var23.isDebugger();
    boolean var26 = var23.isNoSideEffectsCall();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var27 = var3.removeChildAfter(var23);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test13"); }


    com.google.javascript.jscomp.AstValidator var0 = new com.google.javascript.jscomp.AstValidator();
    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.empty();
    com.google.javascript.rhino.Node var2 = var1.cloneTree();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.validateScript(var1);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test14() {}
//   public void test14() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test14"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile var1 = new com.google.javascript.jscomp.SourceFile("null(null)");
//     int var3 = var1.getLineOffset(10);
// 
//   }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test15"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var2 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var3 = var2.getEdges();
    com.google.javascript.jscomp.deps.SortedDependencies var4 = new com.google.javascript.jscomp.deps.SortedDependencies(var3);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var5 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var6 = var5.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var7 = new com.google.javascript.jscomp.ComposeWarningsGuard(var6);
    com.google.javascript.jscomp.JSModuleGraph var8 = new com.google.javascript.jscomp.JSModuleGraph(var6);
    java.util.List var9 = var4.getSortedDependenciesOf(var6);
    com.google.javascript.rhino.Node var10 = var1.createParametersWithVarArgs(var9);
    com.google.javascript.rhino.ErrorReporter var11 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11);
    com.google.javascript.rhino.jstype.JSType var13 = null;
    com.google.javascript.rhino.Node var17 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var18 = var17.getDirectives();
    boolean var19 = var17.isThrow();
    boolean var21 = var17.getBooleanProp(1);
    boolean var22 = var17.isQualifiedName();
    com.google.javascript.rhino.jstype.FunctionType var23 = var12.createFunctionType(var13, var17);
    boolean var24 = var23.matchesNumberContext();
    com.google.javascript.rhino.ErrorReporter var25 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25);
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.jscomp.AbstractCompiler var28 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var29 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var30 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var32 = var30.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var33 = var29.getDirectedPredNodes(var32);
    com.google.javascript.jscomp.NodeTraversal.Callback var34 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var28, var33, var34);
    com.google.javascript.rhino.jstype.FunctionType var36 = var26.createFunctionType(var27, var33);
    boolean var38 = var26.isForwardDeclaredType("ERROR");
    com.google.javascript.rhino.JSDocInfo var39 = null;
    com.google.javascript.rhino.jstype.ObjectType var40 = var26.createAnonymousObjectType(var39);
    com.google.javascript.jscomp.CodingConvention var42 = com.google.javascript.jscomp.CodingConventions.getDefault();
    com.google.javascript.jscomp.GoogleCodingConvention var43 = new com.google.javascript.jscomp.GoogleCodingConvention(var42);
    com.google.javascript.rhino.Node var47 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var48 = var47.getDirectives();
    var47.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.IR.exprResult(var47);
    com.google.javascript.jscomp.CodingConvention.Bind var53 = var43.describeFunctionBind(var47);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var54 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var55 = var54.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var56 = new com.google.javascript.jscomp.ComposeWarningsGuard(var55);
    com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.script(var55);
    boolean var58 = var43.isPrototypeAlias(var57);
    com.google.javascript.rhino.ErrorReporter var59 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var59);
    com.google.javascript.rhino.jstype.JSType var61 = null;
    com.google.javascript.jscomp.AbstractCompiler var62 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var63 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var64 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var66 = var64.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var67 = var63.getDirectedPredNodes(var66);
    com.google.javascript.jscomp.NodeTraversal.Callback var68 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var62, var67, var68);
    com.google.javascript.rhino.jstype.FunctionType var70 = var60.createFunctionType(var61, var67);
    com.google.javascript.rhino.ErrorReporter var72 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var72);
    com.google.javascript.rhino.jstype.JSType var74 = null;
    com.google.javascript.jscomp.AbstractCompiler var75 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var76 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var77 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var79 = var77.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var80 = var76.getDirectedPredNodes(var79);
    com.google.javascript.jscomp.NodeTraversal.Callback var81 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var75, var80, var81);
    com.google.javascript.rhino.jstype.FunctionType var83 = var73.createFunctionType(var74, var80);
    com.google.javascript.rhino.Node var84 = null;
    boolean var85 = var70.defineInferredProperty("", (com.google.javascript.rhino.jstype.JSType)var83, var84);
    boolean var86 = var70.isReturnTypeInferred();
    com.google.javascript.rhino.jstype.ObjectType var87 = var26.createObjectType("(function (): ?|null)", var57, (com.google.javascript.rhino.jstype.ObjectType)var70);
    boolean var88 = var1.resetImplicitPrototype((com.google.javascript.rhino.jstype.JSType)var23, var87);
    com.google.javascript.rhino.jstype.ObjectType var89 = var23.getPrototype();
    boolean var90 = var89.matchesInt32Context();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == true);

  }

  public void test16() {}
//   public void test16() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test16"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticGroup[] var1 = null;
//     com.google.javascript.jscomp.DiagnosticGroup var2 = new com.google.javascript.jscomp.DiagnosticGroup("Node tree inequality:\nTree1:\nNOT\n    BITXOR 10\n\n\nTree2:\nPARAM_LIST\n\n\nSubtree1: NOT\n    BITXOR 10\n\n\nSubtree2: PARAM_LIST\n", var1);
// 
//   }

  public void test17() {}
//   public void test17() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test17"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     com.google.javascript.rhino.jstype.JSType var2 = null;
//     com.google.javascript.jscomp.AbstractCompiler var3 = null;
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var4 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var5 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var7 = var5.createDirectedGraphNode((java.lang.Object)(-1));
//     java.util.List var8 = var4.getDirectedPredNodes(var7);
//     com.google.javascript.jscomp.NodeTraversal.Callback var9 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots(var3, var8, var9);
//     com.google.javascript.rhino.jstype.FunctionType var11 = var1.createFunctionType(var2, var8);
//     boolean var13 = var1.isForwardDeclaredType("ERROR");
//     com.google.javascript.rhino.jstype.FunctionBuilder var14 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
//     com.google.javascript.rhino.jstype.JSTypeNative var15 = null;
//     com.google.javascript.rhino.jstype.ObjectType var16 = var1.getNativeObjectType(var15);
// 
//   }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test18"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("(function (): ?|null)");
    com.google.javascript.jscomp.JSModule var3 = new com.google.javascript.jscomp.JSModule("(function (): ?|null)");
    java.io.PrintStream var4 = null;
    com.google.javascript.jscomp.Compiler var5 = new com.google.javascript.jscomp.Compiler(var4);
    var5.reportCodeChange();
    com.google.javascript.jscomp.SourceFile var8 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.lang.String var9 = var8.getOriginalPath();
    com.google.javascript.rhino.Node var10 = var5.parse(var8);
    var3.add(var8);
    java.util.List var12 = var3.getRequires();
    com.google.javascript.jscomp.SourceFile var14 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.lang.String var15 = var14.getOriginalPath();
    int var17 = var14.getColumnOfOffset(10);
    com.google.javascript.jscomp.CompilerInput var19 = new com.google.javascript.jscomp.CompilerInput(var14, false);
    java.io.PrintStream var20 = null;
    com.google.javascript.jscomp.Compiler var21 = new com.google.javascript.jscomp.Compiler(var20);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var22 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var23 = var22.getEdges();
    com.google.javascript.jscomp.NodeTraversal.Callback var24 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var21, var23, var24);
    java.lang.String var26 = var21.getAstDotGraph();
    com.google.javascript.jscomp.CompilerOptions var27 = null;
    com.google.javascript.jscomp.DefaultPassConfig var28 = new com.google.javascript.jscomp.DefaultPassConfig(var27);
    var21.setPassConfig((com.google.javascript.jscomp.PassConfig)var28);
    java.io.PrintStream var30 = null;
    com.google.javascript.jscomp.Compiler var31 = new com.google.javascript.jscomp.Compiler(var30);
    var31.reportCodeChange();
    com.google.javascript.jscomp.SourceFile var34 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.lang.String var35 = var34.getOriginalPath();
    com.google.javascript.rhino.Node var36 = var31.parse(var34);
    var34.setOriginalPath("{ }");
    com.google.javascript.rhino.Node var39 = var21.parse(var34);
    var19.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var21);
    com.google.javascript.jscomp.CompilerInput var41 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var19);
    var3.add(var19);
    var1.remove(var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var44 = var19.getPathRelativeToClosureBase();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test19"); }


    com.google.javascript.jscomp.SourceFile var1 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.lang.String var2 = var1.getOriginalPath();
    int var4 = var1.getColumnOfOffset(10);
    com.google.javascript.jscomp.CompilerInput var6 = new com.google.javascript.jscomp.CompilerInput(var1, false);
    java.io.PrintStream var7 = null;
    com.google.javascript.jscomp.Compiler var8 = new com.google.javascript.jscomp.Compiler(var7);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var9 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var10 = var9.getEdges();
    com.google.javascript.jscomp.NodeTraversal.Callback var11 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var8, var10, var11);
    java.lang.String var13 = var8.getAstDotGraph();
    com.google.javascript.jscomp.CompilerOptions var14 = null;
    com.google.javascript.jscomp.DefaultPassConfig var15 = new com.google.javascript.jscomp.DefaultPassConfig(var14);
    var8.setPassConfig((com.google.javascript.jscomp.PassConfig)var15);
    java.io.PrintStream var17 = null;
    com.google.javascript.jscomp.Compiler var18 = new com.google.javascript.jscomp.Compiler(var17);
    var18.reportCodeChange();
    com.google.javascript.jscomp.SourceFile var21 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.lang.String var22 = var21.getOriginalPath();
    com.google.javascript.rhino.Node var23 = var18.parse(var21);
    var21.setOriginalPath("{ }");
    com.google.javascript.rhino.Node var26 = var8.parse(var21);
    var6.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var8);
    com.google.javascript.rhino.InputId var28 = var6.getInputId();
    var6.removeRequire("");
    com.google.javascript.jscomp.SourceFile var31 = var6.getSourceFile();
    java.util.Collection var32 = var6.getRequires();
    com.google.javascript.jscomp.AbstractCompiler var33 = null;
    var6.setCompiler(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test20"); }


    com.google.javascript.rhino.Node var4 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var5 = var4.getDirectives();
    int var6 = var4.getChangeTime();
    com.google.javascript.rhino.Node var7 = var4.removeFirstChild();
    boolean var8 = var4.isFromExterns();
    boolean var9 = var4.isParamList();
    boolean var10 = var4.isAssignAdd();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var11 = com.google.javascript.rhino.SimpleErrorReporter.getMessage1("goog.exportSymbol", (java.lang.Object)var10);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test21"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.jscomp.AbstractCompiler var3 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var4 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var5 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var7 = var5.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var8 = var4.getDirectedPredNodes(var7);
    com.google.javascript.jscomp.NodeTraversal.Callback var9 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var3, var8, var9);
    com.google.javascript.rhino.jstype.FunctionType var11 = var1.createFunctionType(var2, var8);
    com.google.javascript.rhino.ErrorReporter var13 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13);
    com.google.javascript.rhino.jstype.JSType var15 = null;
    com.google.javascript.jscomp.AbstractCompiler var16 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var17 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var18 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var20 = var18.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var21 = var17.getDirectedPredNodes(var20);
    com.google.javascript.jscomp.NodeTraversal.Callback var22 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var16, var21, var22);
    com.google.javascript.rhino.jstype.FunctionType var24 = var14.createFunctionType(var15, var21);
    com.google.javascript.rhino.Node var25 = null;
    boolean var26 = var11.defineInferredProperty("", (com.google.javascript.rhino.jstype.JSType)var24, var25);
    com.google.javascript.rhino.jstype.FunctionType var27 = var24.toMaybeFunctionType();
    boolean var28 = var24.hasCachedValues();
    var24.setStruct();
    boolean var30 = var24.isAllType();
    var24.setDict();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test22"); }


    com.google.javascript.rhino.Node var3 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var4 = var3.getDirectives();
    boolean var5 = var3.isThrow();
    boolean var7 = var3.getBooleanProp(1);
    boolean var8 = var3.isQualifiedName();
    var3.putProp(10, (java.lang.Object)(short)0);
    boolean var12 = var3.isInstanceOf();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test23"); }


    com.google.javascript.rhino.Node var3 = new com.google.javascript.rhino.Node(10, 10, 0);
    com.google.javascript.rhino.Node var7 = new com.google.javascript.rhino.Node(10, 10, 0);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.comma(var3, var7);
    boolean var9 = var7.isUnscopedQualifiedName();
    com.google.javascript.rhino.Node var13 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var14 = var13.getDirectives();
    int var15 = var13.getChangeTime();
    boolean var16 = var13.isAssignAdd();
    com.google.javascript.rhino.Node var17 = var7.clonePropsFrom(var13);
    com.google.javascript.jscomp.CodingConvention var18 = com.google.javascript.jscomp.CodingConventions.getDefault();
    com.google.javascript.jscomp.GoogleCodingConvention var19 = new com.google.javascript.jscomp.GoogleCodingConvention(var18);
    com.google.javascript.rhino.Node var23 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var24 = var23.getDirectives();
    var23.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.exprResult(var23);
    com.google.javascript.jscomp.CodingConvention.Bind var29 = var19.describeFunctionBind(var23);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var30 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var31 = var30.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var32 = new com.google.javascript.jscomp.ComposeWarningsGuard(var31);
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.script(var31);
    boolean var34 = var19.isPrototypeAlias(var33);
    com.google.javascript.rhino.ErrorReporter var35 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var35);
    com.google.javascript.rhino.jstype.JSType var37 = null;
    com.google.javascript.rhino.Node var41 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var42 = var41.getDirectives();
    boolean var43 = var41.isThrow();
    boolean var45 = var41.getBooleanProp(1);
    boolean var46 = var41.isQualifiedName();
    com.google.javascript.rhino.jstype.FunctionType var47 = var36.createFunctionType(var37, var41);
    java.lang.Iterable var49 = var36.getTypesWithProperty("ERROR");
    java.lang.Iterable var51 = var36.getEachReferenceTypeWithProperty("ERROR");
    com.google.javascript.rhino.ErrorReporter var52 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var52);
    com.google.javascript.rhino.jstype.JSType var54 = null;
    com.google.javascript.jscomp.AbstractCompiler var55 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var56 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var57 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var59 = var57.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var60 = var56.getDirectedPredNodes(var59);
    com.google.javascript.jscomp.NodeTraversal.Callback var61 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var55, var60, var61);
    com.google.javascript.rhino.jstype.FunctionType var63 = var53.createFunctionType(var54, var60);
    java.lang.Iterable var64 = var63.getImplementedInterfaces();
    boolean var65 = var63.isStruct();
    java.lang.String var66 = var63.getDisplayName();
    com.google.javascript.jscomp.AbstractCompiler var67 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var68 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var69 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var71 = var69.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var72 = var68.getDirectedPredNodes(var71);
    com.google.javascript.jscomp.NodeTraversal.Callback var73 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var67, var72, var73);
    java.util.Map var75 = null;
    var19.defineDelegateProxyPrototypeProperties(var36, (com.google.javascript.rhino.jstype.StaticScope)var63, var72, var75);
    com.google.javascript.rhino.Node var80 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var81 = var80.getDirectives();
    int var82 = var80.getChangeTime();
    com.google.javascript.rhino.Node var83 = var80.removeFirstChild();
    java.util.List var84 = var19.identifyTypeDeclarationCall(var80);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var85 = com.google.javascript.rhino.IR.tryFinally(var7, var80);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var84);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test24"); }


    com.google.javascript.rhino.Node var3 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var4 = var3.getDirectives();
    var3.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.not(var3);
    com.google.javascript.rhino.jstype.StaticSourceFile var9 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var8);
    com.google.javascript.rhino.Node var13 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var14 = var13.getDirectives();
    int var15 = var13.getChangeTime();
    boolean var16 = var13.isWith();
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.add(var8, var13);
    com.google.javascript.rhino.Node var21 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var22 = var21.getDirectives();
    var21.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.exprResult(var21);
    java.lang.Iterable var27 = var26.siblings();
    com.google.javascript.rhino.Node var28 = var13.useSourceInfoIfMissingFrom(var26);
    com.google.javascript.rhino.Node var32 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var33 = var32.getDirectives();
    int var34 = var32.getChangeTime();
    boolean var35 = var32.isAssignAdd();
    java.lang.String var36 = var32.getSourceFileName();
    boolean var37 = var32.isCast();
    boolean var38 = var32.isBreak();
    com.google.javascript.rhino.Node var42 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var43 = var42.getDirectives();
    var42.putIntProp((-1), 0);
    var42.setVarArgs(false);
    com.google.javascript.rhino.jstype.StaticSourceFile var49 = var42.getStaticSourceFile();
    boolean var50 = var42.isLocalResultCall();
    boolean var51 = var42.isCall();
    java.util.Map var52 = com.google.javascript.jscomp.NodeUtil.mapMainToClone(var32, var42);
    boolean var53 = var42.isIf();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var54 = com.google.javascript.rhino.IR.regexp(var28, var42);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test25"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.jscomp.AbstractCompiler var3 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var4 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var5 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var7 = var5.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var8 = var4.getDirectedPredNodes(var7);
    com.google.javascript.jscomp.NodeTraversal.Callback var9 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var3, var8, var9);
    com.google.javascript.rhino.jstype.FunctionType var11 = var1.createFunctionType(var2, var8);
    boolean var13 = var1.isForwardDeclaredType("ERROR");
    var1.resetForTypeCheck();
    com.google.javascript.rhino.jstype.FunctionBuilder var15 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
    com.google.javascript.rhino.jstype.FunctionBuilder var17 = var15.withName("hi!: ERROR");
    com.google.javascript.rhino.ErrorReporter var18 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18);
    com.google.javascript.rhino.ErrorReporter var20 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var20);
    com.google.javascript.rhino.jstype.JSType var22 = null;
    com.google.javascript.jscomp.AbstractCompiler var23 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var24 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var25 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var27 = var25.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var28 = var24.getDirectedPredNodes(var27);
    com.google.javascript.jscomp.NodeTraversal.Callback var29 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var23, var28, var29);
    com.google.javascript.rhino.jstype.FunctionType var31 = var21.createFunctionType(var22, var28);
    com.google.javascript.rhino.jstype.JSType var32 = var19.createNullableType((com.google.javascript.rhino.jstype.JSType)var31);
    com.google.javascript.rhino.ErrorReporter var33 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33);
    com.google.javascript.rhino.jstype.JSType var35 = null;
    com.google.javascript.jscomp.AbstractCompiler var36 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var37 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var38 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var40 = var38.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var41 = var37.getDirectedPredNodes(var40);
    com.google.javascript.jscomp.NodeTraversal.Callback var42 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var36, var41, var42);
    com.google.javascript.rhino.jstype.FunctionType var44 = var34.createFunctionType(var35, var41);
    java.lang.Iterable var45 = var44.getImplementedInterfaces();
    com.google.javascript.rhino.ErrorReporter var46 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var46);
    com.google.javascript.rhino.jstype.JSType var48 = null;
    com.google.javascript.jscomp.AbstractCompiler var49 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var50 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var51 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var53 = var51.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var54 = var50.getDirectedPredNodes(var53);
    com.google.javascript.jscomp.NodeTraversal.Callback var55 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var49, var54, var55);
    com.google.javascript.rhino.jstype.FunctionType var57 = var47.createFunctionType(var48, var54);
    com.google.javascript.rhino.ErrorReporter var59 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var59);
    com.google.javascript.rhino.jstype.JSType var61 = null;
    com.google.javascript.jscomp.AbstractCompiler var62 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var63 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var64 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var66 = var64.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var67 = var63.getDirectedPredNodes(var66);
    com.google.javascript.jscomp.NodeTraversal.Callback var68 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var62, var67, var68);
    com.google.javascript.rhino.jstype.FunctionType var70 = var60.createFunctionType(var61, var67);
    com.google.javascript.rhino.Node var71 = null;
    boolean var72 = var57.defineInferredProperty("", (com.google.javascript.rhino.jstype.JSType)var70, var71);
    boolean var73 = var44.isInvariant((com.google.javascript.rhino.jstype.JSType)var57);
    boolean var74 = var57.isGlobalThisType();
    boolean var75 = var57.isNumberValueType();
    var57.clearCachedValues();
    com.google.javascript.rhino.jstype.JSType.TypePair var77 = var32.getTypesUnderEquality((com.google.javascript.rhino.jstype.JSType)var57);
    com.google.javascript.rhino.jstype.FunctionBuilder var78 = var15.withInferredReturnType((com.google.javascript.rhino.jstype.JSType)var57);
    com.google.javascript.rhino.jstype.FunctionBuilder var80 = var15.withName("function (): ?");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test26"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    var0.pushEdgeAnnotations();
    java.util.List var2 = var0.getGraphvizEdges();
    var0.clearNodeAnnotations();
    java.util.List var4 = var0.getGraphvizNodes();
    var0.clearEdgeAnnotations();
    java.io.PrintStream var6 = null;
    com.google.javascript.jscomp.Compiler var7 = new com.google.javascript.jscomp.Compiler(var6);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var8 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var9 = var8.getEdges();
    com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var7, var9, var10);
    java.lang.String var12 = var7.getAstDotGraph();
    com.google.javascript.jscomp.CompilerOptions var13 = null;
    com.google.javascript.jscomp.DefaultPassConfig var14 = new com.google.javascript.jscomp.DefaultPassConfig(var13);
    var7.setPassConfig((com.google.javascript.jscomp.PassConfig)var14);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var16 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var17 = var16.getEdges();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var18 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var19 = var18.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var20 = new com.google.javascript.jscomp.ComposeWarningsGuard(var19);
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.script(var19);
    com.google.javascript.jscomp.CompilerOptions var22 = new com.google.javascript.jscomp.CompilerOptions();
    var22.setPropertyAffinity(false);
    com.google.javascript.jscomp.CheckLevel var25 = null;
    var22.setBrokenClosureRequiresLevel(var25);
    var7.<com.google.javascript.jscomp.SourceFile>initModules(var17, var19, var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var28 = var0.getInEdges((java.lang.Object)var19);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test27"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var2 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var3 = var2.getEdges();
    com.google.javascript.jscomp.NodeTraversal.Callback var4 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var3, var4);
    java.lang.String var6 = var1.getAstDotGraph();
    com.google.javascript.jscomp.CompilerOptions var7 = null;
    com.google.javascript.jscomp.DefaultPassConfig var8 = new com.google.javascript.jscomp.DefaultPassConfig(var7);
    var1.setPassConfig((com.google.javascript.jscomp.PassConfig)var8);
    java.io.PrintStream var10 = null;
    com.google.javascript.jscomp.Compiler var11 = new com.google.javascript.jscomp.Compiler(var10);
    var11.reportCodeChange();
    com.google.javascript.jscomp.SourceFile var14 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.lang.String var15 = var14.getOriginalPath();
    com.google.javascript.rhino.Node var16 = var11.parse(var14);
    var14.setOriginalPath("{ }");
    com.google.javascript.rhino.Node var19 = var1.parse(var14);
    int var20 = var1.getErrorCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test28"); }


    com.google.javascript.jscomp.CodingConvention var0 = com.google.javascript.jscomp.CodingConventions.getDefault();
    com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention(var0);
    com.google.javascript.rhino.Node var5 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var6 = var5.getDirectives();
    var5.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.exprResult(var5);
    com.google.javascript.jscomp.CodingConvention.Bind var11 = var1.describeFunctionBind(var5);
    com.google.javascript.rhino.ErrorReporter var12 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var12);
    com.google.javascript.rhino.jstype.JSType var14 = null;
    com.google.javascript.jscomp.AbstractCompiler var15 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var16 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var17 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var19 = var17.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var20 = var16.getDirectedPredNodes(var19);
    com.google.javascript.jscomp.NodeTraversal.Callback var21 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var15, var20, var21);
    com.google.javascript.rhino.jstype.FunctionType var23 = var13.createFunctionType(var14, var20);
    com.google.javascript.rhino.ErrorReporter var25 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25);
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.jscomp.AbstractCompiler var28 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var29 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var30 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var32 = var30.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var33 = var29.getDirectedPredNodes(var32);
    com.google.javascript.jscomp.NodeTraversal.Callback var34 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var28, var33, var34);
    com.google.javascript.rhino.jstype.FunctionType var36 = var26.createFunctionType(var27, var33);
    com.google.javascript.rhino.Node var37 = null;
    boolean var38 = var23.defineInferredProperty("", (com.google.javascript.rhino.jstype.JSType)var36, var37);
    com.google.javascript.rhino.Node var39 = var23.getParametersNode();
    boolean var40 = var39.isThrow();
    boolean var41 = var1.isPrototypeAlias(var39);
    boolean var43 = var1.isConstantKey("");
    boolean var45 = var1.isPrivate("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);

  }

  public void test29() {}
//   public void test29() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test29"); }
// 
// 
//     com.google.javascript.rhino.Node var3 = new com.google.javascript.rhino.Node(100, 1, 10);
//     com.google.javascript.rhino.Node var4 = var3.getLastSibling();
//     boolean var5 = var3.isGetElem();
//     var3.setWasEmptyNode(false);
//     java.lang.Appendable var8 = null;
//     var3.appendStringTree(var8);
// 
//   }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test30"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var2 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var3 = var2.getEdges();
    com.google.javascript.jscomp.NodeTraversal.Callback var4 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var3, var4);
    java.lang.String var6 = var1.getAstDotGraph();
    com.google.javascript.jscomp.CompilerOptions var7 = null;
    com.google.javascript.jscomp.DefaultPassConfig var8 = new com.google.javascript.jscomp.DefaultPassConfig(var7);
    var1.setPassConfig((com.google.javascript.jscomp.PassConfig)var8);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var10 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var11 = var10.getEdges();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var12 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var13 = var12.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var14 = new com.google.javascript.jscomp.ComposeWarningsGuard(var13);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.script(var13);
    com.google.javascript.jscomp.CompilerOptions var16 = new com.google.javascript.jscomp.CompilerOptions();
    var16.setPropertyAffinity(false);
    com.google.javascript.jscomp.CheckLevel var19 = null;
    var16.setBrokenClosureRequiresLevel(var19);
    var1.<com.google.javascript.jscomp.SourceFile>initModules(var11, var13, var16);
    com.google.javascript.jscomp.JSError[] var22 = var1.getMessages();
    com.google.javascript.jscomp.type.ReverseAbstractInterpreter var23 = null;
    com.google.javascript.jscomp.CodingConvention var24 = com.google.javascript.jscomp.CodingConventions.getDefault();
    com.google.javascript.jscomp.GoogleCodingConvention var25 = new com.google.javascript.jscomp.GoogleCodingConvention(var24);
    com.google.javascript.rhino.Node var29 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var30 = var29.getDirectives();
    var29.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.IR.exprResult(var29);
    com.google.javascript.jscomp.CodingConvention.Bind var35 = var25.describeFunctionBind(var29);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var36 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var37 = var36.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var38 = new com.google.javascript.jscomp.ComposeWarningsGuard(var37);
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.script(var37);
    boolean var40 = var25.isPrototypeAlias(var39);
    com.google.javascript.rhino.ErrorReporter var41 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var41);
    com.google.javascript.rhino.jstype.JSType var43 = null;
    com.google.javascript.rhino.Node var47 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var48 = var47.getDirectives();
    boolean var49 = var47.isThrow();
    boolean var51 = var47.getBooleanProp(1);
    boolean var52 = var47.isQualifiedName();
    com.google.javascript.rhino.jstype.FunctionType var53 = var42.createFunctionType(var43, var47);
    java.lang.Iterable var55 = var42.getTypesWithProperty("ERROR");
    java.lang.Iterable var57 = var42.getEachReferenceTypeWithProperty("ERROR");
    com.google.javascript.rhino.ErrorReporter var58 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var58);
    com.google.javascript.rhino.jstype.JSType var60 = null;
    com.google.javascript.jscomp.AbstractCompiler var61 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var62 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var63 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var65 = var63.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var66 = var62.getDirectedPredNodes(var65);
    com.google.javascript.jscomp.NodeTraversal.Callback var67 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var61, var66, var67);
    com.google.javascript.rhino.jstype.FunctionType var69 = var59.createFunctionType(var60, var66);
    java.lang.Iterable var70 = var69.getImplementedInterfaces();
    boolean var71 = var69.isStruct();
    java.lang.String var72 = var69.getDisplayName();
    com.google.javascript.jscomp.AbstractCompiler var73 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var74 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var75 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var77 = var75.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var78 = var74.getDirectedPredNodes(var77);
    com.google.javascript.jscomp.NodeTraversal.Callback var79 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var73, var78, var79);
    java.util.Map var81 = null;
    var25.defineDelegateProxyPrototypeProperties(var42, (com.google.javascript.rhino.jstype.StaticScope)var69, var78, var81);
    com.google.javascript.jscomp.CheckLevel var83 = null;
    com.google.javascript.jscomp.TypeCheck var84 = new com.google.javascript.jscomp.TypeCheck((com.google.javascript.jscomp.AbstractCompiler)var1, var23, var42, var83);
    boolean var86 = var42.isForwardDeclaredType("");
    var42.forwardDeclareType("BITXOR 10");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test31"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var2 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var3 = var2.getEdges();
    com.google.javascript.jscomp.NodeTraversal.Callback var4 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var3, var4);
    java.lang.String var6 = var1.getAstDotGraph();
    com.google.javascript.jscomp.CompilerOptions var7 = null;
    com.google.javascript.jscomp.DefaultPassConfig var8 = new com.google.javascript.jscomp.DefaultPassConfig(var7);
    var1.setPassConfig((com.google.javascript.jscomp.PassConfig)var8);
    java.io.PrintStream var10 = null;
    com.google.javascript.jscomp.Compiler var11 = new com.google.javascript.jscomp.Compiler(var10);
    var11.reportCodeChange();
    com.google.javascript.jscomp.SourceFile var14 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.lang.String var15 = var14.getOriginalPath();
    com.google.javascript.rhino.Node var16 = var11.parse(var14);
    var14.setOriginalPath("{ }");
    com.google.javascript.rhino.Node var19 = var1.parse(var14);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var20 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var22 = var20.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var23 = var20.getGraphvizEdges();
    com.google.javascript.jscomp.NodeTraversal.Callback var24 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var23, var24);
    com.google.javascript.jscomp.JSModuleGraph var26 = new com.google.javascript.jscomp.JSModuleGraph(var23);
    var26.coalesceDuplicateFiles();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test32"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf("hi!");
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
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     com.google.javascript.rhino.jstype.JSType var2 = null;
//     com.google.javascript.jscomp.AbstractCompiler var3 = null;
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var4 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var5 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var7 = var5.createDirectedGraphNode((java.lang.Object)(-1));
//     java.util.List var8 = var4.getDirectedPredNodes(var7);
//     com.google.javascript.jscomp.NodeTraversal.Callback var9 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots(var3, var8, var9);
//     com.google.javascript.rhino.jstype.FunctionType var11 = var1.createFunctionType(var2, var8);
//     com.google.javascript.rhino.ErrorReporter var13 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13);
//     com.google.javascript.rhino.jstype.JSType var15 = null;
//     com.google.javascript.jscomp.AbstractCompiler var16 = null;
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var17 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var18 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var20 = var18.createDirectedGraphNode((java.lang.Object)(-1));
//     java.util.List var21 = var17.getDirectedPredNodes(var20);
//     com.google.javascript.jscomp.NodeTraversal.Callback var22 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots(var16, var21, var22);
//     com.google.javascript.rhino.jstype.FunctionType var24 = var14.createFunctionType(var15, var21);
//     com.google.javascript.rhino.Node var25 = null;
//     boolean var26 = var11.defineInferredProperty("", (com.google.javascript.rhino.jstype.JSType)var24, var25);
//     com.google.javascript.rhino.jstype.FunctionType var27 = var24.toMaybeFunctionType();
//     com.google.javascript.rhino.ErrorReporter var28 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var28);
//     com.google.javascript.rhino.ErrorReporter var30 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var30);
//     com.google.javascript.rhino.jstype.JSType var32 = null;
//     com.google.javascript.jscomp.AbstractCompiler var33 = null;
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var34 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var35 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var37 = var35.createDirectedGraphNode((java.lang.Object)(-1));
//     java.util.List var38 = var34.getDirectedPredNodes(var37);
//     com.google.javascript.jscomp.NodeTraversal.Callback var39 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots(var33, var38, var39);
//     com.google.javascript.rhino.jstype.FunctionType var41 = var31.createFunctionType(var32, var38);
//     com.google.javascript.rhino.jstype.JSType var42 = var29.createNullableType((com.google.javascript.rhino.jstype.JSType)var41);
//     boolean var43 = var24.canTestForShallowEqualityWith(var42);
//     boolean var44 = var24.hasAnyTemplateTypesInternal();
//     com.google.javascript.rhino.ErrorReporter var45 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var45);
//     com.google.javascript.rhino.jstype.JSType var47 = null;
//     com.google.javascript.jscomp.AbstractCompiler var48 = null;
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var49 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var50 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var52 = var50.createDirectedGraphNode((java.lang.Object)(-1));
//     java.util.List var53 = var49.getDirectedPredNodes(var52);
//     com.google.javascript.jscomp.NodeTraversal.Callback var54 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots(var48, var53, var54);
//     com.google.javascript.rhino.jstype.FunctionType var56 = var46.createFunctionType(var47, var53);
//     java.lang.Iterable var57 = var56.getImplementedInterfaces();
//     com.google.javascript.rhino.ErrorReporter var58 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var58);
//     com.google.javascript.rhino.jstype.JSType var60 = null;
//     com.google.javascript.jscomp.AbstractCompiler var61 = null;
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var62 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var63 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var65 = var63.createDirectedGraphNode((java.lang.Object)(-1));
//     java.util.List var66 = var62.getDirectedPredNodes(var65);
//     com.google.javascript.jscomp.NodeTraversal.Callback var67 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots(var61, var66, var67);
//     com.google.javascript.rhino.jstype.FunctionType var69 = var59.createFunctionType(var60, var66);
//     com.google.javascript.rhino.ErrorReporter var71 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var71);
//     com.google.javascript.rhino.jstype.JSType var73 = null;
//     com.google.javascript.jscomp.AbstractCompiler var74 = null;
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var75 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var76 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var78 = var76.createDirectedGraphNode((java.lang.Object)(-1));
//     java.util.List var79 = var75.getDirectedPredNodes(var78);
//     com.google.javascript.jscomp.NodeTraversal.Callback var80 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots(var74, var79, var80);
//     com.google.javascript.rhino.jstype.FunctionType var82 = var72.createFunctionType(var73, var79);
//     com.google.javascript.rhino.Node var83 = null;
//     boolean var84 = var69.defineInferredProperty("", (com.google.javascript.rhino.jstype.JSType)var82, var83);
//     boolean var85 = var56.isInvariant((com.google.javascript.rhino.jstype.JSType)var69);
//     boolean var86 = var69.isGlobalThisType();
//     boolean var87 = var69.isNumberValueType();
//     com.google.javascript.rhino.jstype.FunctionType var88 = var69.toMaybeFunctionType();
//     boolean var89 = var24.isSubtype((com.google.javascript.rhino.jstype.JSType)var88);
//     com.google.javascript.rhino.jstype.JSType var90 = null;
//     boolean var91 = var88.isInvariant(var90);
// 
//   }

  public void test34() {}
//   public void test34() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test34"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile var1 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
//     java.lang.String var2 = var1.getOriginalPath();
//     int var4 = var1.getColumnOfOffset(10);
//     com.google.javascript.jscomp.JsAst var5 = new com.google.javascript.jscomp.JsAst(var1);
//     com.google.javascript.jscomp.CompilerInput var6 = new com.google.javascript.jscomp.CompilerInput(var1);
//     var6.removeRequire("PARAM_LIST");
// 
//   }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test35"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setNameReferenceReportPath("");
    var0.setSyntheticBlockEndMarker("hi!");
    var0.setTightenTypes(true);
    java.util.Set var7 = null;
    var0.setCssRenamingWhitelist(var7);
    var0.setInlineVariables(false);
    com.google.javascript.jscomp.CheckLevel var11 = null;
    var0.setCheckUnreachableCode(var11);
    var0.setDeadAssignmentElimination(true);
    byte[] var15 = new byte[] { };
    var0.setInputVariableMapSerialized(var15);
    var0.setPrintInputDelimiter(true);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var19 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var20 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var22 = var20.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var23 = var19.getDirectedPredNodes(var22);
    var0.setSourceMapLocationMappings(var23);
    com.google.javascript.jscomp.CompilerOptions.TracerMode var25 = null;
    var0.setTracerMode(var25);
    var0.setInferTypes(true);
    var0.setCheckControlStructures(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test36"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setInstrumentMemoryAllocations(false);
    var0.setRemoveUnusedLocalVars(true);
    var0.setInstrumentForCoverage(true);
    com.google.javascript.jscomp.CompilerOptions.LanguageMode var7 = var0.getLanguageIn();
    var0.setCollapseVariableDeclarations(false);
    byte[] var13 = new byte[] { (byte)1, (byte)(-1), (byte)(-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setInputVariableMapSerialized(var13);
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test37"); }


    com.google.javascript.rhino.Node var3 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var4 = var3.getDirectives();
    var3.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.not(var3);
    com.google.javascript.rhino.jstype.StaticSourceFile var9 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var8);
    com.google.javascript.rhino.Node var13 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var14 = var13.getDirectives();
    int var15 = var13.getChangeTime();
    boolean var16 = var13.isWith();
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.add(var8, var13);
    com.google.javascript.rhino.Node var21 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var22 = var21.getDirectives();
    var21.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.exprResult(var21);
    java.lang.Iterable var27 = var26.siblings();
    com.google.javascript.rhino.Node var28 = var13.useSourceInfoIfMissingFrom(var26);
    var28.setLength(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.var(var28);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test38() {}
//   public void test38() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test38"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var2 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.List var3 = var2.getEdges();
//     com.google.javascript.jscomp.ComposeWarningsGuard var4 = new com.google.javascript.jscomp.ComposeWarningsGuard(var3);
//     com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.script(var3);
//     com.google.javascript.jscomp.NodeTraversal.Callback var6 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var3, var6);
//     com.google.javascript.jscomp.SourceFile var9 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
//     java.lang.String var10 = var9.getOriginalPath();
//     int var12 = var9.getColumnOfOffset(10);
//     com.google.javascript.jscomp.JsAst var13 = new com.google.javascript.jscomp.JsAst(var9);
//     java.io.PrintStream var14 = null;
//     com.google.javascript.jscomp.Compiler var15 = new com.google.javascript.jscomp.Compiler(var14);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var16 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.List var17 = var16.getEdges();
//     com.google.javascript.jscomp.NodeTraversal.Callback var18 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var15, var17, var18);
//     java.lang.String var20 = var15.getAstDotGraph();
//     com.google.javascript.jscomp.CompilerOptions var21 = null;
//     com.google.javascript.jscomp.DefaultPassConfig var22 = new com.google.javascript.jscomp.DefaultPassConfig(var21);
//     var15.setPassConfig((com.google.javascript.jscomp.PassConfig)var22);
//     java.io.PrintStream var24 = null;
//     com.google.javascript.jscomp.Compiler var25 = new com.google.javascript.jscomp.Compiler(var24);
//     var25.reportCodeChange();
//     com.google.javascript.jscomp.SourceFile var28 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
//     java.lang.String var29 = var28.getOriginalPath();
//     com.google.javascript.rhino.Node var30 = var25.parse(var28);
//     var28.setOriginalPath("{ }");
//     com.google.javascript.rhino.Node var33 = var15.parse(var28);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var34 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var36 = var34.createDirectedGraphNode((java.lang.Object)(-1));
//     java.util.List var37 = var34.getGraphvizEdges();
//     com.google.javascript.jscomp.NodeTraversal.Callback var38 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var15, var37, var38);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var40 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.List var41 = var40.getEdges();
//     com.google.javascript.jscomp.deps.SortedDependencies var42 = new com.google.javascript.jscomp.deps.SortedDependencies(var41);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var43 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.List var44 = var43.getEdges();
//     com.google.javascript.jscomp.ComposeWarningsGuard var45 = new com.google.javascript.jscomp.ComposeWarningsGuard(var44);
//     com.google.javascript.jscomp.JSModuleGraph var46 = new com.google.javascript.jscomp.JSModuleGraph(var44);
//     java.util.List var47 = var42.getSortedDependenciesOf(var44);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var48 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.List var49 = var48.getEdges();
//     com.google.javascript.jscomp.CompilerOptions var50 = new com.google.javascript.jscomp.CompilerOptions();
//     var50.setNameReferenceReportPath("");
//     var50.setSyntheticBlockEndMarker("hi!");
//     var50.setTightenTypes(true);
//     java.util.Set var57 = null;
//     var50.setCssRenamingWhitelist(var57);
//     var50.setOptimizeArgumentsArray(true);
//     com.google.javascript.jscomp.Result var61 = var15.<com.google.javascript.jscomp.SourceFile>compileModules(var44, var49, var50);
//     com.google.javascript.rhino.Node var62 = var15.getRoot();
//     com.google.javascript.rhino.Node var63 = var13.getAstRoot((com.google.javascript.jscomp.AbstractCompiler)var15);
//     com.google.javascript.jscomp.SourceFile var64 = var13.getSourceFile();
//     var1.replaceScript(var13);
// 
//   }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test39"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error("hi!", "OFF");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test40"); }


    com.google.javascript.jscomp.CodingConvention var0 = com.google.javascript.jscomp.CodingConventions.getDefault();
    com.google.javascript.rhino.Node var5 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var6 = var5.getDirectives();
    var5.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.not(var5);
    com.google.javascript.rhino.jstype.StaticSourceFile var11 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var10);
    com.google.javascript.rhino.JSDocInfo var12 = null;
    com.google.javascript.rhino.Node var13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNodeDeclaration(var0, "ERROR", var10, var12);
    com.google.javascript.rhino.Node var17 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var18 = var17.getDirectives();
    var17.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.not(var17);
    com.google.javascript.rhino.jstype.StaticSourceFile var23 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var22);
    com.google.javascript.rhino.Node var27 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var28 = var27.getDirectives();
    int var29 = var27.getChangeTime();
    boolean var30 = var27.isWith();
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.add(var22, var27);
    com.google.javascript.rhino.Node var35 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var36 = var35.getDirectives();
    var35.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.exprResult(var35);
    java.lang.Iterable var41 = var40.siblings();
    com.google.javascript.rhino.Node var42 = var27.useSourceInfoIfMissingFrom(var40);
    com.google.javascript.rhino.Node var44 = new com.google.javascript.rhino.Node(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.addChildrenAfter(var40, var44);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test41"); }


    com.google.javascript.jscomp.CodingConvention var0 = com.google.javascript.jscomp.CodingConventions.getDefault();
    com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention(var0);
    com.google.javascript.jscomp.ClosureCodingConvention var2 = new com.google.javascript.jscomp.ClosureCodingConvention(var0);
    com.google.javascript.rhino.Node var6 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var7 = var6.getDirectives();
    boolean var8 = var6.isReturn();
    boolean var9 = var2.isPrototypeAlias(var6);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.Node.newString("hi!", 10, 0);
    java.lang.Object var15 = var13.getProp(1);
    var13.addSuppression("");
    com.google.javascript.rhino.Node var21 = new com.google.javascript.rhino.Node(10, 10, 0);
    com.google.javascript.rhino.Node var25 = new com.google.javascript.rhino.Node(10, 10, 0);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.comma(var21, var25);
    boolean var27 = var25.isDebugger();
    var25.setVarArgs(true);
    com.google.javascript.rhino.Node var33 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var34 = var33.getDirectives();
    int var35 = var33.getChangeTime();
    boolean var36 = var33.isAssignAdd();
    java.lang.String var37 = var33.getSourceFileName();
    int var38 = var33.getSourceOffset();
    com.google.javascript.rhino.Node var39 = var25.srcrefTree(var33);
    com.google.javascript.rhino.Node var40 = var13.useSourceInfoIfMissingFromForTree(var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast var41 = var2.getObjectLiteralCast(var40);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test42"); }


    com.google.javascript.jscomp.CodingConvention var0 = com.google.javascript.jscomp.CodingConventions.getDefault();
    com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention(var0);
    com.google.javascript.rhino.Node var5 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var6 = var5.getDirectives();
    var5.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.exprResult(var5);
    com.google.javascript.jscomp.CodingConvention.Bind var11 = var1.describeFunctionBind(var5);
    boolean var13 = var1.isConstantKey("");
    com.google.javascript.rhino.Node var15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode((com.google.javascript.jscomp.CodingConvention)var1, "(window)");
    com.google.javascript.jscomp.CodingConvention var17 = com.google.javascript.jscomp.CodingConventions.getDefault();
    com.google.javascript.jscomp.GoogleCodingConvention var18 = new com.google.javascript.jscomp.GoogleCodingConvention(var17);
    com.google.javascript.rhino.Node var22 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var23 = var22.getDirectives();
    var22.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.exprResult(var22);
    com.google.javascript.jscomp.CodingConvention.Bind var28 = var18.describeFunctionBind(var22);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var29 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var30 = var29.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var31 = new com.google.javascript.jscomp.ComposeWarningsGuard(var30);
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.script(var30);
    boolean var33 = var18.isPrototypeAlias(var32);
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.Node.newString("hi!", 10, 0);
    boolean var38 = var18.isVarArgsParameter(var37);
    var15.putProp(100, (java.lang.Object)var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test43"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.jscomp.AbstractCompiler var3 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var4 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var5 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var7 = var5.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var8 = var4.getDirectedPredNodes(var7);
    com.google.javascript.jscomp.NodeTraversal.Callback var9 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var3, var8, var9);
    com.google.javascript.rhino.jstype.FunctionType var11 = var1.createFunctionType(var2, var8);
    java.lang.Iterable var12 = var11.getImplementedInterfaces();
    com.google.javascript.rhino.ErrorReporter var13 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13);
    com.google.javascript.rhino.jstype.JSType var15 = null;
    com.google.javascript.jscomp.AbstractCompiler var16 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var17 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var18 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var20 = var18.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var21 = var17.getDirectedPredNodes(var20);
    com.google.javascript.jscomp.NodeTraversal.Callback var22 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var16, var21, var22);
    com.google.javascript.rhino.jstype.FunctionType var24 = var14.createFunctionType(var15, var21);
    com.google.javascript.rhino.ErrorReporter var26 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var26);
    com.google.javascript.rhino.jstype.JSType var28 = null;
    com.google.javascript.jscomp.AbstractCompiler var29 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var30 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var31 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var33 = var31.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var34 = var30.getDirectedPredNodes(var33);
    com.google.javascript.jscomp.NodeTraversal.Callback var35 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var29, var34, var35);
    com.google.javascript.rhino.jstype.FunctionType var37 = var27.createFunctionType(var28, var34);
    com.google.javascript.rhino.Node var38 = null;
    boolean var39 = var24.defineInferredProperty("", (com.google.javascript.rhino.jstype.JSType)var37, var38);
    boolean var40 = var11.isInvariant((com.google.javascript.rhino.jstype.JSType)var24);
    boolean var41 = var11.hasDisplayName();
    java.lang.Iterable var42 = var11.getImplementedInterfaces();
    boolean var43 = var11.isOrdinaryFunction();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);

  }

  public void test44() {}
//   public void test44() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test44"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     var0.setNameReferenceReportPath("");
//     var0.setSyntheticBlockEndMarker("hi!");
//     var0.setProtectHiddenSideEffects(false);
//     com.google.javascript.jscomp.CompilerOptions.TweakProcessing var7 = var0.getTweakProcessing();
//     var0.setInferTypes(false);
//     com.google.javascript.jscomp.CompilerOptions.Reach var10 = null;
//     var0.setInlineFunctions(var10);
// 
//   }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test45"); }


    com.google.javascript.rhino.jstype.JSTypeRegistry var0 = null;
    com.google.javascript.rhino.jstype.TemplateTypeMap var1 = null;
    com.google.javascript.rhino.jstype.TemplateTypeMapReplacer var2 = new com.google.javascript.rhino.jstype.TemplateTypeMapReplacer(var0, var1);
    com.google.javascript.rhino.jstype.EnumElementType var3 = null;
    com.google.javascript.rhino.jstype.JSType var4 = var2.caseEnumElementType(var3);
    com.google.javascript.jscomp.CodingConvention var5 = com.google.javascript.jscomp.CodingConventions.getDefault();
    com.google.javascript.jscomp.GoogleCodingConvention var6 = new com.google.javascript.jscomp.GoogleCodingConvention(var5);
    com.google.javascript.rhino.Node var10 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var11 = var10.getDirectives();
    var10.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.exprResult(var10);
    com.google.javascript.jscomp.CodingConvention.Bind var16 = var6.describeFunctionBind(var10);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var17 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var18 = var17.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var19 = new com.google.javascript.jscomp.ComposeWarningsGuard(var18);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.script(var18);
    boolean var21 = var6.isPrototypeAlias(var20);
    com.google.javascript.rhino.ErrorReporter var22 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var22);
    com.google.javascript.rhino.jstype.JSType var24 = null;
    com.google.javascript.rhino.Node var28 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var29 = var28.getDirectives();
    boolean var30 = var28.isThrow();
    boolean var32 = var28.getBooleanProp(1);
    boolean var33 = var28.isQualifiedName();
    com.google.javascript.rhino.jstype.FunctionType var34 = var23.createFunctionType(var24, var28);
    java.lang.Iterable var36 = var23.getTypesWithProperty("ERROR");
    java.lang.Iterable var38 = var23.getEachReferenceTypeWithProperty("ERROR");
    com.google.javascript.rhino.ErrorReporter var39 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var39);
    com.google.javascript.rhino.jstype.JSType var41 = null;
    com.google.javascript.jscomp.AbstractCompiler var42 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var43 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var44 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var46 = var44.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var47 = var43.getDirectedPredNodes(var46);
    com.google.javascript.jscomp.NodeTraversal.Callback var48 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var42, var47, var48);
    com.google.javascript.rhino.jstype.FunctionType var50 = var40.createFunctionType(var41, var47);
    java.lang.Iterable var51 = var50.getImplementedInterfaces();
    boolean var52 = var50.isStruct();
    java.lang.String var53 = var50.getDisplayName();
    com.google.javascript.jscomp.AbstractCompiler var54 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var55 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var56 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var58 = var56.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var59 = var55.getDirectedPredNodes(var58);
    com.google.javascript.jscomp.NodeTraversal.Callback var60 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var54, var59, var60);
    java.util.Map var62 = null;
    var6.defineDelegateProxyPrototypeProperties(var23, (com.google.javascript.rhino.jstype.StaticScope)var50, var59, var62);
    com.google.javascript.rhino.jstype.ObjectType var64 = var50.toObjectType();
    com.google.javascript.rhino.JSDocInfo var65 = var50.getJSDocInfo();
    com.google.javascript.rhino.jstype.JSType var66 = var2.caseObjectType((com.google.javascript.rhino.jstype.ObjectType)var50);
    com.google.javascript.rhino.jstype.ObjectType var67 = var50.dereference();
    com.google.javascript.rhino.jstype.ObjectType var68 = var67.dereference();
    com.google.javascript.rhino.jstype.Property var70 = var67.getOwnSlot("");
    boolean var71 = var67.isAllType();
    com.google.javascript.rhino.ErrorReporter var72 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var72);
    com.google.javascript.rhino.ErrorReporter var74 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var74);
    com.google.javascript.rhino.jstype.JSType var76 = null;
    com.google.javascript.jscomp.AbstractCompiler var77 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var78 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var79 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var81 = var79.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var82 = var78.getDirectedPredNodes(var81);
    com.google.javascript.jscomp.NodeTraversal.Callback var83 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var77, var82, var83);
    com.google.javascript.rhino.jstype.FunctionType var85 = var75.createFunctionType(var76, var82);
    com.google.javascript.rhino.jstype.JSType var86 = var73.createNullableType((com.google.javascript.rhino.jstype.JSType)var85);
    boolean var87 = var85.isObject();
    com.google.javascript.rhino.jstype.TemplateType var88 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType((com.google.javascript.rhino.jstype.JSType)var85);
    boolean var89 = var85.isConstructor();
    boolean var90 = var67.isEquivalentTo((com.google.javascript.rhino.jstype.JSType)var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test46"); }


    com.google.javascript.jscomp.CompilerOptions var1 = new com.google.javascript.jscomp.CompilerOptions();
    var1.setNameReferenceReportPath("");
    var1.setSyntheticBlockEndMarker("hi!");
    var1.setTightenTypes(true);
    java.util.Set var8 = null;
    var1.setCssRenamingWhitelist(var8);
    var1.setInlineVariables(false);
    var1.setCollapseVariableDeclarations(true);
    com.google.javascript.jscomp.SourceMap.Format var14 = null;
    var1.setSourceMapFormat(var14);
    boolean var16 = var1.getInstrumentMemoryAllocations();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var17 = com.google.javascript.rhino.SimpleErrorReporter.getMessage1("Object#Element", (java.lang.Object)var1);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test47() {}
//   public void test47() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test47"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
//     com.google.javascript.jscomp.CompilerOptions var1 = new com.google.javascript.jscomp.CompilerOptions();
//     var1.setNameReferenceReportPath("");
//     var1.setSyntheticBlockEndMarker("hi!");
//     var1.setTightenTypes(true);
//     java.util.Set var8 = null;
//     var1.setCssRenamingWhitelist(var8);
//     var1.setCollapseProperties(false);
//     var1.setRecordFunctionInformation(false);
//     java.util.Iterator var14 = var0.getNeighborNodesIterator((java.lang.Object)var1);
// 
//   }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test48"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setNameReferenceReportPath("");
    var0.setSyntheticBlockEndMarker("hi!");
    var0.setTightenTypes(true);
    java.util.Set var7 = null;
    var0.setCssRenamingWhitelist(var7);
    var0.setInlineVariables(false);
    var0.setCollapseVariableDeclarations(true);
    com.google.javascript.jscomp.CheckLevel var13 = null;
    var0.setCheckGlobalThisLevel(var13);
    var0.setSpecializeInitialModule(true);
    var0.setSyntheticBlockStartMarker("");

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test49"); }


    java.lang.String var1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("LABEL_NAME hi!\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "(LABEL_NAME hi!\n)"+ "'", var1.equals("(LABEL_NAME hi!\n)"));

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test50"); }


    com.google.javascript.rhino.Node var3 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var4 = var3.getDirectives();
    int var5 = var3.getChangeTime();
    boolean var6 = var3.isAssignAdd();
    java.lang.String var7 = var3.getSourceFileName();
    java.lang.Iterable var8 = var3.children();
    boolean var9 = var3.isSyntheticBlock();
    boolean var10 = var3.isDefaultCase();
    com.google.javascript.rhino.Node var14 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var15 = var14.getDirectives();
    boolean var16 = var14.isThrow();
    boolean var18 = var14.getBooleanProp(1);
    boolean var19 = var14.isCast();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.assign(var3, var14);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test51() {}
//   public void test51() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test51"); }
// 
// 
//     com.google.javascript.jscomp.CodingConvention var0 = com.google.javascript.jscomp.CodingConventions.getDefault();
//     com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention(var0);
//     com.google.javascript.jscomp.ClosureCodingConvention var2 = new com.google.javascript.jscomp.ClosureCodingConvention(var0);
//     com.google.javascript.rhino.ErrorReporter var3 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var3);
//     com.google.javascript.rhino.jstype.JSType var5 = null;
//     com.google.javascript.rhino.Node var9 = new com.google.javascript.rhino.Node(10, 10, 0);
//     java.util.Set var10 = var9.getDirectives();
//     boolean var11 = var9.isThrow();
//     boolean var13 = var9.getBooleanProp(1);
//     boolean var14 = var9.isQualifiedName();
//     com.google.javascript.rhino.jstype.FunctionType var15 = var4.createFunctionType(var5, var9);
//     com.google.javascript.rhino.ErrorReporter var16 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var16);
//     com.google.javascript.rhino.jstype.JSType var18 = null;
//     com.google.javascript.jscomp.AbstractCompiler var19 = null;
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var20 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var21 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var23 = var21.createDirectedGraphNode((java.lang.Object)(-1));
//     java.util.List var24 = var20.getDirectedPredNodes(var23);
//     com.google.javascript.jscomp.NodeTraversal.Callback var25 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots(var19, var24, var25);
//     com.google.javascript.rhino.jstype.FunctionType var27 = var17.createFunctionType(var18, var24);
//     com.google.javascript.rhino.ErrorReporter var29 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29);
//     com.google.javascript.rhino.jstype.JSType var31 = null;
//     com.google.javascript.jscomp.AbstractCompiler var32 = null;
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var33 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var34 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var36 = var34.createDirectedGraphNode((java.lang.Object)(-1));
//     java.util.List var37 = var33.getDirectedPredNodes(var36);
//     com.google.javascript.jscomp.NodeTraversal.Callback var38 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots(var32, var37, var38);
//     com.google.javascript.rhino.jstype.FunctionType var40 = var30.createFunctionType(var31, var37);
//     com.google.javascript.rhino.Node var41 = null;
//     boolean var42 = var27.defineInferredProperty("", (com.google.javascript.rhino.jstype.JSType)var40, var41);
//     com.google.javascript.rhino.jstype.FunctionType var43 = var40.toMaybeFunctionType();
//     boolean var44 = var40.hasCachedValues();
//     com.google.javascript.rhino.ErrorReporter var45 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var45);
//     com.google.javascript.rhino.ErrorReporter var47 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var47);
//     com.google.javascript.rhino.jstype.JSType var49 = null;
//     com.google.javascript.jscomp.AbstractCompiler var50 = null;
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var51 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var52 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var54 = var52.createDirectedGraphNode((java.lang.Object)(-1));
//     java.util.List var55 = var51.getDirectedPredNodes(var54);
//     com.google.javascript.jscomp.NodeTraversal.Callback var56 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots(var50, var55, var56);
//     com.google.javascript.rhino.jstype.FunctionType var58 = var48.createFunctionType(var49, var55);
//     com.google.javascript.rhino.jstype.JSType var59 = var46.createNullableType((com.google.javascript.rhino.jstype.JSType)var58);
//     boolean var60 = var40.canCastTo(var59);
//     com.google.javascript.jscomp.CodingConvention.SubclassType var61 = null;
//     var2.applySubclassRelationship(var15, var40, var61);
//     boolean var64 = var2.isValidEnumKey("ERROR");
//     boolean var66 = var2.isConstantKey("");
//     com.google.javascript.rhino.Node var70 = new com.google.javascript.rhino.Node(10, 10, 0);
//     java.lang.String var71 = var2.getSingletonGetterClassName(var70);
// 
//   }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test52"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    com.google.javascript.rhino.ErrorReporter var1 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var1);
    com.google.javascript.rhino.ErrorReporter var3 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var3);
    com.google.javascript.rhino.jstype.JSType var5 = null;
    com.google.javascript.jscomp.AbstractCompiler var6 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var7 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var8 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var10 = var8.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var11 = var7.getDirectedPredNodes(var10);
    com.google.javascript.jscomp.NodeTraversal.Callback var12 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var6, var11, var12);
    com.google.javascript.rhino.jstype.FunctionType var14 = var4.createFunctionType(var5, var11);
    com.google.javascript.rhino.jstype.JSType var15 = var2.createNullableType((com.google.javascript.rhino.jstype.JSType)var14);
    com.google.javascript.rhino.ErrorReporter var16 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var16);
    com.google.javascript.rhino.jstype.JSType var18 = null;
    com.google.javascript.rhino.Node var22 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var23 = var22.getDirectives();
    boolean var24 = var22.isThrow();
    boolean var26 = var22.getBooleanProp(1);
    boolean var27 = var22.isQualifiedName();
    com.google.javascript.rhino.jstype.FunctionType var28 = var17.createFunctionType(var18, var22);
    com.google.javascript.rhino.jstype.JSType[] var29 = new com.google.javascript.rhino.jstype.JSType[] { var18};
    com.google.javascript.rhino.Node var30 = var2.createParameters(var29);
    boolean var31 = var30.isAssign();
    com.google.javascript.jscomp.graph.GraphNode var32 = var0.getNode((java.lang.Object)var31);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var33 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var34 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var36 = var34.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var37 = var33.getDirectedPredNodes(var36);
    java.util.List var38 = var0.getDirectedPredNodes(var36);
    com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.Node.newString("hi!", 1, (-1));
    boolean var43 = var42.isInstanceOf();
    com.google.javascript.rhino.Node var47 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var48 = var47.getDirectives();
    boolean var49 = var47.isThrow();
    var47.removeProp(1);
    boolean var52 = var47.isDebugger();
    com.google.javascript.rhino.Node var53 = var42.clonePropsFrom(var47);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var54 = var0.getDirectedPredNodes((java.lang.Object)var47);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test53"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var2 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var3 = var2.getEdges();
    com.google.javascript.jscomp.NodeTraversal.Callback var4 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var3, var4);
    java.lang.String var6 = var1.getAstDotGraph();
    com.google.javascript.jscomp.NodeTraversal.Callback var7 = null;
    com.google.javascript.jscomp.NodeTraversal var8 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var1, var7);
    java.io.PrintStream var9 = null;
    com.google.javascript.jscomp.Compiler var10 = new com.google.javascript.jscomp.Compiler(var9);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var11 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var12 = var11.getEdges();
    com.google.javascript.jscomp.NodeTraversal.Callback var13 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var10, var12, var13);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var15 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var16 = var15.getEdges();
    com.google.javascript.jscomp.deps.SortedDependencies var17 = new com.google.javascript.jscomp.deps.SortedDependencies(var16);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var18 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var19 = var18.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var20 = new com.google.javascript.jscomp.ComposeWarningsGuard(var19);
    com.google.javascript.jscomp.JSModuleGraph var21 = new com.google.javascript.jscomp.JSModuleGraph(var19);
    java.util.List var22 = var17.getSortedDependenciesOf(var19);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var23 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var24 = var23.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var25 = new com.google.javascript.jscomp.ComposeWarningsGuard(var24);
    java.util.List var26 = var17.getSortedDependenciesOf(var24);
    java.io.PrintStream var27 = null;
    com.google.javascript.jscomp.Compiler var28 = new com.google.javascript.jscomp.Compiler(var27);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var29 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var30 = var29.getEdges();
    com.google.javascript.jscomp.NodeTraversal.Callback var31 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var28, var30, var31);
    java.util.List var34 = var17.getDependenciesOf(var30, false);
    com.google.javascript.jscomp.CompilerOptions var35 = new com.google.javascript.jscomp.CompilerOptions();
    var35.setNameReferenceReportPath("");
    var35.setSyntheticBlockEndMarker("hi!");
    var35.setTightenTypes(true);
    com.google.javascript.jscomp.Result var42 = var1.<com.google.javascript.jscomp.SourceFile>compileModules(var12, var34, var35);
    java.lang.String var45 = var1.getSourceLine("BITXOR 10", 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.processDefines();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test54"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setNameReferenceReportPath("");
    var0.setSyntheticBlockEndMarker("hi!");
    var0.setTightenTypes(true);
    java.util.Set var7 = null;
    var0.setCssRenamingWhitelist(var7);
    var0.setCollapseProperties(false);
    var0.setExternExportsPath("LABEL_NAME hi!\n");
    var0.setCheckTypes(true);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test55"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("(function (): ?|null)");
    java.io.PrintStream var2 = null;
    com.google.javascript.jscomp.Compiler var3 = new com.google.javascript.jscomp.Compiler(var2);
    var3.reportCodeChange();
    com.google.javascript.jscomp.SourceFile var6 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.lang.String var7 = var6.getOriginalPath();
    com.google.javascript.rhino.Node var8 = var3.parse(var6);
    var1.add(var6);
    java.util.List var10 = var1.getRequires();
    com.google.javascript.jscomp.SourceFile var12 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.lang.String var13 = var12.getOriginalPath();
    int var15 = var12.getColumnOfOffset(10);
    com.google.javascript.jscomp.CompilerInput var17 = new com.google.javascript.jscomp.CompilerInput(var12, false);
    java.io.PrintStream var18 = null;
    com.google.javascript.jscomp.Compiler var19 = new com.google.javascript.jscomp.Compiler(var18);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var20 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var21 = var20.getEdges();
    com.google.javascript.jscomp.NodeTraversal.Callback var22 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var19, var21, var22);
    java.lang.String var24 = var19.getAstDotGraph();
    com.google.javascript.jscomp.CompilerOptions var25 = null;
    com.google.javascript.jscomp.DefaultPassConfig var26 = new com.google.javascript.jscomp.DefaultPassConfig(var25);
    var19.setPassConfig((com.google.javascript.jscomp.PassConfig)var26);
    java.io.PrintStream var28 = null;
    com.google.javascript.jscomp.Compiler var29 = new com.google.javascript.jscomp.Compiler(var28);
    var29.reportCodeChange();
    com.google.javascript.jscomp.SourceFile var32 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.lang.String var33 = var32.getOriginalPath();
    com.google.javascript.rhino.Node var34 = var29.parse(var32);
    var32.setOriginalPath("{ }");
    com.google.javascript.rhino.Node var37 = var19.parse(var32);
    var17.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var19);
    com.google.javascript.jscomp.CompilerInput var39 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var17);
    var1.add(var17);
    java.lang.String var41 = var17.toString();
    int var42 = var17.getNumLines();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var43 = var17.getPathRelativeToClosureBase();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);

  }

  public void test56() {}
//   public void test56() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test56"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var2 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.List var3 = var2.getEdges();
//     com.google.javascript.jscomp.NodeTraversal.Callback var4 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var3, var4);
//     java.lang.String var6 = var1.getAstDotGraph();
//     com.google.javascript.jscomp.NodeTraversal.Callback var7 = null;
//     com.google.javascript.jscomp.NodeTraversal var8 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var1, var7);
//     com.google.javascript.jscomp.Scope var9 = var1.getTopScope();
//     java.util.List var10 = null;
//     com.google.javascript.jscomp.CompilerOptions var11 = new com.google.javascript.jscomp.CompilerOptions();
//     var11.setNameReferenceReportPath("");
//     var11.setSyntheticBlockEndMarker("hi!");
//     var11.setLooseTypes(false);
//     var11.setUnaliasableGlobals("LABEL_NAME hi!\n");
//     var11.setCrossModuleMethodMotion(false);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var22 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.List var23 = var22.getEdges();
//     com.google.javascript.jscomp.ComposeWarningsGuard var24 = new com.google.javascript.jscomp.ComposeWarningsGuard(var23);
//     com.google.javascript.jscomp.JSModuleGraph var25 = new com.google.javascript.jscomp.JSModuleGraph(var23);
//     var11.setSourceMapLocationMappings(var23);
//     com.google.javascript.jscomp.CompilerOptions var27 = new com.google.javascript.jscomp.CompilerOptions();
//     var27.setNameReferenceReportPath("");
//     var27.setSyntheticBlockEndMarker("hi!");
//     var27.setTightenTypes(true);
//     var27.setSyntheticBlockStartMarker("(function (): ?|null)");
//     var27.setCoalesceVariableNames(true);
//     var1.<com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.SourceFile>init(var10, var23, var27);
// 
//   }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test57"); }


    com.google.javascript.jscomp.CodingConvention var0 = com.google.javascript.jscomp.CodingConventions.getDefault();
    com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention(var0);
    com.google.javascript.rhino.Node var5 = new com.google.javascript.rhino.Node(10, 10, 0);
    com.google.javascript.rhino.Node var9 = new com.google.javascript.rhino.Node(10, 10, 0);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.comma(var5, var9);
    boolean var11 = var9.isUnscopedQualifiedName();
    com.google.javascript.rhino.Node var15 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var16 = var15.getDirectives();
    int var17 = var15.getChangeTime();
    boolean var18 = var15.isAssignAdd();
    com.google.javascript.rhino.Node var19 = var9.clonePropsFrom(var15);
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var20 = var1.getDelegateRelationship(var9);
    boolean var22 = var1.isConstantKey("hi!: ERROR");
    com.google.javascript.rhino.Node var26 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var27 = var26.getDirectives();
    boolean var28 = var26.isThrow();
    boolean var30 = var26.getBooleanProp(1);
    boolean var31 = var26.isQualifiedName();
    com.google.javascript.jscomp.CodingConvention.SubclassRelationship var32 = var1.getClassesDefinedByCall(var26);
    com.google.javascript.rhino.Node var36 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var37 = var36.getDirectives();
    boolean var38 = var36.isThrow();
    boolean var40 = var36.getBooleanProp(1);
    com.google.javascript.rhino.Node var44 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var45 = var44.getDirectives();
    boolean var46 = var44.isThrow();
    boolean var48 = var44.getBooleanProp(1);
    boolean var49 = var44.isQualifiedName();
    var44.putProp(10, (java.lang.Object)(short)0);
    boolean var54 = var44.getBooleanProp(1);
    var36.addChildToBack(var44);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var56 = var1.isOptionalParameter(var36);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test58"); }


    com.google.javascript.jscomp.AbstractCompiler var0 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var1 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var2 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var4 = var2.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var5 = var1.getDirectedPredNodes(var4);
    com.google.javascript.jscomp.NodeTraversal.Callback var6 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var0, var5, var6);
    com.google.javascript.jscomp.JSModuleGraph var8 = new com.google.javascript.jscomp.JSModuleGraph(var5);
    com.google.javascript.jscomp.JSModule var10 = new com.google.javascript.jscomp.JSModule("(function (): ?|null)");
    java.io.PrintStream var11 = null;
    com.google.javascript.jscomp.Compiler var12 = new com.google.javascript.jscomp.Compiler(var11);
    var12.reportCodeChange();
    com.google.javascript.jscomp.SourceFile var15 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.lang.String var16 = var15.getOriginalPath();
    com.google.javascript.rhino.Node var17 = var12.parse(var15);
    var10.add(var15);
    java.util.Set var19 = var10.getAllDependencies();
    com.google.javascript.jscomp.JSModule var21 = new com.google.javascript.jscomp.JSModule("(function (): ?|null)");
    var21.clearAsts();
    com.google.javascript.jscomp.JSModule var23 = var8.getDeepestCommonDependencyInclusive(var10, var21);
    com.google.javascript.jscomp.JSModule var25 = new com.google.javascript.jscomp.JSModule("(function (): ?|null)");
    java.io.PrintStream var26 = null;
    com.google.javascript.jscomp.Compiler var27 = new com.google.javascript.jscomp.Compiler(var26);
    var27.reportCodeChange();
    com.google.javascript.jscomp.SourceFile var30 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.lang.String var31 = var30.getOriginalPath();
    com.google.javascript.rhino.Node var32 = var27.parse(var30);
    var25.add(var30);
    java.util.List var34 = var25.getRequires();
    java.io.PrintStream var35 = null;
    com.google.javascript.jscomp.Compiler var36 = new com.google.javascript.jscomp.Compiler(var35);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var37 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var38 = var37.getEdges();
    com.google.javascript.jscomp.NodeTraversal.Callback var39 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var36, var38, var39);
    var25.sortInputsByDeps(var36);
    var10.sortInputsByDeps(var36);
    java.io.PrintStream var43 = null;
    com.google.javascript.jscomp.Compiler var44 = new com.google.javascript.jscomp.Compiler(var43);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var45 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var46 = var45.getEdges();
    com.google.javascript.jscomp.NodeTraversal.Callback var47 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var44, var46, var47);
    java.lang.String var49 = var44.getAstDotGraph();
    com.google.javascript.jscomp.CompilerOptions var50 = null;
    com.google.javascript.jscomp.DefaultPassConfig var51 = new com.google.javascript.jscomp.DefaultPassConfig(var50);
    var44.setPassConfig((com.google.javascript.jscomp.PassConfig)var51);
    java.io.PrintStream var53 = null;
    com.google.javascript.jscomp.Compiler var54 = new com.google.javascript.jscomp.Compiler(var53);
    var54.reportCodeChange();
    com.google.javascript.jscomp.SourceFile var57 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.lang.String var58 = var57.getOriginalPath();
    com.google.javascript.rhino.Node var59 = var54.parse(var57);
    var57.setOriginalPath("{ }");
    com.google.javascript.rhino.Node var62 = var44.parse(var57);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var63 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var65 = var63.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var66 = var63.getGraphvizEdges();
    com.google.javascript.jscomp.NodeTraversal.Callback var67 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var44, var66, var67);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var69 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var70 = var69.getEdges();
    com.google.javascript.jscomp.deps.SortedDependencies var71 = new com.google.javascript.jscomp.deps.SortedDependencies(var70);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var72 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var73 = var72.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var74 = new com.google.javascript.jscomp.ComposeWarningsGuard(var73);
    com.google.javascript.jscomp.JSModuleGraph var75 = new com.google.javascript.jscomp.JSModuleGraph(var73);
    java.util.List var76 = var71.getSortedDependenciesOf(var73);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var77 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var78 = var77.getEdges();
    com.google.javascript.jscomp.CompilerOptions var79 = new com.google.javascript.jscomp.CompilerOptions();
    var79.setNameReferenceReportPath("");
    var79.setSyntheticBlockEndMarker("hi!");
    var79.setTightenTypes(true);
    java.util.Set var86 = null;
    var79.setCssRenamingWhitelist(var86);
    var79.setOptimizeArgumentsArray(true);
    com.google.javascript.jscomp.Result var90 = var44.<com.google.javascript.jscomp.SourceFile>compileModules(var73, var78, var79);
    boolean var91 = var44.isIdeMode();
    var10.sortInputsByDeps(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + ""+ "'", var49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "hi!"+ "'", var58.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test59"); }


    com.google.javascript.rhino.Node var3 = new com.google.javascript.rhino.Node(10, 10, 0);
    com.google.javascript.rhino.Node var7 = new com.google.javascript.rhino.Node(10, 10, 0);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.comma(var3, var7);
    boolean var9 = var7.isDebugger();
    var7.setSourceEncodedPositionForTree((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.pos(var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test60() {}
//   public void test60() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test60"); }
// 
// 
//     com.google.javascript.jscomp.AbstractCompiler var0 = null;
//     com.google.javascript.jscomp.NodeTraversal.Callback var1 = null;
//     com.google.javascript.jscomp.NodeTraversal var2 = new com.google.javascript.jscomp.NodeTraversal(var0, var1);
//     java.lang.String var3 = var2.getSourceName();
//     com.google.javascript.rhino.Node var4 = var2.getCurrentNode();
//     com.google.javascript.rhino.Node var5 = var2.getEnclosingFunction();
//     java.lang.String var6 = var2.getSourceName();
//     com.google.javascript.jscomp.CodingConvention var7 = com.google.javascript.jscomp.CodingConventions.getDefault();
//     com.google.javascript.jscomp.GoogleCodingConvention var8 = new com.google.javascript.jscomp.GoogleCodingConvention(var7);
//     com.google.javascript.rhino.Node var12 = new com.google.javascript.rhino.Node(10, 10, 0);
//     java.util.Set var13 = var12.getDirectives();
//     var12.putIntProp((-1), 0);
//     com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.exprResult(var12);
//     com.google.javascript.jscomp.CodingConvention.Bind var18 = var8.describeFunctionBind(var12);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var19 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.List var20 = var19.getEdges();
//     com.google.javascript.jscomp.ComposeWarningsGuard var21 = new com.google.javascript.jscomp.ComposeWarningsGuard(var20);
//     com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.script(var20);
//     boolean var23 = var8.isPrototypeAlias(var22);
//     com.google.javascript.rhino.Node var27 = new com.google.javascript.rhino.Node(10, 10, 0);
//     com.google.javascript.rhino.Node var31 = new com.google.javascript.rhino.Node(10, 10, 0);
//     com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.comma(var27, var31);
//     boolean var33 = var31.mayMutateArguments();
//     com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast var34 = var8.getObjectLiteralCast(var31);
//     com.google.javascript.rhino.Node var39 = new com.google.javascript.rhino.Node(10, 10, 0);
//     java.util.Set var40 = var39.getDirectives();
//     int var41 = var39.getChangeTime();
//     boolean var42 = var39.isAssignAdd();
//     java.lang.String var43 = var39.getSourceFileName();
//     java.lang.Iterable var44 = var39.children();
//     boolean var45 = var39.isSyntheticBlock();
//     boolean var46 = var39.isDefaultCase();
//     var39.setType(100);
//     boolean var49 = var39.isNew();
//     com.google.javascript.jscomp.CheckLevel var51 = null;
//     com.google.javascript.jscomp.DiagnosticType var53 = com.google.javascript.jscomp.DiagnosticType.make("", var51, "window");
//     com.google.javascript.rhino.Node var58 = new com.google.javascript.rhino.Node(10, 10, 0);
//     com.google.javascript.rhino.Node var62 = new com.google.javascript.rhino.Node(10, 10, 0);
//     com.google.javascript.rhino.Node var63 = com.google.javascript.rhino.IR.comma(var58, var62);
//     boolean var64 = var63.isNoSideEffectsCall();
//     com.google.javascript.jscomp.DiagnosticType var67 = com.google.javascript.jscomp.DiagnosticType.warning("hi!", "ERROR");
//     java.lang.String[] var69 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var70 = com.google.javascript.jscomp.JSError.make("", var63, var67, var69);
//     com.google.javascript.jscomp.JSError var71 = com.google.javascript.jscomp.JSError.make("goog.exportSymbol", var39, var53, var69);
//     com.google.javascript.jscomp.DiagnosticType var77 = com.google.javascript.jscomp.DiagnosticType.disabled("LABEL_NAME hi!\n", "LABEL_NAME hi!\n");
//     java.lang.String[] var79 = new java.lang.String[] { "Node tree inequality:\nTree1:\nNOT\n    BITXOR 10\n\n\nTree2:\nPARAM_LIST\n\n\nSubtree1: NOT\n    BITXOR 10\n\n\nSubtree2: PARAM_LIST\n"};
//     com.google.javascript.jscomp.JSError var80 = com.google.javascript.jscomp.JSError.make("", 0, 0, var77, var79);
//     var2.report(var31, var53, var79);
// 
//   }

  public void test61() {}
//   public void test61() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test61"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
//     var0.pushEdgeAnnotations();
//     java.util.List var2 = var0.getGraphvizEdges();
//     var0.clearNodeAnnotations();
//     java.util.List var4 = var0.getGraphvizNodes();
//     var0.popNodeAnnotations();
// 
//   }

  public void test62() {}
//   public void test62() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test62"); }
// 
// 
//     com.google.javascript.rhino.jstype.JSTypeRegistry var0 = null;
//     com.google.javascript.rhino.jstype.ModificationVisitor var1 = new com.google.javascript.rhino.jstype.ModificationVisitor(var0);
//     com.google.javascript.rhino.jstype.EnumElementType var2 = null;
//     com.google.javascript.rhino.jstype.JSType var3 = var1.caseEnumElementType(var2);
//     com.google.javascript.rhino.jstype.EnumElementType var4 = null;
//     com.google.javascript.rhino.jstype.JSType var5 = var1.caseEnumElementType(var4);
//     com.google.javascript.rhino.jstype.JSType var6 = var1.caseVoidType();
// 
//   }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test63"); }


    com.google.javascript.jscomp.CodingConvention var0 = com.google.javascript.jscomp.CodingConventions.getDefault();
    com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention(var0);
    com.google.javascript.jscomp.ClosureCodingConvention var2 = new com.google.javascript.jscomp.ClosureCodingConvention(var0);
    com.google.javascript.rhino.ErrorReporter var3 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var3);
    com.google.javascript.rhino.jstype.JSType var5 = null;
    com.google.javascript.rhino.Node var9 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var10 = var9.getDirectives();
    boolean var11 = var9.isThrow();
    boolean var13 = var9.getBooleanProp(1);
    boolean var14 = var9.isQualifiedName();
    com.google.javascript.rhino.jstype.FunctionType var15 = var4.createFunctionType(var5, var9);
    com.google.javascript.rhino.ErrorReporter var16 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var16);
    com.google.javascript.rhino.jstype.JSType var18 = null;
    com.google.javascript.jscomp.AbstractCompiler var19 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var20 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var21 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var23 = var21.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var24 = var20.getDirectedPredNodes(var23);
    com.google.javascript.jscomp.NodeTraversal.Callback var25 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var19, var24, var25);
    com.google.javascript.rhino.jstype.FunctionType var27 = var17.createFunctionType(var18, var24);
    com.google.javascript.rhino.ErrorReporter var29 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29);
    com.google.javascript.rhino.jstype.JSType var31 = null;
    com.google.javascript.jscomp.AbstractCompiler var32 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var33 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var34 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var36 = var34.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var37 = var33.getDirectedPredNodes(var36);
    com.google.javascript.jscomp.NodeTraversal.Callback var38 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var32, var37, var38);
    com.google.javascript.rhino.jstype.FunctionType var40 = var30.createFunctionType(var31, var37);
    com.google.javascript.rhino.Node var41 = null;
    boolean var42 = var27.defineInferredProperty("", (com.google.javascript.rhino.jstype.JSType)var40, var41);
    com.google.javascript.rhino.jstype.FunctionType var43 = var40.toMaybeFunctionType();
    boolean var44 = var40.hasCachedValues();
    com.google.javascript.rhino.ErrorReporter var45 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var45);
    com.google.javascript.rhino.ErrorReporter var47 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var47);
    com.google.javascript.rhino.jstype.JSType var49 = null;
    com.google.javascript.jscomp.AbstractCompiler var50 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var51 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var52 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var54 = var52.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var55 = var51.getDirectedPredNodes(var54);
    com.google.javascript.jscomp.NodeTraversal.Callback var56 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var50, var55, var56);
    com.google.javascript.rhino.jstype.FunctionType var58 = var48.createFunctionType(var49, var55);
    com.google.javascript.rhino.jstype.JSType var59 = var46.createNullableType((com.google.javascript.rhino.jstype.JSType)var58);
    boolean var60 = var40.canCastTo(var59);
    com.google.javascript.jscomp.CodingConvention.SubclassType var61 = null;
    var2.applySubclassRelationship(var15, var40, var61);
    boolean var64 = var2.isValidEnumKey("ERROR");
    boolean var66 = var2.isConstantKey("");
    com.google.javascript.rhino.Node var70 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var71 = var70.getDirectives();
    boolean var72 = var70.isThrow();
    boolean var74 = var70.getBooleanProp(1);
    com.google.javascript.rhino.Node var78 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var79 = var78.getDirectives();
    boolean var80 = var78.isThrow();
    boolean var82 = var78.getBooleanProp(1);
    boolean var83 = var78.isQualifiedName();
    boolean var84 = var78.isStringKey();
    java.lang.String var85 = var2.extractClassNameIfRequire(var70, var78);
    var70.setSourceFileForTesting("ECMASCRIPT3");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);

  }

  public void test64() {}
//   public void test64() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test64"); }
// 
// 
//     com.google.javascript.rhino.Node var5 = new com.google.javascript.rhino.Node(10, 10, 0);
//     com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.warning("hi!", "ERROR");
//     java.lang.String[] var10 = new java.lang.String[] { "(function (): ?|null)"};
//     com.google.javascript.jscomp.JSError var11 = com.google.javascript.jscomp.JSError.make("ERROR", var5, var8, var10);
//     com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.labelName("hi!");
//     boolean var14 = var13.isGetElem();
//     com.google.javascript.rhino.Node var15 = var5.srcrefTree(var13);
//     com.google.javascript.rhino.Node var19 = new com.google.javascript.rhino.Node(10, 10, 0);
//     java.util.Set var20 = var19.getDirectives();
//     int var21 = var19.getChangeTime();
//     boolean var22 = var19.isAssignAdd();
//     com.google.javascript.rhino.Node var25 = new com.google.javascript.rhino.Node(100, var5, var19, 0, 0);
//     com.google.javascript.rhino.Node var26 = null;
//     com.google.javascript.jscomp.CodingConvention var27 = com.google.javascript.jscomp.CodingConventions.getDefault();
//     com.google.javascript.jscomp.GoogleCodingConvention var28 = new com.google.javascript.jscomp.GoogleCodingConvention(var27);
//     com.google.javascript.rhino.Node var32 = new com.google.javascript.rhino.Node(10, 10, 0);
//     com.google.javascript.rhino.Node var36 = new com.google.javascript.rhino.Node(10, 10, 0);
//     com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.comma(var32, var36);
//     boolean var38 = var36.isUnscopedQualifiedName();
//     com.google.javascript.rhino.Node var42 = new com.google.javascript.rhino.Node(10, 10, 0);
//     java.util.Set var43 = var42.getDirectives();
//     int var44 = var42.getChangeTime();
//     boolean var45 = var42.isAssignAdd();
//     com.google.javascript.rhino.Node var46 = var36.clonePropsFrom(var42);
//     com.google.javascript.jscomp.CodingConvention.DelegateRelationship var47 = var28.getDelegateRelationship(var36);
//     boolean var49 = var28.isConstantKey("hi!: ERROR");
//     com.google.javascript.rhino.Node var53 = new com.google.javascript.rhino.Node(10, 10, 0);
//     java.util.Set var54 = var53.getDirectives();
//     boolean var55 = var53.isThrow();
//     boolean var57 = var53.getBooleanProp(1);
//     boolean var58 = var53.isQualifiedName();
//     com.google.javascript.jscomp.CodingConvention.SubclassRelationship var59 = var28.getClassesDefinedByCall(var53);
//     com.google.javascript.rhino.Node var60 = com.google.javascript.rhino.IR.not(var53);
//     com.google.javascript.rhino.Node var61 = com.google.javascript.rhino.IR.forIn(var19, var26, var60);
// 
//   }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test65"); }


    com.google.javascript.jscomp.AstValidator var0 = new com.google.javascript.jscomp.AstValidator();
    com.google.javascript.rhino.Node var4 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var5 = var4.getDirectives();
    boolean var6 = var4.isThrow();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.validateExpression(var4);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test66"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    com.google.javascript.rhino.Node var2 = var1.cloneNode();
    boolean var3 = var1.isGetElem();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test67"); }


    com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromCode("goog.exportSymbol", "LABEL_NAME hi!\n", "ERROR");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test68"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    var0.pushEdgeAnnotations();
    java.util.List var2 = var0.getGraphvizEdges();
    var0.clearNodeAnnotations();
    java.util.List var4 = var0.getGraphvizNodes();
    var0.clearEdgeAnnotations();
    com.google.javascript.jscomp.CompilerOptions var6 = new com.google.javascript.jscomp.CompilerOptions();
    var6.setNameReferenceReportPath("");
    var6.setSyntheticBlockEndMarker("hi!");
    var6.setProtectHiddenSideEffects(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var13 = var0.getNodeDegree((java.lang.Object)var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test69"); }


    com.google.javascript.rhino.Node var3 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var4 = var3.getDirectives();
    var3.putIntProp((-1), 0);
    var3.setVarArgs(false);
    com.google.javascript.rhino.jstype.StaticSourceFile var10 = var3.getStaticSourceFile();
    var3.setCharno(10);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.string("2014/12/24 01:19");
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.returnNode(var14);
    boolean var16 = var14.isBreak();
    com.google.javascript.jscomp.CodingConvention var17 = com.google.javascript.jscomp.CodingConventions.getDefault();
    com.google.javascript.jscomp.GoogleCodingConvention var18 = new com.google.javascript.jscomp.GoogleCodingConvention(var17);
    com.google.javascript.rhino.Node var22 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var23 = var22.getDirectives();
    var22.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.exprResult(var22);
    com.google.javascript.jscomp.CodingConvention.Bind var28 = var18.describeFunctionBind(var22);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var29 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var30 = var29.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var31 = new com.google.javascript.jscomp.ComposeWarningsGuard(var30);
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.script(var30);
    boolean var33 = var18.isPrototypeAlias(var32);
    com.google.javascript.rhino.Node var37 = new com.google.javascript.rhino.Node(10, 10, 0);
    com.google.javascript.rhino.Node var41 = new com.google.javascript.rhino.Node(10, 10, 0);
    com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.IR.comma(var37, var41);
    boolean var43 = var41.mayMutateArguments();
    com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast var44 = var18.getObjectLiteralCast(var41);
    boolean var45 = var41.hasChildren();
    com.google.javascript.rhino.Node var46 = var14.copyInformationFrom(var41);
    com.google.javascript.rhino.Node var48 = var46.getAncestor(1);
    com.google.javascript.rhino.Node var52 = new com.google.javascript.rhino.Node(10, 10, 0);
    com.google.javascript.rhino.Node var56 = new com.google.javascript.rhino.Node(10, 10, 0);
    com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.comma(var52, var56);
    boolean var58 = var56.isDebugger();
    boolean var59 = var56.isHook();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.addChildAfter(var48, var56);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test70"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("Object#Element");
    boolean var2 = var1.isThis();
    com.google.javascript.rhino.Node var6 = new com.google.javascript.rhino.Node(10, 10, 0);
    com.google.javascript.rhino.Node var10 = new com.google.javascript.rhino.Node(10, 10, 0);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.comma(var6, var10);
    boolean var12 = var10.isUnscopedQualifiedName();
    com.google.javascript.rhino.Node var16 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var17 = var16.getDirectives();
    int var18 = var16.getChangeTime();
    boolean var19 = var16.isAssignAdd();
    com.google.javascript.rhino.Node var20 = var10.clonePropsFrom(var16);
    boolean var21 = var20.isObjectLit();
    boolean var22 = var20.isFalse();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var24 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var25 = var24.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var26 = new com.google.javascript.jscomp.ComposeWarningsGuard(var25);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.script(var25);
    com.google.javascript.rhino.ErrorReporter var28 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var28);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var30 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var31 = var30.getEdges();
    com.google.javascript.jscomp.deps.SortedDependencies var32 = new com.google.javascript.jscomp.deps.SortedDependencies(var31);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var33 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var34 = var33.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var35 = new com.google.javascript.jscomp.ComposeWarningsGuard(var34);
    com.google.javascript.jscomp.JSModuleGraph var36 = new com.google.javascript.jscomp.JSModuleGraph(var34);
    java.util.List var37 = var32.getSortedDependenciesOf(var34);
    com.google.javascript.rhino.Node var38 = var29.createParametersWithVarArgs(var37);
    com.google.javascript.rhino.Node var43 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var44 = var43.getDirectives();
    int var45 = var43.getChangeTime();
    boolean var46 = var43.isAssignAdd();
    java.lang.String var47 = var43.getSourceFileName();
    boolean var48 = var43.isCast();
    com.google.javascript.rhino.ErrorReporter var49 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var49);
    com.google.javascript.rhino.jstype.JSType var51 = null;
    com.google.javascript.rhino.Node var55 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var56 = var55.getDirectives();
    boolean var57 = var55.isThrow();
    boolean var59 = var55.getBooleanProp(1);
    boolean var60 = var55.isQualifiedName();
    com.google.javascript.rhino.jstype.FunctionType var61 = var50.createFunctionType(var51, var55);
    boolean var62 = var61.matchesNumberContext();
    com.google.javascript.rhino.jstype.ObjectType var63 = var29.createObjectType("LABEL_NAME hi!\n", var43, (com.google.javascript.rhino.jstype.ObjectType)var61);
    com.google.javascript.rhino.Node var67 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var68 = var67.getDirectives();
    var67.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var72 = com.google.javascript.rhino.IR.not(var67);
    com.google.javascript.rhino.jstype.StaticSourceFile var73 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var72);
    com.google.javascript.rhino.ErrorReporter var74 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var74);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var76 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var77 = var76.getEdges();
    com.google.javascript.jscomp.deps.SortedDependencies var78 = new com.google.javascript.jscomp.deps.SortedDependencies(var77);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var79 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var80 = var79.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var81 = new com.google.javascript.jscomp.ComposeWarningsGuard(var80);
    com.google.javascript.jscomp.JSModuleGraph var82 = new com.google.javascript.jscomp.JSModuleGraph(var80);
    java.util.List var83 = var78.getSortedDependenciesOf(var80);
    com.google.javascript.rhino.Node var84 = var75.createParametersWithVarArgs(var83);
    java.lang.String var85 = var72.checkTreeEquals(var84);
    com.google.javascript.rhino.Node var88 = new com.google.javascript.rhino.Node(100, var27, var43, var84, 10, 10);
    boolean var89 = var27.isWith();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.replaceChild(var20, var27);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + "Node tree inequality:\nTree1:\nNOT\n    BITXOR 10\n\n\nTree2:\nPARAM_LIST\n\n\nSubtree1: NOT\n    BITXOR 10\n\n\nSubtree2: PARAM_LIST\n"+ "'", var85.equals("Node tree inequality:\nTree1:\nNOT\n    BITXOR 10\n\n\nTree2:\nPARAM_LIST\n\n\nSubtree1: NOT\n    BITXOR 10\n\n\nSubtree2: PARAM_LIST\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);

  }

  public void test71() {}
//   public void test71() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test71"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "goog.exportSymbol");
// 
//   }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test72"); }


    com.google.javascript.jscomp.CodingConvention var0 = com.google.javascript.jscomp.CodingConventions.getDefault();
    com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention(var0);
    com.google.javascript.rhino.Node var5 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var6 = var5.getDirectives();
    var5.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.exprResult(var5);
    com.google.javascript.jscomp.CodingConvention.Bind var11 = var1.describeFunctionBind(var5);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var12 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var13 = var12.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var14 = new com.google.javascript.jscomp.ComposeWarningsGuard(var13);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.script(var13);
    boolean var16 = var1.isPrototypeAlias(var15);
    com.google.javascript.rhino.ErrorReporter var17 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var17);
    com.google.javascript.rhino.jstype.JSType var19 = null;
    com.google.javascript.rhino.Node var23 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var24 = var23.getDirectives();
    boolean var25 = var23.isThrow();
    boolean var27 = var23.getBooleanProp(1);
    boolean var28 = var23.isQualifiedName();
    com.google.javascript.rhino.jstype.FunctionType var29 = var18.createFunctionType(var19, var23);
    java.lang.Iterable var31 = var18.getTypesWithProperty("ERROR");
    java.lang.Iterable var33 = var18.getEachReferenceTypeWithProperty("ERROR");
    com.google.javascript.rhino.ErrorReporter var34 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var34);
    com.google.javascript.rhino.jstype.JSType var36 = null;
    com.google.javascript.jscomp.AbstractCompiler var37 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var38 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var39 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var41 = var39.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var42 = var38.getDirectedPredNodes(var41);
    com.google.javascript.jscomp.NodeTraversal.Callback var43 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var37, var42, var43);
    com.google.javascript.rhino.jstype.FunctionType var45 = var35.createFunctionType(var36, var42);
    java.lang.Iterable var46 = var45.getImplementedInterfaces();
    boolean var47 = var45.isStruct();
    java.lang.String var48 = var45.getDisplayName();
    com.google.javascript.jscomp.AbstractCompiler var49 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var50 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var51 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var53 = var51.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var54 = var50.getDirectedPredNodes(var53);
    com.google.javascript.jscomp.NodeTraversal.Callback var55 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var49, var54, var55);
    java.util.Map var57 = null;
    var1.defineDelegateProxyPrototypeProperties(var18, (com.google.javascript.rhino.jstype.StaticScope)var45, var54, var57);
    com.google.javascript.rhino.jstype.ObjectType var59 = var45.toObjectType();
    java.lang.Iterable var60 = var45.getExtendedInterfaces();
    boolean var61 = var45.hasImplementedInterfaces();
    boolean var62 = var45.isOrdinaryFunction();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test73"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.jscomp.AbstractCompiler var3 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var4 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var5 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var7 = var5.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var8 = var4.getDirectedPredNodes(var7);
    com.google.javascript.jscomp.NodeTraversal.Callback var9 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var3, var8, var9);
    com.google.javascript.rhino.jstype.FunctionType var11 = var1.createFunctionType(var2, var8);
    com.google.javascript.rhino.ErrorReporter var13 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13);
    com.google.javascript.rhino.jstype.JSType var15 = null;
    com.google.javascript.jscomp.AbstractCompiler var16 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var17 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var18 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var20 = var18.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var21 = var17.getDirectedPredNodes(var20);
    com.google.javascript.jscomp.NodeTraversal.Callback var22 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var16, var21, var22);
    com.google.javascript.rhino.jstype.FunctionType var24 = var14.createFunctionType(var15, var21);
    com.google.javascript.rhino.Node var25 = null;
    boolean var26 = var11.defineInferredProperty("", (com.google.javascript.rhino.jstype.JSType)var24, var25);
    com.google.javascript.rhino.jstype.FunctionType var27 = var24.toMaybeFunctionType();
    boolean var28 = var24.hasCachedValues();
    com.google.javascript.rhino.ErrorReporter var29 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29);
    com.google.javascript.rhino.ErrorReporter var31 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var31);
    com.google.javascript.rhino.jstype.JSType var33 = null;
    com.google.javascript.jscomp.AbstractCompiler var34 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var35 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var36 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var38 = var36.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var39 = var35.getDirectedPredNodes(var38);
    com.google.javascript.jscomp.NodeTraversal.Callback var40 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var34, var39, var40);
    com.google.javascript.rhino.jstype.FunctionType var42 = var32.createFunctionType(var33, var39);
    com.google.javascript.rhino.jstype.JSType var43 = var30.createNullableType((com.google.javascript.rhino.jstype.JSType)var42);
    boolean var44 = var24.canCastTo(var43);
    com.google.javascript.rhino.ErrorReporter var45 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var45);
    com.google.javascript.rhino.ErrorReporter var47 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var47);
    com.google.javascript.rhino.jstype.JSType var49 = null;
    com.google.javascript.jscomp.AbstractCompiler var50 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var51 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var52 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var54 = var52.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var55 = var51.getDirectedPredNodes(var54);
    com.google.javascript.jscomp.NodeTraversal.Callback var56 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var50, var55, var56);
    com.google.javascript.rhino.jstype.FunctionType var58 = var48.createFunctionType(var49, var55);
    com.google.javascript.rhino.jstype.JSType var59 = var46.createNullableType((com.google.javascript.rhino.jstype.JSType)var58);
    com.google.javascript.rhino.jstype.JSType.TypePair var60 = var24.getTypesUnderEquality((com.google.javascript.rhino.jstype.JSType)var58);
    com.google.javascript.rhino.jstype.FunctionType var61 = var58.toMaybeFunctionType();
    boolean var62 = var58.isOrdinaryFunction();
    boolean var63 = var58.hasAnyTemplateTypes();
    java.lang.String var64 = var58.getDisplayName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test74"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    com.google.javascript.jscomp.CodingConvention var1 = com.google.javascript.jscomp.CodingConventions.getDefault();
    com.google.javascript.jscomp.GoogleCodingConvention var2 = new com.google.javascript.jscomp.GoogleCodingConvention(var1);
    com.google.javascript.jscomp.ClosureCodingConvention var3 = new com.google.javascript.jscomp.ClosureCodingConvention(var1);
    com.google.javascript.rhino.Node var7 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var8 = var7.getDirectives();
    boolean var9 = var7.isThrow();
    boolean var11 = var7.getBooleanProp(1);
    boolean var12 = var7.isLabelName();
    java.util.Map var13 = null;
    var3.checkForCallingConventionDefiningCalls(var7, var13);
    java.lang.String var15 = var3.getAbstractMethodName();
    boolean var17 = var3.isExported("goog.exportSymbol");
    com.google.javascript.rhino.Node var21 = new com.google.javascript.rhino.Node(10, 10, 0);
    com.google.javascript.rhino.Node var25 = new com.google.javascript.rhino.Node(100, 1, 10);
    com.google.javascript.rhino.Node var26 = var25.getLastSibling();
    boolean var27 = var25.isGetElem();
    var25.setWasEmptyNode(false);
    com.google.javascript.rhino.Node var30 = var21.useSourceInfoFromForTree(var25);
    com.google.javascript.rhino.Node[] var31 = new com.google.javascript.rhino.Node[] { var30};
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.arraylit(var31);
    com.google.javascript.jscomp.CodingConvention.Bind var34 = var3.describeFunctionBind(var32, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var35 = var0.getWeight((java.lang.Object)var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "goog.abstractMethod"+ "'", var15.equals("goog.abstractMethod"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test75"); }


    com.google.javascript.jscomp.SourceFile var1 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.lang.String var2 = var1.getOriginalPath();
    int var4 = var1.getColumnOfOffset(10);
    com.google.javascript.jscomp.CompilerInput var6 = new com.google.javascript.jscomp.CompilerInput(var1, false);
    java.io.PrintStream var7 = null;
    com.google.javascript.jscomp.Compiler var8 = new com.google.javascript.jscomp.Compiler(var7);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var9 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var10 = var9.getEdges();
    com.google.javascript.jscomp.NodeTraversal.Callback var11 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var8, var10, var11);
    java.lang.String var13 = var8.getAstDotGraph();
    com.google.javascript.jscomp.CompilerOptions var14 = null;
    com.google.javascript.jscomp.DefaultPassConfig var15 = new com.google.javascript.jscomp.DefaultPassConfig(var14);
    var8.setPassConfig((com.google.javascript.jscomp.PassConfig)var15);
    java.io.PrintStream var17 = null;
    com.google.javascript.jscomp.Compiler var18 = new com.google.javascript.jscomp.Compiler(var17);
    var18.reportCodeChange();
    com.google.javascript.jscomp.SourceFile var21 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.lang.String var22 = var21.getOriginalPath();
    com.google.javascript.rhino.Node var23 = var18.parse(var21);
    var21.setOriginalPath("{ }");
    com.google.javascript.rhino.Node var26 = var8.parse(var21);
    var6.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var8);
    java.lang.String var28 = var8.getAstDotGraph();
    com.google.javascript.jscomp.SourceFile var30 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.io.PrintStream var31 = null;
    com.google.javascript.jscomp.Compiler var32 = new com.google.javascript.jscomp.Compiler(var31);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var33 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var34 = var33.getEdges();
    com.google.javascript.jscomp.NodeTraversal.Callback var35 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var32, var34, var35);
    java.lang.String var37 = var32.getAstDotGraph();
    com.google.javascript.jscomp.CompilerOptions var38 = null;
    com.google.javascript.jscomp.DefaultPassConfig var39 = new com.google.javascript.jscomp.DefaultPassConfig(var38);
    var32.setPassConfig((com.google.javascript.jscomp.PassConfig)var39);
    java.io.PrintStream var41 = null;
    com.google.javascript.jscomp.Compiler var42 = new com.google.javascript.jscomp.Compiler(var41);
    var42.reportCodeChange();
    com.google.javascript.jscomp.SourceFile var45 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.lang.String var46 = var45.getOriginalPath();
    com.google.javascript.rhino.Node var47 = var42.parse(var45);
    var45.setOriginalPath("{ }");
    com.google.javascript.rhino.Node var50 = var32.parse(var45);
    boolean var51 = var45.isExtern();
    com.google.javascript.jscomp.CompilerOptions var52 = new com.google.javascript.jscomp.CompilerOptions();
    var52.setPropertyAffinity(false);
    com.google.javascript.jscomp.CheckLevel var55 = null;
    var52.setBrokenClosureRequiresLevel(var55);
    var52.setOptimizeParameters(false);
    var52.setInlineFunctions(true);
    boolean var61 = var52.assumeStrictThis();
    var52.setExtractPrototypeMemberDeclarations(true);
    com.google.javascript.jscomp.Result var64 = var8.compile(var30, var45, var52);
    com.google.javascript.jscomp.SourceMap.Format var65 = null;
    var52.setSourceMapFormat(var65);
    var52.setCheckCaja(true);
    var52.setDevirtualizePrototypeMethods(false);
    var52.setRemoveClosureAsserts(false);
    var52.skipAllCompilerPasses();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!"+ "'", var46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test76"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning("ERROR", "null(null)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test77"); }


    com.google.javascript.rhino.Node var3 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var4 = var3.getDirectives();
    int var5 = var3.getChangeTime();
    boolean var6 = var3.isAssignAdd();
    boolean var7 = var3.isGetterDef();
    java.lang.String var8 = var3.toString();
    boolean var9 = var3.isExprResult();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "BITXOR 10"+ "'", var8.equals("BITXOR 10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test78"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.jscomp.AbstractCompiler var3 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var4 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var5 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var7 = var5.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var8 = var4.getDirectedPredNodes(var7);
    com.google.javascript.jscomp.NodeTraversal.Callback var9 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var3, var8, var9);
    com.google.javascript.rhino.jstype.FunctionType var11 = var1.createFunctionType(var2, var8);
    com.google.javascript.rhino.jstype.TemplateType var12 = var1.getObjectElementKey();
    com.google.javascript.rhino.jstype.ModificationVisitor var13 = new com.google.javascript.rhino.jstype.ModificationVisitor(var1);
    com.google.javascript.rhino.jstype.JSType var14 = var13.caseNoType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test79"); }


    com.google.javascript.rhino.jstype.TernaryValue var1 = com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test80"); }


    com.google.javascript.jscomp.CodingConvention var0 = com.google.javascript.jscomp.CodingConventions.getDefault();
    com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention(var0);
    com.google.javascript.jscomp.ClosureCodingConvention var2 = new com.google.javascript.jscomp.ClosureCodingConvention(var0);
    com.google.javascript.rhino.Node var6 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var7 = var6.getDirectives();
    boolean var8 = var6.isReturn();
    boolean var9 = var2.isPrototypeAlias(var6);
    var6.setSourceEncodedPositionForTree(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test81"); }


    com.google.javascript.rhino.Node var3 = new com.google.javascript.rhino.Node(10, 10, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = com.google.javascript.jscomp.NodeUtil.isLValue(var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test82"); }


    com.google.javascript.jscomp.CodingConvention var0 = com.google.javascript.jscomp.CodingConventions.getDefault();
    com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention(var0);
    com.google.javascript.rhino.Node var5 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var6 = var5.getDirectives();
    var5.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.exprResult(var5);
    com.google.javascript.jscomp.CodingConvention.Bind var11 = var1.describeFunctionBind(var5);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var12 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var13 = var12.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var14 = new com.google.javascript.jscomp.ComposeWarningsGuard(var13);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.script(var13);
    boolean var16 = var1.isPrototypeAlias(var15);
    com.google.javascript.rhino.Node var20 = new com.google.javascript.rhino.Node(10, 10, 0);
    com.google.javascript.rhino.Node var24 = new com.google.javascript.rhino.Node(10, 10, 0);
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.comma(var20, var24);
    boolean var26 = var20.isContinue();
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var27 = var1.getDelegateRelationship(var20);
    boolean var29 = var1.isPrivate("hi!");
    com.google.javascript.rhino.Node var33 = new com.google.javascript.rhino.Node(10, 10, 0);
    com.google.javascript.rhino.Node var37 = new com.google.javascript.rhino.Node(10, 10, 0);
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.comma(var33, var37);
    boolean var39 = var37.isUnscopedQualifiedName();
    var37.setVarArgs(true);
    com.google.javascript.jscomp.CodingConvention.SubclassRelationship var42 = var1.getClassesDefinedByCall(var37);
    com.google.javascript.rhino.Node var43 = var37.cloneNode();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var45 = var43.getExistingIntProp(1);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test83"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setNameReferenceReportPath("");
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var3 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var4 = var3.getEdges();
    com.google.javascript.jscomp.deps.SortedDependencies var5 = new com.google.javascript.jscomp.deps.SortedDependencies(var4);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var6 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var7 = var6.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var8 = new com.google.javascript.jscomp.ComposeWarningsGuard(var7);
    com.google.javascript.jscomp.JSModuleGraph var9 = new com.google.javascript.jscomp.JSModuleGraph(var7);
    java.util.List var10 = var5.getSortedDependenciesOf(var7);
    java.io.PrintStream var11 = null;
    com.google.javascript.jscomp.Compiler var12 = new com.google.javascript.jscomp.Compiler(var11);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var13 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var14 = var13.getEdges();
    com.google.javascript.jscomp.NodeTraversal.Callback var15 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var12, var14, var15);
    java.lang.String var17 = var12.getAstDotGraph();
    com.google.javascript.jscomp.CompilerOptions var18 = null;
    com.google.javascript.jscomp.DefaultPassConfig var19 = new com.google.javascript.jscomp.DefaultPassConfig(var18);
    var12.setPassConfig((com.google.javascript.jscomp.PassConfig)var19);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var21 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var22 = var21.getEdges();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var23 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var24 = var23.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var25 = new com.google.javascript.jscomp.ComposeWarningsGuard(var24);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.script(var24);
    com.google.javascript.jscomp.CompilerOptions var27 = new com.google.javascript.jscomp.CompilerOptions();
    var27.setPropertyAffinity(false);
    com.google.javascript.jscomp.CheckLevel var30 = null;
    var27.setBrokenClosureRequiresLevel(var30);
    var12.<com.google.javascript.jscomp.SourceFile>initModules(var22, var24, var27);
    java.util.List var34 = var5.getDependenciesOf(var24, false);
    var0.setReplaceStringsFunctionDescriptions(var34);
    var0.setInlineGetters(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test84() {}
//   public void test84() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test84"); }
// 
// 
//     com.google.javascript.jscomp.AbstractCompiler var0 = null;
//     com.google.javascript.jscomp.NodeTraversal.Callback var1 = null;
//     com.google.javascript.jscomp.NodeTraversal var2 = new com.google.javascript.jscomp.NodeTraversal(var0, var1);
//     java.lang.String var3 = var2.getSourceName();
//     com.google.javascript.rhino.Node var4 = var2.getCurrentNode();
//     com.google.javascript.rhino.Node var5 = var2.getEnclosingFunction();
//     com.google.javascript.jscomp.JSModule var7 = new com.google.javascript.jscomp.JSModule("(function (): ?|null)");
//     java.io.PrintStream var8 = null;
//     com.google.javascript.jscomp.Compiler var9 = new com.google.javascript.jscomp.Compiler(var8);
//     var9.reportCodeChange();
//     com.google.javascript.jscomp.SourceFile var12 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
//     java.lang.String var13 = var12.getOriginalPath();
//     com.google.javascript.rhino.Node var14 = var9.parse(var12);
//     var7.add(var12);
//     java.util.List var16 = var7.getRequires();
//     var2.traverseRoots(var16);
//     com.google.javascript.rhino.Node var23 = new com.google.javascript.rhino.Node(10, 10, 0);
//     com.google.javascript.rhino.Node var27 = new com.google.javascript.rhino.Node(10, 10, 0);
//     com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.comma(var23, var27);
//     boolean var29 = var28.isNoSideEffectsCall();
//     com.google.javascript.jscomp.DiagnosticType var32 = com.google.javascript.jscomp.DiagnosticType.warning("hi!", "ERROR");
//     java.lang.String[] var34 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var35 = com.google.javascript.jscomp.JSError.make("", var28, var32, var34);
//     int var36 = var28.getCharno();
//     com.google.javascript.rhino.Node[] var37 = new com.google.javascript.rhino.Node[] { var28};
//     com.google.javascript.rhino.Node var38 = new com.google.javascript.rhino.Node((-1), var37);
//     var2.traverseRoots(var37);
// 
//   }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test85"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.jscomp.AbstractCompiler var3 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var4 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var5 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var7 = var5.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var8 = var4.getDirectedPredNodes(var7);
    com.google.javascript.jscomp.NodeTraversal.Callback var9 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var3, var8, var9);
    com.google.javascript.rhino.jstype.FunctionType var11 = var1.createFunctionType(var2, var8);
    com.google.javascript.rhino.ErrorReporter var13 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13);
    com.google.javascript.rhino.jstype.JSType var15 = null;
    com.google.javascript.jscomp.AbstractCompiler var16 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var17 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var18 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var20 = var18.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var21 = var17.getDirectedPredNodes(var20);
    com.google.javascript.jscomp.NodeTraversal.Callback var22 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var16, var21, var22);
    com.google.javascript.rhino.jstype.FunctionType var24 = var14.createFunctionType(var15, var21);
    com.google.javascript.rhino.Node var25 = null;
    boolean var26 = var11.defineInferredProperty("", (com.google.javascript.rhino.jstype.JSType)var24, var25);
    boolean var27 = var24.hasCachedValues();
    boolean var28 = var24.canBeCalled();
    com.google.javascript.rhino.ErrorReporter var29 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var31 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var32 = var31.getEdges();
    com.google.javascript.jscomp.deps.SortedDependencies var33 = new com.google.javascript.jscomp.deps.SortedDependencies(var32);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var34 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var35 = var34.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var36 = new com.google.javascript.jscomp.ComposeWarningsGuard(var35);
    com.google.javascript.jscomp.JSModuleGraph var37 = new com.google.javascript.jscomp.JSModuleGraph(var35);
    java.util.List var38 = var33.getSortedDependenciesOf(var35);
    com.google.javascript.rhino.Node var39 = var30.createParametersWithVarArgs(var38);
    com.google.common.collect.ImmutableList var40 = null;
    com.google.common.collect.ImmutableList var41 = null;
    com.google.javascript.rhino.jstype.TemplateTypeMap var42 = var30.createTemplateTypeMap(var40, var41);
    com.google.javascript.rhino.ErrorReporter var43 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var43);
    com.google.javascript.rhino.jstype.JSType var45 = null;
    com.google.javascript.jscomp.AbstractCompiler var46 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var47 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var48 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var50 = var48.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var51 = var47.getDirectedPredNodes(var50);
    com.google.javascript.jscomp.NodeTraversal.Callback var52 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var46, var51, var52);
    com.google.javascript.rhino.jstype.FunctionType var54 = var44.createFunctionType(var45, var51);
    com.google.javascript.rhino.jstype.TemplateType var55 = var44.getObjectElementKey();
    com.google.javascript.rhino.jstype.JSType var56 = var42.getTemplateType(var55);
    var24.extendTemplateTypeMap(var42);
    com.google.javascript.rhino.JSDocInfo var59 = null;
    var24.setPropertyJSDocInfo("goog.exportSymbol", var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test86"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newNumber(0.0d, (-1), 1);
    com.google.javascript.rhino.Node var7 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var8 = var7.getDirectives();
    var7.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.not(var7);
    com.google.javascript.rhino.jstype.StaticSourceFile var13 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var12);
    com.google.javascript.rhino.Node var17 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var18 = var17.getDirectives();
    int var19 = var17.getChangeTime();
    boolean var20 = var17.isWith();
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.add(var12, var17);
    com.google.javascript.rhino.Node var25 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var26 = var25.getDirectives();
    var25.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.not(var25);
    com.google.javascript.rhino.jstype.StaticSourceFile var31 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var30);
    com.google.javascript.rhino.ErrorReporter var32 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var34 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var35 = var34.getEdges();
    com.google.javascript.jscomp.deps.SortedDependencies var36 = new com.google.javascript.jscomp.deps.SortedDependencies(var35);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var37 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var38 = var37.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var39 = new com.google.javascript.jscomp.ComposeWarningsGuard(var38);
    com.google.javascript.jscomp.JSModuleGraph var40 = new com.google.javascript.jscomp.JSModuleGraph(var38);
    java.util.List var41 = var36.getSortedDependenciesOf(var38);
    com.google.javascript.rhino.Node var42 = var33.createParametersWithVarArgs(var41);
    java.lang.String var43 = var30.checkTreeEquals(var42);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.addChildrenAfter(var12, var42);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "Node tree inequality:\nTree1:\nNOT\n    BITXOR 10\n\n\nTree2:\nPARAM_LIST\n\n\nSubtree1: NOT\n    BITXOR 10\n\n\nSubtree2: PARAM_LIST\n"+ "'", var43.equals("Node tree inequality:\nTree1:\nNOT\n    BITXOR 10\n\n\nTree2:\nPARAM_LIST\n\n\nSubtree1: NOT\n    BITXOR 10\n\n\nSubtree2: PARAM_LIST\n"));

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test87"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("(function (): ?|null)");
    com.google.javascript.jscomp.JSModule var3 = new com.google.javascript.jscomp.JSModule("(function (): ?|null)");
    java.io.PrintStream var4 = null;
    com.google.javascript.jscomp.Compiler var5 = new com.google.javascript.jscomp.Compiler(var4);
    var5.reportCodeChange();
    com.google.javascript.jscomp.SourceFile var8 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.lang.String var9 = var8.getOriginalPath();
    com.google.javascript.rhino.Node var10 = var5.parse(var8);
    var3.add(var8);
    java.util.List var12 = var3.getRequires();
    com.google.javascript.jscomp.SourceFile var14 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.lang.String var15 = var14.getOriginalPath();
    int var17 = var14.getColumnOfOffset(10);
    com.google.javascript.jscomp.CompilerInput var19 = new com.google.javascript.jscomp.CompilerInput(var14, false);
    java.io.PrintStream var20 = null;
    com.google.javascript.jscomp.Compiler var21 = new com.google.javascript.jscomp.Compiler(var20);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var22 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var23 = var22.getEdges();
    com.google.javascript.jscomp.NodeTraversal.Callback var24 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var21, var23, var24);
    java.lang.String var26 = var21.getAstDotGraph();
    com.google.javascript.jscomp.CompilerOptions var27 = null;
    com.google.javascript.jscomp.DefaultPassConfig var28 = new com.google.javascript.jscomp.DefaultPassConfig(var27);
    var21.setPassConfig((com.google.javascript.jscomp.PassConfig)var28);
    java.io.PrintStream var30 = null;
    com.google.javascript.jscomp.Compiler var31 = new com.google.javascript.jscomp.Compiler(var30);
    var31.reportCodeChange();
    com.google.javascript.jscomp.SourceFile var34 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.lang.String var35 = var34.getOriginalPath();
    com.google.javascript.rhino.Node var36 = var31.parse(var34);
    var34.setOriginalPath("{ }");
    com.google.javascript.rhino.Node var39 = var21.parse(var34);
    var19.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var21);
    com.google.javascript.jscomp.CompilerInput var41 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var19);
    var3.add(var19);
    var1.remove(var19);
    com.google.javascript.jscomp.CompilerInput var45 = var1.getByName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);

  }

  public void test88() {}
//   public void test88() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test88"); }
// 
// 
//     com.google.javascript.jscomp.CodingConvention var0 = com.google.javascript.jscomp.CodingConventions.getDefault();
//     com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention(var0);
//     com.google.javascript.rhino.Node var5 = new com.google.javascript.rhino.Node(10, 10, 0);
//     java.util.Set var6 = var5.getDirectives();
//     var5.putIntProp((-1), 0);
//     com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.exprResult(var5);
//     com.google.javascript.jscomp.CodingConvention.Bind var11 = var1.describeFunctionBind(var5);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var12 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.List var13 = var12.getEdges();
//     com.google.javascript.jscomp.ComposeWarningsGuard var14 = new com.google.javascript.jscomp.ComposeWarningsGuard(var13);
//     com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.script(var13);
//     boolean var16 = var1.isPrototypeAlias(var15);
//     com.google.javascript.rhino.ErrorReporter var17 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var17);
//     com.google.javascript.rhino.jstype.JSType var19 = null;
//     com.google.javascript.rhino.Node var23 = new com.google.javascript.rhino.Node(10, 10, 0);
//     java.util.Set var24 = var23.getDirectives();
//     boolean var25 = var23.isThrow();
//     boolean var27 = var23.getBooleanProp(1);
//     boolean var28 = var23.isQualifiedName();
//     com.google.javascript.rhino.jstype.FunctionType var29 = var18.createFunctionType(var19, var23);
//     java.lang.Iterable var31 = var18.getTypesWithProperty("ERROR");
//     java.lang.Iterable var33 = var18.getEachReferenceTypeWithProperty("ERROR");
//     com.google.javascript.rhino.ErrorReporter var34 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var34);
//     com.google.javascript.rhino.jstype.JSType var36 = null;
//     com.google.javascript.jscomp.AbstractCompiler var37 = null;
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var38 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var39 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var41 = var39.createDirectedGraphNode((java.lang.Object)(-1));
//     java.util.List var42 = var38.getDirectedPredNodes(var41);
//     com.google.javascript.jscomp.NodeTraversal.Callback var43 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots(var37, var42, var43);
//     com.google.javascript.rhino.jstype.FunctionType var45 = var35.createFunctionType(var36, var42);
//     java.lang.Iterable var46 = var45.getImplementedInterfaces();
//     boolean var47 = var45.isStruct();
//     java.lang.String var48 = var45.getDisplayName();
//     com.google.javascript.jscomp.AbstractCompiler var49 = null;
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var50 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var51 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var53 = var51.createDirectedGraphNode((java.lang.Object)(-1));
//     java.util.List var54 = var50.getDirectedPredNodes(var53);
//     com.google.javascript.jscomp.NodeTraversal.Callback var55 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots(var49, var54, var55);
//     java.util.Map var57 = null;
//     var1.defineDelegateProxyPrototypeProperties(var18, (com.google.javascript.rhino.jstype.StaticScope)var45, var54, var57);
//     com.google.javascript.rhino.JSDocInfo var59 = null;
//     com.google.javascript.rhino.jstype.ObjectType var60 = var18.createAnonymousObjectType(var59);
//     com.google.javascript.rhino.jstype.JSTypeNative var61 = null;
//     com.google.javascript.rhino.jstype.JSTypeNative[] var62 = new com.google.javascript.rhino.jstype.JSTypeNative[] { var61};
//     com.google.javascript.rhino.jstype.JSType var63 = var18.createUnionType(var62);
// 
//   }

  public void test89() {}
//   public void test89() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test89"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     var1.reportCodeChange();
//     com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.continueNode();
//     var4.putIntProp(100, 10);
//     com.google.javascript.rhino.Node var12 = new com.google.javascript.rhino.Node(10, 10, 0);
//     com.google.javascript.rhino.Node var16 = new com.google.javascript.rhino.Node(10, 10, 0);
//     com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.comma(var12, var16);
//     boolean var18 = var17.isNoSideEffectsCall();
//     com.google.javascript.jscomp.DiagnosticType var21 = com.google.javascript.jscomp.DiagnosticType.warning("hi!", "ERROR");
//     java.lang.String[] var23 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var24 = com.google.javascript.jscomp.JSError.make("", var17, var21, var23);
//     com.google.javascript.rhino.Node var29 = new com.google.javascript.rhino.Node(10, 10, 0);
//     com.google.javascript.rhino.Node var33 = new com.google.javascript.rhino.Node(10, 10, 0);
//     com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.IR.comma(var29, var33);
//     boolean var35 = var34.isNoSideEffectsCall();
//     com.google.javascript.jscomp.DiagnosticType var38 = com.google.javascript.jscomp.DiagnosticType.warning("hi!", "ERROR");
//     java.lang.String[] var40 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var41 = com.google.javascript.jscomp.JSError.make("", var34, var38, var40);
//     com.google.javascript.jscomp.JSError var42 = com.google.javascript.jscomp.JSError.make("function (): ?", var4, var21, var40);
//     com.google.javascript.jscomp.CheckLevel var43 = var1.getErrorLevel(var42);
// 
//   }

  public void test90() {}
//   public void test90() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test90"); }
// 
// 
//     com.google.javascript.jscomp.CodingConvention var0 = com.google.javascript.jscomp.CodingConventions.getDefault();
//     com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention(var0);
//     com.google.javascript.jscomp.ClosureCodingConvention var2 = new com.google.javascript.jscomp.ClosureCodingConvention(var0);
//     com.google.javascript.rhino.ErrorReporter var3 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var3);
//     com.google.javascript.rhino.jstype.JSType var5 = null;
//     com.google.javascript.rhino.Node var9 = new com.google.javascript.rhino.Node(10, 10, 0);
//     java.util.Set var10 = var9.getDirectives();
//     boolean var11 = var9.isThrow();
//     boolean var13 = var9.getBooleanProp(1);
//     boolean var14 = var9.isQualifiedName();
//     com.google.javascript.rhino.jstype.FunctionType var15 = var4.createFunctionType(var5, var9);
//     com.google.javascript.rhino.ErrorReporter var16 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var16);
//     com.google.javascript.rhino.jstype.JSType var18 = null;
//     com.google.javascript.jscomp.AbstractCompiler var19 = null;
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var20 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var21 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var23 = var21.createDirectedGraphNode((java.lang.Object)(-1));
//     java.util.List var24 = var20.getDirectedPredNodes(var23);
//     com.google.javascript.jscomp.NodeTraversal.Callback var25 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots(var19, var24, var25);
//     com.google.javascript.rhino.jstype.FunctionType var27 = var17.createFunctionType(var18, var24);
//     com.google.javascript.rhino.ErrorReporter var29 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29);
//     com.google.javascript.rhino.jstype.JSType var31 = null;
//     com.google.javascript.jscomp.AbstractCompiler var32 = null;
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var33 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var34 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var36 = var34.createDirectedGraphNode((java.lang.Object)(-1));
//     java.util.List var37 = var33.getDirectedPredNodes(var36);
//     com.google.javascript.jscomp.NodeTraversal.Callback var38 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots(var32, var37, var38);
//     com.google.javascript.rhino.jstype.FunctionType var40 = var30.createFunctionType(var31, var37);
//     com.google.javascript.rhino.Node var41 = null;
//     boolean var42 = var27.defineInferredProperty("", (com.google.javascript.rhino.jstype.JSType)var40, var41);
//     com.google.javascript.rhino.jstype.FunctionType var43 = var40.toMaybeFunctionType();
//     boolean var44 = var40.hasCachedValues();
//     com.google.javascript.rhino.ErrorReporter var45 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var45);
//     com.google.javascript.rhino.ErrorReporter var47 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var47);
//     com.google.javascript.rhino.jstype.JSType var49 = null;
//     com.google.javascript.jscomp.AbstractCompiler var50 = null;
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var51 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var52 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var54 = var52.createDirectedGraphNode((java.lang.Object)(-1));
//     java.util.List var55 = var51.getDirectedPredNodes(var54);
//     com.google.javascript.jscomp.NodeTraversal.Callback var56 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots(var50, var55, var56);
//     com.google.javascript.rhino.jstype.FunctionType var58 = var48.createFunctionType(var49, var55);
//     com.google.javascript.rhino.jstype.JSType var59 = var46.createNullableType((com.google.javascript.rhino.jstype.JSType)var58);
//     boolean var60 = var40.canCastTo(var59);
//     com.google.javascript.jscomp.CodingConvention.SubclassType var61 = null;
//     var2.applySubclassRelationship(var15, var40, var61);
//     boolean var64 = var2.isValidEnumKey("ERROR");
//     com.google.javascript.rhino.Node var69 = new com.google.javascript.rhino.Node(10, 10, 0);
//     com.google.javascript.jscomp.DiagnosticType var72 = com.google.javascript.jscomp.DiagnosticType.warning("hi!", "ERROR");
//     java.lang.String[] var74 = new java.lang.String[] { "(function (): ?|null)"};
//     com.google.javascript.jscomp.JSError var75 = com.google.javascript.jscomp.JSError.make("ERROR", var69, var72, var74);
//     boolean var76 = var2.isOptionalParameter(var69);
//     com.google.javascript.rhino.Node var77 = null;
//     boolean var78 = var2.isPropertyTestFunction(var77);
// 
//   }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test91"); }


    com.google.javascript.jscomp.CodingConvention var0 = com.google.javascript.jscomp.CodingConventions.getDefault();
    com.google.javascript.jscomp.GoogleCodingConvention var1 = new com.google.javascript.jscomp.GoogleCodingConvention(var0);
    com.google.javascript.rhino.Node var5 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var6 = var5.getDirectives();
    var5.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.exprResult(var5);
    com.google.javascript.jscomp.CodingConvention.Bind var11 = var1.describeFunctionBind(var5);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var12 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var13 = var12.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var14 = new com.google.javascript.jscomp.ComposeWarningsGuard(var13);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.script(var13);
    boolean var16 = var1.isPrototypeAlias(var15);
    com.google.javascript.rhino.Node var20 = new com.google.javascript.rhino.Node(10, 10, 0);
    com.google.javascript.rhino.Node var24 = new com.google.javascript.rhino.Node(10, 10, 0);
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.comma(var20, var24);
    boolean var26 = var24.mayMutateArguments();
    com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast var27 = var1.getObjectLiteralCast(var24);
    boolean var28 = var24.isDo();
    com.google.javascript.rhino.Node var32 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var33 = var32.getDirectives();
    var32.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.not(var32);
    com.google.javascript.rhino.jstype.StaticSourceFile var38 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var37);
    com.google.javascript.rhino.Node var42 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var43 = var42.getDirectives();
    int var44 = var42.getChangeTime();
    boolean var45 = var42.isWith();
    com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.IR.add(var37, var42);
    com.google.javascript.rhino.Node var50 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var51 = var50.getDirectives();
    var50.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var55 = com.google.javascript.rhino.IR.exprResult(var50);
    java.lang.Iterable var56 = var55.siblings();
    com.google.javascript.rhino.Node var57 = var42.useSourceInfoIfMissingFrom(var55);
    com.google.javascript.rhino.Node var58 = var24.srcref(var55);
    var55.setType(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test92"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.string("2014/12/24 01:19");
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.returnNode(var2);
    boolean var4 = var2.isBreak();
    com.google.javascript.jscomp.CodingConvention var5 = com.google.javascript.jscomp.CodingConventions.getDefault();
    com.google.javascript.jscomp.GoogleCodingConvention var6 = new com.google.javascript.jscomp.GoogleCodingConvention(var5);
    com.google.javascript.rhino.Node var10 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var11 = var10.getDirectives();
    var10.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.exprResult(var10);
    com.google.javascript.jscomp.CodingConvention.Bind var16 = var6.describeFunctionBind(var10);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var17 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var18 = var17.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var19 = new com.google.javascript.jscomp.ComposeWarningsGuard(var18);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.script(var18);
    boolean var21 = var6.isPrototypeAlias(var20);
    com.google.javascript.rhino.Node var25 = new com.google.javascript.rhino.Node(10, 10, 0);
    com.google.javascript.rhino.Node var29 = new com.google.javascript.rhino.Node(10, 10, 0);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.comma(var25, var29);
    boolean var31 = var29.mayMutateArguments();
    com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast var32 = var6.getObjectLiteralCast(var29);
    boolean var33 = var29.hasChildren();
    com.google.javascript.rhino.Node var34 = var2.copyInformationFrom(var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var37 = new com.google.javascript.rhino.Node(10, var2, 10, (-1));
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test93() {}
//   public void test93() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test93"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     com.google.javascript.rhino.jstype.JSType var2 = null;
//     com.google.javascript.jscomp.AbstractCompiler var3 = null;
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var4 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var5 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var7 = var5.createDirectedGraphNode((java.lang.Object)(-1));
//     java.util.List var8 = var4.getDirectedPredNodes(var7);
//     com.google.javascript.jscomp.NodeTraversal.Callback var9 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots(var3, var8, var9);
//     com.google.javascript.rhino.jstype.FunctionType var11 = var1.createFunctionType(var2, var8);
//     com.google.javascript.rhino.jstype.TemplateType var12 = var1.getObjectElementKey();
//     com.google.javascript.jscomp.CodingConvention var13 = com.google.javascript.jscomp.CodingConventions.getDefault();
//     com.google.javascript.jscomp.GoogleCodingConvention var14 = new com.google.javascript.jscomp.GoogleCodingConvention(var13);
//     com.google.javascript.rhino.Node var18 = new com.google.javascript.rhino.Node(10, 10, 0);
//     java.util.Set var19 = var18.getDirectives();
//     var18.putIntProp((-1), 0);
//     com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.exprResult(var18);
//     com.google.javascript.jscomp.CodingConvention.Bind var24 = var14.describeFunctionBind(var18);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var25 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.List var26 = var25.getEdges();
//     com.google.javascript.jscomp.ComposeWarningsGuard var27 = new com.google.javascript.jscomp.ComposeWarningsGuard(var26);
//     com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.script(var26);
//     boolean var29 = var14.isPrototypeAlias(var28);
//     com.google.javascript.rhino.ErrorReporter var30 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var30);
//     com.google.javascript.rhino.jstype.JSType var32 = null;
//     com.google.javascript.rhino.Node var36 = new com.google.javascript.rhino.Node(10, 10, 0);
//     java.util.Set var37 = var36.getDirectives();
//     boolean var38 = var36.isThrow();
//     boolean var40 = var36.getBooleanProp(1);
//     boolean var41 = var36.isQualifiedName();
//     com.google.javascript.rhino.jstype.FunctionType var42 = var31.createFunctionType(var32, var36);
//     java.lang.Iterable var44 = var31.getTypesWithProperty("ERROR");
//     java.lang.Iterable var46 = var31.getEachReferenceTypeWithProperty("ERROR");
//     com.google.javascript.rhino.ErrorReporter var47 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var47);
//     com.google.javascript.rhino.jstype.JSType var49 = null;
//     com.google.javascript.jscomp.AbstractCompiler var50 = null;
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var51 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var52 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var54 = var52.createDirectedGraphNode((java.lang.Object)(-1));
//     java.util.List var55 = var51.getDirectedPredNodes(var54);
//     com.google.javascript.jscomp.NodeTraversal.Callback var56 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots(var50, var55, var56);
//     com.google.javascript.rhino.jstype.FunctionType var58 = var48.createFunctionType(var49, var55);
//     java.lang.Iterable var59 = var58.getImplementedInterfaces();
//     boolean var60 = var58.isStruct();
//     java.lang.String var61 = var58.getDisplayName();
//     com.google.javascript.jscomp.AbstractCompiler var62 = null;
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var63 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var64 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var66 = var64.createDirectedGraphNode((java.lang.Object)(-1));
//     java.util.List var67 = var63.getDirectedPredNodes(var66);
//     com.google.javascript.jscomp.NodeTraversal.Callback var68 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots(var62, var67, var68);
//     java.util.Map var70 = null;
//     var14.defineDelegateProxyPrototypeProperties(var31, (com.google.javascript.rhino.jstype.StaticScope)var58, var67, var70);
//     com.google.javascript.rhino.jstype.ObjectType var72 = var1.createObjectType((com.google.javascript.rhino.jstype.ObjectType)var58);
//     com.google.javascript.rhino.jstype.FunctionParamBuilder var73 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var1);
//     boolean var74 = var73.hasVarArgs();
//     com.google.javascript.rhino.jstype.JSType[] var75 = null;
//     boolean var76 = var73.addOptionalParams(var75);
// 
//   }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test94"); }


    com.google.javascript.rhino.Node var5 = new com.google.javascript.rhino.Node(10, 10, 0);
    com.google.javascript.rhino.Node var9 = new com.google.javascript.rhino.Node(10, 10, 0);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.comma(var5, var9);
    boolean var11 = var10.isNoSideEffectsCall();
    com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.warning("hi!", "ERROR");
    java.lang.String[] var16 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var17 = com.google.javascript.jscomp.JSError.make("", var10, var14, var16);
    int var18 = var10.getCharno();
    com.google.javascript.rhino.Node[] var19 = new com.google.javascript.rhino.Node[] { var10};
    com.google.javascript.rhino.Node var20 = new com.google.javascript.rhino.Node((-1), var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.script(var19);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test95"); }


    com.google.javascript.jscomp.AstValidator var0 = new com.google.javascript.jscomp.AstValidator();
    com.google.javascript.rhino.Node var4 = new com.google.javascript.rhino.Node(10, 10, 0);
    com.google.javascript.rhino.Node var8 = new com.google.javascript.rhino.Node(10, 10, 0);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.comma(var4, var8);
    boolean var10 = var8.isDebugger();
    boolean var11 = var8.isNoSideEffectsCall();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.validateScript(var8);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test96"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.jscomp.AbstractCompiler var3 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var4 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var5 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var7 = var5.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var8 = var4.getDirectedPredNodes(var7);
    com.google.javascript.jscomp.NodeTraversal.Callback var9 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var3, var8, var9);
    com.google.javascript.rhino.jstype.FunctionType var11 = var1.createFunctionType(var2, var8);
    boolean var13 = var1.isForwardDeclaredType("ERROR");
    com.google.javascript.rhino.ErrorReporter var14 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var14);
    com.google.javascript.rhino.jstype.JSType var16 = null;
    com.google.javascript.rhino.Node var20 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var21 = var20.getDirectives();
    boolean var22 = var20.isThrow();
    boolean var24 = var20.getBooleanProp(1);
    boolean var25 = var20.isQualifiedName();
    com.google.javascript.rhino.jstype.FunctionType var26 = var15.createFunctionType(var16, var20);
    boolean var27 = var26.matchesNumberContext();
    com.google.javascript.rhino.jstype.JSTypeRegistry var29 = null;
    com.google.javascript.rhino.jstype.TemplateTypeMap var30 = null;
    com.google.javascript.rhino.jstype.TemplateTypeMapReplacer var31 = new com.google.javascript.rhino.jstype.TemplateTypeMapReplacer(var29, var30);
    com.google.javascript.rhino.jstype.EnumElementType var32 = null;
    com.google.javascript.rhino.jstype.JSType var33 = var31.caseEnumElementType(var32);
    com.google.javascript.jscomp.CodingConvention var34 = com.google.javascript.jscomp.CodingConventions.getDefault();
    com.google.javascript.jscomp.GoogleCodingConvention var35 = new com.google.javascript.jscomp.GoogleCodingConvention(var34);
    com.google.javascript.rhino.Node var39 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var40 = var39.getDirectives();
    var39.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.IR.exprResult(var39);
    com.google.javascript.jscomp.CodingConvention.Bind var45 = var35.describeFunctionBind(var39);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var46 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var47 = var46.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var48 = new com.google.javascript.jscomp.ComposeWarningsGuard(var47);
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.script(var47);
    boolean var50 = var35.isPrototypeAlias(var49);
    com.google.javascript.rhino.ErrorReporter var51 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var51);
    com.google.javascript.rhino.jstype.JSType var53 = null;
    com.google.javascript.rhino.Node var57 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var58 = var57.getDirectives();
    boolean var59 = var57.isThrow();
    boolean var61 = var57.getBooleanProp(1);
    boolean var62 = var57.isQualifiedName();
    com.google.javascript.rhino.jstype.FunctionType var63 = var52.createFunctionType(var53, var57);
    java.lang.Iterable var65 = var52.getTypesWithProperty("ERROR");
    java.lang.Iterable var67 = var52.getEachReferenceTypeWithProperty("ERROR");
    com.google.javascript.rhino.ErrorReporter var68 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var68);
    com.google.javascript.rhino.jstype.JSType var70 = null;
    com.google.javascript.jscomp.AbstractCompiler var71 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var72 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var73 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var75 = var73.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var76 = var72.getDirectedPredNodes(var75);
    com.google.javascript.jscomp.NodeTraversal.Callback var77 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var71, var76, var77);
    com.google.javascript.rhino.jstype.FunctionType var79 = var69.createFunctionType(var70, var76);
    java.lang.Iterable var80 = var79.getImplementedInterfaces();
    boolean var81 = var79.isStruct();
    java.lang.String var82 = var79.getDisplayName();
    com.google.javascript.jscomp.AbstractCompiler var83 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var84 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var85 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var87 = var85.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var88 = var84.getDirectedPredNodes(var87);
    com.google.javascript.jscomp.NodeTraversal.Callback var89 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var83, var88, var89);
    java.util.Map var91 = null;
    var35.defineDelegateProxyPrototypeProperties(var52, (com.google.javascript.rhino.jstype.StaticScope)var79, var88, var91);
    com.google.javascript.rhino.jstype.ObjectType var93 = var79.toObjectType();
    com.google.javascript.rhino.JSDocInfo var94 = var79.getJSDocInfo();
    com.google.javascript.rhino.jstype.JSType var95 = var31.caseObjectType((com.google.javascript.rhino.jstype.ObjectType)var79);
    boolean var96 = var95.isNominalConstructor();
    com.google.javascript.rhino.jstype.JSType var97 = var95.collapseUnion();
    com.google.javascript.rhino.jstype.JSType[] var98 = new com.google.javascript.rhino.jstype.JSType[] { var97};
    com.google.javascript.rhino.jstype.FunctionType var99 = var1.createFunctionType((com.google.javascript.rhino.jstype.JSType)var26, true, var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var99);

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test97"); }


    com.google.javascript.rhino.Node var3 = new com.google.javascript.rhino.Node(10, 10, 0);
    com.google.javascript.rhino.Node var7 = new com.google.javascript.rhino.Node(100, 1, 10);
    com.google.javascript.rhino.Node var8 = var7.getLastSibling();
    boolean var9 = var7.isGetElem();
    var7.setWasEmptyNode(false);
    com.google.javascript.rhino.Node var12 = var3.useSourceInfoFromForTree(var7);
    com.google.javascript.rhino.Node[] var13 = new com.google.javascript.rhino.Node[] { var12};
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.arraylit(var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.arraylit(var13);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test98"); }


    com.google.javascript.rhino.Node var3 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var4 = var3.getDirectives();
    int var5 = var3.getChangeTime();
    com.google.javascript.rhino.Node var6 = var3.removeFirstChild();
    boolean var7 = var3.isFromExterns();
    com.google.javascript.rhino.Node var11 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var12 = var11.getDirectives();
    var11.putIntProp((-1), 0);
    var11.setSourceEncodedPosition(10);
    com.google.javascript.rhino.Node var18 = var3.useSourceInfoIfMissingFrom(var11);
    com.google.javascript.rhino.Node var22 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var23 = var22.getDirectives();
    var22.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.not(var22);
    com.google.javascript.rhino.jstype.StaticSourceFile var28 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var27);
    com.google.javascript.rhino.Node var32 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var33 = var32.getDirectives();
    int var34 = var32.getChangeTime();
    boolean var35 = var32.isWith();
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.add(var27, var32);
    com.google.javascript.rhino.Node var40 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var41 = var40.getDirectives();
    var40.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.exprResult(var40);
    java.lang.Iterable var46 = var45.siblings();
    com.google.javascript.rhino.Node var47 = var32.useSourceInfoIfMissingFrom(var45);
    com.google.javascript.rhino.Node var48 = var45.cloneTree();
    com.google.javascript.rhino.Node var49 = null;
    var11.addChildrenAfter(var45, var49);
    com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.IR.name("BITXOR 10");
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.Node.newString("hi!", 10, 0);
    java.lang.Object var58 = var56.getProp(1);
    var56.addSuppression("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var61 = com.google.javascript.rhino.IR.function(var11, var52, var56);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
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
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);

  }

  public void test99() {}
//   public void test99() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test99"); }
// 
// 
//     com.google.javascript.jscomp.AbstractCompiler var0 = null;
//     com.google.javascript.jscomp.NodeTraversal.Callback var1 = null;
//     com.google.javascript.jscomp.NodeTraversal var2 = new com.google.javascript.jscomp.NodeTraversal(var0, var1);
//     boolean var3 = var2.hasScope();
//     java.lang.String var4 = var2.getSourceName();
//     com.google.javascript.rhino.Node var5 = var2.getScopeRoot();
// 
//   }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test100"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var1 = var0.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var2 = new com.google.javascript.jscomp.ComposeWarningsGuard(var1);
    com.google.javascript.jscomp.JSModuleGraph var3 = new com.google.javascript.jscomp.JSModuleGraph(var1);
    com.google.javascript.jscomp.AbstractCompiler var4 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var5 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var6 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var8 = var6.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var9 = var5.getDirectedPredNodes(var8);
    com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var4, var9, var10);
    com.google.javascript.jscomp.JSModuleGraph var12 = new com.google.javascript.jscomp.JSModuleGraph(var9);
    com.google.javascript.jscomp.JSModule var14 = new com.google.javascript.jscomp.JSModule("(function (): ?|null)");
    java.io.PrintStream var15 = null;
    com.google.javascript.jscomp.Compiler var16 = new com.google.javascript.jscomp.Compiler(var15);
    var16.reportCodeChange();
    com.google.javascript.jscomp.SourceFile var19 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.lang.String var20 = var19.getOriginalPath();
    com.google.javascript.rhino.Node var21 = var16.parse(var19);
    var14.add(var19);
    java.util.Set var23 = var14.getAllDependencies();
    com.google.javascript.jscomp.JSModule var25 = new com.google.javascript.jscomp.JSModule("(function (): ?|null)");
    var25.clearAsts();
    com.google.javascript.jscomp.JSModule var27 = var12.getDeepestCommonDependencyInclusive(var14, var25);
    com.google.javascript.jscomp.JSModule var29 = new com.google.javascript.jscomp.JSModule("(function (): ?|null)");
    java.io.PrintStream var30 = null;
    com.google.javascript.jscomp.Compiler var31 = new com.google.javascript.jscomp.Compiler(var30);
    var31.reportCodeChange();
    com.google.javascript.jscomp.SourceFile var34 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.lang.String var35 = var34.getOriginalPath();
    com.google.javascript.rhino.Node var36 = var31.parse(var34);
    var29.add(var34);
    java.util.List var38 = var29.getRequires();
    java.io.PrintStream var39 = null;
    com.google.javascript.jscomp.Compiler var40 = new com.google.javascript.jscomp.Compiler(var39);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var41 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var42 = var41.getEdges();
    com.google.javascript.jscomp.NodeTraversal.Callback var43 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var40, var42, var43);
    var29.sortInputsByDeps(var40);
    var14.sortInputsByDeps(var40);
    com.google.javascript.jscomp.JSModule var48 = new com.google.javascript.jscomp.JSModule("(function (): ?|null)");
    var48.clearAsts();
    com.google.javascript.jscomp.JSModule var50 = var3.getDeepestCommonDependencyInclusive(var14, var48);
    java.io.PrintStream var51 = null;
    com.google.javascript.jscomp.Compiler var52 = new com.google.javascript.jscomp.Compiler(var51);
    var52.reportCodeChange();
    com.google.javascript.jscomp.SourceFile var55 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.lang.String var56 = var55.getOriginalPath();
    com.google.javascript.rhino.Node var57 = var52.parse(var55);
    var55.setOriginalPath("{ }");
    var48.addFirst(var55);
    java.lang.String var61 = var55.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "hi!"+ "'", var56.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "hi!"+ "'", var61.equals("hi!"));

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test101"); }


    com.google.javascript.rhino.Node var4 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var5 = var4.getDirectives();
    var4.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.not(var4);
    com.google.javascript.rhino.jstype.StaticSourceFile var10 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var9);
    com.google.javascript.rhino.Node var14 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var15 = var14.getDirectives();
    int var16 = var14.getChangeTime();
    boolean var17 = var14.isWith();
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.add(var9, var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var19 = com.google.javascript.rhino.SimpleErrorReporter.getMessage1("hi!: ERROR", (java.lang.Object)var14);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test102"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.jscomp.AbstractCompiler var3 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var4 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var5 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var7 = var5.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var8 = var4.getDirectedPredNodes(var7);
    com.google.javascript.jscomp.NodeTraversal.Callback var9 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var3, var8, var9);
    com.google.javascript.rhino.jstype.FunctionType var11 = var1.createFunctionType(var2, var8);
    com.google.javascript.rhino.ErrorReporter var13 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13);
    com.google.javascript.rhino.jstype.JSType var15 = null;
    com.google.javascript.jscomp.AbstractCompiler var16 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var17 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var18 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var20 = var18.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var21 = var17.getDirectedPredNodes(var20);
    com.google.javascript.jscomp.NodeTraversal.Callback var22 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var16, var21, var22);
    com.google.javascript.rhino.jstype.FunctionType var24 = var14.createFunctionType(var15, var21);
    com.google.javascript.rhino.Node var25 = null;
    boolean var26 = var11.defineInferredProperty("", (com.google.javascript.rhino.jstype.JSType)var24, var25);
    com.google.javascript.rhino.jstype.FunctionType var27 = var24.toMaybeFunctionType();
    boolean var28 = var24.hasCachedValues();
    com.google.javascript.rhino.jstype.TemplatizedType var29 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplatizedType((com.google.javascript.rhino.jstype.JSType)var24);
    java.lang.Iterable var30 = var24.getParameters();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var31 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var32 = var31.getEdges();
    com.google.javascript.jscomp.deps.SortedDependencies var33 = new com.google.javascript.jscomp.deps.SortedDependencies(var32);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var34 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var35 = var34.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var36 = new com.google.javascript.jscomp.ComposeWarningsGuard(var35);
    com.google.javascript.jscomp.JSModuleGraph var37 = new com.google.javascript.jscomp.JSModuleGraph(var35);
    java.util.List var38 = var33.getSortedDependenciesOf(var35);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var39 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var40 = var39.getEdges();
    java.util.List var41 = var33.getSortedDependenciesOf(var40);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var24.setExtendedInterfaces(var41);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test103"); }


    com.google.javascript.rhino.Node var3 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var4 = var3.getDirectives();
    int var5 = var3.getChangeTime();
    boolean var6 = var3.isAssignAdd();
    java.lang.String var7 = var3.getSourceFileName();
    int var8 = var3.getSourceOffset();
    var3.setType(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test104"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.ErrorReporter var2 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    com.google.javascript.jscomp.AbstractCompiler var5 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var6 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var7 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var9 = var7.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var10 = var6.getDirectedPredNodes(var9);
    com.google.javascript.jscomp.NodeTraversal.Callback var11 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var5, var10, var11);
    com.google.javascript.rhino.jstype.FunctionType var13 = var3.createFunctionType(var4, var10);
    com.google.javascript.rhino.jstype.JSType var14 = var1.createNullableType((com.google.javascript.rhino.jstype.JSType)var13);
    com.google.javascript.rhino.ErrorReporter var15 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var15);
    com.google.javascript.rhino.jstype.JSType var17 = null;
    com.google.javascript.rhino.Node var21 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var22 = var21.getDirectives();
    boolean var23 = var21.isThrow();
    boolean var25 = var21.getBooleanProp(1);
    boolean var26 = var21.isQualifiedName();
    com.google.javascript.rhino.jstype.FunctionType var27 = var16.createFunctionType(var17, var21);
    com.google.javascript.rhino.jstype.JSType[] var28 = new com.google.javascript.rhino.jstype.JSType[] { var17};
    com.google.javascript.rhino.Node var29 = var1.createParameters(var28);
    com.google.javascript.rhino.jstype.TemplateType var31 = var1.createTemplateType("");
    boolean var32 = var31.hasAnyTemplateTypesInternal();
    java.lang.String var33 = var31.getReferenceName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test105"); }


    com.google.javascript.rhino.Node var4 = new com.google.javascript.rhino.Node(10, 10, 0);
    com.google.javascript.rhino.Node var8 = new com.google.javascript.rhino.Node(100, 1, 10);
    com.google.javascript.rhino.Node var9 = var8.getLastSibling();
    boolean var10 = var8.isGetElem();
    var8.setWasEmptyNode(false);
    com.google.javascript.rhino.Node var13 = var4.useSourceInfoFromForTree(var8);
    com.google.javascript.rhino.Node var17 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var18 = var17.getDirectives();
    int var19 = var17.getChangeTime();
    boolean var20 = var17.isAssignAdd();
    java.lang.String var21 = var17.getSourceFileName();
    java.lang.Iterable var22 = var17.children();
    com.google.javascript.jscomp.CodingConvention var23 = com.google.javascript.jscomp.CodingConventions.getDefault();
    com.google.javascript.jscomp.GoogleCodingConvention var24 = new com.google.javascript.jscomp.GoogleCodingConvention(var23);
    com.google.javascript.rhino.Node var28 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var29 = var28.getDirectives();
    var28.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.exprResult(var28);
    com.google.javascript.jscomp.CodingConvention.Bind var34 = var24.describeFunctionBind(var28);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var35 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var36 = var35.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var37 = new com.google.javascript.jscomp.ComposeWarningsGuard(var36);
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.script(var36);
    boolean var39 = var24.isPrototypeAlias(var38);
    com.google.javascript.rhino.Node var40 = new com.google.javascript.rhino.Node((-1), var4, var17, var38);
    com.google.javascript.rhino.jstype.StaticSourceFile var41 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test106"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var2 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var3 = var2.getEdges();
    com.google.javascript.jscomp.deps.SortedDependencies var4 = new com.google.javascript.jscomp.deps.SortedDependencies(var3);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var5 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var6 = var5.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var7 = new com.google.javascript.jscomp.ComposeWarningsGuard(var6);
    com.google.javascript.jscomp.JSModuleGraph var8 = new com.google.javascript.jscomp.JSModuleGraph(var6);
    java.util.List var9 = var4.getSortedDependenciesOf(var6);
    com.google.javascript.rhino.Node var10 = var1.createParametersWithVarArgs(var9);
    com.google.javascript.rhino.ErrorReporter var11 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11);
    com.google.javascript.rhino.jstype.JSType var13 = null;
    com.google.javascript.rhino.Node var17 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var18 = var17.getDirectives();
    boolean var19 = var17.isThrow();
    boolean var21 = var17.getBooleanProp(1);
    boolean var22 = var17.isQualifiedName();
    com.google.javascript.rhino.jstype.FunctionType var23 = var12.createFunctionType(var13, var17);
    boolean var24 = var23.matchesNumberContext();
    com.google.javascript.rhino.ErrorReporter var25 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25);
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.jscomp.AbstractCompiler var28 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var29 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var30 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var32 = var30.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var33 = var29.getDirectedPredNodes(var32);
    com.google.javascript.jscomp.NodeTraversal.Callback var34 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var28, var33, var34);
    com.google.javascript.rhino.jstype.FunctionType var36 = var26.createFunctionType(var27, var33);
    boolean var38 = var26.isForwardDeclaredType("ERROR");
    com.google.javascript.rhino.JSDocInfo var39 = null;
    com.google.javascript.rhino.jstype.ObjectType var40 = var26.createAnonymousObjectType(var39);
    com.google.javascript.jscomp.CodingConvention var42 = com.google.javascript.jscomp.CodingConventions.getDefault();
    com.google.javascript.jscomp.GoogleCodingConvention var43 = new com.google.javascript.jscomp.GoogleCodingConvention(var42);
    com.google.javascript.rhino.Node var47 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var48 = var47.getDirectives();
    var47.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.IR.exprResult(var47);
    com.google.javascript.jscomp.CodingConvention.Bind var53 = var43.describeFunctionBind(var47);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var54 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var55 = var54.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var56 = new com.google.javascript.jscomp.ComposeWarningsGuard(var55);
    com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.script(var55);
    boolean var58 = var43.isPrototypeAlias(var57);
    com.google.javascript.rhino.ErrorReporter var59 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var59);
    com.google.javascript.rhino.jstype.JSType var61 = null;
    com.google.javascript.jscomp.AbstractCompiler var62 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var63 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var64 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var66 = var64.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var67 = var63.getDirectedPredNodes(var66);
    com.google.javascript.jscomp.NodeTraversal.Callback var68 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var62, var67, var68);
    com.google.javascript.rhino.jstype.FunctionType var70 = var60.createFunctionType(var61, var67);
    com.google.javascript.rhino.ErrorReporter var72 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var72);
    com.google.javascript.rhino.jstype.JSType var74 = null;
    com.google.javascript.jscomp.AbstractCompiler var75 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var76 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var77 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var79 = var77.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var80 = var76.getDirectedPredNodes(var79);
    com.google.javascript.jscomp.NodeTraversal.Callback var81 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var75, var80, var81);
    com.google.javascript.rhino.jstype.FunctionType var83 = var73.createFunctionType(var74, var80);
    com.google.javascript.rhino.Node var84 = null;
    boolean var85 = var70.defineInferredProperty("", (com.google.javascript.rhino.jstype.JSType)var83, var84);
    boolean var86 = var70.isReturnTypeInferred();
    com.google.javascript.rhino.jstype.ObjectType var87 = var26.createObjectType("(function (): ?|null)", var57, (com.google.javascript.rhino.jstype.ObjectType)var70);
    boolean var88 = var1.resetImplicitPrototype((com.google.javascript.rhino.jstype.JSType)var23, var87);
    var1.clearTemplateTypeNames();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == true);

  }

  public void test107() {}
//   public void test107() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test107"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled("LABEL_NAME hi!\n", "LABEL_NAME hi!\n");
//     com.google.javascript.jscomp.DiagnosticType[] var3 = new com.google.javascript.jscomp.DiagnosticType[] { var2};
//     com.google.javascript.jscomp.DiagnosticGroup var4 = new com.google.javascript.jscomp.DiagnosticGroup(var3);
//     com.google.javascript.jscomp.CheckLevel var5 = null;
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var6 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var4, var5);
//     com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.disabled("LABEL_NAME hi!\n", "LABEL_NAME hi!\n");
//     com.google.javascript.jscomp.DiagnosticType[] var10 = new com.google.javascript.jscomp.DiagnosticType[] { var9};
//     com.google.javascript.jscomp.DiagnosticGroup var11 = new com.google.javascript.jscomp.DiagnosticGroup(var10);
//     boolean var12 = var6.disables(var11);
// 
//   }

  public void test108() {}
//   public void test108() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test108"); }
// 
// 
//     com.google.javascript.rhino.Node var4 = new com.google.javascript.rhino.Node(10, 10, 0);
//     com.google.javascript.rhino.Node var8 = new com.google.javascript.rhino.Node(10, 10, 0);
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.comma(var4, var8);
//     boolean var10 = var9.isNoSideEffectsCall();
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.warning("hi!", "ERROR");
//     java.lang.String[] var15 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make("", var9, var13, var15);
//     com.google.javascript.jscomp.CompilerOptions var17 = new com.google.javascript.jscomp.CompilerOptions();
//     var17.setPropertyAffinity(false);
//     com.google.javascript.jscomp.CheckLevel var20 = null;
//     var17.setBrokenClosureRequiresLevel(var20);
//     boolean var22 = var16.equals((java.lang.Object)var20);
//     com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.disabled("LABEL_NAME hi!\n", "LABEL_NAME hi!\n");
//     java.lang.String[] var31 = new java.lang.String[] { "Node tree inequality:\nTree1:\nNOT\n    BITXOR 10\n\n\nTree2:\nPARAM_LIST\n\n\nSubtree1: NOT\n    BITXOR 10\n\n\nSubtree2: PARAM_LIST\n"};
//     com.google.javascript.jscomp.JSError var32 = com.google.javascript.jscomp.JSError.make("", 0, 0, var29, var31);
//     com.google.javascript.jscomp.CheckLevel var33 = var32.getDefaultLevel();
//     com.google.javascript.jscomp.DiagnosticType var35 = com.google.javascript.jscomp.DiagnosticType.make("LABEL_NAME hi!\n", var33, "null(null)");
//     java.io.PrintStream var36 = null;
//     com.google.javascript.jscomp.Compiler var37 = new com.google.javascript.jscomp.Compiler(var36);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var38 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.List var39 = var38.getEdges();
//     com.google.javascript.jscomp.NodeTraversal.Callback var40 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var37, var39, var40);
//     double var42 = var37.getProgress();
//     com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var43 = null;
//     com.google.javascript.jscomp.LightweightMessageFormatter var44 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var37, var43);
//     java.lang.String var45 = var16.format(var33, (com.google.javascript.jscomp.MessageFormatter)var44);
//     com.google.javascript.rhino.Node var50 = new com.google.javascript.rhino.Node(10, 10, 0);
//     java.util.Set var51 = var50.getDirectives();
//     int var52 = var50.getChangeTime();
//     boolean var53 = var50.isAssignAdd();
//     java.lang.String var54 = var50.getSourceFileName();
//     java.lang.Iterable var55 = var50.children();
//     boolean var56 = var50.isSyntheticBlock();
//     boolean var57 = var50.isDefaultCase();
//     var50.setType(100);
//     boolean var60 = var50.isNew();
//     com.google.javascript.jscomp.CheckLevel var62 = null;
//     com.google.javascript.jscomp.DiagnosticType var64 = com.google.javascript.jscomp.DiagnosticType.make("", var62, "window");
//     com.google.javascript.rhino.Node var69 = new com.google.javascript.rhino.Node(10, 10, 0);
//     com.google.javascript.rhino.Node var73 = new com.google.javascript.rhino.Node(10, 10, 0);
//     com.google.javascript.rhino.Node var74 = com.google.javascript.rhino.IR.comma(var69, var73);
//     boolean var75 = var74.isNoSideEffectsCall();
//     com.google.javascript.jscomp.DiagnosticType var78 = com.google.javascript.jscomp.DiagnosticType.warning("hi!", "ERROR");
//     java.lang.String[] var80 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var81 = com.google.javascript.jscomp.JSError.make("", var74, var78, var80);
//     com.google.javascript.jscomp.JSError var82 = com.google.javascript.jscomp.JSError.make("goog.exportSymbol", var50, var64, var80);
//     java.lang.String var83 = var44.formatWarning(var82);
// 
//   }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test109"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var2 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var3 = var2.getEdges();
    com.google.javascript.jscomp.deps.SortedDependencies var4 = new com.google.javascript.jscomp.deps.SortedDependencies(var3);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var5 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var6 = var5.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var7 = new com.google.javascript.jscomp.ComposeWarningsGuard(var6);
    com.google.javascript.jscomp.JSModuleGraph var8 = new com.google.javascript.jscomp.JSModuleGraph(var6);
    java.util.List var9 = var4.getSortedDependenciesOf(var6);
    com.google.javascript.rhino.Node var10 = var1.createParametersWithVarArgs(var9);
    com.google.javascript.rhino.ErrorReporter var11 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11);
    com.google.javascript.rhino.jstype.JSType var13 = null;
    com.google.javascript.rhino.Node var17 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var18 = var17.getDirectives();
    boolean var19 = var17.isThrow();
    boolean var21 = var17.getBooleanProp(1);
    boolean var22 = var17.isQualifiedName();
    com.google.javascript.rhino.jstype.FunctionType var23 = var12.createFunctionType(var13, var17);
    boolean var24 = var23.matchesNumberContext();
    com.google.javascript.rhino.ErrorReporter var25 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25);
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.jscomp.AbstractCompiler var28 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var29 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var30 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var32 = var30.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var33 = var29.getDirectedPredNodes(var32);
    com.google.javascript.jscomp.NodeTraversal.Callback var34 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var28, var33, var34);
    com.google.javascript.rhino.jstype.FunctionType var36 = var26.createFunctionType(var27, var33);
    boolean var38 = var26.isForwardDeclaredType("ERROR");
    com.google.javascript.rhino.JSDocInfo var39 = null;
    com.google.javascript.rhino.jstype.ObjectType var40 = var26.createAnonymousObjectType(var39);
    com.google.javascript.jscomp.CodingConvention var42 = com.google.javascript.jscomp.CodingConventions.getDefault();
    com.google.javascript.jscomp.GoogleCodingConvention var43 = new com.google.javascript.jscomp.GoogleCodingConvention(var42);
    com.google.javascript.rhino.Node var47 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var48 = var47.getDirectives();
    var47.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.IR.exprResult(var47);
    com.google.javascript.jscomp.CodingConvention.Bind var53 = var43.describeFunctionBind(var47);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var54 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var55 = var54.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var56 = new com.google.javascript.jscomp.ComposeWarningsGuard(var55);
    com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.script(var55);
    boolean var58 = var43.isPrototypeAlias(var57);
    com.google.javascript.rhino.ErrorReporter var59 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var59);
    com.google.javascript.rhino.jstype.JSType var61 = null;
    com.google.javascript.jscomp.AbstractCompiler var62 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var63 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var64 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var66 = var64.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var67 = var63.getDirectedPredNodes(var66);
    com.google.javascript.jscomp.NodeTraversal.Callback var68 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var62, var67, var68);
    com.google.javascript.rhino.jstype.FunctionType var70 = var60.createFunctionType(var61, var67);
    com.google.javascript.rhino.ErrorReporter var72 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var72);
    com.google.javascript.rhino.jstype.JSType var74 = null;
    com.google.javascript.jscomp.AbstractCompiler var75 = null;
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var76 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var77 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var79 = var77.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var80 = var76.getDirectedPredNodes(var79);
    com.google.javascript.jscomp.NodeTraversal.Callback var81 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(var75, var80, var81);
    com.google.javascript.rhino.jstype.FunctionType var83 = var73.createFunctionType(var74, var80);
    com.google.javascript.rhino.Node var84 = null;
    boolean var85 = var70.defineInferredProperty("", (com.google.javascript.rhino.jstype.JSType)var83, var84);
    boolean var86 = var70.isReturnTypeInferred();
    com.google.javascript.rhino.jstype.ObjectType var87 = var26.createObjectType("(function (): ?|null)", var57, (com.google.javascript.rhino.jstype.ObjectType)var70);
    boolean var88 = var1.resetImplicitPrototype((com.google.javascript.rhino.jstype.JSType)var23, var87);
    com.google.javascript.rhino.jstype.JSType var89 = var23.collapseUnion();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test110"); }


    com.google.javascript.jscomp.SourceFile var1 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.lang.String var2 = var1.getOriginalPath();
    int var4 = var1.getColumnOfOffset(10);
    com.google.javascript.jscomp.JsAst var5 = new com.google.javascript.jscomp.JsAst(var1);
    java.io.PrintStream var6 = null;
    com.google.javascript.jscomp.Compiler var7 = new com.google.javascript.jscomp.Compiler(var6);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var8 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var9 = var8.getEdges();
    com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var7, var9, var10);
    java.lang.String var12 = var7.getAstDotGraph();
    com.google.javascript.jscomp.CompilerOptions var13 = null;
    com.google.javascript.jscomp.DefaultPassConfig var14 = new com.google.javascript.jscomp.DefaultPassConfig(var13);
    var7.setPassConfig((com.google.javascript.jscomp.PassConfig)var14);
    java.io.PrintStream var16 = null;
    com.google.javascript.jscomp.Compiler var17 = new com.google.javascript.jscomp.Compiler(var16);
    var17.reportCodeChange();
    com.google.javascript.jscomp.SourceFile var20 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.lang.String var21 = var20.getOriginalPath();
    com.google.javascript.rhino.Node var22 = var17.parse(var20);
    var20.setOriginalPath("{ }");
    com.google.javascript.rhino.Node var25 = var7.parse(var20);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var26 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var28 = var26.createDirectedGraphNode((java.lang.Object)(-1));
    java.util.List var29 = var26.getGraphvizEdges();
    com.google.javascript.jscomp.NodeTraversal.Callback var30 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var7, var29, var30);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var32 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var33 = var32.getEdges();
    com.google.javascript.jscomp.deps.SortedDependencies var34 = new com.google.javascript.jscomp.deps.SortedDependencies(var33);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var35 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var36 = var35.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var37 = new com.google.javascript.jscomp.ComposeWarningsGuard(var36);
    com.google.javascript.jscomp.JSModuleGraph var38 = new com.google.javascript.jscomp.JSModuleGraph(var36);
    java.util.List var39 = var34.getSortedDependenciesOf(var36);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var40 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var41 = var40.getEdges();
    com.google.javascript.jscomp.CompilerOptions var42 = new com.google.javascript.jscomp.CompilerOptions();
    var42.setNameReferenceReportPath("");
    var42.setSyntheticBlockEndMarker("hi!");
    var42.setTightenTypes(true);
    java.util.Set var49 = null;
    var42.setCssRenamingWhitelist(var49);
    var42.setOptimizeArgumentsArray(true);
    com.google.javascript.jscomp.Result var53 = var7.<com.google.javascript.jscomp.SourceFile>compileModules(var36, var41, var42);
    com.google.javascript.rhino.Node var54 = var7.getRoot();
    com.google.javascript.rhino.Node var55 = var5.getAstRoot((com.google.javascript.jscomp.AbstractCompiler)var7);
    com.google.javascript.rhino.Node var59 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var60 = var59.getDirectives();
    boolean var61 = var59.isThrow();
    boolean var63 = var59.getBooleanProp(1);
    boolean var64 = var59.isCast();
    var59.addSuppression("(function (): ?|null)");
    com.google.javascript.jscomp.SourceFile.Generator var68 = null;
    com.google.javascript.jscomp.SourceFile var69 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var68);
    var59.setStaticSourceFile((com.google.javascript.rhino.jstype.StaticSourceFile)var69);
    var5.setSourceFile(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test111"); }


    com.google.javascript.jscomp.SourceFile var1 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.lang.String var2 = var1.getOriginalPath();
    int var4 = var1.getColumnOfOffset(10);
    com.google.javascript.jscomp.CompilerInput var6 = new com.google.javascript.jscomp.CompilerInput(var1, false);
    java.io.PrintStream var7 = null;
    com.google.javascript.jscomp.Compiler var8 = new com.google.javascript.jscomp.Compiler(var7);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var9 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var10 = var9.getEdges();
    com.google.javascript.jscomp.NodeTraversal.Callback var11 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var8, var10, var11);
    java.lang.String var13 = var8.getAstDotGraph();
    com.google.javascript.jscomp.CompilerOptions var14 = null;
    com.google.javascript.jscomp.DefaultPassConfig var15 = new com.google.javascript.jscomp.DefaultPassConfig(var14);
    var8.setPassConfig((com.google.javascript.jscomp.PassConfig)var15);
    java.io.PrintStream var17 = null;
    com.google.javascript.jscomp.Compiler var18 = new com.google.javascript.jscomp.Compiler(var17);
    var18.reportCodeChange();
    com.google.javascript.jscomp.SourceFile var21 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.lang.String var22 = var21.getOriginalPath();
    com.google.javascript.rhino.Node var23 = var18.parse(var21);
    var21.setOriginalPath("{ }");
    com.google.javascript.rhino.Node var26 = var8.parse(var21);
    var6.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var8);
    com.google.javascript.jscomp.ErrorManager var28 = var8.getErrorManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.optimize();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test112"); }


    com.google.javascript.jscomp.SourceFile var1 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.lang.String var2 = var1.getOriginalPath();
    int var4 = var1.getColumnOfOffset(10);
    com.google.javascript.jscomp.CompilerInput var6 = new com.google.javascript.jscomp.CompilerInput(var1, false);
    java.io.PrintStream var7 = null;
    com.google.javascript.jscomp.Compiler var8 = new com.google.javascript.jscomp.Compiler(var7);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var9 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var10 = var9.getEdges();
    com.google.javascript.jscomp.NodeTraversal.Callback var11 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var8, var10, var11);
    java.lang.String var13 = var8.getAstDotGraph();
    com.google.javascript.jscomp.CompilerOptions var14 = null;
    com.google.javascript.jscomp.DefaultPassConfig var15 = new com.google.javascript.jscomp.DefaultPassConfig(var14);
    var8.setPassConfig((com.google.javascript.jscomp.PassConfig)var15);
    java.io.PrintStream var17 = null;
    com.google.javascript.jscomp.Compiler var18 = new com.google.javascript.jscomp.Compiler(var17);
    var18.reportCodeChange();
    com.google.javascript.jscomp.SourceFile var21 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.lang.String var22 = var21.getOriginalPath();
    com.google.javascript.rhino.Node var23 = var18.parse(var21);
    var21.setOriginalPath("{ }");
    com.google.javascript.rhino.Node var26 = var8.parse(var21);
    var6.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var8);
    java.lang.String var28 = var8.getAstDotGraph();
    com.google.javascript.jscomp.SourceFile var30 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.io.PrintStream var31 = null;
    com.google.javascript.jscomp.Compiler var32 = new com.google.javascript.jscomp.Compiler(var31);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var33 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var34 = var33.getEdges();
    com.google.javascript.jscomp.NodeTraversal.Callback var35 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var32, var34, var35);
    java.lang.String var37 = var32.getAstDotGraph();
    com.google.javascript.jscomp.CompilerOptions var38 = null;
    com.google.javascript.jscomp.DefaultPassConfig var39 = new com.google.javascript.jscomp.DefaultPassConfig(var38);
    var32.setPassConfig((com.google.javascript.jscomp.PassConfig)var39);
    java.io.PrintStream var41 = null;
    com.google.javascript.jscomp.Compiler var42 = new com.google.javascript.jscomp.Compiler(var41);
    var42.reportCodeChange();
    com.google.javascript.jscomp.SourceFile var45 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.lang.String var46 = var45.getOriginalPath();
    com.google.javascript.rhino.Node var47 = var42.parse(var45);
    var45.setOriginalPath("{ }");
    com.google.javascript.rhino.Node var50 = var32.parse(var45);
    boolean var51 = var45.isExtern();
    com.google.javascript.jscomp.CompilerOptions var52 = new com.google.javascript.jscomp.CompilerOptions();
    var52.setPropertyAffinity(false);
    com.google.javascript.jscomp.CheckLevel var55 = null;
    var52.setBrokenClosureRequiresLevel(var55);
    var52.setOptimizeParameters(false);
    var52.setInlineFunctions(true);
    boolean var61 = var52.assumeStrictThis();
    var52.setExtractPrototypeMemberDeclarations(true);
    com.google.javascript.jscomp.Result var64 = var8.compile(var30, var45, var52);
    com.google.javascript.jscomp.SourceMap.Format var65 = null;
    var52.setSourceMapFormat(var65);
    var52.setCheckCaja(true);
    var52.setDevirtualizePrototypeMethods(false);
    var52.setRemoveClosureAsserts(false);
    var52.setCheckControlStructures(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!"+ "'", var46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test113"); }


    com.google.javascript.jscomp.SourceFile var1 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.lang.String var2 = var1.getOriginalPath();
    int var4 = var1.getColumnOfOffset(10);
    com.google.javascript.jscomp.JsAst var5 = new com.google.javascript.jscomp.JsAst(var1);
    java.io.PrintStream var6 = null;
    com.google.javascript.jscomp.Compiler var7 = new com.google.javascript.jscomp.Compiler(var6);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var8 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var9 = var8.getEdges();
    com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var7, var9, var10);
    java.lang.String var12 = var7.getAstDotGraph();
    com.google.javascript.jscomp.CompilerOptions var13 = null;
    com.google.javascript.jscomp.DefaultPassConfig var14 = new com.google.javascript.jscomp.DefaultPassConfig(var13);
    var7.setPassConfig((com.google.javascript.jscomp.PassConfig)var14);
    java.io.PrintStream var16 = null;
    com.google.javascript.jscomp.Compiler var17 = new com.google.javascript.jscomp.Compiler(var16);
    var17.reportCodeChange();
    com.google.javascript.jscomp.SourceFile var20 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
    java.lang.String var21 = var20.getOriginalPath();
    com.google.javascript.rhino.Node var22 = var17.parse(var20);
    var20.setOriginalPath("{ }");
    com.google.javascript.rhino.Node var25 = var7.parse(var20);
    boolean var26 = var20.isExtern();
    var5.setSourceFile(var20);
    java.io.PrintStream var28 = null;
    com.google.javascript.jscomp.Compiler var29 = new com.google.javascript.jscomp.Compiler(var28);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var30 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var31 = var30.getEdges();
    com.google.javascript.jscomp.NodeTraversal.Callback var32 = null;
    com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var29, var31, var32);
    java.lang.String var34 = var29.getAstDotGraph();
    com.google.javascript.jscomp.CompilerOptions var35 = null;
    com.google.javascript.jscomp.DefaultPassConfig var36 = new com.google.javascript.jscomp.DefaultPassConfig(var35);
    var29.setPassConfig((com.google.javascript.jscomp.PassConfig)var36);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var38 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var39 = var38.getEdges();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var40 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var41 = var40.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var42 = new com.google.javascript.jscomp.ComposeWarningsGuard(var41);
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.script(var41);
    com.google.javascript.jscomp.CompilerOptions var44 = new com.google.javascript.jscomp.CompilerOptions();
    var44.setPropertyAffinity(false);
    com.google.javascript.jscomp.CheckLevel var47 = null;
    var44.setBrokenClosureRequiresLevel(var47);
    var29.<com.google.javascript.jscomp.SourceFile>initModules(var39, var41, var44);
    boolean var50 = var29.isTypeCheckingEnabled();
    com.google.javascript.rhino.Node var51 = var5.getAstRoot((com.google.javascript.jscomp.AbstractCompiler)var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var51.setSideEffectFlags(1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + ""+ "'", var34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test114() {}
//   public void test114() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test114"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile var1 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
//     java.lang.String var2 = var1.getOriginalPath();
//     int var4 = var1.getColumnOfOffset(10);
//     com.google.javascript.jscomp.CompilerInput var6 = new com.google.javascript.jscomp.CompilerInput(var1, false);
//     com.google.javascript.jscomp.Region var8 = var6.getRegion(0);
//     java.io.PrintStream var9 = null;
//     com.google.javascript.jscomp.Compiler var10 = new com.google.javascript.jscomp.Compiler(var9);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var11 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.List var12 = var11.getEdges();
//     com.google.javascript.jscomp.NodeTraversal.Callback var13 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var10, var12, var13);
//     java.lang.String var15 = var10.getAstDotGraph();
//     com.google.javascript.jscomp.NodeTraversal.Callback var16 = null;
//     com.google.javascript.jscomp.NodeTraversal var17 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var10, var16);
//     java.io.PrintStream var18 = null;
//     com.google.javascript.jscomp.Compiler var19 = new com.google.javascript.jscomp.Compiler(var18);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var20 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.List var21 = var20.getEdges();
//     com.google.javascript.jscomp.NodeTraversal.Callback var22 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var19, var21, var22);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var24 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.List var25 = var24.getEdges();
//     com.google.javascript.jscomp.deps.SortedDependencies var26 = new com.google.javascript.jscomp.deps.SortedDependencies(var25);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var27 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.List var28 = var27.getEdges();
//     com.google.javascript.jscomp.ComposeWarningsGuard var29 = new com.google.javascript.jscomp.ComposeWarningsGuard(var28);
//     com.google.javascript.jscomp.JSModuleGraph var30 = new com.google.javascript.jscomp.JSModuleGraph(var28);
//     java.util.List var31 = var26.getSortedDependenciesOf(var28);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var32 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.List var33 = var32.getEdges();
//     com.google.javascript.jscomp.ComposeWarningsGuard var34 = new com.google.javascript.jscomp.ComposeWarningsGuard(var33);
//     java.util.List var35 = var26.getSortedDependenciesOf(var33);
//     java.io.PrintStream var36 = null;
//     com.google.javascript.jscomp.Compiler var37 = new com.google.javascript.jscomp.Compiler(var36);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var38 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.List var39 = var38.getEdges();
//     com.google.javascript.jscomp.NodeTraversal.Callback var40 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var37, var39, var40);
//     java.util.List var43 = var26.getDependenciesOf(var39, false);
//     com.google.javascript.jscomp.CompilerOptions var44 = new com.google.javascript.jscomp.CompilerOptions();
//     var44.setNameReferenceReportPath("");
//     var44.setSyntheticBlockEndMarker("hi!");
//     var44.setTightenTypes(true);
//     com.google.javascript.jscomp.Result var51 = var10.<com.google.javascript.jscomp.SourceFile>compileModules(var21, var43, var44);
//     com.google.javascript.jscomp.CompilerOptions var52 = new com.google.javascript.jscomp.CompilerOptions();
//     var52.setPropertyAffinity(false);
//     com.google.javascript.jscomp.CheckLevel var55 = null;
//     var52.setBrokenClosureRequiresLevel(var55);
//     var52.setGenerateExports(false);
//     com.google.javascript.jscomp.MessageFormatter var59 = null;
//     java.util.logging.Logger var60 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var61 = new com.google.javascript.jscomp.LoggerErrorManager(var59, var60);
//     var52.setErrorHandler((com.google.javascript.jscomp.ErrorHandler)var61);
//     int var63 = var61.getWarningCount();
//     var10.setErrorManager((com.google.javascript.jscomp.ErrorManager)var61);
//     var10.reportCodeChange();
//     com.google.javascript.rhino.Node var66 = var6.getAstRoot((com.google.javascript.jscomp.AbstractCompiler)var10);
//     com.google.javascript.jscomp.SourceFile.Generator var68 = null;
//     com.google.javascript.jscomp.SourceFile var69 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", var68);
//     com.google.javascript.jscomp.JSSourceFile var70 = null;
//     com.google.javascript.jscomp.JSSourceFile[] var71 = new com.google.javascript.jscomp.JSSourceFile[] { var70};
//     com.google.javascript.jscomp.CompilerOptions var72 = new com.google.javascript.jscomp.CompilerOptions();
//     var72.setNameReferenceReportPath("");
//     var72.setSyntheticBlockEndMarker("hi!");
//     var72.setTightenTypes(true);
//     com.google.javascript.jscomp.CompilerOptions.LanguageMode var79 = null;
//     var72.setLanguageOut(var79);
//     com.google.javascript.jscomp.VariableMap var81 = null;
//     var72.setInputVariableMap(var81);
//     com.google.javascript.jscomp.Result var83 = var10.compile(var69, var71, var72);
// 
//   }

  public void test115() {}
//   public void test115() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test115"); }
// 
// 
//     com.google.javascript.jscomp.AbstractCompiler var0 = null;
//     com.google.javascript.jscomp.NodeTraversal.Callback var1 = null;
//     com.google.javascript.jscomp.NodeTraversal var2 = new com.google.javascript.jscomp.NodeTraversal(var0, var1);
//     java.lang.String var3 = var2.getSourceName();
//     com.google.javascript.rhino.Node var4 = var2.getCurrentNode();
//     com.google.javascript.rhino.Node var5 = var2.getEnclosingFunction();
//     com.google.javascript.jscomp.JSModule var6 = var2.getModule();
// 
//   }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test116"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setPropertyAffinity(false);
    com.google.javascript.jscomp.CheckLevel var3 = null;
    var0.setBrokenClosureRequiresLevel(var3);
    var0.setOptimizeParameters(false);
    var0.setInlineFunctions(true);
    var0.setTrustedStrings(true);
    var0.setAliasKeywords(false);
    com.google.javascript.jscomp.VariableRenamingPolicy var13 = null;
    com.google.javascript.jscomp.PropertyRenamingPolicy var14 = null;
    var0.setRenamingPolicy(var13, var14);
    com.google.javascript.jscomp.CodingConvention var16 = var0.getCodingConvention();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test117"); }


    com.google.javascript.rhino.Node var4 = new com.google.javascript.rhino.Node(10, 10, 0);
    com.google.javascript.rhino.Node var8 = new com.google.javascript.rhino.Node(100, 1, 10);
    com.google.javascript.rhino.Node var9 = var8.getLastSibling();
    boolean var10 = var8.isGetElem();
    var8.setWasEmptyNode(false);
    com.google.javascript.rhino.Node var13 = var4.useSourceInfoFromForTree(var8);
    com.google.javascript.rhino.Node var17 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var18 = var17.getDirectives();
    int var19 = var17.getChangeTime();
    boolean var20 = var17.isAssignAdd();
    java.lang.String var21 = var17.getSourceFileName();
    java.lang.Iterable var22 = var17.children();
    com.google.javascript.jscomp.CodingConvention var23 = com.google.javascript.jscomp.CodingConventions.getDefault();
    com.google.javascript.jscomp.GoogleCodingConvention var24 = new com.google.javascript.jscomp.GoogleCodingConvention(var23);
    com.google.javascript.rhino.Node var28 = new com.google.javascript.rhino.Node(10, 10, 0);
    java.util.Set var29 = var28.getDirectives();
    var28.putIntProp((-1), 0);
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.exprResult(var28);
    com.google.javascript.jscomp.CodingConvention.Bind var34 = var24.describeFunctionBind(var28);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var35 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.List var36 = var35.getEdges();
    com.google.javascript.jscomp.ComposeWarningsGuard var37 = new com.google.javascript.jscomp.ComposeWarningsGuard(var36);
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.script(var36);
    boolean var39 = var24.isPrototypeAlias(var38);
    com.google.javascript.rhino.Node var40 = new com.google.javascript.rhino.Node((-1), var4, var17, var38);
    boolean var41 = var17.isBlock();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var17.setString("ERROR");
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test118"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.Node.newString("goog.exportSymbol");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test119() throws Throwable {

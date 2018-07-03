
import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.VariableRenamingPolicy var1 = com.google.javascript.jscomp.VariableRenamingPolicy.valueOf("or");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test2"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var3 = new com.google.javascript.jscomp.JSModule("");
    var1.addDependency(var3);
    java.util.List var5 = var1.getRequires();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.JSModuleGraph var6 = new com.google.javascript.jscomp.JSModuleGraph(var5);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test3"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("");
    var3.putIntProp(100, 1);
    com.google.javascript.rhino.Node[] var7 = new com.google.javascript.rhino.Node[] { var3};
    com.google.javascript.rhino.Node var8 = new com.google.javascript.rhino.Node((-1), var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var11 = new com.google.javascript.rhino.Node(409600, var7, 409600, 409600);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test4() {}
//   public void test4() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test4"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Scope var2 = var1.getTopScope();
//     com.google.javascript.jscomp.JSError[] var3 = var1.getWarnings();
// 
//   }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test5"); }


    com.google.javascript.jscomp.SourceFile.Generator var1 = null;
    com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var1);
    java.lang.String var3 = var2.getName();
    com.google.javascript.jscomp.CompilerInput var5 = new com.google.javascript.jscomp.CompilerInput(var2, true);
    com.google.javascript.jscomp.JSModule var7 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var9 = new com.google.javascript.jscomp.JSModule("");
    var7.addDependency(var9);
    java.util.List var11 = var7.getDependencies();
    java.util.List var12 = var7.getRequires();
    com.google.javascript.jscomp.SourceAst var13 = null;
    com.google.javascript.jscomp.CompilerInput var16 = new com.google.javascript.jscomp.CompilerInput(var13, "", true);
    com.google.javascript.jscomp.SourceAst var17 = var16.getSourceAst();
    var7.remove(var16);
    var5.setModule(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var20 = var7.getPathRelativeToClosureBase();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test6"); }


    com.google.javascript.rhino.Node var2 = new com.google.javascript.rhino.Node(100);
    com.google.javascript.jscomp.CheckLevel var4 = null;
    com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.make("", var4, "(ERROR)");
    com.google.javascript.jscomp.CheckLevel var8 = null;
    com.google.javascript.jscomp.DiagnosticType var10 = com.google.javascript.jscomp.DiagnosticType.make("", var8, "(ERROR)");
    int var11 = var6.compareTo(var10);
    java.lang.String[] var13 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
    com.google.javascript.jscomp.JSError var14 = com.google.javascript.jscomp.JSError.make(var10, var13);
    com.google.javascript.jscomp.CheckLevel var16 = null;
    com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.make("", var16, "(ERROR)");
    com.google.javascript.jscomp.CheckLevel var20 = null;
    com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.make("", var20, "(ERROR)");
    int var23 = var18.compareTo(var22);
    java.lang.String[] var25 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
    com.google.javascript.jscomp.JSError var26 = com.google.javascript.jscomp.JSError.make(var22, var25);
    com.google.javascript.jscomp.JSError var27 = com.google.javascript.jscomp.JSError.make(var10, var25);
    com.google.javascript.jscomp.CheckLevel var29 = null;
    com.google.javascript.jscomp.DiagnosticType var31 = com.google.javascript.jscomp.DiagnosticType.make("", var29, "(ERROR)");
    com.google.javascript.jscomp.CheckLevel var33 = null;
    com.google.javascript.jscomp.DiagnosticType var35 = com.google.javascript.jscomp.DiagnosticType.make("", var33, "(ERROR)");
    int var36 = var31.compareTo(var35);
    java.lang.String[] var38 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
    com.google.javascript.jscomp.JSError var39 = com.google.javascript.jscomp.JSError.make(var35, var38);
    com.google.javascript.jscomp.JSError var40 = com.google.javascript.jscomp.JSError.make("LinkedGraph", var2, var10, var38);
    com.google.javascript.rhino.ErrorReporter var41 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var41);
    boolean var44 = var42.hasNamespace("hi!");
    var42.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var46 = null;
    com.google.javascript.rhino.jstype.JSType var47 = null;
    com.google.javascript.rhino.jstype.JSType[] var48 = new com.google.javascript.rhino.jstype.JSType[] { var47};
    com.google.javascript.rhino.jstype.FunctionType var49 = var42.createConstructorType(var46, var48);
    boolean var50 = var49.canBeCalled();
    com.google.javascript.rhino.ErrorReporter var51 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var51);
    boolean var54 = var52.hasNamespace("hi!");
    var52.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var56 = null;
    com.google.javascript.rhino.jstype.JSType var57 = null;
    com.google.javascript.rhino.jstype.JSType[] var58 = new com.google.javascript.rhino.jstype.JSType[] { var57};
    com.google.javascript.rhino.jstype.FunctionType var59 = var52.createConstructorType(var56, var58);
    com.google.javascript.rhino.jstype.ObjectType var60 = var52.createAnonymousObjectType();
    boolean var61 = var60.isVoidType();
    com.google.javascript.rhino.ErrorReporter var62 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var62);
    boolean var65 = var63.hasNamespace("hi!");
    var63.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var67 = null;
    com.google.javascript.rhino.jstype.JSType var68 = null;
    com.google.javascript.rhino.jstype.JSType[] var69 = new com.google.javascript.rhino.jstype.JSType[] { var68};
    com.google.javascript.rhino.jstype.FunctionType var70 = var63.createConstructorType(var67, var69);
    boolean var71 = var70.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var72 = var60.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var70);
    boolean var73 = var60.isEmptyType();
    boolean var74 = var49.isEquivalentTo((com.google.javascript.rhino.jstype.JSType)var60);
    com.google.javascript.rhino.jstype.FunctionPrototypeType var75 = null;
    boolean var76 = var49.setPrototype(var75);
    com.google.javascript.rhino.JSDocInfo var78 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Set var79 = var78.getSuppressions();
    boolean var80 = var78.isConstructor();
    boolean var81 = var78.isExterns();
    var49.setPropertyJSDocInfo("-1", var78, false);
    boolean var84 = var78.isDefine();
    boolean var85 = var78.isJavaDispatch();
    var2.setJSDocInfo(var78);
    boolean var87 = var78.hasEnumParameterType();
    java.util.List var88 = var78.getThrownTypes();
    com.google.javascript.jscomp.ComposeWarningsGuard var89 = new com.google.javascript.jscomp.ComposeWarningsGuard(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test7"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("");
    var3.putIntProp(100, 1);
    com.google.javascript.rhino.Node[] var7 = new com.google.javascript.rhino.Node[] { var3};
    com.google.javascript.rhino.Node var8 = new com.google.javascript.rhino.Node((-1), var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var9 = new com.google.javascript.rhino.Node(100, var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test8"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    var0.pushEdgeAnnotations();
    com.google.javascript.rhino.ErrorReporter var3 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var3);
    boolean var6 = var4.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var7 = new com.google.javascript.rhino.jstype.FunctionBuilder(var4);
    com.google.javascript.rhino.jstype.JSType var9 = var4.getType("STRING ");
    com.google.javascript.rhino.ErrorReporter var10 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var10);
    boolean var13 = var11.hasNamespace("hi!");
    var11.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var15 = null;
    com.google.javascript.rhino.jstype.JSType var16 = null;
    com.google.javascript.rhino.jstype.JSType[] var17 = new com.google.javascript.rhino.jstype.JSType[] { var16};
    com.google.javascript.rhino.jstype.FunctionType var18 = var11.createConstructorType(var15, var17);
    boolean var19 = var18.canBeCalled();
    com.google.javascript.rhino.jstype.JSType var20 = var18.getReturnType();
    com.google.javascript.rhino.jstype.JSType var22 = var4.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType)var18, "");
    var4.setLastGeneration(false);
    boolean var26 = var4.hasNamespace("-1");
    com.google.javascript.rhino.ErrorReporter var27 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var27);
    boolean var30 = var28.hasNamespace("hi!");
    var28.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var32 = null;
    com.google.javascript.rhino.jstype.JSType var33 = null;
    com.google.javascript.rhino.jstype.JSType[] var34 = new com.google.javascript.rhino.jstype.JSType[] { var33};
    com.google.javascript.rhino.jstype.FunctionType var35 = var28.createConstructorType(var32, var34);
    com.google.javascript.rhino.jstype.RecordTypeBuilder var36 = new com.google.javascript.rhino.jstype.RecordTypeBuilder(var28);
    com.google.javascript.rhino.ErrorReporter var37 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var37);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var39 = var0.isConnected((java.lang.Object)var26, (java.lang.Object)var36, (java.lang.Object)var38);
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test9"); }


    java.util.logging.Logger var0 = null;
    com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
    com.google.javascript.jscomp.Compiler var2 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var1);
    var2.reportCodeChange();
    com.google.javascript.jscomp.SourceMap var4 = var2.getSourceMap();
    com.google.javascript.jscomp.DefaultCodingConvention var5 = new com.google.javascript.jscomp.DefaultCodingConvention();
    com.google.javascript.rhino.jstype.FunctionType var6 = null;
    com.google.javascript.rhino.jstype.FunctionType var7 = null;
    com.google.javascript.jscomp.CodingConvention.SubclassType var8 = null;
    var5.applySubclassRelationship(var6, var7, var8);
    java.lang.String var10 = var5.getDelegateSuperclassName();
    boolean var13 = var5.isExported("", false);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newString("");
    var16.putIntProp(100, 1);
    com.google.javascript.rhino.Node var20 = var16.removeFirstChild();
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var30 = new com.google.javascript.rhino.Node(1, var16, var22, var27, 1, 1);
    boolean var31 = var5.isVarArgsParameter(var16);
    java.io.PrintStream var32 = null;
    com.google.javascript.jscomp.Compiler var33 = new com.google.javascript.jscomp.Compiler(var32);
    com.google.javascript.jscomp.Region var36 = var33.getSourceRegion("", 0);
    com.google.javascript.jscomp.Region var39 = var33.getSourceRegion("", 0);
    com.google.javascript.jscomp.Compiler.IntermediateState var40 = var33.getState();
    com.google.javascript.jscomp.NodeTraversal.Callback var41 = null;
    com.google.javascript.jscomp.NodeTraversal var42 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var33, var41);
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.Node.newString("");
    var45.putIntProp(100, 1);
    com.google.javascript.rhino.Node var49 = var45.removeFirstChild();
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var59 = new com.google.javascript.rhino.Node(1, var45, var51, var56, 1, 1);
    com.google.javascript.rhino.JSDocInfo var60 = var51.getJSDocInfo();
    var51.setSourcePositionForTree(100);
    java.lang.Object var64 = null;
    var51.putProp((-1), var64);
    com.google.javascript.rhino.Node var70 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    var70.setIsSyntheticBlock(true);
    java.lang.String var73 = var70.getString();
    var70.detachChildren();
    boolean var75 = var51.hasChild(var70);
    com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast var76 = var5.getObjectLiteralCast(var42, var70);
    com.google.javascript.jscomp.NodeTraversal.Callback var77 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.NodeTraversal.traverse((com.google.javascript.jscomp.AbstractCompiler)var2, var70, var77);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + ""+ "'", var73.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test10"); }


    com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
    com.google.javascript.rhino.ErrorReporter var1 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var1);
    boolean var4 = var2.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var5 = new com.google.javascript.rhino.jstype.FunctionBuilder(var2);
    com.google.javascript.rhino.ErrorReporter var6 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var6);
    boolean var9 = var7.hasNamespace("hi!");
    var7.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var11 = null;
    com.google.javascript.rhino.jstype.JSType var12 = null;
    com.google.javascript.rhino.jstype.JSType[] var13 = new com.google.javascript.rhino.jstype.JSType[] { var12};
    com.google.javascript.rhino.jstype.FunctionType var14 = var7.createConstructorType(var11, var13);
    boolean var15 = var14.canBeCalled();
    com.google.javascript.rhino.jstype.FunctionBuilder var17 = var5.withReturnType((com.google.javascript.rhino.jstype.JSType)var14, false);
    com.google.javascript.rhino.jstype.FunctionType var18 = var5.build();
    com.google.javascript.rhino.jstype.FunctionBuilder var20 = var5.withTemplateName("or");
    com.google.javascript.rhino.ErrorReporter var21 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21);
    boolean var24 = var22.hasNamespace("hi!");
    var22.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var26 = null;
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.rhino.jstype.JSType[] var28 = new com.google.javascript.rhino.jstype.JSType[] { var27};
    com.google.javascript.rhino.jstype.FunctionType var29 = var22.createConstructorType(var26, var28);
    boolean var30 = var29.canBeCalled();
    boolean var31 = var29.isConstructor();
    com.google.javascript.rhino.jstype.FunctionBuilder var32 = var5.withReturnType((com.google.javascript.rhino.jstype.JSType)var29);
    com.google.javascript.rhino.ErrorReporter var33 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33);
    boolean var36 = var34.hasNamespace("hi!");
    var34.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var38 = null;
    com.google.javascript.rhino.jstype.JSType var39 = null;
    com.google.javascript.rhino.jstype.JSType[] var40 = new com.google.javascript.rhino.jstype.JSType[] { var39};
    com.google.javascript.rhino.jstype.FunctionType var41 = var34.createConstructorType(var38, var40);
    boolean var42 = var41.canBeCalled();
    boolean var43 = var41.isConstructor();
    com.google.javascript.rhino.ErrorReporter var44 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var44);
    boolean var47 = var45.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var48 = new com.google.javascript.rhino.jstype.FunctionBuilder(var45);
    com.google.javascript.rhino.ErrorReporter var49 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var49);
    boolean var52 = var50.hasNamespace("hi!");
    var50.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var54 = null;
    com.google.javascript.rhino.jstype.JSType var55 = null;
    com.google.javascript.rhino.jstype.JSType[] var56 = new com.google.javascript.rhino.jstype.JSType[] { var55};
    com.google.javascript.rhino.jstype.FunctionType var57 = var50.createConstructorType(var54, var56);
    boolean var58 = var57.canBeCalled();
    com.google.javascript.rhino.jstype.FunctionBuilder var60 = var48.withReturnType((com.google.javascript.rhino.jstype.JSType)var57, false);
    com.google.javascript.rhino.jstype.FunctionType var61 = var48.build();
    com.google.javascript.rhino.jstype.FunctionBuilder var63 = var48.withTemplateName("or");
    com.google.javascript.rhino.jstype.FunctionType var64 = var48.build();
    java.lang.Iterable var65 = var64.getCtorExtendedInterfaces();
    var0.applySingletonGetter(var29, var41, (com.google.javascript.rhino.jstype.ObjectType)var64);
    boolean var68 = var0.isPrivate("com.google.javascript.rhino.EvaluatorException: hi! (#10)");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);

  }

  public void test11() {}
//   public void test11() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test11"); }
// 
// 
//     com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot var0 = null;
//     com.google.javascript.jscomp.parsing.Config.LanguageMode var3 = null;
//     com.google.javascript.jscomp.parsing.Config var5 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(false, var3, true);
//     com.google.javascript.jscomp.mozilla.rhino.ErrorReporter var6 = null;
//     com.google.javascript.rhino.Node var7 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(var0, "DiagnosticGroup<STRING >(null)", var5, var6);
// 
//   }

  public void test12() {}
//   public void test12() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test12"); }
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
//     boolean var17 = var13.isNumberObjectType();
//     com.google.javascript.rhino.jstype.JSType var18 = null;
//     com.google.javascript.rhino.jstype.JSType.TypePair var19 = var13.getTypesUnderInequality(var18);
// 
//   }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test13"); }


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
    boolean var98 = var59.hasOwnProperty(". (ERROR) at ERROR  100 [synthetic: 1]\n line 1 : 1");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var98 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test14"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.overwriteDeclaredType("<unknown=409600>", (com.google.javascript.rhino.jstype.JSType)var42);
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

  }

  public void test15() {}
//   public void test15() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test15"); }
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
//     com.google.javascript.jscomp.JSError[] var12 = var0.getMessages();
// 
//   }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test16"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    var4.setIsSyntheticBlock(true);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("");
    var9.putIntProp(100, 1);
    com.google.javascript.rhino.Node var13 = var9.removeFirstChild();
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var23 = new com.google.javascript.rhino.Node(1, var9, var15, var20, 1, 1);
    boolean var24 = var15.hasSideEffects();
    com.google.javascript.rhino.Node var25 = var15.getLastSibling();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.addChildToFront(var25);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test17"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.Node.newString("");
    var2.putIntProp(100, 1);
    com.google.javascript.rhino.Node var6 = var2.removeFirstChild();
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var16 = new com.google.javascript.rhino.Node(1, var2, var8, var13, 1, 1);
    boolean var18 = var16.getBooleanProp(0);
    com.google.javascript.rhino.Node var19 = var16.getNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test18() {}
//   public void test18() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test18"); }
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
//     boolean var11 = var8.hasProperty("LinkedGraph");
//     com.google.javascript.rhino.jstype.ObjectType var12 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType)var8);
//     java.lang.String var13 = var12.toDebugHashCodeString();
// 
//   }

  public void test19() {}
//   public void test19() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test19"); }
// 
// 
//     java.io.Reader var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromReader("-1", var1);
// 
//   }

  public void test20() {}
//   public void test20() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test20"); }
// 
// 
//     java.io.InputStream var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromInputStream("(ERROR)", var1);
// 
//   }

  public void test21() {}
//   public void test21() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test21"); }
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
//     com.google.javascript.rhino.jstype.JSType[] var14 = null;
//     boolean var15 = var1.addOptionalParams(var14);
// 
//   }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test22"); }


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
    boolean var57 = var8.isVoidType();
    boolean var58 = var8.isEnumType();
    
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
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);

  }

  public void test23() {}
//   public void test23() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test23"); }
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
//     var0.rebuildInputsFromModules();
// 
//   }

  public void test24() {}
//   public void test24() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test24"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = null;
//     com.google.javascript.rhino.Context var1 = com.google.javascript.rhino.Context.enter(var0);
//     int var2 = var1.getOptimizationLevel();
//     boolean var3 = var1.hasCompileFunctionsWithDynamicScope();
//     java.lang.Object var4 = var1.getDebuggerContextData();
//     int var5 = var1.getInstructionObserverThreshold();
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
//   }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test25"); }


    boolean var1 = com.google.javascript.rhino.Context.isValidOptimizationLevel(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test26"); }


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
    boolean var22 = var21.isNoObjectType();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test27"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.Scope var2 = var1.getTopScope();
    com.google.javascript.jscomp.Scope var3 = var1.getTopScope();
    com.google.javascript.jscomp.ErrorManager var4 = var1.getErrorManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.optimize();
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

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test28"); }


    com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromCode("TypeError", "", ". (ERROR) at (unknown source) line (unknown line) : (unknown column)");
    java.lang.String var5 = var3.getLine(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test29"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    boolean var2 = var1.recordJavaDispatch();
    com.google.javascript.rhino.JSDocInfoBuilder var4 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var11 = new com.google.javascript.rhino.JSTypeExpression(var9, "");
    boolean var13 = var11.equals((java.lang.Object)'4');
    boolean var14 = var4.recordBaseType(var11);
    boolean var15 = var1.recordExtendedInterface(var11);
    com.google.javascript.rhino.JSTypeExpression var16 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(var11);
    
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
    assertNotNull(var16);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test30"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("");
    var3.putIntProp(100, 1);
    com.google.javascript.rhino.Node[] var7 = new com.google.javascript.rhino.Node[] { var3};
    com.google.javascript.rhino.Node var8 = new com.google.javascript.rhino.Node((-1), var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var9 = new com.google.javascript.rhino.Node(1, var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test31"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    java.lang.String var1 = var0.getOriginalCommentString();
    boolean var2 = var0.isOverride();
    java.util.Collection var3 = var0.getAuthors();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test32"); }


    com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.JSModule var2 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var4 = new com.google.javascript.jscomp.JSModule("");
    var2.addDependency(var4);
    java.util.List var6 = var2.getDependencies();
    com.google.javascript.jscomp.JSModule var8 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var10 = new com.google.javascript.jscomp.JSModule("");
    var8.addDependency(var10);
    var2.addDependency(var8);
    var8.clearAsts();
    java.util.List var14 = var8.getRequires();
    com.google.javascript.rhino.JSDocInfo var15 = new com.google.javascript.rhino.JSDocInfo();
    java.lang.String var16 = var15.getOriginalCommentString();
    boolean var17 = var15.isOverride();
    java.util.List var18 = var15.getThrownTypes();
    com.google.javascript.jscomp.CompilerOptions var19 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.VariableRenamingPolicy var20 = null;
    com.google.javascript.jscomp.PropertyRenamingPolicy var21 = null;
    var19.setRenamingPolicy(var20, var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.Result var23 = var0.compile(var14, var18, var19);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test33"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    boolean var2 = var1.recordNoSideEffects();
    com.google.javascript.rhino.JSDocInfoBuilder var4 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var11 = new com.google.javascript.rhino.JSTypeExpression(var9, "");
    boolean var13 = var11.equals((java.lang.Object)'4');
    boolean var14 = var4.recordBaseType(var11);
    boolean var15 = var1.recordDefineType(var11);
    boolean var16 = var1.isDescriptionRecorded();
    boolean var17 = var1.isConstructorRecorded();
    com.google.javascript.rhino.JSDocInfoBuilder var19 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var26 = new com.google.javascript.rhino.JSTypeExpression(var24, "");
    boolean var28 = var26.equals((java.lang.Object)'4');
    boolean var29 = var19.recordBaseType(var26);
    boolean var30 = var26.isVarArgs();
    boolean var31 = var1.recordReturnType(var26);
    boolean var32 = var1.isPopulatedWithFileOverview();
    
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
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test34"); }


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
    boolean var98 = var97.isEnumElementType();
    
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
    assertTrue(var98 == false);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test35"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.lang.Iterable var1 = var0.getDirectedGraphNodes();
    var0.clearEdgeAnnotations();
    java.util.List var3 = var0.getEdges();
    com.google.javascript.rhino.ErrorReporter var4 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var4);
    boolean var7 = var5.hasNamespace("hi!");
    var5.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var9 = null;
    com.google.javascript.rhino.jstype.JSType var10 = null;
    com.google.javascript.rhino.jstype.JSType[] var11 = new com.google.javascript.rhino.jstype.JSType[] { var10};
    com.google.javascript.rhino.jstype.FunctionType var12 = var5.createConstructorType(var9, var11);
    com.google.javascript.rhino.ErrorReporter var13 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13);
    boolean var16 = var14.hasNamespace("hi!");
    var14.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var18 = null;
    com.google.javascript.rhino.jstype.JSType var19 = null;
    com.google.javascript.rhino.jstype.JSType[] var20 = new com.google.javascript.rhino.jstype.JSType[] { var19};
    com.google.javascript.rhino.jstype.FunctionType var21 = var14.createConstructorType(var18, var20);
    boolean var22 = var21.canBeCalled();
    var12.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var21);
    boolean var25 = var21.hasOwnProperty("");
    boolean var26 = var21.isAllType();
    boolean var27 = var21.isNullType();
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
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test36"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.Node.newString("");
    var1.putIntProp(100, 1);
    int var5 = var1.getSourcePosition();
    com.google.javascript.rhino.Node var6 = var1.removeFirstChild();
    java.lang.String var7 = com.google.javascript.jscomp.NodeUtil.getSourceName(var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var8 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(var1);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test37() {}
//   public void test37() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test37"); }
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
//     boolean var8 = var4.hasErrors();
// 
//   }

  public void test38() {}
//   public void test38() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test38"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.lang.Iterable var1 = var0.getDirectedGraphNodes();
//     var0.clearEdgeAnnotations();
//     com.google.javascript.jscomp.graph.SubGraph var3 = var0.newSubGraph();
//     var0.popEdgeAnnotations();
// 
//   }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test39"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
    com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
    com.google.javascript.jscomp.Compiler.IntermediateState var8 = var1.getState();
    com.google.javascript.jscomp.SourceMap var9 = var1.getSourceMap();
    com.google.javascript.jscomp.JSModule var11 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var13 = new com.google.javascript.jscomp.JSModule("");
    var11.addDependency(var13);
    java.util.List var15 = var11.getDependencies();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var16 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var17 = var16.getNodes();
    java.lang.Iterable var18 = var16.getDirectedGraphNodes();
    java.util.List var19 = var16.getGraphvizNodes();
    com.google.javascript.jscomp.CompilerOptions var20 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler var21 = var20.getAliasTransformationHandler();
    var20.setTweakToNumberLiteral("hi!", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.Result var25 = var1.compile(var15, var19, var20);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
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

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test40"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    var1.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var5 = null;
    com.google.javascript.rhino.jstype.JSType var6 = null;
    com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
    com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
    boolean var9 = var8.canBeCalled();
    boolean var11 = var8.hasProperty("LinkedGraph");
    com.google.javascript.rhino.jstype.ObjectType var12 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType)var8);
    com.google.javascript.rhino.jstype.BooleanLiteralSet var13 = var8.getPossibleToBooleanOutcomes();
    java.lang.Class var14 = var13.getDeclaringClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test41() {}
//   public void test41() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test41"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Compiler.IntermediateState var8 = var1.getState();
//     com.google.javascript.jscomp.SourceMap var9 = var1.getSourceMap();
//     com.google.javascript.jscomp.SourceFile.Generator var11 = null;
//     com.google.javascript.jscomp.JSSourceFile var12 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var11);
//     java.lang.String var13 = var12.getName();
//     var12.setOriginalPath("");
//     com.google.javascript.jscomp.SourceFile.Generator var17 = null;
//     com.google.javascript.jscomp.JSSourceFile var18 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var17);
//     java.lang.String var19 = var18.getName();
//     com.google.javascript.jscomp.CompilerOptions var20 = new com.google.javascript.jscomp.CompilerOptions();
//     com.google.javascript.jscomp.CodingConvention var21 = var20.getCodingConvention();
//     var20.enableExternExports(true);
//     boolean var24 = var20.isExternExportsEnabled();
//     com.google.javascript.jscomp.Result var25 = var1.compile(var12, var18, var20);
//     var1.parse();
// 
//   }

  public void test42() {}
//   public void test42() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test42"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.Collection var1 = var0.getNodes();
//     var0.pushEdgeAnnotations();
//     boolean var3 = var0.isDirected();
//     boolean var4 = var0.isDirected();
//     com.google.javascript.rhino.ErrorReporter var5 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var5);
//     boolean var8 = var6.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.FunctionBuilder var9 = new com.google.javascript.rhino.jstype.FunctionBuilder(var6);
//     com.google.javascript.rhino.ErrorReporter var10 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var10);
//     boolean var13 = var11.hasNamespace("hi!");
//     var11.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var15 = null;
//     com.google.javascript.rhino.jstype.JSType var16 = null;
//     com.google.javascript.rhino.jstype.JSType[] var17 = new com.google.javascript.rhino.jstype.JSType[] { var16};
//     com.google.javascript.rhino.jstype.FunctionType var18 = var11.createConstructorType(var15, var17);
//     boolean var19 = var18.canBeCalled();
//     com.google.javascript.rhino.jstype.FunctionBuilder var21 = var9.withReturnType((com.google.javascript.rhino.jstype.JSType)var18, false);
//     boolean var22 = var18.canBeCalled();
//     com.google.javascript.rhino.ErrorReporter var23 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var23);
//     boolean var26 = var24.hasNamespace("hi!");
//     var24.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var28 = null;
//     com.google.javascript.rhino.jstype.JSType var29 = null;
//     com.google.javascript.rhino.jstype.JSType[] var30 = new com.google.javascript.rhino.jstype.JSType[] { var29};
//     com.google.javascript.rhino.jstype.FunctionType var31 = var24.createConstructorType(var28, var30);
//     com.google.javascript.rhino.jstype.ObjectType var32 = var24.createAnonymousObjectType();
//     boolean var33 = var32.isVoidType();
//     com.google.javascript.rhino.ErrorReporter var34 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var34);
//     boolean var37 = var35.hasNamespace("hi!");
//     var35.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var39 = null;
//     com.google.javascript.rhino.jstype.JSType var40 = null;
//     com.google.javascript.rhino.jstype.JSType[] var41 = new com.google.javascript.rhino.jstype.JSType[] { var40};
//     com.google.javascript.rhino.jstype.FunctionType var42 = var35.createConstructorType(var39, var41);
//     boolean var43 = var42.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType.TypePair var44 = var32.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var42);
//     boolean var45 = var32.isEmptyType();
//     var18.setPrototypeBasedOn(var32);
//     java.lang.Object var47 = null;
//     com.google.javascript.jscomp.SourceFile var49 = com.google.javascript.jscomp.SourceFile.fromFile("ERROR  100 [synthetic: 1]\n");
//     com.google.javascript.jscomp.JsAst var50 = new com.google.javascript.jscomp.JsAst(var49);
//     com.google.javascript.jscomp.SourceFile var52 = com.google.javascript.jscomp.SourceFile.fromFile("ERROR  100 [synthetic: 1]\n");
//     var50.setSourceFile(var52);
//     com.google.javascript.jscomp.SourceFile var55 = com.google.javascript.jscomp.SourceFile.fromFile("ERROR  100 [synthetic: 1]\n");
//     com.google.javascript.jscomp.JsAst var56 = new com.google.javascript.jscomp.JsAst(var55);
//     com.google.javascript.jscomp.SourceFile var58 = com.google.javascript.jscomp.SourceFile.fromFile("ERROR  100 [synthetic: 1]\n");
//     var56.setSourceFile(var58);
//     java.io.PrintStream var60 = null;
//     com.google.javascript.jscomp.Compiler var61 = new com.google.javascript.jscomp.Compiler(var60);
//     com.google.javascript.jscomp.Region var64 = var61.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var67 = var61.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var68 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var61);
//     com.google.javascript.jscomp.Compiler.IntermediateState var69 = var61.getState();
//     com.google.javascript.jscomp.SourceFile.Generator var71 = null;
//     com.google.javascript.jscomp.JSSourceFile var72 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var71);
//     com.google.javascript.jscomp.CompilerInput var74 = new com.google.javascript.jscomp.CompilerInput(var72, false);
//     com.google.javascript.jscomp.SourceFile.Generator var76 = null;
//     com.google.javascript.jscomp.JSSourceFile var77 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var76);
//     java.lang.String var78 = var77.getName();
//     com.google.javascript.jscomp.CompilerOptions var79 = new com.google.javascript.jscomp.CompilerOptions();
//     com.google.javascript.jscomp.VariableRenamingPolicy var80 = null;
//     com.google.javascript.jscomp.PropertyRenamingPolicy var81 = null;
//     var79.setRenamingPolicy(var80, var81);
//     com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler var83 = null;
//     var79.setAliasTransformationHandler(var83);
//     com.google.javascript.jscomp.Result var85 = var61.compile(var72, var77, var79);
//     com.google.javascript.rhino.Node var86 = var56.getAstRoot((com.google.javascript.jscomp.AbstractCompiler)var61);
//     com.google.javascript.rhino.Node var87 = var50.getAstRoot((com.google.javascript.jscomp.AbstractCompiler)var61);
//     boolean var88 = var0.isConnectedInDirection((java.lang.Object)var18, var47, (java.lang.Object)var50);
// 
//   }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test43"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.PropertyRenamingPolicy var1 = com.google.javascript.jscomp.PropertyRenamingPolicy.valueOf("-1");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test44"); }


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
    java.io.PrintStream var15 = null;
    com.google.javascript.jscomp.Compiler var16 = new com.google.javascript.jscomp.Compiler(var15);
    com.google.javascript.jscomp.Region var19 = var16.getSourceRegion("", 0);
    com.google.javascript.jscomp.LightweightMessageFormatter var20 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.sortInputsByDeps(var16);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test45"); }


    java.lang.String var1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("LinkedGraph");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "(LinkedGraph)"+ "'", var1.equals("(LinkedGraph)"));

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test46"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Set var1 = var0.getSuppressions();
    java.util.Collection var2 = var0.getAuthors();
    boolean var3 = var0.isNoAlias();
    boolean var4 = var0.isOverride();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test47() {}
//   public void test47() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test47"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "", true);
//     com.google.javascript.jscomp.SourceAst var4 = var3.getSourceAst();
//     com.google.javascript.jscomp.CompilerInput var7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var3, "", false);
//     java.lang.String var8 = var3.getCode();
// 
//   }

  public void test48() {}
//   public void test48() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test48"); }
// 
// 
//     java.io.InputStream var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromInputStream("<No stack trace available>", var1);
// 
//   }

  public void test49() {}
//   public void test49() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test49"); }
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
//     var37.setIsSyntheticBlock(false);
//     var37.setIsSyntheticBlock(false);
//     java.lang.String var42 = var37.toStringTree();
// 
//   }

  public void test50() {}
//   public void test50() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test50"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = null;
//     com.google.javascript.rhino.Context var1 = com.google.javascript.rhino.Context.enter(var0);
//     var1.addActivationName("");
//     java.beans.PropertyChangeListener var4 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var1.addPropertyChangeListener(var4);
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

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test51"); }


    com.google.javascript.rhino.EvaluatorException var3 = new com.google.javascript.rhino.EvaluatorException("hi!: hi!", "<unknown=409600>", 2);
    java.lang.String var4 = var3.sourceName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "<unknown=409600>"+ "'", var4.equals("<unknown=409600>"));

  }

  public void test52() {}
//   public void test52() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test52"); }
// 
// 
//     java.io.InputStream var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromInputStream("STRING ", var1);
// 
//   }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test53"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    java.lang.Object var2 = null;
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var3 = var0.getDirectedGraphNode(var2);
    java.lang.Object var4 = null;
    com.google.javascript.jscomp.graph.GraphNode var5 = var0.createNode(var4);
    com.google.javascript.rhino.JSDocInfoBuilder var7 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var14 = new com.google.javascript.rhino.JSTypeExpression(var12, "");
    boolean var16 = var14.equals((java.lang.Object)'4');
    boolean var17 = var7.recordBaseType(var14);
    boolean var18 = var7.recordExport();
    boolean var19 = var7.recordOverride();
    com.google.javascript.rhino.JSDocInfoBuilder var21 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var28 = new com.google.javascript.rhino.JSTypeExpression(var26, "");
    boolean var30 = var28.equals((java.lang.Object)'4');
    boolean var31 = var21.recordBaseType(var28);
    boolean var33 = var21.hasParameter("ERROR  100 [synthetic: 1]\n");
    boolean var35 = var21.recordMeaning("JSDocInfo");
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.Node.newString("");
    var39.putIntProp(100, 1);
    com.google.javascript.rhino.Node var43 = var39.removeFirstChild();
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var50 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var53 = new com.google.javascript.rhino.Node(1, var39, var45, var50, 1, 1);
    com.google.javascript.jscomp.CheckLevel var55 = null;
    com.google.javascript.jscomp.DiagnosticType var57 = com.google.javascript.jscomp.DiagnosticType.make("", var55, "(ERROR)");
    com.google.javascript.jscomp.CheckLevel var59 = null;
    com.google.javascript.jscomp.DiagnosticType var61 = com.google.javascript.jscomp.DiagnosticType.make("", var59, "(ERROR)");
    int var62 = var57.compareTo(var61);
    java.lang.String[] var63 = null;
    com.google.javascript.jscomp.JSError var64 = com.google.javascript.jscomp.JSError.make("ERROR  100 [synthetic: 1]\n", var53, var57, var63);
    var21.markTypeNode(var53, 0, 10, 1, true);
    var7.markTypeNode(var53, 0, 100, 100, true);
    com.google.javascript.jscomp.CheckLevel var76 = null;
    com.google.javascript.jscomp.DiagnosticType var78 = com.google.javascript.jscomp.DiagnosticType.make("", var76, "(ERROR)");
    com.google.javascript.jscomp.CheckLevel var80 = null;
    com.google.javascript.jscomp.DiagnosticType var82 = com.google.javascript.jscomp.DiagnosticType.make("", var80, "(ERROR)");
    com.google.javascript.jscomp.CheckLevel var84 = null;
    com.google.javascript.jscomp.DiagnosticType var86 = com.google.javascript.jscomp.DiagnosticType.make("", var84, "(ERROR)");
    int var87 = var82.compareTo(var86);
    java.lang.String[] var89 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
    com.google.javascript.jscomp.JSError var90 = com.google.javascript.jscomp.JSError.make(var86, var89);
    com.google.javascript.jscomp.JSError var91 = com.google.javascript.jscomp.JSError.make(var78, var89);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.disconnect((java.lang.Object)100, (java.lang.Object)var89);
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test54"); }


    com.google.javascript.jscomp.SourceFile.Generator var1 = null;
    com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("<unknown=409600>", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test55"); }


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
    boolean var31 = var17.isEnumType();
    com.google.javascript.rhino.ErrorReporter var32 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32);
    boolean var35 = var33.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var36 = new com.google.javascript.rhino.jstype.FunctionBuilder(var33);
    com.google.javascript.rhino.ErrorReporter var38 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var38);
    boolean var41 = var39.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var42 = new com.google.javascript.rhino.jstype.FunctionBuilder(var39);
    com.google.javascript.rhino.ErrorReporter var43 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var43);
    boolean var46 = var44.hasNamespace("hi!");
    var44.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var48 = null;
    com.google.javascript.rhino.jstype.JSType var49 = null;
    com.google.javascript.rhino.jstype.JSType[] var50 = new com.google.javascript.rhino.jstype.JSType[] { var49};
    com.google.javascript.rhino.jstype.FunctionType var51 = var44.createConstructorType(var48, var50);
    boolean var52 = var51.canBeCalled();
    com.google.javascript.rhino.jstype.FunctionBuilder var54 = var42.withReturnType((com.google.javascript.rhino.jstype.JSType)var51, false);
    com.google.javascript.rhino.jstype.FunctionType var55 = var42.build();
    com.google.javascript.rhino.ErrorReporter var56 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var56);
    boolean var59 = var57.hasNamespace("hi!");
    var57.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var61 = null;
    com.google.javascript.rhino.jstype.JSType var62 = null;
    com.google.javascript.rhino.jstype.JSType[] var63 = new com.google.javascript.rhino.jstype.JSType[] { var62};
    com.google.javascript.rhino.jstype.FunctionType var64 = var57.createConstructorType(var61, var63);
    boolean var65 = var64.canBeCalled();
    com.google.javascript.rhino.jstype.FunctionPrototypeType var66 = null;
    boolean var67 = var64.setPrototype(var66);
    boolean var68 = var55.hasEqualCallType(var64);
    boolean var69 = var55.isEnumType();
    var33.registerPropertyOnType("unknown", (com.google.javascript.rhino.jstype.JSType)var55);
    com.google.javascript.rhino.JSDocInfo var71 = new com.google.javascript.rhino.JSDocInfo();
    java.lang.String var72 = var71.getOriginalCommentString();
    boolean var73 = var71.hasType();
    boolean var74 = var71.hasReturnType();
    java.util.List var75 = var71.getExtendedInterfaces();
    com.google.javascript.rhino.Node var76 = var33.createParameters(var75);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var17.setExtendedInterfaces(var75);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
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
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test56"); }


    boolean var1 = com.google.javascript.rhino.Context.isValidLanguageVersion(409600);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test57"); }


    com.google.javascript.jscomp.SourceFile.Generator var1 = null;
    com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromGenerator("ERROR", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test58() {}
//   public void test58() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test58"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var1);
//     java.lang.String var3 = var2.getName();
//     java.io.Reader var4 = var2.getCodeReader();
// 
//   }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test59"); }


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
    com.google.javascript.rhino.ErrorReporter var22 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var22);
    boolean var25 = var23.hasNamespace("hi!");
    var23.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.rhino.jstype.JSType var28 = null;
    com.google.javascript.rhino.jstype.JSType[] var29 = new com.google.javascript.rhino.jstype.JSType[] { var28};
    com.google.javascript.rhino.jstype.FunctionType var30 = var23.createConstructorType(var27, var29);
    com.google.javascript.rhino.ErrorReporter var31 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var31);
    boolean var34 = var32.hasNamespace("hi!");
    var32.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var36 = null;
    com.google.javascript.rhino.jstype.JSType var37 = null;
    com.google.javascript.rhino.jstype.JSType[] var38 = new com.google.javascript.rhino.jstype.JSType[] { var37};
    com.google.javascript.rhino.jstype.FunctionType var39 = var32.createConstructorType(var36, var38);
    boolean var40 = var39.canBeCalled();
    var30.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var39);
    boolean var42 = var39.canBeCalled();
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
    java.lang.Iterable var65 = var62.getAllImplementedInterfaces();
    com.google.javascript.rhino.jstype.JSType var66 = var39.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType)var62);
    java.util.Collection var67 = var1.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType)var62);
    com.google.javascript.rhino.ErrorReporter var68 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var68);
    boolean var71 = var69.hasNamespace("hi!");
    var69.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var73 = null;
    com.google.javascript.rhino.jstype.JSType var74 = null;
    com.google.javascript.rhino.jstype.JSType[] var75 = new com.google.javascript.rhino.jstype.JSType[] { var74};
    com.google.javascript.rhino.jstype.FunctionType var76 = var69.createConstructorType(var73, var75);
    com.google.javascript.rhino.ErrorReporter var77 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var77);
    boolean var80 = var78.hasNamespace("hi!");
    var78.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var82 = null;
    com.google.javascript.rhino.jstype.JSType var83 = null;
    com.google.javascript.rhino.jstype.JSType[] var84 = new com.google.javascript.rhino.jstype.JSType[] { var83};
    com.google.javascript.rhino.jstype.FunctionType var85 = var78.createConstructorType(var82, var84);
    boolean var86 = var85.canBeCalled();
    var76.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var85);
    boolean var88 = var85.isInterface();
    com.google.javascript.rhino.jstype.JSType[] var89 = new com.google.javascript.rhino.jstype.JSType[] { var85};
    com.google.javascript.rhino.jstype.JSType var90 = var1.createUnionType(var89);
    com.google.javascript.rhino.ErrorReporter var91 = var1.getErrorReporter();
    
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
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
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
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var91);

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test60"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var3 = new com.google.javascript.jscomp.JSModule("");
    var1.addDependency(var3);
    java.util.List var5 = var1.getDependencies();
    com.google.javascript.jscomp.JSModule var7 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var9 = new com.google.javascript.jscomp.JSModule("");
    var7.addDependency(var9);
    var1.addDependency(var7);
    var7.clearAsts();
    var7.setDepth(2);
    com.google.javascript.jscomp.SourceAst var15 = null;
    com.google.javascript.jscomp.CompilerInput var18 = new com.google.javascript.jscomp.CompilerInput(var15, "", true);
    com.google.javascript.jscomp.CompilerInput var21 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var18, "", false);
    com.google.javascript.jscomp.JSModule var22 = null;
    var18.setModule(var22);
    boolean var24 = var18.isExtern();
    com.google.javascript.jscomp.JSModule var25 = var18.getModule();
    com.google.javascript.jscomp.CompilerInput var26 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.addAfter(var18, var26);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test61() {}
//   public void test61() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test61"); }
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
//     com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.Node.newString("");
//     var35.putIntProp(100, 1);
//     int var39 = var35.getSourcePosition();
//     com.google.javascript.rhino.Node var40 = var35.getLastSibling();
//     com.google.javascript.jscomp.CheckLevel var42 = null;
//     com.google.javascript.jscomp.DiagnosticType var44 = com.google.javascript.jscomp.DiagnosticType.make("", var42, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var46 = null;
//     com.google.javascript.jscomp.DiagnosticType var48 = com.google.javascript.jscomp.DiagnosticType.make("", var46, "(ERROR)");
//     int var49 = var44.compareTo(var48);
//     java.lang.String[] var51 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var52 = com.google.javascript.jscomp.JSError.make(var48, var51);
//     java.lang.String[] var53 = null;
//     com.google.javascript.jscomp.JSError var54 = var16.makeError(var40, var48, var53);
//     com.google.javascript.jscomp.JSModule var55 = var16.getModule();
// 
//   }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test62"); }


    com.google.javascript.rhino.Context.checkLanguageVersion(0);

  }

  public void test63() {}
//   public void test63() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test63"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var5 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     com.google.javascript.jscomp.JSError var6 = null;
//     java.lang.String var7 = var5.formatWarning(var6);
// 
//   }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test64"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.RecordTypeBuilder var4 = new com.google.javascript.rhino.jstype.RecordTypeBuilder(var1);
    com.google.javascript.rhino.ErrorReporter var5 = var1.getErrorReporter();
    com.google.javascript.rhino.ErrorReporter var6 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var6);
    boolean var9 = var7.hasNamespace("hi!");
    var7.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var11 = null;
    com.google.javascript.rhino.jstype.JSType var12 = null;
    com.google.javascript.rhino.jstype.JSType[] var13 = new com.google.javascript.rhino.jstype.JSType[] { var12};
    com.google.javascript.rhino.jstype.FunctionType var14 = var7.createConstructorType(var11, var13);
    com.google.javascript.rhino.jstype.ObjectType var15 = var7.createAnonymousObjectType();
    boolean var16 = var15.isVoidType();
    com.google.javascript.rhino.ErrorReporter var17 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var17);
    boolean var20 = var18.hasNamespace("hi!");
    var18.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var22 = null;
    com.google.javascript.rhino.jstype.JSType var23 = null;
    com.google.javascript.rhino.jstype.JSType[] var24 = new com.google.javascript.rhino.jstype.JSType[] { var23};
    com.google.javascript.rhino.jstype.FunctionType var25 = var18.createConstructorType(var22, var24);
    boolean var26 = var25.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var27 = var15.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var25);
    boolean var28 = var15.isEmptyType();
    boolean var30 = var1.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType)var15, "");
    boolean var31 = var15.isNumber();
    boolean var32 = var15.isTemplateType();
    boolean var33 = var15.isRegexpType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test65() {}
//   public void test65() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test65"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = null;
//     com.google.javascript.rhino.Context var1 = com.google.javascript.rhino.Context.enter(var0);
//     int var2 = var1.getOptimizationLevel();
//     boolean var3 = var1.hasCompileFunctionsWithDynamicScope();
//     java.lang.Object var4 = var1.getDebuggerContextData();
//     int var5 = var1.getInstructionObserverThreshold();
//     boolean var6 = var1.isGeneratingSource();
//     java.lang.Object var8 = var1.getThreadLocal((java.lang.Object)(-1L));
//     com.google.javascript.rhino.ErrorReporter var9 = var1.getErrorReporter();
//     java.beans.PropertyChangeListener var10 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var1.removePropertyChangeListener(var10);
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
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var8);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var9);
// 
//   }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test66"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.Node.newString("");
    var1.putIntProp(100, 1);
    java.lang.String var5 = var1.getString();
    java.util.Set var6 = var1.getDirectives();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test67"); }


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
    boolean var21 = var17.hasOwnProperty("");
    boolean var22 = var17.isAllType();
    java.lang.Iterable var23 = var17.getCtorImplementedInterfaces();
    com.google.javascript.jscomp.JSModule var25 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var27 = new com.google.javascript.jscomp.JSModule("");
    var25.addDependency(var27);
    java.util.List var29 = var25.getDependencies();
    com.google.javascript.jscomp.JSModule var31 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var33 = new com.google.javascript.jscomp.JSModule("");
    var31.addDependency(var33);
    var25.addDependency(var31);
    var31.clearAsts();
    java.util.List var37 = var31.getRequires();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var17.setImplementedInterfaces(var37);
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
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test68"); }


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
    com.google.javascript.jscomp.SourceFile.Generator var27 = null;
    com.google.javascript.jscomp.JSSourceFile var28 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var27);
    java.lang.String var29 = var28.getName();
    com.google.javascript.jscomp.CompilerInput var31 = new com.google.javascript.jscomp.CompilerInput(var28, true);
    com.google.javascript.jscomp.JSModule var33 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var35 = new com.google.javascript.jscomp.JSModule("");
    var33.addDependency(var35);
    java.util.List var37 = var33.getDependencies();
    java.util.List var38 = var33.getRequires();
    com.google.javascript.jscomp.SourceAst var39 = null;
    com.google.javascript.jscomp.CompilerInput var42 = new com.google.javascript.jscomp.CompilerInput(var39, "", true);
    com.google.javascript.jscomp.SourceAst var43 = var42.getSourceAst();
    var33.remove(var42);
    var31.setModule(var33);
    com.google.javascript.jscomp.SourceFile.Generator var47 = null;
    com.google.javascript.jscomp.JSSourceFile var48 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var47);
    java.lang.String var49 = var48.getName();
    com.google.javascript.jscomp.CompilerInput var51 = new com.google.javascript.jscomp.CompilerInput(var48, true);
    var33.add(var48);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var53 = var1.toSourceArray(var33);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!"+ "'", var49.equals("hi!"));

  }

  public void test69() {}
//   public void test69() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test69"); }
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
//     com.google.common.base.Predicate var11 = null;
//     boolean var12 = var8.setValidator(var11);
// 
//   }

  public void test70() {}
//   public void test70() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test70"); }
// 
// 
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.Node.newString("");
//     var2.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var6 = var2.removeFirstChild();
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var16 = new com.google.javascript.rhino.Node(1, var2, var8, var13, 1, 1);
//     com.google.javascript.rhino.ErrorReporter var17 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var17);
//     boolean var20 = var18.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.FunctionBuilder var21 = new com.google.javascript.rhino.jstype.FunctionBuilder(var18);
//     com.google.javascript.rhino.jstype.JSType var23 = var18.getType("STRING ");
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
//     java.lang.Iterable var46 = var43.getAllImplementedInterfaces();
//     com.google.javascript.rhino.jstype.JSType[] var47 = new com.google.javascript.rhino.jstype.JSType[] { var43};
//     com.google.javascript.rhino.Node var48 = var18.createParametersWithVarArgs(var47);
//     com.google.javascript.rhino.Node var49 = var8.copyInformationFromForTree(var48);
//     java.lang.String var50 = var48.toStringTree();
// 
//   }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test71"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var3 = new com.google.javascript.jscomp.JSModule("");
    var1.addDependency(var3);
    java.util.List var5 = var1.getDependencies();
    com.google.javascript.jscomp.JSModule var7 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var9 = new com.google.javascript.jscomp.JSModule("");
    var7.addDependency(var9);
    var1.addDependency(var7);
    com.google.javascript.jscomp.JSModule var13 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var15 = new com.google.javascript.jscomp.JSModule("");
    var13.addDependency(var15);
    var13.setDepth(100);
    com.google.javascript.jscomp.SourceFile.Generator var20 = null;
    com.google.javascript.jscomp.JSSourceFile var21 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var20);
    com.google.javascript.jscomp.CompilerInput var23 = new com.google.javascript.jscomp.CompilerInput(var21, false);
    var13.add(var23);
    java.io.PrintStream var25 = null;
    com.google.javascript.jscomp.Compiler var26 = new com.google.javascript.jscomp.Compiler(var25);
    com.google.javascript.jscomp.Scope var27 = var26.getTopScope();
    com.google.javascript.jscomp.ErrorManager var28 = var26.getErrorManager();
    var23.setErrorManager(var28);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addFirst(var23);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test72"); }


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
    com.google.javascript.rhino.jstype.FunctionBuilder var19 = var4.withTemplateName("or");
    com.google.javascript.rhino.jstype.FunctionType var20 = var4.build();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var21 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.lang.Iterable var22 = var21.getDirectedGraphNodes();
    com.google.javascript.rhino.ErrorReporter var23 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var23);
    boolean var26 = var24.hasNamespace("hi!");
    var24.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var28 = null;
    com.google.javascript.rhino.jstype.JSType var29 = null;
    com.google.javascript.rhino.jstype.JSType[] var30 = new com.google.javascript.rhino.jstype.JSType[] { var29};
    com.google.javascript.rhino.jstype.FunctionType var31 = var24.createConstructorType(var28, var30);
    boolean var32 = var31.canBeCalled();
    com.google.javascript.rhino.jstype.JSType var33 = var31.getReturnType();
    var31.clearCachedValues();
    com.google.javascript.jscomp.graph.GraphNode var35 = var21.getNode((java.lang.Object)var31);
    com.google.javascript.rhino.jstype.FunctionBuilder var37 = var4.withReturnType((com.google.javascript.rhino.jstype.JSType)var31, true);
    com.google.javascript.rhino.Node var39 = var31.getPropertyNode("ERROR  100");
    
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
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
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test73"); }


    com.google.javascript.jscomp.parsing.Config.LanguageMode var3 = null;
    com.google.javascript.jscomp.parsing.Config var5 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(false, var3, false);
    com.google.javascript.jscomp.mozilla.rhino.ErrorReporter var6 = null;
    java.util.logging.Logger var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var8 = com.google.javascript.jscomp.parsing.ParserRunner.parse("", ": (ERROR)", var5, var6, var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test74() {}
//   public void test74() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test74"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var5 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     boolean var6 = var1.hasErrors();
// 
//   }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test75"); }


    com.google.javascript.jscomp.SourceFile var1 = com.google.javascript.jscomp.SourceFile.fromFile("eol");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test76() {}
//   public void test76() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test76"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Scope var2 = var1.getTopScope();
//     com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var3 = null;
//     com.google.javascript.jscomp.LightweightMessageFormatter var4 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1, var3);
//     java.lang.String var7 = var1.getSourceLine("hi!: hi!", 1);
// 
//   }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test77"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var1 = com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.valueOf("DiagnosticGroup<STRING >(null)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test78() {}
//   public void test78() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test78"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Scope var2 = var1.getTopScope();
//     com.google.javascript.jscomp.Scope var3 = var1.getTopScope();
//     com.google.javascript.jscomp.SourceAst var4 = null;
//     com.google.javascript.jscomp.CompilerInput var7 = new com.google.javascript.jscomp.CompilerInput(var4, "", true);
//     com.google.javascript.jscomp.CompilerInput var10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var7, "", false);
//     com.google.javascript.jscomp.JSModule var11 = null;
//     var7.setModule(var11);
//     boolean var13 = var7.isExtern();
//     com.google.javascript.jscomp.JSModule var15 = new com.google.javascript.jscomp.JSModule("");
//     com.google.javascript.jscomp.JSModule var17 = new com.google.javascript.jscomp.JSModule("");
//     var15.addDependency(var17);
//     java.util.List var19 = var15.getDependencies();
//     java.util.List var20 = var15.getRequires();
//     var7.setModule(var15);
//     com.google.javascript.jscomp.JSModule var23 = new com.google.javascript.jscomp.JSModule("");
//     com.google.javascript.jscomp.JSModule var25 = new com.google.javascript.jscomp.JSModule("");
//     var23.addDependency(var25);
//     java.util.List var27 = var23.getDependencies();
//     com.google.javascript.jscomp.JSModule var29 = new com.google.javascript.jscomp.JSModule("");
//     com.google.javascript.jscomp.JSModule var31 = new com.google.javascript.jscomp.JSModule("");
//     var29.addDependency(var31);
//     var23.addDependency(var29);
//     java.lang.String var34 = var23.getName();
//     var15.addDependency(var23);
//     java.lang.String var36 = var1.toSource(var23);
// 
//   }

  public void test79() {}
//   public void test79() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test79"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = null;
//     com.google.javascript.rhino.Context var1 = com.google.javascript.rhino.Context.enter(var0);
//     int var2 = var1.getOptimizationLevel();
//     boolean var3 = var1.hasCompileFunctionsWithDynamicScope();
//     boolean var5 = var1.isActivationNeeded(". (ERROR) at (unknown source) line (unknown line) : (unknown column)");
//     java.util.Locale var6 = null;
//     java.util.Locale var7 = var1.setLocale(var6);
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
//     assertTrue(var5 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var7);
// 
//   }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test80"); }


    com.google.javascript.rhino.JSDocInfoBuilder var2 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    boolean var3 = var2.recordNoSideEffects();
    com.google.javascript.rhino.JSDocInfoBuilder var5 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var12 = new com.google.javascript.rhino.JSTypeExpression(var10, "");
    boolean var14 = var12.equals((java.lang.Object)'4');
    boolean var15 = var5.recordBaseType(var12);
    boolean var16 = var2.recordDefineType(var12);
    com.google.javascript.rhino.JSDocInfoBuilder var18 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    boolean var19 = var18.recordNoSideEffects();
    com.google.javascript.rhino.JSDocInfoBuilder var21 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var28 = new com.google.javascript.rhino.JSTypeExpression(var26, "");
    boolean var30 = var28.equals((java.lang.Object)'4');
    boolean var31 = var21.recordBaseType(var28);
    boolean var32 = var18.recordDefineType(var28);
    com.google.javascript.rhino.ErrorReporter var33 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33);
    boolean var36 = var34.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.RecordTypeBuilder var37 = new com.google.javascript.rhino.jstype.RecordTypeBuilder(var34);
    com.google.javascript.rhino.ErrorReporter var38 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var38);
    boolean var41 = var39.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var42 = new com.google.javascript.rhino.jstype.FunctionBuilder(var39);
    com.google.javascript.rhino.jstype.JSType var44 = var39.getType("STRING ");
    com.google.javascript.rhino.ErrorReporter var45 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var45);
    boolean var48 = var46.hasNamespace("hi!");
    var46.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var50 = null;
    com.google.javascript.rhino.jstype.JSType var51 = null;
    com.google.javascript.rhino.jstype.JSType[] var52 = new com.google.javascript.rhino.jstype.JSType[] { var51};
    com.google.javascript.rhino.jstype.FunctionType var53 = var46.createConstructorType(var50, var52);
    com.google.javascript.rhino.jstype.ObjectType var54 = var46.createAnonymousObjectType();
    boolean var55 = var54.isVoidType();
    com.google.javascript.rhino.ErrorReporter var56 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var56);
    boolean var59 = var57.hasNamespace("hi!");
    var57.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var61 = null;
    com.google.javascript.rhino.jstype.JSType var62 = null;
    com.google.javascript.rhino.jstype.JSType[] var63 = new com.google.javascript.rhino.jstype.JSType[] { var62};
    com.google.javascript.rhino.jstype.FunctionType var64 = var57.createConstructorType(var61, var63);
    boolean var65 = var64.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var66 = var54.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var64);
    java.lang.Iterable var67 = var64.getAllImplementedInterfaces();
    com.google.javascript.rhino.jstype.JSType[] var68 = new com.google.javascript.rhino.jstype.JSType[] { var64};
    com.google.javascript.rhino.Node var69 = var39.createParametersWithVarArgs(var68);
    com.google.javascript.rhino.Node var70 = var34.createOptionalParameters(var68);
    com.google.javascript.rhino.JSTypeExpression var72 = new com.google.javascript.rhino.JSTypeExpression(var70, "(ERROR)");
    boolean var73 = var18.recordBaseType(var72);
    boolean var74 = var2.recordTypedef(var72);
    com.google.javascript.rhino.JSDocInfo var76 = var2.build("-1");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var77 = com.google.javascript.rhino.ScriptRuntime.getMessage1("(ERROR)", (java.lang.Object)var76);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);

  }

  public void test81() {}
//   public void test81() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test81"); }
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
//     var9.putIntProp(409600, 100);
//     com.google.javascript.rhino.Node var29 = var9.getChildAtIndex(1);
// 
//   }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test82"); }


    boolean var1 = com.google.javascript.rhino.ScriptRuntime.isJSLineTerminator(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test83"); }


    com.google.javascript.jscomp.SourceFile.Generator var1 = null;
    com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("(LinkedGraph)", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test84"); }


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
    boolean var21 = var17.hasOwnProperty("");
    boolean var22 = var17.isAllType();
    com.google.javascript.rhino.jstype.JSType var23 = var17.unboxesTo();
    com.google.javascript.rhino.jstype.FunctionPrototypeType var24 = var17.getPrototype();
    com.google.javascript.rhino.jstype.FunctionType var25 = var24.getOwnerFunction();
    boolean var26 = var24.isBooleanObjectType();
    
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
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test85"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    java.lang.String var1 = var0.getOriginalCommentString();
    boolean var2 = var0.hasType();
    boolean var3 = var0.hasReturnType();
    boolean var4 = var0.hasTypedefType();
    boolean var6 = var0.hasParameter("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test86"); }


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
    com.google.javascript.rhino.ErrorReporter var40 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var40);
    boolean var43 = var41.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var44 = new com.google.javascript.rhino.jstype.FunctionBuilder(var41);
    com.google.javascript.rhino.jstype.JSType var46 = var41.getType("STRING ");
    com.google.javascript.rhino.ErrorReporter var47 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var47);
    boolean var50 = var48.hasNamespace("hi!");
    var48.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var52 = null;
    com.google.javascript.rhino.jstype.JSType var53 = null;
    com.google.javascript.rhino.jstype.JSType[] var54 = new com.google.javascript.rhino.jstype.JSType[] { var53};
    com.google.javascript.rhino.jstype.FunctionType var55 = var48.createConstructorType(var52, var54);
    boolean var56 = var55.canBeCalled();
    com.google.javascript.rhino.jstype.JSType var57 = var55.getReturnType();
    com.google.javascript.rhino.jstype.JSType var59 = var41.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType)var55, "");
    var41.setLastGeneration(false);
    boolean var63 = var41.hasNamespace("-1");
    com.google.javascript.rhino.jstype.StaticScope var64 = null;
    var41.resolveTypesInScope(var64);
    com.google.javascript.rhino.ErrorReporter var66 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var66);
    boolean var69 = var67.hasNamespace("hi!");
    var67.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var71 = null;
    com.google.javascript.rhino.jstype.JSType var72 = null;
    com.google.javascript.rhino.jstype.JSType[] var73 = new com.google.javascript.rhino.jstype.JSType[] { var72};
    com.google.javascript.rhino.jstype.FunctionType var74 = var67.createConstructorType(var71, var73);
    boolean var75 = var74.canBeCalled();
    com.google.javascript.rhino.jstype.JSType var76 = var74.getReturnType();
    com.google.javascript.rhino.Node var77 = var74.getSource();
    boolean var78 = var74.isInstanceType();
    com.google.javascript.rhino.jstype.FunctionPrototypeType var79 = var74.getPrototype();
    boolean var80 = var79.isFunctionPrototypeType();
    java.lang.Iterable var81 = var79.getCtorExtendedInterfaces();
    com.google.javascript.rhino.JSDocInfo var82 = var79.getJSDocInfo();
    java.lang.Iterable var83 = var79.getCtorExtendedInterfaces();
    com.google.javascript.rhino.Node var84 = null;
    com.google.javascript.rhino.jstype.FunctionType var85 = var41.createFunctionType((com.google.javascript.rhino.jstype.JSType)var79, var84);
    com.google.javascript.rhino.jstype.JSType var86 = var1.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType)var85);
    boolean var87 = var85.isNativeObjectType();
    boolean var88 = var85.isStringObjectType();
    
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
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test87"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    var1.clearTemplateTypeName();
    com.google.javascript.rhino.ErrorReporter var5 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var5);
    boolean var8 = var6.hasNamespace("hi!");
    var6.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var10 = null;
    com.google.javascript.rhino.jstype.JSType var11 = null;
    com.google.javascript.rhino.jstype.JSType[] var12 = new com.google.javascript.rhino.jstype.JSType[] { var11};
    com.google.javascript.rhino.jstype.FunctionType var13 = var6.createConstructorType(var10, var12);
    boolean var14 = var13.canBeCalled();
    com.google.javascript.rhino.jstype.JSType var15 = var13.getReturnType();
    com.google.javascript.rhino.jstype.JSType var16 = null;
    boolean var17 = var13.isEquivalentTo(var16);
    com.google.javascript.rhino.jstype.ObjectType var18 = null;
    com.google.javascript.rhino.jstype.FunctionType var19 = var1.createFunctionTypeWithNewThisType(var13, var18);
    com.google.javascript.rhino.ErrorReporter var20 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var20);
    boolean var23 = var21.hasNamespace("hi!");
    var21.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var25 = null;
    com.google.javascript.rhino.jstype.JSType var26 = null;
    com.google.javascript.rhino.jstype.JSType[] var27 = new com.google.javascript.rhino.jstype.JSType[] { var26};
    com.google.javascript.rhino.jstype.FunctionType var28 = var21.createConstructorType(var25, var27);
    boolean var29 = var28.canBeCalled();
    com.google.javascript.rhino.jstype.JSType var30 = var28.getReturnType();
    com.google.javascript.rhino.Node var31 = var28.getSource();
    com.google.javascript.rhino.ErrorReporter var32 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32);
    boolean var35 = var33.hasNamespace("hi!");
    var33.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var37 = null;
    com.google.javascript.rhino.jstype.JSType var38 = null;
    com.google.javascript.rhino.jstype.JSType[] var39 = new com.google.javascript.rhino.jstype.JSType[] { var38};
    com.google.javascript.rhino.jstype.FunctionType var40 = var33.createConstructorType(var37, var39);
    boolean var41 = var40.canBeCalled();
    com.google.javascript.rhino.jstype.JSType var42 = var40.getReturnType();
    var40.clearCachedValues();
    com.google.javascript.rhino.jstype.JSType.TypePair var44 = var28.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType)var40);
    com.google.javascript.rhino.jstype.JSType[] var45 = new com.google.javascript.rhino.jstype.JSType[] { var40};
    com.google.javascript.rhino.Node var46 = var1.createParametersWithVarArgs(var45);
    com.google.javascript.jscomp.JSModule var48 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var50 = new com.google.javascript.jscomp.JSModule("");
    var48.addDependency(var50);
    java.util.List var52 = var48.getRequires();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var53 = var1.createParametersWithVarArgs(var52);
      fail("Expected exception of type java.lang.ArrayStoreException");
    } catch (java.lang.ArrayStoreException e) {
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
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
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test88"); }


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
    int var20 = var17.getMinArguments();
    boolean var21 = var17.isUnionType();
    com.google.javascript.rhino.jstype.JSType var23 = var17.getPropertyType("{1215373146}");
    
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
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test89() {}
//   public void test89() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test89"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Compiler.IntermediateState var8 = var1.getState();
//     com.google.javascript.jscomp.NodeTraversal.Callback var9 = null;
//     com.google.javascript.jscomp.NodeTraversal var10 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var1, var9);
//     com.google.javascript.jscomp.Scope var11 = var10.getScope();
//     com.google.javascript.jscomp.CompilerInput var12 = var10.getInput();
// 
//   }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test90"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var8 = new com.google.javascript.rhino.JSTypeExpression(var6, "");
    boolean var10 = var8.equals((java.lang.Object)'4');
    boolean var11 = var1.recordBaseType(var8);
    boolean var13 = var1.hasParameter("ERROR  100 [synthetic: 1]\n");
    boolean var15 = var1.hasParameter("-1");
    boolean var16 = var1.recordNoTypeCheck();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test91"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.CodingConvention var1 = var0.getCodingConvention();
    var0.enableExternExports(true);
    var0.setOutputCharset("null(null)");
    java.util.Map var6 = var0.getDefineReplacements();
    var0.setDefineToNumberLiteral("{1215373146}", 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test92() {}
//   public void test92() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test92"); }
// 
// 
//     java.util.List var0 = null;
//     com.google.javascript.jscomp.ComposeWarningsGuard var1 = new com.google.javascript.jscomp.ComposeWarningsGuard(var0);
// 
//   }

  public void test93() {}
//   public void test93() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test93"); }
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
//     com.google.javascript.rhino.Node var25 = var14.cloneNode();
//     java.lang.String var26 = com.google.javascript.jscomp.NodeUtil.getSourceName(var25);
//     com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.Node.newString("");
//     var31.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var35 = var31.removeFirstChild();
//     com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var45 = new com.google.javascript.rhino.Node(1, var31, var37, var42, 1, 1);
//     com.google.javascript.jscomp.CheckLevel var47 = null;
//     com.google.javascript.jscomp.DiagnosticType var49 = com.google.javascript.jscomp.DiagnosticType.make("", var47, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var51 = null;
//     com.google.javascript.jscomp.DiagnosticType var53 = com.google.javascript.jscomp.DiagnosticType.make("", var51, "(ERROR)");
//     int var54 = var49.compareTo(var53);
//     java.lang.String[] var55 = null;
//     com.google.javascript.jscomp.JSError var56 = com.google.javascript.jscomp.JSError.make("ERROR  100 [synthetic: 1]\n", var45, var49, var55);
//     java.lang.Iterable var57 = var45.siblings();
//     var25.putProp(0, (java.lang.Object)var57);
//     int var59 = var25.getLineno();
//     com.google.javascript.rhino.Node var60 = var25.getNext();
//     com.google.javascript.rhino.Node var61 = var25.getFirstChild();
//     com.google.javascript.rhino.Node var63 = new com.google.javascript.rhino.Node(2147483647);
//     var25.removeChild(var63);
// 
//   }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test94"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("hi!", var1, "ERROR  100 [synthetic: 1]\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test95"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
    com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
    com.google.javascript.jscomp.LightweightMessageFormatter var8 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
    com.google.javascript.jscomp.LightweightMessageFormatter var9 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
    com.google.javascript.jscomp.JSModule var11 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var13 = new com.google.javascript.jscomp.JSModule("");
    var11.addDependency(var13);
    java.util.List var15 = var11.getDependencies();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var16 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.lang.Iterable var17 = var16.getDirectedGraphNodes();
    var16.clearEdgeAnnotations();
    java.util.List var19 = var16.getEdges();
    com.google.javascript.jscomp.CompilerOptions var20 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.CodingConvention var21 = var20.getCodingConvention();
    var20.setChainCalls(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.Result var24 = var1.compile(var15, var19, var20);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
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

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test96"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
    com.google.javascript.rhino.ErrorReporter var6 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var6);
    boolean var9 = var7.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var10 = new com.google.javascript.rhino.jstype.FunctionBuilder(var7);
    com.google.javascript.rhino.ErrorReporter var11 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11);
    boolean var14 = var12.hasNamespace("hi!");
    var12.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var16 = null;
    com.google.javascript.rhino.jstype.JSType var17 = null;
    com.google.javascript.rhino.jstype.JSType[] var18 = new com.google.javascript.rhino.jstype.JSType[] { var17};
    com.google.javascript.rhino.jstype.FunctionType var19 = var12.createConstructorType(var16, var18);
    boolean var20 = var19.canBeCalled();
    com.google.javascript.rhino.jstype.FunctionBuilder var22 = var10.withReturnType((com.google.javascript.rhino.jstype.JSType)var19, false);
    com.google.javascript.rhino.jstype.FunctionType var23 = var10.build();
    com.google.javascript.rhino.ErrorReporter var24 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24);
    boolean var27 = var25.hasNamespace("hi!");
    var25.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var29 = null;
    com.google.javascript.rhino.jstype.JSType var30 = null;
    com.google.javascript.rhino.jstype.JSType[] var31 = new com.google.javascript.rhino.jstype.JSType[] { var30};
    com.google.javascript.rhino.jstype.FunctionType var32 = var25.createConstructorType(var29, var31);
    boolean var33 = var32.canBeCalled();
    com.google.javascript.rhino.jstype.FunctionPrototypeType var34 = null;
    boolean var35 = var32.setPrototype(var34);
    boolean var36 = var23.hasEqualCallType(var32);
    boolean var37 = var23.isEnumType();
    var1.registerPropertyOnType("unknown", (com.google.javascript.rhino.jstype.JSType)var23);
    boolean var39 = var23.canBeCalled();
    com.google.javascript.rhino.jstype.JSType var40 = null;
    com.google.javascript.rhino.jstype.JSType.TypePair var41 = var23.getTypesUnderShallowInequality(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
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
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test97"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    var0.pushEdgeAnnotations();
    java.lang.Iterable var3 = var0.getDirectedGraphNodes();
    java.lang.Object var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var0.getNodeDegree(var4);
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

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test98"); }


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
    boolean var20 = var17.isInterface();
    com.google.javascript.rhino.jstype.FunctionPrototypeType var21 = var17.getPrototype();
    java.lang.String var22 = var21.getReferenceName();
    boolean var23 = var21.isEmptyType();
    com.google.javascript.jscomp.GoogleCodingConvention var24 = new com.google.javascript.jscomp.GoogleCodingConvention();
    com.google.javascript.rhino.ErrorReporter var25 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25);
    boolean var28 = var26.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var29 = new com.google.javascript.rhino.jstype.FunctionBuilder(var26);
    com.google.javascript.rhino.ErrorReporter var30 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var30);
    boolean var33 = var31.hasNamespace("hi!");
    var31.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var35 = null;
    com.google.javascript.rhino.jstype.JSType var36 = null;
    com.google.javascript.rhino.jstype.JSType[] var37 = new com.google.javascript.rhino.jstype.JSType[] { var36};
    com.google.javascript.rhino.jstype.FunctionType var38 = var31.createConstructorType(var35, var37);
    boolean var39 = var38.canBeCalled();
    com.google.javascript.rhino.jstype.FunctionBuilder var41 = var29.withReturnType((com.google.javascript.rhino.jstype.JSType)var38, false);
    com.google.javascript.rhino.jstype.FunctionType var42 = var29.build();
    com.google.javascript.rhino.jstype.FunctionBuilder var44 = var29.withTemplateName("or");
    com.google.javascript.rhino.ErrorReporter var45 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var45);
    boolean var48 = var46.hasNamespace("hi!");
    var46.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var50 = null;
    com.google.javascript.rhino.jstype.JSType var51 = null;
    com.google.javascript.rhino.jstype.JSType[] var52 = new com.google.javascript.rhino.jstype.JSType[] { var51};
    com.google.javascript.rhino.jstype.FunctionType var53 = var46.createConstructorType(var50, var52);
    boolean var54 = var53.canBeCalled();
    boolean var55 = var53.isConstructor();
    com.google.javascript.rhino.jstype.FunctionBuilder var56 = var29.withReturnType((com.google.javascript.rhino.jstype.JSType)var53);
    com.google.javascript.rhino.ErrorReporter var57 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var57);
    boolean var60 = var58.hasNamespace("hi!");
    var58.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var62 = null;
    com.google.javascript.rhino.jstype.JSType var63 = null;
    com.google.javascript.rhino.jstype.JSType[] var64 = new com.google.javascript.rhino.jstype.JSType[] { var63};
    com.google.javascript.rhino.jstype.FunctionType var65 = var58.createConstructorType(var62, var64);
    boolean var66 = var65.canBeCalled();
    boolean var67 = var65.isConstructor();
    com.google.javascript.rhino.ErrorReporter var68 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var68);
    boolean var71 = var69.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var72 = new com.google.javascript.rhino.jstype.FunctionBuilder(var69);
    com.google.javascript.rhino.ErrorReporter var73 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var73);
    boolean var76 = var74.hasNamespace("hi!");
    var74.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var78 = null;
    com.google.javascript.rhino.jstype.JSType var79 = null;
    com.google.javascript.rhino.jstype.JSType[] var80 = new com.google.javascript.rhino.jstype.JSType[] { var79};
    com.google.javascript.rhino.jstype.FunctionType var81 = var74.createConstructorType(var78, var80);
    boolean var82 = var81.canBeCalled();
    com.google.javascript.rhino.jstype.FunctionBuilder var84 = var72.withReturnType((com.google.javascript.rhino.jstype.JSType)var81, false);
    com.google.javascript.rhino.jstype.FunctionType var85 = var72.build();
    com.google.javascript.rhino.jstype.FunctionBuilder var87 = var72.withTemplateName("or");
    com.google.javascript.rhino.jstype.FunctionType var88 = var72.build();
    java.lang.Iterable var89 = var88.getCtorExtendedInterfaces();
    var24.applySingletonGetter(var53, var65, (com.google.javascript.rhino.jstype.ObjectType)var88);
    boolean var91 = var21.equals((java.lang.Object)var65);
    java.lang.Iterable var92 = var21.getCtorImplementedInterfaces();
    
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
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "null.prototype"+ "'", var22.equals("null.prototype"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
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

  }

  public void test99() {}
//   public void test99() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test99"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     com.google.javascript.jscomp.JSError[] var1 = var0.getMessages();
// 
//   }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test100"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.CodingConvention var1 = var0.getCodingConvention();
    var0.enableExternExports(true);
    boolean var4 = var0.isExternExportsEnabled();
    var0.setPropertyAffinity(false);
    var0.setDefineToNumberLiteral("<unknown=409600>", 10);
    com.google.javascript.jscomp.CompilerOptions var10 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.CodingConvention var11 = var10.getCodingConvention();
    var10.enableExternExports(true);
    boolean var14 = var10.isExternExportsEnabled();
    var10.setTweakToBooleanLiteral("unknown", false);
    var10.lineLengthThreshold(409600);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var20 = var10.getTweakProcessing();
    var0.setTweakProcessing(var20);
    java.lang.String var22 = var20.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "OFF"+ "'", var22.equals("OFF"));

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test101"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
    var2.setLastGeneration(false);
    com.google.javascript.rhino.ErrorReporter var5 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var5);
    boolean var8 = var6.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var9 = new com.google.javascript.rhino.jstype.FunctionBuilder(var6);
    com.google.javascript.rhino.jstype.JSType var11 = var6.getType("STRING ");
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
    com.google.javascript.rhino.jstype.JSType var24 = var6.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType)var20, "");
    var6.setLastGeneration(false);
    boolean var28 = var6.hasNamespace("-1");
    com.google.javascript.rhino.jstype.StaticScope var29 = null;
    var6.resolveTypesInScope(var29);
    com.google.javascript.rhino.jstype.JSTypeRegistry var31 = null;
    com.google.javascript.rhino.jstype.FunctionParamBuilder var32 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var31);
    com.google.javascript.rhino.ErrorReporter var33 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33);
    boolean var36 = var34.hasNamespace("hi!");
    var34.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var38 = null;
    com.google.javascript.rhino.jstype.JSType var39 = null;
    com.google.javascript.rhino.jstype.JSType[] var40 = new com.google.javascript.rhino.jstype.JSType[] { var39};
    com.google.javascript.rhino.jstype.FunctionType var41 = var34.createConstructorType(var38, var40);
    com.google.javascript.rhino.jstype.ObjectType var42 = var34.createAnonymousObjectType();
    com.google.javascript.rhino.jstype.JSType[] var43 = new com.google.javascript.rhino.jstype.JSType[] { var42};
    boolean var44 = var32.addRequiredParams(var43);
    com.google.javascript.rhino.Node var45 = var6.createOptionalParameters(var43);
    com.google.javascript.rhino.jstype.JSType var46 = var2.createUnionType(var43);
    com.google.javascript.rhino.ErrorReporter var48 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var48);
    boolean var51 = var49.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var52 = new com.google.javascript.rhino.jstype.FunctionBuilder(var49);
    java.lang.Iterable var54 = var49.getTypesWithProperty("");
    com.google.javascript.rhino.ErrorReporter var55 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var55);
    boolean var58 = var56.hasNamespace("hi!");
    var56.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var60 = null;
    com.google.javascript.rhino.jstype.JSType var61 = null;
    com.google.javascript.rhino.jstype.JSType[] var62 = new com.google.javascript.rhino.jstype.JSType[] { var61};
    com.google.javascript.rhino.jstype.FunctionType var63 = var56.createConstructorType(var60, var62);
    boolean var64 = var63.canBeCalled();
    com.google.javascript.rhino.jstype.JSType var65 = var63.getReturnType();
    com.google.javascript.rhino.Node var66 = var63.getSource();
    boolean var67 = var63.isFunctionType();
    com.google.javascript.rhino.jstype.ObjectType var68 = var49.createObjectType((com.google.javascript.rhino.jstype.ObjectType)var63);
    boolean var69 = var2.declareType("OR\n", (com.google.javascript.rhino.jstype.JSType)var68);
    com.google.javascript.rhino.JSDocInfo var70 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Set var71 = var70.getSuppressions();
    java.util.Collection var72 = var70.getAuthors();
    boolean var73 = var70.isNoAlias();
    boolean var74 = var70.hasEnumParameterType();
    com.google.javascript.rhino.JSDocInfo.Visibility var75 = var70.getVisibility();
    var68.setJSDocInfo(var70);
    boolean var78 = var68.hasOwnProperty("LinkedGraph");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
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
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
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
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test102"); }


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
    boolean var16 = var15.canBeCalled();
    com.google.javascript.rhino.jstype.JSType var17 = var15.getReturnType();
    com.google.javascript.rhino.Node var18 = var15.getSource();
    boolean var19 = var15.isFunctionType();
    com.google.javascript.rhino.jstype.ObjectType var20 = var1.createObjectType((com.google.javascript.rhino.jstype.ObjectType)var15);
    com.google.javascript.rhino.jstype.ObjectType var22 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface((com.google.javascript.rhino.jstype.ObjectType)var15, "STRING \n");
    
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
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test103() {}
//   public void test103() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test103"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticGroup var0 = null;
//     com.google.javascript.jscomp.CheckLevel var1 = null;
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var2 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var0, var1);
//     java.lang.String var3 = var2.toString();
//     com.google.javascript.jscomp.CompilerOptions var4 = new com.google.javascript.jscomp.CompilerOptions();
//     com.google.javascript.jscomp.CheckLevel var6 = null;
//     com.google.javascript.jscomp.DiagnosticType var8 = com.google.javascript.jscomp.DiagnosticType.make("", var6, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var10 = null;
//     com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.make("", var10, "(ERROR)");
//     int var13 = var8.compareTo(var12);
//     java.lang.String[] var15 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var16 = com.google.javascript.jscomp.JSError.make(var12, var15);
//     com.google.javascript.jscomp.CheckLevel var18 = null;
//     com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.make("", var18, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var22 = null;
//     com.google.javascript.jscomp.DiagnosticType var24 = com.google.javascript.jscomp.DiagnosticType.make("", var22, "(ERROR)");
//     int var25 = var20.compareTo(var24);
//     java.lang.String[] var27 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make(var24, var27);
//     com.google.javascript.jscomp.JSError var29 = com.google.javascript.jscomp.JSError.make(var12, var27);
//     com.google.javascript.jscomp.DiagnosticType[] var30 = new com.google.javascript.jscomp.DiagnosticType[] { var12};
//     com.google.javascript.jscomp.DiagnosticGroup var31 = new com.google.javascript.jscomp.DiagnosticGroup(var30);
//     com.google.javascript.jscomp.CheckLevel var32 = null;
//     var4.setWarningLevel(var31, var32);
//     java.lang.String var34 = var31.toString();
//     boolean var35 = var2.enables(var31);
// 
//   }

  public void test104() {}
//   public void test104() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test104"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Scope var2 = var1.getTopScope();
//     com.google.javascript.jscomp.ErrorManager var3 = var1.getErrorManager();
//     java.nio.charset.Charset var5 = null;
//     com.google.javascript.jscomp.JSSourceFile var6 = com.google.javascript.jscomp.JSSourceFile.fromFile("TypeError", var5);
//     java.lang.String var7 = var6.getName();
//     com.google.javascript.jscomp.JSModule var9 = new com.google.javascript.jscomp.JSModule("");
//     com.google.javascript.jscomp.JSModule var11 = new com.google.javascript.jscomp.JSModule("");
//     var9.addDependency(var11);
//     java.util.List var13 = var9.getDependencies();
//     com.google.javascript.jscomp.JSModule var15 = new com.google.javascript.jscomp.JSModule("");
//     com.google.javascript.jscomp.JSModule var17 = new com.google.javascript.jscomp.JSModule("");
//     var15.addDependency(var17);
//     var9.addDependency(var15);
//     com.google.javascript.jscomp.JSModule[] var20 = new com.google.javascript.jscomp.JSModule[] { var9};
//     com.google.javascript.jscomp.CompilerOptions var21 = new com.google.javascript.jscomp.CompilerOptions();
//     com.google.javascript.jscomp.CheckLevel var23 = null;
//     com.google.javascript.jscomp.DiagnosticType var25 = com.google.javascript.jscomp.DiagnosticType.make("", var23, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var27 = null;
//     com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.make("", var27, "(ERROR)");
//     int var30 = var25.compareTo(var29);
//     java.lang.String[] var32 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var33 = com.google.javascript.jscomp.JSError.make(var29, var32);
//     com.google.javascript.jscomp.CheckLevel var35 = null;
//     com.google.javascript.jscomp.DiagnosticType var37 = com.google.javascript.jscomp.DiagnosticType.make("", var35, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var39 = null;
//     com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.make("", var39, "(ERROR)");
//     int var42 = var37.compareTo(var41);
//     java.lang.String[] var44 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make(var41, var44);
//     com.google.javascript.jscomp.JSError var46 = com.google.javascript.jscomp.JSError.make(var29, var44);
//     com.google.javascript.jscomp.DiagnosticType[] var47 = new com.google.javascript.jscomp.DiagnosticType[] { var29};
//     com.google.javascript.jscomp.DiagnosticGroup var48 = new com.google.javascript.jscomp.DiagnosticGroup(var47);
//     com.google.javascript.jscomp.CheckLevel var49 = null;
//     var21.setWarningLevel(var48, var49);
//     com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler var51 = var21.getAliasTransformationHandler();
//     com.google.javascript.jscomp.Result var52 = var1.compile(var6, var20, var21);
// 
//   }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test105"); }


    boolean var1 = com.google.javascript.rhino.Context.isValidLanguageVersion(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test106() {}
//   public void test106() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test106"); }
// 
// 
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.Context.reportError("<No stack trace available>", "DiagnosticGroup<STRING >(null)", 2, "<unknown=409600>", 2147483647);
//       fail("Expected exception of type com.google.javascript.rhino.EvaluatorException");
//     } catch (com.google.javascript.rhino.EvaluatorException e) {
//       // Expected exception.
//     }
// 
//   }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test107"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf("LP\n    NAME  [var_args_name: 1] : (undefined|{})\n");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test108"); }


    java.util.logging.Logger var0 = null;
    com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
    com.google.javascript.jscomp.Compiler var2 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var1);
    var2.reportCodeChange();
    com.google.javascript.jscomp.SourceMap var4 = var2.getSourceMap();
    com.google.javascript.rhino.Node var6 = new com.google.javascript.rhino.Node(1);
    java.lang.Iterable var7 = var6.children();
    com.google.javascript.jscomp.NodeTraversal.Callback var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.NodeTraversal.traverse((com.google.javascript.jscomp.AbstractCompiler)var2, var6, var8);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test109() {}
//   public void test109() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test109"); }
// 
// 
//     java.util.logging.Logger var0 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
//     double var2 = var1.getTypedPercent();
//     var1.generateReport();
//     com.google.javascript.jscomp.Compiler var4 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var1);
//     boolean var5 = var4.isIdeMode();
// 
//   }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test110"); }


    java.lang.String var1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("com.google.javascript.rhino.EvaluatorException: hi! (#10)");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "(com.google.javascript.rhino.EvaluatorException: hi! (#10))"+ "'", var1.equals("(com.google.javascript.rhino.EvaluatorException: hi! (#10))"));

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test111"); }


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
    com.google.javascript.rhino.ErrorReporter var18 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18);
    boolean var21 = var19.hasNamespace("hi!");
    var19.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var23 = null;
    com.google.javascript.rhino.jstype.JSType var24 = null;
    com.google.javascript.rhino.jstype.JSType[] var25 = new com.google.javascript.rhino.jstype.JSType[] { var24};
    com.google.javascript.rhino.jstype.FunctionType var26 = var19.createConstructorType(var23, var25);
    boolean var27 = var26.canBeCalled();
    var17.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var26);
    boolean var29 = var26.canBeCalled();
    com.google.javascript.rhino.jstype.ObjectType var30 = var1.createObjectType((com.google.javascript.rhino.jstype.ObjectType)var26);
    var1.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var33 = var1.getType("com.google.javascript.rhino.EvaluatorException: hi! (#10)");
    com.google.javascript.rhino.ErrorReporter var35 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var35);
    boolean var38 = var36.hasNamespace("hi!");
    var36.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var40 = null;
    com.google.javascript.rhino.jstype.JSType var41 = null;
    com.google.javascript.rhino.jstype.JSType[] var42 = new com.google.javascript.rhino.jstype.JSType[] { var41};
    com.google.javascript.rhino.jstype.FunctionType var43 = var36.createConstructorType(var40, var42);
    com.google.javascript.rhino.ErrorReporter var44 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var44);
    boolean var47 = var45.hasNamespace("hi!");
    var45.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var49 = null;
    com.google.javascript.rhino.jstype.JSType var50 = null;
    com.google.javascript.rhino.jstype.JSType[] var51 = new com.google.javascript.rhino.jstype.JSType[] { var50};
    com.google.javascript.rhino.jstype.FunctionType var52 = var45.createConstructorType(var49, var51);
    boolean var53 = var52.canBeCalled();
    var43.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var52);
    boolean var55 = var52.canBeCalled();
    com.google.javascript.rhino.ErrorReporter var56 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var56);
    boolean var59 = var57.hasNamespace("hi!");
    var57.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var61 = null;
    com.google.javascript.rhino.jstype.JSType var62 = null;
    com.google.javascript.rhino.jstype.JSType[] var63 = new com.google.javascript.rhino.jstype.JSType[] { var62};
    com.google.javascript.rhino.jstype.FunctionType var64 = var57.createConstructorType(var61, var63);
    com.google.javascript.rhino.jstype.ObjectType var65 = var57.createAnonymousObjectType();
    boolean var66 = var65.isVoidType();
    com.google.javascript.rhino.ErrorReporter var67 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var67);
    boolean var70 = var68.hasNamespace("hi!");
    var68.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var72 = null;
    com.google.javascript.rhino.jstype.JSType var73 = null;
    com.google.javascript.rhino.jstype.JSType[] var74 = new com.google.javascript.rhino.jstype.JSType[] { var73};
    com.google.javascript.rhino.jstype.FunctionType var75 = var68.createConstructorType(var72, var74);
    boolean var76 = var75.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var77 = var65.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var75);
    java.lang.Iterable var78 = var75.getAllImplementedInterfaces();
    com.google.javascript.rhino.jstype.JSType var79 = var52.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType)var75);
    boolean var80 = var75.isConstructor();
    var1.registerPropertyOnType("-1", (com.google.javascript.rhino.jstype.JSType)var75);
    var1.identifyNonNullableName("hi!: hi!");
    
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
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == true);

  }

  public void test112() {}
//   public void test112() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test112"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var1 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var1);
//     boolean var4 = var2.hasNamespace("hi!");
//     var2.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var6 = null;
//     com.google.javascript.rhino.jstype.JSType var7 = null;
//     com.google.javascript.rhino.jstype.JSType[] var8 = new com.google.javascript.rhino.jstype.JSType[] { var7};
//     com.google.javascript.rhino.jstype.FunctionType var9 = var2.createConstructorType(var6, var8);
//     com.google.javascript.rhino.ErrorReporter var10 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var10);
//     boolean var13 = var11.hasNamespace("hi!");
//     var11.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var15 = null;
//     com.google.javascript.rhino.jstype.JSType var16 = null;
//     com.google.javascript.rhino.jstype.JSType[] var17 = new com.google.javascript.rhino.jstype.JSType[] { var16};
//     com.google.javascript.rhino.jstype.FunctionType var18 = var11.createConstructorType(var15, var17);
//     boolean var19 = var18.canBeCalled();
//     var9.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var18);
//     boolean var22 = var18.hasOwnProperty("");
//     boolean var23 = var18.isAllType();
//     com.google.javascript.rhino.jstype.JSType var24 = var18.unboxesTo();
//     com.google.javascript.rhino.jstype.FunctionPrototypeType var25 = var18.getPrototype();
//     com.google.javascript.rhino.jstype.FunctionType var26 = var25.getOwnerFunction();
//     java.lang.RuntimeException var27 = com.google.javascript.rhino.ScriptRuntime.notFunctionError((java.lang.Object)"TypeError", (java.lang.Object)var26);
// 
//   }

  public void test113() {}
//   public void test113() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test113"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Scope var2 = var1.getTopScope();
//     com.google.javascript.jscomp.Scope var3 = var1.getTopScope();
//     com.google.javascript.jscomp.ErrorManager var4 = var1.getErrorManager();
//     com.google.javascript.jscomp.Compiler var5 = new com.google.javascript.jscomp.Compiler(var4);
//     com.google.javascript.rhino.jstype.JSTypeRegistry var6 = var5.getTypeRegistry();
// 
//   }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test114"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = com.google.javascript.rhino.ScriptRuntime.getMessage0("<unknown=409600>");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test115() {}
//   public void test115() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test115"); }
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
//     boolean var21 = var17.isInstanceType();
//     boolean var22 = var17.isNumberObjectType();
//     boolean var23 = var17.isNoObjectType();
//     java.lang.String var24 = var17.toDebugHashCodeString();
// 
//   }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test116"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Context.reportWarning(". (ERROR) at ERROR  100 [synthetic: 1]\n line 1 : 1", ": ERROR - (ERROR)\n", 100, ": ERROR - (ERROR)\n", 100);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test117"); }


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
    var46.clearCachedValues();
    boolean var99 = var46.matchesUint32Context();
    
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
    assertTrue(var99 == false);

  }

  public void test118() {}
//   public void test118() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test118"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = var1.getTypeRegistry();
// 
//   }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test119"); }


    com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
    com.google.javascript.rhino.ErrorReporter var1 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var1);
    boolean var4 = var2.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var5 = new com.google.javascript.rhino.jstype.FunctionBuilder(var2);
    com.google.javascript.rhino.ErrorReporter var6 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var6);
    boolean var9 = var7.hasNamespace("hi!");
    var7.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var11 = null;
    com.google.javascript.rhino.jstype.JSType var12 = null;
    com.google.javascript.rhino.jstype.JSType[] var13 = new com.google.javascript.rhino.jstype.JSType[] { var12};
    com.google.javascript.rhino.jstype.FunctionType var14 = var7.createConstructorType(var11, var13);
    boolean var15 = var14.canBeCalled();
    com.google.javascript.rhino.jstype.FunctionBuilder var17 = var5.withReturnType((com.google.javascript.rhino.jstype.JSType)var14, false);
    com.google.javascript.rhino.jstype.FunctionType var18 = var5.build();
    com.google.javascript.rhino.jstype.FunctionBuilder var20 = var5.withTemplateName("or");
    com.google.javascript.rhino.ErrorReporter var21 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21);
    boolean var24 = var22.hasNamespace("hi!");
    var22.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var26 = null;
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.rhino.jstype.JSType[] var28 = new com.google.javascript.rhino.jstype.JSType[] { var27};
    com.google.javascript.rhino.jstype.FunctionType var29 = var22.createConstructorType(var26, var28);
    boolean var30 = var29.canBeCalled();
    boolean var31 = var29.isConstructor();
    com.google.javascript.rhino.jstype.FunctionBuilder var32 = var5.withReturnType((com.google.javascript.rhino.jstype.JSType)var29);
    com.google.javascript.rhino.ErrorReporter var33 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33);
    boolean var36 = var34.hasNamespace("hi!");
    var34.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var38 = null;
    com.google.javascript.rhino.jstype.JSType var39 = null;
    com.google.javascript.rhino.jstype.JSType[] var40 = new com.google.javascript.rhino.jstype.JSType[] { var39};
    com.google.javascript.rhino.jstype.FunctionType var41 = var34.createConstructorType(var38, var40);
    boolean var42 = var41.canBeCalled();
    boolean var43 = var41.isConstructor();
    com.google.javascript.rhino.ErrorReporter var44 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var44);
    boolean var47 = var45.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var48 = new com.google.javascript.rhino.jstype.FunctionBuilder(var45);
    com.google.javascript.rhino.ErrorReporter var49 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var49);
    boolean var52 = var50.hasNamespace("hi!");
    var50.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var54 = null;
    com.google.javascript.rhino.jstype.JSType var55 = null;
    com.google.javascript.rhino.jstype.JSType[] var56 = new com.google.javascript.rhino.jstype.JSType[] { var55};
    com.google.javascript.rhino.jstype.FunctionType var57 = var50.createConstructorType(var54, var56);
    boolean var58 = var57.canBeCalled();
    com.google.javascript.rhino.jstype.FunctionBuilder var60 = var48.withReturnType((com.google.javascript.rhino.jstype.JSType)var57, false);
    com.google.javascript.rhino.jstype.FunctionType var61 = var48.build();
    com.google.javascript.rhino.jstype.FunctionBuilder var63 = var48.withTemplateName("or");
    com.google.javascript.rhino.jstype.FunctionType var64 = var48.build();
    java.lang.Iterable var65 = var64.getCtorExtendedInterfaces();
    var0.applySingletonGetter(var29, var41, (com.google.javascript.rhino.jstype.ObjectType)var64);
    java.lang.Object var67 = null;
    java.lang.RuntimeException var68 = com.google.javascript.rhino.ScriptRuntime.notFunctionError((java.lang.Object)var29, var67);
    com.google.javascript.rhino.EcmaError var70 = com.google.javascript.rhino.ScriptRuntime.typeError("");
    java.lang.String var71 = var70.getSourceName();
    int var72 = var70.lineNumber();
    var68.addSuppressed((java.lang.Throwable)var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
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
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test120"); }


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
    com.google.javascript.rhino.jstype.StaticScope var12 = null;
    com.google.javascript.rhino.jstype.JSType var17 = var1.getType(var12, "<No stack trace available>", "ERROR  100", 0, 100);
    com.google.javascript.rhino.jstype.JSType var22 = var1.createNamedType("hi!", "ERROR", 100, 100);
    boolean var23 = var1.shouldTolerateUndefinedValues();
    var1.resetForTypeCheck();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test121"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    var1.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var5 = null;
    com.google.javascript.rhino.jstype.JSType var6 = null;
    com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
    com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
    com.google.javascript.rhino.jstype.ObjectType var9 = var1.createAnonymousObjectType();
    boolean var10 = var9.hasDisplayName();
    
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

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test122"); }


    com.google.javascript.jscomp.DefaultCodingConvention var0 = new com.google.javascript.jscomp.DefaultCodingConvention();
    boolean var2 = var0.isConstantKey("<No stack trace available>");
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.Node.newString("");
    var5.putIntProp(100, 1);
    com.google.javascript.rhino.Node var9 = var5.removeFirstChild();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var19 = new com.google.javascript.rhino.Node(1, var5, var11, var16, 1, 1);
    java.lang.String var20 = var0.getSingletonGetterClassName(var16);
    java.lang.String var21 = var0.getExportSymbolFunction();
    com.google.javascript.rhino.jstype.FunctionType var22 = null;
    com.google.javascript.rhino.jstype.FunctionType var23 = null;
    com.google.javascript.rhino.ErrorReporter var24 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24);
    boolean var27 = var25.hasNamespace("hi!");
    var25.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var29 = null;
    com.google.javascript.rhino.jstype.JSType var30 = null;
    com.google.javascript.rhino.jstype.JSType[] var31 = new com.google.javascript.rhino.jstype.JSType[] { var30};
    com.google.javascript.rhino.jstype.FunctionType var32 = var25.createConstructorType(var29, var31);
    com.google.javascript.rhino.ErrorReporter var33 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33);
    boolean var36 = var34.hasNamespace("hi!");
    var34.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var38 = null;
    com.google.javascript.rhino.jstype.JSType var39 = null;
    com.google.javascript.rhino.jstype.JSType[] var40 = new com.google.javascript.rhino.jstype.JSType[] { var39};
    com.google.javascript.rhino.jstype.FunctionType var41 = var34.createConstructorType(var38, var40);
    boolean var42 = var41.canBeCalled();
    var32.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var41);
    boolean var44 = var32.hasCachedValues();
    var32.clearResolved();
    var0.applySingletonGetter(var22, var23, (com.google.javascript.rhino.jstype.ObjectType)var32);
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.Node.newString("");
    java.lang.String var52 = var48.toString(false, true, false);
    com.google.javascript.rhino.Node var55 = com.google.javascript.rhino.Node.newString("");
    var55.putIntProp(100, 1);
    com.google.javascript.rhino.Node var59 = var55.removeFirstChild();
    com.google.javascript.rhino.Node var61 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var66 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var69 = new com.google.javascript.rhino.Node(1, var55, var61, var66, 1, 1);
    boolean var70 = var61.hasSideEffects();
    com.google.javascript.rhino.Node var71 = var48.copyInformationFromForTree(var61);
    com.google.javascript.rhino.Node var72 = var61.cloneNode();
    java.lang.String var73 = var0.getSingletonGetterClassName(var61);
    com.google.javascript.rhino.Node var74 = var61.cloneNode();
    
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
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "STRING "+ "'", var52.equals("STRING "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test123"); }


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
    com.google.javascript.rhino.ErrorReporter var32 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32);
    boolean var35 = var33.hasNamespace("hi!");
    var33.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var37 = null;
    com.google.javascript.rhino.jstype.JSType var38 = null;
    com.google.javascript.rhino.jstype.JSType[] var39 = new com.google.javascript.rhino.jstype.JSType[] { var38};
    com.google.javascript.rhino.jstype.FunctionType var40 = var33.createConstructorType(var37, var39);
    boolean var41 = var40.canBeCalled();
    com.google.javascript.rhino.jstype.FunctionPrototypeType var42 = null;
    boolean var43 = var40.setPrototype(var42);
    com.google.javascript.rhino.jstype.JSType[] var44 = new com.google.javascript.rhino.jstype.JSType[] { var42};
    boolean var45 = var18.addRequiredParams(var44);
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.Node.newString("");
    var48.putIntProp(100, 1);
    com.google.javascript.rhino.Node var52 = var48.removeFirstChild();
    com.google.javascript.rhino.Node var54 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var59 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var62 = new com.google.javascript.rhino.Node(1, var48, var54, var59, 1, 1);
    com.google.javascript.rhino.JSDocInfo var63 = var54.getJSDocInfo();
    var54.setSourcePositionForTree(100);
    java.lang.Object var67 = null;
    var54.putProp((-1), var67);
    com.google.javascript.rhino.Node var73 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    var73.setIsSyntheticBlock(true);
    java.lang.String var76 = var73.getString();
    var73.detachChildren();
    boolean var78 = var54.hasChild(var73);
    com.google.javascript.rhino.Node var79 = var18.newParameterFromNode(var54);
    java.lang.String var80 = com.google.javascript.jscomp.NodeUtil.getSourceName(var79);
    
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
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + ""+ "'", var76.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test124"); }


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
    boolean var43 = var37.isNoCompile();
    java.lang.String var44 = var37.getReturnDescription();
    com.google.javascript.rhino.JSTypeExpression var45 = var37.getReturnType();
    com.google.javascript.rhino.JSTypeExpression var46 = var37.getType();
    
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
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);

  }

  public void test125() {}
//   public void test125() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test125"); }
// 
// 
//     com.google.javascript.jscomp.DefaultCodingConvention var0 = new com.google.javascript.jscomp.DefaultCodingConvention();
//     boolean var2 = var0.isConstant("LinkedGraph");
//     java.lang.String var3 = var0.getExportSymbolFunction();
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.Node.newString("");
//     var6.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var10 = var6.removeFirstChild();
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var20 = new com.google.javascript.rhino.Node(1, var6, var12, var17, 1, 1);
//     var20.setType(409600);
//     boolean var23 = var0.isVarArgsParameter(var20);
// 
//   }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test126"); }


    java.nio.charset.Charset var1 = null;
    com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromFile("{1215373146}", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test127"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var3 = new com.google.javascript.jscomp.JSModule("");
    var1.addDependency(var3);
    java.util.List var5 = var1.getDependencies();
    com.google.javascript.jscomp.deps.SortedDependencies var6 = new com.google.javascript.jscomp.deps.SortedDependencies(var5);
    java.util.List var7 = var6.getInputsWithoutProvides();
    com.google.javascript.jscomp.JSModule var9 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var11 = new com.google.javascript.jscomp.JSModule("");
    var9.addDependency(var11);
    java.util.List var13 = var9.getDependencies();
    com.google.javascript.jscomp.JSModule var15 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var17 = new com.google.javascript.jscomp.JSModule("");
    var15.addDependency(var17);
    var9.addDependency(var15);
    com.google.javascript.jscomp.JSModule var21 = new com.google.javascript.jscomp.JSModule("hi!");
    var9.addDependency(var21);
    com.google.javascript.jscomp.SourceFile.Generator var24 = null;
    com.google.javascript.jscomp.JSSourceFile var25 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var24);
    com.google.javascript.jscomp.CompilerInput var27 = new com.google.javascript.jscomp.CompilerInput(var25, false);
    var21.add(var25);
    java.util.List var29 = var21.getDependencies();
    java.util.List var30 = var6.getSortedDependenciesOf(var29);
    java.util.List var31 = var6.getSortedList();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.deps.DependencyInfo var33 = var6.getInputProviding("-1");
      fail("Expected exception of type com.google.javascript.jscomp.deps.SortedDependencies.MissingProvideException");
    } catch (com.google.javascript.jscomp.deps.SortedDependencies.MissingProvideException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test128"); }


    com.google.javascript.jscomp.DefaultCodingConvention var0 = new com.google.javascript.jscomp.DefaultCodingConvention();
    boolean var2 = var0.isConstantKey("<No stack trace available>");
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.Node.newString("");
    var5.putIntProp(100, 1);
    com.google.javascript.rhino.Node var9 = var5.removeFirstChild();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var19 = new com.google.javascript.rhino.Node(1, var5, var11, var16, 1, 1);
    java.lang.String var20 = var0.getSingletonGetterClassName(var16);
    int var21 = var16.getType();
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.Node.newString("");
    java.lang.String var27 = var23.toString(false, true, false);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.Node.newString("");
    var30.putIntProp(100, 1);
    com.google.javascript.rhino.Node var34 = var30.removeFirstChild();
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var44 = new com.google.javascript.rhino.Node(1, var30, var36, var41, 1, 1);
    boolean var45 = var36.hasSideEffects();
    com.google.javascript.rhino.Node var46 = var23.copyInformationFromForTree(var36);
    com.google.javascript.rhino.Node var47 = var16.clonePropsFrom(var36);
    com.google.javascript.rhino.Node var48 = var47.getNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.JSDocInfo var49 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(var47);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
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
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "STRING "+ "'", var27.equals("STRING "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test129"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    java.lang.Iterable var2 = var0.getDirectedGraphNodes();
    java.util.List var3 = var0.getGraphvizNodes();
    com.google.javascript.jscomp.JSModuleGraph var4 = new com.google.javascript.jscomp.JSModuleGraph(var3);
    var4.coalesceDuplicateFiles();
    var4.coalesceDuplicateFiles();
    com.google.javascript.jscomp.JSModule var8 = new com.google.javascript.jscomp.JSModule("hi!");
    com.google.javascript.jscomp.JSModule var10 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var12 = new com.google.javascript.jscomp.JSModule("");
    var10.addDependency(var12);
    java.util.List var14 = var10.getRequires();
    com.google.javascript.jscomp.JSModule var15 = var4.getDeepestCommonDependencyInclusive(var8, var10);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var16 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var17 = var16.getNodes();
    java.lang.Object var18 = null;
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var19 = var16.getDirectedGraphNode(var18);
    var16.pushEdgeAnnotations();
    java.util.Collection var21 = var16.getNodes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.JSModule var22 = var4.getDeepestCommonDependencyInclusive(var21);
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test130"); }


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
    boolean var42 = var41.canBeCalled();
    com.google.javascript.rhino.jstype.JSType var43 = var41.getReturnType();
    com.google.javascript.rhino.jstype.JSType var45 = var27.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType)var41, "");
    var27.setLastGeneration(false);
    boolean var49 = var27.hasNamespace("-1");
    com.google.javascript.rhino.jstype.StaticScope var50 = null;
    var27.resolveTypesInScope(var50);
    com.google.javascript.rhino.jstype.JSTypeRegistry var52 = null;
    com.google.javascript.rhino.jstype.FunctionParamBuilder var53 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var52);
    com.google.javascript.rhino.ErrorReporter var54 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var54);
    boolean var57 = var55.hasNamespace("hi!");
    var55.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var59 = null;
    com.google.javascript.rhino.jstype.JSType var60 = null;
    com.google.javascript.rhino.jstype.JSType[] var61 = new com.google.javascript.rhino.jstype.JSType[] { var60};
    com.google.javascript.rhino.jstype.FunctionType var62 = var55.createConstructorType(var59, var61);
    com.google.javascript.rhino.jstype.ObjectType var63 = var55.createAnonymousObjectType();
    com.google.javascript.rhino.jstype.JSType[] var64 = new com.google.javascript.rhino.jstype.JSType[] { var63};
    boolean var65 = var53.addRequiredParams(var64);
    com.google.javascript.rhino.Node var66 = var27.createOptionalParameters(var64);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var67 = var0.isOptionalParameter(var66);
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
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);

  }

  public void test131() {}
//   public void test131() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test131"); }
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
//     com.google.javascript.rhino.jstype.FunctionBuilder var31 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
//     com.google.javascript.rhino.ErrorReporter var32 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32);
//     boolean var35 = var33.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.RecordTypeBuilder var36 = new com.google.javascript.rhino.jstype.RecordTypeBuilder(var33);
//     com.google.javascript.rhino.ErrorReporter var37 = var33.getErrorReporter();
//     com.google.javascript.rhino.ErrorReporter var38 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var38);
//     boolean var41 = var39.hasNamespace("hi!");
//     var39.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var43 = null;
//     com.google.javascript.rhino.jstype.JSType var44 = null;
//     com.google.javascript.rhino.jstype.JSType[] var45 = new com.google.javascript.rhino.jstype.JSType[] { var44};
//     com.google.javascript.rhino.jstype.FunctionType var46 = var39.createConstructorType(var43, var45);
//     com.google.javascript.rhino.jstype.ObjectType var47 = var39.createAnonymousObjectType();
//     boolean var48 = var47.isVoidType();
//     com.google.javascript.rhino.ErrorReporter var49 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var49);
//     boolean var52 = var50.hasNamespace("hi!");
//     var50.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var54 = null;
//     com.google.javascript.rhino.jstype.JSType var55 = null;
//     com.google.javascript.rhino.jstype.JSType[] var56 = new com.google.javascript.rhino.jstype.JSType[] { var55};
//     com.google.javascript.rhino.jstype.FunctionType var57 = var50.createConstructorType(var54, var56);
//     boolean var58 = var57.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType.TypePair var59 = var47.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var57);
//     boolean var60 = var47.isEmptyType();
//     boolean var62 = var33.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType)var47, "");
//     boolean var63 = var47.isNumberObjectType();
//     boolean var64 = var47.isResolved();
//     com.google.javascript.rhino.ErrorReporter var65 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var65);
//     boolean var68 = var66.hasNamespace("hi!");
//     var66.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var70 = null;
//     com.google.javascript.rhino.jstype.JSType var71 = null;
//     com.google.javascript.rhino.jstype.JSType[] var72 = new com.google.javascript.rhino.jstype.JSType[] { var71};
//     com.google.javascript.rhino.jstype.FunctionType var73 = var66.createConstructorType(var70, var72);
//     boolean var74 = var73.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType var75 = var73.getReturnType();
//     com.google.javascript.rhino.Node var76 = var73.getSource();
//     boolean var77 = var73.isInstanceType();
//     com.google.javascript.rhino.jstype.FunctionPrototypeType var78 = var73.getPrototype();
//     boolean var79 = var78.isFunctionPrototypeType();
//     java.lang.Iterable var80 = var78.getCtorExtendedInterfaces();
//     com.google.javascript.rhino.JSDocInfo var81 = var78.getJSDocInfo();
//     com.google.javascript.jscomp.JSModule var83 = new com.google.javascript.jscomp.JSModule("");
//     com.google.javascript.jscomp.JSModule var85 = new com.google.javascript.jscomp.JSModule("");
//     var83.addDependency(var85);
//     java.util.List var87 = var83.getDependencies();
//     com.google.javascript.jscomp.deps.SortedDependencies var88 = new com.google.javascript.jscomp.deps.SortedDependencies(var87);
//     java.util.List var89 = var88.getInputsWithoutProvides();
//     com.google.javascript.rhino.jstype.JSType var90 = var1.createFunctionType(var47, (com.google.javascript.rhino.jstype.JSType)var78, var89);
//     com.google.javascript.rhino.jstype.JSTypeNative var91 = null;
//     com.google.javascript.rhino.jstype.FunctionType var92 = var1.getNativeFunctionType(var91);
// 
//   }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test132"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("");
    var3.putIntProp(100, 1);
    com.google.javascript.rhino.Node var7 = var3.removeFirstChild();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var17 = new com.google.javascript.rhino.Node(1, var3, var9, var14, 1, 1);
    com.google.javascript.rhino.Node var18 = var9.getNext();
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.Node.newString("");
    var20.setWasEmptyNode(true);
    java.lang.String var23 = var9.checkTreeEquals(var20);
    com.google.javascript.rhino.Node[] var24 = new com.google.javascript.rhino.Node[] { var9};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var25 = new com.google.javascript.rhino.Node(2147483647, var24);
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test133"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Context.reportWarning("<No stack trace available>");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test134"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.Node.newNumber(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test135"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.RecordTypeBuilder var4 = new com.google.javascript.rhino.jstype.RecordTypeBuilder(var1);
    com.google.javascript.rhino.ErrorReporter var5 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var5);
    boolean var8 = var6.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var9 = new com.google.javascript.rhino.jstype.FunctionBuilder(var6);
    com.google.javascript.rhino.jstype.JSType var11 = var6.getType("STRING ");
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
    java.lang.Iterable var34 = var31.getAllImplementedInterfaces();
    com.google.javascript.rhino.jstype.JSType[] var35 = new com.google.javascript.rhino.jstype.JSType[] { var31};
    com.google.javascript.rhino.Node var36 = var6.createParametersWithVarArgs(var35);
    com.google.javascript.rhino.Node var37 = var1.createOptionalParameters(var35);
    var37.setIsSyntheticBlock(false);
    boolean var40 = var37.hasOneChild();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var37.setDouble(10.0d);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
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
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test136"); }


    com.google.javascript.jscomp.SourceAst var0 = null;
    com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "", true);
    com.google.javascript.jscomp.CompilerInput var6 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var3, "", false);
    com.google.javascript.jscomp.JSModule var7 = null;
    var3.setModule(var7);
    com.google.javascript.jscomp.SourceFile.Generator var10 = null;
    com.google.javascript.jscomp.JSSourceFile var11 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var10);
    java.lang.String var12 = var11.getName();
    com.google.javascript.jscomp.CompilerInput var14 = new com.google.javascript.jscomp.CompilerInput(var11, true);
    com.google.javascript.jscomp.JSModule var16 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var18 = new com.google.javascript.jscomp.JSModule("");
    var16.addDependency(var18);
    java.util.List var20 = var16.getDependencies();
    java.util.List var21 = var16.getRequires();
    com.google.javascript.jscomp.SourceAst var22 = null;
    com.google.javascript.jscomp.CompilerInput var25 = new com.google.javascript.jscomp.CompilerInput(var22, "", true);
    com.google.javascript.jscomp.SourceAst var26 = var25.getSourceAst();
    var16.remove(var25);
    var14.setModule(var16);
    com.google.javascript.jscomp.CompilerInput var30 = var16.getByName("TypeError: ");
    var3.setModule(var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var32 = var16.getPathRelativeToClosureBase();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test137"); }


    com.google.javascript.rhino.Node var2 = new com.google.javascript.rhino.Node(100);
    com.google.javascript.jscomp.CheckLevel var4 = null;
    com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.make("", var4, "(ERROR)");
    com.google.javascript.jscomp.CheckLevel var8 = null;
    com.google.javascript.jscomp.DiagnosticType var10 = com.google.javascript.jscomp.DiagnosticType.make("", var8, "(ERROR)");
    int var11 = var6.compareTo(var10);
    java.lang.String[] var13 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
    com.google.javascript.jscomp.JSError var14 = com.google.javascript.jscomp.JSError.make(var10, var13);
    com.google.javascript.jscomp.CheckLevel var16 = null;
    com.google.javascript.jscomp.DiagnosticType var18 = com.google.javascript.jscomp.DiagnosticType.make("", var16, "(ERROR)");
    com.google.javascript.jscomp.CheckLevel var20 = null;
    com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.make("", var20, "(ERROR)");
    int var23 = var18.compareTo(var22);
    java.lang.String[] var25 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
    com.google.javascript.jscomp.JSError var26 = com.google.javascript.jscomp.JSError.make(var22, var25);
    com.google.javascript.jscomp.JSError var27 = com.google.javascript.jscomp.JSError.make(var10, var25);
    com.google.javascript.jscomp.CheckLevel var29 = null;
    com.google.javascript.jscomp.DiagnosticType var31 = com.google.javascript.jscomp.DiagnosticType.make("", var29, "(ERROR)");
    com.google.javascript.jscomp.CheckLevel var33 = null;
    com.google.javascript.jscomp.DiagnosticType var35 = com.google.javascript.jscomp.DiagnosticType.make("", var33, "(ERROR)");
    int var36 = var31.compareTo(var35);
    java.lang.String[] var38 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
    com.google.javascript.jscomp.JSError var39 = com.google.javascript.jscomp.JSError.make(var35, var38);
    com.google.javascript.jscomp.JSError var40 = com.google.javascript.jscomp.JSError.make("LinkedGraph", var2, var10, var38);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setDouble(0.0d);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test138() {}
//   public void test138() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test138"); }
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
//     boolean var23 = var1.hasNamespace("-1");
//     com.google.javascript.rhino.ErrorReporter var24 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24);
//     boolean var27 = var25.hasNamespace("hi!");
//     var25.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var29 = null;
//     com.google.javascript.rhino.jstype.JSType var30 = null;
//     com.google.javascript.rhino.jstype.JSType[] var31 = new com.google.javascript.rhino.jstype.JSType[] { var30};
//     com.google.javascript.rhino.jstype.FunctionType var32 = var25.createConstructorType(var29, var31);
//     com.google.javascript.rhino.jstype.ObjectType var33 = var25.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var34 = null;
//     com.google.javascript.rhino.jstype.StaticScope var35 = null;
//     com.google.javascript.rhino.jstype.JSType var36 = var33.forceResolve(var34, var35);
//     java.lang.String var37 = var36.toDebugHashCodeString();
//     com.google.javascript.rhino.jstype.JSType var38 = var1.createOptionalType(var36);
//     com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.Node.newString("");
//     var42.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var46 = var42.removeFirstChild();
//     com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var56 = new com.google.javascript.rhino.Node(1, var42, var48, var53, 1, 1);
//     boolean var57 = var48.hasSideEffects();
//     com.google.javascript.rhino.Node var58 = var48.getLastSibling();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.jstype.FunctionType var59 = var1.createInterfaceType("JSDocInfo", var48);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == true);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var17);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var19);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var23 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var27 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var31);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var32);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var33);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var36);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var37 + "' != '" + "{1578772328}"+ "'", var37.equals("{1578772328}"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var38);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var42);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var46);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var48);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var53);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var57 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var58);
// 
//   }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test139"); }


    com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
    boolean var2 = var0.isConstantKey("(ERROR)");
    com.google.javascript.jscomp.DefaultCodingConvention var3 = new com.google.javascript.jscomp.DefaultCodingConvention();
    com.google.javascript.rhino.jstype.FunctionType var4 = null;
    com.google.javascript.rhino.jstype.FunctionType var5 = null;
    com.google.javascript.jscomp.CodingConvention.SubclassType var6 = null;
    var3.applySubclassRelationship(var4, var5, var6);
    java.lang.String var8 = var3.getDelegateSuperclassName();
    boolean var11 = var3.isExported("", false);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.Node.newString("");
    var14.putIntProp(100, 1);
    com.google.javascript.rhino.Node var18 = var14.removeFirstChild();
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var28 = new com.google.javascript.rhino.Node(1, var14, var20, var25, 1, 1);
    boolean var29 = var3.isVarArgsParameter(var14);
    java.io.PrintStream var30 = null;
    com.google.javascript.jscomp.Compiler var31 = new com.google.javascript.jscomp.Compiler(var30);
    com.google.javascript.jscomp.Region var34 = var31.getSourceRegion("", 0);
    com.google.javascript.jscomp.Region var37 = var31.getSourceRegion("", 0);
    com.google.javascript.jscomp.Compiler.IntermediateState var38 = var31.getState();
    com.google.javascript.jscomp.NodeTraversal.Callback var39 = null;
    com.google.javascript.jscomp.NodeTraversal var40 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var31, var39);
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.Node.newString("");
    var43.putIntProp(100, 1);
    com.google.javascript.rhino.Node var47 = var43.removeFirstChild();
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var54 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var57 = new com.google.javascript.rhino.Node(1, var43, var49, var54, 1, 1);
    com.google.javascript.rhino.JSDocInfo var58 = var49.getJSDocInfo();
    var49.setSourcePositionForTree(100);
    java.lang.Object var62 = null;
    var49.putProp((-1), var62);
    com.google.javascript.rhino.Node var68 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    var68.setIsSyntheticBlock(true);
    java.lang.String var71 = var68.getString();
    var68.detachChildren();
    boolean var73 = var49.hasChild(var68);
    com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast var74 = var3.getObjectLiteralCast(var40, var68);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var75 = var0.isPropertyTestFunction(var68);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + ""+ "'", var71.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);

  }

  public void test140() {}
//   public void test140() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test140"); }
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
//     com.google.javascript.rhino.jstype.JSType var22 = var1.createNamedType("hi!", "ERROR", 100, 100);
//     boolean var23 = var1.shouldTolerateUndefinedValues();
//     com.google.javascript.rhino.jstype.StaticScope var24 = null;
//     var1.resolveTypesInScope(var24);
// 
//   }

  public void test141() {}
//   public void test141() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test141"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var5 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     var5.setColorize(false);
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.Node.newString("");
//     var11.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var15 = var11.removeFirstChild();
//     com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var25 = new com.google.javascript.rhino.Node(1, var11, var17, var22, 1, 1);
//     com.google.javascript.jscomp.CheckLevel var27 = null;
//     com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.make("", var27, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var31 = null;
//     com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.make("", var31, "(ERROR)");
//     int var34 = var29.compareTo(var33);
//     java.lang.String[] var35 = null;
//     com.google.javascript.jscomp.JSError var36 = com.google.javascript.jscomp.JSError.make("ERROR  100 [synthetic: 1]\n", var25, var29, var35);
//     java.lang.String var37 = var5.formatError(var36);
// 
//   }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test142"); }


    com.google.javascript.rhino.EcmaError var2 = com.google.javascript.rhino.ScriptRuntime.constructError("hi!", "hi!");
    int var3 = var2.getLineNumber();
    int var4 = var2.getLineNumber();
    java.lang.Throwable[] var5 = var2.getSuppressed();
    java.lang.String var6 = var2.sourceName();
    com.google.javascript.rhino.EvaluatorException var8 = new com.google.javascript.rhino.EvaluatorException("");
    var2.addSuppressed((java.lang.Throwable)var8);
    var2.initColumnNumber(100);
    java.io.FilenameFilter var12 = null;
    java.lang.String var13 = var2.getScriptStackTrace(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "<No stack trace available>"+ "'", var13.equals("<No stack trace available>"));

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test143"); }


    com.google.javascript.rhino.EcmaError var1 = com.google.javascript.rhino.ScriptRuntime.typeError("");
    java.lang.String var2 = var1.details();
    java.lang.String var3 = var1.getSourceName();
    int var4 = var1.columnNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "TypeError: "+ "'", var2.equals("TypeError: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test144() {}
//   public void test144() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test144"); }
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
//     com.google.javascript.rhino.Node var33 = var16.getScopeRoot();
// 
//   }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test145"); }


    java.lang.String var1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("<No stack trace available>");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "(<No stack trace available>)"+ "'", var1.equals("(<No stack trace available>)"));

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test146"); }


    com.google.javascript.jscomp.SourceFile.Generator var1 = null;
    com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var1);
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test147"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler var1 = var0.getAliasTransformationHandler();
    var0.setTweakToNumberLiteral("hi!", 10);
    var0.enableExternExports(false);
    var0.setDefineToNumberLiteral("or", 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test148"); }


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
    com.google.javascript.rhino.jstype.StaticScope var12 = null;
    com.google.javascript.rhino.jstype.JSType var17 = var1.getType(var12, "<No stack trace available>", "ERROR  100", 0, 100);
    com.google.javascript.rhino.jstype.JSType var22 = var1.createNamedType("hi!", "ERROR", 100, 100);
    com.google.javascript.rhino.ErrorReporter var23 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var23, false);
    com.google.javascript.rhino.ErrorReporter var26 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var26);
    boolean var29 = var27.hasNamespace("hi!");
    var27.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var31 = null;
    com.google.javascript.rhino.jstype.JSType var32 = null;
    com.google.javascript.rhino.jstype.JSType[] var33 = new com.google.javascript.rhino.jstype.JSType[] { var32};
    com.google.javascript.rhino.jstype.FunctionType var34 = var27.createConstructorType(var31, var33);
    com.google.javascript.rhino.jstype.ObjectType var35 = var27.createAnonymousObjectType();
    boolean var36 = var35.isVoidType();
    com.google.javascript.rhino.ErrorReporter var37 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var37);
    boolean var40 = var38.hasNamespace("hi!");
    var38.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var42 = null;
    com.google.javascript.rhino.jstype.JSType var43 = null;
    com.google.javascript.rhino.jstype.JSType[] var44 = new com.google.javascript.rhino.jstype.JSType[] { var43};
    com.google.javascript.rhino.jstype.FunctionType var45 = var38.createConstructorType(var42, var44);
    boolean var46 = var45.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var47 = var35.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var45);
    java.lang.Iterable var48 = var35.getCtorExtendedInterfaces();
    com.google.javascript.rhino.jstype.JSType var49 = var35.getParameterType();
    com.google.javascript.rhino.JSDocInfo var51 = new com.google.javascript.rhino.JSDocInfo();
    var35.setPropertyJSDocInfo("ERROR", var51, false);
    com.google.javascript.rhino.ErrorReporter var54 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var54);
    boolean var57 = var55.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var58 = new com.google.javascript.rhino.jstype.FunctionBuilder(var55);
    com.google.javascript.rhino.jstype.JSType var60 = var55.getType("STRING ");
    com.google.javascript.rhino.ErrorReporter var61 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var61);
    boolean var64 = var62.hasNamespace("hi!");
    var62.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var66 = null;
    com.google.javascript.rhino.jstype.JSType var67 = null;
    com.google.javascript.rhino.jstype.JSType[] var68 = new com.google.javascript.rhino.jstype.JSType[] { var67};
    com.google.javascript.rhino.jstype.FunctionType var69 = var62.createConstructorType(var66, var68);
    boolean var70 = var69.canBeCalled();
    com.google.javascript.rhino.jstype.JSType var71 = var69.getReturnType();
    com.google.javascript.rhino.jstype.JSType var73 = var55.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType)var69, "");
    var55.setLastGeneration(false);
    boolean var77 = var55.hasNamespace("-1");
    com.google.javascript.rhino.jstype.StaticScope var78 = null;
    var55.resolveTypesInScope(var78);
    com.google.javascript.rhino.jstype.JSTypeRegistry var80 = null;
    com.google.javascript.rhino.jstype.FunctionParamBuilder var81 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var80);
    com.google.javascript.rhino.ErrorReporter var82 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var83 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var82);
    boolean var85 = var83.hasNamespace("hi!");
    var83.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var87 = null;
    com.google.javascript.rhino.jstype.JSType var88 = null;
    com.google.javascript.rhino.jstype.JSType[] var89 = new com.google.javascript.rhino.jstype.JSType[] { var88};
    com.google.javascript.rhino.jstype.FunctionType var90 = var83.createConstructorType(var87, var89);
    com.google.javascript.rhino.jstype.ObjectType var91 = var83.createAnonymousObjectType();
    com.google.javascript.rhino.jstype.JSType[] var92 = new com.google.javascript.rhino.jstype.JSType[] { var91};
    boolean var93 = var81.addRequiredParams(var92);
    com.google.javascript.rhino.Node var94 = var55.createOptionalParameters(var92);
    com.google.javascript.rhino.jstype.FunctionType var95 = var25.createConstructorType((com.google.javascript.rhino.jstype.JSType)var35, var92);
    com.google.javascript.rhino.Node var96 = var1.createParameters(var92);
    var1.clearNamedTypes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
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
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);

  }

  public void test149() {}
//   public void test149() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test149"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     java.lang.String var2 = var1.toSource();
// 
//   }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test150"); }


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
    boolean var68 = var16.hasScope();
    boolean var69 = var16.hasScope();
    com.google.javascript.rhino.Node var70 = var16.getEnclosingFunction();
    
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
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test151"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.lang.Iterable var1 = var0.getDirectedGraphNodes();
    var0.clearEdgeAnnotations();
    java.util.List var3 = var0.getEdges();
    com.google.javascript.rhino.Context var4 = null;
    com.google.javascript.rhino.Context var5 = com.google.javascript.rhino.Context.enter(var4);
    int var6 = var5.getOptimizationLevel();
    boolean var7 = var5.hasCompileFunctionsWithDynamicScope();
    java.lang.Object var8 = var5.getDebuggerContextData();
    int var9 = var5.getInstructionObserverThreshold();
    boolean var10 = var5.isGeneratingSource();
    java.lang.Object var12 = var5.getThreadLocal((java.lang.Object)(-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var13 = var0.getDirectedSuccNodes((java.lang.Object)var5);
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
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test152() {}
//   public void test152() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test152"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = null;
//     com.google.javascript.rhino.Context var1 = com.google.javascript.rhino.Context.enter(var0);
//     int var2 = var1.getOptimizationLevel();
//     boolean var3 = var1.hasCompileFunctionsWithDynamicScope();
//     boolean var5 = var1.isActivationNeeded(". (ERROR) at (unknown source) line (unknown line) : (unknown column)");
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var1.setLanguageVersion(10);
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
//     assertTrue(var5 == false);
// 
//   }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test153"); }


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
    boolean var46 = var37.hasType();
    
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

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test154"); }


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
    com.google.javascript.jscomp.JSModule var19 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var21 = new com.google.javascript.jscomp.JSModule("");
    var19.addDependency(var21);
    java.util.List var23 = var19.getDependencies();
    com.google.javascript.jscomp.JSModule var25 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var27 = new com.google.javascript.jscomp.JSModule("");
    var25.addDependency(var27);
    var19.addDependency(var25);
    java.lang.String var30 = var19.getName();
    var11.addDependency(var19);
    com.google.javascript.jscomp.JSModule var33 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var35 = new com.google.javascript.jscomp.JSModule("");
    var33.addDependency(var35);
    var33.setDepth(100);
    com.google.javascript.jscomp.SourceFile.Generator var40 = null;
    com.google.javascript.jscomp.JSSourceFile var41 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var40);
    com.google.javascript.jscomp.CompilerInput var43 = new com.google.javascript.jscomp.CompilerInput(var41, false);
    var33.add(var43);
    java.io.PrintStream var45 = null;
    com.google.javascript.jscomp.Compiler var46 = new com.google.javascript.jscomp.Compiler(var45);
    com.google.javascript.jscomp.Scope var47 = var46.getTopScope();
    com.google.javascript.jscomp.ErrorManager var48 = var46.getErrorManager();
    var43.setErrorManager(var48);
    com.google.javascript.jscomp.JSModule var50 = var43.getModule();
    com.google.javascript.jscomp.CompilerInput var51 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.addAfter(var43, var51);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test155"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setGenerateExports(false);
    var0.setRewriteNewDateGoogNow(true);
    var0.setShadowVariables(true);
    var0.setOutputCharset("hi!");

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test156"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.Node.newString("");
    var2.putIntProp(100, 1);
    com.google.javascript.rhino.Node var6 = var2.removeFirstChild();
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var16 = new com.google.javascript.rhino.Node(1, var2, var8, var13, 1, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var16.setDouble((-1.0d));
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
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

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test157"); }


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
    com.google.javascript.rhino.Node var67 = var16.getEnclosingFunction();
    com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.Node.newString("");
    var69.putIntProp(100, 1);
    int var73 = var69.getSourcePosition();
    com.google.javascript.rhino.Node var74 = var69.getLastSibling();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var16.traverse(var69);
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
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test158"); }


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
    boolean var74 = var59.isRecordType();
    
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
    assertTrue(var74 == false);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test159"); }


    com.google.javascript.jscomp.DefaultCodingConvention var0 = new com.google.javascript.jscomp.DefaultCodingConvention();
    boolean var2 = var0.isConstant("STRING ");
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.Node.newString("");
    var5.putIntProp(100, 1);
    com.google.javascript.rhino.Node var9 = var5.removeFirstChild();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var19 = new com.google.javascript.rhino.Node(1, var5, var11, var16, 1, 1);
    com.google.javascript.rhino.Node var20 = var11.getNext();
    java.lang.String var21 = var0.identifyTypeDefAssign(var11);
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.Node.newString(0, "ERROR");
    boolean var25 = var24.isVarArgs();
    java.lang.String var26 = var0.identifyTypeDefAssign(var24);
    boolean var29 = var0.isExported("", true);
    
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
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test160"); }


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
    com.google.javascript.rhino.jstype.FunctionParamBuilder var25 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var1);
    boolean var27 = var1.isForwardDeclaredType("ERROR  100");
    
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
    assertTrue(var27 == false);

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test161"); }


    com.google.javascript.rhino.Context.checkLanguageVersion(100);

  }

  public void test162() {}
//   public void test162() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test162"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = null;
//     com.google.javascript.rhino.Context var1 = com.google.javascript.rhino.Context.enter(var0);
//     var1.addActivationName("");
//     java.lang.Object var4 = var1.getDebuggerContextData();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       com.google.javascript.rhino.Context var5 = com.google.javascript.rhino.Context.enter(var1);
//       fail("Expected exception of type java.lang.RuntimeException");
//     } catch (java.lang.RuntimeException e) {
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

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test163"); }


    com.google.javascript.rhino.EcmaError var2 = com.google.javascript.rhino.ScriptRuntime.constructError("hi!", "hi!");
    int var3 = var2.getLineNumber();
    java.io.FilenameFilter var4 = null;
    java.lang.String var5 = var2.getScriptStackTrace(var4);
    int var6 = var2.columnNumber();
    java.lang.String var7 = var2.lineSource();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "<No stack trace available>"+ "'", var5.equals("<No stack trace available>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test164"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Context.reportWarning("STRING ");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test165"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    java.lang.String var1 = var0.getOriginalCommentString();
    boolean var2 = var0.hasType();
    boolean var3 = var0.isExterns();
    java.util.Collection var4 = var0.getAuthors();
    boolean var5 = var0.isNoSideEffects();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test166() {}
//   public void test166() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test166"); }
// 
// 
//     java.util.logging.Logger var0 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
//     com.google.javascript.jscomp.Compiler var2 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var1);
//     var1.setTypedPercent(100.0d);
//     com.google.javascript.jscomp.CheckLevel var5 = null;
//     com.google.javascript.jscomp.JSError var6 = null;
//     var1.println(var5, var6);
// 
//   }

  public void test167() {}
//   public void test167() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test167"); }
// 
// 
//     java.io.InputStream var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromInputStream("STRING \n", var1);
// 
//   }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test168"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var3 = new com.google.javascript.jscomp.JSModule("");
    var1.addDependency(var3);
    java.util.List var5 = var1.getDependencies();
    com.google.javascript.jscomp.JSModule var7 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var9 = new com.google.javascript.jscomp.JSModule("");
    var7.addDependency(var9);
    var1.addDependency(var7);
    var7.clearAsts();
    var7.setDepth(2);
    java.lang.String var15 = var7.toString();
    com.google.javascript.jscomp.JSModule var17 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var19 = new com.google.javascript.jscomp.JSModule("");
    var17.addDependency(var19);
    var17.setDepth(100);
    com.google.javascript.jscomp.SourceFile.Generator var24 = null;
    com.google.javascript.jscomp.JSSourceFile var25 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var24);
    com.google.javascript.jscomp.CompilerInput var27 = new com.google.javascript.jscomp.CompilerInput(var25, false);
    var17.add(var27);
    java.io.PrintStream var29 = null;
    com.google.javascript.jscomp.Compiler var30 = new com.google.javascript.jscomp.Compiler(var29);
    com.google.javascript.jscomp.Scope var31 = var30.getTopScope();
    com.google.javascript.jscomp.ErrorManager var32 = var30.getErrorManager();
    var27.setErrorManager(var32);
    java.io.PrintStream var34 = null;
    com.google.javascript.jscomp.Compiler var35 = new com.google.javascript.jscomp.Compiler(var34);
    com.google.javascript.jscomp.Region var38 = var35.getSourceRegion("", 0);
    com.google.javascript.jscomp.Region var41 = var35.getSourceRegion("", 0);
    com.google.javascript.jscomp.Compiler.IntermediateState var42 = var35.getState();
    com.google.javascript.jscomp.SourceMap var43 = var35.getSourceMap();
    com.google.javascript.jscomp.SourceFile.Generator var45 = null;
    com.google.javascript.jscomp.JSSourceFile var46 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var45);
    java.lang.String var47 = var46.getName();
    var46.setOriginalPath("");
    com.google.javascript.jscomp.SourceFile.Generator var51 = null;
    com.google.javascript.jscomp.JSSourceFile var52 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var51);
    java.lang.String var53 = var52.getName();
    com.google.javascript.jscomp.CompilerOptions var54 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.CodingConvention var55 = var54.getCodingConvention();
    var54.enableExternExports(true);
    boolean var58 = var54.isExternExportsEnabled();
    com.google.javascript.jscomp.Result var59 = var35.compile(var46, var52, var54);
    java.lang.String var60 = var52.toString();
    com.google.javascript.jscomp.CompilerInput var62 = new com.google.javascript.jscomp.CompilerInput(var52, true);
    var62.clearAst();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.addAfter(var27, var62);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "hi!"+ "'", var53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "hi!"+ "'", var60.equals("hi!"));

  }

  public void test169() {}
//   public void test169() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test169"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Compiler.IntermediateState var8 = var1.getState();
//     com.google.javascript.jscomp.NodeTraversal.Callback var9 = null;
//     com.google.javascript.jscomp.NodeTraversal var10 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var1, var9);
//     com.google.javascript.jscomp.DefaultCodingConvention var11 = new com.google.javascript.jscomp.DefaultCodingConvention();
//     boolean var13 = var11.isConstant("LinkedGraph");
//     java.lang.String var14 = var11.getExportSymbolFunction();
//     java.util.Collection var15 = var11.getAssertionFunctions();
//     com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.Node.newString("");
//     var18.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var22 = var18.removeFirstChild();
//     com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var32 = new com.google.javascript.rhino.Node(1, var18, var24, var29, 1, 1);
//     com.google.javascript.rhino.JSDocInfo var33 = var24.getJSDocInfo();
//     var24.setSourcePositionForTree(100);
//     java.lang.String var36 = var24.getString();
//     java.lang.String var37 = var11.getSingletonGetterClassName(var24);
//     com.google.javascript.jscomp.CheckLevel var38 = null;
//     com.google.javascript.jscomp.CheckLevel var40 = null;
//     com.google.javascript.jscomp.DiagnosticType var42 = com.google.javascript.jscomp.DiagnosticType.make("", var40, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var44 = null;
//     com.google.javascript.jscomp.DiagnosticType var46 = com.google.javascript.jscomp.DiagnosticType.make("", var44, "(ERROR)");
//     int var47 = var42.compareTo(var46);
//     com.google.javascript.jscomp.CheckLevel var49 = null;
//     com.google.javascript.jscomp.DiagnosticType var51 = com.google.javascript.jscomp.DiagnosticType.make("", var49, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var53 = null;
//     com.google.javascript.jscomp.DiagnosticType var55 = com.google.javascript.jscomp.DiagnosticType.make("", var53, "(ERROR)");
//     int var56 = var51.compareTo(var55);
//     java.lang.String[] var58 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var59 = com.google.javascript.jscomp.JSError.make(var55, var58);
//     com.google.javascript.jscomp.CheckLevel var61 = null;
//     com.google.javascript.jscomp.DiagnosticType var63 = com.google.javascript.jscomp.DiagnosticType.make("", var61, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var65 = null;
//     com.google.javascript.jscomp.DiagnosticType var67 = com.google.javascript.jscomp.DiagnosticType.make("", var65, "(ERROR)");
//     int var68 = var63.compareTo(var67);
//     java.lang.String[] var70 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var71 = com.google.javascript.jscomp.JSError.make(var67, var70);
//     com.google.javascript.jscomp.JSError var72 = com.google.javascript.jscomp.JSError.make(var55, var70);
//     com.google.javascript.jscomp.JSError var73 = var10.makeError(var24, var38, var46, var70);
//     com.google.javascript.jscomp.CheckLevel var74 = null;
//     com.google.javascript.jscomp.MessageFormatter var75 = null;
//     java.lang.String var76 = var73.format(var74, var75);
// 
//   }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test170"); }


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
    com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.Node.newString("");
    java.lang.String var73 = var69.toString(false, true, false);
    com.google.javascript.rhino.Node var76 = com.google.javascript.rhino.Node.newString("");
    var76.putIntProp(100, 1);
    com.google.javascript.rhino.Node var80 = var76.removeFirstChild();
    com.google.javascript.rhino.Node var82 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var87 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var90 = new com.google.javascript.rhino.Node(1, var76, var82, var87, 1, 1);
    boolean var91 = var82.hasSideEffects();
    com.google.javascript.rhino.Node var92 = var69.copyInformationFromForTree(var82);
    boolean var93 = var92.isQualifiedName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var16.traverse(var92);
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
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "STRING "+ "'", var73.equals("STRING "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == false);

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test171"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    java.lang.Iterable var2 = var0.getDirectedGraphNodes();
    java.util.List var3 = var0.getGraphvizNodes();
    com.google.javascript.jscomp.JSModuleGraph var4 = new com.google.javascript.jscomp.JSModuleGraph(var3);
    var4.coalesceDuplicateFiles();
    var4.coalesceDuplicateFiles();
    com.google.javascript.jscomp.JSModule var8 = new com.google.javascript.jscomp.JSModule("hi!");
    com.google.javascript.jscomp.JSModule var10 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var12 = new com.google.javascript.jscomp.JSModule("");
    var10.addDependency(var12);
    java.util.List var14 = var10.getRequires();
    com.google.javascript.jscomp.JSModule var15 = var4.getDeepestCommonDependencyInclusive(var8, var10);
    com.google.javascript.jscomp.CompilerOptions var16 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.CodingConvention var17 = var16.getCodingConvention();
    var16.enableExternExports(true);
    boolean var20 = var16.isExternExportsEnabled();
    var16.setPropertyAffinity(false);
    var16.setDefineToNumberLiteral("<unknown=409600>", 10);
    java.lang.RuntimeException var26 = com.google.javascript.rhino.ScriptRuntime.undefCallError((java.lang.Object)var8, (java.lang.Object)var16);
    var16.setDefineToNumberLiteral("STRING \n", 409600);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test172"); }


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
    com.google.javascript.rhino.jstype.FunctionType var74 = var73.build();
    boolean var75 = var74.canBeCalled();
    
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
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test173"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.Node.newString("");
    var2.putIntProp(100, 1);
    com.google.javascript.rhino.Node var6 = var2.removeFirstChild();
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var16 = new com.google.javascript.rhino.Node(1, var2, var8, var13, 1, 1);
    var16.setType(409600);
    com.google.javascript.rhino.Node var19 = com.google.javascript.jscomp.NodeUtil.newExpr(var16);
    boolean var20 = var16.isSyntheticBlock();
    
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
    assertTrue(var20 == false);

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test174"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.Node.newString("");
    var2.putIntProp(100, 1);
    com.google.javascript.rhino.Node var6 = var2.removeFirstChild();
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var16 = new com.google.javascript.rhino.Node(1, var2, var8, var13, 1, 1);
    boolean var17 = var16.isQuotedString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var18 = var16.toStringTree();
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
    assertTrue(var17 == false);

  }

  public void test175() {}
//   public void test175() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test175"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.rhino.Node var8 = var1.getRoot();
//     var1.optimize();
// 
//   }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test176"); }


    com.google.javascript.rhino.EvaluatorException var3 = new com.google.javascript.rhino.EvaluatorException("(com.google.javascript.rhino.EvaluatorException: hi! (#10))", ". (ERROR) at ERROR  100 [synthetic: 1]\n line 1 : 1", 100);

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test177"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSDocInfo var5 = null;
    var4.setJSDocInfo(var5);
    com.google.javascript.rhino.Node var8 = var4.getChildAtIndex(0);
    com.google.javascript.rhino.Node var9 = var4.cloneNode();
    int var10 = var9.getSourcePosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 409600);

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test178"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    boolean var2 = var1.isPopulatedWithFileOverview();
    boolean var3 = var1.isConstructorRecorded();
    boolean var5 = var1.recordReturnDescription("LP\n    NAME  [var_args_name: 1] : (undefined|{})\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test179"); }


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
    com.google.javascript.rhino.jstype.FunctionParamBuilder var25 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var1);
    boolean var26 = var25.hasVarArgs();
    com.google.javascript.rhino.Node var27 = var25.build();
    com.google.javascript.rhino.ErrorReporter var28 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var28);
    boolean var31 = var29.hasNamespace("hi!");
    var29.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var33 = null;
    com.google.javascript.rhino.jstype.JSType var34 = null;
    com.google.javascript.rhino.jstype.JSType[] var35 = new com.google.javascript.rhino.jstype.JSType[] { var34};
    com.google.javascript.rhino.jstype.FunctionType var36 = var29.createConstructorType(var33, var35);
    com.google.javascript.rhino.jstype.ObjectType var37 = var29.createAnonymousObjectType();
    com.google.javascript.rhino.jstype.StaticScope var38 = null;
    var29.resolveTypesInScope(var38);
    com.google.javascript.rhino.jstype.StaticScope var40 = null;
    com.google.javascript.rhino.jstype.JSType var45 = var29.getType(var40, "<No stack trace available>", "ERROR  100", 0, 100);
    com.google.javascript.rhino.jstype.JSType var50 = var29.createNamedType("hi!", "ERROR", 100, 100);
    com.google.javascript.rhino.jstype.JSTypeRegistry var51 = null;
    com.google.javascript.rhino.jstype.FunctionParamBuilder var52 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var51);
    com.google.javascript.rhino.ErrorReporter var53 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var53);
    boolean var56 = var54.hasNamespace("hi!");
    var54.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var58 = null;
    com.google.javascript.rhino.jstype.JSType var59 = null;
    com.google.javascript.rhino.jstype.JSType[] var60 = new com.google.javascript.rhino.jstype.JSType[] { var59};
    com.google.javascript.rhino.jstype.FunctionType var61 = var54.createConstructorType(var58, var60);
    com.google.javascript.rhino.jstype.ObjectType var62 = var54.createAnonymousObjectType();
    com.google.javascript.rhino.jstype.JSType[] var63 = new com.google.javascript.rhino.jstype.JSType[] { var62};
    boolean var64 = var52.addRequiredParams(var63);
    com.google.javascript.rhino.Node var65 = var29.createParametersWithVarArgs(var63);
    boolean var66 = var25.addRequiredParams(var63);
    
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
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);

  }

  public void test180() {}
//   public void test180() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test180"); }
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
//     com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.Node.newString("");
//     var34.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var38 = var34.removeFirstChild();
//     com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var48 = new com.google.javascript.rhino.Node(1, var34, var40, var45, 1, 1);
//     int var49 = var45.getLineno();
//     java.lang.RuntimeException var50 = com.google.javascript.rhino.ScriptRuntime.undefReadError((java.lang.Object)var4, (java.lang.Object)var49);
//     com.google.javascript.rhino.ErrorReporter var51 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var51);
//     boolean var54 = var52.hasNamespace("hi!");
//     var52.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var56 = null;
//     com.google.javascript.rhino.jstype.JSType var57 = null;
//     com.google.javascript.rhino.jstype.JSType[] var58 = new com.google.javascript.rhino.jstype.JSType[] { var57};
//     com.google.javascript.rhino.jstype.FunctionType var59 = var52.createConstructorType(var56, var58);
//     com.google.javascript.rhino.ErrorReporter var60 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var60);
//     boolean var63 = var61.hasNamespace("hi!");
//     var61.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var65 = null;
//     com.google.javascript.rhino.jstype.JSType var66 = null;
//     com.google.javascript.rhino.jstype.JSType[] var67 = new com.google.javascript.rhino.jstype.JSType[] { var66};
//     com.google.javascript.rhino.jstype.FunctionType var68 = var61.createConstructorType(var65, var67);
//     boolean var69 = var68.canBeCalled();
//     var59.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var68);
//     boolean var72 = var59.isPropertyTypeInferred("hi!");
//     com.google.javascript.rhino.jstype.FunctionBuilder var73 = var4.copyFromOtherFunction(var59);
//     com.google.javascript.rhino.ErrorReporter var74 = null;
//     com.google.javascript.rhino.jstype.StaticScope var75 = null;
//     com.google.javascript.rhino.jstype.JSType var76 = var59.resolve(var74, var75);
// 
//   }

  public void test181() {}
//   public void test181() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test181"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var5 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     com.google.javascript.jscomp.PassConfig var6 = null;
//     var1.setPassConfig(var6);
// 
//   }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test182"); }


    com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
    boolean var2 = var0.isConstantKey("(ERROR)");
    com.google.javascript.rhino.ErrorReporter var3 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var3);
    boolean var6 = var4.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.RecordTypeBuilder var7 = new com.google.javascript.rhino.jstype.RecordTypeBuilder(var4);
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8);
    boolean var11 = var9.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var12 = new com.google.javascript.rhino.jstype.FunctionBuilder(var9);
    com.google.javascript.rhino.jstype.JSType var14 = var9.getType("STRING ");
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
    java.lang.Iterable var37 = var34.getAllImplementedInterfaces();
    com.google.javascript.rhino.jstype.JSType[] var38 = new com.google.javascript.rhino.jstype.JSType[] { var34};
    com.google.javascript.rhino.Node var39 = var9.createParametersWithVarArgs(var38);
    com.google.javascript.rhino.Node var40 = var4.createOptionalParameters(var38);
    com.google.javascript.rhino.JSTypeExpression var42 = new com.google.javascript.rhino.JSTypeExpression(var40, "(ERROR)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var43 = var0.isOptionalParameter(var40);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
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
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test183() {}
//   public void test183() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test183"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Scope var2 = var1.getTopScope();
//     com.google.javascript.jscomp.Scope var3 = var1.getTopScope();
//     com.google.javascript.jscomp.ErrorManager var4 = var1.getErrorManager();
//     com.google.javascript.jscomp.ErrorManager var5 = var1.getErrorManager();
//     boolean var6 = var1.isIdeMode();
//     com.google.javascript.jscomp.Region var9 = var1.getSourceRegion("TypeError: ", 409600);
// 
//   }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test184"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = com.google.javascript.rhino.ScriptRuntime.escapeString("or", '4');
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test185() {}
//   public void test185() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test185"); }
// 
// 
//     java.util.logging.Logger var0 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
//     double var2 = var1.getTypedPercent();
//     var1.generateReport();
//     com.google.javascript.jscomp.Compiler var4 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var1);
//     boolean var5 = var4.isTypeCheckingEnabled();
// 
//   }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test186"); }


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
    boolean var27 = var0.isConstant("JSDocInfo");
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.Node.newString("");
    boolean var30 = var29.hasChildren();
    int var32 = var29.getIntProp((-1));
    boolean var33 = var0.isVarArgsParameter(var29);
    java.util.logging.Logger var34 = null;
    com.google.javascript.jscomp.LoggerErrorManager var35 = new com.google.javascript.jscomp.LoggerErrorManager(var34);
    double var36 = var35.getTypedPercent();
    var35.generateReport();
    com.google.javascript.jscomp.Compiler var38 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var35);
    com.google.javascript.rhino.Node var39 = var38.getRoot();
    com.google.javascript.jscomp.NodeTraversal.Callback var40 = null;
    com.google.javascript.jscomp.NodeTraversal var41 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var38, var40);
    com.google.javascript.jscomp.DefaultCodingConvention var42 = new com.google.javascript.jscomp.DefaultCodingConvention();
    boolean var44 = var42.isConstant("STRING ");
    com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.Node.newString("");
    var47.putIntProp(100, 1);
    com.google.javascript.rhino.Node var51 = var47.removeFirstChild();
    com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var61 = new com.google.javascript.rhino.Node(1, var47, var53, var58, 1, 1);
    com.google.javascript.rhino.Node var62 = var53.getNext();
    java.lang.String var63 = var42.identifyTypeDefAssign(var53);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast var64 = var0.getObjectLiteralCast(var41, var53);
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
    assertTrue("'" + var25 + "' != '" + "goog.exportProperty"+ "'", var25.equals("goog.exportProperty"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);

  }

  public void test187() {}
//   public void test187() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test187"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var8 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     com.google.javascript.jscomp.LightweightMessageFormatter var9 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     com.google.javascript.jscomp.DefaultCodingConvention var10 = new com.google.javascript.jscomp.DefaultCodingConvention();
//     com.google.javascript.rhino.jstype.FunctionType var11 = null;
//     com.google.javascript.rhino.jstype.FunctionType var12 = null;
//     com.google.javascript.jscomp.CodingConvention.SubclassType var13 = null;
//     var10.applySubclassRelationship(var11, var12, var13);
//     java.lang.String var15 = var10.getDelegateSuperclassName();
//     java.io.PrintStream var16 = null;
//     com.google.javascript.jscomp.Compiler var17 = new com.google.javascript.jscomp.Compiler(var16);
//     com.google.javascript.jscomp.Region var20 = var17.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var23 = var17.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Compiler.IntermediateState var24 = var17.getState();
//     com.google.javascript.jscomp.NodeTraversal.Callback var25 = null;
//     com.google.javascript.jscomp.NodeTraversal var26 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var17, var25);
//     com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.Node.newString("");
//     boolean var29 = var28.hasChildren();
//     com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.JSDocInfo var35 = null;
//     var34.setJSDocInfo(var35);
//     com.google.javascript.rhino.Node var38 = var34.getChildAtIndex(0);
//     var28.addChildrenToFront(var34);
//     com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast var40 = var10.getObjectLiteralCast(var26, var34);
//     com.google.javascript.jscomp.Scope var41 = var26.getScope();
//     com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.JSTypeExpression var48 = new com.google.javascript.rhino.JSTypeExpression(var46, "");
//     com.google.javascript.jscomp.CheckLevel var49 = null;
//     com.google.javascript.jscomp.CheckLevel var51 = null;
//     com.google.javascript.jscomp.DiagnosticType var53 = com.google.javascript.jscomp.DiagnosticType.make("", var51, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var55 = null;
//     com.google.javascript.jscomp.DiagnosticType var57 = com.google.javascript.jscomp.DiagnosticType.make("", var55, "(ERROR)");
//     int var58 = var53.compareTo(var57);
//     com.google.javascript.jscomp.CheckLevel var60 = null;
//     com.google.javascript.jscomp.DiagnosticType var62 = com.google.javascript.jscomp.DiagnosticType.make("", var60, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var64 = null;
//     com.google.javascript.jscomp.DiagnosticType var66 = com.google.javascript.jscomp.DiagnosticType.make("", var64, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var68 = null;
//     com.google.javascript.jscomp.DiagnosticType var70 = com.google.javascript.jscomp.DiagnosticType.make("", var68, "(ERROR)");
//     int var71 = var66.compareTo(var70);
//     java.lang.String[] var73 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var74 = com.google.javascript.jscomp.JSError.make(var70, var73);
//     com.google.javascript.jscomp.JSError var75 = com.google.javascript.jscomp.JSError.make(var62, var73);
//     com.google.javascript.jscomp.JSError var76 = var26.makeError(var46, var49, var57, var73);
//     int var77 = var76.getCharno();
//     java.lang.String var78 = var9.formatWarning(var76);
// 
//   }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test188"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.PropertyRenamingPolicy var1 = com.google.javascript.jscomp.PropertyRenamingPolicy.valueOf("hi!: hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test189"); }


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
    boolean var17 = var13.canBeCalled();
    com.google.javascript.rhino.ErrorReporter var18 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18);
    boolean var21 = var19.hasNamespace("hi!");
    var19.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var23 = null;
    com.google.javascript.rhino.jstype.JSType var24 = null;
    com.google.javascript.rhino.jstype.JSType[] var25 = new com.google.javascript.rhino.jstype.JSType[] { var24};
    com.google.javascript.rhino.jstype.FunctionType var26 = var19.createConstructorType(var23, var25);
    com.google.javascript.rhino.jstype.ObjectType var27 = var19.createAnonymousObjectType();
    boolean var28 = var27.isVoidType();
    com.google.javascript.rhino.ErrorReporter var29 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29);
    boolean var32 = var30.hasNamespace("hi!");
    var30.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var34 = null;
    com.google.javascript.rhino.jstype.JSType var35 = null;
    com.google.javascript.rhino.jstype.JSType[] var36 = new com.google.javascript.rhino.jstype.JSType[] { var35};
    com.google.javascript.rhino.jstype.FunctionType var37 = var30.createConstructorType(var34, var36);
    boolean var38 = var37.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var39 = var27.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var37);
    boolean var40 = var27.isEmptyType();
    var13.setPrototypeBasedOn(var27);
    com.google.javascript.rhino.ErrorReporter var42 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var42);
    boolean var45 = var43.hasNamespace("hi!");
    var43.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var47 = null;
    com.google.javascript.rhino.jstype.JSType var48 = null;
    com.google.javascript.rhino.jstype.JSType[] var49 = new com.google.javascript.rhino.jstype.JSType[] { var48};
    com.google.javascript.rhino.jstype.FunctionType var50 = var43.createConstructorType(var47, var49);
    boolean var51 = var50.canBeCalled();
    com.google.javascript.rhino.ErrorReporter var52 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var52);
    boolean var55 = var53.hasNamespace("hi!");
    var53.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var57 = null;
    com.google.javascript.rhino.jstype.JSType var58 = null;
    com.google.javascript.rhino.jstype.JSType[] var59 = new com.google.javascript.rhino.jstype.JSType[] { var58};
    com.google.javascript.rhino.jstype.FunctionType var60 = var53.createConstructorType(var57, var59);
    com.google.javascript.rhino.jstype.ObjectType var61 = var53.createAnonymousObjectType();
    boolean var62 = var61.isVoidType();
    com.google.javascript.rhino.ErrorReporter var63 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var63);
    boolean var66 = var64.hasNamespace("hi!");
    var64.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var68 = null;
    com.google.javascript.rhino.jstype.JSType var69 = null;
    com.google.javascript.rhino.jstype.JSType[] var70 = new com.google.javascript.rhino.jstype.JSType[] { var69};
    com.google.javascript.rhino.jstype.FunctionType var71 = var64.createConstructorType(var68, var70);
    boolean var72 = var71.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var73 = var61.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var71);
    boolean var74 = var61.isEmptyType();
    boolean var75 = var50.isEquivalentTo((com.google.javascript.rhino.jstype.JSType)var61);
    com.google.javascript.rhino.jstype.FunctionPrototypeType var76 = null;
    boolean var77 = var50.setPrototype(var76);
    com.google.javascript.rhino.JSDocInfo var79 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Set var80 = var79.getSuppressions();
    boolean var81 = var79.isConstructor();
    boolean var82 = var79.isExterns();
    var50.setPropertyJSDocInfo("-1", var79, false);
    var27.setJSDocInfo(var79);
    boolean var86 = var27.isNullType();
    
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
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test190"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    java.lang.Iterable var2 = var0.getDirectedGraphNodes();
    java.util.List var3 = var0.getGraphvizNodes();
    com.google.javascript.jscomp.JSModuleGraph var4 = new com.google.javascript.jscomp.JSModuleGraph(var3);
    var4.coalesceDuplicateFiles();
    var4.coalesceDuplicateFiles();
    com.google.javascript.jscomp.SourceFile.Generator var8 = null;
    com.google.javascript.jscomp.JSSourceFile var9 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var8);
    java.lang.String var10 = var9.getName();
    com.google.javascript.jscomp.CompilerInput var12 = new com.google.javascript.jscomp.CompilerInput(var9, true);
    com.google.javascript.jscomp.JSModule var14 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var16 = new com.google.javascript.jscomp.JSModule("");
    var14.addDependency(var16);
    java.util.List var18 = var14.getDependencies();
    java.util.List var19 = var14.getRequires();
    com.google.javascript.jscomp.SourceAst var20 = null;
    com.google.javascript.jscomp.CompilerInput var23 = new com.google.javascript.jscomp.CompilerInput(var20, "", true);
    com.google.javascript.jscomp.SourceAst var24 = var23.getSourceAst();
    var14.remove(var23);
    var12.setModule(var14);
    com.google.javascript.jscomp.JSModule var28 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var30 = new com.google.javascript.jscomp.JSModule("");
    var28.addDependency(var30);
    java.util.List var32 = var28.getDependencies();
    com.google.javascript.jscomp.JSModule var34 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var36 = new com.google.javascript.jscomp.JSModule("");
    var34.addDependency(var36);
    var28.addDependency(var34);
    java.lang.String var39 = var28.getName();
    boolean var40 = var4.dependsOn(var14, var28);
    com.google.javascript.jscomp.SourceFile.Generator var42 = null;
    com.google.javascript.jscomp.JSSourceFile var43 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var42);
    java.lang.String var44 = var43.getName();
    com.google.javascript.jscomp.CompilerInput var46 = new com.google.javascript.jscomp.CompilerInput(var43, true);
    var43.clearCachedSource();
    com.google.javascript.jscomp.CompilerInput var49 = new com.google.javascript.jscomp.CompilerInput(var43, true);
    java.io.PrintStream var50 = null;
    com.google.javascript.jscomp.Compiler var51 = new com.google.javascript.jscomp.Compiler(var50);
    com.google.javascript.jscomp.Region var54 = var51.getSourceRegion("", 0);
    com.google.javascript.jscomp.Region var57 = var51.getSourceRegion("", 0);
    com.google.javascript.jscomp.Compiler.IntermediateState var58 = var51.getState();
    com.google.javascript.jscomp.SourceMap var59 = var51.getSourceMap();
    com.google.javascript.jscomp.SourceFile.Generator var61 = null;
    com.google.javascript.jscomp.JSSourceFile var62 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var61);
    java.lang.String var63 = var62.getName();
    var62.setOriginalPath("");
    com.google.javascript.jscomp.SourceFile.Generator var67 = null;
    com.google.javascript.jscomp.JSSourceFile var68 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var67);
    java.lang.String var69 = var68.getName();
    com.google.javascript.jscomp.CompilerOptions var70 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.CodingConvention var71 = var70.getCodingConvention();
    var70.enableExternExports(true);
    boolean var74 = var70.isExternExportsEnabled();
    com.google.javascript.jscomp.Result var75 = var51.compile(var62, var68, var70);
    var49.setSourceFile((com.google.javascript.jscomp.SourceFile)var62);
    com.google.javascript.jscomp.SourceAst var77 = null;
    com.google.javascript.jscomp.CompilerInput var80 = new com.google.javascript.jscomp.CompilerInput(var77, "", true);
    com.google.javascript.jscomp.CompilerInput var83 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var80, "", false);
    com.google.javascript.jscomp.JSModule var84 = null;
    var80.setModule(var84);
    boolean var86 = var80.isExtern();
    com.google.javascript.jscomp.JSModule var87 = var80.getModule();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var14.addAfter(var49, var80);
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + ""+ "'", var39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "hi!"+ "'", var63.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "hi!"+ "'", var69.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var87);

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test191"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.VariableRenamingPolicy var1 = com.google.javascript.jscomp.VariableRenamingPolicy.valueOf("goog.exportProperty");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test192() {}
//   public void test192() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test192"); }
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
//     com.google.javascript.rhino.jstype.JSType var34 = var8.restrictByNotNullOrUndefined();
//     com.google.javascript.rhino.jstype.JSType var36 = var8.getPropertyType("");
//     com.google.javascript.rhino.ErrorReporter var37 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var37);
//     boolean var40 = var38.hasNamespace("hi!");
//     var38.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var42 = null;
//     com.google.javascript.rhino.jstype.JSType var43 = null;
//     com.google.javascript.rhino.jstype.JSType[] var44 = new com.google.javascript.rhino.jstype.JSType[] { var43};
//     com.google.javascript.rhino.jstype.FunctionType var45 = var38.createConstructorType(var42, var44);
//     boolean var46 = var45.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType var47 = var45.getReturnType();
//     com.google.javascript.rhino.Node var48 = var45.getSource();
//     com.google.javascript.rhino.JSDocInfo var50 = var45.getOwnPropertyJSDocInfo("-1");
//     boolean var52 = var45.isPropertyInExterns("null(null)");
//     com.google.javascript.rhino.jstype.JSType var53 = var8.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType)var45);
//     com.google.common.base.Predicate var54 = null;
//     boolean var55 = var45.setValidator(var54);
// 
//   }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test193"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, false);
    var2.setLastGeneration(false);
    com.google.javascript.rhino.ErrorReporter var5 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var5);
    boolean var8 = var6.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var9 = new com.google.javascript.rhino.jstype.FunctionBuilder(var6);
    com.google.javascript.rhino.jstype.JSType var11 = var6.getType("STRING ");
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
    com.google.javascript.rhino.jstype.JSType var24 = var6.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType)var20, "");
    var6.setLastGeneration(false);
    boolean var28 = var6.hasNamespace("-1");
    com.google.javascript.rhino.jstype.StaticScope var29 = null;
    var6.resolveTypesInScope(var29);
    com.google.javascript.rhino.jstype.JSTypeRegistry var31 = null;
    com.google.javascript.rhino.jstype.FunctionParamBuilder var32 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var31);
    com.google.javascript.rhino.ErrorReporter var33 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33);
    boolean var36 = var34.hasNamespace("hi!");
    var34.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var38 = null;
    com.google.javascript.rhino.jstype.JSType var39 = null;
    com.google.javascript.rhino.jstype.JSType[] var40 = new com.google.javascript.rhino.jstype.JSType[] { var39};
    com.google.javascript.rhino.jstype.FunctionType var41 = var34.createConstructorType(var38, var40);
    com.google.javascript.rhino.jstype.ObjectType var42 = var34.createAnonymousObjectType();
    com.google.javascript.rhino.jstype.JSType[] var43 = new com.google.javascript.rhino.jstype.JSType[] { var42};
    boolean var44 = var32.addRequiredParams(var43);
    com.google.javascript.rhino.Node var45 = var6.createOptionalParameters(var43);
    com.google.javascript.rhino.jstype.JSType var46 = var2.createUnionType(var43);
    boolean var48 = var2.hasNamespace("(<No stack trace available>)");
    com.google.javascript.rhino.jstype.JSType var50 = var2.getType("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
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
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test194"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("");
    var3.putIntProp(100, 1);
    com.google.javascript.rhino.Node var7 = var3.removeFirstChild();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var17 = new com.google.javascript.rhino.Node(1, var3, var9, var14, 1, 1);
    boolean var18 = var9.hasSideEffects();
    com.google.javascript.rhino.Node var19 = var9.getLastSibling();
    com.google.javascript.rhino.Node[] var20 = new com.google.javascript.rhino.Node[] { var9};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var21 = new com.google.javascript.rhino.Node(2147483647, var20);
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
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test195"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    boolean var2 = var1.recordNoSideEffects();
    com.google.javascript.rhino.JSDocInfoBuilder var4 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var11 = new com.google.javascript.rhino.JSTypeExpression(var9, "");
    boolean var13 = var11.equals((java.lang.Object)'4');
    boolean var14 = var4.recordBaseType(var11);
    boolean var15 = var1.recordDefineType(var11);
    com.google.javascript.rhino.ErrorReporter var16 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var16);
    boolean var19 = var17.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.RecordTypeBuilder var20 = new com.google.javascript.rhino.jstype.RecordTypeBuilder(var17);
    com.google.javascript.rhino.ErrorReporter var21 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21);
    boolean var24 = var22.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var25 = new com.google.javascript.rhino.jstype.FunctionBuilder(var22);
    com.google.javascript.rhino.jstype.JSType var27 = var22.getType("STRING ");
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
    java.lang.Iterable var50 = var47.getAllImplementedInterfaces();
    com.google.javascript.rhino.jstype.JSType[] var51 = new com.google.javascript.rhino.jstype.JSType[] { var47};
    com.google.javascript.rhino.Node var52 = var22.createParametersWithVarArgs(var51);
    com.google.javascript.rhino.Node var53 = var17.createOptionalParameters(var51);
    com.google.javascript.rhino.JSTypeExpression var55 = new com.google.javascript.rhino.JSTypeExpression(var53, "(ERROR)");
    boolean var56 = var1.recordBaseType(var55);
    com.google.javascript.rhino.JSDocInfo.Visibility var57 = null;
    boolean var58 = var1.recordVisibility(var57);
    
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
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);

  }

  public void test196() {}
//   public void test196() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test196"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Compiler.IntermediateState var8 = var1.getState();
//     com.google.javascript.jscomp.NodeTraversal.Callback var9 = null;
//     com.google.javascript.jscomp.NodeTraversal var10 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var1, var9);
//     boolean var11 = var1.isIdeMode();
// 
//   }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test197"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var1 = com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.valueOf("(com.google.javascript.rhino.EvaluatorException: hi! (#10))");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test198"); }


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
    boolean var16 = var13.hasReferenceName();
    com.google.javascript.rhino.jstype.BooleanLiteralSet var17 = var13.getPossibleToBooleanOutcomes();
    int var18 = var17.ordinal();
    java.lang.String var19 = var17.name();
    
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
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "TRUE"+ "'", var19.equals("TRUE"));

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test199"); }


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
    com.google.javascript.rhino.jstype.StaticScope var12 = null;
    com.google.javascript.rhino.jstype.JSType var17 = var1.getType(var12, "<No stack trace available>", "ERROR  100", 0, 100);
    com.google.javascript.rhino.jstype.JSType var22 = var1.createNamedType("hi!", "ERROR", 100, 100);
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = null;
    com.google.javascript.rhino.jstype.FunctionParamBuilder var24 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var23);
    com.google.javascript.rhino.ErrorReporter var25 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25);
    boolean var28 = var26.hasNamespace("hi!");
    var26.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var30 = null;
    com.google.javascript.rhino.jstype.JSType var31 = null;
    com.google.javascript.rhino.jstype.JSType[] var32 = new com.google.javascript.rhino.jstype.JSType[] { var31};
    com.google.javascript.rhino.jstype.FunctionType var33 = var26.createConstructorType(var30, var32);
    com.google.javascript.rhino.jstype.ObjectType var34 = var26.createAnonymousObjectType();
    com.google.javascript.rhino.jstype.JSType[] var35 = new com.google.javascript.rhino.jstype.JSType[] { var34};
    boolean var36 = var24.addRequiredParams(var35);
    com.google.javascript.rhino.Node var37 = var1.createParametersWithVarArgs(var35);
    java.lang.String var38 = var37.toStringTree();
    int var40 = var37.getIntProp(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "LP\n    NAME  [var_args_name: 1] : (undefined|{})\n"+ "'", var38.equals("LP\n    NAME  [var_args_name: 1] : (undefined|{})\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test200"); }


    com.google.javascript.rhino.EcmaError var1 = com.google.javascript.rhino.ScriptRuntime.typeError("");
    java.lang.String var2 = var1.getLineSource();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test201() {}
//   public void test201() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test201"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.rhino.Node var8 = var1.getRoot();
//     var1.check();
// 
//   }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test202"); }


    java.lang.String var1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("Node tree inequality:\nTree1:\nSTRING \n\n\nTree2:\nERROR  100\n\n\nSubtree1: STRING \n\n\nSubtree2: ERROR  100\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "(Node tree inequality:\nTree1:\nSTRING \n\n\nTree2:\nERROR  100\n\n\nSubtree1: STRING \n\n\nSubtree2: ERROR  100\n)"+ "'", var1.equals("(Node tree inequality:\nTree1:\nSTRING \n\n\nTree2:\nERROR  100\n\n\nSubtree1: STRING \n\n\nSubtree2: ERROR  100\n)"));

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test203"); }


    com.google.javascript.jscomp.DefaultCodingConvention var0 = new com.google.javascript.jscomp.DefaultCodingConvention();
    boolean var2 = var0.isConstantKey("<No stack trace available>");
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.Node.newString("");
    var5.putIntProp(100, 1);
    com.google.javascript.rhino.Node var9 = var5.removeFirstChild();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var19 = new com.google.javascript.rhino.Node(1, var5, var11, var16, 1, 1);
    java.lang.String var20 = var0.getSingletonGetterClassName(var16);
    java.lang.String var21 = var0.getExportSymbolFunction();
    com.google.javascript.rhino.jstype.FunctionType var22 = null;
    com.google.javascript.rhino.jstype.FunctionType var23 = null;
    com.google.javascript.rhino.ErrorReporter var24 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24);
    boolean var27 = var25.hasNamespace("hi!");
    var25.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var29 = null;
    com.google.javascript.rhino.jstype.JSType var30 = null;
    com.google.javascript.rhino.jstype.JSType[] var31 = new com.google.javascript.rhino.jstype.JSType[] { var30};
    com.google.javascript.rhino.jstype.FunctionType var32 = var25.createConstructorType(var29, var31);
    com.google.javascript.rhino.ErrorReporter var33 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33);
    boolean var36 = var34.hasNamespace("hi!");
    var34.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var38 = null;
    com.google.javascript.rhino.jstype.JSType var39 = null;
    com.google.javascript.rhino.jstype.JSType[] var40 = new com.google.javascript.rhino.jstype.JSType[] { var39};
    com.google.javascript.rhino.jstype.FunctionType var41 = var34.createConstructorType(var38, var40);
    boolean var42 = var41.canBeCalled();
    var32.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var41);
    boolean var44 = var32.hasCachedValues();
    var32.clearResolved();
    var0.applySingletonGetter(var22, var23, (com.google.javascript.rhino.jstype.ObjectType)var32);
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.Node.newString("");
    java.lang.String var52 = var48.toString(false, true, false);
    com.google.javascript.rhino.Node var55 = com.google.javascript.rhino.Node.newString("");
    var55.putIntProp(100, 1);
    com.google.javascript.rhino.Node var59 = var55.removeFirstChild();
    com.google.javascript.rhino.Node var61 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var66 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var69 = new com.google.javascript.rhino.Node(1, var55, var61, var66, 1, 1);
    boolean var70 = var61.hasSideEffects();
    com.google.javascript.rhino.Node var71 = var48.copyInformationFromForTree(var61);
    com.google.javascript.rhino.Node var72 = var61.cloneNode();
    java.lang.String var73 = var0.getSingletonGetterClassName(var61);
    java.lang.String var74 = var0.getExportPropertyFunction();
    
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
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "STRING "+ "'", var52.equals("STRING "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test204"); }


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
    boolean var27 = var0.isConstant("JSDocInfo");
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.Node.newString("");
    var30.putIntProp(100, 1);
    com.google.javascript.rhino.Node var34 = var30.removeFirstChild();
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var44 = new com.google.javascript.rhino.Node(1, var30, var36, var41, 1, 1);
    boolean var45 = var36.hasSideEffects();
    com.google.javascript.rhino.Node var46 = var36.getLastSibling();
    boolean var47 = var0.isVarArgsParameter(var36);
    com.google.javascript.rhino.Node var50 = com.google.javascript.rhino.Node.newString("");
    var50.putIntProp(100, 1);
    com.google.javascript.rhino.Node var54 = var50.removeFirstChild();
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var61 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var64 = new com.google.javascript.rhino.Node(1, var50, var56, var61, 1, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var65 = var0.isPropertyTestFunction(var56);
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
    assertTrue("'" + var25 + "' != '" + "goog.exportProperty"+ "'", var25.equals("goog.exportProperty"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test205"); }


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
    com.google.javascript.rhino.jstype.JSType var58 = var43.getRestrictedTypeGivenToBooleanOutcome(true);
    com.google.javascript.rhino.ErrorReporter var59 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var59);
    boolean var62 = var60.hasNamespace("hi!");
    var60.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var64 = null;
    com.google.javascript.rhino.jstype.JSType var65 = null;
    com.google.javascript.rhino.jstype.JSType[] var66 = new com.google.javascript.rhino.jstype.JSType[] { var65};
    com.google.javascript.rhino.jstype.FunctionType var67 = var60.createConstructorType(var64, var66);
    boolean var68 = var67.canBeCalled();
    com.google.javascript.rhino.jstype.JSType var69 = var67.getReturnType();
    com.google.javascript.rhino.jstype.TernaryValue var70 = var43.testForEquality(var69);
    java.lang.String var71 = var70.name();
    
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
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "UNKNOWN"+ "'", var71.equals("UNKNOWN"));

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test206"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Set var1 = var0.getSuppressions();
    boolean var2 = var0.isConstructor();
    int var3 = var0.getParameterCount();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getParameterCount();
    boolean var6 = var0.hasEnumParameterType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "JSDocInfo"+ "'", var4.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test207"); }


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
    com.google.javascript.rhino.jstype.JSType var12 = var8.findPropertyType("OR\n");
    
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
    assertNull(var12);

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test208"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    var0.pushEdgeAnnotations();
    boolean var3 = var0.isDirected();
    java.util.logging.Logger var4 = null;
    com.google.javascript.jscomp.LoggerErrorManager var5 = new com.google.javascript.jscomp.LoggerErrorManager(var4);
    com.google.javascript.jscomp.Compiler var6 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var5);
    var5.setTypedPercent((-1.0d));
    com.google.javascript.rhino.ErrorReporter var9 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var9);
    boolean var12 = var10.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var13 = new com.google.javascript.rhino.jstype.FunctionBuilder(var10);
    com.google.javascript.rhino.ErrorReporter var14 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var14);
    boolean var17 = var15.hasNamespace("hi!");
    var15.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var19 = null;
    com.google.javascript.rhino.jstype.JSType var20 = null;
    com.google.javascript.rhino.jstype.JSType[] var21 = new com.google.javascript.rhino.jstype.JSType[] { var20};
    com.google.javascript.rhino.jstype.FunctionType var22 = var15.createConstructorType(var19, var21);
    boolean var23 = var22.canBeCalled();
    com.google.javascript.rhino.jstype.FunctionBuilder var25 = var13.withReturnType((com.google.javascript.rhino.jstype.JSType)var22, false);
    com.google.javascript.rhino.jstype.JSTypeRegistry var26 = null;
    com.google.javascript.rhino.jstype.FunctionParamBuilder var27 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var26);
    com.google.javascript.rhino.ErrorReporter var28 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var28);
    boolean var31 = var29.hasNamespace("hi!");
    var29.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var33 = null;
    com.google.javascript.rhino.jstype.JSType var34 = null;
    com.google.javascript.rhino.jstype.JSType[] var35 = new com.google.javascript.rhino.jstype.JSType[] { var34};
    com.google.javascript.rhino.jstype.FunctionType var36 = var29.createConstructorType(var33, var35);
    com.google.javascript.rhino.jstype.ObjectType var37 = var29.createAnonymousObjectType();
    com.google.javascript.rhino.jstype.JSType[] var38 = new com.google.javascript.rhino.jstype.JSType[] { var37};
    boolean var39 = var27.addRequiredParams(var38);
    com.google.javascript.rhino.jstype.FunctionBuilder var40 = var13.withParams(var27);
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.Node.newString("");
    var43.putIntProp(100, 1);
    com.google.javascript.rhino.Node var47 = var43.removeFirstChild();
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var54 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var57 = new com.google.javascript.rhino.Node(1, var43, var49, var54, 1, 1);
    int var58 = var54.getLineno();
    java.lang.RuntimeException var59 = com.google.javascript.rhino.ScriptRuntime.undefReadError((java.lang.Object)var13, (java.lang.Object)var58);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var60 = var0.getEdges((java.lang.Object)var5, (java.lang.Object)var59);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test209"); }


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
    com.google.javascript.rhino.jstype.StaticScope var12 = null;
    com.google.javascript.rhino.jstype.JSType var17 = var1.getType(var12, "<No stack trace available>", "ERROR  100", 0, 100);
    com.google.javascript.rhino.jstype.JSType var22 = var1.createNamedType("hi!", "ERROR", 100, 100);
    boolean var23 = var1.shouldTolerateUndefinedValues();
    com.google.javascript.rhino.ErrorReporter var24 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24);
    boolean var27 = var25.hasNamespace("hi!");
    var25.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var29 = null;
    com.google.javascript.rhino.jstype.JSType var30 = null;
    com.google.javascript.rhino.jstype.JSType[] var31 = new com.google.javascript.rhino.jstype.JSType[] { var30};
    com.google.javascript.rhino.jstype.FunctionType var32 = var25.createConstructorType(var29, var31);
    com.google.javascript.rhino.ErrorReporter var33 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33);
    boolean var36 = var34.hasNamespace("hi!");
    var34.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var38 = null;
    com.google.javascript.rhino.jstype.JSType var39 = null;
    com.google.javascript.rhino.jstype.JSType[] var40 = new com.google.javascript.rhino.jstype.JSType[] { var39};
    com.google.javascript.rhino.jstype.FunctionType var41 = var34.createConstructorType(var38, var40);
    boolean var42 = var41.canBeCalled();
    var32.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var41);
    boolean var44 = var32.hasCachedValues();
    com.google.javascript.rhino.ErrorReporter var45 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var45);
    boolean var48 = var46.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var49 = new com.google.javascript.rhino.jstype.FunctionBuilder(var46);
    com.google.javascript.rhino.ErrorReporter var51 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var51);
    boolean var54 = var52.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var55 = new com.google.javascript.rhino.jstype.FunctionBuilder(var52);
    com.google.javascript.rhino.ErrorReporter var56 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var56);
    boolean var59 = var57.hasNamespace("hi!");
    var57.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var61 = null;
    com.google.javascript.rhino.jstype.JSType var62 = null;
    com.google.javascript.rhino.jstype.JSType[] var63 = new com.google.javascript.rhino.jstype.JSType[] { var62};
    com.google.javascript.rhino.jstype.FunctionType var64 = var57.createConstructorType(var61, var63);
    boolean var65 = var64.canBeCalled();
    com.google.javascript.rhino.jstype.FunctionBuilder var67 = var55.withReturnType((com.google.javascript.rhino.jstype.JSType)var64, false);
    com.google.javascript.rhino.jstype.FunctionType var68 = var55.build();
    com.google.javascript.rhino.ErrorReporter var69 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var69);
    boolean var72 = var70.hasNamespace("hi!");
    var70.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var74 = null;
    com.google.javascript.rhino.jstype.JSType var75 = null;
    com.google.javascript.rhino.jstype.JSType[] var76 = new com.google.javascript.rhino.jstype.JSType[] { var75};
    com.google.javascript.rhino.jstype.FunctionType var77 = var70.createConstructorType(var74, var76);
    boolean var78 = var77.canBeCalled();
    com.google.javascript.rhino.jstype.FunctionPrototypeType var79 = null;
    boolean var80 = var77.setPrototype(var79);
    boolean var81 = var68.hasEqualCallType(var77);
    boolean var82 = var68.isEnumType();
    var46.registerPropertyOnType("unknown", (com.google.javascript.rhino.jstype.JSType)var68);
    com.google.javascript.rhino.JSDocInfo var84 = new com.google.javascript.rhino.JSDocInfo();
    java.lang.String var85 = var84.getOriginalCommentString();
    boolean var86 = var84.hasType();
    boolean var87 = var84.hasReturnType();
    java.util.List var88 = var84.getExtendedInterfaces();
    com.google.javascript.rhino.Node var89 = var46.createParameters(var88);
    com.google.javascript.rhino.jstype.FunctionType var90 = var1.createFunctionTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType)var32, var88);
    boolean var92 = var1.hasNamespace("0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
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
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test210"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var8 = new com.google.javascript.rhino.JSTypeExpression(var6, "");
    boolean var10 = var8.equals((java.lang.Object)'4');
    boolean var11 = var1.recordBaseType(var8);
    boolean var13 = var1.hasParameter("ERROR  100 [synthetic: 1]\n");
    boolean var15 = var1.hasParameter("-1");
    com.google.javascript.rhino.JSDocInfoBuilder var17 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    boolean var18 = var17.recordNoSideEffects();
    com.google.javascript.rhino.JSDocInfoBuilder var20 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var27 = new com.google.javascript.rhino.JSTypeExpression(var25, "");
    boolean var29 = var27.equals((java.lang.Object)'4');
    boolean var30 = var20.recordBaseType(var27);
    boolean var31 = var17.recordDefineType(var27);
    boolean var32 = var1.recordImplementedInterface(var27);
    boolean var33 = var1.recordNoAlias();
    boolean var35 = var1.recordVersion("ERROR  100");
    com.google.javascript.rhino.JSTypeExpression var37 = null;
    boolean var38 = var1.recordParameter("", var37);
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSDocInfo var44 = null;
    var43.setJSDocInfo(var44);
    com.google.javascript.rhino.JSDocInfo var46 = var43.getJSDocInfo();
    java.util.Collection var47 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(var43);
    var1.markTypeNode(var43, 0, 1, 409600, true);
    int var53 = var43.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
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
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == (-1));

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test211"); }


    boolean var1 = com.google.javascript.rhino.Context.isValidLanguageVersion(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test212"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSDocInfo var5 = null;
    var4.setJSDocInfo(var5);
    boolean var7 = var4.isQualifiedName();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("");
    java.lang.String var13 = var9.toString(false, true, false);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.Node.newString("");
    var16.putIntProp(100, 1);
    com.google.javascript.rhino.Node var20 = var16.removeFirstChild();
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var30 = new com.google.javascript.rhino.Node(1, var16, var22, var27, 1, 1);
    boolean var31 = var22.hasSideEffects();
    com.google.javascript.rhino.Node var32 = var9.copyInformationFromForTree(var22);
    com.google.javascript.rhino.Node var34 = new com.google.javascript.rhino.Node(100);
    var9.addChildrenToFront(var34);
    com.google.javascript.rhino.Node var36 = var34.cloneTree();
    com.google.javascript.jscomp.DefaultCodingConvention var37 = new com.google.javascript.jscomp.DefaultCodingConvention();
    boolean var39 = var37.isConstantKey("<No stack trace available>");
    com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.Node.newString("");
    var42.putIntProp(100, 1);
    com.google.javascript.rhino.Node var46 = var42.removeFirstChild();
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var56 = new com.google.javascript.rhino.Node(1, var42, var48, var53, 1, 1);
    java.lang.String var57 = var37.getSingletonGetterClassName(var53);
    int var58 = var53.getType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.addChildAfter(var34, var53);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "STRING "+ "'", var13.equals("STRING "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == (-1));

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test213"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.JSDocInfo var28 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(var26);
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

  public void test214() {}
//   public void test214() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test214"); }
// 
// 
//     java.io.InputStream var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromInputStream("{1215373146}", var1);
// 
//   }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test215"); }


    com.google.javascript.rhino.Context var0 = null;
    com.google.javascript.rhino.Context var1 = com.google.javascript.rhino.Context.enter(var0);
    var1.addActivationName("");
    boolean var5 = var1.isActivationNeeded("null.prototype");
    com.google.javascript.rhino.EcmaError var8 = com.google.javascript.rhino.ScriptRuntime.constructError("hi!", "hi!");
    java.lang.String var9 = var8.getName();
    var1.seal((java.lang.Object)var9);
    java.lang.String var11 = var1.getImplementationVersion();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setLanguageVersion((-26));
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "@IMPLEMENTATION.VERSION@"+ "'", var11.equals("@IMPLEMENTATION.VERSION@"));

  }

  public void test216() {}
//   public void test216() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test216"); }
// 
// 
//     java.io.File var0 = null;
//     com.google.javascript.jscomp.SourceFile var1 = com.google.javascript.jscomp.SourceFile.fromFile(var0);
// 
//   }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test217"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.Node.newString("");
    var1.putIntProp(100, 1);
    com.google.javascript.rhino.Node var5 = var1.removeFirstChild();
    int var6 = var1.getChildCount();
    boolean var7 = var1.hasChildren();
    java.lang.Iterable var8 = var1.siblings();
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSDocInfo var14 = null;
    var13.setJSDocInfo(var14);
    com.google.javascript.rhino.Node var17 = var13.getChildAtIndex(0);
    int var18 = var13.getLineno();
    var1.addChildrenToBack(var13);
    com.google.javascript.rhino.ErrorReporter var20 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var20);
    boolean var23 = var21.hasNamespace("hi!");
    var21.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var25 = null;
    com.google.javascript.rhino.jstype.JSType var26 = null;
    com.google.javascript.rhino.jstype.JSType[] var27 = new com.google.javascript.rhino.jstype.JSType[] { var26};
    com.google.javascript.rhino.jstype.FunctionType var28 = var21.createConstructorType(var25, var27);
    com.google.javascript.rhino.jstype.ObjectType var29 = var21.createAnonymousObjectType();
    boolean var30 = var29.isVoidType();
    com.google.javascript.rhino.ErrorReporter var31 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var31);
    boolean var34 = var32.hasNamespace("hi!");
    var32.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var36 = null;
    com.google.javascript.rhino.jstype.JSType var37 = null;
    com.google.javascript.rhino.jstype.JSType[] var38 = new com.google.javascript.rhino.jstype.JSType[] { var37};
    com.google.javascript.rhino.jstype.FunctionType var39 = var32.createConstructorType(var36, var38);
    boolean var40 = var39.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var41 = var29.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var39);
    java.lang.Iterable var42 = var29.getCtorExtendedInterfaces();
    com.google.javascript.rhino.jstype.JSType var43 = var29.getParameterType();
    com.google.javascript.rhino.ErrorReporter var45 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var45);
    boolean var48 = var46.hasNamespace("hi!");
    var46.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var50 = null;
    com.google.javascript.rhino.jstype.JSType var51 = null;
    com.google.javascript.rhino.jstype.JSType[] var52 = new com.google.javascript.rhino.jstype.JSType[] { var51};
    com.google.javascript.rhino.jstype.FunctionType var53 = var46.createConstructorType(var50, var52);
    com.google.javascript.rhino.ErrorReporter var54 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var54);
    boolean var57 = var55.hasNamespace("hi!");
    var55.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var59 = null;
    com.google.javascript.rhino.jstype.JSType var60 = null;
    com.google.javascript.rhino.jstype.JSType[] var61 = new com.google.javascript.rhino.jstype.JSType[] { var60};
    com.google.javascript.rhino.jstype.FunctionType var62 = var55.createConstructorType(var59, var61);
    boolean var63 = var62.canBeCalled();
    var53.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var62);
    int var65 = var62.getMinArguments();
    com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.Node.newString("");
    var69.putIntProp(100, 1);
    com.google.javascript.rhino.Node var73 = var69.removeFirstChild();
    com.google.javascript.rhino.Node var75 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var80 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var83 = new com.google.javascript.rhino.Node(1, var69, var75, var80, 1, 1);
    com.google.javascript.rhino.Node var84 = var75.getNext();
    int var86 = var75.getIntProp(1);
    boolean var87 = var29.defineInferredProperty("or", (com.google.javascript.rhino.jstype.JSType)var62, true, var75);
    com.google.javascript.rhino.JSDocInfo var88 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Set var89 = var88.getSuppressions();
    boolean var90 = var88.isConstructor();
    boolean var91 = var88.isExterns();
    boolean var92 = var88.isExterns();
    var75.setJSDocInfo(var88);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var94 = var13.removeChildAfter(var75);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);

  }

  public void test218() {}
//   public void test218() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test218"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var8 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     com.google.javascript.jscomp.LightweightMessageFormatter var9 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     boolean var10 = var1.acceptEcmaScript5();
// 
//   }

  public void test219() {}
//   public void test219() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test219"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.Collection var1 = var0.getNodes();
//     java.lang.Object var2 = null;
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var3 = var0.getDirectedGraphNode(var2);
//     java.lang.Iterable var4 = var0.getDirectedGraphNodes();
//     java.util.List var5 = var0.getEdges();
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
//     com.google.javascript.rhino.jstype.JSTypeRegistry var23 = null;
//     com.google.javascript.rhino.jstype.FunctionParamBuilder var24 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var23);
//     com.google.javascript.rhino.ErrorReporter var25 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25);
//     boolean var28 = var26.hasNamespace("hi!");
//     var26.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var30 = null;
//     com.google.javascript.rhino.jstype.JSType var31 = null;
//     com.google.javascript.rhino.jstype.JSType[] var32 = new com.google.javascript.rhino.jstype.JSType[] { var31};
//     com.google.javascript.rhino.jstype.FunctionType var33 = var26.createConstructorType(var30, var32);
//     com.google.javascript.rhino.jstype.ObjectType var34 = var26.createAnonymousObjectType();
//     com.google.javascript.rhino.jstype.JSType[] var35 = new com.google.javascript.rhino.jstype.JSType[] { var34};
//     boolean var36 = var24.addRequiredParams(var35);
//     com.google.javascript.rhino.jstype.FunctionBuilder var37 = var10.withParams(var24);
//     com.google.javascript.rhino.ErrorReporter var38 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var38);
//     boolean var41 = var39.hasNamespace("hi!");
//     var39.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var43 = null;
//     com.google.javascript.rhino.jstype.JSType var44 = null;
//     com.google.javascript.rhino.jstype.JSType[] var45 = new com.google.javascript.rhino.jstype.JSType[] { var44};
//     com.google.javascript.rhino.jstype.FunctionType var46 = var39.createConstructorType(var43, var45);
//     boolean var47 = var46.canBeCalled();
//     com.google.javascript.rhino.jstype.FunctionPrototypeType var48 = null;
//     boolean var49 = var46.setPrototype(var48);
//     com.google.javascript.rhino.jstype.JSType[] var50 = new com.google.javascript.rhino.jstype.JSType[] { var48};
//     boolean var51 = var24.addRequiredParams(var50);
//     com.google.javascript.rhino.ErrorReporter var52 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var52);
//     boolean var55 = var53.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.RecordTypeBuilder var56 = new com.google.javascript.rhino.jstype.RecordTypeBuilder(var53);
//     com.google.javascript.rhino.ErrorReporter var57 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var57);
//     boolean var60 = var58.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.FunctionBuilder var61 = new com.google.javascript.rhino.jstype.FunctionBuilder(var58);
//     com.google.javascript.rhino.jstype.JSType var63 = var58.getType("STRING ");
//     com.google.javascript.rhino.ErrorReporter var64 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var64);
//     boolean var67 = var65.hasNamespace("hi!");
//     var65.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var69 = null;
//     com.google.javascript.rhino.jstype.JSType var70 = null;
//     com.google.javascript.rhino.jstype.JSType[] var71 = new com.google.javascript.rhino.jstype.JSType[] { var70};
//     com.google.javascript.rhino.jstype.FunctionType var72 = var65.createConstructorType(var69, var71);
//     com.google.javascript.rhino.jstype.ObjectType var73 = var65.createAnonymousObjectType();
//     boolean var74 = var73.isVoidType();
//     com.google.javascript.rhino.ErrorReporter var75 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var75);
//     boolean var78 = var76.hasNamespace("hi!");
//     var76.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var80 = null;
//     com.google.javascript.rhino.jstype.JSType var81 = null;
//     com.google.javascript.rhino.jstype.JSType[] var82 = new com.google.javascript.rhino.jstype.JSType[] { var81};
//     com.google.javascript.rhino.jstype.FunctionType var83 = var76.createConstructorType(var80, var82);
//     boolean var84 = var83.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType.TypePair var85 = var73.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var83);
//     java.lang.Iterable var86 = var83.getAllImplementedInterfaces();
//     com.google.javascript.rhino.jstype.JSType[] var87 = new com.google.javascript.rhino.jstype.JSType[] { var83};
//     com.google.javascript.rhino.Node var88 = var58.createParametersWithVarArgs(var87);
//     com.google.javascript.rhino.Node var89 = var53.createOptionalParameters(var87);
//     com.google.javascript.rhino.Node var90 = var24.newParameterFromNode(var89);
//     java.util.Iterator var91 = var0.getNeighborNodesIterator((java.lang.Object)var24);
// 
//   }

  public void test220() {}
//   public void test220() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test220"); }
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
//     com.google.javascript.rhino.ErrorReporter var23 = null;
//     com.google.javascript.rhino.jstype.StaticScope var24 = null;
//     com.google.javascript.rhino.jstype.JSType var25 = var19.resolve(var23, var24);
// 
//   }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test221"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    int var1 = var0.getExtendedInterfacesCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test222"); }


    com.google.javascript.rhino.EcmaError var1 = com.google.javascript.rhino.ScriptRuntime.typeError("");
    java.lang.String var2 = var1.details();
    java.lang.String var3 = var1.getSourceName();
    java.lang.Throwable[] var4 = var1.getSuppressed();
    com.google.javascript.rhino.EcmaError var7 = com.google.javascript.rhino.ScriptRuntime.constructError("hi!", "hi!");
    int var8 = var7.getLineNumber();
    java.io.FilenameFilter var9 = null;
    java.lang.String var10 = var7.getScriptStackTrace(var9);
    var1.addSuppressed((java.lang.Throwable)var7);
    int var12 = var1.getColumnNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "TypeError: "+ "'", var2.equals("TypeError: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "<No stack trace available>"+ "'", var10.equals("<No stack trace available>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test223() {}
//   public void test223() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test223"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = null;
//     com.google.javascript.rhino.Context var1 = com.google.javascript.rhino.Context.enter(var0);
//     var1.addActivationName("");
//     boolean var5 = var1.isActivationNeeded("null.prototype");
//     com.google.javascript.rhino.EcmaError var8 = com.google.javascript.rhino.ScriptRuntime.constructError("hi!", "hi!");
//     java.lang.String var9 = var8.getName();
//     var1.seal((java.lang.Object)var9);
//     com.google.javascript.rhino.ErrorReporter var11 = var1.getErrorReporter();
//     int var12 = var1.getInstructionObserverThreshold();
//     boolean var13 = var1.isSealed();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var8);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var11);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == true);
// 
//   }

  public void test224() {}
//   public void test224() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test224"); }
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
//     var30.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var39);
//     boolean var42 = var39.canBeCalled();
//     com.google.javascript.rhino.ErrorReporter var43 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var43);
//     boolean var46 = var44.hasNamespace("hi!");
//     var44.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var48 = null;
//     com.google.javascript.rhino.jstype.JSType var49 = null;
//     com.google.javascript.rhino.jstype.JSType[] var50 = new com.google.javascript.rhino.jstype.JSType[] { var49};
//     com.google.javascript.rhino.jstype.FunctionType var51 = var44.createConstructorType(var48, var50);
//     com.google.javascript.rhino.jstype.ObjectType var52 = var44.createAnonymousObjectType();
//     boolean var53 = var52.isVoidType();
//     com.google.javascript.rhino.ErrorReporter var54 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var54);
//     boolean var57 = var55.hasNamespace("hi!");
//     var55.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var59 = null;
//     com.google.javascript.rhino.jstype.JSType var60 = null;
//     com.google.javascript.rhino.jstype.JSType[] var61 = new com.google.javascript.rhino.jstype.JSType[] { var60};
//     com.google.javascript.rhino.jstype.FunctionType var62 = var55.createConstructorType(var59, var61);
//     boolean var63 = var62.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType.TypePair var64 = var52.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var62);
//     java.lang.Iterable var65 = var62.getAllImplementedInterfaces();
//     com.google.javascript.rhino.jstype.JSType var66 = var39.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType)var62);
//     java.util.Collection var67 = var1.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType)var62);
//     com.google.javascript.rhino.ErrorReporter var68 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var68);
//     boolean var71 = var69.hasNamespace("hi!");
//     var69.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var73 = null;
//     com.google.javascript.rhino.jstype.JSType var74 = null;
//     com.google.javascript.rhino.jstype.JSType[] var75 = new com.google.javascript.rhino.jstype.JSType[] { var74};
//     com.google.javascript.rhino.jstype.FunctionType var76 = var69.createConstructorType(var73, var75);
//     com.google.javascript.rhino.ErrorReporter var77 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var77);
//     boolean var80 = var78.hasNamespace("hi!");
//     var78.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var82 = null;
//     com.google.javascript.rhino.jstype.JSType var83 = null;
//     com.google.javascript.rhino.jstype.JSType[] var84 = new com.google.javascript.rhino.jstype.JSType[] { var83};
//     com.google.javascript.rhino.jstype.FunctionType var85 = var78.createConstructorType(var82, var84);
//     boolean var86 = var85.canBeCalled();
//     var76.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var85);
//     boolean var88 = var85.isInterface();
//     com.google.javascript.rhino.jstype.JSType[] var89 = new com.google.javascript.rhino.jstype.JSType[] { var85};
//     com.google.javascript.rhino.jstype.JSType var90 = var1.createUnionType(var89);
//     com.google.javascript.rhino.jstype.JSType[] var91 = null;
//     com.google.javascript.rhino.Node var92 = var1.createParametersWithVarArgs(var91);
// 
//   }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test225"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.Node.newString("");
    java.lang.String var6 = var2.toString(false, true, false);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("");
    var9.putIntProp(100, 1);
    com.google.javascript.rhino.Node var13 = var9.removeFirstChild();
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var23 = new com.google.javascript.rhino.Node(1, var9, var15, var20, 1, 1);
    boolean var24 = var15.hasSideEffects();
    com.google.javascript.rhino.Node var25 = var2.copyInformationFromForTree(var15);
    com.google.javascript.rhino.Node var27 = new com.google.javascript.rhino.Node(100);
    var2.addChildrenToFront(var27);
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    java.lang.String var34 = var33.toString();
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.Node.newString("");
    java.lang.String var40 = var36.toString(false, true, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var41 = new com.google.javascript.rhino.Node(409600, var27, var33, var36);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "STRING "+ "'", var6.equals("STRING "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "ERROR  100"+ "'", var34.equals("ERROR  100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "STRING "+ "'", var40.equals("STRING "));

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test226"); }


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
    boolean var18 = var13.isRegexpType();
    
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
    assertTrue(var18 == false);

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test227"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    var0.pushEdgeAnnotations();
    var0.popEdgeAnnotations();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.popEdgeAnnotations();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test228"); }


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
    boolean var27 = var0.isConstant("JSDocInfo");
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.Node.newString("");
    var30.putIntProp(100, 1);
    com.google.javascript.rhino.Node var34 = var30.removeFirstChild();
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var44 = new com.google.javascript.rhino.Node(1, var30, var36, var41, 1, 1);
    boolean var45 = var36.hasSideEffects();
    com.google.javascript.rhino.Node var46 = var36.getLastSibling();
    boolean var47 = var0.isVarArgsParameter(var36);
    boolean var49 = var0.isPrivate("JSDocInfo");
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.Node.newString("");
    java.lang.String var55 = var51.toString(false, true, false);
    com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.Node.newString("");
    var58.putIntProp(100, 1);
    com.google.javascript.rhino.Node var62 = var58.removeFirstChild();
    com.google.javascript.rhino.Node var64 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var72 = new com.google.javascript.rhino.Node(1, var58, var64, var69, 1, 1);
    boolean var73 = var64.hasSideEffects();
    com.google.javascript.rhino.Node var74 = var51.copyInformationFromForTree(var64);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var75 = var0.isPropertyTestFunction(var64);
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
    assertTrue("'" + var25 + "' != '" + "goog.exportProperty"+ "'", var25.equals("goog.exportProperty"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "STRING "+ "'", var55.equals("STRING "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test229"); }


    com.google.javascript.jscomp.CheckLevel var1 = null;
    com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.make("@IMPLEMENTATION.VERSION@", var1, "JSDocInfo");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test230"); }


    com.google.javascript.rhino.EcmaError var2 = com.google.javascript.rhino.ScriptRuntime.constructError("hi!", "hi!");
    int var3 = var2.getLineNumber();
    int var4 = var2.getLineNumber();
    java.lang.Throwable[] var5 = var2.getSuppressed();
    java.lang.String var6 = var2.details();
    var2.initSourceName("null.prototype");
    int var9 = var2.getLineNumber();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.initSourceName("com.google.javascript.rhino.EvaluatorException: hi! (#10)");
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!: hi!"+ "'", var6.equals("hi!: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test231() {}
//   public void test231() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test231"); }
// 
// 
//     com.google.javascript.rhino.Context var0 = null;
//     com.google.javascript.rhino.Context var1 = com.google.javascript.rhino.Context.enter(var0);
//     var1.addActivationName("");
//     boolean var5 = var1.isActivationNeeded("null.prototype");
//     com.google.javascript.rhino.EcmaError var8 = com.google.javascript.rhino.ScriptRuntime.constructError("hi!", "hi!");
//     java.lang.String var9 = var8.getName();
//     var1.seal((java.lang.Object)var9);
//     com.google.javascript.rhino.ErrorReporter var11 = var1.getErrorReporter();
//     java.beans.PropertyChangeListener var12 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var1.addPropertyChangeListener(var12);
//       fail("Expected exception of type java.lang.IllegalStateException");
//     } catch (java.lang.IllegalStateException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var8);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var11);
// 
//   }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test232"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    java.lang.Object var2 = null;
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var3 = var0.getDirectedGraphNode(var2);
    com.google.javascript.rhino.ErrorReporter var4 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var4);
    boolean var7 = var5.hasNamespace("hi!");
    var5.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var9 = null;
    com.google.javascript.rhino.jstype.JSType var10 = null;
    com.google.javascript.rhino.jstype.JSType[] var11 = new com.google.javascript.rhino.jstype.JSType[] { var10};
    com.google.javascript.rhino.jstype.FunctionType var12 = var5.createConstructorType(var9, var11);
    com.google.javascript.rhino.jstype.ObjectType var13 = var5.createAnonymousObjectType();
    boolean var14 = var13.isVoidType();
    com.google.javascript.rhino.ErrorReporter var15 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var15);
    boolean var18 = var16.hasNamespace("hi!");
    var16.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var20 = null;
    com.google.javascript.rhino.jstype.JSType var21 = null;
    com.google.javascript.rhino.jstype.JSType[] var22 = new com.google.javascript.rhino.jstype.JSType[] { var21};
    com.google.javascript.rhino.jstype.FunctionType var23 = var16.createConstructorType(var20, var22);
    boolean var24 = var23.canBeCalled();
    com.google.javascript.rhino.jstype.JSType.TypePair var25 = var13.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType)var23);
    java.lang.Iterable var26 = var13.getCtorExtendedInterfaces();
    com.google.javascript.rhino.jstype.JSType var27 = var13.getParameterType();
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
    int var49 = var46.getMinArguments();
    com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.Node.newString("");
    var53.putIntProp(100, 1);
    com.google.javascript.rhino.Node var57 = var53.removeFirstChild();
    com.google.javascript.rhino.Node var59 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var64 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var67 = new com.google.javascript.rhino.Node(1, var53, var59, var64, 1, 1);
    com.google.javascript.rhino.Node var68 = var59.getNext();
    int var70 = var59.getIntProp(1);
    boolean var71 = var13.defineInferredProperty("or", (com.google.javascript.rhino.jstype.JSType)var46, true, var59);
    com.google.javascript.rhino.JSDocInfo var72 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Set var73 = var72.getSuppressions();
    boolean var74 = var72.isConstructor();
    boolean var75 = var72.isExterns();
    boolean var76 = var72.isExterns();
    var59.setJSDocInfo(var72);
    boolean var78 = var59.isVarArgs();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var79 = var0.getNodeDegree((java.lang.Object)var78);
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
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
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
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
    assertTrue(var49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test233"); }


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
    com.google.javascript.rhino.jstype.JSType var36 = var8.getPropertyType("");
    boolean var37 = var36.isBooleanObjectType();
    
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
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test234"); }


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
    com.google.javascript.rhino.jstype.FunctionBuilder var32 = var31.forConstructor();
    com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.Node.newString("");
    var34.putIntProp(100, 1);
    com.google.javascript.rhino.Node var38 = var34.removeFirstChild();
    int var39 = var34.getChildCount();
    boolean var40 = var34.hasChildren();
    java.lang.Iterable var41 = var34.children();
    com.google.javascript.rhino.jstype.JSTypeRegistry var43 = null;
    com.google.javascript.rhino.jstype.FunctionParamBuilder var44 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var43);
    var34.putProp(0, (java.lang.Object)var44);
    com.google.javascript.rhino.JSDocInfoBuilder var47 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var54 = new com.google.javascript.rhino.JSTypeExpression(var52, "");
    boolean var56 = var54.equals((java.lang.Object)'4');
    boolean var57 = var47.recordBaseType(var54);
    boolean var59 = var47.hasParameter("ERROR  100 [synthetic: 1]\n");
    boolean var61 = var47.recordMeaning("JSDocInfo");
    com.google.javascript.rhino.Node var65 = com.google.javascript.rhino.Node.newString("");
    var65.putIntProp(100, 1);
    com.google.javascript.rhino.Node var69 = var65.removeFirstChild();
    com.google.javascript.rhino.Node var71 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var76 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var79 = new com.google.javascript.rhino.Node(1, var65, var71, var76, 1, 1);
    com.google.javascript.jscomp.CheckLevel var81 = null;
    com.google.javascript.jscomp.DiagnosticType var83 = com.google.javascript.jscomp.DiagnosticType.make("", var81, "(ERROR)");
    com.google.javascript.jscomp.CheckLevel var85 = null;
    com.google.javascript.jscomp.DiagnosticType var87 = com.google.javascript.jscomp.DiagnosticType.make("", var85, "(ERROR)");
    int var88 = var83.compareTo(var87);
    java.lang.String[] var89 = null;
    com.google.javascript.jscomp.JSError var90 = com.google.javascript.jscomp.JSError.make("ERROR  100 [synthetic: 1]\n", var79, var83, var89);
    var47.markTypeNode(var79, 0, 10, 1, true);
    int var96 = var79.getSideEffectFlags();
    com.google.javascript.rhino.Node var97 = var44.newParameterFromNode(var79);
    com.google.javascript.rhino.jstype.FunctionBuilder var98 = var32.withParams(var44);
    
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
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);

  }

  public void test235() {}
//   public void test235() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test235"); }
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
//     com.google.javascript.rhino.Node var31 = var16.getScopeRoot();
// 
//   }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test236"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.RecordTypeBuilder var4 = new com.google.javascript.rhino.jstype.RecordTypeBuilder(var1);
    com.google.javascript.rhino.ErrorReporter var5 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var5);
    boolean var8 = var6.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var9 = new com.google.javascript.rhino.jstype.FunctionBuilder(var6);
    com.google.javascript.rhino.jstype.JSType var11 = var6.getType("STRING ");
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
    java.lang.Iterable var34 = var31.getAllImplementedInterfaces();
    com.google.javascript.rhino.jstype.JSType[] var35 = new com.google.javascript.rhino.jstype.JSType[] { var31};
    com.google.javascript.rhino.Node var36 = var6.createParametersWithVarArgs(var35);
    com.google.javascript.rhino.Node var37 = var1.createOptionalParameters(var35);
    var37.setIsSyntheticBlock(false);
    boolean var40 = var37.hasOneChild();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var41 = var37.getString();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
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
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);

  }

  public void test237() {}
//   public void test237() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test237"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile.Generator var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var1);
//     java.lang.String var3 = var2.getName();
//     com.google.javascript.jscomp.CompilerInput var5 = new com.google.javascript.jscomp.CompilerInput(var2, true);
//     com.google.javascript.jscomp.AbstractCompiler var6 = null;
//     var5.setCompiler(var6);
// 
//   }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test238"); }


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
    com.google.javascript.rhino.ErrorReporter var22 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var22);
    boolean var25 = var23.hasNamespace("hi!");
    var23.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.rhino.jstype.JSType var28 = null;
    com.google.javascript.rhino.jstype.JSType[] var29 = new com.google.javascript.rhino.jstype.JSType[] { var28};
    com.google.javascript.rhino.jstype.FunctionType var30 = var23.createConstructorType(var27, var29);
    com.google.javascript.rhino.ErrorReporter var31 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var31);
    boolean var34 = var32.hasNamespace("hi!");
    var32.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var36 = null;
    com.google.javascript.rhino.jstype.JSType var37 = null;
    com.google.javascript.rhino.jstype.JSType[] var38 = new com.google.javascript.rhino.jstype.JSType[] { var37};
    com.google.javascript.rhino.jstype.FunctionType var39 = var32.createConstructorType(var36, var38);
    boolean var40 = var39.canBeCalled();
    var30.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var39);
    boolean var42 = var39.canBeCalled();
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
    java.lang.Iterable var65 = var62.getAllImplementedInterfaces();
    com.google.javascript.rhino.jstype.JSType var66 = var39.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType)var62);
    java.util.Collection var67 = var1.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType)var62);
    com.google.javascript.rhino.ErrorReporter var68 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var68);
    boolean var71 = var69.hasNamespace("hi!");
    var69.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var73 = null;
    com.google.javascript.rhino.jstype.JSType var74 = null;
    com.google.javascript.rhino.jstype.JSType[] var75 = new com.google.javascript.rhino.jstype.JSType[] { var74};
    com.google.javascript.rhino.jstype.FunctionType var76 = var69.createConstructorType(var73, var75);
    com.google.javascript.rhino.ErrorReporter var77 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var77);
    boolean var80 = var78.hasNamespace("hi!");
    var78.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var82 = null;
    com.google.javascript.rhino.jstype.JSType var83 = null;
    com.google.javascript.rhino.jstype.JSType[] var84 = new com.google.javascript.rhino.jstype.JSType[] { var83};
    com.google.javascript.rhino.jstype.FunctionType var85 = var78.createConstructorType(var82, var84);
    boolean var86 = var85.canBeCalled();
    var76.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var85);
    boolean var88 = var85.isInterface();
    com.google.javascript.rhino.jstype.JSType[] var89 = new com.google.javascript.rhino.jstype.JSType[] { var85};
    com.google.javascript.rhino.jstype.JSType var90 = var1.createUnionType(var89);
    java.lang.Iterable var92 = var1.getEachReferenceTypeWithProperty("null(null)");
    
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
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
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
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test239"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    boolean var1 = var0.isNoSideEffects();
    java.lang.String var2 = var0.getSourceName();
    java.util.Collection var3 = var0.getTypeNodes();
    boolean var4 = var0.isInterface();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test240"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    com.google.javascript.jscomp.DefaultCodingConvention var2 = new com.google.javascript.jscomp.DefaultCodingConvention();
    boolean var4 = var2.isConstant("STRING ");
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString("");
    var7.putIntProp(100, 1);
    com.google.javascript.rhino.Node var11 = var7.removeFirstChild();
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var21 = new com.google.javascript.rhino.Node(1, var7, var13, var18, 1, 1);
    com.google.javascript.rhino.Node var22 = var13.getNext();
    java.lang.String var23 = var2.identifyTypeDefAssign(var13);
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    var28.setIsSyntheticBlock(true);
    java.lang.String var31 = var28.getString();
    var28.detachChildren();
    var28.setString("");
    boolean var35 = var28.isNoSideEffectsCall();
    com.google.javascript.rhino.Node var36 = var13.copyInformationFromForTree(var28);
    java.lang.Object var37 = null;
    com.google.javascript.rhino.JSDocInfo var38 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Set var39 = var38.getSuppressions();
    boolean var40 = var38.isConstructor();
    boolean var41 = var38.isExterns();
    boolean var42 = var38.isExterns();
    boolean var43 = var38.isImplicitCast();
    boolean var44 = var38.containsDeclaration();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.connect((java.lang.Object)var28, var37, (java.lang.Object)var38);
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test241() {}
//   public void test241() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test241"); }
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
//     com.google.javascript.jscomp.Scope var67 = var16.getScope();
//     com.google.javascript.jscomp.CompilerInput var68 = var16.getInput();
// 
//   }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test242"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.lang.Iterable var1 = var0.getDirectedGraphNodes();
    var0.clearEdgeAnnotations();
    com.google.javascript.jscomp.graph.SubGraph var3 = var0.newSubGraph();
    com.google.javascript.rhino.JSDocInfoBuilder var5 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var6 = var0.getDirectedSuccNodes((java.lang.Object)var5);
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

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test243"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.lang.Iterable var1 = var0.getDirectedGraphNodes();
    java.util.Collection var2 = var0.getNodes();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var4 = var0.createDirectedGraphNode((java.lang.Object)"or");
    java.lang.Iterable var5 = var0.getDirectedGraphNodes();
    com.google.javascript.jscomp.DefaultCodingConvention var6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    com.google.javascript.rhino.jstype.FunctionType var7 = null;
    com.google.javascript.rhino.jstype.FunctionType var8 = null;
    com.google.javascript.jscomp.CodingConvention.SubclassType var9 = null;
    var6.applySubclassRelationship(var7, var8, var9);
    java.lang.String var11 = var6.getDelegateSuperclassName();
    boolean var13 = var6.isConstant("ERROR  100 [synthetic: 1]\n");
    java.lang.String var14 = var6.getExportSymbolFunction();
    boolean var16 = var6.isConstant("STRING ");
    boolean var18 = var6.isSuperClassReference("JSDocInfo");
    com.google.javascript.jscomp.graph.GraphNode var19 = var0.getNode((java.lang.Object)var18);
    com.google.javascript.jscomp.JSModule var21 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var23 = new com.google.javascript.jscomp.JSModule("");
    var21.addDependency(var23);
    java.util.List var25 = var21.getDependencies();
    java.lang.Object var26 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.disconnect((java.lang.Object)var21, var26);
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test244"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.EvaluatorException var5 = new com.google.javascript.rhino.EvaluatorException("TypeError", "STRING \n", (-26), "TRUE", 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test245"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var8 = new com.google.javascript.rhino.JSTypeExpression(var6, "");
    boolean var10 = var8.equals((java.lang.Object)'4');
    boolean var11 = var1.recordBaseType(var8);
    boolean var12 = var1.isDescriptionRecorded();
    com.google.javascript.rhino.JSDocInfoBuilder var14 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    boolean var15 = var14.recordJavaDispatch();
    com.google.javascript.rhino.JSDocInfoBuilder var17 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var24 = new com.google.javascript.rhino.JSTypeExpression(var22, "");
    boolean var26 = var24.equals((java.lang.Object)'4');
    boolean var27 = var17.recordBaseType(var24);
    boolean var28 = var14.recordExtendedInterface(var24);
    boolean var29 = var1.recordBaseType(var24);
    boolean var30 = var1.recordNoCompile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
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

  }

  public void test246() {}
//   public void test246() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test246"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     var1.clearTemplateTypeName();
//     com.google.javascript.rhino.ErrorReporter var5 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var5);
//     boolean var8 = var6.hasNamespace("hi!");
//     var6.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var10 = null;
//     com.google.javascript.rhino.jstype.JSType var11 = null;
//     com.google.javascript.rhino.jstype.JSType[] var12 = new com.google.javascript.rhino.jstype.JSType[] { var11};
//     com.google.javascript.rhino.jstype.FunctionType var13 = var6.createConstructorType(var10, var12);
//     boolean var14 = var13.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType var15 = var13.getReturnType();
//     com.google.javascript.rhino.jstype.JSType var16 = null;
//     boolean var17 = var13.isEquivalentTo(var16);
//     com.google.javascript.rhino.jstype.ObjectType var18 = null;
//     com.google.javascript.rhino.jstype.FunctionType var19 = var1.createFunctionTypeWithNewThisType(var13, var18);
//     com.google.javascript.rhino.ErrorReporter var20 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var20);
//     boolean var23 = var21.hasNamespace("hi!");
//     var21.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var25 = null;
//     com.google.javascript.rhino.jstype.JSType var26 = null;
//     com.google.javascript.rhino.jstype.JSType[] var27 = new com.google.javascript.rhino.jstype.JSType[] { var26};
//     com.google.javascript.rhino.jstype.FunctionType var28 = var21.createConstructorType(var25, var27);
//     boolean var29 = var28.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType var30 = var28.getReturnType();
//     com.google.javascript.rhino.Node var31 = var28.getSource();
//     com.google.javascript.rhino.ErrorReporter var32 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32);
//     boolean var35 = var33.hasNamespace("hi!");
//     var33.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var37 = null;
//     com.google.javascript.rhino.jstype.JSType var38 = null;
//     com.google.javascript.rhino.jstype.JSType[] var39 = new com.google.javascript.rhino.jstype.JSType[] { var38};
//     com.google.javascript.rhino.jstype.FunctionType var40 = var33.createConstructorType(var37, var39);
//     boolean var41 = var40.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType var42 = var40.getReturnType();
//     var40.clearCachedValues();
//     com.google.javascript.rhino.jstype.JSType.TypePair var44 = var28.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType)var40);
//     com.google.javascript.rhino.jstype.JSType[] var45 = new com.google.javascript.rhino.jstype.JSType[] { var40};
//     com.google.javascript.rhino.Node var46 = var1.createParametersWithVarArgs(var45);
//     com.google.javascript.rhino.jstype.JSTypeNative var47 = null;
//     com.google.javascript.rhino.jstype.JSType var48 = var1.getNativeType(var47);
// 
//   }

  public void test247() {}
//   public void test247() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test247"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     com.google.javascript.rhino.ErrorReporter var4 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var4);
//     boolean var7 = var5.hasNamespace("hi!");
//     var5.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var9 = null;
//     com.google.javascript.rhino.jstype.JSType var10 = null;
//     com.google.javascript.rhino.jstype.JSType[] var11 = new com.google.javascript.rhino.jstype.JSType[] { var10};
//     com.google.javascript.rhino.jstype.FunctionType var12 = var5.createConstructorType(var9, var11);
//     com.google.javascript.rhino.ErrorReporter var13 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13);
//     boolean var16 = var14.hasNamespace("hi!");
//     var14.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var18 = null;
//     com.google.javascript.rhino.jstype.JSType var19 = null;
//     com.google.javascript.rhino.jstype.JSType[] var20 = new com.google.javascript.rhino.jstype.JSType[] { var19};
//     com.google.javascript.rhino.jstype.FunctionType var21 = var14.createConstructorType(var18, var20);
//     boolean var22 = var21.canBeCalled();
//     var12.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var21);
//     boolean var24 = var12.hasCachedValues();
//     com.google.javascript.rhino.jstype.JSType var25 = null;
//     com.google.javascript.rhino.jstype.FunctionType var26 = var1.createFunctionTypeWithNewReturnType(var12, var25);
//     boolean var27 = var26.isStringValueType();
//     boolean var28 = var26.isFunctionType();
//     java.lang.String var29 = var26.toString();
// 
//   }

  public void test248() {}
//   public void test248() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test248"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     int var8 = var1.getErrorCount();
// 
//   }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test249"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Set var1 = var0.getSuppressions();
    boolean var2 = var0.isConstructor();
    int var3 = var0.getParameterCount();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getParameterCount();
    com.google.javascript.rhino.JSTypeExpression var6 = var0.getThisType();
    com.google.javascript.rhino.JSTypeExpression var7 = var0.getType();
    java.lang.String var8 = var0.getVersion();
    com.google.javascript.rhino.JSTypeExpression var9 = var0.getType();
    boolean var10 = var0.isOverride();
    java.util.Collection var11 = var0.getReferences();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "JSDocInfo"+ "'", var4.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test250"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.lang.Iterable var1 = var0.getDirectedGraphNodes();
    var0.clearEdgeAnnotations();
    com.google.javascript.jscomp.graph.SubGraph var3 = var0.newSubGraph();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.Node.newString("");
    var6.putIntProp(100, 1);
    com.google.javascript.rhino.Node var10 = var6.removeFirstChild();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var20 = new com.google.javascript.rhino.Node(1, var6, var12, var17, 1, 1);
    com.google.javascript.rhino.Node var21 = var12.getNext();
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.Node.newString("");
    var23.setWasEmptyNode(true);
    java.lang.String var26 = var12.checkTreeEquals(var23);
    java.lang.String var27 = var12.toStringTree();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var28 = var0.getInEdges((java.lang.Object)var12);
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
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "STRING \n"+ "'", var27.equals("STRING \n"));

  }

  public void test251() {}
//   public void test251() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test251"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     var0.setRemoveClosureAsserts(false);
//     java.util.List var3 = null;
//     var0.setManageClosureDependencies(var3);
// 
//   }

  public void test252() {}
//   public void test252() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test252"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.util.Collection var1 = var0.getNodes();
//     var0.pushEdgeAnnotations();
//     com.google.javascript.rhino.JSDocInfo var3 = new com.google.javascript.rhino.JSDocInfo();
//     java.lang.String var4 = var3.getOriginalCommentString();
//     boolean var5 = var3.hasType();
//     boolean var6 = var3.hasReturnType();
//     boolean var8 = var3.hasParameter("LinkedGraph");
//     java.util.Collection var9 = var3.getTypeNodes();
//     java.util.List var10 = var0.getNeighborNodes((java.lang.Object)var3);
// 
//   }

  public void test253() {}
//   public void test253() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test253"); }
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
//     com.google.javascript.jscomp.CompilerOptions var35 = new com.google.javascript.jscomp.CompilerOptions();
//     com.google.javascript.jscomp.CheckLevel var37 = null;
//     com.google.javascript.jscomp.DiagnosticType var39 = com.google.javascript.jscomp.DiagnosticType.make("", var37, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var41 = null;
//     com.google.javascript.jscomp.DiagnosticType var43 = com.google.javascript.jscomp.DiagnosticType.make("", var41, "(ERROR)");
//     int var44 = var39.compareTo(var43);
//     java.lang.String[] var46 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var47 = com.google.javascript.jscomp.JSError.make(var43, var46);
//     com.google.javascript.jscomp.CheckLevel var49 = null;
//     com.google.javascript.jscomp.DiagnosticType var51 = com.google.javascript.jscomp.DiagnosticType.make("", var49, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var53 = null;
//     com.google.javascript.jscomp.DiagnosticType var55 = com.google.javascript.jscomp.DiagnosticType.make("", var53, "(ERROR)");
//     int var56 = var51.compareTo(var55);
//     java.lang.String[] var58 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var59 = com.google.javascript.jscomp.JSError.make(var55, var58);
//     com.google.javascript.jscomp.JSError var60 = com.google.javascript.jscomp.JSError.make(var43, var58);
//     com.google.javascript.jscomp.DiagnosticType[] var61 = new com.google.javascript.jscomp.DiagnosticType[] { var43};
//     com.google.javascript.jscomp.DiagnosticGroup var62 = new com.google.javascript.jscomp.DiagnosticGroup(var61);
//     com.google.javascript.jscomp.CheckLevel var63 = null;
//     var35.setWarningLevel(var62, var63);
//     java.lang.String var65 = var62.toString();
//     com.google.javascript.jscomp.CheckLevel var67 = null;
//     com.google.javascript.jscomp.DiagnosticType var69 = com.google.javascript.jscomp.DiagnosticType.make("", var67, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var71 = null;
//     com.google.javascript.jscomp.DiagnosticType var73 = com.google.javascript.jscomp.DiagnosticType.make("", var71, "(ERROR)");
//     int var74 = var69.compareTo(var73);
//     java.lang.String[] var76 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var77 = com.google.javascript.jscomp.JSError.make(var73, var76);
//     boolean var78 = var62.matches(var77);
//     boolean var79 = var34.enables(var62);
// 
//   }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test254"); }


    com.google.javascript.jscomp.DefaultCodingConvention var0 = new com.google.javascript.jscomp.DefaultCodingConvention();
    com.google.javascript.rhino.jstype.FunctionType var1 = null;
    com.google.javascript.rhino.jstype.FunctionType var2 = null;
    com.google.javascript.jscomp.CodingConvention.SubclassType var3 = null;
    var0.applySubclassRelationship(var1, var2, var3);
    java.lang.String var5 = var0.getDelegateSuperclassName();
    boolean var7 = var0.isConstant("ERROR  100 [synthetic: 1]\n");
    boolean var9 = var0.isPrivate("TypeError: ");
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSDocInfo var15 = null;
    var14.setJSDocInfo(var15);
    com.google.javascript.rhino.Node var18 = var14.getChildAtIndex(0);
    com.google.javascript.rhino.Node var19 = var14.cloneNode();
    java.util.List var20 = var0.identifyTypeDeclarationCall(var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var21 = var19.getDouble();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test255"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Set var1 = var0.getSuppressions();
    boolean var2 = var0.isConstructor();
    int var3 = var0.getParameterCount();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getParameterCount();
    boolean var6 = var0.hasModifies();
    java.lang.String var7 = var0.getLendsName();
    java.lang.String var8 = var0.getBlockDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "JSDocInfo"+ "'", var4.equals("JSDocInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test256"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var3 = new com.google.javascript.jscomp.JSModule("");
    var1.addDependency(var3);
    var1.setDepth(100);
    com.google.javascript.jscomp.SourceFile.Generator var8 = null;
    com.google.javascript.jscomp.JSSourceFile var9 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var8);
    com.google.javascript.jscomp.CompilerInput var11 = new com.google.javascript.jscomp.CompilerInput(var9, false);
    var1.add(var11);
    java.nio.charset.Charset var14 = null;
    com.google.javascript.jscomp.JSSourceFile var15 = com.google.javascript.jscomp.JSSourceFile.fromFile("TypeError", var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.setSourceFile((com.google.javascript.jscomp.SourceFile)var15);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test257"); }


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
    boolean var27 = var0.isConstant("JSDocInfo");
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.Node.newString("");
    var30.putIntProp(100, 1);
    com.google.javascript.rhino.Node var34 = var30.removeFirstChild();
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var44 = new com.google.javascript.rhino.Node(1, var30, var36, var41, 1, 1);
    boolean var45 = var36.hasSideEffects();
    com.google.javascript.rhino.Node var46 = var36.getLastSibling();
    boolean var47 = var0.isVarArgsParameter(var36);
    boolean var49 = var0.isPrivate("JSDocInfo");
    java.lang.String var50 = var0.getExportSymbolFunction();
    
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
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "goog.exportSymbol"+ "'", var50.equals("goog.exportSymbol"));

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test258"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.RecordTypeBuilder var4 = new com.google.javascript.rhino.jstype.RecordTypeBuilder(var1);
    com.google.javascript.rhino.ErrorReporter var5 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var5);
    boolean var8 = var6.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var9 = new com.google.javascript.rhino.jstype.FunctionBuilder(var6);
    com.google.javascript.rhino.jstype.JSType var11 = var6.getType("STRING ");
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
    java.lang.Iterable var34 = var31.getAllImplementedInterfaces();
    com.google.javascript.rhino.jstype.JSType[] var35 = new com.google.javascript.rhino.jstype.JSType[] { var31};
    com.google.javascript.rhino.Node var36 = var6.createParametersWithVarArgs(var35);
    com.google.javascript.rhino.Node var37 = var1.createOptionalParameters(var35);
    com.google.javascript.rhino.JSTypeExpression var39 = new com.google.javascript.rhino.JSTypeExpression(var37, "(ERROR)");
    int var40 = var37.getLineno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
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
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));

  }

  public void test259() {}
//   public void test259() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test259"); }
// 
// 
//     com.google.javascript.jscomp.MessageFormatter var0 = null;
//     java.util.logging.Logger var1 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var2 = new com.google.javascript.jscomp.LoggerErrorManager(var0, var1);
//     com.google.javascript.jscomp.CheckLevel var3 = null;
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
//     com.google.javascript.jscomp.DiagnosticType var33 = var32.getType();
//     var2.println(var3, var32);
// 
//   }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test260"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    var0.pushEdgeAnnotations();
    var0.clearEdgeAnnotations();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test261"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.Node.newString("");
    var1.putIntProp(100, 1);
    com.google.javascript.rhino.Node var5 = var1.removeFirstChild();
    int var6 = var1.getCharno();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var10 = var1.toString(false, true, false);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test262() {}
//   public void test262() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test262"); }
// 
// 
//     java.io.Reader var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromReader("<No stack trace available>", var1);
// 
//   }

  public void test263() {}
//   public void test263() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test263"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, "", true);
//     com.google.javascript.jscomp.CompilerInput var6 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var3, "", false);
//     com.google.javascript.jscomp.JSModule var7 = null;
//     var3.setModule(var7);
//     boolean var9 = var3.isExtern();
//     com.google.javascript.jscomp.JSModule var10 = var3.getModule();
//     var3.clearAst();
// 
//   }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test264"); }


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
    com.google.javascript.rhino.jstype.JSType var11 = null;
    boolean var12 = var8.isEquivalentTo(var11);
    boolean var13 = var8.isNativeObjectType();
    java.lang.String var14 = var8.getTemplateTypeName();
    
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test265"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    var1.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var5 = null;
    com.google.javascript.rhino.jstype.JSType var6 = null;
    com.google.javascript.rhino.jstype.JSType[] var7 = new com.google.javascript.rhino.jstype.JSType[] { var6};
    com.google.javascript.rhino.jstype.FunctionType var8 = var1.createConstructorType(var5, var7);
    com.google.javascript.rhino.jstype.ObjectType var9 = var1.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var10 = null;
    com.google.javascript.rhino.jstype.StaticScope var11 = null;
    com.google.javascript.rhino.jstype.JSType var12 = var9.forceResolve(var10, var11);
    boolean var13 = var12.isBooleanValueType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test266"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.Node.newString("");
    var1.putIntProp(100, 1);
    com.google.javascript.rhino.Node var5 = var1.removeFirstChild();
    int var6 = var1.getChildCount();
    boolean var7 = var1.hasChildren();
    java.lang.Iterable var8 = var1.children();
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = null;
    com.google.javascript.rhino.jstype.FunctionParamBuilder var11 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var10);
    var1.putProp(0, (java.lang.Object)var11);
    com.google.javascript.rhino.JSDocInfoBuilder var14 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var21 = new com.google.javascript.rhino.JSTypeExpression(var19, "");
    boolean var23 = var21.equals((java.lang.Object)'4');
    boolean var24 = var14.recordBaseType(var21);
    boolean var26 = var14.hasParameter("ERROR  100 [synthetic: 1]\n");
    boolean var28 = var14.recordMeaning("JSDocInfo");
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.Node.newString("");
    var32.putIntProp(100, 1);
    com.google.javascript.rhino.Node var36 = var32.removeFirstChild();
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var46 = new com.google.javascript.rhino.Node(1, var32, var38, var43, 1, 1);
    com.google.javascript.jscomp.CheckLevel var48 = null;
    com.google.javascript.jscomp.DiagnosticType var50 = com.google.javascript.jscomp.DiagnosticType.make("", var48, "(ERROR)");
    com.google.javascript.jscomp.CheckLevel var52 = null;
    com.google.javascript.jscomp.DiagnosticType var54 = com.google.javascript.jscomp.DiagnosticType.make("", var52, "(ERROR)");
    int var55 = var50.compareTo(var54);
    java.lang.String[] var56 = null;
    com.google.javascript.jscomp.JSError var57 = com.google.javascript.jscomp.JSError.make("ERROR  100 [synthetic: 1]\n", var46, var50, var56);
    var14.markTypeNode(var46, 0, 10, 1, true);
    int var63 = var46.getSideEffectFlags();
    com.google.javascript.rhino.Node var64 = var11.newParameterFromNode(var46);
    com.google.javascript.rhino.Node var65 = var11.build();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test267"); }


    com.google.javascript.rhino.Context var0 = com.google.javascript.rhino.Context.enter();
    boolean var1 = var0.isGeneratingDebug();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test268"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.lang.Iterable var1 = var0.getDirectedGraphNodes();
    java.util.Collection var2 = var0.getNodes();
    java.util.Collection var3 = var0.getNodes();
    java.util.logging.Logger var4 = null;
    com.google.javascript.jscomp.LoggerErrorManager var5 = new com.google.javascript.jscomp.LoggerErrorManager(var4);
    com.google.javascript.jscomp.Compiler var6 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var5);
    var5.setTypedPercent((-1.0d));
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var9 = var0.getDirectedGraphNode((java.lang.Object)var5);
    java.lang.Object var10 = null;
    com.google.javascript.jscomp.JSModule var12 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.SourceFile.Generator var14 = null;
    com.google.javascript.jscomp.JSSourceFile var15 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var14);
    java.lang.String var16 = var15.getName();
    var15.setOriginalPath("");
    var12.add(var15);
    java.lang.String var20 = var12.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var21 = var0.isConnectedInDirection(var10, (java.lang.Object)var20);
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
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));

  }

  public void test269() {}
//   public void test269() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test269"); }
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
//     com.google.javascript.jscomp.Scope var67 = var16.getScope();
//     boolean var68 = var16.hasScope();
//     boolean var69 = var16.hasScope();
//     com.google.javascript.jscomp.CompilerInput var70 = var16.getInput();
// 
//   }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test270"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSDocInfo var5 = null;
    var4.setJSDocInfo(var5);
    com.google.javascript.rhino.Node var8 = var4.getChildAtIndex(0);
    int var9 = var4.getLineno();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var10 = var4.getDouble();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);

  }

  public void test271() {}
//   public void test271() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test271"); }
// 
// 
//     com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("");
//     com.google.javascript.jscomp.SourceAst var2 = null;
//     com.google.javascript.jscomp.CompilerInput var5 = new com.google.javascript.jscomp.CompilerInput(var2, "", true);
//     com.google.javascript.jscomp.SourceAst var6 = var5.getSourceAst();
//     com.google.javascript.jscomp.CompilerInput var9 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var5, "", false);
//     java.lang.String var10 = var5.getName();
//     var1.addFirst(var5);
//     java.io.PrintStream var12 = null;
//     com.google.javascript.jscomp.Compiler var13 = new com.google.javascript.jscomp.Compiler(var12);
//     com.google.javascript.jscomp.Region var16 = var13.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var19 = var13.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Compiler.IntermediateState var20 = var13.getState();
//     var5.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var13);
//     com.google.javascript.jscomp.SourceFile.Generator var23 = null;
//     com.google.javascript.jscomp.JSSourceFile var24 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var23);
//     java.lang.String var25 = var24.getName();
//     var24.setOriginalPath("");
//     com.google.javascript.jscomp.CompilerInput var29 = new com.google.javascript.jscomp.CompilerInput(var24, false);
//     com.google.javascript.rhino.Node var30 = var13.parse(var24);
// 
//   }

  public void test272() {}
//   public void test272() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test272"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     com.google.javascript.jscomp.CodingConvention var1 = var0.getCodingConvention();
//     var0.enableExternExports(true);
//     boolean var4 = var0.getInferTypes();
//     java.util.Set var5 = null;
//     var0.setIdGenerators(var5);
// 
//   }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test273"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    var1.clearTemplateTypeName();
    com.google.javascript.rhino.ErrorReporter var5 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var5);
    boolean var8 = var6.hasNamespace("hi!");
    var6.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var10 = null;
    com.google.javascript.rhino.jstype.JSType var11 = null;
    com.google.javascript.rhino.jstype.JSType[] var12 = new com.google.javascript.rhino.jstype.JSType[] { var11};
    com.google.javascript.rhino.jstype.FunctionType var13 = var6.createConstructorType(var10, var12);
    boolean var14 = var13.canBeCalled();
    com.google.javascript.rhino.jstype.JSType var15 = var13.getReturnType();
    com.google.javascript.rhino.jstype.JSType var16 = null;
    boolean var17 = var13.isEquivalentTo(var16);
    com.google.javascript.rhino.jstype.ObjectType var18 = null;
    com.google.javascript.rhino.jstype.FunctionType var19 = var1.createFunctionTypeWithNewThisType(var13, var18);
    com.google.javascript.rhino.JSDocInfo var20 = new com.google.javascript.rhino.JSDocInfo();
    java.lang.String var21 = var20.getOriginalCommentString();
    boolean var22 = var20.hasType();
    boolean var23 = var20.hasReturnType();
    java.util.List var24 = var20.getExtendedInterfaces();
    com.google.javascript.rhino.Node var25 = var1.createParametersWithVarArgs(var24);
    var1.identifyNonNullableName("(ERROR)");
    com.google.javascript.jscomp.JSModule var29 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var31 = new com.google.javascript.jscomp.JSModule("");
    var29.addDependency(var31);
    java.util.List var33 = var29.getDependencies();
    com.google.javascript.jscomp.deps.SortedDependencies var34 = new com.google.javascript.jscomp.deps.SortedDependencies(var33);
    java.util.List var35 = var34.getInputsWithoutProvides();
    com.google.javascript.jscomp.JSModule var37 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var39 = new com.google.javascript.jscomp.JSModule("");
    var37.addDependency(var39);
    java.util.List var41 = var37.getDependencies();
    com.google.javascript.jscomp.JSModule var43 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var45 = new com.google.javascript.jscomp.JSModule("");
    var43.addDependency(var45);
    var37.addDependency(var43);
    com.google.javascript.jscomp.JSModule var49 = new com.google.javascript.jscomp.JSModule("hi!");
    var37.addDependency(var49);
    com.google.javascript.jscomp.SourceFile.Generator var52 = null;
    com.google.javascript.jscomp.JSSourceFile var53 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var52);
    com.google.javascript.jscomp.CompilerInput var55 = new com.google.javascript.jscomp.CompilerInput(var53, false);
    var49.add(var53);
    java.util.List var57 = var49.getDependencies();
    java.util.List var58 = var34.getSortedDependenciesOf(var57);
    java.util.List var59 = var34.getSortedList();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var60 = var1.createParametersWithVarArgs(var59);
      fail("Expected exception of type java.lang.ArrayStoreException");
    } catch (java.lang.ArrayStoreException e) {
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test274"); }


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
    com.google.javascript.rhino.jstype.JSType var36 = var8.getPropertyType("");
    boolean var37 = var36.isStringObjectType();
    
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
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test275() {}
//   public void test275() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test275"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     boolean var3 = var1.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
//     java.lang.Iterable var6 = var1.getTypesWithProperty("");
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
//     com.google.javascript.rhino.Node var18 = var15.getSource();
//     boolean var19 = var15.isFunctionType();
//     com.google.javascript.rhino.jstype.ObjectType var20 = var1.createObjectType((com.google.javascript.rhino.jstype.ObjectType)var15);
//     com.google.javascript.jscomp.GoogleCodingConvention var21 = new com.google.javascript.jscomp.GoogleCodingConvention();
//     com.google.javascript.rhino.ErrorReporter var22 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var22);
//     boolean var25 = var23.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.FunctionBuilder var26 = new com.google.javascript.rhino.jstype.FunctionBuilder(var23);
//     com.google.javascript.rhino.ErrorReporter var27 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var27);
//     boolean var30 = var28.hasNamespace("hi!");
//     var28.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var32 = null;
//     com.google.javascript.rhino.jstype.JSType var33 = null;
//     com.google.javascript.rhino.jstype.JSType[] var34 = new com.google.javascript.rhino.jstype.JSType[] { var33};
//     com.google.javascript.rhino.jstype.FunctionType var35 = var28.createConstructorType(var32, var34);
//     boolean var36 = var35.canBeCalled();
//     com.google.javascript.rhino.jstype.FunctionBuilder var38 = var26.withReturnType((com.google.javascript.rhino.jstype.JSType)var35, false);
//     com.google.javascript.rhino.jstype.FunctionType var39 = var26.build();
//     com.google.javascript.rhino.jstype.FunctionBuilder var41 = var26.withTemplateName("or");
//     com.google.javascript.rhino.ErrorReporter var42 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var42);
//     boolean var45 = var43.hasNamespace("hi!");
//     var43.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var47 = null;
//     com.google.javascript.rhino.jstype.JSType var48 = null;
//     com.google.javascript.rhino.jstype.JSType[] var49 = new com.google.javascript.rhino.jstype.JSType[] { var48};
//     com.google.javascript.rhino.jstype.FunctionType var50 = var43.createConstructorType(var47, var49);
//     boolean var51 = var50.canBeCalled();
//     boolean var52 = var50.isConstructor();
//     com.google.javascript.rhino.jstype.FunctionBuilder var53 = var26.withReturnType((com.google.javascript.rhino.jstype.JSType)var50);
//     com.google.javascript.rhino.ErrorReporter var54 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var54);
//     boolean var57 = var55.hasNamespace("hi!");
//     var55.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var59 = null;
//     com.google.javascript.rhino.jstype.JSType var60 = null;
//     com.google.javascript.rhino.jstype.JSType[] var61 = new com.google.javascript.rhino.jstype.JSType[] { var60};
//     com.google.javascript.rhino.jstype.FunctionType var62 = var55.createConstructorType(var59, var61);
//     boolean var63 = var62.canBeCalled();
//     boolean var64 = var62.isConstructor();
//     com.google.javascript.rhino.ErrorReporter var65 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var65);
//     boolean var68 = var66.hasNamespace("hi!");
//     com.google.javascript.rhino.jstype.FunctionBuilder var69 = new com.google.javascript.rhino.jstype.FunctionBuilder(var66);
//     com.google.javascript.rhino.ErrorReporter var70 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var70);
//     boolean var73 = var71.hasNamespace("hi!");
//     var71.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var75 = null;
//     com.google.javascript.rhino.jstype.JSType var76 = null;
//     com.google.javascript.rhino.jstype.JSType[] var77 = new com.google.javascript.rhino.jstype.JSType[] { var76};
//     com.google.javascript.rhino.jstype.FunctionType var78 = var71.createConstructorType(var75, var77);
//     boolean var79 = var78.canBeCalled();
//     com.google.javascript.rhino.jstype.FunctionBuilder var81 = var69.withReturnType((com.google.javascript.rhino.jstype.JSType)var78, false);
//     com.google.javascript.rhino.jstype.FunctionType var82 = var69.build();
//     com.google.javascript.rhino.jstype.FunctionBuilder var84 = var69.withTemplateName("or");
//     com.google.javascript.rhino.jstype.FunctionType var85 = var69.build();
//     java.lang.Iterable var86 = var85.getCtorExtendedInterfaces();
//     var21.applySingletonGetter(var50, var62, (com.google.javascript.rhino.jstype.ObjectType)var85);
//     com.google.javascript.rhino.jstype.JSType var88 = var15.getLeastSupertype((com.google.javascript.rhino.jstype.JSType)var62);
//     com.google.javascript.rhino.jstype.Visitor var89 = null;
//     java.lang.Object var90 = var62.visit(var89);
// 
//   }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test276"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    java.lang.Iterable var2 = var0.getDirectedGraphNodes();
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("");
    java.lang.String var8 = var4.toString(false, true, false);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.Node.newString("");
    var11.putIntProp(100, 1);
    com.google.javascript.rhino.Node var15 = var11.removeFirstChild();
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var25 = new com.google.javascript.rhino.Node(1, var11, var17, var22, 1, 1);
    boolean var26 = var17.hasSideEffects();
    com.google.javascript.rhino.Node var27 = var4.copyInformationFromForTree(var17);
    com.google.javascript.rhino.Node var29 = new com.google.javascript.rhino.Node(100);
    var4.addChildrenToFront(var29);
    com.google.javascript.rhino.Node var31 = var29.cloneTree();
    int var32 = var31.getSideEffectFlags();
    com.google.javascript.rhino.JSDocInfoBuilder var34 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var41 = new com.google.javascript.rhino.JSTypeExpression(var39, "");
    boolean var43 = var41.equals((java.lang.Object)'4');
    boolean var44 = var34.recordBaseType(var41);
    boolean var45 = var34.recordJavaDispatch();
    boolean var47 = var34.addAuthor("LinkedGraph");
    boolean var49 = var34.recordFileOverview("eol");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var50 = var0.isConnectedInDirection((java.lang.Object)var31, (java.lang.Object)"eol");
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
    assertTrue("'" + var8 + "' != '" + "STRING "+ "'", var8.equals("STRING "));
    
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
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);

  }

  public void test277() {}
//   public void test277() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test277"); }
// 
// 
//     java.util.logging.Logger var0 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
//     double var2 = var1.getTypedPercent();
//     var1.generateReport();
//     com.google.javascript.jscomp.Compiler var4 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var1);
//     com.google.javascript.rhino.Node var5 = var4.getRoot();
//     var4.normalize();
// 
//   }

  public void test278() {}
//   public void test278() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test278"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     com.google.javascript.rhino.jstype.RecordTypeBuilder var2 = new com.google.javascript.rhino.jstype.RecordTypeBuilder(var1);
//     com.google.javascript.rhino.ErrorReporter var4 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var4);
//     boolean var7 = var5.hasNamespace("hi!");
//     com.google.javascript.rhino.ErrorReporter var8 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8);
//     boolean var11 = var9.hasNamespace("hi!");
//     var9.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var13 = null;
//     com.google.javascript.rhino.jstype.JSType var14 = null;
//     com.google.javascript.rhino.jstype.JSType[] var15 = new com.google.javascript.rhino.jstype.JSType[] { var14};
//     com.google.javascript.rhino.jstype.FunctionType var16 = var9.createConstructorType(var13, var15);
//     com.google.javascript.rhino.ErrorReporter var17 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var17);
//     boolean var20 = var18.hasNamespace("hi!");
//     var18.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var22 = null;
//     com.google.javascript.rhino.jstype.JSType var23 = null;
//     com.google.javascript.rhino.jstype.JSType[] var24 = new com.google.javascript.rhino.jstype.JSType[] { var23};
//     com.google.javascript.rhino.jstype.FunctionType var25 = var18.createConstructorType(var22, var24);
//     boolean var26 = var25.canBeCalled();
//     var16.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var25);
//     boolean var28 = var16.hasCachedValues();
//     com.google.javascript.rhino.jstype.JSType var29 = null;
//     com.google.javascript.rhino.jstype.FunctionType var30 = var5.createFunctionTypeWithNewReturnType(var16, var29);
//     com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.Node.newString("");
//     var33.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var37 = var33.removeFirstChild();
//     com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var47 = new com.google.javascript.rhino.Node(1, var33, var39, var44, 1, 1);
//     com.google.javascript.rhino.JSDocInfo var48 = var39.getJSDocInfo();
//     var39.setSourcePositionForTree(100);
//     com.google.javascript.rhino.jstype.RecordTypeBuilder var51 = var2.addProperty("ERROR  100 [synthetic: 1]\n", (com.google.javascript.rhino.jstype.JSType)var30, var39);
//     com.google.javascript.rhino.jstype.JSType var52 = var51.build();
//     com.google.javascript.rhino.jstype.JSType var53 = var51.build();
//     
//     // Checks the contract:  equals-hashcode on var52 and var53
//     assertTrue("Contract failed: equals-hashcode on var52 and var53", var52.equals(var53) ? var52.hashCode() == var53.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var53 and var52
//     assertTrue("Contract failed: equals-hashcode on var53 and var52", var53.equals(var52) ? var53.hashCode() == var52.hashCode() : true);
// 
//   }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test279"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.Node.newString("");
    boolean var2 = var1.hasChildren();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSDocInfo var8 = null;
    var7.setJSDocInfo(var8);
    com.google.javascript.rhino.Node var11 = var7.getChildAtIndex(0);
    var1.addChildrenToFront(var7);
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
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test280"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Set var1 = var0.getSuppressions();
    boolean var2 = var0.isConstructor();
    boolean var3 = var0.isExterns();
    boolean var4 = var0.isExterns();
    java.lang.String var5 = var0.getSourceName();
    boolean var6 = var0.hasBaseType();
    boolean var7 = var0.isImplicitCast();
    com.google.javascript.rhino.JSTypeExpression var8 = var0.getEnumParameterType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test281() {}
//   public void test281() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test281"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Scope var2 = var1.getTopScope();
//     com.google.javascript.jscomp.Scope var3 = var1.getTopScope();
//     com.google.javascript.jscomp.ErrorManager var4 = var1.getErrorManager();
//     com.google.javascript.jscomp.ErrorManager var5 = var1.getErrorManager();
//     var1.check();
// 
//   }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test282"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.Node.newString("");
    var2.putIntProp(100, 1);
    com.google.javascript.rhino.Node var6 = var2.removeFirstChild();
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var16 = new com.google.javascript.rhino.Node(1, var2, var8, var13, 1, 1);
    boolean var17 = var8.hasSideEffects();
    com.google.javascript.rhino.Node.AncestorIterable var18 = var8.getAncestors();
    boolean var19 = var8.hasChildren();
    java.lang.String var20 = var8.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "STRING "+ "'", var20.equals("STRING "));

  }

  public void test283() {}
//   public void test283() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test283"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile var1 = com.google.javascript.jscomp.SourceFile.fromFile("ERROR  100 [synthetic: 1]\n");
//     com.google.javascript.jscomp.JsAst var2 = new com.google.javascript.jscomp.JsAst(var1);
//     com.google.javascript.jscomp.SourceFile var4 = com.google.javascript.jscomp.SourceFile.fromFile("ERROR  100 [synthetic: 1]\n");
//     var2.setSourceFile(var4);
//     java.io.PrintStream var6 = null;
//     com.google.javascript.jscomp.Compiler var7 = new com.google.javascript.jscomp.Compiler(var6);
//     com.google.javascript.jscomp.Region var10 = var7.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var13 = var7.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var14 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var7);
//     com.google.javascript.jscomp.Compiler.IntermediateState var15 = var7.getState();
//     com.google.javascript.jscomp.SourceFile.Generator var17 = null;
//     com.google.javascript.jscomp.JSSourceFile var18 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var17);
//     com.google.javascript.jscomp.CompilerInput var20 = new com.google.javascript.jscomp.CompilerInput(var18, false);
//     com.google.javascript.jscomp.SourceFile.Generator var22 = null;
//     com.google.javascript.jscomp.JSSourceFile var23 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var22);
//     java.lang.String var24 = var23.getName();
//     com.google.javascript.jscomp.CompilerOptions var25 = new com.google.javascript.jscomp.CompilerOptions();
//     com.google.javascript.jscomp.VariableRenamingPolicy var26 = null;
//     com.google.javascript.jscomp.PropertyRenamingPolicy var27 = null;
//     var25.setRenamingPolicy(var26, var27);
//     com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler var29 = null;
//     var25.setAliasTransformationHandler(var29);
//     com.google.javascript.jscomp.Result var31 = var7.compile(var18, var23, var25);
//     com.google.javascript.rhino.Node var32 = var2.getAstRoot((com.google.javascript.jscomp.AbstractCompiler)var7);
//     com.google.javascript.jscomp.CompilerInput var34 = var7.getInput("LinkedGraph");
//     com.google.javascript.jscomp.PassConfig var35 = null;
//     var7.setPassConfig(var35);
// 
//   }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test284"); }


    java.util.logging.Logger var0 = null;
    com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
    com.google.javascript.jscomp.Compiler var2 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var1);
    var1.setTypedPercent(100.0d);
    com.google.javascript.jscomp.JSError[] var5 = var1.getErrors();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test285"); }


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
    int var32 = var16.getLineNumber();
    com.google.javascript.rhino.Node var33 = var16.getCurrentNode();
    com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.Node.newString("");
    var35.putIntProp(100, 1);
    com.google.javascript.rhino.Node var39 = var35.removeFirstChild();
    int var40 = var35.getChildCount();
    boolean var41 = var35.hasChildren();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var16.traverse(var35);
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
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test286"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Context.checkOptimizationLevel((-26));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test287"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    java.lang.Iterable var2 = var0.getDirectedGraphNodes();
    boolean var3 = var0.isDirected();
    java.util.List var4 = var0.getGraphvizNodes();
    com.google.javascript.rhino.EcmaError var6 = com.google.javascript.rhino.ScriptRuntime.typeError("");
    java.lang.String var7 = var6.details();
    java.lang.String var8 = var6.getSourceName();
    java.lang.Throwable[] var9 = var6.getSuppressed();
    java.lang.String var10 = var6.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var11 = var0.getDirectedPredNodes((java.lang.Object)var6);
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
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "TypeError: "+ "'", var7.equals("TypeError: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "TypeError"+ "'", var10.equals("TypeError"));

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test288"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.Node.newNumber(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test289"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var4 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
    var1.clearTemplateTypeName();
    com.google.javascript.rhino.ErrorReporter var6 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var6);
    boolean var9 = var7.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var10 = new com.google.javascript.rhino.jstype.FunctionBuilder(var7);
    com.google.javascript.rhino.ErrorReporter var11 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11);
    boolean var14 = var12.hasNamespace("hi!");
    var12.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var16 = null;
    com.google.javascript.rhino.jstype.JSType var17 = null;
    com.google.javascript.rhino.jstype.JSType[] var18 = new com.google.javascript.rhino.jstype.JSType[] { var17};
    com.google.javascript.rhino.jstype.FunctionType var19 = var12.createConstructorType(var16, var18);
    boolean var20 = var19.canBeCalled();
    com.google.javascript.rhino.jstype.FunctionBuilder var22 = var10.withReturnType((com.google.javascript.rhino.jstype.JSType)var19, false);
    com.google.javascript.rhino.jstype.FunctionType var23 = var10.build();
    com.google.javascript.rhino.jstype.FunctionBuilder var25 = var10.withTemplateName("or");
    com.google.javascript.rhino.jstype.FunctionType var26 = var10.build();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var27 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.lang.Iterable var28 = var27.getDirectedGraphNodes();
    com.google.javascript.rhino.ErrorReporter var29 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29);
    boolean var32 = var30.hasNamespace("hi!");
    var30.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var34 = null;
    com.google.javascript.rhino.jstype.JSType var35 = null;
    com.google.javascript.rhino.jstype.JSType[] var36 = new com.google.javascript.rhino.jstype.JSType[] { var35};
    com.google.javascript.rhino.jstype.FunctionType var37 = var30.createConstructorType(var34, var36);
    boolean var38 = var37.canBeCalled();
    com.google.javascript.rhino.jstype.JSType var39 = var37.getReturnType();
    var37.clearCachedValues();
    com.google.javascript.jscomp.graph.GraphNode var41 = var27.getNode((java.lang.Object)var37);
    com.google.javascript.rhino.jstype.FunctionBuilder var43 = var10.withReturnType((com.google.javascript.rhino.jstype.JSType)var37, true);
    com.google.javascript.rhino.ErrorReporter var44 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var44);
    boolean var47 = var45.hasNamespace("hi!");
    var45.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var49 = null;
    com.google.javascript.rhino.jstype.JSType var50 = null;
    com.google.javascript.rhino.jstype.JSType[] var51 = new com.google.javascript.rhino.jstype.JSType[] { var50};
    com.google.javascript.rhino.jstype.FunctionType var52 = var45.createConstructorType(var49, var51);
    com.google.javascript.rhino.ErrorReporter var53 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var53);
    boolean var56 = var54.hasNamespace("hi!");
    var54.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var58 = null;
    com.google.javascript.rhino.jstype.JSType var59 = null;
    com.google.javascript.rhino.jstype.JSType[] var60 = new com.google.javascript.rhino.jstype.JSType[] { var59};
    com.google.javascript.rhino.jstype.FunctionType var61 = var54.createConstructorType(var58, var60);
    boolean var62 = var61.canBeCalled();
    var52.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var61);
    boolean var64 = var61.isInterface();
    com.google.javascript.rhino.jstype.FunctionPrototypeType var65 = var61.getPrototype();
    java.lang.String var66 = var65.getReferenceName();
    boolean var67 = var65.isEmptyType();
    java.lang.String var68 = var65.getReferenceName();
    com.google.javascript.rhino.jstype.FunctionBuilder var69 = var43.withReturnType((com.google.javascript.rhino.jstype.JSType)var65);
    com.google.javascript.rhino.jstype.ObjectType var70 = var1.createObjectType((com.google.javascript.rhino.jstype.ObjectType)var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
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
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "null.prototype"+ "'", var66.equals("null.prototype"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "null.prototype"+ "'", var68.equals("null.prototype"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test290() {}
//   public void test290() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test290"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Scope var2 = var1.getTopScope();
//     com.google.javascript.jscomp.Scope var3 = var1.getTopScope();
//     com.google.javascript.jscomp.ErrorManager var4 = var1.getErrorManager();
//     com.google.javascript.jscomp.ErrorManager var5 = var1.getErrorManager();
//     var1.rebuildInputsFromModules();
// 
//   }

  public void test291() {}
//   public void test291() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test291"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.lang.Iterable var1 = var0.getDirectedGraphNodes();
//     java.util.Collection var2 = var0.getNodes();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var4 = var0.createDirectedGraphNode((java.lang.Object)"or");
//     com.google.javascript.rhino.ErrorReporter var5 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var5);
//     boolean var8 = var6.hasNamespace("hi!");
//     var6.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var10 = null;
//     com.google.javascript.rhino.jstype.JSType var11 = null;
//     com.google.javascript.rhino.jstype.JSType[] var12 = new com.google.javascript.rhino.jstype.JSType[] { var11};
//     com.google.javascript.rhino.jstype.FunctionType var13 = var6.createConstructorType(var10, var12);
//     boolean var14 = var13.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType var15 = var13.getReturnType();
//     com.google.javascript.rhino.Node var16 = var13.getSource();
//     boolean var17 = var13.isInstanceType();
//     com.google.javascript.rhino.jstype.FunctionPrototypeType var18 = var13.getPrototype();
//     var13.clearCachedValues();
//     com.google.javascript.jscomp.GoogleCodingConvention var20 = new com.google.javascript.jscomp.GoogleCodingConvention();
//     com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.Node.newString("");
//     var23.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var27 = var23.removeFirstChild();
//     com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var37 = new com.google.javascript.rhino.Node(1, var23, var29, var34, 1, 1);
//     com.google.javascript.rhino.JSDocInfo var38 = var29.getJSDocInfo();
//     var29.setSourcePositionForTree(100);
//     java.lang.Object var42 = null;
//     var29.putProp((-1), var42);
//     boolean var44 = var20.isVarArgsParameter(var29);
//     java.lang.String var45 = var20.getExportPropertyFunction();
//     boolean var47 = var20.isConstant("JSDocInfo");
//     boolean var49 = var20.isPrivate("0");
//     java.io.PrintStream var50 = null;
//     com.google.javascript.jscomp.Compiler var51 = new com.google.javascript.jscomp.Compiler(var50);
//     com.google.javascript.jscomp.Region var54 = var51.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var57 = var51.getSourceRegion("", 0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var58 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var51);
//     com.google.javascript.jscomp.Compiler.IntermediateState var59 = var51.getState();
//     com.google.javascript.jscomp.SourceFile.Generator var61 = null;
//     com.google.javascript.jscomp.JSSourceFile var62 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var61);
//     com.google.javascript.jscomp.CompilerInput var64 = new com.google.javascript.jscomp.CompilerInput(var62, false);
//     com.google.javascript.jscomp.SourceFile.Generator var66 = null;
//     com.google.javascript.jscomp.JSSourceFile var67 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var66);
//     java.lang.String var68 = var67.getName();
//     com.google.javascript.jscomp.CompilerOptions var69 = new com.google.javascript.jscomp.CompilerOptions();
//     com.google.javascript.jscomp.VariableRenamingPolicy var70 = null;
//     com.google.javascript.jscomp.PropertyRenamingPolicy var71 = null;
//     var69.setRenamingPolicy(var70, var71);
//     com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler var73 = null;
//     var69.setAliasTransformationHandler(var73);
//     com.google.javascript.jscomp.Result var75 = var51.compile(var62, var67, var69);
//     boolean var76 = var69.isExternExportsEnabled();
//     var69.setLooseTypes(false);
//     var0.connect((java.lang.Object)var13, (java.lang.Object)var20, (java.lang.Object)false);
// 
//   }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test292"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    boolean var3 = var1.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.RecordTypeBuilder var4 = new com.google.javascript.rhino.jstype.RecordTypeBuilder(var1);
    com.google.javascript.rhino.ErrorReporter var5 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var5);
    boolean var8 = var6.hasNamespace("hi!");
    com.google.javascript.rhino.jstype.FunctionBuilder var9 = new com.google.javascript.rhino.jstype.FunctionBuilder(var6);
    com.google.javascript.rhino.jstype.JSType var11 = var6.getType("STRING ");
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
    java.lang.Iterable var34 = var31.getAllImplementedInterfaces();
    com.google.javascript.rhino.jstype.JSType[] var35 = new com.google.javascript.rhino.jstype.JSType[] { var31};
    com.google.javascript.rhino.Node var36 = var6.createParametersWithVarArgs(var35);
    com.google.javascript.rhino.Node var37 = var1.createOptionalParameters(var35);
    com.google.javascript.rhino.JSTypeExpression var39 = new com.google.javascript.rhino.JSTypeExpression(var37, "(ERROR)");
    boolean var40 = var37.hasSideEffects();
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.Node.newString("");
    var43.putIntProp(100, 1);
    com.google.javascript.rhino.Node var47 = var43.removeFirstChild();
    int var48 = var43.getChildCount();
    com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var54 = new com.google.javascript.rhino.Node(10, var43, var53);
    com.google.javascript.rhino.Node var55 = var43.getLastChild();
    var43.setOptionalArg(false);
    var43.putIntProp(10, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var37.addChildrenToFront(var43);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
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
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test293"); }


    com.google.javascript.rhino.Node var1 = new com.google.javascript.rhino.Node(100);
    com.google.javascript.rhino.Node var2 = var1.cloneNode();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var3 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(var1);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test294() {}
//   public void test294() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test294"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticGroup var0 = null;
//     com.google.javascript.jscomp.CheckLevel var1 = null;
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var2 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var0, var1);
//     java.lang.String var3 = var2.toString();
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
//     java.lang.String var29 = var28.toString();
//     com.google.javascript.jscomp.DiagnosticType var30 = var28.getType();
//     com.google.javascript.jscomp.CheckLevel var31 = var2.level(var28);
// 
//   }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test295"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.warning(". (ERROR) at (unknown source) line (unknown line) : (unknown column)", "LinkedGraph: ERROR - (ERROR)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test296"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.SourceFile.Generator var3 = null;
    com.google.javascript.jscomp.JSSourceFile var4 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var3);
    java.lang.String var5 = var4.getName();
    var4.setOriginalPath("");
    var1.add(var4);
    com.google.javascript.jscomp.SourceAst var9 = null;
    com.google.javascript.jscomp.CompilerInput var12 = new com.google.javascript.jscomp.CompilerInput(var9, "", true);
    com.google.javascript.jscomp.CompilerInput var15 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var12, "", false);
    com.google.javascript.jscomp.JSModule var16 = null;
    var12.setModule(var16);
    boolean var18 = var12.isExtern();
    com.google.javascript.jscomp.JSModule var20 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var22 = new com.google.javascript.jscomp.JSModule("");
    var20.addDependency(var22);
    java.util.List var24 = var20.getDependencies();
    java.util.List var25 = var20.getRequires();
    var12.setModule(var20);
    com.google.javascript.jscomp.SourceAst var27 = var12.getSourceAst();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.add(var12);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test297"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    java.lang.Object var2 = null;
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var3 = var0.getDirectedGraphNode(var2);
    var0.pushEdgeAnnotations();
    java.util.Collection var5 = var0.getNodes();
    var0.pushEdgeAnnotations();
    com.google.javascript.jscomp.DefaultCodingConvention var7 = new com.google.javascript.jscomp.DefaultCodingConvention();
    boolean var9 = var7.isConstantKey("<No stack trace available>");
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.Node.newString("");
    var12.putIntProp(100, 1);
    com.google.javascript.rhino.Node var16 = var12.removeFirstChild();
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var26 = new com.google.javascript.rhino.Node(1, var12, var18, var23, 1, 1);
    java.lang.String var27 = var7.getSingletonGetterClassName(var23);
    java.lang.String var28 = var7.getExportSymbolFunction();
    boolean var30 = var7.isValidEnumKey("null(null)");
    boolean var32 = var7.isValidEnumKey("DiagnosticGroup<STRING >(null)");
    com.google.javascript.jscomp.SourceFile var34 = com.google.javascript.jscomp.SourceFile.fromFile("ERROR  100 [synthetic: 1]\n");
    com.google.javascript.jscomp.JsAst var35 = new com.google.javascript.jscomp.JsAst(var34);
    com.google.javascript.jscomp.SourceFile var37 = com.google.javascript.jscomp.SourceFile.fromFile("ERROR  100 [synthetic: 1]\n");
    var35.setSourceFile(var37);
    com.google.javascript.jscomp.CompilerInput var39 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var35);
    java.util.logging.Logger var40 = null;
    com.google.javascript.jscomp.LoggerErrorManager var41 = new com.google.javascript.jscomp.LoggerErrorManager(var40);
    double var42 = var41.getTypedPercent();
    var41.generateReport();
    com.google.javascript.jscomp.Compiler var44 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var41);
    com.google.javascript.rhino.Node var45 = var44.getRoot();
    com.google.javascript.rhino.Node var46 = var35.getAstRoot((com.google.javascript.jscomp.AbstractCompiler)var44);
    com.google.javascript.rhino.ErrorReporter var47 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var47);
    boolean var50 = var48.hasNamespace("hi!");
    var48.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var52 = null;
    com.google.javascript.rhino.jstype.JSType var53 = null;
    com.google.javascript.rhino.jstype.JSType[] var54 = new com.google.javascript.rhino.jstype.JSType[] { var53};
    com.google.javascript.rhino.jstype.FunctionType var55 = var48.createConstructorType(var52, var54);
    boolean var56 = var55.canBeCalled();
    com.google.javascript.rhino.jstype.JSType var57 = var55.getReturnType();
    com.google.javascript.rhino.jstype.JSType var58 = null;
    boolean var59 = var55.isEquivalentTo(var58);
    boolean var60 = var55.isNativeObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var61 = var0.isConnected((java.lang.Object)var7, (java.lang.Object)var35, (java.lang.Object)var60);
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test298"); }


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
      java.lang.Enum var29 = java.lang.Enum.<java.lang.Enum>valueOf(var27, ". (ERROR) at ERROR  100 [synthetic: 1]\n line 1 : 1");
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

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test299"); }


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
    com.google.javascript.rhino.jstype.JSType var13 = var1.getType("or");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test300() {}
//   public void test300() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test300"); }
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
//     boolean var12 = var8.isInstanceType();
//     boolean var13 = var8.isUnknownType();
//     com.google.javascript.rhino.ErrorReporter var14 = null;
//     com.google.javascript.rhino.jstype.StaticScope var15 = null;
//     com.google.javascript.rhino.jstype.JSType var16 = var8.forceResolve(var14, var15);
// 
//   }

  public void test301() {}
//   public void test301() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test301"); }
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
//     boolean var27 = var0.isPrivate("(STRING )");
//     com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.Node.newString("(ERROR)", 0, 1);
//     java.lang.String var32 = var0.identifyTypeDefAssign(var31);
//     java.lang.String var33 = var0.getExportPropertyFunction();
//     com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.Node.newString("");
//     var36.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var40 = var36.removeFirstChild();
//     com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var50 = new com.google.javascript.rhino.Node(1, var36, var42, var47, 1, 1);
//     boolean var51 = var42.hasSideEffects();
//     com.google.javascript.rhino.Node var52 = var42.getLastSibling();
//     java.lang.String var53 = var0.getSingletonGetterClassName(var42);
// 
//   }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test302"); }


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
    java.lang.Iterable var29 = var17.siblings();
    var17.removeProp(0);
    
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
    assertNotNull(var29);

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test303"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.lang.Iterable var1 = var0.getDirectedGraphNodes();
    java.util.Collection var2 = var0.getNodes();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var4 = var0.createDirectedGraphNode((java.lang.Object)"or");
    java.lang.Iterable var5 = var0.getDirectedGraphNodes();
    com.google.javascript.jscomp.DefaultCodingConvention var6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    com.google.javascript.rhino.jstype.FunctionType var7 = null;
    com.google.javascript.rhino.jstype.FunctionType var8 = null;
    com.google.javascript.jscomp.CodingConvention.SubclassType var9 = null;
    var6.applySubclassRelationship(var7, var8, var9);
    java.lang.String var11 = var6.getDelegateSuperclassName();
    boolean var13 = var6.isConstant("ERROR  100 [synthetic: 1]\n");
    java.lang.String var14 = var6.getExportSymbolFunction();
    boolean var16 = var6.isConstant("STRING ");
    boolean var18 = var6.isSuperClassReference("JSDocInfo");
    com.google.javascript.jscomp.graph.GraphNode var19 = var0.getNode((java.lang.Object)var18);
    java.util.List var20 = var0.getGraphvizEdges();
    var0.clearEdgeAnnotations();
    
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test304"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.EcmaError var2 = com.google.javascript.rhino.ScriptRuntime.typeError1(". (ERROR) at ERROR  100 [synthetic: 1]\n line 1 : 1", "(ERROR)");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test305"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var1 = var0.getNodes();
    var0.pushEdgeAnnotations();
    boolean var3 = var0.isDirected();
    boolean var4 = var0.isDirected();
    java.util.List var5 = var0.getEdges();
    com.google.javascript.rhino.ErrorReporter var6 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var6);
    boolean var9 = var7.hasNamespace("hi!");
    var7.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var11 = null;
    com.google.javascript.rhino.jstype.JSType var12 = null;
    com.google.javascript.rhino.jstype.JSType[] var13 = new com.google.javascript.rhino.jstype.JSType[] { var12};
    com.google.javascript.rhino.jstype.FunctionType var14 = var7.createConstructorType(var11, var13);
    boolean var15 = var14.canBeCalled();
    com.google.javascript.rhino.jstype.JSType var16 = var14.getReturnType();
    com.google.javascript.rhino.Node var17 = var14.getSource();
    boolean var18 = var14.isInstanceType();
    com.google.javascript.rhino.jstype.FunctionPrototypeType var19 = var14.getPrototype();
    boolean var20 = var19.isFunctionPrototypeType();
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.Node.newString("");
    boolean var23 = var22.hasChildren();
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSDocInfo var29 = null;
    var28.setJSDocInfo(var29);
    com.google.javascript.rhino.Node var32 = var28.getChildAtIndex(0);
    var22.addChildrenToFront(var28);
    com.google.javascript.rhino.Node var34 = var28.getLastChild();
    var28.setLineno(409600);
    com.google.javascript.rhino.ErrorReporter var37 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var37);
    boolean var40 = var38.hasNamespace("hi!");
    var38.clearTemplateTypeName();
    com.google.javascript.rhino.ErrorReporter var42 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var42);
    boolean var45 = var43.hasNamespace("hi!");
    var43.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var47 = null;
    com.google.javascript.rhino.jstype.JSType var48 = null;
    com.google.javascript.rhino.jstype.JSType[] var49 = new com.google.javascript.rhino.jstype.JSType[] { var48};
    com.google.javascript.rhino.jstype.FunctionType var50 = var43.createConstructorType(var47, var49);
    boolean var51 = var50.canBeCalled();
    com.google.javascript.rhino.jstype.JSType var52 = var50.getReturnType();
    com.google.javascript.rhino.jstype.JSType var53 = null;
    boolean var54 = var50.isEquivalentTo(var53);
    com.google.javascript.rhino.jstype.ObjectType var55 = null;
    com.google.javascript.rhino.jstype.FunctionType var56 = var38.createFunctionTypeWithNewThisType(var50, var55);
    com.google.javascript.rhino.JSDocInfo var57 = new com.google.javascript.rhino.JSDocInfo();
    java.lang.String var58 = var57.getOriginalCommentString();
    boolean var59 = var57.hasType();
    boolean var60 = var57.hasReturnType();
    java.util.List var61 = var57.getExtendedInterfaces();
    com.google.javascript.rhino.Node var62 = var38.createParametersWithVarArgs(var61);
    var38.identifyNonNullableName("(ERROR)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.connect((java.lang.Object)var19, (java.lang.Object)409600, (java.lang.Object)"(ERROR)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test306"); }


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
      java.lang.Enum var29 = java.lang.Enum.<java.lang.Enum>valueOf(var27, "OR\n");
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

  public void test307() {}
//   public void test307() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test307"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Region var4 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.Region var7 = var1.getSourceRegion("", 0);
//     com.google.javascript.jscomp.CheckLevel var9 = null;
//     com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.make("", var9, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var13 = null;
//     com.google.javascript.jscomp.DiagnosticType var15 = com.google.javascript.jscomp.DiagnosticType.make("", var13, "(ERROR)");
//     com.google.javascript.jscomp.CheckLevel var17 = null;
//     com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.make("", var17, "(ERROR)");
//     int var20 = var15.compareTo(var19);
//     java.lang.String[] var22 = new java.lang.String[] { "ERROR  100 [synthetic: 1]\n"};
//     com.google.javascript.jscomp.JSError var23 = com.google.javascript.jscomp.JSError.make(var19, var22);
//     com.google.javascript.jscomp.JSError var24 = com.google.javascript.jscomp.JSError.make(var11, var22);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var25 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.lang.Iterable var26 = var25.getDirectedGraphNodes();
//     boolean var27 = var24.equals((java.lang.Object)var26);
//     java.lang.String var28 = var24.toString();
//     com.google.javascript.jscomp.CheckLevel var29 = var1.getErrorLevel(var24);
// 
//   }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test308"); }


    com.google.javascript.rhino.EcmaError var1 = com.google.javascript.rhino.ScriptRuntime.typeError("");
    java.lang.String var2 = var1.details();
    java.lang.String var3 = var1.getSourceName();
    java.lang.Throwable[] var4 = var1.getSuppressed();
    java.lang.String var5 = var1.details();
    int var6 = var1.lineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "TypeError: "+ "'", var2.equals("TypeError: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "TypeError: "+ "'", var5.equals("TypeError: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test309() {}
//   public void test309() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test309"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.lang.Iterable var1 = var0.getDirectedGraphNodes();
//     var0.clearEdgeAnnotations();
//     java.util.List var3 = var0.getEdges();
//     com.google.javascript.jscomp.CompilerOptions var4 = new com.google.javascript.jscomp.CompilerOptions();
//     var4.setRemoveClosureAsserts(false);
//     var4.setTweakToStringLiteral("{1215373146}", "or");
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var10 = var0.createDirectedGraphNode((java.lang.Object)var4);
//     var0.popEdgeAnnotations();
// 
//   }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test310"); }


    com.google.javascript.jscomp.SourceFile.Generator var1 = null;
    com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var1);
    java.lang.String var3 = var2.getName();
    com.google.javascript.jscomp.CompilerInput var5 = new com.google.javascript.jscomp.CompilerInput(var2, true);
    var2.clearCachedSource();
    com.google.javascript.jscomp.CompilerInput var8 = new com.google.javascript.jscomp.CompilerInput(var2, true);
    java.io.PrintStream var9 = null;
    com.google.javascript.jscomp.Compiler var10 = new com.google.javascript.jscomp.Compiler(var9);
    com.google.javascript.jscomp.Region var13 = var10.getSourceRegion("", 0);
    com.google.javascript.jscomp.Region var16 = var10.getSourceRegion("", 0);
    com.google.javascript.jscomp.Compiler.IntermediateState var17 = var10.getState();
    com.google.javascript.jscomp.SourceMap var18 = var10.getSourceMap();
    com.google.javascript.jscomp.SourceFile.Generator var20 = null;
    com.google.javascript.jscomp.JSSourceFile var21 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var20);
    java.lang.String var22 = var21.getName();
    var21.setOriginalPath("");
    com.google.javascript.jscomp.SourceFile.Generator var26 = null;
    com.google.javascript.jscomp.JSSourceFile var27 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var26);
    java.lang.String var28 = var27.getName();
    com.google.javascript.jscomp.CompilerOptions var29 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.CodingConvention var30 = var29.getCodingConvention();
    var29.enableExternExports(true);
    boolean var33 = var29.isExternExportsEnabled();
    com.google.javascript.jscomp.Result var34 = var10.compile(var21, var27, var29);
    var8.setSourceFile((com.google.javascript.jscomp.SourceFile)var21);
    var21.setOriginalPath("STRING ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test311() {}
//   public void test311() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test311"); }
// 
// 
//     java.util.logging.Logger var0 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
//     double var2 = var1.getTypedPercent();
//     var1.setTypedPercent((-1.0d));
//     var1.generateReport();
//     com.google.javascript.jscomp.Compiler var6 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var1);
//     boolean var7 = var6.acceptEcmaScript5();
// 
//   }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test312"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var3 = new com.google.javascript.jscomp.JSModule("");
    var1.addDependency(var3);
    java.util.List var5 = var1.getDependencies();
    com.google.javascript.jscomp.JSModule var7 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var9 = new com.google.javascript.jscomp.JSModule("");
    var7.addDependency(var9);
    var1.addDependency(var7);
    var1.removeAll();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test313"); }


    boolean var1 = com.google.javascript.rhino.Context.isValidOptimizationLevel(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test314"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("");
    var3.putIntProp(100, 1);
    com.google.javascript.rhino.Node[] var7 = new com.google.javascript.rhino.Node[] { var3};
    com.google.javascript.rhino.Node var8 = new com.google.javascript.rhino.Node((-1), var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var9 = new com.google.javascript.rhino.Node(2, var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test315() {}
//   public void test315() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test315"); }
// 
// 
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.Node.newString("");
//     var2.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var6 = var2.removeFirstChild();
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var16 = new com.google.javascript.rhino.Node(1, var2, var8, var13, 1, 1);
//     com.google.javascript.rhino.JSDocInfo var17 = var8.getJSDocInfo();
//     var8.setSourcePositionForTree(100);
//     java.lang.String var20 = var8.getString();
//     com.google.javascript.rhino.Context var21 = null;
//     com.google.javascript.rhino.Context var22 = com.google.javascript.rhino.Context.enter(var21);
//     int var23 = var22.getOptimizationLevel();
//     boolean var24 = var22.hasCompileFunctionsWithDynamicScope();
//     boolean var25 = var22.isGeneratingSource();
//     com.google.javascript.rhino.ErrorReporter var26 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var26);
//     boolean var29 = var27.hasNamespace("hi!");
//     com.google.javascript.rhino.ErrorReporter var30 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var30);
//     boolean var33 = var31.hasNamespace("hi!");
//     var31.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var35 = null;
//     com.google.javascript.rhino.jstype.JSType var36 = null;
//     com.google.javascript.rhino.jstype.JSType[] var37 = new com.google.javascript.rhino.jstype.JSType[] { var36};
//     com.google.javascript.rhino.jstype.FunctionType var38 = var31.createConstructorType(var35, var37);
//     com.google.javascript.rhino.ErrorReporter var39 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var39);
//     boolean var42 = var40.hasNamespace("hi!");
//     var40.clearTemplateTypeName();
//     com.google.javascript.rhino.jstype.JSType var44 = null;
//     com.google.javascript.rhino.jstype.JSType var45 = null;
//     com.google.javascript.rhino.jstype.JSType[] var46 = new com.google.javascript.rhino.jstype.JSType[] { var45};
//     com.google.javascript.rhino.jstype.FunctionType var47 = var40.createConstructorType(var44, var46);
//     boolean var48 = var47.canBeCalled();
//     var38.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var47);
//     boolean var50 = var38.hasCachedValues();
//     com.google.javascript.rhino.jstype.JSType var51 = null;
//     com.google.javascript.rhino.jstype.FunctionType var52 = var27.createFunctionTypeWithNewReturnType(var38, var51);
//     com.google.javascript.rhino.jstype.ObjectType var53 = var38.getInstanceType();
//     com.google.javascript.rhino.Node var55 = com.google.javascript.rhino.Node.newString("");
//     java.lang.String var59 = var55.toString(false, true, false);
//     com.google.javascript.rhino.Node var62 = com.google.javascript.rhino.Node.newString("");
//     var62.putIntProp(100, 1);
//     com.google.javascript.rhino.Node var66 = var62.removeFirstChild();
//     com.google.javascript.rhino.Node var68 = com.google.javascript.rhino.Node.newString("");
//     com.google.javascript.rhino.Node var73 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
//     com.google.javascript.rhino.Node var76 = new com.google.javascript.rhino.Node(1, var62, var68, var73, 1, 1);
//     boolean var77 = var68.hasSideEffects();
//     com.google.javascript.rhino.Node var78 = var55.copyInformationFromForTree(var68);
//     var38.setSource(var55);
//     var22.removeThreadLocal((java.lang.Object)var55);
//     com.google.javascript.rhino.Node var81 = var8.getChildBefore(var55);
// 
//   }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test316"); }


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
    var8.clearResolved();
    com.google.javascript.rhino.ErrorReporter var22 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var22);
    boolean var25 = var23.hasNamespace("hi!");
    var23.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.rhino.jstype.JSType var28 = null;
    com.google.javascript.rhino.jstype.JSType[] var29 = new com.google.javascript.rhino.jstype.JSType[] { var28};
    com.google.javascript.rhino.jstype.FunctionType var30 = var23.createConstructorType(var27, var29);
    com.google.javascript.rhino.ErrorReporter var31 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var31);
    boolean var34 = var32.hasNamespace("hi!");
    var32.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.JSType var36 = null;
    com.google.javascript.rhino.jstype.JSType var37 = null;
    com.google.javascript.rhino.jstype.JSType[] var38 = new com.google.javascript.rhino.jstype.JSType[] { var37};
    com.google.javascript.rhino.jstype.FunctionType var39 = var32.createConstructorType(var36, var38);
    boolean var40 = var39.canBeCalled();
    var30.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var39);
    boolean var42 = var39.canBeCalled();
    com.google.javascript.rhino.jstype.TernaryValue var43 = var8.testForEquality((com.google.javascript.rhino.jstype.JSType)var39);
    var39.clearCachedValues();
    boolean var45 = var39.isInterface();
    boolean var46 = var39.isInterface();
    
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
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test317"); }


    java.lang.String var1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "()"+ "'", var1.equals("()"));

  }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test318"); }


    com.google.javascript.jscomp.SourceFile.Generator var1 = null;
    com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var1);
    java.lang.String var3 = var2.getName();
    var2.setOriginalPath("");
    var2.clearCachedSource();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test319"); }


    com.google.javascript.rhino.Context var0 = null;
    com.google.javascript.rhino.Context var1 = com.google.javascript.rhino.Context.enter(var0);
    int var2 = var1.getOptimizationLevel();
    boolean var3 = var1.hasCompileFunctionsWithDynamicScope();
    boolean var4 = var1.isGeneratingSource();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var5 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.util.Collection var6 = var5.getNodes();
    java.lang.Iterable var7 = var5.getDirectedGraphNodes();
    java.util.List var8 = var5.getGraphvizNodes();
    com.google.javascript.jscomp.JSModuleGraph var9 = new com.google.javascript.jscomp.JSModuleGraph(var8);
    var9.coalesceDuplicateFiles();
    var9.coalesceDuplicateFiles();
    com.google.javascript.jscomp.SourceFile.Generator var13 = null;
    com.google.javascript.jscomp.JSSourceFile var14 = com.google.javascript.jscomp.JSSourceFile.fromGenerator("hi!", var13);
    java.lang.String var15 = var14.getName();
    com.google.javascript.jscomp.CompilerInput var17 = new com.google.javascript.jscomp.CompilerInput(var14, true);
    com.google.javascript.jscomp.JSModule var19 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var21 = new com.google.javascript.jscomp.JSModule("");
    var19.addDependency(var21);
    java.util.List var23 = var19.getDependencies();
    java.util.List var24 = var19.getRequires();
    com.google.javascript.jscomp.SourceAst var25 = null;
    com.google.javascript.jscomp.CompilerInput var28 = new com.google.javascript.jscomp.CompilerInput(var25, "", true);
    com.google.javascript.jscomp.SourceAst var29 = var28.getSourceAst();
    var19.remove(var28);
    var17.setModule(var19);
    com.google.javascript.jscomp.JSModule var33 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var35 = new com.google.javascript.jscomp.JSModule("");
    var33.addDependency(var35);
    java.util.List var37 = var33.getDependencies();
    com.google.javascript.jscomp.JSModule var39 = new com.google.javascript.jscomp.JSModule("");
    com.google.javascript.jscomp.JSModule var41 = new com.google.javascript.jscomp.JSModule("");
    var39.addDependency(var41);
    var33.addDependency(var39);
    java.lang.String var44 = var33.getName();
    boolean var45 = var9.dependsOn(var19, var33);
    java.lang.Object var46 = var1.getThreadLocal((java.lang.Object)var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + ""+ "'", var44.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test320"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("");
    var3.putIntProp(100, 1);
    com.google.javascript.rhino.Node var7 = var3.removeFirstChild();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("");
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.Node var17 = new com.google.javascript.rhino.Node(1, var3, var9, var14, 1, 1);
    var17.setType(409600);
    com.google.javascript.rhino.Node var20 = com.google.javascript.jscomp.NodeUtil.newExpr(var17);
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.Node.newString("");
    boolean var23 = var22.hasChildren();
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSDocInfo var29 = null;
    var28.setJSDocInfo(var29);
    com.google.javascript.rhino.Node var32 = var28.getChildAtIndex(0);
    var22.addChildrenToFront(var28);
    com.google.javascript.rhino.Node var34 = var28.getLastChild();
    var28.setLineno(409600);
    com.google.javascript.rhino.Node var37 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var40 = new com.google.javascript.rhino.Node(1, var20, var28, var37, (-1), 2147483647);
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
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test321"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var8 = new com.google.javascript.rhino.JSTypeExpression(var6, "");
    boolean var10 = var8.equals((java.lang.Object)'4');
    boolean var11 = var1.recordBaseType(var8);
    boolean var12 = var1.isDescriptionRecorded();
    var1.markText("", 0, 1, (-1), 1);
    com.google.javascript.rhino.JSDocInfoBuilder var20 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    boolean var21 = var20.recordJavaDispatch();
    com.google.javascript.rhino.JSDocInfoBuilder var23 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.Node.newString((-1), "", 100, 0);
    com.google.javascript.rhino.JSTypeExpression var30 = new com.google.javascript.rhino.JSTypeExpression(var28, "");
    boolean var32 = var30.equals((java.lang.Object)'4');
    boolean var33 = var23.recordBaseType(var30);
    boolean var34 = var20.recordExtendedInterface(var30);
    boolean var35 = var30.isVarArgs();
    boolean var36 = var1.recordReturnType(var30);
    boolean var38 = var1.recordBlockDescription("eol");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);

  }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test322"); }


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
    int var32 = var31.getCharno();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var33 = var31.getJsDocBuilderForNode();
    
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
    assertTrue(var32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test323"); }


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

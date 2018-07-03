
import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test1"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(1.0d);
    com.google.javascript.rhino.Node var2 = var1.getNext();
    int var3 = var1.getLineno();
    var1.setCharno(100);
    boolean var6 = var1.isDebugger();
    int var7 = var1.getLineno();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var8 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));

  }

  public void test2() {}
//   public void test2() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test2"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
//     com.google.javascript.rhino.jstype.JSType var4 = null;
//     boolean var5 = var2.declareType("hi!", var4);
//     var2.clearTemplateTypeName();
//     var2.setLastGeneration(false);
//     var2.resetForTypeCheck();
//     var2.resetForTypeCheck();
//     var2.setLastGeneration(false);
//     com.google.javascript.rhino.jstype.JSType var13 = null;
//     com.google.javascript.rhino.jstype.JSType var14 = null;
//     com.google.javascript.rhino.jstype.JSType[] var15 = new com.google.javascript.rhino.jstype.JSType[] { var14};
//     com.google.javascript.rhino.jstype.FunctionType var16 = var2.createConstructorType(var13, var15);
//     java.lang.Iterable var17 = var16.getCtorExtendedInterfaces();
//     boolean var18 = var16.hasImplementedInterfaces();
//     boolean var19 = var16.isNullable();
//     com.google.javascript.rhino.jstype.ObjectType var20 = var16.getInstanceType();
//     boolean var21 = var16.isInterface();
//     boolean var22 = var16.isStringObjectType();
//     com.google.javascript.rhino.jstype.FunctionType var23 = null;
//     boolean var24 = var16.hasEqualCallType(var23);
// 
//   }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test3"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    boolean var1 = var0.isNoCompile();
    boolean var2 = var0.isExterns();
    boolean var3 = var0.hasReturnType();
    boolean var5 = var0.hasDescriptionForParameter("hi!");
    java.lang.String var6 = var0.getReturnDescription();
    java.lang.String var7 = var0.getReturnDescription();
    boolean var8 = var0.isIdGenerator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test4"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var3 = null;
    boolean var5 = var2.canPropertyBeDefined(var3, "LABEL_NAME hi!");
    com.google.javascript.rhino.ErrorReporter var7 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7, true);
    com.google.javascript.rhino.jstype.JSType var11 = null;
    boolean var12 = var9.declareType("hi!", var11);
    var9.clearTemplateTypeName();
    var9.setLastGeneration(false);
    var9.resetForTypeCheck();
    var9.resetForTypeCheck();
    var9.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var20 = null;
    com.google.javascript.rhino.jstype.JSType var21 = null;
    com.google.javascript.rhino.jstype.JSType[] var22 = new com.google.javascript.rhino.jstype.JSType[] { var21};
    com.google.javascript.rhino.jstype.FunctionType var23 = var9.createConstructorType(var20, var22);
    java.lang.Iterable var24 = var23.getImplementedInterfaces();
    boolean var25 = var23.isRegexpType();
    boolean var26 = var23.isEnumType();
    var2.registerPropertyOnType("", (com.google.javascript.rhino.jstype.JSType)var23);
    com.google.javascript.rhino.ErrorReporter var28 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var28, true);
    com.google.javascript.rhino.jstype.JSType var32 = null;
    boolean var33 = var30.declareType("hi!", var32);
    var30.clearTemplateTypeName();
    var30.setLastGeneration(false);
    var30.resetForTypeCheck();
    var30.resetForTypeCheck();
    var30.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var41 = null;
    com.google.javascript.rhino.jstype.JSType var42 = null;
    com.google.javascript.rhino.jstype.JSType[] var43 = new com.google.javascript.rhino.jstype.JSType[] { var42};
    com.google.javascript.rhino.jstype.FunctionType var44 = var30.createConstructorType(var41, var43);
    java.lang.Iterable var45 = var44.getImplementedInterfaces();
    boolean var46 = var44.isRegexpType();
    boolean var47 = var44.isEnumType();
    com.google.javascript.rhino.ErrorReporter var48 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var48, true);
    com.google.javascript.rhino.jstype.JSType var52 = null;
    boolean var53 = var50.declareType("hi!", var52);
    var50.incrementGeneration();
    com.google.javascript.rhino.jstype.JSTypeNative[] var55 = com.google.javascript.rhino.jstype.JSTypeNative.values();
    com.google.javascript.rhino.jstype.JSType var56 = var50.createUnionType(var55);
    com.google.javascript.rhino.jstype.TernaryValue var57 = var44.testForEquality(var56);
    com.google.javascript.rhino.jstype.JSType var58 = var2.createOptionalType(var56);
    var2.identifyNonNullableName("BLOCK\n");
    com.google.javascript.rhino.ErrorReporter var61 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var61, true);
    com.google.javascript.rhino.jstype.JSType var65 = null;
    boolean var66 = var63.declareType("hi!", var65);
    var63.clearTemplateTypeName();
    var63.setLastGeneration(false);
    var63.resetForTypeCheck();
    var63.resetForTypeCheck();
    var63.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var74 = null;
    com.google.javascript.rhino.jstype.JSType var75 = null;
    com.google.javascript.rhino.jstype.JSType[] var76 = new com.google.javascript.rhino.jstype.JSType[] { var75};
    com.google.javascript.rhino.jstype.FunctionType var77 = var63.createConstructorType(var74, var76);
    java.lang.Iterable var78 = var77.getCtorExtendedInterfaces();
    com.google.javascript.rhino.jstype.JSType var79 = var77.getIndexType();
    com.google.javascript.rhino.jstype.JSType var84 = var2.getType((com.google.javascript.rhino.jstype.StaticScope)var77, "BLOCK\n", "BLOCK\n", 125, 10);
    com.google.javascript.rhino.Node var87 = com.google.javascript.rhino.IR.string("goog.exportSymbol");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.FunctionType var88 = var2.createInterfaceType("hi!", var87);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test5"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler var1 = var0.getAliasTransformationHandler();
    var0.setDefineToStringLiteral("goog.exportSymbol", "goog.exportProperty");
    com.google.javascript.jscomp.CompilerOptions var5 = new com.google.javascript.jscomp.CompilerOptions();
    var5.setLooseTypes(false);
    var5.setShadowVariables(true);
    com.google.javascript.rhino.JSDocInfo var11 = new com.google.javascript.rhino.JSDocInfo();
    java.util.List var12 = var11.getExtendedInterfaces();
    com.google.javascript.jscomp.JSModule[] var13 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var12);
    var5.setReplaceStringsConfiguration("", var12);
    var5.setCheckSuspiciousCode(true);
    java.util.Map var17 = var5.getDefineReplacements();
    var0.setTweakReplacements(var17);
    var0.setReserveRawExports(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test6"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.clearNamedTypes();
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8, true);
    com.google.javascript.rhino.jstype.JSType var12 = null;
    boolean var13 = var10.declareType("hi!", var12);
    var10.clearTemplateTypeName();
    var10.setLastGeneration(false);
    var10.resetForTypeCheck();
    com.google.javascript.rhino.jstype.JSType var19 = null;
    var10.unregisterPropertyOnType("", var19);
    com.google.javascript.rhino.ErrorReporter var21 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21, true);
    com.google.javascript.rhino.jstype.JSType var25 = null;
    boolean var26 = var23.declareType("hi!", var25);
    var23.clearTemplateTypeName();
    var23.setLastGeneration(false);
    var23.resetForTypeCheck();
    var23.resetForTypeCheck();
    var23.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var34 = null;
    com.google.javascript.rhino.jstype.JSType var35 = null;
    com.google.javascript.rhino.jstype.JSType[] var36 = new com.google.javascript.rhino.jstype.JSType[] { var35};
    com.google.javascript.rhino.jstype.FunctionType var37 = var23.createConstructorType(var34, var36);
    java.lang.Iterable var38 = var37.getCtorExtendedInterfaces();
    com.google.javascript.rhino.ErrorReporter var40 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var40, true);
    com.google.javascript.rhino.jstype.JSType var44 = null;
    boolean var45 = var42.declareType("hi!", var44);
    var42.clearTemplateTypeName();
    var42.setLastGeneration(false);
    var42.resetForTypeCheck();
    var42.resetForTypeCheck();
    var42.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var53 = null;
    com.google.javascript.rhino.jstype.JSType var54 = null;
    com.google.javascript.rhino.jstype.JSType[] var55 = new com.google.javascript.rhino.jstype.JSType[] { var54};
    com.google.javascript.rhino.jstype.FunctionType var56 = var42.createConstructorType(var53, var55);
    com.google.javascript.rhino.jstype.FunctionType var57 = var10.createFunctionType((com.google.javascript.rhino.jstype.JSType)var37, false, var55);
    var2.overwriteDeclaredType("hi!", (com.google.javascript.rhino.jstype.JSType)var37);
    com.google.javascript.rhino.ErrorReporter var59 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var59, true);
    com.google.javascript.rhino.jstype.JSType var63 = null;
    boolean var64 = var61.declareType("hi!", var63);
    var61.clearTemplateTypeName();
    var61.setLastGeneration(false);
    var61.resetForTypeCheck();
    var61.resetForTypeCheck();
    var61.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var72 = null;
    com.google.javascript.rhino.jstype.JSType var73 = null;
    com.google.javascript.rhino.jstype.JSType[] var74 = new com.google.javascript.rhino.jstype.JSType[] { var73};
    com.google.javascript.rhino.jstype.FunctionType var75 = var61.createConstructorType(var72, var74);
    com.google.javascript.rhino.ErrorReporter var76 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var76, true);
    com.google.javascript.rhino.jstype.JSType var80 = null;
    boolean var81 = var78.declareType("hi!", var80);
    var78.clearTemplateTypeName();
    var78.setLastGeneration(false);
    var78.resetForTypeCheck();
    var78.resetForTypeCheck();
    var78.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var89 = null;
    com.google.javascript.rhino.jstype.JSType var90 = null;
    com.google.javascript.rhino.jstype.JSType[] var91 = new com.google.javascript.rhino.jstype.JSType[] { var90};
    com.google.javascript.rhino.jstype.FunctionType var92 = var78.createConstructorType(var89, var91);
    java.lang.Iterable var93 = var92.getCtorExtendedInterfaces();
    com.google.javascript.rhino.jstype.JSType var94 = var92.getIndexType();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var95 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.util.List var96 = var95.getGraphvizNodes();
    com.google.javascript.rhino.Node var97 = com.google.javascript.rhino.IR.paramList(var96);
    com.google.javascript.rhino.jstype.JSType var98 = var2.createFunctionTypeWithVarArgs((com.google.javascript.rhino.jstype.ObjectType)var75, (com.google.javascript.rhino.jstype.JSType)var92, var96);
    com.google.javascript.rhino.Node var99 = var92.getRootNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var99);

  }

  public void test7() {}
//   public void test7() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test7"); }
// 
// 
//     com.google.javascript.rhino.Node[] var0 = null;
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.block(var0);
// 
//   }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test8"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.paramList();
    boolean var2 = var1.hasOneChild();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var3 = var1.getJsDocBuilderForNode();
    com.google.javascript.rhino.Node var5 = new com.google.javascript.rhino.Node(100);
    com.google.javascript.jscomp.ClosureCodingConvention var6 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var7 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var8 = var6.getDelegateRelationship(var7);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var12 = var11.isOr();
    boolean var13 = var11.isTry();
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.paramList();
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var17 = var16.isOr();
    com.google.javascript.rhino.Node var18 = new com.google.javascript.rhino.Node(10, var11, var14, var16);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.pos(var18);
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var20 = var6.getDelegateRelationship(var18);
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var23 = var22.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var24 = var22.getJsDocBuilderForNode();
    boolean var25 = var22.isOptionalArg();
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var28 = var27.isOr();
    var22.addChildToBack(var27);
    int var30 = var22.getCharno();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var31 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.util.List var32 = var31.getGraphvizNodes();
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.paramList(var32);
    com.google.javascript.rhino.Node var34 = var22.useSourceInfoFrom(var33);
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var38 = var37.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var39 = var37.getJsDocBuilderForNode();
    boolean var40 = var37.isOptionalArg();
    com.google.javascript.rhino.Node var41 = new com.google.javascript.rhino.Node(1, var37);
    java.lang.String var42 = var6.extractClassNameIfProvide(var34, var37);
    com.google.javascript.rhino.Node var43 = new com.google.javascript.rhino.Node(100, var1, var5, var34);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var44 = var1.getString();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test9"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.clearTemplateTypeName();
    var2.setLastGeneration(false);
    var2.resetForTypeCheck();
    com.google.javascript.rhino.jstype.JSType var11 = null;
    var2.unregisterPropertyOnType("", var11);
    com.google.javascript.rhino.ErrorReporter var13 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13, true);
    com.google.javascript.rhino.jstype.JSType var17 = null;
    boolean var18 = var15.declareType("hi!", var17);
    var15.clearTemplateTypeName();
    var15.setLastGeneration(false);
    var15.resetForTypeCheck();
    var15.resetForTypeCheck();
    var15.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var26 = null;
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.rhino.jstype.JSType[] var28 = new com.google.javascript.rhino.jstype.JSType[] { var27};
    com.google.javascript.rhino.jstype.FunctionType var29 = var15.createConstructorType(var26, var28);
    java.lang.Iterable var30 = var29.getCtorExtendedInterfaces();
    com.google.javascript.rhino.ErrorReporter var32 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32, true);
    com.google.javascript.rhino.jstype.JSType var36 = null;
    boolean var37 = var34.declareType("hi!", var36);
    var34.clearTemplateTypeName();
    var34.setLastGeneration(false);
    var34.resetForTypeCheck();
    var34.resetForTypeCheck();
    var34.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var45 = null;
    com.google.javascript.rhino.jstype.JSType var46 = null;
    com.google.javascript.rhino.jstype.JSType[] var47 = new com.google.javascript.rhino.jstype.JSType[] { var46};
    com.google.javascript.rhino.jstype.FunctionType var48 = var34.createConstructorType(var45, var47);
    com.google.javascript.rhino.jstype.FunctionType var49 = var2.createFunctionType((com.google.javascript.rhino.jstype.JSType)var29, false, var47);
    com.google.javascript.rhino.JSDocInfo var51 = new com.google.javascript.rhino.JSDocInfo();
    boolean var52 = var51.isNoCompile();
    boolean var53 = var51.isExterns();
    boolean var54 = var51.hasReturnType();
    var29.setPropertyJSDocInfo("(goog.exportSymbol)", var51);
    boolean var56 = var51.isConstant();
    java.util.Collection var57 = var51.getReferences();
    boolean var58 = var51.isNoTypeCheck();
    com.google.javascript.rhino.JSTypeExpression var59 = var51.getEnumParameterType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test10"); }


    com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
    boolean var3 = var0.isExported("", true);
    boolean var5 = var0.isValidEnumKey("hi!");
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var9 = var8.isOr();
    boolean var10 = var8.isTry();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.paramList();
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var14 = var13.isOr();
    com.google.javascript.rhino.Node var15 = new com.google.javascript.rhino.Node(10, var8, var11, var13);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.pos(var15);
    com.google.javascript.jscomp.SourceFile var19 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
    java.io.Reader var20 = var19.getCodeReader();
    var16.setStaticSourceFile((com.google.javascript.rhino.jstype.StaticSourceFile)var19);
    int var22 = var16.getChildCount();
    boolean var23 = var0.isPrototypeAlias(var16);
    com.google.javascript.jscomp.ClosureCodingConvention var24 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var25 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var26 = var24.getDelegateRelationship(var25);
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var30 = var29.isOr();
    boolean var31 = var29.isTry();
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.paramList();
    com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var35 = var34.isOr();
    com.google.javascript.rhino.Node var36 = new com.google.javascript.rhino.Node(10, var29, var32, var34);
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.pos(var36);
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var38 = var24.getDelegateRelationship(var36);
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var41 = var40.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var42 = var40.getJsDocBuilderForNode();
    boolean var43 = var40.isOptionalArg();
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var46 = var45.isOr();
    var40.addChildToBack(var45);
    int var48 = var40.getCharno();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var49 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.util.List var50 = var49.getGraphvizNodes();
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.paramList(var50);
    com.google.javascript.rhino.Node var52 = var40.useSourceInfoFrom(var51);
    com.google.javascript.rhino.Node var55 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var56 = var55.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var57 = var55.getJsDocBuilderForNode();
    boolean var58 = var55.isOptionalArg();
    com.google.javascript.rhino.Node var59 = new com.google.javascript.rhino.Node(1, var55);
    java.lang.String var60 = var24.extractClassNameIfProvide(var52, var55);
    boolean var61 = var0.isOptionalParameter(var55);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var62 = com.google.javascript.rhino.IR.defaultCase(var55);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);

  }

  public void test11() {}
//   public void test11() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test11"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     var0.setRemoveUnusedPrototypeProperties(false);
//     com.google.javascript.jscomp.CompilerOptions.TracerMode var3 = null;
//     var0.setTracer(var3);
//     java.util.List var6 = null;
//     var0.setReplaceStringsConfiguration("goog.exportSymbol", var6);
// 
//   }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test12"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.clearTemplateTypeName();
    var2.incrementGeneration();
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8, true);
    com.google.javascript.rhino.jstype.JSType var12 = null;
    boolean var13 = var10.declareType("hi!", var12);
    var10.clearNamedTypes();
    com.google.javascript.rhino.ErrorReporter var16 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var16, true);
    com.google.javascript.rhino.jstype.JSType var20 = null;
    boolean var21 = var18.declareType("hi!", var20);
    var18.clearTemplateTypeName();
    var18.setLastGeneration(false);
    var18.resetForTypeCheck();
    com.google.javascript.rhino.jstype.JSType var27 = null;
    var18.unregisterPropertyOnType("", var27);
    com.google.javascript.rhino.ErrorReporter var29 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29, true);
    com.google.javascript.rhino.jstype.JSType var33 = null;
    boolean var34 = var31.declareType("hi!", var33);
    var31.clearTemplateTypeName();
    var31.setLastGeneration(false);
    var31.resetForTypeCheck();
    var31.resetForTypeCheck();
    var31.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var42 = null;
    com.google.javascript.rhino.jstype.JSType var43 = null;
    com.google.javascript.rhino.jstype.JSType[] var44 = new com.google.javascript.rhino.jstype.JSType[] { var43};
    com.google.javascript.rhino.jstype.FunctionType var45 = var31.createConstructorType(var42, var44);
    java.lang.Iterable var46 = var45.getCtorExtendedInterfaces();
    com.google.javascript.rhino.ErrorReporter var48 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var48, true);
    com.google.javascript.rhino.jstype.JSType var52 = null;
    boolean var53 = var50.declareType("hi!", var52);
    var50.clearTemplateTypeName();
    var50.setLastGeneration(false);
    var50.resetForTypeCheck();
    var50.resetForTypeCheck();
    var50.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var61 = null;
    com.google.javascript.rhino.jstype.JSType var62 = null;
    com.google.javascript.rhino.jstype.JSType[] var63 = new com.google.javascript.rhino.jstype.JSType[] { var62};
    com.google.javascript.rhino.jstype.FunctionType var64 = var50.createConstructorType(var61, var63);
    com.google.javascript.rhino.jstype.FunctionType var65 = var18.createFunctionType((com.google.javascript.rhino.jstype.JSType)var45, false, var63);
    var10.overwriteDeclaredType("hi!", (com.google.javascript.rhino.jstype.JSType)var45);
    int var67 = var45.getMinArguments();
    com.google.javascript.rhino.ErrorReporter var68 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var68, true);
    com.google.javascript.rhino.jstype.JSType var72 = null;
    boolean var73 = var70.declareType("hi!", var72);
    var70.clearTemplateTypeName();
    var70.setLastGeneration(false);
    var70.resetForTypeCheck();
    var70.resetForTypeCheck();
    var70.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var81 = null;
    com.google.javascript.rhino.jstype.JSType var82 = null;
    com.google.javascript.rhino.jstype.JSType[] var83 = new com.google.javascript.rhino.jstype.JSType[] { var82};
    com.google.javascript.rhino.jstype.FunctionType var84 = var70.createConstructorType(var81, var83);
    java.lang.Iterable var85 = var84.getImplementedInterfaces();
    com.google.javascript.rhino.jstype.JSType.TypePair var86 = var45.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType)var84);
    com.google.javascript.rhino.jstype.JSType var87 = var2.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType)var45);
    com.google.javascript.rhino.jstype.ObjectType var88 = var2.createAnonymousObjectType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == true);
    
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

  }

  public void test13() {}
//   public void test13() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test13"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
//     com.google.javascript.rhino.jstype.JSType var4 = null;
//     boolean var5 = var2.declareType("hi!", var4);
//     var2.clearTemplateTypeName();
//     var2.setLastGeneration(false);
//     var2.resetForTypeCheck();
//     com.google.javascript.jscomp.ClosureCodingConvention var11 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     com.google.javascript.rhino.Node var12 = null;
//     com.google.javascript.jscomp.CodingConvention.DelegateRelationship var13 = var11.getDelegateRelationship(var12);
//     java.lang.String var14 = var11.getExportSymbolFunction();
//     boolean var17 = var11.isExported("hi!", true);
//     com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.labelName("hi!");
//     boolean var20 = var19.isOr();
//     com.google.javascript.rhino.Node.FileLevelJsDocBuilder var21 = var19.getJsDocBuilderForNode();
//     boolean var22 = var19.isOptionalArg();
//     java.lang.String var23 = var19.toString();
//     var19.setString("");
//     boolean var26 = var19.isDo();
//     boolean var27 = var19.hasChildren();
//     com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.paramList();
//     java.lang.String var29 = var11.extractClassNameIfRequire(var19, var28);
//     com.google.javascript.rhino.ErrorReporter var30 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var30, true);
//     com.google.javascript.rhino.jstype.JSType var34 = null;
//     boolean var35 = var32.declareType("hi!", var34);
//     var32.clearTemplateTypeName();
//     var32.setLastGeneration(false);
//     var32.resetForTypeCheck();
//     com.google.javascript.rhino.jstype.JSType var41 = null;
//     var32.unregisterPropertyOnType("", var41);
//     com.google.javascript.rhino.ErrorReporter var43 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var43, true);
//     com.google.javascript.rhino.jstype.JSType var47 = null;
//     boolean var48 = var45.declareType("hi!", var47);
//     var45.clearTemplateTypeName();
//     var45.setLastGeneration(false);
//     var45.resetForTypeCheck();
//     var45.resetForTypeCheck();
//     var45.setLastGeneration(false);
//     com.google.javascript.rhino.jstype.JSType var56 = null;
//     com.google.javascript.rhino.jstype.JSType var57 = null;
//     com.google.javascript.rhino.jstype.JSType[] var58 = new com.google.javascript.rhino.jstype.JSType[] { var57};
//     com.google.javascript.rhino.jstype.FunctionType var59 = var45.createConstructorType(var56, var58);
//     java.lang.Iterable var60 = var59.getCtorExtendedInterfaces();
//     com.google.javascript.rhino.ErrorReporter var62 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var62, true);
//     com.google.javascript.rhino.jstype.JSType var66 = null;
//     boolean var67 = var64.declareType("hi!", var66);
//     var64.clearTemplateTypeName();
//     var64.setLastGeneration(false);
//     var64.resetForTypeCheck();
//     var64.resetForTypeCheck();
//     var64.setLastGeneration(false);
//     com.google.javascript.rhino.jstype.JSType var75 = null;
//     com.google.javascript.rhino.jstype.JSType var76 = null;
//     com.google.javascript.rhino.jstype.JSType[] var77 = new com.google.javascript.rhino.jstype.JSType[] { var76};
//     com.google.javascript.rhino.jstype.FunctionType var78 = var64.createConstructorType(var75, var77);
//     com.google.javascript.rhino.jstype.FunctionType var79 = var32.createFunctionType((com.google.javascript.rhino.jstype.JSType)var59, false, var77);
//     boolean var80 = var59.isEmptyType();
//     com.google.javascript.rhino.jstype.EnumType var81 = var2.createEnumType("LinkedGraph", var19, (com.google.javascript.rhino.jstype.JSType)var59);
//     boolean var82 = var59.isAllType();
//     com.google.common.base.Predicate var83 = null;
//     boolean var84 = var59.setValidator(var83);
// 
//   }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test14"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.Compiler.IntermediateState var2 = var1.getState();
    com.google.javascript.jscomp.JSSourceFile var5 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    java.lang.String var6 = var5.getCode();
    com.google.javascript.jscomp.JSSourceFile[] var7 = new com.google.javascript.jscomp.JSSourceFile[] { var5};
    com.google.javascript.jscomp.JSModule var9 = new com.google.javascript.jscomp.JSModule("hi!");
    com.google.javascript.jscomp.JSModule[] var10 = new com.google.javascript.jscomp.JSModule[] { var9};
    com.google.javascript.jscomp.JSModuleGraph var11 = new com.google.javascript.jscomp.JSModuleGraph(var10);
    com.google.javascript.jscomp.JSModule var13 = new com.google.javascript.jscomp.JSModule("hi!");
    java.util.Set var14 = var13.getAllDependencies();
    java.util.List var15 = var13.getProvides();
    com.google.javascript.jscomp.JSModule var17 = new com.google.javascript.jscomp.JSModule("hi!");
    java.lang.String var18 = var17.toString();
    boolean var19 = var11.dependsOn(var13, var17);
    com.google.javascript.jscomp.JSModule[] var20 = new com.google.javascript.jscomp.JSModule[] { var17};
    com.google.javascript.jscomp.CompilerOptions var21 = new com.google.javascript.jscomp.CompilerOptions();
    var21.setLooseTypes(false);
    var21.setDeadAssignmentElimination(true);
    java.lang.Object var26 = var21.clone();
    var21.setOptimizeCalls(true);
    com.google.javascript.jscomp.Result var29 = var1.compile(var7, var20, var21);
    var21.setRemoveTryCatchFinally(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test15() {}
//   public void test15() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test15"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
//     java.io.Reader var3 = var2.getCodeReader();
//     com.google.javascript.jscomp.JsAst var4 = new com.google.javascript.jscomp.JsAst(var2);
//     var4.clearAst();
//     var4.clearAst();
//     com.google.javascript.rhino.InputId var7 = null;
//     com.google.javascript.jscomp.CompilerInput var9 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var4, var7, true);
//     var9.clearAst();
//     java.lang.String var11 = var9.toString();
// 
//   }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test16"); }


    java.lang.String var1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "(hi!)"+ "'", var1.equals("(hi!)"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test17"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    java.util.List var1 = var0.getExtendedInterfaces();
    com.google.javascript.rhino.JSTypeExpression var2 = var0.getTypedefType();
    int var3 = var0.getParameterCount();
    var0.addSuppression("LinkedGraph");
    boolean var6 = var0.shouldPreserveTry();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test18"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.paramList();
    java.lang.Iterable var1 = var0.siblings();
    boolean var2 = var0.isFromExterns();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var6 = var5.isOr();
    boolean var7 = var5.isTry();
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.paramList();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var11 = var10.isOr();
    com.google.javascript.rhino.Node var12 = new com.google.javascript.rhino.Node(10, var5, var8, var10);
    boolean var13 = var12.isDebugger();
    com.google.javascript.rhino.Node var14 = var0.copyInformationFromForTree(var12);
    boolean var15 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test19"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.paramList();
    boolean var1 = var0.isNew();
    boolean var2 = var0.isGetElem();
    com.google.javascript.jscomp.ClosureCodingConvention var3 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var4 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var5 = var3.getDelegateRelationship(var4);
    java.lang.String var6 = var3.getExportSymbolFunction();
    boolean var9 = var3.isExported("hi!", true);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var12 = var11.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var13 = var11.getJsDocBuilderForNode();
    boolean var14 = var11.isOptionalArg();
    java.lang.String var15 = var11.toString();
    var11.setString("");
    boolean var18 = var11.isDo();
    boolean var19 = var11.hasChildren();
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.paramList();
    java.lang.String var21 = var3.extractClassNameIfRequire(var11, var20);
    boolean var22 = var11.isNew();
    boolean var23 = var11.isHook();
    int var25 = var11.getIntProp(1);
    int var27 = var11.getIntProp(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.getelem(var0, var11);
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
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "goog.exportSymbol"+ "'", var6.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "LABEL_NAME hi!"+ "'", var15.equals("LABEL_NAME hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);

  }

  public void test20() {}
//   public void test20() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test20"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
//     java.lang.Object var1 = null;
//     java.util.Iterator var2 = var0.getNeighborNodesIterator(var1);
// 
//   }

  public void test21() {}
//   public void test21() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test21"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Compiler.IntermediateState var2 = var1.getState();
//     com.google.javascript.jscomp.CheckLevel var6 = null;
//     com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.error("goog.exportSymbol", "");
//     java.lang.String[] var11 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var12 = com.google.javascript.jscomp.JSError.make("LinkedGraph", 100, 100, var6, var9, var11);
//     var1.report(var12);
// 
//   }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test22"); }


    java.lang.String var1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "()"+ "'", var1.equals("()"));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test23"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    boolean var1 = var0.isNoCompile();
    boolean var2 = var0.isExterns();
    java.lang.String var3 = var0.getOriginalCommentString();
    java.lang.String var4 = var0.getTemplateTypeName();
    java.lang.String var5 = var0.getSourceName();
    boolean var7 = var0.hasParameterType("");
    java.lang.String var8 = var0.getDescription();
    boolean var9 = var0.hasReturnType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test24() {}
//   public void test24() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test24"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
//     java.util.List var1 = var0.getGraphvizNodes();
//     com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
//     boolean var3 = var2.isNoCompile();
//     boolean var4 = var2.isExterns();
//     java.lang.String var5 = var2.getOriginalCommentString();
//     boolean var6 = var2.isNoSideEffects();
//     com.google.javascript.jscomp.graph.GraphNode var7 = var0.getNode((java.lang.Object)var2);
//     var0.clearNodeAnnotations();
//     var0.popNodeAnnotations();
// 
//   }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test25"); }


    java.lang.String var1 = com.google.javascript.rhino.Token.name(125);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "BLOCK"+ "'", var1.equals("BLOCK"));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test26"); }


    com.google.javascript.jscomp.AstValidator var0 = new com.google.javascript.jscomp.AstValidator();
    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.block();
    int var2 = var1.getType();
    var0.validateStatement(var1);
    com.google.javascript.rhino.ErrorReporter var4 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var4, true);
    com.google.javascript.rhino.jstype.JSType var8 = null;
    boolean var9 = var6.declareType("hi!", var8);
    var6.clearTemplateTypeName();
    var6.setLastGeneration(false);
    var6.resetForTypeCheck();
    var6.resetForTypeCheck();
    var6.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var17 = null;
    com.google.javascript.rhino.jstype.JSType var18 = null;
    com.google.javascript.rhino.jstype.JSType[] var19 = new com.google.javascript.rhino.jstype.JSType[] { var18};
    com.google.javascript.rhino.jstype.FunctionType var20 = var6.createConstructorType(var17, var19);
    java.lang.Iterable var21 = var20.getCtorExtendedInterfaces();
    java.lang.Iterable var22 = var20.getAllImplementedInterfaces();
    java.lang.Iterable var23 = var20.getCtorExtendedInterfaces();
    com.google.javascript.rhino.ErrorReporter var25 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25, true);
    com.google.javascript.rhino.jstype.JSType var29 = null;
    boolean var30 = var27.declareType("hi!", var29);
    var27.clearTemplateTypeName();
    var27.setLastGeneration(false);
    var27.resetForTypeCheck();
    var27.resetForTypeCheck();
    var27.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var38 = null;
    com.google.javascript.rhino.jstype.JSType var39 = null;
    com.google.javascript.rhino.jstype.JSType[] var40 = new com.google.javascript.rhino.jstype.JSType[] { var39};
    com.google.javascript.rhino.jstype.FunctionType var41 = var27.createConstructorType(var38, var40);
    java.lang.Iterable var42 = var41.getCtorExtendedInterfaces();
    boolean var43 = var41.hasImplementedInterfaces();
    boolean var44 = var41.isNullable();
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.nullNode();
    boolean var46 = var20.defineDeclaredProperty("goog.exportSymbol", (com.google.javascript.rhino.jstype.JSType)var41, var45);
    boolean var47 = var45.isTypeOf();
    boolean var48 = var45.isDelProp();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.validateStatement(var45);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 125);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test27"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.clearTemplateTypeName();
    var2.setLastGeneration(false);
    var2.resetForTypeCheck();
    com.google.javascript.rhino.jstype.JSType var11 = null;
    var2.unregisterPropertyOnType("", var11);
    com.google.javascript.rhino.jstype.JSTypeNative[] var13 = com.google.javascript.rhino.jstype.JSTypeNative.values();
    com.google.javascript.rhino.jstype.JSType var14 = var2.createUnionType(var13);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.paramList();
    java.lang.Iterable var16 = var15.siblings();
    boolean var17 = var15.hasChildren();
    com.google.javascript.rhino.ErrorReporter var19 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var19, true);
    com.google.javascript.rhino.jstype.JSType var23 = null;
    boolean var24 = var21.declareType("hi!", var23);
    var21.clearTemplateTypeName();
    var21.setLastGeneration(false);
    var21.resetForTypeCheck();
    var21.resetForTypeCheck();
    var21.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var32 = null;
    com.google.javascript.rhino.jstype.JSType var33 = null;
    com.google.javascript.rhino.jstype.JSType[] var34 = new com.google.javascript.rhino.jstype.JSType[] { var33};
    com.google.javascript.rhino.jstype.FunctionType var35 = var21.createConstructorType(var32, var34);
    java.lang.Iterable var36 = var35.getCtorExtendedInterfaces();
    boolean var37 = var35.hasImplementedInterfaces();
    boolean var38 = var35.isNullable();
    com.google.javascript.rhino.jstype.ObjectType var39 = var35.getInstanceType();
    boolean var40 = var35.isInterface();
    var35.clearCachedValues();
    com.google.javascript.rhino.jstype.JSType var43 = var35.getPropertyType("");
    com.google.javascript.rhino.ErrorReporter var44 = null;
    com.google.javascript.rhino.ErrorReporter var45 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var45, true);
    com.google.javascript.rhino.jstype.JSType var49 = null;
    boolean var50 = var47.declareType("hi!", var49);
    var47.clearTemplateTypeName();
    var47.setLastGeneration(false);
    var47.resetForTypeCheck();
    var47.resetForTypeCheck();
    var47.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var58 = null;
    com.google.javascript.rhino.jstype.JSType var59 = null;
    com.google.javascript.rhino.jstype.JSType[] var60 = new com.google.javascript.rhino.jstype.JSType[] { var59};
    com.google.javascript.rhino.jstype.FunctionType var61 = var47.createConstructorType(var58, var60);
    java.lang.Iterable var62 = var61.getCtorExtendedInterfaces();
    java.lang.Iterable var63 = var61.getAllImplementedInterfaces();
    java.lang.Iterable var64 = var61.getCtorExtendedInterfaces();
    com.google.javascript.rhino.ErrorReporter var66 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var66, true);
    com.google.javascript.rhino.jstype.JSType var70 = null;
    boolean var71 = var68.declareType("hi!", var70);
    var68.clearTemplateTypeName();
    var68.setLastGeneration(false);
    var68.resetForTypeCheck();
    var68.resetForTypeCheck();
    var68.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var79 = null;
    com.google.javascript.rhino.jstype.JSType var80 = null;
    com.google.javascript.rhino.jstype.JSType[] var81 = new com.google.javascript.rhino.jstype.JSType[] { var80};
    com.google.javascript.rhino.jstype.FunctionType var82 = var68.createConstructorType(var79, var81);
    java.lang.Iterable var83 = var82.getCtorExtendedInterfaces();
    boolean var84 = var82.hasImplementedInterfaces();
    boolean var85 = var82.isNullable();
    com.google.javascript.rhino.Node var86 = com.google.javascript.rhino.IR.nullNode();
    boolean var87 = var61.defineDeclaredProperty("goog.exportSymbol", (com.google.javascript.rhino.jstype.JSType)var82, var86);
    com.google.javascript.rhino.jstype.JSType var88 = var43.resolve(var44, (com.google.javascript.rhino.jstype.StaticScope)var82);
    com.google.javascript.rhino.jstype.ObjectType.Property var90 = var82.getSlot("Node tree inequality:\nTree1:\nBITXOR\n    BITXOR hi!\n    LABEL_NAME hi!\n    PARAM_LIST\n    LABEL_NAME hi!\n\n\nTree2:\nFALSE [synthetic: 1]\n\n\nSubtree1: BITXOR\n    BITXOR hi!\n    LABEL_NAME hi!\n    PARAM_LIST\n    LABEL_NAME hi!\n\n\nSubtree2: FALSE [synthetic: 1]\n");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.JSType var91 = var2.createFromTypeNodes(var15, "goog.exportProperty", (com.google.javascript.rhino.jstype.StaticScope)var82);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
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
    assertTrue(var71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var90);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test28"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("goog.exportSymbol", 10, 10);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var6 = var5.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var7 = var5.getJsDocBuilderForNode();
    com.google.javascript.rhino.Node var8 = var3.clonePropsFrom(var5);
    int var9 = var5.getSourcePosition();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.var(var5);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test29"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var2 = var0.getDelegateRelationship(var1);
    java.lang.String var3 = var0.getExportSymbolFunction();
    java.util.Collection var4 = var0.getAssertionFunctions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "goog.exportSymbol"+ "'", var3.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test30"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    boolean var1 = var0.isNoCompile();
    boolean var2 = var0.isNoTypeCheck();
    boolean var3 = var0.isImplicitCast();
    boolean var4 = var0.isConsistentIdGenerator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test31() {}
//   public void test31() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test31"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     var0.clearNodeAnnotations();
//     java.util.List var2 = var0.getGraphvizEdges();
//     com.google.javascript.jscomp.CompilerOptions var3 = new com.google.javascript.jscomp.CompilerOptions();
//     var3.setLooseTypes(false);
//     var3.setGeneratePseudoNames(true);
//     var3.setReportPath("BLOCK\n");
//     java.util.Iterator var10 = var0.getNeighborNodesIterator((java.lang.Object)var3);
// 
//   }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test32"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setRewriteFunctionExpressions(false);
    var0.setInlineConstantVars(true);
    var0.setPropertyAffinity(true);
    var0.setOptimizeArgumentsArray(false);

  }

  public void test33() {}
//   public void test33() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test33"); }
// 
// 
//     com.google.javascript.jscomp.SourceExcerptProvider var0 = null;
//     com.google.javascript.jscomp.LightweightMessageFormatter var1 = new com.google.javascript.jscomp.LightweightMessageFormatter(var0);
// 
//   }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test34"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var2 = var1.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var3 = var1.getJsDocBuilderForNode();
    boolean var4 = var1.isOptionalArg();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var7 = var6.isOr();
    var1.addChildToBack(var6);
    int var9 = var1.getCharno();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var10 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.util.List var11 = var10.getGraphvizNodes();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.paramList(var11);
    com.google.javascript.rhino.Node var13 = var1.useSourceInfoFrom(var12);
    boolean var14 = var13.isHook();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test35"); }


    com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
    boolean var3 = var0.isExported("", true);
    boolean var5 = var0.isValidEnumKey("hi!");
    boolean var7 = var0.isConstant("LinkedGraph");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test36"); }


    com.google.javascript.jscomp.AstValidator var0 = new com.google.javascript.jscomp.AstValidator();
    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.string("goog.exportSymbol");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.process(var1, var3);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test37"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    java.util.List var1 = var0.getExtendedInterfaces();
    boolean var2 = var0.isDefine();
    java.util.Collection var3 = var0.getAuthors();
    var0.setLicense("hi!");
    com.google.javascript.rhino.Node var6 = var0.getAssociatedNode();
    boolean var7 = var0.hasFileOverview();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test38"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.clearTemplateTypeName();
    var2.setLastGeneration(false);
    var2.resetForTypeCheck();
    com.google.javascript.rhino.jstype.JSType var11 = null;
    var2.unregisterPropertyOnType("", var11);
    com.google.javascript.rhino.ErrorReporter var13 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13, true);
    com.google.javascript.rhino.jstype.JSType var17 = null;
    boolean var18 = var15.declareType("hi!", var17);
    var15.clearTemplateTypeName();
    var15.setLastGeneration(false);
    var15.resetForTypeCheck();
    var15.resetForTypeCheck();
    var15.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var26 = null;
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.rhino.jstype.JSType[] var28 = new com.google.javascript.rhino.jstype.JSType[] { var27};
    com.google.javascript.rhino.jstype.FunctionType var29 = var15.createConstructorType(var26, var28);
    java.lang.Iterable var30 = var29.getCtorExtendedInterfaces();
    com.google.javascript.rhino.ErrorReporter var32 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32, true);
    com.google.javascript.rhino.jstype.JSType var36 = null;
    boolean var37 = var34.declareType("hi!", var36);
    var34.clearTemplateTypeName();
    var34.setLastGeneration(false);
    var34.resetForTypeCheck();
    var34.resetForTypeCheck();
    var34.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var45 = null;
    com.google.javascript.rhino.jstype.JSType var46 = null;
    com.google.javascript.rhino.jstype.JSType[] var47 = new com.google.javascript.rhino.jstype.JSType[] { var46};
    com.google.javascript.rhino.jstype.FunctionType var48 = var34.createConstructorType(var45, var47);
    com.google.javascript.rhino.jstype.FunctionType var49 = var2.createFunctionType((com.google.javascript.rhino.jstype.JSType)var29, false, var47);
    com.google.javascript.rhino.JSDocInfo var51 = new com.google.javascript.rhino.JSDocInfo();
    boolean var52 = var51.isNoCompile();
    boolean var53 = var51.isExterns();
    boolean var54 = var51.hasReturnType();
    var29.setPropertyJSDocInfo("(goog.exportSymbol)", var51);
    boolean var56 = var51.hasThisType();
    var51.addSuppression("LinkedGraph");
    boolean var59 = var51.isConstant();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);

  }

  public void test39() {}
//   public void test39() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test39"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CodingConvention.DelegateRelationship var2 = var0.getDelegateRelationship(var1);
//     java.lang.String var3 = var0.getExportSymbolFunction();
//     boolean var6 = var0.isExported("hi!", true);
//     boolean var8 = var0.isSuperClassReference("LABEL_NAME hi!");
//     java.lang.String var9 = var0.getExportSymbolFunction();
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.labelName("hi!");
//     boolean var13 = var12.isOr();
//     boolean var14 = var12.isTry();
//     com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.paramList();
//     com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.labelName("hi!");
//     boolean var18 = var17.isOr();
//     com.google.javascript.rhino.Node var19 = new com.google.javascript.rhino.Node(10, var12, var15, var17);
//     boolean var20 = var19.isFunction();
//     boolean var21 = var0.isPrototypeAlias(var19);
//     java.lang.String var22 = var0.getExportPropertyFunction();
//     com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.Node.newString("goog.exportSymbol", 10, 10);
//     com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.labelName("hi!");
//     boolean var29 = var28.isOr();
//     com.google.javascript.rhino.Node.FileLevelJsDocBuilder var30 = var28.getJsDocBuilderForNode();
//     com.google.javascript.rhino.Node var31 = var26.clonePropsFrom(var28);
//     com.google.javascript.jscomp.CodingConvention.SubclassRelationship var32 = var0.getClassesDefinedByCall(var26);
// 
//   }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test40"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setLooseTypes(false);
    var0.setGeneratePseudoNames(true);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var5 = null;
    var0.setTweakProcessing(var5);
    var0.setTweakToBooleanLiteral("", true);
    com.google.javascript.jscomp.VariableRenamingPolicy var10 = null;
    var0.setVariableRenaming(var10);
    com.google.javascript.jscomp.CheckLevel var12 = null;
    var0.setCheckProvides(var12);
    var0.setReportPath("LinkedGraph");
    com.google.javascript.jscomp.CssRenamingMap var16 = null;
    var0.setCssRenamingMap(var16);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test41"); }


    com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
    java.io.Reader var3 = var2.getCodeReader();
    com.google.javascript.jscomp.JsAst var4 = new com.google.javascript.jscomp.JsAst(var2);
    var4.clearAst();
    var4.clearAst();
    com.google.javascript.rhino.InputId var7 = null;
    com.google.javascript.jscomp.CompilerInput var9 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var4, var7, true);
    com.google.javascript.jscomp.SourceFile var10 = var4.getSourceFile();
    var4.clearAst();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test42"); }


    com.google.javascript.jscomp.AstValidator var0 = new com.google.javascript.jscomp.AstValidator();
    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.block();
    int var2 = var1.getType();
    var0.validateStatement(var1);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var6 = var5.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var7 = var5.getJsDocBuilderForNode();
    boolean var8 = var5.isOptionalArg();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var11 = var10.isOr();
    var5.addChildToBack(var10);
    java.lang.Iterable var13 = var10.siblings();
    boolean var14 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.validateExpression(var10);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 125);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test43() {}
//   public void test43() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test43"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
//     com.google.javascript.rhino.jstype.JSType var4 = null;
//     boolean var5 = var2.declareType("hi!", var4);
//     var2.clearTemplateTypeName();
//     var2.setLastGeneration(false);
//     var2.incrementGeneration();
//     com.google.javascript.rhino.jstype.JSTypeNative var10 = null;
//     com.google.javascript.rhino.jstype.ObjectType var11 = var2.getNativeObjectType(var10);
// 
//   }

  public void test44() {}
//   public void test44() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test44"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.breakNode();
//     com.google.javascript.rhino.JSDocInfo var1 = var0.getJSDocInfo();
//     boolean var2 = var0.isBreak();
//     com.google.javascript.rhino.InputId var3 = com.google.javascript.jscomp.NodeUtil.getInputId(var0);
//     com.google.javascript.rhino.Node var4 = null;
//     var0.addChildToFront(var4);
// 
//   }

  public void test45() {}
//   public void test45() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test45"); }
// 
// 
//     com.google.javascript.jscomp.SourceExcerptProvider var0 = null;
//     com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var1 = null;
//     com.google.javascript.jscomp.LightweightMessageFormatter var2 = new com.google.javascript.jscomp.LightweightMessageFormatter(var0, var1);
// 
//   }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test46"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    var0.clearNodeAnnotations();
    java.util.List var2 = var0.getGraphvizEdges();
    java.lang.String var3 = var0.getName();
    java.lang.Iterable var4 = var0.getDirectedGraphNodes();
    java.util.List var5 = var0.getGraphvizNodes();
    com.google.javascript.rhino.ErrorReporter var6 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var6, true);
    com.google.javascript.rhino.jstype.JSType var10 = null;
    boolean var11 = var8.declareType("hi!", var10);
    var8.clearTemplateTypeName();
    var8.setLastGeneration(false);
    var8.resetForTypeCheck();
    var8.resetForTypeCheck();
    var8.setTemplateTypeName("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var19 = var0.getOutEdges((java.lang.Object)var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "LinkedGraph"+ "'", var3.equals("LinkedGraph"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test47"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.clearNamedTypes();
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8, true);
    com.google.javascript.rhino.jstype.JSType var12 = null;
    boolean var13 = var10.declareType("hi!", var12);
    var10.clearTemplateTypeName();
    var10.setLastGeneration(false);
    var10.resetForTypeCheck();
    com.google.javascript.rhino.jstype.JSType var19 = null;
    var10.unregisterPropertyOnType("", var19);
    com.google.javascript.rhino.ErrorReporter var21 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21, true);
    com.google.javascript.rhino.jstype.JSType var25 = null;
    boolean var26 = var23.declareType("hi!", var25);
    var23.clearTemplateTypeName();
    var23.setLastGeneration(false);
    var23.resetForTypeCheck();
    var23.resetForTypeCheck();
    var23.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var34 = null;
    com.google.javascript.rhino.jstype.JSType var35 = null;
    com.google.javascript.rhino.jstype.JSType[] var36 = new com.google.javascript.rhino.jstype.JSType[] { var35};
    com.google.javascript.rhino.jstype.FunctionType var37 = var23.createConstructorType(var34, var36);
    java.lang.Iterable var38 = var37.getCtorExtendedInterfaces();
    com.google.javascript.rhino.ErrorReporter var40 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var40, true);
    com.google.javascript.rhino.jstype.JSType var44 = null;
    boolean var45 = var42.declareType("hi!", var44);
    var42.clearTemplateTypeName();
    var42.setLastGeneration(false);
    var42.resetForTypeCheck();
    var42.resetForTypeCheck();
    var42.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var53 = null;
    com.google.javascript.rhino.jstype.JSType var54 = null;
    com.google.javascript.rhino.jstype.JSType[] var55 = new com.google.javascript.rhino.jstype.JSType[] { var54};
    com.google.javascript.rhino.jstype.FunctionType var56 = var42.createConstructorType(var53, var55);
    com.google.javascript.rhino.jstype.FunctionType var57 = var10.createFunctionType((com.google.javascript.rhino.jstype.JSType)var37, false, var55);
    var2.overwriteDeclaredType("hi!", (com.google.javascript.rhino.jstype.JSType)var37);
    boolean var59 = var37.isNullable();
    com.google.javascript.rhino.ErrorReporter var60 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var60, true);
    com.google.javascript.rhino.jstype.JSType var64 = null;
    boolean var65 = var62.declareType("hi!", var64);
    var62.clearTemplateTypeName();
    var62.setLastGeneration(false);
    var62.resetForTypeCheck();
    var62.resetForTypeCheck();
    var62.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var73 = null;
    com.google.javascript.rhino.jstype.JSType var74 = null;
    com.google.javascript.rhino.jstype.JSType[] var75 = new com.google.javascript.rhino.jstype.JSType[] { var74};
    com.google.javascript.rhino.jstype.FunctionType var76 = var62.createConstructorType(var73, var75);
    java.lang.Iterable var77 = var76.getImplementedInterfaces();
    com.google.javascript.rhino.Node var78 = var76.getRootNode();
    boolean var79 = var37.hasEqualCallType(var76);
    boolean var80 = var76.isOrdinaryFunction();
    boolean var81 = var76.isBooleanValueType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test48"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setLooseTypes(false);
    var0.setShadowVariables(true);
    com.google.javascript.jscomp.CheckLevel var5 = null;
    var0.setCheckGlobalNamesLevel(var5);
    com.google.javascript.jscomp.CompilerOptions.LanguageMode var7 = var0.getLanguageIn();
    var0.setNameReferenceGraphPath("goog.exportProperty");
    com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var10 = null;
    var0.setAnonymousFunctionNaming(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test49() {}
//   public void test49() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test49"); }
// 
// 
//     java.io.InputStream var2 = null;
//     com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromInputStream("BITXOR", "", var2);
// 
//   }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test50"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setLooseTypes(false);
    var0.setDeadAssignmentElimination(true);
    var0.enableRuntimeTypeCheck("hi!");
    com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var7 = null;
    var0.setAnonymousFunctionNaming(var7);

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test51"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.LightweightMessageFormatter var2 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
    com.google.javascript.jscomp.Scope var3 = var1.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var6 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var9 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var10 = var9.isExtern();
    boolean var11 = var9.isExtern();
    com.google.javascript.jscomp.CompilerOptions var12 = new com.google.javascript.jscomp.CompilerOptions();
    var12.setLooseTypes(false);
    com.google.javascript.jscomp.Result var15 = var1.compile(var6, var9, var12);
    java.io.PrintStream var16 = null;
    com.google.javascript.jscomp.Compiler var17 = new com.google.javascript.jscomp.Compiler(var16);
    com.google.javascript.jscomp.LightweightMessageFormatter var18 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var17);
    com.google.javascript.jscomp.Scope var19 = var17.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var22 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var25 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var26 = var25.isExtern();
    boolean var27 = var25.isExtern();
    com.google.javascript.jscomp.CompilerOptions var28 = new com.google.javascript.jscomp.CompilerOptions();
    var28.setLooseTypes(false);
    com.google.javascript.jscomp.Result var31 = var17.compile(var22, var25, var28);
    com.google.javascript.jscomp.JSSourceFile[] var32 = new com.google.javascript.jscomp.JSSourceFile[] { var22};
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var33 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.rhino.JSDocInfo var34 = new com.google.javascript.rhino.JSDocInfo();
    java.util.List var35 = var34.getExtendedInterfaces();
    com.google.javascript.jscomp.JSModule[] var36 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var35);
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var37 = var33.getDirectedGraphNode((java.lang.Object)var36);
    com.google.javascript.jscomp.CompilerOptions var38 = new com.google.javascript.jscomp.CompilerOptions();
    var38.setLooseTypes(false);
    var1.init(var32, var36, var38);
    com.google.javascript.jscomp.Scope var42 = var1.getTopScope();
    com.google.javascript.rhino.Node var43 = var1.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test52"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.LightweightMessageFormatter var2 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
    com.google.javascript.jscomp.Scope var3 = var1.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var6 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var9 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var10 = var9.isExtern();
    boolean var11 = var9.isExtern();
    com.google.javascript.jscomp.CompilerOptions var12 = new com.google.javascript.jscomp.CompilerOptions();
    var12.setLooseTypes(false);
    com.google.javascript.jscomp.Result var15 = var1.compile(var6, var9, var12);
    java.io.PrintStream var16 = null;
    com.google.javascript.jscomp.Compiler var17 = new com.google.javascript.jscomp.Compiler(var16);
    com.google.javascript.jscomp.LightweightMessageFormatter var18 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var17);
    com.google.javascript.jscomp.Scope var19 = var17.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var22 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var25 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var26 = var25.isExtern();
    boolean var27 = var25.isExtern();
    com.google.javascript.jscomp.CompilerOptions var28 = new com.google.javascript.jscomp.CompilerOptions();
    var28.setLooseTypes(false);
    com.google.javascript.jscomp.Result var31 = var17.compile(var22, var25, var28);
    com.google.javascript.jscomp.JSSourceFile[] var32 = new com.google.javascript.jscomp.JSSourceFile[] { var22};
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var33 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.rhino.JSDocInfo var34 = new com.google.javascript.rhino.JSDocInfo();
    java.util.List var35 = var34.getExtendedInterfaces();
    com.google.javascript.jscomp.JSModule[] var36 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var35);
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var37 = var33.getDirectedGraphNode((java.lang.Object)var36);
    com.google.javascript.jscomp.CompilerOptions var38 = new com.google.javascript.jscomp.CompilerOptions();
    var38.setLooseTypes(false);
    var1.init(var32, var36, var38);
    com.google.javascript.jscomp.JSModuleGraph var42 = new com.google.javascript.jscomp.JSModuleGraph(var36);
    com.google.javascript.rhino.JSDocInfo var43 = new com.google.javascript.rhino.JSDocInfo();
    java.util.List var44 = var43.getExtendedInterfaces();
    com.google.javascript.jscomp.JSModule[] var45 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var44);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.JSModule var46 = var42.getDeepestCommonDependencyInclusive((java.util.Collection)var44);
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test53"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.incrementGeneration();
    var2.identifyNonNullableName("goog.abstractMethod");
    com.google.javascript.rhino.ErrorReporter var9 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var9, true);
    com.google.javascript.rhino.jstype.JSType var13 = null;
    boolean var14 = var11.declareType("hi!", var13);
    var11.clearTemplateTypeName();
    var11.setLastGeneration(false);
    var11.resetForTypeCheck();
    com.google.javascript.rhino.jstype.JSType var20 = null;
    var11.unregisterPropertyOnType("", var20);
    com.google.javascript.rhino.ErrorReporter var22 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var22, true);
    com.google.javascript.rhino.jstype.JSType var26 = null;
    boolean var27 = var24.declareType("hi!", var26);
    var24.clearTemplateTypeName();
    var24.setLastGeneration(false);
    var24.resetForTypeCheck();
    var24.resetForTypeCheck();
    var24.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var35 = null;
    com.google.javascript.rhino.jstype.JSType var36 = null;
    com.google.javascript.rhino.jstype.JSType[] var37 = new com.google.javascript.rhino.jstype.JSType[] { var36};
    com.google.javascript.rhino.jstype.FunctionType var38 = var24.createConstructorType(var35, var37);
    java.lang.Iterable var39 = var38.getCtorExtendedInterfaces();
    com.google.javascript.rhino.ErrorReporter var41 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var41, true);
    com.google.javascript.rhino.jstype.JSType var45 = null;
    boolean var46 = var43.declareType("hi!", var45);
    var43.clearTemplateTypeName();
    var43.setLastGeneration(false);
    var43.resetForTypeCheck();
    var43.resetForTypeCheck();
    var43.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var54 = null;
    com.google.javascript.rhino.jstype.JSType var55 = null;
    com.google.javascript.rhino.jstype.JSType[] var56 = new com.google.javascript.rhino.jstype.JSType[] { var55};
    com.google.javascript.rhino.jstype.FunctionType var57 = var43.createConstructorType(var54, var56);
    com.google.javascript.rhino.jstype.FunctionType var58 = var11.createFunctionType((com.google.javascript.rhino.jstype.JSType)var38, false, var56);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var59 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    var59.clearNodeAnnotations();
    java.util.List var61 = var59.getGraphvizEdges();
    java.lang.String var62 = var59.getName();
    var59.pushEdgeAnnotations();
    java.util.List var64 = var59.getGraphvizEdges();
    com.google.javascript.rhino.jstype.FunctionType var65 = var2.createFunctionType((com.google.javascript.rhino.jstype.JSType)var38, var64);
    com.google.javascript.rhino.jstype.JSType var67 = var38.findPropertyType("LABEL_NAME hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "LinkedGraph"+ "'", var62.equals("LinkedGraph"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test54"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setLooseTypes(false);
    var0.setShadowVariables(true);
    com.google.javascript.jscomp.CheckLevel var5 = null;
    var0.setCheckGlobalNamesLevel(var5);
    com.google.javascript.jscomp.CompilerOptions.LanguageMode var7 = var0.getLanguageIn();
    var0.setNameReferenceGraphPath("goog.exportProperty");
    com.google.javascript.rhino.ErrorReporter var10 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var10, true);
    com.google.javascript.rhino.jstype.JSType var14 = null;
    boolean var15 = var12.declareType("hi!", var14);
    var12.clearTemplateTypeName();
    var12.setLastGeneration(false);
    var12.resetForTypeCheck();
    var12.resetForTypeCheck();
    var12.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var23 = null;
    com.google.javascript.rhino.jstype.JSType var24 = null;
    com.google.javascript.rhino.jstype.JSType[] var25 = new com.google.javascript.rhino.jstype.JSType[] { var24};
    com.google.javascript.rhino.jstype.FunctionType var26 = var12.createConstructorType(var23, var25);
    java.lang.Iterable var27 = var26.getCtorExtendedInterfaces();
    boolean var28 = var26.hasImplementedInterfaces();
    com.google.javascript.rhino.ErrorReporter var29 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29, true);
    com.google.javascript.rhino.jstype.JSType var33 = null;
    boolean var34 = var31.declareType("hi!", var33);
    var31.clearTemplateTypeName();
    var31.setLastGeneration(false);
    var31.resetForTypeCheck();
    var31.resetForTypeCheck();
    var31.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var42 = null;
    com.google.javascript.rhino.jstype.JSType var43 = null;
    com.google.javascript.rhino.jstype.JSType[] var44 = new com.google.javascript.rhino.jstype.JSType[] { var43};
    com.google.javascript.rhino.jstype.FunctionType var45 = var31.createConstructorType(var42, var44);
    boolean var46 = var26.isEquivalentTo(var42);
    boolean var47 = var26.isReturnTypeInferred();
    java.util.Set var48 = var26.getOwnPropertyNames();
    var0.setAliasableStrings(var48);
    var0.setPropertyAffinity(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test55"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("Node tree inequality:\nTree1:\nNUMBER 1.0\n\n\nTree2:\nBITXOR\n    BITXOR hi!\n    LABEL_NAME hi!\n    PARAM_LIST\n    LABEL_NAME hi!\n\n\nSubtree1: NUMBER 1.0\n\n\nSubtree2: BITXOR\n    BITXOR hi!\n    LABEL_NAME hi!\n    PARAM_LIST\n    LABEL_NAME hi!\n");
    boolean var2 = var1.isVarArgs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test56"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var2 = var0.getDelegateRelationship(var1);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var6 = var5.isOr();
    boolean var7 = var5.isTry();
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.paramList();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var11 = var10.isOr();
    com.google.javascript.rhino.Node var12 = new com.google.javascript.rhino.Node(10, var5, var8, var10);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.pos(var12);
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var14 = var0.getDelegateRelationship(var12);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var17 = var16.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var18 = var16.getJsDocBuilderForNode();
    boolean var19 = var16.isOptionalArg();
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var22 = var21.isOr();
    var16.addChildToBack(var21);
    int var24 = var16.getCharno();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var25 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.util.List var26 = var25.getGraphvizNodes();
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.paramList(var26);
    com.google.javascript.rhino.Node var28 = var16.useSourceInfoFrom(var27);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var32 = var31.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var33 = var31.getJsDocBuilderForNode();
    boolean var34 = var31.isOptionalArg();
    com.google.javascript.rhino.Node var35 = new com.google.javascript.rhino.Node(1, var31);
    java.lang.String var36 = var0.extractClassNameIfProvide(var28, var31);
    boolean var37 = var31.isAnd();
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var41 = var40.isOr();
    boolean var42 = var40.isTry();
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.paramList();
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var46 = var45.isOr();
    com.google.javascript.rhino.Node var47 = new com.google.javascript.rhino.Node(10, var40, var43, var45);
    com.google.javascript.rhino.Node var48 = var40.removeChildren();
    com.google.javascript.rhino.Node var49 = var40.cloneNode();
    com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.Node.newString("goog.exportSymbol", 10, 10);
    com.google.javascript.rhino.Node var55 = com.google.javascript.rhino.IR.number(1.0d);
    com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var58 = var57.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var59 = var57.getJsDocBuilderForNode();
    com.google.javascript.rhino.Node var60 = var55.useSourceInfoIfMissingFrom(var57);
    com.google.javascript.rhino.Node var61 = var53.useSourceInfoFrom(var57);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var62 = com.google.javascript.rhino.IR.function(var31, var49, var61);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test57"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var2 = var1.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var3 = var1.getJsDocBuilderForNode();
    boolean var4 = var1.isOptionalArg();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var7 = var6.isOr();
    var1.addChildToBack(var6);
    int var9 = var1.getCharno();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var10 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.util.List var11 = var10.getGraphvizNodes();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.paramList(var11);
    com.google.javascript.rhino.Node var13 = var1.useSourceInfoFrom(var12);
    int var14 = var1.getChildCount();
    com.google.javascript.jscomp.ClosureCodingConvention var15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.jstype.FunctionType var16 = null;
    com.google.javascript.rhino.jstype.FunctionType var17 = null;
    com.google.javascript.jscomp.CodingConvention.SubclassType var18 = null;
    var15.applySubclassRelationship(var16, var17, var18);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.paramList();
    java.lang.Iterable var21 = var20.siblings();
    boolean var22 = var20.isFromExterns();
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var26 = var25.isOr();
    boolean var27 = var25.isTry();
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.paramList();
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var31 = var30.isOr();
    com.google.javascript.rhino.Node var32 = new com.google.javascript.rhino.Node(10, var25, var28, var30);
    boolean var33 = var32.isDebugger();
    com.google.javascript.rhino.Node var34 = var20.copyInformationFromForTree(var32);
    boolean var35 = var15.isPrototypeAlias(var32);
    boolean var36 = var32.isIf();
    java.lang.String var37 = com.google.javascript.jscomp.NodeUtil.getSourceName(var32);
    var1.addChildrenToFront(var32);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var32.setDouble(0.0d);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
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
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);

  }

  public void test58() {}
//   public void test58() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test58"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
//     com.google.javascript.rhino.jstype.JSType var4 = null;
//     boolean var5 = var2.declareType("hi!", var4);
//     var2.clearTemplateTypeName();
//     var2.setLastGeneration(false);
//     var2.resetForTypeCheck();
//     var2.resetForTypeCheck();
//     var2.setLastGeneration(false);
//     com.google.javascript.rhino.jstype.FunctionParamBuilder var13 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var2);
//     com.google.javascript.rhino.Node var14 = var13.build();
//     com.google.javascript.rhino.ErrorReporter var15 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var15, true);
//     com.google.javascript.rhino.jstype.JSType var19 = null;
//     boolean var20 = var17.declareType("hi!", var19);
//     var17.clearTemplateTypeName();
//     var17.setLastGeneration(false);
//     var17.resetForTypeCheck();
//     var17.resetForTypeCheck();
//     var17.setLastGeneration(false);
//     com.google.javascript.rhino.ErrorReporter var28 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var28, true);
//     com.google.javascript.rhino.jstype.JSType var32 = null;
//     boolean var33 = var30.declareType("hi!", var32);
//     var30.clearTemplateTypeName();
//     var30.setLastGeneration(false);
//     var30.resetForTypeCheck();
//     com.google.javascript.rhino.jstype.JSType var39 = null;
//     var30.unregisterPropertyOnType("", var39);
//     com.google.javascript.rhino.ErrorReporter var41 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var41, true);
//     com.google.javascript.rhino.jstype.JSType var45 = null;
//     boolean var46 = var43.declareType("hi!", var45);
//     var43.clearTemplateTypeName();
//     var43.setLastGeneration(false);
//     var43.resetForTypeCheck();
//     var43.resetForTypeCheck();
//     var43.setLastGeneration(false);
//     com.google.javascript.rhino.jstype.JSType var54 = null;
//     com.google.javascript.rhino.jstype.JSType var55 = null;
//     com.google.javascript.rhino.jstype.JSType[] var56 = new com.google.javascript.rhino.jstype.JSType[] { var55};
//     com.google.javascript.rhino.jstype.FunctionType var57 = var43.createConstructorType(var54, var56);
//     java.lang.Iterable var58 = var57.getCtorExtendedInterfaces();
//     com.google.javascript.rhino.ErrorReporter var60 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var60, true);
//     com.google.javascript.rhino.jstype.JSType var64 = null;
//     boolean var65 = var62.declareType("hi!", var64);
//     var62.clearTemplateTypeName();
//     var62.setLastGeneration(false);
//     var62.resetForTypeCheck();
//     var62.resetForTypeCheck();
//     var62.setLastGeneration(false);
//     com.google.javascript.rhino.jstype.JSType var73 = null;
//     com.google.javascript.rhino.jstype.JSType var74 = null;
//     com.google.javascript.rhino.jstype.JSType[] var75 = new com.google.javascript.rhino.jstype.JSType[] { var74};
//     com.google.javascript.rhino.jstype.FunctionType var76 = var62.createConstructorType(var73, var75);
//     com.google.javascript.rhino.jstype.FunctionType var77 = var30.createFunctionType((com.google.javascript.rhino.jstype.JSType)var57, false, var75);
//     com.google.javascript.rhino.Node var78 = var17.createParameters(var75);
//     java.lang.String var79 = com.google.javascript.jscomp.NodeUtil.getSourceName(var78);
//     com.google.javascript.rhino.Node var80 = var13.newParameterFromNode(var78);
//     com.google.javascript.rhino.jstype.JSType var81 = null;
//     boolean var82 = var13.addVarArgs(var81);
// 
//   }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test59"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.clearTemplateTypeName();
    var2.setLastGeneration(false);
    var2.resetForTypeCheck();
    var2.resetForTypeCheck();
    var2.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var13 = null;
    com.google.javascript.rhino.jstype.JSType var14 = null;
    com.google.javascript.rhino.jstype.JSType[] var15 = new com.google.javascript.rhino.jstype.JSType[] { var14};
    com.google.javascript.rhino.jstype.FunctionType var16 = var2.createConstructorType(var13, var15);
    java.lang.Iterable var17 = var16.getCtorExtendedInterfaces();
    boolean var18 = var16.hasImplementedInterfaces();
    boolean var19 = var16.isVoidType();
    int var20 = var16.getMaxArguments();
    boolean var21 = var16.hasInstanceType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test60() {}
//   public void test60() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test60"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
//     boolean var2 = var1.isOr();
//     com.google.javascript.rhino.Node.FileLevelJsDocBuilder var3 = var1.getJsDocBuilderForNode();
//     boolean var4 = var1.isOptionalArg();
//     java.lang.String var5 = var1.toString();
//     boolean var6 = var1.isSetterDef();
//     java.lang.Appendable var7 = null;
//     var1.appendStringTree(var7);
// 
//   }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test61"); }


    com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
    java.io.Reader var3 = var2.getCodeReader();
    com.google.javascript.jscomp.JsAst var4 = new com.google.javascript.jscomp.JsAst(var2);
    var4.clearAst();
    com.google.javascript.rhino.InputId var6 = null;
    com.google.javascript.jscomp.CompilerInput var8 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var4, var6, false);
    java.io.PrintStream var9 = null;
    com.google.javascript.jscomp.Compiler var10 = new com.google.javascript.jscomp.Compiler(var9);
    com.google.javascript.jscomp.LightweightMessageFormatter var11 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var10);
    var10.disableThreads();
    com.google.javascript.jscomp.CompilerOptions var13 = new com.google.javascript.jscomp.CompilerOptions();
    var13.setLooseTypes(false);
    var13.setShadowVariables(true);
    var10.initOptions(var13);
    com.google.javascript.rhino.Node var19 = var4.getAstRoot((com.google.javascript.jscomp.AbstractCompiler)var10);
    com.google.javascript.jscomp.ClosureCodingConvention var20 = new com.google.javascript.jscomp.ClosureCodingConvention();
    java.lang.String var21 = var20.getExportPropertyFunction();
    java.lang.String var22 = var20.getExportPropertyFunction();
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.Node.newString(0, "", 0, 100);
    int var28 = var27.getLineno();
    com.google.javascript.jscomp.ClosureCodingConvention var29 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var30 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var31 = var29.getDelegateRelationship(var30);
    java.lang.String var32 = var29.getExportSymbolFunction();
    boolean var35 = var29.isExported("hi!", true);
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var38 = var37.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var39 = var37.getJsDocBuilderForNode();
    boolean var40 = var37.isOptionalArg();
    java.lang.String var41 = var37.toString();
    var37.setString("");
    boolean var44 = var37.isDo();
    boolean var45 = var37.hasChildren();
    com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.IR.paramList();
    java.lang.String var47 = var29.extractClassNameIfRequire(var37, var46);
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var50 = var49.isOr();
    boolean var51 = var49.isTry();
    boolean var52 = var29.isVarArgsParameter(var49);
    var27.addChildToBack(var49);
    com.google.javascript.rhino.Node var54 = var27.removeFirstChild();
    com.google.javascript.jscomp.GoogleCodingConvention var55 = new com.google.javascript.jscomp.GoogleCodingConvention();
    boolean var58 = var55.isExported("", true);
    com.google.javascript.rhino.Node var62 = com.google.javascript.rhino.Node.newString("goog.exportSymbol", 10, 10);
    com.google.javascript.rhino.Node var64 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var65 = var64.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var66 = var64.getJsDocBuilderForNode();
    com.google.javascript.rhino.Node var67 = var62.clonePropsFrom(var64);
    boolean var68 = var55.isOptionalParameter(var62);
    java.lang.String var69 = var20.extractClassNameIfProvide(var54, var62);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var70 = com.google.javascript.rhino.IR.var(var19, var62);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "goog.exportProperty"+ "'", var21.equals("goog.exportProperty"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "goog.exportProperty"+ "'", var22.equals("goog.exportProperty"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "goog.exportSymbol"+ "'", var32.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "LABEL_NAME hi!"+ "'", var41.equals("LABEL_NAME hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test62"); }


    com.google.javascript.jscomp.CustomPassExecutionTime[] var0 = com.google.javascript.jscomp.CustomPassExecutionTime.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test63"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.clearNamedTypes();
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8, true);
    com.google.javascript.rhino.jstype.JSType var12 = null;
    boolean var13 = var10.declareType("hi!", var12);
    var10.clearTemplateTypeName();
    var10.setLastGeneration(false);
    var10.resetForTypeCheck();
    com.google.javascript.rhino.jstype.JSType var19 = null;
    var10.unregisterPropertyOnType("", var19);
    com.google.javascript.rhino.ErrorReporter var21 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21, true);
    com.google.javascript.rhino.jstype.JSType var25 = null;
    boolean var26 = var23.declareType("hi!", var25);
    var23.clearTemplateTypeName();
    var23.setLastGeneration(false);
    var23.resetForTypeCheck();
    var23.resetForTypeCheck();
    var23.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var34 = null;
    com.google.javascript.rhino.jstype.JSType var35 = null;
    com.google.javascript.rhino.jstype.JSType[] var36 = new com.google.javascript.rhino.jstype.JSType[] { var35};
    com.google.javascript.rhino.jstype.FunctionType var37 = var23.createConstructorType(var34, var36);
    java.lang.Iterable var38 = var37.getCtorExtendedInterfaces();
    com.google.javascript.rhino.ErrorReporter var40 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var40, true);
    com.google.javascript.rhino.jstype.JSType var44 = null;
    boolean var45 = var42.declareType("hi!", var44);
    var42.clearTemplateTypeName();
    var42.setLastGeneration(false);
    var42.resetForTypeCheck();
    var42.resetForTypeCheck();
    var42.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var53 = null;
    com.google.javascript.rhino.jstype.JSType var54 = null;
    com.google.javascript.rhino.jstype.JSType[] var55 = new com.google.javascript.rhino.jstype.JSType[] { var54};
    com.google.javascript.rhino.jstype.FunctionType var56 = var42.createConstructorType(var53, var55);
    com.google.javascript.rhino.jstype.FunctionType var57 = var10.createFunctionType((com.google.javascript.rhino.jstype.JSType)var37, false, var55);
    var2.overwriteDeclaredType("hi!", (com.google.javascript.rhino.jstype.JSType)var37);
    com.google.javascript.rhino.ErrorReporter var59 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var59, true);
    com.google.javascript.rhino.jstype.JSType var63 = null;
    boolean var64 = var61.declareType("hi!", var63);
    var61.clearTemplateTypeName();
    var61.setLastGeneration(false);
    var61.resetForTypeCheck();
    var61.resetForTypeCheck();
    var61.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var72 = null;
    com.google.javascript.rhino.jstype.JSType var73 = null;
    com.google.javascript.rhino.jstype.JSType[] var74 = new com.google.javascript.rhino.jstype.JSType[] { var73};
    com.google.javascript.rhino.jstype.FunctionType var75 = var61.createConstructorType(var72, var74);
    com.google.javascript.rhino.ErrorReporter var76 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var76, true);
    com.google.javascript.rhino.jstype.JSType var80 = null;
    boolean var81 = var78.declareType("hi!", var80);
    var78.clearTemplateTypeName();
    var78.setLastGeneration(false);
    var78.resetForTypeCheck();
    var78.resetForTypeCheck();
    var78.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var89 = null;
    com.google.javascript.rhino.jstype.JSType var90 = null;
    com.google.javascript.rhino.jstype.JSType[] var91 = new com.google.javascript.rhino.jstype.JSType[] { var90};
    com.google.javascript.rhino.jstype.FunctionType var92 = var78.createConstructorType(var89, var91);
    java.lang.Iterable var93 = var92.getCtorExtendedInterfaces();
    com.google.javascript.rhino.jstype.JSType var94 = var92.getIndexType();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var95 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.util.List var96 = var95.getGraphvizNodes();
    com.google.javascript.rhino.Node var97 = com.google.javascript.rhino.IR.paramList(var96);
    com.google.javascript.rhino.jstype.JSType var98 = var2.createFunctionTypeWithVarArgs((com.google.javascript.rhino.jstype.ObjectType)var75, (com.google.javascript.rhino.jstype.JSType)var92, var96);
    boolean var99 = var75.isNominalType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var99 == false);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test64"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var2 = var1.isOr();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var6 = var5.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var7 = var5.getJsDocBuilderForNode();
    boolean var8 = var5.isOptionalArg();
    com.google.javascript.rhino.Node var9 = new com.google.javascript.rhino.Node(1, var5);
    boolean var10 = var9.isNumber();
    com.google.javascript.rhino.InputId var11 = null;
    var9.setInputId(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.tryCatch(var1, var9);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test65"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    var0.pushEdgeAnnotations();
    var0.clearNodeAnnotations();
    com.google.javascript.jscomp.JSSourceFile var5 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var6 = var5.isExtern();
    com.google.javascript.jscomp.GoogleCodingConvention var7 = new com.google.javascript.jscomp.GoogleCodingConvention();
    boolean var10 = var7.isExported("", true);
    boolean var12 = var7.isValidEnumKey("hi!");
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var16 = var15.isOr();
    boolean var17 = var15.isTry();
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.paramList();
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var21 = var20.isOr();
    com.google.javascript.rhino.Node var22 = new com.google.javascript.rhino.Node(10, var15, var18, var20);
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.pos(var22);
    com.google.javascript.jscomp.SourceFile var26 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
    java.io.Reader var27 = var26.getCodeReader();
    var23.setStaticSourceFile((com.google.javascript.rhino.jstype.StaticSourceFile)var26);
    int var29 = var23.getChildCount();
    boolean var30 = var7.isPrototypeAlias(var23);
    com.google.javascript.jscomp.SourceFile var33 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
    java.io.Reader var34 = var33.getCodeReader();
    com.google.javascript.jscomp.JsAst var35 = new com.google.javascript.jscomp.JsAst(var33);
    var35.clearAst();
    var35.clearAst();
    com.google.javascript.rhino.InputId var38 = null;
    com.google.javascript.jscomp.CompilerInput var40 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var35, var38, true);
    com.google.javascript.jscomp.SourceFile var41 = var35.getSourceFile();
    com.google.javascript.rhino.InputId var42 = var35.getInputId();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var43 = var0.isConnected((java.lang.Object)var6, (java.lang.Object)var7, (java.lang.Object)var35);
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test66"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.clearTemplateTypeName();
    var2.setLastGeneration(false);
    var2.resetForTypeCheck();
    var2.resetForTypeCheck();
    var2.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var13 = null;
    com.google.javascript.rhino.jstype.JSType var14 = null;
    com.google.javascript.rhino.jstype.JSType[] var15 = new com.google.javascript.rhino.jstype.JSType[] { var14};
    com.google.javascript.rhino.jstype.FunctionType var16 = var2.createConstructorType(var13, var15);
    java.lang.Iterable var17 = var16.getCtorExtendedInterfaces();
    com.google.javascript.rhino.jstype.JSType var18 = var16.getIndexType();
    com.google.javascript.rhino.jstype.FunctionType var19 = var16.getOwnerFunction();
    com.google.javascript.rhino.JSDocInfo var20 = new com.google.javascript.rhino.JSDocInfo();
    boolean var21 = var20.isNoCompile();
    boolean var22 = var20.isExterns();
    boolean var23 = var20.hasReturnType();
    boolean var25 = var20.hasDescriptionForParameter("hi!");
    java.util.List var26 = var20.getThrownTypes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var16.setExtendedInterfaces(var26);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test67"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var2 = var1.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var3 = var1.getJsDocBuilderForNode();
    boolean var4 = var1.isOptionalArg();
    int var5 = var1.getCharno();
    com.google.javascript.rhino.jstype.StaticSourceFile var6 = var1.getStaticSourceFile();
    boolean var7 = var1.isVoid();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test68"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.incrementGeneration();
    com.google.javascript.rhino.jstype.JSTypeNative[] var7 = com.google.javascript.rhino.jstype.JSTypeNative.values();
    com.google.javascript.rhino.jstype.JSType var8 = var2.createUnionType(var7);
    com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode var9 = null;
    var2.setResolveMode(var9);
    com.google.javascript.rhino.ErrorReporter var11 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11, true);
    com.google.javascript.rhino.jstype.JSType var15 = null;
    boolean var16 = var13.declareType("hi!", var15);
    var13.clearTemplateTypeName();
    var13.setLastGeneration(false);
    var13.resetForTypeCheck();
    var13.resetForTypeCheck();
    var13.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var24 = null;
    com.google.javascript.rhino.jstype.JSType var25 = null;
    com.google.javascript.rhino.jstype.JSType[] var26 = new com.google.javascript.rhino.jstype.JSType[] { var25};
    com.google.javascript.rhino.jstype.FunctionType var27 = var13.createConstructorType(var24, var26);
    java.lang.Iterable var28 = var27.getCtorExtendedInterfaces();
    java.lang.Iterable var29 = var27.getAllImplementedInterfaces();
    java.lang.Iterable var30 = var27.getCtorExtendedInterfaces();
    com.google.javascript.rhino.ErrorReporter var32 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32, true);
    com.google.javascript.rhino.jstype.JSType var36 = null;
    boolean var37 = var34.declareType("hi!", var36);
    var34.clearTemplateTypeName();
    var34.setLastGeneration(false);
    var34.resetForTypeCheck();
    var34.resetForTypeCheck();
    var34.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var45 = null;
    com.google.javascript.rhino.jstype.JSType var46 = null;
    com.google.javascript.rhino.jstype.JSType[] var47 = new com.google.javascript.rhino.jstype.JSType[] { var46};
    com.google.javascript.rhino.jstype.FunctionType var48 = var34.createConstructorType(var45, var47);
    java.lang.Iterable var49 = var48.getCtorExtendedInterfaces();
    boolean var50 = var48.hasImplementedInterfaces();
    boolean var51 = var48.isNullable();
    com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.IR.nullNode();
    boolean var53 = var27.defineDeclaredProperty("goog.exportSymbol", (com.google.javascript.rhino.jstype.JSType)var48, var52);
    java.lang.Iterable var54 = var27.getAllImplementedInterfaces();
    com.google.javascript.jscomp.JSModule var56 = new com.google.javascript.jscomp.JSModule("(goog.exportSymbol)");
    java.util.List var57 = var56.getInputs();
    com.google.javascript.rhino.jstype.FunctionType var58 = var2.createFunctionTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType)var27, var57);
    boolean var59 = var27.isObject();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
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
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test69"); }


    long var1 = com.google.javascript.rhino.ScriptRuntime.testUint32String("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test70() {}
//   public void test70() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test70"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
//     com.google.javascript.rhino.jstype.JSType var4 = null;
//     boolean var5 = var2.declareType("hi!", var4);
//     var2.clearNamedTypes();
//     com.google.javascript.rhino.ErrorReporter var8 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8, true);
//     com.google.javascript.rhino.jstype.JSType var12 = null;
//     boolean var13 = var10.declareType("hi!", var12);
//     var10.clearTemplateTypeName();
//     var10.setLastGeneration(false);
//     var10.resetForTypeCheck();
//     com.google.javascript.rhino.jstype.JSType var19 = null;
//     var10.unregisterPropertyOnType("", var19);
//     com.google.javascript.rhino.ErrorReporter var21 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21, true);
//     com.google.javascript.rhino.jstype.JSType var25 = null;
//     boolean var26 = var23.declareType("hi!", var25);
//     var23.clearTemplateTypeName();
//     var23.setLastGeneration(false);
//     var23.resetForTypeCheck();
//     var23.resetForTypeCheck();
//     var23.setLastGeneration(false);
//     com.google.javascript.rhino.jstype.JSType var34 = null;
//     com.google.javascript.rhino.jstype.JSType var35 = null;
//     com.google.javascript.rhino.jstype.JSType[] var36 = new com.google.javascript.rhino.jstype.JSType[] { var35};
//     com.google.javascript.rhino.jstype.FunctionType var37 = var23.createConstructorType(var34, var36);
//     java.lang.Iterable var38 = var37.getCtorExtendedInterfaces();
//     com.google.javascript.rhino.ErrorReporter var40 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var40, true);
//     com.google.javascript.rhino.jstype.JSType var44 = null;
//     boolean var45 = var42.declareType("hi!", var44);
//     var42.clearTemplateTypeName();
//     var42.setLastGeneration(false);
//     var42.resetForTypeCheck();
//     var42.resetForTypeCheck();
//     var42.setLastGeneration(false);
//     com.google.javascript.rhino.jstype.JSType var53 = null;
//     com.google.javascript.rhino.jstype.JSType var54 = null;
//     com.google.javascript.rhino.jstype.JSType[] var55 = new com.google.javascript.rhino.jstype.JSType[] { var54};
//     com.google.javascript.rhino.jstype.FunctionType var56 = var42.createConstructorType(var53, var55);
//     com.google.javascript.rhino.jstype.FunctionType var57 = var10.createFunctionType((com.google.javascript.rhino.jstype.JSType)var37, false, var55);
//     var2.overwriteDeclaredType("hi!", (com.google.javascript.rhino.jstype.JSType)var37);
//     int var59 = var37.getMinArguments();
//     com.google.javascript.rhino.ErrorReporter var60 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var60, true);
//     com.google.javascript.rhino.jstype.JSType var64 = null;
//     boolean var65 = var62.declareType("hi!", var64);
//     var62.clearTemplateTypeName();
//     var62.setLastGeneration(false);
//     var62.resetForTypeCheck();
//     var62.resetForTypeCheck();
//     var62.setLastGeneration(false);
//     com.google.javascript.rhino.jstype.JSType var73 = null;
//     com.google.javascript.rhino.jstype.JSType var74 = null;
//     com.google.javascript.rhino.jstype.JSType[] var75 = new com.google.javascript.rhino.jstype.JSType[] { var74};
//     com.google.javascript.rhino.jstype.FunctionType var76 = var62.createConstructorType(var73, var75);
//     java.lang.Iterable var77 = var76.getImplementedInterfaces();
//     com.google.javascript.rhino.jstype.JSType.TypePair var78 = var37.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType)var76);
//     boolean var80 = var37.hasOwnProperty("LABEL_NAME hi!");
//     com.google.javascript.rhino.jstype.JSType var81 = var37.autoboxesTo();
//     boolean var82 = var37.isNoResolvedType();
//     java.lang.String var83 = var37.toString();
// 
//   }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test71"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    com.google.javascript.rhino.JSTypeExpression var1 = var0.getEnumParameterType();
    com.google.javascript.rhino.JSTypeExpression var2 = var0.getEnumParameterType();
    boolean var3 = var0.hasTypedefType();
    java.lang.String var4 = var0.getFileOverview();
    boolean var6 = var0.hasParameterType("goog.exportSymbol");
    boolean var7 = var0.isDefine();
    boolean var8 = var0.isNoSideEffects();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test72"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.clearTemplateTypeName();
    var2.setLastGeneration(false);
    var2.incrementGeneration();
    var2.setTemplateTypeName("LinkedGraph");
    java.lang.Iterable var13 = var2.getEachReferenceTypeWithProperty("LABEL_NAME ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test73"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.LightweightMessageFormatter var2 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
    com.google.javascript.jscomp.Scope var3 = var1.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var6 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var9 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var10 = var9.isExtern();
    boolean var11 = var9.isExtern();
    com.google.javascript.jscomp.CompilerOptions var12 = new com.google.javascript.jscomp.CompilerOptions();
    var12.setLooseTypes(false);
    com.google.javascript.jscomp.Result var15 = var1.compile(var6, var9, var12);
    com.google.javascript.jscomp.CompilerOptions var16 = new com.google.javascript.jscomp.CompilerOptions();
    var16.setLooseTypes(false);
    var16.setShadowVariables(true);
    com.google.javascript.jscomp.CheckLevel var21 = null;
    var16.setCheckGlobalNamesLevel(var21);
    com.google.javascript.jscomp.CompilerOptions.LanguageMode var23 = var16.getLanguageIn();
    var12.setLanguageOut(var23);
    var12.setRemoveUnusedPrototypeProperties(true);
    var12.setLineBreak(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test74() {}
//   public void test74() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test74"); }
// 
// 
//     java.io.InputStream var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromInputStream("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node1 [label=\"SCRIPT\"];\n  node0 -> node1 [weight=1];\n  node1 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n  node0 -> RETURN [label=\"SYN_BLOCK\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n  node0 -> node1 [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n", var1);
// 
//   }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test75"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.util.List var1 = var0.getGraphvizNodes();
    com.google.javascript.rhino.JSDocInfo var2 = new com.google.javascript.rhino.JSDocInfo();
    boolean var3 = var2.isNoCompile();
    boolean var4 = var2.isExterns();
    java.lang.String var5 = var2.getOriginalCommentString();
    boolean var6 = var2.isNoSideEffects();
    com.google.javascript.jscomp.graph.GraphNode var7 = var0.getNode((java.lang.Object)var2);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var10 = var9.isOr();
    com.google.javascript.jscomp.SourceFile var14 = com.google.javascript.jscomp.SourceFile.fromCode("Node tree inequality:\nTree1:\nNUMBER 1.0\n\n\nTree2:\nBITXOR\n    BITXOR hi!\n    LABEL_NAME hi!\n    PARAM_LIST\n    LABEL_NAME hi!\n\n\nSubtree1: NUMBER 1.0\n\n\nSubtree2: BITXOR\n    BITXOR hi!\n    LABEL_NAME hi!\n    PARAM_LIST\n    LABEL_NAME hi!\n", "goog.exportSymbol.  at (unknown source) line (unknown line) : (unknown column)", "");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var15 = var0.getDirectedGraphEdges((java.lang.Object)var10, (java.lang.Object)"");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test76"); }


    com.google.javascript.jscomp.ClosureCodingConvention var1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var2 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var3 = var1.getDelegateRelationship(var2);
    java.lang.String var4 = var1.getExportSymbolFunction();
    boolean var7 = var1.isExported("hi!", true);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var10 = var9.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var11 = var9.getJsDocBuilderForNode();
    boolean var12 = var9.isOptionalArg();
    java.lang.String var13 = var9.toString();
    var9.setString("");
    boolean var16 = var9.isDo();
    boolean var17 = var9.hasChildren();
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.paramList();
    java.lang.String var19 = var1.extractClassNameIfRequire(var9, var18);
    com.google.javascript.rhino.Node var22 = new com.google.javascript.rhino.Node(1, var18, 0, 0);
    boolean var23 = var18.isReturn();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "goog.exportSymbol"+ "'", var4.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "LABEL_NAME hi!"+ "'", var13.equals("LABEL_NAME hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test77"); }


    com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
    java.io.Reader var3 = var2.getCodeReader();
    com.google.javascript.jscomp.JsAst var4 = new com.google.javascript.jscomp.JsAst(var2);
    var4.clearAst();
    com.google.javascript.rhino.InputId var6 = null;
    com.google.javascript.jscomp.CompilerInput var8 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var4, var6, false);
    java.io.PrintStream var9 = null;
    com.google.javascript.jscomp.Compiler var10 = new com.google.javascript.jscomp.Compiler(var9);
    com.google.javascript.jscomp.LightweightMessageFormatter var11 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var10);
    var10.disableThreads();
    com.google.javascript.jscomp.CompilerOptions var13 = new com.google.javascript.jscomp.CompilerOptions();
    var13.setLooseTypes(false);
    var13.setShadowVariables(true);
    var10.initOptions(var13);
    com.google.javascript.rhino.Node var19 = var4.getAstRoot((com.google.javascript.jscomp.AbstractCompiler)var10);
    java.io.PrintStream var20 = null;
    com.google.javascript.jscomp.Compiler var21 = new com.google.javascript.jscomp.Compiler(var20);
    var21.disableThreads();
    com.google.javascript.jscomp.LightweightMessageFormatter var23 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var21);
    com.google.javascript.jscomp.JSSourceFile var26 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    java.io.PrintStream var27 = null;
    com.google.javascript.jscomp.Compiler var28 = new com.google.javascript.jscomp.Compiler(var27);
    com.google.javascript.jscomp.LightweightMessageFormatter var29 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var28);
    com.google.javascript.jscomp.Scope var30 = var28.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var33 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var36 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var37 = var36.isExtern();
    boolean var38 = var36.isExtern();
    com.google.javascript.jscomp.CompilerOptions var39 = new com.google.javascript.jscomp.CompilerOptions();
    var39.setLooseTypes(false);
    com.google.javascript.jscomp.Result var42 = var28.compile(var33, var36, var39);
    java.io.PrintStream var43 = null;
    com.google.javascript.jscomp.Compiler var44 = new com.google.javascript.jscomp.Compiler(var43);
    com.google.javascript.jscomp.LightweightMessageFormatter var45 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var44);
    com.google.javascript.jscomp.Scope var46 = var44.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var49 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var52 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var53 = var52.isExtern();
    boolean var54 = var52.isExtern();
    com.google.javascript.jscomp.CompilerOptions var55 = new com.google.javascript.jscomp.CompilerOptions();
    var55.setLooseTypes(false);
    com.google.javascript.jscomp.Result var58 = var44.compile(var49, var52, var55);
    com.google.javascript.jscomp.JSSourceFile[] var59 = new com.google.javascript.jscomp.JSSourceFile[] { var49};
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var60 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.rhino.JSDocInfo var61 = new com.google.javascript.rhino.JSDocInfo();
    java.util.List var62 = var61.getExtendedInterfaces();
    com.google.javascript.jscomp.JSModule[] var63 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var62);
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var64 = var60.getDirectedGraphNode((java.lang.Object)var63);
    com.google.javascript.jscomp.CompilerOptions var65 = new com.google.javascript.jscomp.CompilerOptions();
    var65.setLooseTypes(false);
    var28.init(var59, var63, var65);
    com.google.javascript.jscomp.CompilerOptions var69 = new com.google.javascript.jscomp.CompilerOptions();
    var69.setLooseTypes(false);
    var69.setDeadAssignmentElimination(true);
    boolean var74 = var69.shouldColorizeErrorOutput();
    var69.setDefineToStringLiteral("hi!", "goog.exportSymbol");
    com.google.javascript.jscomp.Result var78 = var21.compile(var26, var59, var69);
    com.google.javascript.rhino.Node var79 = var10.parse(var26);
    int var81 = var26.getLineOffset(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 0);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test78"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.jscomp.graph.SubGraph var1 = var0.newSubGraph();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(1.0d);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var6 = var5.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var7 = var5.getJsDocBuilderForNode();
    com.google.javascript.rhino.Node var8 = var3.useSourceInfoIfMissingFrom(var5);
    java.lang.Iterable var9 = var3.siblings();
    com.google.javascript.jscomp.JSModule var11 = new com.google.javascript.jscomp.JSModule("hi!");
    java.util.Set var12 = var11.getThisAndAllDependencies();
    com.google.javascript.jscomp.JSModule[] var13 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.disconnectInDirection((java.lang.Object)var9, (java.lang.Object)var12);
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
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test79"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf("BITXOR");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test80"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    java.util.List var1 = var0.getExtendedInterfaces();
    boolean var2 = var0.isDefine();
    java.util.Collection var3 = var0.getAuthors();
    var0.setLicense("hi!");
    com.google.javascript.rhino.Node var6 = var0.getAssociatedNode();
    com.google.javascript.rhino.JSDocInfo.Visibility var7 = null;
    var0.setVisibility(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test81"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var4 = var3.isOr();
    boolean var5 = var3.isTry();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.paramList();
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var9 = var8.isOr();
    com.google.javascript.rhino.Node var10 = new com.google.javascript.rhino.Node(10, var3, var6, var8);
    boolean var11 = var10.isDebugger();
    com.google.javascript.rhino.Node[] var12 = new com.google.javascript.rhino.Node[] { var10};
    com.google.javascript.rhino.Node var15 = new com.google.javascript.rhino.Node(100, var12, 100, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.paramList(var12);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test82"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    var1.disableThreads();
    com.google.javascript.jscomp.LightweightMessageFormatter var3 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
    com.google.javascript.jscomp.JSSourceFile var6 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    java.io.PrintStream var7 = null;
    com.google.javascript.jscomp.Compiler var8 = new com.google.javascript.jscomp.Compiler(var7);
    com.google.javascript.jscomp.LightweightMessageFormatter var9 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var8);
    com.google.javascript.jscomp.Scope var10 = var8.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var13 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var16 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var17 = var16.isExtern();
    boolean var18 = var16.isExtern();
    com.google.javascript.jscomp.CompilerOptions var19 = new com.google.javascript.jscomp.CompilerOptions();
    var19.setLooseTypes(false);
    com.google.javascript.jscomp.Result var22 = var8.compile(var13, var16, var19);
    java.io.PrintStream var23 = null;
    com.google.javascript.jscomp.Compiler var24 = new com.google.javascript.jscomp.Compiler(var23);
    com.google.javascript.jscomp.LightweightMessageFormatter var25 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var24);
    com.google.javascript.jscomp.Scope var26 = var24.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var29 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var32 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var33 = var32.isExtern();
    boolean var34 = var32.isExtern();
    com.google.javascript.jscomp.CompilerOptions var35 = new com.google.javascript.jscomp.CompilerOptions();
    var35.setLooseTypes(false);
    com.google.javascript.jscomp.Result var38 = var24.compile(var29, var32, var35);
    com.google.javascript.jscomp.JSSourceFile[] var39 = new com.google.javascript.jscomp.JSSourceFile[] { var29};
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var40 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.rhino.JSDocInfo var41 = new com.google.javascript.rhino.JSDocInfo();
    java.util.List var42 = var41.getExtendedInterfaces();
    com.google.javascript.jscomp.JSModule[] var43 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var42);
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var44 = var40.getDirectedGraphNode((java.lang.Object)var43);
    com.google.javascript.jscomp.CompilerOptions var45 = new com.google.javascript.jscomp.CompilerOptions();
    var45.setLooseTypes(false);
    var8.init(var39, var43, var45);
    com.google.javascript.jscomp.CompilerOptions var49 = new com.google.javascript.jscomp.CompilerOptions();
    var49.setLooseTypes(false);
    var49.setDeadAssignmentElimination(true);
    boolean var54 = var49.shouldColorizeErrorOutput();
    var49.setDefineToStringLiteral("hi!", "goog.exportSymbol");
    com.google.javascript.jscomp.Result var58 = var1.compile(var6, var39, var49);
    java.io.PrintStream var59 = null;
    com.google.javascript.jscomp.Compiler var60 = new com.google.javascript.jscomp.Compiler(var59);
    com.google.javascript.jscomp.LightweightMessageFormatter var61 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var60);
    com.google.javascript.jscomp.Scope var62 = var60.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var65 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var68 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var69 = var68.isExtern();
    boolean var70 = var68.isExtern();
    com.google.javascript.jscomp.CompilerOptions var71 = new com.google.javascript.jscomp.CompilerOptions();
    var71.setLooseTypes(false);
    com.google.javascript.jscomp.Result var74 = var60.compile(var65, var68, var71);
    com.google.javascript.jscomp.JSModule var76 = new com.google.javascript.jscomp.JSModule("hi!");
    com.google.javascript.jscomp.JSModule[] var77 = new com.google.javascript.jscomp.JSModule[] { var76};
    com.google.javascript.jscomp.JSModuleGraph var78 = new com.google.javascript.jscomp.JSModuleGraph(var77);
    com.google.javascript.jscomp.CompilerOptions var79 = new com.google.javascript.jscomp.CompilerOptions();
    var79.setLooseTypes(false);
    var79.setShadowVariables(true);
    com.google.javascript.jscomp.CheckLevel var84 = null;
    var79.setCheckGlobalNamesLevel(var84);
    com.google.javascript.jscomp.CompilerOptions.LanguageMode var86 = var79.getLanguageIn();
    com.google.javascript.jscomp.Result var87 = var1.compile(var65, var77, var79);
    var79.setCollapseProperties(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test83"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var2 = var0.getDelegateRelationship(var1);
    java.lang.String var3 = var0.getExportSymbolFunction();
    boolean var6 = var0.isExported("hi!", true);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var9 = var8.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var10 = var8.getJsDocBuilderForNode();
    boolean var11 = var8.isOptionalArg();
    java.lang.String var12 = var8.toString();
    var8.setString("");
    boolean var15 = var8.isDo();
    boolean var16 = var8.hasChildren();
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.paramList();
    java.lang.String var18 = var0.extractClassNameIfRequire(var8, var17);
    java.lang.String var19 = var0.getExportSymbolFunction();
    com.google.javascript.rhino.Node var21 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString("(goog.exportSymbol)");
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.block();
    int var23 = var22.getType();
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.paramList();
    boolean var25 = var24.hasOneChild();
    var24.setType(0);
    var22.addChildToBack(var24);
    boolean var29 = var22.isThis();
    com.google.javascript.rhino.Node var31 = var22.getChildAtIndex((-1));
    java.lang.String var32 = var0.extractClassNameIfRequire(var21, var31);
    com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var35 = var34.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var36 = var34.getJsDocBuilderForNode();
    boolean var37 = var34.isOptionalArg();
    java.lang.String var38 = var34.toString();
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.Node.newString(0, "", 0, 100);
    int var44 = var43.getLineno();
    com.google.javascript.jscomp.ClosureCodingConvention var45 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var46 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var47 = var45.getDelegateRelationship(var46);
    java.lang.String var48 = var45.getExportSymbolFunction();
    boolean var51 = var45.isExported("hi!", true);
    com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var54 = var53.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var55 = var53.getJsDocBuilderForNode();
    boolean var56 = var53.isOptionalArg();
    java.lang.String var57 = var53.toString();
    var53.setString("");
    boolean var60 = var53.isDo();
    boolean var61 = var53.hasChildren();
    com.google.javascript.rhino.Node var62 = com.google.javascript.rhino.IR.paramList();
    java.lang.String var63 = var45.extractClassNameIfRequire(var53, var62);
    com.google.javascript.rhino.Node var65 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var66 = var65.isOr();
    boolean var67 = var65.isTry();
    boolean var68 = var45.isVarArgsParameter(var65);
    var43.addChildToBack(var65);
    com.google.javascript.rhino.Node var70 = var34.copyInformationFromForTree(var43);
    com.google.javascript.rhino.Node var75 = com.google.javascript.rhino.Node.newString(0, "", 0, 100);
    int var76 = var75.getLineno();
    var31.addChildAfter(var43, var75);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var31.setQuotedString();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "goog.exportSymbol"+ "'", var3.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "LABEL_NAME hi!"+ "'", var12.equals("LABEL_NAME hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "goog.exportSymbol"+ "'", var19.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 125);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "LABEL_NAME hi!"+ "'", var38.equals("LABEL_NAME hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "goog.exportSymbol"+ "'", var48.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "LABEL_NAME hi!"+ "'", var57.equals("LABEL_NAME hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0);

  }

  public void test84() {}
//   public void test84() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test84"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     var1.disableThreads();
//     com.google.javascript.jscomp.LightweightMessageFormatter var3 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     com.google.javascript.jscomp.Compiler.IntermediateState var4 = var1.getState();
//     var1.disableThreads();
//     boolean var6 = var1.isIdeMode();
// 
//   }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test85"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("hi!");
    java.util.Set var2 = var1.getThisAndAllDependencies();
    com.google.javascript.jscomp.SourceFile var5 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
    java.io.Reader var6 = var5.getCodeReader();
    com.google.javascript.jscomp.JsAst var7 = new com.google.javascript.jscomp.JsAst(var5);
    var7.clearAst();
    var7.clearAst();
    com.google.javascript.rhino.InputId var10 = null;
    com.google.javascript.jscomp.CompilerInput var12 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var7, var10, true);
    int var13 = var12.getNumLines();
    var1.addFirst(var12);
    var12.clearAst();
    boolean var16 = var12.isExtern();
    java.io.PrintStream var17 = null;
    com.google.javascript.jscomp.Compiler var18 = new com.google.javascript.jscomp.Compiler(var17);
    com.google.javascript.jscomp.LightweightMessageFormatter var19 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var18);
    com.google.javascript.jscomp.Scope var20 = var18.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var23 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var26 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var27 = var26.isExtern();
    boolean var28 = var26.isExtern();
    com.google.javascript.jscomp.CompilerOptions var29 = new com.google.javascript.jscomp.CompilerOptions();
    var29.setLooseTypes(false);
    com.google.javascript.jscomp.Result var32 = var18.compile(var23, var26, var29);
    java.io.PrintStream var33 = null;
    com.google.javascript.jscomp.Compiler var34 = new com.google.javascript.jscomp.Compiler(var33);
    com.google.javascript.jscomp.LightweightMessageFormatter var35 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var34);
    com.google.javascript.jscomp.Scope var36 = var34.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var39 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var42 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var43 = var42.isExtern();
    boolean var44 = var42.isExtern();
    com.google.javascript.jscomp.CompilerOptions var45 = new com.google.javascript.jscomp.CompilerOptions();
    var45.setLooseTypes(false);
    com.google.javascript.jscomp.Result var48 = var34.compile(var39, var42, var45);
    com.google.javascript.jscomp.JSSourceFile[] var49 = new com.google.javascript.jscomp.JSSourceFile[] { var39};
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var50 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.rhino.JSDocInfo var51 = new com.google.javascript.rhino.JSDocInfo();
    java.util.List var52 = var51.getExtendedInterfaces();
    com.google.javascript.jscomp.JSModule[] var53 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var52);
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var54 = var50.getDirectedGraphNode((java.lang.Object)var53);
    com.google.javascript.jscomp.CompilerOptions var55 = new com.google.javascript.jscomp.CompilerOptions();
    var55.setLooseTypes(false);
    var18.init(var49, var53, var55);
    java.lang.String var59 = var18.toSource();
    com.google.javascript.rhino.Node var60 = var12.getAstRoot((com.google.javascript.jscomp.AbstractCompiler)var18);
    com.google.javascript.jscomp.CompilerInput var61 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var12);
    com.google.javascript.jscomp.JSSourceFile var64 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var61.setSourceFile((com.google.javascript.jscomp.SourceFile)var64);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + ""+ "'", var59.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test86() {}
//   public void test86() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test86"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
//     com.google.javascript.rhino.jstype.JSType var4 = null;
//     boolean var5 = var2.declareType("hi!", var4);
//     var2.incrementGeneration();
//     com.google.javascript.rhino.ErrorReporter var7 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7, true);
//     com.google.javascript.rhino.jstype.JSType var11 = null;
//     boolean var12 = var9.declareType("hi!", var11);
//     var9.clearTemplateTypeName();
//     var9.setLastGeneration(false);
//     com.google.javascript.rhino.ErrorReporter var16 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var16, true);
//     com.google.javascript.rhino.jstype.JSType var20 = null;
//     boolean var21 = var18.declareType("hi!", var20);
//     var18.clearTemplateTypeName();
//     var18.setLastGeneration(false);
//     var18.resetForTypeCheck();
//     var18.resetForTypeCheck();
//     var18.setLastGeneration(false);
//     com.google.javascript.rhino.jstype.JSType var29 = null;
//     com.google.javascript.rhino.jstype.JSType var30 = null;
//     com.google.javascript.rhino.jstype.JSType[] var31 = new com.google.javascript.rhino.jstype.JSType[] { var30};
//     com.google.javascript.rhino.jstype.FunctionType var32 = var18.createConstructorType(var29, var31);
//     java.lang.Iterable var33 = var32.getCtorExtendedInterfaces();
//     boolean var34 = var32.hasImplementedInterfaces();
//     boolean var35 = var32.hasImplementedInterfaces();
//     com.google.javascript.rhino.jstype.JSType var36 = var9.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType)var32);
//     com.google.javascript.rhino.jstype.FunctionType var37 = var32.toMaybeFunctionType();
//     com.google.javascript.rhino.jstype.JSType var42 = var2.getType((com.google.javascript.rhino.jstype.StaticScope)var37, "enum{LinkedGraph}", "", 28, 10);
//     com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode var43 = null;
//     var2.setResolveMode(var43);
//     com.google.javascript.rhino.jstype.JSTypeNative var45 = null;
//     com.google.javascript.rhino.jstype.ObjectType var46 = var2.getNativeObjectType(var45);
// 
//   }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test87"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.block();
    int var2 = var0.getIntProp(1);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var6 = var5.isOr();
    boolean var7 = var5.isTry();
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.paramList();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var11 = var10.isOr();
    com.google.javascript.rhino.Node var12 = new com.google.javascript.rhino.Node(10, var5, var8, var10);
    com.google.javascript.rhino.Node var14 = var12.getChildAtIndex(0);
    var0.addChildrenToBack(var12);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.Node.newString("goog.exportSymbol", 10, 10);
    com.google.javascript.rhino.JSDocInfo var20 = var19.getJSDocInfo();
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.block();
    int var23 = var21.getIntProp(1);
    boolean var24 = var21.isFunction();
    boolean var25 = var21.isUnscopedQualifiedName();
    boolean var26 = var19.isEquivalentToTyped(var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.and(var0, var19);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test88() {}
//   public void test88() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test88"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
//     com.google.javascript.rhino.jstype.JSType var4 = null;
//     boolean var5 = var2.declareType("hi!", var4);
//     var2.clearTemplateTypeName();
//     var2.setLastGeneration(false);
//     var2.resetForTypeCheck();
//     var2.resetForTypeCheck();
//     var2.setLastGeneration(false);
//     com.google.javascript.rhino.jstype.JSType var13 = null;
//     com.google.javascript.rhino.jstype.JSType var14 = null;
//     com.google.javascript.rhino.jstype.JSType[] var15 = new com.google.javascript.rhino.jstype.JSType[] { var14};
//     com.google.javascript.rhino.jstype.FunctionType var16 = var2.createConstructorType(var13, var15);
//     java.lang.Iterable var17 = var16.getCtorExtendedInterfaces();
//     java.lang.Iterable var18 = var16.getAllImplementedInterfaces();
//     java.lang.Iterable var19 = var16.getCtorExtendedInterfaces();
//     com.google.javascript.rhino.jstype.JSType var20 = var16.autobox();
//     java.lang.String var21 = var20.toAnnotationString();
// 
//   }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test89"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CheckLevel var1 = com.google.javascript.jscomp.CheckLevel.valueOf("Node tree inequality:\nTree1:\nNUMBER 1.0\n\n\nTree2:\nBITXOR\n    BITXOR hi!\n    LABEL_NAME hi!\n    PARAM_LIST\n    LABEL_NAME hi!\n\n\nSubtree1: NUMBER 1.0\n\n\nSubtree2: BITXOR\n    BITXOR hi!\n    LABEL_NAME hi!\n    PARAM_LIST\n    LABEL_NAME hi!\n");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test90"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    var0.clearNodeAnnotations();
    java.util.List var2 = var0.getGraphvizEdges();
    java.lang.String var3 = var0.getName();
    java.lang.Object var4 = null;
    com.google.javascript.rhino.ErrorReporter var5 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var5, true);
    com.google.javascript.rhino.jstype.JSType var9 = null;
    boolean var10 = var7.declareType("hi!", var9);
    var7.clearTemplateTypeName();
    com.google.javascript.rhino.jstype.FunctionParamBuilder var12 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var7);
    java.lang.Iterable var14 = var7.getTypesWithProperty("NUMBER 100.0\n");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.disconnectInDirection(var4, (java.lang.Object)"NUMBER 100.0\n");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "LinkedGraph"+ "'", var3.equals("LinkedGraph"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test91"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    var0.clearNodeAnnotations();
    java.util.List var2 = var0.getGraphvizEdges();
    java.lang.String var3 = var0.getName();
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
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "LinkedGraph"+ "'", var3.equals("LinkedGraph"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test92"); }


    int var1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test93"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setLooseTypes(false);
    var0.setGeneratePseudoNames(true);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var5 = null;
    var0.setTweakProcessing(var5);
    var0.setTweakToBooleanLiteral("", true);
    com.google.javascript.jscomp.VariableRenamingPolicy var10 = null;
    var0.setVariableRenaming(var10);
    com.google.javascript.jscomp.CheckLevel var12 = null;
    var0.setCheckProvides(var12);
    var0.setTweakToDoubleLiteral("enum{LinkedGraph}", 0.0d);

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test94"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("hi!");
    com.google.javascript.jscomp.JSModule[] var2 = new com.google.javascript.jscomp.JSModule[] { var1};
    com.google.javascript.jscomp.JSModuleGraph var3 = new com.google.javascript.jscomp.JSModuleGraph(var2);
    com.google.javascript.jscomp.JSModule var5 = new com.google.javascript.jscomp.JSModule("hi!");
    java.util.Set var6 = var5.getAllDependencies();
    java.util.List var7 = var5.getProvides();
    com.google.javascript.jscomp.JSModule var9 = new com.google.javascript.jscomp.JSModule("hi!");
    java.lang.String var10 = var9.toString();
    boolean var11 = var3.dependsOn(var5, var9);
    int var12 = var5.getDepth();
    java.util.List var13 = var5.getInputs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test95() {}
//   public void test95() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test95"); }
// 
// 
//     com.google.javascript.jscomp.JSError[] var0 = null;
//     com.google.javascript.jscomp.JSModule var2 = new com.google.javascript.jscomp.JSModule("hi!");
//     java.util.Set var3 = var2.getThisAndAllDependencies();
//     com.google.javascript.jscomp.SourceFile var6 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
//     java.io.Reader var7 = var6.getCodeReader();
//     com.google.javascript.jscomp.JsAst var8 = new com.google.javascript.jscomp.JsAst(var6);
//     var8.clearAst();
//     var8.clearAst();
//     com.google.javascript.rhino.InputId var11 = null;
//     com.google.javascript.jscomp.CompilerInput var13 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var8, var11, true);
//     int var14 = var13.getNumLines();
//     var2.addFirst(var13);
//     java.util.logging.Logger var16 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var17 = new com.google.javascript.jscomp.LoggerErrorManager(var16);
//     var17.generateReport();
//     var13.setErrorManager((com.google.javascript.jscomp.ErrorManager)var17);
//     com.google.javascript.jscomp.JSError[] var20 = var17.getErrors();
//     com.google.javascript.jscomp.VariableMap var22 = null;
//     com.google.javascript.jscomp.VariableMap var23 = null;
//     com.google.javascript.jscomp.VariableMap var24 = null;
//     com.google.javascript.jscomp.FunctionInformationMap var25 = null;
//     com.google.javascript.jscomp.SourceMap var26 = null;
//     com.google.javascript.jscomp.Result var28 = new com.google.javascript.jscomp.Result(var0, var20, "goog.exportSymbol: ", var22, var23, var24, var25, var26, "");
// 
//   }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test96"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.breakNode();
    com.google.javascript.rhino.JSDocInfo var1 = var0.getJSDocInfo();
    com.google.javascript.rhino.InputId var2 = null;
    var0.setInputId(var2);
    boolean var4 = var0.isString();
    com.google.javascript.rhino.JSTypeExpression var6 = new com.google.javascript.rhino.JSTypeExpression(var0, "hi!");
    boolean var7 = var6.isVarArgs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test97"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var2 = var1.isOr();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var3 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.util.List var4 = var3.getGraphvizNodes();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.paramList(var4);
    com.google.javascript.rhino.jstype.StaticSourceFile var6 = var5.getStaticSourceFile();
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.number(1.0d);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var11 = var10.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var12 = var10.getJsDocBuilderForNode();
    com.google.javascript.rhino.Node var13 = var8.useSourceInfoIfMissingFrom(var10);
    int var14 = var5.getIndexOfChild(var10);
    boolean var15 = var5.hasOneChild();
    int var16 = var1.getIndexOfChild(var5);
    com.google.javascript.rhino.Node var17 = var5.getNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test98() {}
//   public void test98() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test98"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
//     com.google.javascript.rhino.jstype.JSType var4 = null;
//     boolean var5 = var2.declareType("hi!", var4);
//     var2.clearTemplateTypeName();
//     var2.setLastGeneration(false);
//     var2.resetForTypeCheck();
//     var2.resetForTypeCheck();
//     var2.setLastGeneration(false);
//     com.google.javascript.rhino.jstype.JSType var13 = null;
//     com.google.javascript.rhino.jstype.JSType var14 = null;
//     com.google.javascript.rhino.jstype.JSType[] var15 = new com.google.javascript.rhino.jstype.JSType[] { var14};
//     com.google.javascript.rhino.jstype.FunctionType var16 = var2.createConstructorType(var13, var15);
//     java.lang.Iterable var17 = var16.getCtorExtendedInterfaces();
//     boolean var18 = var16.hasImplementedInterfaces();
//     boolean var19 = var16.isNullable();
//     com.google.javascript.rhino.jstype.ObjectType var20 = var16.getInstanceType();
//     boolean var21 = var16.isInterface();
//     com.google.javascript.rhino.jstype.ObjectType var22 = var16.getTypeOfThis();
//     boolean var23 = var16.isNoType();
//     com.google.common.base.Predicate var24 = null;
//     boolean var25 = var16.setValidator(var24);
// 
//   }

  public void test99() {}
//   public void test99() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test99"); }
// 
// 
//     com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("hi!");
//     java.util.Set var2 = var1.getAllDependencies();
//     java.util.List var3 = var1.getProvides();
//     com.google.javascript.jscomp.JSModule var5 = new com.google.javascript.jscomp.JSModule("hi!");
//     com.google.javascript.jscomp.JSModule[] var6 = new com.google.javascript.jscomp.JSModule[] { var5};
//     com.google.javascript.jscomp.JSModuleGraph var7 = new com.google.javascript.jscomp.JSModuleGraph(var6);
//     com.google.javascript.jscomp.JSModule var9 = new com.google.javascript.jscomp.JSModule("hi!");
//     java.util.Set var10 = var9.getAllDependencies();
//     java.util.List var11 = var9.getProvides();
//     com.google.javascript.jscomp.JSModule var13 = new com.google.javascript.jscomp.JSModule("hi!");
//     java.lang.String var14 = var13.toString();
//     boolean var15 = var7.dependsOn(var9, var13);
//     com.google.javascript.jscomp.SourceFile var18 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
//     java.io.Reader var19 = var18.getCodeReader();
//     com.google.javascript.jscomp.JsAst var20 = new com.google.javascript.jscomp.JsAst(var18);
//     var20.clearAst();
//     com.google.javascript.rhino.InputId var22 = null;
//     com.google.javascript.jscomp.CompilerInput var24 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var20, var22, false);
//     var9.remove(var24);
//     com.google.javascript.jscomp.JSModule var26 = var24.getModule();
//     var1.addFirst(var24);
//     boolean var28 = var24.isExtern();
//     com.google.javascript.jscomp.SourceAst var29 = var24.getAst();
//     java.lang.String var30 = var24.getName();
// 
//   }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test100"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("hi!");
    com.google.javascript.jscomp.JSModule[] var2 = new com.google.javascript.jscomp.JSModule[] { var1};
    com.google.javascript.jscomp.JSModuleGraph var3 = new com.google.javascript.jscomp.JSModuleGraph(var2);
    com.google.javascript.jscomp.JSModuleGraph var4 = new com.google.javascript.jscomp.JSModuleGraph(var2);
    var4.coalesceDuplicateFiles();
    var4.coalesceDuplicateFiles();
    com.google.javascript.jscomp.JSModule var8 = new com.google.javascript.jscomp.JSModule("hi!");
    com.google.javascript.jscomp.JSModule[] var9 = new com.google.javascript.jscomp.JSModule[] { var8};
    com.google.javascript.jscomp.JSModuleGraph var10 = new com.google.javascript.jscomp.JSModuleGraph(var9);
    com.google.javascript.jscomp.JSModuleGraph var11 = new com.google.javascript.jscomp.JSModuleGraph(var9);
    var11.coalesceDuplicateFiles();
    com.google.javascript.jscomp.DependencyOptions var13 = new com.google.javascript.jscomp.DependencyOptions();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var14 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.util.List var15 = var14.getGraphvizNodes();
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.paramList(var15);
    java.util.List var17 = var11.manageDependencies(var13, var15);
    com.google.javascript.jscomp.deps.SortedDependencies var18 = new com.google.javascript.jscomp.deps.SortedDependencies(var17);
    com.google.javascript.rhino.ErrorReporter var19 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var19, true);
    com.google.javascript.rhino.jstype.JSType var23 = null;
    boolean var24 = var21.declareType("hi!", var23);
    var21.incrementGeneration();
    var21.identifyNonNullableName("goog.abstractMethod");
    com.google.javascript.rhino.ErrorReporter var28 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var28, true);
    com.google.javascript.rhino.jstype.JSType var32 = null;
    boolean var33 = var30.declareType("hi!", var32);
    var30.clearTemplateTypeName();
    var30.setLastGeneration(false);
    var30.resetForTypeCheck();
    com.google.javascript.rhino.jstype.JSType var39 = null;
    var30.unregisterPropertyOnType("", var39);
    com.google.javascript.rhino.ErrorReporter var41 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var41, true);
    com.google.javascript.rhino.jstype.JSType var45 = null;
    boolean var46 = var43.declareType("hi!", var45);
    var43.clearTemplateTypeName();
    var43.setLastGeneration(false);
    var43.resetForTypeCheck();
    var43.resetForTypeCheck();
    var43.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var54 = null;
    com.google.javascript.rhino.jstype.JSType var55 = null;
    com.google.javascript.rhino.jstype.JSType[] var56 = new com.google.javascript.rhino.jstype.JSType[] { var55};
    com.google.javascript.rhino.jstype.FunctionType var57 = var43.createConstructorType(var54, var56);
    java.lang.Iterable var58 = var57.getCtorExtendedInterfaces();
    com.google.javascript.rhino.ErrorReporter var60 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var60, true);
    com.google.javascript.rhino.jstype.JSType var64 = null;
    boolean var65 = var62.declareType("hi!", var64);
    var62.clearTemplateTypeName();
    var62.setLastGeneration(false);
    var62.resetForTypeCheck();
    var62.resetForTypeCheck();
    var62.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var73 = null;
    com.google.javascript.rhino.jstype.JSType var74 = null;
    com.google.javascript.rhino.jstype.JSType[] var75 = new com.google.javascript.rhino.jstype.JSType[] { var74};
    com.google.javascript.rhino.jstype.FunctionType var76 = var62.createConstructorType(var73, var75);
    com.google.javascript.rhino.jstype.FunctionType var77 = var30.createFunctionType((com.google.javascript.rhino.jstype.JSType)var57, false, var75);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var78 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    var78.clearNodeAnnotations();
    java.util.List var80 = var78.getGraphvizEdges();
    java.lang.String var81 = var78.getName();
    var78.pushEdgeAnnotations();
    java.util.List var83 = var78.getGraphvizEdges();
    com.google.javascript.rhino.jstype.FunctionType var84 = var21.createFunctionType((com.google.javascript.rhino.jstype.JSType)var57, var83);
    com.google.javascript.jscomp.JSModule[] var85 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var83);
    java.util.List var86 = var4.manageDependencies(var17, var83);
    var4.coalesceDuplicateFiles();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + "LinkedGraph"+ "'", var81.equals("LinkedGraph"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test101"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.paramList();
    java.lang.Iterable var1 = var0.siblings();
    boolean var2 = var0.isNew();
    var0.setVarArgs(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test102"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.clearTemplateTypeName();
    var2.setLastGeneration(false);
    var2.resetForTypeCheck();
    var2.resetForTypeCheck();
    var2.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var13 = null;
    com.google.javascript.rhino.jstype.JSType var14 = null;
    com.google.javascript.rhino.jstype.JSType[] var15 = new com.google.javascript.rhino.jstype.JSType[] { var14};
    com.google.javascript.rhino.jstype.FunctionType var16 = var2.createConstructorType(var13, var15);
    com.google.javascript.rhino.ErrorReporter var17 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var17, true);
    com.google.javascript.rhino.jstype.JSType var21 = null;
    boolean var22 = var19.declareType("hi!", var21);
    var19.clearNamedTypes();
    com.google.javascript.rhino.ErrorReporter var25 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25, true);
    com.google.javascript.rhino.jstype.JSType var29 = null;
    boolean var30 = var27.declareType("hi!", var29);
    var27.clearTemplateTypeName();
    var27.setLastGeneration(false);
    var27.resetForTypeCheck();
    com.google.javascript.rhino.jstype.JSType var36 = null;
    var27.unregisterPropertyOnType("", var36);
    com.google.javascript.rhino.ErrorReporter var38 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var38, true);
    com.google.javascript.rhino.jstype.JSType var42 = null;
    boolean var43 = var40.declareType("hi!", var42);
    var40.clearTemplateTypeName();
    var40.setLastGeneration(false);
    var40.resetForTypeCheck();
    var40.resetForTypeCheck();
    var40.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var51 = null;
    com.google.javascript.rhino.jstype.JSType var52 = null;
    com.google.javascript.rhino.jstype.JSType[] var53 = new com.google.javascript.rhino.jstype.JSType[] { var52};
    com.google.javascript.rhino.jstype.FunctionType var54 = var40.createConstructorType(var51, var53);
    java.lang.Iterable var55 = var54.getCtorExtendedInterfaces();
    com.google.javascript.rhino.ErrorReporter var57 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var57, true);
    com.google.javascript.rhino.jstype.JSType var61 = null;
    boolean var62 = var59.declareType("hi!", var61);
    var59.clearTemplateTypeName();
    var59.setLastGeneration(false);
    var59.resetForTypeCheck();
    var59.resetForTypeCheck();
    var59.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var70 = null;
    com.google.javascript.rhino.jstype.JSType var71 = null;
    com.google.javascript.rhino.jstype.JSType[] var72 = new com.google.javascript.rhino.jstype.JSType[] { var71};
    com.google.javascript.rhino.jstype.FunctionType var73 = var59.createConstructorType(var70, var72);
    com.google.javascript.rhino.jstype.FunctionType var74 = var27.createFunctionType((com.google.javascript.rhino.jstype.JSType)var54, false, var72);
    var19.overwriteDeclaredType("hi!", (com.google.javascript.rhino.jstype.JSType)var54);
    com.google.javascript.rhino.jstype.JSType var80 = var2.getType((com.google.javascript.rhino.jstype.StaticScope)var54, "LinkedGraph", "(goog.exportSymbol)", 100, 0);
    com.google.javascript.rhino.Node var81 = var54.getParametersNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test103"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.paramList();
    boolean var2 = var1.hasOneChild();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var3 = var1.getJsDocBuilderForNode();
    com.google.javascript.rhino.Node var5 = new com.google.javascript.rhino.Node(100);
    com.google.javascript.jscomp.ClosureCodingConvention var6 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var7 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var8 = var6.getDelegateRelationship(var7);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var12 = var11.isOr();
    boolean var13 = var11.isTry();
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.paramList();
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var17 = var16.isOr();
    com.google.javascript.rhino.Node var18 = new com.google.javascript.rhino.Node(10, var11, var14, var16);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.pos(var18);
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var20 = var6.getDelegateRelationship(var18);
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var23 = var22.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var24 = var22.getJsDocBuilderForNode();
    boolean var25 = var22.isOptionalArg();
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var28 = var27.isOr();
    var22.addChildToBack(var27);
    int var30 = var22.getCharno();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var31 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.util.List var32 = var31.getGraphvizNodes();
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.paramList(var32);
    com.google.javascript.rhino.Node var34 = var22.useSourceInfoFrom(var33);
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var38 = var37.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var39 = var37.getJsDocBuilderForNode();
    boolean var40 = var37.isOptionalArg();
    com.google.javascript.rhino.Node var41 = new com.google.javascript.rhino.Node(1, var37);
    java.lang.String var42 = var6.extractClassNameIfProvide(var34, var37);
    com.google.javascript.rhino.Node var43 = new com.google.javascript.rhino.Node(100, var1, var5, var34);
    boolean var44 = var34.isExprResult();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test104"); }


    com.google.javascript.jscomp.AstValidator var0 = new com.google.javascript.jscomp.AstValidator();
    com.google.javascript.jscomp.AstValidator var1 = new com.google.javascript.jscomp.AstValidator();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.block();
    int var3 = var2.getType();
    var1.validateStatement(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.validateExpression(var2);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 125);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test105"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled("", "(goog.exportSymbol)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test106"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.clearTemplateTypeName();
    var2.setLastGeneration(false);
    var2.resetForTypeCheck();
    com.google.javascript.jscomp.ClosureCodingConvention var11 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var12 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var13 = var11.getDelegateRelationship(var12);
    java.lang.String var14 = var11.getExportSymbolFunction();
    boolean var17 = var11.isExported("hi!", true);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var20 = var19.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var21 = var19.getJsDocBuilderForNode();
    boolean var22 = var19.isOptionalArg();
    java.lang.String var23 = var19.toString();
    var19.setString("");
    boolean var26 = var19.isDo();
    boolean var27 = var19.hasChildren();
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.paramList();
    java.lang.String var29 = var11.extractClassNameIfRequire(var19, var28);
    com.google.javascript.rhino.ErrorReporter var30 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var30, true);
    com.google.javascript.rhino.jstype.JSType var34 = null;
    boolean var35 = var32.declareType("hi!", var34);
    var32.clearTemplateTypeName();
    var32.setLastGeneration(false);
    var32.resetForTypeCheck();
    com.google.javascript.rhino.jstype.JSType var41 = null;
    var32.unregisterPropertyOnType("", var41);
    com.google.javascript.rhino.ErrorReporter var43 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var43, true);
    com.google.javascript.rhino.jstype.JSType var47 = null;
    boolean var48 = var45.declareType("hi!", var47);
    var45.clearTemplateTypeName();
    var45.setLastGeneration(false);
    var45.resetForTypeCheck();
    var45.resetForTypeCheck();
    var45.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var56 = null;
    com.google.javascript.rhino.jstype.JSType var57 = null;
    com.google.javascript.rhino.jstype.JSType[] var58 = new com.google.javascript.rhino.jstype.JSType[] { var57};
    com.google.javascript.rhino.jstype.FunctionType var59 = var45.createConstructorType(var56, var58);
    java.lang.Iterable var60 = var59.getCtorExtendedInterfaces();
    com.google.javascript.rhino.ErrorReporter var62 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var62, true);
    com.google.javascript.rhino.jstype.JSType var66 = null;
    boolean var67 = var64.declareType("hi!", var66);
    var64.clearTemplateTypeName();
    var64.setLastGeneration(false);
    var64.resetForTypeCheck();
    var64.resetForTypeCheck();
    var64.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var75 = null;
    com.google.javascript.rhino.jstype.JSType var76 = null;
    com.google.javascript.rhino.jstype.JSType[] var77 = new com.google.javascript.rhino.jstype.JSType[] { var76};
    com.google.javascript.rhino.jstype.FunctionType var78 = var64.createConstructorType(var75, var77);
    com.google.javascript.rhino.jstype.FunctionType var79 = var32.createFunctionType((com.google.javascript.rhino.jstype.JSType)var59, false, var77);
    boolean var80 = var59.isEmptyType();
    com.google.javascript.rhino.jstype.EnumType var81 = var2.createEnumType("LinkedGraph", var19, (com.google.javascript.rhino.jstype.JSType)var59);
    boolean var82 = var81.hasCachedValues();
    com.google.javascript.rhino.JSDocInfo var83 = var81.getJSDocInfo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "goog.exportSymbol"+ "'", var14.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "LABEL_NAME hi!"+ "'", var23.equals("LABEL_NAME hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test107"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled("BITXOR", "enum{LinkedGraph}");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test108"); }


    com.google.javascript.rhino.Node var3 = new com.google.javascript.rhino.Node(28, 28, 0);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test109"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.clearTemplateTypeName();
    var2.setLastGeneration(false);
    var2.resetForTypeCheck();
    com.google.javascript.rhino.jstype.JSType var11 = null;
    var2.unregisterPropertyOnType("", var11);
    com.google.javascript.rhino.ErrorReporter var13 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13, true);
    com.google.javascript.rhino.jstype.JSType var17 = null;
    boolean var18 = var15.declareType("hi!", var17);
    var15.clearTemplateTypeName();
    var15.setLastGeneration(false);
    var15.resetForTypeCheck();
    var15.resetForTypeCheck();
    var15.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var26 = null;
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.rhino.jstype.JSType[] var28 = new com.google.javascript.rhino.jstype.JSType[] { var27};
    com.google.javascript.rhino.jstype.FunctionType var29 = var15.createConstructorType(var26, var28);
    java.lang.Iterable var30 = var29.getCtorExtendedInterfaces();
    com.google.javascript.rhino.ErrorReporter var32 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32, true);
    com.google.javascript.rhino.jstype.JSType var36 = null;
    boolean var37 = var34.declareType("hi!", var36);
    var34.clearTemplateTypeName();
    var34.setLastGeneration(false);
    var34.resetForTypeCheck();
    var34.resetForTypeCheck();
    var34.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var45 = null;
    com.google.javascript.rhino.jstype.JSType var46 = null;
    com.google.javascript.rhino.jstype.JSType[] var47 = new com.google.javascript.rhino.jstype.JSType[] { var46};
    com.google.javascript.rhino.jstype.FunctionType var48 = var34.createConstructorType(var45, var47);
    com.google.javascript.rhino.jstype.FunctionType var49 = var2.createFunctionType((com.google.javascript.rhino.jstype.JSType)var29, false, var47);
    boolean var50 = var49.isString();
    boolean var51 = var49.isConstructor();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.FunctionType var52 = var49.getSuperClassConstructor();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);

  }

  public void test110() {}
//   public void test110() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test110"); }
// 
// 
//     com.google.javascript.jscomp.AstValidator var0 = new com.google.javascript.jscomp.AstValidator();
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.block();
//     int var2 = var1.getType();
//     var0.validateStatement(var1);
//     com.google.javascript.rhino.Node var4 = null;
//     var0.validateCodeRoot(var4);
// 
//   }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test111"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.breakNode();
    com.google.javascript.rhino.JSDocInfo var1 = var0.getJSDocInfo();
    com.google.javascript.rhino.InputId var2 = null;
    var0.setInputId(var2);
    var0.putIntProp(0, 28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test112() {}
//   public void test112() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test112"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
//     com.google.javascript.rhino.jstype.JSType var4 = null;
//     boolean var5 = var2.declareType("hi!", var4);
//     var2.clearTemplateTypeName();
//     var2.setLastGeneration(false);
//     var2.resetForTypeCheck();
//     com.google.javascript.jscomp.ClosureCodingConvention var11 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     com.google.javascript.rhino.Node var12 = null;
//     com.google.javascript.jscomp.CodingConvention.DelegateRelationship var13 = var11.getDelegateRelationship(var12);
//     java.lang.String var14 = var11.getExportSymbolFunction();
//     boolean var17 = var11.isExported("hi!", true);
//     com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.labelName("hi!");
//     boolean var20 = var19.isOr();
//     com.google.javascript.rhino.Node.FileLevelJsDocBuilder var21 = var19.getJsDocBuilderForNode();
//     boolean var22 = var19.isOptionalArg();
//     java.lang.String var23 = var19.toString();
//     var19.setString("");
//     boolean var26 = var19.isDo();
//     boolean var27 = var19.hasChildren();
//     com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.paramList();
//     java.lang.String var29 = var11.extractClassNameIfRequire(var19, var28);
//     com.google.javascript.rhino.ErrorReporter var30 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var30, true);
//     com.google.javascript.rhino.jstype.JSType var34 = null;
//     boolean var35 = var32.declareType("hi!", var34);
//     var32.clearTemplateTypeName();
//     var32.setLastGeneration(false);
//     var32.resetForTypeCheck();
//     com.google.javascript.rhino.jstype.JSType var41 = null;
//     var32.unregisterPropertyOnType("", var41);
//     com.google.javascript.rhino.ErrorReporter var43 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var43, true);
//     com.google.javascript.rhino.jstype.JSType var47 = null;
//     boolean var48 = var45.declareType("hi!", var47);
//     var45.clearTemplateTypeName();
//     var45.setLastGeneration(false);
//     var45.resetForTypeCheck();
//     var45.resetForTypeCheck();
//     var45.setLastGeneration(false);
//     com.google.javascript.rhino.jstype.JSType var56 = null;
//     com.google.javascript.rhino.jstype.JSType var57 = null;
//     com.google.javascript.rhino.jstype.JSType[] var58 = new com.google.javascript.rhino.jstype.JSType[] { var57};
//     com.google.javascript.rhino.jstype.FunctionType var59 = var45.createConstructorType(var56, var58);
//     java.lang.Iterable var60 = var59.getCtorExtendedInterfaces();
//     com.google.javascript.rhino.ErrorReporter var62 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var62, true);
//     com.google.javascript.rhino.jstype.JSType var66 = null;
//     boolean var67 = var64.declareType("hi!", var66);
//     var64.clearTemplateTypeName();
//     var64.setLastGeneration(false);
//     var64.resetForTypeCheck();
//     var64.resetForTypeCheck();
//     var64.setLastGeneration(false);
//     com.google.javascript.rhino.jstype.JSType var75 = null;
//     com.google.javascript.rhino.jstype.JSType var76 = null;
//     com.google.javascript.rhino.jstype.JSType[] var77 = new com.google.javascript.rhino.jstype.JSType[] { var76};
//     com.google.javascript.rhino.jstype.FunctionType var78 = var64.createConstructorType(var75, var77);
//     com.google.javascript.rhino.jstype.FunctionType var79 = var32.createFunctionType((com.google.javascript.rhino.jstype.JSType)var59, false, var77);
//     boolean var80 = var59.isEmptyType();
//     com.google.javascript.rhino.jstype.EnumType var81 = var2.createEnumType("LinkedGraph", var19, (com.google.javascript.rhino.jstype.JSType)var59);
//     com.google.javascript.rhino.Node var83 = com.google.javascript.rhino.IR.labelName("hi!");
//     boolean var84 = var19.hasChild(var83);
//     java.lang.Appendable var85 = null;
//     var19.appendStringTree(var85);
// 
//   }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test113"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.clearTemplateTypeName();
    var2.setLastGeneration(false);
    var2.resetForTypeCheck();
    var2.resetForTypeCheck();
    var2.setTemplateTypeName("");
    com.google.javascript.rhino.ErrorReporter var13 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13, true);
    com.google.javascript.rhino.jstype.JSType var17 = null;
    boolean var18 = var15.declareType("hi!", var17);
    var15.clearNamedTypes();
    com.google.javascript.rhino.ErrorReporter var21 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21, true);
    com.google.javascript.rhino.jstype.JSType var25 = null;
    boolean var26 = var23.declareType("hi!", var25);
    var23.clearTemplateTypeName();
    var23.setLastGeneration(false);
    var23.resetForTypeCheck();
    com.google.javascript.rhino.jstype.JSType var32 = null;
    var23.unregisterPropertyOnType("", var32);
    com.google.javascript.rhino.ErrorReporter var34 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var34, true);
    com.google.javascript.rhino.jstype.JSType var38 = null;
    boolean var39 = var36.declareType("hi!", var38);
    var36.clearTemplateTypeName();
    var36.setLastGeneration(false);
    var36.resetForTypeCheck();
    var36.resetForTypeCheck();
    var36.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var47 = null;
    com.google.javascript.rhino.jstype.JSType var48 = null;
    com.google.javascript.rhino.jstype.JSType[] var49 = new com.google.javascript.rhino.jstype.JSType[] { var48};
    com.google.javascript.rhino.jstype.FunctionType var50 = var36.createConstructorType(var47, var49);
    java.lang.Iterable var51 = var50.getCtorExtendedInterfaces();
    com.google.javascript.rhino.ErrorReporter var53 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var53, true);
    com.google.javascript.rhino.jstype.JSType var57 = null;
    boolean var58 = var55.declareType("hi!", var57);
    var55.clearTemplateTypeName();
    var55.setLastGeneration(false);
    var55.resetForTypeCheck();
    var55.resetForTypeCheck();
    var55.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var66 = null;
    com.google.javascript.rhino.jstype.JSType var67 = null;
    com.google.javascript.rhino.jstype.JSType[] var68 = new com.google.javascript.rhino.jstype.JSType[] { var67};
    com.google.javascript.rhino.jstype.FunctionType var69 = var55.createConstructorType(var66, var68);
    com.google.javascript.rhino.jstype.FunctionType var70 = var23.createFunctionType((com.google.javascript.rhino.jstype.JSType)var50, false, var68);
    var15.overwriteDeclaredType("hi!", (com.google.javascript.rhino.jstype.JSType)var50);
    boolean var72 = var50.isNullable();
    int var73 = var50.getMinArguments();
    boolean var74 = var50.canBeCalled();
    com.google.javascript.rhino.jstype.JSType var79 = var2.getType((com.google.javascript.rhino.jstype.StaticScope)var50, "FALSE", "digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node1 [label=\"SCRIPT\"];\n  node0 -> node1 [weight=1];\n  node1 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n  node0 -> RETURN [label=\"SYN_BLOCK\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n  node0 -> node1 [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n", 100, 0);
    com.google.javascript.rhino.jstype.BooleanLiteralSet var80 = var50.getPossibleToBooleanOutcomes();
    boolean var81 = var50.hasImplementedInterfaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);

  }

  public void test114() {}
//   public void test114() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test114"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CodingConvention.DelegateRelationship var2 = var0.getDelegateRelationship(var1);
//     java.lang.String var3 = var0.getExportSymbolFunction();
//     boolean var6 = var0.isExported("hi!", true);
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.labelName("hi!");
//     boolean var9 = var8.isOr();
//     com.google.javascript.rhino.Node.FileLevelJsDocBuilder var10 = var8.getJsDocBuilderForNode();
//     boolean var11 = var8.isOptionalArg();
//     java.lang.String var12 = var8.toString();
//     var8.setString("");
//     boolean var15 = var8.isDo();
//     boolean var16 = var8.hasChildren();
//     com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.paramList();
//     java.lang.String var18 = var0.extractClassNameIfRequire(var8, var17);
//     boolean var19 = var8.isNew();
//     com.google.javascript.rhino.Node.SideEffectFlags var20 = null;
//     var8.setSideEffectFlags(var20);
// 
//   }

  public void test115() {}
//   public void test115() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test115"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
//     com.google.javascript.rhino.jstype.JSType var4 = null;
//     boolean var5 = var2.declareType("hi!", var4);
//     var2.clearTemplateTypeName();
//     var2.setLastGeneration(false);
//     var2.resetForTypeCheck();
//     var2.resetForTypeCheck();
//     var2.setLastGeneration(false);
//     com.google.javascript.rhino.jstype.JSType var13 = null;
//     com.google.javascript.rhino.jstype.JSType var14 = null;
//     com.google.javascript.rhino.jstype.JSType[] var15 = new com.google.javascript.rhino.jstype.JSType[] { var14};
//     com.google.javascript.rhino.jstype.FunctionType var16 = var2.createConstructorType(var13, var15);
//     java.lang.Iterable var17 = var16.getCtorExtendedInterfaces();
//     boolean var18 = var16.hasImplementedInterfaces();
//     com.google.javascript.rhino.ErrorReporter var19 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var19, true);
//     com.google.javascript.rhino.jstype.JSType var23 = null;
//     boolean var24 = var21.declareType("hi!", var23);
//     var21.clearTemplateTypeName();
//     var21.setLastGeneration(false);
//     var21.resetForTypeCheck();
//     var21.resetForTypeCheck();
//     var21.setLastGeneration(false);
//     com.google.javascript.rhino.jstype.JSType var32 = null;
//     com.google.javascript.rhino.jstype.JSType var33 = null;
//     com.google.javascript.rhino.jstype.JSType[] var34 = new com.google.javascript.rhino.jstype.JSType[] { var33};
//     com.google.javascript.rhino.jstype.FunctionType var35 = var21.createConstructorType(var32, var34);
//     boolean var36 = var16.isEquivalentTo(var32);
//     boolean var37 = var16.isReturnTypeInferred();
//     java.util.Set var38 = var16.getOwnPropertyNames();
//     boolean var40 = var16.removeProperty("LABEL_NAME hi!");
//     java.lang.Iterable var41 = var16.getParameters();
//     com.google.javascript.rhino.jstype.JSType var42 = null;
//     boolean var43 = var16.canTestForEqualityWith(var42);
// 
//   }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test116"); }


    com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
    java.io.Reader var3 = var2.getCodeReader();
    com.google.javascript.jscomp.JsAst var4 = new com.google.javascript.jscomp.JsAst(var2);
    var4.clearAst();
    var4.clearAst();
    com.google.javascript.rhino.InputId var7 = null;
    com.google.javascript.jscomp.CompilerInput var9 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var4, var7, true);
    int var10 = var9.getNumLines();
    var9.clearAst();
    java.lang.String var12 = var9.getCode();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var13 = var9.getPathRelativeToClosureBase();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test117() {}
//   public void test117() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test117"); }
// 
// 
//     com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("hi!");
//     java.util.Set var2 = var1.getAllDependencies();
//     java.util.List var3 = var1.getProvides();
//     com.google.javascript.jscomp.JSModule var5 = new com.google.javascript.jscomp.JSModule("hi!");
//     com.google.javascript.jscomp.JSModule[] var6 = new com.google.javascript.jscomp.JSModule[] { var5};
//     com.google.javascript.jscomp.JSModuleGraph var7 = new com.google.javascript.jscomp.JSModuleGraph(var6);
//     com.google.javascript.jscomp.JSModule var9 = new com.google.javascript.jscomp.JSModule("hi!");
//     java.util.Set var10 = var9.getAllDependencies();
//     java.util.List var11 = var9.getProvides();
//     com.google.javascript.jscomp.JSModule var13 = new com.google.javascript.jscomp.JSModule("hi!");
//     java.lang.String var14 = var13.toString();
//     boolean var15 = var7.dependsOn(var9, var13);
//     com.google.javascript.jscomp.SourceFile var18 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
//     java.io.Reader var19 = var18.getCodeReader();
//     com.google.javascript.jscomp.JsAst var20 = new com.google.javascript.jscomp.JsAst(var18);
//     var20.clearAst();
//     com.google.javascript.rhino.InputId var22 = null;
//     com.google.javascript.jscomp.CompilerInput var24 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var20, var22, false);
//     var9.remove(var24);
//     com.google.javascript.jscomp.JSModule var26 = var24.getModule();
//     var1.addFirst(var24);
//     boolean var28 = var24.isExtern();
//     com.google.javascript.jscomp.SourceAst var29 = var24.getAst();
//     com.google.javascript.jscomp.JSModule var30 = var24.getModule();
//     com.google.javascript.jscomp.CompilerInput var31 = null;
//     var30.addFirst(var31);
// 
//   }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test118"); }


    com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
    boolean var3 = var0.isExported("", true);
    boolean var5 = var0.isValidEnumKey("hi!");
    java.lang.String var6 = var0.getAbstractMethodName();
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var9 = var8.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var10 = var8.getJsDocBuilderForNode();
    boolean var11 = var8.isOptionalArg();
    java.lang.String var12 = var8.toString();
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.Node.newString(0, "", 0, 100);
    int var18 = var17.getLineno();
    com.google.javascript.jscomp.ClosureCodingConvention var19 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var20 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var21 = var19.getDelegateRelationship(var20);
    java.lang.String var22 = var19.getExportSymbolFunction();
    boolean var25 = var19.isExported("hi!", true);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var28 = var27.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var29 = var27.getJsDocBuilderForNode();
    boolean var30 = var27.isOptionalArg();
    java.lang.String var31 = var27.toString();
    var27.setString("");
    boolean var34 = var27.isDo();
    boolean var35 = var27.hasChildren();
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.paramList();
    java.lang.String var37 = var19.extractClassNameIfRequire(var27, var36);
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var40 = var39.isOr();
    boolean var41 = var39.isTry();
    boolean var42 = var19.isVarArgsParameter(var39);
    var17.addChildToBack(var39);
    com.google.javascript.rhino.Node var44 = var8.copyInformationFromForTree(var17);
    boolean var45 = var0.isOptionalParameter(var17);
    int var46 = var17.getSideEffectFlags();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "goog.abstractMethod"+ "'", var6.equals("goog.abstractMethod"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "LABEL_NAME hi!"+ "'", var12.equals("LABEL_NAME hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "goog.exportSymbol"+ "'", var22.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "LABEL_NAME hi!"+ "'", var31.equals("LABEL_NAME hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test119"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.number(1.0d);
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var5 = var4.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var6 = var4.getJsDocBuilderForNode();
    com.google.javascript.rhino.Node var7 = var2.useSourceInfoIfMissingFrom(var4);
    com.google.javascript.rhino.Node var8 = new com.google.javascript.rhino.Node(100, var4);
    com.google.javascript.jscomp.CompilerOptions var9 = new com.google.javascript.jscomp.CompilerOptions();
    var9.setLooseTypes(false);
    var9.setShadowVariables(true);
    com.google.javascript.rhino.JSDocInfo var15 = new com.google.javascript.rhino.JSDocInfo();
    java.util.List var16 = var15.getExtendedInterfaces();
    com.google.javascript.jscomp.JSModule[] var17 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var16);
    var9.setReplaceStringsConfiguration("", var16);
    java.io.PrintStream var19 = null;
    com.google.javascript.jscomp.Compiler var20 = new com.google.javascript.jscomp.Compiler(var19);
    com.google.javascript.jscomp.LightweightMessageFormatter var21 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var20);
    com.google.javascript.jscomp.Scope var22 = var20.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var25 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var28 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var29 = var28.isExtern();
    boolean var30 = var28.isExtern();
    com.google.javascript.jscomp.CompilerOptions var31 = new com.google.javascript.jscomp.CompilerOptions();
    var31.setLooseTypes(false);
    com.google.javascript.jscomp.Result var34 = var20.compile(var25, var28, var31);
    var31.setRenamePrefixNamespace("LinkedGraph");
    var31.setSmartNameRemoval(false);
    var31.setLabelRenaming(true);
    var31.setOptimizeArgumentsArray(false);
    com.google.javascript.rhino.ErrorReporter var43 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var43, true);
    com.google.javascript.rhino.jstype.JSType var47 = null;
    boolean var48 = var45.declareType("hi!", var47);
    var45.clearTemplateTypeName();
    var45.setLastGeneration(false);
    com.google.javascript.rhino.ErrorReporter var52 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var52, true);
    com.google.javascript.rhino.jstype.JSType var56 = null;
    boolean var57 = var54.declareType("hi!", var56);
    var54.clearTemplateTypeName();
    var54.setLastGeneration(false);
    var54.resetForTypeCheck();
    var54.resetForTypeCheck();
    var54.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var65 = null;
    com.google.javascript.rhino.jstype.JSType var66 = null;
    com.google.javascript.rhino.jstype.JSType[] var67 = new com.google.javascript.rhino.jstype.JSType[] { var66};
    com.google.javascript.rhino.jstype.FunctionType var68 = var54.createConstructorType(var65, var67);
    java.lang.Iterable var69 = var68.getCtorExtendedInterfaces();
    boolean var70 = var68.hasImplementedInterfaces();
    boolean var71 = var68.hasImplementedInterfaces();
    com.google.javascript.rhino.jstype.JSType var72 = var45.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType)var68);
    com.google.javascript.rhino.jstype.FunctionType var73 = var68.toMaybeFunctionType();
    java.util.Set var74 = var73.getOwnPropertyNames();
    var31.setIdGenerators(var74);
    var9.setIdGenerators(var74);
    var8.setDirectives(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);

  }

  public void test120() {}
//   public void test120() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test120"); }
// 
// 
//     com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback var0 = null;
//     com.google.javascript.jscomp.graph.FixedPointGraphTraversal var1 = com.google.javascript.jscomp.graph.FixedPointGraphTraversal.newTraversal(var0);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var2 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
//     var1.computeFixedPoint((com.google.javascript.jscomp.graph.DiGraph)var2);
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var4 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     java.io.PrintStream var5 = null;
//     com.google.javascript.jscomp.Compiler var6 = new com.google.javascript.jscomp.Compiler(var5);
//     com.google.javascript.jscomp.Compiler.IntermediateState var7 = var6.getState();
//     com.google.javascript.jscomp.JSSourceFile var10 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
//     java.lang.String var11 = var10.getCode();
//     com.google.javascript.jscomp.JSSourceFile[] var12 = new com.google.javascript.jscomp.JSSourceFile[] { var10};
//     com.google.javascript.jscomp.JSModule var14 = new com.google.javascript.jscomp.JSModule("hi!");
//     com.google.javascript.jscomp.JSModule[] var15 = new com.google.javascript.jscomp.JSModule[] { var14};
//     com.google.javascript.jscomp.JSModuleGraph var16 = new com.google.javascript.jscomp.JSModuleGraph(var15);
//     com.google.javascript.jscomp.JSModule var18 = new com.google.javascript.jscomp.JSModule("hi!");
//     java.util.Set var19 = var18.getAllDependencies();
//     java.util.List var20 = var18.getProvides();
//     com.google.javascript.jscomp.JSModule var22 = new com.google.javascript.jscomp.JSModule("hi!");
//     java.lang.String var23 = var22.toString();
//     boolean var24 = var16.dependsOn(var18, var22);
//     com.google.javascript.jscomp.JSModule[] var25 = new com.google.javascript.jscomp.JSModule[] { var22};
//     com.google.javascript.jscomp.CompilerOptions var26 = new com.google.javascript.jscomp.CompilerOptions();
//     var26.setLooseTypes(false);
//     var26.setDeadAssignmentElimination(true);
//     java.lang.Object var31 = var26.clone();
//     var26.setOptimizeCalls(true);
//     com.google.javascript.jscomp.Result var34 = var6.compile(var12, var25, var26);
//     var6.rebuildInputsFromModules();
//     com.google.javascript.jscomp.JSModule var37 = new com.google.javascript.jscomp.JSModule("hi!");
//     java.lang.String var38 = var37.toString();
//     int var39 = var37.getDepth();
//     com.google.javascript.jscomp.SourceFile var42 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
//     java.io.Reader var43 = var42.getCodeReader();
//     com.google.javascript.jscomp.JsAst var44 = new com.google.javascript.jscomp.JsAst(var42);
//     var44.clearAst();
//     com.google.javascript.rhino.InputId var46 = null;
//     com.google.javascript.jscomp.CompilerInput var48 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var44, var46, false);
//     com.google.javascript.jscomp.SourceAst var49 = var48.getAst();
//     var37.add(var48);
//     java.lang.String[] var51 = var6.toSourceArray(var37);
//     var1.computeFixedPoint((com.google.javascript.jscomp.graph.DiGraph)var4, (java.lang.Object)var51);
// 
//   }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test121"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var2 = var0.getDelegateRelationship(var1);
    java.lang.String var3 = var0.getExportSymbolFunction();
    com.google.javascript.jscomp.ClosureCodingConvention var4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var5 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var6 = var4.getDelegateRelationship(var5);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var10 = var9.isOr();
    boolean var11 = var9.isTry();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.paramList();
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var15 = var14.isOr();
    com.google.javascript.rhino.Node var16 = new com.google.javascript.rhino.Node(10, var9, var12, var14);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.pos(var16);
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var18 = var4.getDelegateRelationship(var16);
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var22 = var21.isOr();
    boolean var23 = var21.isTry();
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.paramList();
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var27 = var26.isOr();
    com.google.javascript.rhino.Node var28 = new com.google.javascript.rhino.Node(10, var21, var24, var26);
    com.google.javascript.rhino.Node var30 = var28.getChildAtIndex(0);
    boolean var31 = var4.isOptionalParameter(var28);
    com.google.javascript.jscomp.CodingConvention.SubclassRelationship var32 = var0.getClassesDefinedByCall(var28);
    com.google.javascript.rhino.Node var33 = null;
    boolean var34 = var0.isOptionalParameter(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "goog.exportSymbol"+ "'", var3.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test122"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.LightweightMessageFormatter var2 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
    com.google.javascript.jscomp.Scope var3 = var1.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var6 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var9 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var10 = var9.isExtern();
    boolean var11 = var9.isExtern();
    com.google.javascript.jscomp.CompilerOptions var12 = new com.google.javascript.jscomp.CompilerOptions();
    var12.setLooseTypes(false);
    com.google.javascript.jscomp.Result var15 = var1.compile(var6, var9, var12);
    com.google.javascript.jscomp.CompilerOptions var16 = new com.google.javascript.jscomp.CompilerOptions();
    var16.setLooseTypes(false);
    var16.setShadowVariables(true);
    com.google.javascript.jscomp.CheckLevel var21 = null;
    var16.setCheckGlobalNamesLevel(var21);
    com.google.javascript.jscomp.CompilerOptions.LanguageMode var23 = var16.getLanguageIn();
    var12.setLanguageOut(var23);
    java.lang.Class var25 = var23.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var27 = java.lang.Enum.<java.lang.Enum>valueOf(var25, "digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"SYN_BLOCK\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test123"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var3 = var2.isOr();
    boolean var4 = var2.isTry();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.paramList();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var8 = var7.isOr();
    com.google.javascript.rhino.Node var9 = new com.google.javascript.rhino.Node(10, var2, var5, var7);
    boolean var10 = var9.isDelProp();
    java.lang.Object var12 = null;
    var9.putProp(0, var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test124"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.clearNamedTypes();
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8, true);
    com.google.javascript.rhino.jstype.JSType var12 = null;
    boolean var13 = var10.declareType("hi!", var12);
    var10.clearTemplateTypeName();
    var10.setLastGeneration(false);
    var10.resetForTypeCheck();
    com.google.javascript.rhino.jstype.JSType var19 = null;
    var10.unregisterPropertyOnType("", var19);
    com.google.javascript.rhino.ErrorReporter var21 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21, true);
    com.google.javascript.rhino.jstype.JSType var25 = null;
    boolean var26 = var23.declareType("hi!", var25);
    var23.clearTemplateTypeName();
    var23.setLastGeneration(false);
    var23.resetForTypeCheck();
    var23.resetForTypeCheck();
    var23.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var34 = null;
    com.google.javascript.rhino.jstype.JSType var35 = null;
    com.google.javascript.rhino.jstype.JSType[] var36 = new com.google.javascript.rhino.jstype.JSType[] { var35};
    com.google.javascript.rhino.jstype.FunctionType var37 = var23.createConstructorType(var34, var36);
    java.lang.Iterable var38 = var37.getCtorExtendedInterfaces();
    com.google.javascript.rhino.ErrorReporter var40 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var40, true);
    com.google.javascript.rhino.jstype.JSType var44 = null;
    boolean var45 = var42.declareType("hi!", var44);
    var42.clearTemplateTypeName();
    var42.setLastGeneration(false);
    var42.resetForTypeCheck();
    var42.resetForTypeCheck();
    var42.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var53 = null;
    com.google.javascript.rhino.jstype.JSType var54 = null;
    com.google.javascript.rhino.jstype.JSType[] var55 = new com.google.javascript.rhino.jstype.JSType[] { var54};
    com.google.javascript.rhino.jstype.FunctionType var56 = var42.createConstructorType(var53, var55);
    com.google.javascript.rhino.jstype.FunctionType var57 = var10.createFunctionType((com.google.javascript.rhino.jstype.JSType)var37, false, var55);
    var2.overwriteDeclaredType("hi!", (com.google.javascript.rhino.jstype.JSType)var37);
    boolean var59 = var37.isNullable();
    com.google.javascript.rhino.ErrorReporter var60 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var60, true);
    com.google.javascript.rhino.jstype.JSType var64 = null;
    boolean var65 = var62.declareType("hi!", var64);
    var62.clearTemplateTypeName();
    var62.setLastGeneration(false);
    var62.resetForTypeCheck();
    var62.resetForTypeCheck();
    var62.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var73 = null;
    com.google.javascript.rhino.jstype.JSType var74 = null;
    com.google.javascript.rhino.jstype.JSType[] var75 = new com.google.javascript.rhino.jstype.JSType[] { var74};
    com.google.javascript.rhino.jstype.FunctionType var76 = var62.createConstructorType(var73, var75);
    java.lang.Iterable var77 = var76.getImplementedInterfaces();
    com.google.javascript.rhino.Node var78 = var76.getRootNode();
    boolean var79 = var37.hasEqualCallType(var76);
    boolean var80 = var37.matchesUint32Context();
    com.google.javascript.rhino.JSDocInfo var82 = new com.google.javascript.rhino.JSDocInfo();
    boolean var83 = var82.isNoCompile();
    boolean var84 = var82.isExterns();
    boolean var85 = var82.hasReturnType();
    boolean var87 = var82.hasDescriptionForParameter("hi!");
    var37.setPropertyJSDocInfo("Node tree inequality:\nTree1:\nBITXOR\n    BITXOR hi!\n    LABEL_NAME hi!\n    PARAM_LIST\n    LABEL_NAME hi!\n\n\nTree2:\nFALSE [synthetic: 1]\n\n\nSubtree1: BITXOR\n    BITXOR hi!\n    LABEL_NAME hi!\n    PARAM_LIST\n    LABEL_NAME hi!\n\n\nSubtree2: FALSE [synthetic: 1]\n", var82);
    boolean var89 = var82.isNoSideEffects();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test125"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    boolean var1 = var0.isNoCompile();
    boolean var2 = var0.isExterns();
    boolean var3 = var0.hasReturnType();
    boolean var4 = var0.hasReturnType();
    boolean var5 = var0.hasTypedefType();
    boolean var6 = var0.isConstant();
    com.google.javascript.rhino.JSTypeExpression var7 = var0.getReturnType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test126"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    var0.clearNodeAnnotations();
    java.util.List var2 = var0.getGraphvizEdges();
    com.google.javascript.jscomp.graph.SubGraph var3 = var0.newSubGraph();
    com.google.javascript.jscomp.GoogleCodingConvention var4 = new com.google.javascript.jscomp.GoogleCodingConvention();
    boolean var7 = var4.isExported("", true);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.Node.newString("goog.exportSymbol", 10, 10);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var14 = var13.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var15 = var13.getJsDocBuilderForNode();
    com.google.javascript.rhino.Node var16 = var11.clonePropsFrom(var13);
    boolean var17 = var4.isOptionalParameter(var11);
    boolean var20 = var4.isExported("NUMBER 100.0\n", false);
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.Node.newString("goog.exportSymbol", 10, 10);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var27 = var26.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var28 = var26.getJsDocBuilderForNode();
    com.google.javascript.rhino.Node var29 = var24.clonePropsFrom(var26);
    int var30 = var26.getSourcePosition();
    com.google.javascript.rhino.JSDocInfo var31 = new com.google.javascript.rhino.JSDocInfo();
    boolean var32 = var31.isNoCompile();
    boolean var33 = var31.isExterns();
    boolean var34 = var31.hasReturnType();
    boolean var35 = var31.hasReturnType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var36 = var0.isConnected((java.lang.Object)var20, (java.lang.Object)var26, (java.lang.Object)var35);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test127"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.clearTemplateTypeName();
    var2.setLastGeneration(false);
    var2.resetForTypeCheck();
    var2.resetForTypeCheck();
    var2.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var13 = null;
    com.google.javascript.rhino.jstype.JSType var14 = null;
    com.google.javascript.rhino.jstype.JSType[] var15 = new com.google.javascript.rhino.jstype.JSType[] { var14};
    com.google.javascript.rhino.jstype.FunctionType var16 = var2.createConstructorType(var13, var15);
    java.lang.Iterable var17 = var16.getCtorExtendedInterfaces();
    boolean var18 = var16.hasImplementedInterfaces();
    boolean var19 = var16.isVoidType();
    com.google.javascript.rhino.Node var20 = var16.getParametersNode();
    com.google.javascript.jscomp.JSSourceFile var23 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    java.lang.String var24 = var23.getCode();
    java.lang.String var25 = var23.getName();
    var20.setStaticSourceFile((com.google.javascript.rhino.jstype.StaticSourceFile)var23);
    com.google.javascript.jscomp.parsing.Config.LanguageMode var29 = null;
    java.util.Set var31 = null;
    com.google.javascript.jscomp.parsing.Config var32 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(true, var29, false, var31);
    com.google.javascript.rhino.head.ErrorReporter var33 = null;
    java.util.logging.Logger var34 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var35 = com.google.javascript.jscomp.parsing.ParserRunner.parse((com.google.javascript.rhino.jstype.StaticSourceFile)var23, "Node tree inequality:\nTree1:\nNUMBER 1.0\n\n\nTree2:\nBITXOR\n    BITXOR hi!\n    LABEL_NAME hi!\n    PARAM_LIST\n    LABEL_NAME hi!\n\n\nSubtree1: NUMBER 1.0\n\n\nSubtree2: BITXOR\n    BITXOR hi!\n    LABEL_NAME hi!\n    PARAM_LIST\n    LABEL_NAME hi!\n", var32, var33, var34);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "goog.exportSymbol"+ "'", var25.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test128() {}
//   public void test128() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test128"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var2 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     com.google.javascript.jscomp.Scope var3 = var1.getTopScope();
//     com.google.javascript.jscomp.JSSourceFile var6 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
//     com.google.javascript.jscomp.JSSourceFile var9 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
//     boolean var10 = var9.isExtern();
//     boolean var11 = var9.isExtern();
//     com.google.javascript.jscomp.CompilerOptions var12 = new com.google.javascript.jscomp.CompilerOptions();
//     var12.setLooseTypes(false);
//     com.google.javascript.jscomp.Result var15 = var1.compile(var6, var9, var12);
//     java.io.PrintStream var16 = null;
//     com.google.javascript.jscomp.Compiler var17 = new com.google.javascript.jscomp.Compiler(var16);
//     com.google.javascript.jscomp.LightweightMessageFormatter var18 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var17);
//     com.google.javascript.jscomp.Scope var19 = var17.getTopScope();
//     com.google.javascript.jscomp.JSSourceFile var22 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
//     com.google.javascript.jscomp.JSSourceFile var25 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
//     boolean var26 = var25.isExtern();
//     boolean var27 = var25.isExtern();
//     com.google.javascript.jscomp.CompilerOptions var28 = new com.google.javascript.jscomp.CompilerOptions();
//     var28.setLooseTypes(false);
//     com.google.javascript.jscomp.Result var31 = var17.compile(var22, var25, var28);
//     com.google.javascript.jscomp.JSSourceFile[] var32 = new com.google.javascript.jscomp.JSSourceFile[] { var22};
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var33 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
//     com.google.javascript.rhino.JSDocInfo var34 = new com.google.javascript.rhino.JSDocInfo();
//     java.util.List var35 = var34.getExtendedInterfaces();
//     com.google.javascript.jscomp.JSModule[] var36 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var35);
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var37 = var33.getDirectedGraphNode((java.lang.Object)var36);
//     com.google.javascript.jscomp.CompilerOptions var38 = new com.google.javascript.jscomp.CompilerOptions();
//     var38.setLooseTypes(false);
//     var1.init(var32, var36, var38);
//     var1.check();
// 
//   }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test129"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("hi!");
    java.util.Set var2 = var1.getThisAndAllDependencies();
    com.google.javascript.jscomp.SourceFile var5 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
    java.io.Reader var6 = var5.getCodeReader();
    com.google.javascript.jscomp.JsAst var7 = new com.google.javascript.jscomp.JsAst(var5);
    var7.clearAst();
    var7.clearAst();
    com.google.javascript.rhino.InputId var10 = null;
    com.google.javascript.jscomp.CompilerInput var12 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var7, var10, true);
    int var13 = var12.getNumLines();
    var1.addFirst(var12);
    var12.clearAst();
    boolean var16 = var12.isExtern();
    java.io.PrintStream var17 = null;
    com.google.javascript.jscomp.Compiler var18 = new com.google.javascript.jscomp.Compiler(var17);
    com.google.javascript.jscomp.LightweightMessageFormatter var19 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var18);
    com.google.javascript.jscomp.Scope var20 = var18.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var23 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var26 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var27 = var26.isExtern();
    boolean var28 = var26.isExtern();
    com.google.javascript.jscomp.CompilerOptions var29 = new com.google.javascript.jscomp.CompilerOptions();
    var29.setLooseTypes(false);
    com.google.javascript.jscomp.Result var32 = var18.compile(var23, var26, var29);
    java.io.PrintStream var33 = null;
    com.google.javascript.jscomp.Compiler var34 = new com.google.javascript.jscomp.Compiler(var33);
    com.google.javascript.jscomp.LightweightMessageFormatter var35 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var34);
    com.google.javascript.jscomp.Scope var36 = var34.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var39 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var42 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var43 = var42.isExtern();
    boolean var44 = var42.isExtern();
    com.google.javascript.jscomp.CompilerOptions var45 = new com.google.javascript.jscomp.CompilerOptions();
    var45.setLooseTypes(false);
    com.google.javascript.jscomp.Result var48 = var34.compile(var39, var42, var45);
    com.google.javascript.jscomp.JSSourceFile[] var49 = new com.google.javascript.jscomp.JSSourceFile[] { var39};
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var50 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.rhino.JSDocInfo var51 = new com.google.javascript.rhino.JSDocInfo();
    java.util.List var52 = var51.getExtendedInterfaces();
    com.google.javascript.jscomp.JSModule[] var53 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var52);
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var54 = var50.getDirectedGraphNode((java.lang.Object)var53);
    com.google.javascript.jscomp.CompilerOptions var55 = new com.google.javascript.jscomp.CompilerOptions();
    var55.setLooseTypes(false);
    var18.init(var49, var53, var55);
    java.lang.String var59 = var18.toSource();
    com.google.javascript.rhino.Node var60 = var12.getAstRoot((com.google.javascript.jscomp.AbstractCompiler)var18);
    com.google.javascript.jscomp.SourceMap var61 = var18.getSourceMap();
    var18.processDefines();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + ""+ "'", var59.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test130"); }


    com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var3 = var2.isExtern();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var2.getLineOffset(0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test131"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.clearTemplateTypeName();
    var2.setLastGeneration(false);
    var2.resetForTypeCheck();
    var2.resetForTypeCheck();
    var2.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var13 = null;
    com.google.javascript.rhino.jstype.JSType var14 = null;
    com.google.javascript.rhino.jstype.JSType[] var15 = new com.google.javascript.rhino.jstype.JSType[] { var14};
    com.google.javascript.rhino.jstype.FunctionType var16 = var2.createConstructorType(var13, var15);
    java.lang.Iterable var17 = var16.getCtorExtendedInterfaces();
    java.lang.Iterable var18 = var16.getAllImplementedInterfaces();
    boolean var20 = var16.removeProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test132"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("hi!");
    com.google.javascript.jscomp.JSModule[] var2 = new com.google.javascript.jscomp.JSModule[] { var1};
    com.google.javascript.jscomp.JSModuleGraph var3 = new com.google.javascript.jscomp.JSModuleGraph(var2);
    com.google.javascript.jscomp.JSModuleGraph var4 = new com.google.javascript.jscomp.JSModuleGraph(var2);
    var4.coalesceDuplicateFiles();
    com.google.javascript.jscomp.DependencyOptions var6 = new com.google.javascript.jscomp.DependencyOptions();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var7 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.util.List var8 = var7.getGraphvizNodes();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.paramList(var8);
    java.util.List var10 = var4.manageDependencies(var6, var8);
    com.google.javascript.jscomp.deps.SortedDependencies var11 = new com.google.javascript.jscomp.deps.SortedDependencies(var10);
    java.util.List var12 = var11.getSortedList();
    com.google.javascript.rhino.ErrorReporter var13 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13, true);
    com.google.javascript.rhino.jstype.JSType var17 = null;
    boolean var18 = var15.declareType("hi!", var17);
    var15.clearTemplateTypeName();
    var15.setLastGeneration(false);
    var15.resetForTypeCheck();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var23 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.util.List var24 = var23.getGraphvizNodes();
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.paramList(var24);
    com.google.javascript.rhino.Node var26 = var15.createParametersWithVarArgs(var24);
    com.google.javascript.jscomp.JSModuleGraph var27 = new com.google.javascript.jscomp.JSModuleGraph(var24);
    com.google.javascript.rhino.ErrorReporter var28 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var28, true);
    com.google.javascript.rhino.jstype.JSType var32 = null;
    boolean var33 = var30.declareType("hi!", var32);
    var30.clearTemplateTypeName();
    var30.setLastGeneration(false);
    var30.resetForTypeCheck();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var38 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.util.List var39 = var38.getGraphvizNodes();
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.paramList(var39);
    com.google.javascript.rhino.Node var41 = var30.createParametersWithVarArgs(var39);
    com.google.javascript.jscomp.JSModuleGraph var42 = new com.google.javascript.jscomp.JSModuleGraph(var39);
    com.google.javascript.rhino.ErrorReporter var43 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var43, true);
    com.google.javascript.rhino.jstype.JSType var47 = null;
    boolean var48 = var45.declareType("hi!", var47);
    var45.clearTemplateTypeName();
    var45.setLastGeneration(false);
    var45.resetForTypeCheck();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var53 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.util.List var54 = var53.getGraphvizNodes();
    com.google.javascript.rhino.Node var55 = com.google.javascript.rhino.IR.paramList(var54);
    com.google.javascript.rhino.Node var56 = var45.createParametersWithVarArgs(var54);
    java.util.List var57 = var27.manageDependencies(var39, var54);
    java.util.List var59 = var11.getDependenciesOf(var57, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.deps.DependencyInfo var61 = var11.getInputProviding("NUMBER 100.0\n");
      fail("Expected exception of type com.google.javascript.jscomp.deps.SortedDependencies.MissingProvideException");
    } catch (com.google.javascript.jscomp.deps.SortedDependencies.MissingProvideException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
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

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test133"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    var0.clearNodeAnnotations();
    java.util.List var2 = var0.getGraphvizEdges();
    var0.pushEdgeAnnotations();
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.nullNode();
    boolean var5 = var4.wasEmptyNode();
    boolean var6 = var4.isWhile();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString(100, "");
    com.google.javascript.jscomp.DiagnosticType var15 = com.google.javascript.jscomp.DiagnosticType.warning("hi!", "");
    java.lang.String[] var17 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var18 = com.google.javascript.jscomp.JSError.make("hi!", 100, 0, var15, var17);
    com.google.javascript.jscomp.DiagnosticType[] var19 = new com.google.javascript.jscomp.DiagnosticType[] { var15};
    com.google.javascript.jscomp.DiagnosticGroup var20 = new com.google.javascript.jscomp.DiagnosticGroup(var19);
    com.google.javascript.jscomp.CheckLevel var24 = null;
    com.google.javascript.jscomp.DiagnosticType var27 = com.google.javascript.jscomp.DiagnosticType.error("goog.exportSymbol", "");
    java.lang.String[] var29 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var30 = com.google.javascript.jscomp.JSError.make("LinkedGraph", 100, 100, var24, var27, var29);
    boolean var31 = var20.matches(var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var32 = var0.isConnected((java.lang.Object)var4, (java.lang.Object)100, (java.lang.Object)var27);
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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test134() {}
//   public void test134() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test134"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
//     com.google.javascript.rhino.jstype.JSType var4 = null;
//     boolean var5 = var2.declareType("hi!", var4);
//     var2.clearTemplateTypeName();
//     var2.setLastGeneration(false);
//     var2.incrementGeneration();
//     var2.identifyNonNullableName("(goog.exportSymbol)");
//     com.google.javascript.rhino.ErrorReporter var12 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var12, true);
//     com.google.javascript.rhino.jstype.JSType var16 = null;
//     boolean var17 = var14.declareType("hi!", var16);
//     var14.clearTemplateTypeName();
//     var14.setLastGeneration(false);
//     var14.resetForTypeCheck();
//     var14.resetForTypeCheck();
//     var14.setLastGeneration(false);
//     com.google.javascript.rhino.ErrorReporter var25 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25, true);
//     com.google.javascript.rhino.jstype.JSType var29 = null;
//     boolean var30 = var27.declareType("hi!", var29);
//     var27.clearTemplateTypeName();
//     var27.setLastGeneration(false);
//     var27.resetForTypeCheck();
//     com.google.javascript.rhino.jstype.JSType var36 = null;
//     var27.unregisterPropertyOnType("", var36);
//     com.google.javascript.rhino.ErrorReporter var38 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var38, true);
//     com.google.javascript.rhino.jstype.JSType var42 = null;
//     boolean var43 = var40.declareType("hi!", var42);
//     var40.clearTemplateTypeName();
//     var40.setLastGeneration(false);
//     var40.resetForTypeCheck();
//     var40.resetForTypeCheck();
//     var40.setLastGeneration(false);
//     com.google.javascript.rhino.jstype.JSType var51 = null;
//     com.google.javascript.rhino.jstype.JSType var52 = null;
//     com.google.javascript.rhino.jstype.JSType[] var53 = new com.google.javascript.rhino.jstype.JSType[] { var52};
//     com.google.javascript.rhino.jstype.FunctionType var54 = var40.createConstructorType(var51, var53);
//     java.lang.Iterable var55 = var54.getCtorExtendedInterfaces();
//     com.google.javascript.rhino.ErrorReporter var57 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var57, true);
//     com.google.javascript.rhino.jstype.JSType var61 = null;
//     boolean var62 = var59.declareType("hi!", var61);
//     var59.clearTemplateTypeName();
//     var59.setLastGeneration(false);
//     var59.resetForTypeCheck();
//     var59.resetForTypeCheck();
//     var59.setLastGeneration(false);
//     com.google.javascript.rhino.jstype.JSType var70 = null;
//     com.google.javascript.rhino.jstype.JSType var71 = null;
//     com.google.javascript.rhino.jstype.JSType[] var72 = new com.google.javascript.rhino.jstype.JSType[] { var71};
//     com.google.javascript.rhino.jstype.FunctionType var73 = var59.createConstructorType(var70, var72);
//     com.google.javascript.rhino.jstype.FunctionType var74 = var27.createFunctionType((com.google.javascript.rhino.jstype.JSType)var54, false, var72);
//     com.google.javascript.rhino.Node var75 = var14.createParameters(var72);
//     com.google.javascript.rhino.jstype.JSType var76 = var2.createUnionType(var72);
// 
//   }

  public void test135() {}
//   public void test135() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test135"); }
// 
// 
//     com.google.javascript.jscomp.DependencyOptions var0 = new com.google.javascript.jscomp.DependencyOptions();
//     var0.setDependencyPruning(false);
//     java.util.Collection var3 = null;
//     var0.setEntryPoints(var3);
// 
//   }

  public void test136() {}
//   public void test136() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test136"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
//     com.google.javascript.rhino.jstype.JSType var4 = null;
//     boolean var5 = var2.declareType("hi!", var4);
//     var2.clearTemplateTypeName();
//     var2.setLastGeneration(false);
//     var2.resetForTypeCheck();
//     var2.resetForTypeCheck();
//     var2.setLastGeneration(false);
//     com.google.javascript.rhino.jstype.JSType var13 = null;
//     com.google.javascript.rhino.jstype.JSType var14 = null;
//     com.google.javascript.rhino.jstype.JSType[] var15 = new com.google.javascript.rhino.jstype.JSType[] { var14};
//     com.google.javascript.rhino.jstype.FunctionType var16 = var2.createConstructorType(var13, var15);
//     java.lang.Iterable var17 = var16.getCtorExtendedInterfaces();
//     boolean var18 = var16.hasImplementedInterfaces();
//     boolean var19 = var16.hasImplementedInterfaces();
//     java.lang.Iterable var20 = var16.getAllExtendedInterfaces();
//     int var21 = var16.getMaxArguments();
//     com.google.javascript.rhino.ErrorReporter var22 = null;
//     com.google.javascript.rhino.ErrorReporter var23 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var23, true);
//     com.google.javascript.rhino.jstype.JSType var27 = null;
//     boolean var28 = var25.declareType("hi!", var27);
//     var25.clearTemplateTypeName();
//     var25.setLastGeneration(false);
//     var25.resetForTypeCheck();
//     var25.resetForTypeCheck();
//     var25.setLastGeneration(false);
//     com.google.javascript.rhino.jstype.JSType var36 = null;
//     com.google.javascript.rhino.jstype.JSType var37 = null;
//     com.google.javascript.rhino.jstype.JSType[] var38 = new com.google.javascript.rhino.jstype.JSType[] { var37};
//     com.google.javascript.rhino.jstype.FunctionType var39 = var25.createConstructorType(var36, var38);
//     java.lang.Iterable var40 = var39.getCtorExtendedInterfaces();
//     boolean var41 = var39.isArrayType();
//     com.google.javascript.rhino.ErrorReporter var42 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var42, true);
//     com.google.javascript.rhino.jstype.JSType var46 = null;
//     boolean var47 = var44.declareType("hi!", var46);
//     var44.clearTemplateTypeName();
//     var44.setLastGeneration(false);
//     com.google.javascript.rhino.ErrorReporter var51 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var51, true);
//     com.google.javascript.rhino.jstype.JSType var55 = null;
//     boolean var56 = var53.declareType("hi!", var55);
//     var53.clearTemplateTypeName();
//     var53.setLastGeneration(false);
//     var53.resetForTypeCheck();
//     var53.resetForTypeCheck();
//     var53.setLastGeneration(false);
//     com.google.javascript.rhino.jstype.JSType var64 = null;
//     com.google.javascript.rhino.jstype.JSType var65 = null;
//     com.google.javascript.rhino.jstype.JSType[] var66 = new com.google.javascript.rhino.jstype.JSType[] { var65};
//     com.google.javascript.rhino.jstype.FunctionType var67 = var53.createConstructorType(var64, var66);
//     java.lang.Iterable var68 = var67.getCtorExtendedInterfaces();
//     boolean var69 = var67.hasImplementedInterfaces();
//     boolean var70 = var67.hasImplementedInterfaces();
//     com.google.javascript.rhino.jstype.JSType var71 = var44.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType)var67);
//     com.google.javascript.rhino.jstype.FunctionType var72 = var67.toMaybeFunctionType();
//     com.google.javascript.rhino.Node var74 = var67.getPropertyNode("goog.exportProperty");
//     com.google.javascript.rhino.jstype.FunctionType var75 = var67.getSuperClassConstructor();
//     com.google.javascript.rhino.jstype.JSType var76 = var39.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType)var75);
//     com.google.javascript.rhino.jstype.JSType var77 = var16.resolve(var22, (com.google.javascript.rhino.jstype.StaticScope)var39);
// 
//   }

  public void test137() {}
//   public void test137() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test137"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
//     com.google.javascript.rhino.jstype.JSType var4 = null;
//     boolean var5 = var2.declareType("hi!", var4);
//     var2.clearTemplateTypeName();
//     var2.setLastGeneration(false);
//     var2.resetForTypeCheck();
//     var2.resetForTypeCheck();
//     var2.setLastGeneration(false);
//     com.google.javascript.rhino.ErrorReporter var13 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13, true);
//     com.google.javascript.rhino.jstype.JSType var17 = null;
//     boolean var18 = var15.declareType("hi!", var17);
//     var15.clearTemplateTypeName();
//     var15.setLastGeneration(false);
//     var15.resetForTypeCheck();
//     com.google.javascript.rhino.jstype.JSType var24 = null;
//     var15.unregisterPropertyOnType("", var24);
//     com.google.javascript.rhino.ErrorReporter var26 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var26, true);
//     com.google.javascript.rhino.jstype.JSType var30 = null;
//     boolean var31 = var28.declareType("hi!", var30);
//     var28.clearTemplateTypeName();
//     var28.setLastGeneration(false);
//     var28.resetForTypeCheck();
//     var28.resetForTypeCheck();
//     var28.setLastGeneration(false);
//     com.google.javascript.rhino.jstype.JSType var39 = null;
//     com.google.javascript.rhino.jstype.JSType var40 = null;
//     com.google.javascript.rhino.jstype.JSType[] var41 = new com.google.javascript.rhino.jstype.JSType[] { var40};
//     com.google.javascript.rhino.jstype.FunctionType var42 = var28.createConstructorType(var39, var41);
//     java.lang.Iterable var43 = var42.getCtorExtendedInterfaces();
//     com.google.javascript.rhino.ErrorReporter var45 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var45, true);
//     com.google.javascript.rhino.jstype.JSType var49 = null;
//     boolean var50 = var47.declareType("hi!", var49);
//     var47.clearTemplateTypeName();
//     var47.setLastGeneration(false);
//     var47.resetForTypeCheck();
//     var47.resetForTypeCheck();
//     var47.setLastGeneration(false);
//     com.google.javascript.rhino.jstype.JSType var58 = null;
//     com.google.javascript.rhino.jstype.JSType var59 = null;
//     com.google.javascript.rhino.jstype.JSType[] var60 = new com.google.javascript.rhino.jstype.JSType[] { var59};
//     com.google.javascript.rhino.jstype.FunctionType var61 = var47.createConstructorType(var58, var60);
//     com.google.javascript.rhino.jstype.FunctionType var62 = var15.createFunctionType((com.google.javascript.rhino.jstype.JSType)var42, false, var60);
//     com.google.javascript.rhino.Node var63 = var2.createParameters(var60);
//     com.google.javascript.rhino.ErrorReporter var64 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var64, true);
//     com.google.javascript.rhino.jstype.JSType var68 = null;
//     boolean var69 = var66.declareType("hi!", var68);
//     var66.clearTemplateTypeName();
//     var66.setLastGeneration(false);
//     var66.resetForTypeCheck();
//     com.google.javascript.rhino.jstype.JSType var75 = null;
//     var66.unregisterPropertyOnType("", var75);
//     com.google.javascript.rhino.jstype.JSTypeNative[] var77 = com.google.javascript.rhino.jstype.JSTypeNative.values();
//     com.google.javascript.rhino.jstype.JSType var78 = var66.createUnionType(var77);
//     com.google.javascript.rhino.jstype.JSType var79 = var2.createUnionType(var77);
//     com.google.javascript.rhino.jstype.JSTypeNative var80 = null;
//     com.google.javascript.rhino.jstype.FunctionType var81 = var2.getNativeFunctionType(var80);
// 
//   }

  public void test138() {}
//   public void test138() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test138"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var2 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     var1.disableThreads();
//     com.google.javascript.jscomp.CompilerOptions var4 = new com.google.javascript.jscomp.CompilerOptions();
//     var4.setLooseTypes(false);
//     var4.setShadowVariables(true);
//     var1.initOptions(var4);
//     com.google.javascript.jscomp.CompilerInput var11 = var1.newExternInput("BLOCK");
// 
//   }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test139"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    boolean var1 = var0.isNoCompile();
    boolean var2 = var0.isExterns();
    java.util.List var3 = var0.getImplementedInterfaces();
    com.google.javascript.rhino.JSDocInfo.Visibility var4 = var0.getVisibility();
    boolean var5 = var0.isHidden();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test140() {}
//   public void test140() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test140"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
//     com.google.javascript.rhino.jstype.JSType var4 = null;
//     boolean var5 = var2.declareType("hi!", var4);
//     var2.clearTemplateTypeName();
//     var2.setLastGeneration(false);
//     var2.resetForTypeCheck();
//     var2.resetForTypeCheck();
//     var2.setTemplateTypeName("");
//     com.google.javascript.rhino.ErrorReporter var13 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13, true);
//     com.google.javascript.rhino.jstype.JSType var17 = null;
//     boolean var18 = var15.declareType("hi!", var17);
//     var15.clearNamedTypes();
//     com.google.javascript.rhino.ErrorReporter var21 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21, true);
//     com.google.javascript.rhino.jstype.JSType var25 = null;
//     boolean var26 = var23.declareType("hi!", var25);
//     var23.clearTemplateTypeName();
//     var23.setLastGeneration(false);
//     var23.resetForTypeCheck();
//     com.google.javascript.rhino.jstype.JSType var32 = null;
//     var23.unregisterPropertyOnType("", var32);
//     com.google.javascript.rhino.ErrorReporter var34 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var34, true);
//     com.google.javascript.rhino.jstype.JSType var38 = null;
//     boolean var39 = var36.declareType("hi!", var38);
//     var36.clearTemplateTypeName();
//     var36.setLastGeneration(false);
//     var36.resetForTypeCheck();
//     var36.resetForTypeCheck();
//     var36.setLastGeneration(false);
//     com.google.javascript.rhino.jstype.JSType var47 = null;
//     com.google.javascript.rhino.jstype.JSType var48 = null;
//     com.google.javascript.rhino.jstype.JSType[] var49 = new com.google.javascript.rhino.jstype.JSType[] { var48};
//     com.google.javascript.rhino.jstype.FunctionType var50 = var36.createConstructorType(var47, var49);
//     java.lang.Iterable var51 = var50.getCtorExtendedInterfaces();
//     com.google.javascript.rhino.ErrorReporter var53 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var53, true);
//     com.google.javascript.rhino.jstype.JSType var57 = null;
//     boolean var58 = var55.declareType("hi!", var57);
//     var55.clearTemplateTypeName();
//     var55.setLastGeneration(false);
//     var55.resetForTypeCheck();
//     var55.resetForTypeCheck();
//     var55.setLastGeneration(false);
//     com.google.javascript.rhino.jstype.JSType var66 = null;
//     com.google.javascript.rhino.jstype.JSType var67 = null;
//     com.google.javascript.rhino.jstype.JSType[] var68 = new com.google.javascript.rhino.jstype.JSType[] { var67};
//     com.google.javascript.rhino.jstype.FunctionType var69 = var55.createConstructorType(var66, var68);
//     com.google.javascript.rhino.jstype.FunctionType var70 = var23.createFunctionType((com.google.javascript.rhino.jstype.JSType)var50, false, var68);
//     var15.overwriteDeclaredType("hi!", (com.google.javascript.rhino.jstype.JSType)var50);
//     boolean var72 = var50.isNullable();
//     int var73 = var50.getMinArguments();
//     boolean var74 = var50.canBeCalled();
//     com.google.javascript.rhino.jstype.JSType var79 = var2.getType((com.google.javascript.rhino.jstype.StaticScope)var50, "FALSE", "digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node1 [label=\"SCRIPT\"];\n  node0 -> node1 [weight=1];\n  node1 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n  node0 -> RETURN [label=\"SYN_BLOCK\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n  node0 -> node1 [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n", 100, 0);
//     com.google.javascript.rhino.jstype.FunctionParamBuilder var80 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var2);
//     com.google.javascript.rhino.jstype.JSTypeNative var81 = null;
//     com.google.javascript.rhino.jstype.FunctionType var82 = var2.getNativeFunctionType(var81);
// 
//   }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test141"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString(0, "", 0, 100);
    int var5 = var4.getLineno();
    com.google.javascript.jscomp.ClosureCodingConvention var6 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var7 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var8 = var6.getDelegateRelationship(var7);
    java.lang.String var9 = var6.getExportSymbolFunction();
    boolean var12 = var6.isExported("hi!", true);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var15 = var14.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var16 = var14.getJsDocBuilderForNode();
    boolean var17 = var14.isOptionalArg();
    java.lang.String var18 = var14.toString();
    var14.setString("");
    boolean var21 = var14.isDo();
    boolean var22 = var14.hasChildren();
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.paramList();
    java.lang.String var24 = var6.extractClassNameIfRequire(var14, var23);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var27 = var26.isOr();
    boolean var28 = var26.isTry();
    boolean var29 = var6.isVarArgsParameter(var26);
    var4.addChildToBack(var26);
    com.google.javascript.rhino.Node var31 = var4.removeFirstChild();
    com.google.javascript.jscomp.SourceFile var34 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
    java.io.Reader var35 = var34.getCodeReader();
    com.google.javascript.jscomp.JsAst var36 = new com.google.javascript.jscomp.JsAst(var34);
    var36.clearAst();
    var36.clearAst();
    com.google.javascript.rhino.InputId var39 = null;
    com.google.javascript.jscomp.CompilerInput var41 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var36, var39, true);
    com.google.javascript.jscomp.SourceFile var42 = var36.getSourceFile();
    com.google.javascript.rhino.InputId var43 = var36.getInputId();
    var4.setInputId(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "goog.exportSymbol"+ "'", var9.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "LABEL_NAME hi!"+ "'", var18.equals("LABEL_NAME hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test142"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    var0.clearNodeAnnotations();
    java.util.List var2 = var0.getGraphvizEdges();
    var0.pushEdgeAnnotations();
    java.io.PrintStream var4 = null;
    com.google.javascript.jscomp.Compiler var5 = new com.google.javascript.jscomp.Compiler(var4);
    com.google.javascript.jscomp.LightweightMessageFormatter var6 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var5);
    com.google.javascript.jscomp.Scope var7 = var5.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var10 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var13 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var14 = var13.isExtern();
    boolean var15 = var13.isExtern();
    com.google.javascript.jscomp.CompilerOptions var16 = new com.google.javascript.jscomp.CompilerOptions();
    var16.setLooseTypes(false);
    com.google.javascript.jscomp.Result var19 = var5.compile(var10, var13, var16);
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var22 = var21.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var23 = var21.getJsDocBuilderForNode();
    boolean var24 = var21.isOptionalArg();
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var27 = var26.isOr();
    var21.addChildToBack(var26);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.number(1.0d);
    com.google.javascript.rhino.Node var31 = var30.getNext();
    boolean var32 = var30.isCall();
    boolean var33 = var21.isEquivalentTo(var30);
    boolean var34 = var21.isGetElem();
    boolean var35 = var21.isDebugger();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var36 = var0.isConnectedInDirection((java.lang.Object)var5, (java.lang.Object)var35);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test143"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setLooseTypes(false);
    var0.setGeneratePseudoNames(true);
    com.google.javascript.jscomp.CheckLevel var5 = null;
    var0.setCheckProvides(var5);
    var0.setIgnoreCajaProperties(true);
    var0.setRecordFunctionInformation(false);
    var0.setMarkAsCompiled(false);

  }

  public void test144() {}
//   public void test144() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test144"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     var1.disableThreads();
//     com.google.javascript.jscomp.LightweightMessageFormatter var3 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     com.google.javascript.jscomp.Compiler.IntermediateState var4 = var1.getState();
//     var1.disableThreads();
//     var1.processDefines();
// 
//   }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test145"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(1.0d);
    com.google.javascript.rhino.Node var2 = var1.getNext();
    boolean var3 = var1.isCall();
    boolean var4 = var1.isTry();
    boolean var5 = var1.isVoid();
    boolean var6 = var1.isAnd();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.continueNode();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.Node.newString(0, "", 0, 100);
    int var13 = var12.getLineno();
    com.google.javascript.jscomp.ClosureCodingConvention var14 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var15 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var16 = var14.getDelegateRelationship(var15);
    java.lang.String var17 = var14.getExportSymbolFunction();
    boolean var20 = var14.isExported("hi!", true);
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var23 = var22.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var24 = var22.getJsDocBuilderForNode();
    boolean var25 = var22.isOptionalArg();
    java.lang.String var26 = var22.toString();
    var22.setString("");
    boolean var29 = var22.isDo();
    boolean var30 = var22.hasChildren();
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.paramList();
    java.lang.String var32 = var14.extractClassNameIfRequire(var22, var31);
    com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var35 = var34.isOr();
    boolean var36 = var34.isTry();
    boolean var37 = var14.isVarArgsParameter(var34);
    var12.addChildToBack(var34);
    com.google.javascript.rhino.Node var39 = var7.useSourceInfoFrom(var34);
    boolean var40 = var1.isEquivalentTo(var39);
    com.google.javascript.jscomp.ClosureCodingConvention var41 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var42 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var43 = var41.getDelegateRelationship(var42);
    java.lang.String var44 = var41.getExportSymbolFunction();
    boolean var47 = var41.isExported("hi!", true);
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var50 = var49.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var51 = var49.getJsDocBuilderForNode();
    boolean var52 = var49.isOptionalArg();
    java.lang.String var53 = var49.toString();
    var49.setString("");
    boolean var56 = var49.isDo();
    boolean var57 = var49.hasChildren();
    com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.paramList();
    java.lang.String var59 = var41.extractClassNameIfRequire(var49, var58);
    com.google.javascript.rhino.Node var61 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var62 = var61.isOr();
    boolean var63 = var61.isTry();
    boolean var64 = var41.isVarArgsParameter(var61);
    com.google.javascript.rhino.Node var65 = var39.useSourceInfoFrom(var61);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var65.setString("BLOCK");
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "goog.exportSymbol"+ "'", var17.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "LABEL_NAME hi!"+ "'", var26.equals("LABEL_NAME hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "goog.exportSymbol"+ "'", var44.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "LABEL_NAME hi!"+ "'", var53.equals("LABEL_NAME hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test146"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.clearTemplateTypeName();
    var2.setLastGeneration(false);
    var2.resetForTypeCheck();
    var2.resetForTypeCheck();
    var2.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var13 = null;
    com.google.javascript.rhino.jstype.JSType var14 = null;
    com.google.javascript.rhino.jstype.JSType[] var15 = new com.google.javascript.rhino.jstype.JSType[] { var14};
    com.google.javascript.rhino.jstype.FunctionType var16 = var2.createConstructorType(var13, var15);
    java.lang.Iterable var17 = var16.getImplementedInterfaces();
    boolean var18 = var16.isRegexpType();
    boolean var19 = var16.isEnumType();
    com.google.javascript.rhino.ErrorReporter var20 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var20, true);
    com.google.javascript.rhino.jstype.JSType var24 = null;
    boolean var25 = var22.declareType("hi!", var24);
    var22.incrementGeneration();
    com.google.javascript.rhino.jstype.JSTypeNative[] var27 = com.google.javascript.rhino.jstype.JSTypeNative.values();
    com.google.javascript.rhino.jstype.JSType var28 = var22.createUnionType(var27);
    com.google.javascript.rhino.jstype.TernaryValue var29 = var16.testForEquality(var28);
    java.lang.Class var30 = var29.getDeclaringClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test147() {}
//   public void test147() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test147"); }
// 
// 
//     java.io.File var0 = null;
//     java.nio.charset.Charset var1 = null;
//     com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromFile(var0, var1);
// 
//   }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test148"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.Node.newString("InputId: BITXOR");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test149"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.clearTemplateTypeName();
    var2.setLastGeneration(false);
    var2.resetForTypeCheck();
    com.google.javascript.rhino.jstype.JSType var11 = null;
    var2.unregisterPropertyOnType("", var11);
    com.google.javascript.rhino.ErrorReporter var13 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13, true);
    com.google.javascript.rhino.jstype.JSType var17 = null;
    boolean var18 = var15.declareType("hi!", var17);
    var15.clearTemplateTypeName();
    var15.setLastGeneration(false);
    var15.resetForTypeCheck();
    var15.resetForTypeCheck();
    var15.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var26 = null;
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.rhino.jstype.JSType[] var28 = new com.google.javascript.rhino.jstype.JSType[] { var27};
    com.google.javascript.rhino.jstype.FunctionType var29 = var15.createConstructorType(var26, var28);
    java.lang.Iterable var30 = var29.getCtorExtendedInterfaces();
    com.google.javascript.rhino.ErrorReporter var32 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32, true);
    com.google.javascript.rhino.jstype.JSType var36 = null;
    boolean var37 = var34.declareType("hi!", var36);
    var34.clearTemplateTypeName();
    var34.setLastGeneration(false);
    var34.resetForTypeCheck();
    var34.resetForTypeCheck();
    var34.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var45 = null;
    com.google.javascript.rhino.jstype.JSType var46 = null;
    com.google.javascript.rhino.jstype.JSType[] var47 = new com.google.javascript.rhino.jstype.JSType[] { var46};
    com.google.javascript.rhino.jstype.FunctionType var48 = var34.createConstructorType(var45, var47);
    com.google.javascript.rhino.jstype.FunctionType var49 = var2.createFunctionType((com.google.javascript.rhino.jstype.JSType)var29, false, var47);
    var2.clearTemplateTypeName();
    com.google.javascript.rhino.ErrorReporter var52 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var52, true);
    com.google.javascript.rhino.jstype.JSType var56 = null;
    boolean var57 = var54.declareType("hi!", var56);
    var54.clearTemplateTypeName();
    var54.setLastGeneration(false);
    var54.resetForTypeCheck();
    var54.resetForTypeCheck();
    var54.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var65 = null;
    com.google.javascript.rhino.jstype.JSType var66 = null;
    com.google.javascript.rhino.jstype.JSType[] var67 = new com.google.javascript.rhino.jstype.JSType[] { var66};
    com.google.javascript.rhino.jstype.FunctionType var68 = var54.createConstructorType(var65, var67);
    java.lang.Iterable var69 = var68.getCtorExtendedInterfaces();
    boolean var70 = var68.hasImplementedInterfaces();
    boolean var71 = var68.isNullable();
    com.google.javascript.rhino.jstype.ObjectType var72 = var68.getInstanceType();
    boolean var73 = var68.isInterface();
    var68.clearCachedValues();
    var2.unregisterPropertyOnType("LABEL_NAME hi!", (com.google.javascript.rhino.jstype.JSType)var68);
    com.google.javascript.rhino.ErrorReporter var77 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var79 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var77, true);
    com.google.javascript.rhino.jstype.JSType var81 = null;
    boolean var82 = var79.declareType("hi!", var81);
    var79.clearTemplateTypeName();
    var79.setLastGeneration(false);
    var79.resetForTypeCheck();
    var79.resetForTypeCheck();
    var79.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var90 = null;
    com.google.javascript.rhino.jstype.JSType var91 = null;
    com.google.javascript.rhino.jstype.JSType[] var92 = new com.google.javascript.rhino.jstype.JSType[] { var91};
    com.google.javascript.rhino.jstype.FunctionType var93 = var79.createConstructorType(var90, var92);
    java.lang.Iterable var94 = var93.getCtorExtendedInterfaces();
    java.lang.Iterable var95 = var93.getAllImplementedInterfaces();
    java.lang.Iterable var96 = var93.getCtorExtendedInterfaces();
    com.google.javascript.rhino.jstype.JSType var97 = var93.autobox();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.overwriteDeclaredType("()", (com.google.javascript.rhino.jstype.JSType)var93);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == true);
    
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

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test150"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newString("goog.exportSymbol", 10, 10);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var6 = var5.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var7 = var5.getJsDocBuilderForNode();
    com.google.javascript.rhino.Node var8 = var3.clonePropsFrom(var5);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var11 = var10.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var12 = var10.getJsDocBuilderForNode();
    boolean var13 = var10.isOptionalArg();
    java.lang.String var14 = var10.toString();
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.Node.newString(0, "", 0, 100);
    int var20 = var19.getLineno();
    com.google.javascript.jscomp.ClosureCodingConvention var21 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var22 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var23 = var21.getDelegateRelationship(var22);
    java.lang.String var24 = var21.getExportSymbolFunction();
    boolean var27 = var21.isExported("hi!", true);
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var30 = var29.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var31 = var29.getJsDocBuilderForNode();
    boolean var32 = var29.isOptionalArg();
    java.lang.String var33 = var29.toString();
    var29.setString("");
    boolean var36 = var29.isDo();
    boolean var37 = var29.hasChildren();
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.paramList();
    java.lang.String var39 = var21.extractClassNameIfRequire(var29, var38);
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var42 = var41.isOr();
    boolean var43 = var41.isTry();
    boolean var44 = var21.isVarArgsParameter(var41);
    var19.addChildToBack(var41);
    com.google.javascript.rhino.Node var46 = var10.copyInformationFromForTree(var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.sheq(var3, var46);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "LABEL_NAME hi!"+ "'", var14.equals("LABEL_NAME hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "goog.exportSymbol"+ "'", var24.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "LABEL_NAME hi!"+ "'", var33.equals("LABEL_NAME hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test151"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setRemoveUnusedPrototypeProperties(false);
    com.google.javascript.jscomp.CompilerOptions.TracerMode var3 = null;
    var0.setTracer(var3);
    com.google.javascript.jscomp.CompilerOptions var5 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler var6 = var5.getAliasTransformationHandler();
    var0.setAliasTransformationHandler(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test152"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.paramList();
    boolean var1 = var0.isNew();
    boolean var2 = var0.isGetElem();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.falseNode();
    boolean var4 = var3.isHook();
    java.lang.String var8 = var3.toString(false, true, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.eq(var0, var3);
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
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "FALSE"+ "'", var8.equals("FALSE"));

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test153"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.Node.newString(10, "hi!");
    boolean var3 = var2.isNoSideEffectsCall();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var7 = var6.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var8 = var6.getJsDocBuilderForNode();
    boolean var9 = var6.isOptionalArg();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var12 = var11.isOr();
    var6.addChildToBack(var11);
    boolean var14 = var6.isBreak();
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var17 = var16.isOr();
    var16.setCharno(100);
    com.google.javascript.rhino.Node var22 = new com.google.javascript.rhino.Node(100, var6, var16, 0, (-1));
    boolean var23 = var16.isIn();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.regexp(var2, var16);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test154"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setLooseTypes(false);
    var0.setDeadAssignmentElimination(true);
    boolean var5 = var0.shouldColorizeErrorOutput();
    var0.setSyntheticBlockStartMarker("SCRIPT [source_file: (goog.exportSymbol)] [input_id: InputId: (goog.exportSymbol)]");
    com.google.javascript.jscomp.CompilerOptions.TracerMode var8 = null;
    var0.setTracer(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test155"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.jstype.FunctionType var1 = null;
    com.google.javascript.rhino.jstype.FunctionType var2 = null;
    com.google.javascript.jscomp.CodingConvention.SubclassType var3 = null;
    var0.applySubclassRelationship(var1, var2, var3);
    boolean var6 = var0.isSuperClassReference("hi!");
    com.google.javascript.jscomp.JSModule var8 = new com.google.javascript.jscomp.JSModule("hi!");
    java.util.Set var9 = var8.getThisAndAllDependencies();
    com.google.javascript.jscomp.SourceFile var12 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
    java.io.Reader var13 = var12.getCodeReader();
    com.google.javascript.jscomp.JsAst var14 = new com.google.javascript.jscomp.JsAst(var12);
    var14.clearAst();
    var14.clearAst();
    com.google.javascript.rhino.InputId var17 = null;
    com.google.javascript.jscomp.CompilerInput var19 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var14, var17, true);
    int var20 = var19.getNumLines();
    var8.addFirst(var19);
    var19.clearAst();
    boolean var23 = var19.isExtern();
    java.io.PrintStream var24 = null;
    com.google.javascript.jscomp.Compiler var25 = new com.google.javascript.jscomp.Compiler(var24);
    com.google.javascript.jscomp.LightweightMessageFormatter var26 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var25);
    com.google.javascript.jscomp.Scope var27 = var25.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var30 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var33 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var34 = var33.isExtern();
    boolean var35 = var33.isExtern();
    com.google.javascript.jscomp.CompilerOptions var36 = new com.google.javascript.jscomp.CompilerOptions();
    var36.setLooseTypes(false);
    com.google.javascript.jscomp.Result var39 = var25.compile(var30, var33, var36);
    java.io.PrintStream var40 = null;
    com.google.javascript.jscomp.Compiler var41 = new com.google.javascript.jscomp.Compiler(var40);
    com.google.javascript.jscomp.LightweightMessageFormatter var42 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var41);
    com.google.javascript.jscomp.Scope var43 = var41.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var46 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var49 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var50 = var49.isExtern();
    boolean var51 = var49.isExtern();
    com.google.javascript.jscomp.CompilerOptions var52 = new com.google.javascript.jscomp.CompilerOptions();
    var52.setLooseTypes(false);
    com.google.javascript.jscomp.Result var55 = var41.compile(var46, var49, var52);
    com.google.javascript.jscomp.JSSourceFile[] var56 = new com.google.javascript.jscomp.JSSourceFile[] { var46};
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var57 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.rhino.JSDocInfo var58 = new com.google.javascript.rhino.JSDocInfo();
    java.util.List var59 = var58.getExtendedInterfaces();
    com.google.javascript.jscomp.JSModule[] var60 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var59);
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var61 = var57.getDirectedGraphNode((java.lang.Object)var60);
    com.google.javascript.jscomp.CompilerOptions var62 = new com.google.javascript.jscomp.CompilerOptions();
    var62.setLooseTypes(false);
    var25.init(var56, var60, var62);
    java.lang.String var66 = var25.toSource();
    com.google.javascript.rhino.Node var67 = var19.getAstRoot((com.google.javascript.jscomp.AbstractCompiler)var25);
    java.lang.String var68 = var67.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var69 = var0.isPropertyTestFunction(var67);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + ""+ "'", var66.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "SCRIPT [source_file: (goog.exportSymbol)] [input_id: InputId: (goog.exportSymbol)]"+ "'", var68.equals("SCRIPT [source_file: (goog.exportSymbol)] [input_id: InputId: (goog.exportSymbol)]"));

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test156"); }


    com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.abstractMethod", "LinkedGraph");
    java.lang.String var3 = var2.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "LinkedGraph"+ "'", var3.equals("LinkedGraph"));

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test157"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var3 = var2.isOr();
    boolean var4 = var2.isTry();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.paramList();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var8 = var7.isOr();
    com.google.javascript.rhino.Node var9 = new com.google.javascript.rhino.Node(10, var2, var5, var7);
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.Node.newString(10, "hi!");
    var9.addChildToFront(var12);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.falseNode();
    var14.setIsSyntheticBlock(true);
    java.lang.String var17 = var9.checkTreeEquals(var14);
    boolean var18 = var9.isAnd();
    var9.setCharno(0);
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.neg(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var22 = var21.detachFromParent();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Node tree inequality:\nTree1:\nBITXOR\n    BITXOR hi!\n    LABEL_NAME hi!\n    PARAM_LIST\n    LABEL_NAME hi!\n\n\nTree2:\nFALSE [synthetic: 1]\n\n\nSubtree1: BITXOR\n    BITXOR hi!\n    LABEL_NAME hi!\n    PARAM_LIST\n    LABEL_NAME hi!\n\n\nSubtree2: FALSE [synthetic: 1]\n"+ "'", var17.equals("Node tree inequality:\nTree1:\nBITXOR\n    BITXOR hi!\n    LABEL_NAME hi!\n    PARAM_LIST\n    LABEL_NAME hi!\n\n\nTree2:\nFALSE [synthetic: 1]\n\n\nSubtree1: BITXOR\n    BITXOR hi!\n    LABEL_NAME hi!\n    PARAM_LIST\n    LABEL_NAME hi!\n\n\nSubtree2: FALSE [synthetic: 1]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test158"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setRewriteFunctionExpressions(false);
    boolean var3 = var0.assumeClosuresOnlyCaptureReferences();
    com.google.javascript.jscomp.SourceMap.DetailLevel var4 = null;
    var0.setSourceMapDetailLevel(var4);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var6 = var0.getTweakProcessing();
    var0.setOptimizeArgumentsArray(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test159() {}
//   public void test159() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test159"); }
// 
// 
//     java.io.InputStream var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromInputStream("", var1);
// 
//   }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test160"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.PropertyRenamingPolicy var1 = com.google.javascript.jscomp.PropertyRenamingPolicy.valueOf("LABEL_NAME hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test161"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.Compiler.IntermediateState var2 = var1.getState();
    com.google.javascript.jscomp.JSSourceFile var5 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    java.lang.String var6 = var5.getCode();
    com.google.javascript.jscomp.JSSourceFile[] var7 = new com.google.javascript.jscomp.JSSourceFile[] { var5};
    com.google.javascript.jscomp.JSModule var9 = new com.google.javascript.jscomp.JSModule("hi!");
    com.google.javascript.jscomp.JSModule[] var10 = new com.google.javascript.jscomp.JSModule[] { var9};
    com.google.javascript.jscomp.JSModuleGraph var11 = new com.google.javascript.jscomp.JSModuleGraph(var10);
    com.google.javascript.jscomp.JSModule var13 = new com.google.javascript.jscomp.JSModule("hi!");
    java.util.Set var14 = var13.getAllDependencies();
    java.util.List var15 = var13.getProvides();
    com.google.javascript.jscomp.JSModule var17 = new com.google.javascript.jscomp.JSModule("hi!");
    java.lang.String var18 = var17.toString();
    boolean var19 = var11.dependsOn(var13, var17);
    com.google.javascript.jscomp.JSModule[] var20 = new com.google.javascript.jscomp.JSModule[] { var17};
    com.google.javascript.jscomp.CompilerOptions var21 = new com.google.javascript.jscomp.CompilerOptions();
    var21.setLooseTypes(false);
    var21.setDeadAssignmentElimination(true);
    java.lang.Object var26 = var21.clone();
    var21.setOptimizeCalls(true);
    com.google.javascript.jscomp.Result var29 = var1.compile(var7, var20, var21);
    var1.rebuildInputsFromModules();
    var1.disableThreads();
    java.io.PrintStream var32 = null;
    com.google.javascript.jscomp.Compiler var33 = new com.google.javascript.jscomp.Compiler(var32);
    com.google.javascript.jscomp.LightweightMessageFormatter var34 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var33);
    com.google.javascript.jscomp.Scope var35 = var33.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var38 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var41 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var42 = var41.isExtern();
    boolean var43 = var41.isExtern();
    com.google.javascript.jscomp.CompilerOptions var44 = new com.google.javascript.jscomp.CompilerOptions();
    var44.setLooseTypes(false);
    com.google.javascript.jscomp.Result var47 = var33.compile(var38, var41, var44);
    java.io.PrintStream var48 = null;
    com.google.javascript.jscomp.Compiler var49 = new com.google.javascript.jscomp.Compiler(var48);
    com.google.javascript.jscomp.LightweightMessageFormatter var50 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var49);
    com.google.javascript.jscomp.Scope var51 = var49.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var54 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var57 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var58 = var57.isExtern();
    boolean var59 = var57.isExtern();
    com.google.javascript.jscomp.CompilerOptions var60 = new com.google.javascript.jscomp.CompilerOptions();
    var60.setLooseTypes(false);
    com.google.javascript.jscomp.Result var63 = var49.compile(var54, var57, var60);
    com.google.javascript.jscomp.JSSourceFile[] var64 = new com.google.javascript.jscomp.JSSourceFile[] { var54};
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var65 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.rhino.JSDocInfo var66 = new com.google.javascript.rhino.JSDocInfo();
    java.util.List var67 = var66.getExtendedInterfaces();
    com.google.javascript.jscomp.JSModule[] var68 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var67);
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var69 = var65.getDirectedGraphNode((java.lang.Object)var68);
    com.google.javascript.jscomp.CompilerOptions var70 = new com.google.javascript.jscomp.CompilerOptions();
    var70.setLooseTypes(false);
    var33.init(var64, var68, var70);
    com.google.javascript.jscomp.Compiler.IntermediateState var74 = var33.getState();
    var1.setState(var74);
    var1.reportCodeChange();
    boolean var77 = var1.acceptEcmaScript5();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test162"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.continueNode();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.Node.newString(0, "", 0, 100);
    int var6 = var5.getLineno();
    com.google.javascript.jscomp.ClosureCodingConvention var7 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var8 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var9 = var7.getDelegateRelationship(var8);
    java.lang.String var10 = var7.getExportSymbolFunction();
    boolean var13 = var7.isExported("hi!", true);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var16 = var15.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var17 = var15.getJsDocBuilderForNode();
    boolean var18 = var15.isOptionalArg();
    java.lang.String var19 = var15.toString();
    var15.setString("");
    boolean var22 = var15.isDo();
    boolean var23 = var15.hasChildren();
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.paramList();
    java.lang.String var25 = var7.extractClassNameIfRequire(var15, var24);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var28 = var27.isOr();
    boolean var29 = var27.isTry();
    boolean var30 = var7.isVarArgsParameter(var27);
    var5.addChildToBack(var27);
    com.google.javascript.rhino.Node var32 = var0.useSourceInfoFrom(var27);
    com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var36 = var35.isOr();
    boolean var37 = var35.isTry();
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.paramList();
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var41 = var40.isOr();
    com.google.javascript.rhino.Node var42 = new com.google.javascript.rhino.Node(10, var35, var38, var40);
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.pos(var42);
    com.google.javascript.jscomp.SourceFile var46 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
    java.io.Reader var47 = var46.getCodeReader();
    var43.setStaticSourceFile((com.google.javascript.rhino.jstype.StaticSourceFile)var46);
    int var49 = var43.getChildCount();
    java.lang.Iterable var50 = var43.siblings();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.getprop(var0, var43);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "goog.exportSymbol"+ "'", var10.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "LABEL_NAME hi!"+ "'", var19.equals("LABEL_NAME hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test163"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    boolean var1 = var0.isNoCompile();
    boolean var2 = var0.isExterns();
    boolean var3 = var0.hasReturnType();
    boolean var5 = var0.hasDescriptionForParameter("hi!");
    com.google.javascript.rhino.JSTypeExpression var6 = var0.getTypedefType();
    java.lang.String var7 = var0.getBlockDescription();
    boolean var8 = var0.shouldPreserveTry();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test164"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.clearTemplateTypeName();
    var2.setLastGeneration(false);
    var2.resetForTypeCheck();
    var2.resetForTypeCheck();
    var2.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var13 = null;
    com.google.javascript.rhino.jstype.JSType var14 = null;
    com.google.javascript.rhino.jstype.JSType[] var15 = new com.google.javascript.rhino.jstype.JSType[] { var14};
    com.google.javascript.rhino.jstype.FunctionType var16 = var2.createConstructorType(var13, var15);
    java.lang.Iterable var17 = var16.getCtorExtendedInterfaces();
    boolean var18 = var16.hasImplementedInterfaces();
    boolean var19 = var16.isNullable();
    com.google.javascript.rhino.jstype.ObjectType var20 = var16.getInstanceType();
    com.google.javascript.rhino.jstype.ObjectType var21 = var16.getPrototype();
    com.google.javascript.rhino.jstype.FunctionType var23 = var16.getBindReturnType((-1));
    boolean var24 = var16.isFunctionType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test165"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    var0.clearNodeAnnotations();
    java.util.List var2 = var0.getGraphvizEdges();
    java.lang.String var3 = var0.getName();
    java.lang.Iterable var4 = var0.getDirectedGraphNodes();
    java.util.List var5 = var0.getGraphvizNodes();
    java.lang.Object var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var7 = var0.getDirectedPredNodes(var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "LinkedGraph"+ "'", var3.equals("LinkedGraph"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test166"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    var0.clearNodeAnnotations();
    java.util.List var2 = var0.getGraphvizEdges();
    java.lang.Object var3 = null;
    com.google.javascript.jscomp.graph.GraphNode var4 = var0.createNode(var3);
    com.google.javascript.rhino.ErrorReporter var5 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var5, true);
    com.google.javascript.rhino.jstype.JSType var9 = null;
    boolean var10 = var7.declareType("hi!", var9);
    var7.clearTemplateTypeName();
    var7.setLastGeneration(false);
    var7.resetForTypeCheck();
    com.google.javascript.rhino.ErrorReporter var15 = var7.getErrorReporter();
    com.google.javascript.rhino.ErrorReporter var16 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var16, true);
    com.google.javascript.rhino.jstype.JSType var20 = null;
    boolean var21 = var18.declareType("hi!", var20);
    var18.clearTemplateTypeName();
    var18.setLastGeneration(false);
    var18.resetForTypeCheck();
    var18.resetForTypeCheck();
    var18.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var29 = null;
    com.google.javascript.rhino.jstype.JSType var30 = null;
    com.google.javascript.rhino.jstype.JSType[] var31 = new com.google.javascript.rhino.jstype.JSType[] { var30};
    com.google.javascript.rhino.jstype.FunctionType var32 = var18.createConstructorType(var29, var31);
    java.lang.Iterable var33 = var32.getCtorExtendedInterfaces();
    boolean var34 = var32.hasImplementedInterfaces();
    boolean var35 = var32.hasImplementedInterfaces();
    com.google.javascript.rhino.Node var36 = null;
    com.google.javascript.rhino.jstype.FunctionType var37 = var7.createFunctionType((com.google.javascript.rhino.jstype.JSType)var32, var36);
    com.google.javascript.rhino.jstype.FunctionBuilder var38 = new com.google.javascript.rhino.jstype.FunctionBuilder(var7);
    com.google.javascript.rhino.jstype.FunctionBuilder var40 = var38.setIsConstructor(false);
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.block();
    java.io.PrintStream var42 = null;
    com.google.javascript.jscomp.Compiler var43 = new com.google.javascript.jscomp.Compiler(var42);
    com.google.javascript.jscomp.LightweightMessageFormatter var44 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var43);
    com.google.javascript.jscomp.Scope var45 = var43.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var48 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var51 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var52 = var51.isExtern();
    boolean var53 = var51.isExtern();
    com.google.javascript.jscomp.CompilerOptions var54 = new com.google.javascript.jscomp.CompilerOptions();
    var54.setLooseTypes(false);
    com.google.javascript.jscomp.Result var57 = var43.compile(var48, var51, var54);
    var51.clearCachedSource();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var59 = var0.isConnected((java.lang.Object)var38, (java.lang.Object)var41, (java.lang.Object)var51);
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
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test167"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.clearTemplateTypeName();
    var2.setLastGeneration(false);
    var2.resetForTypeCheck();
    var2.resetForTypeCheck();
    var2.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var13 = null;
    com.google.javascript.rhino.jstype.JSType var14 = null;
    com.google.javascript.rhino.jstype.JSType[] var15 = new com.google.javascript.rhino.jstype.JSType[] { var14};
    com.google.javascript.rhino.jstype.FunctionType var16 = var2.createConstructorType(var13, var15);
    java.lang.Iterable var17 = var16.getImplementedInterfaces();
    com.google.javascript.rhino.Node var18 = var16.getRootNode();
    boolean var19 = var16.isNumberValueType();
    com.google.javascript.rhino.JSDocInfo var21 = new com.google.javascript.rhino.JSDocInfo();
    java.util.List var22 = var21.getExtendedInterfaces();
    java.lang.String var23 = var21.getVersion();
    var16.setPropertyJSDocInfo("LABEL_NAME hi!", var21);
    boolean var25 = var21.hasFileOverview();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test168"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.block();
    int var1 = var0.getType();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.paramList();
    boolean var3 = var2.hasOneChild();
    var2.setType(0);
    var0.addChildToBack(var2);
    boolean var7 = var0.isThis();
    com.google.javascript.rhino.Node var9 = var0.getChildAtIndex((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.throwNode(var0);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 125);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test169"); }


    com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
    java.io.Reader var3 = var2.getCodeReader();
    int var5 = var2.getLineOffset(1);
    java.lang.String var6 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(goog.exportSymbol)"+ "'", var6.equals("(goog.exportSymbol)"));

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test170"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    var1.disableThreads();
    com.google.javascript.jscomp.LightweightMessageFormatter var3 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
    com.google.javascript.jscomp.JSSourceFile var6 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    java.io.PrintStream var7 = null;
    com.google.javascript.jscomp.Compiler var8 = new com.google.javascript.jscomp.Compiler(var7);
    com.google.javascript.jscomp.LightweightMessageFormatter var9 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var8);
    com.google.javascript.jscomp.Scope var10 = var8.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var13 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var16 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var17 = var16.isExtern();
    boolean var18 = var16.isExtern();
    com.google.javascript.jscomp.CompilerOptions var19 = new com.google.javascript.jscomp.CompilerOptions();
    var19.setLooseTypes(false);
    com.google.javascript.jscomp.Result var22 = var8.compile(var13, var16, var19);
    java.io.PrintStream var23 = null;
    com.google.javascript.jscomp.Compiler var24 = new com.google.javascript.jscomp.Compiler(var23);
    com.google.javascript.jscomp.LightweightMessageFormatter var25 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var24);
    com.google.javascript.jscomp.Scope var26 = var24.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var29 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var32 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var33 = var32.isExtern();
    boolean var34 = var32.isExtern();
    com.google.javascript.jscomp.CompilerOptions var35 = new com.google.javascript.jscomp.CompilerOptions();
    var35.setLooseTypes(false);
    com.google.javascript.jscomp.Result var38 = var24.compile(var29, var32, var35);
    com.google.javascript.jscomp.JSSourceFile[] var39 = new com.google.javascript.jscomp.JSSourceFile[] { var29};
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var40 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.rhino.JSDocInfo var41 = new com.google.javascript.rhino.JSDocInfo();
    java.util.List var42 = var41.getExtendedInterfaces();
    com.google.javascript.jscomp.JSModule[] var43 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var42);
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var44 = var40.getDirectedGraphNode((java.lang.Object)var43);
    com.google.javascript.jscomp.CompilerOptions var45 = new com.google.javascript.jscomp.CompilerOptions();
    var45.setLooseTypes(false);
    var8.init(var39, var43, var45);
    com.google.javascript.jscomp.CompilerOptions var49 = new com.google.javascript.jscomp.CompilerOptions();
    var49.setLooseTypes(false);
    var49.setDeadAssignmentElimination(true);
    boolean var54 = var49.shouldColorizeErrorOutput();
    var49.setDefineToStringLiteral("hi!", "goog.exportSymbol");
    com.google.javascript.jscomp.Result var58 = var1.compile(var6, var39, var49);
    var1.reportCodeChange();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.normalize();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test171"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.jstype.FunctionType var1 = null;
    com.google.javascript.rhino.jstype.FunctionType var2 = null;
    com.google.javascript.jscomp.CodingConvention.SubclassType var3 = null;
    var0.applySubclassRelationship(var1, var2, var3);
    boolean var6 = var0.isSuperClassReference("hi!");
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var10 = var9.isOr();
    boolean var11 = var9.isTry();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.paramList();
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var15 = var14.isOr();
    com.google.javascript.rhino.Node var16 = new com.google.javascript.rhino.Node(10, var9, var12, var14);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.voidNode(var16);
    boolean var18 = var16.isUnscopedQualifiedName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var19 = var0.isPropertyTestFunction(var16);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test172"); }


    com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
    java.io.Reader var3 = var2.getCodeReader();
    com.google.javascript.jscomp.JsAst var4 = new com.google.javascript.jscomp.JsAst(var2);
    var4.clearAst();
    com.google.javascript.rhino.InputId var6 = null;
    com.google.javascript.jscomp.CompilerInput var8 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var4, var6, false);
    java.util.logging.Logger var9 = null;
    com.google.javascript.jscomp.LoggerErrorManager var10 = new com.google.javascript.jscomp.LoggerErrorManager(var9);
    var8.setErrorManager((com.google.javascript.jscomp.ErrorManager)var10);
    var10.setTypedPercent(0.0d);
    int var14 = var10.getErrorCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test173"); }


    java.util.logging.Logger var0 = null;
    com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
    com.google.javascript.jscomp.JSError[] var2 = var1.getErrors();
    var1.generateReport();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test174"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.util.List var1 = var0.getGraphvizNodes();
    var0.clearNodeAnnotations();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var6 = var5.isOr();
    boolean var7 = var5.isTry();
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.paramList();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var11 = var10.isOr();
    com.google.javascript.rhino.Node var12 = new com.google.javascript.rhino.Node(10, var5, var8, var10);
    com.google.javascript.rhino.Node var13 = var5.removeChildren();
    com.google.javascript.rhino.Node var14 = var5.cloneNode();
    com.google.javascript.rhino.JSDocInfo var15 = var5.getJSDocInfo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var16 = var0.getDirectedPredNodes((java.lang.Object)var5);
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
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test175() {}
//   public void test175() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test175"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var2 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     com.google.javascript.rhino.JSDocInfo var3 = new com.google.javascript.rhino.JSDocInfo();
//     java.util.List var4 = var3.getExtendedInterfaces();
//     com.google.javascript.jscomp.JSModule[] var5 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var4);
//     com.google.javascript.jscomp.JSModule var7 = new com.google.javascript.jscomp.JSModule("hi!");
//     com.google.javascript.jscomp.JSModule[] var8 = new com.google.javascript.jscomp.JSModule[] { var7};
//     com.google.javascript.jscomp.JSModuleGraph var9 = new com.google.javascript.jscomp.JSModuleGraph(var8);
//     com.google.javascript.jscomp.JSModuleGraph var10 = new com.google.javascript.jscomp.JSModuleGraph(var8);
//     var10.coalesceDuplicateFiles();
//     com.google.javascript.jscomp.DependencyOptions var12 = new com.google.javascript.jscomp.DependencyOptions();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var13 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
//     java.util.List var14 = var13.getGraphvizNodes();
//     com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.paramList(var14);
//     java.util.List var16 = var10.manageDependencies(var12, var14);
//     com.google.javascript.jscomp.JSModule var18 = new com.google.javascript.jscomp.JSModule("(goog.exportSymbol)");
//     java.util.List var19 = var18.getInputs();
//     com.google.javascript.jscomp.JSModule var21 = new com.google.javascript.jscomp.JSModule("hi!");
//     java.util.Set var22 = var21.getAllDependencies();
//     java.util.List var23 = var21.getProvides();
//     com.google.javascript.jscomp.JSModule var25 = new com.google.javascript.jscomp.JSModule("hi!");
//     com.google.javascript.jscomp.JSModule[] var26 = new com.google.javascript.jscomp.JSModule[] { var25};
//     com.google.javascript.jscomp.JSModuleGraph var27 = new com.google.javascript.jscomp.JSModuleGraph(var26);
//     com.google.javascript.jscomp.JSModule var29 = new com.google.javascript.jscomp.JSModule("hi!");
//     java.util.Set var30 = var29.getAllDependencies();
//     java.util.List var31 = var29.getProvides();
//     com.google.javascript.jscomp.JSModule var33 = new com.google.javascript.jscomp.JSModule("hi!");
//     java.lang.String var34 = var33.toString();
//     boolean var35 = var27.dependsOn(var29, var33);
//     com.google.javascript.jscomp.SourceFile var38 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
//     java.io.Reader var39 = var38.getCodeReader();
//     com.google.javascript.jscomp.JsAst var40 = new com.google.javascript.jscomp.JsAst(var38);
//     var40.clearAst();
//     com.google.javascript.rhino.InputId var42 = null;
//     com.google.javascript.jscomp.CompilerInput var44 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var40, var42, false);
//     var29.remove(var44);
//     com.google.javascript.jscomp.JSModule var46 = var44.getModule();
//     var21.addFirst(var44);
//     boolean var48 = var10.dependsOn(var18, var21);
//     com.google.javascript.jscomp.JSModule var50 = new com.google.javascript.jscomp.JSModule("hi!");
//     com.google.javascript.jscomp.JSModule[] var51 = new com.google.javascript.jscomp.JSModule[] { var50};
//     com.google.javascript.jscomp.JSModuleGraph var52 = new com.google.javascript.jscomp.JSModuleGraph(var51);
//     com.google.javascript.jscomp.JSModuleGraph var53 = new com.google.javascript.jscomp.JSModuleGraph(var51);
//     var53.coalesceDuplicateFiles();
//     com.google.javascript.jscomp.DependencyOptions var55 = new com.google.javascript.jscomp.DependencyOptions();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var56 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
//     java.util.List var57 = var56.getGraphvizNodes();
//     com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.paramList(var57);
//     java.util.List var59 = var53.manageDependencies(var55, var57);
//     var55.setMoocherDropping(false);
//     com.google.javascript.jscomp.JSModule var63 = new com.google.javascript.jscomp.JSModule("hi!");
//     java.util.Set var64 = var63.getAllDependencies();
//     var63.setDepth((-1));
//     java.util.List var67 = var63.getInputs();
//     java.util.List var68 = var10.manageDependencies(var55, var67);
//     com.google.javascript.jscomp.CompilerOptions var69 = new com.google.javascript.jscomp.CompilerOptions();
//     var69.setLooseTypes(false);
//     var69.setGeneratePseudoNames(true);
//     com.google.javascript.jscomp.CompilerOptions.TweakProcessing var74 = null;
//     var69.setTweakProcessing(var74);
//     var69.setUnaliasableGlobals("goog.exportSymbol");
//     com.google.javascript.jscomp.CheckLevel var78 = null;
//     var69.setCheckGlobalThisLevel(var78);
//     var69.setChainCalls(true);
//     var69.setColorizeErrorOutput(true);
//     var1.initModules(var4, var68, var69);
// 
//   }

  public void test176() {}
//   public void test176() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test176"); }
// 
// 
//     com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("hi!");
//     java.util.Set var2 = var1.getAllDependencies();
//     var1.setDepth((-1));
//     com.google.javascript.jscomp.JSSourceFile var5 = null;
//     var1.addFirst(var5);
// 
//   }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test177"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var2 = var1.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var3 = var1.getJsDocBuilderForNode();
    boolean var4 = var1.isOptionalArg();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var7 = var6.isOr();
    var1.addChildToBack(var6);
    int var9 = var1.getCharno();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.paramList();
    java.lang.Iterable var12 = var11.siblings();
    boolean var13 = var11.hasChildren();
    com.google.javascript.rhino.Node[] var14 = new com.google.javascript.rhino.Node[] { var11};
    com.google.javascript.rhino.Node var17 = new com.google.javascript.rhino.Node(1, var14, 100, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.newNode(var1, var14);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
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
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test178"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.clearTemplateTypeName();
    var2.setLastGeneration(false);
    var2.resetForTypeCheck();
    var2.resetForTypeCheck();
    var2.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var13 = null;
    com.google.javascript.rhino.jstype.JSType var14 = null;
    com.google.javascript.rhino.jstype.JSType[] var15 = new com.google.javascript.rhino.jstype.JSType[] { var14};
    com.google.javascript.rhino.jstype.FunctionType var16 = var2.createConstructorType(var13, var15);
    java.lang.Iterable var17 = var16.getCtorExtendedInterfaces();
    boolean var18 = var16.hasImplementedInterfaces();
    com.google.javascript.rhino.ErrorReporter var19 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var19, true);
    com.google.javascript.rhino.jstype.JSType var23 = null;
    boolean var24 = var21.declareType("hi!", var23);
    var21.clearTemplateTypeName();
    var21.setLastGeneration(false);
    var21.resetForTypeCheck();
    var21.resetForTypeCheck();
    var21.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var32 = null;
    com.google.javascript.rhino.jstype.JSType var33 = null;
    com.google.javascript.rhino.jstype.JSType[] var34 = new com.google.javascript.rhino.jstype.JSType[] { var33};
    com.google.javascript.rhino.jstype.FunctionType var35 = var21.createConstructorType(var32, var34);
    boolean var36 = var16.isEquivalentTo(var32);
    boolean var37 = var16.isReturnTypeInferred();
    java.util.Set var38 = var16.getOwnPropertyNames();
    boolean var39 = var16.isFunctionPrototypeType();
    com.google.javascript.rhino.jstype.BooleanLiteralSet var40 = var16.getPossibleToBooleanOutcomes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test179"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.clearNamedTypes();
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8, true);
    com.google.javascript.rhino.jstype.JSType var12 = null;
    boolean var13 = var10.declareType("hi!", var12);
    var10.clearTemplateTypeName();
    var10.setLastGeneration(false);
    var10.resetForTypeCheck();
    com.google.javascript.rhino.jstype.JSType var19 = null;
    var10.unregisterPropertyOnType("", var19);
    com.google.javascript.rhino.ErrorReporter var21 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21, true);
    com.google.javascript.rhino.jstype.JSType var25 = null;
    boolean var26 = var23.declareType("hi!", var25);
    var23.clearTemplateTypeName();
    var23.setLastGeneration(false);
    var23.resetForTypeCheck();
    var23.resetForTypeCheck();
    var23.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var34 = null;
    com.google.javascript.rhino.jstype.JSType var35 = null;
    com.google.javascript.rhino.jstype.JSType[] var36 = new com.google.javascript.rhino.jstype.JSType[] { var35};
    com.google.javascript.rhino.jstype.FunctionType var37 = var23.createConstructorType(var34, var36);
    java.lang.Iterable var38 = var37.getCtorExtendedInterfaces();
    com.google.javascript.rhino.ErrorReporter var40 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var40, true);
    com.google.javascript.rhino.jstype.JSType var44 = null;
    boolean var45 = var42.declareType("hi!", var44);
    var42.clearTemplateTypeName();
    var42.setLastGeneration(false);
    var42.resetForTypeCheck();
    var42.resetForTypeCheck();
    var42.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var53 = null;
    com.google.javascript.rhino.jstype.JSType var54 = null;
    com.google.javascript.rhino.jstype.JSType[] var55 = new com.google.javascript.rhino.jstype.JSType[] { var54};
    com.google.javascript.rhino.jstype.FunctionType var56 = var42.createConstructorType(var53, var55);
    com.google.javascript.rhino.jstype.FunctionType var57 = var10.createFunctionType((com.google.javascript.rhino.jstype.JSType)var37, false, var55);
    var2.overwriteDeclaredType("hi!", (com.google.javascript.rhino.jstype.JSType)var37);
    boolean var59 = var37.isNullable();
    com.google.javascript.rhino.ErrorReporter var60 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var60, true);
    com.google.javascript.rhino.jstype.JSType var64 = null;
    boolean var65 = var62.declareType("hi!", var64);
    var62.clearTemplateTypeName();
    var62.setLastGeneration(false);
    var62.resetForTypeCheck();
    var62.resetForTypeCheck();
    var62.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var73 = null;
    com.google.javascript.rhino.jstype.JSType var74 = null;
    com.google.javascript.rhino.jstype.JSType[] var75 = new com.google.javascript.rhino.jstype.JSType[] { var74};
    com.google.javascript.rhino.jstype.FunctionType var76 = var62.createConstructorType(var73, var75);
    java.lang.Iterable var77 = var76.getImplementedInterfaces();
    com.google.javascript.rhino.Node var78 = var76.getRootNode();
    boolean var79 = var37.hasEqualCallType(var76);
    boolean var80 = var37.matchesUint32Context();
    com.google.javascript.rhino.jstype.FunctionType var82 = var37.getBindReturnType(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test180"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var2 = var1.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var3 = var1.getJsDocBuilderForNode();
    boolean var4 = var1.isOptionalArg();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var7 = var6.isOr();
    var1.addChildToBack(var6);
    int var9 = var1.getCharno();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var10 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.util.List var11 = var10.getGraphvizNodes();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.paramList(var11);
    com.google.javascript.rhino.Node var13 = var1.useSourceInfoFrom(var12);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var18 = var17.isOr();
    boolean var19 = var17.isTry();
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.paramList();
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var23 = var22.isOr();
    com.google.javascript.rhino.Node var24 = new com.google.javascript.rhino.Node(10, var17, var20, var22);
    boolean var25 = var24.isDebugger();
    com.google.javascript.rhino.Node[] var26 = new com.google.javascript.rhino.Node[] { var24};
    com.google.javascript.rhino.Node var29 = new com.google.javascript.rhino.Node(100, var26, 100, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.newNode(var1, var26);
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
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test181() {}
//   public void test181() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test181"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString("goog.exportSymbol", 10, 10);
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.labelName("hi!");
//     boolean var7 = var6.isOr();
//     com.google.javascript.rhino.Node.FileLevelJsDocBuilder var8 = var6.getJsDocBuilderForNode();
//     com.google.javascript.rhino.Node var9 = var4.clonePropsFrom(var6);
//     boolean var10 = var6.isWith();
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.tryFinally(var0, var6);
// 
//   }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test182"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.LightweightMessageFormatter var2 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
    com.google.javascript.jscomp.Scope var3 = var1.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var6 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var9 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var10 = var9.isExtern();
    boolean var11 = var9.isExtern();
    com.google.javascript.jscomp.CompilerOptions var12 = new com.google.javascript.jscomp.CompilerOptions();
    var12.setLooseTypes(false);
    com.google.javascript.jscomp.Result var15 = var1.compile(var6, var9, var12);
    var12.setRenamePrefixNamespace("LinkedGraph");
    var12.setSmartNameRemoval(false);
    var12.setLabelRenaming(true);
    var12.setSourceMapOutputPath("InputId: BITXOR");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test183"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.clearTemplateTypeName();
    var2.setLastGeneration(false);
    var2.resetForTypeCheck();
    com.google.javascript.rhino.jstype.JSType var11 = null;
    var2.unregisterPropertyOnType("", var11);
    com.google.javascript.rhino.ErrorReporter var13 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13, true);
    com.google.javascript.rhino.jstype.JSType var17 = null;
    boolean var18 = var15.declareType("hi!", var17);
    var15.clearTemplateTypeName();
    var15.setLastGeneration(false);
    var15.resetForTypeCheck();
    var15.resetForTypeCheck();
    var15.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var26 = null;
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.rhino.jstype.JSType[] var28 = new com.google.javascript.rhino.jstype.JSType[] { var27};
    com.google.javascript.rhino.jstype.FunctionType var29 = var15.createConstructorType(var26, var28);
    java.lang.Iterable var30 = var29.getCtorExtendedInterfaces();
    com.google.javascript.rhino.ErrorReporter var32 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32, true);
    com.google.javascript.rhino.jstype.JSType var36 = null;
    boolean var37 = var34.declareType("hi!", var36);
    var34.clearTemplateTypeName();
    var34.setLastGeneration(false);
    var34.resetForTypeCheck();
    var34.resetForTypeCheck();
    var34.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var45 = null;
    com.google.javascript.rhino.jstype.JSType var46 = null;
    com.google.javascript.rhino.jstype.JSType[] var47 = new com.google.javascript.rhino.jstype.JSType[] { var46};
    com.google.javascript.rhino.jstype.FunctionType var48 = var34.createConstructorType(var45, var47);
    com.google.javascript.rhino.jstype.FunctionType var49 = var2.createFunctionType((com.google.javascript.rhino.jstype.JSType)var29, false, var47);
    com.google.javascript.rhino.ErrorReporter var50 = var2.getErrorReporter();
    com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.IR.paramList();
    boolean var53 = var52.hasOneChild();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var54 = var52.getJsDocBuilderForNode();
    com.google.javascript.rhino.Node var56 = new com.google.javascript.rhino.Node(100);
    com.google.javascript.jscomp.ClosureCodingConvention var57 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var58 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var59 = var57.getDelegateRelationship(var58);
    com.google.javascript.rhino.Node var62 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var63 = var62.isOr();
    boolean var64 = var62.isTry();
    com.google.javascript.rhino.Node var65 = com.google.javascript.rhino.IR.paramList();
    com.google.javascript.rhino.Node var67 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var68 = var67.isOr();
    com.google.javascript.rhino.Node var69 = new com.google.javascript.rhino.Node(10, var62, var65, var67);
    com.google.javascript.rhino.Node var70 = com.google.javascript.rhino.IR.pos(var69);
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var71 = var57.getDelegateRelationship(var69);
    com.google.javascript.rhino.Node var73 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var74 = var73.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var75 = var73.getJsDocBuilderForNode();
    boolean var76 = var73.isOptionalArg();
    com.google.javascript.rhino.Node var78 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var79 = var78.isOr();
    var73.addChildToBack(var78);
    int var81 = var73.getCharno();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var82 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.util.List var83 = var82.getGraphvizNodes();
    com.google.javascript.rhino.Node var84 = com.google.javascript.rhino.IR.paramList(var83);
    com.google.javascript.rhino.Node var85 = var73.useSourceInfoFrom(var84);
    com.google.javascript.rhino.Node var88 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var89 = var88.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var90 = var88.getJsDocBuilderForNode();
    boolean var91 = var88.isOptionalArg();
    com.google.javascript.rhino.Node var92 = new com.google.javascript.rhino.Node(1, var88);
    java.lang.String var93 = var57.extractClassNameIfProvide(var85, var88);
    com.google.javascript.rhino.Node var94 = new com.google.javascript.rhino.Node(100, var52, var56, var85);
    com.google.javascript.rhino.jstype.StaticScope var96 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.JSType var97 = var2.createFromTypeNodes(var85, "InputId: BITXOR", var96);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var93);

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test184"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("hi!");
    java.util.Set var2 = var1.getThisAndAllDependencies();
    com.google.javascript.jscomp.SourceFile var5 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
    java.io.Reader var6 = var5.getCodeReader();
    com.google.javascript.jscomp.JsAst var7 = new com.google.javascript.jscomp.JsAst(var5);
    var7.clearAst();
    var7.clearAst();
    com.google.javascript.rhino.InputId var10 = null;
    com.google.javascript.jscomp.CompilerInput var12 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var7, var10, true);
    int var13 = var12.getNumLines();
    var1.addFirst(var12);
    var12.clearAst();
    boolean var16 = var12.isExtern();
    com.google.javascript.rhino.InputId var17 = var12.getInputId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test185"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    boolean var1 = var0.isNoCompile();
    boolean var2 = var0.isNoTypeCheck();
    com.google.javascript.rhino.JSTypeExpression var3 = var0.getThisType();
    java.util.Collection var4 = var0.getReferences();
    java.lang.String var5 = var0.getDeprecationReason();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test186"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    boolean var1 = var0.isNoCompile();
    boolean var2 = var0.isExterns();
    java.lang.String var3 = var0.getOriginalCommentString();
    java.lang.String var4 = var0.getTemplateTypeName();
    java.lang.String var5 = var0.getSourceName();
    boolean var7 = var0.hasParameterType("");
    com.google.javascript.rhino.JSTypeExpression var8 = var0.getEnumParameterType();
    java.lang.String var9 = var0.getLicense();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test187"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("hi!");
    java.util.Set var2 = var1.getThisAndAllDependencies();
    com.google.javascript.jscomp.SourceFile var5 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
    java.io.Reader var6 = var5.getCodeReader();
    com.google.javascript.jscomp.JsAst var7 = new com.google.javascript.jscomp.JsAst(var5);
    var7.clearAst();
    var7.clearAst();
    com.google.javascript.rhino.InputId var10 = null;
    com.google.javascript.jscomp.CompilerInput var12 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var7, var10, true);
    com.google.javascript.jscomp.JSModule var14 = new com.google.javascript.jscomp.JSModule("hi!");
    java.lang.String var15 = var14.toString();
    int var16 = var14.getDepth();
    java.lang.String var17 = var14.getName();
    com.google.javascript.jscomp.CompilerInput var19 = var14.getByName("");
    com.google.javascript.jscomp.SourceFile var22 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
    java.io.Reader var23 = var22.getCodeReader();
    com.google.javascript.jscomp.JsAst var24 = new com.google.javascript.jscomp.JsAst(var22);
    var24.clearAst();
    var24.clearAst();
    com.google.javascript.rhino.InputId var27 = null;
    com.google.javascript.jscomp.CompilerInput var29 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var24, var27, true);
    java.lang.String var30 = var29.getCode();
    var14.addFirst(var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addAfter(var12, var29);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test188"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.LightweightMessageFormatter var2 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
    var1.disableThreads();
    com.google.javascript.jscomp.CompilerOptions var4 = new com.google.javascript.jscomp.CompilerOptions();
    var4.setLooseTypes(false);
    var4.setShadowVariables(true);
    var1.initOptions(var4);
    var4.setExtractPrototypeMemberDeclarations(false);
    com.google.javascript.rhino.ErrorReporter var12 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var12, true);
    com.google.javascript.rhino.jstype.JSType var16 = null;
    boolean var17 = var14.declareType("hi!", var16);
    var14.clearTemplateTypeName();
    var14.setLastGeneration(false);
    var14.resetForTypeCheck();
    var14.resetForTypeCheck();
    var14.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var25 = null;
    com.google.javascript.rhino.jstype.JSType var26 = null;
    com.google.javascript.rhino.jstype.JSType[] var27 = new com.google.javascript.rhino.jstype.JSType[] { var26};
    com.google.javascript.rhino.jstype.FunctionType var28 = var14.createConstructorType(var25, var27);
    java.lang.Iterable var29 = var28.getCtorExtendedInterfaces();
    boolean var30 = var28.hasImplementedInterfaces();
    com.google.javascript.rhino.ErrorReporter var31 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var31, true);
    com.google.javascript.rhino.jstype.JSType var35 = null;
    boolean var36 = var33.declareType("hi!", var35);
    var33.clearTemplateTypeName();
    var33.setLastGeneration(false);
    var33.resetForTypeCheck();
    var33.resetForTypeCheck();
    var33.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var44 = null;
    com.google.javascript.rhino.jstype.JSType var45 = null;
    com.google.javascript.rhino.jstype.JSType[] var46 = new com.google.javascript.rhino.jstype.JSType[] { var45};
    com.google.javascript.rhino.jstype.FunctionType var47 = var33.createConstructorType(var44, var46);
    boolean var48 = var28.isEquivalentTo(var44);
    boolean var49 = var28.isReturnTypeInferred();
    java.util.Set var50 = var28.getOwnPropertyNames();
    var4.setIdGenerators(var50);
    var4.setGroupVariableDeclarations(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test189"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.LightweightMessageFormatter var2 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
    com.google.javascript.jscomp.Scope var3 = var1.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var6 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var9 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var10 = var9.isExtern();
    boolean var11 = var9.isExtern();
    com.google.javascript.jscomp.CompilerOptions var12 = new com.google.javascript.jscomp.CompilerOptions();
    var12.setLooseTypes(false);
    com.google.javascript.jscomp.Result var15 = var1.compile(var6, var9, var12);
    java.io.PrintStream var16 = null;
    com.google.javascript.jscomp.Compiler var17 = new com.google.javascript.jscomp.Compiler(var16);
    com.google.javascript.jscomp.LightweightMessageFormatter var18 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var17);
    com.google.javascript.jscomp.Scope var19 = var17.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var22 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var25 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var26 = var25.isExtern();
    boolean var27 = var25.isExtern();
    com.google.javascript.jscomp.CompilerOptions var28 = new com.google.javascript.jscomp.CompilerOptions();
    var28.setLooseTypes(false);
    com.google.javascript.jscomp.Result var31 = var17.compile(var22, var25, var28);
    com.google.javascript.jscomp.JSSourceFile[] var32 = new com.google.javascript.jscomp.JSSourceFile[] { var22};
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var33 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.rhino.JSDocInfo var34 = new com.google.javascript.rhino.JSDocInfo();
    java.util.List var35 = var34.getExtendedInterfaces();
    com.google.javascript.jscomp.JSModule[] var36 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var35);
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var37 = var33.getDirectedGraphNode((java.lang.Object)var36);
    com.google.javascript.jscomp.CompilerOptions var38 = new com.google.javascript.jscomp.CompilerOptions();
    var38.setLooseTypes(false);
    var1.init(var32, var36, var38);
    var38.setOutputCharset("");
    com.google.javascript.jscomp.CompilerOptions.LanguageMode var44 = var38.getLanguageOut();
    var38.setFlowSensitiveInlineVariables(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);

  }

  public void test190() {}
//   public void test190() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test190"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var5 = com.google.javascript.jscomp.DiagnosticType.warning("hi!", "");
//     java.lang.String[] var7 = new java.lang.String[] { "hi!"};
//     com.google.javascript.jscomp.JSError var8 = com.google.javascript.jscomp.JSError.make("hi!", 100, 0, var5, var7);
//     com.google.javascript.jscomp.CheckLevel var12 = null;
//     com.google.javascript.jscomp.DiagnosticType var15 = com.google.javascript.jscomp.DiagnosticType.error("goog.exportSymbol", "");
//     java.lang.String[] var17 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var18 = com.google.javascript.jscomp.JSError.make("LinkedGraph", 100, 100, var12, var15, var17);
//     boolean var19 = var5.equals((java.lang.Object)var18);
//     com.google.javascript.jscomp.DiagnosticType var20 = var18.getType();
//     int var21 = var18.getNodeLength();
//     com.google.javascript.jscomp.CheckLevel var22 = null;
//     java.io.PrintStream var23 = null;
//     com.google.javascript.jscomp.Compiler var24 = new com.google.javascript.jscomp.Compiler(var23);
//     com.google.javascript.jscomp.LightweightMessageFormatter var25 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var24);
//     var24.disableThreads();
//     com.google.javascript.rhino.ErrorReporter var27 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var27, true);
//     com.google.javascript.rhino.jstype.JSType var31 = null;
//     boolean var32 = var29.declareType("hi!", var31);
//     var29.clearTemplateTypeName();
//     var29.setLastGeneration(false);
//     var29.resetForTypeCheck();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var37 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
//     java.util.List var38 = var37.getGraphvizNodes();
//     com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.paramList(var38);
//     com.google.javascript.rhino.Node var40 = var29.createParametersWithVarArgs(var38);
//     com.google.javascript.jscomp.JSModuleGraph var41 = new com.google.javascript.jscomp.JSModuleGraph(var38);
//     com.google.javascript.rhino.ErrorReporter var42 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var42, true);
//     com.google.javascript.rhino.jstype.JSType var46 = null;
//     boolean var47 = var44.declareType("hi!", var46);
//     var44.clearTemplateTypeName();
//     var44.setLastGeneration(false);
//     var44.resetForTypeCheck();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var52 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
//     java.util.List var53 = var52.getGraphvizNodes();
//     com.google.javascript.rhino.Node var54 = com.google.javascript.rhino.IR.paramList(var53);
//     com.google.javascript.rhino.Node var55 = var44.createParametersWithVarArgs(var53);
//     com.google.javascript.jscomp.JSModuleGraph var56 = new com.google.javascript.jscomp.JSModuleGraph(var53);
//     com.google.javascript.rhino.ErrorReporter var57 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var57, true);
//     com.google.javascript.rhino.jstype.JSType var61 = null;
//     boolean var62 = var59.declareType("hi!", var61);
//     var59.clearTemplateTypeName();
//     var59.setLastGeneration(false);
//     var59.resetForTypeCheck();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var67 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
//     java.util.List var68 = var67.getGraphvizNodes();
//     com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.IR.paramList(var68);
//     com.google.javascript.rhino.Node var70 = var59.createParametersWithVarArgs(var68);
//     java.util.List var71 = var41.manageDependencies(var53, var68);
//     com.google.javascript.jscomp.JSModule var73 = new com.google.javascript.jscomp.JSModule("hi!");
//     com.google.javascript.jscomp.JSModule[] var74 = new com.google.javascript.jscomp.JSModule[] { var73};
//     com.google.javascript.jscomp.JSModuleGraph var75 = new com.google.javascript.jscomp.JSModuleGraph(var74);
//     com.google.javascript.jscomp.JSModuleGraph var76 = new com.google.javascript.jscomp.JSModuleGraph(var74);
//     var76.coalesceDuplicateFiles();
//     com.google.javascript.jscomp.DependencyOptions var78 = new com.google.javascript.jscomp.DependencyOptions();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var79 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
//     java.util.List var80 = var79.getGraphvizNodes();
//     com.google.javascript.rhino.Node var81 = com.google.javascript.rhino.IR.paramList(var80);
//     java.util.List var82 = var76.manageDependencies(var78, var80);
//     com.google.javascript.jscomp.CompilerOptions var83 = new com.google.javascript.jscomp.CompilerOptions();
//     var83.setRewriteFunctionExpressions(false);
//     var83.setInlineConstantVars(true);
//     var83.setOutputCharset("hi!");
//     com.google.javascript.jscomp.Result var90 = var24.compile(var71, var80, var83);
//     com.google.javascript.jscomp.CompilerOptions.LanguageMode var91 = var24.languageMode();
//     java.util.logging.Logger var92 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var93 = new com.google.javascript.jscomp.LoggerErrorManager(var92);
//     var24.setErrorManager((com.google.javascript.jscomp.ErrorManager)var93);
//     com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var95 = null;
//     com.google.javascript.jscomp.LightweightMessageFormatter var96 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var24, var95);
//     var96.setColorize(true);
//     java.lang.String var99 = var18.format(var22, (com.google.javascript.jscomp.MessageFormatter)var96);
// 
//   }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test191"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.block();
    int var1 = var0.getType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.throwNode(var0);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 125);

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test192"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("hi!");
    com.google.javascript.jscomp.JSModule[] var2 = new com.google.javascript.jscomp.JSModule[] { var1};
    com.google.javascript.jscomp.JSModuleGraph var3 = new com.google.javascript.jscomp.JSModuleGraph(var2);
    com.google.javascript.jscomp.JSModuleGraph var4 = new com.google.javascript.jscomp.JSModuleGraph(var2);
    var4.coalesceDuplicateFiles();
    com.google.javascript.jscomp.DependencyOptions var6 = new com.google.javascript.jscomp.DependencyOptions();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var7 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.util.List var8 = var7.getGraphvizNodes();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.paramList(var8);
    java.util.List var10 = var4.manageDependencies(var6, var8);
    com.google.javascript.jscomp.deps.SortedDependencies var11 = new com.google.javascript.jscomp.deps.SortedDependencies(var10);
    java.util.List var12 = var11.getSortedList();
    com.google.javascript.jscomp.JSModule[] var13 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test193"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setLooseTypes(false);
    var0.setOptimizeCalls(true);

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test194"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setLooseTypes(false);
    var0.setDeadAssignmentElimination(true);
    boolean var5 = var0.shouldColorizeErrorOutput();
    var0.setDefineToStringLiteral("hi!", "goog.exportSymbol");
    var0.setInlineFunctions(true);
    var0.setSmartNameRemoval(true);
    var0.setClosurePass(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test195() {}
//   public void test195() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test195"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
//     java.io.Reader var3 = var2.getCodeReader();
//     com.google.javascript.jscomp.JsAst var4 = new com.google.javascript.jscomp.JsAst(var2);
//     var4.clearAst();
//     var4.clearAst();
//     com.google.javascript.rhino.InputId var7 = null;
//     com.google.javascript.jscomp.CompilerInput var9 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var4, var7, true);
//     com.google.javascript.jscomp.SourceFile var10 = var4.getSourceFile();
//     com.google.javascript.jscomp.AbstractCompiler var11 = null;
//     com.google.javascript.rhino.Node var12 = var4.getAstRoot(var11);
// 
//   }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test196"); }


    com.google.javascript.jscomp.parsing.Config.LanguageMode var1 = null;
    com.google.javascript.jscomp.CompilerOptions var3 = new com.google.javascript.jscomp.CompilerOptions();
    var3.setLooseTypes(false);
    var3.setShadowVariables(true);
    com.google.javascript.rhino.JSDocInfo var9 = new com.google.javascript.rhino.JSDocInfo();
    java.util.List var10 = var9.getExtendedInterfaces();
    com.google.javascript.jscomp.JSModule[] var11 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var10);
    var3.setReplaceStringsConfiguration("", var10);
    java.io.PrintStream var13 = null;
    com.google.javascript.jscomp.Compiler var14 = new com.google.javascript.jscomp.Compiler(var13);
    com.google.javascript.jscomp.LightweightMessageFormatter var15 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var14);
    com.google.javascript.jscomp.Scope var16 = var14.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var19 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var22 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var23 = var22.isExtern();
    boolean var24 = var22.isExtern();
    com.google.javascript.jscomp.CompilerOptions var25 = new com.google.javascript.jscomp.CompilerOptions();
    var25.setLooseTypes(false);
    com.google.javascript.jscomp.Result var28 = var14.compile(var19, var22, var25);
    var25.setRenamePrefixNamespace("LinkedGraph");
    var25.setSmartNameRemoval(false);
    var25.setLabelRenaming(true);
    var25.setOptimizeArgumentsArray(false);
    com.google.javascript.rhino.ErrorReporter var37 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var37, true);
    com.google.javascript.rhino.jstype.JSType var41 = null;
    boolean var42 = var39.declareType("hi!", var41);
    var39.clearTemplateTypeName();
    var39.setLastGeneration(false);
    com.google.javascript.rhino.ErrorReporter var46 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var46, true);
    com.google.javascript.rhino.jstype.JSType var50 = null;
    boolean var51 = var48.declareType("hi!", var50);
    var48.clearTemplateTypeName();
    var48.setLastGeneration(false);
    var48.resetForTypeCheck();
    var48.resetForTypeCheck();
    var48.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var59 = null;
    com.google.javascript.rhino.jstype.JSType var60 = null;
    com.google.javascript.rhino.jstype.JSType[] var61 = new com.google.javascript.rhino.jstype.JSType[] { var60};
    com.google.javascript.rhino.jstype.FunctionType var62 = var48.createConstructorType(var59, var61);
    java.lang.Iterable var63 = var62.getCtorExtendedInterfaces();
    boolean var64 = var62.hasImplementedInterfaces();
    boolean var65 = var62.hasImplementedInterfaces();
    com.google.javascript.rhino.jstype.JSType var66 = var39.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType)var62);
    com.google.javascript.rhino.jstype.FunctionType var67 = var62.toMaybeFunctionType();
    java.util.Set var68 = var67.getOwnPropertyNames();
    var25.setIdGenerators(var68);
    var3.setIdGenerators(var68);
    com.google.javascript.jscomp.parsing.Config var71 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(true, var1, true, var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test197"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    java.util.List var1 = var0.getExtendedInterfaces();
    boolean var2 = var0.isDefine();
    boolean var3 = var0.isConsistentIdGenerator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test198"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setLooseTypes(false);
    var0.setShadowVariables(true);
    com.google.javascript.jscomp.CheckLevel var5 = null;
    var0.setCheckGlobalNamesLevel(var5);
    com.google.javascript.jscomp.CompilerOptions.LanguageMode var7 = var0.getLanguageIn();
    var0.setLineLengthThreshold(0);
    com.google.javascript.jscomp.CheckLevel var10 = null;
    var0.setBrokenClosureRequiresLevel(var10);
    var0.setMarkNoSideEffectCalls(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test199"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var2 = var0.getDelegateRelationship(var1);
    java.lang.String var3 = var0.getExportSymbolFunction();
    boolean var6 = var0.isExported("hi!", true);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var9 = var8.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var10 = var8.getJsDocBuilderForNode();
    boolean var11 = var8.isOptionalArg();
    java.lang.String var12 = var8.toString();
    var8.setString("");
    boolean var15 = var8.isDo();
    boolean var16 = var8.hasChildren();
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.paramList();
    java.lang.String var18 = var0.extractClassNameIfRequire(var8, var17);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var21 = var20.isOr();
    boolean var22 = var20.isTry();
    boolean var23 = var0.isVarArgsParameter(var20);
    com.google.javascript.rhino.ErrorReporter var24 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24, true);
    com.google.javascript.rhino.jstype.JSType var28 = null;
    boolean var29 = var26.declareType("hi!", var28);
    var26.clearTemplateTypeName();
    var26.setLastGeneration(false);
    var26.resetForTypeCheck();
    var26.resetForTypeCheck();
    var26.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var37 = null;
    com.google.javascript.rhino.jstype.JSType var38 = null;
    com.google.javascript.rhino.jstype.JSType[] var39 = new com.google.javascript.rhino.jstype.JSType[] { var38};
    com.google.javascript.rhino.jstype.FunctionType var40 = var26.createConstructorType(var37, var39);
    java.lang.Iterable var41 = var40.getCtorExtendedInterfaces();
    java.lang.Iterable var42 = var40.getAllImplementedInterfaces();
    java.lang.Iterable var43 = var40.getCtorExtendedInterfaces();
    com.google.javascript.rhino.ErrorReporter var45 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var45, true);
    com.google.javascript.rhino.jstype.JSType var49 = null;
    boolean var50 = var47.declareType("hi!", var49);
    var47.clearTemplateTypeName();
    var47.setLastGeneration(false);
    var47.resetForTypeCheck();
    var47.resetForTypeCheck();
    var47.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var58 = null;
    com.google.javascript.rhino.jstype.JSType var59 = null;
    com.google.javascript.rhino.jstype.JSType[] var60 = new com.google.javascript.rhino.jstype.JSType[] { var59};
    com.google.javascript.rhino.jstype.FunctionType var61 = var47.createConstructorType(var58, var60);
    java.lang.Iterable var62 = var61.getCtorExtendedInterfaces();
    boolean var63 = var61.hasImplementedInterfaces();
    boolean var64 = var61.isNullable();
    com.google.javascript.rhino.Node var65 = com.google.javascript.rhino.IR.nullNode();
    boolean var66 = var40.defineDeclaredProperty("goog.exportSymbol", (com.google.javascript.rhino.jstype.JSType)var61, var65);
    boolean var67 = var65.isTypeOf();
    boolean var68 = var65.isDelProp();
    var20.addChildrenToFront(var65);
    com.google.javascript.jscomp.JSSourceFile var72 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var73 = var72.isExtern();
    boolean var74 = var72.isExtern();
    com.google.javascript.jscomp.CompilerInput var76 = new com.google.javascript.jscomp.CompilerInput(var72, false);
    var65.setStaticSourceFile((com.google.javascript.rhino.jstype.StaticSourceFile)var72);
    var72.clearCachedSource();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "goog.exportSymbol"+ "'", var3.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "LABEL_NAME hi!"+ "'", var12.equals("LABEL_NAME hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test200"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    var0.clearNodeAnnotations();
    java.util.List var2 = var0.getGraphvizEdges();
    com.google.javascript.jscomp.CompilerOptions var3 = new com.google.javascript.jscomp.CompilerOptions();
    var3.setLooseTypes(false);
    var3.setGeneratePseudoNames(true);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var8 = null;
    var3.setTweakProcessing(var8);
    var3.setUnaliasableGlobals("goog.exportSymbol");
    var3.setRemoveUnusedPrototypePropertiesInExterns(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var14 = var0.getDirectedPredNodes((java.lang.Object)var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test201() {}
//   public void test201() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test201"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
//     java.io.Reader var3 = var2.getCodeReader();
//     com.google.javascript.jscomp.JsAst var4 = new com.google.javascript.jscomp.JsAst(var2);
//     var4.clearAst();
//     com.google.javascript.rhino.InputId var6 = null;
//     com.google.javascript.jscomp.CompilerInput var8 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var4, var6, false);
//     com.google.javascript.jscomp.SourceAst var9 = var8.getAst();
//     com.google.javascript.jscomp.SourceFile var12 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
//     java.io.Reader var13 = var12.getCodeReader();
//     com.google.javascript.jscomp.JsAst var14 = new com.google.javascript.jscomp.JsAst(var12);
//     var14.clearAst();
//     com.google.javascript.rhino.InputId var16 = null;
//     com.google.javascript.jscomp.CompilerInput var18 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var14, var16, false);
//     java.io.PrintStream var19 = null;
//     com.google.javascript.jscomp.Compiler var20 = new com.google.javascript.jscomp.Compiler(var19);
//     com.google.javascript.jscomp.LightweightMessageFormatter var21 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var20);
//     var20.disableThreads();
//     com.google.javascript.jscomp.CompilerOptions var23 = new com.google.javascript.jscomp.CompilerOptions();
//     var23.setLooseTypes(false);
//     var23.setShadowVariables(true);
//     var20.initOptions(var23);
//     com.google.javascript.rhino.Node var29 = var14.getAstRoot((com.google.javascript.jscomp.AbstractCompiler)var20);
//     var8.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var20);
//     java.util.Collection var31 = var8.getRequires();
// 
//   }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test202"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var3 = var2.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var4 = var2.getJsDocBuilderForNode();
    boolean var5 = var2.isOptionalArg();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var8 = var7.isOr();
    var2.addChildToBack(var7);
    java.lang.Iterable var10 = var7.siblings();
    boolean var11 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(var7);
    com.google.javascript.jscomp.ClosureCodingConvention var12 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var13 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var14 = var12.getDelegateRelationship(var13);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var18 = var17.isOr();
    boolean var19 = var17.isTry();
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.paramList();
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var23 = var22.isOr();
    com.google.javascript.rhino.Node var24 = new com.google.javascript.rhino.Node(10, var17, var20, var22);
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.pos(var24);
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var26 = var12.getDelegateRelationship(var24);
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var29 = var28.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var30 = var28.getJsDocBuilderForNode();
    boolean var31 = var28.isOptionalArg();
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var34 = var33.isOr();
    var28.addChildToBack(var33);
    int var36 = var28.getCharno();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var37 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.util.List var38 = var37.getGraphvizNodes();
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.paramList(var38);
    com.google.javascript.rhino.Node var40 = var28.useSourceInfoFrom(var39);
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var44 = var43.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var45 = var43.getJsDocBuilderForNode();
    boolean var46 = var43.isOptionalArg();
    com.google.javascript.rhino.Node var47 = new com.google.javascript.rhino.Node(1, var43);
    java.lang.String var48 = var12.extractClassNameIfProvide(var40, var43);
    boolean var49 = var43.isAnd();
    com.google.javascript.rhino.Node var50 = var7.copyInformationFrom(var43);
    com.google.javascript.rhino.Node[] var51 = new com.google.javascript.rhino.Node[] { var50};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var54 = new com.google.javascript.rhino.Node(125, var51, 0, 125);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
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
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test203"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var2 = var1.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var3 = var1.getJsDocBuilderForNode();
    boolean var4 = var1.isOptionalArg();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var7 = var6.isOr();
    var1.addChildToBack(var6);
    java.lang.Iterable var9 = var6.siblings();
    boolean var10 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(var6);
    com.google.javascript.jscomp.ClosureCodingConvention var11 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var12 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var13 = var11.getDelegateRelationship(var12);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var17 = var16.isOr();
    boolean var18 = var16.isTry();
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.paramList();
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var22 = var21.isOr();
    com.google.javascript.rhino.Node var23 = new com.google.javascript.rhino.Node(10, var16, var19, var21);
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.pos(var23);
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var25 = var11.getDelegateRelationship(var23);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var28 = var27.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var29 = var27.getJsDocBuilderForNode();
    boolean var30 = var27.isOptionalArg();
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var33 = var32.isOr();
    var27.addChildToBack(var32);
    int var35 = var27.getCharno();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var36 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.util.List var37 = var36.getGraphvizNodes();
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.paramList(var37);
    com.google.javascript.rhino.Node var39 = var27.useSourceInfoFrom(var38);
    com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var43 = var42.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var44 = var42.getJsDocBuilderForNode();
    boolean var45 = var42.isOptionalArg();
    com.google.javascript.rhino.Node var46 = new com.google.javascript.rhino.Node(1, var42);
    java.lang.String var47 = var11.extractClassNameIfProvide(var39, var42);
    boolean var48 = var42.isAnd();
    com.google.javascript.rhino.Node var49 = var6.copyInformationFrom(var42);
    com.google.javascript.rhino.jstype.StaticSourceFile var50 = var49.getStaticSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test204"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("hi!");
    java.util.Set var2 = var1.getThisAndAllDependencies();
    com.google.javascript.jscomp.SourceFile var5 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
    java.io.Reader var6 = var5.getCodeReader();
    com.google.javascript.jscomp.JsAst var7 = new com.google.javascript.jscomp.JsAst(var5);
    var7.clearAst();
    var7.clearAst();
    com.google.javascript.rhino.InputId var10 = null;
    com.google.javascript.jscomp.CompilerInput var12 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var7, var10, true);
    int var13 = var12.getNumLines();
    var1.addFirst(var12);
    var12.clearAst();
    boolean var16 = var12.isExtern();
    java.io.PrintStream var17 = null;
    com.google.javascript.jscomp.Compiler var18 = new com.google.javascript.jscomp.Compiler(var17);
    com.google.javascript.jscomp.LightweightMessageFormatter var19 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var18);
    com.google.javascript.jscomp.Scope var20 = var18.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var23 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var26 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var27 = var26.isExtern();
    boolean var28 = var26.isExtern();
    com.google.javascript.jscomp.CompilerOptions var29 = new com.google.javascript.jscomp.CompilerOptions();
    var29.setLooseTypes(false);
    com.google.javascript.jscomp.Result var32 = var18.compile(var23, var26, var29);
    java.io.PrintStream var33 = null;
    com.google.javascript.jscomp.Compiler var34 = new com.google.javascript.jscomp.Compiler(var33);
    com.google.javascript.jscomp.LightweightMessageFormatter var35 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var34);
    com.google.javascript.jscomp.Scope var36 = var34.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var39 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var42 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var43 = var42.isExtern();
    boolean var44 = var42.isExtern();
    com.google.javascript.jscomp.CompilerOptions var45 = new com.google.javascript.jscomp.CompilerOptions();
    var45.setLooseTypes(false);
    com.google.javascript.jscomp.Result var48 = var34.compile(var39, var42, var45);
    com.google.javascript.jscomp.JSSourceFile[] var49 = new com.google.javascript.jscomp.JSSourceFile[] { var39};
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var50 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.rhino.JSDocInfo var51 = new com.google.javascript.rhino.JSDocInfo();
    java.util.List var52 = var51.getExtendedInterfaces();
    com.google.javascript.jscomp.JSModule[] var53 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var52);
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var54 = var50.getDirectedGraphNode((java.lang.Object)var53);
    com.google.javascript.jscomp.CompilerOptions var55 = new com.google.javascript.jscomp.CompilerOptions();
    var55.setLooseTypes(false);
    var18.init(var49, var53, var55);
    java.lang.String var59 = var18.toSource();
    com.google.javascript.rhino.Node var60 = var12.getAstRoot((com.google.javascript.jscomp.AbstractCompiler)var18);
    java.lang.String var61 = var60.toString();
    boolean var62 = var60.isObjectLit();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + ""+ "'", var59.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "SCRIPT [source_file: (goog.exportSymbol)] [input_id: InputId: (goog.exportSymbol)]"+ "'", var61.equals("SCRIPT [source_file: (goog.exportSymbol)] [input_id: InputId: (goog.exportSymbol)]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test205"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var2 = var0.getDelegateRelationship(var1);
    java.lang.String var3 = var0.getExportSymbolFunction();
    boolean var6 = var0.isExported("hi!", true);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var9 = var8.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var10 = var8.getJsDocBuilderForNode();
    boolean var11 = var8.isOptionalArg();
    java.lang.String var12 = var8.toString();
    var8.setString("");
    boolean var15 = var8.isDo();
    boolean var16 = var8.hasChildren();
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.paramList();
    java.lang.String var18 = var0.extractClassNameIfRequire(var8, var17);
    java.lang.String var19 = var0.getExportSymbolFunction();
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var23 = var22.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var24 = var22.getJsDocBuilderForNode();
    boolean var25 = var22.isOptionalArg();
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var28 = var27.isOr();
    var22.addChildToBack(var27);
    boolean var30 = var22.isBreak();
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var33 = var32.isOr();
    var32.setCharno(100);
    com.google.javascript.rhino.Node var38 = new com.google.javascript.rhino.Node(100, var22, var32, 0, (-1));
    boolean var39 = var0.isPrototypeAlias(var38);
    java.lang.String var40 = var0.getExportPropertyFunction();
    boolean var42 = var0.isSuperClassReference("LinkedGraph");
    java.lang.String var43 = var0.getGlobalObject();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "goog.exportSymbol"+ "'", var3.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "LABEL_NAME hi!"+ "'", var12.equals("LABEL_NAME hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "goog.exportSymbol"+ "'", var19.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "goog.exportProperty"+ "'", var40.equals("goog.exportProperty"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "goog.global"+ "'", var43.equals("goog.global"));

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test206"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setLooseTypes(false);
    var0.setGeneratePseudoNames(true);
    com.google.javascript.jscomp.CheckLevel var5 = null;
    var0.setCheckProvides(var5);
    com.google.javascript.jscomp.CheckLevel var7 = null;
    var0.setReportMissingOverride(var7);
    var0.setRemoveUnusedLocalVars(true);

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test207"); }


    com.google.javascript.jscomp.ClosureCodingConvention var1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var2 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var3 = var1.getDelegateRelationship(var2);
    java.lang.String var4 = var1.getExportSymbolFunction();
    boolean var7 = var1.isExported("hi!", true);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var10 = var9.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var11 = var9.getJsDocBuilderForNode();
    boolean var12 = var9.isOptionalArg();
    java.lang.String var13 = var9.toString();
    var9.setString("");
    boolean var16 = var9.isDo();
    boolean var17 = var9.hasChildren();
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.paramList();
    java.lang.String var19 = var1.extractClassNameIfRequire(var9, var18);
    com.google.javascript.rhino.Node var22 = new com.google.javascript.rhino.Node(1, var18, 0, 0);
    boolean var23 = var22.isNull();
    boolean var24 = var22.isSwitch();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "goog.exportSymbol"+ "'", var4.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "LABEL_NAME hi!"+ "'", var13.equals("LABEL_NAME hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test208"); }


    com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
    java.io.Reader var3 = var2.getCodeReader();
    com.google.javascript.jscomp.JsAst var4 = new com.google.javascript.jscomp.JsAst(var2);
    var4.clearAst();
    com.google.javascript.rhino.InputId var6 = null;
    com.google.javascript.jscomp.CompilerInput var8 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var4, var6, false);
    java.io.PrintStream var9 = null;
    com.google.javascript.jscomp.Compiler var10 = new com.google.javascript.jscomp.Compiler(var9);
    com.google.javascript.jscomp.LightweightMessageFormatter var11 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var10);
    var10.disableThreads();
    com.google.javascript.jscomp.CompilerOptions var13 = new com.google.javascript.jscomp.CompilerOptions();
    var13.setLooseTypes(false);
    var13.setShadowVariables(true);
    var10.initOptions(var13);
    com.google.javascript.rhino.Node var19 = var4.getAstRoot((com.google.javascript.jscomp.AbstractCompiler)var10);
    java.io.PrintStream var20 = null;
    com.google.javascript.jscomp.Compiler var21 = new com.google.javascript.jscomp.Compiler(var20);
    var21.disableThreads();
    com.google.javascript.jscomp.LightweightMessageFormatter var23 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var21);
    com.google.javascript.jscomp.JSSourceFile var26 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    java.io.PrintStream var27 = null;
    com.google.javascript.jscomp.Compiler var28 = new com.google.javascript.jscomp.Compiler(var27);
    com.google.javascript.jscomp.LightweightMessageFormatter var29 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var28);
    com.google.javascript.jscomp.Scope var30 = var28.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var33 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var36 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var37 = var36.isExtern();
    boolean var38 = var36.isExtern();
    com.google.javascript.jscomp.CompilerOptions var39 = new com.google.javascript.jscomp.CompilerOptions();
    var39.setLooseTypes(false);
    com.google.javascript.jscomp.Result var42 = var28.compile(var33, var36, var39);
    java.io.PrintStream var43 = null;
    com.google.javascript.jscomp.Compiler var44 = new com.google.javascript.jscomp.Compiler(var43);
    com.google.javascript.jscomp.LightweightMessageFormatter var45 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var44);
    com.google.javascript.jscomp.Scope var46 = var44.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var49 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var52 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var53 = var52.isExtern();
    boolean var54 = var52.isExtern();
    com.google.javascript.jscomp.CompilerOptions var55 = new com.google.javascript.jscomp.CompilerOptions();
    var55.setLooseTypes(false);
    com.google.javascript.jscomp.Result var58 = var44.compile(var49, var52, var55);
    com.google.javascript.jscomp.JSSourceFile[] var59 = new com.google.javascript.jscomp.JSSourceFile[] { var49};
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var60 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.rhino.JSDocInfo var61 = new com.google.javascript.rhino.JSDocInfo();
    java.util.List var62 = var61.getExtendedInterfaces();
    com.google.javascript.jscomp.JSModule[] var63 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var62);
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var64 = var60.getDirectedGraphNode((java.lang.Object)var63);
    com.google.javascript.jscomp.CompilerOptions var65 = new com.google.javascript.jscomp.CompilerOptions();
    var65.setLooseTypes(false);
    var28.init(var59, var63, var65);
    com.google.javascript.jscomp.CompilerOptions var69 = new com.google.javascript.jscomp.CompilerOptions();
    var69.setLooseTypes(false);
    var69.setDeadAssignmentElimination(true);
    boolean var74 = var69.shouldColorizeErrorOutput();
    var69.setDefineToStringLiteral("hi!", "goog.exportSymbol");
    com.google.javascript.jscomp.Result var78 = var21.compile(var26, var59, var69);
    com.google.javascript.rhino.Node var79 = var10.parse(var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.SymbolTable var80 = var10.buildKnownSymbolTable();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test209"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setLooseTypes(false);
    var0.setDeadAssignmentElimination(true);
    var0.skipAllCompilerPasses();
    var0.setAmbiguateProperties(false);
    var0.setInferTypes(true);
    var0.setInlineLocalVariables(false);

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test210"); }


    com.google.javascript.jscomp.AstValidator var0 = new com.google.javascript.jscomp.AstValidator();
    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.block();
    int var2 = var1.getType();
    var0.validateStatement(var1);
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.continueNode();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString(0, "", 0, 100);
    int var10 = var9.getLineno();
    com.google.javascript.jscomp.ClosureCodingConvention var11 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var12 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var13 = var11.getDelegateRelationship(var12);
    java.lang.String var14 = var11.getExportSymbolFunction();
    boolean var17 = var11.isExported("hi!", true);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var20 = var19.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var21 = var19.getJsDocBuilderForNode();
    boolean var22 = var19.isOptionalArg();
    java.lang.String var23 = var19.toString();
    var19.setString("");
    boolean var26 = var19.isDo();
    boolean var27 = var19.hasChildren();
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.paramList();
    java.lang.String var29 = var11.extractClassNameIfRequire(var19, var28);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var32 = var31.isOr();
    boolean var33 = var31.isTry();
    boolean var34 = var11.isVarArgsParameter(var31);
    var9.addChildToBack(var31);
    com.google.javascript.rhino.Node var36 = var4.useSourceInfoFrom(var31);
    boolean var37 = var36.isLabel();
    boolean var38 = var36.isGetterDef();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.validateScript(var36);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 125);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "goog.exportSymbol"+ "'", var14.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "LABEL_NAME hi!"+ "'", var23.equals("LABEL_NAME hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test211() {}
//   public void test211() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test211"); }
// 
// 
//     com.google.javascript.rhino.jstype.JSTypeRegistry var0 = null;
//     com.google.javascript.rhino.jstype.FunctionParamBuilder var1 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var0);
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.labelName("hi!");
//     boolean var4 = var3.isOr();
//     boolean var5 = var3.isIn();
//     com.google.javascript.rhino.Node var6 = var1.newParameterFromNode(var3);
//     java.lang.Appendable var7 = null;
//     var3.appendStringTree(var7);
// 
//   }

  public void test212() {}
//   public void test212() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test212"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CodingConvention.DelegateRelationship var2 = var0.getDelegateRelationship(var1);
//     java.lang.String var3 = var0.getExportSymbolFunction();
//     boolean var5 = var0.isPrivate("");
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.nullNode();
//     boolean var7 = var6.wasEmptyNode();
//     com.google.javascript.jscomp.CodingConvention.Bind var8 = var0.describeFunctionBind(var6);
//     com.google.javascript.rhino.Node var9 = null;
//     java.lang.String var10 = var6.checkTreeEquals(var9);
// 
//   }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test213"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.clearTemplateTypeName();
    var2.setLastGeneration(false);
    var2.resetForTypeCheck();
    var2.resetForTypeCheck();
    var2.setLastGeneration(false);
    com.google.javascript.rhino.ErrorReporter var13 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13, true);
    com.google.javascript.rhino.jstype.JSType var17 = null;
    boolean var18 = var15.declareType("hi!", var17);
    var15.clearTemplateTypeName();
    var15.setLastGeneration(false);
    var15.resetForTypeCheck();
    com.google.javascript.rhino.jstype.JSType var24 = null;
    var15.unregisterPropertyOnType("", var24);
    com.google.javascript.rhino.ErrorReporter var26 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var26, true);
    com.google.javascript.rhino.jstype.JSType var30 = null;
    boolean var31 = var28.declareType("hi!", var30);
    var28.clearTemplateTypeName();
    var28.setLastGeneration(false);
    var28.resetForTypeCheck();
    var28.resetForTypeCheck();
    var28.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var39 = null;
    com.google.javascript.rhino.jstype.JSType var40 = null;
    com.google.javascript.rhino.jstype.JSType[] var41 = new com.google.javascript.rhino.jstype.JSType[] { var40};
    com.google.javascript.rhino.jstype.FunctionType var42 = var28.createConstructorType(var39, var41);
    java.lang.Iterable var43 = var42.getCtorExtendedInterfaces();
    com.google.javascript.rhino.ErrorReporter var45 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var45, true);
    com.google.javascript.rhino.jstype.JSType var49 = null;
    boolean var50 = var47.declareType("hi!", var49);
    var47.clearTemplateTypeName();
    var47.setLastGeneration(false);
    var47.resetForTypeCheck();
    var47.resetForTypeCheck();
    var47.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var58 = null;
    com.google.javascript.rhino.jstype.JSType var59 = null;
    com.google.javascript.rhino.jstype.JSType[] var60 = new com.google.javascript.rhino.jstype.JSType[] { var59};
    com.google.javascript.rhino.jstype.FunctionType var61 = var47.createConstructorType(var58, var60);
    com.google.javascript.rhino.jstype.FunctionType var62 = var15.createFunctionType((com.google.javascript.rhino.jstype.JSType)var42, false, var60);
    com.google.javascript.rhino.Node var63 = var2.createParameters(var60);
    java.lang.String var64 = com.google.javascript.jscomp.NodeUtil.getSourceName(var63);
    com.google.javascript.rhino.Node var65 = com.google.javascript.rhino.IR.continueNode();
    com.google.javascript.rhino.Node var70 = com.google.javascript.rhino.Node.newString(0, "", 0, 100);
    int var71 = var70.getLineno();
    com.google.javascript.jscomp.ClosureCodingConvention var72 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var73 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var74 = var72.getDelegateRelationship(var73);
    java.lang.String var75 = var72.getExportSymbolFunction();
    boolean var78 = var72.isExported("hi!", true);
    com.google.javascript.rhino.Node var80 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var81 = var80.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var82 = var80.getJsDocBuilderForNode();
    boolean var83 = var80.isOptionalArg();
    java.lang.String var84 = var80.toString();
    var80.setString("");
    boolean var87 = var80.isDo();
    boolean var88 = var80.hasChildren();
    com.google.javascript.rhino.Node var89 = com.google.javascript.rhino.IR.paramList();
    java.lang.String var90 = var72.extractClassNameIfRequire(var80, var89);
    com.google.javascript.rhino.Node var92 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var93 = var92.isOr();
    boolean var94 = var92.isTry();
    boolean var95 = var72.isVarArgsParameter(var92);
    var70.addChildToBack(var92);
    com.google.javascript.rhino.Node var97 = var65.useSourceInfoFrom(var92);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var98 = com.google.javascript.rhino.IR.sheq(var63, var65);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "goog.exportSymbol"+ "'", var75.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + "LABEL_NAME hi!"+ "'", var84.equals("LABEL_NAME hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test214"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    boolean var1 = var0.isNoCompile();
    boolean var2 = var0.isExterns();
    java.lang.String var3 = var0.getOriginalCommentString();
    java.lang.String var4 = var0.getTemplateTypeName();
    boolean var5 = var0.isOverride();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test215"); }


    com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
    java.io.Reader var3 = var2.getCodeReader();
    com.google.javascript.jscomp.JsAst var4 = new com.google.javascript.jscomp.JsAst(var2);
    var4.clearAst();
    var4.clearAst();
    com.google.javascript.rhino.InputId var7 = null;
    com.google.javascript.jscomp.CompilerInput var9 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var4, var7, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var10 = var9.getPathRelativeToClosureBase();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test216"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    java.io.PrintStream var1 = null;
    com.google.javascript.jscomp.Compiler var2 = new com.google.javascript.jscomp.Compiler(var1);
    com.google.javascript.jscomp.LightweightMessageFormatter var3 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var2);
    com.google.javascript.jscomp.Scope var4 = var2.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var7 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var10 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var11 = var10.isExtern();
    boolean var12 = var10.isExtern();
    com.google.javascript.jscomp.CompilerOptions var13 = new com.google.javascript.jscomp.CompilerOptions();
    var13.setLooseTypes(false);
    com.google.javascript.jscomp.Result var16 = var2.compile(var7, var10, var13);
    com.google.javascript.jscomp.CheckLevel var17 = null;
    var13.setAggressiveVarCheck(var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var19 = var0.getOutEdges((java.lang.Object)var13);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test217"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var2 = var0.getDelegateRelationship(var1);
    java.lang.String var3 = var0.getExportSymbolFunction();
    com.google.javascript.rhino.jstype.FunctionType var4 = null;
    com.google.javascript.rhino.ErrorReporter var5 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var5, true);
    com.google.javascript.rhino.jstype.JSType var9 = null;
    boolean var10 = var7.declareType("hi!", var9);
    var7.clearNamedTypes();
    com.google.javascript.rhino.ErrorReporter var13 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13, true);
    com.google.javascript.rhino.jstype.JSType var17 = null;
    boolean var18 = var15.declareType("hi!", var17);
    var15.clearTemplateTypeName();
    var15.setLastGeneration(false);
    var15.resetForTypeCheck();
    com.google.javascript.rhino.jstype.JSType var24 = null;
    var15.unregisterPropertyOnType("", var24);
    com.google.javascript.rhino.ErrorReporter var26 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var26, true);
    com.google.javascript.rhino.jstype.JSType var30 = null;
    boolean var31 = var28.declareType("hi!", var30);
    var28.clearTemplateTypeName();
    var28.setLastGeneration(false);
    var28.resetForTypeCheck();
    var28.resetForTypeCheck();
    var28.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var39 = null;
    com.google.javascript.rhino.jstype.JSType var40 = null;
    com.google.javascript.rhino.jstype.JSType[] var41 = new com.google.javascript.rhino.jstype.JSType[] { var40};
    com.google.javascript.rhino.jstype.FunctionType var42 = var28.createConstructorType(var39, var41);
    java.lang.Iterable var43 = var42.getCtorExtendedInterfaces();
    com.google.javascript.rhino.ErrorReporter var45 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var45, true);
    com.google.javascript.rhino.jstype.JSType var49 = null;
    boolean var50 = var47.declareType("hi!", var49);
    var47.clearTemplateTypeName();
    var47.setLastGeneration(false);
    var47.resetForTypeCheck();
    var47.resetForTypeCheck();
    var47.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var58 = null;
    com.google.javascript.rhino.jstype.JSType var59 = null;
    com.google.javascript.rhino.jstype.JSType[] var60 = new com.google.javascript.rhino.jstype.JSType[] { var59};
    com.google.javascript.rhino.jstype.FunctionType var61 = var47.createConstructorType(var58, var60);
    com.google.javascript.rhino.jstype.FunctionType var62 = var15.createFunctionType((com.google.javascript.rhino.jstype.JSType)var42, false, var60);
    var7.overwriteDeclaredType("hi!", (com.google.javascript.rhino.jstype.JSType)var42);
    int var64 = var42.getMinArguments();
    com.google.javascript.rhino.ErrorReporter var65 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var65, true);
    com.google.javascript.rhino.jstype.JSType var69 = null;
    boolean var70 = var67.declareType("hi!", var69);
    var67.clearTemplateTypeName();
    var67.setLastGeneration(false);
    var67.resetForTypeCheck();
    var67.resetForTypeCheck();
    var67.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var78 = null;
    com.google.javascript.rhino.jstype.JSType var79 = null;
    com.google.javascript.rhino.jstype.JSType[] var80 = new com.google.javascript.rhino.jstype.JSType[] { var79};
    com.google.javascript.rhino.jstype.FunctionType var81 = var67.createConstructorType(var78, var80);
    java.lang.Iterable var82 = var81.getImplementedInterfaces();
    com.google.javascript.rhino.jstype.JSType.TypePair var83 = var42.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType)var81);
    boolean var84 = var81.isReturnTypeInferred();
    boolean var85 = var81.hasCachedValues();
    boolean var86 = var81.isFunctionType();
    com.google.javascript.jscomp.CodingConvention.SubclassType var87 = null;
    var0.applySubclassRelationship(var4, var81, var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "goog.exportSymbol"+ "'", var3.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == true);

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test218"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    boolean var1 = var0.isNoCompile();
    boolean var2 = var0.isExterns();
    java.lang.String var3 = var0.getOriginalCommentString();
    java.lang.String var4 = var0.getTemplateTypeName();
    boolean var5 = var0.isExterns();
    boolean var6 = var0.isNoSideEffects();
    java.util.Set var7 = var0.getSuppressions();
    java.lang.String var8 = var0.getLicense();
    int var9 = var0.getParameterCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test219"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.util.List var1 = var0.getGraphvizNodes();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.paramList(var1);
    com.google.javascript.rhino.Node var3 = var2.cloneTree();
    com.google.javascript.rhino.Node var4 = var3.getLastChild();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test220"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    com.google.javascript.rhino.JSTypeExpression var1 = var0.getEnumParameterType();
    com.google.javascript.rhino.JSTypeExpression var2 = var0.getEnumParameterType();
    boolean var3 = var0.hasTypedefType();
    java.lang.String var4 = var0.getFileOverview();
    java.lang.String var5 = var0.getBlockDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test221"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setLineLengthThreshold(100);
    var0.setCollapseObjectLiterals(false);

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test222"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setLooseTypes(false);
    var0.setGeneratePseudoNames(true);
    com.google.javascript.jscomp.CheckLevel var5 = null;
    var0.setCheckProvides(var5);
    com.google.javascript.jscomp.CheckLevel var7 = null;
    var0.setReportMissingOverride(var7);
    var0.setRuntimeTypeCheckLogFunction("NUMBER 100.0\n");

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test223"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.clearTemplateTypeName();
    var2.setLastGeneration(false);
    var2.resetForTypeCheck();
    com.google.javascript.rhino.ErrorReporter var10 = var2.getErrorReporter();
    com.google.javascript.jscomp.JSModule var12 = new com.google.javascript.jscomp.JSModule("hi!");
    java.util.Set var13 = var12.getAllDependencies();
    var12.setDepth((-1));
    java.util.List var16 = var12.getInputs();
    com.google.javascript.rhino.Node var17 = var2.createParameters(var16);
    com.google.javascript.rhino.ErrorReporter var18 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18, true);
    com.google.javascript.rhino.jstype.JSType var22 = null;
    boolean var23 = var20.declareType("hi!", var22);
    var20.clearTemplateTypeName();
    var20.setLastGeneration(false);
    var20.resetForTypeCheck();
    var20.resetForTypeCheck();
    var20.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var31 = null;
    com.google.javascript.rhino.jstype.JSType var32 = null;
    com.google.javascript.rhino.jstype.JSType[] var33 = new com.google.javascript.rhino.jstype.JSType[] { var32};
    com.google.javascript.rhino.jstype.FunctionType var34 = var20.createConstructorType(var31, var33);
    java.lang.Iterable var35 = var34.getCtorExtendedInterfaces();
    boolean var36 = var34.hasImplementedInterfaces();
    boolean var37 = var34.isNullable();
    com.google.javascript.rhino.jstype.ObjectType var38 = var34.getInstanceType();
    boolean var39 = var34.isInterface();
    com.google.javascript.rhino.jstype.ObjectType var40 = var34.getTypeOfThis();
    boolean var41 = var34.isNoType();
    com.google.javascript.rhino.ErrorReporter var42 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var42, true);
    com.google.javascript.rhino.jstype.JSType var46 = null;
    boolean var47 = var44.declareType("hi!", var46);
    var44.clearTemplateTypeName();
    var44.setLastGeneration(false);
    var44.resetForTypeCheck();
    var44.resetForTypeCheck();
    var44.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var55 = null;
    com.google.javascript.rhino.jstype.JSType var56 = null;
    com.google.javascript.rhino.jstype.JSType[] var57 = new com.google.javascript.rhino.jstype.JSType[] { var56};
    com.google.javascript.rhino.jstype.FunctionType var58 = var44.createConstructorType(var55, var57);
    java.lang.Iterable var59 = var58.getCtorExtendedInterfaces();
    com.google.javascript.rhino.JSDocInfo var60 = new com.google.javascript.rhino.JSDocInfo();
    java.util.List var61 = var60.getExtendedInterfaces();
    com.google.javascript.jscomp.JSModuleGraph var62 = new com.google.javascript.jscomp.JSModuleGraph(var61);
    com.google.javascript.rhino.jstype.JSType var63 = var2.createFunctionTypeWithVarArgs((com.google.javascript.rhino.jstype.ObjectType)var34, (com.google.javascript.rhino.jstype.JSType)var58, var61);
    boolean var64 = var63.isEmptyType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);

  }

  public void test224() {}
//   public void test224() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test224"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
//     com.google.javascript.rhino.jstype.JSType var4 = null;
//     boolean var5 = var2.declareType("hi!", var4);
//     var2.clearTemplateTypeName();
//     var2.setLastGeneration(false);
//     var2.resetForTypeCheck();
//     var2.resetForTypeCheck();
//     var2.setLastGeneration(false);
//     com.google.javascript.rhino.jstype.JSType var13 = null;
//     com.google.javascript.rhino.jstype.JSType var14 = null;
//     com.google.javascript.rhino.jstype.JSType[] var15 = new com.google.javascript.rhino.jstype.JSType[] { var14};
//     com.google.javascript.rhino.jstype.FunctionType var16 = var2.createConstructorType(var13, var15);
//     java.lang.Iterable var17 = var16.getCtorExtendedInterfaces();
//     boolean var18 = var16.hasImplementedInterfaces();
//     boolean var19 = var16.isNullable();
//     com.google.javascript.rhino.jstype.ObjectType var20 = var16.getInstanceType();
//     boolean var21 = var16.isBooleanValueType();
//     java.util.List var22 = var16.getSubTypes();
//     com.google.javascript.rhino.jstype.ObjectType var23 = null;
//     var16.setPrototypeBasedOn(var23);
// 
//   }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test225"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    boolean var1 = var0.isNoCompile();
    boolean var2 = var0.isExterns();
    java.lang.String var3 = var0.getOriginalCommentString();
    java.lang.String var4 = var0.getTemplateTypeName();
    boolean var5 = var0.isExterns();
    boolean var6 = var0.isNoSideEffects();
    java.util.Set var7 = var0.getSuppressions();
    java.lang.String var8 = var0.getLicense();
    java.util.Set var9 = var0.getSuppressions();
    boolean var10 = var0.shouldPreserveTry();
    java.lang.String var11 = var0.getReturnDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test226"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setLooseTypes(false);
    var0.setGeneratePseudoNames(true);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var5 = null;
    var0.setTweakProcessing(var5);
    var0.setManageClosureDependencies(false);
    var0.setRewriteNewDateGoogNow(true);
    var0.setAcceptConstKeyword(false);
    com.google.common.collect.Multimap var13 = null;
    var0.setCustomPasses(var13);
    var0.setRemoveAbstractMethods(true);
    var0.setAliasStringsBlacklist("goog.exportSymbol");
    com.google.javascript.jscomp.SourceMap.Format var19 = null;
    var0.setSourceMapFormat(var19);

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test227"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var1 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var2 = var0.getDelegateRelationship(var1);
    java.lang.String var3 = var0.getExportSymbolFunction();
    boolean var6 = var0.isExported("hi!", true);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var9 = var8.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var10 = var8.getJsDocBuilderForNode();
    boolean var11 = var8.isOptionalArg();
    java.lang.String var12 = var8.toString();
    var8.setString("");
    boolean var15 = var8.isDo();
    boolean var16 = var8.hasChildren();
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.paramList();
    java.lang.String var18 = var0.extractClassNameIfRequire(var8, var17);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var21 = var20.isOr();
    boolean var22 = var20.isTry();
    boolean var23 = var0.isVarArgsParameter(var20);
    com.google.javascript.rhino.ErrorReporter var24 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24, true);
    com.google.javascript.rhino.jstype.JSType var28 = null;
    boolean var29 = var26.declareType("hi!", var28);
    var26.clearTemplateTypeName();
    var26.setLastGeneration(false);
    var26.resetForTypeCheck();
    var26.resetForTypeCheck();
    var26.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var37 = null;
    com.google.javascript.rhino.jstype.JSType var38 = null;
    com.google.javascript.rhino.jstype.JSType[] var39 = new com.google.javascript.rhino.jstype.JSType[] { var38};
    com.google.javascript.rhino.jstype.FunctionType var40 = var26.createConstructorType(var37, var39);
    java.lang.Iterable var41 = var40.getCtorExtendedInterfaces();
    java.lang.Iterable var42 = var40.getAllImplementedInterfaces();
    java.lang.Iterable var43 = var40.getCtorExtendedInterfaces();
    com.google.javascript.rhino.ErrorReporter var45 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var45, true);
    com.google.javascript.rhino.jstype.JSType var49 = null;
    boolean var50 = var47.declareType("hi!", var49);
    var47.clearTemplateTypeName();
    var47.setLastGeneration(false);
    var47.resetForTypeCheck();
    var47.resetForTypeCheck();
    var47.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var58 = null;
    com.google.javascript.rhino.jstype.JSType var59 = null;
    com.google.javascript.rhino.jstype.JSType[] var60 = new com.google.javascript.rhino.jstype.JSType[] { var59};
    com.google.javascript.rhino.jstype.FunctionType var61 = var47.createConstructorType(var58, var60);
    java.lang.Iterable var62 = var61.getCtorExtendedInterfaces();
    boolean var63 = var61.hasImplementedInterfaces();
    boolean var64 = var61.isNullable();
    com.google.javascript.rhino.Node var65 = com.google.javascript.rhino.IR.nullNode();
    boolean var66 = var40.defineDeclaredProperty("goog.exportSymbol", (com.google.javascript.rhino.jstype.JSType)var61, var65);
    boolean var67 = var65.isTypeOf();
    boolean var68 = var65.isDelProp();
    var20.addChildrenToFront(var65);
    int var70 = var20.getSourceOffset();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "goog.exportSymbol"+ "'", var3.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "LABEL_NAME hi!"+ "'", var12.equals("LABEL_NAME hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 2147483647);

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test228"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.PropertyRenamingPolicy var1 = com.google.javascript.jscomp.PropertyRenamingPolicy.valueOf("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node1 [label=\"SCRIPT\"];\n  node0 -> node1 [weight=1];\n  node1 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n  node0 -> RETURN [label=\"SYN_BLOCK\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n  node0 -> node1 [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test229"); }


    com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("hi!");
    java.util.Set var2 = var1.getAllDependencies();
    java.util.List var3 = var1.getProvides();
    com.google.javascript.jscomp.JSModule var5 = new com.google.javascript.jscomp.JSModule("hi!");
    com.google.javascript.jscomp.JSModule[] var6 = new com.google.javascript.jscomp.JSModule[] { var5};
    com.google.javascript.jscomp.JSModuleGraph var7 = new com.google.javascript.jscomp.JSModuleGraph(var6);
    com.google.javascript.jscomp.JSModule var9 = new com.google.javascript.jscomp.JSModule("hi!");
    java.util.Set var10 = var9.getAllDependencies();
    java.util.List var11 = var9.getProvides();
    com.google.javascript.jscomp.JSModule var13 = new com.google.javascript.jscomp.JSModule("hi!");
    java.lang.String var14 = var13.toString();
    boolean var15 = var7.dependsOn(var9, var13);
    com.google.javascript.jscomp.SourceFile var18 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
    java.io.Reader var19 = var18.getCodeReader();
    com.google.javascript.jscomp.JsAst var20 = new com.google.javascript.jscomp.JsAst(var18);
    var20.clearAst();
    com.google.javascript.rhino.InputId var22 = null;
    com.google.javascript.jscomp.CompilerInput var24 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var20, var22, false);
    var9.remove(var24);
    com.google.javascript.jscomp.JSModule var26 = var24.getModule();
    var1.addFirst(var24);
    boolean var28 = var24.isExtern();
    com.google.javascript.jscomp.SourceAst var29 = var24.getAst();
    com.google.javascript.jscomp.SourceFile var30 = var24.getSourceFile();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var31 = var24.getPathRelativeToClosureBase();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test230"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var2 = var1.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var3 = var1.getJsDocBuilderForNode();
    boolean var4 = var1.isOptionalArg();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var7 = var6.isOr();
    var1.addChildToBack(var6);
    int var9 = var1.getCharno();
    com.google.javascript.rhino.Node var10 = var1.getLastChild();
    boolean var11 = var10.isScript();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.paramList(var10);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
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
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test231"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setLooseTypes(false);
    var0.setGeneratePseudoNames(true);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var5 = null;
    var0.setTweakProcessing(var5);
    var0.setUnaliasableGlobals("goog.exportSymbol");
    var0.setRemoveUnusedPrototypePropertiesInExterns(false);
    var0.setInferTypes(true);

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test232"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var3 = var2.isOr();
    boolean var4 = var2.isTry();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.paramList();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var8 = var7.isOr();
    com.google.javascript.rhino.Node var9 = new com.google.javascript.rhino.Node(10, var2, var5, var7);
    com.google.javascript.rhino.Node var11 = var9.getChildAtIndex(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.neg(var11);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test233"); }


    com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var3 = var2.isExtern();
    boolean var4 = var2.isExtern();
    com.google.javascript.jscomp.CompilerInput var6 = new com.google.javascript.jscomp.CompilerInput(var2, false);
    boolean var7 = var6.isExtern();
    com.google.javascript.jscomp.CompilerInput var10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var6, "digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node1 [label=\"SCRIPT\"];\n  node0 -> node1 [weight=1];\n  node1 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n  node0 -> RETURN [label=\"SYN_BLOCK\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n  node0 -> node1 [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n", true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var12 = var10.getLineOffset(28);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test234"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setLooseTypes(false);
    var0.setShadowVariables(true);
    com.google.javascript.jscomp.CheckLevel var5 = null;
    var0.setCheckGlobalNamesLevel(var5);
    com.google.javascript.jscomp.CompilerOptions.LanguageMode var7 = var0.getLanguageIn();
    var0.setPrintInputDelimiter(false);
    var0.setRenamePrefix("hi!");
    var0.setFoldConstants(false);
    var0.setAppNameStr("LABEL_NAME hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test235"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.Compiler.IntermediateState var2 = var1.getState();
    com.google.javascript.jscomp.JSSourceFile var5 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    java.lang.String var6 = var5.getCode();
    com.google.javascript.jscomp.JSSourceFile[] var7 = new com.google.javascript.jscomp.JSSourceFile[] { var5};
    com.google.javascript.jscomp.JSModule var9 = new com.google.javascript.jscomp.JSModule("hi!");
    com.google.javascript.jscomp.JSModule[] var10 = new com.google.javascript.jscomp.JSModule[] { var9};
    com.google.javascript.jscomp.JSModuleGraph var11 = new com.google.javascript.jscomp.JSModuleGraph(var10);
    com.google.javascript.jscomp.JSModule var13 = new com.google.javascript.jscomp.JSModule("hi!");
    java.util.Set var14 = var13.getAllDependencies();
    java.util.List var15 = var13.getProvides();
    com.google.javascript.jscomp.JSModule var17 = new com.google.javascript.jscomp.JSModule("hi!");
    java.lang.String var18 = var17.toString();
    boolean var19 = var11.dependsOn(var13, var17);
    com.google.javascript.jscomp.JSModule[] var20 = new com.google.javascript.jscomp.JSModule[] { var17};
    com.google.javascript.jscomp.CompilerOptions var21 = new com.google.javascript.jscomp.CompilerOptions();
    var21.setLooseTypes(false);
    var21.setDeadAssignmentElimination(true);
    java.lang.Object var26 = var21.clone();
    var21.setOptimizeCalls(true);
    com.google.javascript.jscomp.Result var29 = var1.compile(var7, var20, var21);
    var1.rebuildInputsFromModules();
    var1.disableThreads();
    java.io.PrintStream var32 = null;
    com.google.javascript.jscomp.Compiler var33 = new com.google.javascript.jscomp.Compiler(var32);
    com.google.javascript.jscomp.LightweightMessageFormatter var34 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var33);
    com.google.javascript.jscomp.Scope var35 = var33.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var38 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var41 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var42 = var41.isExtern();
    boolean var43 = var41.isExtern();
    com.google.javascript.jscomp.CompilerOptions var44 = new com.google.javascript.jscomp.CompilerOptions();
    var44.setLooseTypes(false);
    com.google.javascript.jscomp.Result var47 = var33.compile(var38, var41, var44);
    java.io.PrintStream var48 = null;
    com.google.javascript.jscomp.Compiler var49 = new com.google.javascript.jscomp.Compiler(var48);
    com.google.javascript.jscomp.LightweightMessageFormatter var50 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var49);
    com.google.javascript.jscomp.Scope var51 = var49.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var54 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var57 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var58 = var57.isExtern();
    boolean var59 = var57.isExtern();
    com.google.javascript.jscomp.CompilerOptions var60 = new com.google.javascript.jscomp.CompilerOptions();
    var60.setLooseTypes(false);
    com.google.javascript.jscomp.Result var63 = var49.compile(var54, var57, var60);
    com.google.javascript.jscomp.JSSourceFile[] var64 = new com.google.javascript.jscomp.JSSourceFile[] { var54};
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var65 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.rhino.JSDocInfo var66 = new com.google.javascript.rhino.JSDocInfo();
    java.util.List var67 = var66.getExtendedInterfaces();
    com.google.javascript.jscomp.JSModule[] var68 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection)var67);
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var69 = var65.getDirectedGraphNode((java.lang.Object)var68);
    com.google.javascript.jscomp.CompilerOptions var70 = new com.google.javascript.jscomp.CompilerOptions();
    var70.setLooseTypes(false);
    var33.init(var64, var68, var70);
    com.google.javascript.jscomp.Compiler.IntermediateState var74 = var33.getState();
    var1.setState(var74);
    com.google.javascript.jscomp.CompilerOptions var76 = null;
    com.google.javascript.jscomp.DefaultPassConfig var77 = new com.google.javascript.jscomp.DefaultPassConfig(var76);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setPassConfig((com.google.javascript.jscomp.PassConfig)var77);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);

  }

  public void test236() {}
//   public void test236() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test236"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
//     com.google.javascript.rhino.jstype.JSType var4 = null;
//     boolean var5 = var2.declareType("hi!", var4);
//     var2.clearTemplateTypeName();
//     var2.setLastGeneration(false);
//     com.google.javascript.rhino.ErrorReporter var9 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var9, true);
//     com.google.javascript.rhino.jstype.JSType var13 = null;
//     boolean var14 = var11.declareType("hi!", var13);
//     var11.clearTemplateTypeName();
//     var11.setLastGeneration(false);
//     var11.resetForTypeCheck();
//     var11.resetForTypeCheck();
//     var11.setLastGeneration(false);
//     com.google.javascript.rhino.jstype.JSType var22 = null;
//     com.google.javascript.rhino.jstype.JSType var23 = null;
//     com.google.javascript.rhino.jstype.JSType[] var24 = new com.google.javascript.rhino.jstype.JSType[] { var23};
//     com.google.javascript.rhino.jstype.FunctionType var25 = var11.createConstructorType(var22, var24);
//     java.lang.Iterable var26 = var25.getCtorExtendedInterfaces();
//     boolean var27 = var25.hasImplementedInterfaces();
//     boolean var28 = var25.hasImplementedInterfaces();
//     com.google.javascript.rhino.jstype.JSType var29 = var2.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType)var25);
//     com.google.javascript.rhino.jstype.FunctionType var30 = var25.toMaybeFunctionType();
//     boolean var31 = var30.isNominalType();
//     java.util.List var32 = var30.getSubTypes();
//     com.google.javascript.rhino.jstype.Visitor var33 = null;
//     java.lang.Object var34 = var30.visit(var33);
// 
//   }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test237"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(1.0d);
    boolean var2 = var1.isComma();
    var1.removeProp(100);
    com.google.javascript.rhino.jstype.JSType var5 = var1.getJSType();
    com.google.javascript.jscomp.ClosureCodingConvention var6 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var7 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var8 = var6.getDelegateRelationship(var7);
    java.lang.String var9 = var6.getExportSymbolFunction();
    boolean var12 = var6.isExported("hi!", true);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var15 = var14.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var16 = var14.getJsDocBuilderForNode();
    boolean var17 = var14.isOptionalArg();
    java.lang.String var18 = var14.toString();
    var14.setString("");
    boolean var21 = var14.isDo();
    boolean var22 = var14.hasChildren();
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.paramList();
    java.lang.String var24 = var6.extractClassNameIfRequire(var14, var23);
    boolean var25 = var14.isNew();
    com.google.javascript.rhino.jstype.JSType var26 = var14.getJSType();
    boolean var27 = var14.isSyntheticBlock();
    com.google.javascript.rhino.jstype.StaticSourceFile var28 = var14.getStaticSourceFile();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.regexp(var1, var14);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "goog.exportSymbol"+ "'", var9.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "LABEL_NAME hi!"+ "'", var18.equals("LABEL_NAME hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test238"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.paramList();
    java.lang.Iterable var2 = var1.siblings();
    boolean var3 = var1.hasChildren();
    com.google.javascript.rhino.Node[] var4 = new com.google.javascript.rhino.Node[] { var1};
    com.google.javascript.rhino.Node var7 = new com.google.javascript.rhino.Node(1, var4, 100, 100);
    boolean var8 = var7.isDelProp();
    com.google.javascript.jscomp.ClosureCodingConvention var10 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var11 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var12 = var10.getDelegateRelationship(var11);
    java.lang.String var13 = var10.getExportSymbolFunction();
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var17 = var16.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var18 = var16.getJsDocBuilderForNode();
    boolean var19 = var16.isOptionalArg();
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var22 = var21.isOr();
    var16.addChildToBack(var21);
    boolean var24 = var16.isBreak();
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var27 = var26.isOr();
    var26.setCharno(100);
    com.google.javascript.rhino.Node var32 = new com.google.javascript.rhino.Node(100, var16, var26, 0, (-1));
    com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var36 = var35.isOr();
    boolean var37 = var35.isTry();
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.paramList();
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var41 = var40.isOr();
    com.google.javascript.rhino.Node var42 = new com.google.javascript.rhino.Node(10, var35, var38, var40);
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.voidNode(var42);
    java.lang.String var44 = var10.extractClassNameIfRequire(var26, var42);
    com.google.javascript.jscomp.CheckLevel var45 = null;
    com.google.javascript.jscomp.CheckLevel var49 = null;
    com.google.javascript.jscomp.DiagnosticType var52 = com.google.javascript.jscomp.DiagnosticType.error("goog.exportSymbol", "");
    java.lang.String[] var54 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var55 = com.google.javascript.jscomp.JSError.make("LinkedGraph", 100, 100, var49, var52, var54);
    com.google.javascript.jscomp.DiagnosticType var58 = com.google.javascript.jscomp.DiagnosticType.error("goog.exportSymbol", "");
    java.lang.String[] var60 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var61 = com.google.javascript.jscomp.JSError.make(var58, var60);
    com.google.javascript.jscomp.JSError var62 = com.google.javascript.jscomp.JSError.make("goog.global", var26, var45, var52, var60);
    com.google.javascript.rhino.Node var63 = com.google.javascript.rhino.IR.nullNode();
    boolean var64 = var63.isSwitch();
    boolean var65 = var63.wasEmptyNode();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var66 = com.google.javascript.rhino.IR.ifNode(var7, var26, var63);
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
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "goog.exportSymbol"+ "'", var13.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
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
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test239"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.clearTemplateTypeName();
    var2.setLastGeneration(false);
    var2.resetForTypeCheck();
    com.google.javascript.rhino.jstype.JSType var11 = null;
    var2.unregisterPropertyOnType("", var11);
    com.google.javascript.rhino.ErrorReporter var13 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13, true);
    com.google.javascript.rhino.jstype.JSType var17 = null;
    boolean var18 = var15.declareType("hi!", var17);
    var15.clearTemplateTypeName();
    var15.setLastGeneration(false);
    var15.resetForTypeCheck();
    var15.resetForTypeCheck();
    var15.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var26 = null;
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.rhino.jstype.JSType[] var28 = new com.google.javascript.rhino.jstype.JSType[] { var27};
    com.google.javascript.rhino.jstype.FunctionType var29 = var15.createConstructorType(var26, var28);
    java.lang.Iterable var30 = var29.getCtorExtendedInterfaces();
    com.google.javascript.rhino.ErrorReporter var32 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32, true);
    com.google.javascript.rhino.jstype.JSType var36 = null;
    boolean var37 = var34.declareType("hi!", var36);
    var34.clearTemplateTypeName();
    var34.setLastGeneration(false);
    var34.resetForTypeCheck();
    var34.resetForTypeCheck();
    var34.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var45 = null;
    com.google.javascript.rhino.jstype.JSType var46 = null;
    com.google.javascript.rhino.jstype.JSType[] var47 = new com.google.javascript.rhino.jstype.JSType[] { var46};
    com.google.javascript.rhino.jstype.FunctionType var48 = var34.createConstructorType(var45, var47);
    com.google.javascript.rhino.jstype.FunctionType var49 = var2.createFunctionType((com.google.javascript.rhino.jstype.JSType)var29, false, var47);
    var49.clearCachedValues();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test240"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.string("");
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.pos(var1);
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.falseNode();
    var3.setIsSyntheticBlock(true);
    com.google.javascript.rhino.Node var6 = var1.useSourceInfoIfMissingFromForTree(var3);
    boolean var7 = var1.isContinue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test241"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.clearTemplateTypeName();
    var2.setLastGeneration(false);
    var2.resetForTypeCheck();
    com.google.javascript.jscomp.ClosureCodingConvention var11 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var12 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var13 = var11.getDelegateRelationship(var12);
    java.lang.String var14 = var11.getExportSymbolFunction();
    boolean var17 = var11.isExported("hi!", true);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var20 = var19.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var21 = var19.getJsDocBuilderForNode();
    boolean var22 = var19.isOptionalArg();
    java.lang.String var23 = var19.toString();
    var19.setString("");
    boolean var26 = var19.isDo();
    boolean var27 = var19.hasChildren();
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.paramList();
    java.lang.String var29 = var11.extractClassNameIfRequire(var19, var28);
    com.google.javascript.rhino.ErrorReporter var30 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var30, true);
    com.google.javascript.rhino.jstype.JSType var34 = null;
    boolean var35 = var32.declareType("hi!", var34);
    var32.clearTemplateTypeName();
    var32.setLastGeneration(false);
    var32.resetForTypeCheck();
    com.google.javascript.rhino.jstype.JSType var41 = null;
    var32.unregisterPropertyOnType("", var41);
    com.google.javascript.rhino.ErrorReporter var43 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var43, true);
    com.google.javascript.rhino.jstype.JSType var47 = null;
    boolean var48 = var45.declareType("hi!", var47);
    var45.clearTemplateTypeName();
    var45.setLastGeneration(false);
    var45.resetForTypeCheck();
    var45.resetForTypeCheck();
    var45.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var56 = null;
    com.google.javascript.rhino.jstype.JSType var57 = null;
    com.google.javascript.rhino.jstype.JSType[] var58 = new com.google.javascript.rhino.jstype.JSType[] { var57};
    com.google.javascript.rhino.jstype.FunctionType var59 = var45.createConstructorType(var56, var58);
    java.lang.Iterable var60 = var59.getCtorExtendedInterfaces();
    com.google.javascript.rhino.ErrorReporter var62 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var62, true);
    com.google.javascript.rhino.jstype.JSType var66 = null;
    boolean var67 = var64.declareType("hi!", var66);
    var64.clearTemplateTypeName();
    var64.setLastGeneration(false);
    var64.resetForTypeCheck();
    var64.resetForTypeCheck();
    var64.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var75 = null;
    com.google.javascript.rhino.jstype.JSType var76 = null;
    com.google.javascript.rhino.jstype.JSType[] var77 = new com.google.javascript.rhino.jstype.JSType[] { var76};
    com.google.javascript.rhino.jstype.FunctionType var78 = var64.createConstructorType(var75, var77);
    com.google.javascript.rhino.jstype.FunctionType var79 = var32.createFunctionType((com.google.javascript.rhino.jstype.JSType)var59, false, var77);
    boolean var80 = var59.isEmptyType();
    com.google.javascript.rhino.jstype.EnumType var81 = var2.createEnumType("LinkedGraph", var19, (com.google.javascript.rhino.jstype.JSType)var59);
    boolean var83 = var81.removeProperty("FALSE");
    boolean var84 = var81.isInstanceType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "goog.exportSymbol"+ "'", var14.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "LABEL_NAME hi!"+ "'", var23.equals("LABEL_NAME hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);

  }

  public void test242() {}
//   public void test242() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test242"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     java.lang.String var1 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(var0);
// 
//   }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test243"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var3 = var2.isOr();
    boolean var4 = var2.isTry();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.paramList();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var8 = var7.isOr();
    com.google.javascript.rhino.Node var9 = new com.google.javascript.rhino.Node(10, var2, var5, var7);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.block();
    int var11 = var10.getType();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.paramList();
    boolean var13 = var12.hasOneChild();
    var12.setType(0);
    var10.addChildToBack(var12);
    com.google.javascript.jscomp.ClosureCodingConvention var17 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.jstype.FunctionType var18 = null;
    com.google.javascript.rhino.jstype.FunctionType var19 = null;
    com.google.javascript.jscomp.CodingConvention.SubclassType var20 = null;
    var17.applySubclassRelationship(var18, var19, var20);
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.paramList();
    java.lang.Iterable var23 = var22.siblings();
    boolean var24 = var22.isFromExterns();
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var28 = var27.isOr();
    boolean var29 = var27.isTry();
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.paramList();
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var33 = var32.isOr();
    com.google.javascript.rhino.Node var34 = new com.google.javascript.rhino.Node(10, var27, var30, var32);
    boolean var35 = var34.isDebugger();
    com.google.javascript.rhino.Node var36 = var22.copyInformationFromForTree(var34);
    boolean var37 = var17.isPrototypeAlias(var34);
    com.google.javascript.jscomp.SourceFile var40 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
    java.io.Reader var41 = var40.getCodeReader();
    com.google.javascript.jscomp.JsAst var42 = new com.google.javascript.jscomp.JsAst(var40);
    var42.clearAst();
    com.google.javascript.rhino.InputId var44 = null;
    com.google.javascript.jscomp.CompilerInput var46 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var42, var44, false);
    java.io.PrintStream var47 = null;
    com.google.javascript.jscomp.Compiler var48 = new com.google.javascript.jscomp.Compiler(var47);
    com.google.javascript.jscomp.LightweightMessageFormatter var49 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var48);
    var48.disableThreads();
    com.google.javascript.jscomp.CompilerOptions var51 = new com.google.javascript.jscomp.CompilerOptions();
    var51.setLooseTypes(false);
    var51.setShadowVariables(true);
    var48.initOptions(var51);
    com.google.javascript.rhino.Node var57 = var42.getAstRoot((com.google.javascript.jscomp.AbstractCompiler)var48);
    boolean var58 = var57.isExprResult();
    var34.addChildToFront(var57);
    boolean var60 = var57.isScript();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var61 = com.google.javascript.rhino.IR.hook(var7, var12, var57);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 125);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test244"); }


    long var1 = com.google.javascript.rhino.ScriptRuntime.testUint32String("goog.global");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test245"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.jscomp.CompilerOptions var2 = new com.google.javascript.jscomp.CompilerOptions();
    var2.setLooseTypes(false);
    var2.setGeneratePseudoNames(true);
    com.google.javascript.jscomp.CheckLevel var7 = null;
    var2.setCheckProvides(var7);
    var2.setCrossModuleMethodMotion(false);
    var0.putProp(28, (java.lang.Object)false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var12 = var0.getDouble();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test246"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var3 = null;
    boolean var5 = var2.canPropertyBeDefined(var3, "LABEL_NAME hi!");
    com.google.javascript.rhino.ErrorReporter var7 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7, true);
    com.google.javascript.rhino.jstype.JSType var11 = null;
    boolean var12 = var9.declareType("hi!", var11);
    var9.clearTemplateTypeName();
    var9.setLastGeneration(false);
    var9.resetForTypeCheck();
    var9.resetForTypeCheck();
    var9.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var20 = null;
    com.google.javascript.rhino.jstype.JSType var21 = null;
    com.google.javascript.rhino.jstype.JSType[] var22 = new com.google.javascript.rhino.jstype.JSType[] { var21};
    com.google.javascript.rhino.jstype.FunctionType var23 = var9.createConstructorType(var20, var22);
    java.lang.Iterable var24 = var23.getImplementedInterfaces();
    boolean var25 = var23.isRegexpType();
    boolean var26 = var23.isEnumType();
    var2.registerPropertyOnType("", (com.google.javascript.rhino.jstype.JSType)var23);
    com.google.javascript.rhino.ErrorReporter var28 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var28, true);
    com.google.javascript.rhino.jstype.JSType var32 = null;
    boolean var33 = var30.declareType("hi!", var32);
    var30.clearTemplateTypeName();
    var30.setLastGeneration(false);
    var30.resetForTypeCheck();
    var30.resetForTypeCheck();
    var30.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var41 = null;
    com.google.javascript.rhino.jstype.JSType var42 = null;
    com.google.javascript.rhino.jstype.JSType[] var43 = new com.google.javascript.rhino.jstype.JSType[] { var42};
    com.google.javascript.rhino.jstype.FunctionType var44 = var30.createConstructorType(var41, var43);
    java.lang.Iterable var45 = var44.getImplementedInterfaces();
    boolean var46 = var44.isRegexpType();
    boolean var47 = var44.isEnumType();
    com.google.javascript.rhino.ErrorReporter var48 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var48, true);
    com.google.javascript.rhino.jstype.JSType var52 = null;
    boolean var53 = var50.declareType("hi!", var52);
    var50.incrementGeneration();
    com.google.javascript.rhino.jstype.JSTypeNative[] var55 = com.google.javascript.rhino.jstype.JSTypeNative.values();
    com.google.javascript.rhino.jstype.JSType var56 = var50.createUnionType(var55);
    com.google.javascript.rhino.jstype.TernaryValue var57 = var44.testForEquality(var56);
    com.google.javascript.rhino.jstype.JSType var58 = var2.createOptionalType(var56);
    com.google.javascript.rhino.ErrorReporter var59 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var59, true);
    com.google.javascript.rhino.jstype.JSType var63 = null;
    boolean var64 = var61.declareType("hi!", var63);
    var61.clearTemplateTypeName();
    var61.setLastGeneration(false);
    var61.resetForTypeCheck();
    var61.resetForTypeCheck();
    var61.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var72 = null;
    com.google.javascript.rhino.jstype.JSType var73 = null;
    com.google.javascript.rhino.jstype.JSType[] var74 = new com.google.javascript.rhino.jstype.JSType[] { var73};
    com.google.javascript.rhino.jstype.FunctionType var75 = var61.createConstructorType(var72, var74);
    java.lang.Iterable var76 = var75.getCtorExtendedInterfaces();
    java.lang.Iterable var77 = var75.getAllImplementedInterfaces();
    java.lang.Iterable var78 = var75.getCtorExtendedInterfaces();
    com.google.javascript.rhino.jstype.JSType var79 = var75.autobox();
    com.google.javascript.rhino.ErrorReporter var80 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var82 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var80, true);
    com.google.javascript.rhino.jstype.JSType var84 = null;
    boolean var85 = var82.declareType("hi!", var84);
    var82.clearTemplateTypeName();
    var82.setLastGeneration(false);
    var82.resetForTypeCheck();
    var82.resetForTypeCheck();
    var82.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var93 = null;
    com.google.javascript.rhino.jstype.JSType var94 = null;
    com.google.javascript.rhino.jstype.JSType[] var95 = new com.google.javascript.rhino.jstype.JSType[] { var94};
    com.google.javascript.rhino.jstype.FunctionType var96 = var82.createConstructorType(var93, var95);
    java.lang.Iterable var97 = var96.getCtorExtendedInterfaces();
    java.lang.Iterable var98 = var96.getAllImplementedInterfaces();
    com.google.javascript.rhino.jstype.FunctionType var99 = var2.createFunctionTypeWithNewThisType(var75, (com.google.javascript.rhino.jstype.ObjectType)var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
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
    assertTrue(var85 == true);
    
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

  public void test247() {}
//   public void test247() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test247"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     com.google.javascript.jscomp.ClosureCodingConvention var1 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     com.google.javascript.rhino.Node var2 = null;
//     com.google.javascript.jscomp.CodingConvention.DelegateRelationship var3 = var1.getDelegateRelationship(var2);
//     java.lang.String var4 = var1.getExportSymbolFunction();
//     boolean var7 = var1.isExported("hi!", true);
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.labelName("hi!");
//     boolean var10 = var9.isOr();
//     com.google.javascript.rhino.Node.FileLevelJsDocBuilder var11 = var9.getJsDocBuilderForNode();
//     boolean var12 = var9.isOptionalArg();
//     java.lang.String var13 = var9.toString();
//     var9.setString("");
//     boolean var16 = var9.isDo();
//     boolean var17 = var9.hasChildren();
//     com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.paramList();
//     java.lang.String var19 = var1.extractClassNameIfRequire(var9, var18);
//     boolean var20 = var9.isNew();
//     boolean var21 = var9.isHook();
//     int var23 = var9.getIntProp(1);
//     int var25 = var9.getIntProp(0);
//     com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.label(var0, var9);
// 
//   }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test248"); }


    java.lang.String var1 = com.google.javascript.rhino.Token.name((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "ERROR"+ "'", var1.equals("ERROR"));

  }

  public void test249() {}
//   public void test249() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test249"); }
// 
// 
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("hi!");
//     boolean var3 = var2.isOr();
//     boolean var4 = var2.isTry();
//     com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.paramList();
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.labelName("hi!");
//     boolean var8 = var7.isOr();
//     com.google.javascript.rhino.Node var9 = new com.google.javascript.rhino.Node(10, var2, var5, var7);
//     com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.voidNode(var9);
//     boolean var11 = var9.isUnscopedQualifiedName();
//     com.google.javascript.rhino.Node var13 = var9.getChildAtIndex(10);
// 
//   }

  public void test250() {}
//   public void test250() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test250"); }
// 
// 
//     java.io.InputStream var2 = null;
//     com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromInputStream("ERROR", "SCRIPT [source_file: goog.exportSymbol] [input_id: InputId: goog.exportSymbol]", var2);
// 
//   }

  public void test251() {}
//   public void test251() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test251"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
//     com.google.javascript.rhino.jstype.JSType var4 = null;
//     boolean var5 = var2.declareType("hi!", var4);
//     var2.clearTemplateTypeName();
//     var2.setLastGeneration(false);
//     var2.resetForTypeCheck();
//     var2.resetForTypeCheck();
//     var2.setLastGeneration(false);
//     com.google.javascript.rhino.jstype.FunctionParamBuilder var13 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var2);
//     com.google.javascript.rhino.Node var14 = var13.build();
//     com.google.javascript.rhino.ErrorReporter var15 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var15, true);
//     com.google.javascript.rhino.jstype.JSType var19 = null;
//     boolean var20 = var17.declareType("hi!", var19);
//     var17.clearTemplateTypeName();
//     var17.setLastGeneration(false);
//     var17.resetForTypeCheck();
//     var17.resetForTypeCheck();
//     var17.setLastGeneration(false);
//     com.google.javascript.rhino.ErrorReporter var28 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var28, true);
//     com.google.javascript.rhino.jstype.JSType var32 = null;
//     boolean var33 = var30.declareType("hi!", var32);
//     var30.clearTemplateTypeName();
//     var30.setLastGeneration(false);
//     var30.resetForTypeCheck();
//     com.google.javascript.rhino.jstype.JSType var39 = null;
//     var30.unregisterPropertyOnType("", var39);
//     com.google.javascript.rhino.ErrorReporter var41 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var41, true);
//     com.google.javascript.rhino.jstype.JSType var45 = null;
//     boolean var46 = var43.declareType("hi!", var45);
//     var43.clearTemplateTypeName();
//     var43.setLastGeneration(false);
//     var43.resetForTypeCheck();
//     var43.resetForTypeCheck();
//     var43.setLastGeneration(false);
//     com.google.javascript.rhino.jstype.JSType var54 = null;
//     com.google.javascript.rhino.jstype.JSType var55 = null;
//     com.google.javascript.rhino.jstype.JSType[] var56 = new com.google.javascript.rhino.jstype.JSType[] { var55};
//     com.google.javascript.rhino.jstype.FunctionType var57 = var43.createConstructorType(var54, var56);
//     java.lang.Iterable var58 = var57.getCtorExtendedInterfaces();
//     com.google.javascript.rhino.ErrorReporter var60 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var60, true);
//     com.google.javascript.rhino.jstype.JSType var64 = null;
//     boolean var65 = var62.declareType("hi!", var64);
//     var62.clearTemplateTypeName();
//     var62.setLastGeneration(false);
//     var62.resetForTypeCheck();
//     var62.resetForTypeCheck();
//     var62.setLastGeneration(false);
//     com.google.javascript.rhino.jstype.JSType var73 = null;
//     com.google.javascript.rhino.jstype.JSType var74 = null;
//     com.google.javascript.rhino.jstype.JSType[] var75 = new com.google.javascript.rhino.jstype.JSType[] { var74};
//     com.google.javascript.rhino.jstype.FunctionType var76 = var62.createConstructorType(var73, var75);
//     com.google.javascript.rhino.jstype.FunctionType var77 = var30.createFunctionType((com.google.javascript.rhino.jstype.JSType)var57, false, var75);
//     com.google.javascript.rhino.Node var78 = var17.createParameters(var75);
//     java.lang.String var79 = com.google.javascript.jscomp.NodeUtil.getSourceName(var78);
//     com.google.javascript.rhino.Node var80 = var13.newParameterFromNode(var78);
//     java.lang.Appendable var81 = null;
//     var78.appendStringTree(var81);
// 
//   }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test252"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.LightweightMessageFormatter var2 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
    var1.disableThreads();
    com.google.javascript.rhino.ErrorReporter var4 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var4, true);
    com.google.javascript.rhino.jstype.JSType var8 = null;
    boolean var9 = var6.declareType("hi!", var8);
    var6.clearTemplateTypeName();
    var6.setLastGeneration(false);
    var6.resetForTypeCheck();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var14 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.util.List var15 = var14.getGraphvizNodes();
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.paramList(var15);
    com.google.javascript.rhino.Node var17 = var6.createParametersWithVarArgs(var15);
    com.google.javascript.jscomp.JSModuleGraph var18 = new com.google.javascript.jscomp.JSModuleGraph(var15);
    com.google.javascript.rhino.ErrorReporter var19 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var19, true);
    com.google.javascript.rhino.jstype.JSType var23 = null;
    boolean var24 = var21.declareType("hi!", var23);
    var21.clearTemplateTypeName();
    var21.setLastGeneration(false);
    var21.resetForTypeCheck();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var29 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.util.List var30 = var29.getGraphvizNodes();
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.paramList(var30);
    com.google.javascript.rhino.Node var32 = var21.createParametersWithVarArgs(var30);
    com.google.javascript.jscomp.JSModuleGraph var33 = new com.google.javascript.jscomp.JSModuleGraph(var30);
    com.google.javascript.rhino.ErrorReporter var34 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var34, true);
    com.google.javascript.rhino.jstype.JSType var38 = null;
    boolean var39 = var36.declareType("hi!", var38);
    var36.clearTemplateTypeName();
    var36.setLastGeneration(false);
    var36.resetForTypeCheck();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var44 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.util.List var45 = var44.getGraphvizNodes();
    com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.IR.paramList(var45);
    com.google.javascript.rhino.Node var47 = var36.createParametersWithVarArgs(var45);
    java.util.List var48 = var18.manageDependencies(var30, var45);
    com.google.javascript.jscomp.JSModule var50 = new com.google.javascript.jscomp.JSModule("hi!");
    com.google.javascript.jscomp.JSModule[] var51 = new com.google.javascript.jscomp.JSModule[] { var50};
    com.google.javascript.jscomp.JSModuleGraph var52 = new com.google.javascript.jscomp.JSModuleGraph(var51);
    com.google.javascript.jscomp.JSModuleGraph var53 = new com.google.javascript.jscomp.JSModuleGraph(var51);
    var53.coalesceDuplicateFiles();
    com.google.javascript.jscomp.DependencyOptions var55 = new com.google.javascript.jscomp.DependencyOptions();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var56 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    java.util.List var57 = var56.getGraphvizNodes();
    com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.paramList(var57);
    java.util.List var59 = var53.manageDependencies(var55, var57);
    com.google.javascript.jscomp.CompilerOptions var60 = new com.google.javascript.jscomp.CompilerOptions();
    var60.setRewriteFunctionExpressions(false);
    var60.setInlineConstantVars(true);
    var60.setOutputCharset("hi!");
    com.google.javascript.jscomp.Result var67 = var1.compile(var48, var57, var60);
    boolean var68 = var1.acceptConstKeyword();
    com.google.javascript.jscomp.JSModule var70 = new com.google.javascript.jscomp.JSModule("(goog.exportSymbol)");
    java.util.List var71 = var70.getInputs();
    java.util.List var72 = var70.getProvides();
    java.lang.String var73 = var1.toSource(var70);
    com.google.javascript.jscomp.Result var74 = var1.getResult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
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
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + ""+ "'", var73.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test253"); }


    com.google.javascript.rhino.InputId var1 = new com.google.javascript.rhino.InputId("BITXOR");
    com.google.javascript.jscomp.JSSourceFile var4 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var5 = var4.isExtern();
    boolean var6 = var4.isExtern();
    boolean var7 = var1.equals((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test254"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setLooseTypes(false);
    var0.setDeadAssignmentElimination(true);
    java.lang.Object var5 = var0.clone();
    var0.setOptimizeCalls(true);
    var0.setTweakToBooleanLiteral("goog.exportProperty", false);
    var0.setReplaceStringsPlaceholderToken("(goog.exportSymbol)");
    var0.setGroupVariableDeclarations(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test255"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var3 = var2.isOr();
    boolean var4 = var2.isTry();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.paramList();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var8 = var7.isOr();
    com.google.javascript.rhino.Node var9 = new com.google.javascript.rhino.Node(10, var2, var5, var7);
    com.google.javascript.rhino.Node var11 = var9.getChildAtIndex(0);
    com.google.javascript.rhino.Node var12 = var9.getLastChild();
    boolean var13 = var9.isNot();
    boolean var14 = var9.isComma();
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.labelName("goog.exportProperty");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.tryFinally(var9, var16);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test256"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.string("");
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.pos(var1);
    com.google.javascript.jscomp.ClosureCodingConvention var3 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var4 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var5 = var3.getDelegateRelationship(var4);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.Node.newString("goog.exportSymbol", 10, 10);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.number(1.0d);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var14 = var13.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var15 = var13.getJsDocBuilderForNode();
    com.google.javascript.rhino.Node var16 = var11.useSourceInfoIfMissingFrom(var13);
    com.google.javascript.rhino.Node var17 = var9.useSourceInfoFrom(var13);
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var18 = var3.getDelegateRelationship(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.removeChild(var9);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test257"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.clearTemplateTypeName();
    var2.setLastGeneration(false);
    com.google.javascript.rhino.ErrorReporter var9 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var9, true);
    com.google.javascript.rhino.jstype.JSType var13 = null;
    boolean var14 = var11.declareType("hi!", var13);
    var11.clearTemplateTypeName();
    var11.setLastGeneration(false);
    var11.resetForTypeCheck();
    var11.resetForTypeCheck();
    var11.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var22 = null;
    com.google.javascript.rhino.jstype.JSType var23 = null;
    com.google.javascript.rhino.jstype.JSType[] var24 = new com.google.javascript.rhino.jstype.JSType[] { var23};
    com.google.javascript.rhino.jstype.FunctionType var25 = var11.createConstructorType(var22, var24);
    java.lang.Iterable var26 = var25.getCtorExtendedInterfaces();
    boolean var27 = var25.hasImplementedInterfaces();
    boolean var28 = var25.hasImplementedInterfaces();
    com.google.javascript.rhino.jstype.JSType var29 = var2.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType)var25);
    com.google.javascript.rhino.jstype.FunctionType var30 = var25.toMaybeFunctionType();
    boolean var31 = var30.isNominalType();
    com.google.javascript.rhino.JSDocInfo var33 = var30.getOwnPropertyJSDocInfo("");
    java.util.Set var34 = var30.getPropertyNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test258() {}
//   public void test258() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test258"); }
// 
// 
//     com.google.javascript.jscomp.Compiler var0 = new com.google.javascript.jscomp.Compiler();
//     var0.check();
// 
//   }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test259"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    java.lang.String var1 = var0.getAbstractMethodName();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(1.0d);
    com.google.javascript.rhino.Node var4 = var3.getNext();
    int var5 = var3.getLineno();
    var3.setCharno(100);
    boolean var8 = var3.isDebugger();
    int var9 = var3.getLineno();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var0.isPropertyTestFunction(var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "goog.abstractMethod"+ "'", var1.equals("goog.abstractMethod"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test260"); }


    java.lang.String var1 = com.google.javascript.rhino.ScriptRuntime.escapeString("FALSE");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "FALSE"+ "'", var1.equals("FALSE"));

  }

  public void test261() {}
//   public void test261() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test261"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.jscomp.CodingConvention.DelegateRelationship var2 = var0.getDelegateRelationship(var1);
//     java.lang.String var3 = var0.getExportSymbolFunction();
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.labelName("hi!");
//     boolean var7 = var6.isOr();
//     com.google.javascript.rhino.Node.FileLevelJsDocBuilder var8 = var6.getJsDocBuilderForNode();
//     boolean var9 = var6.isOptionalArg();
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.labelName("hi!");
//     boolean var12 = var11.isOr();
//     var6.addChildToBack(var11);
//     boolean var14 = var6.isBreak();
//     com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.labelName("hi!");
//     boolean var17 = var16.isOr();
//     var16.setCharno(100);
//     com.google.javascript.rhino.Node var22 = new com.google.javascript.rhino.Node(100, var6, var16, 0, (-1));
//     com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.labelName("hi!");
//     boolean var26 = var25.isOr();
//     boolean var27 = var25.isTry();
//     com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.paramList();
//     com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.labelName("hi!");
//     boolean var31 = var30.isOr();
//     com.google.javascript.rhino.Node var32 = new com.google.javascript.rhino.Node(10, var25, var28, var30);
//     com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.voidNode(var32);
//     java.lang.String var34 = var0.extractClassNameIfRequire(var16, var32);
//     boolean var35 = var32.isWhile();
//     boolean var36 = var32.isDelProp();
//     com.google.javascript.rhino.Node var37 = null;
//     com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.number(1.0d);
//     com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.labelName("hi!");
//     boolean var42 = var41.isOr();
//     com.google.javascript.rhino.Node.FileLevelJsDocBuilder var43 = var41.getJsDocBuilderForNode();
//     com.google.javascript.rhino.Node var44 = var39.useSourceInfoIfMissingFrom(var41);
//     int var45 = var39.getCharno();
//     var32.addChildBefore(var37, var39);
// 
//   }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test262"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.clearNamedTypes();
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8, true);
    com.google.javascript.rhino.jstype.JSType var12 = null;
    boolean var13 = var10.declareType("hi!", var12);
    var10.clearTemplateTypeName();
    var10.setLastGeneration(false);
    var10.resetForTypeCheck();
    com.google.javascript.rhino.jstype.JSType var19 = null;
    var10.unregisterPropertyOnType("", var19);
    com.google.javascript.rhino.ErrorReporter var21 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21, true);
    com.google.javascript.rhino.jstype.JSType var25 = null;
    boolean var26 = var23.declareType("hi!", var25);
    var23.clearTemplateTypeName();
    var23.setLastGeneration(false);
    var23.resetForTypeCheck();
    var23.resetForTypeCheck();
    var23.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var34 = null;
    com.google.javascript.rhino.jstype.JSType var35 = null;
    com.google.javascript.rhino.jstype.JSType[] var36 = new com.google.javascript.rhino.jstype.JSType[] { var35};
    com.google.javascript.rhino.jstype.FunctionType var37 = var23.createConstructorType(var34, var36);
    java.lang.Iterable var38 = var37.getCtorExtendedInterfaces();
    com.google.javascript.rhino.ErrorReporter var40 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var40, true);
    com.google.javascript.rhino.jstype.JSType var44 = null;
    boolean var45 = var42.declareType("hi!", var44);
    var42.clearTemplateTypeName();
    var42.setLastGeneration(false);
    var42.resetForTypeCheck();
    var42.resetForTypeCheck();
    var42.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var53 = null;
    com.google.javascript.rhino.jstype.JSType var54 = null;
    com.google.javascript.rhino.jstype.JSType[] var55 = new com.google.javascript.rhino.jstype.JSType[] { var54};
    com.google.javascript.rhino.jstype.FunctionType var56 = var42.createConstructorType(var53, var55);
    com.google.javascript.rhino.jstype.FunctionType var57 = var10.createFunctionType((com.google.javascript.rhino.jstype.JSType)var37, false, var55);
    var2.overwriteDeclaredType("hi!", (com.google.javascript.rhino.jstype.JSType)var37);
    boolean var59 = var37.isNullable();
    com.google.javascript.rhino.ErrorReporter var60 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var60, true);
    com.google.javascript.rhino.jstype.JSType var64 = null;
    boolean var65 = var62.declareType("hi!", var64);
    var62.clearTemplateTypeName();
    var62.setLastGeneration(false);
    var62.resetForTypeCheck();
    var62.resetForTypeCheck();
    var62.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var73 = null;
    com.google.javascript.rhino.jstype.JSType var74 = null;
    com.google.javascript.rhino.jstype.JSType[] var75 = new com.google.javascript.rhino.jstype.JSType[] { var74};
    com.google.javascript.rhino.jstype.FunctionType var76 = var62.createConstructorType(var73, var75);
    java.lang.Iterable var77 = var76.getImplementedInterfaces();
    com.google.javascript.rhino.Node var78 = var76.getRootNode();
    boolean var79 = var37.hasEqualCallType(var76);
    boolean var80 = var37.matchesUint32Context();
    boolean var81 = var37.isGlobalThisType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);

  }

  public void test263() {}
//   public void test263() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test263"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.Compiler.IntermediateState var2 = var1.getState();
//     com.google.javascript.jscomp.JSSourceFile var5 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
//     java.lang.String var6 = var5.getCode();
//     com.google.javascript.jscomp.JSSourceFile[] var7 = new com.google.javascript.jscomp.JSSourceFile[] { var5};
//     com.google.javascript.jscomp.JSModule var9 = new com.google.javascript.jscomp.JSModule("hi!");
//     com.google.javascript.jscomp.JSModule[] var10 = new com.google.javascript.jscomp.JSModule[] { var9};
//     com.google.javascript.jscomp.JSModuleGraph var11 = new com.google.javascript.jscomp.JSModuleGraph(var10);
//     com.google.javascript.jscomp.JSModule var13 = new com.google.javascript.jscomp.JSModule("hi!");
//     java.util.Set var14 = var13.getAllDependencies();
//     java.util.List var15 = var13.getProvides();
//     com.google.javascript.jscomp.JSModule var17 = new com.google.javascript.jscomp.JSModule("hi!");
//     java.lang.String var18 = var17.toString();
//     boolean var19 = var11.dependsOn(var13, var17);
//     com.google.javascript.jscomp.JSModule[] var20 = new com.google.javascript.jscomp.JSModule[] { var17};
//     com.google.javascript.jscomp.CompilerOptions var21 = new com.google.javascript.jscomp.CompilerOptions();
//     var21.setLooseTypes(false);
//     var21.setDeadAssignmentElimination(true);
//     java.lang.Object var26 = var21.clone();
//     var21.setOptimizeCalls(true);
//     com.google.javascript.jscomp.Result var29 = var1.compile(var7, var20, var21);
//     var1.rebuildInputsFromModules();
//     com.google.javascript.jscomp.JSModule var32 = new com.google.javascript.jscomp.JSModule("hi!");
//     java.lang.String var33 = var32.toString();
//     int var34 = var32.getDepth();
//     com.google.javascript.jscomp.SourceFile var37 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
//     java.io.Reader var38 = var37.getCodeReader();
//     com.google.javascript.jscomp.JsAst var39 = new com.google.javascript.jscomp.JsAst(var37);
//     var39.clearAst();
//     com.google.javascript.rhino.InputId var41 = null;
//     com.google.javascript.jscomp.CompilerInput var43 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var39, var41, false);
//     com.google.javascript.jscomp.SourceAst var44 = var43.getAst();
//     var32.add(var43);
//     java.lang.String[] var46 = var1.toSourceArray(var32);
//     boolean var48 = var32.removeByName("LinkedGraph");
// 
//   }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test264"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.LightweightMessageFormatter var2 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
    com.google.javascript.jscomp.Scope var3 = var1.getTopScope();
    com.google.javascript.jscomp.JSSourceFile var6 = com.google.javascript.jscomp.JSSourceFile.fromCode("goog.exportSymbol", "hi!");
    com.google.javascript.jscomp.JSSourceFile var9 = com.google.javascript.jscomp.JSSourceFile.fromCode("LABEL_NAME hi!", "LABEL_NAME hi!");
    boolean var10 = var9.isExtern();
    boolean var11 = var9.isExtern();
    com.google.javascript.jscomp.CompilerOptions var12 = new com.google.javascript.jscomp.CompilerOptions();
    var12.setLooseTypes(false);
    com.google.javascript.jscomp.Result var15 = var1.compile(var6, var9, var12);
    com.google.javascript.jscomp.CheckLevel var16 = null;
    var12.setAggressiveVarCheck(var16);
    var12.setInlineLocalVariables(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test265"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setRewriteFunctionExpressions(false);
    com.google.javascript.jscomp.CheckLevel var3 = null;
    var0.setCheckRequires(var3);
    com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler var5 = var0.getAliasTransformationHandler();
    var0.setRewriteFunctionExpressions(true);
    var0.setFoldConstants(false);
    var0.setGenerateExports(false);
    var0.setSummaryDetailLevel(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test266() {}
//   public void test266() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test266"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     var1.disableThreads();
//     com.google.javascript.jscomp.Compiler.IntermediateState var3 = var1.getState();
//     boolean var4 = var1.hasErrors();
// 
//   }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test267"); }


    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.Node.newString(0, "", 0, 100);
    int var5 = var4.getLineno();
    com.google.javascript.rhino.jstype.StaticSourceFile var6 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var4);
    boolean var7 = var4.hasOneChild();
    java.util.Collection var8 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test268"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.clearNamedTypes();
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8, true);
    com.google.javascript.rhino.jstype.JSType var12 = null;
    boolean var13 = var10.declareType("hi!", var12);
    var10.clearTemplateTypeName();
    var10.setLastGeneration(false);
    var10.resetForTypeCheck();
    com.google.javascript.rhino.jstype.JSType var19 = null;
    var10.unregisterPropertyOnType("", var19);
    com.google.javascript.rhino.ErrorReporter var21 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21, true);
    com.google.javascript.rhino.jstype.JSType var25 = null;
    boolean var26 = var23.declareType("hi!", var25);
    var23.clearTemplateTypeName();
    var23.setLastGeneration(false);
    var23.resetForTypeCheck();
    var23.resetForTypeCheck();
    var23.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var34 = null;
    com.google.javascript.rhino.jstype.JSType var35 = null;
    com.google.javascript.rhino.jstype.JSType[] var36 = new com.google.javascript.rhino.jstype.JSType[] { var35};
    com.google.javascript.rhino.jstype.FunctionType var37 = var23.createConstructorType(var34, var36);
    java.lang.Iterable var38 = var37.getCtorExtendedInterfaces();
    com.google.javascript.rhino.ErrorReporter var40 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var40, true);
    com.google.javascript.rhino.jstype.JSType var44 = null;
    boolean var45 = var42.declareType("hi!", var44);
    var42.clearTemplateTypeName();
    var42.setLastGeneration(false);
    var42.resetForTypeCheck();
    var42.resetForTypeCheck();
    var42.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var53 = null;
    com.google.javascript.rhino.jstype.JSType var54 = null;
    com.google.javascript.rhino.jstype.JSType[] var55 = new com.google.javascript.rhino.jstype.JSType[] { var54};
    com.google.javascript.rhino.jstype.FunctionType var56 = var42.createConstructorType(var53, var55);
    com.google.javascript.rhino.jstype.FunctionType var57 = var10.createFunctionType((com.google.javascript.rhino.jstype.JSType)var37, false, var55);
    var2.overwriteDeclaredType("hi!", (com.google.javascript.rhino.jstype.JSType)var37);
    int var59 = var37.getMinArguments();
    com.google.javascript.rhino.ErrorReporter var60 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var60, true);
    com.google.javascript.rhino.jstype.JSType var64 = null;
    boolean var65 = var62.declareType("hi!", var64);
    var62.clearTemplateTypeName();
    var62.setLastGeneration(false);
    var62.resetForTypeCheck();
    var62.resetForTypeCheck();
    var62.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var73 = null;
    com.google.javascript.rhino.jstype.JSType var74 = null;
    com.google.javascript.rhino.jstype.JSType[] var75 = new com.google.javascript.rhino.jstype.JSType[] { var74};
    com.google.javascript.rhino.jstype.FunctionType var76 = var62.createConstructorType(var73, var75);
    java.lang.Iterable var77 = var76.getImplementedInterfaces();
    com.google.javascript.rhino.jstype.JSType.TypePair var78 = var37.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType)var76);
    boolean var80 = var37.hasOwnProperty("LABEL_NAME hi!");
    boolean var81 = var37.isNativeObjectType();
    com.google.javascript.rhino.Node var83 = var37.getPropertyNode("");
    com.google.javascript.rhino.JSDocInfo var84 = new com.google.javascript.rhino.JSDocInfo();
    var37.setJSDocInfo(var84);
    com.google.javascript.rhino.JSTypeExpression var86 = var84.getBaseType();
    com.google.javascript.rhino.JSDocInfo.Visibility var87 = var84.getVisibility();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var87);

  }

  public void test269() {}
//   public void test269() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test269"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     var0.setLooseTypes(false);
//     var0.setGeneratePseudoNames(true);
//     com.google.javascript.jscomp.CheckLevel var5 = null;
//     var0.setCheckProvides(var5);
//     var0.setCrossModuleMethodMotion(false);
//     var0.setCrossModuleMethodMotion(false);
//     var0.setRemoveTryCatchFinally(true);
//     var0.setExtractPrototypeMemberDeclarations(false);
//     com.google.javascript.jscomp.CompilerOptions.Reach var15 = null;
//     var0.setRemoveUnusedVariables(var15);
// 
//   }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test270"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.incrementGeneration();
    com.google.javascript.rhino.jstype.JSTypeNative[] var7 = com.google.javascript.rhino.jstype.JSTypeNative.values();
    com.google.javascript.rhino.jstype.JSType var8 = var2.createUnionType(var7);
    com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode var9 = null;
    var2.setResolveMode(var9);
    com.google.javascript.rhino.ErrorReporter var11 = var2.getErrorReporter();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test271"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    var0.clearNodeAnnotations();
    java.util.List var2 = var0.getGraphvizEdges();
    java.lang.String var3 = var0.getName();
    com.google.javascript.jscomp.CompilerOptions var4 = new com.google.javascript.jscomp.CompilerOptions();
    var4.setLooseTypes(false);
    var4.setShadowVariables(true);
    com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.warning("hi!", "");
    java.lang.String[] var16 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var17 = com.google.javascript.jscomp.JSError.make("hi!", 100, 0, var14, var16);
    com.google.javascript.jscomp.DiagnosticType[] var18 = new com.google.javascript.jscomp.DiagnosticType[] { var14};
    com.google.javascript.jscomp.DiagnosticGroup var19 = new com.google.javascript.jscomp.DiagnosticGroup(var18);
    com.google.javascript.jscomp.CheckLevel var20 = null;
    var4.setWarningLevel(var19, var20);
    com.google.javascript.jscomp.graph.GraphNode var22 = var0.createNode((java.lang.Object)var4);
    java.lang.Iterable var23 = var0.getDirectedGraphNodes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "LinkedGraph"+ "'", var3.equals("LinkedGraph"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test272() {}
//   public void test272() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test272"); }
// 
// 
//     com.google.javascript.jscomp.JSModule var1 = new com.google.javascript.jscomp.JSModule("hi!");
//     java.lang.String var2 = var1.toString();
//     int var3 = var1.getDepth();
//     java.lang.String var4 = var1.getName();
//     com.google.javascript.jscomp.CompilerInput var6 = var1.getByName("");
//     com.google.javascript.jscomp.SourceFile var9 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
//     java.io.Reader var10 = var9.getCodeReader();
//     com.google.javascript.jscomp.JsAst var11 = new com.google.javascript.jscomp.JsAst(var9);
//     var11.clearAst();
//     var11.clearAst();
//     com.google.javascript.rhino.InputId var14 = null;
//     com.google.javascript.jscomp.CompilerInput var16 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var11, var14, true);
//     java.lang.String var17 = var16.getCode();
//     var1.addFirst(var16);
//     java.lang.String var19 = var16.toString();
// 
//   }

  public void test273() {}
//   public void test273() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test273"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
//     java.io.Reader var3 = var2.getCodeReader();
//     com.google.javascript.jscomp.JsAst var4 = new com.google.javascript.jscomp.JsAst(var2);
//     var4.clearAst();
//     var4.clearAst();
//     com.google.javascript.rhino.InputId var7 = null;
//     com.google.javascript.jscomp.CompilerInput var9 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var4, var7, true);
//     int var10 = var9.getNumLines();
//     java.lang.String var11 = var9.toString();
// 
//   }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test274"); }


    com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromCode("(goog.exportSymbol)", "hi!");
    java.io.Reader var3 = var2.getCodeReader();
    com.google.javascript.jscomp.JsAst var4 = new com.google.javascript.jscomp.JsAst(var2);
    var4.clearAst();
    var4.clearAst();
    com.google.javascript.rhino.InputId var7 = null;
    com.google.javascript.jscomp.CompilerInput var9 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var4, var7, true);
    int var10 = var9.getNumLines();
    var9.clearAst();
    com.google.javascript.jscomp.SourceFile var12 = var9.getSourceFile();
    java.lang.String var13 = var12.getOriginalPath();
    com.google.javascript.jscomp.Region var15 = var12.getRegion(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "(goog.exportSymbol)"+ "'", var13.equals("(goog.exportSymbol)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test275"); }


    com.google.javascript.jscomp.JSSourceFile var2 = com.google.javascript.jscomp.JSSourceFile.fromCode("()", "BITXOR");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test276() {}
//   public void test276() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test276"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     java.lang.String var1 = var0.getExportPropertyFunction();
//     java.lang.String var2 = var0.getExportPropertyFunction();
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.Node.newString(0, "", 0, 100);
//     int var8 = var7.getLineno();
//     com.google.javascript.jscomp.ClosureCodingConvention var9 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     com.google.javascript.rhino.Node var10 = null;
//     com.google.javascript.jscomp.CodingConvention.DelegateRelationship var11 = var9.getDelegateRelationship(var10);
//     java.lang.String var12 = var9.getExportSymbolFunction();
//     boolean var15 = var9.isExported("hi!", true);
//     com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.labelName("hi!");
//     boolean var18 = var17.isOr();
//     com.google.javascript.rhino.Node.FileLevelJsDocBuilder var19 = var17.getJsDocBuilderForNode();
//     boolean var20 = var17.isOptionalArg();
//     java.lang.String var21 = var17.toString();
//     var17.setString("");
//     boolean var24 = var17.isDo();
//     boolean var25 = var17.hasChildren();
//     com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.paramList();
//     java.lang.String var27 = var9.extractClassNameIfRequire(var17, var26);
//     com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.labelName("hi!");
//     boolean var30 = var29.isOr();
//     boolean var31 = var29.isTry();
//     boolean var32 = var9.isVarArgsParameter(var29);
//     var7.addChildToBack(var29);
//     com.google.javascript.rhino.Node var34 = var7.removeFirstChild();
//     com.google.javascript.jscomp.GoogleCodingConvention var35 = new com.google.javascript.jscomp.GoogleCodingConvention();
//     boolean var38 = var35.isExported("", true);
//     com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.Node.newString("goog.exportSymbol", 10, 10);
//     com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.IR.labelName("hi!");
//     boolean var45 = var44.isOr();
//     com.google.javascript.rhino.Node.FileLevelJsDocBuilder var46 = var44.getJsDocBuilderForNode();
//     com.google.javascript.rhino.Node var47 = var42.clonePropsFrom(var44);
//     boolean var48 = var35.isOptionalParameter(var42);
//     java.lang.String var49 = var0.extractClassNameIfProvide(var34, var42);
//     com.google.javascript.rhino.Node.SideEffectFlags var50 = null;
//     var34.setSideEffectFlags(var50);
// 
//   }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test277"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setRewriteFunctionExpressions(false);
    boolean var3 = var0.assumeClosuresOnlyCaptureReferences();
    com.google.javascript.jscomp.SourceMap.DetailLevel var4 = null;
    var0.setSourceMapDetailLevel(var4);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var6 = var0.getTweakProcessing();
    com.google.javascript.jscomp.JSModule var8 = new com.google.javascript.jscomp.JSModule("hi!");
    com.google.javascript.jscomp.JSModule[] var9 = new com.google.javascript.jscomp.JSModule[] { var8};
    com.google.javascript.jscomp.JSModuleGraph var10 = new com.google.javascript.jscomp.JSModuleGraph(var9);
    com.google.javascript.jscomp.JSModule var12 = new com.google.javascript.jscomp.JSModule("hi!");
    java.util.Set var13 = var12.getAllDependencies();
    java.util.List var14 = var12.getProvides();
    com.google.javascript.jscomp.JSModule var16 = new com.google.javascript.jscomp.JSModule("hi!");
    java.lang.String var17 = var16.toString();
    boolean var18 = var10.dependsOn(var12, var16);
    java.util.List var19 = var16.getDependencies();
    var16.clearAsts();
    java.util.List var21 = var16.getRequires();
    var0.setSourceMapLocationMappings(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test278"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.Node.newNumber(0.0d, 10, 0);
    com.google.javascript.rhino.Node var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.assign(var3, var4);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test279"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var5 = var2.declareType("hi!", var4);
    var2.clearTemplateTypeName();
    var2.setLastGeneration(false);
    var2.resetForTypeCheck();
    com.google.javascript.jscomp.ClosureCodingConvention var11 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var12 = null;
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var13 = var11.getDelegateRelationship(var12);
    java.lang.String var14 = var11.getExportSymbolFunction();
    boolean var17 = var11.isExported("hi!", true);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.labelName("hi!");
    boolean var20 = var19.isOr();
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var21 = var19.getJsDocBuilderForNode();
    boolean var22 = var19.isOptionalArg();
    java.lang.String var23 = var19.toString();
    var19.setString("");
    boolean var26 = var19.isDo();
    boolean var27 = var19.hasChildren();
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.paramList();
    java.lang.String var29 = var11.extractClassNameIfRequire(var19, var28);
    com.google.javascript.rhino.ErrorReporter var30 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var30, true);
    com.google.javascript.rhino.jstype.JSType var34 = null;
    boolean var35 = var32.declareType("hi!", var34);
    var32.clearTemplateTypeName();
    var32.setLastGeneration(false);
    var32.resetForTypeCheck();
    com.google.javascript.rhino.jstype.JSType var41 = null;
    var32.unregisterPropertyOnType("", var41);
    com.google.javascript.rhino.ErrorReporter var43 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var43, true);
    com.google.javascript.rhino.jstype.JSType var47 = null;
    boolean var48 = var45.declareType("hi!", var47);
    var45.clearTemplateTypeName();
    var45.setLastGeneration(false);
    var45.resetForTypeCheck();
    var45.resetForTypeCheck();
    var45.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var56 = null;
    com.google.javascript.rhino.jstype.JSType var57 = null;
    com.google.javascript.rhino.jstype.JSType[] var58 = new com.google.javascript.rhino.jstype.JSType[] { var57};
    com.google.javascript.rhino.jstype.FunctionType var59 = var45.createConstructorType(var56, var58);
    java.lang.Iterable var60 = var59.getCtorExtendedInterfaces();
    com.google.javascript.rhino.ErrorReporter var62 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var62, true);
    com.google.javascript.rhino.jstype.JSType var66 = null;
    boolean var67 = var64.declareType("hi!", var66);
    var64.clearTemplateTypeName();
    var64.setLastGeneration(false);
    var64.resetForTypeCheck();
    var64.resetForTypeCheck();
    var64.setLastGeneration(false);
    com.google.javascript.rhino.jstype.JSType var75 = null;
    com.google.javascript.rhino.jstype.JSType var76 = null;
    com.google.javascript.rhino.jstype.JSType[] var77 = new com.google.javascript.rhino.jstype.JSType[] { var76};
    com.google.javascript.rhino.jstype.FunctionType var78 = var64.createConstructorType(var75, var77);
    com.google.javascript.rhino.jstype.FunctionType var79 = var32.createFunctionType((com.google.javascript.rhino.jstype.JSType)var59, false, var77);
    boolean var80 = var59.isEmptyType();
    com.google.javascript.rhino.jstype.EnumType var81 = var2.createEnumType("LinkedGraph", var19, (com.google.javascript.rhino.jstype.JSType)var59);
    java.lang.String var82 = var19.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "goog.exportSymbol"+ "'", var14.equals("goog.exportSymbol"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var